/**
 */
package org.xtext.example.xpath.xPath;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Treat As</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.TreatAs#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.TreatAs#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getTreatAs()
 * @model
 * @generated
 */
public interface TreatAs extends TreatExpr
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(CastableExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getTreatAs_Left()
   * @model containment="true"
   * @generated
   */
  CastableExpr getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.TreatAs#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(CastableExpr value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(SequenceType)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getTreatAs_Right()
   * @model containment="true"
   * @generated
   */
  SequenceType getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.TreatAs#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(SequenceType value);

} // TreatAs
