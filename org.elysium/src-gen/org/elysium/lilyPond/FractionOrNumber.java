/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fraction Or Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.FractionOrNumber#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.elysium.lilyPond.FractionOrNumber#getDenominator <em>Denominator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getFractionOrNumber()
 * @model
 * @generated
 */
public interface FractionOrNumber extends DurationMultiplier
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
   * @see org.elysium.lilyPond.LilyPondPackage#getFractionOrNumber_Numerator()
   * @model
   * @generated
   */
  int getNumerator();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.FractionOrNumber#getNumerator <em>Numerator</em>}' attribute.
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
   * @see org.elysium.lilyPond.LilyPondPackage#getFractionOrNumber_Denominator()
   * @model
   * @generated
   */
  int getDenominator();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.FractionOrNumber#getDenominator <em>Denominator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Denominator</em>' attribute.
   * @see #getDenominator()
   * @generated
   */
  void setDenominator(int value);

} // FractionOrNumber
