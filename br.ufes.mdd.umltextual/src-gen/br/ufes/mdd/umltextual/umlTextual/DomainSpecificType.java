/**
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.umlTextual;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Specific Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.DomainSpecificType#getName <em>Name</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.DomainSpecificType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getDomainSpecificType()
 * @model
 * @generated
 */
public interface DomainSpecificType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getDomainSpecificType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufes.mdd.umltextual.umlTextual.DomainSpecificType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getDomainSpecificType_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link br.ufes.mdd.umltextual.umlTextual.DomainSpecificType#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // DomainSpecificType
