/*
* 
*/
package ConstraintDsl.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class ConstraintDslDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ConstraintDsl.diagram.part.ConstraintDslNodeDescriptor> getSemanticChildren(View view) {
		switch (ConstraintDsl.diagram.part.ConstraintDslVisualIDRegistry.getVisualID(view)) {
		case ConstraintDsl.diagram.edit.parts.ConstraintCollectionEditPart.VISUAL_ID:
			return getConstraintCollection_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConstraintDsl.diagram.part.ConstraintDslNodeDescriptor> getConstraintCollection_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ConstraintDsl.ConstraintCollection modelElement = (ConstraintDsl.ConstraintCollection) view.getElement();
		LinkedList<ConstraintDsl.diagram.part.ConstraintDslNodeDescriptor> result = new LinkedList<ConstraintDsl.diagram.part.ConstraintDslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRules().iterator(); it.hasNext();) {
			ConstraintDsl.Rule childElement = (ConstraintDsl.Rule) it.next();
			int visualID = ConstraintDsl.diagram.part.ConstraintDslVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ConstraintDsl.diagram.edit.parts.RangeRuleEditPart.VISUAL_ID) {
				result.add(new ConstraintDsl.diagram.part.ConstraintDslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConstraintDsl.diagram.part.ConstraintDslLinkDescriptor> getContainedLinks(View view) {
		switch (ConstraintDsl.diagram.part.ConstraintDslVisualIDRegistry.getVisualID(view)) {
		case ConstraintDsl.diagram.edit.parts.ConstraintCollectionEditPart.VISUAL_ID:
			return getConstraintCollection_1000ContainedLinks(view);
		case ConstraintDsl.diagram.edit.parts.RangeRuleEditPart.VISUAL_ID:
			return getRangeRule_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConstraintDsl.diagram.part.ConstraintDslLinkDescriptor> getIncomingLinks(View view) {
		switch (ConstraintDsl.diagram.part.ConstraintDslVisualIDRegistry.getVisualID(view)) {
		case ConstraintDsl.diagram.edit.parts.RangeRuleEditPart.VISUAL_ID:
			return getRangeRule_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConstraintDsl.diagram.part.ConstraintDslLinkDescriptor> getOutgoingLinks(View view) {
		switch (ConstraintDsl.diagram.part.ConstraintDslVisualIDRegistry.getVisualID(view)) {
		case ConstraintDsl.diagram.edit.parts.RangeRuleEditPart.VISUAL_ID:
			return getRangeRule_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConstraintDsl.diagram.part.ConstraintDslLinkDescriptor> getConstraintCollection_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConstraintDsl.diagram.part.ConstraintDslLinkDescriptor> getRangeRule_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConstraintDsl.diagram.part.ConstraintDslLinkDescriptor> getRangeRule_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConstraintDsl.diagram.part.ConstraintDslLinkDescriptor> getRangeRule_2001OutgoingLinks(
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

		public List<ConstraintDsl.diagram.part.ConstraintDslNodeDescriptor> getSemanticChildren(View view) {
			return ConstraintDslDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConstraintDsl.diagram.part.ConstraintDslLinkDescriptor> getContainedLinks(View view) {
			return ConstraintDslDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConstraintDsl.diagram.part.ConstraintDslLinkDescriptor> getIncomingLinks(View view) {
			return ConstraintDslDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConstraintDsl.diagram.part.ConstraintDslLinkDescriptor> getOutgoingLinks(View view) {
			return ConstraintDslDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
