/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.NewContext#getContext <em>Context</em>}</li>
 *   <li>{@link org.elysium.lilypond.NewContext#getId <em>Id</em>}</li>
 *   <li>{@link org.elysium.lilypond.NewContext#getModification <em>Modification</em>}</li>
 *   <li>{@link org.elysium.lilypond.NewContext#getMusic <em>Music</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilypond.LilypondPackage#getNewContext()
 * @model
 * @generated
 */
public interface NewContext extends SpecialCommand
{
  /**
   * Returns the value of the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' attribute.
   * @see #setContext(String)
   * @see org.elysium.lilypond.LilypondPackage#getNewContext_Context()
   * @model
   * @generated
   */
  String getContext();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.NewContext#getContext <em>Context</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' attribute.
   * @see #getContext()
   * @generated
   */
  void setContext(String value);

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
   * @see org.elysium.lilypond.LilypondPackage#getNewContext_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.NewContext#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Modification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modification</em>' containment reference.
   * @see #setModification(ContextModification)
   * @see org.elysium.lilypond.LilypondPackage#getNewContext_Modification()
   * @model containment="true"
   * @generated
   */
  ContextModification getModification();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.NewContext#getModification <em>Modification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modification</em>' containment reference.
   * @see #getModification()
   * @generated
   */
  void setModification(ContextModification value);

  /**
   * Returns the value of the '<em><b>Music</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Music</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Music</em>' containment reference.
   * @see #setMusic(Expression)
   * @see org.elysium.lilypond.LilypondPackage#getNewContext_Music()
   * @model containment="true"
   * @generated
   */
  Expression getMusic();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.NewContext#getMusic <em>Music</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Music</em>' containment reference.
   * @see #getMusic()
   * @generated
   */
  void setMusic(Expression value);

} // NewContext
