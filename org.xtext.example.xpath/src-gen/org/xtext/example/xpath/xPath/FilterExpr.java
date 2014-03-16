/**
 */
package org.xtext.example.xpath.xPath;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.FilterExpr#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.FilterExpr#getPredicateList <em>Predicate List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getFilterExpr()
 * @model
 * @generated
 */
public interface FilterExpr extends StepExpr
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
   * Returns the value of the '<em><b>Predicate List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate List</em>' containment reference.
   * @see #setPredicateList(PredicateList)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getFilterExpr_PredicateList()
   * @model containment="true"
   * @generated
   */
  PredicateList getPredicateList();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.FilterExpr#getPredicateList <em>Predicate List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate List</em>' containment reference.
   * @see #getPredicateList()
   * @generated
   */
  void setPredicateList(PredicateList value);

} // FilterExpr
