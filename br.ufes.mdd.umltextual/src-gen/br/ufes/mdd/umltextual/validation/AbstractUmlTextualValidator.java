/*
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractUmlTextualValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(br.ufes.mdd.umltextual.umlTextual.UmlTextualPackage.eINSTANCE);
		return result;
	}
}
