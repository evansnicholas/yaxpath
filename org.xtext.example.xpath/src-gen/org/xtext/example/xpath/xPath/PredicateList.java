/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.PredicateList#getPredicates <em>Predicates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getPredicateList()
 * @model
 * @generated
 */
public interface PredicateList extends EObject
{
  /**
   * Returns the value of the '<em><b>Predicates</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.xpath.xPath.Predicate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicates</em>' containment reference list.
   * @see org.xtext.example.xpath.xPath.XPathPackage#getPredicateList_Predicates()
   * @model containment="true"
   * @generated
   */
  EList<Predicate> getPredicates();

} // PredicateList
