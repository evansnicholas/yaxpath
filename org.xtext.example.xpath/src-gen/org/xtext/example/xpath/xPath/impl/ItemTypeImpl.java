/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.AtomicType;
import org.xtext.example.xpath.xPath.ItemType;
import org.xtext.example.xpath.xPath.KindTest;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ItemTypeImpl#getKindTest <em>Kind Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ItemTypeImpl#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ItemTypeImpl#getAtomicType <em>Atomic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemTypeImpl extends MinimalEObjectImpl.Container implements ItemType
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
   * The default value of the '{@link #getEmpty() <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmpty()
   * @generated
   * @ordered
   */
  protected static final String EMPTY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmpty() <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmpty()
   * @generated
   * @ordered
   */
  protected String empty = EMPTY_EDEFAULT;

  /**
   * The cached value of the '{@link #getAtomicType() <em>Atomic Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtomicType()
   * @generated
   * @ordered
   */
  protected AtomicType atomicType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemTypeImpl()
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
    return XPathPackage.Literals.ITEM_TYPE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.ITEM_TYPE__KIND_TEST, oldKindTest, newKindTest);
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
        msgs = ((InternalEObject)kindTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ITEM_TYPE__KIND_TEST, null, msgs);
      if (newKindTest != null)
        msgs = ((InternalEObject)newKindTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ITEM_TYPE__KIND_TEST, null, msgs);
      msgs = basicSetKindTest(newKindTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.ITEM_TYPE__KIND_TEST, newKindTest, newKindTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEmpty()
  {
    return empty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmpty(String newEmpty)
  {
    String oldEmpty = empty;
    empty = newEmpty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.ITEM_TYPE__EMPTY, oldEmpty, empty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicType getAtomicType()
  {
    return atomicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtomicType(AtomicType newAtomicType, NotificationChain msgs)
  {
    AtomicType oldAtomicType = atomicType;
    atomicType = newAtomicType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.ITEM_TYPE__ATOMIC_TYPE, oldAtomicType, newAtomicType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtomicType(AtomicType newAtomicType)
  {
    if (newAtomicType != atomicType)
    {
      NotificationChain msgs = null;
      if (atomicType != null)
        msgs = ((InternalEObject)atomicType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ITEM_TYPE__ATOMIC_TYPE, null, msgs);
      if (newAtomicType != null)
        msgs = ((InternalEObject)newAtomicType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.ITEM_TYPE__ATOMIC_TYPE, null, msgs);
      msgs = basicSetAtomicType(newAtomicType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.ITEM_TYPE__ATOMIC_TYPE, newAtomicType, newAtomicType));
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
      case XPathPackage.ITEM_TYPE__KIND_TEST:
        return basicSetKindTest(null, msgs);
      case XPathPackage.ITEM_TYPE__ATOMIC_TYPE:
        return basicSetAtomicType(null, msgs);
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
      case XPathPackage.ITEM_TYPE__KIND_TEST:
        return getKindTest();
      case XPathPackage.ITEM_TYPE__EMPTY:
        return getEmpty();
      case XPathPackage.ITEM_TYPE__ATOMIC_TYPE:
        return getAtomicType();
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
      case XPathPackage.ITEM_TYPE__KIND_TEST:
        setKindTest((KindTest)newValue);
        return;
      case XPathPackage.ITEM_TYPE__EMPTY:
        setEmpty((String)newValue);
        return;
      case XPathPackage.ITEM_TYPE__ATOMIC_TYPE:
        setAtomicType((AtomicType)newValue);
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
      case XPathPackage.ITEM_TYPE__KIND_TEST:
        setKindTest((KindTest)null);
        return;
      case XPathPackage.ITEM_TYPE__EMPTY:
        setEmpty(EMPTY_EDEFAULT);
        return;
      case XPathPackage.ITEM_TYPE__ATOMIC_TYPE:
        setAtomicType((AtomicType)null);
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
      case XPathPackage.ITEM_TYPE__KIND_TEST:
        return kindTest != null;
      case XPathPackage.ITEM_TYPE__EMPTY:
        return EMPTY_EDEFAULT == null ? empty != null : !EMPTY_EDEFAULT.equals(empty);
      case XPathPackage.ITEM_TYPE__ATOMIC_TYPE:
        return atomicType != null;
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
    result.append(" (empty: ");
    result.append(empty);
    result.append(')');
    return result.toString();
  }

} //ItemTypeImpl
