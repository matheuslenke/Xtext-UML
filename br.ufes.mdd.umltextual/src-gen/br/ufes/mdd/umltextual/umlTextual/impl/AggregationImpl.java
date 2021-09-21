/**
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.umlTextual.impl;

import br.ufes.mdd.umltextual.umlTextual.Aggregation;
import br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.impl.AggregationImpl#getNavigation <em>Navigation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregationImpl extends AssociationConnectorImpl implements Aggregation
{
  /**
   * The default value of the '{@link #getNavigation() <em>Navigation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNavigation()
   * @generated
   * @ordered
   */
  protected static final String NAVIGATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNavigation() <em>Navigation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNavigation()
   * @generated
   * @ordered
   */
  protected String navigation = NAVIGATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AggregationImpl()
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
    return UmlTextualPackage.Literals.AGGREGATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNavigation()
  {
    return navigation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNavigation(String newNavigation)
  {
    String oldNavigation = navigation;
    navigation = newNavigation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlTextualPackage.AGGREGATION__NAVIGATION, oldNavigation, navigation));
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
      case UmlTextualPackage.AGGREGATION__NAVIGATION:
        return getNavigation();
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
      case UmlTextualPackage.AGGREGATION__NAVIGATION:
        setNavigation((String)newValue);
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
      case UmlTextualPackage.AGGREGATION__NAVIGATION:
        setNavigation(NAVIGATION_EDEFAULT);
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
      case UmlTextualPackage.AGGREGATION__NAVIGATION:
        return NAVIGATION_EDEFAULT == null ? navigation != null : !NAVIGATION_EDEFAULT.equals(navigation);
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
    result.append(" (navigation: ");
    result.append(navigation);
    result.append(')');
    return result.toString();
  }

} //AggregationImpl