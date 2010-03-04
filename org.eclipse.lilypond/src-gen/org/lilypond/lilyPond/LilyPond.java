/**
 * <copyright>
 * </copyright>
 *
 */
package org.lilypond.lilyPond;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lily Pond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lilypond.lilyPond.LilyPond#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lilypond.lilyPond.LilyPondPackage#getLilyPond()
 * @model
 * @generated
 */
public interface LilyPond extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' attribute list.
   * @see org.lilypond.lilyPond.LilyPondPackage#getLilyPond_Expressions()
   * @model unique="false"
   * @generated
   */
  EList<String> getExpressions();

} // LilyPond
