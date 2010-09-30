/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.PostEvent#getMusicFunction <em>Music Function</em>}</li>
 *   <li>{@link org.elysium.lilyPond.PostEvent#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.elysium.lilyPond.PostEvent#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getPostEvent()
 * @model
 * @generated
 */
public interface PostEvent extends Value
{
  /**
   * Returns the value of the '<em><b>Music Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Music Function</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Music Function</em>' containment reference.
   * @see #setMusicFunction(Reference)
   * @see org.elysium.lilyPond.LilyPondPackage#getPostEvent_MusicFunction()
   * @model containment="true"
   * @generated
   */
  Reference getMusicFunction();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.PostEvent#getMusicFunction <em>Music Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Music Function</em>' containment reference.
   * @see #getMusicFunction()
   * @generated
   */
  void setMusicFunction(Reference value);

  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * The literals are from the enumeration {@link org.elysium.lilyPond.Direction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see org.elysium.lilyPond.Direction
   * @see #setDirection(Direction)
   * @see org.elysium.lilyPond.LilyPondPackage#getPostEvent_Direction()
   * @model
   * @generated
   */
  Direction getDirection();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.PostEvent#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see org.elysium.lilyPond.Direction
   * @see #getDirection()
   * @generated
   */
  void setDirection(Direction value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(EObject)
   * @see org.elysium.lilyPond.LilyPondPackage#getPostEvent_Event()
   * @model containment="true"
   * @generated
   */
  EObject getEvent();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.PostEvent#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(EObject value);

} // PostEvent
