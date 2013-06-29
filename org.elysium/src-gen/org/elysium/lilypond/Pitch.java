/**
 */
package org.elysium.lilypond;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pitch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.Pitch#getBase <em>Base</em>}</li>
 *   <li>{@link org.elysium.lilypond.Pitch#isOctaveCheck <em>Octave Check</em>}</li>
 *   <li>{@link org.elysium.lilypond.Pitch#getOctaveShift <em>Octave Shift</em>}</li>
 *   <li>{@link org.elysium.lilypond.Pitch#isReminderAccidental <em>Reminder Accidental</em>}</li>
 *   <li>{@link org.elysium.lilypond.Pitch#isCautionaryAccidental <em>Cautionary Accidental</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilypond.LilypondPackage#getPitch()
 * @model
 * @generated
 */
public interface Pitch extends EObject
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' attribute.
   * @see #setBase(String)
   * @see org.elysium.lilypond.LilypondPackage#getPitch_Base()
   * @model
   * @generated
   */
  String getBase();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.Pitch#getBase <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' attribute.
   * @see #getBase()
   * @generated
   */
  void setBase(String value);

  /**
   * Returns the value of the '<em><b>Octave Check</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Octave Check</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Octave Check</em>' attribute.
   * @see #setOctaveCheck(boolean)
   * @see org.elysium.lilypond.LilypondPackage#getPitch_OctaveCheck()
   * @model
   * @generated
   */
  boolean isOctaveCheck();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.Pitch#isOctaveCheck <em>Octave Check</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Octave Check</em>' attribute.
   * @see #isOctaveCheck()
   * @generated
   */
  void setOctaveCheck(boolean value);

  /**
   * Returns the value of the '<em><b>Octave Shift</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Octave Shift</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Octave Shift</em>' containment reference.
   * @see #setOctaveShift(Octave)
   * @see org.elysium.lilypond.LilypondPackage#getPitch_OctaveShift()
   * @model containment="true"
   * @generated
   */
  Octave getOctaveShift();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.Pitch#getOctaveShift <em>Octave Shift</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Octave Shift</em>' containment reference.
   * @see #getOctaveShift()
   * @generated
   */
  void setOctaveShift(Octave value);

  /**
   * Returns the value of the '<em><b>Reminder Accidental</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reminder Accidental</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reminder Accidental</em>' attribute.
   * @see #setReminderAccidental(boolean)
   * @see org.elysium.lilypond.LilypondPackage#getPitch_ReminderAccidental()
   * @model
   * @generated
   */
  boolean isReminderAccidental();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.Pitch#isReminderAccidental <em>Reminder Accidental</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reminder Accidental</em>' attribute.
   * @see #isReminderAccidental()
   * @generated
   */
  void setReminderAccidental(boolean value);

  /**
   * Returns the value of the '<em><b>Cautionary Accidental</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cautionary Accidental</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cautionary Accidental</em>' attribute.
   * @see #setCautionaryAccidental(boolean)
   * @see org.elysium.lilypond.LilypondPackage#getPitch_CautionaryAccidental()
   * @model
   * @generated
   */
  boolean isCautionaryAccidental();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.Pitch#isCautionaryAccidental <em>Cautionary Accidental</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cautionary Accidental</em>' attribute.
   * @see #isCautionaryAccidental()
   * @generated
   */
  void setCautionaryAccidental(boolean value);

} // Pitch
