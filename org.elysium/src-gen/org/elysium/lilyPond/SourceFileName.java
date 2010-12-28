/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source File Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.SourceFileName#getFilename <em>Filename</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilypond.LilypondPackage#getSourceFileName()
 * @model
 * @generated
 */
public interface SourceFileName extends SpecialCommand
{
  /**
   * Returns the value of the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filename</em>' attribute.
   * @see #setFilename(String)
   * @see org.elysium.lilypond.LilypondPackage#getSourceFileName_Filename()
   * @model
   * @generated
   */
  String getFilename();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.SourceFileName#getFilename <em>Filename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filename</em>' attribute.
   * @see #getFilename()
   * @generated
   */
  void setFilename(String value);

} // SourceFileName
