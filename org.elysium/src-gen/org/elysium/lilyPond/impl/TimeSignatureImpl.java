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

import org.elysium.lilyPond.Fraction;
import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.TimeSignature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.TimeSignatureImpl#getFraction <em>Fraction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeSignatureImpl extends EventImpl implements TimeSignature
{
  /**
   * The cached value of the '{@link #getFraction() <em>Fraction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFraction()
   * @generated
   * @ordered
   */
  protected Fraction fraction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeSignatureImpl()
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
    return LilyPondPackage.Literals.TIME_SIGNATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fraction getFraction()
  {
    return fraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFraction(Fraction newFraction, NotificationChain msgs)
  {
    Fraction oldFraction = fraction;
    fraction = newFraction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.TIME_SIGNATURE__FRACTION, oldFraction, newFraction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFraction(Fraction newFraction)
  {
    if (newFraction != fraction)
    {
      NotificationChain msgs = null;
      if (fraction != null)
        msgs = ((InternalEObject)fraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.TIME_SIGNATURE__FRACTION, null, msgs);
      if (newFraction != null)
        msgs = ((InternalEObject)newFraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.TIME_SIGNATURE__FRACTION, null, msgs);
      msgs = basicSetFraction(newFraction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.TIME_SIGNATURE__FRACTION, newFraction, newFraction));
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
      case LilyPondPackage.TIME_SIGNATURE__FRACTION:
        return basicSetFraction(null, msgs);
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
      case LilyPondPackage.TIME_SIGNATURE__FRACTION:
        return getFraction();
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
      case LilyPondPackage.TIME_SIGNATURE__FRACTION:
        setFraction((Fraction)newValue);
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
      case LilyPondPackage.TIME_SIGNATURE__FRACTION:
        setFraction((Fraction)null);
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
      case LilyPondPackage.TIME_SIGNATURE__FRACTION:
        return fraction != null;
    }
    return super.eIsSet(featureID);
  }

} //TimeSignatureImpl
