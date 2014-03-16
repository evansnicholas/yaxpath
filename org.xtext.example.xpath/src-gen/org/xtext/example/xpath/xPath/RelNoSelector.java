/**
 */
package org.xtext.example.xpath.xPath;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rel No Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.RelNoSelector#getRelPathExpr <em>Rel Path Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getRelNoSelector()
 * @model
 * @generated
 */
public interface RelNoSelector extends PathExpr
{
  /**
   * Returns the value of the '<em><b>Rel Path Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel Path Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel Path Expr</em>' containment reference.
   * @see #setRelPathExpr(RelativePathExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getRelNoSelector_RelPathExpr()
   * @model containment="true"
   * @generated
   */
  RelativePathExpr getRelPathExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.RelNoSelector#getRelPathExpr <em>Rel Path Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rel Path Expr</em>' containment reference.
   * @see #getRelPathExpr()
   * @generated
   */
  void setRelPathExpr(RelativePathExpr value);

} // RelNoSelector
