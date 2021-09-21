/**
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.umlTextual.util;

import br.ufes.mdd.umltextual.umlTextual.Actor;
import br.ufes.mdd.umltextual.umlTextual.ActorUseCaseAssociation;
import br.ufes.mdd.umltextual.umlTextual.Aggregation;
import br.ufes.mdd.umltextual.umlTextual.Association;
import br.ufes.mdd.umltextual.umlTextual.AssociationConnector;
import br.ufes.mdd.umltextual.umlTextual.Attribute;
import br.ufes.mdd.umltextual.umlTextual.AttributeType;
import br.ufes.mdd.umltextual.umlTextual.Composition;
import br.ufes.mdd.umltextual.umlTextual.DomainSpecificType;
import br.ufes.mdd.umltextual.umlTextual.Element;
import br.ufes.mdd.umltextual.umlTextual.Interface;
import br.ufes.mdd.umltextual.umlTextual.Method;
import br.ufes.mdd.umltextual.umlTextual.Model;
import br.ufes.mdd.umltextual.umlTextual.ModelElement;
import br.ufes.mdd.umltextual.umlTextual.Parameter;
import br.ufes.mdd.umltextual.umlTextual.Subsystem;
import br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage;
import br.ufes.mdd.umltextual.umlTextual.UseCase;
import br.ufes.mdd.umltextual.umlTextual.UseCaseDiagram;
import br.ufes.mdd.umltextual.umlTextual.UseCaseElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage
 * @generated
 */
public class UmlTextualAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UmlTextualPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmlTextualAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = UmlTextualPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UmlTextualSwitch<Adapter> modelSwitch =
    new UmlTextualSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseModelElement(ModelElement object)
      {
        return createModelElementAdapter();
      }
      @Override
      public Adapter casePackage(br.ufes.mdd.umltextual.umlTextual.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseSubsystem(Subsystem object)
      {
        return createSubsystemAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseClass(br.ufes.mdd.umltextual.umlTextual.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseInterface(Interface object)
      {
        return createInterfaceAdapter();
      }
      @Override
      public Adapter caseAttributeType(AttributeType object)
      {
        return createAttributeTypeAdapter();
      }
      @Override
      public Adapter caseDomainSpecificType(DomainSpecificType object)
      {
        return createDomainSpecificTypeAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseAssociationConnector(AssociationConnector object)
      {
        return createAssociationConnectorAdapter();
      }
      @Override
      public Adapter caseAssociation(Association object)
      {
        return createAssociationAdapter();
      }
      @Override
      public Adapter caseAggregation(Aggregation object)
      {
        return createAggregationAdapter();
      }
      @Override
      public Adapter caseComposition(Composition object)
      {
        return createCompositionAdapter();
      }
      @Override
      public Adapter caseUseCaseDiagram(UseCaseDiagram object)
      {
        return createUseCaseDiagramAdapter();
      }
      @Override
      public Adapter caseUseCaseElement(UseCaseElement object)
      {
        return createUseCaseElementAdapter();
      }
      @Override
      public Adapter caseActor(Actor object)
      {
        return createActorAdapter();
      }
      @Override
      public Adapter caseUseCase(UseCase object)
      {
        return createUseCaseAdapter();
      }
      @Override
      public Adapter caseActorUseCaseAssociation(ActorUseCaseAssociation object)
      {
        return createActorUseCaseAssociationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.ModelElement
   * @generated
   */
  public Adapter createModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.Subsystem <em>Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.Subsystem
   * @generated
   */
  public Adapter createSubsystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.Interface
   * @generated
   */
  public Adapter createInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.AttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.AttributeType
   * @generated
   */
  public Adapter createAttributeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.DomainSpecificType <em>Domain Specific Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.DomainSpecificType
   * @generated
   */
  public Adapter createDomainSpecificTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.AssociationConnector <em>Association Connector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.AssociationConnector
   * @generated
   */
  public Adapter createAssociationConnectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.Association
   * @generated
   */
  public Adapter createAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.Aggregation <em>Aggregation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.Aggregation
   * @generated
   */
  public Adapter createAggregationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.Composition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.Composition
   * @generated
   */
  public Adapter createCompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.UseCaseDiagram <em>Use Case Diagram</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.UseCaseDiagram
   * @generated
   */
  public Adapter createUseCaseDiagramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.UseCaseElement <em>Use Case Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.UseCaseElement
   * @generated
   */
  public Adapter createUseCaseElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.Actor
   * @generated
   */
  public Adapter createActorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.UseCase <em>Use Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.UseCase
   * @generated
   */
  public Adapter createUseCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufes.mdd.umltextual.umlTextual.ActorUseCaseAssociation <em>Actor Use Case Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufes.mdd.umltextual.umlTextual.ActorUseCaseAssociation
   * @generated
   */
  public Adapter createActorUseCaseAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //UmlTextualAdapterFactory
