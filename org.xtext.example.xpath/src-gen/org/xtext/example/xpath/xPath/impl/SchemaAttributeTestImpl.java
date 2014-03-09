/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.AttributeDeclaration;
import org.xtext.example.xpath.xPath.SchemaAttributeTest;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Attribute Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.SchemaAttributeTestImpl#getAttDec <em>Att Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaAttributeTestImpl extends MinimalEObjectImpl.Container implements SchemaAttributeTest
{
  /**
   * The cached value of the '{@link #getAttDec() <em>Att Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttDec()
   * @generated
   * @ordered
   */
  protected AttributeDeclaration attDec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemaAttributeTestImpl()
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
    return XPathPackage.Literals.SCHEMA_ATTRIBUTE_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeDeclaration getAttDec()
  {
    return attDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttDec(AttributeDeclaration newAttDec, NotificationChain msgs)
  {
    AttributeDeclaration oldAttDec = attDec;
    attDec = newAttDec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.SCHEMA_ATTRIBUTE_TEST__ATT_DEC, oldAttDec, newAttDec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttDec(AttributeDeclaration newAttDec)
  {
    if (newAttDec != attDec)
    {
      NotificationChain msgs = null;
      if (attDec != null)
        msgs = ((InternalEObject)attDec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.SCHEMA_ATTRIBUTE_TEST__ATT_DEC, null, msgs);
      if (newAttDec != null)
        msgs = ((InternalEObject)newAttDec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.SCHEMA_ATTRIBUTE_TEST__ATT_DEC, null, msgs);
      msgs = basicSetAttDec(newAttDec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.SCHEMA_ATTRIBUTE_TEST__ATT_DEC, newAttDec, newAttDec));
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
      case XPathPackage.SCHEMA_ATTRIBUTE_TEST__ATT_DEC:
        return basicSetAttDec(null, msgs);
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
      case XPathPackage.SCHEMA_ATTRIBUTE_TEST__ATT_DEC:
        return getAttDec();
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
      case XPathPackage.SCHEMA_ATTRIBUTE_TEST__ATT_DEC:
        setAttDec((AttributeDeclaration)newValue);
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
      case XPathPackage.SCHEMA_ATTRIBUTE_TEST__ATT_DEC:
        setAttDec((AttributeDeclaration)null);
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
      case XPathPackage.SCHEMA_ATTRIBUTE_TEST__ATT_DEC:
        return attDec != null;
    }
    return super.eIsSet(featureID);
  }

} //SchemaAttributeTestImpl
