/**
 */
package org.xtext.example.xpath.xPath.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.xpath.xPath.RelativePathExpr;
import org.xtext.example.xpath.xPath.StepExpr;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Path Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.RelativePathExprImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.RelativePathExprImpl#getExtraSteps <em>Extra Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelativePathExprImpl extends PathExprImpl implements RelativePathExpr
{
  /**
   * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStep()
   * @generated
   * @ordered
   */
  protected StepExpr step;

  /**
   * The cached value of the '{@link #getExtraSteps() <em>Extra Steps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtraSteps()
   * @generated
   * @ordered
   */
  protected EList<StepExpr> extraSteps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelativePathExprImpl()
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
    return XPathPackage.Literals.RELATIVE_PATH_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StepExpr getStep()
  {
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStep(StepExpr newStep, NotificationChain msgs)
  {
    StepExpr oldStep = step;
    step = newStep;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.RELATIVE_PATH_EXPR__STEP, oldStep, newStep);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStep(StepExpr newStep)
  {
    if (newStep != step)
    {
      NotificationChain msgs = null;
      if (step != null)
        msgs = ((InternalEObject)step).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.RELATIVE_PATH_EXPR__STEP, null, msgs);
      if (newStep != null)
        msgs = ((InternalEObject)newStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.RELATIVE_PATH_EXPR__STEP, null, msgs);
      msgs = basicSetStep(newStep, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.RELATIVE_PATH_EXPR__STEP, newStep, newStep));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StepExpr> getExtraSteps()
  {
    if (extraSteps == null)
    {
      extraSteps = new EObjectContainmentEList<StepExpr>(StepExpr.class, this, XPathPackage.RELATIVE_PATH_EXPR__EXTRA_STEPS);
    }
    return extraSteps;
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
      case XPathPackage.RELATIVE_PATH_EXPR__STEP:
        return basicSetStep(null, msgs);
      case XPathPackage.RELATIVE_PATH_EXPR__EXTRA_STEPS:
        return ((InternalEList<?>)getExtraSteps()).basicRemove(otherEnd, msgs);
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
      case XPathPackage.RELATIVE_PATH_EXPR__STEP:
        return getStep();
      case XPathPackage.RELATIVE_PATH_EXPR__EXTRA_STEPS:
        return getExtraSteps();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XPathPackage.RELATIVE_PATH_EXPR__STEP:
        setStep((StepExpr)newValue);
        return;
      case XPathPackage.RELATIVE_PATH_EXPR__EXTRA_STEPS:
        getExtraSteps().clear();
        getExtraSteps().addAll((Collection<? extends StepExpr>)newValue);
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
      case XPathPackage.RELATIVE_PATH_EXPR__STEP:
        setStep((StepExpr)null);
        return;
      case XPathPackage.RELATIVE_PATH_EXPR__EXTRA_STEPS:
        getExtraSteps().clear();
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
      case XPathPackage.RELATIVE_PATH_EXPR__STEP:
        return step != null;
      case XPathPackage.RELATIVE_PATH_EXPR__EXTRA_STEPS:
        return extraSteps != null && !extraSteps.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RelativePathExprImpl
