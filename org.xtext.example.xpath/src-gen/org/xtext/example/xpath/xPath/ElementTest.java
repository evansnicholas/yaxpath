/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.ElementTest#getElemOrWild <em>Elem Or Wild</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.ElementTest#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getElementTest()
 * @model
 * @generated
 */
public interface ElementTest extends EObject
{
  /**
   * Returns the value of the '<em><b>Elem Or Wild</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem Or Wild</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem Or Wild</em>' containment reference.
   * @see #setElemOrWild(ElementNameOrWildcard)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getElementTest_ElemOrWild()
   * @model containment="true"
   * @generated
   */
  ElementNameOrWildcard getElemOrWild();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ElementTest#getElemOrWild <em>Elem Or Wild</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem Or Wild</em>' containment reference.
   * @see #getElemOrWild()
   * @generated
   */
  void setElemOrWild(ElementNameOrWildcard value);

  /**
   * Returns the value of the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' containment reference.
   * @see #setTypeName(TypeName)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getElementTest_TypeName()
   * @model containment="true"
   * @generated
   */
  TypeName getTypeName();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ElementTest#getTypeName <em>Type Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' containment reference.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(TypeName value);

} // ElementTest
