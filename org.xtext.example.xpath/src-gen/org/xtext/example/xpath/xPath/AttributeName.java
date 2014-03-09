/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.AttributeName#getQName <em>QName</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getAttributeName()
 * @model
 * @generated
 */
public interface AttributeName extends EObject
{
  /**
   * Returns the value of the '<em><b>QName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>QName</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>QName</em>' attribute.
   * @see #setQName(String)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getAttributeName_QName()
   * @model
   * @generated
   */
  String getQName();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.AttributeName#getQName <em>QName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>QName</em>' attribute.
   * @see #getQName()
   * @generated
   */
  void setQName(String value);

} // AttributeName
