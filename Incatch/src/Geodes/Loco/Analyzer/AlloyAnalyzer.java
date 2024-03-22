package Geodes.Loco.Analyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import TraceMetamodelEli5.Scenario;
import edu.mit.csail.sdg.alloy4.*;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4.ErrorWarning;
import edu.mit.csail.sdg.alloy4.SafeList;
import edu.mit.csail.sdg.alloy4viz.VizGUI;
import edu.mit.csail.sdg.ast.Command;
import edu.mit.csail.sdg.ast.Func;
import edu.mit.csail.sdg.ast.Module;
import edu.mit.csail.sdg.parser.CompUtil;
import edu.mit.csail.sdg.translator.A4Options;
import edu.mit.csail.sdg.translator.A4Solution;
import edu.mit.csail.sdg.translator.TranslateAlloyToKodkod;

public class AlloyAnalyzer extends AnalyzerBase {

	@Override
	public void analyze(String filePath) {
		// The visualizer (We will initialize it to nonnull when we visualize an Alloy
		// solution)
		VizGUI viz = null;
		
		// Alloy4 sends diagnostic messages and progress reports to the A4Reporter.
		// By default, the A4Reporter ignores all these events (but you can extend the
		// A4Reporter to display the event for the user)
		A4Reporter rep = new A4Reporter() {
			// For example, here we choose to display each "warning" by printing it to
			// System.out
			@Override
			public void warning(ErrorWarning msg) {
				System.out.print("Relevance Warning:\n" + (msg.toString().trim()) + "\n\n");
				System.out.flush();
			}
		};

		String filename = filePath;

		// Parse+typecheck the model
		System.out.println("=========== Parsing+Typechecking " + filename + " =============");
		Module world = CompUtil.parseEverything_fromFile(rep, null, filename);

		// Choose some default options for how you want to execute the commands
		A4Options options = new A4Options();

		options.solver = A4Options.SatSolver.SAT4J;

		var scenario = getScenario(filename);
		String header = "";
		String message = "";
		boolean incFound = false;
		var processed = new HashSet<Integer>();
		for (Command command : world.getAllCommands()) {
			// Execute the command
			// System.out.println("============ Command " + command + ": ============");
			A4Solution ans = TranslateAlloyToKodkod.execute_command(rep, world.getAllReachableSigs(), command, options);
			// Print the outcome
			// System.out.println(ans);

			// TODO: Refactor and fix the redundancy
			if (ans.satisfiable()) {
				// Inconsistent
				incFound = true;
				message += "INCONSISTENT:\n" + command + "\n\n";
				/*
				 * for (var rule : scenario.getRules()) { for (var relatedRule :
				 * rule.getRelatedRules()) { var key = (rule.getArtifact() +
				 * rule.getName()).hashCode() + (relatedRule.getArtifact() +
				 * relatedRule.getName()).hashCode(); if (processed.contains(key)) continue;
				 * processed.add(key);
				 * 
				 * if (rule.isEvalResult() != relatedRule.isEvalResult()) { message +=
				 * rule.getArtifact() + ", " + rule.getName() + ", (Result: " +
				 * rule.isEvalResult() + ") -> INCONSISTENT with <- (Result: " +
				 * relatedRule.isEvalResult() + ") " + relatedRule.getArtifact() + ", " +
				 * relatedRule.getName() + ".\n"; } else { message += rule.getArtifact() + ", "
				 * + rule.getName() + ", (Result: " + rule.isEvalResult() +
				 * ") -> CONSISTENT with <- (Result: " + relatedRule.isEvalResult() + ") " +
				 * relatedRule.getArtifact() + ", " + relatedRule.getName() + ".\n"; } } }
				 */
			} else {
				// consistent
				message += "CONSISTENT:\n" + command + "\n\n";
				/*
				 * for (var rule : scenario.getRules()) { for (var relatedRule :
				 * rule.getRelatedRules()) { var key = (rule.getArtifact() +
				 * rule.getName()).hashCode() + (relatedRule.getArtifact() +
				 * relatedRule.getName()).hashCode(); if (processed.contains(key)) continue;
				 * processed.add(key); message += rule.getArtifact() + ", " + rule.getName() +
				 * ", (Result: " + rule.isEvalResult() + ") -> CONSISTENT with <- (Result: " +
				 * relatedRule.isEvalResult() + ") " + relatedRule.getArtifact() + ", " +
				 * relatedRule.getName() + ".\n"; } }
				 */
			}

			createReport(
					(incFound ? "Inconsistencies found in scenario: " + scenario.getName() + "\n\n"
							: "No inconsistencies found in scenario: " + scenario.getName() + "\n\n") + message,
					scenario.getName());

			// If satisfiable...
//			if (ans.satisfiable()) {
//				// You can query "ans" to find out the values of each set or type.
//				// This can be useful for debugging.
//				//
//				// You can also write the outcome to an XML file
//				ans.writeXML("alloy_example_output.xml");
//				//
//				// You can then visualize the XML file by calling this:
//				if (viz == null) {
//					viz = new VizGUI(false, "alloy_example_output.xml", null);
//				} else {
//					viz.loadXML("alloy_example_output.xml", true);
//				}
//			}
		}
	}

}
