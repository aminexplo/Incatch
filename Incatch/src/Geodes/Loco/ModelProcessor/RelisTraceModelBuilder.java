package Geodes.Loco.ModelProcessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

import TraceMetamodelEli5.Rule;
import TraceMetamodelEli5.RuleType;
import TraceMetamodelEli5.Scenario;
import TraceMetamodelEli5.TraceMetamodelEli5Factory;

public class RelisTraceModelBuilder extends LocoBuilderBase {

	@Override
	public Scenario buildTraceModel() {
		TraceMetamodelEli5Factory instance = TraceMetamodelEli5Factory.eINSTANCE;
		Scenario s = instance.createScenario();

		s.setName("RelisDm");

		String line = "";
		String splitBy = ",";
		try (var br = new BufferedReader(new FileReader("src/Geodes/Loco/ModelProcessor/DataModel-relis.csv"))) {

			/*
			 * dat[0] -> DataBaseName | dat[1] -> CountInConfig | dat[2] -> ExclusionCriteriaField | dat[3] ->
			 * CountInConfig
			 */
			boolean skip = true;
			var list = new ArrayList<RelisDataModelRecord>();
			while ((line = br.readLine()) != null) {
				if (skip) {
					skip = false;
					continue;
				}
				String[] dat = line.split(splitBy);
				var rec = new RelisDataModelRecord();
				rec.setDatabaseName(dat[0]);
				rec.setRecordLimit(Integer.parseInt(dat[1]));
				rec.setTypeName(dat[2]);
				rec.setTypeLimit(Integer.parseInt(dat[3]));
				list.add(rec);
			}

			Map<String, Map<Integer, Integer>> dmToVerify = list.stream()
					.collect(Collectors.groupingBy(RelisDataModelRecord::getDatabaseName, Collectors.groupingBy(
							RelisDataModelRecord::getRecordLimit, Collectors.summingInt(RelisDataModelRecord::getTypeLimit))));

			System.out.println(dmToVerify);

//			for (var item : dmToVerify.entrySet()) {
//				for (var rec : item.getValue().entrySet()) {
//					if (rec.getKey() != rec.getValue())
//						throw new Exception("The implicit rule is violated...!");
//				}
//			}

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
				r.setArtifact(item.getDatabaseName());
				r.setRuleDef("IdIndex:0,Type:" + item.getTypeName() + ",Limit:" + item.getTypeLimit());
				r.setType(RuleType.RECORD_LIMIT);
				s.getRules().add(r);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return s;
	}

	class RelisDataModelRecord {
		public String getDatabaseName() {
			return databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
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

		private String databaseName;
		private int recordLimit;
		private String typeName;
		private int typeLimit;
	}

}
