/**
 */
package org.xtext.example.xpath.xPath.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.xpath.xPath.Expr;
import org.xtext.example.xpath.xPath.ExprSingle;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ExprImpl#getExprSingle <em>Expr Single</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ExprImpl#getExprsSingle <em>Exprs Single</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprImpl extends MinimalEObjectImpl.Container implements Expr
{
  /**
   * The cached value of the '{@link #getExprSingle() <em>Expr Single</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprSingle()
   * @generated
   * @ordered
   */
  protected ExprSingle exprSingle;

  /**
   * The cached value of the '{@link #getExprsSingle() <em>Exprs Single</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprsSingle()
   * @generated
   * @ordered
   */
  protected EList<ExprSingle> exprsSingle;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprImpl()
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
    return XPathPackage.Literals.EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSingle getExprSingle()
  {
    return exprSingle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprSingle(ExprSingle newExprSingle, NotificationChain msgs)
  {
    ExprSingle oldExprSingle = exprSingle;
    exprSingle = newExprSingle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.EXPR__EXPR_SINGLE, oldExprSingle, newExprSingle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprSingle(ExprSingle newExprSingle)
  {
    if (newExprSingle != exprSingle)
    {
      NotificationChain msgs = null;
      if (exprSingle != null)
        msgs = ((InternalEObject)exprSingle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.EXPR__EXPR_SINGLE, null, msgs);
      if (newExprSingle != null)
        msgs = ((InternalEObject)newExprSingle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.EXPR__EXPR_SINGLE, null, msgs);
      msgs = basicSetExprSingle(newExprSingle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.EXPR__EXPR_SINGLE, newExprSingle, newExprSingle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExprSingle> getExprsSingle()
  {
    if (exprsSingle == null)
    {
      exprsSingle = new EObjectContainmentEList<ExprSingle>(ExprSingle.class, this, XPathPackage.EXPR__EXPRS_SINGLE);
    }
    return exprsSingle;
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
      case XPathPackage.EXPR__EXPR_SINGLE:
        return basicSetExprSingle(null, msgs);
      case XPathPackage.EXPR__EXPRS_SINGLE:
        return ((InternalEList<?>)getExprsSingle()).basicRemove(otherEnd, msgs);
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
      case XPathPackage.EXPR__EXPR_SINGLE:
        return getExprSingle();
      case XPathPackage.EXPR__EXPRS_SINGLE:
        return getExprsSingle();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XPathPackage.EXPR__EXPR_SINGLE:
        setExprSingle((ExprSingle)newValue);
        return;
      case XPathPackage.EXPR__EXPRS_SINGLE:
        getExprsSingle().clear();
        getExprsSingle().addAll((Collection<? extends ExprSingle>)newValue);
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
      case XPathPackage.EXPR__EXPR_SINGLE:
        setExprSingle((ExprSingle)null);
        return;
      case XPathPackage.EXPR__EXPRS_SINGLE:
        getExprsSingle().clear();
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
      case XPathPackage.EXPR__EXPR_SINGLE:
        return exprSingle != null;
      case XPathPackage.EXPR__EXPRS_SINGLE:
        return exprsSingle != null && !exprsSingle.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExprImpl
