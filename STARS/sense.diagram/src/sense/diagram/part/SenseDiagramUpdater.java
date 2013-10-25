/*
 * 
 */
package sense.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import sense.Actor;
import sense.Capability;
import sense.Channel;
import sense.ProcessorType;
import sense.SenseModel;
import sense.SensePackage;
import sense.diagram.edit.parts.ActorEditPart;
import sense.diagram.edit.parts.CapabilityEditPart;
import sense.diagram.edit.parts.ChannelEditPart;
import sense.diagram.edit.parts.ProcessorTypeEditPart;
import sense.diagram.edit.parts.SenseModelEditPart;
import sense.diagram.providers.SenseElementTypes;

/**
 * @generated
 */
public class SenseDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<SenseNodeDescriptor> getSemanticChildren(View view) {
		switch (SenseVisualIDRegistry.getVisualID(view)) {
		case SenseModelEditPart.VISUAL_ID:
			return getSenseModel_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SenseNodeDescriptor> getSenseModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SenseModel modelElement = (SenseModel) view.getElement();
		LinkedList<SenseNodeDescriptor> result = new LinkedList<SenseNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActors().iterator(); it.hasNext();) {
			Actor childElement = (Actor) it.next();
			int visualID = SenseVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActorEditPart.VISUAL_ID) {
				result.add(new SenseNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getProcessors().iterator(); it
				.hasNext();) {
			ProcessorType childElement = (ProcessorType) it.next();
			int visualID = SenseVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProcessorTypeEditPart.VISUAL_ID) {
				result.add(new SenseNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getContainedLinks(View view) {
		switch (SenseVisualIDRegistry.getVisualID(view)) {
		case SenseModelEditPart.VISUAL_ID:
			return getSenseModel_1000ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2001ContainedLinks(view);
		case ProcessorTypeEditPart.VISUAL_ID:
			return getProcessorType_2002ContainedLinks(view);
		case ChannelEditPart.VISUAL_ID:
			return getChannel_4001ContainedLinks(view);
		case CapabilityEditPart.VISUAL_ID:
			return getCapability_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getIncomingLinks(View view) {
		switch (SenseVisualIDRegistry.getVisualID(view)) {
		case ActorEditPart.VISUAL_ID:
			return getActor_2001IncomingLinks(view);
		case ProcessorTypeEditPart.VISUAL_ID:
			return getProcessorType_2002IncomingLinks(view);
		case ChannelEditPart.VISUAL_ID:
			return getChannel_4001IncomingLinks(view);
		case CapabilityEditPart.VISUAL_ID:
			return getCapability_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getOutgoingLinks(View view) {
		switch (SenseVisualIDRegistry.getVisualID(view)) {
		case ActorEditPart.VISUAL_ID:
			return getActor_2001OutgoingLinks(view);
		case ProcessorTypeEditPart.VISUAL_ID:
			return getProcessorType_2002OutgoingLinks(view);
		case ChannelEditPart.VISUAL_ID:
			return getChannel_4001OutgoingLinks(view);
		case CapabilityEditPart.VISUAL_ID:
			return getCapability_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getSenseModel_1000ContainedLinks(
			View view) {
		SenseModel modelElement = (SenseModel) view.getElement();
		LinkedList<SenseLinkDescriptor> result = new LinkedList<SenseLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Channel_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Capability_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getActor_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getProcessorType_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getChannel_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getCapability_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getActor_2001IncomingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SenseLinkDescriptor> result = new LinkedList<SenseLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Channel_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Capability_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getProcessorType_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getChannel_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getCapability_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getActor_2001OutgoingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		LinkedList<SenseLinkDescriptor> result = new LinkedList<SenseLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Channel_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getProcessorType_2002OutgoingLinks(
			View view) {
		ProcessorType modelElement = (ProcessorType) view.getElement();
		LinkedList<SenseLinkDescriptor> result = new LinkedList<SenseLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Capability_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getChannel_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SenseLinkDescriptor> getCapability_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<SenseLinkDescriptor> getContainedTypeModelFacetLinks_Channel_4001(
			SenseModel container) {
		LinkedList<SenseLinkDescriptor> result = new LinkedList<SenseLinkDescriptor>();
		for (Iterator<?> links = container.getChannels().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Channel) {
				continue;
			}
			Channel link = (Channel) linkObject;
			if (ChannelEditPart.VISUAL_ID != SenseVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor dst = link.getTarget();
			Actor src = link.getSource();
			result.add(new SenseLinkDescriptor(src, dst, link,
					SenseElementTypes.Channel_4001, ChannelEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SenseLinkDescriptor> getContainedTypeModelFacetLinks_Capability_4003(
			SenseModel container) {
		LinkedList<SenseLinkDescriptor> result = new LinkedList<SenseLinkDescriptor>();
		for (Iterator<?> links = container.getCapabilities().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Capability) {
				continue;
			}
			Capability link = (Capability) linkObject;
			if (CapabilityEditPart.VISUAL_ID != SenseVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor dst = link.getPerforms();
			ProcessorType src = link.getProcessor();
			result.add(new SenseLinkDescriptor(src, dst, link,
					SenseElementTypes.Capability_4003,
					CapabilityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SenseLinkDescriptor> getIncomingTypeModelFacetLinks_Channel_4001(
			Actor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SenseLinkDescriptor> result = new LinkedList<SenseLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SensePackage.eINSTANCE
					.getChannel_Target()
					|| false == setting.getEObject() instanceof Channel) {
				continue;
			}
			Channel link = (Channel) setting.getEObject();
			if (ChannelEditPart.VISUAL_ID != SenseVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor src = link.getSource();
			result.add(new SenseLinkDescriptor(src, target, link,
					SenseElementTypes.Channel_4001, ChannelEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SenseLinkDescriptor> getIncomingTypeModelFacetLinks_Capability_4003(
			Actor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SenseLinkDescriptor> result = new LinkedList<SenseLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SensePackage.eINSTANCE
					.getCapability_Performs()
					|| false == setting.getEObject() instanceof Capability) {
				continue;
			}
			Capability link = (Capability) setting.getEObject();
			if (CapabilityEditPart.VISUAL_ID != SenseVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ProcessorType src = link.getProcessor();
			result.add(new SenseLinkDescriptor(src, target, link,
					SenseElementTypes.Capability_4003,
					CapabilityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SenseLinkDescriptor> getOutgoingTypeModelFacetLinks_Channel_4001(
			Actor source) {
		SenseModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SenseModel) {
				container = (SenseModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SenseLinkDescriptor> result = new LinkedList<SenseLinkDescriptor>();
		for (Iterator<?> links = container.getChannels().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Channel) {
				continue;
			}
			Channel link = (Channel) linkObject;
			if (ChannelEditPart.VISUAL_ID != SenseVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor dst = link.getTarget();
			Actor src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new SenseLinkDescriptor(src, dst, link,
					SenseElementTypes.Channel_4001, ChannelEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SenseLinkDescriptor> getOutgoingTypeModelFacetLinks_Capability_4003(
			ProcessorType source) {
		SenseModel container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SenseModel) {
				container = (SenseModel) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SenseLinkDescriptor> result = new LinkedList<SenseLinkDescriptor>();
		for (Iterator<?> links = container.getCapabilities().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Capability) {
				continue;
			}
			Capability link = (Capability) linkObject;
			if (CapabilityEditPart.VISUAL_ID != SenseVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Actor dst = link.getPerforms();
			ProcessorType src = link.getProcessor();
			if (src != source) {
				continue;
			}
			result.add(new SenseLinkDescriptor(src, dst, link,
					SenseElementTypes.Capability_4003,
					CapabilityEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<SenseNodeDescriptor> getSemanticChildren(View view) {
			return SenseDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SenseLinkDescriptor> getContainedLinks(View view) {
			return SenseDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SenseLinkDescriptor> getIncomingLinks(View view) {
			return SenseDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<SenseLinkDescriptor> getOutgoingLinks(View view) {
			return SenseDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
