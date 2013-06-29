/**
 */
package org.elysium.lilypond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.Reference#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilypond.LilypondPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Command
{
  /**
   * Returns the value of the '<em><b>Assignment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment</em>' reference.
   * @see #setAssignment(Assignment)
   * @see org.elysium.lilypond.LilypondPackage#getReference_Assignment()
   * @model
   * @generated
   */
  Assignment getAssignment();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.Reference#getAssignment <em>Assignment</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment</em>' reference.
   * @see #getAssignment()
   * @generated
   */
  void setAssignment(Assignment value);

} // Reference
