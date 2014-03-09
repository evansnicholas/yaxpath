/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.NameTest#getQName <em>QName</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.NameTest#getWildcard <em>Wildcard</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getNameTest()
 * @model
 * @generated
 */
public interface NameTest extends EObject
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
   * @see org.xtext.example.xpath.xPath.XPathPackage#getNameTest_QName()
   * @model
   * @generated
   */
  String getQName();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.NameTest#getQName <em>QName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>QName</em>' attribute.
   * @see #getQName()
   * @generated
   */
  void setQName(String value);

  /**
   * Returns the value of the '<em><b>Wildcard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wildcard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wildcard</em>' containment reference.
   * @see #setWildcard(Wildcard)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getNameTest_Wildcard()
   * @model containment="true"
   * @generated
   */
  Wildcard getWildcard();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.NameTest#getWildcard <em>Wildcard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wildcard</em>' containment reference.
   * @see #getWildcard()
   * @generated
   */
  void setWildcard(Wildcard value);

} // NameTest
