/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.DocumentTest;
import org.xtext.example.xpath.xPath.ElementTest;
import org.xtext.example.xpath.xPath.SchemaElementTest;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.DocumentTestImpl#getElemTest <em>Elem Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.DocumentTestImpl#getSchemaElemTest <em>Schema Elem Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentTestImpl extends MinimalEObjectImpl.Container implements DocumentTest
{
  /**
   * The cached value of the '{@link #getElemTest() <em>Elem Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElemTest()
   * @generated
   * @ordered
   */
  protected ElementTest elemTest;

  /**
   * The cached value of the '{@link #getSchemaElemTest() <em>Schema Elem Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchemaElemTest()
   * @generated
   * @ordered
   */
  protected SchemaElementTest schemaElemTest;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentTestImpl()
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
    return XPathPackage.Literals.DOCUMENT_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementTest getElemTest()
  {
    return elemTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElemTest(ElementTest newElemTest, NotificationChain msgs)
  {
    ElementTest oldElemTest = elemTest;
    elemTest = newElemTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.DOCUMENT_TEST__ELEM_TEST, oldElemTest, newElemTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElemTest(ElementTest newElemTest)
  {
    if (newElemTest != elemTest)
    {
      NotificationChain msgs = null;
      if (elemTest != null)
        msgs = ((InternalEObject)elemTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.DOCUMENT_TEST__ELEM_TEST, null, msgs);
      if (newElemTest != null)
        msgs = ((InternalEObject)newElemTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.DOCUMENT_TEST__ELEM_TEST, null, msgs);
      msgs = basicSetElemTest(newElemTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.DOCUMENT_TEST__ELEM_TEST, newElemTest, newElemTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaElementTest getSchemaElemTest()
  {
    return schemaElemTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSchemaElemTest(SchemaElementTest newSchemaElemTest, NotificationChain msgs)
  {
    SchemaElementTest oldSchemaElemTest = schemaElemTest;
    schemaElemTest = newSchemaElemTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.DOCUMENT_TEST__SCHEMA_ELEM_TEST, oldSchemaElemTest, newSchemaElemTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchemaElemTest(SchemaElementTest newSchemaElemTest)
  {
    if (newSchemaElemTest != schemaElemTest)
    {
      NotificationChain msgs = null;
      if (schemaElemTest != null)
        msgs = ((InternalEObject)schemaElemTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.DOCUMENT_TEST__SCHEMA_ELEM_TEST, null, msgs);
      if (newSchemaElemTest != null)
        msgs = ((InternalEObject)newSchemaElemTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.DOCUMENT_TEST__SCHEMA_ELEM_TEST, null, msgs);
      msgs = basicSetSchemaElemTest(newSchemaElemTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.DOCUMENT_TEST__SCHEMA_ELEM_TEST, newSchemaElemTest, newSchemaElemTest));
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
      case XPathPackage.DOCUMENT_TEST__ELEM_TEST:
        return basicSetElemTest(null, msgs);
      case XPathPackage.DOCUMENT_TEST__SCHEMA_ELEM_TEST:
        return basicSetSchemaElemTest(null, msgs);
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
      case XPathPackage.DOCUMENT_TEST__ELEM_TEST:
        return getElemTest();
      case XPathPackage.DOCUMENT_TEST__SCHEMA_ELEM_TEST:
        return getSchemaElemTest();
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
      case XPathPackage.DOCUMENT_TEST__ELEM_TEST:
        setElemTest((ElementTest)newValue);
        return;
      case XPathPackage.DOCUMENT_TEST__SCHEMA_ELEM_TEST:
        setSchemaElemTest((SchemaElementTest)newValue);
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
      case XPathPackage.DOCUMENT_TEST__ELEM_TEST:
        setElemTest((ElementTest)null);
        return;
      case XPathPackage.DOCUMENT_TEST__SCHEMA_ELEM_TEST:
        setSchemaElemTest((SchemaElementTest)null);
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
      case XPathPackage.DOCUMENT_TEST__ELEM_TEST:
        return elemTest != null;
      case XPathPackage.DOCUMENT_TEST__SCHEMA_ELEM_TEST:
        return schemaElemTest != null;
    }
    return super.eIsSet(featureID);
  }

} //DocumentTestImpl
