/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.ElementName;
import org.xtext.example.xpath.xPath.ElementNameOrWildcard;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Name Or Wildcard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ElementNameOrWildcardImpl#getElemName <em>Elem Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementNameOrWildcardImpl extends MinimalEObjectImpl.Container implements ElementNameOrWildcard
{
  /**
   * The cached value of the '{@link #getElemName() <em>Elem Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElemName()
   * @generated
   * @ordered
   */
  protected ElementName elemName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementNameOrWildcardImpl()
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
    return XPathPackage.Literals.ELEMENT_NAME_OR_WILDCARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementName getElemName()
  {
    return elemName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElemName(ElementName newElemName, NotificationChain msgs)
  {
    ElementName oldElemName = elemName;
    elemName = newElemName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.ELEMENT_NAME_OR_WILDCARD__ELEM_NAME, oldElemName, newElemName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElemName(ElementName newElemName)
  {
    if (newElemName != elemName)
    {
      NotificationChain msgs = null;
      if (elemName != null)
        msgs = ((InternalEObject)elemName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ELEMENT_NAME_OR_WILDCARD__ELEM_NAME, null, msgs);
      if (newElemName != null)
        msgs = ((InternalEObject)newElemName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ELEMENT_NAME_OR_WILDCARD__ELEM_NAME, null, msgs);
      msgs = basicSetElemName(newElemName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.ELEMENT_NAME_OR_WILDCARD__ELEM_NAME, newElemName, newElemName));
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
      case XPathPackage.ELEMENT_NAME_OR_WILDCARD__ELEM_NAME:
        return basicSetElemName(null, msgs);
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
      case XPathPackage.ELEMENT_NAME_OR_WILDCARD__ELEM_NAME:
        return getElemName();
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
      case XPathPackage.ELEMENT_NAME_OR_WILDCARD__ELEM_NAME:
        setElemName((ElementName)newValue);
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
      case XPathPackage.ELEMENT_NAME_OR_WILDCARD__ELEM_NAME:
        setElemName((ElementName)null);
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
      case XPathPackage.ELEMENT_NAME_OR_WILDCARD__ELEM_NAME:
        return elemName != null;
    }
    return super.eIsSet(featureID);
  }

} //ElementNameOrWildcardImpl
