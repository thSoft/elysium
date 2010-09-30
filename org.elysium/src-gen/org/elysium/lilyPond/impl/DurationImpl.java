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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.elysium.lilyPond.Duration;
import org.elysium.lilyPond.DurationMultiplier;
import org.elysium.lilyPond.LilyPondPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.DurationImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.DurationImpl#getDots <em>Dots</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.DurationImpl#getMultipliers <em>Multipliers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationImpl extends MinimalEObjectImpl.Container implements Duration
{
  /**
   * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected static final int BASE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected int base = BASE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDots() <em>Dots</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDots()
   * @generated
   * @ordered
   */
  protected EList<String> dots;

  /**
   * The cached value of the '{@link #getMultipliers() <em>Multipliers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultipliers()
   * @generated
   * @ordered
   */
  protected EList<DurationMultiplier> multipliers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DurationImpl()
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
    return LilyPondPackage.Literals.DURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBase()
  {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase(int newBase)
  {
    int oldBase = base;
    base = newBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.DURATION__BASE, oldBase, base));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDots()
  {
    if (dots == null)
    {
      dots = new EDataTypeEList<String>(String.class, this, LilyPondPackage.DURATION__DOTS);
    }
    return dots;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DurationMultiplier> getMultipliers()
  {
    if (multipliers == null)
    {
      multipliers = new EObjectContainmentEList<DurationMultiplier>(DurationMultiplier.class, this, LilyPondPackage.DURATION__MULTIPLIERS);
    }
    return multipliers;
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
      case LilyPondPackage.DURATION__MULTIPLIERS:
        return ((InternalEList<?>)getMultipliers()).basicRemove(otherEnd, msgs);
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
      case LilyPondPackage.DURATION__BASE:
        return getBase();
      case LilyPondPackage.DURATION__DOTS:
        return getDots();
      case LilyPondPackage.DURATION__MULTIPLIERS:
        return getMultipliers();
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
      case LilyPondPackage.DURATION__BASE:
        setBase((Integer)newValue);
        return;
      case LilyPondPackage.DURATION__DOTS:
        getDots().clear();
        getDots().addAll((Collection<? extends String>)newValue);
        return;
      case LilyPondPackage.DURATION__MULTIPLIERS:
        getMultipliers().clear();
        getMultipliers().addAll((Collection<? extends DurationMultiplier>)newValue);
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
      case LilyPondPackage.DURATION__BASE:
        setBase(BASE_EDEFAULT);
        return;
      case LilyPondPackage.DURATION__DOTS:
        getDots().clear();
        return;
      case LilyPondPackage.DURATION__MULTIPLIERS:
        getMultipliers().clear();
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
      case LilyPondPackage.DURATION__BASE:
        return base != BASE_EDEFAULT;
      case LilyPondPackage.DURATION__DOTS:
        return dots != null && !dots.isEmpty();
      case LilyPondPackage.DURATION__MULTIPLIERS:
        return multipliers != null && !multipliers.isEmpty();
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
    result.append(" (base: ");
    result.append(base);
    result.append(", dots: ");
    result.append(dots);
    result.append(')');
    return result.toString();
  }

} //DurationImpl
