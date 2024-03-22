/*
 * generated by Xtext 2.27.0
 */
package zombie.incatch.constraintdsl.ui;

import com.google.inject.Injector;
import constraintDslTextual.ui.internal.ConstraintDslTextualActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ConstraintDslTextualExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(ConstraintDslTextualActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		ConstraintDslTextualActivator activator = ConstraintDslTextualActivator.getInstance();
		return activator != null ? activator.getInjector(ConstraintDslTextualActivator.ZOMBIE_INCATCH_CONSTRAINTDSL_CONSTRAINTDSLTEXTUAL) : null;
	}

}
