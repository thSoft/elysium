/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.elysium.lilyPond.Duration;
import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.Note;
import org.elysium.lilyPond.Pitch;
import org.elysium.lilyPond.PostEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.NoteImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.NoteImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.NoteImpl#isRest <em>Rest</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.NoteImpl#getPostEvents <em>Post Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoteImpl extends EventImpl implements Note
{
  /**
   * The cached value of the '{@link #getPitch() <em>Pitch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPitch()
   * @generated
   * @ordered
   */
  protected Pitch pitch;

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
   * The default value of the '{@link #isRest() <em>Rest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRest()
   * @generated
   * @ordered
   */
  protected static final boolean REST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRest() <em>Rest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRest()
   * @generated
   * @ordered
   */
  protected boolean rest = REST_EDEFAULT;

  /**
   * The cached value of the '{@link #getPostEvents() <em>Post Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostEvents()
   * @generated
   * @ordered
   */
  protected EList<PostEvent> postEvents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NoteImpl()
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
    return LilyPondPackage.Literals.NOTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pitch getPitch()
  {
    return pitch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPitch(Pitch newPitch, NotificationChain msgs)
  {
    Pitch oldPitch = pitch;
    pitch = newPitch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.NOTE__PITCH, oldPitch, newPitch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPitch(Pitch newPitch)
  {
    if (newPitch != pitch)
    {
      NotificationChain msgs = null;
      if (pitch != null)
        msgs = ((InternalEObject)pitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.NOTE__PITCH, null, msgs);
      if (newPitch != null)
        msgs = ((InternalEObject)newPitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.NOTE__PITCH, null, msgs);
      msgs = basicSetPitch(newPitch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.NOTE__PITCH, newPitch, newPitch));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.NOTE__DURATION, oldDuration, newDuration);
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
        msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.NOTE__DURATION, null, msgs);
      if (newDuration != null)
        msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.NOTE__DURATION, null, msgs);
      msgs = basicSetDuration(newDuration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.NOTE__DURATION, newDuration, newDuration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRest()
  {
    return rest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRest(boolean newRest)
  {
    boolean oldRest = rest;
    rest = newRest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.NOTE__REST, oldRest, rest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PostEvent> getPostEvents()
  {
    if (postEvents == null)
    {
      postEvents = new EObjectContainmentEList<PostEvent>(PostEvent.class, this, LilyPondPackage.NOTE__POST_EVENTS);
    }
    return postEvents;
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
      case LilyPondPackage.NOTE__PITCH:
        return basicSetPitch(null, msgs);
      case LilyPondPackage.NOTE__DURATION:
        return basicSetDuration(null, msgs);
      case LilyPondPackage.NOTE__POST_EVENTS:
        return ((InternalEList<?>)getPostEvents()).basicRemove(otherEnd, msgs);
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
      case LilyPondPackage.NOTE__PITCH:
        return getPitch();
      case LilyPondPackage.NOTE__DURATION:
        return getDuration();
      case LilyPondPackage.NOTE__REST:
        return isRest();
      case LilyPondPackage.NOTE__POST_EVENTS:
        return getPostEvents();
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
      case LilyPondPackage.NOTE__PITCH:
        setPitch((Pitch)newValue);
        return;
      case LilyPondPackage.NOTE__DURATION:
        setDuration((Duration)newValue);
        return;
      case LilyPondPackage.NOTE__REST:
        setRest((Boolean)newValue);
        return;
      case LilyPondPackage.NOTE__POST_EVENTS:
        getPostEvents().clear();
        getPostEvents().addAll((Collection<? extends PostEvent>)newValue);
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
      case LilyPondPackage.NOTE__PITCH:
        setPitch((Pitch)null);
        return;
      case LilyPondPackage.NOTE__DURATION:
        setDuration((Duration)null);
        return;
      case LilyPondPackage.NOTE__REST:
        setRest(REST_EDEFAULT);
        return;
      case LilyPondPackage.NOTE__POST_EVENTS:
        getPostEvents().clear();
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
      case LilyPondPackage.NOTE__PITCH:
        return pitch != null;
      case LilyPondPackage.NOTE__DURATION:
        return duration != null;
      case LilyPondPackage.NOTE__REST:
        return rest != REST_EDEFAULT;
      case LilyPondPackage.NOTE__POST_EVENTS:
        return postEvents != null && !postEvents.isEmpty();
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
    result.append(" (rest: ");
    result.append(rest);
    result.append(')');
    return result.toString();
  }

} //NoteImpl
