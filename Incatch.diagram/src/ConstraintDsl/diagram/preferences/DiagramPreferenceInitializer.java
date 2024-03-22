/*
 * 
 */
package ConstraintDsl.diagram.preferences;

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
		ConstraintDsl.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		ConstraintDsl.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		ConstraintDsl.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		ConstraintDsl.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		ConstraintDsl.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return ConstraintDsl.diagram.part.ConstraintDslDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
