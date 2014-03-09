/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wildcard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.Wildcard#getWild <em>Wild</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.Wildcard#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.Wildcard#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getWildcard()
 * @model
 * @generated
 */
public interface Wildcard extends EObject
{
  /**
   * Returns the value of the '<em><b>Wild</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wild</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wild</em>' attribute.
   * @see #setWild(String)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getWildcard_Wild()
   * @model
   * @generated
   */
  String getWild();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.Wildcard#getWild <em>Wild</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wild</em>' attribute.
   * @see #getWild()
   * @generated
   */
  void setWild(String value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(NCName)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getWildcard_Left()
   * @model containment="true"
   * @generated
   */
  NCName getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.Wildcard#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(NCName value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(NCName)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getWildcard_Right()
   * @model containment="true"
   * @generated
   */
  NCName getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.Wildcard#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(NCName value);

} // Wildcard
