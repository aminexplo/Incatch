package Geodes.Loco.ModelProcessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

import TraceMetamodelEli5.Rule;
import TraceMetamodelEli5.RuleType;
import TraceMetamodelEli5.Scenario;
import TraceMetamodelEli5.TraceMetamodelEli5Factory;

public class LocoDataSetTraceModelBuilder extends LocoBuilderBase {

	@Override
	public Scenario buildTraceModel() {
		TraceMetamodelEli5Factory instance = TraceMetamodelEli5Factory.eINSTANCE;
		Scenario s = instance.createScenario();

		s.setName("LocoDs");

		String line = "";
		String splitBy = ",";
		try (var br = new BufferedReader(new FileReader("src/Geodes/Loco/ModelProcessor/DataModel1.csv"))) {

			/*
			 * dat[0] -> EntityName | dat[1] -> RecordLimit | dat[2] -> TypeName | dat[3] ->
			 * TypeLimit
			 */
			boolean skip = true;
			var list = new ArrayList<DataModelRecord>();
			while ((line = br.readLine()) != null) {
				if (skip) {
					skip = false;
					continue;
				}
				String[] dat = line.split(splitBy);
				var rec = new DataModelRecord();
				rec.setEntityName(dat[0]);
				rec.setRecordLimit(Integer.parseInt(dat[1]));
				rec.setTypeName(dat[2]);
				rec.setTypeLimit(Integer.parseInt(dat[3]));
				list.add(rec);
			}

			Map<String, Map<Integer, Integer>> dmToVerify = list.stream()
					.collect(Collectors.groupingBy(DataModelRecord::getEntityName, Collectors.groupingBy(
							DataModelRecord::getRecordLimit, Collectors.summingInt(DataModelRecord::getTypeLimit))));

			System.out.println(dmToVerify);

			for (var item : dmToVerify.entrySet()) {
				for (var rec : item.getValue().entrySet()) {
					if (rec.getKey() != rec.getValue())
						throw new Exception("The implicit rule is violated...!");
				}
			}

			for (var item : dmToVerify.entrySet()) {
				var entry = item.getValue().entrySet().iterator().next().getKey();
				Rule r = instance.createRule();
				r.setName(item.getKey() + "_RecordLimit_" + entry);
				r.setArtifact(item.getKey());
				r.setRuleDef("IdIndex:0,Entity:" + item.getKey() + ",Limit:" + entry);
				r.setType(RuleType.RECORD_LIMIT);
				s.getRules().add(r);
			}

			for (var item : list) {
				Rule r = instance.createRule();
				r.setName(item.getTypeName() + "_TypeLimit_" + item.getTypeLimit());
				r.setArtifact(item.getEntityName());
				r.setRuleDef("IdIndex:0,Type:" + item.getTypeName() + ",Limit:" + item.getTypeLimit());
				r.setType(RuleType.RECORD_LIMIT);
				s.getRules().add(r);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return s;
	}

	class DataModelRecord {
		public String getEntityName() {
			return entityName;
		}

		public void setEntityName(String entityName) {
			this.entityName = entityName;
		}

		public int getRecordLimit() {
			return recordLimit;
		}

		public void setRecordLimit(int recordLimit) {
			this.recordLimit = recordLimit;
		}

		public String getTypeName() {
			return typeName;
		}

		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}

		public int getTypeLimit() {
			return typeLimit;
		}

		public void setTypeLimit(int typeLimit) {
			this.typeLimit = typeLimit;
		}

		private String entityName;
		private int recordLimit;
		private String typeName;
		private int typeLimit;
	}

}
