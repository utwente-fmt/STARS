/**
 */
package sense.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sense.Actor;
import sense.Capability;
import sense.ProcessorType;
import sense.SensePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sense.impl.CapabilityImpl#getTime <em>Time</em>}</li>
 *   <li>{@link sense.impl.CapabilityImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link sense.impl.CapabilityImpl#getPerforms <em>Performs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityImpl extends EObjectImpl implements Capability
{
  /**
   * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected static final BigDecimal TIME_EDEFAULT = new BigDecimal("1");

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected BigDecimal time = TIME_EDEFAULT;

  /**
   * The cached value of the '{@link #getProcessor() <em>Processor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessor()
   * @generated
   * @ordered
   */
  protected ProcessorType processor;

  /**
   * The cached value of the '{@link #getPerforms() <em>Performs</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerforms()
   * @generated
   * @ordered
   */
  protected Actor performs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CapabilityImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SensePackage.Literals.CAPABILITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime(BigDecimal newTime)
  {
    BigDecimal oldTime = time;
    time = newTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensePackage.CAPABILITY__TIME, oldTime, time));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessorType getProcessor()
  {
    if (processor != null && processor.eIsProxy())
    {
      InternalEObject oldProcessor = (InternalEObject)processor;
      processor = (ProcessorType)eResolveProxy(oldProcessor);
      if (processor != oldProcessor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensePackage.CAPABILITY__PROCESSOR, oldProcessor, processor));
      }
    }
    return processor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessorType basicGetProcessor()
  {
    return processor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcessor(ProcessorType newProcessor, NotificationChain msgs)
  {
    ProcessorType oldProcessor = processor;
    processor = newProcessor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensePackage.CAPABILITY__PROCESSOR, oldProcessor, newProcessor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessor(ProcessorType newProcessor)
  {
    if (newProcessor != processor)
    {
      NotificationChain msgs = null;
      if (processor != null)
        msgs = ((InternalEObject)processor).eInverseRemove(this, SensePackage.PROCESSOR_TYPE__CAPABILITIES, ProcessorType.class, msgs);
      if (newProcessor != null)
        msgs = ((InternalEObject)newProcessor).eInverseAdd(this, SensePackage.PROCESSOR_TYPE__CAPABILITIES, ProcessorType.class, msgs);
      msgs = basicSetProcessor(newProcessor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensePackage.CAPABILITY__PROCESSOR, newProcessor, newProcessor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor getPerforms()
  {
    if (performs != null && performs.eIsProxy())
    {
      InternalEObject oldPerforms = (InternalEObject)performs;
      performs = (Actor)eResolveProxy(oldPerforms);
      if (performs != oldPerforms)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensePackage.CAPABILITY__PERFORMS, oldPerforms, performs));
      }
    }
    return performs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor basicGetPerforms()
  {
    return performs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPerforms(Actor newPerforms)
  {
    Actor oldPerforms = performs;
    performs = newPerforms;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensePackage.CAPABILITY__PERFORMS, oldPerforms, performs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SensePackage.CAPABILITY__PROCESSOR:
        if (processor != null)
          msgs = ((InternalEObject)processor).eInverseRemove(this, SensePackage.PROCESSOR_TYPE__CAPABILITIES, ProcessorType.class, msgs);
        return basicSetProcessor((ProcessorType)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SensePackage.CAPABILITY__PROCESSOR:
        return basicSetProcessor(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SensePackage.CAPABILITY__TIME:
        return getTime();
      case SensePackage.CAPABILITY__PROCESSOR:
        if (resolve) return getProcessor();
        return basicGetProcessor();
      case SensePackage.CAPABILITY__PERFORMS:
        if (resolve) return getPerforms();
        return basicGetPerforms();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SensePackage.CAPABILITY__TIME:
        setTime((BigDecimal)newValue);
        return;
      case SensePackage.CAPABILITY__PROCESSOR:
        setProcessor((ProcessorType)newValue);
        return;
      case SensePackage.CAPABILITY__PERFORMS:
        setPerforms((Actor)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SensePackage.CAPABILITY__TIME:
        setTime(TIME_EDEFAULT);
        return;
      case SensePackage.CAPABILITY__PROCESSOR:
        setProcessor((ProcessorType)null);
        return;
      case SensePackage.CAPABILITY__PERFORMS:
        setPerforms((Actor)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SensePackage.CAPABILITY__TIME:
        return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
      case SensePackage.CAPABILITY__PROCESSOR:
        return processor != null;
      case SensePackage.CAPABILITY__PERFORMS:
        return performs != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (time: ");
    result.append(time);
    result.append(')');
    return result.toString();
  }

} //CapabilityImpl
