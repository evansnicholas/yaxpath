/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.StepExpr#getStepExpr <em>Step Expr</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.StepExpr#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getStepExpr()
 * @model
 * @generated
 */
public interface StepExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Step Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step Expr</em>' containment reference.
   * @see #setStepExpr(EObject)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getStepExpr_StepExpr()
   * @model containment="true"
   * @generated
   */
  EObject getStepExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.StepExpr#getStepExpr <em>Step Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step Expr</em>' containment reference.
   * @see #getStepExpr()
   * @generated
   */
  void setStepExpr(EObject value);

  /**
   * Returns the value of the '<em><b>Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' containment reference.
   * @see #setStep(StepExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getStepExpr_Step()
   * @model containment="true"
   * @generated
   */
  StepExpr getStep();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.StepExpr#getStep <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step</em>' containment reference.
   * @see #getStep()
   * @generated
   */
  void setStep(StepExpr value);

} // StepExpr
