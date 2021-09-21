/**
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.umlTextual;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.Parameter#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 *
 * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufes.mdd.umltextual.umlTextual.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameter Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Type</em>' containment reference.
   * @see #setParameterType(AttributeType)
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getParameter_ParameterType()
   * @model containment="true"
   * @generated
   */
  AttributeType getParameterType();

  /**
   * Sets the value of the '{@link br.ufes.mdd.umltextual.umlTextual.Parameter#getParameterType <em>Parameter Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Type</em>' containment reference.
   * @see #getParameterType()
   * @generated
   */
  void setParameterType(AttributeType value);

} // Parameter
