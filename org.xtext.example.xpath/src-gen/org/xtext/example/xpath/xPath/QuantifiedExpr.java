/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.QuantifiedExpr#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.QuantifiedExpr#getIn <em>In</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.QuantifiedExpr#getAdditionalIn <em>Additional In</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.QuantifiedExpr#getSatisfy <em>Satisfy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getQuantifiedExpr()
 * @model
 * @generated
 */
public interface QuantifiedExpr extends ExprSingle
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VarName)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getQuantifiedExpr_Variable()
   * @model containment="true"
   * @generated
   */
  VarName getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.QuantifiedExpr#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VarName value);

  /**
   * Returns the value of the '<em><b>In</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In</em>' containment reference.
   * @see #setIn(ExprSingle)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getQuantifiedExpr_In()
   * @model containment="true"
   * @generated
   */
  ExprSingle getIn();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.QuantifiedExpr#getIn <em>In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In</em>' containment reference.
   * @see #getIn()
   * @generated
   */
  void setIn(ExprSingle value);

  /**
   * Returns the value of the '<em><b>Additional In</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.xpath.xPath.AdditionalIn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Additional In</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additional In</em>' containment reference list.
   * @see org.xtext.example.xpath.xPath.XPathPackage#getQuantifiedExpr_AdditionalIn()
   * @model containment="true"
   * @generated
   */
  EList<AdditionalIn> getAdditionalIn();

  /**
   * Returns the value of the '<em><b>Satisfy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Satisfy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Satisfy</em>' containment reference.
   * @see #setSatisfy(ExprSingle)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getQuantifiedExpr_Satisfy()
   * @model containment="true"
   * @generated
   */
  ExprSingle getSatisfy();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.QuantifiedExpr#getSatisfy <em>Satisfy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Satisfy</em>' containment reference.
   * @see #getSatisfy()
   * @generated
   */
  void setSatisfy(ExprSingle value);

} // QuantifiedExpr
