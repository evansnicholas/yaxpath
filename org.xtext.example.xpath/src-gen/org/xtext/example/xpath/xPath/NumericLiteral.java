/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.NumericLiteral#getIntLit <em>Int Lit</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.NumericLiteral#getDecLit <em>Dec Lit</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.NumericLiteral#getDoubleLit <em>Double Lit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getNumericLiteral()
 * @model
 * @generated
 */
public interface NumericLiteral extends EObject
{
  /**
   * Returns the value of the '<em><b>Int Lit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Lit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Lit</em>' attribute.
   * @see #setIntLit(int)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getNumericLiteral_IntLit()
   * @model
   * @generated
   */
  int getIntLit();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.NumericLiteral#getIntLit <em>Int Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Lit</em>' attribute.
   * @see #getIntLit()
   * @generated
   */
  void setIntLit(int value);

  /**
   * Returns the value of the '<em><b>Dec Lit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dec Lit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dec Lit</em>' attribute.
   * @see #setDecLit(String)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getNumericLiteral_DecLit()
   * @model
   * @generated
   */
  String getDecLit();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.NumericLiteral#getDecLit <em>Dec Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dec Lit</em>' attribute.
   * @see #getDecLit()
   * @generated
   */
  void setDecLit(String value);

  /**
   * Returns the value of the '<em><b>Double Lit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Double Lit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Double Lit</em>' attribute.
   * @see #setDoubleLit(String)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getNumericLiteral_DoubleLit()
   * @model
   * @generated
   */
  String getDoubleLit();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.NumericLiteral#getDoubleLit <em>Double Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Double Lit</em>' attribute.
   * @see #getDoubleLit()
   * @generated
   */
  void setDoubleLit(String value);

} // NumericLiteral
