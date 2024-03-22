/*
* 
*/
package ConfigDsl.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ConfigDslNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 2005;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 2004;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ConfigDsl.diagram.navigator.ConfigDslNavigatorItem) {
			ConfigDsl.diagram.navigator.ConfigDslNavigatorItem item = (ConfigDsl.diagram.navigator.ConfigDslNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ConfigDsl.diagram.part.ConfigDslVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
