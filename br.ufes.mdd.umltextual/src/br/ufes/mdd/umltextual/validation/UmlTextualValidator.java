/*
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.IResourceValidator;

import com.google.inject.Inject;

import br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage;
import br.ufes.mdd.umltextual.umlTextual.UseCaseDiagram;
import br.ufes.mdd.umltextual.umlTextual.Class;
import br.ufes.mdd.umltextual.umlTextual.Package;
import br.ufes.mdd.umltextual.umlTextual.Actor;
import br.ufes.mdd.umltextual.umlTextual.Attribute;
import br.ufes.mdd.umltextual.umlTextual.UseCaseElement;
import br.ufes.mdd.umltextual.umlTextual.UseCase;

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
	
	// Atributo deve começar com letra minúscula
	@Check
	public void checkClassStartsWithCapital(Attribute attr) {
		if (!Character.isLowerCase(attr.getName().charAt(0))) {
			warning("Attribute name should start with lowercase",
					UmlTextualPackage.Literals.ATTRIBUTE.getEStructuralFeature("name"));
		}
	}
	
	// Pacote não pode ser instanciável
	@Check
	public void checkPackageInstantiable(Package packageItem) {
		if(packageItem.getInstantiable().compareTo("instantiable") == 0 && packageItem.getType().compareTo("package") == 0) {
			error("Package cannot be instantiable", UmlTextualPackage.Literals.PACKAGE.getEStructuralFeature("instantiable"));
		}
	}
	
	// Classe não pode extender ela mesma
//	@Check
//	public void checkClassExtendsItself(Class classItem) {
//		if(classItem.getName().compareTo(classItem.getParentClass().getName()) == 0) {
//			error("Class cannot extends itself", UmlTextualPackage.Literals.CLASS.getEStructuralFeature("parentClass"));
//		}
//	}
	
	// Classe não pode extender ciclicamente
	@Check
	public void checkClassExtendsCyclic(Class classItem) {
		Class tartaruga = classItem.getParentClass();
		if(tartaruga == null) {return;}
		
		Class lebre = tartaruga.getParentClass();
		if(lebre == null) {return;}
	
		while(lebre != null) {
			if(tartaruga.getName().compareTo(lebre.getName()) == 0) {
				error("Class references contains cycle. Please analyse the inheritances", UmlTextualPackage.Literals.CLASS.getEStructuralFeature("parentClass"));
				return;
			}
			tartaruga = tartaruga.getParentClass();
			lebre = lebre.getParentClass();
			if(lebre == null) {break;}
			lebre = lebre.getParentClass();
		}
	}
	
	// Classes não podem possuir o mesmo nome
	@Check
	public void checkClassWithSameName(Class classItem) {
//		EObject rootElement = EcoreUtil2.getRootContainer(context);
//		List<Class> candidates = EcoreUtil2.getAllContentsOfType(rootElement, Class.class);
//		while(parentClass != null && parentClass.getName().compareTo(classItem.getName()) == 0) {
//			if (parentClass.getName().compareTo(classItem.getName()) == 0) {
//				error("Class cannot extends itself or have cyclic reference", UmlTextualPackage.Literals.PACKAGE.getEStructuralFeature("parentClass"));
//				break;
//			}
//			parentClass = parentClass.getParentClass();
//		}
	}
	
	// Usecases não podem ser referenciados várias vezes pelo mesmo ator
	@Check
	public void checkClassWithSameName(Actor actor) {

		List<UseCase> verifiedUseCases = new ArrayList<>();
		int i = 0;
		for (UseCase actorcase : actor.getUseCases()) {
			if(verifiedUseCases.contains(actorcase)) {
				error("Duplicated useCase", UmlTextualPackage.Literals.ACTOR.getEStructuralFeature("useCases"), i);
			} else {
				verifiedUseCases.add(actorcase);
			}
			i++;
		}
	}
	
	@Check
	public void checkDuplicatedUsecaseName(UseCaseDiagram caseDiagram) {
		
		int i = 0;
		List<String> verifiedCases = new ArrayList<>();
		List<String> verifiedActors = new ArrayList<>();
		for(UseCaseElement element : caseDiagram.getElements()) {
			if(element instanceof UseCase) {
				if (verifiedCases.contains(element.getName())) {
					error("Duplicated useCase name", UmlTextualPackage.Literals.USE_CASE_DIAGRAM.getEStructuralFeature("elements"), i );
				} else {
					verifiedCases.add(element.getName());
				}
			} else {
				if (verifiedActors.contains(element.getName())) {
					error("Duplicated Actor name", UmlTextualPackage.Literals.USE_CASE_DIAGRAM.getEStructuralFeature("elements"), i );
				} else {
					verifiedActors.add(element.getName());
				}
			}
			i++;
		}
	}
	
}
