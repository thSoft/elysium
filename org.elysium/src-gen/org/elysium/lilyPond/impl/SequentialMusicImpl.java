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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.Music;
import org.elysium.lilyPond.SequentialMusic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequential Music</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.SequentialMusicImpl#getMusic <em>Music</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequentialMusicImpl extends CompositeMusicImpl implements SequentialMusic
{
  /**
   * The cached value of the '{@link #getMusic() <em>Music</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMusic()
   * @generated
   * @ordered
   */
  protected EList<Music> music;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequentialMusicImpl()
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
    return LilyPondPackage.Literals.SEQUENTIAL_MUSIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Music> getMusic()
  {
    if (music == null)
    {
      music = new EObjectContainmentEList<Music>(Music.class, this, LilyPondPackage.SEQUENTIAL_MUSIC__MUSIC);
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
      case LilyPondPackage.SEQUENTIAL_MUSIC__MUSIC:
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
      case LilyPondPackage.SEQUENTIAL_MUSIC__MUSIC:
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
      case LilyPondPackage.SEQUENTIAL_MUSIC__MUSIC:
        getMusic().clear();
        getMusic().addAll((Collection<? extends Music>)newValue);
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
      case LilyPondPackage.SEQUENTIAL_MUSIC__MUSIC:
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
      case LilyPondPackage.SEQUENTIAL_MUSIC__MUSIC:
        return music != null && !music.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SequentialMusicImpl
