/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.PathExpr#getSinglePath <em>Single Path</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.PathExpr#getDoublePath <em>Double Path</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.PathExpr#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getPathExpr()
 * @model
 * @generated
 */
public interface PathExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Single Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Single Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single Path</em>' containment reference.
   * @see #setSinglePath(RelativePathExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getPathExpr_SinglePath()
   * @model containment="true"
   * @generated
   */
  RelativePathExpr getSinglePath();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.PathExpr#getSinglePath <em>Single Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single Path</em>' containment reference.
   * @see #getSinglePath()
   * @generated
   */
  void setSinglePath(RelativePathExpr value);

  /**
   * Returns the value of the '<em><b>Double Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Double Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Double Path</em>' containment reference.
   * @see #setDoublePath(RelativePathExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getPathExpr_DoublePath()
   * @model containment="true"
   * @generated
   */
  RelativePathExpr getDoublePath();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.PathExpr#getDoublePath <em>Double Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Double Path</em>' containment reference.
   * @see #getDoublePath()
   * @generated
   */
  void setDoublePath(RelativePathExpr value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(RelativePathExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getPathExpr_Path()
   * @model containment="true"
   * @generated
   */
  RelativePathExpr getPath();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.PathExpr#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(RelativePathExpr value);

} // PathExpr
