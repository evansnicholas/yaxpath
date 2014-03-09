/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.AbbrevForwardStep;
import org.xtext.example.xpath.xPath.ForwardStep;
import org.xtext.example.xpath.xPath.NodeTest;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forward Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ForwardStepImpl#getForward <em>Forward</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ForwardStepImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ForwardStepImpl#getAbbrForward <em>Abbr Forward</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForwardStepImpl extends MinimalEObjectImpl.Container implements ForwardStep
{
  /**
   * The default value of the '{@link #getForward() <em>Forward</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForward()
   * @generated
   * @ordered
   */
  protected static final String FORWARD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getForward() <em>Forward</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForward()
   * @generated
   * @ordered
   */
  protected String forward = FORWARD_EDEFAULT;

  /**
   * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected NodeTest test;

  /**
   * The cached value of the '{@link #getAbbrForward() <em>Abbr Forward</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbbrForward()
   * @generated
   * @ordered
   */
  protected AbbrevForwardStep abbrForward;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForwardStepImpl()
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
    return XPathPackage.Literals.FORWARD_STEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getForward()
  {
    return forward;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForward(String newForward)
  {
    String oldForward = forward;
    forward = newForward;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.FORWARD_STEP__FORWARD, oldForward, forward));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeTest getTest()
  {
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTest(NodeTest newTest, NotificationChain msgs)
  {
    NodeTest oldTest = test;
    test = newTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.FORWARD_STEP__TEST, oldTest, newTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTest(NodeTest newTest)
  {
    if (newTest != test)
    {
      NotificationChain msgs = null;
      if (test != null)
        msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.FORWARD_STEP__TEST, null, msgs);
      if (newTest != null)
        msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.FORWARD_STEP__TEST, null, msgs);
      msgs = basicSetTest(newTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.FORWARD_STEP__TEST, newTest, newTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbbrevForwardStep getAbbrForward()
  {
    return abbrForward;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbbrForward(AbbrevForwardStep newAbbrForward, NotificationChain msgs)
  {
    AbbrevForwardStep oldAbbrForward = abbrForward;
    abbrForward = newAbbrForward;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.FORWARD_STEP__ABBR_FORWARD, oldAbbrForward, newAbbrForward);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbbrForward(AbbrevForwardStep newAbbrForward)
  {
    if (newAbbrForward != abbrForward)
    {
      NotificationChain msgs = null;
      if (abbrForward != null)
        msgs = ((InternalEObject)abbrForward).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.FORWARD_STEP__ABBR_FORWARD, null, msgs);
      if (newAbbrForward != null)
        msgs = ((InternalEObject)newAbbrForward).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.FORWARD_STEP__ABBR_FORWARD, null, msgs);
      msgs = basicSetAbbrForward(newAbbrForward, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.FORWARD_STEP__ABBR_FORWARD, newAbbrForward, newAbbrForward));
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
      case XPathPackage.FORWARD_STEP__TEST:
        return basicSetTest(null, msgs);
      case XPathPackage.FORWARD_STEP__ABBR_FORWARD:
        return basicSetAbbrForward(null, msgs);
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
      case XPathPackage.FORWARD_STEP__FORWARD:
        return getForward();
      case XPathPackage.FORWARD_STEP__TEST:
        return getTest();
      case XPathPackage.FORWARD_STEP__ABBR_FORWARD:
        return getAbbrForward();
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
      case XPathPackage.FORWARD_STEP__FORWARD:
        setForward((String)newValue);
        return;
      case XPathPackage.FORWARD_STEP__TEST:
        setTest((NodeTest)newValue);
        return;
      case XPathPackage.FORWARD_STEP__ABBR_FORWARD:
        setAbbrForward((AbbrevForwardStep)newValue);
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
      case XPathPackage.FORWARD_STEP__FORWARD:
        setForward(FORWARD_EDEFAULT);
        return;
      case XPathPackage.FORWARD_STEP__TEST:
        setTest((NodeTest)null);
        return;
      case XPathPackage.FORWARD_STEP__ABBR_FORWARD:
        setAbbrForward((AbbrevForwardStep)null);
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
      case XPathPackage.FORWARD_STEP__FORWARD:
        return FORWARD_EDEFAULT == null ? forward != null : !FORWARD_EDEFAULT.equals(forward);
      case XPathPackage.FORWARD_STEP__TEST:
        return test != null;
      case XPathPackage.FORWARD_STEP__ABBR_FORWARD:
        return abbrForward != null;
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
    result.append(" (forward: ");
    result.append(forward);
    result.append(')');
    return result.toString();
  }

} //ForwardStepImpl
