/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.elysium.lilyPond.BookElement;
import org.elysium.lilyPond.BookPartElement;
import org.elysium.lilyPond.EventWithRequiredDirection;
import org.elysium.lilyPond.GenTextDef;
import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.Markup;
import org.elysium.lilyPond.Scalar;
import org.elysium.lilyPond.ScriptWithRequiredDirection;
import org.elysium.lilyPond.TempoLabel;
import org.elysium.lilyPond.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Markup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.MarkupImpl#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarkupImpl extends ToplevelExpressionImpl implements Markup
{
  /**
   * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScript()
   * @generated
   * @ordered
   */
  protected static final ScriptWithRequiredDirection SCRIPT_EDEFAULT = ScriptWithRequiredDirection.MARCATO;

  /**
   * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScript()
   * @generated
   * @ordered
   */
  protected ScriptWithRequiredDirection script = SCRIPT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MarkupImpl()
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
    return LilyPondPackage.Literals.MARKUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptWithRequiredDirection getScript()
  {
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScript(ScriptWithRequiredDirection newScript)
  {
    ScriptWithRequiredDirection oldScript = script;
    script = newScript == null ? SCRIPT_EDEFAULT : newScript;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.MARKUP__SCRIPT, oldScript, script));
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
      case LilyPondPackage.MARKUP__SCRIPT:
        return getScript();
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
      case LilyPondPackage.MARKUP__SCRIPT:
        setScript((ScriptWithRequiredDirection)newValue);
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
      case LilyPondPackage.MARKUP__SCRIPT:
        setScript(SCRIPT_EDEFAULT);
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
      case LilyPondPackage.MARKUP__SCRIPT:
        return script != SCRIPT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Value.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BookElement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BookPartElement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == EventWithRequiredDirection.class)
    {
      switch (derivedFeatureID)
      {
        case LilyPondPackage.MARKUP__SCRIPT: return LilyPondPackage.EVENT_WITH_REQUIRED_DIRECTION__SCRIPT;
        default: return -1;
      }
    }
    if (baseClass == GenTextDef.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == TempoLabel.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Scalar.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Value.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BookElement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == BookPartElement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == EventWithRequiredDirection.class)
    {
      switch (baseFeatureID)
      {
        case LilyPondPackage.EVENT_WITH_REQUIRED_DIRECTION__SCRIPT: return LilyPondPackage.MARKUP__SCRIPT;
        default: return -1;
      }
    }
    if (baseClass == GenTextDef.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == TempoLabel.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Scalar.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (script: ");
    result.append(script);
    result.append(')');
    return result.toString();
  }

} //MarkupImpl
