/**
 */
package org.xtext.example.xpath.xPath;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.Pipe#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.Pipe#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getPipe()
 * @model
 * @generated
 */
public interface Pipe extends UnionExpr
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
   * @see #setLeft(IntersectExceptExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getPipe_Left()
   * @model containment="true"
   * @generated
   */
  IntersectExceptExpr getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.Pipe#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(IntersectExceptExpr value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(IntersectExceptExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getPipe_Right()
   * @model containment="true"
   * @generated
   */
  IntersectExceptExpr getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.Pipe#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(IntersectExceptExpr value);

} // Pipe
