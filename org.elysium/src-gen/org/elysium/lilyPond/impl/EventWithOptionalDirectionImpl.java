/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.elysium.lilyPond.EventWithOptionalDirection;
import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.ScriptWithOptionalDirection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event With Optional Direction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.EventWithOptionalDirectionImpl#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventWithOptionalDirectionImpl extends MinimalEObjectImpl.Container implements EventWithOptionalDirection
{
  /**
   * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScript()
   * @generated
   * @ordered
   */
  protected static final ScriptWithOptionalDirection SCRIPT_EDEFAULT = ScriptWithOptionalDirection.BEAM_START;

  /**
   * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScript()
   * @generated
   * @ordered
   */
  protected ScriptWithOptionalDirection script = SCRIPT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventWithOptionalDirectionImpl()
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
    return LilyPondPackage.Literals.EVENT_WITH_OPTIONAL_DIRECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptWithOptionalDirection getScript()
  {
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScript(ScriptWithOptionalDirection newScript)
  {
    ScriptWithOptionalDirection oldScript = script;
    script = newScript == null ? SCRIPT_EDEFAULT : newScript;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.EVENT_WITH_OPTIONAL_DIRECTION__SCRIPT, oldScript, script));
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
      case LilyPondPackage.EVENT_WITH_OPTIONAL_DIRECTION__SCRIPT:
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
      case LilyPondPackage.EVENT_WITH_OPTIONAL_DIRECTION__SCRIPT:
        setScript((ScriptWithOptionalDirection)newValue);
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
      case LilyPondPackage.EVENT_WITH_OPTIONAL_DIRECTION__SCRIPT:
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
      case LilyPondPackage.EVENT_WITH_OPTIONAL_DIRECTION__SCRIPT:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (script: ");
    result.append(script);
    result.append(')');
    return result.toString();
  }

} //EventWithOptionalDirectionImpl
