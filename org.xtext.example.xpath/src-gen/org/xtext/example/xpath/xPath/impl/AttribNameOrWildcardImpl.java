/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.AttribNameOrWildcard;
import org.xtext.example.xpath.xPath.AttributeName;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attrib Name Or Wildcard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.AttribNameOrWildcardImpl#getAttName <em>Att Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttribNameOrWildcardImpl extends MinimalEObjectImpl.Container implements AttribNameOrWildcard
{
  /**
   * The cached value of the '{@link #getAttName() <em>Att Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttName()
   * @generated
   * @ordered
   */
  protected AttributeName attName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttribNameOrWildcardImpl()
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
    return XPathPackage.Literals.ATTRIB_NAME_OR_WILDCARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeName getAttName()
  {
    return attName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttName(AttributeName newAttName, NotificationChain msgs)
  {
    AttributeName oldAttName = attName;
    attName = newAttName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.ATTRIB_NAME_OR_WILDCARD__ATT_NAME, oldAttName, newAttName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttName(AttributeName newAttName)
  {
    if (newAttName != attName)
    {
      NotificationChain msgs = null;
      if (attName != null)
        msgs = ((InternalEObject)attName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ATTRIB_NAME_OR_WILDCARD__ATT_NAME, null, msgs);
      if (newAttName != null)
        msgs = ((InternalEObject)newAttName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ATTRIB_NAME_OR_WILDCARD__ATT_NAME, null, msgs);
      msgs = basicSetAttName(newAttName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.ATTRIB_NAME_OR_WILDCARD__ATT_NAME, newAttName, newAttName));
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
      case XPathPackage.ATTRIB_NAME_OR_WILDCARD__ATT_NAME:
        return basicSetAttName(null, msgs);
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
      case XPathPackage.ATTRIB_NAME_OR_WILDCARD__ATT_NAME:
        return getAttName();
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
      case XPathPackage.ATTRIB_NAME_OR_WILDCARD__ATT_NAME:
        setAttName((AttributeName)newValue);
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
      case XPathPackage.ATTRIB_NAME_OR_WILDCARD__ATT_NAME:
        setAttName((AttributeName)null);
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
      case XPathPackage.ATTRIB_NAME_OR_WILDCARD__ATT_NAME:
        return attName != null;
    }
    return super.eIsSet(featureID);
  }

} //AttribNameOrWildcardImpl
