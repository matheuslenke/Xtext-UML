/**
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.umlTextual;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.mdd.umltextual.umlTextual.Model#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link br.ufes.mdd.umltextual.umlTextual.ModelElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage#getModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ModelElement> getElements();

} // Model
