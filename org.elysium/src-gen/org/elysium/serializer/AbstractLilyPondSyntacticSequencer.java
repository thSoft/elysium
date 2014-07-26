package org.elysium.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.elysium.services.LilyPondGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractLilyPondSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LilyPondGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Scheme_DollarSignKeyword_0_1_or_NumberSignKeyword_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LilyPondGrammarAccess) access;
		match_Scheme_DollarSignKeyword_0_1_or_NumberSignKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSchemeAccess().getDollarSignKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getSchemeAccess().getNumberSignKeyword_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Scheme_DollarSignKeyword_0_1_or_NumberSignKeyword_0_0.equals(syntax))
				emit_Scheme_DollarSignKeyword_0_1_or_NumberSignKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '#' | '$'
	 */
	protected void emit_Scheme_DollarSignKeyword_0_1_or_NumberSignKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
