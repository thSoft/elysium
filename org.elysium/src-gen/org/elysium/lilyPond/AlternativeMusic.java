/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative Music</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.AlternativeMusic#getMusic <em>Music</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getAlternativeMusic()
 * @model
 * @generated
 */
public interface AlternativeMusic extends EObject
{
  /**
   * Returns the value of the '<em><b>Music</b></em>' containment reference list.
   * The list contents are of type {@link org.elysium.lilyPond.MusicOrScheme}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Music</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Music</em>' containment reference list.
   * @see org.elysium.lilyPond.LilyPondPackage#getAlternativeMusic_Music()
   * @model containment="true"
   * @generated
   */
  EList<MusicOrScheme> getMusic();

} // AlternativeMusic
