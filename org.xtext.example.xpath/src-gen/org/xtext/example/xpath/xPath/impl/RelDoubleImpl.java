/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.xpath.xPath.RelDouble;
import org.xtext.example.xpath.xPath.RelativePathExpr;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rel Double</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.RelDoubleImpl#getRelPathExpr <em>Rel Path Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelDoubleImpl extends PathExprImpl implements RelDouble
{
  /**
   * The cached value of the '{@link #getRelPathExpr() <em>Rel Path Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelPathExpr()
   * @generated
   * @ordered
   */
  protected RelativePathExpr relPathExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelDoubleImpl()
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
    return XPathPackage.Literals.REL_DOUBLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativePathExpr getRelPathExpr()
  {
    return relPathExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelPathExpr(RelativePathExpr newRelPathExpr, NotificationChain msgs)
  {
    RelativePathExpr oldRelPathExpr = relPathExpr;
    relPathExpr = newRelPathExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.REL_DOUBLE__REL_PATH_EXPR, oldRelPathExpr, newRelPathExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelPathExpr(RelativePathExpr newRelPathExpr)
  {
    if (newRelPathExpr != relPathExpr)
    {
      NotificationChain msgs = null;
      if (relPathExpr != null)
        msgs = ((InternalEObject)relPathExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.REL_DOUBLE__REL_PATH_EXPR, null, msgs);
      if (newRelPathExpr != null)
        msgs = ((InternalEObject)newRelPathExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.REL_DOUBLE__REL_PATH_EXPR, null, msgs);
      msgs = basicSetRelPathExpr(newRelPathExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.REL_DOUBLE__REL_PATH_EXPR, newRelPathExpr, newRelPathExpr));
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
      case XPathPackage.REL_DOUBLE__REL_PATH_EXPR:
        return basicSetRelPathExpr(null, msgs);
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
      case XPathPackage.REL_DOUBLE__REL_PATH_EXPR:
        return getRelPathExpr();
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
      case XPathPackage.REL_DOUBLE__REL_PATH_EXPR:
        setRelPathExpr((RelativePathExpr)newValue);
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
      case XPathPackage.REL_DOUBLE__REL_PATH_EXPR:
        setRelPathExpr((RelativePathExpr)null);
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
      case XPathPackage.REL_DOUBLE__REL_PATH_EXPR:
        return relPathExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //RelDoubleImpl
