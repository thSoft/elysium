/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markup Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.MarkupBody#getCommand <em>Command</em>}</li>
 *   <li>{@link org.elysium.lilypond.MarkupBody#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilypond.LilypondPackage#getMarkupBody()
 * @model
 * @generated
 */
public interface MarkupBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Command</b></em>' containment reference list.
   * The list contents are of type {@link org.elysium.lilypond.UnparsedExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' containment reference list.
   * @see org.elysium.lilypond.LilypondPackage#getMarkupBody_Command()
   * @model containment="true"
   * @generated
   */
  EList<UnparsedExpression> getCommand();

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(UnparsedBlock)
   * @see org.elysium.lilypond.LilypondPackage#getMarkupBody_Block()
   * @model containment="true"
   * @generated
   */
  UnparsedBlock getBlock();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.MarkupBody#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(UnparsedBlock value);

} // MarkupBody
