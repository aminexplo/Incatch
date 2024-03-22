/*
* 
*/
package TraceMetamodelEli5.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ScenarioItemSemanticEditPolicy
		extends TraceMetamodelEli5.diagram.edit.policies.TraceMetamodelEli5BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ScenarioItemSemanticEditPolicy() {
		super(TraceMetamodelEli5.diagram.providers.TraceMetamodelEli5ElementTypes.Scenario_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TraceMetamodelEli5.diagram.providers.TraceMetamodelEli5ElementTypes.Rule_2001 == req.getElementType()) {
			return getGEFWrapper(new TraceMetamodelEli5.diagram.edit.commands.RuleCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
