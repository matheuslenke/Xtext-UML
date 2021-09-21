/*
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.ui;

import br.ufes.mdd.umltextual.ui.internal.UmltextualActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UmlTextualExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(UmltextualActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		UmltextualActivator activator = UmltextualActivator.getInstance();
		return activator != null ? activator.getInjector(UmltextualActivator.BR_UFES_MDD_UMLTEXTUAL_UMLTEXTUAL) : null;
	}

}
