/*
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.ide;

import br.ufes.mdd.umltextual.UmlTextualRuntimeModule;
import br.ufes.mdd.umltextual.UmlTextualStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class UmlTextualIdeSetup extends UmlTextualStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new UmlTextualRuntimeModule(), new UmlTextualIdeModule()));
	}
	
}