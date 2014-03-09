/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.NodeTest#getKindTest <em>Kind Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.NodeTest#getNodeTest <em>Node Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getNodeTest()
 * @model
 * @generated
 */
public interface NodeTest extends EObject
{
  /**
   * Returns the value of the '<em><b>Kind Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind Test</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind Test</em>' containment reference.
   * @see #setKindTest(KindTest)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getNodeTest_KindTest()
   * @model containment="true"
   * @generated
   */
  KindTest getKindTest();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.NodeTest#getKindTest <em>Kind Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind Test</em>' containment reference.
   * @see #getKindTest()
   * @generated
   */
  void setKindTest(KindTest value);

  /**
   * Returns the value of the '<em><b>Node Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Test</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Test</em>' containment reference.
   * @see #setNodeTest(NameTest)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getNodeTest_NodeTest()
   * @model containment="true"
   * @generated
   */
  NameTest getNodeTest();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.NodeTest#getNodeTest <em>Node Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Test</em>' containment reference.
   * @see #getNodeTest()
   * @generated
   */
  void setNodeTest(NameTest value);

} // NodeTest
