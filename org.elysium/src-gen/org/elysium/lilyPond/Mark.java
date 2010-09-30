/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mark</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.Mark#getMark <em>Mark</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getMark()
 * @model
 * @generated
 */
public interface Mark extends Event
{
  /**
   * Returns the value of the '<em><b>Mark</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mark</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mark</em>' containment reference.
   * @see #setMark(Scalar)
   * @see org.elysium.lilyPond.LilyPondPackage#getMark_Mark()
   * @model containment="true"
   * @generated
   */
  Scalar getMark();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Mark#getMark <em>Mark</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mark</em>' containment reference.
   * @see #getMark()
   * @generated
   */
  void setMark(Scalar value);

} // Mark
