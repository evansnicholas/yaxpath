/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.NumericLiteral;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.NumericLiteralImpl#getIntLit <em>Int Lit</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.NumericLiteralImpl#getDecLit <em>Dec Lit</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.NumericLiteralImpl#getDoubleLit <em>Double Lit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericLiteralImpl extends MinimalEObjectImpl.Container implements NumericLiteral
{
  /**
   * The default value of the '{@link #getIntLit() <em>Int Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntLit()
   * @generated
   * @ordered
   */
  protected static final int INT_LIT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntLit() <em>Int Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntLit()
   * @generated
   * @ordered
   */
  protected int intLit = INT_LIT_EDEFAULT;

  /**
   * The default value of the '{@link #getDecLit() <em>Dec Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecLit()
   * @generated
   * @ordered
   */
  protected static final String DEC_LIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDecLit() <em>Dec Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecLit()
   * @generated
   * @ordered
   */
  protected String decLit = DEC_LIT_EDEFAULT;

  /**
   * The default value of the '{@link #getDoubleLit() <em>Double Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoubleLit()
   * @generated
   * @ordered
   */
  protected static final String DOUBLE_LIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDoubleLit() <em>Double Lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoubleLit()
   * @generated
   * @ordered
   */
  protected String doubleLit = DOUBLE_LIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumericLiteralImpl()
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
    return XPathPackage.Literals.NUMERIC_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntLit()
  {
    return intLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntLit(int newIntLit)
  {
    int oldIntLit = intLit;
    intLit = newIntLit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.NUMERIC_LITERAL__INT_LIT, oldIntLit, intLit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDecLit()
  {
    return decLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecLit(String newDecLit)
  {
    String oldDecLit = decLit;
    decLit = newDecLit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.NUMERIC_LITERAL__DEC_LIT, oldDecLit, decLit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDoubleLit()
  {
    return doubleLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoubleLit(String newDoubleLit)
  {
    String oldDoubleLit = doubleLit;
    doubleLit = newDoubleLit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.NUMERIC_LITERAL__DOUBLE_LIT, oldDoubleLit, doubleLit));
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
      case XPathPackage.NUMERIC_LITERAL__INT_LIT:
        return getIntLit();
      case XPathPackage.NUMERIC_LITERAL__DEC_LIT:
        return getDecLit();
      case XPathPackage.NUMERIC_LITERAL__DOUBLE_LIT:
        return getDoubleLit();
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
      case XPathPackage.NUMERIC_LITERAL__INT_LIT:
        setIntLit((Integer)newValue);
        return;
      case XPathPackage.NUMERIC_LITERAL__DEC_LIT:
        setDecLit((String)newValue);
        return;
      case XPathPackage.NUMERIC_LITERAL__DOUBLE_LIT:
        setDoubleLit((String)newValue);
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
      case XPathPackage.NUMERIC_LITERAL__INT_LIT:
        setIntLit(INT_LIT_EDEFAULT);
        return;
      case XPathPackage.NUMERIC_LITERAL__DEC_LIT:
        setDecLit(DEC_LIT_EDEFAULT);
        return;
      case XPathPackage.NUMERIC_LITERAL__DOUBLE_LIT:
        setDoubleLit(DOUBLE_LIT_EDEFAULT);
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
      case XPathPackage.NUMERIC_LITERAL__INT_LIT:
        return intLit != INT_LIT_EDEFAULT;
      case XPathPackage.NUMERIC_LITERAL__DEC_LIT:
        return DEC_LIT_EDEFAULT == null ? decLit != null : !DEC_LIT_EDEFAULT.equals(decLit);
      case XPathPackage.NUMERIC_LITERAL__DOUBLE_LIT:
        return DOUBLE_LIT_EDEFAULT == null ? doubleLit != null : !DOUBLE_LIT_EDEFAULT.equals(doubleLit);
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
    result.append(" (intLit: ");
    result.append(intLit);
    result.append(", decLit: ");
    result.append(decLit);
    result.append(", doubleLit: ");
    result.append(doubleLit);
    result.append(')');
    return result.toString();
  }

} //NumericLiteralImpl
