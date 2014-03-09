/**
 */
package org.xtext.example.xpath.xPath;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PIT Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.PITTest#getNcName <em>Nc Name</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.PITTest#getString <em>String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getPITTest()
 * @model
 * @generated
 */
public interface PITTest extends PITest
{
  /**
   * Returns the value of the '<em><b>Nc Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nc Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nc Name</em>' containment reference.
   * @see #setNcName(NCName)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getPITTest_NcName()
   * @model containment="true"
   * @generated
   */
  NCName getNcName();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.PITTest#getNcName <em>Nc Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nc Name</em>' containment reference.
   * @see #getNcName()
   * @generated
   */
  void setNcName(NCName value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getPITTest_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.PITTest#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

} // PITTest
