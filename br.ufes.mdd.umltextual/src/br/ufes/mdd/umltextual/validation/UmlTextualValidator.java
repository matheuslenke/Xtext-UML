/*
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.IResourceValidator;

import com.google.inject.Inject;

import br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage;
import br.ufes.mdd.umltextual.umlTextual.UseCaseDiagram;
import br.ufes.mdd.umltextual.umlTextual.Class;
import br.ufes.mdd.umltextual.umlTextual.DomainSpecificType;
import br.ufes.mdd.umltextual.umlTextual.Package;
import br.ufes.mdd.umltextual.umlTextual.Parameter;
import br.ufes.mdd.umltextual.umlTextual.Actor;
import br.ufes.mdd.umltextual.umlTextual.Attribute;
import br.ufes.mdd.umltextual.umlTextual.UseCaseElement;
import br.ufes.mdd.umltextual.umlTextual.UseCase;
import br.ufes.mdd.umltextual.umlTextual.Element;
import br.ufes.mdd.umltextual.umlTextual.Interface;
import br.ufes.mdd.umltextual.umlTextual.Method;
import br.ufes.mdd.umltextual.umlTextual.Model;
import br.ufes.mdd.umltextual.umlTextual.ModelElement;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class UmlTextualValidator extends AbstractUmlTextualValidator {
	
	@Inject IResourceValidator resourceValidator;
	
//	public static final String INVALID_NAME = "invalidName";
	
	// Pacotes devem começar com letra maiúscula
	@Check
	public void checkPackageStartsWithCapital(Package packageItem) {
		if (!Character.isUpperCase(packageItem.getName().charAt(0))) {
			warning("Package name should start with a capital",
					UmlTextualPackage.Literals.PACKAGE.getEStructuralFeature("name"));
		}
	}
	
	// Classes devem começar com letra maiúscula
	@Check
	public void checkClassStartsWithCapital(Class classItem) {
		if (!Character.isUpperCase(classItem.getName().charAt(0))) {
			warning("Class name should start with a capital",
					UmlTextualPackage.Literals.CLASS.getEStructuralFeature("name"));
		}
	}
	
	// Diagramas de casos de uso devem começar com letra maiúscula
	@Check
	public void checkUseCaseDiagramStartsWithCapital(UseCaseDiagram diagramItem) {
		if (!Character.isUpperCase(diagramItem.getName().charAt(0))) {
			warning("UseCase Diagram name should start with a capital",
					UmlTextualPackage.Literals.USE_CASE_DIAGRAM.getEStructuralFeature("name"));
		}
	}
	
	// Atributo deve começar com letra minúscula
	@Check
	public void checkAttributeLowercase(Attribute attr) {
		if (!Character.isLowerCase(attr.getName().charAt(0))) {
			warning("Attribute name should start with lowercase",
					UmlTextualPackage.Literals.ATTRIBUTE.getEStructuralFeature("name"));
		}
	}
	
	// Ator deve começar com letra maiúscula
	@Check
	public void checkActorStartsWithCapital(Actor actor) {
		if (!Character.isUpperCase(actor.getName().charAt(0))) {
			warning("Actor name should start with a capital",
					UmlTextualPackage.Literals.ACTOR.getEStructuralFeature("name"));
		}
	}
	
	// Caso de uso deve começar com letra maiúscula
	@Check
	public void checkUseCaseStartsWithCapital(UseCase usecase) {
		if (!Character.isUpperCase(usecase.getName().charAt(0))) {
			warning("UseCase name should start with a capital",
					UmlTextualPackage.Literals.USE_CASE.getEStructuralFeature("name"));
		}
	}
	
	// Pacote não pode ser instanciável
	@Check
	public void checkPackageInstantiable(Package packageItem) {
		if(packageItem.getInstantiable().compareTo("instantiable") == 0 && packageItem.getType().compareTo("package") == 0) {
			error("Package cannot be instantiable", UmlTextualPackage.Literals.PACKAGE__INSTANTIABLE);
		}
	}
	
	// Pacote não pode depender dele mesmo ou ciclicamente
	@Check
	public void checkInterfaceExtendsCyclic(Package packageItem) {
		Package tartaruga = packageItem.getParentPackage();
		if(tartaruga == null) {return;}
		
		Package lebre = tartaruga.getParentPackage();
		if(lebre == null) {return;}
	
		while(lebre != null) {
			if(tartaruga.getName().compareTo(lebre.getName()) == 0) {
				error("Package dependency contains cycle. Please analyse the dependencies", UmlTextualPackage.Literals.PACKAGE__PARENT_PACKAGE);
				return;
			}
			tartaruga = tartaruga.getParentPackage();
			lebre = lebre.getParentPackage();
			if(lebre == null) {break;}
			lebre = lebre.getParentPackage();
		}
	}
	
	
	// Classe não pode extender ela mesma ou ciclicamente
	@Check
	public void checkClassExtendsCyclic(Class classItem) {
		Class tartaruga = classItem.getParentClass();
		if(tartaruga == null) {return;}
		
		Class lebre = tartaruga.getParentClass();
		if(lebre == null) {return;}
	
		while(lebre != null) {
			if(tartaruga.getName().compareTo(lebre.getName()) == 0) {
				error("Class extension contains cycle. Please analyse the inheritances", UmlTextualPackage.Literals.CLASS__PARENT_CLASS);
				return;
			}
			tartaruga = tartaruga.getParentClass();
			lebre = lebre.getParentClass();
			if(lebre == null) {break;}
			lebre = lebre.getParentClass();
		}
	}
	
	// Interface não pode extender ela mesma ou ciclicamente
	@Check
	public void checkInterfaceExtendsCyclic(Interface interfaceItem) {
		Interface tartaruga = interfaceItem.getParentInterface();
		if(tartaruga == null) {return;}
		
		Interface lebre = tartaruga.getParentInterface();
		if(lebre == null) {return;}
	
		while(lebre != null) {
			if(tartaruga.getName().compareTo(lebre.getName()) == 0) {
				error("Interface extension contains cycle. Please analyse the inheritances", UmlTextualPackage.Literals.INTERFACE__PARENT_INTERFACE);
				return;
			}
			tartaruga = tartaruga.getParentInterface();
			lebre = lebre.getParentInterface();
			if(lebre == null) {break;}
			lebre = lebre.getParentInterface();
		}
	}
	
	// Classes, interfaces e associações não podem possuir o mesmo nome
	@Check
	public void checkPackageElementWithSameName(Package packageItem) {
		Set<String> verifiedClasses = new HashSet<>();
//		Set<String> verifiedAssociations = new HashSet<>();
		Set<String> verifiedInterfaces = new HashSet<>();
		int i = 0;
		for (Element element : packageItem.getElements()) {
			// Verificação das classes
			if(element instanceof Class) {
				if(!verifiedClasses.add(element.getName())) {
					error("Duplicated Class", UmlTextualPackage.Literals.PACKAGE__ELEMENTS, i);
				}
			}
			// Verificação das associações
//			else if(element instanceof AssociationConnector) {
//				if(verifiedAssociations.contains(element.getName()) && element.getName().compareTo("unnamed") != 0) {
//					error("Duplicated Association", UmlTextualPackage.Literals.PACKAGE.getEStructuralFeature("elements"), i);
//				} else {
//					verifiedAssociations.add(element.getName());
//				}
//			}
			// Verificação das interfaces
			else if(element instanceof Interface) {
				if(!verifiedInterfaces.add(element.getName())) {
					error("Duplicated Interface", UmlTextualPackage.Literals.PACKAGE__ELEMENTS, i);
				}
			}
			
			i++;
		}
		
	}
	
	// Classe não pode implementar a mesma interface multiplas vezes
	@Check
	public void checkClassImplementsDuplicatedInterface(Class classItem) {
		Set<String> verifiedInterfaces = new HashSet<>();
		int i = 0;
		for (Interface interfaceElement : classItem.getInterfaces()) {
			if(!verifiedInterfaces.add(interfaceElement.getName())) {
				error("Duplicated Interface implementation", UmlTextualPackage.Literals.CLASS__INTERFACES, i);
			}
			i++;
		}
	}
	
	// Atributos não podem possuir nome repetido na mesma classe
	@Check
	public void checkDuplicatedAttributeName(Class classItem) {
		Set<String> verifiedAttributes = new HashSet<>();
		int i = 0;
		for (Attribute attElement : classItem.getAttributes()) {
			if(!verifiedAttributes.add(attElement.getName())) {
				error("Duplicated Attribute declaration", UmlTextualPackage.Literals.CLASS__ATTRIBUTES, i);
			}
			i++;
		}
	}
	
	// Métodos não podem possuir nome duplicado
	@Check
	public void checkDuplicatedFunctionName(Class classItem) {
		Set<String> verifiedMethods = new HashSet<>();
		int i = 0;
		for (Method methodElement : classItem.getMethods()) {
			if(!verifiedMethods.add(methodElement.getName())) {
				error("Duplicated Method declaration", UmlTextualPackage.Literals.CLASS__METHODS, i);
			}
			i++;
		}
	}
	
	// Métodos não podem possuir atributos com o mesmo nome
	@Check
	public void checkDuplicatedFunctionName(Method methodItem) {
		Set<String> verifiedParameters = new HashSet<>();
		int i = 0;
		for (Parameter attElement : methodItem.getParameters()) {
			if(!verifiedParameters.add(attElement.getName())) {
				error("Duplicated Parameter declaration", UmlTextualPackage.Literals.METHOD__PARAMETERS, i);
			}
			i++;
		}
	}
	
	// Usecases não podem ser referenciados várias vezes pelo mesmo ator
	@Check
	public void checkDuplicatedActorUseCaseReference(Actor actor) {

		Set<String> verifiedUseCases = new HashSet<>();
		int i = 0;
		for (UseCase actorcase : actor.getUseCases()) {
			if(!verifiedUseCases.add(actorcase.getName())) {
				error("Duplicated useCase reference", UmlTextualPackage.Literals.ACTOR__USE_CASES, i);
			}
			i++;
		}
	}
	
	// Usecases não podem ser referenciados várias vezes pelo mesmo ator
	@Check
	public void checkDuplicatedUseCaseIncludesExtendsReference(UseCase useCaseItem) {

		Set<UseCase> verifiedIncludes = new HashSet<>();
		Set<UseCase> verifiedExtends = new HashSet<>();
		int i = 0;
		for (UseCase useCase : useCaseItem.getIncludedUseCases()) {
			if(!verifiedIncludes.add(useCase)) {
				error("Duplicated include useCase reference", UmlTextualPackage.Literals.USE_CASE__INCLUDED_USE_CASES, i);
			}
			i++;
		}
		i = 0;
		for (UseCase useCase : useCaseItem.getExtendedUseCases()) {
			if(!verifiedExtends.add(useCase)) {
				error("Duplicated extends useCase reference", UmlTextualPackage.Literals.USE_CASE__EXTENDED_USE_CASES, i);
			} else if (verifiedIncludes.contains(useCase)) {
				error("Extended useCase was already included", UmlTextualPackage.Literals.USE_CASE__EXTENDED_USE_CASES, i);
			}
			i++;
		}
	}
	
	
	// Checar se casos de uso e atores possuem nomes repetidos
	@Check
	public void checkDuplicatedUsecaseName(UseCaseDiagram caseDiagram) {
		
		int i = 0;
		List<String> verifiedCases = new ArrayList<>();
		List<String> verifiedActors = new ArrayList<>();
		for(UseCaseElement element : caseDiagram.getElements()) {
			if(element instanceof UseCase) {
				if (verifiedCases.contains(element.getName())) {
					error("Duplicated useCase name", UmlTextualPackage.Literals.USE_CASE_DIAGRAM__ELEMENTS, i );
				} else {
					verifiedCases.add(element.getName());
				}
			} else {
				if (verifiedActors.contains(element.getName())) {
					error("Duplicated Actor name", UmlTextualPackage.Literals.USE_CASE_DIAGRAM__ELEMENTS, i );
				} else {
					verifiedActors.add(element.getName());
				}
			}
			i++;
		}
	}
	
	// Pacotes e Diagramas de casos de uso não podem ter nomes repetidos
	@Check
	public void checkDuplicatedPackageAndUseCaseDiagramName(Model modelItem) {

		Set<String> verifiedPackages = new HashSet<>();
		Set<String> verifiedDiagrams = new HashSet<>();
		int i = 0;
		for (ModelElement element : modelItem.getElements()) {
			if(element instanceof Package) {
				if(verifiedPackages.contains(element.getName())) {
					error("Duplicated package name", UmlTextualPackage.Literals.MODEL__ELEMENTS, i);
				} else {
					verifiedPackages.add(element.getName());
				}
			} else 	if(element instanceof UseCaseDiagram) {
				if(verifiedDiagrams.contains(element.getName())) {
					error("Duplicated UseCase Diagram", UmlTextualPackage.Literals.MODEL__ELEMENTS, i);
				} else {
					verifiedDiagrams.add(element.getName());
				}
			}
			
			i++;
		}
	}
		
	// Tipos específicos de domínio não podem ter o mesmo nome
	@Check
	public void checkDuplicatedDomainSpecificTypeName(Package packageItem) {

		Set<String> verifiedTypes = new HashSet<>();
		int i = 0;
		for (DomainSpecificType type : packageItem.getDomainSpecificTypes()) {
			if(!verifiedTypes.add(type.getName())) {
				error("Duplicated Domain specific type name", UmlTextualPackage.Literals.PACKAGE__DOMAIN_SPECIFIC_TYPES, i);
			}
			i++;
		}
	}
	
	// Casos de uso não podem extender ou incluir a si mesmos
	@Check
	public void checkUseCaseRefersItself(UseCase useCaseItem) {

		int i = 0;
		for (UseCase usecase : useCaseItem.getIncludedUseCases()) {
			if(usecase.getName().compareTo(useCaseItem.getName()) == 0) {
				error("Usecase cannot include itself", UmlTextualPackage.Literals.USE_CASE__INCLUDED_USE_CASES, i);
			}
			i++;
		}
		i = 0;
		for (UseCase usecase : useCaseItem.getExtendedUseCases()) {
			if(usecase.getName().compareTo(useCaseItem.getName()) == 0) {
				error("Usecase cannot extend itself", UmlTextualPackage.Literals.USE_CASE__EXTENDED_USE_CASES, i);
			}
			
			i++;
		}
	}
	
	
	
}
