/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link org.xtext.example.xpath.xPath.impl.FilterExprImpl#getPredicateList <em>Predicate List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterExprImpl extends StepExprImpl implements FilterExpr
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
   * The cached value of the '{@link #getPredicateList() <em>Predicate List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicateList()
   * @generated
   * @ordered
   */
  protected PredicateList predicateList;

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
  public PredicateList getPredicateList()
  {
    return predicateList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredicateList(PredicateList newPredicateList, NotificationChain msgs)
  {
    PredicateList oldPredicateList = predicateList;
    predicateList = newPredicateList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.FILTER_EXPR__PREDICATE_LIST, oldPredicateList, newPredicateList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredicateList(PredicateList newPredicateList)
  {
    if (newPredicateList != predicateList)
    {
      NotificationChain msgs = null;
      if (predicateList != null)
        msgs = ((InternalEObject)predicateList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.FILTER_EXPR__PREDICATE_LIST, null, msgs);
      if (newPredicateList != null)
        msgs = ((InternalEObject)newPredicateList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.FILTER_EXPR__PREDICATE_LIST, null, msgs);
      msgs = basicSetPredicateList(newPredicateList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.FILTER_EXPR__PREDICATE_LIST, newPredicateList, newPredicateList));
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
      case XPathPackage.FILTER_EXPR__PREDICATE_LIST:
        return basicSetPredicateList(null, msgs);
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
      case XPathPackage.FILTER_EXPR__PREDICATE_LIST:
        return getPredicateList();
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
      case XPathPackage.FILTER_EXPR__PREDICATE_LIST:
        setPredicateList((PredicateList)newValue);
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
      case XPathPackage.FILTER_EXPR__PREDICATE_LIST:
        setPredicateList((PredicateList)null);
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
      case XPathPackage.FILTER_EXPR__PREDICATE_LIST:
        return predicateList != null;
    }
    return super.eIsSet(featureID);
  }

} //FilterExprImpl
