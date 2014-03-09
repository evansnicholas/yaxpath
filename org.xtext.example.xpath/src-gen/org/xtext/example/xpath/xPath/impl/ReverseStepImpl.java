/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.NodeTest;
import org.xtext.example.xpath.xPath.ReverseStep;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reverse Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ReverseStepImpl#getReverse <em>Reverse</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ReverseStepImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ReverseStepImpl#getAbbrRevSet <em>Abbr Rev Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReverseStepImpl extends MinimalEObjectImpl.Container implements ReverseStep
{
  /**
   * The default value of the '{@link #getReverse() <em>Reverse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReverse()
   * @generated
   * @ordered
   */
  protected static final String REVERSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReverse() <em>Reverse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReverse()
   * @generated
   * @ordered
   */
  protected String reverse = REVERSE_EDEFAULT;

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
   * The default value of the '{@link #getAbbrRevSet() <em>Abbr Rev Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbbrRevSet()
   * @generated
   * @ordered
   */
  protected static final String ABBR_REV_SET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAbbrRevSet() <em>Abbr Rev Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbbrRevSet()
   * @generated
   * @ordered
   */
  protected String abbrRevSet = ABBR_REV_SET_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReverseStepImpl()
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
    return XPathPackage.Literals.REVERSE_STEP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReverse()
  {
    return reverse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReverse(String newReverse)
  {
    String oldReverse = reverse;
    reverse = newReverse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.REVERSE_STEP__REVERSE, oldReverse, reverse));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.REVERSE_STEP__TEST, oldTest, newTest);
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
        msgs = ((InternalEObject)test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.REVERSE_STEP__TEST, null, msgs);
      if (newTest != null)
        msgs = ((InternalEObject)newTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.REVERSE_STEP__TEST, null, msgs);
      msgs = basicSetTest(newTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.REVERSE_STEP__TEST, newTest, newTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAbbrRevSet()
  {
    return abbrRevSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbbrRevSet(String newAbbrRevSet)
  {
    String oldAbbrRevSet = abbrRevSet;
    abbrRevSet = newAbbrRevSet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.REVERSE_STEP__ABBR_REV_SET, oldAbbrRevSet, abbrRevSet));
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
      case XPathPackage.REVERSE_STEP__TEST:
        return basicSetTest(null, msgs);
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
      case XPathPackage.REVERSE_STEP__REVERSE:
        return getReverse();
      case XPathPackage.REVERSE_STEP__TEST:
        return getTest();
      case XPathPackage.REVERSE_STEP__ABBR_REV_SET:
        return getAbbrRevSet();
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
      case XPathPackage.REVERSE_STEP__REVERSE:
        setReverse((String)newValue);
        return;
      case XPathPackage.REVERSE_STEP__TEST:
        setTest((NodeTest)newValue);
        return;
      case XPathPackage.REVERSE_STEP__ABBR_REV_SET:
        setAbbrRevSet((String)newValue);
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
      case XPathPackage.REVERSE_STEP__REVERSE:
        setReverse(REVERSE_EDEFAULT);
        return;
      case XPathPackage.REVERSE_STEP__TEST:
        setTest((NodeTest)null);
        return;
      case XPathPackage.REVERSE_STEP__ABBR_REV_SET:
        setAbbrRevSet(ABBR_REV_SET_EDEFAULT);
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
      case XPathPackage.REVERSE_STEP__REVERSE:
        return REVERSE_EDEFAULT == null ? reverse != null : !REVERSE_EDEFAULT.equals(reverse);
      case XPathPackage.REVERSE_STEP__TEST:
        return test != null;
      case XPathPackage.REVERSE_STEP__ABBR_REV_SET:
        return ABBR_REV_SET_EDEFAULT == null ? abbrRevSet != null : !ABBR_REV_SET_EDEFAULT.equals(abbrRevSet);
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
    result.append(" (reverse: ");
    result.append(reverse);
    result.append(", abbrRevSet: ");
    result.append(abbrRevSet);
    result.append(')');
    return result.toString();
  }

} //ReverseStepImpl
