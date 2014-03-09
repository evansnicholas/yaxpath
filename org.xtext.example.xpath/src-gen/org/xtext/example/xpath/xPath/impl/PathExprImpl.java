/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.PathExpr;
import org.xtext.example.xpath.xPath.RelativePathExpr;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.PathExprImpl#getSinglePath <em>Single Path</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.PathExprImpl#getDoublePath <em>Double Path</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.PathExprImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathExprImpl extends MinimalEObjectImpl.Container implements PathExpr
{
  /**
   * The cached value of the '{@link #getSinglePath() <em>Single Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSinglePath()
   * @generated
   * @ordered
   */
  protected RelativePathExpr singlePath;

  /**
   * The cached value of the '{@link #getDoublePath() <em>Double Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoublePath()
   * @generated
   * @ordered
   */
  protected RelativePathExpr doublePath;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected RelativePathExpr path;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathExprImpl()
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
    return XPathPackage.Literals.PATH_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativePathExpr getSinglePath()
  {
    return singlePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSinglePath(RelativePathExpr newSinglePath, NotificationChain msgs)
  {
    RelativePathExpr oldSinglePath = singlePath;
    singlePath = newSinglePath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.PATH_EXPR__SINGLE_PATH, oldSinglePath, newSinglePath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSinglePath(RelativePathExpr newSinglePath)
  {
    if (newSinglePath != singlePath)
    {
      NotificationChain msgs = null;
      if (singlePath != null)
        msgs = ((InternalEObject)singlePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PATH_EXPR__SINGLE_PATH, null, msgs);
      if (newSinglePath != null)
        msgs = ((InternalEObject)newSinglePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PATH_EXPR__SINGLE_PATH, null, msgs);
      msgs = basicSetSinglePath(newSinglePath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.PATH_EXPR__SINGLE_PATH, newSinglePath, newSinglePath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativePathExpr getDoublePath()
  {
    return doublePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDoublePath(RelativePathExpr newDoublePath, NotificationChain msgs)
  {
    RelativePathExpr oldDoublePath = doublePath;
    doublePath = newDoublePath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.PATH_EXPR__DOUBLE_PATH, oldDoublePath, newDoublePath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoublePath(RelativePathExpr newDoublePath)
  {
    if (newDoublePath != doublePath)
    {
      NotificationChain msgs = null;
      if (doublePath != null)
        msgs = ((InternalEObject)doublePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PATH_EXPR__DOUBLE_PATH, null, msgs);
      if (newDoublePath != null)
        msgs = ((InternalEObject)newDoublePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PATH_EXPR__DOUBLE_PATH, null, msgs);
      msgs = basicSetDoublePath(newDoublePath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.PATH_EXPR__DOUBLE_PATH, newDoublePath, newDoublePath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativePathExpr getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPath(RelativePathExpr newPath, NotificationChain msgs)
  {
    RelativePathExpr oldPath = path;
    path = newPath;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.PATH_EXPR__PATH, oldPath, newPath);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(RelativePathExpr newPath)
  {
    if (newPath != path)
    {
      NotificationChain msgs = null;
      if (path != null)
        msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PATH_EXPR__PATH, null, msgs);
      if (newPath != null)
        msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PATH_EXPR__PATH, null, msgs);
      msgs = basicSetPath(newPath, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.PATH_EXPR__PATH, newPath, newPath));
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
      case XPathPackage.PATH_EXPR__SINGLE_PATH:
        return basicSetSinglePath(null, msgs);
      case XPathPackage.PATH_EXPR__DOUBLE_PATH:
        return basicSetDoublePath(null, msgs);
      case XPathPackage.PATH_EXPR__PATH:
        return basicSetPath(null, msgs);
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
      case XPathPackage.PATH_EXPR__SINGLE_PATH:
        return getSinglePath();
      case XPathPackage.PATH_EXPR__DOUBLE_PATH:
        return getDoublePath();
      case XPathPackage.PATH_EXPR__PATH:
        return getPath();
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
      case XPathPackage.PATH_EXPR__SINGLE_PATH:
        setSinglePath((RelativePathExpr)newValue);
        return;
      case XPathPackage.PATH_EXPR__DOUBLE_PATH:
        setDoublePath((RelativePathExpr)newValue);
        return;
      case XPathPackage.PATH_EXPR__PATH:
        setPath((RelativePathExpr)newValue);
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
      case XPathPackage.PATH_EXPR__SINGLE_PATH:
        setSinglePath((RelativePathExpr)null);
        return;
      case XPathPackage.PATH_EXPR__DOUBLE_PATH:
        setDoublePath((RelativePathExpr)null);
        return;
      case XPathPackage.PATH_EXPR__PATH:
        setPath((RelativePathExpr)null);
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
      case XPathPackage.PATH_EXPR__SINGLE_PATH:
        return singlePath != null;
      case XPathPackage.PATH_EXPR__DOUBLE_PATH:
        return doublePath != null;
      case XPathPackage.PATH_EXPR__PATH:
        return path != null;
    }
    return super.eIsSet(featureID);
  }

} //PathExprImpl
