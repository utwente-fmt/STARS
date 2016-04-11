/*
 * 
 */
package sense.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import sense.diagram.edit.commands.ActorCreateCommand;
import sense.diagram.edit.commands.ProcessorTypeCreateCommand;
import sense.diagram.providers.SenseElementTypes;

/**
 * @generated
 */
public class SenseModelItemSemanticEditPolicy extends
		SenseBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SenseModelItemSemanticEditPolicy() {
		super(SenseElementTypes.SenseModel_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SenseElementTypes.Actor_2001 == req.getElementType()) {
			return getGEFWrapper(new ActorCreateCommand(req));
		}
		if (SenseElementTypes.ProcessorType_2002 == req.getElementType()) {
			return getGEFWrapper(new ProcessorTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
