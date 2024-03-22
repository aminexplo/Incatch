package Geodes.Loco.ModelProcessor;

import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ConstraintDsl.ConstraintCollection;
import ConstraintDsl.ConstraintDslPackage;

public abstract class LocoBuilderBase implements ILocoBuilder {

	protected ConstraintCollection getConstraintCollection() {

		// TODO: Serialize to XMI if the format is different...
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put("zombie.incatch.constraintdsl", ConstraintDslPackage.eINSTANCE);
		Resource resource = resourceSet
				.getResource(URI.createFileURI("src/Geodes/Loco/ModelProcessor/ConstraintCollection.xmi"), true);
		try {
			resource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return (ConstraintCollection) resource.getContents().get(0);
	}

}
