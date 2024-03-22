package zombie.incatch.configdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import zombie.incatch.configdsl.services.ConfigDslTextualGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConfigDslTextualParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Config'", "'{'", "'project'", "'simpleStringFields'", "'}'", "','", "'dynamicListFields'", "'Project'", "'SimpleStringField'", "'Size'", "'DynamicListField'", "'dynamicListItems'", "'-'", "'DynamicListItem'", "'KeepClassification'", "'IsRequired'"
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

    	public void setGrammarAccess(ConfigDslTextualGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleConfig"
    // InternalConfigDslTextual.g:53:1: entryRuleConfig : ruleConfig EOF ;
    public final void entryRuleConfig() throws RecognitionException {
        try {
            // InternalConfigDslTextual.g:54:1: ( ruleConfig EOF )
            // InternalConfigDslTextual.g:55:1: ruleConfig EOF
            {
             before(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleConfig();

            state._fsp--;

             after(grammarAccess.getConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalConfigDslTextual.g:62:1: ruleConfig : ( ( rule__Config__Group__0 ) ) ;
    public final void ruleConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:66:2: ( ( ( rule__Config__Group__0 ) ) )
            // InternalConfigDslTextual.g:67:2: ( ( rule__Config__Group__0 ) )
            {
            // InternalConfigDslTextual.g:67:2: ( ( rule__Config__Group__0 ) )
            // InternalConfigDslTextual.g:68:3: ( rule__Config__Group__0 )
            {
             before(grammarAccess.getConfigAccess().getGroup()); 
            // InternalConfigDslTextual.g:69:3: ( rule__Config__Group__0 )
            // InternalConfigDslTextual.g:69:4: rule__Config__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleProject"
    // InternalConfigDslTextual.g:78:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalConfigDslTextual.g:79:1: ( ruleProject EOF )
            // InternalConfigDslTextual.g:80:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalConfigDslTextual.g:87:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:91:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalConfigDslTextual.g:92:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalConfigDslTextual.g:92:2: ( ( rule__Project__Group__0 ) )
            // InternalConfigDslTextual.g:93:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalConfigDslTextual.g:94:3: ( rule__Project__Group__0 )
            // InternalConfigDslTextual.g:94:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleSimpleStringField"
    // InternalConfigDslTextual.g:103:1: entryRuleSimpleStringField : ruleSimpleStringField EOF ;
    public final void entryRuleSimpleStringField() throws RecognitionException {
        try {
            // InternalConfigDslTextual.g:104:1: ( ruleSimpleStringField EOF )
            // InternalConfigDslTextual.g:105:1: ruleSimpleStringField EOF
            {
             before(grammarAccess.getSimpleStringFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleStringField();

            state._fsp--;

             after(grammarAccess.getSimpleStringFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleStringField"


    // $ANTLR start "ruleSimpleStringField"
    // InternalConfigDslTextual.g:112:1: ruleSimpleStringField : ( ( rule__SimpleStringField__Group__0 ) ) ;
    public final void ruleSimpleStringField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:116:2: ( ( ( rule__SimpleStringField__Group__0 ) ) )
            // InternalConfigDslTextual.g:117:2: ( ( rule__SimpleStringField__Group__0 ) )
            {
            // InternalConfigDslTextual.g:117:2: ( ( rule__SimpleStringField__Group__0 ) )
            // InternalConfigDslTextual.g:118:3: ( rule__SimpleStringField__Group__0 )
            {
             before(grammarAccess.getSimpleStringFieldAccess().getGroup()); 
            // InternalConfigDslTextual.g:119:3: ( rule__SimpleStringField__Group__0 )
            // InternalConfigDslTextual.g:119:4: rule__SimpleStringField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleStringField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleStringFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleStringField"


    // $ANTLR start "entryRuleDynamicListField"
    // InternalConfigDslTextual.g:128:1: entryRuleDynamicListField : ruleDynamicListField EOF ;
    public final void entryRuleDynamicListField() throws RecognitionException {
        try {
            // InternalConfigDslTextual.g:129:1: ( ruleDynamicListField EOF )
            // InternalConfigDslTextual.g:130:1: ruleDynamicListField EOF
            {
             before(grammarAccess.getDynamicListFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleDynamicListField();

            state._fsp--;

             after(grammarAccess.getDynamicListFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDynamicListField"


    // $ANTLR start "ruleDynamicListField"
    // InternalConfigDslTextual.g:137:1: ruleDynamicListField : ( ( rule__DynamicListField__Group__0 ) ) ;
    public final void ruleDynamicListField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:141:2: ( ( ( rule__DynamicListField__Group__0 ) ) )
            // InternalConfigDslTextual.g:142:2: ( ( rule__DynamicListField__Group__0 ) )
            {
            // InternalConfigDslTextual.g:142:2: ( ( rule__DynamicListField__Group__0 ) )
            // InternalConfigDslTextual.g:143:3: ( rule__DynamicListField__Group__0 )
            {
             before(grammarAccess.getDynamicListFieldAccess().getGroup()); 
            // InternalConfigDslTextual.g:144:3: ( rule__DynamicListField__Group__0 )
            // InternalConfigDslTextual.g:144:4: rule__DynamicListField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DynamicListField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDynamicListFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDynamicListField"


    // $ANTLR start "entryRuleEString"
    // InternalConfigDslTextual.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalConfigDslTextual.g:154:1: ( ruleEString EOF )
            // InternalConfigDslTextual.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalConfigDslTextual.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalConfigDslTextual.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalConfigDslTextual.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalConfigDslTextual.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalConfigDslTextual.g:169:3: ( rule__EString__Alternatives )
            // InternalConfigDslTextual.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalConfigDslTextual.g:178:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalConfigDslTextual.g:179:1: ( ruleEInt EOF )
            // InternalConfigDslTextual.g:180:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalConfigDslTextual.g:187:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:191:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalConfigDslTextual.g:192:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalConfigDslTextual.g:192:2: ( ( rule__EInt__Group__0 ) )
            // InternalConfigDslTextual.g:193:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalConfigDslTextual.g:194:3: ( rule__EInt__Group__0 )
            // InternalConfigDslTextual.g:194:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleDynamicListItem"
    // InternalConfigDslTextual.g:203:1: entryRuleDynamicListItem : ruleDynamicListItem EOF ;
    public final void entryRuleDynamicListItem() throws RecognitionException {
        try {
            // InternalConfigDslTextual.g:204:1: ( ruleDynamicListItem EOF )
            // InternalConfigDslTextual.g:205:1: ruleDynamicListItem EOF
            {
             before(grammarAccess.getDynamicListItemRule()); 
            pushFollow(FOLLOW_1);
            ruleDynamicListItem();

            state._fsp--;

             after(grammarAccess.getDynamicListItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDynamicListItem"


    // $ANTLR start "ruleDynamicListItem"
    // InternalConfigDslTextual.g:212:1: ruleDynamicListItem : ( ( rule__DynamicListItem__Group__0 ) ) ;
    public final void ruleDynamicListItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:216:2: ( ( ( rule__DynamicListItem__Group__0 ) ) )
            // InternalConfigDslTextual.g:217:2: ( ( rule__DynamicListItem__Group__0 ) )
            {
            // InternalConfigDslTextual.g:217:2: ( ( rule__DynamicListItem__Group__0 ) )
            // InternalConfigDslTextual.g:218:3: ( rule__DynamicListItem__Group__0 )
            {
             before(grammarAccess.getDynamicListItemAccess().getGroup()); 
            // InternalConfigDslTextual.g:219:3: ( rule__DynamicListItem__Group__0 )
            // InternalConfigDslTextual.g:219:4: rule__DynamicListItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DynamicListItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDynamicListItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDynamicListItem"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalConfigDslTextual.g:227:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:231:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalConfigDslTextual.g:232:2: ( RULE_STRING )
                    {
                    // InternalConfigDslTextual.g:232:2: ( RULE_STRING )
                    // InternalConfigDslTextual.g:233:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalConfigDslTextual.g:238:2: ( RULE_ID )
                    {
                    // InternalConfigDslTextual.g:238:2: ( RULE_ID )
                    // InternalConfigDslTextual.g:239:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Config__Group__0"
    // InternalConfigDslTextual.g:248:1: rule__Config__Group__0 : rule__Config__Group__0__Impl rule__Config__Group__1 ;
    public final void rule__Config__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:252:1: ( rule__Config__Group__0__Impl rule__Config__Group__1 )
            // InternalConfigDslTextual.g:253:2: rule__Config__Group__0__Impl rule__Config__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Config__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0"


    // $ANTLR start "rule__Config__Group__0__Impl"
    // InternalConfigDslTextual.g:260:1: rule__Config__Group__0__Impl : ( 'Config' ) ;
    public final void rule__Config__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:264:1: ( ( 'Config' ) )
            // InternalConfigDslTextual.g:265:1: ( 'Config' )
            {
            // InternalConfigDslTextual.g:265:1: ( 'Config' )
            // InternalConfigDslTextual.g:266:2: 'Config'
            {
             before(grammarAccess.getConfigAccess().getConfigKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__0__Impl"


    // $ANTLR start "rule__Config__Group__1"
    // InternalConfigDslTextual.g:275:1: rule__Config__Group__1 : rule__Config__Group__1__Impl rule__Config__Group__2 ;
    public final void rule__Config__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:279:1: ( rule__Config__Group__1__Impl rule__Config__Group__2 )
            // InternalConfigDslTextual.g:280:2: rule__Config__Group__1__Impl rule__Config__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Config__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1"


    // $ANTLR start "rule__Config__Group__1__Impl"
    // InternalConfigDslTextual.g:287:1: rule__Config__Group__1__Impl : ( '{' ) ;
    public final void rule__Config__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:291:1: ( ( '{' ) )
            // InternalConfigDslTextual.g:292:1: ( '{' )
            {
            // InternalConfigDslTextual.g:292:1: ( '{' )
            // InternalConfigDslTextual.g:293:2: '{'
            {
             before(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__1__Impl"


    // $ANTLR start "rule__Config__Group__2"
    // InternalConfigDslTextual.g:302:1: rule__Config__Group__2 : rule__Config__Group__2__Impl rule__Config__Group__3 ;
    public final void rule__Config__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:306:1: ( rule__Config__Group__2__Impl rule__Config__Group__3 )
            // InternalConfigDslTextual.g:307:2: rule__Config__Group__2__Impl rule__Config__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Config__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2"


    // $ANTLR start "rule__Config__Group__2__Impl"
    // InternalConfigDslTextual.g:314:1: rule__Config__Group__2__Impl : ( 'project' ) ;
    public final void rule__Config__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:318:1: ( ( 'project' ) )
            // InternalConfigDslTextual.g:319:1: ( 'project' )
            {
            // InternalConfigDslTextual.g:319:1: ( 'project' )
            // InternalConfigDslTextual.g:320:2: 'project'
            {
             before(grammarAccess.getConfigAccess().getProjectKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getProjectKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__2__Impl"


    // $ANTLR start "rule__Config__Group__3"
    // InternalConfigDslTextual.g:329:1: rule__Config__Group__3 : rule__Config__Group__3__Impl rule__Config__Group__4 ;
    public final void rule__Config__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:333:1: ( rule__Config__Group__3__Impl rule__Config__Group__4 )
            // InternalConfigDslTextual.g:334:2: rule__Config__Group__3__Impl rule__Config__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Config__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3"


    // $ANTLR start "rule__Config__Group__3__Impl"
    // InternalConfigDslTextual.g:341:1: rule__Config__Group__3__Impl : ( ( rule__Config__ProjectAssignment_3 ) ) ;
    public final void rule__Config__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:345:1: ( ( ( rule__Config__ProjectAssignment_3 ) ) )
            // InternalConfigDslTextual.g:346:1: ( ( rule__Config__ProjectAssignment_3 ) )
            {
            // InternalConfigDslTextual.g:346:1: ( ( rule__Config__ProjectAssignment_3 ) )
            // InternalConfigDslTextual.g:347:2: ( rule__Config__ProjectAssignment_3 )
            {
             before(grammarAccess.getConfigAccess().getProjectAssignment_3()); 
            // InternalConfigDslTextual.g:348:2: ( rule__Config__ProjectAssignment_3 )
            // InternalConfigDslTextual.g:348:3: rule__Config__ProjectAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Config__ProjectAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getProjectAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__3__Impl"


    // $ANTLR start "rule__Config__Group__4"
    // InternalConfigDslTextual.g:356:1: rule__Config__Group__4 : rule__Config__Group__4__Impl rule__Config__Group__5 ;
    public final void rule__Config__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:360:1: ( rule__Config__Group__4__Impl rule__Config__Group__5 )
            // InternalConfigDslTextual.g:361:2: rule__Config__Group__4__Impl rule__Config__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Config__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__4"


    // $ANTLR start "rule__Config__Group__4__Impl"
    // InternalConfigDslTextual.g:368:1: rule__Config__Group__4__Impl : ( 'simpleStringFields' ) ;
    public final void rule__Config__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:372:1: ( ( 'simpleStringFields' ) )
            // InternalConfigDslTextual.g:373:1: ( 'simpleStringFields' )
            {
            // InternalConfigDslTextual.g:373:1: ( 'simpleStringFields' )
            // InternalConfigDslTextual.g:374:2: 'simpleStringFields'
            {
             before(grammarAccess.getConfigAccess().getSimpleStringFieldsKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getSimpleStringFieldsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__4__Impl"


    // $ANTLR start "rule__Config__Group__5"
    // InternalConfigDslTextual.g:383:1: rule__Config__Group__5 : rule__Config__Group__5__Impl rule__Config__Group__6 ;
    public final void rule__Config__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:387:1: ( rule__Config__Group__5__Impl rule__Config__Group__6 )
            // InternalConfigDslTextual.g:388:2: rule__Config__Group__5__Impl rule__Config__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Config__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__5"


    // $ANTLR start "rule__Config__Group__5__Impl"
    // InternalConfigDslTextual.g:395:1: rule__Config__Group__5__Impl : ( '{' ) ;
    public final void rule__Config__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:399:1: ( ( '{' ) )
            // InternalConfigDslTextual.g:400:1: ( '{' )
            {
            // InternalConfigDslTextual.g:400:1: ( '{' )
            // InternalConfigDslTextual.g:401:2: '{'
            {
             before(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__5__Impl"


    // $ANTLR start "rule__Config__Group__6"
    // InternalConfigDslTextual.g:410:1: rule__Config__Group__6 : rule__Config__Group__6__Impl rule__Config__Group__7 ;
    public final void rule__Config__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:414:1: ( rule__Config__Group__6__Impl rule__Config__Group__7 )
            // InternalConfigDslTextual.g:415:2: rule__Config__Group__6__Impl rule__Config__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Config__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__6"


    // $ANTLR start "rule__Config__Group__6__Impl"
    // InternalConfigDslTextual.g:422:1: rule__Config__Group__6__Impl : ( ( rule__Config__SimpleStringFieldsAssignment_6 ) ) ;
    public final void rule__Config__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:426:1: ( ( ( rule__Config__SimpleStringFieldsAssignment_6 ) ) )
            // InternalConfigDslTextual.g:427:1: ( ( rule__Config__SimpleStringFieldsAssignment_6 ) )
            {
            // InternalConfigDslTextual.g:427:1: ( ( rule__Config__SimpleStringFieldsAssignment_6 ) )
            // InternalConfigDslTextual.g:428:2: ( rule__Config__SimpleStringFieldsAssignment_6 )
            {
             before(grammarAccess.getConfigAccess().getSimpleStringFieldsAssignment_6()); 
            // InternalConfigDslTextual.g:429:2: ( rule__Config__SimpleStringFieldsAssignment_6 )
            // InternalConfigDslTextual.g:429:3: rule__Config__SimpleStringFieldsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Config__SimpleStringFieldsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getSimpleStringFieldsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__6__Impl"


    // $ANTLR start "rule__Config__Group__7"
    // InternalConfigDslTextual.g:437:1: rule__Config__Group__7 : rule__Config__Group__7__Impl rule__Config__Group__8 ;
    public final void rule__Config__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:441:1: ( rule__Config__Group__7__Impl rule__Config__Group__8 )
            // InternalConfigDslTextual.g:442:2: rule__Config__Group__7__Impl rule__Config__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Config__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__7"


    // $ANTLR start "rule__Config__Group__7__Impl"
    // InternalConfigDslTextual.g:449:1: rule__Config__Group__7__Impl : ( ( rule__Config__Group_7__0 )* ) ;
    public final void rule__Config__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:453:1: ( ( ( rule__Config__Group_7__0 )* ) )
            // InternalConfigDslTextual.g:454:1: ( ( rule__Config__Group_7__0 )* )
            {
            // InternalConfigDslTextual.g:454:1: ( ( rule__Config__Group_7__0 )* )
            // InternalConfigDslTextual.g:455:2: ( rule__Config__Group_7__0 )*
            {
             before(grammarAccess.getConfigAccess().getGroup_7()); 
            // InternalConfigDslTextual.g:456:2: ( rule__Config__Group_7__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalConfigDslTextual.g:456:3: rule__Config__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Config__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getConfigAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__7__Impl"


    // $ANTLR start "rule__Config__Group__8"
    // InternalConfigDslTextual.g:464:1: rule__Config__Group__8 : rule__Config__Group__8__Impl rule__Config__Group__9 ;
    public final void rule__Config__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:468:1: ( rule__Config__Group__8__Impl rule__Config__Group__9 )
            // InternalConfigDslTextual.g:469:2: rule__Config__Group__8__Impl rule__Config__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Config__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__8"


    // $ANTLR start "rule__Config__Group__8__Impl"
    // InternalConfigDslTextual.g:476:1: rule__Config__Group__8__Impl : ( '}' ) ;
    public final void rule__Config__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:480:1: ( ( '}' ) )
            // InternalConfigDslTextual.g:481:1: ( '}' )
            {
            // InternalConfigDslTextual.g:481:1: ( '}' )
            // InternalConfigDslTextual.g:482:2: '}'
            {
             before(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__8__Impl"


    // $ANTLR start "rule__Config__Group__9"
    // InternalConfigDslTextual.g:491:1: rule__Config__Group__9 : rule__Config__Group__9__Impl rule__Config__Group__10 ;
    public final void rule__Config__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:495:1: ( rule__Config__Group__9__Impl rule__Config__Group__10 )
            // InternalConfigDslTextual.g:496:2: rule__Config__Group__9__Impl rule__Config__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Config__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__9"


    // $ANTLR start "rule__Config__Group__9__Impl"
    // InternalConfigDslTextual.g:503:1: rule__Config__Group__9__Impl : ( ( rule__Config__Group_9__0 )? ) ;
    public final void rule__Config__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:507:1: ( ( ( rule__Config__Group_9__0 )? ) )
            // InternalConfigDslTextual.g:508:1: ( ( rule__Config__Group_9__0 )? )
            {
            // InternalConfigDslTextual.g:508:1: ( ( rule__Config__Group_9__0 )? )
            // InternalConfigDslTextual.g:509:2: ( rule__Config__Group_9__0 )?
            {
             before(grammarAccess.getConfigAccess().getGroup_9()); 
            // InternalConfigDslTextual.g:510:2: ( rule__Config__Group_9__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalConfigDslTextual.g:510:3: rule__Config__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Config__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfigAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__9__Impl"


    // $ANTLR start "rule__Config__Group__10"
    // InternalConfigDslTextual.g:518:1: rule__Config__Group__10 : rule__Config__Group__10__Impl ;
    public final void rule__Config__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:522:1: ( rule__Config__Group__10__Impl )
            // InternalConfigDslTextual.g:523:2: rule__Config__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__10"


    // $ANTLR start "rule__Config__Group__10__Impl"
    // InternalConfigDslTextual.g:529:1: rule__Config__Group__10__Impl : ( '}' ) ;
    public final void rule__Config__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:533:1: ( ( '}' ) )
            // InternalConfigDslTextual.g:534:1: ( '}' )
            {
            // InternalConfigDslTextual.g:534:1: ( '}' )
            // InternalConfigDslTextual.g:535:2: '}'
            {
             before(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_10()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group__10__Impl"


    // $ANTLR start "rule__Config__Group_7__0"
    // InternalConfigDslTextual.g:545:1: rule__Config__Group_7__0 : rule__Config__Group_7__0__Impl rule__Config__Group_7__1 ;
    public final void rule__Config__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:549:1: ( rule__Config__Group_7__0__Impl rule__Config__Group_7__1 )
            // InternalConfigDslTextual.g:550:2: rule__Config__Group_7__0__Impl rule__Config__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Config__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_7__0"


    // $ANTLR start "rule__Config__Group_7__0__Impl"
    // InternalConfigDslTextual.g:557:1: rule__Config__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Config__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:561:1: ( ( ',' ) )
            // InternalConfigDslTextual.g:562:1: ( ',' )
            {
            // InternalConfigDslTextual.g:562:1: ( ',' )
            // InternalConfigDslTextual.g:563:2: ','
            {
             before(grammarAccess.getConfigAccess().getCommaKeyword_7_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_7__0__Impl"


    // $ANTLR start "rule__Config__Group_7__1"
    // InternalConfigDslTextual.g:572:1: rule__Config__Group_7__1 : rule__Config__Group_7__1__Impl ;
    public final void rule__Config__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:576:1: ( rule__Config__Group_7__1__Impl )
            // InternalConfigDslTextual.g:577:2: rule__Config__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_7__1"


    // $ANTLR start "rule__Config__Group_7__1__Impl"
    // InternalConfigDslTextual.g:583:1: rule__Config__Group_7__1__Impl : ( ( rule__Config__SimpleStringFieldsAssignment_7_1 ) ) ;
    public final void rule__Config__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:587:1: ( ( ( rule__Config__SimpleStringFieldsAssignment_7_1 ) ) )
            // InternalConfigDslTextual.g:588:1: ( ( rule__Config__SimpleStringFieldsAssignment_7_1 ) )
            {
            // InternalConfigDslTextual.g:588:1: ( ( rule__Config__SimpleStringFieldsAssignment_7_1 ) )
            // InternalConfigDslTextual.g:589:2: ( rule__Config__SimpleStringFieldsAssignment_7_1 )
            {
             before(grammarAccess.getConfigAccess().getSimpleStringFieldsAssignment_7_1()); 
            // InternalConfigDslTextual.g:590:2: ( rule__Config__SimpleStringFieldsAssignment_7_1 )
            // InternalConfigDslTextual.g:590:3: rule__Config__SimpleStringFieldsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Config__SimpleStringFieldsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getSimpleStringFieldsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_7__1__Impl"


    // $ANTLR start "rule__Config__Group_9__0"
    // InternalConfigDslTextual.g:599:1: rule__Config__Group_9__0 : rule__Config__Group_9__0__Impl rule__Config__Group_9__1 ;
    public final void rule__Config__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:603:1: ( rule__Config__Group_9__0__Impl rule__Config__Group_9__1 )
            // InternalConfigDslTextual.g:604:2: rule__Config__Group_9__0__Impl rule__Config__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__Config__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_9__0"


    // $ANTLR start "rule__Config__Group_9__0__Impl"
    // InternalConfigDslTextual.g:611:1: rule__Config__Group_9__0__Impl : ( 'dynamicListFields' ) ;
    public final void rule__Config__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:615:1: ( ( 'dynamicListFields' ) )
            // InternalConfigDslTextual.g:616:1: ( 'dynamicListFields' )
            {
            // InternalConfigDslTextual.g:616:1: ( 'dynamicListFields' )
            // InternalConfigDslTextual.g:617:2: 'dynamicListFields'
            {
             before(grammarAccess.getConfigAccess().getDynamicListFieldsKeyword_9_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getDynamicListFieldsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_9__0__Impl"


    // $ANTLR start "rule__Config__Group_9__1"
    // InternalConfigDslTextual.g:626:1: rule__Config__Group_9__1 : rule__Config__Group_9__1__Impl rule__Config__Group_9__2 ;
    public final void rule__Config__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:630:1: ( rule__Config__Group_9__1__Impl rule__Config__Group_9__2 )
            // InternalConfigDslTextual.g:631:2: rule__Config__Group_9__1__Impl rule__Config__Group_9__2
            {
            pushFollow(FOLLOW_11);
            rule__Config__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_9__1"


    // $ANTLR start "rule__Config__Group_9__1__Impl"
    // InternalConfigDslTextual.g:638:1: rule__Config__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Config__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:642:1: ( ( '{' ) )
            // InternalConfigDslTextual.g:643:1: ( '{' )
            {
            // InternalConfigDslTextual.g:643:1: ( '{' )
            // InternalConfigDslTextual.g:644:2: '{'
            {
             before(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_9__1__Impl"


    // $ANTLR start "rule__Config__Group_9__2"
    // InternalConfigDslTextual.g:653:1: rule__Config__Group_9__2 : rule__Config__Group_9__2__Impl rule__Config__Group_9__3 ;
    public final void rule__Config__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:657:1: ( rule__Config__Group_9__2__Impl rule__Config__Group_9__3 )
            // InternalConfigDslTextual.g:658:2: rule__Config__Group_9__2__Impl rule__Config__Group_9__3
            {
            pushFollow(FOLLOW_8);
            rule__Config__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_9__2"


    // $ANTLR start "rule__Config__Group_9__2__Impl"
    // InternalConfigDslTextual.g:665:1: rule__Config__Group_9__2__Impl : ( ( rule__Config__DynamicListFieldsAssignment_9_2 ) ) ;
    public final void rule__Config__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:669:1: ( ( ( rule__Config__DynamicListFieldsAssignment_9_2 ) ) )
            // InternalConfigDslTextual.g:670:1: ( ( rule__Config__DynamicListFieldsAssignment_9_2 ) )
            {
            // InternalConfigDslTextual.g:670:1: ( ( rule__Config__DynamicListFieldsAssignment_9_2 ) )
            // InternalConfigDslTextual.g:671:2: ( rule__Config__DynamicListFieldsAssignment_9_2 )
            {
             before(grammarAccess.getConfigAccess().getDynamicListFieldsAssignment_9_2()); 
            // InternalConfigDslTextual.g:672:2: ( rule__Config__DynamicListFieldsAssignment_9_2 )
            // InternalConfigDslTextual.g:672:3: rule__Config__DynamicListFieldsAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Config__DynamicListFieldsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getDynamicListFieldsAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_9__2__Impl"


    // $ANTLR start "rule__Config__Group_9__3"
    // InternalConfigDslTextual.g:680:1: rule__Config__Group_9__3 : rule__Config__Group_9__3__Impl rule__Config__Group_9__4 ;
    public final void rule__Config__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:684:1: ( rule__Config__Group_9__3__Impl rule__Config__Group_9__4 )
            // InternalConfigDslTextual.g:685:2: rule__Config__Group_9__3__Impl rule__Config__Group_9__4
            {
            pushFollow(FOLLOW_8);
            rule__Config__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_9__3"


    // $ANTLR start "rule__Config__Group_9__3__Impl"
    // InternalConfigDslTextual.g:692:1: rule__Config__Group_9__3__Impl : ( ( rule__Config__Group_9_3__0 )* ) ;
    public final void rule__Config__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:696:1: ( ( ( rule__Config__Group_9_3__0 )* ) )
            // InternalConfigDslTextual.g:697:1: ( ( rule__Config__Group_9_3__0 )* )
            {
            // InternalConfigDslTextual.g:697:1: ( ( rule__Config__Group_9_3__0 )* )
            // InternalConfigDslTextual.g:698:2: ( rule__Config__Group_9_3__0 )*
            {
             before(grammarAccess.getConfigAccess().getGroup_9_3()); 
            // InternalConfigDslTextual.g:699:2: ( rule__Config__Group_9_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalConfigDslTextual.g:699:3: rule__Config__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Config__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getConfigAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_9__3__Impl"


    // $ANTLR start "rule__Config__Group_9__4"
    // InternalConfigDslTextual.g:707:1: rule__Config__Group_9__4 : rule__Config__Group_9__4__Impl ;
    public final void rule__Config__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:711:1: ( rule__Config__Group_9__4__Impl )
            // InternalConfigDslTextual.g:712:2: rule__Config__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_9__4"


    // $ANTLR start "rule__Config__Group_9__4__Impl"
    // InternalConfigDslTextual.g:718:1: rule__Config__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Config__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:722:1: ( ( '}' ) )
            // InternalConfigDslTextual.g:723:1: ( '}' )
            {
            // InternalConfigDslTextual.g:723:1: ( '}' )
            // InternalConfigDslTextual.g:724:2: '}'
            {
             before(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_9__4__Impl"


    // $ANTLR start "rule__Config__Group_9_3__0"
    // InternalConfigDslTextual.g:734:1: rule__Config__Group_9_3__0 : rule__Config__Group_9_3__0__Impl rule__Config__Group_9_3__1 ;
    public final void rule__Config__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:738:1: ( rule__Config__Group_9_3__0__Impl rule__Config__Group_9_3__1 )
            // InternalConfigDslTextual.g:739:2: rule__Config__Group_9_3__0__Impl rule__Config__Group_9_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Config__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Config__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_9_3__0"


    // $ANTLR start "rule__Config__Group_9_3__0__Impl"
    // InternalConfigDslTextual.g:746:1: rule__Config__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Config__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:750:1: ( ( ',' ) )
            // InternalConfigDslTextual.g:751:1: ( ',' )
            {
            // InternalConfigDslTextual.g:751:1: ( ',' )
            // InternalConfigDslTextual.g:752:2: ','
            {
             before(grammarAccess.getConfigAccess().getCommaKeyword_9_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConfigAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_9_3__0__Impl"


    // $ANTLR start "rule__Config__Group_9_3__1"
    // InternalConfigDslTextual.g:761:1: rule__Config__Group_9_3__1 : rule__Config__Group_9_3__1__Impl ;
    public final void rule__Config__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:765:1: ( rule__Config__Group_9_3__1__Impl )
            // InternalConfigDslTextual.g:766:2: rule__Config__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Config__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_9_3__1"


    // $ANTLR start "rule__Config__Group_9_3__1__Impl"
    // InternalConfigDslTextual.g:772:1: rule__Config__Group_9_3__1__Impl : ( ( rule__Config__DynamicListFieldsAssignment_9_3_1 ) ) ;
    public final void rule__Config__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:776:1: ( ( ( rule__Config__DynamicListFieldsAssignment_9_3_1 ) ) )
            // InternalConfigDslTextual.g:777:1: ( ( rule__Config__DynamicListFieldsAssignment_9_3_1 ) )
            {
            // InternalConfigDslTextual.g:777:1: ( ( rule__Config__DynamicListFieldsAssignment_9_3_1 ) )
            // InternalConfigDslTextual.g:778:2: ( rule__Config__DynamicListFieldsAssignment_9_3_1 )
            {
             before(grammarAccess.getConfigAccess().getDynamicListFieldsAssignment_9_3_1()); 
            // InternalConfigDslTextual.g:779:2: ( rule__Config__DynamicListFieldsAssignment_9_3_1 )
            // InternalConfigDslTextual.g:779:3: rule__Config__DynamicListFieldsAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Config__DynamicListFieldsAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigAccess().getDynamicListFieldsAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__Group_9_3__1__Impl"


    // $ANTLR start "rule__Project__Group__0"
    // InternalConfigDslTextual.g:788:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:792:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalConfigDslTextual.g:793:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // InternalConfigDslTextual.g:800:1: rule__Project__Group__0__Impl : ( () ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:804:1: ( ( () ) )
            // InternalConfigDslTextual.g:805:1: ( () )
            {
            // InternalConfigDslTextual.g:805:1: ( () )
            // InternalConfigDslTextual.g:806:2: ()
            {
             before(grammarAccess.getProjectAccess().getProjectAction_0()); 
            // InternalConfigDslTextual.g:807:2: ()
            // InternalConfigDslTextual.g:807:3: 
            {
            }

             after(grammarAccess.getProjectAccess().getProjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalConfigDslTextual.g:815:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:819:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalConfigDslTextual.g:820:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // InternalConfigDslTextual.g:827:1: rule__Project__Group__1__Impl : ( ( rule__Project__KeepClassificationAssignment_1 )? ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:831:1: ( ( ( rule__Project__KeepClassificationAssignment_1 )? ) )
            // InternalConfigDslTextual.g:832:1: ( ( rule__Project__KeepClassificationAssignment_1 )? )
            {
            // InternalConfigDslTextual.g:832:1: ( ( rule__Project__KeepClassificationAssignment_1 )? )
            // InternalConfigDslTextual.g:833:2: ( rule__Project__KeepClassificationAssignment_1 )?
            {
             before(grammarAccess.getProjectAccess().getKeepClassificationAssignment_1()); 
            // InternalConfigDslTextual.g:834:2: ( rule__Project__KeepClassificationAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalConfigDslTextual.g:834:3: rule__Project__KeepClassificationAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Project__KeepClassificationAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getKeepClassificationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // InternalConfigDslTextual.g:842:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:846:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalConfigDslTextual.g:847:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // InternalConfigDslTextual.g:854:1: rule__Project__Group__2__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:858:1: ( ( 'Project' ) )
            // InternalConfigDslTextual.g:859:1: ( 'Project' )
            {
            // InternalConfigDslTextual.g:859:1: ( 'Project' )
            // InternalConfigDslTextual.g:860:2: 'Project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // InternalConfigDslTextual.g:869:1: rule__Project__Group__3 : rule__Project__Group__3__Impl ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:873:1: ( rule__Project__Group__3__Impl )
            // InternalConfigDslTextual.g:874:2: rule__Project__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // InternalConfigDslTextual.g:880:1: rule__Project__Group__3__Impl : ( ( rule__Project__NameAssignment_3 ) ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:884:1: ( ( ( rule__Project__NameAssignment_3 ) ) )
            // InternalConfigDslTextual.g:885:1: ( ( rule__Project__NameAssignment_3 ) )
            {
            // InternalConfigDslTextual.g:885:1: ( ( rule__Project__NameAssignment_3 ) )
            // InternalConfigDslTextual.g:886:2: ( rule__Project__NameAssignment_3 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_3()); 
            // InternalConfigDslTextual.g:887:2: ( rule__Project__NameAssignment_3 )
            // InternalConfigDslTextual.g:887:3: rule__Project__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Project__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__SimpleStringField__Group__0"
    // InternalConfigDslTextual.g:896:1: rule__SimpleStringField__Group__0 : rule__SimpleStringField__Group__0__Impl rule__SimpleStringField__Group__1 ;
    public final void rule__SimpleStringField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:900:1: ( rule__SimpleStringField__Group__0__Impl rule__SimpleStringField__Group__1 )
            // InternalConfigDslTextual.g:901:2: rule__SimpleStringField__Group__0__Impl rule__SimpleStringField__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SimpleStringField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleStringField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group__0"


    // $ANTLR start "rule__SimpleStringField__Group__0__Impl"
    // InternalConfigDslTextual.g:908:1: rule__SimpleStringField__Group__0__Impl : ( () ) ;
    public final void rule__SimpleStringField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:912:1: ( ( () ) )
            // InternalConfigDslTextual.g:913:1: ( () )
            {
            // InternalConfigDslTextual.g:913:1: ( () )
            // InternalConfigDslTextual.g:914:2: ()
            {
             before(grammarAccess.getSimpleStringFieldAccess().getSimpleStringFieldAction_0()); 
            // InternalConfigDslTextual.g:915:2: ()
            // InternalConfigDslTextual.g:915:3: 
            {
            }

             after(grammarAccess.getSimpleStringFieldAccess().getSimpleStringFieldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group__0__Impl"


    // $ANTLR start "rule__SimpleStringField__Group__1"
    // InternalConfigDslTextual.g:923:1: rule__SimpleStringField__Group__1 : rule__SimpleStringField__Group__1__Impl rule__SimpleStringField__Group__2 ;
    public final void rule__SimpleStringField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:927:1: ( rule__SimpleStringField__Group__1__Impl rule__SimpleStringField__Group__2 )
            // InternalConfigDslTextual.g:928:2: rule__SimpleStringField__Group__1__Impl rule__SimpleStringField__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__SimpleStringField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleStringField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group__1"


    // $ANTLR start "rule__SimpleStringField__Group__1__Impl"
    // InternalConfigDslTextual.g:935:1: rule__SimpleStringField__Group__1__Impl : ( ( rule__SimpleStringField__IsRequiredAssignment_1 )? ) ;
    public final void rule__SimpleStringField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:939:1: ( ( ( rule__SimpleStringField__IsRequiredAssignment_1 )? ) )
            // InternalConfigDslTextual.g:940:1: ( ( rule__SimpleStringField__IsRequiredAssignment_1 )? )
            {
            // InternalConfigDslTextual.g:940:1: ( ( rule__SimpleStringField__IsRequiredAssignment_1 )? )
            // InternalConfigDslTextual.g:941:2: ( rule__SimpleStringField__IsRequiredAssignment_1 )?
            {
             before(grammarAccess.getSimpleStringFieldAccess().getIsRequiredAssignment_1()); 
            // InternalConfigDslTextual.g:942:2: ( rule__SimpleStringField__IsRequiredAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalConfigDslTextual.g:942:3: rule__SimpleStringField__IsRequiredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleStringField__IsRequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleStringFieldAccess().getIsRequiredAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group__1__Impl"


    // $ANTLR start "rule__SimpleStringField__Group__2"
    // InternalConfigDslTextual.g:950:1: rule__SimpleStringField__Group__2 : rule__SimpleStringField__Group__2__Impl rule__SimpleStringField__Group__3 ;
    public final void rule__SimpleStringField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:954:1: ( rule__SimpleStringField__Group__2__Impl rule__SimpleStringField__Group__3 )
            // InternalConfigDslTextual.g:955:2: rule__SimpleStringField__Group__2__Impl rule__SimpleStringField__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SimpleStringField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleStringField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group__2"


    // $ANTLR start "rule__SimpleStringField__Group__2__Impl"
    // InternalConfigDslTextual.g:962:1: rule__SimpleStringField__Group__2__Impl : ( 'SimpleStringField' ) ;
    public final void rule__SimpleStringField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:966:1: ( ( 'SimpleStringField' ) )
            // InternalConfigDslTextual.g:967:1: ( 'SimpleStringField' )
            {
            // InternalConfigDslTextual.g:967:1: ( 'SimpleStringField' )
            // InternalConfigDslTextual.g:968:2: 'SimpleStringField'
            {
             before(grammarAccess.getSimpleStringFieldAccess().getSimpleStringFieldKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSimpleStringFieldAccess().getSimpleStringFieldKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group__2__Impl"


    // $ANTLR start "rule__SimpleStringField__Group__3"
    // InternalConfigDslTextual.g:977:1: rule__SimpleStringField__Group__3 : rule__SimpleStringField__Group__3__Impl rule__SimpleStringField__Group__4 ;
    public final void rule__SimpleStringField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:981:1: ( rule__SimpleStringField__Group__3__Impl rule__SimpleStringField__Group__4 )
            // InternalConfigDslTextual.g:982:2: rule__SimpleStringField__Group__3__Impl rule__SimpleStringField__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__SimpleStringField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleStringField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group__3"


    // $ANTLR start "rule__SimpleStringField__Group__3__Impl"
    // InternalConfigDslTextual.g:989:1: rule__SimpleStringField__Group__3__Impl : ( ( rule__SimpleStringField__NameAssignment_3 ) ) ;
    public final void rule__SimpleStringField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:993:1: ( ( ( rule__SimpleStringField__NameAssignment_3 ) ) )
            // InternalConfigDslTextual.g:994:1: ( ( rule__SimpleStringField__NameAssignment_3 ) )
            {
            // InternalConfigDslTextual.g:994:1: ( ( rule__SimpleStringField__NameAssignment_3 ) )
            // InternalConfigDslTextual.g:995:2: ( rule__SimpleStringField__NameAssignment_3 )
            {
             before(grammarAccess.getSimpleStringFieldAccess().getNameAssignment_3()); 
            // InternalConfigDslTextual.g:996:2: ( rule__SimpleStringField__NameAssignment_3 )
            // InternalConfigDslTextual.g:996:3: rule__SimpleStringField__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SimpleStringField__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSimpleStringFieldAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group__3__Impl"


    // $ANTLR start "rule__SimpleStringField__Group__4"
    // InternalConfigDslTextual.g:1004:1: rule__SimpleStringField__Group__4 : rule__SimpleStringField__Group__4__Impl rule__SimpleStringField__Group__5 ;
    public final void rule__SimpleStringField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1008:1: ( rule__SimpleStringField__Group__4__Impl rule__SimpleStringField__Group__5 )
            // InternalConfigDslTextual.g:1009:2: rule__SimpleStringField__Group__4__Impl rule__SimpleStringField__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__SimpleStringField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleStringField__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group__4"


    // $ANTLR start "rule__SimpleStringField__Group__4__Impl"
    // InternalConfigDslTextual.g:1016:1: rule__SimpleStringField__Group__4__Impl : ( '{' ) ;
    public final void rule__SimpleStringField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1020:1: ( ( '{' ) )
            // InternalConfigDslTextual.g:1021:1: ( '{' )
            {
            // InternalConfigDslTextual.g:1021:1: ( '{' )
            // InternalConfigDslTextual.g:1022:2: '{'
            {
             before(grammarAccess.getSimpleStringFieldAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSimpleStringFieldAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group__4__Impl"


    // $ANTLR start "rule__SimpleStringField__Group__5"
    // InternalConfigDslTextual.g:1031:1: rule__SimpleStringField__Group__5 : rule__SimpleStringField__Group__5__Impl rule__SimpleStringField__Group__6 ;
    public final void rule__SimpleStringField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1035:1: ( rule__SimpleStringField__Group__5__Impl rule__SimpleStringField__Group__6 )
            // InternalConfigDslTextual.g:1036:2: rule__SimpleStringField__Group__5__Impl rule__SimpleStringField__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__SimpleStringField__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleStringField__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group__5"


    // $ANTLR start "rule__SimpleStringField__Group__5__Impl"
    // InternalConfigDslTextual.g:1043:1: rule__SimpleStringField__Group__5__Impl : ( ( rule__SimpleStringField__Group_5__0 )? ) ;
    public final void rule__SimpleStringField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1047:1: ( ( ( rule__SimpleStringField__Group_5__0 )? ) )
            // InternalConfigDslTextual.g:1048:1: ( ( rule__SimpleStringField__Group_5__0 )? )
            {
            // InternalConfigDslTextual.g:1048:1: ( ( rule__SimpleStringField__Group_5__0 )? )
            // InternalConfigDslTextual.g:1049:2: ( rule__SimpleStringField__Group_5__0 )?
            {
             before(grammarAccess.getSimpleStringFieldAccess().getGroup_5()); 
            // InternalConfigDslTextual.g:1050:2: ( rule__SimpleStringField__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalConfigDslTextual.g:1050:3: rule__SimpleStringField__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleStringField__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleStringFieldAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group__5__Impl"


    // $ANTLR start "rule__SimpleStringField__Group__6"
    // InternalConfigDslTextual.g:1058:1: rule__SimpleStringField__Group__6 : rule__SimpleStringField__Group__6__Impl ;
    public final void rule__SimpleStringField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1062:1: ( rule__SimpleStringField__Group__6__Impl )
            // InternalConfigDslTextual.g:1063:2: rule__SimpleStringField__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleStringField__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group__6"


    // $ANTLR start "rule__SimpleStringField__Group__6__Impl"
    // InternalConfigDslTextual.g:1069:1: rule__SimpleStringField__Group__6__Impl : ( '}' ) ;
    public final void rule__SimpleStringField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1073:1: ( ( '}' ) )
            // InternalConfigDslTextual.g:1074:1: ( '}' )
            {
            // InternalConfigDslTextual.g:1074:1: ( '}' )
            // InternalConfigDslTextual.g:1075:2: '}'
            {
             before(grammarAccess.getSimpleStringFieldAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSimpleStringFieldAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group__6__Impl"


    // $ANTLR start "rule__SimpleStringField__Group_5__0"
    // InternalConfigDslTextual.g:1085:1: rule__SimpleStringField__Group_5__0 : rule__SimpleStringField__Group_5__0__Impl rule__SimpleStringField__Group_5__1 ;
    public final void rule__SimpleStringField__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1089:1: ( rule__SimpleStringField__Group_5__0__Impl rule__SimpleStringField__Group_5__1 )
            // InternalConfigDslTextual.g:1090:2: rule__SimpleStringField__Group_5__0__Impl rule__SimpleStringField__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__SimpleStringField__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleStringField__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group_5__0"


    // $ANTLR start "rule__SimpleStringField__Group_5__0__Impl"
    // InternalConfigDslTextual.g:1097:1: rule__SimpleStringField__Group_5__0__Impl : ( 'Size' ) ;
    public final void rule__SimpleStringField__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1101:1: ( ( 'Size' ) )
            // InternalConfigDslTextual.g:1102:1: ( 'Size' )
            {
            // InternalConfigDslTextual.g:1102:1: ( 'Size' )
            // InternalConfigDslTextual.g:1103:2: 'Size'
            {
             before(grammarAccess.getSimpleStringFieldAccess().getSizeKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSimpleStringFieldAccess().getSizeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group_5__0__Impl"


    // $ANTLR start "rule__SimpleStringField__Group_5__1"
    // InternalConfigDslTextual.g:1112:1: rule__SimpleStringField__Group_5__1 : rule__SimpleStringField__Group_5__1__Impl ;
    public final void rule__SimpleStringField__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1116:1: ( rule__SimpleStringField__Group_5__1__Impl )
            // InternalConfigDslTextual.g:1117:2: rule__SimpleStringField__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleStringField__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group_5__1"


    // $ANTLR start "rule__SimpleStringField__Group_5__1__Impl"
    // InternalConfigDslTextual.g:1123:1: rule__SimpleStringField__Group_5__1__Impl : ( ( rule__SimpleStringField__SizeAssignment_5_1 ) ) ;
    public final void rule__SimpleStringField__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1127:1: ( ( ( rule__SimpleStringField__SizeAssignment_5_1 ) ) )
            // InternalConfigDslTextual.g:1128:1: ( ( rule__SimpleStringField__SizeAssignment_5_1 ) )
            {
            // InternalConfigDslTextual.g:1128:1: ( ( rule__SimpleStringField__SizeAssignment_5_1 ) )
            // InternalConfigDslTextual.g:1129:2: ( rule__SimpleStringField__SizeAssignment_5_1 )
            {
             before(grammarAccess.getSimpleStringFieldAccess().getSizeAssignment_5_1()); 
            // InternalConfigDslTextual.g:1130:2: ( rule__SimpleStringField__SizeAssignment_5_1 )
            // InternalConfigDslTextual.g:1130:3: rule__SimpleStringField__SizeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleStringField__SizeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleStringFieldAccess().getSizeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__Group_5__1__Impl"


    // $ANTLR start "rule__DynamicListField__Group__0"
    // InternalConfigDslTextual.g:1139:1: rule__DynamicListField__Group__0 : rule__DynamicListField__Group__0__Impl rule__DynamicListField__Group__1 ;
    public final void rule__DynamicListField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1143:1: ( rule__DynamicListField__Group__0__Impl rule__DynamicListField__Group__1 )
            // InternalConfigDslTextual.g:1144:2: rule__DynamicListField__Group__0__Impl rule__DynamicListField__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DynamicListField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicListField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group__0"


    // $ANTLR start "rule__DynamicListField__Group__0__Impl"
    // InternalConfigDslTextual.g:1151:1: rule__DynamicListField__Group__0__Impl : ( () ) ;
    public final void rule__DynamicListField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1155:1: ( ( () ) )
            // InternalConfigDslTextual.g:1156:1: ( () )
            {
            // InternalConfigDslTextual.g:1156:1: ( () )
            // InternalConfigDslTextual.g:1157:2: ()
            {
             before(grammarAccess.getDynamicListFieldAccess().getDynamicListFieldAction_0()); 
            // InternalConfigDslTextual.g:1158:2: ()
            // InternalConfigDslTextual.g:1158:3: 
            {
            }

             after(grammarAccess.getDynamicListFieldAccess().getDynamicListFieldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group__0__Impl"


    // $ANTLR start "rule__DynamicListField__Group__1"
    // InternalConfigDslTextual.g:1166:1: rule__DynamicListField__Group__1 : rule__DynamicListField__Group__1__Impl rule__DynamicListField__Group__2 ;
    public final void rule__DynamicListField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1170:1: ( rule__DynamicListField__Group__1__Impl rule__DynamicListField__Group__2 )
            // InternalConfigDslTextual.g:1171:2: rule__DynamicListField__Group__1__Impl rule__DynamicListField__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DynamicListField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicListField__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group__1"


    // $ANTLR start "rule__DynamicListField__Group__1__Impl"
    // InternalConfigDslTextual.g:1178:1: rule__DynamicListField__Group__1__Impl : ( ( rule__DynamicListField__IsRequiredAssignment_1 )? ) ;
    public final void rule__DynamicListField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1182:1: ( ( ( rule__DynamicListField__IsRequiredAssignment_1 )? ) )
            // InternalConfigDslTextual.g:1183:1: ( ( rule__DynamicListField__IsRequiredAssignment_1 )? )
            {
            // InternalConfigDslTextual.g:1183:1: ( ( rule__DynamicListField__IsRequiredAssignment_1 )? )
            // InternalConfigDslTextual.g:1184:2: ( rule__DynamicListField__IsRequiredAssignment_1 )?
            {
             before(grammarAccess.getDynamicListFieldAccess().getIsRequiredAssignment_1()); 
            // InternalConfigDslTextual.g:1185:2: ( rule__DynamicListField__IsRequiredAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalConfigDslTextual.g:1185:3: rule__DynamicListField__IsRequiredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DynamicListField__IsRequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicListFieldAccess().getIsRequiredAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group__1__Impl"


    // $ANTLR start "rule__DynamicListField__Group__2"
    // InternalConfigDslTextual.g:1193:1: rule__DynamicListField__Group__2 : rule__DynamicListField__Group__2__Impl rule__DynamicListField__Group__3 ;
    public final void rule__DynamicListField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1197:1: ( rule__DynamicListField__Group__2__Impl rule__DynamicListField__Group__3 )
            // InternalConfigDslTextual.g:1198:2: rule__DynamicListField__Group__2__Impl rule__DynamicListField__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__DynamicListField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicListField__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group__2"


    // $ANTLR start "rule__DynamicListField__Group__2__Impl"
    // InternalConfigDslTextual.g:1205:1: rule__DynamicListField__Group__2__Impl : ( 'DynamicListField' ) ;
    public final void rule__DynamicListField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1209:1: ( ( 'DynamicListField' ) )
            // InternalConfigDslTextual.g:1210:1: ( 'DynamicListField' )
            {
            // InternalConfigDslTextual.g:1210:1: ( 'DynamicListField' )
            // InternalConfigDslTextual.g:1211:2: 'DynamicListField'
            {
             before(grammarAccess.getDynamicListFieldAccess().getDynamicListFieldKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDynamicListFieldAccess().getDynamicListFieldKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group__2__Impl"


    // $ANTLR start "rule__DynamicListField__Group__3"
    // InternalConfigDslTextual.g:1220:1: rule__DynamicListField__Group__3 : rule__DynamicListField__Group__3__Impl rule__DynamicListField__Group__4 ;
    public final void rule__DynamicListField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1224:1: ( rule__DynamicListField__Group__3__Impl rule__DynamicListField__Group__4 )
            // InternalConfigDslTextual.g:1225:2: rule__DynamicListField__Group__3__Impl rule__DynamicListField__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__DynamicListField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicListField__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group__3"


    // $ANTLR start "rule__DynamicListField__Group__3__Impl"
    // InternalConfigDslTextual.g:1232:1: rule__DynamicListField__Group__3__Impl : ( ( rule__DynamicListField__NameAssignment_3 ) ) ;
    public final void rule__DynamicListField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1236:1: ( ( ( rule__DynamicListField__NameAssignment_3 ) ) )
            // InternalConfigDslTextual.g:1237:1: ( ( rule__DynamicListField__NameAssignment_3 ) )
            {
            // InternalConfigDslTextual.g:1237:1: ( ( rule__DynamicListField__NameAssignment_3 ) )
            // InternalConfigDslTextual.g:1238:2: ( rule__DynamicListField__NameAssignment_3 )
            {
             before(grammarAccess.getDynamicListFieldAccess().getNameAssignment_3()); 
            // InternalConfigDslTextual.g:1239:2: ( rule__DynamicListField__NameAssignment_3 )
            // InternalConfigDslTextual.g:1239:3: rule__DynamicListField__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DynamicListField__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDynamicListFieldAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group__3__Impl"


    // $ANTLR start "rule__DynamicListField__Group__4"
    // InternalConfigDslTextual.g:1247:1: rule__DynamicListField__Group__4 : rule__DynamicListField__Group__4__Impl rule__DynamicListField__Group__5 ;
    public final void rule__DynamicListField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1251:1: ( rule__DynamicListField__Group__4__Impl rule__DynamicListField__Group__5 )
            // InternalConfigDslTextual.g:1252:2: rule__DynamicListField__Group__4__Impl rule__DynamicListField__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__DynamicListField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicListField__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group__4"


    // $ANTLR start "rule__DynamicListField__Group__4__Impl"
    // InternalConfigDslTextual.g:1259:1: rule__DynamicListField__Group__4__Impl : ( '{' ) ;
    public final void rule__DynamicListField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1263:1: ( ( '{' ) )
            // InternalConfigDslTextual.g:1264:1: ( '{' )
            {
            // InternalConfigDslTextual.g:1264:1: ( '{' )
            // InternalConfigDslTextual.g:1265:2: '{'
            {
             before(grammarAccess.getDynamicListFieldAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDynamicListFieldAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group__4__Impl"


    // $ANTLR start "rule__DynamicListField__Group__5"
    // InternalConfigDslTextual.g:1274:1: rule__DynamicListField__Group__5 : rule__DynamicListField__Group__5__Impl rule__DynamicListField__Group__6 ;
    public final void rule__DynamicListField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1278:1: ( rule__DynamicListField__Group__5__Impl rule__DynamicListField__Group__6 )
            // InternalConfigDslTextual.g:1279:2: rule__DynamicListField__Group__5__Impl rule__DynamicListField__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__DynamicListField__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicListField__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group__5"


    // $ANTLR start "rule__DynamicListField__Group__5__Impl"
    // InternalConfigDslTextual.g:1286:1: rule__DynamicListField__Group__5__Impl : ( ( rule__DynamicListField__Group_5__0 )? ) ;
    public final void rule__DynamicListField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1290:1: ( ( ( rule__DynamicListField__Group_5__0 )? ) )
            // InternalConfigDslTextual.g:1291:1: ( ( rule__DynamicListField__Group_5__0 )? )
            {
            // InternalConfigDslTextual.g:1291:1: ( ( rule__DynamicListField__Group_5__0 )? )
            // InternalConfigDslTextual.g:1292:2: ( rule__DynamicListField__Group_5__0 )?
            {
             before(grammarAccess.getDynamicListFieldAccess().getGroup_5()); 
            // InternalConfigDslTextual.g:1293:2: ( rule__DynamicListField__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalConfigDslTextual.g:1293:3: rule__DynamicListField__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DynamicListField__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicListFieldAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group__5__Impl"


    // $ANTLR start "rule__DynamicListField__Group__6"
    // InternalConfigDslTextual.g:1301:1: rule__DynamicListField__Group__6 : rule__DynamicListField__Group__6__Impl ;
    public final void rule__DynamicListField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1305:1: ( rule__DynamicListField__Group__6__Impl )
            // InternalConfigDslTextual.g:1306:2: rule__DynamicListField__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DynamicListField__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group__6"


    // $ANTLR start "rule__DynamicListField__Group__6__Impl"
    // InternalConfigDslTextual.g:1312:1: rule__DynamicListField__Group__6__Impl : ( '}' ) ;
    public final void rule__DynamicListField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1316:1: ( ( '}' ) )
            // InternalConfigDslTextual.g:1317:1: ( '}' )
            {
            // InternalConfigDslTextual.g:1317:1: ( '}' )
            // InternalConfigDslTextual.g:1318:2: '}'
            {
             before(grammarAccess.getDynamicListFieldAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDynamicListFieldAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group__6__Impl"


    // $ANTLR start "rule__DynamicListField__Group_5__0"
    // InternalConfigDslTextual.g:1328:1: rule__DynamicListField__Group_5__0 : rule__DynamicListField__Group_5__0__Impl rule__DynamicListField__Group_5__1 ;
    public final void rule__DynamicListField__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1332:1: ( rule__DynamicListField__Group_5__0__Impl rule__DynamicListField__Group_5__1 )
            // InternalConfigDslTextual.g:1333:2: rule__DynamicListField__Group_5__0__Impl rule__DynamicListField__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__DynamicListField__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicListField__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group_5__0"


    // $ANTLR start "rule__DynamicListField__Group_5__0__Impl"
    // InternalConfigDslTextual.g:1340:1: rule__DynamicListField__Group_5__0__Impl : ( 'dynamicListItems' ) ;
    public final void rule__DynamicListField__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1344:1: ( ( 'dynamicListItems' ) )
            // InternalConfigDslTextual.g:1345:1: ( 'dynamicListItems' )
            {
            // InternalConfigDslTextual.g:1345:1: ( 'dynamicListItems' )
            // InternalConfigDslTextual.g:1346:2: 'dynamicListItems'
            {
             before(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group_5__0__Impl"


    // $ANTLR start "rule__DynamicListField__Group_5__1"
    // InternalConfigDslTextual.g:1355:1: rule__DynamicListField__Group_5__1 : rule__DynamicListField__Group_5__1__Impl rule__DynamicListField__Group_5__2 ;
    public final void rule__DynamicListField__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1359:1: ( rule__DynamicListField__Group_5__1__Impl rule__DynamicListField__Group_5__2 )
            // InternalConfigDslTextual.g:1360:2: rule__DynamicListField__Group_5__1__Impl rule__DynamicListField__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__DynamicListField__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicListField__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group_5__1"


    // $ANTLR start "rule__DynamicListField__Group_5__1__Impl"
    // InternalConfigDslTextual.g:1367:1: rule__DynamicListField__Group_5__1__Impl : ( '{' ) ;
    public final void rule__DynamicListField__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1371:1: ( ( '{' ) )
            // InternalConfigDslTextual.g:1372:1: ( '{' )
            {
            // InternalConfigDslTextual.g:1372:1: ( '{' )
            // InternalConfigDslTextual.g:1373:2: '{'
            {
             before(grammarAccess.getDynamicListFieldAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDynamicListFieldAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group_5__1__Impl"


    // $ANTLR start "rule__DynamicListField__Group_5__2"
    // InternalConfigDslTextual.g:1382:1: rule__DynamicListField__Group_5__2 : rule__DynamicListField__Group_5__2__Impl rule__DynamicListField__Group_5__3 ;
    public final void rule__DynamicListField__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1386:1: ( rule__DynamicListField__Group_5__2__Impl rule__DynamicListField__Group_5__3 )
            // InternalConfigDslTextual.g:1387:2: rule__DynamicListField__Group_5__2__Impl rule__DynamicListField__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__DynamicListField__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicListField__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group_5__2"


    // $ANTLR start "rule__DynamicListField__Group_5__2__Impl"
    // InternalConfigDslTextual.g:1394:1: rule__DynamicListField__Group_5__2__Impl : ( ( rule__DynamicListField__DynamicListItemsAssignment_5_2 ) ) ;
    public final void rule__DynamicListField__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1398:1: ( ( ( rule__DynamicListField__DynamicListItemsAssignment_5_2 ) ) )
            // InternalConfigDslTextual.g:1399:1: ( ( rule__DynamicListField__DynamicListItemsAssignment_5_2 ) )
            {
            // InternalConfigDslTextual.g:1399:1: ( ( rule__DynamicListField__DynamicListItemsAssignment_5_2 ) )
            // InternalConfigDslTextual.g:1400:2: ( rule__DynamicListField__DynamicListItemsAssignment_5_2 )
            {
             before(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsAssignment_5_2()); 
            // InternalConfigDslTextual.g:1401:2: ( rule__DynamicListField__DynamicListItemsAssignment_5_2 )
            // InternalConfigDslTextual.g:1401:3: rule__DynamicListField__DynamicListItemsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__DynamicListField__DynamicListItemsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group_5__2__Impl"


    // $ANTLR start "rule__DynamicListField__Group_5__3"
    // InternalConfigDslTextual.g:1409:1: rule__DynamicListField__Group_5__3 : rule__DynamicListField__Group_5__3__Impl rule__DynamicListField__Group_5__4 ;
    public final void rule__DynamicListField__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1413:1: ( rule__DynamicListField__Group_5__3__Impl rule__DynamicListField__Group_5__4 )
            // InternalConfigDslTextual.g:1414:2: rule__DynamicListField__Group_5__3__Impl rule__DynamicListField__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__DynamicListField__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicListField__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group_5__3"


    // $ANTLR start "rule__DynamicListField__Group_5__3__Impl"
    // InternalConfigDslTextual.g:1421:1: rule__DynamicListField__Group_5__3__Impl : ( ( rule__DynamicListField__Group_5_3__0 )* ) ;
    public final void rule__DynamicListField__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1425:1: ( ( ( rule__DynamicListField__Group_5_3__0 )* ) )
            // InternalConfigDslTextual.g:1426:1: ( ( rule__DynamicListField__Group_5_3__0 )* )
            {
            // InternalConfigDslTextual.g:1426:1: ( ( rule__DynamicListField__Group_5_3__0 )* )
            // InternalConfigDslTextual.g:1427:2: ( rule__DynamicListField__Group_5_3__0 )*
            {
             before(grammarAccess.getDynamicListFieldAccess().getGroup_5_3()); 
            // InternalConfigDslTextual.g:1428:2: ( rule__DynamicListField__Group_5_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalConfigDslTextual.g:1428:3: rule__DynamicListField__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DynamicListField__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDynamicListFieldAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group_5__3__Impl"


    // $ANTLR start "rule__DynamicListField__Group_5__4"
    // InternalConfigDslTextual.g:1436:1: rule__DynamicListField__Group_5__4 : rule__DynamicListField__Group_5__4__Impl ;
    public final void rule__DynamicListField__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1440:1: ( rule__DynamicListField__Group_5__4__Impl )
            // InternalConfigDslTextual.g:1441:2: rule__DynamicListField__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DynamicListField__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group_5__4"


    // $ANTLR start "rule__DynamicListField__Group_5__4__Impl"
    // InternalConfigDslTextual.g:1447:1: rule__DynamicListField__Group_5__4__Impl : ( '}' ) ;
    public final void rule__DynamicListField__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1451:1: ( ( '}' ) )
            // InternalConfigDslTextual.g:1452:1: ( '}' )
            {
            // InternalConfigDslTextual.g:1452:1: ( '}' )
            // InternalConfigDslTextual.g:1453:2: '}'
            {
             before(grammarAccess.getDynamicListFieldAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDynamicListFieldAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group_5__4__Impl"


    // $ANTLR start "rule__DynamicListField__Group_5_3__0"
    // InternalConfigDslTextual.g:1463:1: rule__DynamicListField__Group_5_3__0 : rule__DynamicListField__Group_5_3__0__Impl rule__DynamicListField__Group_5_3__1 ;
    public final void rule__DynamicListField__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1467:1: ( rule__DynamicListField__Group_5_3__0__Impl rule__DynamicListField__Group_5_3__1 )
            // InternalConfigDslTextual.g:1468:2: rule__DynamicListField__Group_5_3__0__Impl rule__DynamicListField__Group_5_3__1
            {
            pushFollow(FOLLOW_16);
            rule__DynamicListField__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicListField__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group_5_3__0"


    // $ANTLR start "rule__DynamicListField__Group_5_3__0__Impl"
    // InternalConfigDslTextual.g:1475:1: rule__DynamicListField__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__DynamicListField__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1479:1: ( ( ',' ) )
            // InternalConfigDslTextual.g:1480:1: ( ',' )
            {
            // InternalConfigDslTextual.g:1480:1: ( ',' )
            // InternalConfigDslTextual.g:1481:2: ','
            {
             before(grammarAccess.getDynamicListFieldAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDynamicListFieldAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group_5_3__0__Impl"


    // $ANTLR start "rule__DynamicListField__Group_5_3__1"
    // InternalConfigDslTextual.g:1490:1: rule__DynamicListField__Group_5_3__1 : rule__DynamicListField__Group_5_3__1__Impl ;
    public final void rule__DynamicListField__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1494:1: ( rule__DynamicListField__Group_5_3__1__Impl )
            // InternalConfigDslTextual.g:1495:2: rule__DynamicListField__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DynamicListField__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group_5_3__1"


    // $ANTLR start "rule__DynamicListField__Group_5_3__1__Impl"
    // InternalConfigDslTextual.g:1501:1: rule__DynamicListField__Group_5_3__1__Impl : ( ( rule__DynamicListField__DynamicListItemsAssignment_5_3_1 ) ) ;
    public final void rule__DynamicListField__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1505:1: ( ( ( rule__DynamicListField__DynamicListItemsAssignment_5_3_1 ) ) )
            // InternalConfigDslTextual.g:1506:1: ( ( rule__DynamicListField__DynamicListItemsAssignment_5_3_1 ) )
            {
            // InternalConfigDslTextual.g:1506:1: ( ( rule__DynamicListField__DynamicListItemsAssignment_5_3_1 ) )
            // InternalConfigDslTextual.g:1507:2: ( rule__DynamicListField__DynamicListItemsAssignment_5_3_1 )
            {
             before(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsAssignment_5_3_1()); 
            // InternalConfigDslTextual.g:1508:2: ( rule__DynamicListField__DynamicListItemsAssignment_5_3_1 )
            // InternalConfigDslTextual.g:1508:3: rule__DynamicListField__DynamicListItemsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DynamicListField__DynamicListItemsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__Group_5_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalConfigDslTextual.g:1517:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1521:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalConfigDslTextual.g:1522:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalConfigDslTextual.g:1529:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1533:1: ( ( ( '-' )? ) )
            // InternalConfigDslTextual.g:1534:1: ( ( '-' )? )
            {
            // InternalConfigDslTextual.g:1534:1: ( ( '-' )? )
            // InternalConfigDslTextual.g:1535:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalConfigDslTextual.g:1536:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalConfigDslTextual.g:1536:3: '-'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalConfigDslTextual.g:1544:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1548:1: ( rule__EInt__Group__1__Impl )
            // InternalConfigDslTextual.g:1549:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalConfigDslTextual.g:1555:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1559:1: ( ( RULE_INT ) )
            // InternalConfigDslTextual.g:1560:1: ( RULE_INT )
            {
            // InternalConfigDslTextual.g:1560:1: ( RULE_INT )
            // InternalConfigDslTextual.g:1561:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__DynamicListItem__Group__0"
    // InternalConfigDslTextual.g:1571:1: rule__DynamicListItem__Group__0 : rule__DynamicListItem__Group__0__Impl rule__DynamicListItem__Group__1 ;
    public final void rule__DynamicListItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1575:1: ( rule__DynamicListItem__Group__0__Impl rule__DynamicListItem__Group__1 )
            // InternalConfigDslTextual.g:1576:2: rule__DynamicListItem__Group__0__Impl rule__DynamicListItem__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__DynamicListItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicListItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListItem__Group__0"


    // $ANTLR start "rule__DynamicListItem__Group__0__Impl"
    // InternalConfigDslTextual.g:1583:1: rule__DynamicListItem__Group__0__Impl : ( () ) ;
    public final void rule__DynamicListItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1587:1: ( ( () ) )
            // InternalConfigDslTextual.g:1588:1: ( () )
            {
            // InternalConfigDslTextual.g:1588:1: ( () )
            // InternalConfigDslTextual.g:1589:2: ()
            {
             before(grammarAccess.getDynamicListItemAccess().getDynamicListItemAction_0()); 
            // InternalConfigDslTextual.g:1590:2: ()
            // InternalConfigDslTextual.g:1590:3: 
            {
            }

             after(grammarAccess.getDynamicListItemAccess().getDynamicListItemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListItem__Group__0__Impl"


    // $ANTLR start "rule__DynamicListItem__Group__1"
    // InternalConfigDslTextual.g:1598:1: rule__DynamicListItem__Group__1 : rule__DynamicListItem__Group__1__Impl rule__DynamicListItem__Group__2 ;
    public final void rule__DynamicListItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1602:1: ( rule__DynamicListItem__Group__1__Impl rule__DynamicListItem__Group__2 )
            // InternalConfigDslTextual.g:1603:2: rule__DynamicListItem__Group__1__Impl rule__DynamicListItem__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DynamicListItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicListItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListItem__Group__1"


    // $ANTLR start "rule__DynamicListItem__Group__1__Impl"
    // InternalConfigDslTextual.g:1610:1: rule__DynamicListItem__Group__1__Impl : ( 'DynamicListItem' ) ;
    public final void rule__DynamicListItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1614:1: ( ( 'DynamicListItem' ) )
            // InternalConfigDslTextual.g:1615:1: ( 'DynamicListItem' )
            {
            // InternalConfigDslTextual.g:1615:1: ( 'DynamicListItem' )
            // InternalConfigDslTextual.g:1616:2: 'DynamicListItem'
            {
             before(grammarAccess.getDynamicListItemAccess().getDynamicListItemKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDynamicListItemAccess().getDynamicListItemKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListItem__Group__1__Impl"


    // $ANTLR start "rule__DynamicListItem__Group__2"
    // InternalConfigDslTextual.g:1625:1: rule__DynamicListItem__Group__2 : rule__DynamicListItem__Group__2__Impl ;
    public final void rule__DynamicListItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1629:1: ( rule__DynamicListItem__Group__2__Impl )
            // InternalConfigDslTextual.g:1630:2: rule__DynamicListItem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DynamicListItem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListItem__Group__2"


    // $ANTLR start "rule__DynamicListItem__Group__2__Impl"
    // InternalConfigDslTextual.g:1636:1: rule__DynamicListItem__Group__2__Impl : ( ( rule__DynamicListItem__NameAssignment_2 ) ) ;
    public final void rule__DynamicListItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1640:1: ( ( ( rule__DynamicListItem__NameAssignment_2 ) ) )
            // InternalConfigDslTextual.g:1641:1: ( ( rule__DynamicListItem__NameAssignment_2 ) )
            {
            // InternalConfigDslTextual.g:1641:1: ( ( rule__DynamicListItem__NameAssignment_2 ) )
            // InternalConfigDslTextual.g:1642:2: ( rule__DynamicListItem__NameAssignment_2 )
            {
             before(grammarAccess.getDynamicListItemAccess().getNameAssignment_2()); 
            // InternalConfigDslTextual.g:1643:2: ( rule__DynamicListItem__NameAssignment_2 )
            // InternalConfigDslTextual.g:1643:3: rule__DynamicListItem__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DynamicListItem__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDynamicListItemAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListItem__Group__2__Impl"


    // $ANTLR start "rule__Config__ProjectAssignment_3"
    // InternalConfigDslTextual.g:1652:1: rule__Config__ProjectAssignment_3 : ( ruleProject ) ;
    public final void rule__Config__ProjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1656:1: ( ( ruleProject ) )
            // InternalConfigDslTextual.g:1657:2: ( ruleProject )
            {
            // InternalConfigDslTextual.g:1657:2: ( ruleProject )
            // InternalConfigDslTextual.g:1658:3: ruleProject
            {
             before(grammarAccess.getConfigAccess().getProjectProjectParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getProjectProjectParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__ProjectAssignment_3"


    // $ANTLR start "rule__Config__SimpleStringFieldsAssignment_6"
    // InternalConfigDslTextual.g:1667:1: rule__Config__SimpleStringFieldsAssignment_6 : ( ruleSimpleStringField ) ;
    public final void rule__Config__SimpleStringFieldsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1671:1: ( ( ruleSimpleStringField ) )
            // InternalConfigDslTextual.g:1672:2: ( ruleSimpleStringField )
            {
            // InternalConfigDslTextual.g:1672:2: ( ruleSimpleStringField )
            // InternalConfigDslTextual.g:1673:3: ruleSimpleStringField
            {
             before(grammarAccess.getConfigAccess().getSimpleStringFieldsSimpleStringFieldParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleStringField();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getSimpleStringFieldsSimpleStringFieldParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__SimpleStringFieldsAssignment_6"


    // $ANTLR start "rule__Config__SimpleStringFieldsAssignment_7_1"
    // InternalConfigDslTextual.g:1682:1: rule__Config__SimpleStringFieldsAssignment_7_1 : ( ruleSimpleStringField ) ;
    public final void rule__Config__SimpleStringFieldsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1686:1: ( ( ruleSimpleStringField ) )
            // InternalConfigDslTextual.g:1687:2: ( ruleSimpleStringField )
            {
            // InternalConfigDslTextual.g:1687:2: ( ruleSimpleStringField )
            // InternalConfigDslTextual.g:1688:3: ruleSimpleStringField
            {
             before(grammarAccess.getConfigAccess().getSimpleStringFieldsSimpleStringFieldParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleStringField();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getSimpleStringFieldsSimpleStringFieldParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__SimpleStringFieldsAssignment_7_1"


    // $ANTLR start "rule__Config__DynamicListFieldsAssignment_9_2"
    // InternalConfigDslTextual.g:1697:1: rule__Config__DynamicListFieldsAssignment_9_2 : ( ruleDynamicListField ) ;
    public final void rule__Config__DynamicListFieldsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1701:1: ( ( ruleDynamicListField ) )
            // InternalConfigDslTextual.g:1702:2: ( ruleDynamicListField )
            {
            // InternalConfigDslTextual.g:1702:2: ( ruleDynamicListField )
            // InternalConfigDslTextual.g:1703:3: ruleDynamicListField
            {
             before(grammarAccess.getConfigAccess().getDynamicListFieldsDynamicListFieldParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamicListField();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getDynamicListFieldsDynamicListFieldParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__DynamicListFieldsAssignment_9_2"


    // $ANTLR start "rule__Config__DynamicListFieldsAssignment_9_3_1"
    // InternalConfigDslTextual.g:1712:1: rule__Config__DynamicListFieldsAssignment_9_3_1 : ( ruleDynamicListField ) ;
    public final void rule__Config__DynamicListFieldsAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1716:1: ( ( ruleDynamicListField ) )
            // InternalConfigDslTextual.g:1717:2: ( ruleDynamicListField )
            {
            // InternalConfigDslTextual.g:1717:2: ( ruleDynamicListField )
            // InternalConfigDslTextual.g:1718:3: ruleDynamicListField
            {
             before(grammarAccess.getConfigAccess().getDynamicListFieldsDynamicListFieldParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamicListField();

            state._fsp--;

             after(grammarAccess.getConfigAccess().getDynamicListFieldsDynamicListFieldParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Config__DynamicListFieldsAssignment_9_3_1"


    // $ANTLR start "rule__Project__KeepClassificationAssignment_1"
    // InternalConfigDslTextual.g:1727:1: rule__Project__KeepClassificationAssignment_1 : ( ( 'KeepClassification' ) ) ;
    public final void rule__Project__KeepClassificationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1731:1: ( ( ( 'KeepClassification' ) ) )
            // InternalConfigDslTextual.g:1732:2: ( ( 'KeepClassification' ) )
            {
            // InternalConfigDslTextual.g:1732:2: ( ( 'KeepClassification' ) )
            // InternalConfigDslTextual.g:1733:3: ( 'KeepClassification' )
            {
             before(grammarAccess.getProjectAccess().getKeepClassificationKeepClassificationKeyword_1_0()); 
            // InternalConfigDslTextual.g:1734:3: ( 'KeepClassification' )
            // InternalConfigDslTextual.g:1735:4: 'KeepClassification'
            {
             before(grammarAccess.getProjectAccess().getKeepClassificationKeepClassificationKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getKeepClassificationKeepClassificationKeyword_1_0()); 

            }

             after(grammarAccess.getProjectAccess().getKeepClassificationKeepClassificationKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__KeepClassificationAssignment_1"


    // $ANTLR start "rule__Project__NameAssignment_3"
    // InternalConfigDslTextual.g:1746:1: rule__Project__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Project__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1750:1: ( ( ruleEString ) )
            // InternalConfigDslTextual.g:1751:2: ( ruleEString )
            {
            // InternalConfigDslTextual.g:1751:2: ( ruleEString )
            // InternalConfigDslTextual.g:1752:3: ruleEString
            {
             before(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__NameAssignment_3"


    // $ANTLR start "rule__SimpleStringField__IsRequiredAssignment_1"
    // InternalConfigDslTextual.g:1761:1: rule__SimpleStringField__IsRequiredAssignment_1 : ( ( 'IsRequired' ) ) ;
    public final void rule__SimpleStringField__IsRequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1765:1: ( ( ( 'IsRequired' ) ) )
            // InternalConfigDslTextual.g:1766:2: ( ( 'IsRequired' ) )
            {
            // InternalConfigDslTextual.g:1766:2: ( ( 'IsRequired' ) )
            // InternalConfigDslTextual.g:1767:3: ( 'IsRequired' )
            {
             before(grammarAccess.getSimpleStringFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); 
            // InternalConfigDslTextual.g:1768:3: ( 'IsRequired' )
            // InternalConfigDslTextual.g:1769:4: 'IsRequired'
            {
             before(grammarAccess.getSimpleStringFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSimpleStringFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); 

            }

             after(grammarAccess.getSimpleStringFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__IsRequiredAssignment_1"


    // $ANTLR start "rule__SimpleStringField__NameAssignment_3"
    // InternalConfigDslTextual.g:1780:1: rule__SimpleStringField__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__SimpleStringField__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1784:1: ( ( ruleEString ) )
            // InternalConfigDslTextual.g:1785:2: ( ruleEString )
            {
            // InternalConfigDslTextual.g:1785:2: ( ruleEString )
            // InternalConfigDslTextual.g:1786:3: ruleEString
            {
             before(grammarAccess.getSimpleStringFieldAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleStringFieldAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__NameAssignment_3"


    // $ANTLR start "rule__SimpleStringField__SizeAssignment_5_1"
    // InternalConfigDslTextual.g:1795:1: rule__SimpleStringField__SizeAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__SimpleStringField__SizeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1799:1: ( ( ruleEInt ) )
            // InternalConfigDslTextual.g:1800:2: ( ruleEInt )
            {
            // InternalConfigDslTextual.g:1800:2: ( ruleEInt )
            // InternalConfigDslTextual.g:1801:3: ruleEInt
            {
             before(grammarAccess.getSimpleStringFieldAccess().getSizeEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSimpleStringFieldAccess().getSizeEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStringField__SizeAssignment_5_1"


    // $ANTLR start "rule__DynamicListField__IsRequiredAssignment_1"
    // InternalConfigDslTextual.g:1810:1: rule__DynamicListField__IsRequiredAssignment_1 : ( ( 'IsRequired' ) ) ;
    public final void rule__DynamicListField__IsRequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1814:1: ( ( ( 'IsRequired' ) ) )
            // InternalConfigDslTextual.g:1815:2: ( ( 'IsRequired' ) )
            {
            // InternalConfigDslTextual.g:1815:2: ( ( 'IsRequired' ) )
            // InternalConfigDslTextual.g:1816:3: ( 'IsRequired' )
            {
             before(grammarAccess.getDynamicListFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); 
            // InternalConfigDslTextual.g:1817:3: ( 'IsRequired' )
            // InternalConfigDslTextual.g:1818:4: 'IsRequired'
            {
             before(grammarAccess.getDynamicListFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDynamicListFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); 

            }

             after(grammarAccess.getDynamicListFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__IsRequiredAssignment_1"


    // $ANTLR start "rule__DynamicListField__NameAssignment_3"
    // InternalConfigDslTextual.g:1829:1: rule__DynamicListField__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__DynamicListField__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1833:1: ( ( ruleEString ) )
            // InternalConfigDslTextual.g:1834:2: ( ruleEString )
            {
            // InternalConfigDslTextual.g:1834:2: ( ruleEString )
            // InternalConfigDslTextual.g:1835:3: ruleEString
            {
             before(grammarAccess.getDynamicListFieldAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDynamicListFieldAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__NameAssignment_3"


    // $ANTLR start "rule__DynamicListField__DynamicListItemsAssignment_5_2"
    // InternalConfigDslTextual.g:1844:1: rule__DynamicListField__DynamicListItemsAssignment_5_2 : ( ruleDynamicListItem ) ;
    public final void rule__DynamicListField__DynamicListItemsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1848:1: ( ( ruleDynamicListItem ) )
            // InternalConfigDslTextual.g:1849:2: ( ruleDynamicListItem )
            {
            // InternalConfigDslTextual.g:1849:2: ( ruleDynamicListItem )
            // InternalConfigDslTextual.g:1850:3: ruleDynamicListItem
            {
             before(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsDynamicListItemParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamicListItem();

            state._fsp--;

             after(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsDynamicListItemParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__DynamicListItemsAssignment_5_2"


    // $ANTLR start "rule__DynamicListField__DynamicListItemsAssignment_5_3_1"
    // InternalConfigDslTextual.g:1859:1: rule__DynamicListField__DynamicListItemsAssignment_5_3_1 : ( ruleDynamicListItem ) ;
    public final void rule__DynamicListField__DynamicListItemsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1863:1: ( ( ruleDynamicListItem ) )
            // InternalConfigDslTextual.g:1864:2: ( ruleDynamicListItem )
            {
            // InternalConfigDslTextual.g:1864:2: ( ruleDynamicListItem )
            // InternalConfigDslTextual.g:1865:3: ruleDynamicListItem
            {
             before(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsDynamicListItemParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamicListItem();

            state._fsp--;

             after(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsDynamicListItemParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListField__DynamicListItemsAssignment_5_3_1"


    // $ANTLR start "rule__DynamicListItem__NameAssignment_2"
    // InternalConfigDslTextual.g:1874:1: rule__DynamicListItem__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DynamicListItem__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConfigDslTextual.g:1878:1: ( ( ruleEString ) )
            // InternalConfigDslTextual.g:1879:2: ( ruleEString )
            {
            // InternalConfigDslTextual.g:1879:2: ( ruleEString )
            // InternalConfigDslTextual.g:1880:3: ruleEString
            {
             before(grammarAccess.getDynamicListItemAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDynamicListItemAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicListItem__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});

}