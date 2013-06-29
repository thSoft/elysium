/**
 */
package org.elysium.lilypond.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.elysium.lilypond.Expression;
import org.elysium.lilypond.LilypondPackage;
import org.elysium.lilypond.Pitch;
import org.elysium.lilypond.RelativeMusic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Music</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilypond.impl.RelativeMusicImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link org.elysium.lilypond.impl.RelativeMusicImpl#getMusic <em>Music</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelativeMusicImpl extends SpecialCommandImpl implements RelativeMusic
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
   * The cached value of the '{@link #getMusic() <em>Music</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMusic()
   * @generated
   * @ordered
   */
  protected Expression music;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelativeMusicImpl()
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
    return LilypondPackage.Literals.RELATIVE_MUSIC;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilypondPackage.RELATIVE_MUSIC__PITCH, oldPitch, newPitch);
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
        msgs = ((InternalEObject)pitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilypondPackage.RELATIVE_MUSIC__PITCH, null, msgs);
      if (newPitch != null)
        msgs = ((InternalEObject)newPitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilypondPackage.RELATIVE_MUSIC__PITCH, null, msgs);
      msgs = basicSetPitch(newPitch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilypondPackage.RELATIVE_MUSIC__PITCH, newPitch, newPitch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getMusic()
  {
    return music;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMusic(Expression newMusic, NotificationChain msgs)
  {
    Expression oldMusic = music;
    music = newMusic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilypondPackage.RELATIVE_MUSIC__MUSIC, oldMusic, newMusic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMusic(Expression newMusic)
  {
    if (newMusic != music)
    {
      NotificationChain msgs = null;
      if (music != null)
        msgs = ((InternalEObject)music).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilypondPackage.RELATIVE_MUSIC__MUSIC, null, msgs);
      if (newMusic != null)
        msgs = ((InternalEObject)newMusic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilypondPackage.RELATIVE_MUSIC__MUSIC, null, msgs);
      msgs = basicSetMusic(newMusic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilypondPackage.RELATIVE_MUSIC__MUSIC, newMusic, newMusic));
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
      case LilypondPackage.RELATIVE_MUSIC__PITCH:
        return basicSetPitch(null, msgs);
      case LilypondPackage.RELATIVE_MUSIC__MUSIC:
        return basicSetMusic(null, msgs);
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
      case LilypondPackage.RELATIVE_MUSIC__PITCH:
        return getPitch();
      case LilypondPackage.RELATIVE_MUSIC__MUSIC:
        return getMusic();
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
      case LilypondPackage.RELATIVE_MUSIC__PITCH:
        setPitch((Pitch)newValue);
        return;
      case LilypondPackage.RELATIVE_MUSIC__MUSIC:
        setMusic((Expression)newValue);
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
      case LilypondPackage.RELATIVE_MUSIC__PITCH:
        setPitch((Pitch)null);
        return;
      case LilypondPackage.RELATIVE_MUSIC__MUSIC:
        setMusic((Expression)null);
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
      case LilypondPackage.RELATIVE_MUSIC__PITCH:
        return pitch != null;
      case LilypondPackage.RELATIVE_MUSIC__MUSIC:
        return music != null;
    }
    return super.eIsSet(featureID);
  }

} //RelativeMusicImpl
