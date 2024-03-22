package Geodes.Loco.Interpreter;

import TraceMetamodelEli5.RuleType;

public abstract class InterpreterBase implements IInterpreter{
	
	public static IInterpreter getInterpreter(RuleType ruleType) {
		switch (ruleType) {
		case RANGE:
			throw new UnsupportedOperationException("Interpreter is incomplete...!");
			//return new RangeInterpreter();
			
		case RECORD_LIMIT:
			return new RecordLimitInterpreter();

		case REQUIRED:
		default:
			throw new UnsupportedOperationException("Interpreter not found...!");
		}
	}
	
}
