/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.Note#getPitch <em>Pitch</em>}</li>
 *   <li>{@link org.elysium.lilyPond.Note#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.elysium.lilyPond.Note#isRest <em>Rest</em>}</li>
 *   <li>{@link org.elysium.lilyPond.Note#getPostEvents <em>Post Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends Event
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
   * @see org.elysium.lilyPond.LilyPondPackage#getNote_Pitch()
   * @model containment="true"
   * @generated
   */
  Pitch getPitch();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Note#getPitch <em>Pitch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pitch</em>' containment reference.
   * @see #getPitch()
   * @generated
   */
  void setPitch(Pitch value);

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
   * @see org.elysium.lilyPond.LilyPondPackage#getNote_Duration()
   * @model containment="true"
   * @generated
   */
  Duration getDuration();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Note#getDuration <em>Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' containment reference.
   * @see #getDuration()
   * @generated
   */
  void setDuration(Duration value);

  /**
   * Returns the value of the '<em><b>Rest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rest</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rest</em>' attribute.
   * @see #setRest(boolean)
   * @see org.elysium.lilyPond.LilyPondPackage#getNote_Rest()
   * @model
   * @generated
   */
  boolean isRest();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Note#isRest <em>Rest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rest</em>' attribute.
   * @see #isRest()
   * @generated
   */
  void setRest(boolean value);

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
   * @see org.elysium.lilyPond.LilyPondPackage#getNote_PostEvents()
   * @model containment="true"
   * @generated
   */
  EList<PostEvent> getPostEvents();

} // Note
