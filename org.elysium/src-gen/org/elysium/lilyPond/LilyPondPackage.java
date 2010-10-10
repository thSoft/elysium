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
   * The meta object id for the '{@link org.elysium.lilypond.impl.SpecialCommandImpl <em>Special Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SpecialCommandImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSpecialCommand()
   * @generated
   */
  int SPECIAL_COMMAND = 10;

  /**
   * The number of structural features of the '<em>Special Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.IncludeImpl <em>Include</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.IncludeImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getInclude()
   * @generated
   */
  int INCLUDE = 11;

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
  int VERSION = 12;

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
  int MARKUP = 13;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP__BLOCK = SPECIAL_COMMAND_FEATURE_COUNT + 0;

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
  int MARKUP_LINES = 14;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_LINES__BLOCK = SPECIAL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Markup Lines</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_LINES_FEATURE_COUNT = SPECIAL_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.MarkupExpressionImpl <em>Markup Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.MarkupExpressionImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getMarkupExpression()
   * @generated
   */
  int MARKUP_EXPRESSION = 16;

  /**
   * The number of structural features of the '<em>Markup Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.MarkupBlockImpl <em>Markup Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.MarkupBlockImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getMarkupBlock()
   * @generated
   */
  int MARKUP_BLOCK = 15;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_BLOCK__EXPRESSIONS = MARKUP_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Markup Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_BLOCK_FEATURE_COUNT = MARKUP_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.MarkupCommandImpl <em>Markup Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.MarkupCommandImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getMarkupCommand()
   * @generated
   */
  int MARKUP_COMMAND = 17;

  /**
   * The feature id for the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_COMMAND__COMMAND = MARKUP_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Markup Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_COMMAND_FEATURE_COUNT = MARKUP_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.ReferenceImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 18;

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
  int TEXT = 19;

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
  int NUMBER = 20;

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
   * The meta object id for the '{@link org.elysium.lilypond.impl.SchemeImpl <em>Scheme</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SchemeImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getScheme()
   * @generated
   */
  int SCHEME = 21;

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
  int SCHEME_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Quoted</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_EXPRESSION__QUOTED = 0;

  /**
   * The feature id for the '<em><b>Quasiquoted</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_EXPRESSION__QUASIQUOTED = 1;

  /**
   * The feature id for the '<em><b>Unquoted</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_EXPRESSION__UNQUOTED = 2;

  /**
   * The feature id for the '<em><b>Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_EXPRESSION__VARIABLE = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_EXPRESSION__VALUE = 4;

  /**
   * The number of structural features of the '<em>Scheme Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_EXPRESSION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.elysium.lilypond.impl.SchemeValueImpl <em>Scheme Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilypond.impl.SchemeValueImpl
   * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSchemeValue()
   * @generated
   */
  int SCHEME_VALUE = 23;

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
  int SCHEME_BOOLEAN = 24;

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
  int SCHEME_LIST = 25;

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
  int SCHEME_BLOCK = 26;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_BLOCK__EXPRESSIONS = SCHEME_VALUE_FEATURE_COUNT + 0;

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
  int SCHEME_CHARACTER = 27;

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
  int SCHEME_TEXT = 28;

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
  int SCHEME_NUMBER = 29;

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
  int SCHEME_MARKUP_COMMAND = 30;

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
   * Returns the meta object for class '{@link org.elysium.lilypond.SpecialCommand <em>Special Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Special Command</em>'.
   * @see org.elysium.lilypond.SpecialCommand
   * @generated
   */
  EClass getSpecialCommand();

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
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.Markup#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.elysium.lilypond.Markup#getBlock()
   * @see #getMarkup()
   * @generated
   */
  EReference getMarkup_Block();

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
   * Returns the meta object for the containment reference '{@link org.elysium.lilypond.MarkupLines#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.elysium.lilypond.MarkupLines#getBlock()
   * @see #getMarkupLines()
   * @generated
   */
  EReference getMarkupLines_Block();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.MarkupBlock <em>Markup Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Markup Block</em>'.
   * @see org.elysium.lilypond.MarkupBlock
   * @generated
   */
  EClass getMarkupBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilypond.MarkupBlock#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.elysium.lilypond.MarkupBlock#getExpressions()
   * @see #getMarkupBlock()
   * @generated
   */
  EReference getMarkupBlock_Expressions();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.MarkupExpression <em>Markup Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Markup Expression</em>'.
   * @see org.elysium.lilypond.MarkupExpression
   * @generated
   */
  EClass getMarkupExpression();

  /**
   * Returns the meta object for class '{@link org.elysium.lilypond.MarkupCommand <em>Markup Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Markup Command</em>'.
   * @see org.elysium.lilypond.MarkupCommand
   * @generated
   */
  EClass getMarkupCommand();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.MarkupCommand#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Command</em>'.
   * @see org.elysium.lilypond.MarkupCommand#getCommand()
   * @see #getMarkupCommand()
   * @generated
   */
  EAttribute getMarkupCommand_Command();

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
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.SchemeExpression#isQuoted <em>Quoted</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quoted</em>'.
   * @see org.elysium.lilypond.SchemeExpression#isQuoted()
   * @see #getSchemeExpression()
   * @generated
   */
  EAttribute getSchemeExpression_Quoted();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.SchemeExpression#isQuasiquoted <em>Quasiquoted</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quasiquoted</em>'.
   * @see org.elysium.lilypond.SchemeExpression#isQuasiquoted()
   * @see #getSchemeExpression()
   * @generated
   */
  EAttribute getSchemeExpression_Quasiquoted();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.SchemeExpression#isUnquoted <em>Unquoted</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unquoted</em>'.
   * @see org.elysium.lilypond.SchemeExpression#isUnquoted()
   * @see #getSchemeExpression()
   * @generated
   */
  EAttribute getSchemeExpression_Unquoted();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilypond.SchemeExpression#isVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variable</em>'.
   * @see org.elysium.lilypond.SchemeExpression#isVariable()
   * @see #getSchemeExpression()
   * @generated
   */
  EAttribute getSchemeExpression_Variable();

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
   * Returns the meta object for the containment reference list '{@link org.elysium.lilypond.SchemeBlock#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.elysium.lilypond.SchemeBlock#getExpressions()
   * @see #getSchemeBlock()
   * @generated
   */
  EReference getSchemeBlock_Expressions();

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
     * The meta object literal for the '{@link org.elysium.lilypond.impl.SpecialCommandImpl <em>Special Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.SpecialCommandImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getSpecialCommand()
     * @generated
     */
    EClass SPECIAL_COMMAND = eINSTANCE.getSpecialCommand();

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
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MARKUP__BLOCK = eINSTANCE.getMarkup_Block();

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
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MARKUP_LINES__BLOCK = eINSTANCE.getMarkupLines_Block();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.MarkupBlockImpl <em>Markup Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.MarkupBlockImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getMarkupBlock()
     * @generated
     */
    EClass MARKUP_BLOCK = eINSTANCE.getMarkupBlock();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MARKUP_BLOCK__EXPRESSIONS = eINSTANCE.getMarkupBlock_Expressions();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.MarkupExpressionImpl <em>Markup Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.MarkupExpressionImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getMarkupExpression()
     * @generated
     */
    EClass MARKUP_EXPRESSION = eINSTANCE.getMarkupExpression();

    /**
     * The meta object literal for the '{@link org.elysium.lilypond.impl.MarkupCommandImpl <em>Markup Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilypond.impl.MarkupCommandImpl
     * @see org.elysium.lilypond.impl.LilypondPackageImpl#getMarkupCommand()
     * @generated
     */
    EClass MARKUP_COMMAND = eINSTANCE.getMarkupCommand();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MARKUP_COMMAND__COMMAND = eINSTANCE.getMarkupCommand_Command();

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
     * The meta object literal for the '<em><b>Quoted</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME_EXPRESSION__QUOTED = eINSTANCE.getSchemeExpression_Quoted();

    /**
     * The meta object literal for the '<em><b>Quasiquoted</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME_EXPRESSION__QUASIQUOTED = eINSTANCE.getSchemeExpression_Quasiquoted();

    /**
     * The meta object literal for the '<em><b>Unquoted</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME_EXPRESSION__UNQUOTED = eINSTANCE.getSchemeExpression_Unquoted();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME_EXPRESSION__VARIABLE = eINSTANCE.getSchemeExpression_Variable();

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
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEME_BLOCK__EXPRESSIONS = eINSTANCE.getSchemeBlock_Expressions();

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
