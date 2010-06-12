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
 * A representation of the model object '<em><b>Lily Pond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.LilyPond#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getLilyPond()
 * @model
 * @generated
 */
public interface LilyPond extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.elysium.lilyPond.Expression}.
   * It is bidirectional and its opposite is '{@link org.elysium.lilyPond.Expression#getParentLilyPond <em>Parent Lily Pond</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.elysium.lilyPond.LilyPondPackage#getLilyPond_Expressions()
   * @see org.elysium.lilyPond.Expression#getParentLilyPond
   * @model opposite="parentLilyPond" containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // LilyPond
