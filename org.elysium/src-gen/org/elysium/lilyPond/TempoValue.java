/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tempo Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.TempoValue#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.elysium.lilyPond.TempoValue#getBpm <em>Bpm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getTempoValue()
 * @model
 * @generated
 */
public interface TempoValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duration</em>' containment reference.
   * @see #setDuration(Duration)
   * @see org.elysium.lilyPond.LilyPondPackage#getTempoValue_Duration()
   * @model containment="true"
   * @generated
   */
  Duration getDuration();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.TempoValue#getDuration <em>Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' containment reference.
   * @see #getDuration()
   * @generated
   */
  void setDuration(Duration value);

  /**
   * Returns the value of the '<em><b>Bpm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bpm</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bpm</em>' attribute.
   * @see #setBpm(int)
   * @see org.elysium.lilyPond.LilyPondPackage#getTempoValue_Bpm()
   * @model
   * @generated
   */
  int getBpm();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.TempoValue#getBpm <em>Bpm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bpm</em>' attribute.
   * @see #getBpm()
   * @generated
   */
  void setBpm(int value);

} // TempoValue
