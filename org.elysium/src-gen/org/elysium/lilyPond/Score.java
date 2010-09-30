/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.Score#getMusic <em>Music</em>}</li>
 *   <li>{@link org.elysium.lilyPond.Score#getOther <em>Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getScore()
 * @model
 * @generated
 */
public interface Score extends ToplevelExpression, Value, BookPartElement
{
  /**
   * Returns the value of the '<em><b>Music</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Music</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Music</em>' containment reference.
   * @see #setMusic(Music)
   * @see org.elysium.lilyPond.LilyPondPackage#getScore_Music()
   * @model containment="true"
   * @generated
   */
  Music getMusic();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Score#getMusic <em>Music</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Music</em>' containment reference.
   * @see #getMusic()
   * @generated
   */
  void setMusic(Music value);

  /**
   * Returns the value of the '<em><b>Other</b></em>' containment reference list.
   * The list contents are of type {@link org.elysium.lilyPond.ScoreElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Other</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other</em>' containment reference list.
   * @see org.elysium.lilyPond.LilyPondPackage#getScore_Other()
   * @model containment="true"
   * @generated
   */
  EList<ScoreElement> getOther();

} // Score
