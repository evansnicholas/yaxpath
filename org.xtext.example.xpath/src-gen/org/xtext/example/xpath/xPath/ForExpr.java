/**
 */
package org.xtext.example.xpath.xPath;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.ForExpr#getFor <em>For</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.ForExpr#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getForExpr()
 * @model
 * @generated
 */
public interface ForExpr extends ExprSingle
{
  /**
   * Returns the value of the '<em><b>For</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For</em>' containment reference.
   * @see #setFor(SimpleForClause)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getForExpr_For()
   * @model containment="true"
   * @generated
   */
  SimpleForClause getFor();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ForExpr#getFor <em>For</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For</em>' containment reference.
   * @see #getFor()
   * @generated
   */
  void setFor(SimpleForClause value);

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(ExprSingle)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getForExpr_Return()
   * @model containment="true"
   * @generated
   */
  ExprSingle getReturn();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ForExpr#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(ExprSingle value);

} // ForExpr
