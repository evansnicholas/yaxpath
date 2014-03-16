/**
 */
package org.xtext.example.xpath.xPath;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefixed Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.PrefixedName#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getPrefixedName()
 * @model
 * @generated
 */
public interface PrefixedName extends QName
{
  /**
   * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' containment reference.
   * @see #setPrefix(NCName)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getPrefixedName_Prefix()
   * @model containment="true"
   * @generated
   */
  NCName getPrefix();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.PrefixedName#getPrefix <em>Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' containment reference.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(NCName value);

} // PrefixedName
