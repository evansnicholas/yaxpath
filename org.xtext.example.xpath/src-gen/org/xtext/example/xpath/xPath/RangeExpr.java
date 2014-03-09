/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.RangeExpr#getFrom <em>From</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.RangeExpr#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getRangeExpr()
 * @model
 * @generated
 */
public interface RangeExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(AdditiveExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getRangeExpr_From()
   * @model containment="true"
   * @generated
   */
  AdditiveExpr getFrom();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.RangeExpr#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(AdditiveExpr value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(AdditiveExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getRangeExpr_To()
   * @model containment="true"
   * @generated
   */
  AdditiveExpr getTo();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.RangeExpr#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(AdditiveExpr value);

} // RangeExpr
