/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.FilterExpr#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.FilterExpr#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getFilterExpr()
 * @model
 * @generated
 */
public interface FilterExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Primary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary</em>' containment reference.
   * @see #setPrimary(PrimaryExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getFilterExpr_Primary()
   * @model containment="true"
   * @generated
   */
  PrimaryExpr getPrimary();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.FilterExpr#getPrimary <em>Primary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary</em>' containment reference.
   * @see #getPrimary()
   * @generated
   */
  void setPrimary(PrimaryExpr value);

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference.
   * @see #setPredicate(PredicateList)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getFilterExpr_Predicate()
   * @model containment="true"
   * @generated
   */
  PredicateList getPredicate();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.FilterExpr#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(PredicateList value);

} // FilterExpr
