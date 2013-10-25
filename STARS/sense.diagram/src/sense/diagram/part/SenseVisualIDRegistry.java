/*
 * 
 */
package sense.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import sense.SenseModel;
import sense.SensePackage;
import sense.diagram.edit.parts.ActorEditPart;
import sense.diagram.edit.parts.ActorNameEditPart;
import sense.diagram.edit.parts.CapabilityEditPart;
import sense.diagram.edit.parts.CapabilityTimeEditPart;
import sense.diagram.edit.parts.ChannelEditPart;
import sense.diagram.edit.parts.ChannelNameInitialTokensSourceEditPart;
import sense.diagram.edit.parts.ProcessorTypeEditPart;
import sense.diagram.edit.parts.ProcessorTypeNameCountEditPart;
import sense.diagram.edit.parts.SenseModelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SenseVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "sense.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SenseModelEditPart.MODEL_ID.equals(view.getType())) {
				return SenseModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return sense.diagram.part.SenseVisualIDRegistry.getVisualID(view
				.getType());
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
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				SenseDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
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
		if (SensePackage.eINSTANCE.getSenseModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((SenseModel) domainElement)) {
			return SenseModelEditPart.VISUAL_ID;
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
		String containerModelID = sense.diagram.part.SenseVisualIDRegistry
				.getModelID(containerView);
		if (!SenseModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"sense".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (SenseModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = sense.diagram.part.SenseVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SenseModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SenseModelEditPart.VISUAL_ID:
			if (SensePackage.eINSTANCE.getActor().isSuperTypeOf(
					domainElement.eClass())) {
				return ActorEditPart.VISUAL_ID;
			}
			if (SensePackage.eINSTANCE.getProcessorType().isSuperTypeOf(
					domainElement.eClass())) {
				return ProcessorTypeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = sense.diagram.part.SenseVisualIDRegistry
				.getModelID(containerView);
		if (!SenseModelEditPart.MODEL_ID.equals(containerModelID)
				&& !"sense".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (SenseModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = sense.diagram.part.SenseVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SenseModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SenseModelEditPart.VISUAL_ID:
			if (ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcessorTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorEditPart.VISUAL_ID:
			if (ActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProcessorTypeEditPart.VISUAL_ID:
			if (ProcessorTypeNameCountEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ChannelEditPart.VISUAL_ID:
			if (ChannelNameInitialTokensSourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CapabilityEditPart.VISUAL_ID:
			if (CapabilityTimeEditPart.VISUAL_ID == nodeVisualID) {
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
		if (SensePackage.eINSTANCE.getChannel().isSuperTypeOf(
				domainElement.eClass())) {
			return ChannelEditPart.VISUAL_ID;
		}
		if (SensePackage.eINSTANCE.getCapability().isSuperTypeOf(
				domainElement.eClass())) {
			return CapabilityEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(SenseModel element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
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
		case SenseModelEditPart.VISUAL_ID:
			return false;
		case ActorEditPart.VISUAL_ID:
		case ProcessorTypeEditPart.VISUAL_ID:
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
			return sense.diagram.part.SenseVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return sense.diagram.part.SenseVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return sense.diagram.part.SenseVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return sense.diagram.part.SenseVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return sense.diagram.part.SenseVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return sense.diagram.part.SenseVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
