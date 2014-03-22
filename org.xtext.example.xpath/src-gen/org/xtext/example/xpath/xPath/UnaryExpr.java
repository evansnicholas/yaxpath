/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.UnaryExpr#getUnaryOps <em>Unary Ops</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.UnaryExpr#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getUnaryExpr()
 * @model
 * @generated
 */
public interface UnaryExpr extends CastExpr
{
  /**
   * Returns the value of the '<em><b>Unary Ops</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Ops</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Ops</em>' attribute list.
   * @see org.xtext.example.xpath.xPath.XPathPackage#getUnaryExpr_UnaryOps()
   * @model unique="false"
   * @generated
   */
  EList<String> getUnaryOps();

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ValueExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getUnaryExpr_Value()
   * @model containment="true"
   * @generated
   */
  ValueExpr getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.UnaryExpr#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ValueExpr value);

} // UnaryExpr
