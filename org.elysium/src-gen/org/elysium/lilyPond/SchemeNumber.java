/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheme Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.SchemeNumber#isHexadecimal <em>Hexadecimal</em>}</li>
 *   <li>{@link org.elysium.lilyPond.SchemeNumber#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getSchemeNumber()
 * @model
 * @generated
 */
public interface SchemeNumber extends SchemeValue
{
  /**
   * Returns the value of the '<em><b>Hexadecimal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hexadecimal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hexadecimal</em>' attribute.
   * @see #setHexadecimal(boolean)
   * @see org.elysium.lilyPond.LilyPondPackage#getSchemeNumber_Hexadecimal()
   * @model
   * @generated
   */
  boolean isHexadecimal();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.SchemeNumber#isHexadecimal <em>Hexadecimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hexadecimal</em>' attribute.
   * @see #isHexadecimal()
   * @generated
   */
  void setHexadecimal(boolean value);

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
   * @see org.elysium.lilyPond.LilyPondPackage#getSchemeNumber_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.SchemeNumber#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // SchemeNumber
