/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forward Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.ForwardStep#getForward <em>Forward</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.ForwardStep#getTest <em>Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.ForwardStep#getAbbrForward <em>Abbr Forward</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getForwardStep()
 * @model
 * @generated
 */
public interface ForwardStep extends EObject
{
  /**
   * Returns the value of the '<em><b>Forward</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forward</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forward</em>' containment reference.
   * @see #setForward(ForwardAxis)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getForwardStep_Forward()
   * @model containment="true"
   * @generated
   */
  ForwardAxis getForward();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ForwardStep#getForward <em>Forward</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forward</em>' containment reference.
   * @see #getForward()
   * @generated
   */
  void setForward(ForwardAxis value);

  /**
   * Returns the value of the '<em><b>Test</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test</em>' containment reference.
   * @see #setTest(NodeTest)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getForwardStep_Test()
   * @model containment="true"
   * @generated
   */
  NodeTest getTest();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ForwardStep#getTest <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test</em>' containment reference.
   * @see #getTest()
   * @generated
   */
  void setTest(NodeTest value);

  /**
   * Returns the value of the '<em><b>Abbr Forward</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abbr Forward</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abbr Forward</em>' containment reference.
   * @see #setAbbrForward(AbbrevForwardStep)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getForwardStep_AbbrForward()
   * @model containment="true"
   * @generated
   */
  AbbrevForwardStep getAbbrForward();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ForwardStep#getAbbrForward <em>Abbr Forward</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abbr Forward</em>' containment reference.
   * @see #getAbbrForward()
   * @generated
   */
  void setAbbrForward(AbbrevForwardStep value);

} // ForwardStep
