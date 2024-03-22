/*
 * generated by Xtext 2.27.0
 */
grammar InternalConstraintDslTextual;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package zombie.incatch.constraintdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package zombie.incatch.constraintdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import zombie.incatch.constraintdsl.services.ConstraintDslTextualGrammarAccess;

}

@parser::members {

 	private ConstraintDslTextualGrammarAccess grammarAccess;

    public InternalConstraintDslTextualParser(TokenStream input, ConstraintDslTextualGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ConstraintCollection";
   	}

   	@Override
   	protected ConstraintDslTextualGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleConstraintCollection
entryRuleConstraintCollection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstraintCollectionRule()); }
	iv_ruleConstraintCollection=ruleConstraintCollection
	{ $current=$iv_ruleConstraintCollection.current; }
	EOF;

// Rule ConstraintCollection
ruleConstraintCollection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ConstraintCollection'
		{
			newLeafNode(otherlv_0, grammarAccess.getConstraintCollectionAccess().getConstraintCollectionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConstraintCollectionAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConstraintCollectionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"zombie.incatch.constraintdsl.ConstraintDslTextual.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getConstraintCollectionAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='rules'
		{
			newLeafNode(otherlv_3, grammarAccess.getConstraintCollectionAccess().getRulesKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getConstraintCollectionAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConstraintCollectionAccess().getRulesRuleParserRuleCall_5_0());
				}
				lv_rules_5_0=ruleRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConstraintCollectionRule());
					}
					add(
						$current,
						"rules",
						lv_rules_5_0,
						"zombie.incatch.constraintdsl.ConstraintDslTextual.Rule");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getConstraintCollectionAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConstraintCollectionAccess().getRulesRuleParserRuleCall_6_1_0());
					}
					lv_rules_7_0=ruleRule
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConstraintCollectionRule());
						}
						add(
							$current,
							"rules",
							lv_rules_7_0,
							"zombie.incatch.constraintdsl.ConstraintDslTextual.Rule");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getConstraintCollectionAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getConstraintCollectionAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getRuleAccess().getRangeRuleParserRuleCall());
	}
	this_RangeRule_0=ruleRangeRule
	{
		$current = $this_RangeRule_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleRangeRule
entryRuleRangeRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRangeRuleRule()); }
	iv_ruleRangeRule=ruleRangeRule
	{ $current=$iv_ruleRangeRule.current; }
	EOF;

// Rule RangeRule
ruleRangeRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_equalLow_0_0='equalLow'
				{
					newLeafNode(lv_equalLow_0_0, grammarAccess.getRangeRuleAccess().getEqualLowEqualLowKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRangeRuleRule());
					}
					setWithLastConsumed($current, "equalLow", lv_equalLow_0_0 != null, "equalLow");
				}
			)
		)?
		(
			(
				lv_equalHigh_1_0='equalHigh'
				{
					newLeafNode(lv_equalHigh_1_0, grammarAccess.getRangeRuleAccess().getEqualHighEqualHighKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRangeRuleRule());
					}
					setWithLastConsumed($current, "equalHigh", lv_equalHigh_1_0 != null, "equalHigh");
				}
			)
		)?
		otherlv_2='RangeRule'
		{
			newLeafNode(otherlv_2, grammarAccess.getRangeRuleAccess().getRangeRuleKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRangeRuleAccess().getNameEStringParserRuleCall_3_0());
				}
				lv_name_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRangeRuleRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"zombie.incatch.constraintdsl.ConstraintDslTextual.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getRangeRuleAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			otherlv_5='artifact'
			{
				newLeafNode(otherlv_5, grammarAccess.getRangeRuleAccess().getArtifactKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRangeRuleAccess().getArtifactEStringParserRuleCall_5_1_0());
					}
					lv_artifact_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRangeRuleRule());
						}
						set(
							$current,
							"artifact",
							lv_artifact_6_0,
							"zombie.incatch.constraintdsl.ConstraintDslTextual.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='attribute'
			{
				newLeafNode(otherlv_7, grammarAccess.getRangeRuleAccess().getAttributeKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRangeRuleAccess().getAttributeEStringParserRuleCall_6_1_0());
					}
					lv_attribute_8_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRangeRuleRule());
						}
						set(
							$current,
							"attribute",
							lv_attribute_8_0,
							"zombie.incatch.constraintdsl.ConstraintDslTextual.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='low'
			{
				newLeafNode(otherlv_9, grammarAccess.getRangeRuleAccess().getLowKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRangeRuleAccess().getLowEDoubleParserRuleCall_7_1_0());
					}
					lv_low_10_0=ruleEDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRangeRuleRule());
						}
						set(
							$current,
							"low",
							lv_low_10_0,
							"zombie.incatch.constraintdsl.ConstraintDslTextual.EDouble");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_11='high'
			{
				newLeafNode(otherlv_11, grammarAccess.getRangeRuleAccess().getHighKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRangeRuleAccess().getHighEDoubleParserRuleCall_8_1_0());
					}
					lv_high_12_0=ruleEDouble
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRangeRuleRule());
						}
						set(
							$current,
							"high",
							lv_high_12_0,
							"zombie.incatch.constraintdsl.ConstraintDslTextual.EDouble");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_13='relatedRule'
		{
			newLeafNode(otherlv_13, grammarAccess.getRangeRuleAccess().getRelatedRuleKeyword_9());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRangeRuleRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getRangeRuleAccess().getRelatedRuleRuleCrossReference_10_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getRangeRuleAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); }
	iv_ruleEDouble=ruleEDouble
	{ $current=$iv_ruleEDouble.current.getText(); }
	EOF;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;