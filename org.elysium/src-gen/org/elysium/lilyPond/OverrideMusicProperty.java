/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Override Music Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.OverrideMusicProperty#getPath <em>Path</em>}</li>
 *   <li>{@link org.elysium.lilyPond.OverrideMusicProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getOverrideMusicProperty()
 * @model
 * @generated
 */
public interface OverrideMusicProperty extends MusicPropertyOperation
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(Scheme)
   * @see org.elysium.lilyPond.LilyPondPackage#getOverrideMusicProperty_Path()
   * @model containment="true"
   * @generated
   */
  Scheme getPath();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.OverrideMusicProperty#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(Scheme value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Scalar)
   * @see org.elysium.lilyPond.LilyPondPackage#getOverrideMusicProperty_Value()
   * @model containment="true"
   * @generated
   */
  Scalar getValue();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.OverrideMusicProperty#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Scalar value);

} // OverrideMusicProperty
