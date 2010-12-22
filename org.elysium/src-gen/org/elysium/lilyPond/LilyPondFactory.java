/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.elysium.lilypond.LilypondPackage
 * @generated
 */
public interface LilypondFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LilypondFactory eINSTANCE = org.elysium.lilypond.impl.LilypondFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Lily Pond</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lily Pond</em>'.
   * @generated
   */
  LilyPond createLilyPond();

  /**
   * Returns a new object of class '<em>Toplevel Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Toplevel Expression</em>'.
   * @generated
   */
  ToplevelExpression createToplevelExpression();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Common Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Common Expression</em>'.
   * @generated
   */
  CommonExpression createCommonExpression();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Property Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Assignment</em>'.
   * @generated
   */
  PropertyAssignment createPropertyAssignment();

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
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>Unparsed Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unparsed Block</em>'.
   * @generated
   */
  UnparsedBlock createUnparsedBlock();

  /**
   * Returns a new object of class '<em>Unparsed Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unparsed Expression</em>'.
   * @generated
   */
  UnparsedExpression createUnparsedExpression();

  /**
   * Returns a new object of class '<em>Unparsed Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unparsed Command</em>'.
   * @generated
   */
  UnparsedCommand createUnparsedCommand();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

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
   * Returns a new object of class '<em>Special Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Special Command</em>'.
   * @generated
   */
  SpecialCommand createSpecialCommand();

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
   * Returns a new object of class '<em>Markup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Markup</em>'.
   * @generated
   */
  Markup createMarkup();

  /**
   * Returns a new object of class '<em>Markup Lines</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Markup Lines</em>'.
   * @generated
   */
  MarkupLines createMarkupLines();

  /**
   * Returns a new object of class '<em>Markup Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Markup Body</em>'.
   * @generated
   */
  MarkupBody createMarkupBody();

  /**
   * Returns a new object of class '<em>Block Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Command</em>'.
   * @generated
   */
  BlockCommand createBlockCommand();

  /**
   * Returns a new object of class '<em>Output Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Definition</em>'.
   * @generated
   */
  OutputDefinition createOutputDefinition();

  /**
   * Returns a new object of class '<em>Relative</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relative</em>'.
   * @generated
   */
  Relative createRelative();

  /**
   * Returns a new object of class '<em>Pitch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pitch</em>'.
   * @generated
   */
  Pitch createPitch();

  /**
   * Returns a new object of class '<em>Octave</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Octave</em>'.
   * @generated
   */
  Octave createOctave();

  /**
   * Returns a new object of class '<em>Other</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Other</em>'.
   * @generated
   */
  Other createOther();

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
   * Returns a new object of class '<em>Scheme Block Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheme Block Element</em>'.
   * @generated
   */
  SchemeBlockElement createSchemeBlockElement();

  /**
   * Returns a new object of class '<em>Scheme Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheme Reference</em>'.
   * @generated
   */
  SchemeReference createSchemeReference();

  /**
   * Returns a new object of class '<em>Scheme Character</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheme Character</em>'.
   * @generated
   */
  SchemeCharacter createSchemeCharacter();

  /**
   * Returns a new object of class '<em>Scheme Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheme Text</em>'.
   * @generated
   */
  SchemeText createSchemeText();

  /**
   * Returns a new object of class '<em>Scheme Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheme Number</em>'.
   * @generated
   */
  SchemeNumber createSchemeNumber();

  /**
   * Returns a new object of class '<em>Scheme Markup Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scheme Markup Command</em>'.
   * @generated
   */
  SchemeMarkupCommand createSchemeMarkupCommand();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LilypondPackage getLilypondPackage();

} //LilypondFactory
