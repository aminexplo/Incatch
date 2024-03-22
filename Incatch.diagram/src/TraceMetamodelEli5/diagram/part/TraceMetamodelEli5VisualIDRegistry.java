/*
* 
*/
package TraceMetamodelEli5.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TraceMetamodelEli5VisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "Incatch.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.MODEL_ID.equals(view.getType())) {
				return TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				TraceMetamodelEli5.diagram.part.TraceMetamodelEli5DiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TraceMetamodelEli5.TraceMetamodelEli5Package.eINSTANCE.getScenario().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((TraceMetamodelEli5.Scenario) domainElement)) {
			return TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry
				.getModelID(containerView);
		if (!TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.MODEL_ID.equals(containerModelID)
				&& !"tmelif".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			if (TraceMetamodelEli5.TraceMetamodelEli5Package.eINSTANCE.getRule()
					.isSuperTypeOf(domainElement.eClass())) {
				return TraceMetamodelEli5.diagram.edit.parts.RuleEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry
				.getModelID(containerView);
		if (!TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.MODEL_ID.equals(containerModelID)
				&& !"tmelif".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			if (TraceMetamodelEli5.diagram.edit.parts.RuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceMetamodelEli5.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			if (TraceMetamodelEli5.diagram.edit.parts.RuleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(TraceMetamodelEli5.Scenario element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case TraceMetamodelEli5.diagram.edit.parts.ScenarioEditPart.VISUAL_ID:
			return false;
		case TraceMetamodelEli5.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
