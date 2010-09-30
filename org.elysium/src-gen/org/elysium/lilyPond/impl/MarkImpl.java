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
import org.elysium.lilyPond.Mark;
import org.elysium.lilyPond.Scalar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mark</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.MarkImpl#getMark <em>Mark</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarkImpl extends EventImpl implements Mark
{
  /**
   * The cached value of the '{@link #getMark() <em>Mark</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMark()
   * @generated
   * @ordered
   */
  protected Scalar mark;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MarkImpl()
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
    return LilyPondPackage.Literals.MARK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scalar getMark()
  {
    return mark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMark(Scalar newMark, NotificationChain msgs)
  {
    Scalar oldMark = mark;
    mark = newMark;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilyPondPackage.MARK__MARK, oldMark, newMark);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMark(Scalar newMark)
  {
    if (newMark != mark)
    {
      NotificationChain msgs = null;
      if (mark != null)
        msgs = ((InternalEObject)mark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.MARK__MARK, null, msgs);
      if (newMark != null)
        msgs = ((InternalEObject)newMark).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilyPondPackage.MARK__MARK, null, msgs);
      msgs = basicSetMark(newMark, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.MARK__MARK, newMark, newMark));
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
      case LilyPondPackage.MARK__MARK:
        return basicSetMark(null, msgs);
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
      case LilyPondPackage.MARK__MARK:
        return getMark();
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
      case LilyPondPackage.MARK__MARK:
        setMark((Scalar)newValue);
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
      case LilyPondPackage.MARK__MARK:
        setMark((Scalar)null);
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
      case LilyPondPackage.MARK__MARK:
        return mark != null;
    }
    return super.eIsSet(featureID);
  }

} //MarkImpl
