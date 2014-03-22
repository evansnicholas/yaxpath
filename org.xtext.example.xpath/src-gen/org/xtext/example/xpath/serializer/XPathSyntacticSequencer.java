package org.xtext.example.xpath.serializer;

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
import org.xtext.example.xpath.services.XPathGrammarAccess;

@SuppressWarnings("all")
public class XPathSyntacticSequencer extends AbstractSyntacticSequencer {

	protected XPathGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ElementTest_QuestionMarkKeyword_3_1_2_q;
	protected AbstractElementAlias match_QuantifiedExpr_EveryKeyword_0_1_or_SomeKeyword_0_0;
	protected AbstractElementAlias match_SingleType_QuestionMarkKeyword_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XPathGrammarAccess) access;
		match_ElementTest_QuestionMarkKeyword_3_1_2_q = new TokenAlias(false, true, grammarAccess.getElementTestAccess().getQuestionMarkKeyword_3_1_2());
		match_QuantifiedExpr_EveryKeyword_0_1_or_SomeKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getQuantifiedExprAccess().getEveryKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getQuantifiedExprAccess().getSomeKeyword_0_0()));
		match_SingleType_QuestionMarkKeyword_1_q = new TokenAlias(false, true, grammarAccess.getSingleTypeAccess().getQuestionMarkKeyword_1());
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
			if(match_ElementTest_QuestionMarkKeyword_3_1_2_q.equals(syntax))
				emit_ElementTest_QuestionMarkKeyword_3_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_QuantifiedExpr_EveryKeyword_0_1_or_SomeKeyword_0_0.equals(syntax))
				emit_QuantifiedExpr_EveryKeyword_0_1_or_SomeKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SingleType_QuestionMarkKeyword_1_q.equals(syntax))
				emit_SingleType_QuestionMarkKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '?'?
	 */
	protected void emit_ElementTest_QuestionMarkKeyword_3_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'some' | 'every'
	 */
	protected void emit_QuantifiedExpr_EveryKeyword_0_1_or_SomeKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '?'?
	 */
	protected void emit_SingleType_QuestionMarkKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
