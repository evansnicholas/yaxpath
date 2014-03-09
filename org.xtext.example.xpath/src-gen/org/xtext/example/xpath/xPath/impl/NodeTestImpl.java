/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.KindTest;
import org.xtext.example.xpath.xPath.NameTest;
import org.xtext.example.xpath.xPath.NodeTest;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.NodeTestImpl#getKindTest <em>Kind Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.NodeTestImpl#getNodeTest <em>Node Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeTestImpl extends MinimalEObjectImpl.Container implements NodeTest
{
  /**
   * The cached value of the '{@link #getKindTest() <em>Kind Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKindTest()
   * @generated
   * @ordered
   */
  protected KindTest kindTest;

  /**
   * The cached value of the '{@link #getNodeTest() <em>Node Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeTest()
   * @generated
   * @ordered
   */
  protected NameTest nodeTest;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeTestImpl()
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
    return XPathPackage.Literals.NODE_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KindTest getKindTest()
  {
    return kindTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKindTest(KindTest newKindTest, NotificationChain msgs)
  {
    KindTest oldKindTest = kindTest;
    kindTest = newKindTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.NODE_TEST__KIND_TEST, oldKindTest, newKindTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKindTest(KindTest newKindTest)
  {
    if (newKindTest != kindTest)
    {
      NotificationChain msgs = null;
      if (kindTest != null)
        msgs = ((InternalEObject)kindTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.NODE_TEST__KIND_TEST, null, msgs);
      if (newKindTest != null)
        msgs = ((InternalEObject)newKindTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.NODE_TEST__KIND_TEST, null, msgs);
      msgs = basicSetKindTest(newKindTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.NODE_TEST__KIND_TEST, newKindTest, newKindTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameTest getNodeTest()
  {
    return nodeTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodeTest(NameTest newNodeTest, NotificationChain msgs)
  {
    NameTest oldNodeTest = nodeTest;
    nodeTest = newNodeTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.NODE_TEST__NODE_TEST, oldNodeTest, newNodeTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodeTest(NameTest newNodeTest)
  {
    if (newNodeTest != nodeTest)
    {
      NotificationChain msgs = null;
      if (nodeTest != null)
        msgs = ((InternalEObject)nodeTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.NODE_TEST__NODE_TEST, null, msgs);
      if (newNodeTest != null)
        msgs = ((InternalEObject)newNodeTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.NODE_TEST__NODE_TEST, null, msgs);
      msgs = basicSetNodeTest(newNodeTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.NODE_TEST__NODE_TEST, newNodeTest, newNodeTest));
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
      case XPathPackage.NODE_TEST__KIND_TEST:
        return basicSetKindTest(null, msgs);
      case XPathPackage.NODE_TEST__NODE_TEST:
        return basicSetNodeTest(null, msgs);
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
      case XPathPackage.NODE_TEST__KIND_TEST:
        return getKindTest();
      case XPathPackage.NODE_TEST__NODE_TEST:
        return getNodeTest();
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
      case XPathPackage.NODE_TEST__KIND_TEST:
        setKindTest((KindTest)newValue);
        return;
      case XPathPackage.NODE_TEST__NODE_TEST:
        setNodeTest((NameTest)newValue);
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
      case XPathPackage.NODE_TEST__KIND_TEST:
        setKindTest((KindTest)null);
        return;
      case XPathPackage.NODE_TEST__NODE_TEST:
        setNodeTest((NameTest)null);
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
      case XPathPackage.NODE_TEST__KIND_TEST:
        return kindTest != null;
      case XPathPackage.NODE_TEST__NODE_TEST:
        return nodeTest != null;
    }
    return super.eIsSet(featureID);
  }

} //NodeTestImpl
