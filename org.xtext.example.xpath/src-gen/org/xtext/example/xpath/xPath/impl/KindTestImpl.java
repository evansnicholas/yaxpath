/**
 */
package org.xtext.example.xpath.xPath.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.xpath.xPath.AttributeTest;
import org.xtext.example.xpath.xPath.DocumentTest;
import org.xtext.example.xpath.xPath.ElementTest;
import org.xtext.example.xpath.xPath.KindTest;
import org.xtext.example.xpath.xPath.PITest;
import org.xtext.example.xpath.xPath.SchemaAttributeTest;
import org.xtext.example.xpath.xPath.SchemaElementTest;
import org.xtext.example.xpath.xPath.XPathPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kind Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.KindTestImpl#getDocTest <em>Doc Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.KindTestImpl#getElemTest <em>Elem Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.KindTestImpl#getAttributeTest <em>Attribute Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.KindTestImpl#getSchemaElemTest <em>Schema Elem Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.KindTestImpl#getSchemaAttributeTest <em>Schema Attribute Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.KindTestImpl#getPitTest <em>Pit Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.KindTestImpl#getCommentTest <em>Comment Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.KindTestImpl#getTextTest <em>Text Test</em>}</li>
 *   <li>{@link org.xtext.example.xpath.xPath.impl.KindTestImpl#getAnyKindTest <em>Any Kind Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KindTestImpl extends MinimalEObjectImpl.Container implements KindTest
{
  /**
   * The cached value of the '{@link #getDocTest() <em>Doc Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocTest()
   * @generated
   * @ordered
   */
  protected DocumentTest docTest;

  /**
   * The cached value of the '{@link #getElemTest() <em>Elem Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElemTest()
   * @generated
   * @ordered
   */
  protected ElementTest elemTest;

  /**
   * The cached value of the '{@link #getAttributeTest() <em>Attribute Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeTest()
   * @generated
   * @ordered
   */
  protected AttributeTest attributeTest;

  /**
   * The cached value of the '{@link #getSchemaElemTest() <em>Schema Elem Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchemaElemTest()
   * @generated
   * @ordered
   */
  protected SchemaElementTest schemaElemTest;

  /**
   * The cached value of the '{@link #getSchemaAttributeTest() <em>Schema Attribute Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchemaAttributeTest()
   * @generated
   * @ordered
   */
  protected SchemaAttributeTest schemaAttributeTest;

  /**
   * The cached value of the '{@link #getPitTest() <em>Pit Test</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPitTest()
   * @generated
   * @ordered
   */
  protected PITest pitTest;

  /**
   * The default value of the '{@link #getCommentTest() <em>Comment Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommentTest()
   * @generated
   * @ordered
   */
  protected static final String COMMENT_TEST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCommentTest() <em>Comment Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommentTest()
   * @generated
   * @ordered
   */
  protected String commentTest = COMMENT_TEST_EDEFAULT;

  /**
   * The default value of the '{@link #getTextTest() <em>Text Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextTest()
   * @generated
   * @ordered
   */
  protected static final String TEXT_TEST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTextTest() <em>Text Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextTest()
   * @generated
   * @ordered
   */
  protected String textTest = TEXT_TEST_EDEFAULT;

  /**
   * The default value of the '{@link #getAnyKindTest() <em>Any Kind Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnyKindTest()
   * @generated
   * @ordered
   */
  protected static final String ANY_KIND_TEST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAnyKindTest() <em>Any Kind Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnyKindTest()
   * @generated
   * @ordered
   */
  protected String anyKindTest = ANY_KIND_TEST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KindTestImpl()
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
    return XPathPackage.Literals.KIND_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentTest getDocTest()
  {
    return docTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDocTest(DocumentTest newDocTest, NotificationChain msgs)
  {
    DocumentTest oldDocTest = docTest;
    docTest = newDocTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.KIND_TEST__DOC_TEST, oldDocTest, newDocTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocTest(DocumentTest newDocTest)
  {
    if (newDocTest != docTest)
    {
      NotificationChain msgs = null;
      if (docTest != null)
        msgs = ((InternalEObject)docTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.KIND_TEST__DOC_TEST, null, msgs);
      if (newDocTest != null)
        msgs = ((InternalEObject)newDocTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.KIND_TEST__DOC_TEST, null, msgs);
      msgs = basicSetDocTest(newDocTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.KIND_TEST__DOC_TEST, newDocTest, newDocTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementTest getElemTest()
  {
    return elemTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElemTest(ElementTest newElemTest, NotificationChain msgs)
  {
    ElementTest oldElemTest = elemTest;
    elemTest = newElemTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.KIND_TEST__ELEM_TEST, oldElemTest, newElemTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElemTest(ElementTest newElemTest)
  {
    if (newElemTest != elemTest)
    {
      NotificationChain msgs = null;
      if (elemTest != null)
        msgs = ((InternalEObject)elemTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.KIND_TEST__ELEM_TEST, null, msgs);
      if (newElemTest != null)
        msgs = ((InternalEObject)newElemTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.KIND_TEST__ELEM_TEST, null, msgs);
      msgs = basicSetElemTest(newElemTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.KIND_TEST__ELEM_TEST, newElemTest, newElemTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeTest getAttributeTest()
  {
    return attributeTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeTest(AttributeTest newAttributeTest, NotificationChain msgs)
  {
    AttributeTest oldAttributeTest = attributeTest;
    attributeTest = newAttributeTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.KIND_TEST__ATTRIBUTE_TEST, oldAttributeTest, newAttributeTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeTest(AttributeTest newAttributeTest)
  {
    if (newAttributeTest != attributeTest)
    {
      NotificationChain msgs = null;
      if (attributeTest != null)
        msgs = ((InternalEObject)attributeTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.KIND_TEST__ATTRIBUTE_TEST, null, msgs);
      if (newAttributeTest != null)
        msgs = ((InternalEObject)newAttributeTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.KIND_TEST__ATTRIBUTE_TEST, null, msgs);
      msgs = basicSetAttributeTest(newAttributeTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.KIND_TEST__ATTRIBUTE_TEST, newAttributeTest, newAttributeTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaElementTest getSchemaElemTest()
  {
    return schemaElemTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSchemaElemTest(SchemaElementTest newSchemaElemTest, NotificationChain msgs)
  {
    SchemaElementTest oldSchemaElemTest = schemaElemTest;
    schemaElemTest = newSchemaElemTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.KIND_TEST__SCHEMA_ELEM_TEST, oldSchemaElemTest, newSchemaElemTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchemaElemTest(SchemaElementTest newSchemaElemTest)
  {
    if (newSchemaElemTest != schemaElemTest)
    {
      NotificationChain msgs = null;
      if (schemaElemTest != null)
        msgs = ((InternalEObject)schemaElemTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.KIND_TEST__SCHEMA_ELEM_TEST, null, msgs);
      if (newSchemaElemTest != null)
        msgs = ((InternalEObject)newSchemaElemTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.KIND_TEST__SCHEMA_ELEM_TEST, null, msgs);
      msgs = basicSetSchemaElemTest(newSchemaElemTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.KIND_TEST__SCHEMA_ELEM_TEST, newSchemaElemTest, newSchemaElemTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaAttributeTest getSchemaAttributeTest()
  {
    return schemaAttributeTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSchemaAttributeTest(SchemaAttributeTest newSchemaAttributeTest, NotificationChain msgs)
  {
    SchemaAttributeTest oldSchemaAttributeTest = schemaAttributeTest;
    schemaAttributeTest = newSchemaAttributeTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.KIND_TEST__SCHEMA_ATTRIBUTE_TEST, oldSchemaAttributeTest, newSchemaAttributeTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchemaAttributeTest(SchemaAttributeTest newSchemaAttributeTest)
  {
    if (newSchemaAttributeTest != schemaAttributeTest)
    {
      NotificationChain msgs = null;
      if (schemaAttributeTest != null)
        msgs = ((InternalEObject)schemaAttributeTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.KIND_TEST__SCHEMA_ATTRIBUTE_TEST, null, msgs);
      if (newSchemaAttributeTest != null)
        msgs = ((InternalEObject)newSchemaAttributeTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.KIND_TEST__SCHEMA_ATTRIBUTE_TEST, null, msgs);
      msgs = basicSetSchemaAttributeTest(newSchemaAttributeTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.KIND_TEST__SCHEMA_ATTRIBUTE_TEST, newSchemaAttributeTest, newSchemaAttributeTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PITest getPitTest()
  {
    return pitTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPitTest(PITest newPitTest, NotificationChain msgs)
  {
    PITest oldPitTest = pitTest;
    pitTest = newPitTest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPathPackage.KIND_TEST__PIT_TEST, oldPitTest, newPitTest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPitTest(PITest newPitTest)
  {
    if (newPitTest != pitTest)
    {
      NotificationChain msgs = null;
      if (pitTest != null)
        msgs = ((InternalEObject)pitTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XPathPackage.KIND_TEST__PIT_TEST, null, msgs);
      if (newPitTest != null)
        msgs = ((InternalEObject)newPitTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XPathPackage.KIND_TEST__PIT_TEST, null, msgs);
      msgs = basicSetPitTest(newPitTest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.KIND_TEST__PIT_TEST, newPitTest, newPitTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCommentTest()
  {
    return commentTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommentTest(String newCommentTest)
  {
    String oldCommentTest = commentTest;
    commentTest = newCommentTest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.KIND_TEST__COMMENT_TEST, oldCommentTest, commentTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTextTest()
  {
    return textTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextTest(String newTextTest)
  {
    String oldTextTest = textTest;
    textTest = newTextTest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.KIND_TEST__TEXT_TEST, oldTextTest, textTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAnyKindTest()
  {
    return anyKindTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnyKindTest(String newAnyKindTest)
  {
    String oldAnyKindTest = anyKindTest;
    anyKindTest = newAnyKindTest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XPathPackage.KIND_TEST__ANY_KIND_TEST, oldAnyKindTest, anyKindTest));
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
      case XPathPackage.KIND_TEST__DOC_TEST:
        return basicSetDocTest(null, msgs);
      case XPathPackage.KIND_TEST__ELEM_TEST:
        return basicSetElemTest(null, msgs);
      case XPathPackage.KIND_TEST__ATTRIBUTE_TEST:
        return basicSetAttributeTest(null, msgs);
      case XPathPackage.KIND_TEST__SCHEMA_ELEM_TEST:
        return basicSetSchemaElemTest(null, msgs);
      case XPathPackage.KIND_TEST__SCHEMA_ATTRIBUTE_TEST:
        return basicSetSchemaAttributeTest(null, msgs);
      case XPathPackage.KIND_TEST__PIT_TEST:
        return basicSetPitTest(null, msgs);
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
      case XPathPackage.KIND_TEST__DOC_TEST:
        return getDocTest();
      case XPathPackage.KIND_TEST__ELEM_TEST:
        return getElemTest();
      case XPathPackage.KIND_TEST__ATTRIBUTE_TEST:
        return getAttributeTest();
      case XPathPackage.KIND_TEST__SCHEMA_ELEM_TEST:
        return getSchemaElemTest();
      case XPathPackage.KIND_TEST__SCHEMA_ATTRIBUTE_TEST:
        return getSchemaAttributeTest();
      case XPathPackage.KIND_TEST__PIT_TEST:
        return getPitTest();
      case XPathPackage.KIND_TEST__COMMENT_TEST:
        return getCommentTest();
      case XPathPackage.KIND_TEST__TEXT_TEST:
        return getTextTest();
      case XPathPackage.KIND_TEST__ANY_KIND_TEST:
        return getAnyKindTest();
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
      case XPathPackage.KIND_TEST__DOC_TEST:
        setDocTest((DocumentTest)newValue);
        return;
      case XPathPackage.KIND_TEST__ELEM_TEST:
        setElemTest((ElementTest)newValue);
        return;
      case XPathPackage.KIND_TEST__ATTRIBUTE_TEST:
        setAttributeTest((AttributeTest)newValue);
        return;
      case XPathPackage.KIND_TEST__SCHEMA_ELEM_TEST:
        setSchemaElemTest((SchemaElementTest)newValue);
        return;
      case XPathPackage.KIND_TEST__SCHEMA_ATTRIBUTE_TEST:
        setSchemaAttributeTest((SchemaAttributeTest)newValue);
        return;
      case XPathPackage.KIND_TEST__PIT_TEST:
        setPitTest((PITest)newValue);
        return;
      case XPathPackage.KIND_TEST__COMMENT_TEST:
        setCommentTest((String)newValue);
        return;
      case XPathPackage.KIND_TEST__TEXT_TEST:
        setTextTest((String)newValue);
        return;
      case XPathPackage.KIND_TEST__ANY_KIND_TEST:
        setAnyKindTest((String)newValue);
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
      case XPathPackage.KIND_TEST__DOC_TEST:
        setDocTest((DocumentTest)null);
        return;
      case XPathPackage.KIND_TEST__ELEM_TEST:
        setElemTest((ElementTest)null);
        return;
      case XPathPackage.KIND_TEST__ATTRIBUTE_TEST:
        setAttributeTest((AttributeTest)null);
        return;
      case XPathPackage.KIND_TEST__SCHEMA_ELEM_TEST:
        setSchemaElemTest((SchemaElementTest)null);
        return;
      case XPathPackage.KIND_TEST__SCHEMA_ATTRIBUTE_TEST:
        setSchemaAttributeTest((SchemaAttributeTest)null);
        return;
      case XPathPackage.KIND_TEST__PIT_TEST:
        setPitTest((PITest)null);
        return;
      case XPathPackage.KIND_TEST__COMMENT_TEST:
        setCommentTest(COMMENT_TEST_EDEFAULT);
        return;
      case XPathPackage.KIND_TEST__TEXT_TEST:
        setTextTest(TEXT_TEST_EDEFAULT);
        return;
      case XPathPackage.KIND_TEST__ANY_KIND_TEST:
        setAnyKindTest(ANY_KIND_TEST_EDEFAULT);
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
      case XPathPackage.KIND_TEST__DOC_TEST:
        return docTest != null;
      case XPathPackage.KIND_TEST__ELEM_TEST:
        return elemTest != null;
      case XPathPackage.KIND_TEST__ATTRIBUTE_TEST:
        return attributeTest != null;
      case XPathPackage.KIND_TEST__SCHEMA_ELEM_TEST:
        return schemaElemTest != null;
      case XPathPackage.KIND_TEST__SCHEMA_ATTRIBUTE_TEST:
        return schemaAttributeTest != null;
      case XPathPackage.KIND_TEST__PIT_TEST:
        return pitTest != null;
      case XPathPackage.KIND_TEST__COMMENT_TEST:
        return COMMENT_TEST_EDEFAULT == null ? commentTest != null : !COMMENT_TEST_EDEFAULT.equals(commentTest);
      case XPathPackage.KIND_TEST__TEXT_TEST:
        return TEXT_TEST_EDEFAULT == null ? textTest != null : !TEXT_TEST_EDEFAULT.equals(textTest);
      case XPathPackage.KIND_TEST__ANY_KIND_TEST:
        return ANY_KIND_TEST_EDEFAULT == null ? anyKindTest != null : !ANY_KIND_TEST_EDEFAULT.equals(anyKindTest);
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
    result.append(" (commentTest: ");
    result.append(commentTest);
    result.append(", textTest: ");
    result.append(textTest);
    result.append(", anyKindTest: ");
    result.append(anyKindTest);
    result.append(')');
    return result.toString();
  }

} //KindTestImpl
