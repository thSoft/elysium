/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.elysium.lilyPond.LilyPondPackage
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
  LilyPondFactory eINSTANCE = org.elysium.lilyPond.impl.LilyPondFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Lily Pond</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lily Pond</em>'.
   * @generated
   */
  LilyPond createLilyPond();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Simple Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Block</em>'.
   * @generated
   */
  SimpleBlock createSimpleBlock();

  /**
   * Returns a new object of class '<em>Simultaneous Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simultaneous Block</em>'.
   * @generated
   */
  SimultaneousBlock createSimultaneousBlock();

  /**
   * Returns a new object of class '<em>Scheme</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheme</em>'.
   * @generated
   */
  Scheme createScheme();

  /**
   * Returns a new object of class '<em>Scheme Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheme Expression</em>'.
   * @generated
   */
  SchemeExpression createSchemeExpression();

  /**
   * Returns a new object of class '<em>Scheme Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheme Value</em>'.
   * @generated
   */
  SchemeValue createSchemeValue();

  /**
   * Returns a new object of class '<em>Scheme Boolean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheme Boolean</em>'.
   * @generated
   */
  SchemeBoolean createSchemeBoolean();

  /**
   * Returns a new object of class '<em>Scheme List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheme List</em>'.
   * @generated
   */
  SchemeList createSchemeList();

  /**
   * Returns a new object of class '<em>Scheme Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheme Block</em>'.
   * @generated
   */
  SchemeBlock createSchemeBlock();

  /**
   * Returns a new object of class '<em>Scheme Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheme Text</em>'.
   * @generated
   */
  SchemeText createSchemeText();

  /**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>Custom Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Command</em>'.
   * @generated
   */
  CustomCommand createCustomCommand();

  /**
   * Returns a new object of class '<em>Long Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Long Command</em>'.
   * @generated
   */
  LongCommand createLongCommand();

  /**
   * Returns a new object of class '<em>Short Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Short Command</em>'.
   * @generated
   */
  ShortCommand createShortCommand();

  /**
   * Returns a new object of class '<em>Preset Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Preset Command</em>'.
   * @generated
   */
  PresetCommand createPresetCommand();

  /**
   * Returns a new object of class '<em>Include</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include</em>'.
   * @generated
   */
  Include createInclude();

  /**
   * Returns a new object of class '<em>Version</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Version</em>'.
   * @generated
   */
  Version createVersion();

  /**
   * Returns a new object of class '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text</em>'.
   * @generated
   */
  Text createText();

  /**
   * Returns a new object of class '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number</em>'.
   * @generated
   */
  Number createNumber();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LilyPondPackage getLilyPondPackage();

} //LilyPondFactory
