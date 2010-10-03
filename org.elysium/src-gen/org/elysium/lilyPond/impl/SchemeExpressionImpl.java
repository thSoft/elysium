/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.SchemeExpression;
import org.elysium.lilyPond.SchemeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheme Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.SchemeExpressionImpl#isQuoted <em>Quoted</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.SchemeExpressionImpl#isQuasiquoted <em>Quasiquoted</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.SchemeExpressionImpl#isUnquoted <em>Unquoted</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.SchemeExpressionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemeExpressionImpl extends MinimalEObjectImpl.Container implements SchemeExpression
{
  /**
   * The default value of the '{@link #isQuoted() <em>Quoted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQuoted()
   * @generated
   * @ordered
   */
  protected static final boolean QUOTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isQuoted() <em>Quoted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQuoted()
   * @generated
   * @ordered
   */
  protected boolean quoted = QUOTED_EDEFAULT;

  /**
   * The default value of the '{@link #isQuasiquoted() <em>Quasiquoted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQuasiquoted()
   * @generated
   * @ordered
   */
  protected static final boolean QUASIQUOTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isQuasiquoted() <em>Quasiquoted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isQuasiquoted()
   * @generated
   * @ordered
   */
  protected boolean quasiquoted = QUASIQUOTED_EDEFAULT;

  /**
   * The default value of the '{@link #isUnquoted() <em>Unquoted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnquoted()
   * @generated
   * @ordered
   */
  protected static final boolean UNQUOTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnquoted() <em>Unquoted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnquoted()
   * @generated
   * @ordered
   */
  protected boolean unquoted = UNQUOTED_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected SchemeValue value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemeExpressionImpl()
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
    return LilyPondPackage.Literals.SCHEME_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isQuoted()
  {
    return quoted;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuoted(boolean newQuoted)
  {
    boolean oldQuoted = quoted;
    quoted = newQuoted;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.SCHEME_EXPRESSION__QUOTED, oldQuoted, quoted));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isQuasiquoted()
  {
    return quasiquoted;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuasiquoted(boolean newQuasiquoted)
  {
    boolean oldQuasiquoted = quasiquoted;
    quasiquoted = newQuasiquoted;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.SCHEME_EXPRESSION__QUASIQUOTED, oldQuasiquoted, quasiquoted));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnquoted()
  {
    return unquoted;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnquoted(boolean newUnquoted)
  {
    boolean oldUnquoted = unquoted;
    unquoted = newUnquoted;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.SCHEME_EXPRESSION__UNQUOTED, oldUnquoted, unquoted));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(SchemeValue newValue, NotificationChain msgs)
  {
    SchemeValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.SCHEME_EXPRESSION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(SchemeValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.SCHEME_EXPRESSION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.SCHEME_EXPRESSION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.SCHEME_EXPRESSION__VALUE, newValue, newValue));
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
      case LilyPondPackage.SCHEME_EXPRESSION__VALUE:
        return basicSetValue(null, msgs);
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
      case LilyPondPackage.SCHEME_EXPRESSION__QUOTED:
        return isQuoted();
      case LilyPondPackage.SCHEME_EXPRESSION__QUASIQUOTED:
        return isQuasiquoted();
      case LilyPondPackage.SCHEME_EXPRESSION__UNQUOTED:
        return isUnquoted();
      case LilyPondPackage.SCHEME_EXPRESSION__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LilyPondPackage.SCHEME_EXPRESSION__QUOTED:
        setQuoted((Boolean)newValue);
        return;
      case LilyPondPackage.SCHEME_EXPRESSION__QUASIQUOTED:
        setQuasiquoted((Boolean)newValue);
        return;
      case LilyPondPackage.SCHEME_EXPRESSION__UNQUOTED:
        setUnquoted((Boolean)newValue);
        return;
      case LilyPondPackage.SCHEME_EXPRESSION__VALUE:
        setValue((SchemeValue)newValue);
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
      case LilyPondPackage.SCHEME_EXPRESSION__QUOTED:
        setQuoted(QUOTED_EDEFAULT);
        return;
      case LilyPondPackage.SCHEME_EXPRESSION__QUASIQUOTED:
        setQuasiquoted(QUASIQUOTED_EDEFAULT);
        return;
      case LilyPondPackage.SCHEME_EXPRESSION__UNQUOTED:
        setUnquoted(UNQUOTED_EDEFAULT);
        return;
      case LilyPondPackage.SCHEME_EXPRESSION__VALUE:
        setValue((SchemeValue)null);
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
      case LilyPondPackage.SCHEME_EXPRESSION__QUOTED:
        return quoted != QUOTED_EDEFAULT;
      case LilyPondPackage.SCHEME_EXPRESSION__QUASIQUOTED:
        return quasiquoted != QUASIQUOTED_EDEFAULT;
      case LilyPondPackage.SCHEME_EXPRESSION__UNQUOTED:
        return unquoted != UNQUOTED_EDEFAULT;
      case LilyPondPackage.SCHEME_EXPRESSION__VALUE:
        return value != null;
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
    result.append(" (quoted: ");
    result.append(quoted);
    result.append(", quasiquoted: ");
    result.append(quasiquoted);
    result.append(", unquoted: ");
    result.append(unquoted);
    result.append(')');
    return result.toString();
  }

} //SchemeExpressionImpl
