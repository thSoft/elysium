/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.SchemeNumber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheme Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.SchemeNumberImpl#isHexadecimal <em>Hexadecimal</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.SchemeNumberImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemeNumberImpl extends SchemeValueImpl implements SchemeNumber
{
  /**
   * The default value of the '{@link #isHexadecimal() <em>Hexadecimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHexadecimal()
   * @generated
   * @ordered
   */
  protected static final boolean HEXADECIMAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHexadecimal() <em>Hexadecimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHexadecimal()
   * @generated
   * @ordered
   */
  protected boolean hexadecimal = HEXADECIMAL_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemeNumberImpl()
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
    return LilyPondPackage.Literals.SCHEME_NUMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHexadecimal()
  {
    return hexadecimal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHexadecimal(boolean newHexadecimal)
  {
    boolean oldHexadecimal = hexadecimal;
    hexadecimal = newHexadecimal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.SCHEME_NUMBER__HEXADECIMAL, oldHexadecimal, hexadecimal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.SCHEME_NUMBER__VALUE, oldValue, value));
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
      case LilyPondPackage.SCHEME_NUMBER__HEXADECIMAL:
        return isHexadecimal();
      case LilyPondPackage.SCHEME_NUMBER__VALUE:
        return getValue();
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
      case LilyPondPackage.SCHEME_NUMBER__HEXADECIMAL:
        setHexadecimal((Boolean)newValue);
        return;
      case LilyPondPackage.SCHEME_NUMBER__VALUE:
        setValue((Integer)newValue);
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
      case LilyPondPackage.SCHEME_NUMBER__HEXADECIMAL:
        setHexadecimal(HEXADECIMAL_EDEFAULT);
        return;
      case LilyPondPackage.SCHEME_NUMBER__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case LilyPondPackage.SCHEME_NUMBER__HEXADECIMAL:
        return hexadecimal != HEXADECIMAL_EDEFAULT;
      case LilyPondPackage.SCHEME_NUMBER__VALUE:
        return value != VALUE_EDEFAULT;
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
    result.append(" (hexadecimal: ");
    result.append(hexadecimal);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //SchemeNumberImpl
