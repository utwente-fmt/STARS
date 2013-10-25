/**
 */
package sense;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sense.SenseModel#getActors <em>Actors</em>}</li>
 *   <li>{@link sense.SenseModel#getProcessors <em>Processors</em>}</li>
 *   <li>{@link sense.SenseModel#getChannels <em>Channels</em>}</li>
 *   <li>{@link sense.SenseModel#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see sense.SensePackage#getSenseModel()
 * @model
 * @generated
 */
public interface SenseModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
   * The list contents are of type {@link sense.Actor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actors</em>' containment reference list.
   * @see sense.SensePackage#getSenseModel_Actors()
   * @model containment="true"
   * @generated
   */
  EList<Actor> getActors();

  /**
   * Returns the value of the '<em><b>Processors</b></em>' containment reference list.
   * The list contents are of type {@link sense.ProcessorType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processors</em>' containment reference list.
   * @see sense.SensePackage#getSenseModel_Processors()
   * @model containment="true"
   * @generated
   */
  EList<ProcessorType> getProcessors();

  /**
   * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
   * The list contents are of type {@link sense.Channel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Channels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Channels</em>' containment reference list.
   * @see sense.SensePackage#getSenseModel_Channels()
   * @model containment="true"
   * @generated
   */
  EList<Channel> getChannels();

  /**
   * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
   * The list contents are of type {@link sense.Capability}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Capabilities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Capabilities</em>' containment reference list.
   * @see sense.SensePackage#getSenseModel_Capabilities()
   * @model containment="true"
   * @generated
   */
  EList<Capability> getCapabilities();

} // SenseModel
