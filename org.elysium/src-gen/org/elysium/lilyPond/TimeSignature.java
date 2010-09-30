/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.TimeSignature#getFraction <em>Fraction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getTimeSignature()
 * @model
 * @generated
 */
public interface TimeSignature extends Event
{
  /**
   * Returns the value of the '<em><b>Fraction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fraction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fraction</em>' containment reference.
   * @see #setFraction(Fraction)
   * @see org.elysium.lilyPond.LilyPondPackage#getTimeSignature_Fraction()
   * @model containment="true"
   * @generated
   */
  Fraction getFraction();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.TimeSignature#getFraction <em>Fraction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fraction</em>' containment reference.
   * @see #getFraction()
   * @generated
   */
  void setFraction(Fraction value);

} // TimeSignature
