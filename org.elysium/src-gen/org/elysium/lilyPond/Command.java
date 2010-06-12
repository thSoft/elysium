/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.Command#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends Expression
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.elysium.lilyPond.LilyPondPackage#getCommand_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Command#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // Command
