/*
 * 
 */
package sense.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import sense.diagram.part.SenseVisualIDRegistry;

/**
 * @generated
 */
public class SenseEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SenseVisualIDRegistry.getVisualID(view)) {

			case SenseModelEditPart.VISUAL_ID:
				return new SenseModelEditPart(view);

			case ActorEditPart.VISUAL_ID:
				return new ActorEditPart(view);

			case ActorNameEditPart.VISUAL_ID:
				return new ActorNameEditPart(view);

			case ProcessorTypeEditPart.VISUAL_ID:
				return new ProcessorTypeEditPart(view);

			case ProcessorTypeNameCountEditPart.VISUAL_ID:
				return new ProcessorTypeNameCountEditPart(view);

			case ChannelEditPart.VISUAL_ID:
				return new ChannelEditPart(view);

			case ChannelNameInitialTokensSourceEditPart.VISUAL_ID:
				return new ChannelNameInitialTokensSourceEditPart(view);

			case CapabilityEditPart.VISUAL_ID:
				return new CapabilityEditPart(view);

			case CapabilityTimeEditPart.VISUAL_ID:
				return new CapabilityTimeEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
