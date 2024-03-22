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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConstraintDslTextualParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ConstraintCollection'", "'{'", "'rules'", "','", "'}'", "'equalLow'", "'equalHigh'", "'RangeRule'", "'artifact'", "'attribute'", "'low'", "'high'", "'relatedRule'", "'-'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalConstraintDslTextualParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConstraintDslTextualParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConstraintDslTextualParser.tokenNames; }
    public String getGrammarFileName() { return "InternalConstraintDslTextual.g"; }



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




    // $ANTLR start "entryRuleConstraintCollection"
    // InternalConstraintDslTextual.g:64:1: entryRuleConstraintCollection returns [EObject current=null] : iv_ruleConstraintCollection= ruleConstraintCollection EOF ;
    public final EObject entryRuleConstraintCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintCollection = null;


        try {
            // InternalConstraintDslTextual.g:64:61: (iv_ruleConstraintCollection= ruleConstraintCollection EOF )
            // InternalConstraintDslTextual.g:65:2: iv_ruleConstraintCollection= ruleConstraintCollection EOF
            {
             newCompositeNode(grammarAccess.getConstraintCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintCollection=ruleConstraintCollection();

            state._fsp--;

             current =iv_ruleConstraintCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintCollection"


    // $ANTLR start "ruleConstraintCollection"
    // InternalConstraintDslTextual.g:71:1: ruleConstraintCollection returns [EObject current=null] : (otherlv_0= 'ConstraintCollection' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'rules' otherlv_4= '{' ( (lv_rules_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rules_7_0= ruleRule ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleConstraintCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_rules_5_0 = null;

        EObject lv_rules_7_0 = null;



        	enterRule();

        try {
            // InternalConstraintDslTextual.g:77:2: ( (otherlv_0= 'ConstraintCollection' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'rules' otherlv_4= '{' ( (lv_rules_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rules_7_0= ruleRule ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalConstraintDslTextual.g:78:2: (otherlv_0= 'ConstraintCollection' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'rules' otherlv_4= '{' ( (lv_rules_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rules_7_0= ruleRule ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalConstraintDslTextual.g:78:2: (otherlv_0= 'ConstraintCollection' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'rules' otherlv_4= '{' ( (lv_rules_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rules_7_0= ruleRule ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalConstraintDslTextual.g:79:3: otherlv_0= 'ConstraintCollection' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'rules' otherlv_4= '{' ( (lv_rules_5_0= ruleRule ) ) (otherlv_6= ',' ( (lv_rules_7_0= ruleRule ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintCollectionAccess().getConstraintCollectionKeyword_0());
            		
            // InternalConstraintDslTextual.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalConstraintDslTextual.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalConstraintDslTextual.g:84:4: (lv_name_1_0= ruleEString )
            // InternalConstraintDslTextual.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConstraintCollectionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintCollectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"zombie.incatch.constraintdsl.ConstraintDslTextual.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintCollectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintCollectionAccess().getRulesKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintCollectionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalConstraintDslTextual.g:114:3: ( (lv_rules_5_0= ruleRule ) )
            // InternalConstraintDslTextual.g:115:4: (lv_rules_5_0= ruleRule )
            {
            // InternalConstraintDslTextual.g:115:4: (lv_rules_5_0= ruleRule )
            // InternalConstraintDslTextual.g:116:5: lv_rules_5_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getConstraintCollectionAccess().getRulesRuleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_rules_5_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintCollectionRule());
            					}
            					add(
            						current,
            						"rules",
            						lv_rules_5_0,
            						"zombie.incatch.constraintdsl.ConstraintDslTextual.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalConstraintDslTextual.g:133:3: (otherlv_6= ',' ( (lv_rules_7_0= ruleRule ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalConstraintDslTextual.g:134:4: otherlv_6= ',' ( (lv_rules_7_0= ruleRule ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getConstraintCollectionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalConstraintDslTextual.g:138:4: ( (lv_rules_7_0= ruleRule ) )
            	    // InternalConstraintDslTextual.g:139:5: (lv_rules_7_0= ruleRule )
            	    {
            	    // InternalConstraintDslTextual.g:139:5: (lv_rules_7_0= ruleRule )
            	    // InternalConstraintDslTextual.g:140:6: lv_rules_7_0= ruleRule
            	    {

            	    						newCompositeNode(grammarAccess.getConstraintCollectionAccess().getRulesRuleParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_rules_7_0=ruleRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstraintCollectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_7_0,
            	    							"zombie.incatch.constraintdsl.ConstraintDslTextual.Rule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getConstraintCollectionAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getConstraintCollectionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintCollection"


    // $ANTLR start "entryRuleRule"
    // InternalConstraintDslTextual.g:170:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalConstraintDslTextual.g:170:45: (iv_ruleRule= ruleRule EOF )
            // InternalConstraintDslTextual.g:171:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalConstraintDslTextual.g:177:1: ruleRule returns [EObject current=null] : this_RangeRule_0= ruleRangeRule ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_RangeRule_0 = null;



        	enterRule();

        try {
            // InternalConstraintDslTextual.g:183:2: (this_RangeRule_0= ruleRangeRule )
            // InternalConstraintDslTextual.g:184:2: this_RangeRule_0= ruleRangeRule
            {

            		newCompositeNode(grammarAccess.getRuleAccess().getRangeRuleParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_RangeRule_0=ruleRangeRule();

            state._fsp--;


            		current = this_RangeRule_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleEString"
    // InternalConstraintDslTextual.g:195:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalConstraintDslTextual.g:195:47: (iv_ruleEString= ruleEString EOF )
            // InternalConstraintDslTextual.g:196:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalConstraintDslTextual.g:202:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalConstraintDslTextual.g:208:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalConstraintDslTextual.g:209:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalConstraintDslTextual.g:209:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalConstraintDslTextual.g:210:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalConstraintDslTextual.g:218:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRangeRule"
    // InternalConstraintDslTextual.g:229:1: entryRuleRangeRule returns [EObject current=null] : iv_ruleRangeRule= ruleRangeRule EOF ;
    public final EObject entryRuleRangeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeRule = null;


        try {
            // InternalConstraintDslTextual.g:229:50: (iv_ruleRangeRule= ruleRangeRule EOF )
            // InternalConstraintDslTextual.g:230:2: iv_ruleRangeRule= ruleRangeRule EOF
            {
             newCompositeNode(grammarAccess.getRangeRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRangeRule=ruleRangeRule();

            state._fsp--;

             current =iv_ruleRangeRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRangeRule"


    // $ANTLR start "ruleRangeRule"
    // InternalConstraintDslTextual.g:236:1: ruleRangeRule returns [EObject current=null] : ( ( (lv_equalLow_0_0= 'equalLow' ) )? ( (lv_equalHigh_1_0= 'equalHigh' ) )? otherlv_2= 'RangeRule' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'artifact' ( (lv_artifact_6_0= ruleEString ) ) )? (otherlv_7= 'attribute' ( (lv_attribute_8_0= ruleEString ) ) )? (otherlv_9= 'low' ( (lv_low_10_0= ruleEDouble ) ) )? (otherlv_11= 'high' ( (lv_high_12_0= ruleEDouble ) ) )? otherlv_13= 'relatedRule' ( ( ruleEString ) ) otherlv_15= '}' ) ;
    public final EObject ruleRangeRule() throws RecognitionException {
        EObject current = null;

        Token lv_equalLow_0_0=null;
        Token lv_equalHigh_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_artifact_6_0 = null;

        AntlrDatatypeRuleToken lv_attribute_8_0 = null;

        AntlrDatatypeRuleToken lv_low_10_0 = null;

        AntlrDatatypeRuleToken lv_high_12_0 = null;



        	enterRule();

        try {
            // InternalConstraintDslTextual.g:242:2: ( ( ( (lv_equalLow_0_0= 'equalLow' ) )? ( (lv_equalHigh_1_0= 'equalHigh' ) )? otherlv_2= 'RangeRule' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'artifact' ( (lv_artifact_6_0= ruleEString ) ) )? (otherlv_7= 'attribute' ( (lv_attribute_8_0= ruleEString ) ) )? (otherlv_9= 'low' ( (lv_low_10_0= ruleEDouble ) ) )? (otherlv_11= 'high' ( (lv_high_12_0= ruleEDouble ) ) )? otherlv_13= 'relatedRule' ( ( ruleEString ) ) otherlv_15= '}' ) )
            // InternalConstraintDslTextual.g:243:2: ( ( (lv_equalLow_0_0= 'equalLow' ) )? ( (lv_equalHigh_1_0= 'equalHigh' ) )? otherlv_2= 'RangeRule' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'artifact' ( (lv_artifact_6_0= ruleEString ) ) )? (otherlv_7= 'attribute' ( (lv_attribute_8_0= ruleEString ) ) )? (otherlv_9= 'low' ( (lv_low_10_0= ruleEDouble ) ) )? (otherlv_11= 'high' ( (lv_high_12_0= ruleEDouble ) ) )? otherlv_13= 'relatedRule' ( ( ruleEString ) ) otherlv_15= '}' )
            {
            // InternalConstraintDslTextual.g:243:2: ( ( (lv_equalLow_0_0= 'equalLow' ) )? ( (lv_equalHigh_1_0= 'equalHigh' ) )? otherlv_2= 'RangeRule' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'artifact' ( (lv_artifact_6_0= ruleEString ) ) )? (otherlv_7= 'attribute' ( (lv_attribute_8_0= ruleEString ) ) )? (otherlv_9= 'low' ( (lv_low_10_0= ruleEDouble ) ) )? (otherlv_11= 'high' ( (lv_high_12_0= ruleEDouble ) ) )? otherlv_13= 'relatedRule' ( ( ruleEString ) ) otherlv_15= '}' )
            // InternalConstraintDslTextual.g:244:3: ( (lv_equalLow_0_0= 'equalLow' ) )? ( (lv_equalHigh_1_0= 'equalHigh' ) )? otherlv_2= 'RangeRule' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'artifact' ( (lv_artifact_6_0= ruleEString ) ) )? (otherlv_7= 'attribute' ( (lv_attribute_8_0= ruleEString ) ) )? (otherlv_9= 'low' ( (lv_low_10_0= ruleEDouble ) ) )? (otherlv_11= 'high' ( (lv_high_12_0= ruleEDouble ) ) )? otherlv_13= 'relatedRule' ( ( ruleEString ) ) otherlv_15= '}'
            {
            // InternalConstraintDslTextual.g:244:3: ( (lv_equalLow_0_0= 'equalLow' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalConstraintDslTextual.g:245:4: (lv_equalLow_0_0= 'equalLow' )
                    {
                    // InternalConstraintDslTextual.g:245:4: (lv_equalLow_0_0= 'equalLow' )
                    // InternalConstraintDslTextual.g:246:5: lv_equalLow_0_0= 'equalLow'
                    {
                    lv_equalLow_0_0=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(lv_equalLow_0_0, grammarAccess.getRangeRuleAccess().getEqualLowEqualLowKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRangeRuleRule());
                    					}
                    					setWithLastConsumed(current, "equalLow", lv_equalLow_0_0 != null, "equalLow");
                    				

                    }


                    }
                    break;

            }

            // InternalConstraintDslTextual.g:258:3: ( (lv_equalHigh_1_0= 'equalHigh' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalConstraintDslTextual.g:259:4: (lv_equalHigh_1_0= 'equalHigh' )
                    {
                    // InternalConstraintDslTextual.g:259:4: (lv_equalHigh_1_0= 'equalHigh' )
                    // InternalConstraintDslTextual.g:260:5: lv_equalHigh_1_0= 'equalHigh'
                    {
                    lv_equalHigh_1_0=(Token)match(input,17,FOLLOW_10); 

                    					newLeafNode(lv_equalHigh_1_0, grammarAccess.getRangeRuleAccess().getEqualHighEqualHighKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRangeRuleRule());
                    					}
                    					setWithLastConsumed(current, "equalHigh", lv_equalHigh_1_0 != null, "equalHigh");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRangeRuleAccess().getRangeRuleKeyword_2());
            		
            // InternalConstraintDslTextual.g:276:3: ( (lv_name_3_0= ruleEString ) )
            // InternalConstraintDslTextual.g:277:4: (lv_name_3_0= ruleEString )
            {
            // InternalConstraintDslTextual.g:277:4: (lv_name_3_0= ruleEString )
            // InternalConstraintDslTextual.g:278:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRangeRuleAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"zombie.incatch.constraintdsl.ConstraintDslTextual.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getRangeRuleAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalConstraintDslTextual.g:299:3: (otherlv_5= 'artifact' ( (lv_artifact_6_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalConstraintDslTextual.g:300:4: otherlv_5= 'artifact' ( (lv_artifact_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getRangeRuleAccess().getArtifactKeyword_5_0());
                    			
                    // InternalConstraintDslTextual.g:304:4: ( (lv_artifact_6_0= ruleEString ) )
                    // InternalConstraintDslTextual.g:305:5: (lv_artifact_6_0= ruleEString )
                    {
                    // InternalConstraintDslTextual.g:305:5: (lv_artifact_6_0= ruleEString )
                    // InternalConstraintDslTextual.g:306:6: lv_artifact_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRangeRuleAccess().getArtifactEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_artifact_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeRuleRule());
                    						}
                    						set(
                    							current,
                    							"artifact",
                    							lv_artifact_6_0,
                    							"zombie.incatch.constraintdsl.ConstraintDslTextual.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalConstraintDslTextual.g:324:3: (otherlv_7= 'attribute' ( (lv_attribute_8_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalConstraintDslTextual.g:325:4: otherlv_7= 'attribute' ( (lv_attribute_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getRangeRuleAccess().getAttributeKeyword_6_0());
                    			
                    // InternalConstraintDslTextual.g:329:4: ( (lv_attribute_8_0= ruleEString ) )
                    // InternalConstraintDslTextual.g:330:5: (lv_attribute_8_0= ruleEString )
                    {
                    // InternalConstraintDslTextual.g:330:5: (lv_attribute_8_0= ruleEString )
                    // InternalConstraintDslTextual.g:331:6: lv_attribute_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRangeRuleAccess().getAttributeEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_attribute_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeRuleRule());
                    						}
                    						set(
                    							current,
                    							"attribute",
                    							lv_attribute_8_0,
                    							"zombie.incatch.constraintdsl.ConstraintDslTextual.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalConstraintDslTextual.g:349:3: (otherlv_9= 'low' ( (lv_low_10_0= ruleEDouble ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalConstraintDslTextual.g:350:4: otherlv_9= 'low' ( (lv_low_10_0= ruleEDouble ) )
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getRangeRuleAccess().getLowKeyword_7_0());
                    			
                    // InternalConstraintDslTextual.g:354:4: ( (lv_low_10_0= ruleEDouble ) )
                    // InternalConstraintDslTextual.g:355:5: (lv_low_10_0= ruleEDouble )
                    {
                    // InternalConstraintDslTextual.g:355:5: (lv_low_10_0= ruleEDouble )
                    // InternalConstraintDslTextual.g:356:6: lv_low_10_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getRangeRuleAccess().getLowEDoubleParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_low_10_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeRuleRule());
                    						}
                    						set(
                    							current,
                    							"low",
                    							lv_low_10_0,
                    							"zombie.incatch.constraintdsl.ConstraintDslTextual.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalConstraintDslTextual.g:374:3: (otherlv_11= 'high' ( (lv_high_12_0= ruleEDouble ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalConstraintDslTextual.g:375:4: otherlv_11= 'high' ( (lv_high_12_0= ruleEDouble ) )
                    {
                    otherlv_11=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getRangeRuleAccess().getHighKeyword_8_0());
                    			
                    // InternalConstraintDslTextual.g:379:4: ( (lv_high_12_0= ruleEDouble ) )
                    // InternalConstraintDslTextual.g:380:5: (lv_high_12_0= ruleEDouble )
                    {
                    // InternalConstraintDslTextual.g:380:5: (lv_high_12_0= ruleEDouble )
                    // InternalConstraintDslTextual.g:381:6: lv_high_12_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getRangeRuleAccess().getHighEDoubleParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_high_12_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeRuleRule());
                    						}
                    						set(
                    							current,
                    							"high",
                    							lv_high_12_0,
                    							"zombie.incatch.constraintdsl.ConstraintDslTextual.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getRangeRuleAccess().getRelatedRuleKeyword_9());
            		
            // InternalConstraintDslTextual.g:403:3: ( ( ruleEString ) )
            // InternalConstraintDslTextual.g:404:4: ( ruleEString )
            {
            // InternalConstraintDslTextual.g:404:4: ( ruleEString )
            // InternalConstraintDslTextual.g:405:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRangeRuleAccess().getRelatedRuleRuleCrossReference_10_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRangeRuleAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRangeRule"


    // $ANTLR start "entryRuleEDouble"
    // InternalConstraintDslTextual.g:427:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalConstraintDslTextual.g:427:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalConstraintDslTextual.g:428:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalConstraintDslTextual.g:434:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalConstraintDslTextual.g:440:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalConstraintDslTextual.g:441:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalConstraintDslTextual.g:441:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalConstraintDslTextual.g:442:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalConstraintDslTextual.g:442:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalConstraintDslTextual.g:443:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalConstraintDslTextual.g:449:3: (this_INT_1= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalConstraintDslTextual.g:450:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_18); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,25,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_20); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalConstraintDslTextual.g:470:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=26 && LA13_0<=27)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalConstraintDslTextual.g:471:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalConstraintDslTextual.g:471:4: (kw= 'E' | kw= 'e' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==26) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==27) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalConstraintDslTextual.g:472:5: kw= 'E'
                            {
                            kw=(Token)match(input,26,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalConstraintDslTextual.g:478:5: kw= 'e'
                            {
                            kw=(Token)match(input,27,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalConstraintDslTextual.g:484:4: (kw= '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==24) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalConstraintDslTextual.g:485:5: kw= '-'
                            {
                            kw=(Token)match(input,24,FOLLOW_19); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000040L});

}