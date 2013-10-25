/*
 * 
 */
package sense.diagram.edit.parts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramDragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import sense.diagram.edit.commands.SenseCreateShortcutDecorationsCommand;
import sense.diagram.edit.policies.SenseModelCanonicalEditPolicy;
import sense.diagram.edit.policies.SenseModelItemSemanticEditPolicy;
import sense.diagram.part.SenseVisualIDRegistry;

/**
 * @generated
 */
public class SenseModelEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Sense"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public SenseModelEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SenseModelItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new SenseModelCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						SenseVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DiagramDragDropEditPolicy() {
					public Command getDropObjectsCommand(
							DropObjectsRequest dropRequest) {
						ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>();
						for (Iterator<?> it = dropRequest.getObjects()
								.iterator(); it.hasNext();) {
							Object nextObject = it.next();
							if (false == nextObject instanceof EObject) {
								continue;
							}
							viewDescriptors
									.add(new CreateViewRequest.ViewDescriptor(
											new EObjectAdapter(
													(EObject) nextObject),
											Node.class, null,
											getDiagramPreferencesHint()));
						}
						return createShortcutsCommand(dropRequest,
								viewDescriptors);
					}

					private Command createShortcutsCommand(
							DropObjectsRequest dropRequest,
							List<CreateViewRequest.ViewDescriptor> viewDescriptors) {
						Command command = createViewsAndArrangeCommand(
								dropRequest, viewDescriptors);
						if (command != null) {
							return command
									.chain(new ICommandProxy(
											new SenseCreateShortcutDecorationsCommand(
													getEditingDomain(),
													(View) getModel(),
													viewDescriptors)));
						}
						return null;
					}
				});
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

}
