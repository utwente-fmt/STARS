/**
 */
package sense;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sense.Actor#getName <em>Name</em>}</li>
 *   <li>{@link sense.Actor#getInChannels <em>In Channels</em>}</li>
 *   <li>{@link sense.Actor#getOutChannels <em>Out Channels</em>}</li>
 * </ul>
 * </p>
 *
 * @see sense.SensePackage#getActor()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Actor extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>"act"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sense.SensePackage#getActor_Name()
   * @model default="act" required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sense.Actor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>In Channels</b></em>' reference list.
   * The list contents are of type {@link sense.Channel}.
   * It is bidirectional and its opposite is '{@link sense.Channel#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Channels</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Channels</em>' reference list.
   * @see sense.SensePackage#getActor_InChannels()
   * @see sense.Channel#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<Channel> getInChannels();

  /**
   * Returns the value of the '<em><b>Out Channels</b></em>' reference list.
   * The list contents are of type {@link sense.Channel}.
   * It is bidirectional and its opposite is '{@link sense.Channel#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Out Channels</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Out Channels</em>' reference list.
   * @see sense.SensePackage#getActor_OutChannels()
   * @see sense.Channel#getSource
   * @model opposite="source"
   * @generated
   */
  EList<Channel> getOutChannels();

} // Actor
