/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.AxisStep;
import org.xtext.example.xpath.xPath.ForwardStep;
import org.xtext.example.xpath.xPath.PredicateList;
import org.xtext.example.xpath.xPath.ReverseStep;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.AxisStepImpl#getReverse <em>Reverse</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.AxisStepImpl#getForward <em>Forward</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.AxisStepImpl#getPredicate <em>Predicate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AxisStepImpl extends MinimalEObjectImpl.Container implements AxisStep
{
  /**
   * The cached value of the '{@link #getReverse() <em>Reverse</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReverse()
   * @generated
   * @ordered
   */
  protected ReverseStep reverse;

  /**
   * The cached value of the '{@link #getForward() <em>Forward</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForward()
   * @generated
   * @ordered
   */
  protected ForwardStep forward;

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
  protected AxisStepImpl()
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
    return XPathPackage.Literals.AXIS_STEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReverseStep getReverse()
  {
    return reverse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReverse(ReverseStep newReverse, NotificationChain msgs)
  {
    ReverseStep oldReverse = reverse;
    reverse = newReverse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.AXIS_STEP__REVERSE, oldReverse, newReverse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReverse(ReverseStep newReverse)
  {
    if (newReverse != reverse)
    {
      NotificationChain msgs = null;
      if (reverse != null)
        msgs = ((InternalEObject)reverse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.AXIS_STEP__REVERSE, null, msgs);
      if (newReverse != null)
        msgs = ((InternalEObject)newReverse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.AXIS_STEP__REVERSE, null, msgs);
      msgs = basicSetReverse(newReverse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.AXIS_STEP__REVERSE, newReverse, newReverse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForwardStep getForward()
  {
    return forward;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForward(ForwardStep newForward, NotificationChain msgs)
  {
    ForwardStep oldForward = forward;
    forward = newForward;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.AXIS_STEP__FORWARD, oldForward, newForward);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForward(ForwardStep newForward)
  {
    if (newForward != forward)
    {
      NotificationChain msgs = null;
      if (forward != null)
        msgs = ((InternalEObject)forward).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.AXIS_STEP__FORWARD, null, msgs);
      if (newForward != null)
        msgs = ((InternalEObject)newForward).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.AXIS_STEP__FORWARD, null, msgs);
      msgs = basicSetForward(newForward, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.AXIS_STEP__FORWARD, newForward, newForward));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.AXIS_STEP__PREDICATE, oldPredicate, newPredicate);
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
        msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.AXIS_STEP__PREDICATE, null, msgs);
      if (newPredicate != null)
        msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.AXIS_STEP__PREDICATE, null, msgs);
      msgs = basicSetPredicate(newPredicate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.AXIS_STEP__PREDICATE, newPredicate, newPredicate));
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
      case XPathPackage.AXIS_STEP__REVERSE:
        return basicSetReverse(null, msgs);
      case XPathPackage.AXIS_STEP__FORWARD:
        return basicSetForward(null, msgs);
      case XPathPackage.AXIS_STEP__PREDICATE:
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
      case XPathPackage.AXIS_STEP__REVERSE:
        return getReverse();
      case XPathPackage.AXIS_STEP__FORWARD:
        return getForward();
      case XPathPackage.AXIS_STEP__PREDICATE:
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
      case XPathPackage.AXIS_STEP__REVERSE:
        setReverse((ReverseStep)newValue);
        return;
      case XPathPackage.AXIS_STEP__FORWARD:
        setForward((ForwardStep)newValue);
        return;
      case XPathPackage.AXIS_STEP__PREDICATE:
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
      case XPathPackage.AXIS_STEP__REVERSE:
        setReverse((ReverseStep)null);
        return;
      case XPathPackage.AXIS_STEP__FORWARD:
        setForward((ForwardStep)null);
        return;
      case XPathPackage.AXIS_STEP__PREDICATE:
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
      case XPathPackage.AXIS_STEP__REVERSE:
        return reverse != null;
      case XPathPackage.AXIS_STEP__FORWARD:
        return forward != null;
      case XPathPackage.AXIS_STEP__PREDICATE:
        return predicate != null;
    }
    return super.eIsSet(featureID);
  }

} //AxisStepImpl
