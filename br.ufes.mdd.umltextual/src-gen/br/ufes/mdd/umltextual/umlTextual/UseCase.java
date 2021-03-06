/**
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.umlTextual;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.UseCase#getIncludedUseCases <em>Included Use Cases</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.UseCase#getExtendedUseCases <em>Extended Use Cases</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.UseCase#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends UseCaseElement
{
  /**
   * Returns the value of the '<em><b>Included Use Cases</b></em>' reference list.
   * The list contents are of type {@link br.ufes.mdd.umltextual.umlTextual.UseCase}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Included Use Cases</em>' reference list.
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getUseCase_IncludedUseCases()
   * @model
   * @generated
   */
  EList<UseCase> getIncludedUseCases();

  /**
   * Returns the value of the '<em><b>Extended Use Cases</b></em>' reference list.
   * The list contents are of type {@link br.ufes.mdd.umltextual.umlTextual.UseCase}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extended Use Cases</em>' reference list.
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getUseCase_ExtendedUseCases()
   * @model
   * @generated
   */
  EList<UseCase> getExtendedUseCases();

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getUseCase_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link br.ufes.mdd.umltextual.umlTextual.UseCase#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // UseCase
