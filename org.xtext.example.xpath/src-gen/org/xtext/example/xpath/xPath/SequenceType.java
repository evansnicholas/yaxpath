/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.SequenceType#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.SequenceType#getItemType <em>Item Type</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.SequenceType#getOccInd <em>Occ Ind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getSequenceType()
 * @model
 * @generated
 */
public interface SequenceType extends EObject
{
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
   * @see org.xtext.example.xpath.xPath.XPathPackage#getSequenceType_Empty()
   * @model
   * @generated
   */
  String getEmpty();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.SequenceType#getEmpty <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty</em>' attribute.
   * @see #getEmpty()
   * @generated
   */
  void setEmpty(String value);

  /**
   * Returns the value of the '<em><b>Item Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item Type</em>' containment reference.
   * @see #setItemType(ItemType)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getSequenceType_ItemType()
   * @model containment="true"
   * @generated
   */
  ItemType getItemType();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.SequenceType#getItemType <em>Item Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item Type</em>' containment reference.
   * @see #getItemType()
   * @generated
   */
  void setItemType(ItemType value);

  /**
   * Returns the value of the '<em><b>Occ Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Occ Ind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Occ Ind</em>' attribute.
   * @see #setOccInd(String)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getSequenceType_OccInd()
   * @model
   * @generated
   */
  String getOccInd();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.SequenceType#getOccInd <em>Occ Ind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Occ Ind</em>' attribute.
   * @see #getOccInd()
   * @generated
   */
  void setOccInd(String value);

} // SequenceType
