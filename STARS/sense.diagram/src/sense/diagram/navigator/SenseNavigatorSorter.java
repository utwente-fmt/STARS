/*
 * 
 */
package sense.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import sense.diagram.part.SenseVisualIDRegistry;

/**
 * @generated
 */
public class SenseNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4005;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SenseNavigatorItem) {
			SenseNavigatorItem item = (SenseNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return SenseVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
