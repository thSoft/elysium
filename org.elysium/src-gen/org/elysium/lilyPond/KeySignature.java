/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.KeySignature#getTonic <em>Tonic</em>}</li>
 *   <li>{@link org.elysium.lilyPond.KeySignature#getMode <em>Mode</em>}</li>
 *   <li>{@link org.elysium.lilyPond.KeySignature#isDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getKeySignature()
 * @model
 * @generated
 */
public interface KeySignature extends Event
{
  /**
   * Returns the value of the '<em><b>Tonic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tonic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tonic</em>' attribute.
   * @see #setTonic(String)
   * @see org.elysium.lilyPond.LilyPondPackage#getKeySignature_Tonic()
   * @model
   * @generated
   */
  String getTonic();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.KeySignature#getTonic <em>Tonic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tonic</em>' attribute.
   * @see #getTonic()
   * @generated
   */
  void setTonic(String value);

  /**
   * Returns the value of the '<em><b>Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' containment reference.
   * @see #setMode(Reference)
   * @see org.elysium.lilyPond.LilyPondPackage#getKeySignature_Mode()
   * @model containment="true"
   * @generated
   */
  Reference getMode();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.KeySignature#getMode <em>Mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' containment reference.
   * @see #getMode()
   * @generated
   */
  void setMode(Reference value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' attribute.
   * @see #setDefault(boolean)
   * @see org.elysium.lilyPond.LilyPondPackage#getKeySignature_Default()
   * @model
   * @generated
   */
  boolean isDefault();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.KeySignature#isDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see #isDefault()
   * @generated
   */
  void setDefault(boolean value);

} // KeySignature
