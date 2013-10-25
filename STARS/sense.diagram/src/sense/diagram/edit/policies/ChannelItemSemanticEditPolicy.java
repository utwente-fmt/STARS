/*
 * 
 */
package sense.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import sense.diagram.providers.SenseElementTypes;

/**
 * @generated
 */
public class ChannelItemSemanticEditPolicy extends
		SenseBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ChannelItemSemanticEditPolicy() {
		super(SenseElementTypes.Channel_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
