/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.NameTest;
import org.xtext.example.xpath.xPath.Wildcard;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.NameTestImpl#getQName <em>QName</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.NameTestImpl#getWildcard <em>Wildcard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameTestImpl extends MinimalEObjectImpl.Container implements NameTest
{
  /**
   * The default value of the '{@link #getQName() <em>QName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQName()
   * @generated
   * @ordered
   */
  protected static final String QNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQName() <em>QName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQName()
   * @generated
   * @ordered
   */
  protected String qName = QNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getWildcard() <em>Wildcard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWildcard()
   * @generated
   * @ordered
   */
  protected Wildcard wildcard;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NameTestImpl()
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
    return XPathPackage.Literals.NAME_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQName()
  {
    return qName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQName(String newQName)
  {
    String oldQName = qName;
    qName = newQName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.NAME_TEST__QNAME, oldQName, qName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Wildcard getWildcard()
  {
    return wildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWildcard(Wildcard newWildcard, NotificationChain msgs)
  {
    Wildcard oldWildcard = wildcard;
    wildcard = newWildcard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.NAME_TEST__WILDCARD, oldWildcard, newWildcard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWildcard(Wildcard newWildcard)
  {
    if (newWildcard != wildcard)
    {
      NotificationChain msgs = null;
      if (wildcard != null)
        msgs = ((InternalEObject)wildcard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.NAME_TEST__WILDCARD, null, msgs);
      if (newWildcard != null)
        msgs = ((InternalEObject)newWildcard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.NAME_TEST__WILDCARD, null, msgs);
      msgs = basicSetWildcard(newWildcard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.NAME_TEST__WILDCARD, newWildcard, newWildcard));
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
      case XPathPackage.NAME_TEST__WILDCARD:
        return basicSetWildcard(null, msgs);
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
      case XPathPackage.NAME_TEST__QNAME:
        return getQName();
      case XPathPackage.NAME_TEST__WILDCARD:
        return getWildcard();
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
      case XPathPackage.NAME_TEST__QNAME:
        setQName((String)newValue);
        return;
      case XPathPackage.NAME_TEST__WILDCARD:
        setWildcard((Wildcard)newValue);
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
      case XPathPackage.NAME_TEST__QNAME:
        setQName(QNAME_EDEFAULT);
        return;
      case XPathPackage.NAME_TEST__WILDCARD:
        setWildcard((Wildcard)null);
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
      case XPathPackage.NAME_TEST__QNAME:
        return QNAME_EDEFAULT == null ? qName != null : !QNAME_EDEFAULT.equals(qName);
      case XPathPackage.NAME_TEST__WILDCARD:
        return wildcard != null;
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
    result.append(" (qName: ");
    result.append(qName);
    result.append(')');
    return result.toString();
  }

} //NameTestImpl
