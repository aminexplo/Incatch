/*
* 
*/
package ConstraintDsl.diagram.navigator;

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
public class ConstraintDslNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ConstraintDsl.diagram.part.ConstraintDslDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ConstraintDsl.diagram.part.ConstraintDslDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ConstraintDsl.diagram.navigator.ConstraintDslNavigatorItem
				&& !isOwnView(((ConstraintDsl.diagram.navigator.ConstraintDslNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ConstraintDsl.diagram.navigator.ConstraintDslNavigatorGroup) {
			ConstraintDsl.diagram.navigator.ConstraintDslNavigatorGroup group = (ConstraintDsl.diagram.navigator.ConstraintDslNavigatorGroup) element;
			return ConstraintDsl.diagram.part.ConstraintDslDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof ConstraintDsl.diagram.navigator.ConstraintDslNavigatorItem) {
			ConstraintDsl.diagram.navigator.ConstraintDslNavigatorItem navigatorItem = (ConstraintDsl.diagram.navigator.ConstraintDslNavigatorItem) element;
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
		switch (ConstraintDsl.diagram.part.ConstraintDslVisualIDRegistry.getVisualID(view)) {
		case ConstraintDsl.diagram.edit.parts.ConstraintCollectionEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?zombie.incatch.constraintdsl?ConstraintCollection", //$NON-NLS-1$
					ConstraintDsl.diagram.providers.ConstraintDslElementTypes.ConstraintCollection_1000);
		case ConstraintDsl.diagram.edit.parts.RangeRuleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?zombie.incatch.constraintdsl?RangeRule", //$NON-NLS-1$
					ConstraintDsl.diagram.providers.ConstraintDslElementTypes.RangeRule_2001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ConstraintDsl.diagram.part.ConstraintDslDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ConstraintDsl.diagram.providers.ConstraintDslElementTypes.isKnownElementType(elementType)) {
			image = ConstraintDsl.diagram.providers.ConstraintDslElementTypes.getImage(elementType);
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
		if (element instanceof ConstraintDsl.diagram.navigator.ConstraintDslNavigatorGroup) {
			ConstraintDsl.diagram.navigator.ConstraintDslNavigatorGroup group = (ConstraintDsl.diagram.navigator.ConstraintDslNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ConstraintDsl.diagram.navigator.ConstraintDslNavigatorItem) {
			ConstraintDsl.diagram.navigator.ConstraintDslNavigatorItem navigatorItem = (ConstraintDsl.diagram.navigator.ConstraintDslNavigatorItem) element;
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
		switch (ConstraintDsl.diagram.part.ConstraintDslVisualIDRegistry.getVisualID(view)) {
		case ConstraintDsl.diagram.edit.parts.ConstraintCollectionEditPart.VISUAL_ID:
			return getConstraintCollection_1000Text(view);
		case ConstraintDsl.diagram.edit.parts.RangeRuleEditPart.VISUAL_ID:
			return getRangeRule_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getConstraintCollection_1000Text(View view) {
		ConstraintDsl.ConstraintCollection domainModelElement = (ConstraintDsl.ConstraintCollection) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ConstraintDsl.diagram.part.ConstraintDslDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRangeRule_2001Text(View view) {
		IParser parser = ConstraintDsl.diagram.providers.ConstraintDslParserProvider.getParser(
				ConstraintDsl.diagram.providers.ConstraintDslElementTypes.RangeRule_2001,
				view.getElement() != null ? view.getElement() : view,
				ConstraintDsl.diagram.part.ConstraintDslVisualIDRegistry
						.getType(ConstraintDsl.diagram.edit.parts.RangeRuleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConstraintDsl.diagram.part.ConstraintDslDiagramEditorPlugin.getInstance()
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
		return ConstraintDsl.diagram.edit.parts.ConstraintCollectionEditPart.MODEL_ID
				.equals(ConstraintDsl.diagram.part.ConstraintDslVisualIDRegistry.getModelID(view));
	}

}
