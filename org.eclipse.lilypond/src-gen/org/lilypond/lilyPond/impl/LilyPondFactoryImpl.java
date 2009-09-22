/**
 * <copyright>
 * </copyright>
 *
 */
package org.lilypond.lilyPond.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lilypond.lilyPond.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LilyPondFactoryImpl extends EFactoryImpl implements LilyPondFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LilyPondFactory init()
  {
    try
    {
      LilyPondFactory theLilyPondFactory = (LilyPondFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.lilypond.org/LilyPond"); 
      if (theLilyPondFactory != null)
      {
        return theLilyPondFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LilyPondFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilyPondFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LilyPondPackage.LILY_POND: return createLilyPond();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilyPond createLilyPond()
  {
    LilyPondImpl lilyPond = new LilyPondImpl();
    return lilyPond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilyPondPackage getLilyPondPackage()
  {
    return (LilyPondPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LilyPondPackage getPackage()
  {
    return LilyPondPackage.eINSTANCE;
  }

} //LilyPondFactoryImpl
