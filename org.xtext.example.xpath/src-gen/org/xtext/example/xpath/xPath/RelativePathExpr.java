/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Path Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.RelativePathExpr#getStep <em>Step</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.RelativePathExpr#getExtraSteps <em>Extra Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getRelativePathExpr()
 * @model
 * @generated
 */
public interface RelativePathExpr extends PathExpr
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
   * @see #setStep(StepExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getRelativePathExpr_Step()
   * @model containment="true"
   * @generated
   */
  StepExpr getStep();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.RelativePathExpr#getStep <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step</em>' containment reference.
   * @see #getStep()
   * @generated
   */
  void setStep(StepExpr value);

  /**
   * Returns the value of the '<em><b>Extra Steps</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.xpath.xPath.StepExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extra Steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extra Steps</em>' containment reference list.
   * @see org.xtext.example.xpath.xPath.XPathPackage#getRelativePathExpr_ExtraSteps()
   * @model containment="true"
   * @generated
   */
  EList<StepExpr> getExtraSteps();

} // RelativePathExpr
