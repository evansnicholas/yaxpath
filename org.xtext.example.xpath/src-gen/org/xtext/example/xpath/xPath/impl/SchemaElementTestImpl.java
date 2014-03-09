/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.ElementDeclaration;
import org.xtext.example.xpath.xPath.SchemaElementTest;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Element Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.SchemaElementTestImpl#getElemDec <em>Elem Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaElementTestImpl extends MinimalEObjectImpl.Container implements SchemaElementTest
{
  /**
   * The cached value of the '{@link #getElemDec() <em>Elem Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElemDec()
   * @generated
   * @ordered
   */
  protected ElementDeclaration elemDec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemaElementTestImpl()
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
    return XPathPackage.Literals.SCHEMA_ELEMENT_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementDeclaration getElemDec()
  {
    return elemDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElemDec(ElementDeclaration newElemDec, NotificationChain msgs)
  {
    ElementDeclaration oldElemDec = elemDec;
    elemDec = newElemDec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.SCHEMA_ELEMENT_TEST__ELEM_DEC, oldElemDec, newElemDec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElemDec(ElementDeclaration newElemDec)
  {
    if (newElemDec != elemDec)
    {
      NotificationChain msgs = null;
      if (elemDec != null)
        msgs = ((InternalEObject)elemDec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.SCHEMA_ELEMENT_TEST__ELEM_DEC, null, msgs);
      if (newElemDec != null)
        msgs = ((InternalEObject)newElemDec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.SCHEMA_ELEMENT_TEST__ELEM_DEC, null, msgs);
      msgs = basicSetElemDec(newElemDec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.SCHEMA_ELEMENT_TEST__ELEM_DEC, newElemDec, newElemDec));
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
      case XPathPackage.SCHEMA_ELEMENT_TEST__ELEM_DEC:
        return basicSetElemDec(null, msgs);
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
      case XPathPackage.SCHEMA_ELEMENT_TEST__ELEM_DEC:
        return getElemDec();
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
      case XPathPackage.SCHEMA_ELEMENT_TEST__ELEM_DEC:
        setElemDec((ElementDeclaration)newValue);
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
      case XPathPackage.SCHEMA_ELEMENT_TEST__ELEM_DEC:
        setElemDec((ElementDeclaration)null);
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
      case XPathPackage.SCHEMA_ELEMENT_TEST__ELEM_DEC:
        return elemDec != null;
    }
    return super.eIsSet(featureID);
  }

} //SchemaElementTestImpl
