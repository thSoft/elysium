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
import org.elysium.lilyPond.PostEvent;
import org.elysium.lilyPond.Rest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.RestImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.RestImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.RestImpl#getPostEvents <em>Post Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestImpl extends EventImpl implements Rest
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

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
  protected RestImpl()
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
    return LilyPondPackage.Literals.REST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.REST__TYPE, oldType, type));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.REST__DURATION, oldDuration, newDuration);
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
        msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.REST__DURATION, null, msgs);
      if (newDuration != null)
        msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.REST__DURATION, null, msgs);
      msgs = basicSetDuration(newDuration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.REST__DURATION, newDuration, newDuration));
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
      postEvents = new EObjectContainmentEList<PostEvent>(PostEvent.class, this, LilyPondPackage.REST__POST_EVENTS);
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
      case LilyPondPackage.REST__DURATION:
        return basicSetDuration(null, msgs);
      case LilyPondPackage.REST__POST_EVENTS:
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
      case LilyPondPackage.REST__TYPE:
        return getType();
      case LilyPondPackage.REST__DURATION:
        return getDuration();
      case LilyPondPackage.REST__POST_EVENTS:
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
      case LilyPondPackage.REST__TYPE:
        setType((String)newValue);
        return;
      case LilyPondPackage.REST__DURATION:
        setDuration((Duration)newValue);
        return;
      case LilyPondPackage.REST__POST_EVENTS:
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
      case LilyPondPackage.REST__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case LilyPondPackage.REST__DURATION:
        setDuration((Duration)null);
        return;
      case LilyPondPackage.REST__POST_EVENTS:
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
      case LilyPondPackage.REST__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case LilyPondPackage.REST__DURATION:
        return duration != null;
      case LilyPondPackage.REST__POST_EVENTS:
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //RestImpl
