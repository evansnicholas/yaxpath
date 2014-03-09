/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.FunctionCall;
import org.xtext.example.xpath.xPath.Literal;
import org.xtext.example.xpath.xPath.ParenthesizedExpr;
import org.xtext.example.xpath.xPath.PrimaryExpr;
import org.xtext.example.xpath.xPath.VarRef;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.PrimaryExprImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.PrimaryExprImpl#getVarRef <em>Var Ref</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.PrimaryExprImpl#getParExpr <em>Par Expr</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.PrimaryExprImpl#getConItemExpr <em>Con Item Expr</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.PrimaryExprImpl#getFunctionCall <em>Function Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryExprImpl extends MinimalEObjectImpl.Container implements PrimaryExpr
{
  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected Literal literal;

  /**
   * The cached value of the '{@link #getVarRef() <em>Var Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarRef()
   * @generated
   * @ordered
   */
  protected VarRef varRef;

  /**
   * The cached value of the '{@link #getParExpr() <em>Par Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParExpr()
   * @generated
   * @ordered
   */
  protected ParenthesizedExpr parExpr;

  /**
   * The default value of the '{@link #getConItemExpr() <em>Con Item Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConItemExpr()
   * @generated
   * @ordered
   */
  protected static final String CON_ITEM_EXPR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConItemExpr() <em>Con Item Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConItemExpr()
   * @generated
   * @ordered
   */
  protected String conItemExpr = CON_ITEM_EXPR_EDEFAULT;

  /**
   * The cached value of the '{@link #getFunctionCall() <em>Function Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionCall()
   * @generated
   * @ordered
   */
  protected FunctionCall functionCall;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryExprImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XPathPackage.Literals.PRIMARY_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteral(Literal newLiteral, NotificationChain msgs)
  {
    Literal oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.PRIMARY_EXPR__LITERAL, oldLiteral, newLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(Literal newLiteral)
  {
    if (newLiteral != literal)
    {
      NotificationChain msgs = null;
      if (literal != null)
        msgs = ((InternalEObject)literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PRIMARY_EXPR__LITERAL, null, msgs);
      if (newLiteral != null)
        msgs = ((InternalEObject)newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PRIMARY_EXPR__LITERAL, null, msgs);
      msgs = basicSetLiteral(newLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.PRIMARY_EXPR__LITERAL, newLiteral, newLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarRef getVarRef()
  {
    return varRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarRef(VarRef newVarRef, NotificationChain msgs)
  {
    VarRef oldVarRef = varRef;
    varRef = newVarRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.PRIMARY_EXPR__VAR_REF, oldVarRef, newVarRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarRef(VarRef newVarRef)
  {
    if (newVarRef != varRef)
    {
      NotificationChain msgs = null;
      if (varRef != null)
        msgs = ((InternalEObject)varRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PRIMARY_EXPR__VAR_REF, null, msgs);
      if (newVarRef != null)
        msgs = ((InternalEObject)newVarRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PRIMARY_EXPR__VAR_REF, null, msgs);
      msgs = basicSetVarRef(newVarRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.PRIMARY_EXPR__VAR_REF, newVarRef, newVarRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParenthesizedExpr getParExpr()
  {
    return parExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParExpr(ParenthesizedExpr newParExpr, NotificationChain msgs)
  {
    ParenthesizedExpr oldParExpr = parExpr;
    parExpr = newParExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.PRIMARY_EXPR__PAR_EXPR, oldParExpr, newParExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParExpr(ParenthesizedExpr newParExpr)
  {
    if (newParExpr != parExpr)
    {
      NotificationChain msgs = null;
      if (parExpr != null)
        msgs = ((InternalEObject)parExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PRIMARY_EXPR__PAR_EXPR, null, msgs);
      if (newParExpr != null)
        msgs = ((InternalEObject)newParExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PRIMARY_EXPR__PAR_EXPR, null, msgs);
      msgs = basicSetParExpr(newParExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.PRIMARY_EXPR__PAR_EXPR, newParExpr, newParExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConItemExpr()
  {
    return conItemExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConItemExpr(String newConItemExpr)
  {
    String oldConItemExpr = conItemExpr;
    conItemExpr = newConItemExpr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.PRIMARY_EXPR__CON_ITEM_EXPR, oldConItemExpr, conItemExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall getFunctionCall()
  {
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctionCall(FunctionCall newFunctionCall, NotificationChain msgs)
  {
    FunctionCall oldFunctionCall = functionCall;
    functionCall = newFunctionCall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.PRIMARY_EXPR__FUNCTION_CALL, oldFunctionCall, newFunctionCall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionCall(FunctionCall newFunctionCall)
  {
    if (newFunctionCall != functionCall)
    {
      NotificationChain msgs = null;
      if (functionCall != null)
        msgs = ((InternalEObject)functionCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PRIMARY_EXPR__FUNCTION_CALL, null, msgs);
      if (newFunctionCall != null)
        msgs = ((InternalEObject)newFunctionCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PRIMARY_EXPR__FUNCTION_CALL, null, msgs);
      msgs = basicSetFunctionCall(newFunctionCall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.PRIMARY_EXPR__FUNCTION_CALL, newFunctionCall, newFunctionCall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XPathPackage.PRIMARY_EXPR__LITERAL:
        return basicSetLiteral(null, msgs);
      case XPathPackage.PRIMARY_EXPR__VAR_REF:
        return basicSetVarRef(null, msgs);
      case XPathPackage.PRIMARY_EXPR__PAR_EXPR:
        return basicSetParExpr(null, msgs);
      case XPathPackage.PRIMARY_EXPR__FUNCTION_CALL:
        return basicSetFunctionCall(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XPathPackage.PRIMARY_EXPR__LITERAL:
        return getLiteral();
      case XPathPackage.PRIMARY_EXPR__VAR_REF:
        return getVarRef();
      case XPathPackage.PRIMARY_EXPR__PAR_EXPR:
        return getParExpr();
      case XPathPackage.PRIMARY_EXPR__CON_ITEM_EXPR:
        return getConItemExpr();
      case XPathPackage.PRIMARY_EXPR__FUNCTION_CALL:
        return getFunctionCall();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XPathPackage.PRIMARY_EXPR__LITERAL:
        setLiteral((Literal)newValue);
        return;
      case XPathPackage.PRIMARY_EXPR__VAR_REF:
        setVarRef((VarRef)newValue);
        return;
      case XPathPackage.PRIMARY_EXPR__PAR_EXPR:
        setParExpr((ParenthesizedExpr)newValue);
        return;
      case XPathPackage.PRIMARY_EXPR__CON_ITEM_EXPR:
        setConItemExpr((String)newValue);
        return;
      case XPathPackage.PRIMARY_EXPR__FUNCTION_CALL:
        setFunctionCall((FunctionCall)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XPathPackage.PRIMARY_EXPR__LITERAL:
        setLiteral((Literal)null);
        return;
      case XPathPackage.PRIMARY_EXPR__VAR_REF:
        setVarRef((VarRef)null);
        return;
      case XPathPackage.PRIMARY_EXPR__PAR_EXPR:
        setParExpr((ParenthesizedExpr)null);
        return;
      case XPathPackage.PRIMARY_EXPR__CON_ITEM_EXPR:
        setConItemExpr(CON_ITEM_EXPR_EDEFAULT);
        return;
      case XPathPackage.PRIMARY_EXPR__FUNCTION_CALL:
        setFunctionCall((FunctionCall)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XPathPackage.PRIMARY_EXPR__LITERAL:
        return literal != null;
      case XPathPackage.PRIMARY_EXPR__VAR_REF:
        return varRef != null;
      case XPathPackage.PRIMARY_EXPR__PAR_EXPR:
        return parExpr != null;
      case XPathPackage.PRIMARY_EXPR__CON_ITEM_EXPR:
        return CON_ITEM_EXPR_EDEFAULT == null ? conItemExpr != null : !CON_ITEM_EXPR_EDEFAULT.equals(conItemExpr);
      case XPathPackage.PRIMARY_EXPR__FUNCTION_CALL:
        return functionCall != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (conItemExpr: ");
    result.append(conItemExpr);
    result.append(')');
    return result.toString();
  }

} //PrimaryExprImpl
