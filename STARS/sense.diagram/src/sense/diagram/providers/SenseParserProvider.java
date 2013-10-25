/*
 * 
 */
package sense.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import sense.SensePackage;
import sense.diagram.edit.parts.ActorNameEditPart;
import sense.diagram.edit.parts.CapabilityTimeEditPart;
import sense.diagram.edit.parts.ChannelNameInitialTokensSourceEditPart;
import sense.diagram.edit.parts.ProcessorTypeNameCountEditPart;
import sense.diagram.parsers.MessageFormatParser;
import sense.diagram.part.SenseVisualIDRegistry;

/**
 * @generated
 */
public class SenseParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser actorName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getActorName_5001Parser() {
		if (actorName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { SensePackage.eINSTANCE
					.getActor_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorName_5001Parser = parser;
		}
		return actorName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser processorTypeNameCount_5003Parser;

	/**
	 * @generated
	 */
	private IParser getProcessorTypeNameCount_5003Parser() {
		if (processorTypeNameCount_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					SensePackage.eINSTANCE.getProcessorType_Name(),
					SensePackage.eINSTANCE.getProcessorType_Count() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}:{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}:{1}"); //$NON-NLS-1$
			processorTypeNameCount_5003Parser = parser;
		}
		return processorTypeNameCount_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser channelNameInitialTokensSourceRateTargetRate_6001Parser;

	/**
	 * @generated
	 */
	private IParser getChannelNameInitialTokensSourceRateTargetRate_6001Parser() {
		if (channelNameInitialTokensSourceRateTargetRate_6001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					SensePackage.eINSTANCE.getChannel_Name(),
					SensePackage.eINSTANCE.getChannel_InitialTokens(),
					SensePackage.eINSTANCE.getChannel_SourceRate(),
					SensePackage.eINSTANCE.getChannel_TargetRate() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}: {2} --({1})-> {3}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {2} --({1})-> {3}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {2} --({1})-> {3}"); //$NON-NLS-1$
			channelNameInitialTokensSourceRateTargetRate_6001Parser = parser;
		}
		return channelNameInitialTokensSourceRateTargetRate_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser capabilityTime_6003Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityTime_6003Parser() {
		if (capabilityTime_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { SensePackage.eINSTANCE
					.getCapability_Time() };
			MessageFormatParser parser = new MessageFormatParser(features);
			capabilityTime_6003Parser = parser;
		}
		return capabilityTime_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ActorNameEditPart.VISUAL_ID:
			return getActorName_5001Parser();
		case ProcessorTypeNameCountEditPart.VISUAL_ID:
			return getProcessorTypeNameCount_5003Parser();
		case ChannelNameInitialTokensSourceEditPart.VISUAL_ID:
			return getChannelNameInitialTokensSourceRateTargetRate_6001Parser();
		case CapabilityTimeEditPart.VISUAL_ID:
			return getCapabilityTime_6003Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(SenseVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SenseVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SenseElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
