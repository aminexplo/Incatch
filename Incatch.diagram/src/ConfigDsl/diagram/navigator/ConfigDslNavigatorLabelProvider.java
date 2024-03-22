/*
* 
*/
package ConfigDsl.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class ConfigDslNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ConfigDsl.diagram.part.ConfigDslDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ConfigDsl.diagram.part.ConfigDslDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ConfigDsl.diagram.navigator.ConfigDslNavigatorItem
				&& !isOwnView(((ConfigDsl.diagram.navigator.ConfigDslNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ConfigDsl.diagram.navigator.ConfigDslNavigatorGroup) {
			ConfigDsl.diagram.navigator.ConfigDslNavigatorGroup group = (ConfigDsl.diagram.navigator.ConfigDslNavigatorGroup) element;
			return ConfigDsl.diagram.part.ConfigDslDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ConfigDsl.diagram.navigator.ConfigDslNavigatorItem) {
			ConfigDsl.diagram.navigator.ConfigDslNavigatorItem navigatorItem = (ConfigDsl.diagram.navigator.ConfigDslNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ConfigDsl.diagram.part.ConfigDslVisualIDRegistry.getVisualID(view)) {
		case ConfigDsl.diagram.edit.parts.ConfigEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?zombie.incatch.configdsl?Config", //$NON-NLS-1$
					ConfigDsl.diagram.providers.ConfigDslElementTypes.Config_1000);
		case ConfigDsl.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?zombie.incatch.configdsl?Project", //$NON-NLS-1$
					ConfigDsl.diagram.providers.ConfigDslElementTypes.Project_2001);
		case ConfigDsl.diagram.edit.parts.SimpleStringFieldEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?zombie.incatch.configdsl?SimpleStringField", //$NON-NLS-1$
					ConfigDsl.diagram.providers.ConfigDslElementTypes.SimpleStringField_2002);
		case ConfigDsl.diagram.edit.parts.DynamicListFieldEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?zombie.incatch.configdsl?DynamicListField", //$NON-NLS-1$
					ConfigDsl.diagram.providers.ConfigDslElementTypes.DynamicListField_2003);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ConfigDsl.diagram.part.ConfigDslDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ConfigDsl.diagram.providers.ConfigDslElementTypes.isKnownElementType(elementType)) {
			image = ConfigDsl.diagram.providers.ConfigDslElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ConfigDsl.diagram.navigator.ConfigDslNavigatorGroup) {
			ConfigDsl.diagram.navigator.ConfigDslNavigatorGroup group = (ConfigDsl.diagram.navigator.ConfigDslNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ConfigDsl.diagram.navigator.ConfigDslNavigatorItem) {
			ConfigDsl.diagram.navigator.ConfigDslNavigatorItem navigatorItem = (ConfigDsl.diagram.navigator.ConfigDslNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ConfigDsl.diagram.part.ConfigDslVisualIDRegistry.getVisualID(view)) {
		case ConfigDsl.diagram.edit.parts.ConfigEditPart.VISUAL_ID:
			return getConfig_1000Text(view);
		case ConfigDsl.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getProject_2001Text(view);
		case ConfigDsl.diagram.edit.parts.SimpleStringFieldEditPart.VISUAL_ID:
			return getSimpleStringField_2002Text(view);
		case ConfigDsl.diagram.edit.parts.DynamicListFieldEditPart.VISUAL_ID:
			return getDynamicListField_2003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getConfig_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getProject_2001Text(View view) {
		IParser parser = ConfigDsl.diagram.providers.ConfigDslParserProvider.getParser(
				ConfigDsl.diagram.providers.ConfigDslElementTypes.Project_2001,
				view.getElement() != null ? view.getElement() : view, ConfigDsl.diagram.part.ConfigDslVisualIDRegistry
						.getType(ConfigDsl.diagram.edit.parts.ProjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConfigDsl.diagram.part.ConfigDslDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSimpleStringField_2002Text(View view) {
		IParser parser = ConfigDsl.diagram.providers.ConfigDslParserProvider.getParser(
				ConfigDsl.diagram.providers.ConfigDslElementTypes.SimpleStringField_2002,
				view.getElement() != null ? view.getElement() : view, ConfigDsl.diagram.part.ConfigDslVisualIDRegistry
						.getType(ConfigDsl.diagram.edit.parts.SimpleStringFieldNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConfigDsl.diagram.part.ConfigDslDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDynamicListField_2003Text(View view) {
		IParser parser = ConfigDsl.diagram.providers.ConfigDslParserProvider.getParser(
				ConfigDsl.diagram.providers.ConfigDslElementTypes.DynamicListField_2003,
				view.getElement() != null ? view.getElement() : view, ConfigDsl.diagram.part.ConfigDslVisualIDRegistry
						.getType(ConfigDsl.diagram.edit.parts.DynamicListFieldNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConfigDsl.diagram.part.ConfigDslDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ConfigDsl.diagram.edit.parts.ConfigEditPart.MODEL_ID
				.equals(ConfigDsl.diagram.part.ConfigDslVisualIDRegistry.getModelID(view));
	}

}
