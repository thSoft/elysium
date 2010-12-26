/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheme Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.elysium.lilypond.SchemeExpression#isReference <em>Reference</em>}</li>
 *   <li>{@link org.elysium.lilypond.SchemeExpression#getQuotations <em>Quotations</em>}</li>
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
   * Returns the value of the '<em><b>Quotations</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quotations</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quotations</em>' attribute list.
   * @see org.elysium.lilypond.LilypondPackage#getSchemeExpression_Quotations()
   * @model unique="false"
   * @generated
   */
  EList<String> getQuotations();

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
