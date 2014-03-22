/**
 */
package org.xtext.example.xpath.xPath.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.xpath.xPath.AbbrevForwardStep;
import org.xtext.example.xpath.xPath.Addition;
import org.xtext.example.xpath.xPath.AdditionalIn;
import org.xtext.example.xpath.xPath.AdditiveExpr;
import org.xtext.example.xpath.xPath.AndExpr;
import org.xtext.example.xpath.xPath.AtomicType;
import org.xtext.example.xpath.xPath.AttribNameOrWildcard;
import org.xtext.example.xpath.xPath.Attribute;
import org.xtext.example.xpath.xPath.AttributeDeclaration;
import org.xtext.example.xpath.xPath.AttributeName;
import org.xtext.example.xpath.xPath.AttributeTest;
import org.xtext.example.xpath.xPath.AxisStep;
import org.xtext.example.xpath.xPath.CastAs;
import org.xtext.example.xpath.xPath.CastExpr;
import org.xtext.example.xpath.xPath.Castable;
import org.xtext.example.xpath.xPath.CastableExpr;
import org.xtext.example.xpath.xPath.ComparisonExpr;
import org.xtext.example.xpath.xPath.Division;
import org.xtext.example.xpath.xPath.DocumentTest;
import org.xtext.example.xpath.xPath.Element;
import org.xtext.example.xpath.xPath.ElementDeclaration;
import org.xtext.example.xpath.xPath.ElementName;
import org.xtext.example.xpath.xPath.ElementNameOrWildcard;
import org.xtext.example.xpath.xPath.ElementTest;
import org.xtext.example.xpath.xPath.Except;
import org.xtext.example.xpath.xPath.Expr;
import org.xtext.example.xpath.xPath.ExprSingle;
import org.xtext.example.xpath.xPath.FilterExpr;
import org.xtext.example.xpath.xPath.ForExpr;
import org.xtext.example.xpath.xPath.ForwardAxis;
import org.xtext.example.xpath.xPath.ForwardStep;
import org.xtext.example.xpath.xPath.FunctionCall;
import org.xtext.example.xpath.xPath.GeneralComp;
import org.xtext.example.xpath.xPath.IDivision;
import org.xtext.example.xpath.xPath.IfExpr;
import org.xtext.example.xpath.xPath.Instanceof;
import org.xtext.example.xpath.xPath.InstanceofExpr;
import org.xtext.example.xpath.xPath.Intersect;
import org.xtext.example.xpath.xPath.IntersectExceptExpr;
import org.xtext.example.xpath.xPath.ItemType;
import org.xtext.example.xpath.xPath.KindTest;
import org.xtext.example.xpath.xPath.Literal;
import org.xtext.example.xpath.xPath.Mod;
import org.xtext.example.xpath.xPath.Multiplication;
import org.xtext.example.xpath.xPath.MultiplicativeExpr;
import org.xtext.example.xpath.xPath.NCName;
import org.xtext.example.xpath.xPath.NameTest;
import org.xtext.example.xpath.xPath.NodeComp;
import org.xtext.example.xpath.xPath.NodeTest;
import org.xtext.example.xpath.xPath.NumericLiteral;
import org.xtext.example.xpath.xPath.OrExpr;
import org.xtext.example.xpath.xPath.PITTest;
import org.xtext.example.xpath.xPath.PITest;
import org.xtext.example.xpath.xPath.ParenthesizedExpr;
import org.xtext.example.xpath.xPath.PathExpr;
import org.xtext.example.xpath.xPath.Pipe;
import org.xtext.example.xpath.xPath.Predicate;
import org.xtext.example.xpath.xPath.PredicateList;
import org.xtext.example.xpath.xPath.PrefixedName;
import org.xtext.example.xpath.xPath.PrimaryExpr;
import org.xtext.example.xpath.xPath.QName;
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
import org.xtext.example.xpath.xPath.SingleType;
import org.xtext.example.xpath.xPath.StepExpr;
import org.xtext.example.xpath.xPath.Substraction;
import org.xtext.example.xpath.xPath.TreatAs;
import org.xtext.example.xpath.xPath.TreatExpr;
import org.xtext.example.xpath.xPath.TypeName;
import org.xtext.example.xpath.xPath.UnaryExpr;
import org.xtext.example.xpath.xPath.Union;
import org.xtext.example.xpath.xPath.UnionExpr;
import org.xtext.example.xpath.xPath.UnprefixedName;
import org.xtext.example.xpath.xPath.ValueComp;
import org.xtext.example.xpath.xPath.ValueExpr;
import org.xtext.example.xpath.xPath.VarName;
import org.xtext.example.xpath.xPath.VarRef;
import org.xtext.example.xpath.xPath.Wildcard;
import org.xtext.example.xpath.xPath.XPathPackage;
import org.xtext.example.xpath.xPath.Xpath;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.xpath.xPath.XPathPackage
 * @generated
 */
public class XPathSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XPathPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XPathSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = XPathPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case XPathPackage.XPATH:
      {
        Xpath xpath = (Xpath)theEObject;
        T result = caseXpath(xpath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.EXPR_SINGLE:
      {
        ExprSingle exprSingle = (ExprSingle)theEObject;
        T result = caseExprSingle(exprSingle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.FOR_EXPR:
      {
        ForExpr forExpr = (ForExpr)theEObject;
        T result = caseForExpr(forExpr);
        if (result == null) result = caseExprSingle(forExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.SIMPLE_FOR_CLAUSE:
      {
        SimpleForClause simpleForClause = (SimpleForClause)theEObject;
        T result = caseSimpleForClause(simpleForClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ADDITIONAL_IN:
      {
        AdditionalIn additionalIn = (AdditionalIn)theEObject;
        T result = caseAdditionalIn(additionalIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.QUANTIFIED_EXPR:
      {
        QuantifiedExpr quantifiedExpr = (QuantifiedExpr)theEObject;
        T result = caseQuantifiedExpr(quantifiedExpr);
        if (result == null) result = caseExprSingle(quantifiedExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.IF_EXPR:
      {
        IfExpr ifExpr = (IfExpr)theEObject;
        T result = caseIfExpr(ifExpr);
        if (result == null) result = caseExprSingle(ifExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.OR_EXPR:
      {
        OrExpr orExpr = (OrExpr)theEObject;
        T result = caseOrExpr(orExpr);
        if (result == null) result = caseExprSingle(orExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.AND_EXPR:
      {
        AndExpr andExpr = (AndExpr)theEObject;
        T result = caseAndExpr(andExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.COMPARISON_EXPR:
      {
        ComparisonExpr comparisonExpr = (ComparisonExpr)theEObject;
        T result = caseComparisonExpr(comparisonExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.RANGE_EXPR:
      {
        RangeExpr rangeExpr = (RangeExpr)theEObject;
        T result = caseRangeExpr(rangeExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ADDITIVE_EXPR:
      {
        AdditiveExpr additiveExpr = (AdditiveExpr)theEObject;
        T result = caseAdditiveExpr(additiveExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.MULTIPLICATIVE_EXPR:
      {
        MultiplicativeExpr multiplicativeExpr = (MultiplicativeExpr)theEObject;
        T result = caseMultiplicativeExpr(multiplicativeExpr);
        if (result == null) result = caseAdditiveExpr(multiplicativeExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.UNION_EXPR:
      {
        UnionExpr unionExpr = (UnionExpr)theEObject;
        T result = caseUnionExpr(unionExpr);
        if (result == null) result = caseMultiplicativeExpr(unionExpr);
        if (result == null) result = caseAdditiveExpr(unionExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.INTERSECT_EXCEPT_EXPR:
      {
        IntersectExceptExpr intersectExceptExpr = (IntersectExceptExpr)theEObject;
        T result = caseIntersectExceptExpr(intersectExceptExpr);
        if (result == null) result = caseUnionExpr(intersectExceptExpr);
        if (result == null) result = caseMultiplicativeExpr(intersectExceptExpr);
        if (result == null) result = caseAdditiveExpr(intersectExceptExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.INSTANCEOF_EXPR:
      {
        InstanceofExpr instanceofExpr = (InstanceofExpr)theEObject;
        T result = caseInstanceofExpr(instanceofExpr);
        if (result == null) result = caseIntersectExceptExpr(instanceofExpr);
        if (result == null) result = caseUnionExpr(instanceofExpr);
        if (result == null) result = caseMultiplicativeExpr(instanceofExpr);
        if (result == null) result = caseAdditiveExpr(instanceofExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.TREAT_EXPR:
      {
        TreatExpr treatExpr = (TreatExpr)theEObject;
        T result = caseTreatExpr(treatExpr);
        if (result == null) result = caseInstanceofExpr(treatExpr);
        if (result == null) result = caseIntersectExceptExpr(treatExpr);
        if (result == null) result = caseUnionExpr(treatExpr);
        if (result == null) result = caseMultiplicativeExpr(treatExpr);
        if (result == null) result = caseAdditiveExpr(treatExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.CASTABLE_EXPR:
      {
        CastableExpr castableExpr = (CastableExpr)theEObject;
        T result = caseCastableExpr(castableExpr);
        if (result == null) result = caseTreatExpr(castableExpr);
        if (result == null) result = caseInstanceofExpr(castableExpr);
        if (result == null) result = caseIntersectExceptExpr(castableExpr);
        if (result == null) result = caseUnionExpr(castableExpr);
        if (result == null) result = caseMultiplicativeExpr(castableExpr);
        if (result == null) result = caseAdditiveExpr(castableExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.CAST_EXPR:
      {
        CastExpr castExpr = (CastExpr)theEObject;
        T result = caseCastExpr(castExpr);
        if (result == null) result = caseCastableExpr(castExpr);
        if (result == null) result = caseTreatExpr(castExpr);
        if (result == null) result = caseInstanceofExpr(castExpr);
        if (result == null) result = caseIntersectExceptExpr(castExpr);
        if (result == null) result = caseUnionExpr(castExpr);
        if (result == null) result = caseMultiplicativeExpr(castExpr);
        if (result == null) result = caseAdditiveExpr(castExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.UNARY_EXPR:
      {
        UnaryExpr unaryExpr = (UnaryExpr)theEObject;
        T result = caseUnaryExpr(unaryExpr);
        if (result == null) result = caseCastExpr(unaryExpr);
        if (result == null) result = caseCastableExpr(unaryExpr);
        if (result == null) result = caseTreatExpr(unaryExpr);
        if (result == null) result = caseInstanceofExpr(unaryExpr);
        if (result == null) result = caseIntersectExceptExpr(unaryExpr);
        if (result == null) result = caseUnionExpr(unaryExpr);
        if (result == null) result = caseMultiplicativeExpr(unaryExpr);
        if (result == null) result = caseAdditiveExpr(unaryExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.VALUE_EXPR:
      {
        ValueExpr valueExpr = (ValueExpr)theEObject;
        T result = caseValueExpr(valueExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.GENERAL_COMP:
      {
        GeneralComp generalComp = (GeneralComp)theEObject;
        T result = caseGeneralComp(generalComp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.VALUE_COMP:
      {
        ValueComp valueComp = (ValueComp)theEObject;
        T result = caseValueComp(valueComp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.NODE_COMP:
      {
        NodeComp nodeComp = (NodeComp)theEObject;
        T result = caseNodeComp(nodeComp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.PATH_EXPR:
      {
        PathExpr pathExpr = (PathExpr)theEObject;
        T result = casePathExpr(pathExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.RELATIVE_PATH_EXPR:
      {
        RelativePathExpr relativePathExpr = (RelativePathExpr)theEObject;
        T result = caseRelativePathExpr(relativePathExpr);
        if (result == null) result = casePathExpr(relativePathExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.STEP_EXPR:
      {
        StepExpr stepExpr = (StepExpr)theEObject;
        T result = caseStepExpr(stepExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.AXIS_STEP:
      {
        AxisStep axisStep = (AxisStep)theEObject;
        T result = caseAxisStep(axisStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.FORWARD_STEP:
      {
        ForwardStep forwardStep = (ForwardStep)theEObject;
        T result = caseForwardStep(forwardStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.FORWARD_AXIS:
      {
        ForwardAxis forwardAxis = (ForwardAxis)theEObject;
        T result = caseForwardAxis(forwardAxis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ABBREV_FORWARD_STEP:
      {
        AbbrevForwardStep abbrevForwardStep = (AbbrevForwardStep)theEObject;
        T result = caseAbbrevForwardStep(abbrevForwardStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.REVERSE_STEP:
      {
        ReverseStep reverseStep = (ReverseStep)theEObject;
        T result = caseReverseStep(reverseStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.NODE_TEST:
      {
        NodeTest nodeTest = (NodeTest)theEObject;
        T result = caseNodeTest(nodeTest);
        if (result == null) result = caseAbbrevForwardStep(nodeTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.NAME_TEST:
      {
        NameTest nameTest = (NameTest)theEObject;
        T result = caseNameTest(nameTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.WILDCARD:
      {
        Wildcard wildcard = (Wildcard)theEObject;
        T result = caseWildcard(wildcard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.FILTER_EXPR:
      {
        FilterExpr filterExpr = (FilterExpr)theEObject;
        T result = caseFilterExpr(filterExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.PREDICATE_LIST:
      {
        PredicateList predicateList = (PredicateList)theEObject;
        T result = casePredicateList(predicateList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.PREDICATE:
      {
        Predicate predicate = (Predicate)theEObject;
        T result = casePredicate(predicate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.PRIMARY_EXPR:
      {
        PrimaryExpr primaryExpr = (PrimaryExpr)theEObject;
        T result = casePrimaryExpr(primaryExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.NUMERIC_LITERAL:
      {
        NumericLiteral numericLiteral = (NumericLiteral)theEObject;
        T result = caseNumericLiteral(numericLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.VAR_REF:
      {
        VarRef varRef = (VarRef)theEObject;
        T result = caseVarRef(varRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.VAR_NAME:
      {
        VarName varName = (VarName)theEObject;
        T result = caseVarName(varName);
        if (result == null) result = caseVarRef(varName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.PARENTHESIZED_EXPR:
      {
        ParenthesizedExpr parenthesizedExpr = (ParenthesizedExpr)theEObject;
        T result = caseParenthesizedExpr(parenthesizedExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.FUNCTION_CALL:
      {
        FunctionCall functionCall = (FunctionCall)theEObject;
        T result = caseFunctionCall(functionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.SINGLE_TYPE:
      {
        SingleType singleType = (SingleType)theEObject;
        T result = caseSingleType(singleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.SEQUENCE_TYPE:
      {
        SequenceType sequenceType = (SequenceType)theEObject;
        T result = caseSequenceType(sequenceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ITEM_TYPE:
      {
        ItemType itemType = (ItemType)theEObject;
        T result = caseItemType(itemType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ATOMIC_TYPE:
      {
        AtomicType atomicType = (AtomicType)theEObject;
        T result = caseAtomicType(atomicType);
        if (result == null) result = caseSingleType(atomicType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.KIND_TEST:
      {
        KindTest kindTest = (KindTest)theEObject;
        T result = caseKindTest(kindTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.DOCUMENT_TEST:
      {
        DocumentTest documentTest = (DocumentTest)theEObject;
        T result = caseDocumentTest(documentTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.PI_TEST:
      {
        PITest piTest = (PITest)theEObject;
        T result = casePITest(piTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ATTRIBUTE_TEST:
      {
        AttributeTest attributeTest = (AttributeTest)theEObject;
        T result = caseAttributeTest(attributeTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ATTRIB_NAME_OR_WILDCARD:
      {
        AttribNameOrWildcard attribNameOrWildcard = (AttribNameOrWildcard)theEObject;
        T result = caseAttribNameOrWildcard(attribNameOrWildcard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.SCHEMA_ATTRIBUTE_TEST:
      {
        SchemaAttributeTest schemaAttributeTest = (SchemaAttributeTest)theEObject;
        T result = caseSchemaAttributeTest(schemaAttributeTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ATTRIBUTE_DECLARATION:
      {
        AttributeDeclaration attributeDeclaration = (AttributeDeclaration)theEObject;
        T result = caseAttributeDeclaration(attributeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ELEMENT_TEST:
      {
        ElementTest elementTest = (ElementTest)theEObject;
        T result = caseElementTest(elementTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ELEMENT_NAME_OR_WILDCARD:
      {
        ElementNameOrWildcard elementNameOrWildcard = (ElementNameOrWildcard)theEObject;
        T result = caseElementNameOrWildcard(elementNameOrWildcard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.SCHEMA_ELEMENT_TEST:
      {
        SchemaElementTest schemaElementTest = (SchemaElementTest)theEObject;
        T result = caseSchemaElementTest(schemaElementTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ELEMENT_DECLARATION:
      {
        ElementDeclaration elementDeclaration = (ElementDeclaration)theEObject;
        T result = caseElementDeclaration(elementDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ATTRIBUTE_NAME:
      {
        AttributeName attributeName = (AttributeName)theEObject;
        T result = caseAttributeName(attributeName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ELEMENT_NAME:
      {
        ElementName elementName = (ElementName)theEObject;
        T result = caseElementName(elementName);
        if (result == null) result = caseElementDeclaration(elementName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.TYPE_NAME:
      {
        TypeName typeName = (TypeName)theEObject;
        T result = caseTypeName(typeName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.NC_NAME:
      {
        NCName ncName = (NCName)theEObject;
        T result = caseNCName(ncName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.QNAME:
      {
        QName qName = (QName)theEObject;
        T result = caseQName(qName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.PREFIXED_NAME:
      {
        PrefixedName prefixedName = (PrefixedName)theEObject;
        T result = casePrefixedName(prefixedName);
        if (result == null) result = caseQName(prefixedName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.UNPREFIXED_NAME:
      {
        UnprefixedName unprefixedName = (UnprefixedName)theEObject;
        T result = caseUnprefixedName(unprefixedName);
        if (result == null) result = caseQName(unprefixedName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ADDITION:
      {
        Addition addition = (Addition)theEObject;
        T result = caseAddition(addition);
        if (result == null) result = caseAdditiveExpr(addition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.SUBSTRACTION:
      {
        Substraction substraction = (Substraction)theEObject;
        T result = caseSubstraction(substraction);
        if (result == null) result = caseAdditiveExpr(substraction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.MULTIPLICATION:
      {
        Multiplication multiplication = (Multiplication)theEObject;
        T result = caseMultiplication(multiplication);
        if (result == null) result = caseMultiplicativeExpr(multiplication);
        if (result == null) result = caseAdditiveExpr(multiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.DIVISION:
      {
        Division division = (Division)theEObject;
        T result = caseDivision(division);
        if (result == null) result = caseMultiplicativeExpr(division);
        if (result == null) result = caseAdditiveExpr(division);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.IDIVISION:
      {
        IDivision iDivision = (IDivision)theEObject;
        T result = caseIDivision(iDivision);
        if (result == null) result = caseMultiplicativeExpr(iDivision);
        if (result == null) result = caseAdditiveExpr(iDivision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.MOD:
      {
        Mod mod = (Mod)theEObject;
        T result = caseMod(mod);
        if (result == null) result = caseMultiplicativeExpr(mod);
        if (result == null) result = caseAdditiveExpr(mod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.UNION:
      {
        Union union = (Union)theEObject;
        T result = caseUnion(union);
        if (result == null) result = caseUnionExpr(union);
        if (result == null) result = caseMultiplicativeExpr(union);
        if (result == null) result = caseAdditiveExpr(union);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.PIPE:
      {
        Pipe pipe = (Pipe)theEObject;
        T result = casePipe(pipe);
        if (result == null) result = caseUnionExpr(pipe);
        if (result == null) result = caseMultiplicativeExpr(pipe);
        if (result == null) result = caseAdditiveExpr(pipe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.INTERSECT:
      {
        Intersect intersect = (Intersect)theEObject;
        T result = caseIntersect(intersect);
        if (result == null) result = caseIntersectExceptExpr(intersect);
        if (result == null) result = caseUnionExpr(intersect);
        if (result == null) result = caseMultiplicativeExpr(intersect);
        if (result == null) result = caseAdditiveExpr(intersect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.EXCEPT:
      {
        Except except = (Except)theEObject;
        T result = caseExcept(except);
        if (result == null) result = caseIntersectExceptExpr(except);
        if (result == null) result = caseUnionExpr(except);
        if (result == null) result = caseMultiplicativeExpr(except);
        if (result == null) result = caseAdditiveExpr(except);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.INSTANCEOF:
      {
        Instanceof instanceof_ = (Instanceof)theEObject;
        T result = caseInstanceof(instanceof_);
        if (result == null) result = caseInstanceofExpr(instanceof_);
        if (result == null) result = caseIntersectExceptExpr(instanceof_);
        if (result == null) result = caseUnionExpr(instanceof_);
        if (result == null) result = caseMultiplicativeExpr(instanceof_);
        if (result == null) result = caseAdditiveExpr(instanceof_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.TREAT_AS:
      {
        TreatAs treatAs = (TreatAs)theEObject;
        T result = caseTreatAs(treatAs);
        if (result == null) result = caseTreatExpr(treatAs);
        if (result == null) result = caseInstanceofExpr(treatAs);
        if (result == null) result = caseIntersectExceptExpr(treatAs);
        if (result == null) result = caseUnionExpr(treatAs);
        if (result == null) result = caseMultiplicativeExpr(treatAs);
        if (result == null) result = caseAdditiveExpr(treatAs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.CASTABLE:
      {
        Castable castable = (Castable)theEObject;
        T result = caseCastable(castable);
        if (result == null) result = caseCastableExpr(castable);
        if (result == null) result = caseTreatExpr(castable);
        if (result == null) result = caseInstanceofExpr(castable);
        if (result == null) result = caseIntersectExceptExpr(castable);
        if (result == null) result = caseUnionExpr(castable);
        if (result == null) result = caseMultiplicativeExpr(castable);
        if (result == null) result = caseAdditiveExpr(castable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.CAST_AS:
      {
        CastAs castAs = (CastAs)theEObject;
        T result = caseCastAs(castAs);
        if (result == null) result = caseCastExpr(castAs);
        if (result == null) result = caseCastableExpr(castAs);
        if (result == null) result = caseTreatExpr(castAs);
        if (result == null) result = caseInstanceofExpr(castAs);
        if (result == null) result = caseIntersectExceptExpr(castAs);
        if (result == null) result = caseUnionExpr(castAs);
        if (result == null) result = caseMultiplicativeExpr(castAs);
        if (result == null) result = caseAdditiveExpr(castAs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.REL_SINGLE:
      {
        RelSingle relSingle = (RelSingle)theEObject;
        T result = caseRelSingle(relSingle);
        if (result == null) result = casePathExpr(relSingle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.REL_DOUBLE:
      {
        RelDouble relDouble = (RelDouble)theEObject;
        T result = caseRelDouble(relDouble);
        if (result == null) result = casePathExpr(relDouble);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.REL_NO_SELECTOR:
      {
        RelNoSelector relNoSelector = (RelNoSelector)theEObject;
        T result = caseRelNoSelector(relNoSelector);
        if (result == null) result = casePathExpr(relNoSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.SINGLE:
      {
        Single single = (Single)theEObject;
        T result = caseSingle(single);
        if (result == null) result = caseStepExpr(single);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.DOUBLE:
      {
        org.xtext.example.xpath.xPath.Double double_ = (org.xtext.example.xpath.xPath.Double)theEObject;
        T result = caseDouble(double_);
        if (result == null) result = caseStepExpr(double_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = caseAbbrevForwardStep(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = caseAbbrevForwardStep(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XPathPackage.PIT_TEST:
      {
        PITTest pitTest = (PITTest)theEObject;
        T result = casePITTest(pitTest);
        if (result == null) result = casePITest(pitTest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xpath</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xpath</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXpath(Xpath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Single</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Single</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprSingle(ExprSingle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForExpr(ForExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple For Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple For Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleForClause(SimpleForClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Additional In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additional In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditionalIn(AdditionalIn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantified Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantified Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantifiedExpr(QuantifiedExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfExpr(IfExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpr(OrExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpr(AndExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparisonExpr(ComparisonExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeExpr(RangeExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Additive Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additive Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditiveExpr(AdditiveExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicative Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicativeExpr(MultiplicativeExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Union Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Union Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnionExpr(UnionExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intersect Except Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intersect Except Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntersectExceptExpr(IntersectExceptExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instanceof Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instanceof Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceofExpr(InstanceofExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Treat Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Treat Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTreatExpr(TreatExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Castable Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Castable Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCastableExpr(CastableExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cast Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cast Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCastExpr(CastExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpr(UnaryExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueExpr(ValueExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>General Comp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>General Comp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralComp(GeneralComp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Comp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Comp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueComp(ValueComp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Comp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Comp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeComp(NodeComp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathExpr(PathExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relative Path Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relative Path Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelativePathExpr(RelativePathExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Step Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Step Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStepExpr(StepExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Axis Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Axis Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAxisStep(AxisStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Forward Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Forward Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForwardStep(ForwardStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Forward Axis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Forward Axis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForwardAxis(ForwardAxis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abbrev Forward Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abbrev Forward Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbbrevForwardStep(AbbrevForwardStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reverse Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reverse Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReverseStep(ReverseStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeTest(NodeTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameTest(NameTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcard(Wildcard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterExpr(FilterExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateList(PredicateList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicate(Predicate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryExpr(PrimaryExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericLiteral(NumericLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarRef(VarRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarName(VarName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parenthesized Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parenthesized Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParenthesizedExpr(ParenthesizedExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCall(FunctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleType(SingleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceType(SequenceType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemType(ItemType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicType(AtomicType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kind Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kind Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKindTest(KindTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentTest(DocumentTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PI Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PI Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePITest(PITest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeTest(AttributeTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attrib Name Or Wildcard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attrib Name Or Wildcard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribNameOrWildcard(AttribNameOrWildcard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schema Attribute Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schema Attribute Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemaAttributeTest(SchemaAttributeTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeDeclaration(AttributeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementTest(ElementTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Name Or Wildcard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Name Or Wildcard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementNameOrWildcard(ElementNameOrWildcard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schema Element Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schema Element Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemaElementTest(SchemaElementTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementDeclaration(ElementDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeName(AttributeName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementName(ElementName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeName(TypeName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>NC Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>NC Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNCName(NCName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>QName</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>QName</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQName(QName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefixed Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefixed Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefixedName(PrefixedName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unprefixed Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unprefixed Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnprefixedName(UnprefixedName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddition(Addition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Substraction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Substraction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubstraction(Substraction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplication(Multiplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Division</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivision(Division object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IDivision</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IDivision</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIDivision(IDivision object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mod</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mod</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMod(Mod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Union</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Union</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnion(Union object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pipe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pipe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePipe(Pipe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intersect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intersect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntersect(Intersect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Except</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Except</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExcept(Except object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instanceof</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instanceof</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstanceof(Instanceof object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Treat As</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Treat As</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTreatAs(TreatAs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Castable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Castable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCastable(Castable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cast As</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cast As</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCastAs(CastAs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rel Single</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rel Single</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelSingle(RelSingle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rel Double</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rel Double</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelDouble(RelDouble object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rel No Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rel No Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelNoSelector(RelNoSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingle(Single object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDouble(org.xtext.example.xpath.xPath.Double object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PIT Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PIT Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePITTest(PITTest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //XPathSwitch
