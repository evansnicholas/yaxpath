/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.ElementNameOrWildcard;
import org.xtext.example.xpath.xPath.ElementTest;
import org.xtext.example.xpath.xPath.TypeName;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ElementTestImpl#getElemOrWild <em>Elem Or Wild</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ElementTestImpl#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementTestImpl extends MinimalEObjectImpl.Container implements ElementTest
{
  /**
   * The cached value of the '{@link #getElemOrWild() <em>Elem Or Wild</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElemOrWild()
   * @generated
   * @ordered
   */
  protected ElementNameOrWildcard elemOrWild;

  /**
   * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected TypeName typeName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementTestImpl()
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
    return XPathPackage.Literals.ELEMENT_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementNameOrWildcard getElemOrWild()
  {
    return elemOrWild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElemOrWild(ElementNameOrWildcard newElemOrWild, NotificationChain msgs)
  {
    ElementNameOrWildcard oldElemOrWild = elemOrWild;
    elemOrWild = newElemOrWild;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.ELEMENT_TEST__ELEM_OR_WILD, oldElemOrWild, newElemOrWild);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElemOrWild(ElementNameOrWildcard newElemOrWild)
  {
    if (newElemOrWild != elemOrWild)
    {
      NotificationChain msgs = null;
      if (elemOrWild != null)
        msgs = ((InternalEObject)elemOrWild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ELEMENT_TEST__ELEM_OR_WILD, null, msgs);
      if (newElemOrWild != null)
        msgs = ((InternalEObject)newElemOrWild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ELEMENT_TEST__ELEM_OR_WILD, null, msgs);
      msgs = basicSetElemOrWild(newElemOrWild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.ELEMENT_TEST__ELEM_OR_WILD, newElemOrWild, newElemOrWild));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeName getTypeName()
  {
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeName(TypeName newTypeName, NotificationChain msgs)
  {
    TypeName oldTypeName = typeName;
    typeName = newTypeName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.ELEMENT_TEST__TYPE_NAME, oldTypeName, newTypeName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeName(TypeName newTypeName)
  {
    if (newTypeName != typeName)
    {
      NotificationChain msgs = null;
      if (typeName != null)
        msgs = ((InternalEObject)typeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ELEMENT_TEST__TYPE_NAME, null, msgs);
      if (newTypeName != null)
        msgs = ((InternalEObject)newTypeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ELEMENT_TEST__TYPE_NAME, null, msgs);
      msgs = basicSetTypeName(newTypeName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.ELEMENT_TEST__TYPE_NAME, newTypeName, newTypeName));
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
      case XPathPackage.ELEMENT_TEST__ELEM_OR_WILD:
        return basicSetElemOrWild(null, msgs);
      case XPathPackage.ELEMENT_TEST__TYPE_NAME:
        return basicSetTypeName(null, msgs);
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
      case XPathPackage.ELEMENT_TEST__ELEM_OR_WILD:
        return getElemOrWild();
      case XPathPackage.ELEMENT_TEST__TYPE_NAME:
        return getTypeName();
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
      case XPathPackage.ELEMENT_TEST__ELEM_OR_WILD:
        setElemOrWild((ElementNameOrWildcard)newValue);
        return;
      case XPathPackage.ELEMENT_TEST__TYPE_NAME:
        setTypeName((TypeName)newValue);
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
      case XPathPackage.ELEMENT_TEST__ELEM_OR_WILD:
        setElemOrWild((ElementNameOrWildcard)null);
        return;
      case XPathPackage.ELEMENT_TEST__TYPE_NAME:
        setTypeName((TypeName)null);
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
      case XPathPackage.ELEMENT_TEST__ELEM_OR_WILD:
        return elemOrWild != null;
      case XPathPackage.ELEMENT_TEST__TYPE_NAME:
        return typeName != null;
    }
    return super.eIsSet(featureID);
  }

} //ElementTestImpl
