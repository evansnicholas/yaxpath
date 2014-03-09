/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.ItemType#getKindTest <em>Kind Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.ItemType#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.ItemType#getAtomicType <em>Atomic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getItemType()
 * @model
 * @generated
 */
public interface ItemType extends EObject
{
  /**
   * Returns the value of the '<em><b>Kind Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind Test</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind Test</em>' containment reference.
   * @see #setKindTest(KindTest)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getItemType_KindTest()
   * @model containment="true"
   * @generated
   */
  KindTest getKindTest();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ItemType#getKindTest <em>Kind Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind Test</em>' containment reference.
   * @see #getKindTest()
   * @generated
   */
  void setKindTest(KindTest value);

  /**
   * Returns the value of the '<em><b>Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty</em>' attribute.
   * @see #setEmpty(String)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getItemType_Empty()
   * @model
   * @generated
   */
  String getEmpty();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ItemType#getEmpty <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty</em>' attribute.
   * @see #getEmpty()
   * @generated
   */
  void setEmpty(String value);

  /**
   * Returns the value of the '<em><b>Atomic Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atomic Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atomic Type</em>' containment reference.
   * @see #setAtomicType(AtomicType)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getItemType_AtomicType()
   * @model containment="true"
   * @generated
   */
  AtomicType getAtomicType();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ItemType#getAtomicType <em>Atomic Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atomic Type</em>' containment reference.
   * @see #getAtomicType()
   * @generated
   */
  void setAtomicType(AtomicType value);

} // ItemType
