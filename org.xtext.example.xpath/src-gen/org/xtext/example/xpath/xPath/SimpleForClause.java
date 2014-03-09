/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple For Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.SimpleForClause#getForVar <em>For Var</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.SimpleForClause#getIn <em>In</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.SimpleForClause#getAdditionalIn <em>Additional In</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getSimpleForClause()
 * @model
 * @generated
 */
public interface SimpleForClause extends EObject
{
  /**
   * Returns the value of the '<em><b>For Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Var</em>' containment reference.
   * @see #setForVar(VarName)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getSimpleForClause_ForVar()
   * @model containment="true"
   * @generated
   */
  VarName getForVar();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.SimpleForClause#getForVar <em>For Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Var</em>' containment reference.
   * @see #getForVar()
   * @generated
   */
  void setForVar(VarName value);

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
   * @see org.xtext.example.xpath.xPath.XPathPackage#getSimpleForClause_In()
   * @model containment="true"
   * @generated
   */
  ExprSingle getIn();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.SimpleForClause#getIn <em>In</em>}' containment reference.
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
   * @see org.xtext.example.xpath.xPath.XPathPackage#getSimpleForClause_AdditionalIn()
   * @model containment="true"
   * @generated
   */
  EList<AdditionalIn> getAdditionalIn();

} // SimpleForClause
