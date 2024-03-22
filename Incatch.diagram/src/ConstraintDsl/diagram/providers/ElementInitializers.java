/*
 * 
 */
package ConstraintDsl.diagram.providers;

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
		ElementInitializers cached = ConstraintDsl.diagram.part.ConstraintDslDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ConstraintDsl.diagram.part.ConstraintDslDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
