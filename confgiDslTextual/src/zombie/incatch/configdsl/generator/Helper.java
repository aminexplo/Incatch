package zombie.incatch.configdsl.generator;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;


public class Helper {
	public static void saveResourceAsXmi(Resource resource) {
		try {
			Map<String, String> saveOptions = new HashMap<String, String>();
			Resource xmlResource = new XMIResourceImpl(
					URI.createURI(resource.getURI().toString().replace("cdm", "xmi")));
			xmlResource.getContents().add(resource.getContents().get(0));
			saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING, "UTF-8");
			xmlResource.save(saveOptions);
			System.out.println("XMI file created.");
		} catch (IOException e) {
			System.out.println("Error during the creation of XMI.");
			e.printStackTrace();
		}
	}

	public static void saveResourceAsJson(Resource resource) {

		//ResourceSet resourceSet = new ResourceSetImpl();
		//resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());
		//TODO:.......................
		//............................
		
		// Resource resource = resourceSet.createResource
		// (URI.createFileURI("src/main/resources/data.json"));

	}

	/*
	 * public static void saveResourceAsJson(Resource resource) { try { JSONObject
	 * xmlJSONObj = XML.toJSONObject(TEST_XML_STRING); String jsonPrettyPrintString
	 * = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
	 * System.out.println(jsonPrettyPrintString); } catch (JSONException je) {
	 * System.out.println(je.toString()); } }
	 */
}
