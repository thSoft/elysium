/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheme List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.SchemeList#isVector <em>Vector</em>}</li>
 *   <li>{@link org.elysium.lilypond.SchemeList#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilypond.LilypondPackage#getSchemeList()
 * @model
 * @generated
 */
public interface SchemeList extends SchemeValue
{
  /**
   * Returns the value of the '<em><b>Vector</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vector</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vector</em>' attribute.
   * @see #setVector(boolean)
   * @see org.elysium.lilypond.LilypondPackage#getSchemeList_Vector()
   * @model
   * @generated
   */
  boolean isVector();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.SchemeList#isVector <em>Vector</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vector</em>' attribute.
   * @see #isVector()
   * @generated
   */
  void setVector(boolean value);

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.elysium.lilypond.SchemeExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.elysium.lilypond.LilypondPackage#getSchemeList_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<SchemeExpression> getExpressions();

} // SchemeList
