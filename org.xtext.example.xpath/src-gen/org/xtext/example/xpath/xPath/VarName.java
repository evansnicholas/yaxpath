/**
 */
package org.xtext.example.xpath.xPath;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.VarName#getQName <em>QName</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getVarName()
 * @model
 * @generated
 */
public interface VarName extends VarRef
{
  /**
   * Returns the value of the '<em><b>QName</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>QName</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>QName</em>' containment reference.
   * @see #setQName(QName)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getVarName_QName()
   * @model containment="true"
   * @generated
   */
  QName getQName();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.VarName#getQName <em>QName</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>QName</em>' containment reference.
   * @see #getQName()
   * @generated
   */
  void setQName(QName value);

} // VarName
