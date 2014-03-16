/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.xpath.xPath.QName;
import org.xtext.example.xpath.xPath.VarName;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.VarNameImpl#getQName <em>QName</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarNameImpl extends VarRefImpl implements VarName
{
  /**
   * The cached value of the '{@link #getQName() <em>QName</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQName()
   * @generated
   * @ordered
   */
  protected QName qName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarNameImpl()
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
    return XPathPackage.Literals.VAR_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QName getQName()
  {
    return qName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQName(QName newQName, NotificationChain msgs)
  {
    QName oldQName = qName;
    qName = newQName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.VAR_NAME__QNAME, oldQName, newQName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQName(QName newQName)
  {
    if (newQName != qName)
    {
      NotificationChain msgs = null;
      if (qName != null)
        msgs = ((InternalEObject)qName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.VAR_NAME__QNAME, null, msgs);
      if (newQName != null)
        msgs = ((InternalEObject)newQName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.VAR_NAME__QNAME, null, msgs);
      msgs = basicSetQName(newQName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.VAR_NAME__QNAME, newQName, newQName));
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
      case XPathPackage.VAR_NAME__QNAME:
        return basicSetQName(null, msgs);
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
      case XPathPackage.VAR_NAME__QNAME:
        return getQName();
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
      case XPathPackage.VAR_NAME__QNAME:
        setQName((QName)newValue);
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
      case XPathPackage.VAR_NAME__QNAME:
        setQName((QName)null);
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
      case XPathPackage.VAR_NAME__QNAME:
        return qName != null;
    }
    return super.eIsSet(featureID);
  }

} //VarNameImpl
