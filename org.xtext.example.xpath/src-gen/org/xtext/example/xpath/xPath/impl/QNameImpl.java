/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.NCName;
import org.xtext.example.xpath.xPath.QName;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QName</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.QNameImpl#getLocalPart <em>Local Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QNameImpl extends MinimalEObjectImpl.Container implements QName
{
  /**
   * The cached value of the '{@link #getLocalPart() <em>Local Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocalPart()
   * @generated
   * @ordered
   */
  protected NCName localPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QNameImpl()
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
    return XPathPackage.Literals.QNAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NCName getLocalPart()
  {
    return localPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLocalPart(NCName newLocalPart, NotificationChain msgs)
  {
    NCName oldLocalPart = localPart;
    localPart = newLocalPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.QNAME__LOCAL_PART, oldLocalPart, newLocalPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocalPart(NCName newLocalPart)
  {
    if (newLocalPart != localPart)
    {
      NotificationChain msgs = null;
      if (localPart != null)
        msgs = ((InternalEObject)localPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.QNAME__LOCAL_PART, null, msgs);
      if (newLocalPart != null)
        msgs = ((InternalEObject)newLocalPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.QNAME__LOCAL_PART, null, msgs);
      msgs = basicSetLocalPart(newLocalPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.QNAME__LOCAL_PART, newLocalPart, newLocalPart));
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
      case XPathPackage.QNAME__LOCAL_PART:
        return basicSetLocalPart(null, msgs);
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
      case XPathPackage.QNAME__LOCAL_PART:
        return getLocalPart();
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
      case XPathPackage.QNAME__LOCAL_PART:
        setLocalPart((NCName)newValue);
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
      case XPathPackage.QNAME__LOCAL_PART:
        setLocalPart((NCName)null);
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
      case XPathPackage.QNAME__LOCAL_PART:
        return localPart != null;
    }
    return super.eIsSet(featureID);
  }

} //QNameImpl
