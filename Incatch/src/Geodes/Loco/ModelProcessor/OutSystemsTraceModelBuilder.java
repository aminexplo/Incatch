package Geodes.Loco.ModelProcessor;

import ConstraintDsl.ConstraintCollection;
import ConstraintDsl.RangeRule;
import TraceMetamodelEli5.Rule;
import TraceMetamodelEli5.RuleType;
import TraceMetamodelEli5.Scenario;
import TraceMetamodelEli5.TraceMetamodelEli5Factory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/************
 * The top part: needs to come from other parts like Outsystems, the running
 * app, admin, config, etc.
 ****/
public class OutSystemsTraceModelBuilder extends LocoBuilderBase {

	@Override
	public Scenario buildTraceModel() {

		// ConstraintCollection cc = super.getConstraintCollection();

		TraceMetamodelEli5Factory instance = TraceMetamodelEli5Factory.eINSTANCE;
		Scenario s = instance.createScenario();

		s.setName("ConstraintCollection");

		String line = "";
		String splitBy = ",";
		try (var br = new BufferedReader(new FileReader("src/Geodes/Loco/ModelProcessor/DataModel.csv"))) {

			/*
			 * dat[2] -> EntityName | dat[50] -> AttrName | dat[53] -> AttrType | dat[54] ->
			 * AttrLen
			 */
			// TODO: other types of rules...
			while ((line = br.readLine()) != null) {
				String[] dat = line.split(splitBy);
				if (dat[53].contains("Text")) {
					Rule r = instance.createRule();
					r.setName(dat[2] + "_" + dat[50] + "_Len_" + dat[54]);
					r.setArtifact(dat[2]);
					r.setRuleDef("index:5,len(" + dat[50] + ") < " + dat[54]);
					r.setType(RuleType.RANGE);
					s.getRules().add(r);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// TODO: structure the relationships...
		// s.getRules().get(0).getRelatedRules().add(s.getRules().get(1));
		// s.getRules().get(1).getRelatedRules().add(s.getRules().get(0));
		// In this version the user will add the config rules and will set the
		// relationships

		return s;
	}

}