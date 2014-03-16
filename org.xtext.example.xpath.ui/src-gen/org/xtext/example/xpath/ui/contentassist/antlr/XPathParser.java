/*
* generated by Xtext
*/
package org.xtext.example.xpath.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.xpath.services.XPathGrammarAccess;

public class XPathParser extends AbstractContentAssistParser {
	
	@Inject
	private XPathGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.xpath.ui.contentassist.antlr.internal.InternalXPathParser createParser() {
		org.xtext.example.xpath.ui.contentassist.antlr.internal.InternalXPathParser result = new org.xtext.example.xpath.ui.contentassist.antlr.internal.InternalXPathParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExprSingleAccess().getAlternatives(), "rule__ExprSingle__Alternatives");
					put(grammarAccess.getQuantifiedExprAccess().getAlternatives_0(), "rule__QuantifiedExpr__Alternatives_0");
					put(grammarAccess.getComparisonExprAccess().getAlternatives_1_0(), "rule__ComparisonExpr__Alternatives_1_0");
					put(grammarAccess.getAdditiveExprAccess().getAlternatives_1_0(), "rule__AdditiveExpr__Alternatives_1_0");
					put(grammarAccess.getMultiplicativeExprAccess().getAlternatives_1_0(), "rule__MultiplicativeExpr__Alternatives_1_0");
					put(grammarAccess.getUnionExprAccess().getAlternatives_1_0(), "rule__UnionExpr__Alternatives_1_0");
					put(grammarAccess.getIntersectExceptExprAccess().getAlternatives_1_0(), "rule__IntersectExceptExpr__Alternatives_1_0");
					put(grammarAccess.getUnaryExprAccess().getAlternatives_0(), "rule__UnaryExpr__Alternatives_0");
					put(grammarAccess.getPathExprAccess().getAlternatives(), "rule__PathExpr__Alternatives");
					put(grammarAccess.getExtraStepExprAccess().getAlternatives(), "rule__ExtraStepExpr__Alternatives");
					put(grammarAccess.getStepExprAccess().getAlternatives(), "rule__StepExpr__Alternatives");
					put(grammarAccess.getAxisStepAccess().getAlternatives_0(), "rule__AxisStep__Alternatives_0");
					put(grammarAccess.getForwardStepAccess().getAlternatives(), "rule__ForwardStep__Alternatives");
					put(grammarAccess.getReverseStepAccess().getAlternatives(), "rule__ReverseStep__Alternatives");
					put(grammarAccess.getNodeTestAccess().getAlternatives(), "rule__NodeTest__Alternatives");
					put(grammarAccess.getNameTestAccess().getAlternatives(), "rule__NameTest__Alternatives");
					put(grammarAccess.getWildcardAccess().getAlternatives(), "rule__Wildcard__Alternatives");
					put(grammarAccess.getPrimaryExprAccess().getAlternatives(), "rule__PrimaryExpr__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getNumericLiteralAccess().getAlternatives(), "rule__NumericLiteral__Alternatives");
					put(grammarAccess.getSequenceTypeAccess().getAlternatives(), "rule__SequenceType__Alternatives");
					put(grammarAccess.getOccurenceIndicatorAccess().getAlternatives(), "rule__OccurenceIndicator__Alternatives");
					put(grammarAccess.getItemTypeAccess().getAlternatives(), "rule__ItemType__Alternatives");
					put(grammarAccess.getKindTestAccess().getAlternatives(), "rule__KindTest__Alternatives");
					put(grammarAccess.getDocumentTestAccess().getAlternatives_3(), "rule__DocumentTest__Alternatives_3");
					put(grammarAccess.getPITestAccess().getAlternatives_3(), "rule__PITest__Alternatives_3");
					put(grammarAccess.getAttribNameOrWildcardAccess().getAlternatives(), "rule__AttribNameOrWildcard__Alternatives");
					put(grammarAccess.getElementNameOrWildcardAccess().getAlternatives(), "rule__ElementNameOrWildcard__Alternatives");
					put(grammarAccess.getQNameAccess().getAlternatives(), "rule__QName__Alternatives");
					put(grammarAccess.getExprAccess().getGroup(), "rule__Expr__Group__0");
					put(grammarAccess.getExprAccess().getGroup_1(), "rule__Expr__Group_1__0");
					put(grammarAccess.getForExprAccess().getGroup(), "rule__ForExpr__Group__0");
					put(grammarAccess.getSimpleForClauseAccess().getGroup(), "rule__SimpleForClause__Group__0");
					put(grammarAccess.getAdditionalInAccess().getGroup(), "rule__AdditionalIn__Group__0");
					put(grammarAccess.getQuantifiedExprAccess().getGroup(), "rule__QuantifiedExpr__Group__0");
					put(grammarAccess.getIfExprAccess().getGroup(), "rule__IfExpr__Group__0");
					put(grammarAccess.getOrExprAccess().getGroup(), "rule__OrExpr__Group__0");
					put(grammarAccess.getOrExprAccess().getGroup_1(), "rule__OrExpr__Group_1__0");
					put(grammarAccess.getAndExprAccess().getGroup(), "rule__AndExpr__Group__0");
					put(grammarAccess.getAndExprAccess().getGroup_1(), "rule__AndExpr__Group_1__0");
					put(grammarAccess.getComparisonExprAccess().getGroup(), "rule__ComparisonExpr__Group__0");
					put(grammarAccess.getComparisonExprAccess().getGroup_1(), "rule__ComparisonExpr__Group_1__0");
					put(grammarAccess.getRangeExprAccess().getGroup(), "rule__RangeExpr__Group__0");
					put(grammarAccess.getRangeExprAccess().getGroup_1(), "rule__RangeExpr__Group_1__0");
					put(grammarAccess.getAdditiveExprAccess().getGroup(), "rule__AdditiveExpr__Group__0");
					put(grammarAccess.getAdditiveExprAccess().getGroup_1(), "rule__AdditiveExpr__Group_1__0");
					put(grammarAccess.getMultiplicativeExprAccess().getGroup(), "rule__MultiplicativeExpr__Group__0");
					put(grammarAccess.getMultiplicativeExprAccess().getGroup_1(), "rule__MultiplicativeExpr__Group_1__0");
					put(grammarAccess.getUnionExprAccess().getGroup(), "rule__UnionExpr__Group__0");
					put(grammarAccess.getUnionExprAccess().getGroup_1(), "rule__UnionExpr__Group_1__0");
					put(grammarAccess.getIntersectExceptExprAccess().getGroup(), "rule__IntersectExceptExpr__Group__0");
					put(grammarAccess.getIntersectExceptExprAccess().getGroup_1(), "rule__IntersectExceptExpr__Group_1__0");
					put(grammarAccess.getInstanceofExprAccess().getGroup(), "rule__InstanceofExpr__Group__0");
					put(grammarAccess.getInstanceofExprAccess().getGroup_1(), "rule__InstanceofExpr__Group_1__0");
					put(grammarAccess.getTreatExprAccess().getGroup(), "rule__TreatExpr__Group__0");
					put(grammarAccess.getTreatExprAccess().getGroup_1(), "rule__TreatExpr__Group_1__0");
					put(grammarAccess.getCastableExprAccess().getGroup(), "rule__CastableExpr__Group__0");
					put(grammarAccess.getCastableExprAccess().getGroup_1(), "rule__CastableExpr__Group_1__0");
					put(grammarAccess.getCastExprAccess().getGroup(), "rule__CastExpr__Group__0");
					put(grammarAccess.getCastExprAccess().getGroup_1(), "rule__CastExpr__Group_1__0");
					put(grammarAccess.getUnaryExprAccess().getGroup(), "rule__UnaryExpr__Group__0");
					put(grammarAccess.getPathExprAccess().getGroup_0(), "rule__PathExpr__Group_0__0");
					put(grammarAccess.getPathExprAccess().getGroup_1(), "rule__PathExpr__Group_1__0");
					put(grammarAccess.getPathExprAccess().getGroup_2(), "rule__PathExpr__Group_2__0");
					put(grammarAccess.getRelativePathExprAccess().getGroup(), "rule__RelativePathExpr__Group__0");
					put(grammarAccess.getExtraStepExprAccess().getGroup_0(), "rule__ExtraStepExpr__Group_0__0");
					put(grammarAccess.getExtraStepExprAccess().getGroup_1(), "rule__ExtraStepExpr__Group_1__0");
					put(grammarAccess.getAxisStepAccess().getGroup(), "rule__AxisStep__Group__0");
					put(grammarAccess.getForwardStepAccess().getGroup_0(), "rule__ForwardStep__Group_0__0");
					put(grammarAccess.getAbbrevForwardStepAccess().getGroup(), "rule__AbbrevForwardStep__Group__0");
					put(grammarAccess.getReverseStepAccess().getGroup_0(), "rule__ReverseStep__Group_0__0");
					put(grammarAccess.getWildcardAccess().getGroup_1(), "rule__Wildcard__Group_1__0");
					put(grammarAccess.getWildcardAccess().getGroup_2(), "rule__Wildcard__Group_2__0");
					put(grammarAccess.getFilterExprAccess().getGroup(), "rule__FilterExpr__Group__0");
					put(grammarAccess.getPredicateListAccess().getGroup(), "rule__PredicateList__Group__0");
					put(grammarAccess.getPredicateAccess().getGroup(), "rule__Predicate__Group__0");
					put(grammarAccess.getVarRefAccess().getGroup(), "rule__VarRef__Group__0");
					put(grammarAccess.getParenthesizedExprAccess().getGroup(), "rule__ParenthesizedExpr__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_2(), "rule__FunctionCall__Group_2__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_2_1(), "rule__FunctionCall__Group_2_1__0");
					put(grammarAccess.getSingleTypeAccess().getGroup(), "rule__SingleType__Group__0");
					put(grammarAccess.getSequenceTypeAccess().getGroup_1(), "rule__SequenceType__Group_1__0");
					put(grammarAccess.getDocumentTestAccess().getGroup(), "rule__DocumentTest__Group__0");
					put(grammarAccess.getPITestAccess().getGroup(), "rule__PITest__Group__0");
					put(grammarAccess.getAttributeTestAccess().getGroup(), "rule__AttributeTest__Group__0");
					put(grammarAccess.getAttributeTestAccess().getGroup_3(), "rule__AttributeTest__Group_3__0");
					put(grammarAccess.getAttributeTestAccess().getGroup_3_1(), "rule__AttributeTest__Group_3_1__0");
					put(grammarAccess.getAttribNameOrWildcardAccess().getGroup_1(), "rule__AttribNameOrWildcard__Group_1__0");
					put(grammarAccess.getSchemaAttributeTestAccess().getGroup(), "rule__SchemaAttributeTest__Group__0");
					put(grammarAccess.getElementTestAccess().getGroup(), "rule__ElementTest__Group__0");
					put(grammarAccess.getElementTestAccess().getGroup_3(), "rule__ElementTest__Group_3__0");
					put(grammarAccess.getElementTestAccess().getGroup_3_1(), "rule__ElementTest__Group_3_1__0");
					put(grammarAccess.getElementNameOrWildcardAccess().getGroup_1(), "rule__ElementNameOrWildcard__Group_1__0");
					put(grammarAccess.getSchemaElementTestAccess().getGroup(), "rule__SchemaElementTest__Group__0");
					put(grammarAccess.getPrefixedNameAccess().getGroup(), "rule__PrefixedName__Group__0");
					put(grammarAccess.getExprAccess().getExprSingleAssignment_0(), "rule__Expr__ExprSingleAssignment_0");
					put(grammarAccess.getExprAccess().getExprsSingleAssignment_1_1(), "rule__Expr__ExprsSingleAssignment_1_1");
					put(grammarAccess.getForExprAccess().getForAssignment_0(), "rule__ForExpr__ForAssignment_0");
					put(grammarAccess.getForExprAccess().getReturnAssignment_2(), "rule__ForExpr__ReturnAssignment_2");
					put(grammarAccess.getSimpleForClauseAccess().getForVarAssignment_2(), "rule__SimpleForClause__ForVarAssignment_2");
					put(grammarAccess.getSimpleForClauseAccess().getInAssignment_4(), "rule__SimpleForClause__InAssignment_4");
					put(grammarAccess.getSimpleForClauseAccess().getAdditionalInAssignment_5(), "rule__SimpleForClause__AdditionalInAssignment_5");
					put(grammarAccess.getAdditionalInAccess().getVariableAssignment_2(), "rule__AdditionalIn__VariableAssignment_2");
					put(grammarAccess.getAdditionalInAccess().getInAssignment_4(), "rule__AdditionalIn__InAssignment_4");
					put(grammarAccess.getQuantifiedExprAccess().getVariableAssignment_2(), "rule__QuantifiedExpr__VariableAssignment_2");
					put(grammarAccess.getQuantifiedExprAccess().getInAssignment_4(), "rule__QuantifiedExpr__InAssignment_4");
					put(grammarAccess.getQuantifiedExprAccess().getAdditionalInAssignment_5(), "rule__QuantifiedExpr__AdditionalInAssignment_5");
					put(grammarAccess.getQuantifiedExprAccess().getSatisfyAssignment_7(), "rule__QuantifiedExpr__SatisfyAssignment_7");
					put(grammarAccess.getIfExprAccess().getIfAssignment_2(), "rule__IfExpr__IfAssignment_2");
					put(grammarAccess.getIfExprAccess().getThenAssignment_5(), "rule__IfExpr__ThenAssignment_5");
					put(grammarAccess.getIfExprAccess().getElseAssignment_7(), "rule__IfExpr__ElseAssignment_7");
					put(grammarAccess.getOrExprAccess().getLeftAssignment_0(), "rule__OrExpr__LeftAssignment_0");
					put(grammarAccess.getOrExprAccess().getRightsAssignment_1_1(), "rule__OrExpr__RightsAssignment_1_1");
					put(grammarAccess.getAndExprAccess().getLeftAssignment_0(), "rule__AndExpr__LeftAssignment_0");
					put(grammarAccess.getAndExprAccess().getRightsAssignment_1_1(), "rule__AndExpr__RightsAssignment_1_1");
					put(grammarAccess.getComparisonExprAccess().getRangeAssignment_0(), "rule__ComparisonExpr__RangeAssignment_0");
					put(grammarAccess.getComparisonExprAccess().getValueAssignment_1_0_0(), "rule__ComparisonExpr__ValueAssignment_1_0_0");
					put(grammarAccess.getComparisonExprAccess().getGenAssignment_1_0_1(), "rule__ComparisonExpr__GenAssignment_1_0_1");
					put(grammarAccess.getComparisonExprAccess().getNodeAssignment_1_0_2(), "rule__ComparisonExpr__NodeAssignment_1_0_2");
					put(grammarAccess.getComparisonExprAccess().getOtherRangeAssignment_1_1(), "rule__ComparisonExpr__OtherRangeAssignment_1_1");
					put(grammarAccess.getRangeExprAccess().getFromAssignment_0(), "rule__RangeExpr__FromAssignment_0");
					put(grammarAccess.getRangeExprAccess().getToAssignment_1_1(), "rule__RangeExpr__ToAssignment_1_1");
					put(grammarAccess.getAdditiveExprAccess().getLeftAssignment_0(), "rule__AdditiveExpr__LeftAssignment_0");
					put(grammarAccess.getAdditiveExprAccess().getRightsAssignment_1_1(), "rule__AdditiveExpr__RightsAssignment_1_1");
					put(grammarAccess.getMultiplicativeExprAccess().getLeftAssignment_0(), "rule__MultiplicativeExpr__LeftAssignment_0");
					put(grammarAccess.getMultiplicativeExprAccess().getRightsAssignment_1_1(), "rule__MultiplicativeExpr__RightsAssignment_1_1");
					put(grammarAccess.getUnionExprAccess().getLeftAssignment_0(), "rule__UnionExpr__LeftAssignment_0");
					put(grammarAccess.getUnionExprAccess().getRightsAssignment_1_1(), "rule__UnionExpr__RightsAssignment_1_1");
					put(grammarAccess.getIntersectExceptExprAccess().getLeftAssignment_0(), "rule__IntersectExceptExpr__LeftAssignment_0");
					put(grammarAccess.getIntersectExceptExprAccess().getRightsAssignment_1_1(), "rule__IntersectExceptExpr__RightsAssignment_1_1");
					put(grammarAccess.getInstanceofExprAccess().getLeftAssignment_0(), "rule__InstanceofExpr__LeftAssignment_0");
					put(grammarAccess.getInstanceofExprAccess().getRightAssignment_1_2(), "rule__InstanceofExpr__RightAssignment_1_2");
					put(grammarAccess.getTreatExprAccess().getLeftAssignment_0(), "rule__TreatExpr__LeftAssignment_0");
					put(grammarAccess.getTreatExprAccess().getRightAssignment_1_2(), "rule__TreatExpr__RightAssignment_1_2");
					put(grammarAccess.getCastableExprAccess().getLeftAssignment_0(), "rule__CastableExpr__LeftAssignment_0");
					put(grammarAccess.getCastableExprAccess().getRightAssignment_1_2(), "rule__CastableExpr__RightAssignment_1_2");
					put(grammarAccess.getCastExprAccess().getLeftAssignment_0(), "rule__CastExpr__LeftAssignment_0");
					put(grammarAccess.getCastExprAccess().getRightAssignment_1_2(), "rule__CastExpr__RightAssignment_1_2");
					put(grammarAccess.getUnaryExprAccess().getUnaryAssignment_1(), "rule__UnaryExpr__UnaryAssignment_1");
					put(grammarAccess.getValueExprAccess().getValueAssignment(), "rule__ValueExpr__ValueAssignment");
					put(grammarAccess.getRelativePathExprAccess().getStepAssignment_0(), "rule__RelativePathExpr__StepAssignment_0");
					put(grammarAccess.getRelativePathExprAccess().getExtraStepsAssignment_1(), "rule__RelativePathExpr__ExtraStepsAssignment_1");
					put(grammarAccess.getAxisStepAccess().getStepAssignment_0_0(), "rule__AxisStep__StepAssignment_0_0");
					put(grammarAccess.getAxisStepAccess().getStepAssignment_0_1(), "rule__AxisStep__StepAssignment_0_1");
					put(grammarAccess.getAxisStepAccess().getPredicateListAssignment_1(), "rule__AxisStep__PredicateListAssignment_1");
					put(grammarAccess.getForwardStepAccess().getForwardAssignment_0_0(), "rule__ForwardStep__ForwardAssignment_0_0");
					put(grammarAccess.getForwardStepAccess().getTestAssignment_0_1(), "rule__ForwardStep__TestAssignment_0_1");
					put(grammarAccess.getForwardStepAccess().getAbbrForwardAssignment_1(), "rule__ForwardStep__AbbrForwardAssignment_1");
					put(grammarAccess.getAbbrevForwardStepAccess().getAttrAssignment_0(), "rule__AbbrevForwardStep__AttrAssignment_0");
					put(grammarAccess.getAbbrevForwardStepAccess().getTestAssignment_1(), "rule__AbbrevForwardStep__TestAssignment_1");
					put(grammarAccess.getReverseStepAccess().getReverseAssignment_0_0(), "rule__ReverseStep__ReverseAssignment_0_0");
					put(grammarAccess.getReverseStepAccess().getTestAssignment_0_1(), "rule__ReverseStep__TestAssignment_0_1");
					put(grammarAccess.getReverseStepAccess().getAbbrRevSetAssignment_1(), "rule__ReverseStep__AbbrRevSetAssignment_1");
					put(grammarAccess.getNodeTestAccess().getTestAssignment_0(), "rule__NodeTest__TestAssignment_0");
					put(grammarAccess.getNodeTestAccess().getTestAssignment_1(), "rule__NodeTest__TestAssignment_1");
					put(grammarAccess.getNameTestAccess().getQNameAssignment_0(), "rule__NameTest__QNameAssignment_0");
					put(grammarAccess.getNameTestAccess().getWildcardAssignment_1(), "rule__NameTest__WildcardAssignment_1");
					put(grammarAccess.getWildcardAccess().getWildAssignment_0(), "rule__Wildcard__WildAssignment_0");
					put(grammarAccess.getWildcardAccess().getLeftAssignment_1_0(), "rule__Wildcard__LeftAssignment_1_0");
					put(grammarAccess.getWildcardAccess().getRightAssignment_2_2(), "rule__Wildcard__RightAssignment_2_2");
					put(grammarAccess.getFilterExprAccess().getPrimaryAssignment_0(), "rule__FilterExpr__PrimaryAssignment_0");
					put(grammarAccess.getFilterExprAccess().getPredicateListAssignment_1(), "rule__FilterExpr__PredicateListAssignment_1");
					put(grammarAccess.getPredicateListAccess().getPredicatesAssignment_1(), "rule__PredicateList__PredicatesAssignment_1");
					put(grammarAccess.getPredicateAccess().getExprAssignment_1(), "rule__Predicate__ExprAssignment_1");
					put(grammarAccess.getPrimaryExprAccess().getLiteralAssignment_0(), "rule__PrimaryExpr__LiteralAssignment_0");
					put(grammarAccess.getPrimaryExprAccess().getVarRefAssignment_1(), "rule__PrimaryExpr__VarRefAssignment_1");
					put(grammarAccess.getPrimaryExprAccess().getParExprAssignment_2(), "rule__PrimaryExpr__ParExprAssignment_2");
					put(grammarAccess.getPrimaryExprAccess().getConItemExprAssignment_3(), "rule__PrimaryExpr__ConItemExprAssignment_3");
					put(grammarAccess.getPrimaryExprAccess().getFunctionCallAssignment_4(), "rule__PrimaryExpr__FunctionCallAssignment_4");
					put(grammarAccess.getLiteralAccess().getNumAssignment_0(), "rule__Literal__NumAssignment_0");
					put(grammarAccess.getLiteralAccess().getStringAssignment_1(), "rule__Literal__StringAssignment_1");
					put(grammarAccess.getNumericLiteralAccess().getIntLitAssignment_0(), "rule__NumericLiteral__IntLitAssignment_0");
					put(grammarAccess.getNumericLiteralAccess().getDecLitAssignment_1(), "rule__NumericLiteral__DecLitAssignment_1");
					put(grammarAccess.getNumericLiteralAccess().getDoubleLitAssignment_2(), "rule__NumericLiteral__DoubleLitAssignment_2");
					put(grammarAccess.getVarNameAccess().getQNameAssignment(), "rule__VarName__QNameAssignment");
					put(grammarAccess.getParenthesizedExprAccess().getExprAssignment_2(), "rule__ParenthesizedExpr__ExprAssignment_2");
					put(grammarAccess.getFunctionCallAccess().getQNameAssignment_0(), "rule__FunctionCall__QNameAssignment_0");
					put(grammarAccess.getFunctionCallAccess().getExprAssignment_2_0(), "rule__FunctionCall__ExprAssignment_2_0");
					put(grammarAccess.getFunctionCallAccess().getExprsAssignment_2_1_1(), "rule__FunctionCall__ExprsAssignment_2_1_1");
					put(grammarAccess.getSequenceTypeAccess().getEmptyAssignment_0(), "rule__SequenceType__EmptyAssignment_0");
					put(grammarAccess.getSequenceTypeAccess().getItemTypeAssignment_1_0(), "rule__SequenceType__ItemTypeAssignment_1_0");
					put(grammarAccess.getSequenceTypeAccess().getOccIndAssignment_1_1(), "rule__SequenceType__OccIndAssignment_1_1");
					put(grammarAccess.getItemTypeAccess().getKindTestAssignment_0(), "rule__ItemType__KindTestAssignment_0");
					put(grammarAccess.getItemTypeAccess().getEmptyAssignment_1(), "rule__ItemType__EmptyAssignment_1");
					put(grammarAccess.getItemTypeAccess().getAtomicTypeAssignment_2(), "rule__ItemType__AtomicTypeAssignment_2");
					put(grammarAccess.getAtomicTypeAccess().getTypeAssignment(), "rule__AtomicType__TypeAssignment");
					put(grammarAccess.getKindTestAccess().getDocTestAssignment_0(), "rule__KindTest__DocTestAssignment_0");
					put(grammarAccess.getKindTestAccess().getElemTestAssignment_1(), "rule__KindTest__ElemTestAssignment_1");
					put(grammarAccess.getKindTestAccess().getAttributeTestAssignment_2(), "rule__KindTest__AttributeTestAssignment_2");
					put(grammarAccess.getKindTestAccess().getSchemaElemTestAssignment_3(), "rule__KindTest__SchemaElemTestAssignment_3");
					put(grammarAccess.getKindTestAccess().getSchemaAttributeTestAssignment_4(), "rule__KindTest__SchemaAttributeTestAssignment_4");
					put(grammarAccess.getKindTestAccess().getPitTestAssignment_5(), "rule__KindTest__PitTestAssignment_5");
					put(grammarAccess.getKindTestAccess().getCommentTestAssignment_6(), "rule__KindTest__CommentTestAssignment_6");
					put(grammarAccess.getKindTestAccess().getTextTestAssignment_7(), "rule__KindTest__TextTestAssignment_7");
					put(grammarAccess.getKindTestAccess().getAnyKindTestAssignment_8(), "rule__KindTest__AnyKindTestAssignment_8");
					put(grammarAccess.getDocumentTestAccess().getElemTestAssignment_3_0(), "rule__DocumentTest__ElemTestAssignment_3_0");
					put(grammarAccess.getDocumentTestAccess().getSchemaElemTestAssignment_3_1(), "rule__DocumentTest__SchemaElemTestAssignment_3_1");
					put(grammarAccess.getPITestAccess().getNcNameAssignment_3_0(), "rule__PITest__NcNameAssignment_3_0");
					put(grammarAccess.getPITestAccess().getStringAssignment_3_1(), "rule__PITest__StringAssignment_3_1");
					put(grammarAccess.getAttributeTestAccess().getAttrOrWildAssignment_3_0(), "rule__AttributeTest__AttrOrWildAssignment_3_0");
					put(grammarAccess.getAttributeTestAccess().getTypeNameAssignment_3_1_1(), "rule__AttributeTest__TypeNameAssignment_3_1_1");
					put(grammarAccess.getAttribNameOrWildcardAccess().getAttNameAssignment_0(), "rule__AttribNameOrWildcard__AttNameAssignment_0");
					put(grammarAccess.getSchemaAttributeTestAccess().getAttDecAssignment_2(), "rule__SchemaAttributeTest__AttDecAssignment_2");
					put(grammarAccess.getAttributeDeclarationAccess().getAttNameAssignment(), "rule__AttributeDeclaration__AttNameAssignment");
					put(grammarAccess.getElementTestAccess().getElemOrWildAssignment_3_0(), "rule__ElementTest__ElemOrWildAssignment_3_0");
					put(grammarAccess.getElementTestAccess().getTypeNameAssignment_3_1_1(), "rule__ElementTest__TypeNameAssignment_3_1_1");
					put(grammarAccess.getElementNameOrWildcardAccess().getElemNameAssignment_0(), "rule__ElementNameOrWildcard__ElemNameAssignment_0");
					put(grammarAccess.getSchemaElementTestAccess().getElemDecAssignment_2(), "rule__SchemaElementTest__ElemDecAssignment_2");
					put(grammarAccess.getAttributeNameAccess().getQNameAssignment(), "rule__AttributeName__QNameAssignment");
					put(grammarAccess.getElementNameAccess().getQNameAssignment(), "rule__ElementName__QNameAssignment");
					put(grammarAccess.getTypeNameAccess().getQNameAssignment(), "rule__TypeName__QNameAssignment");
					put(grammarAccess.getNCNameAccess().getNcNameAssignment(), "rule__NCName__NcNameAssignment");
					put(grammarAccess.getPrefixedNameAccess().getPrefixAssignment_0(), "rule__PrefixedName__PrefixAssignment_0");
					put(grammarAccess.getPrefixedNameAccess().getLocalPartAssignment_2(), "rule__PrefixedName__LocalPartAssignment_2");
					put(grammarAccess.getUnprefixedNameAccess().getLocalPartAssignment(), "rule__UnprefixedName__LocalPartAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.xpath.ui.contentassist.antlr.internal.InternalXPathParser typedParser = (org.xtext.example.xpath.ui.contentassist.antlr.internal.InternalXPathParser) parser;
			typedParser.entryRuleExpr();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS" };
	}
	
	public XPathGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XPathGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
