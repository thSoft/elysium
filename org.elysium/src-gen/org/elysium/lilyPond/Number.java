/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.Number#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getNumber()
 * @model
 * @generated
 */
public interface Number extends Expression, SchemeValue
{
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
   * @see org.elysium.lilyPond.LilyPondPackage#getNumber_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Number#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // Number
