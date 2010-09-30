/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.elysium.lilyPond.AlternativeMusic;
import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.MusicOrScheme;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative Music</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.AlternativeMusicImpl#getMusic <em>Music</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlternativeMusicImpl extends MinimalEObjectImpl.Container implements AlternativeMusic
{
  /**
   * The cached value of the '{@link #getMusic() <em>Music</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMusic()
   * @generated
   * @ordered
   */
  protected EList<MusicOrScheme> music;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlternativeMusicImpl()
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
    return LilyPondPackage.Literals.ALTERNATIVE_MUSIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MusicOrScheme> getMusic()
  {
    if (music == null)
    {
      music = new EObjectContainmentEList<MusicOrScheme>(MusicOrScheme.class, this, LilyPondPackage.ALTERNATIVE_MUSIC__MUSIC);
    }
    return music;
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
      case LilyPondPackage.ALTERNATIVE_MUSIC__MUSIC:
        return ((InternalEList<?>)getMusic()).basicRemove(otherEnd, msgs);
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
      case LilyPondPackage.ALTERNATIVE_MUSIC__MUSIC:
        return getMusic();
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
      case LilyPondPackage.ALTERNATIVE_MUSIC__MUSIC:
        getMusic().clear();
        getMusic().addAll((Collection<? extends MusicOrScheme>)newValue);
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
      case LilyPondPackage.ALTERNATIVE_MUSIC__MUSIC:
        getMusic().clear();
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
      case LilyPondPackage.ALTERNATIVE_MUSIC__MUSIC:
        return music != null && !music.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AlternativeMusicImpl
