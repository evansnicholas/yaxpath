/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QName</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.QName#getLocalPart <em>Local Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getQName()
 * @model
 * @generated
 */
public interface QName extends EObject
{
  /**
   * Returns the value of the '<em><b>Local Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Part</em>' containment reference.
   * @see #setLocalPart(NCName)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getQName_LocalPart()
   * @model containment="true"
   * @generated
   */
  NCName getLocalPart();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.QName#getLocalPart <em>Local Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Part</em>' containment reference.
   * @see #getLocalPart()
   * @generated
   */
  void setLocalPart(NCName value);

} // QName
