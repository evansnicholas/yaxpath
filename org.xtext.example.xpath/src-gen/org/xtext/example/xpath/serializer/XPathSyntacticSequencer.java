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
	protected AbstractElementAlias match_AdditiveExpr_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0;
	protected AbstractElementAlias match_ElementTest_QuestionMarkKeyword_3_1_2_q;
	protected AbstractElementAlias match_IntersectExceptExpr_ExceptKeyword_1_0_1_or_IntersectKeyword_1_0_0;
	protected AbstractElementAlias match_MultiplicativeExpr_AsteriskKeyword_1_0_0_or_DivKeyword_1_0_1_or_IdivKeyword_1_0_2_or_ModKeyword_1_0_3;
	protected AbstractElementAlias match_QuantifiedExpr_EveryKeyword_0_1_or_SomeKeyword_0_0;
	protected AbstractElementAlias match_SingleType_QuestionMarkKeyword_1_q;
	protected AbstractElementAlias match_UnaryExpr___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__a;
	protected AbstractElementAlias match_UnionExpr_UnionKeyword_1_0_0_or_VerticalLineKeyword_1_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XPathGrammarAccess) access;
		match_AdditiveExpr_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAdditiveExprAccess().getHyphenMinusKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getAdditiveExprAccess().getPlusSignKeyword_1_0_0()));
		match_ElementTest_QuestionMarkKeyword_3_1_2_q = new TokenAlias(false, true, grammarAccess.getElementTestAccess().getQuestionMarkKeyword_3_1_2());
		match_IntersectExceptExpr_ExceptKeyword_1_0_1_or_IntersectKeyword_1_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIntersectExceptExprAccess().getExceptKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getIntersectExceptExprAccess().getIntersectKeyword_1_0_0()));
		match_MultiplicativeExpr_AsteriskKeyword_1_0_0_or_DivKeyword_1_0_1_or_IdivKeyword_1_0_2_or_ModKeyword_1_0_3 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMultiplicativeExprAccess().getAsteriskKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getMultiplicativeExprAccess().getDivKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getMultiplicativeExprAccess().getIdivKeyword_1_0_2()), new TokenAlias(false, false, grammarAccess.getMultiplicativeExprAccess().getModKeyword_1_0_3()));
		match_QuantifiedExpr_EveryKeyword_0_1_or_SomeKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getQuantifiedExprAccess().getEveryKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getQuantifiedExprAccess().getSomeKeyword_0_0()));
		match_SingleType_QuestionMarkKeyword_1_q = new TokenAlias(false, true, grammarAccess.getSingleTypeAccess().getQuestionMarkKeyword_1());
		match_UnaryExpr___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getUnaryExprAccess().getHyphenMinusKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getUnaryExprAccess().getPlusSignKeyword_0_1()));
		match_UnionExpr_UnionKeyword_1_0_0_or_VerticalLineKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getUnionExprAccess().getUnionKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getUnionExprAccess().getVerticalLineKeyword_1_0_1()));
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
			if(match_AdditiveExpr_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0.equals(syntax))
				emit_AdditiveExpr_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ElementTest_QuestionMarkKeyword_3_1_2_q.equals(syntax))
				emit_ElementTest_QuestionMarkKeyword_3_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IntersectExceptExpr_ExceptKeyword_1_0_1_or_IntersectKeyword_1_0_0.equals(syntax))
				emit_IntersectExceptExpr_ExceptKeyword_1_0_1_or_IntersectKeyword_1_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MultiplicativeExpr_AsteriskKeyword_1_0_0_or_DivKeyword_1_0_1_or_IdivKeyword_1_0_2_or_ModKeyword_1_0_3.equals(syntax))
				emit_MultiplicativeExpr_AsteriskKeyword_1_0_0_or_DivKeyword_1_0_1_or_IdivKeyword_1_0_2_or_ModKeyword_1_0_3(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_QuantifiedExpr_EveryKeyword_0_1_or_SomeKeyword_0_0.equals(syntax))
				emit_QuantifiedExpr_EveryKeyword_0_1_or_SomeKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SingleType_QuestionMarkKeyword_1_q.equals(syntax))
				emit_SingleType_QuestionMarkKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UnaryExpr___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__a.equals(syntax))
				emit_UnaryExpr___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UnionExpr_UnionKeyword_1_0_0_or_VerticalLineKeyword_1_0_1.equals(syntax))
				emit_UnionExpr_UnionKeyword_1_0_0_or_VerticalLineKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '+' | '-'
	 */
	protected void emit_AdditiveExpr_HyphenMinusKeyword_1_0_1_or_PlusSignKeyword_1_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
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
	 *     'intersect' | 'except'
	 */
	protected void emit_IntersectExceptExpr_ExceptKeyword_1_0_1_or_IntersectKeyword_1_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'mod' | 'div' | 'idiv' | '*'
	 */
	protected void emit_MultiplicativeExpr_AsteriskKeyword_1_0_0_or_DivKeyword_1_0_1_or_IdivKeyword_1_0_2_or_ModKeyword_1_0_3(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	
	/**
	 * Syntax:
	 *     ('-' | '+')*
	 */
	protected void emit_UnaryExpr___HyphenMinusKeyword_0_0_or_PlusSignKeyword_0_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '|' | 'union'
	 */
	protected void emit_UnionExpr_UnionKeyword_1_0_0_or_VerticalLineKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
