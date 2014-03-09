/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.AdditionalIn#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.AdditionalIn#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getAdditionalIn()
 * @model
 * @generated
 */
public interface AdditionalIn extends EObject
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
   * @see org.xtext.example.xpath.xPath.XPathPackage#getAdditionalIn_Variable()
   * @model containment="true"
   * @generated
   */
  VarName getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.AdditionalIn#getVariable <em>Variable</em>}' containment reference.
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
   * @see org.xtext.example.xpath.xPath.XPathPackage#getAdditionalIn_In()
   * @model containment="true"
   * @generated
   */
  ExprSingle getIn();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.AdditionalIn#getIn <em>In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In</em>' containment reference.
   * @see #getIn()
   * @generated
   */
  void setIn(ExprSingle value);

} // AdditionalIn
