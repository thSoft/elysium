/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Music</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.RelativeMusic#getPitch <em>Pitch</em>}</li>
 *   <li>{@link org.elysium.lilyPond.RelativeMusic#getMusic <em>Music</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getRelativeMusic()
 * @model
 * @generated
 */
public interface RelativeMusic extends CompositeMusic
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
   * @see org.elysium.lilyPond.LilyPondPackage#getRelativeMusic_Pitch()
   * @model containment="true"
   * @generated
   */
  Pitch getPitch();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.RelativeMusic#getPitch <em>Pitch</em>}' containment reference.
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
   * @see #setMusic(CompositeMusic)
   * @see org.elysium.lilyPond.LilyPondPackage#getRelativeMusic_Music()
   * @model containment="true"
   * @generated
   */
  CompositeMusic getMusic();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.RelativeMusic#getMusic <em>Music</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Music</em>' containment reference.
   * @see #getMusic()
   * @generated
   */
  void setMusic(CompositeMusic value);

} // RelativeMusic
