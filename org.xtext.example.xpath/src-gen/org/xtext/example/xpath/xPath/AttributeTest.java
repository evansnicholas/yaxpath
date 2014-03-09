/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.AttributeTest#getAttrOrWild <em>Attr Or Wild</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.AttributeTest#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getAttributeTest()
 * @model
 * @generated
 */
public interface AttributeTest extends EObject
{
  /**
   * Returns the value of the '<em><b>Attr Or Wild</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr Or Wild</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr Or Wild</em>' containment reference.
   * @see #setAttrOrWild(AttribNameOrWildcard)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getAttributeTest_AttrOrWild()
   * @model containment="true"
   * @generated
   */
  AttribNameOrWildcard getAttrOrWild();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.AttributeTest#getAttrOrWild <em>Attr Or Wild</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr Or Wild</em>' containment reference.
   * @see #getAttrOrWild()
   * @generated
   */
  void setAttrOrWild(AttribNameOrWildcard value);

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
   * @see org.xtext.example.xpath.xPath.XPathPackage#getAttributeTest_TypeName()
   * @model containment="true"
   * @generated
   */
  TypeName getTypeName();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.AttributeTest#getTypeName <em>Type Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' containment reference.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(TypeName value);

} // AttributeTest
