/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.Block#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Expression
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.elysium.lilyPond.Expression}.
   * It is bidirectional and its opposite is '{@link org.elysium.lilyPond.Expression#getParentBlock <em>Parent Block</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.elysium.lilyPond.LilyPondPackage#getBlock_Expressions()
   * @see org.elysium.lilyPond.Expression#getParentBlock
   * @model opposite="parentBlock" containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // Block
