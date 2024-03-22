/*
* 
*/
package ConfigDsl.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class ConfigDslDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ConfigDsl.diagram.part.ConfigDslNodeDescriptor> getSemanticChildren(View view) {
		switch (ConfigDsl.diagram.part.ConfigDslVisualIDRegistry.getVisualID(view)) {
		case ConfigDsl.diagram.edit.parts.ConfigEditPart.VISUAL_ID:
			return getConfig_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConfigDsl.diagram.part.ConfigDslNodeDescriptor> getConfig_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ConfigDsl.Config modelElement = (ConfigDsl.Config) view.getElement();
		LinkedList<ConfigDsl.diagram.part.ConfigDslNodeDescriptor> result = new LinkedList<ConfigDsl.diagram.part.ConfigDslNodeDescriptor>();
		{
			ConfigDsl.Project childElement = modelElement.getProject();
			int visualID = ConfigDsl.diagram.part.ConfigDslVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConfigDsl.diagram.edit.parts.ProjectEditPart.VISUAL_ID) {
				result.add(new ConfigDsl.diagram.part.ConfigDslNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getSimpleStringFields().iterator(); it.hasNext();) {
			ConfigDsl.SimpleStringField childElement = (ConfigDsl.SimpleStringField) it.next();
			int visualID = ConfigDsl.diagram.part.ConfigDslVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConfigDsl.diagram.edit.parts.SimpleStringFieldEditPart.VISUAL_ID) {
				result.add(new ConfigDsl.diagram.part.ConfigDslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDynamicListFields().iterator(); it.hasNext();) {
			ConfigDsl.DynamicListField childElement = (ConfigDsl.DynamicListField) it.next();
			int visualID = ConfigDsl.diagram.part.ConfigDslVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConfigDsl.diagram.edit.parts.DynamicListFieldEditPart.VISUAL_ID) {
				result.add(new ConfigDsl.diagram.part.ConfigDslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getContainedLinks(View view) {
		switch (ConfigDsl.diagram.part.ConfigDslVisualIDRegistry.getVisualID(view)) {
		case ConfigDsl.diagram.edit.parts.ConfigEditPart.VISUAL_ID:
			return getConfig_1000ContainedLinks(view);
		case ConfigDsl.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getProject_2001ContainedLinks(view);
		case ConfigDsl.diagram.edit.parts.SimpleStringFieldEditPart.VISUAL_ID:
			return getSimpleStringField_2002ContainedLinks(view);
		case ConfigDsl.diagram.edit.parts.DynamicListFieldEditPart.VISUAL_ID:
			return getDynamicListField_2003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getIncomingLinks(View view) {
		switch (ConfigDsl.diagram.part.ConfigDslVisualIDRegistry.getVisualID(view)) {
		case ConfigDsl.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getProject_2001IncomingLinks(view);
		case ConfigDsl.diagram.edit.parts.SimpleStringFieldEditPart.VISUAL_ID:
			return getSimpleStringField_2002IncomingLinks(view);
		case ConfigDsl.diagram.edit.parts.DynamicListFieldEditPart.VISUAL_ID:
			return getDynamicListField_2003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getOutgoingLinks(View view) {
		switch (ConfigDsl.diagram.part.ConfigDslVisualIDRegistry.getVisualID(view)) {
		case ConfigDsl.diagram.edit.parts.ProjectEditPart.VISUAL_ID:
			return getProject_2001OutgoingLinks(view);
		case ConfigDsl.diagram.edit.parts.SimpleStringFieldEditPart.VISUAL_ID:
			return getSimpleStringField_2002OutgoingLinks(view);
		case ConfigDsl.diagram.edit.parts.DynamicListFieldEditPart.VISUAL_ID:
			return getDynamicListField_2003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getConfig_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getProject_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getSimpleStringField_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getDynamicListField_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getProject_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getSimpleStringField_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getDynamicListField_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getProject_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getSimpleStringField_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getDynamicListField_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ConfigDsl.diagram.part.ConfigDslNodeDescriptor> getSemanticChildren(View view) {
			return ConfigDslDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getContainedLinks(View view) {
			return ConfigDslDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getIncomingLinks(View view) {
			return ConfigDslDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConfigDsl.diagram.part.ConfigDslLinkDescriptor> getOutgoingLinks(View view) {
			return ConfigDslDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
