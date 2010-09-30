/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.elysium.lilyPond.Direction;
import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.PostEvent;
import org.elysium.lilyPond.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.PostEventImpl#getMusicFunction <em>Music Function</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.PostEventImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.PostEventImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostEventImpl extends ValueImpl implements PostEvent
{
  /**
   * The cached value of the '{@link #getMusicFunction() <em>Music Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMusicFunction()
   * @generated
   * @ordered
   */
  protected Reference musicFunction;

  /**
   * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected static final Direction DIRECTION_EDEFAULT = Direction.DEFAULT;

  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected Direction direction = DIRECTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected EObject event;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PostEventImpl()
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
    return LilyPondPackage.Literals.POST_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference getMusicFunction()
  {
    return musicFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMusicFunction(Reference newMusicFunction, NotificationChain msgs)
  {
    Reference oldMusicFunction = musicFunction;
    musicFunction = newMusicFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.POST_EVENT__MUSIC_FUNCTION, oldMusicFunction, newMusicFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMusicFunction(Reference newMusicFunction)
  {
    if (newMusicFunction != musicFunction)
    {
      NotificationChain msgs = null;
      if (musicFunction != null)
        msgs = ((InternalEObject)musicFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.POST_EVENT__MUSIC_FUNCTION, null, msgs);
      if (newMusicFunction != null)
        msgs = ((InternalEObject)newMusicFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.POST_EVENT__MUSIC_FUNCTION, null, msgs);
      msgs = basicSetMusicFunction(newMusicFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.POST_EVENT__MUSIC_FUNCTION, newMusicFunction, newMusicFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(Direction newDirection)
  {
    Direction oldDirection = direction;
    direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.POST_EVENT__DIRECTION, oldDirection, direction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvent(EObject newEvent, NotificationChain msgs)
  {
    EObject oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.POST_EVENT__EVENT, oldEvent, newEvent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(EObject newEvent)
  {
    if (newEvent != event)
    {
      NotificationChain msgs = null;
      if (event != null)
        msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.POST_EVENT__EVENT, null, msgs);
      if (newEvent != null)
        msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.POST_EVENT__EVENT, null, msgs);
      msgs = basicSetEvent(newEvent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.POST_EVENT__EVENT, newEvent, newEvent));
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
      case LilyPondPackage.POST_EVENT__MUSIC_FUNCTION:
        return basicSetMusicFunction(null, msgs);
      case LilyPondPackage.POST_EVENT__EVENT:
        return basicSetEvent(null, msgs);
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
      case LilyPondPackage.POST_EVENT__MUSIC_FUNCTION:
        return getMusicFunction();
      case LilyPondPackage.POST_EVENT__DIRECTION:
        return getDirection();
      case LilyPondPackage.POST_EVENT__EVENT:
        return getEvent();
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
      case LilyPondPackage.POST_EVENT__MUSIC_FUNCTION:
        setMusicFunction((Reference)newValue);
        return;
      case LilyPondPackage.POST_EVENT__DIRECTION:
        setDirection((Direction)newValue);
        return;
      case LilyPondPackage.POST_EVENT__EVENT:
        setEvent((EObject)newValue);
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
      case LilyPondPackage.POST_EVENT__MUSIC_FUNCTION:
        setMusicFunction((Reference)null);
        return;
      case LilyPondPackage.POST_EVENT__DIRECTION:
        setDirection(DIRECTION_EDEFAULT);
        return;
      case LilyPondPackage.POST_EVENT__EVENT:
        setEvent((EObject)null);
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
      case LilyPondPackage.POST_EVENT__MUSIC_FUNCTION:
        return musicFunction != null;
      case LilyPondPackage.POST_EVENT__DIRECTION:
        return direction != DIRECTION_EDEFAULT;
      case LilyPondPackage.POST_EVENT__EVENT:
        return event != null;
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
    result.append(" (direction: ");
    result.append(direction);
    result.append(')');
    return result.toString();
  }

} //PostEventImpl
