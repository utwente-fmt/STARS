/*
 * 
 */
package sense.diagram.providers;

import sense.diagram.part.SenseDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = SenseDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			SenseDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
