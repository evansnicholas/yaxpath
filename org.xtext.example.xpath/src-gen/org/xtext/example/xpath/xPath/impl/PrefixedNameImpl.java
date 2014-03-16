/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.xpath.xPath.NCName;
import org.xtext.example.xpath.xPath.PrefixedName;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prefixed Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.PrefixedNameImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrefixedNameImpl extends QNameImpl implements PrefixedName
{
  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected NCName prefix;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrefixedNameImpl()
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
    return XPathPackage.Literals.PREFIXED_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NCName getPrefix()
  {
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrefix(NCName newPrefix, NotificationChain msgs)
  {
    NCName oldPrefix = prefix;
    prefix = newPrefix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.PREFIXED_NAME__PREFIX, oldPrefix, newPrefix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefix(NCName newPrefix)
  {
    if (newPrefix != prefix)
    {
      NotificationChain msgs = null;
      if (prefix != null)
        msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PREFIXED_NAME__PREFIX, null, msgs);
      if (newPrefix != null)
        msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.PREFIXED_NAME__PREFIX, null, msgs);
      msgs = basicSetPrefix(newPrefix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.PREFIXED_NAME__PREFIX, newPrefix, newPrefix));
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
      case XPathPackage.PREFIXED_NAME__PREFIX:
        return basicSetPrefix(null, msgs);
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
      case XPathPackage.PREFIXED_NAME__PREFIX:
        return getPrefix();
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
      case XPathPackage.PREFIXED_NAME__PREFIX:
        setPrefix((NCName)newValue);
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
      case XPathPackage.PREFIXED_NAME__PREFIX:
        setPrefix((NCName)null);
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
      case XPathPackage.PREFIXED_NAME__PREFIX:
        return prefix != null;
    }
    return super.eIsSet(featureID);
  }

} //PrefixedNameImpl
