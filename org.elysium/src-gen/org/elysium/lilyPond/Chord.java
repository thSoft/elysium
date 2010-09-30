/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chord</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.Chord#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.elysium.lilyPond.Chord#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.elysium.lilyPond.Chord#getPostEvents <em>Post Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getChord()
 * @model
 * @generated
 */
public interface Chord extends Event
{
  /**
   * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
   * The list contents are of type {@link org.elysium.lilyPond.Note}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notes</em>' containment reference list.
   * @see org.elysium.lilyPond.LilyPondPackage#getChord_Notes()
   * @model containment="true"
   * @generated
   */
  EList<Note> getNotes();

  /**
   * Returns the value of the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' containment reference.
   * @see #setDuration(Duration)
   * @see org.elysium.lilyPond.LilyPondPackage#getChord_Duration()
   * @model containment="true"
   * @generated
   */
  Duration getDuration();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Chord#getDuration <em>Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' containment reference.
   * @see #getDuration()
   * @generated
   */
  void setDuration(Duration value);

  /**
   * Returns the value of the '<em><b>Post Events</b></em>' containment reference list.
   * The list contents are of type {@link org.elysium.lilyPond.PostEvent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Events</em>' containment reference list.
   * @see org.elysium.lilyPond.LilyPondPackage#getChord_PostEvents()
   * @model containment="true"
   * @generated
   */
  EList<PostEvent> getPostEvents();

} // Chord
