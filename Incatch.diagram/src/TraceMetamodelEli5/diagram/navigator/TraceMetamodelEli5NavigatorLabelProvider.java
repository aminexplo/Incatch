/*
* 
*/
package TraceMetamodelEli5.diagram.navigator;

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
public class TraceMetamodelEli5NavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		TraceMetamodelEli5.diagram.part.TraceMetamodelEli5DiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		TraceMetamodelEli5.diagram.part.TraceMetamodelEli5DiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorItem && !isOwnView(
				((TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorGroup) {
			TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorGroup group = (TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorGroup) element;
			return TraceMetamodelEli5.diagram.part.TraceMetamodelEli5DiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorItem) {
			TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorItem navigatorItem = (TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorItem) element;
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
		switch (TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.getVisualID(view)) {
		case TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?zombie.incatch.tracemetamodeleli5?Scenario", //$NON-NLS-1$
					TraceMetamodelEli5.diagram.providers.TraceMetamodelEli5ElementTypes.Scenario_1000);
		case TraceMetamodelEli5.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?zombie.incatch.tracemetamodeleli5?Rule", //$NON-NLS-1$
					TraceMetamodelEli5.diagram.providers.TraceMetamodelEli5ElementTypes.Rule_2001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TraceMetamodelEli5.diagram.part.TraceMetamodelEli5DiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && TraceMetamodelEli5.diagram.providers.TraceMetamodelEli5ElementTypes
				.isKnownElementType(elementType)) {
			image = TraceMetamodelEli5.diagram.providers.TraceMetamodelEli5ElementTypes.getImage(elementType);
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
		if (element instanceof TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorGroup) {
			TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorGroup group = (TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorItem) {
			TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorItem navigatorItem = (TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorItem) element;
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
		switch (TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.getVisualID(view)) {
		case TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return getScenario_1000Text(view);
		case TraceMetamodelEli5.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			return getRule_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getScenario_1000Text(View view) {
		TraceMetamodelEli5.Scenario domainModelElement = (TraceMetamodelEli5.Scenario) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TraceMetamodelEli5.diagram.part.TraceMetamodelEli5DiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRule_2001Text(View view) {
		IParser parser = TraceMetamodelEli5.diagram.providers.TraceMetamodelEli5ParserProvider.getParser(
				TraceMetamodelEli5.diagram.providers.TraceMetamodelEli5ElementTypes.Rule_2001,
				view.getElement() != null ? view.getElement() : view,
				TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry
						.getType(TraceMetamodelEli5.diagram.edit.parts.RuleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceMetamodelEli5.diagram.part.TraceMetamodelEli5DiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
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
		return TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.MODEL_ID
				.equals(TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.getModelID(view));
	}

}
