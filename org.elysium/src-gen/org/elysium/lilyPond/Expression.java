/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.Expression#getParentBlock <em>Parent Block</em>}</li>
 *   <li>{@link org.elysium.lilyPond.Expression#getParentLilyPond <em>Parent Lily Pond</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Parent Block</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.elysium.lilyPond.Block#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Block</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Block</em>' container reference.
   * @see #setParentBlock(Block)
   * @see org.elysium.lilyPond.LilyPondPackage#getExpression_ParentBlock()
   * @see org.elysium.lilyPond.Block#getExpressions
   * @model opposite="expressions" transient="false"
   * @generated
   */
  Block getParentBlock();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Expression#getParentBlock <em>Parent Block</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Block</em>' container reference.
   * @see #getParentBlock()
   * @generated
   */
  void setParentBlock(Block value);

  /**
   * Returns the value of the '<em><b>Parent Lily Pond</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.elysium.lilyPond.LilyPond#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Lily Pond</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Lily Pond</em>' container reference.
   * @see #setParentLilyPond(LilyPond)
   * @see org.elysium.lilyPond.LilyPondPackage#getExpression_ParentLilyPond()
   * @see org.elysium.lilyPond.LilyPond#getExpressions
   * @model opposite="expressions" transient="false"
   * @generated
   */
  LilyPond getParentLilyPond();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Expression#getParentLilyPond <em>Parent Lily Pond</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Lily Pond</em>' container reference.
   * @see #getParentLilyPond()
   * @generated
   */
  void setParentLilyPond(LilyPond value);

} // Expression
