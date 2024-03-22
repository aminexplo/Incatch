/*
* 
*/
package TraceMetamodelEli5.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class TraceMetamodelEli5DiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<TraceMetamodelEli5.diagram.part.TraceMetamodelEli5NodeDescriptor> getSemanticChildren(
			View view) {
		switch (TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.getVisualID(view)) {
		case TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return getScenario_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TraceMetamodelEli5.diagram.part.TraceMetamodelEli5NodeDescriptor> getScenario_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TraceMetamodelEli5.Scenario modelElement = (TraceMetamodelEli5.Scenario) view.getElement();
		LinkedList<TraceMetamodelEli5.diagram.part.TraceMetamodelEli5NodeDescriptor> result = new LinkedList<TraceMetamodelEli5.diagram.part.TraceMetamodelEli5NodeDescriptor>();
		for (Iterator<?> it = modelElement.getRules().iterator(); it.hasNext();) {
			TraceMetamodelEli5.Rule childElement = (TraceMetamodelEli5.Rule) it.next();
			int visualID = TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TraceMetamodelEli5.diagram.edit.parts.RuleEditPart.VISUAL_ID) {
				result.add(
						new TraceMetamodelEli5.diagram.part.TraceMetamodelEli5NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<TraceMetamodelEli5.diagram.part.TraceMetamodelEli5LinkDescriptor> getContainedLinks(View view) {
		switch (TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.getVisualID(view)) {
		case TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return getScenario_1000ContainedLinks(view);
		case TraceMetamodelEli5.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			return getRule_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TraceMetamodelEli5.diagram.part.TraceMetamodelEli5LinkDescriptor> getIncomingLinks(View view) {
		switch (TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.getVisualID(view)) {
		case TraceMetamodelEli5.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			return getRule_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TraceMetamodelEli5.diagram.part.TraceMetamodelEli5LinkDescriptor> getOutgoingLinks(View view) {
		switch (TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.getVisualID(view)) {
		case TraceMetamodelEli5.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			return getRule_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceMetamodelEli5.diagram.part.TraceMetamodelEli5LinkDescriptor> getScenario_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceMetamodelEli5.diagram.part.TraceMetamodelEli5LinkDescriptor> getRule_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceMetamodelEli5.diagram.part.TraceMetamodelEli5LinkDescriptor> getRule_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceMetamodelEli5.diagram.part.TraceMetamodelEli5LinkDescriptor> getRule_2001OutgoingLinks(
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

		public List<TraceMetamodelEli5.diagram.part.TraceMetamodelEli5NodeDescriptor> getSemanticChildren(View view) {
			return TraceMetamodelEli5DiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<TraceMetamodelEli5.diagram.part.TraceMetamodelEli5LinkDescriptor> getContainedLinks(View view) {
			return TraceMetamodelEli5DiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<TraceMetamodelEli5.diagram.part.TraceMetamodelEli5LinkDescriptor> getIncomingLinks(View view) {
			return TraceMetamodelEli5DiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<TraceMetamodelEli5.diagram.part.TraceMetamodelEli5LinkDescriptor> getOutgoingLinks(View view) {
			return TraceMetamodelEli5DiagramUpdater.getOutgoingLinks(view);
		}
	};

}
