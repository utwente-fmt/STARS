/**
 */
package sense;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sense.Channel#getName <em>Name</em>}</li>
 *   <li>{@link sense.Channel#getInitialTokens <em>Initial Tokens</em>}</li>
 *   <li>{@link sense.Channel#getSource <em>Source</em>}</li>
 *   <li>{@link sense.Channel#getSourceRate <em>Source Rate</em>}</li>
 *   <li>{@link sense.Channel#getTarget <em>Target</em>}</li>
 *   <li>{@link sense.Channel#getTargetRate <em>Target Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see sense.SensePackage#getChannel()
 * @model annotation="gmf.link source='source' target='target' target.decoration='arrow' label='name,initialTokens,sourceRate,targetRate' label.pattern='{0}: {2} --({1})-> {3}'"
 * @generated
 */
public interface Channel extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>"chan"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sense.SensePackage#getChannel_Name()
   * @model default="chan" required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sense.Channel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Initial Tokens</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Tokens</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Tokens</em>' attribute.
   * @see #setInitialTokens(BigDecimal)
   * @see sense.SensePackage#getChannel_InitialTokens()
   * @model default="0" required="true"
   * @generated
   */
  BigDecimal getInitialTokens();

  /**
   * Sets the value of the '{@link sense.Channel#getInitialTokens <em>Initial Tokens</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial Tokens</em>' attribute.
   * @see #getInitialTokens()
   * @generated
   */
  void setInitialTokens(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * It is bidirectional and its opposite is '{@link sense.Actor#getOutChannels <em>Out Channels</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Actor)
   * @see sense.SensePackage#getChannel_Source()
   * @see sense.Actor#getOutChannels
   * @model opposite="outChannels" required="true"
   * @generated
   */
  Actor getSource();

  /**
   * Sets the value of the '{@link sense.Channel#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Actor value);

  /**
   * Returns the value of the '<em><b>Source Rate</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Rate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Rate</em>' attribute.
   * @see #setSourceRate(BigDecimal)
   * @see sense.SensePackage#getChannel_SourceRate()
   * @model default="1" required="true"
   * @generated
   */
  BigDecimal getSourceRate();

  /**
   * Sets the value of the '{@link sense.Channel#getSourceRate <em>Source Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Rate</em>' attribute.
   * @see #getSourceRate()
   * @generated
   */
  void setSourceRate(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * It is bidirectional and its opposite is '{@link sense.Actor#getInChannels <em>In Channels</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Actor)
   * @see sense.SensePackage#getChannel_Target()
   * @see sense.Actor#getInChannels
   * @model opposite="inChannels" required="true"
   * @generated
   */
  Actor getTarget();

  /**
   * Sets the value of the '{@link sense.Channel#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Actor value);

  /**
   * Returns the value of the '<em><b>Target Rate</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Rate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Rate</em>' attribute.
   * @see #setTargetRate(BigDecimal)
   * @see sense.SensePackage#getChannel_TargetRate()
   * @model default="1" required="true"
   * @generated
   */
  BigDecimal getTargetRate();

  /**
   * Sets the value of the '{@link sense.Channel#getTargetRate <em>Target Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Rate</em>' attribute.
   * @see #getTargetRate()
   * @generated
   */
  void setTargetRate(BigDecimal value);

} // Channel
