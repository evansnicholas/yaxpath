/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.ComparisonExpr#getRange <em>Range</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.ComparisonExpr#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.ComparisonExpr#getGen <em>Gen</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.ComparisonExpr#getNode <em>Node</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.ComparisonExpr#getOtherRange <em>Other Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getComparisonExpr()
 * @model
 * @generated
 */
public interface ComparisonExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range</em>' containment reference.
   * @see #setRange(RangeExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getComparisonExpr_Range()
   * @model containment="true"
   * @generated
   */
  RangeExpr getRange();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ComparisonExpr#getRange <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range</em>' containment reference.
   * @see #getRange()
   * @generated
   */
  void setRange(RangeExpr value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getComparisonExpr_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ComparisonExpr#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Gen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gen</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gen</em>' attribute.
   * @see #setGen(String)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getComparisonExpr_Gen()
   * @model
   * @generated
   */
  String getGen();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ComparisonExpr#getGen <em>Gen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gen</em>' attribute.
   * @see #getGen()
   * @generated
   */
  void setGen(String value);

  /**
   * Returns the value of the '<em><b>Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' attribute.
   * @see #setNode(String)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getComparisonExpr_Node()
   * @model
   * @generated
   */
  String getNode();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ComparisonExpr#getNode <em>Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' attribute.
   * @see #getNode()
   * @generated
   */
  void setNode(String value);

  /**
   * Returns the value of the '<em><b>Other Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Other Range</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other Range</em>' containment reference.
   * @see #setOtherRange(RangeExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getComparisonExpr_OtherRange()
   * @model containment="true"
   * @generated
   */
  RangeExpr getOtherRange();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.ComparisonExpr#getOtherRange <em>Other Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Other Range</em>' containment reference.
   * @see #getOtherRange()
   * @generated
   */
  void setOtherRange(RangeExpr value);

} // ComparisonExpr
