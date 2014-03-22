/**
 */
package org.xtext.example.xpath.xPath;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.Multiplication#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.Multiplication#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getMultiplication()
 * @model
 * @generated
 */
public interface Multiplication extends MultiplicativeExpr
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
   * @see #setLeft(UnionExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getMultiplication_Left()
   * @model containment="true"
   * @generated
   */
  UnionExpr getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.Multiplication#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(UnionExpr value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(UnionExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getMultiplication_Right()
   * @model containment="true"
   * @generated
   */
  UnionExpr getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.Multiplication#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(UnionExpr value);

} // Multiplication
