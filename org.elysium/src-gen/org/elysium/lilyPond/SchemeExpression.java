/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheme Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.SchemeExpression#isQuoted <em>Quoted</em>}</li>
 *   <li>{@link org.elysium.lilypond.SchemeExpression#isQuasiquoted <em>Quasiquoted</em>}</li>
 *   <li>{@link org.elysium.lilypond.SchemeExpression#isUnquoted <em>Unquoted</em>}</li>
 *   <li>{@link org.elysium.lilypond.SchemeExpression#isReference <em>Reference</em>}</li>
 *   <li>{@link org.elysium.lilypond.SchemeExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.elysium.lilypond.LilypondPackage#getSchemeExpression()
 * @model
 * @generated
 */
public interface SchemeExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Quoted</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quoted</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quoted</em>' attribute.
   * @see #setQuoted(boolean)
   * @see org.elysium.lilypond.LilypondPackage#getSchemeExpression_Quoted()
   * @model
   * @generated
   */
  boolean isQuoted();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.SchemeExpression#isQuoted <em>Quoted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quoted</em>' attribute.
   * @see #isQuoted()
   * @generated
   */
  void setQuoted(boolean value);

  /**
   * Returns the value of the '<em><b>Quasiquoted</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quasiquoted</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quasiquoted</em>' attribute.
   * @see #setQuasiquoted(boolean)
   * @see org.elysium.lilypond.LilypondPackage#getSchemeExpression_Quasiquoted()
   * @model
   * @generated
   */
  boolean isQuasiquoted();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.SchemeExpression#isQuasiquoted <em>Quasiquoted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quasiquoted</em>' attribute.
   * @see #isQuasiquoted()
   * @generated
   */
  void setQuasiquoted(boolean value);

  /**
   * Returns the value of the '<em><b>Unquoted</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unquoted</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unquoted</em>' attribute.
   * @see #setUnquoted(boolean)
   * @see org.elysium.lilypond.LilypondPackage#getSchemeExpression_Unquoted()
   * @model
   * @generated
   */
  boolean isUnquoted();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.SchemeExpression#isUnquoted <em>Unquoted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unquoted</em>' attribute.
   * @see #isUnquoted()
   * @generated
   */
  void setUnquoted(boolean value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' attribute.
   * @see #setReference(boolean)
   * @see org.elysium.lilypond.LilypondPackage#getSchemeExpression_Reference()
   * @model
   * @generated
   */
  boolean isReference();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.SchemeExpression#isReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #isReference()
   * @generated
   */
  void setReference(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(SchemeValue)
   * @see org.elysium.lilypond.LilypondPackage#getSchemeExpression_Value()
   * @model containment="true"
   * @generated
   */
  SchemeValue getValue();

  /**
   * Sets the value of the '{@link org.elysium.lilypond.SchemeExpression#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(SchemeValue value);

} // SchemeExpression
