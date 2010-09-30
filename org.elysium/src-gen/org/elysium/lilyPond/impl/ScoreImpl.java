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

import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.Music;
import org.elysium.lilyPond.Score;
import org.elysium.lilyPond.ScoreElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Score</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.ScoreImpl#getMusic <em>Music</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.ScoreImpl#getOther <em>Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScoreImpl extends ToplevelExpressionImpl implements Score
{
  /**
   * The cached value of the '{@link #getMusic() <em>Music</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMusic()
   * @generated
   * @ordered
   */
  protected Music music;

  /**
   * The cached value of the '{@link #getOther() <em>Other</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOther()
   * @generated
   * @ordered
   */
  protected EList<ScoreElement> other;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScoreImpl()
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
    return LilyPondPackage.Literals.SCORE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Music getMusic()
  {
    return music;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMusic(Music newMusic, NotificationChain msgs)
  {
    Music oldMusic = music;
    music = newMusic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.SCORE__MUSIC, oldMusic, newMusic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMusic(Music newMusic)
  {
    if (newMusic != music)
    {
      NotificationChain msgs = null;
      if (music != null)
        msgs = ((InternalEObject)music).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.SCORE__MUSIC, null, msgs);
      if (newMusic != null)
        msgs = ((InternalEObject)newMusic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.SCORE__MUSIC, null, msgs);
      msgs = basicSetMusic(newMusic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.SCORE__MUSIC, newMusic, newMusic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ScoreElement> getOther()
  {
    if (other == null)
    {
      other = new EObjectContainmentEList<ScoreElement>(ScoreElement.class, this, LilyPondPackage.SCORE__OTHER);
    }
    return other;
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
      case LilyPondPackage.SCORE__MUSIC:
        return basicSetMusic(null, msgs);
      case LilyPondPackage.SCORE__OTHER:
        return ((InternalEList<?>)getOther()).basicRemove(otherEnd, msgs);
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
      case LilyPondPackage.SCORE__MUSIC:
        return getMusic();
      case LilyPondPackage.SCORE__OTHER:
        return getOther();
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
      case LilyPondPackage.SCORE__MUSIC:
        setMusic((Music)newValue);
        return;
      case LilyPondPackage.SCORE__OTHER:
        getOther().clear();
        getOther().addAll((Collection<? extends ScoreElement>)newValue);
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
      case LilyPondPackage.SCORE__MUSIC:
        setMusic((Music)null);
        return;
      case LilyPondPackage.SCORE__OTHER:
        getOther().clear();
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
      case LilyPondPackage.SCORE__MUSIC:
        return music != null;
      case LilyPondPackage.SCORE__OTHER:
        return other != null && !other.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ScoreImpl
