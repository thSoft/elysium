/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fraction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.Fraction#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.elysium.lilyPond.Fraction#getDenominator <em>Denominator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getFraction()
 * @model
 * @generated
 */
public interface Fraction extends EObject
{
  /**
   * Returns the value of the '<em><b>Numerator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numerator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numerator</em>' attribute.
   * @see #setNumerator(int)
   * @see org.elysium.lilyPond.LilyPondPackage#getFraction_Numerator()
   * @model
   * @generated
   */
  int getNumerator();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Fraction#getNumerator <em>Numerator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numerator</em>' attribute.
   * @see #getNumerator()
   * @generated
   */
  void setNumerator(int value);

  /**
   * Returns the value of the '<em><b>Denominator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Denominator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Denominator</em>' attribute.
   * @see #setDenominator(int)
   * @see org.elysium.lilyPond.LilyPondPackage#getFraction_Denominator()
   * @model
   * @generated
   */
  int getDenominator();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Fraction#getDenominator <em>Denominator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Denominator</em>' attribute.
   * @see #getDenominator()
   * @generated
   */
  void setDenominator(int value);

} // Fraction
