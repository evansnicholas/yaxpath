/**
 */
package org.xtext.example.xpath.xPath;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast As</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.CastAs#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.CastAs#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getCastAs()
 * @model
 * @generated
 */
public interface CastAs extends CastExpr
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
   * @see #setLeft(UnaryExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getCastAs_Left()
   * @model containment="true"
   * @generated
   */
  UnaryExpr getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.CastAs#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(UnaryExpr value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(SingleType)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getCastAs_Right()
   * @model containment="true"
   * @generated
   */
  SingleType getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.CastAs#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(SingleType value);

} // CastAs
