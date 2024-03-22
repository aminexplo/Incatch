package TraceMetamodelEli5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class AntFileExecutor {
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

		executeAntFile("rulesPackForEval\\med-rules-easy-all-inc.xmi", "s");

//		for (String inputFile : inputFiles) {
//			for (String inputSize : inputDataSize)
//				executeAntFile(inputFile, inputSize);
//		}
	}

	public static void executeAntFile(String inputFile, String inputSize) {
		System.out.println("Executing the ant file for: " + inputFile + ", " + inputSize);
		try {

			List<String> commands = new ArrayList<String>();

			// Add multiple commands to the list
			commands.add("cmd");
//			commands.add("/c");
//			commands.add("cd C:/My/0PhD/Publications/incatch/Incatch");
//			commands.add("ant");
//			String mainCommand = "ant -Dinput.model.path=" + inputFile + " -Dinput.data.size=" + inputSize;
			String mainCommand = "ant -Dinput.model.path=\"C:\\My\\0PhD\\Publications\\incatch\\Incatch\\" + inputFile + "\" -Dinput.data.size=" + inputSize;
			System.out.println(mainCommand);
//			String mainCommand = "ant -Dinput.model.path=\"C:/My/0PhD/Publications/incatch/Incatch/rulesPackForEval/three-rules-easy-all-inc.xmi\" -Dinput.data.size=s -f \"C:/My/0 PhD/Publications/incatch/Incatch/build.xml\"";
//			System.out.println(mainCommand);
//			commands.add(mainCommand);

			// Create a ProcessBuilder instance with the list of commands
			ProcessBuilder processBuilder = new ProcessBuilder(commands);

			// Redirect the output to the console
			processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);

			// Start the process
			Process process = processBuilder.start();
			
			// Wait for the process to complete
			int exitCode = process.waitFor();

			if (exitCode == 0) {
				System.out.println("Ant file executed successfully for " + inputFile);
			} else {
				System.out.println("Error executing Ant file for " + inputFile + "Error code: " + exitCode);
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
