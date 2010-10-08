/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.elysium.lilypond.LilypondPackage;
import org.elysium.lilypond.SchemeExpression;
import org.elysium.lilypond.SchemeList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheme List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilypond.impl.SchemeListImpl#isVector <em>Vector</em>}</li>
 *   <li>{@link org.elysium.lilypond.impl.SchemeListImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemeListImpl extends SchemeValueImpl implements SchemeList
{
  /**
   * The default value of the '{@link #isVector() <em>Vector</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVector()
   * @generated
   * @ordered
   */
  protected static final boolean VECTOR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isVector() <em>Vector</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVector()
   * @generated
   * @ordered
   */
  protected boolean vector = VECTOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<SchemeExpression> expressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemeListImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LilypondPackage.Literals.SCHEME_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isVector()
  {
    return vector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVector(boolean newVector)
  {
    boolean oldVector = vector;
    vector = newVector;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilypondPackage.SCHEME_LIST__VECTOR, oldVector, vector));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SchemeExpression> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<SchemeExpression>(SchemeExpression.class, this, LilypondPackage.SCHEME_LIST__EXPRESSIONS);
    }
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LilypondPackage.SCHEME_LIST__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LilypondPackage.SCHEME_LIST__VECTOR:
        return isVector();
      case LilypondPackage.SCHEME_LIST__EXPRESSIONS:
        return getExpressions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LilypondPackage.SCHEME_LIST__VECTOR:
        setVector((Boolean)newValue);
        return;
      case LilypondPackage.SCHEME_LIST__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends SchemeExpression>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LilypondPackage.SCHEME_LIST__VECTOR:
        setVector(VECTOR_EDEFAULT);
        return;
      case LilypondPackage.SCHEME_LIST__EXPRESSIONS:
        getExpressions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LilypondPackage.SCHEME_LIST__VECTOR:
        return vector != VECTOR_EDEFAULT;
      case LilypondPackage.SCHEME_LIST__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (vector: ");
    result.append(vector);
    result.append(')');
    return result.toString();
  }

} //SchemeListImpl
