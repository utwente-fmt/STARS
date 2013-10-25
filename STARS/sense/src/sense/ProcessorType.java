/**
 */
package sense;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sense.ProcessorType#getName <em>Name</em>}</li>
 *   <li>{@link sense.ProcessorType#getCount <em>Count</em>}</li>
 *   <li>{@link sense.ProcessorType#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see sense.SensePackage#getProcessorType()
 * @model annotation="gmf.node label='name,count' label.pattern='{0}:{1}'"
 * @generated
 */
public interface ProcessorType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>"proc"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sense.SensePackage#getProcessorType_Name()
   * @model default="proc" required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sense.ProcessorType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Count</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Count</em>' attribute.
   * @see #setCount(int)
   * @see sense.SensePackage#getProcessorType_Count()
   * @model default="1"
   * @generated
   */
  int getCount();

  /**
   * Sets the value of the '{@link sense.ProcessorType#getCount <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' attribute.
   * @see #getCount()
   * @generated
   */
  void setCount(int value);

  /**
   * Returns the value of the '<em><b>Capabilities</b></em>' reference list.
   * The list contents are of type {@link sense.Capability}.
   * It is bidirectional and its opposite is '{@link sense.Capability#getProcessor <em>Processor</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Capabilities</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Capabilities</em>' reference list.
   * @see sense.SensePackage#getProcessorType_Capabilities()
   * @see sense.Capability#getProcessor
   * @model opposite="processor"
   * @generated
   */
  EList<Capability> getCapabilities();

} // ProcessorType
