/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forward Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.ForwardAxis#getAxis <em>Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getForwardAxis()
 * @model
 * @generated
 */
public interface ForwardAxis extends EObject
{
  /**
   * Returns the value of the '<em><b>Axis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axis</em>' attribute.
   * @see #setAxis(String)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getForwardAxis_Axis()
   * @model
   * @generated
   */
  String getAxis();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ForwardAxis#getAxis <em>Axis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Axis</em>' attribute.
   * @see #getAxis()
   * @generated
   */
  void setAxis(String value);

} // ForwardAxis
