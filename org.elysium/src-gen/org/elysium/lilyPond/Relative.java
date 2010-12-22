/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.Relative#getPitch <em>Pitch</em>}</li>
 *   <li>{@link org.elysium.lilypond.Relative#getMusic <em>Music</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilypond.LilypondPackage#getRelative()
 * @model
 * @generated
 */
public interface Relative extends SpecialCommand
{
  /**
   * Returns the value of the '<em><b>Pitch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pitch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pitch</em>' containment reference.
   * @see #setPitch(Pitch)
   * @see org.elysium.lilypond.LilypondPackage#getRelative_Pitch()
   * @model containment="true"
   * @generated
   */
  Pitch getPitch();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.Relative#getPitch <em>Pitch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pitch</em>' containment reference.
   * @see #getPitch()
   * @generated
   */
  void setPitch(Pitch value);

  /**
   * Returns the value of the '<em><b>Music</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Music</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Music</em>' containment reference.
   * @see #setMusic(Expression)
   * @see org.elysium.lilypond.LilypondPackage#getRelative_Music()
   * @model containment="true"
   * @generated
   */
  Expression getMusic();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.Relative#getMusic <em>Music</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Music</em>' containment reference.
   * @see #getMusic()
   * @generated
   */
  void setMusic(Expression value);

} // Relative
