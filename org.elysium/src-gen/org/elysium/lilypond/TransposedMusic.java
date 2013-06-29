/**
 */
package org.elysium.lilypond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transposed Music</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.TransposedMusic#getSource <em>Source</em>}</li>
 *   <li>{@link org.elysium.lilypond.TransposedMusic#getTarget <em>Target</em>}</li>
 *   <li>{@link org.elysium.lilypond.TransposedMusic#getMusic <em>Music</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilypond.LilypondPackage#getTransposedMusic()
 * @model
 * @generated
 */
public interface TransposedMusic extends SpecialCommand
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(Pitch)
   * @see org.elysium.lilypond.LilypondPackage#getTransposedMusic_Source()
   * @model containment="true"
   * @generated
   */
  Pitch getSource();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.TransposedMusic#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Pitch value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(Pitch)
   * @see org.elysium.lilypond.LilypondPackage#getTransposedMusic_Target()
   * @model containment="true"
   * @generated
   */
  Pitch getTarget();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.TransposedMusic#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Pitch value);

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
   * @see org.elysium.lilypond.LilypondPackage#getTransposedMusic_Music()
   * @model containment="true"
   * @generated
   */
  Expression getMusic();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.TransposedMusic#getMusic <em>Music</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Music</em>' containment reference.
   * @see #getMusic()
   * @generated
   */
  void setMusic(Expression value);

} // TransposedMusic
