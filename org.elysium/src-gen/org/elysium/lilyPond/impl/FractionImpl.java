/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.elysium.lilyPond.Fraction;
import org.elysium.lilyPond.LilyPondPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.FractionImpl#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.FractionImpl#getDenominator <em>Denominator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FractionImpl extends MinimalEObjectImpl.Container implements Fraction
{
  /**
   * The default value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumerator()
   * @generated
   * @ordered
   */
  protected static final int NUMERATOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumerator()
   * @generated
   * @ordered
   */
  protected int numerator = NUMERATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDenominator()
   * @generated
   * @ordered
   */
  protected static final int DENOMINATOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDenominator()
   * @generated
   * @ordered
   */
  protected int denominator = DENOMINATOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FractionImpl()
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
    return LilyPondPackage.Literals.FRACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNumerator()
  {
    return numerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumerator(int newNumerator)
  {
    int oldNumerator = numerator;
    numerator = newNumerator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.FRACTION__NUMERATOR, oldNumerator, numerator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDenominator()
  {
    return denominator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDenominator(int newDenominator)
  {
    int oldDenominator = denominator;
    denominator = newDenominator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.FRACTION__DENOMINATOR, oldDenominator, denominator));
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
      case LilyPondPackage.FRACTION__NUMERATOR:
        return getNumerator();
      case LilyPondPackage.FRACTION__DENOMINATOR:
        return getDenominator();
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
      case LilyPondPackage.FRACTION__NUMERATOR:
        setNumerator((Integer)newValue);
        return;
      case LilyPondPackage.FRACTION__DENOMINATOR:
        setDenominator((Integer)newValue);
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
      case LilyPondPackage.FRACTION__NUMERATOR:
        setNumerator(NUMERATOR_EDEFAULT);
        return;
      case LilyPondPackage.FRACTION__DENOMINATOR:
        setDenominator(DENOMINATOR_EDEFAULT);
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
      case LilyPondPackage.FRACTION__NUMERATOR:
        return numerator != NUMERATOR_EDEFAULT;
      case LilyPondPackage.FRACTION__DENOMINATOR:
        return denominator != DENOMINATOR_EDEFAULT;
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
    result.append(" (numerator: ");
    result.append(numerator);
    result.append(", denominator: ");
    result.append(denominator);
    result.append(')');
    return result.toString();
  }

} //FractionImpl
