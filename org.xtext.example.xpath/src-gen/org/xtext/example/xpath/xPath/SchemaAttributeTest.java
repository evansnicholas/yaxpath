/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Attribute Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.SchemaAttributeTest#getAttDec <em>Att Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getSchemaAttributeTest()
 * @model
 * @generated
 */
public interface SchemaAttributeTest extends EObject
{
  /**
   * Returns the value of the '<em><b>Att Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Att Dec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Att Dec</em>' containment reference.
   * @see #setAttDec(AttributeDeclaration)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getSchemaAttributeTest_AttDec()
   * @model containment="true"
   * @generated
   */
  AttributeDeclaration getAttDec();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.SchemaAttributeTest#getAttDec <em>Att Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Att Dec</em>' containment reference.
   * @see #getAttDec()
   * @generated
   */
  void setAttDec(AttributeDeclaration value);

} // SchemaAttributeTest
