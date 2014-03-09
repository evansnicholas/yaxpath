/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.ComparisonExpr;
import org.xtext.example.xpath.xPath.RangeExpr;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ComparisonExprImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ComparisonExprImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ComparisonExprImpl#getGen <em>Gen</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ComparisonExprImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.ComparisonExprImpl#getOtherRange <em>Other Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComparisonExprImpl extends MinimalEObjectImpl.Container implements ComparisonExpr
{
  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected RangeExpr range;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getGen() <em>Gen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGen()
   * @generated
   * @ordered
   */
  protected static final String GEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGen() <em>Gen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGen()
   * @generated
   * @ordered
   */
  protected String gen = GEN_EDEFAULT;

  /**
   * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected static final String NODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected String node = NODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOtherRange() <em>Other Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOtherRange()
   * @generated
   * @ordered
   */
  protected RangeExpr otherRange;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComparisonExprImpl()
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
    return XPathPackage.Literals.COMPARISON_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeExpr getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange(RangeExpr newRange, NotificationChain msgs)
  {
    RangeExpr oldRange = range;
    range = newRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.COMPARISON_EXPR__RANGE, oldRange, newRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(RangeExpr newRange)
  {
    if (newRange != range)
    {
      NotificationChain msgs = null;
      if (range != null)
        msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.COMPARISON_EXPR__RANGE, null, msgs);
      if (newRange != null)
        msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.COMPARISON_EXPR__RANGE, null, msgs);
      msgs = basicSetRange(newRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.COMPARISON_EXPR__RANGE, newRange, newRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.COMPARISON_EXPR__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGen()
  {
    return gen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGen(String newGen)
  {
    String oldGen = gen;
    gen = newGen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.COMPARISON_EXPR__GEN, oldGen, gen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNode()
  {
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNode(String newNode)
  {
    String oldNode = node;
    node = newNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.COMPARISON_EXPR__NODE, oldNode, node));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeExpr getOtherRange()
  {
    return otherRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOtherRange(RangeExpr newOtherRange, NotificationChain msgs)
  {
    RangeExpr oldOtherRange = otherRange;
    otherRange = newOtherRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.COMPARISON_EXPR__OTHER_RANGE, oldOtherRange, newOtherRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOtherRange(RangeExpr newOtherRange)
  {
    if (newOtherRange != otherRange)
    {
      NotificationChain msgs = null;
      if (otherRange != null)
        msgs = ((InternalEObject)otherRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.COMPARISON_EXPR__OTHER_RANGE, null, msgs);
      if (newOtherRange != null)
        msgs = ((InternalEObject)newOtherRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.COMPARISON_EXPR__OTHER_RANGE, null, msgs);
      msgs = basicSetOtherRange(newOtherRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.COMPARISON_EXPR__OTHER_RANGE, newOtherRange, newOtherRange));
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
      case XPathPackage.COMPARISON_EXPR__RANGE:
        return basicSetRange(null, msgs);
      case XPathPackage.COMPARISON_EXPR__OTHER_RANGE:
        return basicSetOtherRange(null, msgs);
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
      case XPathPackage.COMPARISON_EXPR__RANGE:
        return getRange();
      case XPathPackage.COMPARISON_EXPR__VALUE:
        return getValue();
      case XPathPackage.COMPARISON_EXPR__GEN:
        return getGen();
      case XPathPackage.COMPARISON_EXPR__NODE:
        return getNode();
      case XPathPackage.COMPARISON_EXPR__OTHER_RANGE:
        return getOtherRange();
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
      case XPathPackage.COMPARISON_EXPR__RANGE:
        setRange((RangeExpr)newValue);
        return;
      case XPathPackage.COMPARISON_EXPR__VALUE:
        setValue((String)newValue);
        return;
      case XPathPackage.COMPARISON_EXPR__GEN:
        setGen((String)newValue);
        return;
      case XPathPackage.COMPARISON_EXPR__NODE:
        setNode((String)newValue);
        return;
      case XPathPackage.COMPARISON_EXPR__OTHER_RANGE:
        setOtherRange((RangeExpr)newValue);
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
      case XPathPackage.COMPARISON_EXPR__RANGE:
        setRange((RangeExpr)null);
        return;
      case XPathPackage.COMPARISON_EXPR__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case XPathPackage.COMPARISON_EXPR__GEN:
        setGen(GEN_EDEFAULT);
        return;
      case XPathPackage.COMPARISON_EXPR__NODE:
        setNode(NODE_EDEFAULT);
        return;
      case XPathPackage.COMPARISON_EXPR__OTHER_RANGE:
        setOtherRange((RangeExpr)null);
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
      case XPathPackage.COMPARISON_EXPR__RANGE:
        return range != null;
      case XPathPackage.COMPARISON_EXPR__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case XPathPackage.COMPARISON_EXPR__GEN:
        return GEN_EDEFAULT == null ? gen != null : !GEN_EDEFAULT.equals(gen);
      case XPathPackage.COMPARISON_EXPR__NODE:
        return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
      case XPathPackage.COMPARISON_EXPR__OTHER_RANGE:
        return otherRange != null;
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
    result.append(" (value: ");
    result.append(value);
    result.append(", gen: ");
    result.append(gen);
    result.append(", node: ");
    result.append(node);
    result.append(')');
    return result.toString();
  }

} //ComparisonExprImpl
