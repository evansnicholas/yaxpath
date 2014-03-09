/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicative Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.MultiplicativeExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.MultiplicativeExpr#getRights <em>Rights</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getMultiplicativeExpr()
 * @model
 * @generated
 */
public interface MultiplicativeExpr extends EObject
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
   * @see org.xtext.example.xpath.xPath.XPathPackage#getMultiplicativeExpr_Left()
   * @model containment="true"
   * @generated
   */
  UnionExpr getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.MultiplicativeExpr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(UnionExpr value);

  /**
   * Returns the value of the '<em><b>Rights</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.xpath.xPath.UnionExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rights</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rights</em>' containment reference list.
   * @see org.xtext.example.xpath.xPath.XPathPackage#getMultiplicativeExpr_Rights()
   * @model containment="true"
   * @generated
   */
  EList<UnionExpr> getRights();

} // MultiplicativeExpr
