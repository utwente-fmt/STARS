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
import sense.Channel;
import sense.SensePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link sense.impl.ChannelImpl#getName <em>Name</em>}</li>
 *   <li>{@link sense.impl.ChannelImpl#getInitialTokens <em>Initial Tokens</em>}</li>
 *   <li>{@link sense.impl.ChannelImpl#getSource <em>Source</em>}</li>
 *   <li>{@link sense.impl.ChannelImpl#getSourceRate <em>Source Rate</em>}</li>
 *   <li>{@link sense.impl.ChannelImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link sense.impl.ChannelImpl#getTargetRate <em>Target Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelImpl extends EObjectImpl implements Channel
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = "chan";

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
   * The default value of the '{@link #getInitialTokens() <em>Initial Tokens</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialTokens()
   * @generated
   * @ordered
   */
  protected static final BigDecimal INITIAL_TOKENS_EDEFAULT = new BigDecimal("0");

  /**
   * The cached value of the '{@link #getInitialTokens() <em>Initial Tokens</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialTokens()
   * @generated
   * @ordered
   */
  protected BigDecimal initialTokens = INITIAL_TOKENS_EDEFAULT;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Actor source;

  /**
   * The default value of the '{@link #getSourceRate() <em>Source Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceRate()
   * @generated
   * @ordered
   */
  protected static final BigDecimal SOURCE_RATE_EDEFAULT = new BigDecimal("1");

  /**
   * The cached value of the '{@link #getSourceRate() <em>Source Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceRate()
   * @generated
   * @ordered
   */
  protected BigDecimal sourceRate = SOURCE_RATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Actor target;

  /**
   * The default value of the '{@link #getTargetRate() <em>Target Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetRate()
   * @generated
   * @ordered
   */
  protected static final BigDecimal TARGET_RATE_EDEFAULT = new BigDecimal("1");

  /**
   * The cached value of the '{@link #getTargetRate() <em>Target Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetRate()
   * @generated
   * @ordered
   */
  protected BigDecimal targetRate = TARGET_RATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChannelImpl()
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
    return SensePackage.Literals.CHANNEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SensePackage.CHANNEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getInitialTokens()
  {
    return initialTokens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialTokens(BigDecimal newInitialTokens)
  {
    BigDecimal oldInitialTokens = initialTokens;
    initialTokens = newInitialTokens;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensePackage.CHANNEL__INITIAL_TOKENS, oldInitialTokens, initialTokens));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (Actor)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensePackage.CHANNEL__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(Actor newSource, NotificationChain msgs)
  {
    Actor oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensePackage.CHANNEL__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Actor newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, SensePackage.ACTOR__OUT_CHANNELS, Actor.class, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, SensePackage.ACTOR__OUT_CHANNELS, Actor.class, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensePackage.CHANNEL__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getSourceRate()
  {
    return sourceRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceRate(BigDecimal newSourceRate)
  {
    BigDecimal oldSourceRate = sourceRate;
    sourceRate = newSourceRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensePackage.CHANNEL__SOURCE_RATE, oldSourceRate, sourceRate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Actor)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensePackage.CHANNEL__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(Actor newTarget, NotificationChain msgs)
  {
    Actor oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SensePackage.CHANNEL__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Actor newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, SensePackage.ACTOR__IN_CHANNELS, Actor.class, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, SensePackage.ACTOR__IN_CHANNELS, Actor.class, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensePackage.CHANNEL__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getTargetRate()
  {
    return targetRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetRate(BigDecimal newTargetRate)
  {
    BigDecimal oldTargetRate = targetRate;
    targetRate = newTargetRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SensePackage.CHANNEL__TARGET_RATE, oldTargetRate, targetRate));
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
      case SensePackage.CHANNEL__SOURCE:
        if (source != null)
          msgs = ((InternalEObject)source).eInverseRemove(this, SensePackage.ACTOR__OUT_CHANNELS, Actor.class, msgs);
        return basicSetSource((Actor)otherEnd, msgs);
      case SensePackage.CHANNEL__TARGET:
        if (target != null)
          msgs = ((InternalEObject)target).eInverseRemove(this, SensePackage.ACTOR__IN_CHANNELS, Actor.class, msgs);
        return basicSetTarget((Actor)otherEnd, msgs);
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
      case SensePackage.CHANNEL__SOURCE:
        return basicSetSource(null, msgs);
      case SensePackage.CHANNEL__TARGET:
        return basicSetTarget(null, msgs);
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
      case SensePackage.CHANNEL__NAME:
        return getName();
      case SensePackage.CHANNEL__INITIAL_TOKENS:
        return getInitialTokens();
      case SensePackage.CHANNEL__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case SensePackage.CHANNEL__SOURCE_RATE:
        return getSourceRate();
      case SensePackage.CHANNEL__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case SensePackage.CHANNEL__TARGET_RATE:
        return getTargetRate();
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
      case SensePackage.CHANNEL__NAME:
        setName((String)newValue);
        return;
      case SensePackage.CHANNEL__INITIAL_TOKENS:
        setInitialTokens((BigDecimal)newValue);
        return;
      case SensePackage.CHANNEL__SOURCE:
        setSource((Actor)newValue);
        return;
      case SensePackage.CHANNEL__SOURCE_RATE:
        setSourceRate((BigDecimal)newValue);
        return;
      case SensePackage.CHANNEL__TARGET:
        setTarget((Actor)newValue);
        return;
      case SensePackage.CHANNEL__TARGET_RATE:
        setTargetRate((BigDecimal)newValue);
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
      case SensePackage.CHANNEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SensePackage.CHANNEL__INITIAL_TOKENS:
        setInitialTokens(INITIAL_TOKENS_EDEFAULT);
        return;
      case SensePackage.CHANNEL__SOURCE:
        setSource((Actor)null);
        return;
      case SensePackage.CHANNEL__SOURCE_RATE:
        setSourceRate(SOURCE_RATE_EDEFAULT);
        return;
      case SensePackage.CHANNEL__TARGET:
        setTarget((Actor)null);
        return;
      case SensePackage.CHANNEL__TARGET_RATE:
        setTargetRate(TARGET_RATE_EDEFAULT);
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
      case SensePackage.CHANNEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SensePackage.CHANNEL__INITIAL_TOKENS:
        return INITIAL_TOKENS_EDEFAULT == null ? initialTokens != null : !INITIAL_TOKENS_EDEFAULT.equals(initialTokens);
      case SensePackage.CHANNEL__SOURCE:
        return source != null;
      case SensePackage.CHANNEL__SOURCE_RATE:
        return SOURCE_RATE_EDEFAULT == null ? sourceRate != null : !SOURCE_RATE_EDEFAULT.equals(sourceRate);
      case SensePackage.CHANNEL__TARGET:
        return target != null;
      case SensePackage.CHANNEL__TARGET_RATE:
        return TARGET_RATE_EDEFAULT == null ? targetRate != null : !TARGET_RATE_EDEFAULT.equals(targetRate);
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
    result.append(", initialTokens: ");
    result.append(initialTokens);
    result.append(", sourceRate: ");
    result.append(sourceRate);
    result.append(", targetRate: ");
    result.append(targetRate);
    result.append(')');
    return result.toString();
  }

} //ChannelImpl
