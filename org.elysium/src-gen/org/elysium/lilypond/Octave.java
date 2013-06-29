/**
 */
package org.elysium.lilypond;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Octave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.Octave#getUp <em>Up</em>}</li>
 *   <li>{@link org.elysium.lilypond.Octave#getDown <em>Down</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilypond.LilypondPackage#getOctave()
 * @model
 * @generated
 */
public interface Octave extends EObject
{
  /**
   * Returns the value of the '<em><b>Up</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Up</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Up</em>' attribute list.
   * @see org.elysium.lilypond.LilypondPackage#getOctave_Up()
   * @model unique="false"
   * @generated
   */
  EList<String> getUp();

  /**
   * Returns the value of the '<em><b>Down</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Down</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Down</em>' attribute list.
   * @see org.elysium.lilypond.LilypondPackage#getOctave_Down()
   * @model unique="false"
   * @generated
   */
  EList<String> getDown();

} // Octave
