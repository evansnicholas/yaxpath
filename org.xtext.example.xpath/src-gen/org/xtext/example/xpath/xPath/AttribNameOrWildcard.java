/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attrib Name Or Wildcard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.AttribNameOrWildcard#getAttName <em>Att Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getAttribNameOrWildcard()
 * @model
 * @generated
 */
public interface AttribNameOrWildcard extends EObject
{
  /**
   * Returns the value of the '<em><b>Att Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Att Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Att Name</em>' containment reference.
   * @see #setAttName(AttributeName)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getAttribNameOrWildcard_AttName()
   * @model containment="true"
   * @generated
   */
  AttributeName getAttName();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.AttribNameOrWildcard#getAttName <em>Att Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Att Name</em>' containment reference.
   * @see #getAttName()
   * @generated
   */
  void setAttName(AttributeName value);

} // AttribNameOrWildcard
