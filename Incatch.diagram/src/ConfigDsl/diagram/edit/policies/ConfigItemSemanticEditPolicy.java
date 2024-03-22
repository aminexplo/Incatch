/*
* 
*/
package ConfigDsl.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ConfigItemSemanticEditPolicy extends ConfigDsl.diagram.edit.policies.ConfigDslBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ConfigItemSemanticEditPolicy() {
		super(ConfigDsl.diagram.providers.ConfigDslElementTypes.Config_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConfigDsl.diagram.providers.ConfigDslElementTypes.Project_2001 == req.getElementType()) {
			return getGEFWrapper(new ConfigDsl.diagram.edit.commands.ProjectCreateCommand(req));
		}
		if (ConfigDsl.diagram.providers.ConfigDslElementTypes.SimpleStringField_2002 == req.getElementType()) {
			return getGEFWrapper(new ConfigDsl.diagram.edit.commands.SimpleStringFieldCreateCommand(req));
		}
		if (ConfigDsl.diagram.providers.ConfigDslElementTypes.DynamicListField_2003 == req.getElementType()) {
			return getGEFWrapper(new ConfigDsl.diagram.edit.commands.DynamicListFieldCreateCommand(req));
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
