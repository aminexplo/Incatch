package TraceMetamodelEli5;

import java.util.concurrent.TimeUnit;

public class SimpleRunner {

	public static void main(String[] args) {
		String[] inputFiles = { "rulesPackForEval/med-rules-easy-all-inc.xmi",
				"rulesPackForEval/med-rules-easy-no-inc.xmi", "rulesPackForEval/med-rules-easy-one-inc.xmi",
				"rulesPackForEval/med-rules-easy-some-inc.xmi", "rulesPackForEval/med-rules-hard-all-inc.xmi",
				"rulesPackForEval/med-rules-hard-no-inc.xmi", "rulesPackForEval/med-rules-hard-one-inc.xmi",
				"rulesPackForEval/med-rules-hard-some-inc.xmi", "rulesPackForEval/med-rules-medium-all-inc.xmi",
				"rulesPackForEval/med-rules-medium-no-inc.xmi", "rulesPackForEval/med-rules-medium-one-inc.xmi",
				"rulesPackForEval/med-rules-medium-some-inc.xmi", "rulesPackForEval/max-rules-easy-all-inc.xmi",
				"rulesPackForEval/max-rules-easy-no-inc.xmi", "rulesPackForEval/max-rules-easy-one-inc.xmi",
				"rulesPackForEval/max-rules-easy-some-inc.xmi", "rulesPackForEval/max-rules-hard-all-inc.xmi",
				"rulesPackForEval/max-rules-hard-no-inc.xmi", "rulesPackForEval/max-rules-hard-one-inc.xmi",
				"rulesPackForEval/max-rules-hard-some-inc.xmi", "rulesPackForEval/max-rules-medium-all-inc.xmi",
				"rulesPackForEval/max-rules-medium-no-inc.xmi", "rulesPackForEval/max-rules-medium-one-inc.xmi",
				"rulesPackForEval/max-rules-medium-some-inc.xmi", "rulesPackForEval/min-rules-easy-all-inc.xmi",
				"rulesPackForEval/min-rules-easy-no-inc.xmi", "rulesPackForEval/min-rules-easy-one-inc.xmi",
				"rulesPackForEval/min-rules-easy-some-inc.xmi", "rulesPackForEval/min-rules-hard-all-inc.xmi",
				"rulesPackForEval/min-rules-hard-no-inc.xmi", "rulesPackForEval/min-rules-hard-one-inc.xmi",
				"rulesPackForEval/min-rules-hard-some-inc.xmi", "rulesPackForEval/min-rules-medium-all-inc.xmi",
				"rulesPackForEval/min-rules-medium-no-inc.xmi", "rulesPackForEval/min-rules-medium-one-inc.xmi",
				"rulesPackForEval/min-rules-medium-some-inc.xmi" };

		String[] inputDataSize = { "s", "m", "l" };

		PreparationContainer.forCsv = "";
		PreparationContainer.fullLog = "";

//		2,1,2,3,0.3661238,28,0.0770223,1
		String[] items = { "rulesPackForEval/min-paperProblem-easy-all-inc.xmi", "s" };
		PreparationContainer.main(items);
		AnalysisContainer.main(items);
		
	}
}
