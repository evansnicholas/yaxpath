/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import org.xtext.example.xpath.xPath.ElementDeclaration;
import org.xtext.example.xpath.xPath.ElementName;
import org.xtext.example.xpath.xPath.ElementNameOrWildcard;
import org.xtext.example.xpath.xPath.ElementTest;
import org.xtext.example.xpath.xPath.Expr;
import org.xtext.example.xpath.xPath.ExprSingle;
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
import org.xtext.example.xpath.xPath.PITest;
import org.xtext.example.xpath.xPath.ParenthesizedExpr;
import org.xtext.example.xpath.xPath.PathExpr;
import org.xtext.example.xpath.xPath.Predicate;
import org.xtext.example.xpath.xPath.PredicateList;
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
import org.xtext.example.xpath.xPath.SingleType;
import org.xtext.example.xpath.xPath.StepExpr;
import org.xtext.example.xpath.xPath.TreatExpr;
import org.xtext.example.xpath.xPath.TypeName;
import org.xtext.example.xpath.xPath.UnaryExpr;
import org.xtext.example.xpath.xPath.UnionExpr;
import org.xtext.example.xpath.xPath.ValueExpr;
import org.xtext.example.xpath.xPath.VarName;
import org.xtext.example.xpath.xPath.VarRef;
import org.xtext.example.xpath.xPath.Wildcard;
import org.xtext.example.xpath.xPath.XPathFactory;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XPathFactoryImpl extends EFactoryImpl implements XPathFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XPathFactory init()
  {
    try
    {
      XPathFactory theXPathFactory = (XPathFactory)EPackage.Registry.INSTANCE.getEFactory(XPathPackage.eNS_URI);
      if (theXPathFactory != null)
      {
        return theXPathFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XPathFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XPathFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XPathPackage.EXPR: return createExpr();
      case XPathPackage.EXPR_SINGLE: return createExprSingle();
      case XPathPackage.FOR_EXPR: return createForExpr();
      case XPathPackage.SIMPLE_FOR_CLAUSE: return createSimpleForClause();
      case XPathPackage.ADDITIONAL_IN: return createAdditionalIn();
      case XPathPackage.QUANTIFIED_EXPR: return createQuantifiedExpr();
      case XPathPackage.IF_EXPR: return createIfExpr();
      case XPathPackage.OR_EXPR: return createOrExpr();
      case XPathPackage.AND_EXPR: return createAndExpr();
      case XPathPackage.COMPARISON_EXPR: return createComparisonExpr();
      case XPathPackage.RANGE_EXPR: return createRangeExpr();
      case XPathPackage.ADDITIVE_EXPR: return createAdditiveExpr();
      case XPathPackage.MULTIPLICATIVE_EXPR: return createMultiplicativeExpr();
      case XPathPackage.UNION_EXPR: return createUnionExpr();
      case XPathPackage.INTERSECT_EXCEPT_EXPR: return createIntersectExceptExpr();
      case XPathPackage.INSTANCEOF_EXPR: return createInstanceofExpr();
      case XPathPackage.TREAT_EXPR: return createTreatExpr();
      case XPathPackage.CASTABLE_EXPR: return createCastableExpr();
      case XPathPackage.CAST_EXPR: return createCastExpr();
      case XPathPackage.UNARY_EXPR: return createUnaryExpr();
      case XPathPackage.VALUE_EXPR: return createValueExpr();
      case XPathPackage.PATH_EXPR: return createPathExpr();
      case XPathPackage.RELATIVE_PATH_EXPR: return createRelativePathExpr();
      case XPathPackage.STEP_EXPR: return createStepExpr();
      case XPathPackage.AXIS_STEP: return createAxisStep();
      case XPathPackage.FORWARD_STEP: return createForwardStep();
      case XPathPackage.ABBREV_FORWARD_STEP: return createAbbrevForwardStep();
      case XPathPackage.REVERSE_STEP: return createReverseStep();
      case XPathPackage.NODE_TEST: return createNodeTest();
      case XPathPackage.NAME_TEST: return createNameTest();
      case XPathPackage.WILDCARD: return createWildcard();
      case XPathPackage.FILTER_EXPR: return createFilterExpr();
      case XPathPackage.PREDICATE_LIST: return createPredicateList();
      case XPathPackage.PREDICATE: return createPredicate();
      case XPathPackage.PRIMARY_EXPR: return createPrimaryExpr();
      case XPathPackage.LITERAL: return createLiteral();
      case XPathPackage.NUMERIC_LITERAL: return createNumericLiteral();
      case XPathPackage.VAR_REF: return createVarRef();
      case XPathPackage.VAR_NAME: return createVarName();
      case XPathPackage.PARENTHESIZED_EXPR: return createParenthesizedExpr();
      case XPathPackage.FUNCTION_CALL: return createFunctionCall();
      case XPathPackage.SINGLE_TYPE: return createSingleType();
      case XPathPackage.SEQUENCE_TYPE: return createSequenceType();
      case XPathPackage.ITEM_TYPE: return createItemType();
      case XPathPackage.ATOMIC_TYPE: return createAtomicType();
      case XPathPackage.KIND_TEST: return createKindTest();
      case XPathPackage.DOCUMENT_TEST: return createDocumentTest();
      case XPathPackage.PI_TEST: return createPITest();
      case XPathPackage.ATTRIBUTE_TEST: return createAttributeTest();
      case XPathPackage.ATTRIB_NAME_OR_WILDCARD: return createAttribNameOrWildcard();
      case XPathPackage.SCHEMA_ATTRIBUTE_TEST: return createSchemaAttributeTest();
      case XPathPackage.ATTRIBUTE_DECLARATION: return createAttributeDeclaration();
      case XPathPackage.ELEMENT_TEST: return createElementTest();
      case XPathPackage.ELEMENT_NAME_OR_WILDCARD: return createElementNameOrWildcard();
      case XPathPackage.SCHEMA_ELEMENT_TEST: return createSchemaElementTest();
      case XPathPackage.ELEMENT_DECLARATION: return createElementDeclaration();
      case XPathPackage.ATTRIBUTE_NAME: return createAttributeName();
      case XPathPackage.ELEMENT_NAME: return createElementName();
      case XPathPackage.TYPE_NAME: return createTypeName();
      case XPathPackage.NC_NAME: return createNCName();
      case XPathPackage.REL_SINGLE: return createRelSingle();
      case XPathPackage.REL_DOUBLE: return createRelDouble();
      case XPathPackage.REL_NO_SELECTOR: return createRelNoSelector();
      case XPathPackage.SINGLE: return createSingle();
      case XPathPackage.DOUBLE: return createDouble();
      case XPathPackage.PIT_TEST: return createPITTest();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSingle createExprSingle()
  {
    ExprSingleImpl exprSingle = new ExprSingleImpl();
    return exprSingle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForExpr createForExpr()
  {
    ForExprImpl forExpr = new ForExprImpl();
    return forExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleForClause createSimpleForClause()
  {
    SimpleForClauseImpl simpleForClause = new SimpleForClauseImpl();
    return simpleForClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditionalIn createAdditionalIn()
  {
    AdditionalInImpl additionalIn = new AdditionalInImpl();
    return additionalIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedExpr createQuantifiedExpr()
  {
    QuantifiedExprImpl quantifiedExpr = new QuantifiedExprImpl();
    return quantifiedExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfExpr createIfExpr()
  {
    IfExprImpl ifExpr = new IfExprImpl();
    return ifExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpr createOrExpr()
  {
    OrExprImpl orExpr = new OrExprImpl();
    return orExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpr createAndExpr()
  {
    AndExprImpl andExpr = new AndExprImpl();
    return andExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparisonExpr createComparisonExpr()
  {
    ComparisonExprImpl comparisonExpr = new ComparisonExprImpl();
    return comparisonExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeExpr createRangeExpr()
  {
    RangeExprImpl rangeExpr = new RangeExprImpl();
    return rangeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpr createAdditiveExpr()
  {
    AdditiveExprImpl additiveExpr = new AdditiveExprImpl();
    return additiveExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeExpr createMultiplicativeExpr()
  {
    MultiplicativeExprImpl multiplicativeExpr = new MultiplicativeExprImpl();
    return multiplicativeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnionExpr createUnionExpr()
  {
    UnionExprImpl unionExpr = new UnionExprImpl();
    return unionExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntersectExceptExpr createIntersectExceptExpr()
  {
    IntersectExceptExprImpl intersectExceptExpr = new IntersectExceptExprImpl();
    return intersectExceptExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceofExpr createInstanceofExpr()
  {
    InstanceofExprImpl instanceofExpr = new InstanceofExprImpl();
    return instanceofExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TreatExpr createTreatExpr()
  {
    TreatExprImpl treatExpr = new TreatExprImpl();
    return treatExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastableExpr createCastableExpr()
  {
    CastableExprImpl castableExpr = new CastableExprImpl();
    return castableExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastExpr createCastExpr()
  {
    CastExprImpl castExpr = new CastExprImpl();
    return castExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpr createUnaryExpr()
  {
    UnaryExprImpl unaryExpr = new UnaryExprImpl();
    return unaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpr createValueExpr()
  {
    ValueExprImpl valueExpr = new ValueExprImpl();
    return valueExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpr createPathExpr()
  {
    PathExprImpl pathExpr = new PathExprImpl();
    return pathExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativePathExpr createRelativePathExpr()
  {
    RelativePathExprImpl relativePathExpr = new RelativePathExprImpl();
    return relativePathExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StepExpr createStepExpr()
  {
    StepExprImpl stepExpr = new StepExprImpl();
    return stepExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AxisStep createAxisStep()
  {
    AxisStepImpl axisStep = new AxisStepImpl();
    return axisStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForwardStep createForwardStep()
  {
    ForwardStepImpl forwardStep = new ForwardStepImpl();
    return forwardStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbbrevForwardStep createAbbrevForwardStep()
  {
    AbbrevForwardStepImpl abbrevForwardStep = new AbbrevForwardStepImpl();
    return abbrevForwardStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReverseStep createReverseStep()
  {
    ReverseStepImpl reverseStep = new ReverseStepImpl();
    return reverseStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeTest createNodeTest()
  {
    NodeTestImpl nodeTest = new NodeTestImpl();
    return nodeTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameTest createNameTest()
  {
    NameTestImpl nameTest = new NameTestImpl();
    return nameTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Wildcard createWildcard()
  {
    WildcardImpl wildcard = new WildcardImpl();
    return wildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterExpr createFilterExpr()
  {
    FilterExprImpl filterExpr = new FilterExprImpl();
    return filterExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateList createPredicateList()
  {
    PredicateListImpl predicateList = new PredicateListImpl();
    return predicateList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Predicate createPredicate()
  {
    PredicateImpl predicate = new PredicateImpl();
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpr createPrimaryExpr()
  {
    PrimaryExprImpl primaryExpr = new PrimaryExprImpl();
    return primaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericLiteral createNumericLiteral()
  {
    NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
    return numericLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarRef createVarRef()
  {
    VarRefImpl varRef = new VarRefImpl();
    return varRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarName createVarName()
  {
    VarNameImpl varName = new VarNameImpl();
    return varName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParenthesizedExpr createParenthesizedExpr()
  {
    ParenthesizedExprImpl parenthesizedExpr = new ParenthesizedExprImpl();
    return parenthesizedExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleType createSingleType()
  {
    SingleTypeImpl singleType = new SingleTypeImpl();
    return singleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceType createSequenceType()
  {
    SequenceTypeImpl sequenceType = new SequenceTypeImpl();
    return sequenceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemType createItemType()
  {
    ItemTypeImpl itemType = new ItemTypeImpl();
    return itemType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicType createAtomicType()
  {
    AtomicTypeImpl atomicType = new AtomicTypeImpl();
    return atomicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KindTest createKindTest()
  {
    KindTestImpl kindTest = new KindTestImpl();
    return kindTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentTest createDocumentTest()
  {
    DocumentTestImpl documentTest = new DocumentTestImpl();
    return documentTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PITest createPITest()
  {
    PITestImpl piTest = new PITestImpl();
    return piTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeTest createAttributeTest()
  {
    AttributeTestImpl attributeTest = new AttributeTestImpl();
    return attributeTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttribNameOrWildcard createAttribNameOrWildcard()
  {
    AttribNameOrWildcardImpl attribNameOrWildcard = new AttribNameOrWildcardImpl();
    return attribNameOrWildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaAttributeTest createSchemaAttributeTest()
  {
    SchemaAttributeTestImpl schemaAttributeTest = new SchemaAttributeTestImpl();
    return schemaAttributeTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeDeclaration createAttributeDeclaration()
  {
    AttributeDeclarationImpl attributeDeclaration = new AttributeDeclarationImpl();
    return attributeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementTest createElementTest()
  {
    ElementTestImpl elementTest = new ElementTestImpl();
    return elementTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementNameOrWildcard createElementNameOrWildcard()
  {
    ElementNameOrWildcardImpl elementNameOrWildcard = new ElementNameOrWildcardImpl();
    return elementNameOrWildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaElementTest createSchemaElementTest()
  {
    SchemaElementTestImpl schemaElementTest = new SchemaElementTestImpl();
    return schemaElementTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementDeclaration createElementDeclaration()
  {
    ElementDeclarationImpl elementDeclaration = new ElementDeclarationImpl();
    return elementDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeName createAttributeName()
  {
    AttributeNameImpl attributeName = new AttributeNameImpl();
    return attributeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementName createElementName()
  {
    ElementNameImpl elementName = new ElementNameImpl();
    return elementName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeName createTypeName()
  {
    TypeNameImpl typeName = new TypeNameImpl();
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NCName createNCName()
  {
    NCNameImpl ncName = new NCNameImpl();
    return ncName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelSingle createRelSingle()
  {
    RelSingleImpl relSingle = new RelSingleImpl();
    return relSingle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelDouble createRelDouble()
  {
    RelDoubleImpl relDouble = new RelDoubleImpl();
    return relDouble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelNoSelector createRelNoSelector()
  {
    RelNoSelectorImpl relNoSelector = new RelNoSelectorImpl();
    return relNoSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Single createSingle()
  {
    SingleImpl single = new SingleImpl();
    return single;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.xpath.xPath.Double createDouble()
  {
    DoubleImpl double_ = new DoubleImpl();
    return double_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PITTest createPITTest()
  {
    PITTestImpl pitTest = new PITTestImpl();
    return pitTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XPathPackage getXPathPackage()
  {
    return (XPathPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XPathPackage getPackage()
  {
    return XPathPackage.eINSTANCE;
  }

} //XPathFactoryImpl
