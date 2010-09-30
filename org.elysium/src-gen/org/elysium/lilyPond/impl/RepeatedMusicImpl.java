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

import org.elysium.lilyPond.AlternativeMusic;
import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.Music;
import org.elysium.lilyPond.RepeatedMusic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeated Music</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.RepeatedMusicImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.RepeatedMusicImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.RepeatedMusicImpl#getMusic <em>Music</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.RepeatedMusicImpl#getAlternative <em>Alternative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepeatedMusicImpl extends CompositeMusicImpl implements RepeatedMusic
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
   * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected static final int NUMBER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected int number = NUMBER_EDEFAULT;

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
   * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlternative()
   * @generated
   * @ordered
   */
  protected AlternativeMusic alternative;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepeatedMusicImpl()
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
    return LilyPondPackage.Literals.REPEATED_MUSIC;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.REPEATED_MUSIC__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber(int newNumber)
  {
    int oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.REPEATED_MUSIC__NUMBER, oldNumber, number));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.REPEATED_MUSIC__MUSIC, oldMusic, newMusic);
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
        msgs = ((InternalEObject)music).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.REPEATED_MUSIC__MUSIC, null, msgs);
      if (newMusic != null)
        msgs = ((InternalEObject)newMusic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.REPEATED_MUSIC__MUSIC, null, msgs);
      msgs = basicSetMusic(newMusic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.REPEATED_MUSIC__MUSIC, newMusic, newMusic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlternativeMusic getAlternative()
  {
    return alternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlternative(AlternativeMusic newAlternative, NotificationChain msgs)
  {
    AlternativeMusic oldAlternative = alternative;
    alternative = newAlternative;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.REPEATED_MUSIC__ALTERNATIVE, oldAlternative, newAlternative);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlternative(AlternativeMusic newAlternative)
  {
    if (newAlternative != alternative)
    {
      NotificationChain msgs = null;
      if (alternative != null)
        msgs = ((InternalEObject)alternative).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.REPEATED_MUSIC__ALTERNATIVE, null, msgs);
      if (newAlternative != null)
        msgs = ((InternalEObject)newAlternative).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.REPEATED_MUSIC__ALTERNATIVE, null, msgs);
      msgs = basicSetAlternative(newAlternative, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.REPEATED_MUSIC__ALTERNATIVE, newAlternative, newAlternative));
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
      case LilyPondPackage.REPEATED_MUSIC__MUSIC:
        return basicSetMusic(null, msgs);
      case LilyPondPackage.REPEATED_MUSIC__ALTERNATIVE:
        return basicSetAlternative(null, msgs);
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
      case LilyPondPackage.REPEATED_MUSIC__TYPE:
        return getType();
      case LilyPondPackage.REPEATED_MUSIC__NUMBER:
        return getNumber();
      case LilyPondPackage.REPEATED_MUSIC__MUSIC:
        return getMusic();
      case LilyPondPackage.REPEATED_MUSIC__ALTERNATIVE:
        return getAlternative();
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
      case LilyPondPackage.REPEATED_MUSIC__TYPE:
        setType((String)newValue);
        return;
      case LilyPondPackage.REPEATED_MUSIC__NUMBER:
        setNumber((Integer)newValue);
        return;
      case LilyPondPackage.REPEATED_MUSIC__MUSIC:
        setMusic((Music)newValue);
        return;
      case LilyPondPackage.REPEATED_MUSIC__ALTERNATIVE:
        setAlternative((AlternativeMusic)newValue);
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
      case LilyPondPackage.REPEATED_MUSIC__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case LilyPondPackage.REPEATED_MUSIC__NUMBER:
        setNumber(NUMBER_EDEFAULT);
        return;
      case LilyPondPackage.REPEATED_MUSIC__MUSIC:
        setMusic((Music)null);
        return;
      case LilyPondPackage.REPEATED_MUSIC__ALTERNATIVE:
        setAlternative((AlternativeMusic)null);
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
      case LilyPondPackage.REPEATED_MUSIC__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case LilyPondPackage.REPEATED_MUSIC__NUMBER:
        return number != NUMBER_EDEFAULT;
      case LilyPondPackage.REPEATED_MUSIC__MUSIC:
        return music != null;
      case LilyPondPackage.REPEATED_MUSIC__ALTERNATIVE:
        return alternative != null;
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
    result.append(", number: ");
    result.append(number);
    result.append(')');
    return result.toString();
  }

} //RepeatedMusicImpl
