/*
 * 
 */
package sense.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import sense.diagram.edit.parts.SenseEditPartFactory;
import sense.diagram.edit.parts.SenseModelEditPart;
import sense.diagram.part.SenseVisualIDRegistry;

/**
 * @generated
 */
public class SenseEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public SenseEditPartProvider() {
		super(new SenseEditPartFactory(), SenseVisualIDRegistry.TYPED_INSTANCE,
				SenseModelEditPart.MODEL_ID);
	}

}
