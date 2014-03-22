package org.xtext.example.xpath.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.xpath.services.XPathGrammarAccess;
import org.xtext.example.xpath.xPath.Addition;
import org.xtext.example.xpath.xPath.AdditionalIn;
import org.xtext.example.xpath.xPath.AndExpr;
import org.xtext.example.xpath.xPath.AtomicType;
import org.xtext.example.xpath.xPath.AttribNameOrWildcard;
import org.xtext.example.xpath.xPath.Attribute;
import org.xtext.example.xpath.xPath.AttributeDeclaration;
import org.xtext.example.xpath.xPath.AttributeName;
import org.xtext.example.xpath.xPath.AttributeTest;
import org.xtext.example.xpath.xPath.AxisStep;
import org.xtext.example.xpath.xPath.CastAs;
import org.xtext.example.xpath.xPath.Castable;
import org.xtext.example.xpath.xPath.ComparisonExpr;
import org.xtext.example.xpath.xPath.Division;
import org.xtext.example.xpath.xPath.DocumentTest;
import org.xtext.example.xpath.xPath.Element;
import org.xtext.example.xpath.xPath.ElementName;
import org.xtext.example.xpath.xPath.ElementNameOrWildcard;
import org.xtext.example.xpath.xPath.ElementTest;
import org.xtext.example.xpath.xPath.Except;
import org.xtext.example.xpath.xPath.Expr;
import org.xtext.example.xpath.xPath.FilterExpr;
import org.xtext.example.xpath.xPath.ForExpr;
import org.xtext.example.xpath.xPath.ForwardAxis;
import org.xtext.example.xpath.xPath.ForwardStep;
import org.xtext.example.xpath.xPath.FunctionCall;
import org.xtext.example.xpath.xPath.GeneralComp;
import org.xtext.example.xpath.xPath.IDivision;
import org.xtext.example.xpath.xPath.IfExpr;
import org.xtext.example.xpath.xPath.Instanceof;
import org.xtext.example.xpath.xPath.Intersect;
import org.xtext.example.xpath.xPath.ItemType;
import org.xtext.example.xpath.xPath.KindTest;
import org.xtext.example.xpath.xPath.Literal;
import org.xtext.example.xpath.xPath.Mod;
import org.xtext.example.xpath.xPath.Multiplication;
import org.xtext.example.xpath.xPath.NCName;
import org.xtext.example.xpath.xPath.NameTest;
import org.xtext.example.xpath.xPath.NodeComp;
import org.xtext.example.xpath.xPath.NodeTest;
import org.xtext.example.xpath.xPath.NumericLiteral;
import org.xtext.example.xpath.xPath.OrExpr;
import org.xtext.example.xpath.xPath.PITTest;
import org.xtext.example.xpath.xPath.ParenthesizedExpr;
import org.xtext.example.xpath.xPath.Pipe;
import org.xtext.example.xpath.xPath.Predicate;
import org.xtext.example.xpath.xPath.PredicateList;
import org.xtext.example.xpath.xPath.PrefixedName;
import org.xtext.example.xpath.xPath.PrimaryExpr;
import org.xtext.example.xpath.xPath.QuantifiedExpr;
import org.xtext.example.xpath.xPath.RangeExpr;
import org.xtext.example.xpath.xPath.RelDouble;
import org.xtext.example.xpath.xPath.RelNoSelector;
import org.xtext.example.xpath.xPath.RelSingle;
import org.xtext.example.xpath.xPath.RelativePathExpr;
import org.xtext.example.xpath.xPath.ReverseStep;
import org.xtext.example.xpath.xPath.SchemaAttributeTest;
import org.xtext.example.xpath.xPath.SchemaElementTest;
import org.xtext.example.xpath.xPath.SequenceType;
import org.xtext.example.xpath.xPath.SimpleForClause;
import org.xtext.example.xpath.xPath.Single;
import org.xtext.example.xpath.xPath.StepExpr;
import org.xtext.example.xpath.xPath.Substraction;
import org.xtext.example.xpath.xPath.TreatAs;
import org.xtext.example.xpath.xPath.TypeName;
import org.xtext.example.xpath.xPath.UnaryExpr;
import org.xtext.example.xpath.xPath.Union;
import org.xtext.example.xpath.xPath.UnprefixedName;
import org.xtext.example.xpath.xPath.ValueComp;
import org.xtext.example.xpath.xPath.ValueExpr;
import org.xtext.example.xpath.xPath.VarName;
import org.xtext.example.xpath.xPath.Wildcard;
import org.xtext.example.xpath.xPath.XPathPackage;
import org.xtext.example.xpath.xPath.Xpath;

@SuppressWarnings("all")
public class XPathSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XPathGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == XPathPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XPathPackage.ADDITION:
				if(context == grammarAccess.getAdditiveExprRule() ||
				   context == grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0()) {
					sequence_AdditiveExpr(context, (Addition) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.ADDITIONAL_IN:
				if(context == grammarAccess.getAdditionalInRule()) {
					sequence_AdditionalIn(context, (AdditionalIn) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.AND_EXPR:
				if(context == grammarAccess.getAndExprRule()) {
					sequence_AndExpr(context, (AndExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.ATOMIC_TYPE:
				if(context == grammarAccess.getAtomicTypeRule() ||
				   context == grammarAccess.getSingleTypeRule()) {
					sequence_AtomicType(context, (AtomicType) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.ATTRIB_NAME_OR_WILDCARD:
				if(context == grammarAccess.getAttribNameOrWildcardRule()) {
					sequence_AttribNameOrWildcard(context, (AttribNameOrWildcard) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.ATTRIBUTE:
				if(context == grammarAccess.getAbbrevForwardStepRule()) {
					sequence_AbbrevForwardStep(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.ATTRIBUTE_DECLARATION:
				if(context == grammarAccess.getAttributeDeclarationRule()) {
					sequence_AttributeDeclaration(context, (AttributeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.ATTRIBUTE_NAME:
				if(context == grammarAccess.getAttributeNameRule()) {
					sequence_AttributeName(context, (AttributeName) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.ATTRIBUTE_TEST:
				if(context == grammarAccess.getAttributeTestRule()) {
					sequence_AttributeTest(context, (AttributeTest) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.AXIS_STEP:
				if(context == grammarAccess.getAxisStepRule()) {
					sequence_AxisStep(context, (AxisStep) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.CAST_AS:
				if(context == grammarAccess.getAdditiveExprRule() ||
				   context == grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getCastExprRule() ||
				   context == grammarAccess.getCastableExprRule() ||
				   context == grammarAccess.getCastableExprAccess().getCastableLeftAction_1_0() ||
				   context == grammarAccess.getInstanceofExprRule() ||
				   context == grammarAccess.getInstanceofExprAccess().getInstanceofLeftAction_1_0() ||
				   context == grammarAccess.getIntersectExceptExprRule() ||
				   context == grammarAccess.getIntersectExceptExprAccess().getExceptLeftAction_1_0_1_0() ||
				   context == grammarAccess.getIntersectExceptExprAccess().getIntersectLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicativeExprRule() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getIDivisionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getModLeftAction_1_0_3_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTreatExprRule() ||
				   context == grammarAccess.getTreatExprAccess().getTreatAsLeftAction_1_0() ||
				   context == grammarAccess.getUnionExprRule() ||
				   context == grammarAccess.getUnionExprAccess().getPipeLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUnionExprAccess().getUnionLeftAction_1_0_0_0()) {
					sequence_CastExpr(context, (CastAs) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.CASTABLE:
				if(context == grammarAccess.getAdditiveExprRule() ||
				   context == grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getCastableExprRule() ||
				   context == grammarAccess.getInstanceofExprRule() ||
				   context == grammarAccess.getInstanceofExprAccess().getInstanceofLeftAction_1_0() ||
				   context == grammarAccess.getIntersectExceptExprRule() ||
				   context == grammarAccess.getIntersectExceptExprAccess().getExceptLeftAction_1_0_1_0() ||
				   context == grammarAccess.getIntersectExceptExprAccess().getIntersectLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicativeExprRule() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getIDivisionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getModLeftAction_1_0_3_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTreatExprRule() ||
				   context == grammarAccess.getTreatExprAccess().getTreatAsLeftAction_1_0() ||
				   context == grammarAccess.getUnionExprRule() ||
				   context == grammarAccess.getUnionExprAccess().getPipeLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUnionExprAccess().getUnionLeftAction_1_0_0_0()) {
					sequence_CastableExpr(context, (Castable) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.COMPARISON_EXPR:
				if(context == grammarAccess.getComparisonExprRule()) {
					sequence_ComparisonExpr(context, (ComparisonExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.DIVISION:
				if(context == grammarAccess.getAdditiveExprRule() ||
				   context == grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprRule() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getIDivisionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getModLeftAction_1_0_3_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getMultiplicationLeftAction_1_0_0_0()) {
					sequence_MultiplicativeExpr(context, (Division) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.DOCUMENT_TEST:
				if(context == grammarAccess.getDocumentTestRule()) {
					sequence_DocumentTest(context, (DocumentTest) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.DOUBLE:
				if(context == grammarAccess.getExtraStepExprRule()) {
					sequence_ExtraStepExpr(context, (org.xtext.example.xpath.xPath.Double) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.ELEMENT:
				if(context == grammarAccess.getAbbrevForwardStepRule()) {
					sequence_AbbrevForwardStep(context, (Element) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.ELEMENT_NAME:
				if(context == grammarAccess.getElementDeclarationRule() ||
				   context == grammarAccess.getElementNameRule()) {
					sequence_ElementName(context, (ElementName) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.ELEMENT_NAME_OR_WILDCARD:
				if(context == grammarAccess.getElementNameOrWildcardRule()) {
					sequence_ElementNameOrWildcard(context, (ElementNameOrWildcard) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.ELEMENT_TEST:
				if(context == grammarAccess.getElementTestRule()) {
					sequence_ElementTest(context, (ElementTest) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.EXCEPT:
				if(context == grammarAccess.getAdditiveExprRule() ||
				   context == grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getIntersectExceptExprRule() ||
				   context == grammarAccess.getIntersectExceptExprAccess().getExceptLeftAction_1_0_1_0() ||
				   context == grammarAccess.getIntersectExceptExprAccess().getIntersectLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicativeExprRule() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getIDivisionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getModLeftAction_1_0_3_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnionExprRule() ||
				   context == grammarAccess.getUnionExprAccess().getPipeLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUnionExprAccess().getUnionLeftAction_1_0_0_0()) {
					sequence_IntersectExceptExpr(context, (Except) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.EXPR:
				if(context == grammarAccess.getExprRule()) {
					sequence_Expr(context, (Expr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.FILTER_EXPR:
				if(context == grammarAccess.getFilterExprRule()) {
					sequence_FilterExpr(context, (FilterExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.FOR_EXPR:
				if(context == grammarAccess.getExprSingleRule() ||
				   context == grammarAccess.getForExprRule()) {
					sequence_ForExpr(context, (ForExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.FORWARD_AXIS:
				if(context == grammarAccess.getForwardAxisRule()) {
					sequence_ForwardAxis(context, (ForwardAxis) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.FORWARD_STEP:
				if(context == grammarAccess.getForwardStepRule()) {
					sequence_ForwardStep(context, (ForwardStep) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.FUNCTION_CALL:
				if(context == grammarAccess.getFunctionCallRule()) {
					sequence_FunctionCall(context, (FunctionCall) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.GENERAL_COMP:
				if(context == grammarAccess.getGeneralCompRule()) {
					sequence_GeneralComp(context, (GeneralComp) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.IDIVISION:
				if(context == grammarAccess.getAdditiveExprRule() ||
				   context == grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprRule() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getIDivisionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getModLeftAction_1_0_3_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getMultiplicationLeftAction_1_0_0_0()) {
					sequence_MultiplicativeExpr(context, (IDivision) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.IF_EXPR:
				if(context == grammarAccess.getExprSingleRule() ||
				   context == grammarAccess.getIfExprRule()) {
					sequence_IfExpr(context, (IfExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.INSTANCEOF:
				if(context == grammarAccess.getAdditiveExprRule() ||
				   context == grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getInstanceofExprRule() ||
				   context == grammarAccess.getIntersectExceptExprRule() ||
				   context == grammarAccess.getIntersectExceptExprAccess().getExceptLeftAction_1_0_1_0() ||
				   context == grammarAccess.getIntersectExceptExprAccess().getIntersectLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicativeExprRule() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getIDivisionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getModLeftAction_1_0_3_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnionExprRule() ||
				   context == grammarAccess.getUnionExprAccess().getPipeLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUnionExprAccess().getUnionLeftAction_1_0_0_0()) {
					sequence_InstanceofExpr(context, (Instanceof) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.INTERSECT:
				if(context == grammarAccess.getAdditiveExprRule() ||
				   context == grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getIntersectExceptExprRule() ||
				   context == grammarAccess.getIntersectExceptExprAccess().getExceptLeftAction_1_0_1_0() ||
				   context == grammarAccess.getIntersectExceptExprAccess().getIntersectLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicativeExprRule() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getIDivisionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getModLeftAction_1_0_3_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnionExprRule() ||
				   context == grammarAccess.getUnionExprAccess().getPipeLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUnionExprAccess().getUnionLeftAction_1_0_0_0()) {
					sequence_IntersectExceptExpr(context, (Intersect) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.ITEM_TYPE:
				if(context == grammarAccess.getItemTypeRule()) {
					sequence_ItemType(context, (ItemType) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.KIND_TEST:
				if(context == grammarAccess.getKindTestRule()) {
					sequence_KindTest(context, (KindTest) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.MOD:
				if(context == grammarAccess.getAdditiveExprRule() ||
				   context == grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprRule() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getIDivisionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getModLeftAction_1_0_3_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getMultiplicationLeftAction_1_0_0_0()) {
					sequence_MultiplicativeExpr(context, (Mod) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.MULTIPLICATION:
				if(context == grammarAccess.getAdditiveExprRule() ||
				   context == grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprRule() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getIDivisionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getModLeftAction_1_0_3_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getMultiplicationLeftAction_1_0_0_0()) {
					sequence_MultiplicativeExpr(context, (Multiplication) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.NC_NAME:
				if(context == grammarAccess.getNCNameRule()) {
					sequence_NCName(context, (NCName) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.NAME_TEST:
				if(context == grammarAccess.getNameTestRule()) {
					sequence_NameTest(context, (NameTest) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.NODE_COMP:
				if(context == grammarAccess.getNodeCompRule()) {
					sequence_NodeComp(context, (NodeComp) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.NODE_TEST:
				if(context == grammarAccess.getAbbrevForwardStepAccess().getAttributeTestAction_0_2() ||
				   context == grammarAccess.getAbbrevForwardStepAccess().getElementTestAction_1_1() ||
				   context == grammarAccess.getNodeTestRule()) {
					sequence_NodeTest(context, (NodeTest) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.NUMERIC_LITERAL:
				if(context == grammarAccess.getNumericLiteralRule()) {
					sequence_NumericLiteral(context, (NumericLiteral) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.OR_EXPR:
				if(context == grammarAccess.getExprSingleRule() ||
				   context == grammarAccess.getOrExprRule()) {
					sequence_OrExpr(context, (OrExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.PIT_TEST:
				if(context == grammarAccess.getPITestRule()) {
					sequence_PITest(context, (PITTest) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.PARENTHESIZED_EXPR:
				if(context == grammarAccess.getParenthesizedExprRule()) {
					sequence_ParenthesizedExpr(context, (ParenthesizedExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.PIPE:
				if(context == grammarAccess.getAdditiveExprRule() ||
				   context == grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprRule() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getIDivisionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getModLeftAction_1_0_3_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnionExprRule() ||
				   context == grammarAccess.getUnionExprAccess().getPipeLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUnionExprAccess().getUnionLeftAction_1_0_0_0()) {
					sequence_UnionExpr(context, (Pipe) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.PREDICATE:
				if(context == grammarAccess.getPredicateRule()) {
					sequence_Predicate(context, (Predicate) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.PREDICATE_LIST:
				if(context == grammarAccess.getPredicateListRule()) {
					sequence_PredicateList(context, (PredicateList) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.PREFIXED_NAME:
				if(context == grammarAccess.getPrefixedNameRule() ||
				   context == grammarAccess.getQNameRule()) {
					sequence_PrefixedName(context, (PrefixedName) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.PRIMARY_EXPR:
				if(context == grammarAccess.getPrimaryExprRule()) {
					sequence_PrimaryExpr(context, (PrimaryExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.QUANTIFIED_EXPR:
				if(context == grammarAccess.getExprSingleRule() ||
				   context == grammarAccess.getQuantifiedExprRule()) {
					sequence_QuantifiedExpr(context, (QuantifiedExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.RANGE_EXPR:
				if(context == grammarAccess.getRangeExprRule()) {
					sequence_RangeExpr(context, (RangeExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.REL_DOUBLE:
				if(context == grammarAccess.getPathExprRule()) {
					sequence_PathExpr(context, (RelDouble) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.REL_NO_SELECTOR:
				if(context == grammarAccess.getPathExprRule()) {
					sequence_PathExpr(context, (RelNoSelector) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.REL_SINGLE:
				if(context == grammarAccess.getPathExprRule()) {
					sequence_PathExpr(context, (RelSingle) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.RELATIVE_PATH_EXPR:
				if(context == grammarAccess.getPathExprAccess().getRelDoubleRelPathExprAction_1_2() ||
				   context == grammarAccess.getPathExprAccess().getRelNoSelectorRelPathExprAction_2_1() ||
				   context == grammarAccess.getPathExprAccess().getRelSingleRelPathExprAction_0_2() ||
				   context == grammarAccess.getRelativePathExprRule()) {
					sequence_RelativePathExpr(context, (RelativePathExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.REVERSE_STEP:
				if(context == grammarAccess.getReverseStepRule()) {
					sequence_ReverseStep(context, (ReverseStep) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.SCHEMA_ATTRIBUTE_TEST:
				if(context == grammarAccess.getSchemaAttributeTestRule()) {
					sequence_SchemaAttributeTest(context, (SchemaAttributeTest) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.SCHEMA_ELEMENT_TEST:
				if(context == grammarAccess.getSchemaElementTestRule()) {
					sequence_SchemaElementTest(context, (SchemaElementTest) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.SEQUENCE_TYPE:
				if(context == grammarAccess.getSequenceTypeRule()) {
					sequence_SequenceType(context, (SequenceType) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.SIMPLE_FOR_CLAUSE:
				if(context == grammarAccess.getSimpleForClauseRule()) {
					sequence_SimpleForClause(context, (SimpleForClause) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.SINGLE:
				if(context == grammarAccess.getExtraStepExprRule()) {
					sequence_ExtraStepExpr(context, (Single) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.STEP_EXPR:
				if(context == grammarAccess.getExtraStepExprAccess().getDoubleStepAction_1_2() ||
				   context == grammarAccess.getExtraStepExprAccess().getSingleStepAction_0_2() ||
				   context == grammarAccess.getStepExprRule()) {
					sequence_StepExpr(context, (StepExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.SUBSTRACTION:
				if(context == grammarAccess.getAdditiveExprRule() ||
				   context == grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0()) {
					sequence_AdditiveExpr(context, (Substraction) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.TREAT_AS:
				if(context == grammarAccess.getAdditiveExprRule() ||
				   context == grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getInstanceofExprRule() ||
				   context == grammarAccess.getInstanceofExprAccess().getInstanceofLeftAction_1_0() ||
				   context == grammarAccess.getIntersectExceptExprRule() ||
				   context == grammarAccess.getIntersectExceptExprAccess().getExceptLeftAction_1_0_1_0() ||
				   context == grammarAccess.getIntersectExceptExprAccess().getIntersectLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicativeExprRule() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getIDivisionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getModLeftAction_1_0_3_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTreatExprRule() ||
				   context == grammarAccess.getUnionExprRule() ||
				   context == grammarAccess.getUnionExprAccess().getPipeLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUnionExprAccess().getUnionLeftAction_1_0_0_0()) {
					sequence_TreatExpr(context, (TreatAs) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.TYPE_NAME:
				if(context == grammarAccess.getTypeNameRule()) {
					sequence_TypeName(context, (TypeName) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.UNARY_EXPR:
				if(context == grammarAccess.getAdditiveExprRule() ||
				   context == grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getCastExprRule() ||
				   context == grammarAccess.getCastExprAccess().getCastAsLeftAction_1_0() ||
				   context == grammarAccess.getCastableExprRule() ||
				   context == grammarAccess.getCastableExprAccess().getCastableLeftAction_1_0() ||
				   context == grammarAccess.getInstanceofExprRule() ||
				   context == grammarAccess.getInstanceofExprAccess().getInstanceofLeftAction_1_0() ||
				   context == grammarAccess.getIntersectExceptExprRule() ||
				   context == grammarAccess.getIntersectExceptExprAccess().getExceptLeftAction_1_0_1_0() ||
				   context == grammarAccess.getIntersectExceptExprAccess().getIntersectLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicativeExprRule() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getIDivisionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getModLeftAction_1_0_3_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getTreatExprRule() ||
				   context == grammarAccess.getTreatExprAccess().getTreatAsLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExprRule() ||
				   context == grammarAccess.getUnionExprRule() ||
				   context == grammarAccess.getUnionExprAccess().getPipeLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUnionExprAccess().getUnionLeftAction_1_0_0_0()) {
					sequence_UnaryExpr(context, (UnaryExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.UNION:
				if(context == grammarAccess.getAdditiveExprRule() ||
				   context == grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprRule() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getIDivisionLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getModLeftAction_1_0_3_0() ||
				   context == grammarAccess.getMultiplicativeExprAccess().getMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnionExprRule() ||
				   context == grammarAccess.getUnionExprAccess().getPipeLeftAction_1_0_1_0() ||
				   context == grammarAccess.getUnionExprAccess().getUnionLeftAction_1_0_0_0()) {
					sequence_UnionExpr(context, (Union) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.UNPREFIXED_NAME:
				if(context == grammarAccess.getQNameRule() ||
				   context == grammarAccess.getUnprefixedNameRule()) {
					sequence_UnprefixedName(context, (UnprefixedName) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.VALUE_COMP:
				if(context == grammarAccess.getValueCompRule()) {
					sequence_ValueComp(context, (ValueComp) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.VALUE_EXPR:
				if(context == grammarAccess.getValueExprRule()) {
					sequence_ValueExpr(context, (ValueExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.VAR_NAME:
				if(context == grammarAccess.getVarNameRule() ||
				   context == grammarAccess.getVarRefRule()) {
					sequence_VarName(context, (VarName) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.WILDCARD:
				if(context == grammarAccess.getWildcardRule()) {
					sequence_Wildcard(context, (Wildcard) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.XPATH:
				if(context == grammarAccess.getXpathRule()) {
					sequence_Xpath(context, (Xpath) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     test=AbbrevForwardStep_Attribute_0_2
	 */
	protected void sequence_AbbrevForwardStep(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.ATTRIBUTE__TEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.ATTRIBUTE__TEST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAbbrevForwardStepAccess().getAttributeTestAction_0_2(), semanticObject.getTest());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     test=AbbrevForwardStep_Element_1_1
	 */
	protected void sequence_AbbrevForwardStep(EObject context, Element semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.ELEMENT__TEST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.ELEMENT__TEST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAbbrevForwardStepAccess().getElementTestAction_1_1(), semanticObject.getTest());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=VarName in=ExprSingle)
	 */
	protected void sequence_AdditionalIn(EObject context, AdditionalIn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.ADDITIONAL_IN__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.ADDITIONAL_IN__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.ADDITIONAL_IN__IN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.ADDITIONAL_IN__IN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionalInAccess().getVariableVarNameParserRuleCall_2_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getAdditionalInAccess().getInExprSingleParserRuleCall_4_0(), semanticObject.getIn());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=AdditiveExpr_Addition_1_0_0_0 right=MultiplicativeExpr)
	 */
	protected void sequence_AdditiveExpr(EObject context, Addition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.ADDITION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.ADDITION__LEFT));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.ADDITION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.ADDITION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditiveExprAccess().getRightMultiplicativeExprParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=AdditiveExpr_Substraction_1_0_1_0 right=MultiplicativeExpr)
	 */
	protected void sequence_AdditiveExpr(EObject context, Substraction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.SUBSTRACTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.SUBSTRACTION__LEFT));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.SUBSTRACTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.SUBSTRACTION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditiveExprAccess().getRightMultiplicativeExprParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=ComparisonExpr rights+=ComparisonExpr*)
	 */
	protected void sequence_AndExpr(EObject context, AndExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=ID
	 */
	protected void sequence_AtomicType(EObject context, AtomicType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.ATOMIC_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.ATOMIC_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicTypeAccess().getTypeIDTerminalRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {AttribNameOrWildcard}
	 */
	protected void sequence_AttribNameOrWildcard(EObject context, AttribNameOrWildcard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     attName=AttributeName
	 */
	protected void sequence_AttributeDeclaration(EObject context, AttributeDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.ATTRIBUTE_DECLARATION__ATT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.ATTRIBUTE_DECLARATION__ATT_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeDeclarationAccess().getAttNameAttributeNameParserRuleCall_0(), semanticObject.getAttName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     qName=QName
	 */
	protected void sequence_AttributeName(EObject context, AttributeName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.ATTRIBUTE_NAME__QNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.ATTRIBUTE_NAME__QNAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeNameAccess().getQNameQNameParserRuleCall_0(), semanticObject.getQName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((attrOrWild=AttribNameOrWildcard typeName=TypeName?)?)
	 */
	protected void sequence_AttributeTest(EObject context, AttributeTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((step=ReverseStep | step=ForwardStep) predicateList=PredicateList)
	 */
	protected void sequence_AxisStep(EObject context, AxisStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=CastExpr_CastAs_1_0 right=SingleType)
	 */
	protected void sequence_CastExpr(EObject context, CastAs semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.CAST_AS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.CAST_AS__LEFT));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.CAST_AS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.CAST_AS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCastExprAccess().getCastAsLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCastExprAccess().getRightSingleTypeParserRuleCall_1_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=CastableExpr_Castable_1_0 right=SingleType)
	 */
	protected void sequence_CastableExpr(EObject context, Castable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.CASTABLE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.CASTABLE__LEFT));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.CASTABLE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.CASTABLE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCastableExprAccess().getCastableLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCastableExprAccess().getRightSingleTypeParserRuleCall_1_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=RangeExpr ((comp=ValueComp | comp=GeneralComp | comp=NodeComp) right=RangeExpr)?)
	 */
	protected void sequence_ComparisonExpr(EObject context, ComparisonExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((elemTest=ElementTest | schemaElemTest=SchemaElementTest)?)
	 */
	protected void sequence_DocumentTest(EObject context, DocumentTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ElementNameOrWildcard}
	 */
	protected void sequence_ElementNameOrWildcard(EObject context, ElementNameOrWildcard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     qName=QName
	 */
	protected void sequence_ElementName(EObject context, ElementName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.ELEMENT_NAME__QNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.ELEMENT_NAME__QNAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getElementNameAccess().getQNameQNameParserRuleCall_0(), semanticObject.getQName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((elemOrWild=ElementNameOrWildcard typeName=TypeName?)?)
	 */
	protected void sequence_ElementTest(EObject context, ElementTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exprSingle=ExprSingle exprsSingle+=ExprSingle*)
	 */
	protected void sequence_Expr(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     step=ExtraStepExpr_Double_1_2
	 */
	protected void sequence_ExtraStepExpr(EObject context, org.xtext.example.xpath.xPath.Double semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     step=ExtraStepExpr_Single_0_2
	 */
	protected void sequence_ExtraStepExpr(EObject context, Single semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (primary=PrimaryExpr predicateList=PredicateList)
	 */
	protected void sequence_FilterExpr(EObject context, FilterExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.FILTER_EXPR__PRIMARY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.FILTER_EXPR__PRIMARY));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.FILTER_EXPR__PREDICATE_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.FILTER_EXPR__PREDICATE_LIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFilterExprAccess().getPrimaryPrimaryExprParserRuleCall_0_0(), semanticObject.getPrimary());
		feeder.accept(grammarAccess.getFilterExprAccess().getPredicateListPredicateListParserRuleCall_1_0(), semanticObject.getPredicateList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (for=SimpleForClause return=ExprSingle)
	 */
	protected void sequence_ForExpr(EObject context, ForExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.FOR_EXPR__FOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.FOR_EXPR__FOR));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.FOR_EXPR__RETURN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.FOR_EXPR__RETURN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForExprAccess().getForSimpleForClauseParserRuleCall_0_0(), semanticObject.getFor());
		feeder.accept(grammarAccess.getForExprAccess().getReturnExprSingleParserRuleCall_2_0(), semanticObject.getReturn());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         axis='child' | 
	 *         axis='descendant' | 
	 *         axis='attribute' | 
	 *         axis='self' | 
	 *         axis='descendant-or-self' | 
	 *         axis='following-sibling' | 
	 *         axis='following' | 
	 *         axis='namespace'
	 *     )
	 */
	protected void sequence_ForwardAxis(EObject context, ForwardAxis semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((forward=ForwardAxis test=NodeTest) | abbrForward=AbbrevForwardStep)
	 */
	protected void sequence_ForwardStep(EObject context, ForwardStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qName=QName (expr=ExprSingle exprs+=ExprSingle*)?)
	 */
	protected void sequence_FunctionCall(EObject context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         op='=' | 
	 *         op='!=' | 
	 *         op='<' | 
	 *         op='<=' | 
	 *         op='>' | 
	 *         op='>='
	 *     )
	 */
	protected void sequence_GeneralComp(EObject context, GeneralComp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (if=Expr then=ExprSingle else=ExprSingle)
	 */
	protected void sequence_IfExpr(EObject context, IfExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.IF_EXPR__IF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.IF_EXPR__IF));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.IF_EXPR__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.IF_EXPR__THEN));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.IF_EXPR__ELSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.IF_EXPR__ELSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIfExprAccess().getIfExprParserRuleCall_2_0(), semanticObject.getIf());
		feeder.accept(grammarAccess.getIfExprAccess().getThenExprSingleParserRuleCall_5_0(), semanticObject.getThen());
		feeder.accept(grammarAccess.getIfExprAccess().getElseExprSingleParserRuleCall_7_0(), semanticObject.getElse());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=InstanceofExpr_Instanceof_1_0 right=SequenceType)
	 */
	protected void sequence_InstanceofExpr(EObject context, Instanceof semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.INSTANCEOF__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.INSTANCEOF__LEFT));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.INSTANCEOF__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.INSTANCEOF__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstanceofExprAccess().getInstanceofLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getInstanceofExprAccess().getRightSequenceTypeParserRuleCall_1_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=IntersectExceptExpr_Except_1_0_1_0 right=InstanceofExpr)
	 */
	protected void sequence_IntersectExceptExpr(EObject context, Except semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.EXCEPT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.EXCEPT__LEFT));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.EXCEPT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.EXCEPT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntersectExceptExprAccess().getExceptLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getIntersectExceptExprAccess().getRightInstanceofExprParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=IntersectExceptExpr_Intersect_1_0_0_0 right=InstanceofExpr)
	 */
	protected void sequence_IntersectExceptExpr(EObject context, Intersect semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.INTERSECT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.INTERSECT__LEFT));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.INTERSECT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.INTERSECT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntersectExceptExprAccess().getIntersectLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getIntersectExceptExprAccess().getRightInstanceofExprParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (kindTest=KindTest | empty=EMPTYITEMTYPE | atomicType=AtomicType)
	 */
	protected void sequence_ItemType(EObject context, ItemType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         docTest=DocumentTest | 
	 *         elemTest=ElementTest | 
	 *         attributeTest=AttributeTest | 
	 *         schemaElemTest=SchemaElementTest | 
	 *         schemaAttributeTest=SchemaAttributeTest | 
	 *         pitTest=PITest | 
	 *         commentTest=COMMENTTEST | 
	 *         textTest=TEXTTEST | 
	 *         anyKindTest=ANYKINDTEST
	 *     )
	 */
	protected void sequence_KindTest(EObject context, KindTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (num=NumericLiteral | string=STRINGLITERAL)
	 */
	protected void sequence_Literal(EObject context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicativeExpr_Division_1_0_1_0 right=UnionExpr)
	 */
	protected void sequence_MultiplicativeExpr(EObject context, Division semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.DIVISION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.DIVISION__LEFT));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.DIVISION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.DIVISION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicativeExprAccess().getDivisionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicativeExprAccess().getRightUnionExprParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicativeExpr_IDivision_1_0_2_0 right=UnionExpr)
	 */
	protected void sequence_MultiplicativeExpr(EObject context, IDivision semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.IDIVISION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.IDIVISION__LEFT));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.IDIVISION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.IDIVISION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicativeExprAccess().getIDivisionLeftAction_1_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicativeExprAccess().getRightUnionExprParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicativeExpr_Mod_1_0_3_0 right=UnionExpr)
	 */
	protected void sequence_MultiplicativeExpr(EObject context, Mod semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.MOD__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.MOD__LEFT));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.MOD__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.MOD__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicativeExprAccess().getModLeftAction_1_0_3_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicativeExprAccess().getRightUnionExprParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=MultiplicativeExpr_Multiplication_1_0_0_0 right=UnionExpr)
	 */
	protected void sequence_MultiplicativeExpr(EObject context, Multiplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.MULTIPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.MULTIPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.MULTIPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.MULTIPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicativeExprAccess().getMultiplicationLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicativeExprAccess().getRightUnionExprParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ncName=ID
	 */
	protected void sequence_NCName(EObject context, NCName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.NC_NAME__NC_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.NC_NAME__NC_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNCNameAccess().getNcNameIDTerminalRuleCall_0(), semanticObject.getNcName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (qName=QName | wildcard=Wildcard)
	 */
	protected void sequence_NameTest(EObject context, NameTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op='is' | op='<<' | op='>>')
	 */
	protected void sequence_NodeComp(EObject context, NodeComp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (test=KindTest | test=NameTest)
	 */
	protected void sequence_NodeTest(EObject context, NodeTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (intLit=INTLITERAL | decLit=DECIMALLITERAL | doubleLit=DOUBLELITERAL)
	 */
	protected void sequence_NumericLiteral(EObject context, NumericLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=AndExpr rights+=AndExpr*)
	 */
	protected void sequence_OrExpr(EObject context, OrExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((ncName=NCName | string=STRINGLITERAL)?)
	 */
	protected void sequence_PITest(EObject context, PITTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expr?)
	 */
	protected void sequence_ParenthesizedExpr(EObject context, ParenthesizedExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     relPathExpr=PathExpr_RelDouble_1_2
	 */
	protected void sequence_PathExpr(EObject context, RelDouble semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.REL_DOUBLE__REL_PATH_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.REL_DOUBLE__REL_PATH_EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPathExprAccess().getRelDoubleRelPathExprAction_1_2(), semanticObject.getRelPathExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     relPathExpr=PathExpr_RelNoSelector_2_1
	 */
	protected void sequence_PathExpr(EObject context, RelNoSelector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.REL_NO_SELECTOR__REL_PATH_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.REL_NO_SELECTOR__REL_PATH_EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPathExprAccess().getRelNoSelectorRelPathExprAction_2_1(), semanticObject.getRelPathExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     relPathExpr=PathExpr_RelSingle_0_2
	 */
	protected void sequence_PathExpr(EObject context, RelSingle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.REL_SINGLE__REL_PATH_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.REL_SINGLE__REL_PATH_EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPathExprAccess().getRelSingleRelPathExprAction_0_2(), semanticObject.getRelPathExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (predicates+=Predicate*)
	 */
	protected void sequence_PredicateList(EObject context, PredicateList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=Expr
	 */
	protected void sequence_Predicate(EObject context, Predicate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.PREDICATE__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.PREDICATE__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPredicateAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (prefix=NCName localPart=NCName)
	 */
	protected void sequence_PrefixedName(EObject context, PrefixedName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.QNAME__LOCAL_PART) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.QNAME__LOCAL_PART));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.PREFIXED_NAME__PREFIX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.PREFIXED_NAME__PREFIX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrefixedNameAccess().getPrefixNCNameParserRuleCall_0_0(), semanticObject.getPrefix());
		feeder.accept(grammarAccess.getPrefixedNameAccess().getLocalPartNCNameParserRuleCall_2_0(), semanticObject.getLocalPart());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (literal=Literal | varRef=VarRef | parExpr=ParenthesizedExpr | conItemExpr=CONTEXTITEMEXPR | functionCall=FunctionCall)
	 */
	protected void sequence_PrimaryExpr(EObject context, PrimaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=VarName in=ExprSingle additionalIn+=AdditionalIn* satisfy=ExprSingle)
	 */
	protected void sequence_QuantifiedExpr(EObject context, QuantifiedExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (from=AdditiveExpr to=AdditiveExpr?)
	 */
	protected void sequence_RangeExpr(EObject context, RangeExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (step=StepExpr extraSteps+=ExtraStepExpr*)
	 */
	protected void sequence_RelativePathExpr(EObject context, RelativePathExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((reverse=REVERSEAXIS test=NodeTest) | abbrRevSet=ABBREVREVERSESTEP)
	 */
	protected void sequence_ReverseStep(EObject context, ReverseStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     attDec=AttributeDeclaration
	 */
	protected void sequence_SchemaAttributeTest(EObject context, SchemaAttributeTest semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.SCHEMA_ATTRIBUTE_TEST__ATT_DEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.SCHEMA_ATTRIBUTE_TEST__ATT_DEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSchemaAttributeTestAccess().getAttDecAttributeDeclarationParserRuleCall_2_0(), semanticObject.getAttDec());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     elemDec=ElementDeclaration
	 */
	protected void sequence_SchemaElementTest(EObject context, SchemaElementTest semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.SCHEMA_ELEMENT_TEST__ELEM_DEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.SCHEMA_ELEMENT_TEST__ELEM_DEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSchemaElementTestAccess().getElemDecElementDeclarationParserRuleCall_2_0(), semanticObject.getElemDec());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (empty=EMPTYSEQUENCETYPE | (itemType=ItemType occInd=OccurenceIndicator))
	 */
	protected void sequence_SequenceType(EObject context, SequenceType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (forVar=VarName in=ExprSingle additionalIn+=AdditionalIn*)
	 */
	protected void sequence_SimpleForClause(EObject context, SimpleForClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stepExpr=FilterExpr | stepExpr=AxisStep)
	 */
	protected void sequence_StepExpr(EObject context, StepExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=TreatExpr_TreatAs_1_0 right=SequenceType)
	 */
	protected void sequence_TreatExpr(EObject context, TreatAs semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.TREAT_AS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.TREAT_AS__LEFT));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.TREAT_AS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.TREAT_AS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTreatExprAccess().getTreatAsLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTreatExprAccess().getRightSequenceTypeParserRuleCall_1_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     qName=QName
	 */
	protected void sequence_TypeName(EObject context, TypeName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.TYPE_NAME__QNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.TYPE_NAME__QNAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeNameAccess().getQNameQNameParserRuleCall_0(), semanticObject.getQName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((unaryOps+='-' | unaryOps+='+')* value=ValueExpr)
	 */
	protected void sequence_UnaryExpr(EObject context, UnaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=UnionExpr_Pipe_1_0_1_0 right=IntersectExceptExpr)
	 */
	protected void sequence_UnionExpr(EObject context, Pipe semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.PIPE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.PIPE__LEFT));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.PIPE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.PIPE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnionExprAccess().getPipeLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUnionExprAccess().getRightIntersectExceptExprParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=UnionExpr_Union_1_0_0_0 right=IntersectExceptExpr)
	 */
	protected void sequence_UnionExpr(EObject context, Union semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.UNION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.UNION__LEFT));
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.UNION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.UNION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnionExprAccess().getUnionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUnionExprAccess().getRightIntersectExceptExprParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     localPart=NCName
	 */
	protected void sequence_UnprefixedName(EObject context, UnprefixedName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.QNAME__LOCAL_PART) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.QNAME__LOCAL_PART));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnprefixedNameAccess().getLocalPartNCNameParserRuleCall_0(), semanticObject.getLocalPart());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         op='eq' | 
	 *         op='ne' | 
	 *         op='lt' | 
	 *         op='le' | 
	 *         op='gt' | 
	 *         op='ge'
	 *     )
	 */
	protected void sequence_ValueComp(EObject context, ValueComp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=PathExpr
	 */
	protected void sequence_ValueExpr(EObject context, ValueExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.VALUE_EXPR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.VALUE_EXPR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValueExprAccess().getValuePathExprParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     qName=QName
	 */
	protected void sequence_VarName(EObject context, VarName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.VAR_NAME__QNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.VAR_NAME__QNAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarNameAccess().getQNameQNameParserRuleCall_0(), semanticObject.getQName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (wild='*' | left=NCName | right=NCName)
	 */
	protected void sequence_Wildcard(EObject context, Wildcard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     xpath=Expr
	 */
	protected void sequence_Xpath(EObject context, Xpath semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.XPATH__XPATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.XPATH__XPATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXpathAccess().getXpathExprParserRuleCall_0(), semanticObject.getXpath());
		feeder.finish();
	}
}
