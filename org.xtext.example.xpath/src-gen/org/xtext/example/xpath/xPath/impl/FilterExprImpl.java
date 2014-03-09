/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.FilterExpr;
import org.xtext.example.xpath.xPath.PredicateList;
import org.xtext.example.xpath.xPath.PrimaryExpr;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.FilterExprImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.FilterExprImpl#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterExprImpl extends MinimalEObjectImpl.Container implements FilterExpr
{
  /**
   * The cached value of the '{@link #getPrimary() <em>Primary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimary()
   * @generated
   * @ordered
   */
  protected PrimaryExpr primary;

  /**
   * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected PredicateList predicate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilterExprImpl()
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
    return XPathPackage.Literals.FILTER_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpr getPrimary()
  {
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimary(PrimaryExpr newPrimary, NotificationChain msgs)
  {
    PrimaryExpr oldPrimary = primary;
    primary = newPrimary;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.FILTER_EXPR__PRIMARY, oldPrimary, newPrimary);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimary(PrimaryExpr newPrimary)
  {
    if (newPrimary != primary)
    {
      NotificationChain msgs = null;
      if (primary != null)
        msgs = ((InternalEObject)primary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.FILTER_EXPR__PRIMARY, null, msgs);
      if (newPrimary != null)
        msgs = ((InternalEObject)newPrimary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.FILTER_EXPR__PRIMARY, null, msgs);
      msgs = basicSetPrimary(newPrimary, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.FILTER_EXPR__PRIMARY, newPrimary, newPrimary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateList getPredicate()
  {
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredicate(PredicateList newPredicate, NotificationChain msgs)
  {
    PredicateList oldPredicate = predicate;
    predicate = newPredicate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.FILTER_EXPR__PREDICATE, oldPredicate, newPredicate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredicate(PredicateList newPredicate)
  {
    if (newPredicate != predicate)
    {
      NotificationChain msgs = null;
      if (predicate != null)
        msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.FILTER_EXPR__PREDICATE, null, msgs);
      if (newPredicate != null)
        msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.FILTER_EXPR__PREDICATE, null, msgs);
      msgs = basicSetPredicate(newPredicate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.FILTER_EXPR__PREDICATE, newPredicate, newPredicate));
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
      case XPathPackage.FILTER_EXPR__PRIMARY:
        return basicSetPrimary(null, msgs);
      case XPathPackage.FILTER_EXPR__PREDICATE:
        return basicSetPredicate(null, msgs);
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
      case XPathPackage.FILTER_EXPR__PRIMARY:
        return getPrimary();
      case XPathPackage.FILTER_EXPR__PREDICATE:
        return getPredicate();
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
      case XPathPackage.FILTER_EXPR__PRIMARY:
        setPrimary((PrimaryExpr)newValue);
        return;
      case XPathPackage.FILTER_EXPR__PREDICATE:
        setPredicate((PredicateList)newValue);
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
      case XPathPackage.FILTER_EXPR__PRIMARY:
        setPrimary((PrimaryExpr)null);
        return;
      case XPathPackage.FILTER_EXPR__PREDICATE:
        setPredicate((PredicateList)null);
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
      case XPathPackage.FILTER_EXPR__PRIMARY:
        return primary != null;
      case XPathPackage.FILTER_EXPR__PREDICATE:
        return predicate != null;
    }
    return super.eIsSet(featureID);
  }

} //FilterExprImpl
