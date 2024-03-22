package Geodes.Loco.Interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import TraceMetamodelEli5.Rule;

public class RecordLimitInterpreter extends InterpreterBase {

	@Override
	public void evaluate(Rule rule, ArrayList<String> data) {
		var def = rule.getRuleDef();
		if (containsExactMatch(def, "Entity")) {
			rule.setEvalResult(check("IdIndex:(\\d+),Entity:PersonPhone,Limit:(\\d+)", rule.getRuleDef(), data));
//			rule.setEvalResult(check2("IdIndex:(\\d+),Entity:(\\w+),Limit:(\\d+)", rule.getRuleDef(), data));
			return;
		}
		rule.setEvalResult(check("IdIndex:(\\d+),Type:([a-zA-Z]+),Limit:(\\d+)", rule.getRuleDef(), data));
//		rule.setEvalResult(check2("IdIndex:(\\d+),Type:(\\w+),Limit:(\\d+)", rule.getRuleDef(), data));
	}

	private boolean check2(String pattern, String matcher, ArrayList<String> values) {
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(matcher);
		boolean res = false;
		if (m.find()) {
			int idIndex = Integer.parseInt(m.group(1));
			String type = m.group(2);
			int limit = Integer.parseInt(m.group(3));
			for (String value : values) {
				String[] parts = value.split(",");
				System.out.println("First => " + parts[1] + parts[2] + " --- Second =>" + type + limit);
				if (parts[1].equals(type) && Integer.parseInt(parts[2]) == limit) {
					System.out.println("EQUALLLLL");
					res = true;
				}
			}
		}
		System.out.println("Eval result: ===========> " + res);
		return res;
	}

	private boolean check(String pattern, String matcher, ArrayList<String> values) {
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(matcher);
		boolean res = true;
		if (m.find()) {
			int idIndex = Integer.parseInt(m.group(1));
			String type = "";
			int limit = 0;
			if (m.groupCount() == 3) {
				type = m.group(2);
				limit = Integer.parseInt(m.group(3));
			} else {
				limit = Integer.parseInt(m.group(2));
			}

			HashMap<String, Integer> count = new HashMap<String, Integer>();
			for (String value : values) {
//				System.out.println(value + " --- type: " + type);
				String[] parts = value.split(",");
				String id = parts[idIndex];
				var key = id + type;
				if (type == "" || containsExactMatch(value, type)) {
//					System.out.println("++1");
					if (!count.containsKey(key)) {
						count.put(key, 1);
					} else {
						count.put(key, count.get(key) + 1);
					}
				} else {
					if (!count.containsKey(key)) {
						count.put(key, 0);
					}
				}
			}

			for (String key : count.keySet()) {
//				System.out.println("Key: " + key);
				boolean test = count.get(key) == limit;
				if (!test) {
					// System.out.println("Data in IdIndex " + idIndex + " with value " + id + " has
					// happened more/less than " + limit + " times");
//					System.out.println("IdIndex: " + key + ", Count: " + count.get(key) + ", Limit: " + limit);
					res = res && test;
				}
			}
		}

		return res;
	}

	private boolean containsExactMatch(String str, String word) {
		Pattern pattern = Pattern.compile("\\b" + word + "\\b");
		Matcher matcher = pattern.matcher(str);
		return matcher.find();
	}

}
