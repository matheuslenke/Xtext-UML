/**
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.umlTextual;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.Actor#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.Actor#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.Actor#getActive <em>Active</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.Actor#getBusiness <em>Business</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.Actor#getParentActor <em>Parent Actor</em>}</li>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.Actor#getUseCases <em>Use Cases</em>}</li>
 * </ul>
 *
 * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends UseCaseElement
{
  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see #setVisibility(String)
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getActor_Visibility()
   * @model
   * @generated
   */
  String getVisibility();

  /**
   * Sets the value of the '{@link br.ufes.mdd.umltextual.umlTextual.Actor#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(String value);

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(String)
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getActor_Abstract()
   * @model
   * @generated
   */
  String getAbstract();

  /**
   * Sets the value of the '{@link br.ufes.mdd.umltextual.umlTextual.Actor#getAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #getAbstract()
   * @generated
   */
  void setAbstract(String value);

  /**
   * Returns the value of the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Active</em>' attribute.
   * @see #setActive(String)
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getActor_Active()
   * @model
   * @generated
   */
  String getActive();

  /**
   * Sets the value of the '{@link br.ufes.mdd.umltextual.umlTextual.Actor#getActive <em>Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Active</em>' attribute.
   * @see #getActive()
   * @generated
   */
  void setActive(String value);

  /**
   * Returns the value of the '<em><b>Business</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Business</em>' attribute.
   * @see #setBusiness(String)
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getActor_Business()
   * @model
   * @generated
   */
  String getBusiness();

  /**
   * Sets the value of the '{@link br.ufes.mdd.umltextual.umlTextual.Actor#getBusiness <em>Business</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Business</em>' attribute.
   * @see #getBusiness()
   * @generated
   */
  void setBusiness(String value);

  /**
   * Returns the value of the '<em><b>Parent Actor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Actor</em>' reference.
   * @see #setParentActor(Actor)
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getActor_ParentActor()
   * @model
   * @generated
   */
  Actor getParentActor();

  /**
   * Sets the value of the '{@link br.ufes.mdd.umltextual.umlTextual.Actor#getParentActor <em>Parent Actor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Actor</em>' reference.
   * @see #getParentActor()
   * @generated
   */
  void setParentActor(Actor value);

  /**
   * Returns the value of the '<em><b>Use Cases</b></em>' reference list.
   * The list contents are of type {@link br.ufes.mdd.umltextual.umlTextual.UseCase}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Cases</em>' reference list.
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getActor_UseCases()
   * @model
   * @generated
   */
  EList<UseCase> getUseCases();

} // Actor
