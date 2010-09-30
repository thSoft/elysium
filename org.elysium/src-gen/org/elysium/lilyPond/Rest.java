/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.Rest#getType <em>Type</em>}</li>
 *   <li>{@link org.elysium.lilyPond.Rest#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.elysium.lilyPond.Rest#getPostEvents <em>Post Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getRest()
 * @model
 * @generated
 */
public interface Rest extends Event
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
   * @see org.elysium.lilyPond.LilyPondPackage#getRest_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Rest#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see org.elysium.lilyPond.LilyPondPackage#getRest_Duration()
   * @model containment="true"
   * @generated
   */
  Duration getDuration();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.Rest#getDuration <em>Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duration</em>' containment reference.
   * @see #getDuration()
   * @generated
   */
  void setDuration(Duration value);

  /**
   * Returns the value of the '<em><b>Post Events</b></em>' containment reference list.
   * The list contents are of type {@link org.elysium.lilyPond.PostEvent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Events</em>' containment reference list.
   * @see org.elysium.lilyPond.LilyPondPackage#getRest_PostEvents()
   * @model containment="true"
   * @generated
   */
  EList<PostEvent> getPostEvents();

} // Rest
