/**
 */
package sense.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sense.Actor;
import sense.Capability;
import sense.Channel;
import sense.ProcessorType;
import sense.SenseModel;
import sense.SensePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sense.impl.SenseModelImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link sense.impl.SenseModelImpl#getProcessors <em>Processors</em>}</li>
 *   <li>{@link sense.impl.SenseModelImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link sense.impl.SenseModelImpl#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SenseModelImpl extends EObjectImpl implements SenseModel
{
  /**
   * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActors()
   * @generated
   * @ordered
   */
  protected EList<Actor> actors;

  /**
   * The cached value of the '{@link #getProcessors() <em>Processors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessors()
   * @generated
   * @ordered
   */
  protected EList<ProcessorType> processors;

  /**
   * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannels()
   * @generated
   * @ordered
   */
  protected EList<Channel> channels;

  /**
   * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapabilities()
   * @generated
   * @ordered
   */
  protected EList<Capability> capabilities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SenseModelImpl()
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
    return SensePackage.Literals.SENSE_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Actor> getActors()
  {
    if (actors == null)
    {
      actors = new EObjectContainmentEList<Actor>(Actor.class, this, SensePackage.SENSE_MODEL__ACTORS);
    }
    return actors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProcessorType> getProcessors()
  {
    if (processors == null)
    {
      processors = new EObjectContainmentEList<ProcessorType>(ProcessorType.class, this, SensePackage.SENSE_MODEL__PROCESSORS);
    }
    return processors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Channel> getChannels()
  {
    if (channels == null)
    {
      channels = new EObjectContainmentEList<Channel>(Channel.class, this, SensePackage.SENSE_MODEL__CHANNELS);
    }
    return channels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Capability> getCapabilities()
  {
    if (capabilities == null)
    {
      capabilities = new EObjectContainmentEList<Capability>(Capability.class, this, SensePackage.SENSE_MODEL__CAPABILITIES);
    }
    return capabilities;
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
      case SensePackage.SENSE_MODEL__ACTORS:
        return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
      case SensePackage.SENSE_MODEL__PROCESSORS:
        return ((InternalEList<?>)getProcessors()).basicRemove(otherEnd, msgs);
      case SensePackage.SENSE_MODEL__CHANNELS:
        return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
      case SensePackage.SENSE_MODEL__CAPABILITIES:
        return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
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
      case SensePackage.SENSE_MODEL__ACTORS:
        return getActors();
      case SensePackage.SENSE_MODEL__PROCESSORS:
        return getProcessors();
      case SensePackage.SENSE_MODEL__CHANNELS:
        return getChannels();
      case SensePackage.SENSE_MODEL__CAPABILITIES:
        return getCapabilities();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SensePackage.SENSE_MODEL__ACTORS:
        getActors().clear();
        getActors().addAll((Collection<? extends Actor>)newValue);
        return;
      case SensePackage.SENSE_MODEL__PROCESSORS:
        getProcessors().clear();
        getProcessors().addAll((Collection<? extends ProcessorType>)newValue);
        return;
      case SensePackage.SENSE_MODEL__CHANNELS:
        getChannels().clear();
        getChannels().addAll((Collection<? extends Channel>)newValue);
        return;
      case SensePackage.SENSE_MODEL__CAPABILITIES:
        getCapabilities().clear();
        getCapabilities().addAll((Collection<? extends Capability>)newValue);
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
      case SensePackage.SENSE_MODEL__ACTORS:
        getActors().clear();
        return;
      case SensePackage.SENSE_MODEL__PROCESSORS:
        getProcessors().clear();
        return;
      case SensePackage.SENSE_MODEL__CHANNELS:
        getChannels().clear();
        return;
      case SensePackage.SENSE_MODEL__CAPABILITIES:
        getCapabilities().clear();
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
      case SensePackage.SENSE_MODEL__ACTORS:
        return actors != null && !actors.isEmpty();
      case SensePackage.SENSE_MODEL__PROCESSORS:
        return processors != null && !processors.isEmpty();
      case SensePackage.SENSE_MODEL__CHANNELS:
        return channels != null && !channels.isEmpty();
      case SensePackage.SENSE_MODEL__CAPABILITIES:
        return capabilities != null && !capabilities.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SenseModelImpl
