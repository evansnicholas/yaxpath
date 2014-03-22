/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.ecore.EClass;

import org.xtext.example.xpath.xPath.UnionExpr;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Union Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnionExprImpl extends MultiplicativeExprImpl implements UnionExpr
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnionExprImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XPathPackage.Literals.UNION_EXPR;
  }

} //UnionExprImpl
