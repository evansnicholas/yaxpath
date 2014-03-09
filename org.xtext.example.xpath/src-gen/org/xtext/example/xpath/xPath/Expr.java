/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.Expr#getExprSingle <em>Expr Single</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.Expr#getExprsSingle <em>Exprs Single</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getExpr()
 * @model
 * @generated
 */
public interface Expr extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr Single</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Single</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Single</em>' containment reference.
   * @see #setExprSingle(ExprSingle)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getExpr_ExprSingle()
   * @model containment="true"
   * @generated
   */
  ExprSingle getExprSingle();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.Expr#getExprSingle <em>Expr Single</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Single</em>' containment reference.
   * @see #getExprSingle()
   * @generated
   */
  void setExprSingle(ExprSingle value);

  /**
   * Returns the value of the '<em><b>Exprs Single</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.xpath.xPath.ExprSingle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs Single</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs Single</em>' containment reference list.
   * @see org.xtext.example.xpath.xPath.XPathPackage#getExpr_ExprsSingle()
   * @model containment="true"
   * @generated
   */
  EList<ExprSingle> getExprsSingle();

} // Expr
