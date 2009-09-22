/**
 * <copyright>
 * </copyright>
 *
 */
package org.lilypond.lilyPond;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lilypond.lilyPond.LilyPondFactory
 * @model kind="package"
 * @generated
 */
public interface LilyPondPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lilyPond";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lilypond.org/LilyPond";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lilyPond";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LilyPondPackage eINSTANCE = org.lilypond.lilyPond.impl.LilyPondPackageImpl.init();

  /**
   * The meta object id for the '{@link org.lilypond.lilyPond.impl.LilyPondImpl <em>Lily Pond</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.lilypond.lilyPond.impl.LilyPondImpl
   * @see org.lilypond.lilyPond.impl.LilyPondPackageImpl#getLilyPond()
   * @generated
   */
  int LILY_POND = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LILY_POND__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Lily Pond</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LILY_POND_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.lilypond.lilyPond.LilyPond <em>Lily Pond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lily Pond</em>'.
   * @see org.lilypond.lilyPond.LilyPond
   * @generated
   */
  EClass getLilyPond();

  /**
   * Returns the meta object for the attribute '{@link org.lilypond.lilyPond.LilyPond#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see org.lilypond.lilyPond.LilyPond#getContent()
   * @see #getLilyPond()
   * @generated
   */
  EAttribute getLilyPond_Content();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LilyPondFactory getLilyPondFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.lilypond.lilyPond.impl.LilyPondImpl <em>Lily Pond</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.lilypond.lilyPond.impl.LilyPondImpl
     * @see org.lilypond.lilyPond.impl.LilyPondPackageImpl#getLilyPond()
     * @generated
     */
    EClass LILY_POND = eINSTANCE.getLilyPond();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LILY_POND__CONTENT = eINSTANCE.getLilyPond_Content();

  }

} //LilyPondPackage
