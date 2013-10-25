/*
 * 
 */
package sense.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import sense.diagram.edit.parts.ActorEditPart;
import sense.diagram.edit.parts.ActorNameEditPart;
import sense.diagram.edit.parts.CapabilityEditPart;
import sense.diagram.edit.parts.CapabilityTimeEditPart;
import sense.diagram.edit.parts.ChannelEditPart;
import sense.diagram.edit.parts.ChannelNameInitialTokensSourceEditPart;
import sense.diagram.edit.parts.ProcessorTypeEditPart;
import sense.diagram.edit.parts.ProcessorTypeNameCountEditPart;
import sense.diagram.edit.parts.SenseModelEditPart;
import sense.diagram.part.SenseDiagramEditorPlugin;
import sense.diagram.part.SenseVisualIDRegistry;
import sense.diagram.providers.SenseElementTypes;
import sense.diagram.providers.SenseParserProvider;

/**
 * @generated
 */
public class SenseNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		SenseDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		SenseDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SenseNavigatorItem
				&& !isOwnView(((SenseNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SenseNavigatorGroup) {
			SenseNavigatorGroup group = (SenseNavigatorGroup) element;
			return SenseDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof SenseNavigatorItem) {
			SenseNavigatorItem navigatorItem = (SenseNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (SenseVisualIDRegistry.getVisualID(view)) {
		case SenseModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?sense?SenseModel", SenseElementTypes.SenseModel_1000); //$NON-NLS-1$
		case ActorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?sense?Actor", SenseElementTypes.Actor_2001); //$NON-NLS-1$
		case ProcessorTypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?sense?ProcessorType", SenseElementTypes.ProcessorType_2002); //$NON-NLS-1$
		case ChannelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?sense?Channel", SenseElementTypes.Channel_4001); //$NON-NLS-1$
		case CapabilityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?sense?Capability", SenseElementTypes.Capability_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SenseDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& SenseElementTypes.isKnownElementType(elementType)) {
			image = SenseElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof SenseNavigatorGroup) {
			SenseNavigatorGroup group = (SenseNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SenseNavigatorItem) {
			SenseNavigatorItem navigatorItem = (SenseNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (SenseVisualIDRegistry.getVisualID(view)) {
		case SenseModelEditPart.VISUAL_ID:
			return getSenseModel_1000Text(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2001Text(view);
		case ProcessorTypeEditPart.VISUAL_ID:
			return getProcessorType_2002Text(view);
		case ChannelEditPart.VISUAL_ID:
			return getChannel_4001Text(view);
		case CapabilityEditPart.VISUAL_ID:
			return getCapability_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSenseModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getActor_2001Text(View view) {
		IParser parser = SenseParserProvider.getParser(
				SenseElementTypes.Actor_2001,
				view.getElement() != null ? view.getElement() : view,
				SenseVisualIDRegistry.getType(ActorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SenseDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProcessorType_2002Text(View view) {
		IParser parser = SenseParserProvider.getParser(
				SenseElementTypes.ProcessorType_2002,
				view.getElement() != null ? view.getElement() : view,
				SenseVisualIDRegistry
						.getType(ProcessorTypeNameCountEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SenseDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getChannel_4001Text(View view) {
		IParser parser = SenseParserProvider
				.getParser(
						SenseElementTypes.Channel_4001,
						view.getElement() != null ? view.getElement() : view,
						SenseVisualIDRegistry
								.getType(ChannelNameInitialTokensSourceEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SenseDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapability_4003Text(View view) {
		IParser parser = SenseParserProvider
				.getParser(SenseElementTypes.Capability_4003,
						view.getElement() != null ? view.getElement() : view,
						SenseVisualIDRegistry
								.getType(CapabilityTimeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SenseDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SenseModelEditPart.MODEL_ID.equals(SenseVisualIDRegistry
				.getModelID(view));
	}

}
