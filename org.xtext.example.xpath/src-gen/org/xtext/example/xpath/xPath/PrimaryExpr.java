/**
 */
package org.xtext.example.xpath.xPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.PrimaryExpr#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.PrimaryExpr#getVarRef <em>Var Ref</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.PrimaryExpr#getParExpr <em>Par Expr</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.PrimaryExpr#getConItemExpr <em>Con Item Expr</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.PrimaryExpr#getFunctionCall <em>Function Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.xpath.xPath.XPathPackage#getPrimaryExpr()
 * @model
 * @generated
 */
public interface PrimaryExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference.
   * @see #setLiteral(Literal)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getPrimaryExpr_Literal()
   * @model containment="true"
   * @generated
   */
  Literal getLiteral();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.PrimaryExpr#getLiteral <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' containment reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(Literal value);

  /**
   * Returns the value of the '<em><b>Var Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Ref</em>' containment reference.
   * @see #setVarRef(VarRef)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getPrimaryExpr_VarRef()
   * @model containment="true"
   * @generated
   */
  VarRef getVarRef();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.PrimaryExpr#getVarRef <em>Var Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Ref</em>' containment reference.
   * @see #getVarRef()
   * @generated
   */
  void setVarRef(VarRef value);

  /**
   * Returns the value of the '<em><b>Par Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par Expr</em>' containment reference.
   * @see #setParExpr(ParenthesizedExpr)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getPrimaryExpr_ParExpr()
   * @model containment="true"
   * @generated
   */
  ParenthesizedExpr getParExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.PrimaryExpr#getParExpr <em>Par Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par Expr</em>' containment reference.
   * @see #getParExpr()
   * @generated
   */
  void setParExpr(ParenthesizedExpr value);

  /**
   * Returns the value of the '<em><b>Con Item Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Con Item Expr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Con Item Expr</em>' attribute.
   * @see #setConItemExpr(String)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getPrimaryExpr_ConItemExpr()
   * @model
   * @generated
   */
  String getConItemExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.PrimaryExpr#getConItemExpr <em>Con Item Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Con Item Expr</em>' attribute.
   * @see #getConItemExpr()
   * @generated
   */
  void setConItemExpr(String value);

  /**
   * Returns the value of the '<em><b>Function Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Call</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Call</em>' containment reference.
   * @see #setFunctionCall(FunctionCall)
   * @see org.xtext.example.xpath.xPath.XPathPackage#getPrimaryExpr_FunctionCall()
   * @model containment="true"
   * @generated
   */
  FunctionCall getFunctionCall();

  /**
   * Sets the value of the '{@link org.xtext.example.xpath.xPath.PrimaryExpr#getFunctionCall <em>Function Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Call</em>' containment reference.
   * @see #getFunctionCall()
   * @generated
   */
  void setFunctionCall(FunctionCall value);

} // PrimaryExpr
