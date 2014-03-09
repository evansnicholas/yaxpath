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
import org.xtext.example.xpath.xPath.AttributeTest;
import org.xtext.example.xpath.xPath.TypeName;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.AttributeTestImpl#getAttrOrWild <em>Attr Or Wild</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.AttributeTestImpl#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeTestImpl extends MinimalEObjectImpl.Container implements AttributeTest
{
  /**
   * The cached value of the '{@link #getAttrOrWild() <em>Attr Or Wild</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrOrWild()
   * @generated
   * @ordered
   */
  protected AttribNameOrWildcard attrOrWild;

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
  protected AttributeTestImpl()
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
    return XPathPackage.Literals.ATTRIBUTE_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttribNameOrWildcard getAttrOrWild()
  {
    return attrOrWild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttrOrWild(AttribNameOrWildcard newAttrOrWild, NotificationChain msgs)
  {
    AttribNameOrWildcard oldAttrOrWild = attrOrWild;
    attrOrWild = newAttrOrWild;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.ATTRIBUTE_TEST__ATTR_OR_WILD, oldAttrOrWild, newAttrOrWild);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttrOrWild(AttribNameOrWildcard newAttrOrWild)
  {
    if (newAttrOrWild != attrOrWild)
    {
      NotificationChain msgs = null;
      if (attrOrWild != null)
        msgs = ((InternalEObject)attrOrWild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ATTRIBUTE_TEST__ATTR_OR_WILD, null, msgs);
      if (newAttrOrWild != null)
        msgs = ((InternalEObject)newAttrOrWild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ATTRIBUTE_TEST__ATTR_OR_WILD, null, msgs);
      msgs = basicSetAttrOrWild(newAttrOrWild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.ATTRIBUTE_TEST__ATTR_OR_WILD, newAttrOrWild, newAttrOrWild));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.ATTRIBUTE_TEST__TYPE_NAME, oldTypeName, newTypeName);
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
        msgs = ((InternalEObject)typeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ATTRIBUTE_TEST__TYPE_NAME, null, msgs);
      if (newTypeName != null)
        msgs = ((InternalEObject)newTypeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ATTRIBUTE_TEST__TYPE_NAME, null, msgs);
      msgs = basicSetTypeName(newTypeName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.ATTRIBUTE_TEST__TYPE_NAME, newTypeName, newTypeName));
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
      case XPathPackage.ATTRIBUTE_TEST__ATTR_OR_WILD:
        return basicSetAttrOrWild(null, msgs);
      case XPathPackage.ATTRIBUTE_TEST__TYPE_NAME:
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
      case XPathPackage.ATTRIBUTE_TEST__ATTR_OR_WILD:
        return getAttrOrWild();
      case XPathPackage.ATTRIBUTE_TEST__TYPE_NAME:
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
      case XPathPackage.ATTRIBUTE_TEST__ATTR_OR_WILD:
        setAttrOrWild((AttribNameOrWildcard)newValue);
        return;
      case XPathPackage.ATTRIBUTE_TEST__TYPE_NAME:
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
      case XPathPackage.ATTRIBUTE_TEST__ATTR_OR_WILD:
        setAttrOrWild((AttribNameOrWildcard)null);
        return;
      case XPathPackage.ATTRIBUTE_TEST__TYPE_NAME:
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
      case XPathPackage.ATTRIBUTE_TEST__ATTR_OR_WILD:
        return attrOrWild != null;
      case XPathPackage.ATTRIBUTE_TEST__TYPE_NAME:
        return typeName != null;
    }
    return super.eIsSet(featureID);
  }

} //AttributeTestImpl
