/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeated Music</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.RepeatedMusic#getType <em>Type</em>}</li>
 *   <li>{@link org.elysium.lilyPond.RepeatedMusic#getNumber <em>Number</em>}</li>
 *   <li>{@link org.elysium.lilyPond.RepeatedMusic#getMusic <em>Music</em>}</li>
 *   <li>{@link org.elysium.lilyPond.RepeatedMusic#getAlternative <em>Alternative</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getRepeatedMusic()
 * @model
 * @generated
 */
public interface RepeatedMusic extends CompositeMusic
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.elysium.lilyPond.LilyPondPackage#getRepeatedMusic_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.RepeatedMusic#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see org.elysium.lilyPond.LilyPondPackage#getRepeatedMusic_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.RepeatedMusic#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

  /**
   * Returns the value of the '<em><b>Music</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Music</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Music</em>' containment reference.
   * @see #setMusic(Music)
   * @see org.elysium.lilyPond.LilyPondPackage#getRepeatedMusic_Music()
   * @model containment="true"
   * @generated
   */
  Music getMusic();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.RepeatedMusic#getMusic <em>Music</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Music</em>' containment reference.
   * @see #getMusic()
   * @generated
   */
  void setMusic(Music value);

  /**
   * Returns the value of the '<em><b>Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alternative</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alternative</em>' containment reference.
   * @see #setAlternative(AlternativeMusic)
   * @see org.elysium.lilyPond.LilyPondPackage#getRepeatedMusic_Alternative()
   * @model containment="true"
   * @generated
   */
  AlternativeMusic getAlternative();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.RepeatedMusic#getAlternative <em>Alternative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alternative</em>' containment reference.
   * @see #getAlternative()
   * @generated
   */
  void setAlternative(AlternativeMusic value);

} // RepeatedMusic
