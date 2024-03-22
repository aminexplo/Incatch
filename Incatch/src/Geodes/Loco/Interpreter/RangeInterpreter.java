package Geodes.Loco.Interpreter;

import java.util.ArrayList;

import TraceMetamodelEli5.Rule;

//TODO: Change the strategy. Currently, just producing result to test the framework...
public class RangeInterpreter extends InterpreterBase {

	@Override
	public void evaluate(Rule rule, ArrayList<String> data) {
		int index = rule.getRuleDef().lastIndexOf("<=");
		boolean hasEqual = false;
		if (index < 0) {
			index = rule.getRuleDef().lastIndexOf('<');
			index += 1;
		} else {
			hasEqual = true;
			index += 2;
		}

//		double number = Double.parseDouble(rule.getRuleDef().substring(index).trim());
//		boolean res = false;
//		if (data instanceof String) {
//			String token = (String) data;
//			res = hasEqual ? token.length() <= number : token.length() < number;
//		}
//
//		if (data instanceof Double) {
//			double num = (double) data;
//			res = hasEqual ? num <= number : num < number;
//		}

//		rule.setEvalResult(res && rule.isEvalResult());
	}
}
