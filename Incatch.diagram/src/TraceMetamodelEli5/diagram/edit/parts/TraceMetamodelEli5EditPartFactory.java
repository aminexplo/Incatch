/*
 * 
 */
package TraceMetamodelEli5.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class TraceMetamodelEli5EditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.getVisualID(view)) {

			case TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
				return new TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart(view);

			case TraceMetamodelEli5.diagram.edit.parts.RuleEditPart.VISUAL_ID:
				return new TraceMetamodelEli5.diagram.edit.parts.RuleEditPart(view);

			case TraceMetamodelEli5.diagram.edit.parts.RuleNameEditPart.VISUAL_ID:
				return new TraceMetamodelEli5.diagram.edit.parts.RuleNameEditPart(view);
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
