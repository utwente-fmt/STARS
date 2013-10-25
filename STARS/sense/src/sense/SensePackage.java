/**
 */
package sense;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sense.SenseFactory
 * @model kind="package"
 * @generated
 */
public interface SensePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sense";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "sense";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SensePackage eINSTANCE = sense.impl.SensePackageImpl.init();

  /**
   * The meta object id for the '{@link sense.impl.SenseModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sense.impl.SenseModelImpl
   * @see sense.impl.SensePackageImpl#getSenseModel()
   * @generated
   */
  int SENSE_MODEL = 0;

  /**
   * The feature id for the '<em><b>Actors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSE_MODEL__ACTORS = 0;

  /**
   * The feature id for the '<em><b>Processors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSE_MODEL__PROCESSORS = 1;

  /**
   * The feature id for the '<em><b>Channels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSE_MODEL__CHANNELS = 2;

  /**
   * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSE_MODEL__CAPABILITIES = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENSE_MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link sense.impl.ActorImpl <em>Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sense.impl.ActorImpl
   * @see sense.impl.SensePackageImpl#getActor()
   * @generated
   */
  int ACTOR = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>In Channels</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__IN_CHANNELS = 1;

  /**
   * The feature id for the '<em><b>Out Channels</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__OUT_CHANNELS = 2;

  /**
   * The number of structural features of the '<em>Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link sense.impl.ProcessorTypeImpl <em>Processor Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sense.impl.ProcessorTypeImpl
   * @see sense.impl.SensePackageImpl#getProcessorType()
   * @generated
   */
  int PROCESSOR_TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSOR_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSOR_TYPE__COUNT = 1;

  /**
   * The feature id for the '<em><b>Capabilities</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSOR_TYPE__CAPABILITIES = 2;

  /**
   * The number of structural features of the '<em>Processor Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSOR_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link sense.impl.ChannelImpl <em>Channel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sense.impl.ChannelImpl
   * @see sense.impl.SensePackageImpl#getChannel()
   * @generated
   */
  int CHANNEL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Initial Tokens</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL__INITIAL_TOKENS = 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL__SOURCE = 2;

  /**
   * The feature id for the '<em><b>Source Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL__SOURCE_RATE = 3;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL__TARGET = 4;

  /**
   * The feature id for the '<em><b>Target Rate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL__TARGET_RATE = 5;

  /**
   * The number of structural features of the '<em>Channel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANNEL_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link sense.impl.CapabilityImpl <em>Capability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see sense.impl.CapabilityImpl
   * @see sense.impl.SensePackageImpl#getCapability()
   * @generated
   */
  int CAPABILITY = 4;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__TIME = 0;

  /**
   * The feature id for the '<em><b>Processor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__PROCESSOR = 1;

  /**
   * The feature id for the '<em><b>Performs</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__PERFORMS = 2;

  /**
   * The number of structural features of the '<em>Capability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link sense.SenseModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see sense.SenseModel
   * @generated
   */
  EClass getSenseModel();

  /**
   * Returns the meta object for the containment reference list '{@link sense.SenseModel#getActors <em>Actors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actors</em>'.
   * @see sense.SenseModel#getActors()
   * @see #getSenseModel()
   * @generated
   */
  EReference getSenseModel_Actors();

  /**
   * Returns the meta object for the containment reference list '{@link sense.SenseModel#getProcessors <em>Processors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Processors</em>'.
   * @see sense.SenseModel#getProcessors()
   * @see #getSenseModel()
   * @generated
   */
  EReference getSenseModel_Processors();

  /**
   * Returns the meta object for the containment reference list '{@link sense.SenseModel#getChannels <em>Channels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Channels</em>'.
   * @see sense.SenseModel#getChannels()
   * @see #getSenseModel()
   * @generated
   */
  EReference getSenseModel_Channels();

  /**
   * Returns the meta object for the containment reference list '{@link sense.SenseModel#getCapabilities <em>Capabilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Capabilities</em>'.
   * @see sense.SenseModel#getCapabilities()
   * @see #getSenseModel()
   * @generated
   */
  EReference getSenseModel_Capabilities();

  /**
   * Returns the meta object for class '{@link sense.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor</em>'.
   * @see sense.Actor
   * @generated
   */
  EClass getActor();

  /**
   * Returns the meta object for the attribute '{@link sense.Actor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sense.Actor#getName()
   * @see #getActor()
   * @generated
   */
  EAttribute getActor_Name();

  /**
   * Returns the meta object for the reference list '{@link sense.Actor#getInChannels <em>In Channels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>In Channels</em>'.
   * @see sense.Actor#getInChannels()
   * @see #getActor()
   * @generated
   */
  EReference getActor_InChannels();

  /**
   * Returns the meta object for the reference list '{@link sense.Actor#getOutChannels <em>Out Channels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Out Channels</em>'.
   * @see sense.Actor#getOutChannels()
   * @see #getActor()
   * @generated
   */
  EReference getActor_OutChannels();

  /**
   * Returns the meta object for class '{@link sense.ProcessorType <em>Processor Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Processor Type</em>'.
   * @see sense.ProcessorType
   * @generated
   */
  EClass getProcessorType();

  /**
   * Returns the meta object for the attribute '{@link sense.ProcessorType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sense.ProcessorType#getName()
   * @see #getProcessorType()
   * @generated
   */
  EAttribute getProcessorType_Name();

  /**
   * Returns the meta object for the attribute '{@link sense.ProcessorType#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see sense.ProcessorType#getCount()
   * @see #getProcessorType()
   * @generated
   */
  EAttribute getProcessorType_Count();

  /**
   * Returns the meta object for the reference list '{@link sense.ProcessorType#getCapabilities <em>Capabilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Capabilities</em>'.
   * @see sense.ProcessorType#getCapabilities()
   * @see #getProcessorType()
   * @generated
   */
  EReference getProcessorType_Capabilities();

  /**
   * Returns the meta object for class '{@link sense.Channel <em>Channel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Channel</em>'.
   * @see sense.Channel
   * @generated
   */
  EClass getChannel();

  /**
   * Returns the meta object for the attribute '{@link sense.Channel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see sense.Channel#getName()
   * @see #getChannel()
   * @generated
   */
  EAttribute getChannel_Name();

  /**
   * Returns the meta object for the attribute '{@link sense.Channel#getInitialTokens <em>Initial Tokens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial Tokens</em>'.
   * @see sense.Channel#getInitialTokens()
   * @see #getChannel()
   * @generated
   */
  EAttribute getChannel_InitialTokens();

  /**
   * Returns the meta object for the reference '{@link sense.Channel#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see sense.Channel#getSource()
   * @see #getChannel()
   * @generated
   */
  EReference getChannel_Source();

  /**
   * Returns the meta object for the attribute '{@link sense.Channel#getSourceRate <em>Source Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Rate</em>'.
   * @see sense.Channel#getSourceRate()
   * @see #getChannel()
   * @generated
   */
  EAttribute getChannel_SourceRate();

  /**
   * Returns the meta object for the reference '{@link sense.Channel#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see sense.Channel#getTarget()
   * @see #getChannel()
   * @generated
   */
  EReference getChannel_Target();

  /**
   * Returns the meta object for the attribute '{@link sense.Channel#getTargetRate <em>Target Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Rate</em>'.
   * @see sense.Channel#getTargetRate()
   * @see #getChannel()
   * @generated
   */
  EAttribute getChannel_TargetRate();

  /**
   * Returns the meta object for class '{@link sense.Capability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capability</em>'.
   * @see sense.Capability
   * @generated
   */
  EClass getCapability();

  /**
   * Returns the meta object for the attribute '{@link sense.Capability#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see sense.Capability#getTime()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Time();

  /**
   * Returns the meta object for the reference '{@link sense.Capability#getProcessor <em>Processor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Processor</em>'.
   * @see sense.Capability#getProcessor()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_Processor();

  /**
   * Returns the meta object for the reference '{@link sense.Capability#getPerforms <em>Performs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Performs</em>'.
   * @see sense.Capability#getPerforms()
   * @see #getCapability()
   * @generated
   */
  EReference getCapability_Performs();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SenseFactory getSenseFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link sense.impl.SenseModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sense.impl.SenseModelImpl
     * @see sense.impl.SensePackageImpl#getSenseModel()
     * @generated
     */
    EClass SENSE_MODEL = eINSTANCE.getSenseModel();

    /**
     * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENSE_MODEL__ACTORS = eINSTANCE.getSenseModel_Actors();

    /**
     * The meta object literal for the '<em><b>Processors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENSE_MODEL__PROCESSORS = eINSTANCE.getSenseModel_Processors();

    /**
     * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENSE_MODEL__CHANNELS = eINSTANCE.getSenseModel_Channels();

    /**
     * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENSE_MODEL__CAPABILITIES = eINSTANCE.getSenseModel_Capabilities();

    /**
     * The meta object literal for the '{@link sense.impl.ActorImpl <em>Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sense.impl.ActorImpl
     * @see sense.impl.SensePackageImpl#getActor()
     * @generated
     */
    EClass ACTOR = eINSTANCE.getActor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

    /**
     * The meta object literal for the '<em><b>In Channels</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR__IN_CHANNELS = eINSTANCE.getActor_InChannels();

    /**
     * The meta object literal for the '<em><b>Out Channels</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTOR__OUT_CHANNELS = eINSTANCE.getActor_OutChannels();

    /**
     * The meta object literal for the '{@link sense.impl.ProcessorTypeImpl <em>Processor Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sense.impl.ProcessorTypeImpl
     * @see sense.impl.SensePackageImpl#getProcessorType()
     * @generated
     */
    EClass PROCESSOR_TYPE = eINSTANCE.getProcessorType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESSOR_TYPE__NAME = eINSTANCE.getProcessorType_Name();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESSOR_TYPE__COUNT = eINSTANCE.getProcessorType_Count();

    /**
     * The meta object literal for the '<em><b>Capabilities</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESSOR_TYPE__CAPABILITIES = eINSTANCE.getProcessorType_Capabilities();

    /**
     * The meta object literal for the '{@link sense.impl.ChannelImpl <em>Channel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sense.impl.ChannelImpl
     * @see sense.impl.SensePackageImpl#getChannel()
     * @generated
     */
    EClass CHANNEL = eINSTANCE.getChannel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANNEL__NAME = eINSTANCE.getChannel_Name();

    /**
     * The meta object literal for the '<em><b>Initial Tokens</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANNEL__INITIAL_TOKENS = eINSTANCE.getChannel_InitialTokens();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANNEL__SOURCE = eINSTANCE.getChannel_Source();

    /**
     * The meta object literal for the '<em><b>Source Rate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANNEL__SOURCE_RATE = eINSTANCE.getChannel_SourceRate();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANNEL__TARGET = eINSTANCE.getChannel_Target();

    /**
     * The meta object literal for the '<em><b>Target Rate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANNEL__TARGET_RATE = eINSTANCE.getChannel_TargetRate();

    /**
     * The meta object literal for the '{@link sense.impl.CapabilityImpl <em>Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see sense.impl.CapabilityImpl
     * @see sense.impl.SensePackageImpl#getCapability()
     * @generated
     */
    EClass CAPABILITY = eINSTANCE.getCapability();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__TIME = eINSTANCE.getCapability_Time();

    /**
     * The meta object literal for the '<em><b>Processor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY__PROCESSOR = eINSTANCE.getCapability_Processor();

    /**
     * The meta object literal for the '<em><b>Performs</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAPABILITY__PERFORMS = eINSTANCE.getCapability_Performs();

  }

} //SensePackage
