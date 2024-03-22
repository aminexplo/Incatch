/*
 * 
 */
package ConfigDsl.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ConfigDslEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ConfigDsl.diagram.part.ConfigDslVisualIDRegistry.getVisualID(view)) {

			case ConfigDsl.diagram.edit.parts.ConfigEditPart.VISUAL_ID:
				return new ConfigDsl.diagram.edit.parts.ConfigEditPart(view);

			case ConfigDsl.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
				return new ConfigDsl.diagram.edit.parts.ProjectEditPart(view);

			case ConfigDsl.diagram.edit.parts.ProjectNameEditPart.VISUAL_ID:
				return new ConfigDsl.diagram.edit.parts.ProjectNameEditPart(view);

			case ConfigDsl.diagram.edit.parts.SimpleStringFieldEditPart.VISUAL_ID:
				return new ConfigDsl.diagram.edit.parts.SimpleStringFieldEditPart(view);

			case ConfigDsl.diagram.edit.parts.SimpleStringFieldNameEditPart.VISUAL_ID:
				return new ConfigDsl.diagram.edit.parts.SimpleStringFieldNameEditPart(view);

			case ConfigDsl.diagram.edit.parts.DynamicListFieldEditPart.VISUAL_ID:
				return new ConfigDsl.diagram.edit.parts.DynamicListFieldEditPart(view);

			case ConfigDsl.diagram.edit.parts.DynamicListFieldNameEditPart.VISUAL_ID:
				return new ConfigDsl.diagram.edit.parts.DynamicListFieldNameEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
