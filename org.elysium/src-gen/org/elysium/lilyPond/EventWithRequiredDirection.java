/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event With Required Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.EventWithRequiredDirection#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilyPond.LilyPondPackage#getEventWithRequiredDirection()
 * @model
 * @generated
 */
public interface EventWithRequiredDirection extends EObject
{
  /**
   * Returns the value of the '<em><b>Script</b></em>' attribute.
   * The literals are from the enumeration {@link org.elysium.lilyPond.ScriptWithRequiredDirection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script</em>' attribute.
   * @see org.elysium.lilyPond.ScriptWithRequiredDirection
   * @see #setScript(ScriptWithRequiredDirection)
   * @see org.elysium.lilyPond.LilyPondPackage#getEventWithRequiredDirection_Script()
   * @model
   * @generated
   */
  ScriptWithRequiredDirection getScript();

  /**
   * Sets the value of the '{@link org.elysium.lilyPond.EventWithRequiredDirection#getScript <em>Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script</em>' attribute.
   * @see org.elysium.lilyPond.ScriptWithRequiredDirection
   * @see #getScript()
   * @generated
   */
  void setScript(ScriptWithRequiredDirection value);

} // EventWithRequiredDirection
