/*
 * generated by Xtext 2.27.0
 */
package zombie.incatch.configdsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ConfigDslTextualStandaloneSetup extends ConfigDslTextualStandaloneSetupGenerated {

	public static void doSetup() {
		new ConfigDslTextualStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
