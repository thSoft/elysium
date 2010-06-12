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

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.elysium.lilyPond.Block;
import org.elysium.lilyPond.Expression;
import org.elysium.lilyPond.LilyPond;
import org.elysium.lilyPond.LilyPondPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilyPond.impl.ExpressionImpl#getParentBlock <em>Parent Block</em>}</li>
 *   <li>{@link org.elysium.lilyPond.impl.ExpressionImpl#getParentLilyPond <em>Parent Lily Pond</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return LilyPondPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getParentBlock()
  {
    if (eContainerFeatureID() != LilyPondPackage.EXPRESSION__PARENT_BLOCK) return null;
    return (Block)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentBlock(Block newParentBlock, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParentBlock, LilyPondPackage.EXPRESSION__PARENT_BLOCK, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentBlock(Block newParentBlock)
  {
    if (newParentBlock != eInternalContainer() || (eContainerFeatureID() != LilyPondPackage.EXPRESSION__PARENT_BLOCK && newParentBlock != null))
    {
      if (EcoreUtil.isAncestor(this, newParentBlock))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParentBlock != null)
        msgs = ((InternalEObject)newParentBlock).eInverseAdd(this, LilyPondPackage.BLOCK__EXPRESSIONS, Block.class, msgs);
      msgs = basicSetParentBlock(newParentBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.EXPRESSION__PARENT_BLOCK, newParentBlock, newParentBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilyPond getParentLilyPond()
  {
    if (eContainerFeatureID() != LilyPondPackage.EXPRESSION__PARENT_LILY_POND) return null;
    return (LilyPond)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentLilyPond(LilyPond newParentLilyPond, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParentLilyPond, LilyPondPackage.EXPRESSION__PARENT_LILY_POND, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentLilyPond(LilyPond newParentLilyPond)
  {
    if (newParentLilyPond != eInternalContainer() || (eContainerFeatureID() != LilyPondPackage.EXPRESSION__PARENT_LILY_POND && newParentLilyPond != null))
    {
      if (EcoreUtil.isAncestor(this, newParentLilyPond))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParentLilyPond != null)
        msgs = ((InternalEObject)newParentLilyPond).eInverseAdd(this, LilyPondPackage.LILY_POND__EXPRESSIONS, LilyPond.class, msgs);
      msgs = basicSetParentLilyPond(newParentLilyPond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilyPondPackage.EXPRESSION__PARENT_LILY_POND, newParentLilyPond, newParentLilyPond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LilyPondPackage.EXPRESSION__PARENT_BLOCK:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParentBlock((Block)otherEnd, msgs);
      case LilyPondPackage.EXPRESSION__PARENT_LILY_POND:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParentLilyPond((LilyPond)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case LilyPondPackage.EXPRESSION__PARENT_BLOCK:
        return basicSetParentBlock(null, msgs);
      case LilyPondPackage.EXPRESSION__PARENT_LILY_POND:
        return basicSetParentLilyPond(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case LilyPondPackage.EXPRESSION__PARENT_BLOCK:
        return eInternalContainer().eInverseRemove(this, LilyPondPackage.BLOCK__EXPRESSIONS, Block.class, msgs);
      case LilyPondPackage.EXPRESSION__PARENT_LILY_POND:
        return eInternalContainer().eInverseRemove(this, LilyPondPackage.LILY_POND__EXPRESSIONS, LilyPond.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case LilyPondPackage.EXPRESSION__PARENT_BLOCK:
        return getParentBlock();
      case LilyPondPackage.EXPRESSION__PARENT_LILY_POND:
        return getParentLilyPond();
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
      case LilyPondPackage.EXPRESSION__PARENT_BLOCK:
        setParentBlock((Block)newValue);
        return;
      case LilyPondPackage.EXPRESSION__PARENT_LILY_POND:
        setParentLilyPond((LilyPond)newValue);
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
      case LilyPondPackage.EXPRESSION__PARENT_BLOCK:
        setParentBlock((Block)null);
        return;
      case LilyPondPackage.EXPRESSION__PARENT_LILY_POND:
        setParentLilyPond((LilyPond)null);
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
      case LilyPondPackage.EXPRESSION__PARENT_BLOCK:
        return getParentBlock() != null;
      case LilyPondPackage.EXPRESSION__PARENT_LILY_POND:
        return getParentLilyPond() != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpressionImpl
