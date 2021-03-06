/**
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.umlTextual;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.Package#getInstantiable <em>Instantiable</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.Package#getType <em>Type</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.Package#getParentPackage <em>Parent Package</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.Package#getDomainSpecificTypes <em>Domain Specific Types</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.Package#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends ModelElement
{
  /**
   * Returns the value of the '<em><b>Instantiable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instantiable</em>' attribute.
   * @see #setInstantiable(String)
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getPackage_Instantiable()
   * @model
   * @generated
   */
  String getInstantiable();

  /**
   * Sets the value of the '{@link br.ufes.mdd.umltextual.umlTextual.Package#getInstantiable <em>Instantiable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instantiable</em>' attribute.
   * @see #getInstantiable()
   * @generated
   */
  void setInstantiable(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getPackage_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link br.ufes.mdd.umltextual.umlTextual.Package#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Parent Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Package</em>' reference.
   * @see #setParentPackage(Package)
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getPackage_ParentPackage()
   * @model
   * @generated
   */
  Package getParentPackage();

  /**
   * Sets the value of the '{@link br.ufes.mdd.umltextual.umlTextual.Package#getParentPackage <em>Parent Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Package</em>' reference.
   * @see #getParentPackage()
   * @generated
   */
  void setParentPackage(Package value);

  /**
   * Returns the value of the '<em><b>Domain Specific Types</b></em>' containment reference list.
   * The list contents are of type {@link br.ufes.mdd.umltextual.umlTextual.DomainSpecificType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain Specific Types</em>' containment reference list.
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getPackage_DomainSpecificTypes()
   * @model containment="true"
   * @generated
   */
  EList<DomainSpecificType> getDomainSpecificTypes();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link br.ufes.mdd.umltextual.umlTextual.Element}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getPackage_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // Package
