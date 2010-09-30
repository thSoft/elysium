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

import org.elysium.lilyPond.KeySignature;
import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.KeySignatureImpl#getTonic <em>Tonic</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.KeySignatureImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.KeySignatureImpl#isDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeySignatureImpl extends EventImpl implements KeySignature
{
  /**
   * The default value of the '{@link #getTonic() <em>Tonic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTonic()
   * @generated
   * @ordered
   */
  protected static final String TONIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTonic() <em>Tonic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTonic()
   * @generated
   * @ordered
   */
  protected String tonic = TONIC_EDEFAULT;

  /**
   * The cached value of the '{@link #getMode() <em>Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected Reference mode;

  /**
   * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDefault()
   * @generated
   * @ordered
   */
  protected static final boolean DEFAULT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDefault()
   * @generated
   * @ordered
   */
  protected boolean default_ = DEFAULT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KeySignatureImpl()
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
    return LilyPondPackage.Literals.KEY_SIGNATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTonic()
  {
    return tonic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTonic(String newTonic)
  {
    String oldTonic = tonic;
    tonic = newTonic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.KEY_SIGNATURE__TONIC, oldTonic, tonic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference getMode()
  {
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMode(Reference newMode, NotificationChain msgs)
  {
    Reference oldMode = mode;
    mode = newMode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.KEY_SIGNATURE__MODE, oldMode, newMode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMode(Reference newMode)
  {
    if (newMode != mode)
    {
      NotificationChain msgs = null;
      if (mode != null)
        msgs = ((InternalEObject)mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.KEY_SIGNATURE__MODE, null, msgs);
      if (newMode != null)
        msgs = ((InternalEObject)newMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.KEY_SIGNATURE__MODE, null, msgs);
      msgs = basicSetMode(newMode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.KEY_SIGNATURE__MODE, newMode, newMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(boolean newDefault)
  {
    boolean oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.KEY_SIGNATURE__DEFAULT, oldDefault, default_));
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
      case LilyPondPackage.KEY_SIGNATURE__MODE:
        return basicSetMode(null, msgs);
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
      case LilyPondPackage.KEY_SIGNATURE__TONIC:
        return getTonic();
      case LilyPondPackage.KEY_SIGNATURE__MODE:
        return getMode();
      case LilyPondPackage.KEY_SIGNATURE__DEFAULT:
        return isDefault();
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
      case LilyPondPackage.KEY_SIGNATURE__TONIC:
        setTonic((String)newValue);
        return;
      case LilyPondPackage.KEY_SIGNATURE__MODE:
        setMode((Reference)newValue);
        return;
      case LilyPondPackage.KEY_SIGNATURE__DEFAULT:
        setDefault((Boolean)newValue);
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
      case LilyPondPackage.KEY_SIGNATURE__TONIC:
        setTonic(TONIC_EDEFAULT);
        return;
      case LilyPondPackage.KEY_SIGNATURE__MODE:
        setMode((Reference)null);
        return;
      case LilyPondPackage.KEY_SIGNATURE__DEFAULT:
        setDefault(DEFAULT_EDEFAULT);
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
      case LilyPondPackage.KEY_SIGNATURE__TONIC:
        return TONIC_EDEFAULT == null ? tonic != null : !TONIC_EDEFAULT.equals(tonic);
      case LilyPondPackage.KEY_SIGNATURE__MODE:
        return mode != null;
      case LilyPondPackage.KEY_SIGNATURE__DEFAULT:
        return default_ != DEFAULT_EDEFAULT;
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
    result.append(" (tonic: ");
    result.append(tonic);
    result.append(", default: ");
    result.append(default_);
    result.append(')');
    return result.toString();
  }

} //KeySignatureImpl
