/*
* 
*/
package TraceMetamodelEli5.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class TraceMetamodelEli5NavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 2003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 2002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorItem) {
			TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorItem item = (TraceMetamodelEli5.diagram.navigator.TraceMetamodelEli5NavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return TraceMetamodelEli5.diagram.part.TraceMetamodelEli5VisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
