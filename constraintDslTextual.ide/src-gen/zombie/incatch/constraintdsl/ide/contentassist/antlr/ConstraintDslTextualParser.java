/*
 * generated by Xtext 2.27.0
 */
package zombie.incatch.constraintdsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import zombie.incatch.constraintdsl.ide.contentassist.antlr.internal.InternalConstraintDslTextualParser;
import zombie.incatch.constraintdsl.services.ConstraintDslTextualGrammarAccess;

public class ConstraintDslTextualParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ConstraintDslTextualGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ConstraintDslTextualGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getConstraintCollectionAccess().getGroup(), "rule__ConstraintCollection__Group__0");
			builder.put(grammarAccess.getConstraintCollectionAccess().getGroup_6(), "rule__ConstraintCollection__Group_6__0");
			builder.put(grammarAccess.getRangeRuleAccess().getGroup(), "rule__RangeRule__Group__0");
			builder.put(grammarAccess.getRangeRuleAccess().getGroup_5(), "rule__RangeRule__Group_5__0");
			builder.put(grammarAccess.getRangeRuleAccess().getGroup_6(), "rule__RangeRule__Group_6__0");
			builder.put(grammarAccess.getRangeRuleAccess().getGroup_7(), "rule__RangeRule__Group_7__0");
			builder.put(grammarAccess.getRangeRuleAccess().getGroup_8(), "rule__RangeRule__Group_8__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getConstraintCollectionAccess().getNameAssignment_1(), "rule__ConstraintCollection__NameAssignment_1");
			builder.put(grammarAccess.getConstraintCollectionAccess().getRulesAssignment_5(), "rule__ConstraintCollection__RulesAssignment_5");
			builder.put(grammarAccess.getConstraintCollectionAccess().getRulesAssignment_6_1(), "rule__ConstraintCollection__RulesAssignment_6_1");
			builder.put(grammarAccess.getRangeRuleAccess().getEqualLowAssignment_0(), "rule__RangeRule__EqualLowAssignment_0");
			builder.put(grammarAccess.getRangeRuleAccess().getEqualHighAssignment_1(), "rule__RangeRule__EqualHighAssignment_1");
			builder.put(grammarAccess.getRangeRuleAccess().getNameAssignment_3(), "rule__RangeRule__NameAssignment_3");
			builder.put(grammarAccess.getRangeRuleAccess().getArtifactAssignment_5_1(), "rule__RangeRule__ArtifactAssignment_5_1");
			builder.put(grammarAccess.getRangeRuleAccess().getAttributeAssignment_6_1(), "rule__RangeRule__AttributeAssignment_6_1");
			builder.put(grammarAccess.getRangeRuleAccess().getLowAssignment_7_1(), "rule__RangeRule__LowAssignment_7_1");
			builder.put(grammarAccess.getRangeRuleAccess().getHighAssignment_8_1(), "rule__RangeRule__HighAssignment_8_1");
			builder.put(grammarAccess.getRangeRuleAccess().getRelatedRuleAssignment_10(), "rule__RangeRule__RelatedRuleAssignment_10");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ConstraintDslTextualGrammarAccess grammarAccess;

	@Override
	protected InternalConstraintDslTextualParser createParser() {
		InternalConstraintDslTextualParser result = new InternalConstraintDslTextualParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ConstraintDslTextualGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ConstraintDslTextualGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}