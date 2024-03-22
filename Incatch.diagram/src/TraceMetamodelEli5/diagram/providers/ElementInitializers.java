/*
 * 
 */
package TraceMetamodelEli5.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = TraceMetamodelEli5.diagram.part.TraceMetamodelEli5DiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			TraceMetamodelEli5.diagram.part.TraceMetamodelEli5DiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
