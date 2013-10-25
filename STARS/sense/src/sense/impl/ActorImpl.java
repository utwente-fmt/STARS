/**
 */
package sense.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sense.Actor;
import sense.Channel;
import sense.SensePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sense.impl.ActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link sense.impl.ActorImpl#getInChannels <em>In Channels</em>}</li>
 *   <li>{@link sense.impl.ActorImpl#getOutChannels <em>Out Channels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorImpl extends EObjectImpl implements Actor
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = "act";

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getInChannels() <em>In Channels</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInChannels()
   * @generated
   * @ordered
   */
  protected EList<Channel> inChannels;

  /**
   * The cached value of the '{@link #getOutChannels() <em>Out Channels</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutChannels()
   * @generated
   * @ordered
   */
  protected EList<Channel> outChannels;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActorImpl()
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
    return SensePackage.Literals.ACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensePackage.ACTOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Channel> getInChannels()
  {
    if (inChannels == null)
    {
      inChannels = new EObjectWithInverseResolvingEList<Channel>(Channel.class, this, SensePackage.ACTOR__IN_CHANNELS, SensePackage.CHANNEL__TARGET);
    }
    return inChannels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Channel> getOutChannels()
  {
    if (outChannels == null)
    {
      outChannels = new EObjectWithInverseResolvingEList<Channel>(Channel.class, this, SensePackage.ACTOR__OUT_CHANNELS, SensePackage.CHANNEL__SOURCE);
    }
    return outChannels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SensePackage.ACTOR__IN_CHANNELS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getInChannels()).basicAdd(otherEnd, msgs);
      case SensePackage.ACTOR__OUT_CHANNELS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutChannels()).basicAdd(otherEnd, msgs);
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
      case SensePackage.ACTOR__IN_CHANNELS:
        return ((InternalEList<?>)getInChannels()).basicRemove(otherEnd, msgs);
      case SensePackage.ACTOR__OUT_CHANNELS:
        return ((InternalEList<?>)getOutChannels()).basicRemove(otherEnd, msgs);
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
      case SensePackage.ACTOR__NAME:
        return getName();
      case SensePackage.ACTOR__IN_CHANNELS:
        return getInChannels();
      case SensePackage.ACTOR__OUT_CHANNELS:
        return getOutChannels();
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
      case SensePackage.ACTOR__NAME:
        setName((String)newValue);
        return;
      case SensePackage.ACTOR__IN_CHANNELS:
        getInChannels().clear();
        getInChannels().addAll((Collection<? extends Channel>)newValue);
        return;
      case SensePackage.ACTOR__OUT_CHANNELS:
        getOutChannels().clear();
        getOutChannels().addAll((Collection<? extends Channel>)newValue);
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
      case SensePackage.ACTOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SensePackage.ACTOR__IN_CHANNELS:
        getInChannels().clear();
        return;
      case SensePackage.ACTOR__OUT_CHANNELS:
        getOutChannels().clear();
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
      case SensePackage.ACTOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SensePackage.ACTOR__IN_CHANNELS:
        return inChannels != null && !inChannels.isEmpty();
      case SensePackage.ACTOR__OUT_CHANNELS:
        return outChannels != null && !outChannels.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ActorImpl
