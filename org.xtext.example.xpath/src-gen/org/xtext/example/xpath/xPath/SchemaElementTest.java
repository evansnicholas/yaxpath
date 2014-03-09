/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Element Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.SchemaElementTest#getElemDec <em>Elem Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getSchemaElementTest()
 * @model
 * @generated
 */
public interface SchemaElementTest extends EObject
{
  /**
   * Returns the value of the '<em><b>Elem Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem Dec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem Dec</em>' containment reference.
   * @see #setElemDec(ElementDeclaration)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getSchemaElementTest_ElemDec()
   * @model containment="true"
   * @generated
   */
  ElementDeclaration getElemDec();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.SchemaElementTest#getElemDec <em>Elem Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem Dec</em>' containment reference.
   * @see #getElemDec()
   * @generated
   */
  void setElemDec(ElementDeclaration value);

} // SchemaElementTest
