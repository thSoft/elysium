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

import org.elysium.lilyPond.Chord;
import org.elysium.lilyPond.Duration;
import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.Note;
import org.elysium.lilyPond.PostEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chord</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.ChordImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.ChordImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.ChordImpl#getPostEvents <em>Post Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChordImpl extends EventImpl implements Chord
{
  /**
   * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotes()
   * @generated
   * @ordered
   */
  protected EList<Note> notes;

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
  protected ChordImpl()
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
    return LilyPondPackage.Literals.CHORD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Note> getNotes()
  {
    if (notes == null)
    {
      notes = new EObjectContainmentEList<Note>(Note.class, this, LilyPondPackage.CHORD__NOTES);
    }
    return notes;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.CHORD__DURATION, oldDuration, newDuration);
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
        msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.CHORD__DURATION, null, msgs);
      if (newDuration != null)
        msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.CHORD__DURATION, null, msgs);
      msgs = basicSetDuration(newDuration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.CHORD__DURATION, newDuration, newDuration));
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
      postEvents = new EObjectContainmentEList<PostEvent>(PostEvent.class, this, LilyPondPackage.CHORD__POST_EVENTS);
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
      case LilyPondPackage.CHORD__NOTES:
        return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
      case LilyPondPackage.CHORD__DURATION:
        return basicSetDuration(null, msgs);
      case LilyPondPackage.CHORD__POST_EVENTS:
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
      case LilyPondPackage.CHORD__NOTES:
        return getNotes();
      case LilyPondPackage.CHORD__DURATION:
        return getDuration();
      case LilyPondPackage.CHORD__POST_EVENTS:
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
      case LilyPondPackage.CHORD__NOTES:
        getNotes().clear();
        getNotes().addAll((Collection<? extends Note>)newValue);
        return;
      case LilyPondPackage.CHORD__DURATION:
        setDuration((Duration)newValue);
        return;
      case LilyPondPackage.CHORD__POST_EVENTS:
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
      case LilyPondPackage.CHORD__NOTES:
        getNotes().clear();
        return;
      case LilyPondPackage.CHORD__DURATION:
        setDuration((Duration)null);
        return;
      case LilyPondPackage.CHORD__POST_EVENTS:
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
      case LilyPondPackage.CHORD__NOTES:
        return notes != null && !notes.isEmpty();
      case LilyPondPackage.CHORD__DURATION:
        return duration != null;
      case LilyPondPackage.CHORD__POST_EVENTS:
        return postEvents != null && !postEvents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ChordImpl
