/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tremolo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.Tremolo#getDivision <em>Division</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getTremolo()
 * @model
 * @generated
 */
public interface Tremolo extends EventWithOptionalDirection
{
  /**
   * Returns the value of the '<em><b>Division</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Division</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Division</em>' attribute.
   * @see #setDivision(int)
   * @see org.elysium.lilyPond.LilyPondPackage#getTremolo_Division()
   * @model
   * @generated
   */
  int getDivision();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Tremolo#getDivision <em>Division</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Division</em>' attribute.
   * @see #getDivision()
   * @generated
   */
  void setDivision(int value);

} // Tremolo
