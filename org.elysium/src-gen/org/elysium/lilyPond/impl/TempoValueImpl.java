/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.elysium.lilyPond.Duration;
import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.TempoValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tempo Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.TempoValueImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.TempoValueImpl#getBpm <em>Bpm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TempoValueImpl extends MinimalEObjectImpl.Container implements TempoValue
{
  /**
   * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected Duration duration;

  /**
   * The default value of the '{@link #getBpm() <em>Bpm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBpm()
   * @generated
   * @ordered
   */
  protected static final int BPM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBpm() <em>Bpm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBpm()
   * @generated
   * @ordered
   */
  protected int bpm = BPM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TempoValueImpl()
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
    return LilyPondPackage.Literals.TEMPO_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Duration getDuration()
  {
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDuration(Duration newDuration, NotificationChain msgs)
  {
    Duration oldDuration = duration;
    duration = newDuration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.TEMPO_VALUE__DURATION, oldDuration, newDuration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuration(Duration newDuration)
  {
    if (newDuration != duration)
    {
      NotificationChain msgs = null;
      if (duration != null)
        msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.TEMPO_VALUE__DURATION, null, msgs);
      if (newDuration != null)
        msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.TEMPO_VALUE__DURATION, null, msgs);
      msgs = basicSetDuration(newDuration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.TEMPO_VALUE__DURATION, newDuration, newDuration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBpm()
  {
    return bpm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBpm(int newBpm)
  {
    int oldBpm = bpm;
    bpm = newBpm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.TEMPO_VALUE__BPM, oldBpm, bpm));
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
      case LilyPondPackage.TEMPO_VALUE__DURATION:
        return basicSetDuration(null, msgs);
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
      case LilyPondPackage.TEMPO_VALUE__DURATION:
        return getDuration();
      case LilyPondPackage.TEMPO_VALUE__BPM:
        return getBpm();
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
      case LilyPondPackage.TEMPO_VALUE__DURATION:
        setDuration((Duration)newValue);
        return;
      case LilyPondPackage.TEMPO_VALUE__BPM:
        setBpm((Integer)newValue);
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
      case LilyPondPackage.TEMPO_VALUE__DURATION:
        setDuration((Duration)null);
        return;
      case LilyPondPackage.TEMPO_VALUE__BPM:
        setBpm(BPM_EDEFAULT);
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
      case LilyPondPackage.TEMPO_VALUE__DURATION:
        return duration != null;
      case LilyPondPackage.TEMPO_VALUE__BPM:
        return bpm != BPM_EDEFAULT;
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
    result.append(" (bpm: ");
    result.append(bpm);
    result.append(')');
    return result.toString();
  }

} //TempoValueImpl
