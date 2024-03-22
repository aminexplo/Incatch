/*
 * 
 */
package ConfigDsl.diagram.providers;

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
		ElementInitializers cached = ConfigDsl.diagram.part.ConfigDslDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ConfigDsl.diagram.part.ConfigDslDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
