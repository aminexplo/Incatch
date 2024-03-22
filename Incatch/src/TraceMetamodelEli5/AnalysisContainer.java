package TraceMetamodelEli5;

import java.time.Duration;
import java.time.Instant;

import Geodes.Loco.Analyzer.AlloyAnalyzer;

public class AnalysisContainer {
	public static void main(String[] args) {
		String modelFilePath = args[0];
		String dataSize = args[1];
		modelFilePath = "" + modelFilePath.replace("/", "/alloy/").replace(".xmi", ".als");
		System.gc();
		Runtime runtime = Runtime.getRuntime();
		long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
		// System.out.println("Used Memory before Alloy: " + usedMemoryBefore);

		Instant ins = Instant.now();
		new AlloyAnalyzer().analyze(modelFilePath);
		Instant ins1 = Instant.now();

		long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
		String log = (dataSize == "s" ? "1" : (dataSize == "m" ? "2" : "3")) + ", "
				+ (modelFilePath.contains("min-") ? "1" : (modelFilePath.contains("med-") ? "2" : "3")) + ", "
				+ (modelFilePath.contains("-easy-") ? "1" : (modelFilePath.contains("-medium-") ? "2" : "3")) + ", "
				+ (modelFilePath.contains("-no-inc") ? "1"
						: (modelFilePath.contains("-one-inc") ? "2" : (modelFilePath.contains("-some-inc") ? "3" : "4")));

		var duration = Duration.between(ins, ins1).toString();
		var memoryUsed = (usedMemoryAfter - usedMemoryBefore) / (1024 * 1024);
		PreparationContainer.forCsv += "," + duration.replace("PT", "").replace("S", "") + "," + memoryUsed + "\n";
		log = log + ": AlloyInfo -- " + duration + ", " + memoryUsed;
		PreparationContainer.fullLog += log + "\n";
		System.out.println("Elapsed Time and Memory in Alloy: " + log);
//		System.out.println("Memory increased after Alloy: " + (usedMemoryAfter - usedMemoryBefore) / (1024 * 1024));
	}
}
