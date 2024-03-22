/*
 * 
 */
package ConfigDsl.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		ConfigDsl.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		ConfigDsl.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		ConfigDsl.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		ConfigDsl.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		ConfigDsl.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return ConfigDsl.diagram.part.ConfigDslDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
