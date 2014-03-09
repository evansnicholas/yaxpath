/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.ItemType;
import org.xtext.example.xpath.xPath.SequenceType;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.SequenceTypeImpl#getEmpty <em>Empty</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.SequenceTypeImpl#getItemType <em>Item Type</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.SequenceTypeImpl#getOccInd <em>Occ Ind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceTypeImpl extends MinimalEObjectImpl.Container implements SequenceType
{
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
   * The cached value of the '{@link #getItemType() <em>Item Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItemType()
   * @generated
   * @ordered
   */
  protected ItemType itemType;

  /**
   * The default value of the '{@link #getOccInd() <em>Occ Ind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccInd()
   * @generated
   * @ordered
   */
  protected static final String OCC_IND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOccInd() <em>Occ Ind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccInd()
   * @generated
   * @ordered
   */
  protected String occInd = OCC_IND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequenceTypeImpl()
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
    return XPathPackage.Literals.SEQUENCE_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.SEQUENCE_TYPE__EMPTY, oldEmpty, empty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemType getItemType()
  {
    return itemType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetItemType(ItemType newItemType, NotificationChain msgs)
  {
    ItemType oldItemType = itemType;
    itemType = newItemType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.SEQUENCE_TYPE__ITEM_TYPE, oldItemType, newItemType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItemType(ItemType newItemType)
  {
    if (newItemType != itemType)
    {
      NotificationChain msgs = null;
      if (itemType != null)
        msgs = ((InternalEObject)itemType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.SEQUENCE_TYPE__ITEM_TYPE, null, msgs);
      if (newItemType != null)
        msgs = ((InternalEObject)newItemType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.SEQUENCE_TYPE__ITEM_TYPE, null, msgs);
      msgs = basicSetItemType(newItemType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.SEQUENCE_TYPE__ITEM_TYPE, newItemType, newItemType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOccInd()
  {
    return occInd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOccInd(String newOccInd)
  {
    String oldOccInd = occInd;
    occInd = newOccInd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.SEQUENCE_TYPE__OCC_IND, oldOccInd, occInd));
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
      case XPathPackage.SEQUENCE_TYPE__ITEM_TYPE:
        return basicSetItemType(null, msgs);
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
      case XPathPackage.SEQUENCE_TYPE__EMPTY:
        return getEmpty();
      case XPathPackage.SEQUENCE_TYPE__ITEM_TYPE:
        return getItemType();
      case XPathPackage.SEQUENCE_TYPE__OCC_IND:
        return getOccInd();
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
      case XPathPackage.SEQUENCE_TYPE__EMPTY:
        setEmpty((String)newValue);
        return;
      case XPathPackage.SEQUENCE_TYPE__ITEM_TYPE:
        setItemType((ItemType)newValue);
        return;
      case XPathPackage.SEQUENCE_TYPE__OCC_IND:
        setOccInd((String)newValue);
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
      case XPathPackage.SEQUENCE_TYPE__EMPTY:
        setEmpty(EMPTY_EDEFAULT);
        return;
      case XPathPackage.SEQUENCE_TYPE__ITEM_TYPE:
        setItemType((ItemType)null);
        return;
      case XPathPackage.SEQUENCE_TYPE__OCC_IND:
        setOccInd(OCC_IND_EDEFAULT);
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
      case XPathPackage.SEQUENCE_TYPE__EMPTY:
        return EMPTY_EDEFAULT == null ? empty != null : !EMPTY_EDEFAULT.equals(empty);
      case XPathPackage.SEQUENCE_TYPE__ITEM_TYPE:
        return itemType != null;
      case XPathPackage.SEQUENCE_TYPE__OCC_IND:
        return OCC_IND_EDEFAULT == null ? occInd != null : !OCC_IND_EDEFAULT.equals(occInd);
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
    result.append(", occInd: ");
    result.append(occInd);
    result.append(')');
    return result.toString();
  }

} //SequenceTypeImpl
