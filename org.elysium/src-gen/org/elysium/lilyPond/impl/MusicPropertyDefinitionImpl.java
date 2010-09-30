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

import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.MusicPropertyDefinition;
import org.elysium.lilyPond.MusicPropertyOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Music Property Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.MusicPropertyDefinitionImpl#isOnce <em>Once</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.MusicPropertyDefinitionImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MusicPropertyDefinitionImpl extends SimpleMusicImpl implements MusicPropertyDefinition
{
  /**
   * The default value of the '{@link #isOnce() <em>Once</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOnce()
   * @generated
   * @ordered
   */
  protected static final boolean ONCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOnce() <em>Once</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOnce()
   * @generated
   * @ordered
   */
  protected boolean once = ONCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected MusicPropertyOperation operation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MusicPropertyDefinitionImpl()
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
    return LilyPondPackage.Literals.MUSIC_PROPERTY_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOnce()
  {
    return once;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnce(boolean newOnce)
  {
    boolean oldOnce = once;
    once = newOnce;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.MUSIC_PROPERTY_DEFINITION__ONCE, oldOnce, once));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MusicPropertyOperation getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperation(MusicPropertyOperation newOperation, NotificationChain msgs)
  {
    MusicPropertyOperation oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.MUSIC_PROPERTY_DEFINITION__OPERATION, oldOperation, newOperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(MusicPropertyOperation newOperation)
  {
    if (newOperation != operation)
    {
      NotificationChain msgs = null;
      if (operation != null)
        msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.MUSIC_PROPERTY_DEFINITION__OPERATION, null, msgs);
      if (newOperation != null)
        msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.MUSIC_PROPERTY_DEFINITION__OPERATION, null, msgs);
      msgs = basicSetOperation(newOperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.MUSIC_PROPERTY_DEFINITION__OPERATION, newOperation, newOperation));
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
      case LilyPondPackage.MUSIC_PROPERTY_DEFINITION__OPERATION:
        return basicSetOperation(null, msgs);
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
      case LilyPondPackage.MUSIC_PROPERTY_DEFINITION__ONCE:
        return isOnce();
      case LilyPondPackage.MUSIC_PROPERTY_DEFINITION__OPERATION:
        return getOperation();
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
      case LilyPondPackage.MUSIC_PROPERTY_DEFINITION__ONCE:
        setOnce((Boolean)newValue);
        return;
      case LilyPondPackage.MUSIC_PROPERTY_DEFINITION__OPERATION:
        setOperation((MusicPropertyOperation)newValue);
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
      case LilyPondPackage.MUSIC_PROPERTY_DEFINITION__ONCE:
        setOnce(ONCE_EDEFAULT);
        return;
      case LilyPondPackage.MUSIC_PROPERTY_DEFINITION__OPERATION:
        setOperation((MusicPropertyOperation)null);
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
      case LilyPondPackage.MUSIC_PROPERTY_DEFINITION__ONCE:
        return once != ONCE_EDEFAULT;
      case LilyPondPackage.MUSIC_PROPERTY_DEFINITION__OPERATION:
        return operation != null;
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
    result.append(" (once: ");
    result.append(once);
    result.append(')');
    return result.toString();
  }

} //MusicPropertyDefinitionImpl
