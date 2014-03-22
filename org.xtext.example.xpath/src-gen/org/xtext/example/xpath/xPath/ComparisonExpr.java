/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.ComparisonExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.ComparisonExpr#getComp <em>Comp</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.ComparisonExpr#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getComparisonExpr()
 * @model
 * @generated
 */
public interface ComparisonExpr extends EObject
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
   * @see #setLeft(RangeExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getComparisonExpr_Left()
   * @model containment="true"
   * @generated
   */
  RangeExpr getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ComparisonExpr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(RangeExpr value);

  /**
   * Returns the value of the '<em><b>Comp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comp</em>' containment reference.
   * @see #setComp(EObject)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getComparisonExpr_Comp()
   * @model containment="true"
   * @generated
   */
  EObject getComp();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ComparisonExpr#getComp <em>Comp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comp</em>' containment reference.
   * @see #getComp()
   * @generated
   */
  void setComp(EObject value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(RangeExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getComparisonExpr_Right()
   * @model containment="true"
   * @generated
   */
  RangeExpr getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ComparisonExpr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(RangeExpr value);

} // ComparisonExpr
