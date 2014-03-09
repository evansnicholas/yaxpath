/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Name Or Wildcard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.ElementNameOrWildcard#getElemName <em>Elem Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getElementNameOrWildcard()
 * @model
 * @generated
 */
public interface ElementNameOrWildcard extends EObject
{
  /**
   * Returns the value of the '<em><b>Elem Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem Name</em>' containment reference.
   * @see #setElemName(ElementName)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getElementNameOrWildcard_ElemName()
   * @model containment="true"
   * @generated
   */
  ElementName getElemName();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ElementNameOrWildcard#getElemName <em>Elem Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem Name</em>' containment reference.
   * @see #getElemName()
   * @generated
   */
  void setElemName(ElementName value);

} // ElementNameOrWildcard
