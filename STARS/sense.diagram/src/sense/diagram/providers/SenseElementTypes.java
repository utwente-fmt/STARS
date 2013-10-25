/*
 * 
 */
package sense.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import sense.SensePackage;
import sense.diagram.edit.parts.ActorEditPart;
import sense.diagram.edit.parts.CapabilityEditPart;
import sense.diagram.edit.parts.ChannelEditPart;
import sense.diagram.edit.parts.ProcessorTypeEditPart;
import sense.diagram.edit.parts.SenseModelEditPart;
import sense.diagram.part.SenseDiagramEditorPlugin;

/**
 * @generated
 */
public class SenseElementTypes {

	/**
	 * @generated
	 */
	private SenseElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			SenseDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType SenseModel_1000 = getElementType("sense.diagram.SenseModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Actor_2001 = getElementType("sense.diagram.Actor_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProcessorType_2002 = getElementType("sense.diagram.ProcessorType_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Channel_4001 = getElementType("sense.diagram.Channel_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capability_4003 = getElementType("sense.diagram.Capability_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(SenseModel_1000,
					SensePackage.eINSTANCE.getSenseModel());

			elements.put(Actor_2001, SensePackage.eINSTANCE.getActor());

			elements.put(ProcessorType_2002,
					SensePackage.eINSTANCE.getProcessorType());

			elements.put(Channel_4001, SensePackage.eINSTANCE.getChannel());

			elements.put(Capability_4003,
					SensePackage.eINSTANCE.getCapability());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(SenseModel_1000);
			KNOWN_ELEMENT_TYPES.add(Actor_2001);
			KNOWN_ELEMENT_TYPES.add(ProcessorType_2002);
			KNOWN_ELEMENT_TYPES.add(Channel_4001);
			KNOWN_ELEMENT_TYPES.add(Capability_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SenseModelEditPart.VISUAL_ID:
			return SenseModel_1000;
		case ActorEditPart.VISUAL_ID:
			return Actor_2001;
		case ProcessorTypeEditPart.VISUAL_ID:
			return ProcessorType_2002;
		case ChannelEditPart.VISUAL_ID:
			return Channel_4001;
		case CapabilityEditPart.VISUAL_ID:
			return Capability_4003;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return sense.diagram.providers.SenseElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return sense.diagram.providers.SenseElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return sense.diagram.providers.SenseElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
