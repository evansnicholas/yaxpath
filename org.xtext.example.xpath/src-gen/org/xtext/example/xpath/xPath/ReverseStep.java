/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reverse Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.ReverseStep#getReverse <em>Reverse</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.ReverseStep#getTest <em>Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.ReverseStep#getAbbrRevSet <em>Abbr Rev Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getReverseStep()
 * @model
 * @generated
 */
public interface ReverseStep extends EObject
{
  /**
   * Returns the value of the '<em><b>Reverse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reverse</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reverse</em>' attribute.
   * @see #setReverse(String)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getReverseStep_Reverse()
   * @model
   * @generated
   */
  String getReverse();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ReverseStep#getReverse <em>Reverse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reverse</em>' attribute.
   * @see #getReverse()
   * @generated
   */
  void setReverse(String value);

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
   * @see org.xtext.example.xpath.xPath.XPathPackage#getReverseStep_Test()
   * @model containment="true"
   * @generated
   */
  NodeTest getTest();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ReverseStep#getTest <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test</em>' containment reference.
   * @see #getTest()
   * @generated
   */
  void setTest(NodeTest value);

  /**
   * Returns the value of the '<em><b>Abbr Rev Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abbr Rev Set</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abbr Rev Set</em>' attribute.
   * @see #setAbbrRevSet(String)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getReverseStep_AbbrRevSet()
   * @model
   * @generated
   */
  String getAbbrRevSet();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ReverseStep#getAbbrRevSet <em>Abbr Rev Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abbr Rev Set</em>' attribute.
   * @see #getAbbrRevSet()
   * @generated
   */
  void setAbbrRevSet(String value);

} // ReverseStep
