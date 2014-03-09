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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.xpath.xPath.AdditionalIn;
import org.xtext.example.xpath.xPath.ExprSingle;
import org.xtext.example.xpath.xPath.SimpleForClause;
import org.xtext.example.xpath.xPath.VarName;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple For Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.SimpleForClauseImpl#getForVar <em>For Var</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.SimpleForClauseImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.SimpleForClauseImpl#getAdditionalIn <em>Additional In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleForClauseImpl extends MinimalEObjectImpl.Container implements SimpleForClause
{
  /**
   * The cached value of the '{@link #getForVar() <em>For Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForVar()
   * @generated
   * @ordered
   */
  protected VarName forVar;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleForClauseImpl()
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
    return XPathPackage.Literals.SIMPLE_FOR_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarName getForVar()
  {
    return forVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForVar(VarName newForVar, NotificationChain msgs)
  {
    VarName oldForVar = forVar;
    forVar = newForVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.SIMPLE_FOR_CLAUSE__FOR_VAR, oldForVar, newForVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForVar(VarName newForVar)
  {
    if (newForVar != forVar)
    {
      NotificationChain msgs = null;
      if (forVar != null)
        msgs = ((InternalEObject)forVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.SIMPLE_FOR_CLAUSE__FOR_VAR, null, msgs);
      if (newForVar != null)
        msgs = ((InternalEObject)newForVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.SIMPLE_FOR_CLAUSE__FOR_VAR, null, msgs);
      msgs = basicSetForVar(newForVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.SIMPLE_FOR_CLAUSE__FOR_VAR, newForVar, newForVar));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.SIMPLE_FOR_CLAUSE__IN, oldIn, newIn);
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
        msgs = ((InternalEObject)in).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.SIMPLE_FOR_CLAUSE__IN, null, msgs);
      if (newIn != null)
        msgs = ((InternalEObject)newIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.SIMPLE_FOR_CLAUSE__IN, null, msgs);
      msgs = basicSetIn(newIn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.SIMPLE_FOR_CLAUSE__IN, newIn, newIn));
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
      additionalIn = new EObjectContainmentEList<AdditionalIn>(AdditionalIn.class, this, XPathPackage.SIMPLE_FOR_CLAUSE__ADDITIONAL_IN);
    }
    return additionalIn;
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
      case XPathPackage.SIMPLE_FOR_CLAUSE__FOR_VAR:
        return basicSetForVar(null, msgs);
      case XPathPackage.SIMPLE_FOR_CLAUSE__IN:
        return basicSetIn(null, msgs);
      case XPathPackage.SIMPLE_FOR_CLAUSE__ADDITIONAL_IN:
        return ((InternalEList<?>)getAdditionalIn()).basicRemove(otherEnd, msgs);
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
      case XPathPackage.SIMPLE_FOR_CLAUSE__FOR_VAR:
        return getForVar();
      case XPathPackage.SIMPLE_FOR_CLAUSE__IN:
        return getIn();
      case XPathPackage.SIMPLE_FOR_CLAUSE__ADDITIONAL_IN:
        return getAdditionalIn();
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
      case XPathPackage.SIMPLE_FOR_CLAUSE__FOR_VAR:
        setForVar((VarName)newValue);
        return;
      case XPathPackage.SIMPLE_FOR_CLAUSE__IN:
        setIn((ExprSingle)newValue);
        return;
      case XPathPackage.SIMPLE_FOR_CLAUSE__ADDITIONAL_IN:
        getAdditionalIn().clear();
        getAdditionalIn().addAll((Collection<? extends AdditionalIn>)newValue);
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
      case XPathPackage.SIMPLE_FOR_CLAUSE__FOR_VAR:
        setForVar((VarName)null);
        return;
      case XPathPackage.SIMPLE_FOR_CLAUSE__IN:
        setIn((ExprSingle)null);
        return;
      case XPathPackage.SIMPLE_FOR_CLAUSE__ADDITIONAL_IN:
        getAdditionalIn().clear();
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
      case XPathPackage.SIMPLE_FOR_CLAUSE__FOR_VAR:
        return forVar != null;
      case XPathPackage.SIMPLE_FOR_CLAUSE__IN:
        return in != null;
      case XPathPackage.SIMPLE_FOR_CLAUSE__ADDITIONAL_IN:
        return additionalIn != null && !additionalIn.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SimpleForClauseImpl
