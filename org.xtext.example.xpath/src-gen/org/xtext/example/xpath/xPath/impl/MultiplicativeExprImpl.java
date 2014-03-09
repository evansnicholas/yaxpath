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

import org.xtext.example.xpath.xPath.MultiplicativeExpr;
import org.xtext.example.xpath.xPath.UnionExpr;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicative Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.MultiplicativeExprImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.MultiplicativeExprImpl#getRights <em>Rights</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicativeExprImpl extends MinimalEObjectImpl.Container implements MultiplicativeExpr
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected UnionExpr left;

  /**
   * The cached value of the '{@link #getRights() <em>Rights</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRights()
   * @generated
   * @ordered
   */
  protected EList<UnionExpr> rights;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiplicativeExprImpl()
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
    return XPathPackage.Literals.MULTIPLICATIVE_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnionExpr getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(UnionExpr newLeft, NotificationChain msgs)
  {
    UnionExpr oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.MULTIPLICATIVE_EXPR__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(UnionExpr newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.MULTIPLICATIVE_EXPR__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.MULTIPLICATIVE_EXPR__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.MULTIPLICATIVE_EXPR__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnionExpr> getRights()
  {
    if (rights == null)
    {
      rights = new EObjectContainmentEList<UnionExpr>(UnionExpr.class, this, XPathPackage.MULTIPLICATIVE_EXPR__RIGHTS);
    }
    return rights;
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
      case XPathPackage.MULTIPLICATIVE_EXPR__LEFT:
        return basicSetLeft(null, msgs);
      case XPathPackage.MULTIPLICATIVE_EXPR__RIGHTS:
        return ((InternalEList<?>)getRights()).basicRemove(otherEnd, msgs);
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
      case XPathPackage.MULTIPLICATIVE_EXPR__LEFT:
        return getLeft();
      case XPathPackage.MULTIPLICATIVE_EXPR__RIGHTS:
        return getRights();
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
      case XPathPackage.MULTIPLICATIVE_EXPR__LEFT:
        setLeft((UnionExpr)newValue);
        return;
      case XPathPackage.MULTIPLICATIVE_EXPR__RIGHTS:
        getRights().clear();
        getRights().addAll((Collection<? extends UnionExpr>)newValue);
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
      case XPathPackage.MULTIPLICATIVE_EXPR__LEFT:
        setLeft((UnionExpr)null);
        return;
      case XPathPackage.MULTIPLICATIVE_EXPR__RIGHTS:
        getRights().clear();
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
      case XPathPackage.MULTIPLICATIVE_EXPR__LEFT:
        return left != null;
      case XPathPackage.MULTIPLICATIVE_EXPR__RIGHTS:
        return rights != null && !rights.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MultiplicativeExprImpl
