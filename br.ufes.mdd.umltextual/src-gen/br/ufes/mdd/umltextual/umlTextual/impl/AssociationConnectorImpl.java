/**
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.umlTextual.impl;

import br.ufes.mdd.umltextual.umlTextual.AssociationConnector;
import br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.impl.AssociationConnectorImpl#getClass1 <em>Class1</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.impl.AssociationConnectorImpl#getMultiplicity1 <em>Multiplicity1</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.impl.AssociationConnectorImpl#getClass2 <em>Class2</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.impl.AssociationConnectorImpl#getMultiplicity2 <em>Multiplicity2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationConnectorImpl extends ElementImpl implements AssociationConnector
{
  /**
   * The cached value of the '{@link #getClass1() <em>Class1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass1()
   * @generated
   * @ordered
   */
  protected br.ufes.mdd.umltextual.umlTextual.Class class1;

  /**
   * The default value of the '{@link #getMultiplicity1() <em>Multiplicity1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity1()
   * @generated
   * @ordered
   */
  protected static final String MULTIPLICITY1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMultiplicity1() <em>Multiplicity1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity1()
   * @generated
   * @ordered
   */
  protected String multiplicity1 = MULTIPLICITY1_EDEFAULT;

  /**
   * The cached value of the '{@link #getClass2() <em>Class2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass2()
   * @generated
   * @ordered
   */
  protected br.ufes.mdd.umltextual.umlTextual.Class class2;

  /**
   * The default value of the '{@link #getMultiplicity2() <em>Multiplicity2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity2()
   * @generated
   * @ordered
   */
  protected static final String MULTIPLICITY2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMultiplicity2() <em>Multiplicity2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicity2()
   * @generated
   * @ordered
   */
  protected String multiplicity2 = MULTIPLICITY2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssociationConnectorImpl()
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
    return UmlTextualPackage.Literals.ASSOCIATION_CONNECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public br.ufes.mdd.umltextual.umlTextual.Class getClass1()
  {
    if (class1 != null && class1.eIsProxy())
    {
      InternalEObject oldClass1 = (InternalEObject)class1;
      class1 = (br.ufes.mdd.umltextual.umlTextual.Class)eResolveProxy(oldClass1);
      if (class1 != oldClass1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlTextualPackage.ASSOCIATION_CONNECTOR__CLASS1, oldClass1, class1));
      }
    }
    return class1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public br.ufes.mdd.umltextual.umlTextual.Class basicGetClass1()
  {
    return class1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClass1(br.ufes.mdd.umltextual.umlTextual.Class newClass1)
  {
    br.ufes.mdd.umltextual.umlTextual.Class oldClass1 = class1;
    class1 = newClass1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlTextualPackage.ASSOCIATION_CONNECTOR__CLASS1, oldClass1, class1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMultiplicity1()
  {
    return multiplicity1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMultiplicity1(String newMultiplicity1)
  {
    String oldMultiplicity1 = multiplicity1;
    multiplicity1 = newMultiplicity1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlTextualPackage.ASSOCIATION_CONNECTOR__MULTIPLICITY1, oldMultiplicity1, multiplicity1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public br.ufes.mdd.umltextual.umlTextual.Class getClass2()
  {
    if (class2 != null && class2.eIsProxy())
    {
      InternalEObject oldClass2 = (InternalEObject)class2;
      class2 = (br.ufes.mdd.umltextual.umlTextual.Class)eResolveProxy(oldClass2);
      if (class2 != oldClass2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlTextualPackage.ASSOCIATION_CONNECTOR__CLASS2, oldClass2, class2));
      }
    }
    return class2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public br.ufes.mdd.umltextual.umlTextual.Class basicGetClass2()
  {
    return class2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setClass2(br.ufes.mdd.umltextual.umlTextual.Class newClass2)
  {
    br.ufes.mdd.umltextual.umlTextual.Class oldClass2 = class2;
    class2 = newClass2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlTextualPackage.ASSOCIATION_CONNECTOR__CLASS2, oldClass2, class2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMultiplicity2()
  {
    return multiplicity2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMultiplicity2(String newMultiplicity2)
  {
    String oldMultiplicity2 = multiplicity2;
    multiplicity2 = newMultiplicity2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlTextualPackage.ASSOCIATION_CONNECTOR__MULTIPLICITY2, oldMultiplicity2, multiplicity2));
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
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__CLASS1:
        if (resolve) return getClass1();
        return basicGetClass1();
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__MULTIPLICITY1:
        return getMultiplicity1();
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__CLASS2:
        if (resolve) return getClass2();
        return basicGetClass2();
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__MULTIPLICITY2:
        return getMultiplicity2();
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
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__CLASS1:
        setClass1((br.ufes.mdd.umltextual.umlTextual.Class)newValue);
        return;
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__MULTIPLICITY1:
        setMultiplicity1((String)newValue);
        return;
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__CLASS2:
        setClass2((br.ufes.mdd.umltextual.umlTextual.Class)newValue);
        return;
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__MULTIPLICITY2:
        setMultiplicity2((String)newValue);
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
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__CLASS1:
        setClass1((br.ufes.mdd.umltextual.umlTextual.Class)null);
        return;
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__MULTIPLICITY1:
        setMultiplicity1(MULTIPLICITY1_EDEFAULT);
        return;
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__CLASS2:
        setClass2((br.ufes.mdd.umltextual.umlTextual.Class)null);
        return;
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__MULTIPLICITY2:
        setMultiplicity2(MULTIPLICITY2_EDEFAULT);
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
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__CLASS1:
        return class1 != null;
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__MULTIPLICITY1:
        return MULTIPLICITY1_EDEFAULT == null ? multiplicity1 != null : !MULTIPLICITY1_EDEFAULT.equals(multiplicity1);
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__CLASS2:
        return class2 != null;
      case UmlTextualPackage.ASSOCIATION_CONNECTOR__MULTIPLICITY2:
        return MULTIPLICITY2_EDEFAULT == null ? multiplicity2 != null : !MULTIPLICITY2_EDEFAULT.equals(multiplicity2);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (multiplicity1: ");
    result.append(multiplicity1);
    result.append(", multiplicity2: ");
    result.append(multiplicity2);
    result.append(')');
    return result.toString();
  }

} //AssociationConnectorImpl