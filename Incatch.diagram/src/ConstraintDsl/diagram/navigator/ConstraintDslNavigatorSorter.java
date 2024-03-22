/*
* 
*/
package ConstraintDsl.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ConstraintDslNavigatorSorter extends ViewerSorter {

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
		if (element instanceof ConstraintDsl.diagram.navigator.ConstraintDslNavigatorItem) {
			ConstraintDsl.diagram.navigator.ConstraintDslNavigatorItem item = (ConstraintDsl.diagram.navigator.ConstraintDslNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ConstraintDsl.diagram.part.ConstraintDslVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
