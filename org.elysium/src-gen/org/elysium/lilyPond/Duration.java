/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.Duration#getBase <em>Base</em>}</li>
 *   <li>{@link org.elysium.lilyPond.Duration#getDots <em>Dots</em>}</li>
 *   <li>{@link org.elysium.lilyPond.Duration#getMultipliers <em>Multipliers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getDuration()
 * @model
 * @generated
 */
public interface Duration extends EObject
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' attribute.
   * @see #setBase(int)
   * @see org.elysium.lilyPond.LilyPondPackage#getDuration_Base()
   * @model
   * @generated
   */
  int getBase();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Duration#getBase <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' attribute.
   * @see #getBase()
   * @generated
   */
  void setBase(int value);

  /**
   * Returns the value of the '<em><b>Dots</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dots</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dots</em>' attribute list.
   * @see org.elysium.lilyPond.LilyPondPackage#getDuration_Dots()
   * @model unique="false"
   * @generated
   */
  EList<String> getDots();

  /**
   * Returns the value of the '<em><b>Multipliers</b></em>' containment reference list.
   * The list contents are of type {@link org.elysium.lilyPond.DurationMultiplier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multipliers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multipliers</em>' containment reference list.
   * @see org.elysium.lilyPond.LilyPondPackage#getDuration_Multipliers()
   * @model containment="true"
   * @generated
   */
  EList<DurationMultiplier> getMultipliers();

} // Duration
