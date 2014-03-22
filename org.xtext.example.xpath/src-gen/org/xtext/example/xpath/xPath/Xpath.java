/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xpath</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.Xpath#getXpath <em>Xpath</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getXpath()
 * @model
 * @generated
 */
public interface Xpath extends EObject
{
  /**
   * Returns the value of the '<em><b>Xpath</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xpath</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xpath</em>' containment reference.
   * @see #setXpath(Expr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getXpath_Xpath()
   * @model containment="true"
   * @generated
   */
  Expr getXpath();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.Xpath#getXpath <em>Xpath</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xpath</em>' containment reference.
   * @see #getXpath()
   * @generated
   */
  void setXpath(Expr value);

} // Xpath
