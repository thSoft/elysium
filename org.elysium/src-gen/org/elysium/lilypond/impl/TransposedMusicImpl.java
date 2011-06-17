/**
 * <copyright>
 * </copyright>
 *
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
import org.elysium.lilypond.TransposedMusic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transposed Music</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilypond.impl.TransposedMusicImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.elysium.lilypond.impl.TransposedMusicImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.elysium.lilypond.impl.TransposedMusicImpl#getMusic <em>Music</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransposedMusicImpl extends SpecialCommandImpl implements TransposedMusic
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Pitch source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Pitch target;

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
  protected TransposedMusicImpl()
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
    return LilypondPackage.Literals.TRANSPOSED_MUSIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pitch getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(Pitch newSource, NotificationChain msgs)
  {
    Pitch oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilypondPackage.TRANSPOSED_MUSIC__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Pitch newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilypondPackage.TRANSPOSED_MUSIC__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilypondPackage.TRANSPOSED_MUSIC__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilypondPackage.TRANSPOSED_MUSIC__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pitch getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(Pitch newTarget, NotificationChain msgs)
  {
    Pitch oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilypondPackage.TRANSPOSED_MUSIC__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Pitch newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilypondPackage.TRANSPOSED_MUSIC__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilypondPackage.TRANSPOSED_MUSIC__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilypondPackage.TRANSPOSED_MUSIC__TARGET, newTarget, newTarget));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilypondPackage.TRANSPOSED_MUSIC__MUSIC, oldMusic, newMusic);
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
        msgs = ((InternalEObject)music).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilypondPackage.TRANSPOSED_MUSIC__MUSIC, null, msgs);
      if (newMusic != null)
        msgs = ((InternalEObject)newMusic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilypondPackage.TRANSPOSED_MUSIC__MUSIC, null, msgs);
      msgs = basicSetMusic(newMusic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilypondPackage.TRANSPOSED_MUSIC__MUSIC, newMusic, newMusic));
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
      case LilypondPackage.TRANSPOSED_MUSIC__SOURCE:
        return basicSetSource(null, msgs);
      case LilypondPackage.TRANSPOSED_MUSIC__TARGET:
        return basicSetTarget(null, msgs);
      case LilypondPackage.TRANSPOSED_MUSIC__MUSIC:
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
      case LilypondPackage.TRANSPOSED_MUSIC__SOURCE:
        return getSource();
      case LilypondPackage.TRANSPOSED_MUSIC__TARGET:
        return getTarget();
      case LilypondPackage.TRANSPOSED_MUSIC__MUSIC:
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
      case LilypondPackage.TRANSPOSED_MUSIC__SOURCE:
        setSource((Pitch)newValue);
        return;
      case LilypondPackage.TRANSPOSED_MUSIC__TARGET:
        setTarget((Pitch)newValue);
        return;
      case LilypondPackage.TRANSPOSED_MUSIC__MUSIC:
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
      case LilypondPackage.TRANSPOSED_MUSIC__SOURCE:
        setSource((Pitch)null);
        return;
      case LilypondPackage.TRANSPOSED_MUSIC__TARGET:
        setTarget((Pitch)null);
        return;
      case LilypondPackage.TRANSPOSED_MUSIC__MUSIC:
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
      case LilypondPackage.TRANSPOSED_MUSIC__SOURCE:
        return source != null;
      case LilypondPackage.TRANSPOSED_MUSIC__TARGET:
        return target != null;
      case LilypondPackage.TRANSPOSED_MUSIC__MUSIC:
        return music != null;
    }
    return super.eIsSet(featureID);
  }

} //TransposedMusicImpl
