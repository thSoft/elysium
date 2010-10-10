/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.Context#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilypond.LilypondPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends SpecialCommand
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(UnparsedBlock)
   * @see org.elysium.lilypond.LilypondPackage#getContext_Body()
   * @model containment="true"
   * @generated
   */
  UnparsedBlock getBody();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.Context#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(UnparsedBlock value);

} // Context
