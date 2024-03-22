/*
 * 
 */
package TraceMetamodelEli5.diagram.preferences;

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
		TraceMetamodelEli5.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		TraceMetamodelEli5.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		TraceMetamodelEli5.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		TraceMetamodelEli5.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		TraceMetamodelEli5.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return TraceMetamodelEli5.diagram.part.TraceMetamodelEli5DiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
