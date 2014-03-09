/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.DocumentTest#getElemTest <em>Elem Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.DocumentTest#getSchemaElemTest <em>Schema Elem Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getDocumentTest()
 * @model
 * @generated
 */
public interface DocumentTest extends EObject
{
  /**
   * Returns the value of the '<em><b>Elem Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem Test</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem Test</em>' containment reference.
   * @see #setElemTest(ElementTest)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getDocumentTest_ElemTest()
   * @model containment="true"
   * @generated
   */
  ElementTest getElemTest();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.DocumentTest#getElemTest <em>Elem Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem Test</em>' containment reference.
   * @see #getElemTest()
   * @generated
   */
  void setElemTest(ElementTest value);

  /**
   * Returns the value of the '<em><b>Schema Elem Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema Elem Test</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema Elem Test</em>' containment reference.
   * @see #setSchemaElemTest(SchemaElementTest)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getDocumentTest_SchemaElemTest()
   * @model containment="true"
   * @generated
   */
  SchemaElementTest getSchemaElemTest();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.DocumentTest#getSchemaElemTest <em>Schema Elem Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema Elem Test</em>' containment reference.
   * @see #getSchemaElemTest()
   * @generated
   */
  void setSchemaElemTest(SchemaElementTest value);

} // DocumentTest
