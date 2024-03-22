/*
 * generated by Xtext 2.27.0
 */
grammar InternalConfigDslTextual;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package zombie.incatch.configdsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleConfig
entryRuleConfig
:
{ before(grammarAccess.getConfigRule()); }
	 ruleConfig
{ after(grammarAccess.getConfigRule()); } 
	 EOF 
;

// Rule Config
ruleConfig 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConfigAccess().getGroup()); }
		(rule__Config__Group__0)
		{ after(grammarAccess.getConfigAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProject
entryRuleProject
:
{ before(grammarAccess.getProjectRule()); }
	 ruleProject
{ after(grammarAccess.getProjectRule()); } 
	 EOF 
;

// Rule Project
ruleProject 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProjectAccess().getGroup()); }
		(rule__Project__Group__0)
		{ after(grammarAccess.getProjectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSimpleStringField
entryRuleSimpleStringField
:
{ before(grammarAccess.getSimpleStringFieldRule()); }
	 ruleSimpleStringField
{ after(grammarAccess.getSimpleStringFieldRule()); } 
	 EOF 
;

// Rule SimpleStringField
ruleSimpleStringField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSimpleStringFieldAccess().getGroup()); }
		(rule__SimpleStringField__Group__0)
		{ after(grammarAccess.getSimpleStringFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDynamicListField
entryRuleDynamicListField
:
{ before(grammarAccess.getDynamicListFieldRule()); }
	 ruleDynamicListField
{ after(grammarAccess.getDynamicListFieldRule()); } 
	 EOF 
;

// Rule DynamicListField
ruleDynamicListField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDynamicListFieldAccess().getGroup()); }
		(rule__DynamicListField__Group__0)
		{ after(grammarAccess.getDynamicListFieldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEInt
entryRuleEInt
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEIntAccess().getGroup()); }
		(rule__EInt__Group__0)
		{ after(grammarAccess.getEIntAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDynamicListItem
entryRuleDynamicListItem
:
{ before(grammarAccess.getDynamicListItemRule()); }
	 ruleDynamicListItem
{ after(grammarAccess.getDynamicListItemRule()); } 
	 EOF 
;

// Rule DynamicListItem
ruleDynamicListItem 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDynamicListItemAccess().getGroup()); }
		(rule__DynamicListItem__Group__0)
		{ after(grammarAccess.getDynamicListItemAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group__0__Impl
	rule__Config__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getConfigKeyword_0()); }
	'Config'
	{ after(grammarAccess.getConfigAccess().getConfigKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group__1__Impl
	rule__Config__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group__2__Impl
	rule__Config__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getProjectKeyword_2()); }
	'project'
	{ after(grammarAccess.getConfigAccess().getProjectKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group__3__Impl
	rule__Config__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getProjectAssignment_3()); }
	(rule__Config__ProjectAssignment_3)
	{ after(grammarAccess.getConfigAccess().getProjectAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group__4__Impl
	rule__Config__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getSimpleStringFieldsKeyword_4()); }
	'simpleStringFields'
	{ after(grammarAccess.getConfigAccess().getSimpleStringFieldsKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group__5__Impl
	rule__Config__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_5()); }
	'{'
	{ after(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group__6__Impl
	rule__Config__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getSimpleStringFieldsAssignment_6()); }
	(rule__Config__SimpleStringFieldsAssignment_6)
	{ after(grammarAccess.getConfigAccess().getSimpleStringFieldsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group__7__Impl
	rule__Config__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getGroup_7()); }
	(rule__Config__Group_7__0)*
	{ after(grammarAccess.getConfigAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group__8__Impl
	rule__Config__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group__9__Impl
	rule__Config__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getGroup_9()); }
	(rule__Config__Group_9__0)?
	{ after(grammarAccess.getConfigAccess().getGroup_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Config__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group_7__0__Impl
	rule__Config__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getCommaKeyword_7_0()); }
	','
	{ after(grammarAccess.getConfigAccess().getCommaKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getSimpleStringFieldsAssignment_7_1()); }
	(rule__Config__SimpleStringFieldsAssignment_7_1)
	{ after(grammarAccess.getConfigAccess().getSimpleStringFieldsAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Config__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group_9__0__Impl
	rule__Config__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getDynamicListFieldsKeyword_9_0()); }
	'dynamicListFields'
	{ after(grammarAccess.getConfigAccess().getDynamicListFieldsKeyword_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group_9__1__Impl
	rule__Config__Group_9__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_9_1()); }
	'{'
	{ after(grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group_9__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group_9__2__Impl
	rule__Config__Group_9__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group_9__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getDynamicListFieldsAssignment_9_2()); }
	(rule__Config__DynamicListFieldsAssignment_9_2)
	{ after(grammarAccess.getConfigAccess().getDynamicListFieldsAssignment_9_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group_9__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group_9__3__Impl
	rule__Config__Group_9__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group_9__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getGroup_9_3()); }
	(rule__Config__Group_9_3__0)*
	{ after(grammarAccess.getConfigAccess().getGroup_9_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group_9__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group_9__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group_9__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_9_4()); }
	'}'
	{ after(grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_9_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Config__Group_9_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group_9_3__0__Impl
	rule__Config__Group_9_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group_9_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getCommaKeyword_9_3_0()); }
	','
	{ after(grammarAccess.getConfigAccess().getCommaKeyword_9_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group_9_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Config__Group_9_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__Group_9_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigAccess().getDynamicListFieldsAssignment_9_3_1()); }
	(rule__Config__DynamicListFieldsAssignment_9_3_1)
	{ after(grammarAccess.getConfigAccess().getDynamicListFieldsAssignment_9_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Project__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Project__Group__0__Impl
	rule__Project__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProjectAccess().getProjectAction_0()); }
	()
	{ after(grammarAccess.getProjectAccess().getProjectAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Project__Group__1__Impl
	rule__Project__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProjectAccess().getKeepClassificationAssignment_1()); }
	(rule__Project__KeepClassificationAssignment_1)?
	{ after(grammarAccess.getProjectAccess().getKeepClassificationAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Project__Group__2__Impl
	rule__Project__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProjectAccess().getProjectKeyword_2()); }
	'Project'
	{ after(grammarAccess.getProjectAccess().getProjectKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Project__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProjectAccess().getNameAssignment_3()); }
	(rule__Project__NameAssignment_3)
	{ after(grammarAccess.getProjectAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleStringField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleStringField__Group__0__Impl
	rule__SimpleStringField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleStringFieldAccess().getSimpleStringFieldAction_0()); }
	()
	{ after(grammarAccess.getSimpleStringFieldAccess().getSimpleStringFieldAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleStringField__Group__1__Impl
	rule__SimpleStringField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleStringFieldAccess().getIsRequiredAssignment_1()); }
	(rule__SimpleStringField__IsRequiredAssignment_1)?
	{ after(grammarAccess.getSimpleStringFieldAccess().getIsRequiredAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleStringField__Group__2__Impl
	rule__SimpleStringField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleStringFieldAccess().getSimpleStringFieldKeyword_2()); }
	'SimpleStringField'
	{ after(grammarAccess.getSimpleStringFieldAccess().getSimpleStringFieldKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleStringField__Group__3__Impl
	rule__SimpleStringField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleStringFieldAccess().getNameAssignment_3()); }
	(rule__SimpleStringField__NameAssignment_3)
	{ after(grammarAccess.getSimpleStringFieldAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleStringField__Group__4__Impl
	rule__SimpleStringField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleStringFieldAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getSimpleStringFieldAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleStringField__Group__5__Impl
	rule__SimpleStringField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleStringFieldAccess().getGroup_5()); }
	(rule__SimpleStringField__Group_5__0)?
	{ after(grammarAccess.getSimpleStringFieldAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleStringField__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleStringFieldAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getSimpleStringFieldAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleStringField__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleStringField__Group_5__0__Impl
	rule__SimpleStringField__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleStringFieldAccess().getSizeKeyword_5_0()); }
	'Size'
	{ after(grammarAccess.getSimpleStringFieldAccess().getSizeKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleStringField__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleStringFieldAccess().getSizeAssignment_5_1()); }
	(rule__SimpleStringField__SizeAssignment_5_1)
	{ after(grammarAccess.getSimpleStringFieldAccess().getSizeAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DynamicListField__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListField__Group__0__Impl
	rule__DynamicListField__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListFieldAccess().getDynamicListFieldAction_0()); }
	()
	{ after(grammarAccess.getDynamicListFieldAccess().getDynamicListFieldAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListField__Group__1__Impl
	rule__DynamicListField__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListFieldAccess().getIsRequiredAssignment_1()); }
	(rule__DynamicListField__IsRequiredAssignment_1)?
	{ after(grammarAccess.getDynamicListFieldAccess().getIsRequiredAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListField__Group__2__Impl
	rule__DynamicListField__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListFieldAccess().getDynamicListFieldKeyword_2()); }
	'DynamicListField'
	{ after(grammarAccess.getDynamicListFieldAccess().getDynamicListFieldKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListField__Group__3__Impl
	rule__DynamicListField__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListFieldAccess().getNameAssignment_3()); }
	(rule__DynamicListField__NameAssignment_3)
	{ after(grammarAccess.getDynamicListFieldAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListField__Group__4__Impl
	rule__DynamicListField__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListFieldAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getDynamicListFieldAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListField__Group__5__Impl
	rule__DynamicListField__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListFieldAccess().getGroup_5()); }
	(rule__DynamicListField__Group_5__0)?
	{ after(grammarAccess.getDynamicListFieldAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListField__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListFieldAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getDynamicListFieldAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DynamicListField__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListField__Group_5__0__Impl
	rule__DynamicListField__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsKeyword_5_0()); }
	'dynamicListItems'
	{ after(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListField__Group_5__1__Impl
	rule__DynamicListField__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListFieldAccess().getLeftCurlyBracketKeyword_5_1()); }
	'{'
	{ after(grammarAccess.getDynamicListFieldAccess().getLeftCurlyBracketKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListField__Group_5__2__Impl
	rule__DynamicListField__Group_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsAssignment_5_2()); }
	(rule__DynamicListField__DynamicListItemsAssignment_5_2)
	{ after(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListField__Group_5__3__Impl
	rule__DynamicListField__Group_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListFieldAccess().getGroup_5_3()); }
	(rule__DynamicListField__Group_5_3__0)*
	{ after(grammarAccess.getDynamicListFieldAccess().getGroup_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListField__Group_5__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListFieldAccess().getRightCurlyBracketKeyword_5_4()); }
	'}'
	{ after(grammarAccess.getDynamicListFieldAccess().getRightCurlyBracketKeyword_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DynamicListField__Group_5_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListField__Group_5_3__0__Impl
	rule__DynamicListField__Group_5_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group_5_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListFieldAccess().getCommaKeyword_5_3_0()); }
	','
	{ after(grammarAccess.getDynamicListFieldAccess().getCommaKeyword_5_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group_5_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListField__Group_5_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__Group_5_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsAssignment_5_3_1()); }
	(rule__DynamicListField__DynamicListItemsAssignment_5_3_1)
	{ after(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsAssignment_5_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EInt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__0__Impl
	rule__EInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DynamicListItem__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListItem__Group__0__Impl
	rule__DynamicListItem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListItem__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListItemAccess().getDynamicListItemAction_0()); }
	()
	{ after(grammarAccess.getDynamicListItemAccess().getDynamicListItemAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListItem__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListItem__Group__1__Impl
	rule__DynamicListItem__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListItem__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListItemAccess().getDynamicListItemKeyword_1()); }
	'DynamicListItem'
	{ after(grammarAccess.getDynamicListItemAccess().getDynamicListItemKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListItem__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DynamicListItem__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListItem__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDynamicListItemAccess().getNameAssignment_2()); }
	(rule__DynamicListItem__NameAssignment_2)
	{ after(grammarAccess.getDynamicListItemAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Config__ProjectAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigAccess().getProjectProjectParserRuleCall_3_0()); }
		ruleProject
		{ after(grammarAccess.getConfigAccess().getProjectProjectParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__SimpleStringFieldsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigAccess().getSimpleStringFieldsSimpleStringFieldParserRuleCall_6_0()); }
		ruleSimpleStringField
		{ after(grammarAccess.getConfigAccess().getSimpleStringFieldsSimpleStringFieldParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__SimpleStringFieldsAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigAccess().getSimpleStringFieldsSimpleStringFieldParserRuleCall_7_1_0()); }
		ruleSimpleStringField
		{ after(grammarAccess.getConfigAccess().getSimpleStringFieldsSimpleStringFieldParserRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__DynamicListFieldsAssignment_9_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigAccess().getDynamicListFieldsDynamicListFieldParserRuleCall_9_2_0()); }
		ruleDynamicListField
		{ after(grammarAccess.getConfigAccess().getDynamicListFieldsDynamicListFieldParserRuleCall_9_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Config__DynamicListFieldsAssignment_9_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigAccess().getDynamicListFieldsDynamicListFieldParserRuleCall_9_3_1_0()); }
		ruleDynamicListField
		{ after(grammarAccess.getConfigAccess().getDynamicListFieldsDynamicListFieldParserRuleCall_9_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__KeepClassificationAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProjectAccess().getKeepClassificationKeepClassificationKeyword_1_0()); }
		(
			{ before(grammarAccess.getProjectAccess().getKeepClassificationKeepClassificationKeyword_1_0()); }
			'KeepClassification'
			{ after(grammarAccess.getProjectAccess().getKeepClassificationKeepClassificationKeyword_1_0()); }
		)
		{ after(grammarAccess.getProjectAccess().getKeepClassificationKeepClassificationKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__IsRequiredAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleStringFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); }
		(
			{ before(grammarAccess.getSimpleStringFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); }
			'IsRequired'
			{ after(grammarAccess.getSimpleStringFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); }
		)
		{ after(grammarAccess.getSimpleStringFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleStringFieldAccess().getNameEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getSimpleStringFieldAccess().getNameEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleStringField__SizeAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleStringFieldAccess().getSizeEIntParserRuleCall_5_1_0()); }
		ruleEInt
		{ after(grammarAccess.getSimpleStringFieldAccess().getSizeEIntParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__IsRequiredAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDynamicListFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); }
		(
			{ before(grammarAccess.getDynamicListFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); }
			'IsRequired'
			{ after(grammarAccess.getDynamicListFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); }
		)
		{ after(grammarAccess.getDynamicListFieldAccess().getIsRequiredIsRequiredKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDynamicListFieldAccess().getNameEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getDynamicListFieldAccess().getNameEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__DynamicListItemsAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsDynamicListItemParserRuleCall_5_2_0()); }
		ruleDynamicListItem
		{ after(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsDynamicListItemParserRuleCall_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListField__DynamicListItemsAssignment_5_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsDynamicListItemParserRuleCall_5_3_1_0()); }
		ruleDynamicListItem
		{ after(grammarAccess.getDynamicListFieldAccess().getDynamicListItemsDynamicListItemParserRuleCall_5_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DynamicListItem__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDynamicListItemAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getDynamicListItemAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;