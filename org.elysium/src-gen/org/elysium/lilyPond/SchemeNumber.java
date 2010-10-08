/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheme Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.SchemeNumber#getRadix <em>Radix</em>}</li>
 *   <li>{@link org.elysium.lilypond.SchemeNumber#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilypond.LilypondPackage#getSchemeNumber()
 * @model
 * @generated
 */
public interface SchemeNumber extends SchemeValue
{
  /**
   * Returns the value of the '<em><b>Radix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Radix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Radix</em>' attribute.
   * @see #setRadix(String)
   * @see org.elysium.lilypond.LilypondPackage#getSchemeNumber_Radix()
   * @model
   * @generated
   */
  String getRadix();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.SchemeNumber#getRadix <em>Radix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Radix</em>' attribute.
   * @see #getRadix()
   * @generated
   */
  void setRadix(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.elysium.lilypond.LilypondPackage#getSchemeNumber_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.SchemeNumber#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // SchemeNumber
