/**
 * <copyright>
 * </copyright>
 *
 */
package org.lilypond.lilyPond;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lilypond.lilyPond.LilyPondPackage
 * @generated
 */
public interface LilyPondFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LilyPondFactory eINSTANCE = org.lilypond.lilyPond.impl.LilyPondFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Lily Pond</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lily Pond</em>'.
   * @generated
   */
  LilyPond createLilyPond();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LilyPondPackage getLilyPondPackage();

} //LilyPondFactory
