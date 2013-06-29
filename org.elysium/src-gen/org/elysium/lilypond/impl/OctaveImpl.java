/**
 */
package org.elysium.lilypond.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.elysium.lilypond.LilypondPackage;
import org.elysium.lilypond.Octave;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Octave</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilypond.impl.OctaveImpl#getUp <em>Up</em>}</li>
 *   <li>{@link org.elysium.lilypond.impl.OctaveImpl#getDown <em>Down</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OctaveImpl extends MinimalEObjectImpl.Container implements Octave
{
  /**
   * The cached value of the '{@link #getUp() <em>Up</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUp()
   * @generated
   * @ordered
   */
  protected EList<String> up;

  /**
   * The cached value of the '{@link #getDown() <em>Down</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDown()
   * @generated
   * @ordered
   */
  protected EList<String> down;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OctaveImpl()
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
    return LilypondPackage.Literals.OCTAVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getUp()
  {
    if (up == null)
    {
      up = new EDataTypeEList<String>(String.class, this, LilypondPackage.OCTAVE__UP);
    }
    return up;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDown()
  {
    if (down == null)
    {
      down = new EDataTypeEList<String>(String.class, this, LilypondPackage.OCTAVE__DOWN);
    }
    return down;
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
      case LilypondPackage.OCTAVE__UP:
        return getUp();
      case LilypondPackage.OCTAVE__DOWN:
        return getDown();
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
      case LilypondPackage.OCTAVE__UP:
        getUp().clear();
        getUp().addAll((Collection<? extends String>)newValue);
        return;
      case LilypondPackage.OCTAVE__DOWN:
        getDown().clear();
        getDown().addAll((Collection<? extends String>)newValue);
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
      case LilypondPackage.OCTAVE__UP:
        getUp().clear();
        return;
      case LilypondPackage.OCTAVE__DOWN:
        getDown().clear();
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
      case LilypondPackage.OCTAVE__UP:
        return up != null && !up.isEmpty();
      case LilypondPackage.OCTAVE__DOWN:
        return down != null && !down.isEmpty();
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
    result.append(" (up: ");
    result.append(up);
    result.append(", down: ");
    result.append(down);
    result.append(')');
    return result.toString();
  }

} //OctaveImpl
