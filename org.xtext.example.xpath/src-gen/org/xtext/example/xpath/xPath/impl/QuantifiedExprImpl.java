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

import org.xtext.example.xpath.xPath.AdditionalIn;
import org.xtext.example.xpath.xPath.ExprSingle;
import org.xtext.example.xpath.xPath.QuantifiedExpr;
import org.xtext.example.xpath.xPath.VarName;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantified Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.QuantifiedExprImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.QuantifiedExprImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.QuantifiedExprImpl#getAdditionalIn <em>Additional In</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.QuantifiedExprImpl#getSatisfy <em>Satisfy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantifiedExprImpl extends ExprSingleImpl implements QuantifiedExpr
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected VarName variable;

  /**
   * The cached value of the '{@link #getIn() <em>In</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn()
   * @generated
   * @ordered
   */
  protected ExprSingle in;

  /**
   * The cached value of the '{@link #getAdditionalIn() <em>Additional In</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdditionalIn()
   * @generated
   * @ordered
   */
  protected EList<AdditionalIn> additionalIn;

  /**
   * The cached value of the '{@link #getSatisfy() <em>Satisfy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSatisfy()
   * @generated
   * @ordered
   */
  protected ExprSingle satisfy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuantifiedExprImpl()
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
    return XPathPackage.Literals.QUANTIFIED_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarName getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(VarName newVariable, NotificationChain msgs)
  {
    VarName oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.QUANTIFIED_EXPR__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(VarName newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.QUANTIFIED_EXPR__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.QUANTIFIED_EXPR__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.QUANTIFIED_EXPR__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSingle getIn()
  {
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIn(ExprSingle newIn, NotificationChain msgs)
  {
    ExprSingle oldIn = in;
    in = newIn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.QUANTIFIED_EXPR__IN, oldIn, newIn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIn(ExprSingle newIn)
  {
    if (newIn != in)
    {
      NotificationChain msgs = null;
      if (in != null)
        msgs = ((InternalEObject)in).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.QUANTIFIED_EXPR__IN, null, msgs);
      if (newIn != null)
        msgs = ((InternalEObject)newIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.QUANTIFIED_EXPR__IN, null, msgs);
      msgs = basicSetIn(newIn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.QUANTIFIED_EXPR__IN, newIn, newIn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AdditionalIn> getAdditionalIn()
  {
    if (additionalIn == null)
    {
      additionalIn = new EObjectContainmentEList<AdditionalIn>(AdditionalIn.class, this, XPathPackage.QUANTIFIED_EXPR__ADDITIONAL_IN);
    }
    return additionalIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSingle getSatisfy()
  {
    return satisfy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSatisfy(ExprSingle newSatisfy, NotificationChain msgs)
  {
    ExprSingle oldSatisfy = satisfy;
    satisfy = newSatisfy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.QUANTIFIED_EXPR__SATISFY, oldSatisfy, newSatisfy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSatisfy(ExprSingle newSatisfy)
  {
    if (newSatisfy != satisfy)
    {
      NotificationChain msgs = null;
      if (satisfy != null)
        msgs = ((InternalEObject)satisfy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.QUANTIFIED_EXPR__SATISFY, null, msgs);
      if (newSatisfy != null)
        msgs = ((InternalEObject)newSatisfy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.QUANTIFIED_EXPR__SATISFY, null, msgs);
      msgs = basicSetSatisfy(newSatisfy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.QUANTIFIED_EXPR__SATISFY, newSatisfy, newSatisfy));
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
      case XPathPackage.QUANTIFIED_EXPR__VARIABLE:
        return basicSetVariable(null, msgs);
      case XPathPackage.QUANTIFIED_EXPR__IN:
        return basicSetIn(null, msgs);
      case XPathPackage.QUANTIFIED_EXPR__ADDITIONAL_IN:
        return ((InternalEList<?>)getAdditionalIn()).basicRemove(otherEnd, msgs);
      case XPathPackage.QUANTIFIED_EXPR__SATISFY:
        return basicSetSatisfy(null, msgs);
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
      case XPathPackage.QUANTIFIED_EXPR__VARIABLE:
        return getVariable();
      case XPathPackage.QUANTIFIED_EXPR__IN:
        return getIn();
      case XPathPackage.QUANTIFIED_EXPR__ADDITIONAL_IN:
        return getAdditionalIn();
      case XPathPackage.QUANTIFIED_EXPR__SATISFY:
        return getSatisfy();
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
      case XPathPackage.QUANTIFIED_EXPR__VARIABLE:
        setVariable((VarName)newValue);
        return;
      case XPathPackage.QUANTIFIED_EXPR__IN:
        setIn((ExprSingle)newValue);
        return;
      case XPathPackage.QUANTIFIED_EXPR__ADDITIONAL_IN:
        getAdditionalIn().clear();
        getAdditionalIn().addAll((Collection<? extends AdditionalIn>)newValue);
        return;
      case XPathPackage.QUANTIFIED_EXPR__SATISFY:
        setSatisfy((ExprSingle)newValue);
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
      case XPathPackage.QUANTIFIED_EXPR__VARIABLE:
        setVariable((VarName)null);
        return;
      case XPathPackage.QUANTIFIED_EXPR__IN:
        setIn((ExprSingle)null);
        return;
      case XPathPackage.QUANTIFIED_EXPR__ADDITIONAL_IN:
        getAdditionalIn().clear();
        return;
      case XPathPackage.QUANTIFIED_EXPR__SATISFY:
        setSatisfy((ExprSingle)null);
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
      case XPathPackage.QUANTIFIED_EXPR__VARIABLE:
        return variable != null;
      case XPathPackage.QUANTIFIED_EXPR__IN:
        return in != null;
      case XPathPackage.QUANTIFIED_EXPR__ADDITIONAL_IN:
        return additionalIn != null && !additionalIn.isEmpty();
      case XPathPackage.QUANTIFIED_EXPR__SATISFY:
        return satisfy != null;
    }
    return super.eIsSet(featureID);
  }

} //QuantifiedExprImpl
