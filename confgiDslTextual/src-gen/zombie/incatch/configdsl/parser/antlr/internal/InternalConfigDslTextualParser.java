package zombie.incatch.configdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import zombie.incatch.configdsl.services.ConfigDslTextualGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfigDslTextualParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Config'", "'{'", "'project'", "'simpleStringFields'", "','", "'}'", "'dynamicListFields'", "'KeepClassification'", "'Project'", "'IsRequired'", "'SimpleStringField'", "'Size'", "'DynamicListField'", "'dynamicListItems'", "'-'", "'DynamicListItem'"
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


        public InternalConfigDslTextualParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConfigDslTextualParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConfigDslTextualParser.tokenNames; }
    public String getGrammarFileName() { return "InternalConfigDslTextual.g"; }



     	private ConfigDslTextualGrammarAccess grammarAccess;

        public InternalConfigDslTextualParser(TokenStream input, ConfigDslTextualGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Config";
       	}

       	@Override
       	protected ConfigDslTextualGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConfig"
    // InternalConfigDslTextual.g:64:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalConfigDslTextual.g:64:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalConfigDslTextual.g:65:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalConfigDslTextual.g:71:1: ruleConfig returns [EObject current=null] : (otherlv_0= 'Config' otherlv_1= '{' otherlv_2= 'project' ( (lv_project_3_0= ruleProject ) ) otherlv_4= 'simpleStringFields' otherlv_5= '{' ( (lv_simpleStringFields_6_0= ruleSimpleStringField ) ) (otherlv_7= ',' ( (lv_simpleStringFields_8_0= ruleSimpleStringField ) ) )* otherlv_9= '}' (otherlv_10= 'dynamicListFields' otherlv_11= '{' ( (lv_dynamicListFields_12_0= ruleDynamicListField ) ) (otherlv_13= ',' ( (lv_dynamicListFields_14_0= ruleDynamicListField ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_project_3_0 = null;

        EObject lv_simpleStringFields_6_0 = null;

        EObject lv_simpleStringFields_8_0 = null;

        EObject lv_dynamicListFields_12_0 = null;

        EObject lv_dynamicListFields_14_0 = null;



        	enterRule();

        try {
            // InternalConfigDslTextual.g:77:2: ( (otherlv_0= 'Config' otherlv_1= '{' otherlv_2= 'project' ( (lv_project_3_0= ruleProject ) ) otherlv_4= 'simpleStringFields' otherlv_5= '{' ( (lv_simpleStringFields_6_0= ruleSimpleStringField ) ) (otherlv_7= ',' ( (lv_simpleStringFields_8_0= ruleSimpleStringField ) ) )* otherlv_9= '}' (otherlv_10= 'dynamicListFields' otherlv_11= '{' ( (lv_dynamicListFields_12_0= ruleDynamicListField ) ) (otherlv_13= ',' ( (lv_dynamicListFields_14_0= ruleDynamicListField ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalConfigDslTextual.g:78:2: (otherlv_0= 'Config' otherlv_1= '{' otherlv_2= 'project' ( (lv_project_3_0= ruleProject ) ) otherlv_4= 'simpleStringFields' otherlv_5= '{' ( (lv_simpleStringFields_6_0= ruleSimpleStringField ) ) (otherlv_7= ',' ( (lv_simpleStringFields_8_0= ruleSimpleStringField ) ) )* otherlv_9= '}' (otherlv_10= 'dynamicListFields' otherlv_11= '{' ( (lv_dynamicListFields_12_0= ruleDynamicListField ) ) (otherlv_13= ',' ( (lv_dynamicListFields_14_0= ruleDynamicListField ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalConfigDslTextual.g:78:2: (otherlv_0= 'Config' otherlv_1= '{' otherlv_2= 'project' ( (lv_project_3_0= ruleProject ) ) otherlv_4= 'simpleStringFields' otherlv_5= '{' ( (lv_simpleStringFields_6_0= ruleSimpleStringField ) ) (otherlv_7= ',' ( (lv_simpleStringFields_8_0= ruleSimpleStringField ) ) )* otherlv_9= '}' (otherlv_10= 'dynamicListFields' otherlv_11= '{' ( (lv_dynamicListFields_12_0= ruleDynamicListField ) ) (otherlv_13= ',' ( (lv_dynamicListFields_14_0= ruleDynamicListField ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalConfigDslTextual.g:79:3: otherlv_0= 'Config' otherlv_1= '{' otherlv_2= 'project' ( (lv_project_3_0= ruleProject ) ) otherlv_4= 'simpleStringFields' otherlv_5= '{' ( (lv_simpleStringFields_6_0= ruleSimpleStringField ) ) (otherlv_7= ',' ( (lv_simpleStringFields_8_0= ruleSimpleStringField ) ) )* otherlv_9= '}' (otherlv_10= 'dynamicListFields' otherlv_11= '{' ( (lv_dynamicListFields_12_0= ruleDynamicListField ) ) (otherlv_13= ',' ( (lv_dynamicListFields_14_0= ruleDynamicListField ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getConfigKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getProjectKeyword_2());
            		
            // InternalConfigDslTextual.g:91:3: ( (lv_project_3_0= ruleProject ) )
            // InternalConfigDslTextual.g:92:4: (lv_project_3_0= ruleProject )
            {
            // InternalConfigDslTextual.g:92:4: (lv_project_3_0= ruleProject )
            // InternalConfigDslTextual.g:93:5: lv_project_3_0= ruleProject
            {

            					newCompositeNode(grammarAccess.getConfigAccess().getProjectProjectParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_project_3_0=ruleProject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigRule());
            					}
            					set(
            						current,
            						"project",
            						lv_project_3_0,
            						"zombie.incatch.configdsl.ConfigDslTextual.Project");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getConfigAccess().getSimpleStringFieldsKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalConfigDslTextual.g:118:3: ( (lv_simpleStringFields_6_0= ruleSimpleStringField ) )
            // InternalConfigDslTextual.g:119:4: (lv_simpleStringFields_6_0= ruleSimpleStringField )
            {
            // InternalConfigDslTextual.g:119:4: (lv_simpleStringFields_6_0= ruleSimpleStringField )
            // InternalConfigDslTextual.g:120:5: lv_simpleStringFields_6_0= ruleSimpleStringField
            {

            					newCompositeNode(grammarAccess.getConfigAccess().getSimpleStringFieldsSimpleStringFieldParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_simpleStringFields_6_0=ruleSimpleStringField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfigRule());
            					}
            					add(
            						current,
            						"simpleStringFields",
            						lv_simpleStringFields_6_0,
            						"zombie.incatch.configdsl.ConfigDslTextual.SimpleStringField");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalConfigDslTextual.g:137:3: (otherlv_7= ',' ( (lv_simpleStringFields_8_0= ruleSimpleStringField ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalConfigDslTextual.g:138:4: otherlv_7= ',' ( (lv_simpleStringFields_8_0= ruleSimpleStringField ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getConfigAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalConfigDslTextual.g:142:4: ( (lv_simpleStringFields_8_0= ruleSimpleStringField ) )
            	    // InternalConfigDslTextual.g:143:5: (lv_simpleStringFields_8_0= ruleSimpleStringField )
            	    {
            	    // InternalConfigDslTextual.g:143:5: (lv_simpleStringFields_8_0= ruleSimpleStringField )
            	    // InternalConfigDslTextual.g:144:6: lv_simpleStringFields_8_0= ruleSimpleStringField
            	    {

            	    						newCompositeNode(grammarAccess.getConfigAccess().getSimpleStringFieldsSimpleStringFieldParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_simpleStringFields_8_0=ruleSimpleStringField();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"simpleStringFields",
            	    							lv_simpleStringFields_8_0,
            	    							"zombie.incatch.configdsl.ConfigDslTextual.SimpleStringField");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalConfigDslTextual.g:166:3: (otherlv_10= 'dynamicListFields' otherlv_11= '{' ( (lv_dynamicListFields_12_0= ruleDynamicListField ) ) (otherlv_13= ',' ( (lv_dynamicListFields_14_0= ruleDynamicListField ) ) )* otherlv_15= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalConfigDslTextual.g:167:4: otherlv_10= 'dynamicListFields' otherlv_11= '{' ( (lv_dynamicListFields_12_0= ruleDynamicListField ) ) (otherlv_13= ',' ( (lv_dynamicListFields_14_0= ruleDynamicListField ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getConfigAccess().getDynamicListFieldsKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalConfigDslTextual.g:175:4: ( (lv_dynamicListFields_12_0= ruleDynamicListField ) )
                    // InternalConfigDslTextual.g:176:5: (lv_dynamicListFields_12_0= ruleDynamicListField )
                    {
                    // InternalConfigDslTextual.g:176:5: (lv_dynamicListFields_12_0= ruleDynamicListField )
                    // InternalConfigDslTextual.g:177:6: lv_dynamicListFields_12_0= ruleDynamicListField
                    {

                    						newCompositeNode(grammarAccess.getConfigAccess().getDynamicListFieldsDynamicListFieldParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_dynamicListFields_12_0=ruleDynamicListField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfigRule());
                    						}
                    						add(
                    							current,
                    							"dynamicListFields",
                    							lv_dynamicListFields_12_0,
                    							"zombie.incatch.configdsl.ConfigDslTextual.DynamicListField");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalConfigDslTextual.g:194:4: (otherlv_13= ',' ( (lv_dynamicListFields_14_0= ruleDynamicListField ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalConfigDslTextual.g:195:5: otherlv_13= ',' ( (lv_dynamicListFields_14_0= ruleDynamicListField ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getConfigAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalConfigDslTextual.g:199:5: ( (lv_dynamicListFields_14_0= ruleDynamicListField ) )
                    	    // InternalConfigDslTextual.g:200:6: (lv_dynamicListFields_14_0= ruleDynamicListField )
                    	    {
                    	    // InternalConfigDslTextual.g:200:6: (lv_dynamicListFields_14_0= ruleDynamicListField )
                    	    // InternalConfigDslTextual.g:201:7: lv_dynamicListFields_14_0= ruleDynamicListField
                    	    {

                    	    							newCompositeNode(grammarAccess.getConfigAccess().getDynamicListFieldsDynamicListFieldParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_dynamicListFields_14_0=ruleDynamicListField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConfigRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dynamicListFields",
                    	    								lv_dynamicListFields_14_0,
                    	    								"zombie.incatch.configdsl.ConfigDslTextual.DynamicListField");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleProject"
    // InternalConfigDslTextual.g:232:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalConfigDslTextual.g:232:48: (iv_ruleProject= ruleProject EOF )
            // InternalConfigDslTextual.g:233:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalConfigDslTextual.g:239:1: ruleProject returns [EObject current=null] : ( () ( (lv_KeepClassification_1_0= 'KeepClassification' ) )? otherlv_2= 'Project' ( (lv_Name_3_0= ruleEString ) ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_KeepClassification_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_Name_3_0 = null;



        	enterRule();

        try {
            // InternalConfigDslTextual.g:245:2: ( ( () ( (lv_KeepClassification_1_0= 'KeepClassification' ) )? otherlv_2= 'Project' ( (lv_Name_3_0= ruleEString ) ) ) )
            // InternalConfigDslTextual.g:246:2: ( () ( (lv_KeepClassification_1_0= 'KeepClassification' ) )? otherlv_2= 'Project' ( (lv_Name_3_0= ruleEString ) ) )
            {
            // InternalConfigDslTextual.g:246:2: ( () ( (lv_KeepClassification_1_0= 'KeepClassification' ) )? otherlv_2= 'Project' ( (lv_Name_3_0= ruleEString ) ) )
            // InternalConfigDslTextual.g:247:3: () ( (lv_KeepClassification_1_0= 'KeepClassification' ) )? otherlv_2= 'Project' ( (lv_Name_3_0= ruleEString ) )
            {
            // InternalConfigDslTextual.g:247:3: ()
            // InternalConfigDslTextual.g:248:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectAccess().getProjectAction_0(),
            					current);
            			

            }

            // InternalConfigDslTextual.g:254:3: ( (lv_KeepClassification_1_0= 'KeepClassification' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalConfigDslTextual.g:255:4: (lv_KeepClassification_1_0= 'KeepClassification' )
                    {
                    // InternalConfigDslTextual.g:255:4: (lv_KeepClassification_1_0= 'KeepClassification' )
                    // InternalConfigDslTextual.g:256:5: lv_KeepClassification_1_0= 'KeepClassification'
                    {
                    lv_KeepClassification_1_0=(Token)match(input,18,FOLLOW_12); 

                    					newLeafNode(lv_KeepClassification_1_0, grammarAccess.getProjectAccess().getKeepClassificationKeepClassificationKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getProjectRule());
                    					}
                    					setWithLastConsumed(current, "KeepClassification", lv_KeepClassification_1_0 != null, "KeepClassification");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getProjectKeyword_2());
            		
            // InternalConfigDslTextual.g:272:3: ( (lv_Name_3_0= ruleEString ) )
            // InternalConfigDslTextual.g:273:4: (lv_Name_3_0= ruleEString )
            {
            // InternalConfigDslTextual.g:273:4: (lv_Name_3_0= ruleEString )
            // InternalConfigDslTextual.g:274:5: lv_Name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_Name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"Name",
            						lv_Name_3_0,
            						"zombie.incatch.configdsl.ConfigDslTextual.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleSimpleStringField"
    // InternalConfigDslTextual.g:295:1: entryRuleSimpleStringField returns [EObject current=null] : iv_ruleSimpleStringField= ruleSimpleStringField EOF ;
    public final EObject entryRuleSimpleStringField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStringField = null;


        try {
            // InternalConfigDslTextual.g:295:58: (iv_ruleSimpleStringField= ruleSimpleStringField EOF )
            // InternalConfigDslTextual.g:296:2: iv_ruleSimpleStringField= ruleSimpleStringField EOF
            {
             newCompositeNode(grammarAccess.getSimpleStringFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleStringField=ruleSimpleStringField();

            state._fsp--;

             current =iv_ruleSimpleStringField; 
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
    // $ANTLR end "entryRuleSimpleStringField"


    // $ANTLR start "ruleSimpleStringField"
    // InternalConfigDslTextual.g:302:1: ruleSimpleStringField returns [EObject current=null] : ( () ( (lv_IsRequired_1_0= 'IsRequired' ) )? otherlv_2= 'SimpleStringField' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'Size' ( (lv_Size_6_0= ruleEInt ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleSimpleStringField() throws RecognitionException {
        EObject current = null;

        Token lv_IsRequired_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_Name_3_0 = null;

        AntlrDatatypeRuleToken lv_Size_6_0 = null;



        	enterRule();

        try {
            // InternalConfigDslTextual.g:308:2: ( ( () ( (lv_IsRequired_1_0= 'IsRequired' ) )? otherlv_2= 'SimpleStringField' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'Size' ( (lv_Size_6_0= ruleEInt ) ) )? otherlv_7= '}' ) )
            // InternalConfigDslTextual.g:309:2: ( () ( (lv_IsRequired_1_0= 'IsRequired' ) )? otherlv_2= 'SimpleStringField' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'Size' ( (lv_Size_6_0= ruleEInt ) ) )? otherlv_7= '}' )
            {
            // InternalConfigDslTextual.g:309:2: ( () ( (lv_IsRequired_1_0= 'IsRequired' ) )? otherlv_2= 'SimpleStringField' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'Size' ( (lv_Size_6_0= ruleEInt ) ) )? otherlv_7= '}' )
            // InternalConfigDslTextual.g:310:3: () ( (lv_IsRequired_1_0= 'IsRequired' ) )? otherlv_2= 'SimpleStringField' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'Size' ( (lv_Size_6_0= ruleEInt ) ) )? otherlv_7= '}'
            {
            // InternalConfigDslTextual.g:310:3: ()
            // InternalConfigDslTextual.g:311:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleStringFieldAccess().getSimpleStringFieldAction_0(),
            					current);
            			

            }

            // InternalConfigDslTextual.g:317:3: ( (lv_IsRequired_1_0= 'IsRequired' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalConfigDslTextual.g:318:4: (lv_IsRequired_1_0= 'IsRequired' )
                    {
                    // InternalConfigDslTextual.g:318:4: (lv_IsRequired_1_0= 'IsRequired' )
                    // InternalConfigDslTextual.g:319:5: lv_IsRequired_1_0= 'IsRequired'
                    {
                    lv_IsRequired_1_0=(Token)match(input,20,FOLLOW_14); 

                    					newLeafNode(lv_IsRequired_1_0, grammarAccess.getSimpleStringFieldAccess().getIsRequiredIsRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimpleStringFieldRule());
                    					}
                    					setWithLastConsumed(current, "IsRequired", lv_IsRequired_1_0 != null, "IsRequired");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleStringFieldAccess().getSimpleStringFieldKeyword_2());
            		
            // InternalConfigDslTextual.g:335:3: ( (lv_Name_3_0= ruleEString ) )
            // InternalConfigDslTextual.g:336:4: (lv_Name_3_0= ruleEString )
            {
            // InternalConfigDslTextual.g:336:4: (lv_Name_3_0= ruleEString )
            // InternalConfigDslTextual.g:337:5: lv_Name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleStringFieldAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_Name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleStringFieldRule());
            					}
            					set(
            						current,
            						"Name",
            						lv_Name_3_0,
            						"zombie.incatch.configdsl.ConfigDslTextual.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getSimpleStringFieldAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalConfigDslTextual.g:358:3: (otherlv_5= 'Size' ( (lv_Size_6_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalConfigDslTextual.g:359:4: otherlv_5= 'Size' ( (lv_Size_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getSimpleStringFieldAccess().getSizeKeyword_5_0());
                    			
                    // InternalConfigDslTextual.g:363:4: ( (lv_Size_6_0= ruleEInt ) )
                    // InternalConfigDslTextual.g:364:5: (lv_Size_6_0= ruleEInt )
                    {
                    // InternalConfigDslTextual.g:364:5: (lv_Size_6_0= ruleEInt )
                    // InternalConfigDslTextual.g:365:6: lv_Size_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSimpleStringFieldAccess().getSizeEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_Size_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleStringFieldRule());
                    						}
                    						set(
                    							current,
                    							"Size",
                    							lv_Size_6_0,
                    							"zombie.incatch.configdsl.ConfigDslTextual.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSimpleStringFieldAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSimpleStringField"


    // $ANTLR start "entryRuleDynamicListField"
    // InternalConfigDslTextual.g:391:1: entryRuleDynamicListField returns [EObject current=null] : iv_ruleDynamicListField= ruleDynamicListField EOF ;
    public final EObject entryRuleDynamicListField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicListField = null;


        try {
            // InternalConfigDslTextual.g:391:57: (iv_ruleDynamicListField= ruleDynamicListField EOF )
            // InternalConfigDslTextual.g:392:2: iv_ruleDynamicListField= ruleDynamicListField EOF
            {
             newCompositeNode(grammarAccess.getDynamicListFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDynamicListField=ruleDynamicListField();

            state._fsp--;

             current =iv_ruleDynamicListField; 
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
    // $ANTLR end "entryRuleDynamicListField"


    // $ANTLR start "ruleDynamicListField"
    // InternalConfigDslTextual.g:398:1: ruleDynamicListField returns [EObject current=null] : ( () ( (lv_IsRequired_1_0= 'IsRequired' ) )? otherlv_2= 'DynamicListField' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'dynamicListItems' otherlv_6= '{' ( (lv_dynamicListItems_7_0= ruleDynamicListItem ) ) (otherlv_8= ',' ( (lv_dynamicListItems_9_0= ruleDynamicListItem ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleDynamicListField() throws RecognitionException {
        EObject current = null;

        Token lv_IsRequired_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_Name_3_0 = null;

        EObject lv_dynamicListItems_7_0 = null;

        EObject lv_dynamicListItems_9_0 = null;



        	enterRule();

        try {
            // InternalConfigDslTextual.g:404:2: ( ( () ( (lv_IsRequired_1_0= 'IsRequired' ) )? otherlv_2= 'DynamicListField' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'dynamicListItems' otherlv_6= '{' ( (lv_dynamicListItems_7_0= ruleDynamicListItem ) ) (otherlv_8= ',' ( (lv_dynamicListItems_9_0= ruleDynamicListItem ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalConfigDslTextual.g:405:2: ( () ( (lv_IsRequired_1_0= 'IsRequired' ) )? otherlv_2= 'DynamicListField' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'dynamicListItems' otherlv_6= '{' ( (lv_dynamicListItems_7_0= ruleDynamicListItem ) ) (otherlv_8= ',' ( (lv_dynamicListItems_9_0= ruleDynamicListItem ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalConfigDslTextual.g:405:2: ( () ( (lv_IsRequired_1_0= 'IsRequired' ) )? otherlv_2= 'DynamicListField' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'dynamicListItems' otherlv_6= '{' ( (lv_dynamicListItems_7_0= ruleDynamicListItem ) ) (otherlv_8= ',' ( (lv_dynamicListItems_9_0= ruleDynamicListItem ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalConfigDslTextual.g:406:3: () ( (lv_IsRequired_1_0= 'IsRequired' ) )? otherlv_2= 'DynamicListField' ( (lv_Name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'dynamicListItems' otherlv_6= '{' ( (lv_dynamicListItems_7_0= ruleDynamicListItem ) ) (otherlv_8= ',' ( (lv_dynamicListItems_9_0= ruleDynamicListItem ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalConfigDslTextual.g:406:3: ()
            // InternalConfigDslTextual.g:407:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDynamicListFieldAccess().getDynamicListFieldAction_0(),
            					current);
            			

            }

            // InternalConfigDslTextual.g:413:3: ( (lv_IsRequired_1_0= 'IsRequired' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalConfigDslTextual.g:414:4: (lv_IsRequired_1_0= 'IsRequired' )
                    {
                    // InternalConfigDslTextual.g:414:4: (lv_IsRequired_1_0= 'IsRequired' )
                    // InternalConfigDslTextual.g:415:5: lv_IsRequired_1_0= 'IsRequired'
                    {
                    lv_IsRequired_1_0=(Token)match(input,20,FOLLOW_17); 

                    					newLeafNode(lv_IsRequired_1_0, grammarAccess.getDynamicListFieldAccess().getIsRequiredIsRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDynamicListFieldRule());
                    					}
                    					setWithLastConsumed(current, "IsRequired", lv_IsRequired_1_0 != null, "IsRequired");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDynamicListFieldAccess().getDynamicListFieldKeyword_2());
            		
            // InternalConfigDslTextual.g:431:3: ( (lv_Name_3_0= ruleEString ) )
            // InternalConfigDslTextual.g:432:4: (lv_Name_3_0= ruleEString )
            {
            // InternalConfigDslTextual.g:432:4: (lv_Name_3_0= ruleEString )
            // InternalConfigDslTextual.g:433:5: lv_Name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDynamicListFieldAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_Name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDynamicListFieldRule());
            					}
            					set(
            						current,
            						"Name",
            						lv_Name_3_0,
            						"zombie.incatch.configdsl.ConfigDslTextual.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getDynamicListFieldAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalConfigDslTextual.g:454:3: (otherlv_5= 'dynamicListItems' otherlv_6= '{' ( (lv_dynamicListItems_7_0= ruleDynamicListItem ) ) (otherlv_8= ',' ( (lv_dynamicListItems_9_0= ruleDynamicListItem ) ) )* otherlv_10= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalConfigDslTextual.g:455:4: otherlv_5= 'dynamicListItems' otherlv_6= '{' ( (lv_dynamicListItems_7_0= ruleDynamicListItem ) ) (otherlv_8= ',' ( (lv_dynamicListItems_9_0= ruleDynamicListItem ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDynamicListFieldAccess().getDynamicListItemsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getDynamicListFieldAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalConfigDslTextual.g:463:4: ( (lv_dynamicListItems_7_0= ruleDynamicListItem ) )
                    // InternalConfigDslTextual.g:464:5: (lv_dynamicListItems_7_0= ruleDynamicListItem )
                    {
                    // InternalConfigDslTextual.g:464:5: (lv_dynamicListItems_7_0= ruleDynamicListItem )
                    // InternalConfigDslTextual.g:465:6: lv_dynamicListItems_7_0= ruleDynamicListItem
                    {

                    						newCompositeNode(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsDynamicListItemParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_dynamicListItems_7_0=ruleDynamicListItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicListFieldRule());
                    						}
                    						add(
                    							current,
                    							"dynamicListItems",
                    							lv_dynamicListItems_7_0,
                    							"zombie.incatch.configdsl.ConfigDslTextual.DynamicListItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalConfigDslTextual.g:482:4: (otherlv_8= ',' ( (lv_dynamicListItems_9_0= ruleDynamicListItem ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalConfigDslTextual.g:483:5: otherlv_8= ',' ( (lv_dynamicListItems_9_0= ruleDynamicListItem ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_19); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDynamicListFieldAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalConfigDslTextual.g:487:5: ( (lv_dynamicListItems_9_0= ruleDynamicListItem ) )
                    	    // InternalConfigDslTextual.g:488:6: (lv_dynamicListItems_9_0= ruleDynamicListItem )
                    	    {
                    	    // InternalConfigDslTextual.g:488:6: (lv_dynamicListItems_9_0= ruleDynamicListItem )
                    	    // InternalConfigDslTextual.g:489:7: lv_dynamicListItems_9_0= ruleDynamicListItem
                    	    {

                    	    							newCompositeNode(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsDynamicListItemParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_dynamicListItems_9_0=ruleDynamicListItem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDynamicListFieldRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dynamicListItems",
                    	    								lv_dynamicListItems_9_0,
                    	    								"zombie.incatch.configdsl.ConfigDslTextual.DynamicListItem");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getDynamicListFieldAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDynamicListFieldAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDynamicListField"


    // $ANTLR start "entryRuleEString"
    // InternalConfigDslTextual.g:520:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalConfigDslTextual.g:520:47: (iv_ruleEString= ruleEString EOF )
            // InternalConfigDslTextual.g:521:2: iv_ruleEString= ruleEString EOF
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
    // InternalConfigDslTextual.g:527:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalConfigDslTextual.g:533:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalConfigDslTextual.g:534:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalConfigDslTextual.g:534:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalConfigDslTextual.g:535:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalConfigDslTextual.g:543:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEInt"
    // InternalConfigDslTextual.g:554:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalConfigDslTextual.g:554:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalConfigDslTextual.g:555:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalConfigDslTextual.g:561:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalConfigDslTextual.g:567:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalConfigDslTextual.g:568:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalConfigDslTextual.g:568:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalConfigDslTextual.g:569:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalConfigDslTextual.g:569:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalConfigDslTextual.g:570:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleDynamicListItem"
    // InternalConfigDslTextual.g:587:1: entryRuleDynamicListItem returns [EObject current=null] : iv_ruleDynamicListItem= ruleDynamicListItem EOF ;
    public final EObject entryRuleDynamicListItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicListItem = null;


        try {
            // InternalConfigDslTextual.g:587:56: (iv_ruleDynamicListItem= ruleDynamicListItem EOF )
            // InternalConfigDslTextual.g:588:2: iv_ruleDynamicListItem= ruleDynamicListItem EOF
            {
             newCompositeNode(grammarAccess.getDynamicListItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDynamicListItem=ruleDynamicListItem();

            state._fsp--;

             current =iv_ruleDynamicListItem; 
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
    // $ANTLR end "entryRuleDynamicListItem"


    // $ANTLR start "ruleDynamicListItem"
    // InternalConfigDslTextual.g:594:1: ruleDynamicListItem returns [EObject current=null] : ( () otherlv_1= 'DynamicListItem' ( (lv_Name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDynamicListItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_Name_2_0 = null;



        	enterRule();

        try {
            // InternalConfigDslTextual.g:600:2: ( ( () otherlv_1= 'DynamicListItem' ( (lv_Name_2_0= ruleEString ) ) ) )
            // InternalConfigDslTextual.g:601:2: ( () otherlv_1= 'DynamicListItem' ( (lv_Name_2_0= ruleEString ) ) )
            {
            // InternalConfigDslTextual.g:601:2: ( () otherlv_1= 'DynamicListItem' ( (lv_Name_2_0= ruleEString ) ) )
            // InternalConfigDslTextual.g:602:3: () otherlv_1= 'DynamicListItem' ( (lv_Name_2_0= ruleEString ) )
            {
            // InternalConfigDslTextual.g:602:3: ()
            // InternalConfigDslTextual.g:603:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDynamicListItemAccess().getDynamicListItemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDynamicListItemAccess().getDynamicListItemKeyword_1());
            		
            // InternalConfigDslTextual.g:613:3: ( (lv_Name_2_0= ruleEString ) )
            // InternalConfigDslTextual.g:614:4: (lv_Name_2_0= ruleEString )
            {
            // InternalConfigDslTextual.g:614:4: (lv_Name_2_0= ruleEString )
            // InternalConfigDslTextual.g:615:5: lv_Name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDynamicListItemAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_Name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDynamicListItemRule());
            					}
            					set(
            						current,
            						"Name",
            						lv_Name_2_0,
            						"zombie.incatch.configdsl.ConfigDslTextual.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleDynamicListItem"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});

}