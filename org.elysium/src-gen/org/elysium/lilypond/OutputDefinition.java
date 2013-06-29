/**
 */
package org.elysium.lilypond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.OutputDefinition#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilypond.LilypondPackage#getOutputDefinition()
 * @model
 * @generated
 */
public interface OutputDefinition extends SpecialCommand
{
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
   * @see org.elysium.lilypond.LilypondPackage#getOutputDefinition_Block()
   * @model containment="true"
   * @generated
   */
  UnparsedBlock getBlock();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.OutputDefinition#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(UnparsedBlock value);

} // OutputDefinition
