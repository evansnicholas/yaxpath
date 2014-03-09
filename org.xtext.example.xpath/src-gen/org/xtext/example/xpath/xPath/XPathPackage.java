/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.xpath.xPath.XPathFactory
 * @model kind="package"
 * @generated
 */
public interface XPathPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "xPath";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/xpath/XPath";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "xPath";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XPathPackage eINSTANCE = org.xtext.example.xpath.xPath.impl.XPathPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.ExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 0;

  /**
   * The feature id for the '<em><b>Expr Single</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXPR_SINGLE = 0;

  /**
   * The feature id for the '<em><b>Exprs Single</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXPRS_SINGLE = 1;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.ExprSingleImpl <em>Expr Single</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.ExprSingleImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getExprSingle()
   * @generated
   */
  int EXPR_SINGLE = 1;

  /**
   * The number of structural features of the '<em>Expr Single</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_SINGLE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.ForExprImpl <em>For Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.ForExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getForExpr()
   * @generated
   */
  int FOR_EXPR = 2;

  /**
   * The feature id for the '<em><b>For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPR__FOR = EXPR_SINGLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPR__RETURN = EXPR_SINGLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>For Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_EXPR_FEATURE_COUNT = EXPR_SINGLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.SimpleForClauseImpl <em>Simple For Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.SimpleForClauseImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getSimpleForClause()
   * @generated
   */
  int SIMPLE_FOR_CLAUSE = 3;

  /**
   * The feature id for the '<em><b>For Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FOR_CLAUSE__FOR_VAR = 0;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FOR_CLAUSE__IN = 1;

  /**
   * The feature id for the '<em><b>Additional In</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FOR_CLAUSE__ADDITIONAL_IN = 2;

  /**
   * The number of structural features of the '<em>Simple For Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_FOR_CLAUSE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.AdditionalInImpl <em>Additional In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.AdditionalInImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAdditionalIn()
   * @generated
   */
  int ADDITIONAL_IN = 4;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_IN__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_IN__IN = 1;

  /**
   * The number of structural features of the '<em>Additional In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIONAL_IN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.QuantifiedExprImpl <em>Quantified Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.QuantifiedExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getQuantifiedExpr()
   * @generated
   */
  int QUANTIFIED_EXPR = 5;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPR__VARIABLE = EXPR_SINGLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPR__IN = EXPR_SINGLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Additional In</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPR__ADDITIONAL_IN = EXPR_SINGLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Satisfy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPR__SATISFY = EXPR_SINGLE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Quantified Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_EXPR_FEATURE_COUNT = EXPR_SINGLE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.IfExprImpl <em>If Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.IfExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getIfExpr()
   * @generated
   */
  int IF_EXPR = 6;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPR__IF = EXPR_SINGLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPR__THEN = EXPR_SINGLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPR__ELSE = EXPR_SINGLE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_EXPR_FEATURE_COUNT = EXPR_SINGLE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.OrExprImpl <em>Or Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.OrExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getOrExpr()
   * @generated
   */
  int OR_EXPR = 7;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__LEFT = EXPR_SINGLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rights</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__RIGHTS = EXPR_SINGLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR_FEATURE_COUNT = EXPR_SINGLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.AndExprImpl <em>And Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.AndExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAndExpr()
   * @generated
   */
  int AND_EXPR = 8;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__LEFT = 0;

  /**
   * The feature id for the '<em><b>Rights</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__RIGHTS = 1;

  /**
   * The number of structural features of the '<em>And Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.ComparisonExprImpl <em>Comparison Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.ComparisonExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getComparisonExpr()
   * @generated
   */
  int COMPARISON_EXPR = 9;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__RANGE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__VALUE = 1;

  /**
   * The feature id for the '<em><b>Gen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__GEN = 2;

  /**
   * The feature id for the '<em><b>Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__NODE = 3;

  /**
   * The feature id for the '<em><b>Other Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR__OTHER_RANGE = 4;

  /**
   * The number of structural features of the '<em>Comparison Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.RangeExprImpl <em>Range Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.RangeExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getRangeExpr()
   * @generated
   */
  int RANGE_EXPR = 10;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_EXPR__FROM = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_EXPR__TO = 1;

  /**
   * The number of structural features of the '<em>Range Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.AdditiveExprImpl <em>Additive Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.AdditiveExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAdditiveExpr()
   * @generated
   */
  int ADDITIVE_EXPR = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPR__LEFT = 0;

  /**
   * The feature id for the '<em><b>Rights</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPR__RIGHTS = 1;

  /**
   * The number of structural features of the '<em>Additive Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.MultiplicativeExprImpl <em>Multiplicative Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.MultiplicativeExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getMultiplicativeExpr()
   * @generated
   */
  int MULTIPLICATIVE_EXPR = 12;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPR__LEFT = 0;

  /**
   * The feature id for the '<em><b>Rights</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPR__RIGHTS = 1;

  /**
   * The number of structural features of the '<em>Multiplicative Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.UnionExprImpl <em>Union Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.UnionExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getUnionExpr()
   * @generated
   */
  int UNION_EXPR = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_EXPR__LEFT = 0;

  /**
   * The feature id for the '<em><b>Rights</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_EXPR__RIGHTS = 1;

  /**
   * The number of structural features of the '<em>Union Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.IntersectExceptExprImpl <em>Intersect Except Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.IntersectExceptExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getIntersectExceptExpr()
   * @generated
   */
  int INTERSECT_EXCEPT_EXPR = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERSECT_EXCEPT_EXPR__LEFT = 0;

  /**
   * The feature id for the '<em><b>Rights</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERSECT_EXCEPT_EXPR__RIGHTS = 1;

  /**
   * The number of structural features of the '<em>Intersect Except Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERSECT_EXCEPT_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.InstanceofExprImpl <em>Instanceof Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.InstanceofExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getInstanceofExpr()
   * @generated
   */
  int INSTANCEOF_EXPR = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCEOF_EXPR__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCEOF_EXPR__RIGHT = 1;

  /**
   * The number of structural features of the '<em>Instanceof Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCEOF_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.TreatExprImpl <em>Treat Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.TreatExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getTreatExpr()
   * @generated
   */
  int TREAT_EXPR = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREAT_EXPR__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREAT_EXPR__RIGHT = 1;

  /**
   * The number of structural features of the '<em>Treat Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREAT_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.CastableExprImpl <em>Castable Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.CastableExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getCastableExpr()
   * @generated
   */
  int CASTABLE_EXPR = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASTABLE_EXPR__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASTABLE_EXPR__RIGHT = 1;

  /**
   * The number of structural features of the '<em>Castable Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASTABLE_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.CastExprImpl <em>Cast Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.CastExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getCastExpr()
   * @generated
   */
  int CAST_EXPR = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPR__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPR__RIGHT = 1;

  /**
   * The number of structural features of the '<em>Cast Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.UnaryExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getUnaryExpr()
   * @generated
   */
  int UNARY_EXPR = 19;

  /**
   * The feature id for the '<em><b>Unary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR__UNARY = 0;

  /**
   * The number of structural features of the '<em>Unary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.ValueExprImpl <em>Value Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.ValueExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getValueExpr()
   * @generated
   */
  int VALUE_EXPR = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_EXPR__VALUE = 0;

  /**
   * The number of structural features of the '<em>Value Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.PathExprImpl <em>Path Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.PathExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getPathExpr()
   * @generated
   */
  int PATH_EXPR = 21;

  /**
   * The feature id for the '<em><b>Single Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR__SINGLE_PATH = 0;

  /**
   * The feature id for the '<em><b>Double Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR__DOUBLE_PATH = 1;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR__PATH = 2;

  /**
   * The number of structural features of the '<em>Path Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.RelativePathExprImpl <em>Relative Path Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.RelativePathExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getRelativePathExpr()
   * @generated
   */
  int RELATIVE_PATH_EXPR = 22;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_PATH_EXPR__LEFT = 0;

  /**
   * The feature id for the '<em><b>Rights</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_PATH_EXPR__RIGHTS = 1;

  /**
   * The number of structural features of the '<em>Relative Path Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_PATH_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.StepExprImpl <em>Step Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.StepExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getStepExpr()
   * @generated
   */
  int STEP_EXPR = 23;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_EXPR__FILTER = 0;

  /**
   * The feature id for the '<em><b>Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_EXPR__STEP = 1;

  /**
   * The number of structural features of the '<em>Step Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.AxisStepImpl <em>Axis Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.AxisStepImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAxisStep()
   * @generated
   */
  int AXIS_STEP = 24;

  /**
   * The feature id for the '<em><b>Reverse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIS_STEP__REVERSE = 0;

  /**
   * The feature id for the '<em><b>Forward</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIS_STEP__FORWARD = 1;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIS_STEP__PREDICATE = 2;

  /**
   * The number of structural features of the '<em>Axis Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AXIS_STEP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.ForwardStepImpl <em>Forward Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.ForwardStepImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getForwardStep()
   * @generated
   */
  int FORWARD_STEP = 25;

  /**
   * The feature id for the '<em><b>Forward</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_STEP__FORWARD = 0;

  /**
   * The feature id for the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_STEP__TEST = 1;

  /**
   * The feature id for the '<em><b>Abbr Forward</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_STEP__ABBR_FORWARD = 2;

  /**
   * The number of structural features of the '<em>Forward Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_STEP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.AbbrevForwardStepImpl <em>Abbrev Forward Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.AbbrevForwardStepImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAbbrevForwardStep()
   * @generated
   */
  int ABBREV_FORWARD_STEP = 26;

  /**
   * The feature id for the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREV_FORWARD_STEP__TEST = 0;

  /**
   * The number of structural features of the '<em>Abbrev Forward Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREV_FORWARD_STEP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.ReverseStepImpl <em>Reverse Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.ReverseStepImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getReverseStep()
   * @generated
   */
  int REVERSE_STEP = 27;

  /**
   * The feature id for the '<em><b>Reverse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERSE_STEP__REVERSE = 0;

  /**
   * The feature id for the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERSE_STEP__TEST = 1;

  /**
   * The feature id for the '<em><b>Abbr Rev Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERSE_STEP__ABBR_REV_SET = 2;

  /**
   * The number of structural features of the '<em>Reverse Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERSE_STEP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.NodeTestImpl <em>Node Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.NodeTestImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getNodeTest()
   * @generated
   */
  int NODE_TEST = 28;

  /**
   * The feature id for the '<em><b>Kind Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TEST__KIND_TEST = 0;

  /**
   * The feature id for the '<em><b>Node Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TEST__NODE_TEST = 1;

  /**
   * The number of structural features of the '<em>Node Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_TEST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.NameTestImpl <em>Name Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.NameTestImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getNameTest()
   * @generated
   */
  int NAME_TEST = 29;

  /**
   * The feature id for the '<em><b>QName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TEST__QNAME = 0;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TEST__WILDCARD = 1;

  /**
   * The number of structural features of the '<em>Name Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TEST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.WildcardImpl <em>Wildcard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.WildcardImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getWildcard()
   * @generated
   */
  int WILDCARD = 30;

  /**
   * The feature id for the '<em><b>Wild</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD__WILD = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD__LEFT = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Wildcard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.FilterExprImpl <em>Filter Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.FilterExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getFilterExpr()
   * @generated
   */
  int FILTER_EXPR = 31;

  /**
   * The feature id for the '<em><b>Primary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_EXPR__PRIMARY = 0;

  /**
   * The feature id for the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_EXPR__PREDICATE = 1;

  /**
   * The number of structural features of the '<em>Filter Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.PredicateListImpl <em>Predicate List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.PredicateListImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getPredicateList()
   * @generated
   */
  int PREDICATE_LIST = 32;

  /**
   * The feature id for the '<em><b>Predicates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_LIST__PREDICATES = 0;

  /**
   * The number of structural features of the '<em>Predicate List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.PredicateImpl <em>Predicate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.PredicateImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getPredicate()
   * @generated
   */
  int PREDICATE = 33;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE__EXPR = 0;

  /**
   * The number of structural features of the '<em>Predicate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.PrimaryExprImpl <em>Primary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.PrimaryExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getPrimaryExpr()
   * @generated
   */
  int PRIMARY_EXPR = 34;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPR__LITERAL = 0;

  /**
   * The feature id for the '<em><b>Var Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPR__VAR_REF = 1;

  /**
   * The feature id for the '<em><b>Par Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPR__PAR_EXPR = 2;

  /**
   * The feature id for the '<em><b>Con Item Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPR__CON_ITEM_EXPR = 3;

  /**
   * The feature id for the '<em><b>Function Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPR__FUNCTION_CALL = 4;

  /**
   * The number of structural features of the '<em>Primary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.LiteralImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 35;

  /**
   * The feature id for the '<em><b>Num</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__NUM = 0;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__STRING = 1;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.NumericLiteralImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getNumericLiteral()
   * @generated
   */
  int NUMERIC_LITERAL = 36;

  /**
   * The feature id for the '<em><b>Int Lit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL__INT_LIT = 0;

  /**
   * The feature id for the '<em><b>Dec Lit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL__DEC_LIT = 1;

  /**
   * The feature id for the '<em><b>Double Lit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL__DOUBLE_LIT = 2;

  /**
   * The number of structural features of the '<em>Numeric Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.VarRefImpl <em>Var Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.VarRefImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getVarRef()
   * @generated
   */
  int VAR_REF = 37;

  /**
   * The number of structural features of the '<em>Var Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.VarNameImpl <em>Var Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.VarNameImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getVarName()
   * @generated
   */
  int VAR_NAME = 38;

  /**
   * The feature id for the '<em><b>QName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_NAME__QNAME = VAR_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Var Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_NAME_FEATURE_COUNT = VAR_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.ParenthesizedExprImpl <em>Parenthesized Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.ParenthesizedExprImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getParenthesizedExpr()
   * @generated
   */
  int PARENTHESIZED_EXPR = 39;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR__EXPR = 0;

  /**
   * The number of structural features of the '<em>Parenthesized Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.FunctionCallImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 40;

  /**
   * The feature id for the '<em><b>QName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__QNAME = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__EXPR = 1;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__EXPRS = 2;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.SingleTypeImpl <em>Single Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.SingleTypeImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getSingleType()
   * @generated
   */
  int SINGLE_TYPE = 41;

  /**
   * The number of structural features of the '<em>Single Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.SequenceTypeImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getSequenceType()
   * @generated
   */
  int SEQUENCE_TYPE = 42;

  /**
   * The feature id for the '<em><b>Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_TYPE__EMPTY = 0;

  /**
   * The feature id for the '<em><b>Item Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_TYPE__ITEM_TYPE = 1;

  /**
   * The feature id for the '<em><b>Occ Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_TYPE__OCC_IND = 2;

  /**
   * The number of structural features of the '<em>Sequence Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.ItemTypeImpl <em>Item Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.ItemTypeImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getItemType()
   * @generated
   */
  int ITEM_TYPE = 43;

  /**
   * The feature id for the '<em><b>Kind Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE__KIND_TEST = 0;

  /**
   * The feature id for the '<em><b>Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE__EMPTY = 1;

  /**
   * The feature id for the '<em><b>Atomic Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE__ATOMIC_TYPE = 2;

  /**
   * The number of structural features of the '<em>Item Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.AtomicTypeImpl <em>Atomic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.AtomicTypeImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAtomicType()
   * @generated
   */
  int ATOMIC_TYPE = 44;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_TYPE__TYPE = SINGLE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Atomic Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_TYPE_FEATURE_COUNT = SINGLE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.KindTestImpl <em>Kind Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.KindTestImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getKindTest()
   * @generated
   */
  int KIND_TEST = 45;

  /**
   * The feature id for the '<em><b>Doc Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND_TEST__DOC_TEST = 0;

  /**
   * The feature id for the '<em><b>Elem Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND_TEST__ELEM_TEST = 1;

  /**
   * The feature id for the '<em><b>Attribute Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND_TEST__ATTRIBUTE_TEST = 2;

  /**
   * The feature id for the '<em><b>Schema Elem Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND_TEST__SCHEMA_ELEM_TEST = 3;

  /**
   * The feature id for the '<em><b>Schema Attribute Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND_TEST__SCHEMA_ATTRIBUTE_TEST = 4;

  /**
   * The feature id for the '<em><b>Pit Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND_TEST__PIT_TEST = 5;

  /**
   * The feature id for the '<em><b>Comment Test</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND_TEST__COMMENT_TEST = 6;

  /**
   * The feature id for the '<em><b>Text Test</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND_TEST__TEXT_TEST = 7;

  /**
   * The feature id for the '<em><b>Any Kind Test</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND_TEST__ANY_KIND_TEST = 8;

  /**
   * The number of structural features of the '<em>Kind Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KIND_TEST_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.DocumentTestImpl <em>Document Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.DocumentTestImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getDocumentTest()
   * @generated
   */
  int DOCUMENT_TEST = 46;

  /**
   * The feature id for the '<em><b>Elem Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_TEST__ELEM_TEST = 0;

  /**
   * The feature id for the '<em><b>Schema Elem Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_TEST__SCHEMA_ELEM_TEST = 1;

  /**
   * The number of structural features of the '<em>Document Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_TEST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.PITestImpl <em>PI Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.PITestImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getPITest()
   * @generated
   */
  int PI_TEST = 47;

  /**
   * The number of structural features of the '<em>PI Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_TEST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.AttributeTestImpl <em>Attribute Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.AttributeTestImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAttributeTest()
   * @generated
   */
  int ATTRIBUTE_TEST = 48;

  /**
   * The feature id for the '<em><b>Attr Or Wild</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_TEST__ATTR_OR_WILD = 0;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_TEST__TYPE_NAME = 1;

  /**
   * The number of structural features of the '<em>Attribute Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_TEST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.AttribNameOrWildcardImpl <em>Attrib Name Or Wildcard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.AttribNameOrWildcardImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAttribNameOrWildcard()
   * @generated
   */
  int ATTRIB_NAME_OR_WILDCARD = 49;

  /**
   * The feature id for the '<em><b>Att Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIB_NAME_OR_WILDCARD__ATT_NAME = 0;

  /**
   * The number of structural features of the '<em>Attrib Name Or Wildcard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIB_NAME_OR_WILDCARD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.SchemaAttributeTestImpl <em>Schema Attribute Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.SchemaAttributeTestImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getSchemaAttributeTest()
   * @generated
   */
  int SCHEMA_ATTRIBUTE_TEST = 50;

  /**
   * The feature id for the '<em><b>Att Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_ATTRIBUTE_TEST__ATT_DEC = 0;

  /**
   * The number of structural features of the '<em>Schema Attribute Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_ATTRIBUTE_TEST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.AttributeDeclarationImpl <em>Attribute Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.AttributeDeclarationImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAttributeDeclaration()
   * @generated
   */
  int ATTRIBUTE_DECLARATION = 51;

  /**
   * The feature id for the '<em><b>Att Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DECLARATION__ATT_NAME = 0;

  /**
   * The number of structural features of the '<em>Attribute Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.ElementTestImpl <em>Element Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.ElementTestImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getElementTest()
   * @generated
   */
  int ELEMENT_TEST = 52;

  /**
   * The feature id for the '<em><b>Elem Or Wild</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TEST__ELEM_OR_WILD = 0;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TEST__TYPE_NAME = 1;

  /**
   * The number of structural features of the '<em>Element Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TEST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.ElementNameOrWildcardImpl <em>Element Name Or Wildcard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.ElementNameOrWildcardImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getElementNameOrWildcard()
   * @generated
   */
  int ELEMENT_NAME_OR_WILDCARD = 53;

  /**
   * The feature id for the '<em><b>Elem Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_NAME_OR_WILDCARD__ELEM_NAME = 0;

  /**
   * The number of structural features of the '<em>Element Name Or Wildcard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_NAME_OR_WILDCARD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.SchemaElementTestImpl <em>Schema Element Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.SchemaElementTestImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getSchemaElementTest()
   * @generated
   */
  int SCHEMA_ELEMENT_TEST = 54;

  /**
   * The feature id for the '<em><b>Elem Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_ELEMENT_TEST__ELEM_DEC = 0;

  /**
   * The number of structural features of the '<em>Schema Element Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_ELEMENT_TEST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.ElementDeclarationImpl <em>Element Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.ElementDeclarationImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getElementDeclaration()
   * @generated
   */
  int ELEMENT_DECLARATION = 55;

  /**
   * The number of structural features of the '<em>Element Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.AttributeNameImpl <em>Attribute Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.AttributeNameImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAttributeName()
   * @generated
   */
  int ATTRIBUTE_NAME = 56;

  /**
   * The feature id for the '<em><b>QName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__QNAME = 0;

  /**
   * The number of structural features of the '<em>Attribute Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.ElementNameImpl <em>Element Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.ElementNameImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getElementName()
   * @generated
   */
  int ELEMENT_NAME = 57;

  /**
   * The feature id for the '<em><b>QName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_NAME__QNAME = ELEMENT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_NAME_FEATURE_COUNT = ELEMENT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.TypeNameImpl <em>Type Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.TypeNameImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getTypeName()
   * @generated
   */
  int TYPE_NAME = 58;

  /**
   * The feature id for the '<em><b>QName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME__QNAME = 0;

  /**
   * The number of structural features of the '<em>Type Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.NCNameImpl <em>NC Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.NCNameImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getNCName()
   * @generated
   */
  int NC_NAME = 59;

  /**
   * The feature id for the '<em><b>Nc Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NC_NAME__NC_NAME = 0;

  /**
   * The number of structural features of the '<em>NC Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NC_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.xpath.xPath.impl.PITTestImpl <em>PIT Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.xpath.xPath.impl.PITTestImpl
   * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getPITTest()
   * @generated
   */
  int PIT_TEST = 60;

  /**
   * The feature id for the '<em><b>Nc Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIT_TEST__NC_NAME = PI_TEST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIT_TEST__STRING = PI_TEST_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>PIT Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PIT_TEST_FEATURE_COUNT = PI_TEST_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see org.xtext.example.xpath.xPath.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.Expr#getExprSingle <em>Expr Single</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Single</em>'.
   * @see org.xtext.example.xpath.xPath.Expr#getExprSingle()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_ExprSingle();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpath.xPath.Expr#getExprsSingle <em>Exprs Single</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs Single</em>'.
   * @see org.xtext.example.xpath.xPath.Expr#getExprsSingle()
   * @see #getExpr()
   * @generated
   */
  EReference getExpr_ExprsSingle();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.ExprSingle <em>Expr Single</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Single</em>'.
   * @see org.xtext.example.xpath.xPath.ExprSingle
   * @generated
   */
  EClass getExprSingle();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.ForExpr <em>For Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Expr</em>'.
   * @see org.xtext.example.xpath.xPath.ForExpr
   * @generated
   */
  EClass getForExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.ForExpr#getFor <em>For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For</em>'.
   * @see org.xtext.example.xpath.xPath.ForExpr#getFor()
   * @see #getForExpr()
   * @generated
   */
  EReference getForExpr_For();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.ForExpr#getReturn <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return</em>'.
   * @see org.xtext.example.xpath.xPath.ForExpr#getReturn()
   * @see #getForExpr()
   * @generated
   */
  EReference getForExpr_Return();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.SimpleForClause <em>Simple For Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple For Clause</em>'.
   * @see org.xtext.example.xpath.xPath.SimpleForClause
   * @generated
   */
  EClass getSimpleForClause();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.SimpleForClause#getForVar <em>For Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Var</em>'.
   * @see org.xtext.example.xpath.xPath.SimpleForClause#getForVar()
   * @see #getSimpleForClause()
   * @generated
   */
  EReference getSimpleForClause_ForVar();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.SimpleForClause#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In</em>'.
   * @see org.xtext.example.xpath.xPath.SimpleForClause#getIn()
   * @see #getSimpleForClause()
   * @generated
   */
  EReference getSimpleForClause_In();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpath.xPath.SimpleForClause#getAdditionalIn <em>Additional In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Additional In</em>'.
   * @see org.xtext.example.xpath.xPath.SimpleForClause#getAdditionalIn()
   * @see #getSimpleForClause()
   * @generated
   */
  EReference getSimpleForClause_AdditionalIn();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.AdditionalIn <em>Additional In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additional In</em>'.
   * @see org.xtext.example.xpath.xPath.AdditionalIn
   * @generated
   */
  EClass getAdditionalIn();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.AdditionalIn#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.xtext.example.xpath.xPath.AdditionalIn#getVariable()
   * @see #getAdditionalIn()
   * @generated
   */
  EReference getAdditionalIn_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.AdditionalIn#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In</em>'.
   * @see org.xtext.example.xpath.xPath.AdditionalIn#getIn()
   * @see #getAdditionalIn()
   * @generated
   */
  EReference getAdditionalIn_In();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.QuantifiedExpr <em>Quantified Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantified Expr</em>'.
   * @see org.xtext.example.xpath.xPath.QuantifiedExpr
   * @generated
   */
  EClass getQuantifiedExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.QuantifiedExpr#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.xtext.example.xpath.xPath.QuantifiedExpr#getVariable()
   * @see #getQuantifiedExpr()
   * @generated
   */
  EReference getQuantifiedExpr_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.QuantifiedExpr#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>In</em>'.
   * @see org.xtext.example.xpath.xPath.QuantifiedExpr#getIn()
   * @see #getQuantifiedExpr()
   * @generated
   */
  EReference getQuantifiedExpr_In();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpath.xPath.QuantifiedExpr#getAdditionalIn <em>Additional In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Additional In</em>'.
   * @see org.xtext.example.xpath.xPath.QuantifiedExpr#getAdditionalIn()
   * @see #getQuantifiedExpr()
   * @generated
   */
  EReference getQuantifiedExpr_AdditionalIn();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.QuantifiedExpr#getSatisfy <em>Satisfy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Satisfy</em>'.
   * @see org.xtext.example.xpath.xPath.QuantifiedExpr#getSatisfy()
   * @see #getQuantifiedExpr()
   * @generated
   */
  EReference getQuantifiedExpr_Satisfy();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.IfExpr <em>If Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Expr</em>'.
   * @see org.xtext.example.xpath.xPath.IfExpr
   * @generated
   */
  EClass getIfExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.IfExpr#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see org.xtext.example.xpath.xPath.IfExpr#getIf()
   * @see #getIfExpr()
   * @generated
   */
  EReference getIfExpr_If();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.IfExpr#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.xtext.example.xpath.xPath.IfExpr#getThen()
   * @see #getIfExpr()
   * @generated
   */
  EReference getIfExpr_Then();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.IfExpr#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.xtext.example.xpath.xPath.IfExpr#getElse()
   * @see #getIfExpr()
   * @generated
   */
  EReference getIfExpr_Else();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.OrExpr <em>Or Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expr</em>'.
   * @see org.xtext.example.xpath.xPath.OrExpr
   * @generated
   */
  EClass getOrExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.OrExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpath.xPath.OrExpr#getLeft()
   * @see #getOrExpr()
   * @generated
   */
  EReference getOrExpr_Left();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpath.xPath.OrExpr#getRights <em>Rights</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rights</em>'.
   * @see org.xtext.example.xpath.xPath.OrExpr#getRights()
   * @see #getOrExpr()
   * @generated
   */
  EReference getOrExpr_Rights();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.AndExpr <em>And Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expr</em>'.
   * @see org.xtext.example.xpath.xPath.AndExpr
   * @generated
   */
  EClass getAndExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.AndExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpath.xPath.AndExpr#getLeft()
   * @see #getAndExpr()
   * @generated
   */
  EReference getAndExpr_Left();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpath.xPath.AndExpr#getRights <em>Rights</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rights</em>'.
   * @see org.xtext.example.xpath.xPath.AndExpr#getRights()
   * @see #getAndExpr()
   * @generated
   */
  EReference getAndExpr_Rights();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.ComparisonExpr <em>Comparison Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison Expr</em>'.
   * @see org.xtext.example.xpath.xPath.ComparisonExpr
   * @generated
   */
  EClass getComparisonExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.ComparisonExpr#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see org.xtext.example.xpath.xPath.ComparisonExpr#getRange()
   * @see #getComparisonExpr()
   * @generated
   */
  EReference getComparisonExpr_Range();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.ComparisonExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.xpath.xPath.ComparisonExpr#getValue()
   * @see #getComparisonExpr()
   * @generated
   */
  EAttribute getComparisonExpr_Value();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.ComparisonExpr#getGen <em>Gen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gen</em>'.
   * @see org.xtext.example.xpath.xPath.ComparisonExpr#getGen()
   * @see #getComparisonExpr()
   * @generated
   */
  EAttribute getComparisonExpr_Gen();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.ComparisonExpr#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node</em>'.
   * @see org.xtext.example.xpath.xPath.ComparisonExpr#getNode()
   * @see #getComparisonExpr()
   * @generated
   */
  EAttribute getComparisonExpr_Node();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.ComparisonExpr#getOtherRange <em>Other Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Other Range</em>'.
   * @see org.xtext.example.xpath.xPath.ComparisonExpr#getOtherRange()
   * @see #getComparisonExpr()
   * @generated
   */
  EReference getComparisonExpr_OtherRange();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.RangeExpr <em>Range Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Expr</em>'.
   * @see org.xtext.example.xpath.xPath.RangeExpr
   * @generated
   */
  EClass getRangeExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.RangeExpr#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see org.xtext.example.xpath.xPath.RangeExpr#getFrom()
   * @see #getRangeExpr()
   * @generated
   */
  EReference getRangeExpr_From();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.RangeExpr#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see org.xtext.example.xpath.xPath.RangeExpr#getTo()
   * @see #getRangeExpr()
   * @generated
   */
  EReference getRangeExpr_To();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.AdditiveExpr <em>Additive Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expr</em>'.
   * @see org.xtext.example.xpath.xPath.AdditiveExpr
   * @generated
   */
  EClass getAdditiveExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.AdditiveExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpath.xPath.AdditiveExpr#getLeft()
   * @see #getAdditiveExpr()
   * @generated
   */
  EReference getAdditiveExpr_Left();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpath.xPath.AdditiveExpr#getRights <em>Rights</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rights</em>'.
   * @see org.xtext.example.xpath.xPath.AdditiveExpr#getRights()
   * @see #getAdditiveExpr()
   * @generated
   */
  EReference getAdditiveExpr_Rights();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.MultiplicativeExpr <em>Multiplicative Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expr</em>'.
   * @see org.xtext.example.xpath.xPath.MultiplicativeExpr
   * @generated
   */
  EClass getMultiplicativeExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.MultiplicativeExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpath.xPath.MultiplicativeExpr#getLeft()
   * @see #getMultiplicativeExpr()
   * @generated
   */
  EReference getMultiplicativeExpr_Left();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpath.xPath.MultiplicativeExpr#getRights <em>Rights</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rights</em>'.
   * @see org.xtext.example.xpath.xPath.MultiplicativeExpr#getRights()
   * @see #getMultiplicativeExpr()
   * @generated
   */
  EReference getMultiplicativeExpr_Rights();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.UnionExpr <em>Union Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Union Expr</em>'.
   * @see org.xtext.example.xpath.xPath.UnionExpr
   * @generated
   */
  EClass getUnionExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.UnionExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpath.xPath.UnionExpr#getLeft()
   * @see #getUnionExpr()
   * @generated
   */
  EReference getUnionExpr_Left();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpath.xPath.UnionExpr#getRights <em>Rights</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rights</em>'.
   * @see org.xtext.example.xpath.xPath.UnionExpr#getRights()
   * @see #getUnionExpr()
   * @generated
   */
  EReference getUnionExpr_Rights();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.IntersectExceptExpr <em>Intersect Except Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intersect Except Expr</em>'.
   * @see org.xtext.example.xpath.xPath.IntersectExceptExpr
   * @generated
   */
  EClass getIntersectExceptExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.IntersectExceptExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpath.xPath.IntersectExceptExpr#getLeft()
   * @see #getIntersectExceptExpr()
   * @generated
   */
  EReference getIntersectExceptExpr_Left();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpath.xPath.IntersectExceptExpr#getRights <em>Rights</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rights</em>'.
   * @see org.xtext.example.xpath.xPath.IntersectExceptExpr#getRights()
   * @see #getIntersectExceptExpr()
   * @generated
   */
  EReference getIntersectExceptExpr_Rights();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.InstanceofExpr <em>Instanceof Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instanceof Expr</em>'.
   * @see org.xtext.example.xpath.xPath.InstanceofExpr
   * @generated
   */
  EClass getInstanceofExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.InstanceofExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpath.xPath.InstanceofExpr#getLeft()
   * @see #getInstanceofExpr()
   * @generated
   */
  EReference getInstanceofExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.InstanceofExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.xpath.xPath.InstanceofExpr#getRight()
   * @see #getInstanceofExpr()
   * @generated
   */
  EReference getInstanceofExpr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.TreatExpr <em>Treat Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Treat Expr</em>'.
   * @see org.xtext.example.xpath.xPath.TreatExpr
   * @generated
   */
  EClass getTreatExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.TreatExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpath.xPath.TreatExpr#getLeft()
   * @see #getTreatExpr()
   * @generated
   */
  EReference getTreatExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.TreatExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.xpath.xPath.TreatExpr#getRight()
   * @see #getTreatExpr()
   * @generated
   */
  EReference getTreatExpr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.CastableExpr <em>Castable Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Castable Expr</em>'.
   * @see org.xtext.example.xpath.xPath.CastableExpr
   * @generated
   */
  EClass getCastableExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.CastableExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpath.xPath.CastableExpr#getLeft()
   * @see #getCastableExpr()
   * @generated
   */
  EReference getCastableExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.CastableExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.xpath.xPath.CastableExpr#getRight()
   * @see #getCastableExpr()
   * @generated
   */
  EReference getCastableExpr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.CastExpr <em>Cast Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast Expr</em>'.
   * @see org.xtext.example.xpath.xPath.CastExpr
   * @generated
   */
  EClass getCastExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.CastExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpath.xPath.CastExpr#getLeft()
   * @see #getCastExpr()
   * @generated
   */
  EReference getCastExpr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.CastExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.xpath.xPath.CastExpr#getRight()
   * @see #getCastExpr()
   * @generated
   */
  EReference getCastExpr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.UnaryExpr <em>Unary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expr</em>'.
   * @see org.xtext.example.xpath.xPath.UnaryExpr
   * @generated
   */
  EClass getUnaryExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.UnaryExpr#getUnary <em>Unary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary</em>'.
   * @see org.xtext.example.xpath.xPath.UnaryExpr#getUnary()
   * @see #getUnaryExpr()
   * @generated
   */
  EReference getUnaryExpr_Unary();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.ValueExpr <em>Value Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Expr</em>'.
   * @see org.xtext.example.xpath.xPath.ValueExpr
   * @generated
   */
  EClass getValueExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.ValueExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.xpath.xPath.ValueExpr#getValue()
   * @see #getValueExpr()
   * @generated
   */
  EReference getValueExpr_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.PathExpr <em>Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Expr</em>'.
   * @see org.xtext.example.xpath.xPath.PathExpr
   * @generated
   */
  EClass getPathExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.PathExpr#getSinglePath <em>Single Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Single Path</em>'.
   * @see org.xtext.example.xpath.xPath.PathExpr#getSinglePath()
   * @see #getPathExpr()
   * @generated
   */
  EReference getPathExpr_SinglePath();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.PathExpr#getDoublePath <em>Double Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Double Path</em>'.
   * @see org.xtext.example.xpath.xPath.PathExpr#getDoublePath()
   * @see #getPathExpr()
   * @generated
   */
  EReference getPathExpr_DoublePath();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.PathExpr#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.xtext.example.xpath.xPath.PathExpr#getPath()
   * @see #getPathExpr()
   * @generated
   */
  EReference getPathExpr_Path();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.RelativePathExpr <em>Relative Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relative Path Expr</em>'.
   * @see org.xtext.example.xpath.xPath.RelativePathExpr
   * @generated
   */
  EClass getRelativePathExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.RelativePathExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpath.xPath.RelativePathExpr#getLeft()
   * @see #getRelativePathExpr()
   * @generated
   */
  EReference getRelativePathExpr_Left();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpath.xPath.RelativePathExpr#getRights <em>Rights</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rights</em>'.
   * @see org.xtext.example.xpath.xPath.RelativePathExpr#getRights()
   * @see #getRelativePathExpr()
   * @generated
   */
  EReference getRelativePathExpr_Rights();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.StepExpr <em>Step Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step Expr</em>'.
   * @see org.xtext.example.xpath.xPath.StepExpr
   * @generated
   */
  EClass getStepExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.StepExpr#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see org.xtext.example.xpath.xPath.StepExpr#getFilter()
   * @see #getStepExpr()
   * @generated
   */
  EReference getStepExpr_Filter();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.StepExpr#getStep <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Step</em>'.
   * @see org.xtext.example.xpath.xPath.StepExpr#getStep()
   * @see #getStepExpr()
   * @generated
   */
  EReference getStepExpr_Step();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.AxisStep <em>Axis Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Axis Step</em>'.
   * @see org.xtext.example.xpath.xPath.AxisStep
   * @generated
   */
  EClass getAxisStep();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.AxisStep#getReverse <em>Reverse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reverse</em>'.
   * @see org.xtext.example.xpath.xPath.AxisStep#getReverse()
   * @see #getAxisStep()
   * @generated
   */
  EReference getAxisStep_Reverse();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.AxisStep#getForward <em>Forward</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Forward</em>'.
   * @see org.xtext.example.xpath.xPath.AxisStep#getForward()
   * @see #getAxisStep()
   * @generated
   */
  EReference getAxisStep_Forward();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.AxisStep#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see org.xtext.example.xpath.xPath.AxisStep#getPredicate()
   * @see #getAxisStep()
   * @generated
   */
  EReference getAxisStep_Predicate();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.ForwardStep <em>Forward Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Forward Step</em>'.
   * @see org.xtext.example.xpath.xPath.ForwardStep
   * @generated
   */
  EClass getForwardStep();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.ForwardStep#getForward <em>Forward</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Forward</em>'.
   * @see org.xtext.example.xpath.xPath.ForwardStep#getForward()
   * @see #getForwardStep()
   * @generated
   */
  EAttribute getForwardStep_Forward();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.ForwardStep#getTest <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Test</em>'.
   * @see org.xtext.example.xpath.xPath.ForwardStep#getTest()
   * @see #getForwardStep()
   * @generated
   */
  EReference getForwardStep_Test();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.ForwardStep#getAbbrForward <em>Abbr Forward</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abbr Forward</em>'.
   * @see org.xtext.example.xpath.xPath.ForwardStep#getAbbrForward()
   * @see #getForwardStep()
   * @generated
   */
  EReference getForwardStep_AbbrForward();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.AbbrevForwardStep <em>Abbrev Forward Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abbrev Forward Step</em>'.
   * @see org.xtext.example.xpath.xPath.AbbrevForwardStep
   * @generated
   */
  EClass getAbbrevForwardStep();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.AbbrevForwardStep#getTest <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Test</em>'.
   * @see org.xtext.example.xpath.xPath.AbbrevForwardStep#getTest()
   * @see #getAbbrevForwardStep()
   * @generated
   */
  EReference getAbbrevForwardStep_Test();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.ReverseStep <em>Reverse Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reverse Step</em>'.
   * @see org.xtext.example.xpath.xPath.ReverseStep
   * @generated
   */
  EClass getReverseStep();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.ReverseStep#getReverse <em>Reverse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reverse</em>'.
   * @see org.xtext.example.xpath.xPath.ReverseStep#getReverse()
   * @see #getReverseStep()
   * @generated
   */
  EAttribute getReverseStep_Reverse();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.ReverseStep#getTest <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Test</em>'.
   * @see org.xtext.example.xpath.xPath.ReverseStep#getTest()
   * @see #getReverseStep()
   * @generated
   */
  EReference getReverseStep_Test();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.ReverseStep#getAbbrRevSet <em>Abbr Rev Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abbr Rev Set</em>'.
   * @see org.xtext.example.xpath.xPath.ReverseStep#getAbbrRevSet()
   * @see #getReverseStep()
   * @generated
   */
  EAttribute getReverseStep_AbbrRevSet();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.NodeTest <em>Node Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Test</em>'.
   * @see org.xtext.example.xpath.xPath.NodeTest
   * @generated
   */
  EClass getNodeTest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.NodeTest#getKindTest <em>Kind Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kind Test</em>'.
   * @see org.xtext.example.xpath.xPath.NodeTest#getKindTest()
   * @see #getNodeTest()
   * @generated
   */
  EReference getNodeTest_KindTest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.NodeTest#getNodeTest <em>Node Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Node Test</em>'.
   * @see org.xtext.example.xpath.xPath.NodeTest#getNodeTest()
   * @see #getNodeTest()
   * @generated
   */
  EReference getNodeTest_NodeTest();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.NameTest <em>Name Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Test</em>'.
   * @see org.xtext.example.xpath.xPath.NameTest
   * @generated
   */
  EClass getNameTest();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.NameTest#getQName <em>QName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>QName</em>'.
   * @see org.xtext.example.xpath.xPath.NameTest#getQName()
   * @see #getNameTest()
   * @generated
   */
  EAttribute getNameTest_QName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.NameTest#getWildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Wildcard</em>'.
   * @see org.xtext.example.xpath.xPath.NameTest#getWildcard()
   * @see #getNameTest()
   * @generated
   */
  EReference getNameTest_Wildcard();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.Wildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wildcard</em>'.
   * @see org.xtext.example.xpath.xPath.Wildcard
   * @generated
   */
  EClass getWildcard();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.Wildcard#getWild <em>Wild</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wild</em>'.
   * @see org.xtext.example.xpath.xPath.Wildcard#getWild()
   * @see #getWildcard()
   * @generated
   */
  EAttribute getWildcard_Wild();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.Wildcard#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.xpath.xPath.Wildcard#getLeft()
   * @see #getWildcard()
   * @generated
   */
  EReference getWildcard_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.Wildcard#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.xpath.xPath.Wildcard#getRight()
   * @see #getWildcard()
   * @generated
   */
  EReference getWildcard_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.FilterExpr <em>Filter Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Expr</em>'.
   * @see org.xtext.example.xpath.xPath.FilterExpr
   * @generated
   */
  EClass getFilterExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.FilterExpr#getPrimary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary</em>'.
   * @see org.xtext.example.xpath.xPath.FilterExpr#getPrimary()
   * @see #getFilterExpr()
   * @generated
   */
  EReference getFilterExpr_Primary();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.FilterExpr#getPredicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Predicate</em>'.
   * @see org.xtext.example.xpath.xPath.FilterExpr#getPredicate()
   * @see #getFilterExpr()
   * @generated
   */
  EReference getFilterExpr_Predicate();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.PredicateList <em>Predicate List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate List</em>'.
   * @see org.xtext.example.xpath.xPath.PredicateList
   * @generated
   */
  EClass getPredicateList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpath.xPath.PredicateList#getPredicates <em>Predicates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Predicates</em>'.
   * @see org.xtext.example.xpath.xPath.PredicateList#getPredicates()
   * @see #getPredicateList()
   * @generated
   */
  EReference getPredicateList_Predicates();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.Predicate <em>Predicate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate</em>'.
   * @see org.xtext.example.xpath.xPath.Predicate
   * @generated
   */
  EClass getPredicate();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.Predicate#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.xpath.xPath.Predicate#getExpr()
   * @see #getPredicate()
   * @generated
   */
  EReference getPredicate_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.PrimaryExpr <em>Primary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expr</em>'.
   * @see org.xtext.example.xpath.xPath.PrimaryExpr
   * @generated
   */
  EClass getPrimaryExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.PrimaryExpr#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see org.xtext.example.xpath.xPath.PrimaryExpr#getLiteral()
   * @see #getPrimaryExpr()
   * @generated
   */
  EReference getPrimaryExpr_Literal();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.PrimaryExpr#getVarRef <em>Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var Ref</em>'.
   * @see org.xtext.example.xpath.xPath.PrimaryExpr#getVarRef()
   * @see #getPrimaryExpr()
   * @generated
   */
  EReference getPrimaryExpr_VarRef();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.PrimaryExpr#getParExpr <em>Par Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Par Expr</em>'.
   * @see org.xtext.example.xpath.xPath.PrimaryExpr#getParExpr()
   * @see #getPrimaryExpr()
   * @generated
   */
  EReference getPrimaryExpr_ParExpr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.PrimaryExpr#getConItemExpr <em>Con Item Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Con Item Expr</em>'.
   * @see org.xtext.example.xpath.xPath.PrimaryExpr#getConItemExpr()
   * @see #getPrimaryExpr()
   * @generated
   */
  EAttribute getPrimaryExpr_ConItemExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.PrimaryExpr#getFunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function Call</em>'.
   * @see org.xtext.example.xpath.xPath.PrimaryExpr#getFunctionCall()
   * @see #getPrimaryExpr()
   * @generated
   */
  EReference getPrimaryExpr_FunctionCall();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.xtext.example.xpath.xPath.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.Literal#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num</em>'.
   * @see org.xtext.example.xpath.xPath.Literal#getNum()
   * @see #getLiteral()
   * @generated
   */
  EReference getLiteral_Num();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.Literal#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.xtext.example.xpath.xPath.Literal#getString()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_String();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Literal</em>'.
   * @see org.xtext.example.xpath.xPath.NumericLiteral
   * @generated
   */
  EClass getNumericLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.NumericLiteral#getIntLit <em>Int Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Lit</em>'.
   * @see org.xtext.example.xpath.xPath.NumericLiteral#getIntLit()
   * @see #getNumericLiteral()
   * @generated
   */
  EAttribute getNumericLiteral_IntLit();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.NumericLiteral#getDecLit <em>Dec Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dec Lit</em>'.
   * @see org.xtext.example.xpath.xPath.NumericLiteral#getDecLit()
   * @see #getNumericLiteral()
   * @generated
   */
  EAttribute getNumericLiteral_DecLit();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.NumericLiteral#getDoubleLit <em>Double Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Double Lit</em>'.
   * @see org.xtext.example.xpath.xPath.NumericLiteral#getDoubleLit()
   * @see #getNumericLiteral()
   * @generated
   */
  EAttribute getNumericLiteral_DoubleLit();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.VarRef <em>Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Ref</em>'.
   * @see org.xtext.example.xpath.xPath.VarRef
   * @generated
   */
  EClass getVarRef();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.VarName <em>Var Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Name</em>'.
   * @see org.xtext.example.xpath.xPath.VarName
   * @generated
   */
  EClass getVarName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.VarName#getQName <em>QName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>QName</em>'.
   * @see org.xtext.example.xpath.xPath.VarName#getQName()
   * @see #getVarName()
   * @generated
   */
  EAttribute getVarName_QName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.ParenthesizedExpr <em>Parenthesized Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesized Expr</em>'.
   * @see org.xtext.example.xpath.xPath.ParenthesizedExpr
   * @generated
   */
  EClass getParenthesizedExpr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.ParenthesizedExpr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.xpath.xPath.ParenthesizedExpr#getExpr()
   * @see #getParenthesizedExpr()
   * @generated
   */
  EReference getParenthesizedExpr_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see org.xtext.example.xpath.xPath.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.FunctionCall#getQName <em>QName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>QName</em>'.
   * @see org.xtext.example.xpath.xPath.FunctionCall#getQName()
   * @see #getFunctionCall()
   * @generated
   */
  EAttribute getFunctionCall_QName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.FunctionCall#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.xpath.xPath.FunctionCall#getExpr()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Expr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.xpath.xPath.FunctionCall#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs</em>'.
   * @see org.xtext.example.xpath.xPath.FunctionCall#getExprs()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Exprs();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.SingleType <em>Single Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Type</em>'.
   * @see org.xtext.example.xpath.xPath.SingleType
   * @generated
   */
  EClass getSingleType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.SequenceType <em>Sequence Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Type</em>'.
   * @see org.xtext.example.xpath.xPath.SequenceType
   * @generated
   */
  EClass getSequenceType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.SequenceType#getEmpty <em>Empty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Empty</em>'.
   * @see org.xtext.example.xpath.xPath.SequenceType#getEmpty()
   * @see #getSequenceType()
   * @generated
   */
  EAttribute getSequenceType_Empty();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.SequenceType#getItemType <em>Item Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Item Type</em>'.
   * @see org.xtext.example.xpath.xPath.SequenceType#getItemType()
   * @see #getSequenceType()
   * @generated
   */
  EReference getSequenceType_ItemType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.SequenceType#getOccInd <em>Occ Ind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Occ Ind</em>'.
   * @see org.xtext.example.xpath.xPath.SequenceType#getOccInd()
   * @see #getSequenceType()
   * @generated
   */
  EAttribute getSequenceType_OccInd();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.ItemType <em>Item Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Type</em>'.
   * @see org.xtext.example.xpath.xPath.ItemType
   * @generated
   */
  EClass getItemType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.ItemType#getKindTest <em>Kind Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Kind Test</em>'.
   * @see org.xtext.example.xpath.xPath.ItemType#getKindTest()
   * @see #getItemType()
   * @generated
   */
  EReference getItemType_KindTest();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.ItemType#getEmpty <em>Empty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Empty</em>'.
   * @see org.xtext.example.xpath.xPath.ItemType#getEmpty()
   * @see #getItemType()
   * @generated
   */
  EAttribute getItemType_Empty();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.ItemType#getAtomicType <em>Atomic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atomic Type</em>'.
   * @see org.xtext.example.xpath.xPath.ItemType#getAtomicType()
   * @see #getItemType()
   * @generated
   */
  EReference getItemType_AtomicType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.AtomicType <em>Atomic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Type</em>'.
   * @see org.xtext.example.xpath.xPath.AtomicType
   * @generated
   */
  EClass getAtomicType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.AtomicType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.xpath.xPath.AtomicType#getType()
   * @see #getAtomicType()
   * @generated
   */
  EAttribute getAtomicType_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.KindTest <em>Kind Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kind Test</em>'.
   * @see org.xtext.example.xpath.xPath.KindTest
   * @generated
   */
  EClass getKindTest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.KindTest#getDocTest <em>Doc Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Doc Test</em>'.
   * @see org.xtext.example.xpath.xPath.KindTest#getDocTest()
   * @see #getKindTest()
   * @generated
   */
  EReference getKindTest_DocTest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.KindTest#getElemTest <em>Elem Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elem Test</em>'.
   * @see org.xtext.example.xpath.xPath.KindTest#getElemTest()
   * @see #getKindTest()
   * @generated
   */
  EReference getKindTest_ElemTest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.KindTest#getAttributeTest <em>Attribute Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Test</em>'.
   * @see org.xtext.example.xpath.xPath.KindTest#getAttributeTest()
   * @see #getKindTest()
   * @generated
   */
  EReference getKindTest_AttributeTest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.KindTest#getSchemaElemTest <em>Schema Elem Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Schema Elem Test</em>'.
   * @see org.xtext.example.xpath.xPath.KindTest#getSchemaElemTest()
   * @see #getKindTest()
   * @generated
   */
  EReference getKindTest_SchemaElemTest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.KindTest#getSchemaAttributeTest <em>Schema Attribute Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Schema Attribute Test</em>'.
   * @see org.xtext.example.xpath.xPath.KindTest#getSchemaAttributeTest()
   * @see #getKindTest()
   * @generated
   */
  EReference getKindTest_SchemaAttributeTest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.KindTest#getPitTest <em>Pit Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pit Test</em>'.
   * @see org.xtext.example.xpath.xPath.KindTest#getPitTest()
   * @see #getKindTest()
   * @generated
   */
  EReference getKindTest_PitTest();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.KindTest#getCommentTest <em>Comment Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment Test</em>'.
   * @see org.xtext.example.xpath.xPath.KindTest#getCommentTest()
   * @see #getKindTest()
   * @generated
   */
  EAttribute getKindTest_CommentTest();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.KindTest#getTextTest <em>Text Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text Test</em>'.
   * @see org.xtext.example.xpath.xPath.KindTest#getTextTest()
   * @see #getKindTest()
   * @generated
   */
  EAttribute getKindTest_TextTest();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.KindTest#getAnyKindTest <em>Any Kind Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Any Kind Test</em>'.
   * @see org.xtext.example.xpath.xPath.KindTest#getAnyKindTest()
   * @see #getKindTest()
   * @generated
   */
  EAttribute getKindTest_AnyKindTest();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.DocumentTest <em>Document Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Test</em>'.
   * @see org.xtext.example.xpath.xPath.DocumentTest
   * @generated
   */
  EClass getDocumentTest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.DocumentTest#getElemTest <em>Elem Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elem Test</em>'.
   * @see org.xtext.example.xpath.xPath.DocumentTest#getElemTest()
   * @see #getDocumentTest()
   * @generated
   */
  EReference getDocumentTest_ElemTest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.DocumentTest#getSchemaElemTest <em>Schema Elem Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Schema Elem Test</em>'.
   * @see org.xtext.example.xpath.xPath.DocumentTest#getSchemaElemTest()
   * @see #getDocumentTest()
   * @generated
   */
  EReference getDocumentTest_SchemaElemTest();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.PITest <em>PI Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PI Test</em>'.
   * @see org.xtext.example.xpath.xPath.PITest
   * @generated
   */
  EClass getPITest();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.AttributeTest <em>Attribute Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Test</em>'.
   * @see org.xtext.example.xpath.xPath.AttributeTest
   * @generated
   */
  EClass getAttributeTest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.AttributeTest#getAttrOrWild <em>Attr Or Wild</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attr Or Wild</em>'.
   * @see org.xtext.example.xpath.xPath.AttributeTest#getAttrOrWild()
   * @see #getAttributeTest()
   * @generated
   */
  EReference getAttributeTest_AttrOrWild();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.AttributeTest#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.xtext.example.xpath.xPath.AttributeTest#getTypeName()
   * @see #getAttributeTest()
   * @generated
   */
  EReference getAttributeTest_TypeName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.AttribNameOrWildcard <em>Attrib Name Or Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attrib Name Or Wildcard</em>'.
   * @see org.xtext.example.xpath.xPath.AttribNameOrWildcard
   * @generated
   */
  EClass getAttribNameOrWildcard();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.AttribNameOrWildcard#getAttName <em>Att Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Att Name</em>'.
   * @see org.xtext.example.xpath.xPath.AttribNameOrWildcard#getAttName()
   * @see #getAttribNameOrWildcard()
   * @generated
   */
  EReference getAttribNameOrWildcard_AttName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.SchemaAttributeTest <em>Schema Attribute Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema Attribute Test</em>'.
   * @see org.xtext.example.xpath.xPath.SchemaAttributeTest
   * @generated
   */
  EClass getSchemaAttributeTest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.SchemaAttributeTest#getAttDec <em>Att Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Att Dec</em>'.
   * @see org.xtext.example.xpath.xPath.SchemaAttributeTest#getAttDec()
   * @see #getSchemaAttributeTest()
   * @generated
   */
  EReference getSchemaAttributeTest_AttDec();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.AttributeDeclaration <em>Attribute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Declaration</em>'.
   * @see org.xtext.example.xpath.xPath.AttributeDeclaration
   * @generated
   */
  EClass getAttributeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.AttributeDeclaration#getAttName <em>Att Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Att Name</em>'.
   * @see org.xtext.example.xpath.xPath.AttributeDeclaration#getAttName()
   * @see #getAttributeDeclaration()
   * @generated
   */
  EReference getAttributeDeclaration_AttName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.ElementTest <em>Element Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Test</em>'.
   * @see org.xtext.example.xpath.xPath.ElementTest
   * @generated
   */
  EClass getElementTest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.ElementTest#getElemOrWild <em>Elem Or Wild</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elem Or Wild</em>'.
   * @see org.xtext.example.xpath.xPath.ElementTest#getElemOrWild()
   * @see #getElementTest()
   * @generated
   */
  EReference getElementTest_ElemOrWild();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.ElementTest#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.xtext.example.xpath.xPath.ElementTest#getTypeName()
   * @see #getElementTest()
   * @generated
   */
  EReference getElementTest_TypeName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.ElementNameOrWildcard <em>Element Name Or Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Name Or Wildcard</em>'.
   * @see org.xtext.example.xpath.xPath.ElementNameOrWildcard
   * @generated
   */
  EClass getElementNameOrWildcard();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.ElementNameOrWildcard#getElemName <em>Elem Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elem Name</em>'.
   * @see org.xtext.example.xpath.xPath.ElementNameOrWildcard#getElemName()
   * @see #getElementNameOrWildcard()
   * @generated
   */
  EReference getElementNameOrWildcard_ElemName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.SchemaElementTest <em>Schema Element Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema Element Test</em>'.
   * @see org.xtext.example.xpath.xPath.SchemaElementTest
   * @generated
   */
  EClass getSchemaElementTest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.SchemaElementTest#getElemDec <em>Elem Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elem Dec</em>'.
   * @see org.xtext.example.xpath.xPath.SchemaElementTest#getElemDec()
   * @see #getSchemaElementTest()
   * @generated
   */
  EReference getSchemaElementTest_ElemDec();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.ElementDeclaration <em>Element Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Declaration</em>'.
   * @see org.xtext.example.xpath.xPath.ElementDeclaration
   * @generated
   */
  EClass getElementDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.AttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Name</em>'.
   * @see org.xtext.example.xpath.xPath.AttributeName
   * @generated
   */
  EClass getAttributeName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.AttributeName#getQName <em>QName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>QName</em>'.
   * @see org.xtext.example.xpath.xPath.AttributeName#getQName()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_QName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.ElementName <em>Element Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Name</em>'.
   * @see org.xtext.example.xpath.xPath.ElementName
   * @generated
   */
  EClass getElementName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.ElementName#getQName <em>QName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>QName</em>'.
   * @see org.xtext.example.xpath.xPath.ElementName#getQName()
   * @see #getElementName()
   * @generated
   */
  EAttribute getElementName_QName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.TypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Name</em>'.
   * @see org.xtext.example.xpath.xPath.TypeName
   * @generated
   */
  EClass getTypeName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.TypeName#getQName <em>QName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>QName</em>'.
   * @see org.xtext.example.xpath.xPath.TypeName#getQName()
   * @see #getTypeName()
   * @generated
   */
  EAttribute getTypeName_QName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.NCName <em>NC Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NC Name</em>'.
   * @see org.xtext.example.xpath.xPath.NCName
   * @generated
   */
  EClass getNCName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.NCName#getNcName <em>Nc Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nc Name</em>'.
   * @see org.xtext.example.xpath.xPath.NCName#getNcName()
   * @see #getNCName()
   * @generated
   */
  EAttribute getNCName_NcName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.xpath.xPath.PITTest <em>PIT Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PIT Test</em>'.
   * @see org.xtext.example.xpath.xPath.PITTest
   * @generated
   */
  EClass getPITTest();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.xpath.xPath.PITTest#getNcName <em>Nc Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nc Name</em>'.
   * @see org.xtext.example.xpath.xPath.PITTest#getNcName()
   * @see #getPITTest()
   * @generated
   */
  EReference getPITTest_NcName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.xpath.xPath.PITTest#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.xtext.example.xpath.xPath.PITTest#getString()
   * @see #getPITTest()
   * @generated
   */
  EAttribute getPITTest_String();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XPathFactory getXPathFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.ExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '<em><b>Expr Single</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXPR_SINGLE = eINSTANCE.getExpr_ExprSingle();

    /**
     * The meta object literal for the '<em><b>Exprs Single</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__EXPRS_SINGLE = eINSTANCE.getExpr_ExprsSingle();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.ExprSingleImpl <em>Expr Single</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.ExprSingleImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getExprSingle()
     * @generated
     */
    EClass EXPR_SINGLE = eINSTANCE.getExprSingle();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.ForExprImpl <em>For Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.ForExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getForExpr()
     * @generated
     */
    EClass FOR_EXPR = eINSTANCE.getForExpr();

    /**
     * The meta object literal for the '<em><b>For</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EXPR__FOR = eINSTANCE.getForExpr_For();

    /**
     * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_EXPR__RETURN = eINSTANCE.getForExpr_Return();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.SimpleForClauseImpl <em>Simple For Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.SimpleForClauseImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getSimpleForClause()
     * @generated
     */
    EClass SIMPLE_FOR_CLAUSE = eINSTANCE.getSimpleForClause();

    /**
     * The meta object literal for the '<em><b>For Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_FOR_CLAUSE__FOR_VAR = eINSTANCE.getSimpleForClause_ForVar();

    /**
     * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_FOR_CLAUSE__IN = eINSTANCE.getSimpleForClause_In();

    /**
     * The meta object literal for the '<em><b>Additional In</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_FOR_CLAUSE__ADDITIONAL_IN = eINSTANCE.getSimpleForClause_AdditionalIn();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.AdditionalInImpl <em>Additional In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.AdditionalInImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAdditionalIn()
     * @generated
     */
    EClass ADDITIONAL_IN = eINSTANCE.getAdditionalIn();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIONAL_IN__VARIABLE = eINSTANCE.getAdditionalIn_Variable();

    /**
     * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIONAL_IN__IN = eINSTANCE.getAdditionalIn_In();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.QuantifiedExprImpl <em>Quantified Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.QuantifiedExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getQuantifiedExpr()
     * @generated
     */
    EClass QUANTIFIED_EXPR = eINSTANCE.getQuantifiedExpr();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_EXPR__VARIABLE = eINSTANCE.getQuantifiedExpr_Variable();

    /**
     * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_EXPR__IN = eINSTANCE.getQuantifiedExpr_In();

    /**
     * The meta object literal for the '<em><b>Additional In</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_EXPR__ADDITIONAL_IN = eINSTANCE.getQuantifiedExpr_AdditionalIn();

    /**
     * The meta object literal for the '<em><b>Satisfy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_EXPR__SATISFY = eINSTANCE.getQuantifiedExpr_Satisfy();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.IfExprImpl <em>If Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.IfExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getIfExpr()
     * @generated
     */
    EClass IF_EXPR = eINSTANCE.getIfExpr();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPR__IF = eINSTANCE.getIfExpr_If();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPR__THEN = eINSTANCE.getIfExpr_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_EXPR__ELSE = eINSTANCE.getIfExpr_Else();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.OrExprImpl <em>Or Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.OrExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getOrExpr()
     * @generated
     */
    EClass OR_EXPR = eINSTANCE.getOrExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__LEFT = eINSTANCE.getOrExpr_Left();

    /**
     * The meta object literal for the '<em><b>Rights</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__RIGHTS = eINSTANCE.getOrExpr_Rights();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.AndExprImpl <em>And Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.AndExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAndExpr()
     * @generated
     */
    EClass AND_EXPR = eINSTANCE.getAndExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPR__LEFT = eINSTANCE.getAndExpr_Left();

    /**
     * The meta object literal for the '<em><b>Rights</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPR__RIGHTS = eINSTANCE.getAndExpr_Rights();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.ComparisonExprImpl <em>Comparison Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.ComparisonExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getComparisonExpr()
     * @generated
     */
    EClass COMPARISON_EXPR = eINSTANCE.getComparisonExpr();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON_EXPR__RANGE = eINSTANCE.getComparisonExpr_Range();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_EXPR__VALUE = eINSTANCE.getComparisonExpr_Value();

    /**
     * The meta object literal for the '<em><b>Gen</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_EXPR__GEN = eINSTANCE.getComparisonExpr_Gen();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_EXPR__NODE = eINSTANCE.getComparisonExpr_Node();

    /**
     * The meta object literal for the '<em><b>Other Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON_EXPR__OTHER_RANGE = eINSTANCE.getComparisonExpr_OtherRange();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.RangeExprImpl <em>Range Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.RangeExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getRangeExpr()
     * @generated
     */
    EClass RANGE_EXPR = eINSTANCE.getRangeExpr();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE_EXPR__FROM = eINSTANCE.getRangeExpr_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE_EXPR__TO = eINSTANCE.getRangeExpr_To();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.AdditiveExprImpl <em>Additive Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.AdditiveExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAdditiveExpr()
     * @generated
     */
    EClass ADDITIVE_EXPR = eINSTANCE.getAdditiveExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPR__LEFT = eINSTANCE.getAdditiveExpr_Left();

    /**
     * The meta object literal for the '<em><b>Rights</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXPR__RIGHTS = eINSTANCE.getAdditiveExpr_Rights();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.MultiplicativeExprImpl <em>Multiplicative Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.MultiplicativeExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getMultiplicativeExpr()
     * @generated
     */
    EClass MULTIPLICATIVE_EXPR = eINSTANCE.getMultiplicativeExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPR__LEFT = eINSTANCE.getMultiplicativeExpr_Left();

    /**
     * The meta object literal for the '<em><b>Rights</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXPR__RIGHTS = eINSTANCE.getMultiplicativeExpr_Rights();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.UnionExprImpl <em>Union Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.UnionExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getUnionExpr()
     * @generated
     */
    EClass UNION_EXPR = eINSTANCE.getUnionExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION_EXPR__LEFT = eINSTANCE.getUnionExpr_Left();

    /**
     * The meta object literal for the '<em><b>Rights</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION_EXPR__RIGHTS = eINSTANCE.getUnionExpr_Rights();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.IntersectExceptExprImpl <em>Intersect Except Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.IntersectExceptExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getIntersectExceptExpr()
     * @generated
     */
    EClass INTERSECT_EXCEPT_EXPR = eINSTANCE.getIntersectExceptExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERSECT_EXCEPT_EXPR__LEFT = eINSTANCE.getIntersectExceptExpr_Left();

    /**
     * The meta object literal for the '<em><b>Rights</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERSECT_EXCEPT_EXPR__RIGHTS = eINSTANCE.getIntersectExceptExpr_Rights();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.InstanceofExprImpl <em>Instanceof Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.InstanceofExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getInstanceofExpr()
     * @generated
     */
    EClass INSTANCEOF_EXPR = eINSTANCE.getInstanceofExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCEOF_EXPR__LEFT = eINSTANCE.getInstanceofExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCEOF_EXPR__RIGHT = eINSTANCE.getInstanceofExpr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.TreatExprImpl <em>Treat Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.TreatExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getTreatExpr()
     * @generated
     */
    EClass TREAT_EXPR = eINSTANCE.getTreatExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TREAT_EXPR__LEFT = eINSTANCE.getTreatExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TREAT_EXPR__RIGHT = eINSTANCE.getTreatExpr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.CastableExprImpl <em>Castable Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.CastableExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getCastableExpr()
     * @generated
     */
    EClass CASTABLE_EXPR = eINSTANCE.getCastableExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASTABLE_EXPR__LEFT = eINSTANCE.getCastableExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASTABLE_EXPR__RIGHT = eINSTANCE.getCastableExpr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.CastExprImpl <em>Cast Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.CastExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getCastExpr()
     * @generated
     */
    EClass CAST_EXPR = eINSTANCE.getCastExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPR__LEFT = eINSTANCE.getCastExpr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPR__RIGHT = eINSTANCE.getCastExpr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.UnaryExprImpl <em>Unary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.UnaryExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getUnaryExpr()
     * @generated
     */
    EClass UNARY_EXPR = eINSTANCE.getUnaryExpr();

    /**
     * The meta object literal for the '<em><b>Unary</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPR__UNARY = eINSTANCE.getUnaryExpr_Unary();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.ValueExprImpl <em>Value Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.ValueExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getValueExpr()
     * @generated
     */
    EClass VALUE_EXPR = eINSTANCE.getValueExpr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_EXPR__VALUE = eINSTANCE.getValueExpr_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.PathExprImpl <em>Path Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.PathExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getPathExpr()
     * @generated
     */
    EClass PATH_EXPR = eINSTANCE.getPathExpr();

    /**
     * The meta object literal for the '<em><b>Single Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_EXPR__SINGLE_PATH = eINSTANCE.getPathExpr_SinglePath();

    /**
     * The meta object literal for the '<em><b>Double Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_EXPR__DOUBLE_PATH = eINSTANCE.getPathExpr_DoublePath();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_EXPR__PATH = eINSTANCE.getPathExpr_Path();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.RelativePathExprImpl <em>Relative Path Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.RelativePathExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getRelativePathExpr()
     * @generated
     */
    EClass RELATIVE_PATH_EXPR = eINSTANCE.getRelativePathExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIVE_PATH_EXPR__LEFT = eINSTANCE.getRelativePathExpr_Left();

    /**
     * The meta object literal for the '<em><b>Rights</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIVE_PATH_EXPR__RIGHTS = eINSTANCE.getRelativePathExpr_Rights();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.StepExprImpl <em>Step Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.StepExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getStepExpr()
     * @generated
     */
    EClass STEP_EXPR = eINSTANCE.getStepExpr();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP_EXPR__FILTER = eINSTANCE.getStepExpr_Filter();

    /**
     * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP_EXPR__STEP = eINSTANCE.getStepExpr_Step();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.AxisStepImpl <em>Axis Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.AxisStepImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAxisStep()
     * @generated
     */
    EClass AXIS_STEP = eINSTANCE.getAxisStep();

    /**
     * The meta object literal for the '<em><b>Reverse</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AXIS_STEP__REVERSE = eINSTANCE.getAxisStep_Reverse();

    /**
     * The meta object literal for the '<em><b>Forward</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AXIS_STEP__FORWARD = eINSTANCE.getAxisStep_Forward();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AXIS_STEP__PREDICATE = eINSTANCE.getAxisStep_Predicate();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.ForwardStepImpl <em>Forward Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.ForwardStepImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getForwardStep()
     * @generated
     */
    EClass FORWARD_STEP = eINSTANCE.getForwardStep();

    /**
     * The meta object literal for the '<em><b>Forward</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORWARD_STEP__FORWARD = eINSTANCE.getForwardStep_Forward();

    /**
     * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORWARD_STEP__TEST = eINSTANCE.getForwardStep_Test();

    /**
     * The meta object literal for the '<em><b>Abbr Forward</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORWARD_STEP__ABBR_FORWARD = eINSTANCE.getForwardStep_AbbrForward();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.AbbrevForwardStepImpl <em>Abbrev Forward Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.AbbrevForwardStepImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAbbrevForwardStep()
     * @generated
     */
    EClass ABBREV_FORWARD_STEP = eINSTANCE.getAbbrevForwardStep();

    /**
     * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABBREV_FORWARD_STEP__TEST = eINSTANCE.getAbbrevForwardStep_Test();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.ReverseStepImpl <em>Reverse Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.ReverseStepImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getReverseStep()
     * @generated
     */
    EClass REVERSE_STEP = eINSTANCE.getReverseStep();

    /**
     * The meta object literal for the '<em><b>Reverse</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REVERSE_STEP__REVERSE = eINSTANCE.getReverseStep_Reverse();

    /**
     * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REVERSE_STEP__TEST = eINSTANCE.getReverseStep_Test();

    /**
     * The meta object literal for the '<em><b>Abbr Rev Set</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REVERSE_STEP__ABBR_REV_SET = eINSTANCE.getReverseStep_AbbrRevSet();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.NodeTestImpl <em>Node Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.NodeTestImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getNodeTest()
     * @generated
     */
    EClass NODE_TEST = eINSTANCE.getNodeTest();

    /**
     * The meta object literal for the '<em><b>Kind Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TEST__KIND_TEST = eINSTANCE.getNodeTest_KindTest();

    /**
     * The meta object literal for the '<em><b>Node Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_TEST__NODE_TEST = eINSTANCE.getNodeTest_NodeTest();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.NameTestImpl <em>Name Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.NameTestImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getNameTest()
     * @generated
     */
    EClass NAME_TEST = eINSTANCE.getNameTest();

    /**
     * The meta object literal for the '<em><b>QName</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_TEST__QNAME = eINSTANCE.getNameTest_QName();

    /**
     * The meta object literal for the '<em><b>Wildcard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_TEST__WILDCARD = eINSTANCE.getNameTest_Wildcard();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.WildcardImpl <em>Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.WildcardImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getWildcard()
     * @generated
     */
    EClass WILDCARD = eINSTANCE.getWildcard();

    /**
     * The meta object literal for the '<em><b>Wild</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WILDCARD__WILD = eINSTANCE.getWildcard_Wild();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WILDCARD__LEFT = eINSTANCE.getWildcard_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WILDCARD__RIGHT = eINSTANCE.getWildcard_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.FilterExprImpl <em>Filter Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.FilterExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getFilterExpr()
     * @generated
     */
    EClass FILTER_EXPR = eINSTANCE.getFilterExpr();

    /**
     * The meta object literal for the '<em><b>Primary</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_EXPR__PRIMARY = eINSTANCE.getFilterExpr_Primary();

    /**
     * The meta object literal for the '<em><b>Predicate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_EXPR__PREDICATE = eINSTANCE.getFilterExpr_Predicate();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.PredicateListImpl <em>Predicate List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.PredicateListImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getPredicateList()
     * @generated
     */
    EClass PREDICATE_LIST = eINSTANCE.getPredicateList();

    /**
     * The meta object literal for the '<em><b>Predicates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE_LIST__PREDICATES = eINSTANCE.getPredicateList_Predicates();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.PredicateImpl <em>Predicate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.PredicateImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getPredicate()
     * @generated
     */
    EClass PREDICATE = eINSTANCE.getPredicate();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREDICATE__EXPR = eINSTANCE.getPredicate_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.PrimaryExprImpl <em>Primary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.PrimaryExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getPrimaryExpr()
     * @generated
     */
    EClass PRIMARY_EXPR = eINSTANCE.getPrimaryExpr();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPR__LITERAL = eINSTANCE.getPrimaryExpr_Literal();

    /**
     * The meta object literal for the '<em><b>Var Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPR__VAR_REF = eINSTANCE.getPrimaryExpr_VarRef();

    /**
     * The meta object literal for the '<em><b>Par Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPR__PAR_EXPR = eINSTANCE.getPrimaryExpr_ParExpr();

    /**
     * The meta object literal for the '<em><b>Con Item Expr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_EXPR__CON_ITEM_EXPR = eINSTANCE.getPrimaryExpr_ConItemExpr();

    /**
     * The meta object literal for the '<em><b>Function Call</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPR__FUNCTION_CALL = eINSTANCE.getPrimaryExpr_FunctionCall();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.LiteralImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL__NUM = eINSTANCE.getLiteral_Num();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__STRING = eINSTANCE.getLiteral_String();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.NumericLiteralImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getNumericLiteral()
     * @generated
     */
    EClass NUMERIC_LITERAL = eINSTANCE.getNumericLiteral();

    /**
     * The meta object literal for the '<em><b>Int Lit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERIC_LITERAL__INT_LIT = eINSTANCE.getNumericLiteral_IntLit();

    /**
     * The meta object literal for the '<em><b>Dec Lit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERIC_LITERAL__DEC_LIT = eINSTANCE.getNumericLiteral_DecLit();

    /**
     * The meta object literal for the '<em><b>Double Lit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERIC_LITERAL__DOUBLE_LIT = eINSTANCE.getNumericLiteral_DoubleLit();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.VarRefImpl <em>Var Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.VarRefImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getVarRef()
     * @generated
     */
    EClass VAR_REF = eINSTANCE.getVarRef();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.VarNameImpl <em>Var Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.VarNameImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getVarName()
     * @generated
     */
    EClass VAR_NAME = eINSTANCE.getVarName();

    /**
     * The meta object literal for the '<em><b>QName</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_NAME__QNAME = eINSTANCE.getVarName_QName();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.ParenthesizedExprImpl <em>Parenthesized Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.ParenthesizedExprImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getParenthesizedExpr()
     * @generated
     */
    EClass PARENTHESIZED_EXPR = eINSTANCE.getParenthesizedExpr();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIZED_EXPR__EXPR = eINSTANCE.getParenthesizedExpr_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.FunctionCallImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '<em><b>QName</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_CALL__QNAME = eINSTANCE.getFunctionCall_QName();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__EXPR = eINSTANCE.getFunctionCall_Expr();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__EXPRS = eINSTANCE.getFunctionCall_Exprs();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.SingleTypeImpl <em>Single Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.SingleTypeImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getSingleType()
     * @generated
     */
    EClass SINGLE_TYPE = eINSTANCE.getSingleType();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.SequenceTypeImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getSequenceType()
     * @generated
     */
    EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

    /**
     * The meta object literal for the '<em><b>Empty</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE_TYPE__EMPTY = eINSTANCE.getSequenceType_Empty();

    /**
     * The meta object literal for the '<em><b>Item Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_TYPE__ITEM_TYPE = eINSTANCE.getSequenceType_ItemType();

    /**
     * The meta object literal for the '<em><b>Occ Ind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE_TYPE__OCC_IND = eINSTANCE.getSequenceType_OccInd();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.ItemTypeImpl <em>Item Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.ItemTypeImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getItemType()
     * @generated
     */
    EClass ITEM_TYPE = eINSTANCE.getItemType();

    /**
     * The meta object literal for the '<em><b>Kind Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_TYPE__KIND_TEST = eINSTANCE.getItemType_KindTest();

    /**
     * The meta object literal for the '<em><b>Empty</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM_TYPE__EMPTY = eINSTANCE.getItemType_Empty();

    /**
     * The meta object literal for the '<em><b>Atomic Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_TYPE__ATOMIC_TYPE = eINSTANCE.getItemType_AtomicType();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.AtomicTypeImpl <em>Atomic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.AtomicTypeImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAtomicType()
     * @generated
     */
    EClass ATOMIC_TYPE = eINSTANCE.getAtomicType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_TYPE__TYPE = eINSTANCE.getAtomicType_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.KindTestImpl <em>Kind Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.KindTestImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getKindTest()
     * @generated
     */
    EClass KIND_TEST = eINSTANCE.getKindTest();

    /**
     * The meta object literal for the '<em><b>Doc Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KIND_TEST__DOC_TEST = eINSTANCE.getKindTest_DocTest();

    /**
     * The meta object literal for the '<em><b>Elem Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KIND_TEST__ELEM_TEST = eINSTANCE.getKindTest_ElemTest();

    /**
     * The meta object literal for the '<em><b>Attribute Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KIND_TEST__ATTRIBUTE_TEST = eINSTANCE.getKindTest_AttributeTest();

    /**
     * The meta object literal for the '<em><b>Schema Elem Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KIND_TEST__SCHEMA_ELEM_TEST = eINSTANCE.getKindTest_SchemaElemTest();

    /**
     * The meta object literal for the '<em><b>Schema Attribute Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KIND_TEST__SCHEMA_ATTRIBUTE_TEST = eINSTANCE.getKindTest_SchemaAttributeTest();

    /**
     * The meta object literal for the '<em><b>Pit Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KIND_TEST__PIT_TEST = eINSTANCE.getKindTest_PitTest();

    /**
     * The meta object literal for the '<em><b>Comment Test</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KIND_TEST__COMMENT_TEST = eINSTANCE.getKindTest_CommentTest();

    /**
     * The meta object literal for the '<em><b>Text Test</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KIND_TEST__TEXT_TEST = eINSTANCE.getKindTest_TextTest();

    /**
     * The meta object literal for the '<em><b>Any Kind Test</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KIND_TEST__ANY_KIND_TEST = eINSTANCE.getKindTest_AnyKindTest();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.DocumentTestImpl <em>Document Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.DocumentTestImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getDocumentTest()
     * @generated
     */
    EClass DOCUMENT_TEST = eINSTANCE.getDocumentTest();

    /**
     * The meta object literal for the '<em><b>Elem Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_TEST__ELEM_TEST = eINSTANCE.getDocumentTest_ElemTest();

    /**
     * The meta object literal for the '<em><b>Schema Elem Test</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_TEST__SCHEMA_ELEM_TEST = eINSTANCE.getDocumentTest_SchemaElemTest();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.PITestImpl <em>PI Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.PITestImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getPITest()
     * @generated
     */
    EClass PI_TEST = eINSTANCE.getPITest();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.AttributeTestImpl <em>Attribute Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.AttributeTestImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAttributeTest()
     * @generated
     */
    EClass ATTRIBUTE_TEST = eINSTANCE.getAttributeTest();

    /**
     * The meta object literal for the '<em><b>Attr Or Wild</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_TEST__ATTR_OR_WILD = eINSTANCE.getAttributeTest_AttrOrWild();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_TEST__TYPE_NAME = eINSTANCE.getAttributeTest_TypeName();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.AttribNameOrWildcardImpl <em>Attrib Name Or Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.AttribNameOrWildcardImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAttribNameOrWildcard()
     * @generated
     */
    EClass ATTRIB_NAME_OR_WILDCARD = eINSTANCE.getAttribNameOrWildcard();

    /**
     * The meta object literal for the '<em><b>Att Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIB_NAME_OR_WILDCARD__ATT_NAME = eINSTANCE.getAttribNameOrWildcard_AttName();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.SchemaAttributeTestImpl <em>Schema Attribute Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.SchemaAttributeTestImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getSchemaAttributeTest()
     * @generated
     */
    EClass SCHEMA_ATTRIBUTE_TEST = eINSTANCE.getSchemaAttributeTest();

    /**
     * The meta object literal for the '<em><b>Att Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA_ATTRIBUTE_TEST__ATT_DEC = eINSTANCE.getSchemaAttributeTest_AttDec();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.AttributeDeclarationImpl <em>Attribute Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.AttributeDeclarationImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAttributeDeclaration()
     * @generated
     */
    EClass ATTRIBUTE_DECLARATION = eINSTANCE.getAttributeDeclaration();

    /**
     * The meta object literal for the '<em><b>Att Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_DECLARATION__ATT_NAME = eINSTANCE.getAttributeDeclaration_AttName();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.ElementTestImpl <em>Element Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.ElementTestImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getElementTest()
     * @generated
     */
    EClass ELEMENT_TEST = eINSTANCE.getElementTest();

    /**
     * The meta object literal for the '<em><b>Elem Or Wild</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_TEST__ELEM_OR_WILD = eINSTANCE.getElementTest_ElemOrWild();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_TEST__TYPE_NAME = eINSTANCE.getElementTest_TypeName();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.ElementNameOrWildcardImpl <em>Element Name Or Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.ElementNameOrWildcardImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getElementNameOrWildcard()
     * @generated
     */
    EClass ELEMENT_NAME_OR_WILDCARD = eINSTANCE.getElementNameOrWildcard();

    /**
     * The meta object literal for the '<em><b>Elem Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_NAME_OR_WILDCARD__ELEM_NAME = eINSTANCE.getElementNameOrWildcard_ElemName();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.SchemaElementTestImpl <em>Schema Element Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.SchemaElementTestImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getSchemaElementTest()
     * @generated
     */
    EClass SCHEMA_ELEMENT_TEST = eINSTANCE.getSchemaElementTest();

    /**
     * The meta object literal for the '<em><b>Elem Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA_ELEMENT_TEST__ELEM_DEC = eINSTANCE.getSchemaElementTest_ElemDec();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.ElementDeclarationImpl <em>Element Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.ElementDeclarationImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getElementDeclaration()
     * @generated
     */
    EClass ELEMENT_DECLARATION = eINSTANCE.getElementDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.AttributeNameImpl <em>Attribute Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.AttributeNameImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getAttributeName()
     * @generated
     */
    EClass ATTRIBUTE_NAME = eINSTANCE.getAttributeName();

    /**
     * The meta object literal for the '<em><b>QName</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__QNAME = eINSTANCE.getAttributeName_QName();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.ElementNameImpl <em>Element Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.ElementNameImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getElementName()
     * @generated
     */
    EClass ELEMENT_NAME = eINSTANCE.getElementName();

    /**
     * The meta object literal for the '<em><b>QName</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_NAME__QNAME = eINSTANCE.getElementName_QName();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.TypeNameImpl <em>Type Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.TypeNameImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getTypeName()
     * @generated
     */
    EClass TYPE_NAME = eINSTANCE.getTypeName();

    /**
     * The meta object literal for the '<em><b>QName</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_NAME__QNAME = eINSTANCE.getTypeName_QName();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.NCNameImpl <em>NC Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.NCNameImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getNCName()
     * @generated
     */
    EClass NC_NAME = eINSTANCE.getNCName();

    /**
     * The meta object literal for the '<em><b>Nc Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NC_NAME__NC_NAME = eINSTANCE.getNCName_NcName();

    /**
     * The meta object literal for the '{@link org.xtext.example.xpath.xPath.impl.PITTestImpl <em>PIT Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.xpath.xPath.impl.PITTestImpl
     * @see org.xtext.example.xpath.xPath.impl.XPathPackageImpl#getPITTest()
     * @generated
     */
    EClass PIT_TEST = eINSTANCE.getPITTest();

    /**
     * The meta object literal for the '<em><b>Nc Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PIT_TEST__NC_NAME = eINSTANCE.getPITTest_NcName();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PIT_TEST__STRING = eINSTANCE.getPITTest_String();

  }

} //XPathPackage
