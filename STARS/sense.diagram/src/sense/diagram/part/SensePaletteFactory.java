/*
 * 
 */
package sense.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import sense.diagram.providers.SenseElementTypes;

/**
 * @generated
 */
public class SensePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createActor1CreationTool());
		paletteContainer.add(createProcessorType2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createCapability1CreationTool());
		paletteContainer.add(createChannel2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActor1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Actor1CreationTool_title,
				Messages.Actor1CreationTool_desc,
				Collections.singletonList(SenseElementTypes.Actor_2001));
		entry.setId("createActor1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SenseElementTypes
				.getImageDescriptor(SenseElementTypes.Actor_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcessorType2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ProcessorType2CreationTool_title,
				Messages.ProcessorType2CreationTool_desc,
				Collections.singletonList(SenseElementTypes.ProcessorType_2002));
		entry.setId("createProcessorType2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SenseElementTypes
				.getImageDescriptor(SenseElementTypes.ProcessorType_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCapability1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Capability1CreationTool_title,
				Messages.Capability1CreationTool_desc,
				Collections.singletonList(SenseElementTypes.Capability_4003));
		entry.setId("createCapability1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SenseElementTypes
				.getImageDescriptor(SenseElementTypes.Capability_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChannel2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Channel2CreationTool_title,
				Messages.Channel2CreationTool_desc,
				Collections.singletonList(SenseElementTypes.Channel_4001));
		entry.setId("createChannel2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SenseElementTypes
				.getImageDescriptor(SenseElementTypes.Channel_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
