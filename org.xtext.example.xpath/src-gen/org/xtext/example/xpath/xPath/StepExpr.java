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
 *   <li>{@link org.xtext.example.xpath.xPath.StepExpr#getFilter <em>Filter</em>}</li>
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
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(FilterExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getStepExpr_Filter()
   * @model containment="true"
   * @generated
   */
  FilterExpr getFilter();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.StepExpr#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(FilterExpr value);

  /**
   * Returns the value of the '<em><b>Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' containment reference.
   * @see #setStep(AxisStep)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getStepExpr_Step()
   * @model containment="true"
   * @generated
   */
  AxisStep getStep();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.StepExpr#getStep <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step</em>' containment reference.
   * @see #getStep()
   * @generated
   */
  void setStep(AxisStep value);

} // StepExpr
