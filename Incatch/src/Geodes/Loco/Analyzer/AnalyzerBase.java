package Geodes.Loco.Analyzer;

import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import TraceMetamodelEli5.Scenario;
import TraceMetamodelEli5.TraceMetamodelEli5Package;

public abstract class AnalyzerBase implements IAnalyzer {
	protected void createReport(String reportContent, String fileName) {
		try {
			FileWriter myWriter = new FileWriter(fileName + "_ConsistencyReport.txt");
			myWriter.write(reportContent);
			myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected Scenario getScenario(String alloyFileName) {
		var xmiFileName = alloyFileName.replace("alloy/", "").replace(".als", ".xmi");
		// TODO: Serialize to XMI if the format is different...
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put("zombie.incatch.tracemetamodeleli5", TraceMetamodelEli5Package.eINSTANCE);
		Resource resource = resourceSet
				.getResource(URI.createFileURI(xmiFileName), true);
		try {
			resource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return (Scenario) resource.getContents().get(0);
	}
}
