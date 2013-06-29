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
import org.elysium.lilypond.MusicWithLyrics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Music With Lyrics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilypond.impl.MusicWithLyricsImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.elysium.lilypond.impl.MusicWithLyricsImpl#getLyrics <em>Lyrics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MusicWithLyricsImpl extends SpecialCommandImpl implements MusicWithLyrics
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getLyrics() <em>Lyrics</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLyrics()
   * @generated
   * @ordered
   */
  protected Expression lyrics;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MusicWithLyricsImpl()
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
    return LilypondPackage.Literals.MUSIC_WITH_LYRICS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilypondPackage.MUSIC_WITH_LYRICS__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLyrics()
  {
    return lyrics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLyrics(Expression newLyrics, NotificationChain msgs)
  {
    Expression oldLyrics = lyrics;
    lyrics = newLyrics;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilypondPackage.MUSIC_WITH_LYRICS__LYRICS, oldLyrics, newLyrics);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLyrics(Expression newLyrics)
  {
    if (newLyrics != lyrics)
    {
      NotificationChain msgs = null;
      if (lyrics != null)
        msgs = ((InternalEObject)lyrics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilypondPackage.MUSIC_WITH_LYRICS__LYRICS, null, msgs);
      if (newLyrics != null)
        msgs = ((InternalEObject)newLyrics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilypondPackage.MUSIC_WITH_LYRICS__LYRICS, null, msgs);
      msgs = basicSetLyrics(newLyrics, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilypondPackage.MUSIC_WITH_LYRICS__LYRICS, newLyrics, newLyrics));
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
      case LilypondPackage.MUSIC_WITH_LYRICS__LYRICS:
        return basicSetLyrics(null, msgs);
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
      case LilypondPackage.MUSIC_WITH_LYRICS__ID:
        return getId();
      case LilypondPackage.MUSIC_WITH_LYRICS__LYRICS:
        return getLyrics();
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
      case LilypondPackage.MUSIC_WITH_LYRICS__ID:
        setId((String)newValue);
        return;
      case LilypondPackage.MUSIC_WITH_LYRICS__LYRICS:
        setLyrics((Expression)newValue);
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
      case LilypondPackage.MUSIC_WITH_LYRICS__ID:
        setId(ID_EDEFAULT);
        return;
      case LilypondPackage.MUSIC_WITH_LYRICS__LYRICS:
        setLyrics((Expression)null);
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
      case LilypondPackage.MUSIC_WITH_LYRICS__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case LilypondPackage.MUSIC_WITH_LYRICS__LYRICS:
        return lyrics != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //MusicWithLyricsImpl
