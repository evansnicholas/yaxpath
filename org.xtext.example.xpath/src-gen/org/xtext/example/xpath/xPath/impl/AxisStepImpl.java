/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.AxisStep;
import org.xtext.example.xpath.xPath.PredicateList;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.AxisStepImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.AxisStepImpl#getPredicateList <em>Predicate List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AxisStepImpl extends MinimalEObjectImpl.Container implements AxisStep
{
  /**
   * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStep()
   * @generated
   * @ordered
   */
  protected EObject step;

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
  public EObject getStep()
  {
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStep(EObject newStep, NotificationChain msgs)
  {
    EObject oldStep = step;
    step = newStep;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.AXIS_STEP__STEP, oldStep, newStep);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStep(EObject newStep)
  {
    if (newStep != step)
    {
      NotificationChain msgs = null;
      if (step != null)
        msgs = ((InternalEObject)step).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.AXIS_STEP__STEP, null, msgs);
      if (newStep != null)
        msgs = ((InternalEObject)newStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.AXIS_STEP__STEP, null, msgs);
      msgs = basicSetStep(newStep, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.AXIS_STEP__STEP, newStep, newStep));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.AXIS_STEP__PREDICATE_LIST, oldPredicateList, newPredicateList);
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
        msgs = ((InternalEObject)predicateList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.AXIS_STEP__PREDICATE_LIST, null, msgs);
      if (newPredicateList != null)
        msgs = ((InternalEObject)newPredicateList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.AXIS_STEP__PREDICATE_LIST, null, msgs);
      msgs = basicSetPredicateList(newPredicateList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.AXIS_STEP__PREDICATE_LIST, newPredicateList, newPredicateList));
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
      case XPathPackage.AXIS_STEP__STEP:
        return basicSetStep(null, msgs);
      case XPathPackage.AXIS_STEP__PREDICATE_LIST:
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
      case XPathPackage.AXIS_STEP__STEP:
        return getStep();
      case XPathPackage.AXIS_STEP__PREDICATE_LIST:
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
      case XPathPackage.AXIS_STEP__STEP:
        setStep((EObject)newValue);
        return;
      case XPathPackage.AXIS_STEP__PREDICATE_LIST:
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
      case XPathPackage.AXIS_STEP__STEP:
        setStep((EObject)null);
        return;
      case XPathPackage.AXIS_STEP__PREDICATE_LIST:
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
      case XPathPackage.AXIS_STEP__STEP:
        return step != null;
      case XPathPackage.AXIS_STEP__PREDICATE_LIST:
        return predicateList != null;
    }
    return super.eIsSet(featureID);
  }

} //AxisStepImpl
