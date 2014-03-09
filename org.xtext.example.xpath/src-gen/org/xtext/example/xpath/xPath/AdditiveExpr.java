/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additive Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.AdditiveExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.AdditiveExpr#getRights <em>Rights</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getAdditiveExpr()
 * @model
 * @generated
 */
public interface AdditiveExpr extends EObject
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
   * @see #setLeft(MultiplicativeExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getAdditiveExpr_Left()
   * @model containment="true"
   * @generated
   */
  MultiplicativeExpr getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.AdditiveExpr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(MultiplicativeExpr value);

  /**
   * Returns the value of the '<em><b>Rights</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.xpath.xPath.MultiplicativeExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rights</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rights</em>' containment reference list.
   * @see org.xtext.example.xpath.xPath.XPathPackage#getAdditiveExpr_Rights()
   * @model containment="true"
   * @generated
   */
  EList<MultiplicativeExpr> getRights();

} // AdditiveExpr
