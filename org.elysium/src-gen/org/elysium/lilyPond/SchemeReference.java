/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheme Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.SchemeReference#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilypond.LilypondPackage#getSchemeReference()
 * @model
 * @generated
 */
public interface SchemeReference extends SchemeBlockElement
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(SchemeValue)
   * @see org.elysium.lilypond.LilypondPackage#getSchemeReference_Value()
   * @model containment="true"
   * @generated
   */
  SchemeValue getValue();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.SchemeReference#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(SchemeValue value);

} // SchemeReference
