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
 *   <li>{@link org.xtext.example.xpath.xPath.AxisStep#getReverse <em>Reverse</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.AxisStep#getForward <em>Forward</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.AxisStep#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getAxisStep()
 * @model
 * @generated
 */
public interface AxisStep extends EObject
{
  /**
   * Returns the value of the '<em><b>Reverse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reverse</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reverse</em>' containment reference.
   * @see #setReverse(ReverseStep)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getAxisStep_Reverse()
   * @model containment="true"
   * @generated
   */
  ReverseStep getReverse();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.AxisStep#getReverse <em>Reverse</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reverse</em>' containment reference.
   * @see #getReverse()
   * @generated
   */
  void setReverse(ReverseStep value);

  /**
   * Returns the value of the '<em><b>Forward</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forward</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forward</em>' containment reference.
   * @see #setForward(ForwardStep)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getAxisStep_Forward()
   * @model containment="true"
   * @generated
   */
  ForwardStep getForward();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.AxisStep#getForward <em>Forward</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forward</em>' containment reference.
   * @see #getForward()
   * @generated
   */
  void setForward(ForwardStep value);

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
   * @see org.xtext.example.xpath.xPath.XPathPackage#getAxisStep_Predicate()
   * @model containment="true"
   * @generated
   */
  PredicateList getPredicate();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.AxisStep#getPredicate <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' containment reference.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(PredicateList value);

} // AxisStep
