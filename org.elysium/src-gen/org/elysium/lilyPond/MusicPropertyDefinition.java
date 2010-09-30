/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Music Property Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.MusicPropertyDefinition#isOnce <em>Once</em>}</li>
 *   <li>{@link org.elysium.lilyPond.MusicPropertyDefinition#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getMusicPropertyDefinition()
 * @model
 * @generated
 */
public interface MusicPropertyDefinition extends SimpleMusic
{
  /**
   * Returns the value of the '<em><b>Once</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Once</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Once</em>' attribute.
   * @see #setOnce(boolean)
   * @see org.elysium.lilyPond.LilyPondPackage#getMusicPropertyDefinition_Once()
   * @model
   * @generated
   */
  boolean isOnce();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.MusicPropertyDefinition#isOnce <em>Once</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Once</em>' attribute.
   * @see #isOnce()
   * @generated
   */
  void setOnce(boolean value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' containment reference.
   * @see #setOperation(MusicPropertyOperation)
   * @see org.elysium.lilyPond.LilyPondPackage#getMusicPropertyDefinition_Operation()
   * @model containment="true"
   * @generated
   */
  MusicPropertyOperation getOperation();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.MusicPropertyDefinition#getOperation <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' containment reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(MusicPropertyOperation value);

} // MusicPropertyDefinition
