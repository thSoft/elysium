/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequential Music</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.SequentialMusic#getMusic <em>Music</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getSequentialMusic()
 * @model
 * @generated
 */
public interface SequentialMusic extends CompositeMusic
{
  /**
   * Returns the value of the '<em><b>Music</b></em>' containment reference list.
   * The list contents are of type {@link org.elysium.lilyPond.Music}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Music</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Music</em>' containment reference list.
   * @see org.elysium.lilyPond.LilyPondPackage#getSequentialMusic_Music()
   * @model containment="true"
   * @generated
   */
  EList<Music> getMusic();

} // SequentialMusic
