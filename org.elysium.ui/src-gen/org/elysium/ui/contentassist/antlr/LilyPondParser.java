/*
* generated by Xtext
*/
package org.elysium.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.elysium.services.LilyPondGrammarAccess;

public class LilyPondParser extends AbstractContentAssistParser {
	
	@Inject
	private LilyPondGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.elysium.ui.contentassist.antlr.internal.InternalLilyPondParser createParser() {
		org.elysium.ui.contentassist.antlr.internal.InternalLilyPondParser result = new org.elysium.ui.contentassist.antlr.internal.InternalLilyPondParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getToplevelExpressionAccess().getAlternatives(), "rule__ToplevelExpression__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getCommonExpressionAccess().getAlternatives(), "rule__CommonExpression__Alternatives");
					put(grammarAccess.getAssignmentAccess().getNameAlternatives_0_0(), "rule__Assignment__NameAlternatives_0_0");
					put(grammarAccess.getPropertyAssignmentAccess().getIdAlternatives_0_0(), "rule__PropertyAssignment__IdAlternatives_0_0");
					put(grammarAccess.getBlockAccess().getAlternatives(), "rule__Block__Alternatives");
					put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
					put(grammarAccess.getSpecialCommandAccess().getAlternatives(), "rule__SpecialCommand__Alternatives");
					put(grammarAccess.getMarkupBodyAccess().getCommandAlternatives_1_0(), "rule__MarkupBody__CommandAlternatives_1_0");
					put(grammarAccess.getOtherAccess().getKeywordAlternatives_1_0(), "rule__Other__KeywordAlternatives_1_0");
					put(grammarAccess.getOtherNameAccess().getAlternatives(), "rule__OtherName__Alternatives");
					put(grammarAccess.getSpecialCommandNameAccess().getAlternatives(), "rule__SpecialCommandName__Alternatives");
					put(grammarAccess.getSpecialCharacterAccess().getAlternatives(), "rule__SpecialCharacter__Alternatives");
					put(grammarAccess.getUnparsedExpressionAccess().getAlternatives(), "rule__UnparsedExpression__Alternatives");
					put(grammarAccess.getUnparsedCommandAccess().getCommandAlternatives_1_0(), "rule__UnparsedCommand__CommandAlternatives_1_0");
					put(grammarAccess.getTextAccess().getValueAlternatives_0(), "rule__Text__ValueAlternatives_0");
					put(grammarAccess.getSchemeExpressionAccess().getAlternatives_0(), "rule__SchemeExpression__Alternatives_0");
					put(grammarAccess.getSchemeValueAccess().getAlternatives(), "rule__SchemeValue__Alternatives");
					put(grammarAccess.getSchemeCharacterAccess().getValueAlternatives_1_0(), "rule__SchemeCharacter__ValueAlternatives_1_0");
					put(grammarAccess.getSchemeTextLiteralAccess().getAlternatives(), "rule__SchemeTextLiteral__Alternatives");
					put(grammarAccess.getSchemeMarkupCommandAccess().getCommandAlternatives_1_0(), "rule__SchemeMarkupCommand__CommandAlternatives_1_0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getPropertyAssignmentAccess().getGroup(), "rule__PropertyAssignment__Group__0");
					put(grammarAccess.getSimpleBlockAccess().getGroup(), "rule__SimpleBlock__Group__0");
					put(grammarAccess.getSimultaneousBlockAccess().getGroup(), "rule__SimultaneousBlock__Group__0");
					put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getMarkupAccess().getGroup(), "rule__Markup__Group__0");
					put(grammarAccess.getMarkupLinesAccess().getGroup(), "rule__MarkupLines__Group__0");
					put(grammarAccess.getMarkupBodyAccess().getGroup(), "rule__MarkupBody__Group__0");
					put(grammarAccess.getContextAccess().getGroup(), "rule__Context__Group__0");
					put(grammarAccess.getOtherAccess().getGroup(), "rule__Other__Group__0");
					put(grammarAccess.getUnparsedBlockAccess().getGroup(), "rule__UnparsedBlock__Group__0");
					put(grammarAccess.getUnparsedCommandAccess().getGroup(), "rule__UnparsedCommand__Group__0");
					put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
					put(grammarAccess.getSchemeAccess().getGroup(), "rule__Scheme__Group__0");
					put(grammarAccess.getSchemeExpressionAccess().getGroup(), "rule__SchemeExpression__Group__0");
					put(grammarAccess.getSchemeListAccess().getGroup(), "rule__SchemeList__Group__0");
					put(grammarAccess.getSchemeBlockAccess().getGroup(), "rule__SchemeBlock__Group__0");
					put(grammarAccess.getSchemeCharacterAccess().getGroup(), "rule__SchemeCharacter__Group__0");
					put(grammarAccess.getSchemeIdAccess().getGroup(), "rule__SchemeId__Group__0");
					put(grammarAccess.getSchemeIdAccess().getGroup_1(), "rule__SchemeId__Group_1__0");
					put(grammarAccess.getSchemeNumberAccess().getGroup(), "rule__SchemeNumber__Group__0");
					put(grammarAccess.getSchemeNumberRadixAccess().getGroup(), "rule__SchemeNumberRadix__Group__0");
					put(grammarAccess.getSchemeMarkupCommandAccess().getGroup(), "rule__SchemeMarkupCommand__Group__0");
					put(grammarAccess.getIdentifierAccess().getGroup(), "rule__Identifier__Group__0");
					put(grammarAccess.getIdentifierAccess().getGroup_1(), "rule__Identifier__Group_1__0");
					put(grammarAccess.getBooleanAccess().getGroup(), "rule__Boolean__Group__0");
					put(grammarAccess.getLilyPondAccess().getExpressionsAssignment(), "rule__LilyPond__ExpressionsAssignment");
					put(grammarAccess.getAssignmentAccess().getNameAssignment_0(), "rule__Assignment__NameAssignment_0");
					put(grammarAccess.getAssignmentAccess().getValueAssignment_2(), "rule__Assignment__ValueAssignment_2");
					put(grammarAccess.getPropertyAssignmentAccess().getIdAssignment_0(), "rule__PropertyAssignment__IdAssignment_0");
					put(grammarAccess.getPropertyAssignmentAccess().getValueAssignment_2(), "rule__PropertyAssignment__ValueAssignment_2");
					put(grammarAccess.getSimpleBlockAccess().getExpressionsAssignment_2(), "rule__SimpleBlock__ExpressionsAssignment_2");
					put(grammarAccess.getSimultaneousBlockAccess().getExpressionsAssignment_2(), "rule__SimultaneousBlock__ExpressionsAssignment_2");
					put(grammarAccess.getIncludeAccess().getImportURIAssignment_2(), "rule__Include__ImportURIAssignment_2");
					put(grammarAccess.getVersionAccess().getVersionAssignment_2(), "rule__Version__VersionAssignment_2");
					put(grammarAccess.getMarkupAccess().getBodyAssignment_2(), "rule__Markup__BodyAssignment_2");
					put(grammarAccess.getMarkupLinesAccess().getBodyAssignment_2(), "rule__MarkupLines__BodyAssignment_2");
					put(grammarAccess.getMarkupBodyAccess().getCommandAssignment_1(), "rule__MarkupBody__CommandAssignment_1");
					put(grammarAccess.getMarkupBodyAccess().getBlockAssignment_2(), "rule__MarkupBody__BlockAssignment_2");
					put(grammarAccess.getContextAccess().getBlockAssignment_3(), "rule__Context__BlockAssignment_3");
					put(grammarAccess.getOtherAccess().getKeywordAssignment_1(), "rule__Other__KeywordAssignment_1");
					put(grammarAccess.getUnparsedBlockAccess().getExpressionsAssignment_2(), "rule__UnparsedBlock__ExpressionsAssignment_2");
					put(grammarAccess.getUnparsedCommandAccess().getCommandAssignment_1(), "rule__UnparsedCommand__CommandAssignment_1");
					put(grammarAccess.getReferenceAccess().getAssignmentAssignment_1(), "rule__Reference__AssignmentAssignment_1");
					put(grammarAccess.getTextAccess().getValueAssignment(), "rule__Text__ValueAssignment");
					put(grammarAccess.getNumberAccess().getValueAssignment(), "rule__Number__ValueAssignment");
					put(grammarAccess.getSchemeAccess().getValueAssignment_1(), "rule__Scheme__ValueAssignment_1");
					put(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0_0(), "rule__SchemeExpression__QuotedAssignment_0_0");
					put(grammarAccess.getSchemeExpressionAccess().getQuasiquotedAssignment_0_1(), "rule__SchemeExpression__QuasiquotedAssignment_0_1");
					put(grammarAccess.getSchemeExpressionAccess().getUnquotedAssignment_0_2(), "rule__SchemeExpression__UnquotedAssignment_0_2");
					put(grammarAccess.getSchemeExpressionAccess().getVariableAssignment_0_3(), "rule__SchemeExpression__VariableAssignment_0_3");
					put(grammarAccess.getSchemeExpressionAccess().getValueAssignment_1(), "rule__SchemeExpression__ValueAssignment_1");
					put(grammarAccess.getSchemeBooleanAccess().getValueAssignment(), "rule__SchemeBoolean__ValueAssignment");
					put(grammarAccess.getSchemeListAccess().getVectorAssignment_1(), "rule__SchemeList__VectorAssignment_1");
					put(grammarAccess.getSchemeListAccess().getExpressionsAssignment_3(), "rule__SchemeList__ExpressionsAssignment_3");
					put(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1(), "rule__SchemeBlock__ExpressionsAssignment_1");
					put(grammarAccess.getSchemeCharacterAccess().getValueAssignment_1(), "rule__SchemeCharacter__ValueAssignment_1");
					put(grammarAccess.getSchemeTextAccess().getValueAssignment(), "rule__SchemeText__ValueAssignment");
					put(grammarAccess.getSchemeNumberAccess().getRadixAssignment_0(), "rule__SchemeNumber__RadixAssignment_0");
					put(grammarAccess.getSchemeNumberAccess().getValueAssignment_1(), "rule__SchemeNumber__ValueAssignment_1");
					put(grammarAccess.getSchemeMarkupCommandAccess().getCommandAssignment_1(), "rule__SchemeMarkupCommand__CommandAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.elysium.ui.contentassist.antlr.internal.InternalLilyPondParser typedParser = (org.elysium.ui.contentassist.antlr.internal.InternalLilyPondParser) parser;
			typedParser.entryRuleLilyPond();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT" };
	}
	
	public LilyPondGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LilyPondGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
