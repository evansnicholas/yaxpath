/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.AxisStep#getStep <em>Step</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.AxisStep#getPredicateList <em>Predicate List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getAxisStep()
 * @model
 * @generated
 */
public interface AxisStep extends StepExpr
{
  /**
   * Returns the value of the '<em><b>Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' containment reference.
   * @see #setStep(EObject)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getAxisStep_Step()
   * @model containment="true"
   * @generated
   */
  EObject getStep();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.AxisStep#getStep <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step</em>' containment reference.
   * @see #getStep()
   * @generated
   */
  void setStep(EObject value);

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
   * @see org.xtext.example.xpath.xPath.XPathPackage#getAxisStep_PredicateList()
   * @model containment="true"
   * @generated
   */
  PredicateList getPredicateList();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.AxisStep#getPredicateList <em>Predicate List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate List</em>' containment reference.
   * @see #getPredicateList()
   * @generated
   */
  void setPredicateList(PredicateList value);

} // AxisStep
