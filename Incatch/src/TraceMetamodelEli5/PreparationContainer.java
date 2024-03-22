package TraceMetamodelEli5;

import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import Geodes.Loco.Interpreter.InterpreterBase;
import Geodes.Loco.ModelProcessor.LocoBuilder;

public class PreparationContainer {

	static String fullLog = "";
	static String forCsv = "";

	public static void main(String[] args) {

		String modelFilePath = args[0].substring(args[0].lastIndexOf("rulesPackForEval"));
		String dataSize = args[1];
		System.out.println("Passed parameters: " + modelFilePath + ", " + dataSize);
		fullLog += "Passed parameters: " + modelFilePath + ", " + dataSize + "\n";
		var skipPreparation = true;
//		if (skipPreparation)
//			return;

		Scenario s = null;
		if (!skipPreparation) {
			// Reading meta-data from the loco platform and building the trace model
			s = LocoBuilder.getBuilder(LocoBuilder.LocoName.ReLiS).buildTraceModel();

			// s =
			// LocoBuilder.getBuilder(LocoBuilder.LocoName.OutSystems).buildTraceModel();
		} else {
			ResourceSet resourceSet = new ResourceSetImpl();

			// register UML
			Map packageRegistry = resourceSet.getPackageRegistry();
			packageRegistry.put(TraceMetamodelEli5Package.eNS_URI, TraceMetamodelEli5Package.eINSTANCE);

			// Register XML resource as UMLResource.Factory.Instance
			Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
			extensionFactoryMap.put("xmi", new XMIResourceFactoryImpl());

			// "rulesPackForEval/three-rules-easy-all-inc.xmi"
			Resource resource = (Resource) resourceSet.createResource(URI.createURI(modelFilePath));

			// try to load the file into resource
			try {
				resource.load(null);
				s = (Scenario) resource.getContents().get(0);
				String fileName = modelFilePath.substring(modelFilePath.lastIndexOf("/") + 1);
				s.setName(fileName.substring(0, fileName.lastIndexOf(".")));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// Getting the appropriate interpreter, evaluating the rules, and saving the
		// results to the trace model
		// TODO: Read data from somewhere else...
		if (skipPreparation) {
			String line = "";
			String splitBy = ",";
			try (var br = new BufferedReader(new FileReader(getDataFilePath(dataSize)))) {

				System.gc();
				Runtime runtime = Runtime.getRuntime();
				long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
				System.out.println("Used Memory before eval: " + usedMemoryBefore);

				var list = new ArrayList<String>();
				boolean firstLine = true;
				while ((line = br.readLine()) != null) {
					if (firstLine) {
						firstLine = false;
						continue;
					}
					list.add(line);
				}

				Instant ins = Instant.now();
				for (var rule : s.getRules()) {
					// System.out.println(rule.getName() + ": " + rule.getRuleDef());
					InterpreterBase.getInterpreter(rule.getType()).evaluate(rule, list);
				}
				Instant ins1 = Instant.now();
				long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
				var first = Double
						.parseDouble(Duration.between(ins, ins1).toString().replace("PT", "").replace("S", ""));
				ins = Instant.now();
				for (var rule : s.getRules()) {
					// System.out.println(rule.getName() + ": " + rule.getRuleDef());
					InterpreterBase.getInterpreter(rule.getType()).evaluate(rule, list);
				}
				ins1 = Instant.now();
				var second = Double
						.parseDouble(Duration.between(ins, ins1).toString().replace("PT", "").replace("S", ""));
				ins = Instant.now();
				for (var rule : s.getRules()) {
					// System.out.println(rule.getName() + ": " + rule.getRuleDef());
					InterpreterBase.getInterpreter(rule.getType()).evaluate(rule, list);
				}
				ins1 = Instant.now();
				var third = Double
						.parseDouble(Duration.between(ins, ins1).toString().replace("PT", "").replace("S", ""));

				var finalDuration = Math.max(Math.max(first, second), third);
				
//				long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
				String log = (dataSize == "s" ? "1" : (dataSize == "m" ? "2" : "3")) + ", "
						+ (modelFilePath.contains("min-") ? "1" : (modelFilePath.contains("med-") ? "2" : "3")) + ", "
						+ (modelFilePath.contains("-easy-") ? "1" : (modelFilePath.contains("-medium-") ? "2" : "3"))
						+ ", "
						+ (modelFilePath.contains("-no-inc") ? "1"
								: (modelFilePath.contains("-one-inc") ? "2"
										: (modelFilePath.contains("-some-inc") ? "3" : "4")));

//				var duration = Duration.between(ins, ins1).toString();
				var duration = finalDuration + "";
				var memoryUsed = (usedMemoryAfter - usedMemoryBefore) / (1024 * 1024);
				forCsv += log + "," + duration.replace("PT", "").replace("S", "") + "," + memoryUsed;
				log = log + ": EvalInfo -- " + duration + ", " + memoryUsed;
				fullLog += log + "\n";
				System.out.println("Elapsed Time and Memory in Evaluators: " + log);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.createResource(URI.createURI(modelFilePath));

		resource.getContents().add(s);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Done......!");
	}

	private static String getDataFilePath(String size) {
		if (size == "s")
			return "data-datamodel/new-Data1-s.csv";

		if (size == "m")
			return "data-datamodel/new-Data1-m.csv";

		return "data-datamodel/new-Data1-l.csv";
	}
}
