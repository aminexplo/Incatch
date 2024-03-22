/*
 * 
 */
package ConstraintDsl.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ConstraintDslEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ConstraintDsl.diagram.part.ConstraintDslVisualIDRegistry.getVisualID(view)) {

			case ConstraintDsl.diagram.edit.parts.ConstraintCollectionEditPart.VISUAL_ID:
				return new ConstraintDsl.diagram.edit.parts.ConstraintCollectionEditPart(view);

			case ConstraintDsl.diagram.edit.parts.RangeRuleEditPart.VISUAL_ID:
				return new ConstraintDsl.diagram.edit.parts.RangeRuleEditPart(view);

			case ConstraintDsl.diagram.edit.parts.RangeRuleNameEditPart.VISUAL_ID:
				return new ConstraintDsl.diagram.edit.parts.RangeRuleNameEditPart(view);
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
