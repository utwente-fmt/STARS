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

import sense.Capability;
import sense.ProcessorType;
import sense.SensePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sense.impl.ProcessorTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link sense.impl.ProcessorTypeImpl#getCount <em>Count</em>}</li>
 *   <li>{@link sense.impl.ProcessorTypeImpl#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorTypeImpl extends EObjectImpl implements ProcessorType
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = "proc";

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
   * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected static final int COUNT_EDEFAULT = 1;

  /**
   * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected int count = COUNT_EDEFAULT;

  /**
   * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' reference list.
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
  protected ProcessorTypeImpl()
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
    return SensePackage.Literals.PROCESSOR_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SensePackage.PROCESSOR_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCount()
  {
    return count;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCount(int newCount)
  {
    int oldCount = count;
    count = newCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensePackage.PROCESSOR_TYPE__COUNT, oldCount, count));
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
      capabilities = new EObjectWithInverseResolvingEList<Capability>(Capability.class, this, SensePackage.PROCESSOR_TYPE__CAPABILITIES, SensePackage.CAPABILITY__PROCESSOR);
    }
    return capabilities;
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
      case SensePackage.PROCESSOR_TYPE__CAPABILITIES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapabilities()).basicAdd(otherEnd, msgs);
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
      case SensePackage.PROCESSOR_TYPE__CAPABILITIES:
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
      case SensePackage.PROCESSOR_TYPE__NAME:
        return getName();
      case SensePackage.PROCESSOR_TYPE__COUNT:
        return getCount();
      case SensePackage.PROCESSOR_TYPE__CAPABILITIES:
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
      case SensePackage.PROCESSOR_TYPE__NAME:
        setName((String)newValue);
        return;
      case SensePackage.PROCESSOR_TYPE__COUNT:
        setCount((Integer)newValue);
        return;
      case SensePackage.PROCESSOR_TYPE__CAPABILITIES:
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
      case SensePackage.PROCESSOR_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SensePackage.PROCESSOR_TYPE__COUNT:
        setCount(COUNT_EDEFAULT);
        return;
      case SensePackage.PROCESSOR_TYPE__CAPABILITIES:
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
      case SensePackage.PROCESSOR_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SensePackage.PROCESSOR_TYPE__COUNT:
        return count != COUNT_EDEFAULT;
      case SensePackage.PROCESSOR_TYPE__CAPABILITIES:
        return capabilities != null && !capabilities.isEmpty();
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
    result.append(", count: ");
    result.append(count);
    result.append(')');
    return result.toString();
  }

} //ProcessorTypeImpl
