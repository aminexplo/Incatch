package Geodes.Loco.Interpreter;

import java.util.ArrayList;

import TraceMetamodelEli5.Rule;

public interface IInterpreter {
	void evaluate(Rule rule, ArrayList<String> data);
}
