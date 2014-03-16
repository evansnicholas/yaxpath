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
import org.xtext.example.xpath.xPath.AbbrevForwardStep;
import org.xtext.example.xpath.xPath.AdditionalIn;
import org.xtext.example.xpath.xPath.AdditiveExpr;
import org.xtext.example.xpath.xPath.AndExpr;
import org.xtext.example.xpath.xPath.AtomicType;
import org.xtext.example.xpath.xPath.AttribNameOrWildcard;
import org.xtext.example.xpath.xPath.AttributeDeclaration;
import org.xtext.example.xpath.xPath.AttributeName;
import org.xtext.example.xpath.xPath.AttributeTest;
import org.xtext.example.xpath.xPath.AxisStep;
import org.xtext.example.xpath.xPath.CastExpr;
import org.xtext.example.xpath.xPath.CastableExpr;
import org.xtext.example.xpath.xPath.ComparisonExpr;
import org.xtext.example.xpath.xPath.DocumentTest;
import org.xtext.example.xpath.xPath.ElementName;
import org.xtext.example.xpath.xPath.ElementNameOrWildcard;
import org.xtext.example.xpath.xPath.ElementTest;
import org.xtext.example.xpath.xPath.Expr;
import org.xtext.example.xpath.xPath.FilterExpr;
import org.xtext.example.xpath.xPath.ForExpr;
import org.xtext.example.xpath.xPath.ForwardStep;
import org.xtext.example.xpath.xPath.FunctionCall;
import org.xtext.example.xpath.xPath.IfExpr;
import org.xtext.example.xpath.xPath.InstanceofExpr;
import org.xtext.example.xpath.xPath.IntersectExceptExpr;
import org.xtext.example.xpath.xPath.ItemType;
import org.xtext.example.xpath.xPath.KindTest;
import org.xtext.example.xpath.xPath.Literal;
import org.xtext.example.xpath.xPath.MultiplicativeExpr;
import org.xtext.example.xpath.xPath.NCName;
import org.xtext.example.xpath.xPath.NameTest;
import org.xtext.example.xpath.xPath.NodeTest;
import org.xtext.example.xpath.xPath.NumericLiteral;
import org.xtext.example.xpath.xPath.OrExpr;
import org.xtext.example.xpath.xPath.PITTest;
import org.xtext.example.xpath.xPath.ParenthesizedExpr;
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
import org.xtext.example.xpath.xPath.TreatExpr;
import org.xtext.example.xpath.xPath.TypeName;
import org.xtext.example.xpath.xPath.UnaryExpr;
import org.xtext.example.xpath.xPath.UnionExpr;
import org.xtext.example.xpath.xPath.UnprefixedName;
import org.xtext.example.xpath.xPath.ValueExpr;
import org.xtext.example.xpath.xPath.VarName;
import org.xtext.example.xpath.xPath.Wildcard;
import org.xtext.example.xpath.xPath.XPathPackage;

@SuppressWarnings("all")
public class XPathSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XPathGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == XPathPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XPathPackage.ABBREV_FORWARD_STEP:
				if(context == grammarAccess.getAbbrevForwardStepRule()) {
					sequence_AbbrevForwardStep(context, (AbbrevForwardStep) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.ADDITIONAL_IN:
				if(context == grammarAccess.getAdditionalInRule()) {
					sequence_AdditionalIn(context, (AdditionalIn) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.ADDITIVE_EXPR:
				if(context == grammarAccess.getAdditiveExprRule()) {
					sequence_AdditiveExpr(context, (AdditiveExpr) semanticObject); 
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
				if(context == grammarAccess.getAxisStepRule() ||
				   context == grammarAccess.getExtraStepExprAccess().getDoubleStepAction_1_2() ||
				   context == grammarAccess.getExtraStepExprAccess().getSingleStepAction_0_2() ||
				   context == grammarAccess.getStepExprRule()) {
					sequence_AxisStep(context, (AxisStep) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.CAST_EXPR:
				if(context == grammarAccess.getCastExprRule()) {
					sequence_CastExpr(context, (CastExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.CASTABLE_EXPR:
				if(context == grammarAccess.getCastableExprRule()) {
					sequence_CastableExpr(context, (CastableExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.COMPARISON_EXPR:
				if(context == grammarAccess.getComparisonExprRule()) {
					sequence_ComparisonExpr(context, (ComparisonExpr) semanticObject); 
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
			case XPathPackage.EXPR:
				if(context == grammarAccess.getExprRule()) {
					sequence_Expr(context, (Expr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.FILTER_EXPR:
				if(context == grammarAccess.getExtraStepExprAccess().getDoubleStepAction_1_2() ||
				   context == grammarAccess.getExtraStepExprAccess().getSingleStepAction_0_2() ||
				   context == grammarAccess.getFilterExprRule() ||
				   context == grammarAccess.getStepExprRule()) {
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
			case XPathPackage.IF_EXPR:
				if(context == grammarAccess.getExprSingleRule() ||
				   context == grammarAccess.getIfExprRule()) {
					sequence_IfExpr(context, (IfExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.INSTANCEOF_EXPR:
				if(context == grammarAccess.getInstanceofExprRule()) {
					sequence_InstanceofExpr(context, (InstanceofExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.INTERSECT_EXCEPT_EXPR:
				if(context == grammarAccess.getIntersectExceptExprRule()) {
					sequence_IntersectExceptExpr(context, (IntersectExceptExpr) semanticObject); 
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
			case XPathPackage.MULTIPLICATIVE_EXPR:
				if(context == grammarAccess.getMultiplicativeExprRule()) {
					sequence_MultiplicativeExpr(context, (MultiplicativeExpr) semanticObject); 
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
			case XPathPackage.NODE_TEST:
				if(context == grammarAccess.getNodeTestRule()) {
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
			case XPathPackage.TREAT_EXPR:
				if(context == grammarAccess.getTreatExprRule()) {
					sequence_TreatExpr(context, (TreatExpr) semanticObject); 
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
				if(context == grammarAccess.getUnaryExprRule()) {
					sequence_UnaryExpr(context, (UnaryExpr) semanticObject); 
					return; 
				}
				else break;
			case XPathPackage.UNION_EXPR:
				if(context == grammarAccess.getUnionExprRule()) {
					sequence_UnionExpr(context, (UnionExpr) semanticObject); 
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
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (attr='@'? test=NodeTest)
	 */
	protected void sequence_AbbrevForwardStep(EObject context, AbbrevForwardStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (left=MultiplicativeExpr rights+=MultiplicativeExpr*)
	 */
	protected void sequence_AdditiveExpr(EObject context, AdditiveExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (left=UnaryExpr right=SingleType?)
	 */
	protected void sequence_CastExpr(EObject context, CastExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=CastExpr right=SingleType?)
	 */
	protected void sequence_CastableExpr(EObject context, CastableExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (range=RangeExpr ((value=VALUECOMP | gen=GENERALCOMP | node=NODECOMP) otherRange=RangeExpr)?)
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
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.DOUBLE__STEP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.DOUBLE__STEP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExtraStepExprAccess().getDoubleStepAction_1_2(), semanticObject.getStep());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     step=ExtraStepExpr_Single_0_2
	 */
	protected void sequence_ExtraStepExpr(EObject context, Single semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.SINGLE__STEP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.SINGLE__STEP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExtraStepExprAccess().getSingleStepAction_0_2(), semanticObject.getStep());
		feeder.finish();
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
	 *     ((forward=FORWARDAXIS test=NodeTest) | abbrForward=AbbrevForwardStep)
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
	 *     (left=TreatExpr right=SequenceType?)
	 */
	protected void sequence_InstanceofExpr(EObject context, InstanceofExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=InstanceofExpr rights+=InstanceofExpr*)
	 */
	protected void sequence_IntersectExceptExpr(EObject context, IntersectExceptExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (left=UnionExpr rights+=UnionExpr*)
	 */
	protected void sequence_MultiplicativeExpr(EObject context, MultiplicativeExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (left=CastableExpr right=SequenceType?)
	 */
	protected void sequence_TreatExpr(EObject context, TreatExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     unary=ValueExpr
	 */
	protected void sequence_UnaryExpr(EObject context, UnaryExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XPathPackage.Literals.UNARY_EXPR__UNARY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XPathPackage.Literals.UNARY_EXPR__UNARY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnaryExprAccess().getUnaryValueExprParserRuleCall_1_0(), semanticObject.getUnary());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=IntersectExceptExpr rights+=IntersectExceptExpr*)
	 */
	protected void sequence_UnionExpr(EObject context, UnionExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
}
