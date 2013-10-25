/**
 */
package sense;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sense.Capability#getTime <em>Time</em>}</li>
 *   <li>{@link sense.Capability#getProcessor <em>Processor</em>}</li>
 *   <li>{@link sense.Capability#getPerforms <em>Performs</em>}</li>
 * </ul>
 * </p>
 *
 * @see sense.SensePackage#getCapability()
 * @model annotation="gmf.link source='processor' target='performs' target.decoration='arrow' label='time'"
 * @generated
 */
public interface Capability extends EObject
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(BigDecimal)
   * @see sense.SensePackage#getCapability_Time()
   * @model default="1" required="true"
   * @generated
   */
  BigDecimal getTime();

  /**
   * Sets the value of the '{@link sense.Capability#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Processor</b></em>' reference.
   * It is bidirectional and its opposite is '{@link sense.ProcessorType#getCapabilities <em>Capabilities</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processor</em>' reference.
   * @see #setProcessor(ProcessorType)
   * @see sense.SensePackage#getCapability_Processor()
   * @see sense.ProcessorType#getCapabilities
   * @model opposite="capabilities" required="true"
   * @generated
   */
  ProcessorType getProcessor();

  /**
   * Sets the value of the '{@link sense.Capability#getProcessor <em>Processor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Processor</em>' reference.
   * @see #getProcessor()
   * @generated
   */
  void setProcessor(ProcessorType value);

  /**
   * Returns the value of the '<em><b>Performs</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Performs</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Performs</em>' reference.
   * @see #setPerforms(Actor)
   * @see sense.SensePackage#getCapability_Performs()
   * @model required="true"
   * @generated
   */
  Actor getPerforms();

  /**
   * Sets the value of the '{@link sense.Capability#getPerforms <em>Performs</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Performs</em>' reference.
   * @see #getPerforms()
   * @generated
   */
  void setPerforms(Actor value);

} // Capability
