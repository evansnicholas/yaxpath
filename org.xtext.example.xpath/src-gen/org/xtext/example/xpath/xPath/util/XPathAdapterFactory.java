/**
 */
package org.xtext.example.xpath.xPath.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
import org.xtext.example.xpath.xPath.TreatExpr;
import org.xtext.example.xpath.xPath.TypeName;
import org.xtext.example.xpath.xPath.UnaryExpr;
import org.xtext.example.xpath.xPath.UnionExpr;
import org.xtext.example.xpath.xPath.UnprefixedName;
import org.xtext.example.xpath.xPath.ValueExpr;
import org.xtext.example.xpath.xPath.VarName;
import org.xtext.example.xpath.xPath.VarRef;
import org.xtext.example.xpath.xPath.Wildcard;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.xpath.xPath.XPathPackage
 * @generated
 */
public class XPathAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XPathPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XPathAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = XPathPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XPathSwitch<Adapter> modelSwitch =
    new XPathSwitch<Adapter>()
    {
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseExprSingle(ExprSingle object)
      {
        return createExprSingleAdapter();
      }
      @Override
      public Adapter caseForExpr(ForExpr object)
      {
        return createForExprAdapter();
      }
      @Override
      public Adapter caseSimpleForClause(SimpleForClause object)
      {
        return createSimpleForClauseAdapter();
      }
      @Override
      public Adapter caseAdditionalIn(AdditionalIn object)
      {
        return createAdditionalInAdapter();
      }
      @Override
      public Adapter caseQuantifiedExpr(QuantifiedExpr object)
      {
        return createQuantifiedExprAdapter();
      }
      @Override
      public Adapter caseIfExpr(IfExpr object)
      {
        return createIfExprAdapter();
      }
      @Override
      public Adapter caseOrExpr(OrExpr object)
      {
        return createOrExprAdapter();
      }
      @Override
      public Adapter caseAndExpr(AndExpr object)
      {
        return createAndExprAdapter();
      }
      @Override
      public Adapter caseComparisonExpr(ComparisonExpr object)
      {
        return createComparisonExprAdapter();
      }
      @Override
      public Adapter caseRangeExpr(RangeExpr object)
      {
        return createRangeExprAdapter();
      }
      @Override
      public Adapter caseAdditiveExpr(AdditiveExpr object)
      {
        return createAdditiveExprAdapter();
      }
      @Override
      public Adapter caseMultiplicativeExpr(MultiplicativeExpr object)
      {
        return createMultiplicativeExprAdapter();
      }
      @Override
      public Adapter caseUnionExpr(UnionExpr object)
      {
        return createUnionExprAdapter();
      }
      @Override
      public Adapter caseIntersectExceptExpr(IntersectExceptExpr object)
      {
        return createIntersectExceptExprAdapter();
      }
      @Override
      public Adapter caseInstanceofExpr(InstanceofExpr object)
      {
        return createInstanceofExprAdapter();
      }
      @Override
      public Adapter caseTreatExpr(TreatExpr object)
      {
        return createTreatExprAdapter();
      }
      @Override
      public Adapter caseCastableExpr(CastableExpr object)
      {
        return createCastableExprAdapter();
      }
      @Override
      public Adapter caseCastExpr(CastExpr object)
      {
        return createCastExprAdapter();
      }
      @Override
      public Adapter caseUnaryExpr(UnaryExpr object)
      {
        return createUnaryExprAdapter();
      }
      @Override
      public Adapter caseValueExpr(ValueExpr object)
      {
        return createValueExprAdapter();
      }
      @Override
      public Adapter casePathExpr(PathExpr object)
      {
        return createPathExprAdapter();
      }
      @Override
      public Adapter caseRelativePathExpr(RelativePathExpr object)
      {
        return createRelativePathExprAdapter();
      }
      @Override
      public Adapter caseStepExpr(StepExpr object)
      {
        return createStepExprAdapter();
      }
      @Override
      public Adapter caseAxisStep(AxisStep object)
      {
        return createAxisStepAdapter();
      }
      @Override
      public Adapter caseForwardStep(ForwardStep object)
      {
        return createForwardStepAdapter();
      }
      @Override
      public Adapter caseAbbrevForwardStep(AbbrevForwardStep object)
      {
        return createAbbrevForwardStepAdapter();
      }
      @Override
      public Adapter caseReverseStep(ReverseStep object)
      {
        return createReverseStepAdapter();
      }
      @Override
      public Adapter caseNodeTest(NodeTest object)
      {
        return createNodeTestAdapter();
      }
      @Override
      public Adapter caseNameTest(NameTest object)
      {
        return createNameTestAdapter();
      }
      @Override
      public Adapter caseWildcard(Wildcard object)
      {
        return createWildcardAdapter();
      }
      @Override
      public Adapter caseFilterExpr(FilterExpr object)
      {
        return createFilterExprAdapter();
      }
      @Override
      public Adapter casePredicateList(PredicateList object)
      {
        return createPredicateListAdapter();
      }
      @Override
      public Adapter casePredicate(Predicate object)
      {
        return createPredicateAdapter();
      }
      @Override
      public Adapter casePrimaryExpr(PrimaryExpr object)
      {
        return createPrimaryExprAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseNumericLiteral(NumericLiteral object)
      {
        return createNumericLiteralAdapter();
      }
      @Override
      public Adapter caseVarRef(VarRef object)
      {
        return createVarRefAdapter();
      }
      @Override
      public Adapter caseVarName(VarName object)
      {
        return createVarNameAdapter();
      }
      @Override
      public Adapter caseParenthesizedExpr(ParenthesizedExpr object)
      {
        return createParenthesizedExprAdapter();
      }
      @Override
      public Adapter caseFunctionCall(FunctionCall object)
      {
        return createFunctionCallAdapter();
      }
      @Override
      public Adapter caseSingleType(SingleType object)
      {
        return createSingleTypeAdapter();
      }
      @Override
      public Adapter caseSequenceType(SequenceType object)
      {
        return createSequenceTypeAdapter();
      }
      @Override
      public Adapter caseItemType(ItemType object)
      {
        return createItemTypeAdapter();
      }
      @Override
      public Adapter caseAtomicType(AtomicType object)
      {
        return createAtomicTypeAdapter();
      }
      @Override
      public Adapter caseKindTest(KindTest object)
      {
        return createKindTestAdapter();
      }
      @Override
      public Adapter caseDocumentTest(DocumentTest object)
      {
        return createDocumentTestAdapter();
      }
      @Override
      public Adapter casePITest(PITest object)
      {
        return createPITestAdapter();
      }
      @Override
      public Adapter caseAttributeTest(AttributeTest object)
      {
        return createAttributeTestAdapter();
      }
      @Override
      public Adapter caseAttribNameOrWildcard(AttribNameOrWildcard object)
      {
        return createAttribNameOrWildcardAdapter();
      }
      @Override
      public Adapter caseSchemaAttributeTest(SchemaAttributeTest object)
      {
        return createSchemaAttributeTestAdapter();
      }
      @Override
      public Adapter caseAttributeDeclaration(AttributeDeclaration object)
      {
        return createAttributeDeclarationAdapter();
      }
      @Override
      public Adapter caseElementTest(ElementTest object)
      {
        return createElementTestAdapter();
      }
      @Override
      public Adapter caseElementNameOrWildcard(ElementNameOrWildcard object)
      {
        return createElementNameOrWildcardAdapter();
      }
      @Override
      public Adapter caseSchemaElementTest(SchemaElementTest object)
      {
        return createSchemaElementTestAdapter();
      }
      @Override
      public Adapter caseElementDeclaration(ElementDeclaration object)
      {
        return createElementDeclarationAdapter();
      }
      @Override
      public Adapter caseAttributeName(AttributeName object)
      {
        return createAttributeNameAdapter();
      }
      @Override
      public Adapter caseElementName(ElementName object)
      {
        return createElementNameAdapter();
      }
      @Override
      public Adapter caseTypeName(TypeName object)
      {
        return createTypeNameAdapter();
      }
      @Override
      public Adapter caseNCName(NCName object)
      {
        return createNCNameAdapter();
      }
      @Override
      public Adapter caseQName(QName object)
      {
        return createQNameAdapter();
      }
      @Override
      public Adapter casePrefixedName(PrefixedName object)
      {
        return createPrefixedNameAdapter();
      }
      @Override
      public Adapter caseUnprefixedName(UnprefixedName object)
      {
        return createUnprefixedNameAdapter();
      }
      @Override
      public Adapter caseRelSingle(RelSingle object)
      {
        return createRelSingleAdapter();
      }
      @Override
      public Adapter caseRelDouble(RelDouble object)
      {
        return createRelDoubleAdapter();
      }
      @Override
      public Adapter caseRelNoSelector(RelNoSelector object)
      {
        return createRelNoSelectorAdapter();
      }
      @Override
      public Adapter caseSingle(Single object)
      {
        return createSingleAdapter();
      }
      @Override
      public Adapter caseDouble(org.xtext.example.xpath.xPath.Double object)
      {
        return createDoubleAdapter();
      }
      @Override
      public Adapter casePITTest(PITTest object)
      {
        return createPITTestAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.ExprSingle <em>Expr Single</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.ExprSingle
   * @generated
   */
  public Adapter createExprSingleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.ForExpr <em>For Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.ForExpr
   * @generated
   */
  public Adapter createForExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.SimpleForClause <em>Simple For Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.SimpleForClause
   * @generated
   */
  public Adapter createSimpleForClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.AdditionalIn <em>Additional In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.AdditionalIn
   * @generated
   */
  public Adapter createAdditionalInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.QuantifiedExpr <em>Quantified Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.QuantifiedExpr
   * @generated
   */
  public Adapter createQuantifiedExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.IfExpr <em>If Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.IfExpr
   * @generated
   */
  public Adapter createIfExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.OrExpr <em>Or Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.OrExpr
   * @generated
   */
  public Adapter createOrExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.AndExpr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.AndExpr
   * @generated
   */
  public Adapter createAndExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.ComparisonExpr <em>Comparison Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.ComparisonExpr
   * @generated
   */
  public Adapter createComparisonExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.RangeExpr <em>Range Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.RangeExpr
   * @generated
   */
  public Adapter createRangeExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.AdditiveExpr <em>Additive Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.AdditiveExpr
   * @generated
   */
  public Adapter createAdditiveExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.MultiplicativeExpr <em>Multiplicative Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.MultiplicativeExpr
   * @generated
   */
  public Adapter createMultiplicativeExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.UnionExpr <em>Union Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.UnionExpr
   * @generated
   */
  public Adapter createUnionExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.IntersectExceptExpr <em>Intersect Except Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.IntersectExceptExpr
   * @generated
   */
  public Adapter createIntersectExceptExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.InstanceofExpr <em>Instanceof Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.InstanceofExpr
   * @generated
   */
  public Adapter createInstanceofExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.TreatExpr <em>Treat Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.TreatExpr
   * @generated
   */
  public Adapter createTreatExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.CastableExpr <em>Castable Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.CastableExpr
   * @generated
   */
  public Adapter createCastableExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.CastExpr <em>Cast Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.CastExpr
   * @generated
   */
  public Adapter createCastExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.UnaryExpr <em>Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.UnaryExpr
   * @generated
   */
  public Adapter createUnaryExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.ValueExpr <em>Value Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.ValueExpr
   * @generated
   */
  public Adapter createValueExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.PathExpr <em>Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.PathExpr
   * @generated
   */
  public Adapter createPathExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.RelativePathExpr <em>Relative Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.RelativePathExpr
   * @generated
   */
  public Adapter createRelativePathExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.StepExpr <em>Step Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.StepExpr
   * @generated
   */
  public Adapter createStepExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.AxisStep <em>Axis Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.AxisStep
   * @generated
   */
  public Adapter createAxisStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.ForwardStep <em>Forward Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.ForwardStep
   * @generated
   */
  public Adapter createForwardStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.AbbrevForwardStep <em>Abbrev Forward Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.AbbrevForwardStep
   * @generated
   */
  public Adapter createAbbrevForwardStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.ReverseStep <em>Reverse Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.ReverseStep
   * @generated
   */
  public Adapter createReverseStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.NodeTest <em>Node Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.NodeTest
   * @generated
   */
  public Adapter createNodeTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.NameTest <em>Name Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.NameTest
   * @generated
   */
  public Adapter createNameTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.Wildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.Wildcard
   * @generated
   */
  public Adapter createWildcardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.FilterExpr <em>Filter Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.FilterExpr
   * @generated
   */
  public Adapter createFilterExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.PredicateList <em>Predicate List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.PredicateList
   * @generated
   */
  public Adapter createPredicateListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.Predicate
   * @generated
   */
  public Adapter createPredicateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.PrimaryExpr <em>Primary Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.PrimaryExpr
   * @generated
   */
  public Adapter createPrimaryExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.NumericLiteral
   * @generated
   */
  public Adapter createNumericLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.VarRef <em>Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.VarRef
   * @generated
   */
  public Adapter createVarRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.VarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.VarName
   * @generated
   */
  public Adapter createVarNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.ParenthesizedExpr <em>Parenthesized Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.ParenthesizedExpr
   * @generated
   */
  public Adapter createParenthesizedExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.FunctionCall
   * @generated
   */
  public Adapter createFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.SingleType <em>Single Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.SingleType
   * @generated
   */
  public Adapter createSingleTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.SequenceType <em>Sequence Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.SequenceType
   * @generated
   */
  public Adapter createSequenceTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.ItemType <em>Item Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.ItemType
   * @generated
   */
  public Adapter createItemTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.AtomicType <em>Atomic Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.AtomicType
   * @generated
   */
  public Adapter createAtomicTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.KindTest <em>Kind Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.KindTest
   * @generated
   */
  public Adapter createKindTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.DocumentTest <em>Document Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.DocumentTest
   * @generated
   */
  public Adapter createDocumentTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.PITest <em>PI Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.PITest
   * @generated
   */
  public Adapter createPITestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.AttributeTest <em>Attribute Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.AttributeTest
   * @generated
   */
  public Adapter createAttributeTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.AttribNameOrWildcard <em>Attrib Name Or Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.AttribNameOrWildcard
   * @generated
   */
  public Adapter createAttribNameOrWildcardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.SchemaAttributeTest <em>Schema Attribute Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.SchemaAttributeTest
   * @generated
   */
  public Adapter createSchemaAttributeTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.AttributeDeclaration <em>Attribute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.AttributeDeclaration
   * @generated
   */
  public Adapter createAttributeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.ElementTest <em>Element Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.ElementTest
   * @generated
   */
  public Adapter createElementTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.ElementNameOrWildcard <em>Element Name Or Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.ElementNameOrWildcard
   * @generated
   */
  public Adapter createElementNameOrWildcardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.SchemaElementTest <em>Schema Element Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.SchemaElementTest
   * @generated
   */
  public Adapter createSchemaElementTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.ElementDeclaration <em>Element Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.ElementDeclaration
   * @generated
   */
  public Adapter createElementDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.AttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.AttributeName
   * @generated
   */
  public Adapter createAttributeNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.ElementName <em>Element Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.ElementName
   * @generated
   */
  public Adapter createElementNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.TypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.TypeName
   * @generated
   */
  public Adapter createTypeNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.NCName <em>NC Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.NCName
   * @generated
   */
  public Adapter createNCNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.QName <em>QName</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.QName
   * @generated
   */
  public Adapter createQNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.PrefixedName <em>Prefixed Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.PrefixedName
   * @generated
   */
  public Adapter createPrefixedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.UnprefixedName <em>Unprefixed Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.UnprefixedName
   * @generated
   */
  public Adapter createUnprefixedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.RelSingle <em>Rel Single</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.RelSingle
   * @generated
   */
  public Adapter createRelSingleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.RelDouble <em>Rel Double</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.RelDouble
   * @generated
   */
  public Adapter createRelDoubleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.RelNoSelector <em>Rel No Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.RelNoSelector
   * @generated
   */
  public Adapter createRelNoSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.Single <em>Single</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.Single
   * @generated
   */
  public Adapter createSingleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.Double <em>Double</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.Double
   * @generated
   */
  public Adapter createDoubleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.xpath.xPath.PITTest <em>PIT Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.xpath.xPath.PITTest
   * @generated
   */
  public Adapter createPITTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //XPathAdapterFactory
