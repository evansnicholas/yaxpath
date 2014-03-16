/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.FunctionCall#getQName <em>QName</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.FunctionCall#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.FunctionCall#getExprs <em>Exprs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends EObject
{
  /**
   * Returns the value of the '<em><b>QName</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>QName</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>QName</em>' containment reference.
   * @see #setQName(QName)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getFunctionCall_QName()
   * @model containment="true"
   * @generated
   */
  QName getQName();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.FunctionCall#getQName <em>QName</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>QName</em>' containment reference.
   * @see #getQName()
   * @generated
   */
  void setQName(QName value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(ExprSingle)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getFunctionCall_Expr()
   * @model containment="true"
   * @generated
   */
  ExprSingle getExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.FunctionCall#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(ExprSingle value);

  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.xpath.xPath.ExprSingle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference list.
   * @see org.xtext.example.xpath.xPath.XPathPackage#getFunctionCall_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<ExprSingle> getExprs();

} // FunctionCall
