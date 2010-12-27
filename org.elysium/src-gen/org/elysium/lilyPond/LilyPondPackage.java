/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.elysium.lilypond.LilypondFactory
 * @model kind="package"
 * @generated
 */
public interface LilypondPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lilypond";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.elysium.org/LilyPond";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lilypond";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LilypondPackage eINSTANCE = org.elysium.lilypond.impl.LilypondPackageImpl.init();

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.LilyPondImpl <em>Lily Pond</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.LilyPondImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getLilyPond()
   * @generated
   */
  int LILY_POND = 0;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LILY_POND__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Lily Pond</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LILY_POND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.ToplevelExpressionImpl <em>Toplevel Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.ToplevelExpressionImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getToplevelExpression()
   * @generated
   */
  int TOPLEVEL_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Toplevel Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPLEVEL_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.ExpressionImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.CommonExpressionImpl <em>Common Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.CommonExpressionImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getCommonExpression()
   * @generated
   */
  int COMMON_EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Common Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMON_EXPRESSION_FEATURE_COUNT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.AssignmentImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__NAME = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VALUE = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.PropertyAssignmentImpl <em>Property Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.PropertyAssignmentImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getPropertyAssignment()
   * @generated
   */
  int PROPERTY_ASSIGNMENT = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGNMENT__ID = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGNMENT__VALUE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGNMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.BlockImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 6;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__EXPRESSIONS = COMMON_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = COMMON_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.SimpleBlockImpl <em>Simple Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SimpleBlockImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSimpleBlock()
   * @generated
   */
  int SIMPLE_BLOCK = 7;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_BLOCK__EXPRESSIONS = BLOCK__EXPRESSIONS;

  /**
   * The number of structural features of the '<em>Simple Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.SimultaneousBlockImpl <em>Simultaneous Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SimultaneousBlockImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSimultaneousBlock()
   * @generated
   */
  int SIMULTANEOUS_BLOCK = 8;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULTANEOUS_BLOCK__EXPRESSIONS = BLOCK__EXPRESSIONS;

  /**
   * The number of structural features of the '<em>Simultaneous Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULTANEOUS_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.CommandImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 9;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = COMMON_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.UnparsedExpressionImpl <em>Unparsed Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.UnparsedExpressionImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getUnparsedExpression()
   * @generated
   */
  int UNPARSED_EXPRESSION = 11;

  /**
   * The number of structural features of the '<em>Unparsed Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPARSED_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.UnparsedBlockImpl <em>Unparsed Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.UnparsedBlockImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getUnparsedBlock()
   * @generated
   */
  int UNPARSED_BLOCK = 10;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPARSED_BLOCK__EXPRESSIONS = UNPARSED_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unparsed Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPARSED_BLOCK_FEATURE_COUNT = UNPARSED_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.UnparsedCommandImpl <em>Unparsed Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.UnparsedCommandImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getUnparsedCommand()
   * @generated
   */
  int UNPARSED_COMMAND = 12;

  /**
   * The feature id for the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPARSED_COMMAND__COMMAND = UNPARSED_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unparsed Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPARSED_COMMAND_FEATURE_COUNT = UNPARSED_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.ReferenceImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 13;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__ASSIGNMENT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.TextImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getText()
   * @generated
   */
  int TEXT = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__VALUE = COMMON_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = COMMON_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.NumberImpl <em>Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.NumberImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getNumber()
   * @generated
   */
  int NUMBER = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__VALUE = COMMON_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = COMMON_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.SpecialCommandImpl <em>Special Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SpecialCommandImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSpecialCommand()
   * @generated
   */
  int SPECIAL_COMMAND = 16;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_COMMAND__KEYWORD = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Special Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.IncludeImpl <em>Include</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.IncludeImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getInclude()
   * @generated
   */
  int INCLUDE = 17;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__KEYWORD = SPECIAL_COMMAND__KEYWORD;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__IMPORT_URI = SPECIAL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Include</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_FEATURE_COUNT = SPECIAL_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.VersionImpl <em>Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.VersionImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getVersion()
   * @generated
   */
  int VERSION = 18;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__KEYWORD = SPECIAL_COMMAND__KEYWORD;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__VERSION = SPECIAL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_FEATURE_COUNT = SPECIAL_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.MarkupImpl <em>Markup</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.MarkupImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getMarkup()
   * @generated
   */
  int MARKUP = 19;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP__KEYWORD = SPECIAL_COMMAND__KEYWORD;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP__BODY = SPECIAL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Markup</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_FEATURE_COUNT = SPECIAL_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.MarkupLinesImpl <em>Markup Lines</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.MarkupLinesImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getMarkupLines()
   * @generated
   */
  int MARKUP_LINES = 20;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_LINES__KEYWORD = SPECIAL_COMMAND__KEYWORD;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_LINES__BODY = SPECIAL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Markup Lines</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_LINES_FEATURE_COUNT = SPECIAL_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.MarkupBodyImpl <em>Markup Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.MarkupBodyImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getMarkupBody()
   * @generated
   */
  int MARKUP_BODY = 21;

  /**
   * The feature id for the '<em><b>Command</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_BODY__COMMAND = 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_BODY__BLOCK = 1;

  /**
   * The number of structural features of the '<em>Markup Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.BlockCommandImpl <em>Block Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.BlockCommandImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getBlockCommand()
   * @generated
   */
  int BLOCK_COMMAND = 22;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_COMMAND__KEYWORD = SPECIAL_COMMAND__KEYWORD;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_COMMAND__BLOCK = SPECIAL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_COMMAND_FEATURE_COUNT = SPECIAL_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.OutputDefinitionImpl <em>Output Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.OutputDefinitionImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getOutputDefinition()
   * @generated
   */
  int OUTPUT_DEFINITION = 23;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DEFINITION__KEYWORD = SPECIAL_COMMAND__KEYWORD;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DEFINITION__BLOCK = SPECIAL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Output Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DEFINITION_FEATURE_COUNT = SPECIAL_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.RelativeMusicImpl <em>Relative Music</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.RelativeMusicImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getRelativeMusic()
   * @generated
   */
  int RELATIVE_MUSIC = 24;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_MUSIC__KEYWORD = SPECIAL_COMMAND__KEYWORD;

  /**
   * The feature id for the '<em><b>Pitch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_MUSIC__PITCH = SPECIAL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Music</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_MUSIC__MUSIC = SPECIAL_COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Relative Music</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_MUSIC_FEATURE_COUNT = SPECIAL_COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.PitchImpl <em>Pitch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.PitchImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getPitch()
   * @generated
   */
  int PITCH = 25;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PITCH__BASE = 0;

  /**
   * The feature id for the '<em><b>Octave Check</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PITCH__OCTAVE_CHECK = 1;

  /**
   * The feature id for the '<em><b>Octave Shift</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PITCH__OCTAVE_SHIFT = 2;

  /**
   * The feature id for the '<em><b>Reminder Accidental</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PITCH__REMINDER_ACCIDENTAL = 3;

  /**
   * The feature id for the '<em><b>Cautionary Accidental</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PITCH__CAUTIONARY_ACCIDENTAL = 4;

  /**
   * The number of structural features of the '<em>Pitch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PITCH_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.OctaveImpl <em>Octave</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.OctaveImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getOctave()
   * @generated
   */
  int OCTAVE = 26;

  /**
   * The feature id for the '<em><b>Up</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCTAVE__UP = 0;

  /**
   * The feature id for the '<em><b>Down</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCTAVE__DOWN = 1;

  /**
   * The number of structural features of the '<em>Octave</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCTAVE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.TransposedMusicImpl <em>Transposed Music</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.TransposedMusicImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getTransposedMusic()
   * @generated
   */
  int TRANSPOSED_MUSIC = 27;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPOSED_MUSIC__KEYWORD = SPECIAL_COMMAND__KEYWORD;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPOSED_MUSIC__SOURCE = SPECIAL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPOSED_MUSIC__TARGET = SPECIAL_COMMAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Music</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPOSED_MUSIC__MUSIC = SPECIAL_COMMAND_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Transposed Music</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPOSED_MUSIC_FEATURE_COUNT = SPECIAL_COMMAND_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.ModeChangeImpl <em>Mode Change</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.ModeChangeImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getModeChange()
   * @generated
   */
  int MODE_CHANGE = 28;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_CHANGE__KEYWORD = SPECIAL_COMMAND__KEYWORD;

  /**
   * The feature id for the '<em><b>Music</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_CHANGE__MUSIC = SPECIAL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mode Change</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODE_CHANGE_FEATURE_COUNT = SPECIAL_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.MusicWithLyricsImpl <em>Music With Lyrics</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.MusicWithLyricsImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getMusicWithLyrics()
   * @generated
   */
  int MUSIC_WITH_LYRICS = 29;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUSIC_WITH_LYRICS__KEYWORD = SPECIAL_COMMAND__KEYWORD;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUSIC_WITH_LYRICS__ID = SPECIAL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lyrics</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUSIC_WITH_LYRICS__LYRICS = SPECIAL_COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Music With Lyrics</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUSIC_WITH_LYRICS_FEATURE_COUNT = SPECIAL_COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.NewContextImpl <em>New Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.NewContextImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getNewContext()
   * @generated
   */
  int NEW_CONTEXT = 30;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONTEXT__KEYWORD = SPECIAL_COMMAND__KEYWORD;

  /**
   * The feature id for the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONTEXT__CONTEXT = SPECIAL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONTEXT__ID = SPECIAL_COMMAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Modification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONTEXT__MODIFICATION = SPECIAL_COMMAND_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Music</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONTEXT__MUSIC = SPECIAL_COMMAND_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>New Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONTEXT_FEATURE_COUNT = SPECIAL_COMMAND_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.ContextModificationImpl <em>Context Modification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.ContextModificationImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getContextModification()
   * @generated
   */
  int CONTEXT_MODIFICATION = 31;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_MODIFICATION__BLOCK = 0;

  /**
   * The number of structural features of the '<em>Context Modification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_MODIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.ContextDefImpl <em>Context Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.ContextDefImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getContextDef()
   * @generated
   */
  int CONTEXT_DEF = 32;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DEF__KEYWORD = SPECIAL_COMMAND__KEYWORD;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DEF__BLOCK = SPECIAL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Context Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DEF_FEATURE_COUNT = SPECIAL_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.OtherImpl <em>Other</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.OtherImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getOther()
   * @generated
   */
  int OTHER = 33;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER__KEYWORD = SPECIAL_COMMAND__KEYWORD;

  /**
   * The number of structural features of the '<em>Other</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHER_FEATURE_COUNT = SPECIAL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.SchemeImpl <em>Scheme</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SchemeImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getScheme()
   * @generated
   */
  int SCHEME = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME__VALUE = COMMON_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scheme</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_FEATURE_COUNT = COMMON_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.SchemeExpressionImpl <em>Scheme Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SchemeExpressionImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeExpression()
   * @generated
   */
  int SCHEME_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_EXPRESSION__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Quotations</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_EXPRESSION__QUOTATIONS = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_EXPRESSION__VALUE = 2;

  /**
   * The number of structural features of the '<em>Scheme Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.SchemeValueImpl <em>Scheme Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SchemeValueImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeValue()
   * @generated
   */
  int SCHEME_VALUE = 36;

  /**
   * The number of structural features of the '<em>Scheme Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.SchemeBooleanImpl <em>Scheme Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SchemeBooleanImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeBoolean()
   * @generated
   */
  int SCHEME_BOOLEAN = 37;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_BOOLEAN__VALUE = SCHEME_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scheme Boolean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_BOOLEAN_FEATURE_COUNT = SCHEME_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.SchemeListImpl <em>Scheme List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SchemeListImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeList()
   * @generated
   */
  int SCHEME_LIST = 38;

  /**
   * The feature id for the '<em><b>Vector</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_LIST__VECTOR = SCHEME_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_LIST__EXPRESSIONS = SCHEME_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Scheme List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_LIST_FEATURE_COUNT = SCHEME_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.SchemeBlockImpl <em>Scheme Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SchemeBlockImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeBlock()
   * @generated
   */
  int SCHEME_BLOCK = 39;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_BLOCK__ELEMENTS = SCHEME_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scheme Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_BLOCK_FEATURE_COUNT = SCHEME_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.SchemeCharacterImpl <em>Scheme Character</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SchemeCharacterImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeCharacter()
   * @generated
   */
  int SCHEME_CHARACTER = 40;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_CHARACTER__VALUE = SCHEME_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scheme Character</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_CHARACTER_FEATURE_COUNT = SCHEME_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.SchemeTextImpl <em>Scheme Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SchemeTextImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeText()
   * @generated
   */
  int SCHEME_TEXT = 41;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_TEXT__VALUE = SCHEME_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scheme Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_TEXT_FEATURE_COUNT = SCHEME_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.SchemeNumberImpl <em>Scheme Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SchemeNumberImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeNumber()
   * @generated
   */
  int SCHEME_NUMBER = 42;

  /**
   * The feature id for the '<em><b>Radix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_NUMBER__RADIX = SCHEME_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_NUMBER__VALUE = SCHEME_VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Scheme Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_NUMBER_FEATURE_COUNT = SCHEME_VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.SchemeMarkupCommandImpl <em>Scheme Markup Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SchemeMarkupCommandImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeMarkupCommand()
   * @generated
   */
  int SCHEME_MARKUP_COMMAND = 43;

  /**
   * The feature id for the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_MARKUP_COMMAND__COMMAND = SCHEME_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scheme Markup Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_MARKUP_COMMAND_FEATURE_COUNT = SCHEME_VALUE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.LilyPond <em>Lily Pond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lily Pond</em>'.
   * @see org.elysium.lilypond.LilyPond
   * @generated
   */
  EClass getLilyPond();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilypond.LilyPond#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.elysium.lilypond.LilyPond#getExpressions()
   * @see #getLilyPond()
   * @generated
   */
  EReference getLilyPond_Expressions();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.ToplevelExpression <em>Toplevel Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Toplevel Expression</em>'.
   * @see org.elysium.lilypond.ToplevelExpression
   * @generated
   */
  EClass getToplevelExpression();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.elysium.lilypond.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.CommonExpression <em>Common Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Common Expression</em>'.
   * @see org.elysium.lilypond.CommonExpression
   * @generated
   */
  EClass getCommonExpression();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see org.elysium.lilypond.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.Assignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.elysium.lilypond.Assignment#getName()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.Assignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.elysium.lilypond.Assignment#getValue()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.PropertyAssignment <em>Property Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Assignment</em>'.
   * @see org.elysium.lilypond.PropertyAssignment
   * @generated
   */
  EClass getPropertyAssignment();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.PropertyAssignment#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.elysium.lilypond.PropertyAssignment#getId()
   * @see #getPropertyAssignment()
   * @generated
   */
  EAttribute getPropertyAssignment_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.PropertyAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.elysium.lilypond.PropertyAssignment#getValue()
   * @see #getPropertyAssignment()
   * @generated
   */
  EReference getPropertyAssignment_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.elysium.lilypond.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilypond.Block#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.elysium.lilypond.Block#getExpressions()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Expressions();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.SimpleBlock <em>Simple Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Block</em>'.
   * @see org.elysium.lilypond.SimpleBlock
   * @generated
   */
  EClass getSimpleBlock();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.SimultaneousBlock <em>Simultaneous Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simultaneous Block</em>'.
   * @see org.elysium.lilypond.SimultaneousBlock
   * @generated
   */
  EClass getSimultaneousBlock();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.elysium.lilypond.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.UnparsedBlock <em>Unparsed Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unparsed Block</em>'.
   * @see org.elysium.lilypond.UnparsedBlock
   * @generated
   */
  EClass getUnparsedBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilypond.UnparsedBlock#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.elysium.lilypond.UnparsedBlock#getExpressions()
   * @see #getUnparsedBlock()
   * @generated
   */
  EReference getUnparsedBlock_Expressions();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.UnparsedExpression <em>Unparsed Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unparsed Expression</em>'.
   * @see org.elysium.lilypond.UnparsedExpression
   * @generated
   */
  EClass getUnparsedExpression();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.UnparsedCommand <em>Unparsed Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unparsed Command</em>'.
   * @see org.elysium.lilypond.UnparsedCommand
   * @generated
   */
  EClass getUnparsedCommand();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.UnparsedCommand#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Command</em>'.
   * @see org.elysium.lilypond.UnparsedCommand#getCommand()
   * @see #getUnparsedCommand()
   * @generated
   */
  EAttribute getUnparsedCommand_Command();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.elysium.lilypond.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the reference '{@link org.elysium.lilypond.Reference#getAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Assignment</em>'.
   * @see org.elysium.lilypond.Reference#getAssignment()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Assignment();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text</em>'.
   * @see org.elysium.lilypond.Text
   * @generated
   */
  EClass getText();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.Text#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.elysium.lilypond.Text#getValue()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number</em>'.
   * @see org.elysium.lilypond.Number
   * @generated
   */
  EClass getNumber();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.Number#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.elysium.lilypond.Number#getValue()
   * @see #getNumber()
   * @generated
   */
  EAttribute getNumber_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.SpecialCommand <em>Special Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Special Command</em>'.
   * @see org.elysium.lilypond.SpecialCommand
   * @generated
   */
  EClass getSpecialCommand();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.SpecialCommand#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see org.elysium.lilypond.SpecialCommand#getKeyword()
   * @see #getSpecialCommand()
   * @generated
   */
  EAttribute getSpecialCommand_Keyword();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include</em>'.
   * @see org.elysium.lilypond.Include
   * @generated
   */
  EClass getInclude();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.Include#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.elysium.lilypond.Include#getImportURI()
   * @see #getInclude()
   * @generated
   */
  EAttribute getInclude_ImportURI();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version</em>'.
   * @see org.elysium.lilypond.Version
   * @generated
   */
  EClass getVersion();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.Version#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.elysium.lilypond.Version#getVersion()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Version();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.Markup <em>Markup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Markup</em>'.
   * @see org.elysium.lilypond.Markup
   * @generated
   */
  EClass getMarkup();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.Markup#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.elysium.lilypond.Markup#getBody()
   * @see #getMarkup()
   * @generated
   */
  EReference getMarkup_Body();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.MarkupLines <em>Markup Lines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Markup Lines</em>'.
   * @see org.elysium.lilypond.MarkupLines
   * @generated
   */
  EClass getMarkupLines();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.MarkupLines#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.elysium.lilypond.MarkupLines#getBody()
   * @see #getMarkupLines()
   * @generated
   */
  EReference getMarkupLines_Body();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.MarkupBody <em>Markup Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Markup Body</em>'.
   * @see org.elysium.lilypond.MarkupBody
   * @generated
   */
  EClass getMarkupBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilypond.MarkupBody#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Command</em>'.
   * @see org.elysium.lilypond.MarkupBody#getCommand()
   * @see #getMarkupBody()
   * @generated
   */
  EReference getMarkupBody_Command();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.MarkupBody#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.elysium.lilypond.MarkupBody#getBlock()
   * @see #getMarkupBody()
   * @generated
   */
  EReference getMarkupBody_Block();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.BlockCommand <em>Block Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Command</em>'.
   * @see org.elysium.lilypond.BlockCommand
   * @generated
   */
  EClass getBlockCommand();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.BlockCommand#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.elysium.lilypond.BlockCommand#getBlock()
   * @see #getBlockCommand()
   * @generated
   */
  EReference getBlockCommand_Block();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.OutputDefinition <em>Output Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Definition</em>'.
   * @see org.elysium.lilypond.OutputDefinition
   * @generated
   */
  EClass getOutputDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.OutputDefinition#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.elysium.lilypond.OutputDefinition#getBlock()
   * @see #getOutputDefinition()
   * @generated
   */
  EReference getOutputDefinition_Block();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.RelativeMusic <em>Relative Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relative Music</em>'.
   * @see org.elysium.lilypond.RelativeMusic
   * @generated
   */
  EClass getRelativeMusic();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.RelativeMusic#getPitch <em>Pitch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pitch</em>'.
   * @see org.elysium.lilypond.RelativeMusic#getPitch()
   * @see #getRelativeMusic()
   * @generated
   */
  EReference getRelativeMusic_Pitch();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.RelativeMusic#getMusic <em>Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Music</em>'.
   * @see org.elysium.lilypond.RelativeMusic#getMusic()
   * @see #getRelativeMusic()
   * @generated
   */
  EReference getRelativeMusic_Music();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.Pitch <em>Pitch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pitch</em>'.
   * @see org.elysium.lilypond.Pitch
   * @generated
   */
  EClass getPitch();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.Pitch#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see org.elysium.lilypond.Pitch#getBase()
   * @see #getPitch()
   * @generated
   */
  EAttribute getPitch_Base();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.Pitch#isOctaveCheck <em>Octave Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Octave Check</em>'.
   * @see org.elysium.lilypond.Pitch#isOctaveCheck()
   * @see #getPitch()
   * @generated
   */
  EAttribute getPitch_OctaveCheck();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.Pitch#getOctaveShift <em>Octave Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Octave Shift</em>'.
   * @see org.elysium.lilypond.Pitch#getOctaveShift()
   * @see #getPitch()
   * @generated
   */
  EReference getPitch_OctaveShift();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.Pitch#isReminderAccidental <em>Reminder Accidental</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reminder Accidental</em>'.
   * @see org.elysium.lilypond.Pitch#isReminderAccidental()
   * @see #getPitch()
   * @generated
   */
  EAttribute getPitch_ReminderAccidental();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.Pitch#isCautionaryAccidental <em>Cautionary Accidental</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cautionary Accidental</em>'.
   * @see org.elysium.lilypond.Pitch#isCautionaryAccidental()
   * @see #getPitch()
   * @generated
   */
  EAttribute getPitch_CautionaryAccidental();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.Octave <em>Octave</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Octave</em>'.
   * @see org.elysium.lilypond.Octave
   * @generated
   */
  EClass getOctave();

  /**
   * Returns the meta object for the attribute list '{@link org.elysium.lilypond.Octave#getUp <em>Up</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Up</em>'.
   * @see org.elysium.lilypond.Octave#getUp()
   * @see #getOctave()
   * @generated
   */
  EAttribute getOctave_Up();

  /**
   * Returns the meta object for the attribute list '{@link org.elysium.lilypond.Octave#getDown <em>Down</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Down</em>'.
   * @see org.elysium.lilypond.Octave#getDown()
   * @see #getOctave()
   * @generated
   */
  EAttribute getOctave_Down();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.TransposedMusic <em>Transposed Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transposed Music</em>'.
   * @see org.elysium.lilypond.TransposedMusic
   * @generated
   */
  EClass getTransposedMusic();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.TransposedMusic#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.elysium.lilypond.TransposedMusic#getSource()
   * @see #getTransposedMusic()
   * @generated
   */
  EReference getTransposedMusic_Source();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.TransposedMusic#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.elysium.lilypond.TransposedMusic#getTarget()
   * @see #getTransposedMusic()
   * @generated
   */
  EReference getTransposedMusic_Target();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.TransposedMusic#getMusic <em>Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Music</em>'.
   * @see org.elysium.lilypond.TransposedMusic#getMusic()
   * @see #getTransposedMusic()
   * @generated
   */
  EReference getTransposedMusic_Music();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.ModeChange <em>Mode Change</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mode Change</em>'.
   * @see org.elysium.lilypond.ModeChange
   * @generated
   */
  EClass getModeChange();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.ModeChange#getMusic <em>Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Music</em>'.
   * @see org.elysium.lilypond.ModeChange#getMusic()
   * @see #getModeChange()
   * @generated
   */
  EReference getModeChange_Music();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.MusicWithLyrics <em>Music With Lyrics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Music With Lyrics</em>'.
   * @see org.elysium.lilypond.MusicWithLyrics
   * @generated
   */
  EClass getMusicWithLyrics();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.MusicWithLyrics#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.elysium.lilypond.MusicWithLyrics#getId()
   * @see #getMusicWithLyrics()
   * @generated
   */
  EAttribute getMusicWithLyrics_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.MusicWithLyrics#getLyrics <em>Lyrics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lyrics</em>'.
   * @see org.elysium.lilypond.MusicWithLyrics#getLyrics()
   * @see #getMusicWithLyrics()
   * @generated
   */
  EReference getMusicWithLyrics_Lyrics();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.NewContext <em>New Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Context</em>'.
   * @see org.elysium.lilypond.NewContext
   * @generated
   */
  EClass getNewContext();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.NewContext#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Context</em>'.
   * @see org.elysium.lilypond.NewContext#getContext()
   * @see #getNewContext()
   * @generated
   */
  EAttribute getNewContext_Context();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.NewContext#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.elysium.lilypond.NewContext#getId()
   * @see #getNewContext()
   * @generated
   */
  EAttribute getNewContext_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.NewContext#getModification <em>Modification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modification</em>'.
   * @see org.elysium.lilypond.NewContext#getModification()
   * @see #getNewContext()
   * @generated
   */
  EReference getNewContext_Modification();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.NewContext#getMusic <em>Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Music</em>'.
   * @see org.elysium.lilypond.NewContext#getMusic()
   * @see #getNewContext()
   * @generated
   */
  EReference getNewContext_Music();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.ContextModification <em>Context Modification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Modification</em>'.
   * @see org.elysium.lilypond.ContextModification
   * @generated
   */
  EClass getContextModification();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.ContextModification#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.elysium.lilypond.ContextModification#getBlock()
   * @see #getContextModification()
   * @generated
   */
  EReference getContextModification_Block();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.ContextDef <em>Context Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Def</em>'.
   * @see org.elysium.lilypond.ContextDef
   * @generated
   */
  EClass getContextDef();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.ContextDef#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.elysium.lilypond.ContextDef#getBlock()
   * @see #getContextDef()
   * @generated
   */
  EReference getContextDef_Block();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.Other <em>Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Other</em>'.
   * @see org.elysium.lilypond.Other
   * @generated
   */
  EClass getOther();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.Scheme <em>Scheme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme</em>'.
   * @see org.elysium.lilypond.Scheme
   * @generated
   */
  EClass getScheme();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.Scheme#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.elysium.lilypond.Scheme#getValue()
   * @see #getScheme()
   * @generated
   */
  EReference getScheme_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.SchemeExpression <em>Scheme Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme Expression</em>'.
   * @see org.elysium.lilypond.SchemeExpression
   * @generated
   */
  EClass getSchemeExpression();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.SchemeExpression#isReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see org.elysium.lilypond.SchemeExpression#isReference()
   * @see #getSchemeExpression()
   * @generated
   */
  EAttribute getSchemeExpression_Reference();

  /**
   * Returns the meta object for the attribute list '{@link org.elysium.lilypond.SchemeExpression#getQuotations <em>Quotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Quotations</em>'.
   * @see org.elysium.lilypond.SchemeExpression#getQuotations()
   * @see #getSchemeExpression()
   * @generated
   */
  EAttribute getSchemeExpression_Quotations();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.SchemeExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.elysium.lilypond.SchemeExpression#getValue()
   * @see #getSchemeExpression()
   * @generated
   */
  EReference getSchemeExpression_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.SchemeValue <em>Scheme Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme Value</em>'.
   * @see org.elysium.lilypond.SchemeValue
   * @generated
   */
  EClass getSchemeValue();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.SchemeBoolean <em>Scheme Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme Boolean</em>'.
   * @see org.elysium.lilypond.SchemeBoolean
   * @generated
   */
  EClass getSchemeBoolean();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.SchemeBoolean#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.elysium.lilypond.SchemeBoolean#isValue()
   * @see #getSchemeBoolean()
   * @generated
   */
  EAttribute getSchemeBoolean_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.SchemeList <em>Scheme List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme List</em>'.
   * @see org.elysium.lilypond.SchemeList
   * @generated
   */
  EClass getSchemeList();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.SchemeList#isVector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vector</em>'.
   * @see org.elysium.lilypond.SchemeList#isVector()
   * @see #getSchemeList()
   * @generated
   */
  EAttribute getSchemeList_Vector();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilypond.SchemeList#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.elysium.lilypond.SchemeList#getExpressions()
   * @see #getSchemeList()
   * @generated
   */
  EReference getSchemeList_Expressions();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.SchemeBlock <em>Scheme Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme Block</em>'.
   * @see org.elysium.lilypond.SchemeBlock
   * @generated
   */
  EClass getSchemeBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilypond.SchemeBlock#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.elysium.lilypond.SchemeBlock#getElements()
   * @see #getSchemeBlock()
   * @generated
   */
  EReference getSchemeBlock_Elements();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.SchemeCharacter <em>Scheme Character</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme Character</em>'.
   * @see org.elysium.lilypond.SchemeCharacter
   * @generated
   */
  EClass getSchemeCharacter();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.SchemeCharacter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.elysium.lilypond.SchemeCharacter#getValue()
   * @see #getSchemeCharacter()
   * @generated
   */
  EAttribute getSchemeCharacter_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.SchemeText <em>Scheme Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme Text</em>'.
   * @see org.elysium.lilypond.SchemeText
   * @generated
   */
  EClass getSchemeText();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.SchemeText#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.elysium.lilypond.SchemeText#getValue()
   * @see #getSchemeText()
   * @generated
   */
  EAttribute getSchemeText_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.SchemeNumber <em>Scheme Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme Number</em>'.
   * @see org.elysium.lilypond.SchemeNumber
   * @generated
   */
  EClass getSchemeNumber();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.SchemeNumber#getRadix <em>Radix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Radix</em>'.
   * @see org.elysium.lilypond.SchemeNumber#getRadix()
   * @see #getSchemeNumber()
   * @generated
   */
  EAttribute getSchemeNumber_Radix();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.SchemeNumber#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.elysium.lilypond.SchemeNumber#getValue()
   * @see #getSchemeNumber()
   * @generated
   */
  EAttribute getSchemeNumber_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.SchemeMarkupCommand <em>Scheme Markup Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme Markup Command</em>'.
   * @see org.elysium.lilypond.SchemeMarkupCommand
   * @generated
   */
  EClass getSchemeMarkupCommand();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.SchemeMarkupCommand#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Command</em>'.
   * @see org.elysium.lilypond.SchemeMarkupCommand#getCommand()
   * @see #getSchemeMarkupCommand()
   * @generated
   */
  EAttribute getSchemeMarkupCommand_Command();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LilypondFactory getLilypondFactory();

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
     * The meta object literal for the '{@link org.elysium.lilypond.impl.LilyPondImpl <em>Lily Pond</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.LilyPondImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getLilyPond()
     * @generated
     */
    EClass LILY_POND = eINSTANCE.getLilyPond();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LILY_POND__EXPRESSIONS = eINSTANCE.getLilyPond_Expressions();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.ToplevelExpressionImpl <em>Toplevel Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.ToplevelExpressionImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getToplevelExpression()
     * @generated
     */
    EClass TOPLEVEL_EXPRESSION = eINSTANCE.getToplevelExpression();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.ExpressionImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.CommonExpressionImpl <em>Common Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.CommonExpressionImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getCommonExpression()
     * @generated
     */
    EClass COMMON_EXPRESSION = eINSTANCE.getCommonExpression();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.AssignmentImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__NAME = eINSTANCE.getAssignment_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.PropertyAssignmentImpl <em>Property Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.PropertyAssignmentImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getPropertyAssignment()
     * @generated
     */
    EClass PROPERTY_ASSIGNMENT = eINSTANCE.getPropertyAssignment();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_ASSIGNMENT__ID = eINSTANCE.getPropertyAssignment_Id();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_ASSIGNMENT__VALUE = eINSTANCE.getPropertyAssignment_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.BlockImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__EXPRESSIONS = eINSTANCE.getBlock_Expressions();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.SimpleBlockImpl <em>Simple Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.SimpleBlockImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSimpleBlock()
     * @generated
     */
    EClass SIMPLE_BLOCK = eINSTANCE.getSimpleBlock();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.SimultaneousBlockImpl <em>Simultaneous Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.SimultaneousBlockImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSimultaneousBlock()
     * @generated
     */
    EClass SIMULTANEOUS_BLOCK = eINSTANCE.getSimultaneousBlock();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.CommandImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.UnparsedBlockImpl <em>Unparsed Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.UnparsedBlockImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getUnparsedBlock()
     * @generated
     */
    EClass UNPARSED_BLOCK = eINSTANCE.getUnparsedBlock();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNPARSED_BLOCK__EXPRESSIONS = eINSTANCE.getUnparsedBlock_Expressions();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.UnparsedExpressionImpl <em>Unparsed Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.UnparsedExpressionImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getUnparsedExpression()
     * @generated
     */
    EClass UNPARSED_EXPRESSION = eINSTANCE.getUnparsedExpression();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.UnparsedCommandImpl <em>Unparsed Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.UnparsedCommandImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getUnparsedCommand()
     * @generated
     */
    EClass UNPARSED_COMMAND = eINSTANCE.getUnparsedCommand();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNPARSED_COMMAND__COMMAND = eINSTANCE.getUnparsedCommand_Command();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.ReferenceImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__ASSIGNMENT = eINSTANCE.getReference_Assignment();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.TextImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getText()
     * @generated
     */
    EClass TEXT = eINSTANCE.getText();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT__VALUE = eINSTANCE.getText_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.NumberImpl <em>Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.NumberImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getNumber()
     * @generated
     */
    EClass NUMBER = eINSTANCE.getNumber();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.SpecialCommandImpl <em>Special Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.SpecialCommandImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSpecialCommand()
     * @generated
     */
    EClass SPECIAL_COMMAND = eINSTANCE.getSpecialCommand();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIAL_COMMAND__KEYWORD = eINSTANCE.getSpecialCommand_Keyword();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.IncludeImpl <em>Include</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.IncludeImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getInclude()
     * @generated
     */
    EClass INCLUDE = eINSTANCE.getInclude();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE__IMPORT_URI = eINSTANCE.getInclude_ImportURI();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.VersionImpl <em>Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.VersionImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getVersion()
     * @generated
     */
    EClass VERSION = eINSTANCE.getVersion();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__VERSION = eINSTANCE.getVersion_Version();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.MarkupImpl <em>Markup</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.MarkupImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getMarkup()
     * @generated
     */
    EClass MARKUP = eINSTANCE.getMarkup();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MARKUP__BODY = eINSTANCE.getMarkup_Body();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.MarkupLinesImpl <em>Markup Lines</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.MarkupLinesImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getMarkupLines()
     * @generated
     */
    EClass MARKUP_LINES = eINSTANCE.getMarkupLines();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MARKUP_LINES__BODY = eINSTANCE.getMarkupLines_Body();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.MarkupBodyImpl <em>Markup Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.MarkupBodyImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getMarkupBody()
     * @generated
     */
    EClass MARKUP_BODY = eINSTANCE.getMarkupBody();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MARKUP_BODY__COMMAND = eINSTANCE.getMarkupBody_Command();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MARKUP_BODY__BLOCK = eINSTANCE.getMarkupBody_Block();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.BlockCommandImpl <em>Block Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.BlockCommandImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getBlockCommand()
     * @generated
     */
    EClass BLOCK_COMMAND = eINSTANCE.getBlockCommand();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_COMMAND__BLOCK = eINSTANCE.getBlockCommand_Block();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.OutputDefinitionImpl <em>Output Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.OutputDefinitionImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getOutputDefinition()
     * @generated
     */
    EClass OUTPUT_DEFINITION = eINSTANCE.getOutputDefinition();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_DEFINITION__BLOCK = eINSTANCE.getOutputDefinition_Block();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.RelativeMusicImpl <em>Relative Music</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.RelativeMusicImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getRelativeMusic()
     * @generated
     */
    EClass RELATIVE_MUSIC = eINSTANCE.getRelativeMusic();

    /**
     * The meta object literal for the '<em><b>Pitch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIVE_MUSIC__PITCH = eINSTANCE.getRelativeMusic_Pitch();

    /**
     * The meta object literal for the '<em><b>Music</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIVE_MUSIC__MUSIC = eINSTANCE.getRelativeMusic_Music();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.PitchImpl <em>Pitch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.PitchImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getPitch()
     * @generated
     */
    EClass PITCH = eINSTANCE.getPitch();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PITCH__BASE = eINSTANCE.getPitch_Base();

    /**
     * The meta object literal for the '<em><b>Octave Check</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PITCH__OCTAVE_CHECK = eINSTANCE.getPitch_OctaveCheck();

    /**
     * The meta object literal for the '<em><b>Octave Shift</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PITCH__OCTAVE_SHIFT = eINSTANCE.getPitch_OctaveShift();

    /**
     * The meta object literal for the '<em><b>Reminder Accidental</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PITCH__REMINDER_ACCIDENTAL = eINSTANCE.getPitch_ReminderAccidental();

    /**
     * The meta object literal for the '<em><b>Cautionary Accidental</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PITCH__CAUTIONARY_ACCIDENTAL = eINSTANCE.getPitch_CautionaryAccidental();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.OctaveImpl <em>Octave</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.OctaveImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getOctave()
     * @generated
     */
    EClass OCTAVE = eINSTANCE.getOctave();

    /**
     * The meta object literal for the '<em><b>Up</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCTAVE__UP = eINSTANCE.getOctave_Up();

    /**
     * The meta object literal for the '<em><b>Down</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OCTAVE__DOWN = eINSTANCE.getOctave_Down();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.TransposedMusicImpl <em>Transposed Music</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.TransposedMusicImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getTransposedMusic()
     * @generated
     */
    EClass TRANSPOSED_MUSIC = eINSTANCE.getTransposedMusic();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSPOSED_MUSIC__SOURCE = eINSTANCE.getTransposedMusic_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSPOSED_MUSIC__TARGET = eINSTANCE.getTransposedMusic_Target();

    /**
     * The meta object literal for the '<em><b>Music</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSPOSED_MUSIC__MUSIC = eINSTANCE.getTransposedMusic_Music();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.ModeChangeImpl <em>Mode Change</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.ModeChangeImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getModeChange()
     * @generated
     */
    EClass MODE_CHANGE = eINSTANCE.getModeChange();

    /**
     * The meta object literal for the '<em><b>Music</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODE_CHANGE__MUSIC = eINSTANCE.getModeChange_Music();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.MusicWithLyricsImpl <em>Music With Lyrics</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.MusicWithLyricsImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getMusicWithLyrics()
     * @generated
     */
    EClass MUSIC_WITH_LYRICS = eINSTANCE.getMusicWithLyrics();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MUSIC_WITH_LYRICS__ID = eINSTANCE.getMusicWithLyrics_Id();

    /**
     * The meta object literal for the '<em><b>Lyrics</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUSIC_WITH_LYRICS__LYRICS = eINSTANCE.getMusicWithLyrics_Lyrics();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.NewContextImpl <em>New Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.NewContextImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getNewContext()
     * @generated
     */
    EClass NEW_CONTEXT = eINSTANCE.getNewContext();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_CONTEXT__CONTEXT = eINSTANCE.getNewContext_Context();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_CONTEXT__ID = eINSTANCE.getNewContext_Id();

    /**
     * The meta object literal for the '<em><b>Modification</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_CONTEXT__MODIFICATION = eINSTANCE.getNewContext_Modification();

    /**
     * The meta object literal for the '<em><b>Music</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_CONTEXT__MUSIC = eINSTANCE.getNewContext_Music();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.ContextModificationImpl <em>Context Modification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.ContextModificationImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getContextModification()
     * @generated
     */
    EClass CONTEXT_MODIFICATION = eINSTANCE.getContextModification();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_MODIFICATION__BLOCK = eINSTANCE.getContextModification_Block();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.ContextDefImpl <em>Context Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.ContextDefImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getContextDef()
     * @generated
     */
    EClass CONTEXT_DEF = eINSTANCE.getContextDef();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_DEF__BLOCK = eINSTANCE.getContextDef_Block();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.OtherImpl <em>Other</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.OtherImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getOther()
     * @generated
     */
    EClass OTHER = eINSTANCE.getOther();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.SchemeImpl <em>Scheme</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.SchemeImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getScheme()
     * @generated
     */
    EClass SCHEME = eINSTANCE.getScheme();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEME__VALUE = eINSTANCE.getScheme_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.SchemeExpressionImpl <em>Scheme Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.SchemeExpressionImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeExpression()
     * @generated
     */
    EClass SCHEME_EXPRESSION = eINSTANCE.getSchemeExpression();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME_EXPRESSION__REFERENCE = eINSTANCE.getSchemeExpression_Reference();

    /**
     * The meta object literal for the '<em><b>Quotations</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME_EXPRESSION__QUOTATIONS = eINSTANCE.getSchemeExpression_Quotations();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEME_EXPRESSION__VALUE = eINSTANCE.getSchemeExpression_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.SchemeValueImpl <em>Scheme Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.SchemeValueImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeValue()
     * @generated
     */
    EClass SCHEME_VALUE = eINSTANCE.getSchemeValue();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.SchemeBooleanImpl <em>Scheme Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.SchemeBooleanImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeBoolean()
     * @generated
     */
    EClass SCHEME_BOOLEAN = eINSTANCE.getSchemeBoolean();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME_BOOLEAN__VALUE = eINSTANCE.getSchemeBoolean_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.SchemeListImpl <em>Scheme List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.SchemeListImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeList()
     * @generated
     */
    EClass SCHEME_LIST = eINSTANCE.getSchemeList();

    /**
     * The meta object literal for the '<em><b>Vector</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME_LIST__VECTOR = eINSTANCE.getSchemeList_Vector();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEME_LIST__EXPRESSIONS = eINSTANCE.getSchemeList_Expressions();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.SchemeBlockImpl <em>Scheme Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.SchemeBlockImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeBlock()
     * @generated
     */
    EClass SCHEME_BLOCK = eINSTANCE.getSchemeBlock();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEME_BLOCK__ELEMENTS = eINSTANCE.getSchemeBlock_Elements();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.SchemeCharacterImpl <em>Scheme Character</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.SchemeCharacterImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeCharacter()
     * @generated
     */
    EClass SCHEME_CHARACTER = eINSTANCE.getSchemeCharacter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME_CHARACTER__VALUE = eINSTANCE.getSchemeCharacter_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.SchemeTextImpl <em>Scheme Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.SchemeTextImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeText()
     * @generated
     */
    EClass SCHEME_TEXT = eINSTANCE.getSchemeText();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME_TEXT__VALUE = eINSTANCE.getSchemeText_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.SchemeNumberImpl <em>Scheme Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.SchemeNumberImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeNumber()
     * @generated
     */
    EClass SCHEME_NUMBER = eINSTANCE.getSchemeNumber();

    /**
     * The meta object literal for the '<em><b>Radix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME_NUMBER__RADIX = eINSTANCE.getSchemeNumber_Radix();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME_NUMBER__VALUE = eINSTANCE.getSchemeNumber_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.SchemeMarkupCommandImpl <em>Scheme Markup Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.SchemeMarkupCommandImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeMarkupCommand()
     * @generated
     */
    EClass SCHEME_MARKUP_COMMAND = eINSTANCE.getSchemeMarkupCommand();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME_MARKUP_COMMAND__COMMAND = eINSTANCE.getSchemeMarkupCommand_Command();

  }

} //LilypondPackage
