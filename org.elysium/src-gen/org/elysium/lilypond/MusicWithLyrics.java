/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Music With Lyrics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.MusicWithLyrics#getId <em>Id</em>}</li>
 *   <li>{@link org.elysium.lilypond.MusicWithLyrics#getLyrics <em>Lyrics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilypond.LilypondPackage#getMusicWithLyrics()
 * @model
 * @generated
 */
public interface MusicWithLyrics extends SpecialCommand
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
   * @see org.elysium.lilypond.LilypondPackage#getMusicWithLyrics_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.MusicWithLyrics#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Lyrics</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lyrics</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lyrics</em>' containment reference.
   * @see #setLyrics(Expression)
   * @see org.elysium.lilypond.LilypondPackage#getMusicWithLyrics_Lyrics()
   * @model containment="true"
   * @generated
   */
  Expression getLyrics();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.MusicWithLyrics#getLyrics <em>Lyrics</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lyrics</em>' containment reference.
   * @see #getLyrics()
   * @generated
   */
  void setLyrics(Expression value);

} // MusicWithLyrics
