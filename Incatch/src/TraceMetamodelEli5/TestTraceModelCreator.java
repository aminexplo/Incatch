package TraceMetamodelEli5;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class TestTraceModelCreator {
	public static void main(String[] args) {
		createTraceModelsSetFor(40, "max");
		createTraceModelsSetFor(20, "med");
		createTraceModelsSetFor(10, "min");
	}

	private static void createTraceModelsSetFor(int numberOfRules, String numberWord) {
		String[] complexityLevels = { "easy", "medium", "hard" };
		String[] inconsistencyLevels = { "no", "one", "some", "all" };

		TraceMetamodelEli5Factory instance = TraceMetamodelEli5Factory.eINSTANCE;

		for (String complexityLevel : complexityLevels) {
			for (String inconsistencyLevel : inconsistencyLevels) {
				Scenario s = instance.createScenario();
				s.setName(numberWord + "-rules-" + complexityLevel + "-" + inconsistencyLevel + "-inc");
				Rule[] rules = new Rule[numberOfRules];
				for (int i = 0; i < rules.length; i++) {
					Rule r = instance.createRule();
					r.setName("R" + (i + 1));
					r.setArtifact("PersonPhone");
					r.setRuleDef("IdIndex:0,Entity:PersonPhone,Limit:2");
					r.setType(RuleType.RECORD_LIMIT);
					s.getRules().add(r);
					rules[i] = r;
				}

				// set relatedRules according to complexity
				if (complexityLevel == "easy") {
					for (int i = 0; i < rules.length - 1; i += 2) {
						rules[i].getRelatedRules().add(rules[i + 1]);
						rules[i + 1].getRelatedRules().add(rules[i]);
					}
				} else if (complexityLevel == "medium") {
					rules[0].getRelatedRules().add(rules[1]);
					rules[1].getRelatedRules().add(rules[0]);
					var k = (numberOfRules - 2) / 2;
					var edgesPerNode = Math.floor((Math.ceil(Math.pow(k, 1.75)) + 1) / k);
					for (int i = 2; i < rules.length - 1; i += 2) {
						var backTrackIndex = 3;
						for (int j = i + 1; j <= i + 1 + ((edgesPerNode - 1) * 2); j += 2) {
							if (j < rules.length) {
								rules[i].getRelatedRules().add(rules[j]);
								rules[j].getRelatedRules().add(rules[i]);
							} else {
								rules[i].getRelatedRules().add(rules[backTrackIndex]);
								rules[backTrackIndex].getRelatedRules().add(rules[i]);
								backTrackIndex += 2;
							}
						}
					}
				} else if (complexityLevel == "hard") {
					rules[0].getRelatedRules().add(rules[1]);
					rules[1].getRelatedRules().add(rules[0]);
					for (int i = 2; i < rules.length - 1; i += 2) {
						for (int j = 3; j < rules.length; j += 2) {
							rules[i].getRelatedRules().add(rules[j]);
							rules[j].getRelatedRules().add(rules[i]);
						}
					}
				}

				// modify ruleDef according to inconsistencylevel
				if (inconsistencyLevel == "one") {
					var ruleDef = rules[0].getRuleDef().replace("Limit:2", "Limit:3");
					rules[0].setRuleDef(ruleDef);
				} else if (inconsistencyLevel == "some") {
					for (int i = 2; i <= 4 + (numberOfRules / 4); i += 2) {
						var ruleDef = rules[i].getRuleDef().replace("Limit:2", "Limit:3");
						rules[i].setRuleDef(ruleDef);
					}
//					var index = 1;
//					for (int i = 2; i < rules.length - 1; i += 2) {
//						System.out.println(index + " -- " + i);
//						if ((index % 2) == 0) {
//							var ruleDef = rules[i].getRuleDef().replace("Limit:2", "Limit:3");
//							rules[i].setRuleDef(ruleDef);
//						}
//						index++;
//					}
				} else if (inconsistencyLevel == "all") {
					for (int i = 0; i < rules.length - 1; i += 2) {
						var ruleDef = rules[i].getRuleDef().replace("Limit:2", "Limit:3");
						rules[i].setRuleDef(ruleDef);
					}
				}

				// adding rules to the scenario
				for (int i = 0; i < rules.length; i++) {
					s.getRules().add(rules[i]);
				}

				ResourceSet resourceSet = new ResourceSetImpl();
				String fileName = s.getName() + ".xmi";
				String filePath = "rulesPackForEval/" + fileName;
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi",
						new XMIResourceFactoryImpl());
				resourceSet.getPackageRegistry().put("zombie.incatch.tracemetamodeleli5",
						TraceMetamodelEli5Package.eINSTANCE);
				// Resource resource = (Resource)
				// resourceSet.createResource(URI.createURI(filePath));
				Resource xmlResource = new XMIResourceImpl(URI.createURI(filePath));
				xmlResource.getContents().add(s);
				try {
					Map<String, String> saveOptions = new HashMap<String, String>();
					saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING, "UTF-8");
					xmlResource.save(null);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
