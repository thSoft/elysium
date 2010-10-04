/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

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
 * @see org.elysium.lilyPond.LilyPondFactory
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
  String eNS_URI = "http://www.elysium.org/LilyPond";

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
  LilyPondPackage eINSTANCE = org.elysium.lilyPond.impl.LilyPondPackageImpl.init();

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.LilyPondImpl <em>Lily Pond</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.LilyPondImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getLilyPond()
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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ExpressionImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Parent Block</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__PARENT_BLOCK = 0;

  /**
   * The feature id for the '<em><b>Parent Lily Pond</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__PARENT_LILY_POND = 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.BlockImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 2;

  /**
   * The feature id for the '<em><b>Parent Block</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__PARENT_BLOCK = EXPRESSION__PARENT_BLOCK;

  /**
   * The feature id for the '<em><b>Parent Lily Pond</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__PARENT_LILY_POND = EXPRESSION__PARENT_LILY_POND;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SimpleBlockImpl <em>Simple Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SimpleBlockImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSimpleBlock()
   * @generated
   */
  int SIMPLE_BLOCK = 3;

  /**
   * The feature id for the '<em><b>Parent Block</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_BLOCK__PARENT_BLOCK = BLOCK__PARENT_BLOCK;

  /**
   * The feature id for the '<em><b>Parent Lily Pond</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_BLOCK__PARENT_LILY_POND = BLOCK__PARENT_LILY_POND;

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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SimultaneousBlockImpl <em>Simultaneous Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SimultaneousBlockImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSimultaneousBlock()
   * @generated
   */
  int SIMULTANEOUS_BLOCK = 4;

  /**
   * The feature id for the '<em><b>Parent Block</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULTANEOUS_BLOCK__PARENT_BLOCK = BLOCK__PARENT_BLOCK;

  /**
   * The feature id for the '<em><b>Parent Lily Pond</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULTANEOUS_BLOCK__PARENT_LILY_POND = BLOCK__PARENT_LILY_POND;

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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SchemeImpl <em>Scheme</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SchemeImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getScheme()
   * @generated
   */
  int SCHEME = 5;

  /**
   * The feature id for the '<em><b>Parent Block</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME__PARENT_BLOCK = EXPRESSION__PARENT_BLOCK;

  /**
   * The feature id for the '<em><b>Parent Lily Pond</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME__PARENT_LILY_POND = EXPRESSION__PARENT_LILY_POND;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scheme</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SchemeExpressionImpl <em>Scheme Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SchemeExpressionImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeExpression()
   * @generated
   */
  int SCHEME_EXPRESSION = 6;

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
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_EXPRESSION__VALUE = 3;

  /**
   * The number of structural features of the '<em>Scheme Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_EXPRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SchemeValueImpl <em>Scheme Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SchemeValueImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeValue()
   * @generated
   */
  int SCHEME_VALUE = 7;

  /**
   * The number of structural features of the '<em>Scheme Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SchemeBooleanImpl <em>Scheme Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SchemeBooleanImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeBoolean()
   * @generated
   */
  int SCHEME_BOOLEAN = 8;

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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SchemeListImpl <em>Scheme List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SchemeListImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeList()
   * @generated
   */
  int SCHEME_LIST = 9;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_LIST__EXPRESSIONS = SCHEME_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scheme List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_LIST_FEATURE_COUNT = SCHEME_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SchemeBlockImpl <em>Scheme Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SchemeBlockImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeBlock()
   * @generated
   */
  int SCHEME_BLOCK = 10;

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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SchemeMarkupCommandImpl <em>Scheme Markup Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SchemeMarkupCommandImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeMarkupCommand()
   * @generated
   */
  int SCHEME_MARKUP_COMMAND = 11;

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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SchemeTextImpl <em>Scheme Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SchemeTextImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeText()
   * @generated
   */
  int SCHEME_TEXT = 12;

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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SchemeNumberImpl <em>Scheme Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SchemeNumberImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeNumber()
   * @generated
   */
  int SCHEME_NUMBER = 13;

  /**
   * The feature id for the '<em><b>Hexadecimal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_NUMBER__HEXADECIMAL = SCHEME_VALUE_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.CommandImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 14;

  /**
   * The feature id for the '<em><b>Parent Block</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__PARENT_BLOCK = EXPRESSION__PARENT_BLOCK;

  /**
   * The feature id for the '<em><b>Parent Lily Pond</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__PARENT_LILY_POND = EXPRESSION__PARENT_LILY_POND;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ArbitraryCommandImpl <em>Arbitrary Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ArbitraryCommandImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getArbitraryCommand()
   * @generated
   */
  int ARBITRARY_COMMAND = 15;

  /**
   * The feature id for the '<em><b>Parent Block</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_COMMAND__PARENT_BLOCK = COMMAND__PARENT_BLOCK;

  /**
   * The feature id for the '<em><b>Parent Lily Pond</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_COMMAND__PARENT_LILY_POND = COMMAND__PARENT_LILY_POND;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_COMMAND__KEYWORD = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Arbitrary Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARBITRARY_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SpecialCommandImpl <em>Special Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SpecialCommandImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSpecialCommand()
   * @generated
   */
  int SPECIAL_COMMAND = 16;

  /**
   * The feature id for the '<em><b>Parent Block</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_COMMAND__PARENT_BLOCK = COMMAND__PARENT_BLOCK;

  /**
   * The feature id for the '<em><b>Parent Lily Pond</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_COMMAND__PARENT_LILY_POND = COMMAND__PARENT_LILY_POND;

  /**
   * The number of structural features of the '<em>Special Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIAL_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.IncludeImpl <em>Include</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.IncludeImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getInclude()
   * @generated
   */
  int INCLUDE = 17;

  /**
   * The feature id for the '<em><b>Parent Block</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__PARENT_BLOCK = SPECIAL_COMMAND__PARENT_BLOCK;

  /**
   * The feature id for the '<em><b>Parent Lily Pond</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__PARENT_LILY_POND = SPECIAL_COMMAND__PARENT_LILY_POND;

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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.VersionImpl <em>Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.VersionImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getVersion()
   * @generated
   */
  int VERSION = 18;

  /**
   * The feature id for the '<em><b>Parent Block</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__PARENT_BLOCK = SPECIAL_COMMAND__PARENT_BLOCK;

  /**
   * The feature id for the '<em><b>Parent Lily Pond</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__PARENT_LILY_POND = SPECIAL_COMMAND__PARENT_LILY_POND;

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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.TextImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getText()
   * @generated
   */
  int TEXT = 19;

  /**
   * The feature id for the '<em><b>Parent Block</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__PARENT_BLOCK = EXPRESSION__PARENT_BLOCK;

  /**
   * The feature id for the '<em><b>Parent Lily Pond</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__PARENT_LILY_POND = EXPRESSION__PARENT_LILY_POND;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.NumberImpl <em>Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.NumberImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getNumber()
   * @generated
   */
  int NUMBER = 20;

  /**
   * The feature id for the '<em><b>Parent Block</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__PARENT_BLOCK = EXPRESSION__PARENT_BLOCK;

  /**
   * The feature id for the '<em><b>Parent Lily Pond</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__PARENT_LILY_POND = EXPRESSION__PARENT_LILY_POND;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.LilyPond <em>Lily Pond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lily Pond</em>'.
   * @see org.elysium.lilyPond.LilyPond
   * @generated
   */
  EClass getLilyPond();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.LilyPond#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.elysium.lilyPond.LilyPond#getExpressions()
   * @see #getLilyPond()
   * @generated
   */
  EReference getLilyPond_Expressions();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.elysium.lilyPond.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the container reference '{@link org.elysium.lilyPond.Expression#getParentBlock <em>Parent Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent Block</em>'.
   * @see org.elysium.lilyPond.Expression#getParentBlock()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_ParentBlock();

  /**
   * Returns the meta object for the container reference '{@link org.elysium.lilyPond.Expression#getParentLilyPond <em>Parent Lily Pond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent Lily Pond</em>'.
   * @see org.elysium.lilyPond.Expression#getParentLilyPond()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_ParentLilyPond();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.elysium.lilyPond.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.Block#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.elysium.lilyPond.Block#getExpressions()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Expressions();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SimpleBlock <em>Simple Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Block</em>'.
   * @see org.elysium.lilyPond.SimpleBlock
   * @generated
   */
  EClass getSimpleBlock();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SimultaneousBlock <em>Simultaneous Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simultaneous Block</em>'.
   * @see org.elysium.lilyPond.SimultaneousBlock
   * @generated
   */
  EClass getSimultaneousBlock();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Scheme <em>Scheme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme</em>'.
   * @see org.elysium.lilyPond.Scheme
   * @generated
   */
  EClass getScheme();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.Scheme#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.elysium.lilyPond.Scheme#getValue()
   * @see #getScheme()
   * @generated
   */
  EReference getScheme_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SchemeExpression <em>Scheme Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme Expression</em>'.
   * @see org.elysium.lilyPond.SchemeExpression
   * @generated
   */
  EClass getSchemeExpression();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.SchemeExpression#isQuoted <em>Quoted</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quoted</em>'.
   * @see org.elysium.lilyPond.SchemeExpression#isQuoted()
   * @see #getSchemeExpression()
   * @generated
   */
  EAttribute getSchemeExpression_Quoted();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.SchemeExpression#isQuasiquoted <em>Quasiquoted</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quasiquoted</em>'.
   * @see org.elysium.lilyPond.SchemeExpression#isQuasiquoted()
   * @see #getSchemeExpression()
   * @generated
   */
  EAttribute getSchemeExpression_Quasiquoted();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.SchemeExpression#isUnquoted <em>Unquoted</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unquoted</em>'.
   * @see org.elysium.lilyPond.SchemeExpression#isUnquoted()
   * @see #getSchemeExpression()
   * @generated
   */
  EAttribute getSchemeExpression_Unquoted();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.SchemeExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.elysium.lilyPond.SchemeExpression#getValue()
   * @see #getSchemeExpression()
   * @generated
   */
  EReference getSchemeExpression_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SchemeValue <em>Scheme Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme Value</em>'.
   * @see org.elysium.lilyPond.SchemeValue
   * @generated
   */
  EClass getSchemeValue();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SchemeBoolean <em>Scheme Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme Boolean</em>'.
   * @see org.elysium.lilyPond.SchemeBoolean
   * @generated
   */
  EClass getSchemeBoolean();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.SchemeBoolean#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.elysium.lilyPond.SchemeBoolean#isValue()
   * @see #getSchemeBoolean()
   * @generated
   */
  EAttribute getSchemeBoolean_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SchemeList <em>Scheme List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme List</em>'.
   * @see org.elysium.lilyPond.SchemeList
   * @generated
   */
  EClass getSchemeList();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.SchemeList#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.elysium.lilyPond.SchemeList#getExpressions()
   * @see #getSchemeList()
   * @generated
   */
  EReference getSchemeList_Expressions();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SchemeBlock <em>Scheme Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme Block</em>'.
   * @see org.elysium.lilyPond.SchemeBlock
   * @generated
   */
  EClass getSchemeBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.SchemeBlock#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.elysium.lilyPond.SchemeBlock#getExpressions()
   * @see #getSchemeBlock()
   * @generated
   */
  EReference getSchemeBlock_Expressions();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SchemeMarkupCommand <em>Scheme Markup Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme Markup Command</em>'.
   * @see org.elysium.lilyPond.SchemeMarkupCommand
   * @generated
   */
  EClass getSchemeMarkupCommand();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.SchemeMarkupCommand#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Command</em>'.
   * @see org.elysium.lilyPond.SchemeMarkupCommand#getCommand()
   * @see #getSchemeMarkupCommand()
   * @generated
   */
  EAttribute getSchemeMarkupCommand_Command();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SchemeText <em>Scheme Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme Text</em>'.
   * @see org.elysium.lilyPond.SchemeText
   * @generated
   */
  EClass getSchemeText();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.SchemeText#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.elysium.lilyPond.SchemeText#getValue()
   * @see #getSchemeText()
   * @generated
   */
  EAttribute getSchemeText_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SchemeNumber <em>Scheme Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme Number</em>'.
   * @see org.elysium.lilyPond.SchemeNumber
   * @generated
   */
  EClass getSchemeNumber();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.SchemeNumber#isHexadecimal <em>Hexadecimal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hexadecimal</em>'.
   * @see org.elysium.lilyPond.SchemeNumber#isHexadecimal()
   * @see #getSchemeNumber()
   * @generated
   */
  EAttribute getSchemeNumber_Hexadecimal();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.SchemeNumber#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.elysium.lilyPond.SchemeNumber#getValue()
   * @see #getSchemeNumber()
   * @generated
   */
  EAttribute getSchemeNumber_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.elysium.lilyPond.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.ArbitraryCommand <em>Arbitrary Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arbitrary Command</em>'.
   * @see org.elysium.lilyPond.ArbitraryCommand
   * @generated
   */
  EClass getArbitraryCommand();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.ArbitraryCommand#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see org.elysium.lilyPond.ArbitraryCommand#getKeyword()
   * @see #getArbitraryCommand()
   * @generated
   */
  EAttribute getArbitraryCommand_Keyword();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SpecialCommand <em>Special Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Special Command</em>'.
   * @see org.elysium.lilyPond.SpecialCommand
   * @generated
   */
  EClass getSpecialCommand();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include</em>'.
   * @see org.elysium.lilyPond.Include
   * @generated
   */
  EClass getInclude();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.Include#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.elysium.lilyPond.Include#getImportURI()
   * @see #getInclude()
   * @generated
   */
  EAttribute getInclude_ImportURI();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version</em>'.
   * @see org.elysium.lilyPond.Version
   * @generated
   */
  EClass getVersion();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.Version#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.elysium.lilyPond.Version#getVersion()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Version();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text</em>'.
   * @see org.elysium.lilyPond.Text
   * @generated
   */
  EClass getText();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.Text#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.elysium.lilyPond.Text#getValue()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number</em>'.
   * @see org.elysium.lilyPond.Number
   * @generated
   */
  EClass getNumber();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.Number#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.elysium.lilyPond.Number#getValue()
   * @see #getNumber()
   * @generated
   */
  EAttribute getNumber_Value();

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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.LilyPondImpl <em>Lily Pond</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.LilyPondImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getLilyPond()
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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ExpressionImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Parent Block</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__PARENT_BLOCK = eINSTANCE.getExpression_ParentBlock();

    /**
     * The meta object literal for the '<em><b>Parent Lily Pond</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__PARENT_LILY_POND = eINSTANCE.getExpression_ParentLilyPond();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.BlockImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBlock()
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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SimpleBlockImpl <em>Simple Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SimpleBlockImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSimpleBlock()
     * @generated
     */
    EClass SIMPLE_BLOCK = eINSTANCE.getSimpleBlock();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SimultaneousBlockImpl <em>Simultaneous Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SimultaneousBlockImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSimultaneousBlock()
     * @generated
     */
    EClass SIMULTANEOUS_BLOCK = eINSTANCE.getSimultaneousBlock();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SchemeImpl <em>Scheme</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SchemeImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getScheme()
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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SchemeExpressionImpl <em>Scheme Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SchemeExpressionImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeExpression()
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
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEME_EXPRESSION__VALUE = eINSTANCE.getSchemeExpression_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SchemeValueImpl <em>Scheme Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SchemeValueImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeValue()
     * @generated
     */
    EClass SCHEME_VALUE = eINSTANCE.getSchemeValue();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SchemeBooleanImpl <em>Scheme Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SchemeBooleanImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeBoolean()
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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SchemeListImpl <em>Scheme List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SchemeListImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeList()
     * @generated
     */
    EClass SCHEME_LIST = eINSTANCE.getSchemeList();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEME_LIST__EXPRESSIONS = eINSTANCE.getSchemeList_Expressions();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SchemeBlockImpl <em>Scheme Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SchemeBlockImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeBlock()
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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SchemeMarkupCommandImpl <em>Scheme Markup Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SchemeMarkupCommandImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeMarkupCommand()
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

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SchemeTextImpl <em>Scheme Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SchemeTextImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeText()
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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SchemeNumberImpl <em>Scheme Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SchemeNumberImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeNumber()
     * @generated
     */
    EClass SCHEME_NUMBER = eINSTANCE.getSchemeNumber();

    /**
     * The meta object literal for the '<em><b>Hexadecimal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME_NUMBER__HEXADECIMAL = eINSTANCE.getSchemeNumber_Hexadecimal();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME_NUMBER__VALUE = eINSTANCE.getSchemeNumber_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.CommandImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ArbitraryCommandImpl <em>Arbitrary Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ArbitraryCommandImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getArbitraryCommand()
     * @generated
     */
    EClass ARBITRARY_COMMAND = eINSTANCE.getArbitraryCommand();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARBITRARY_COMMAND__KEYWORD = eINSTANCE.getArbitraryCommand_Keyword();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SpecialCommandImpl <em>Special Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SpecialCommandImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSpecialCommand()
     * @generated
     */
    EClass SPECIAL_COMMAND = eINSTANCE.getSpecialCommand();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.IncludeImpl <em>Include</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.IncludeImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getInclude()
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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.VersionImpl <em>Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.VersionImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getVersion()
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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.TextImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getText()
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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.NumberImpl <em>Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.NumberImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getNumber()
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

  }

} //LilyPondPackage
