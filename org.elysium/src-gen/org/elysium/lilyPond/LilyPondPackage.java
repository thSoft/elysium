/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ToplevelExpressionImpl <em>Toplevel Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ToplevelExpressionImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getToplevelExpression()
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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.AssignmentImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 2;

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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ValueImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getValue()
   * @generated
   */
  int VALUE = 3;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SchemeImpl <em>Scheme</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SchemeImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getScheme()
   * @generated
   */
  int SCHEME = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME__VALUE = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Scheme</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_FEATURE_COUNT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SchemeExpressionImpl <em>Scheme Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SchemeExpressionImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeExpression()
   * @generated
   */
  int SCHEME_EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Quoted</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_EXPRESSION__QUOTED = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_EXPRESSION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Scheme Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SchemeValueImpl <em>Scheme Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SchemeValueImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeValue()
   * @generated
   */
  int SCHEME_VALUE = 6;

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
  int SCHEME_BOOLEAN = 7;

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
  int SCHEME_LIST = 8;

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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SchemeTextImpl <em>Scheme Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SchemeTextImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSchemeText()
   * @generated
   */
  int SCHEME_TEXT = 9;

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
  int SCHEME_NUMBER = 10;

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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ContextDefinitionImpl <em>Context Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ContextDefinitionImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getContextDefinition()
   * @generated
   */
  int CONTEXT_DEFINITION = 11;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DEFINITION__ELEMENTS = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Context Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DEFINITION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ContextDefinitionElementImpl <em>Context Definition Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ContextDefinitionElementImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getContextDefinitionElement()
   * @generated
   */
  int CONTEXT_DEFINITION_ELEMENT = 12;

  /**
   * The number of structural features of the '<em>Context Definition Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DEFINITION_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.GrobDescriptionsImpl <em>Grob Descriptions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.GrobDescriptionsImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getGrobDescriptions()
   * @generated
   */
  int GROB_DESCRIPTIONS = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROB_DESCRIPTIONS__VALUE = CONTEXT_DEFINITION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Grob Descriptions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROB_DESCRIPTIONS_FEATURE_COUNT = CONTEXT_DEFINITION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.HeaderImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getHeader()
   * @generated
   */
  int HEADER = 14;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__ASSIGNMENTS = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FEATURE_COUNT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.OutputDefinitionElementImpl <em>Output Definition Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.OutputDefinitionElementImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getOutputDefinitionElement()
   * @generated
   */
  int OUTPUT_DEFINITION_ELEMENT = 17;

  /**
   * The number of structural features of the '<em>Output Definition Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DEFINITION_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.PropertyAssignmentImpl <em>Property Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.PropertyAssignmentImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getPropertyAssignment()
   * @generated
   */
  int PROPERTY_ASSIGNMENT = 15;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGNMENT__PROPERTY = OUTPUT_DEFINITION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGNMENT__VALUE = OUTPUT_DEFINITION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGNMENT_FEATURE_COUNT = OUTPUT_DEFINITION_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.OutputDefinitionImpl <em>Output Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.OutputDefinitionImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getOutputDefinition()
   * @generated
   */
  int OUTPUT_DEFINITION = 16;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DEFINITION__ELEMENTS = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Output Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_DEFINITION_FEATURE_COUNT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.PaperImpl <em>Paper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.PaperImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getPaper()
   * @generated
   */
  int PAPER = 18;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAPER__ELEMENTS = OUTPUT_DEFINITION__ELEMENTS;

  /**
   * The number of structural features of the '<em>Paper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAPER_FEATURE_COUNT = OUTPUT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.MidiImpl <em>Midi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.MidiImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMidi()
   * @generated
   */
  int MIDI = 19;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIDI__ELEMENTS = OUTPUT_DEFINITION__ELEMENTS;

  /**
   * The number of structural features of the '<em>Midi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIDI_FEATURE_COUNT = OUTPUT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.LayoutImpl <em>Layout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.LayoutImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getLayout()
   * @generated
   */
  int LAYOUT = 20;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT__ELEMENTS = OUTPUT_DEFINITION__ELEMENTS;

  /**
   * The number of structural features of the '<em>Layout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_FEATURE_COUNT = OUTPUT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ScoreImpl <em>Score</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ScoreImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getScore()
   * @generated
   */
  int SCORE = 21;

  /**
   * The feature id for the '<em><b>Music</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCORE__MUSIC = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Other</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCORE__OTHER = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Score</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCORE_FEATURE_COUNT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ScoreElementImpl <em>Score Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ScoreElementImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getScoreElement()
   * @generated
   */
  int SCORE_ELEMENT = 22;

  /**
   * The number of structural features of the '<em>Score Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCORE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.BookImpl <em>Book</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.BookImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBook()
   * @generated
   */
  int BOOK = 23;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__ELEMENTS = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Book</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_FEATURE_COUNT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.BookElementImpl <em>Book Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.BookElementImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBookElement()
   * @generated
   */
  int BOOK_ELEMENT = 24;

  /**
   * The number of structural features of the '<em>Book Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.BookPartImpl <em>Book Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.BookPartImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBookPart()
   * @generated
   */
  int BOOK_PART = 25;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_PART__ELEMENTS = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Book Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_PART_FEATURE_COUNT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.BookPartElementImpl <em>Book Part Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.BookPartElementImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBookPartElement()
   * @generated
   */
  int BOOK_PART_ELEMENT = 26;

  /**
   * The number of structural features of the '<em>Book Part Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_PART_ELEMENT_FEATURE_COUNT = BOOK_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.MarkupImpl <em>Markup</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.MarkupImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMarkup()
   * @generated
   */
  int MARKUP = 27;

  /**
   * The feature id for the '<em><b>Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP__SCRIPT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Markup</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_FEATURE_COUNT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.MarkupLinesImpl <em>Markup Lines</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.MarkupLinesImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMarkupLines()
   * @generated
   */
  int MARKUP_LINES = 28;

  /**
   * The number of structural features of the '<em>Markup Lines</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKUP_LINES_FEATURE_COUNT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.VersionImpl <em>Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.VersionImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getVersion()
   * @generated
   */
  int VERSION = 29;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__VERSION = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_FEATURE_COUNT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.IncludeImpl <em>Include</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.IncludeImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getInclude()
   * @generated
   */
  int INCLUDE = 30;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__IMPORT_URI = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Include</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_FEATURE_COUNT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SourceFileNameImpl <em>Source File Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SourceFileNameImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSourceFileName()
   * @generated
   */
  int SOURCE_FILE_NAME = 31;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FILE_NAME__FILENAME = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Source File Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FILE_NAME_FEATURE_COUNT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SourceFileLineImpl <em>Source File Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SourceFileLineImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSourceFileLine()
   * @generated
   */
  int SOURCE_FILE_LINE = 32;

  /**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FILE_LINE__LINE = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Source File Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FILE_LINE_FEATURE_COUNT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.MusicImpl <em>Music</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.MusicImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMusic()
   * @generated
   */
  int MUSIC = 33;

  /**
   * The number of structural features of the '<em>Music</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUSIC_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SimpleMusicImpl <em>Simple Music</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SimpleMusicImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSimpleMusic()
   * @generated
   */
  int SIMPLE_MUSIC = 34;

  /**
   * The number of structural features of the '<em>Simple Music</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_MUSIC_FEATURE_COUNT = MUSIC_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.EventImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 35;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = SIMPLE_MUSIC_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.NoteImpl <em>Note</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.NoteImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getNote()
   * @generated
   */
  int NOTE = 36;

  /**
   * The feature id for the '<em><b>Pitch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__PITCH = EVENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__DURATION = EVENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__REST = EVENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Post Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__POST_EVENTS = EVENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Note</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.PitchImpl <em>Pitch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.PitchImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getPitch()
   * @generated
   */
  int PITCH = 37;

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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.OctaveImpl <em>Octave</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.OctaveImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getOctave()
   * @generated
   */
  int OCTAVE = 38;

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
   * The meta object id for the '{@link org.elysium.lilyPond.impl.RestImpl <em>Rest</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.RestImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getRest()
   * @generated
   */
  int REST = 39;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST__TYPE = EVENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST__DURATION = EVENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Post Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST__POST_EVENTS = EVENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Rest</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REST_FEATURE_COUNT = EVENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ChordImpl <em>Chord</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ChordImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getChord()
   * @generated
   */
  int CHORD = 40;

  /**
   * The feature id for the '<em><b>Notes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD__NOTES = EVENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD__DURATION = EVENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Post Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD__POST_EVENTS = EVENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Chord</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHORD_FEATURE_COUNT = EVENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.PostEventImpl <em>Post Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.PostEventImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getPostEvent()
   * @generated
   */
  int POST_EVENT = 41;

  /**
   * The feature id for the '<em><b>Music Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_EVENT__MUSIC_FUNCTION = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_EVENT__DIRECTION = VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_EVENT__EVENT = VALUE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Post Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_EVENT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.EventWithRequiredDirectionImpl <em>Event With Required Direction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.EventWithRequiredDirectionImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getEventWithRequiredDirection()
   * @generated
   */
  int EVENT_WITH_REQUIRED_DIRECTION = 42;

  /**
   * The feature id for the '<em><b>Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_WITH_REQUIRED_DIRECTION__SCRIPT = 0;

  /**
   * The number of structural features of the '<em>Event With Required Direction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_WITH_REQUIRED_DIRECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.GenTextDefImpl <em>Gen Text Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.GenTextDefImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getGenTextDef()
   * @generated
   */
  int GEN_TEXT_DEF = 43;

  /**
   * The feature id for the '<em><b>Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_TEXT_DEF__SCRIPT = EVENT_WITH_REQUIRED_DIRECTION__SCRIPT;

  /**
   * The number of structural features of the '<em>Gen Text Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_TEXT_DEF_FEATURE_COUNT = EVENT_WITH_REQUIRED_DIRECTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.EventWithOptionalDirectionImpl <em>Event With Optional Direction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.EventWithOptionalDirectionImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getEventWithOptionalDirection()
   * @generated
   */
  int EVENT_WITH_OPTIONAL_DIRECTION = 44;

  /**
   * The feature id for the '<em><b>Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_WITH_OPTIONAL_DIRECTION__SCRIPT = 0;

  /**
   * The number of structural features of the '<em>Event With Optional Direction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_WITH_OPTIONAL_DIRECTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.TremoloImpl <em>Tremolo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.TremoloImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getTremolo()
   * @generated
   */
  int TREMOLO = 45;

  /**
   * The feature id for the '<em><b>Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREMOLO__SCRIPT = EVENT_WITH_OPTIONAL_DIRECTION__SCRIPT;

  /**
   * The feature id for the '<em><b>Division</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREMOLO__DIVISION = EVENT_WITH_OPTIONAL_DIRECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tremolo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TREMOLO_FEATURE_COUNT = EVENT_WITH_OPTIONAL_DIRECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.KeySignatureImpl <em>Key Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.KeySignatureImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getKeySignature()
   * @generated
   */
  int KEY_SIGNATURE = 46;

  /**
   * The feature id for the '<em><b>Tonic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_SIGNATURE__TONIC = EVENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_SIGNATURE__MODE = EVENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_SIGNATURE__DEFAULT = EVENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Key Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_SIGNATURE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.TimeSignatureImpl <em>Time Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.TimeSignatureImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getTimeSignature()
   * @generated
   */
  int TIME_SIGNATURE = 47;

  /**
   * The feature id for the '<em><b>Fraction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SIGNATURE__FRACTION = EVENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Time Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SIGNATURE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.TempoImpl <em>Tempo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.TempoImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getTempo()
   * @generated
   */
  int TEMPO = 48;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPO__LABEL = EVENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPO__VALUE = EVENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Tempo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPO_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.TempoLabelImpl <em>Tempo Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.TempoLabelImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getTempoLabel()
   * @generated
   */
  int TEMPO_LABEL = 49;

  /**
   * The number of structural features of the '<em>Tempo Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPO_LABEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.TempoValueImpl <em>Tempo Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.TempoValueImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getTempoValue()
   * @generated
   */
  int TEMPO_VALUE = 50;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPO_VALUE__DURATION = 0;

  /**
   * The feature id for the '<em><b>Bpm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPO_VALUE__BPM = 1;

  /**
   * The number of structural features of the '<em>Tempo Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPO_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.PartialImpl <em>Partial</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.PartialImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getPartial()
   * @generated
   */
  int PARTIAL = 51;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL__DURATION = EVENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Partial</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTIAL_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.MarkImpl <em>Mark</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.MarkImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMark()
   * @generated
   */
  int MARK = 52;

  /**
   * The feature id for the '<em><b>Mark</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARK__MARK = EVENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mark</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARK_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SkipImpl <em>Skip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SkipImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSkip()
   * @generated
   */
  int SKIP = 53;

  /**
   * The feature id for the '<em><b>Duration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP__DURATION = EVENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Skip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.TieImpl <em>Tie</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.TieImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getTie()
   * @generated
   */
  int TIE = 54;

  /**
   * The number of structural features of the '<em>Tie</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.BeamStartImpl <em>Beam Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.BeamStartImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBeamStart()
   * @generated
   */
  int BEAM_START = 55;

  /**
   * The number of structural features of the '<em>Beam Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAM_START_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.BeamEndImpl <em>Beam End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.BeamEndImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBeamEnd()
   * @generated
   */
  int BEAM_END = 56;

  /**
   * The number of structural features of the '<em>Beam End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAM_END_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.BarCheckImpl <em>Bar Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.BarCheckImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBarCheck()
   * @generated
   */
  int BAR_CHECK = 57;

  /**
   * The number of structural features of the '<em>Bar Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAR_CHECK_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ReferenceImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 58;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__ASSIGNMENT = EVENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.CompositeMusicImpl <em>Composite Music</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.CompositeMusicImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getCompositeMusic()
   * @generated
   */
  int COMPOSITE_MUSIC = 59;

  /**
   * The number of structural features of the '<em>Composite Music</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_MUSIC_FEATURE_COUNT = TOPLEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SequentialMusicImpl <em>Sequential Music</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SequentialMusicImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSequentialMusic()
   * @generated
   */
  int SEQUENTIAL_MUSIC = 60;

  /**
   * The feature id for the '<em><b>Music</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENTIAL_MUSIC__MUSIC = COMPOSITE_MUSIC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sequential Music</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENTIAL_MUSIC_FEATURE_COUNT = COMPOSITE_MUSIC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SimultaneousMusicImpl <em>Simultaneous Music</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SimultaneousMusicImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSimultaneousMusic()
   * @generated
   */
  int SIMULTANEOUS_MUSIC = 61;

  /**
   * The feature id for the '<em><b>Music</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULTANEOUS_MUSIC__MUSIC = COMPOSITE_MUSIC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simultaneous Music</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMULTANEOUS_MUSIC_FEATURE_COUNT = COMPOSITE_MUSIC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.NewContextImpl <em>New Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.NewContextImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getNewContext()
   * @generated
   */
  int NEW_CONTEXT = 62;

  /**
   * The feature id for the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONTEXT__CONTEXT = COMPOSITE_MUSIC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONTEXT__ID = COMPOSITE_MUSIC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Modification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONTEXT__MODIFICATION = COMPOSITE_MUSIC_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Music</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONTEXT__MUSIC = COMPOSITE_MUSIC_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>New Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONTEXT_FEATURE_COUNT = COMPOSITE_MUSIC_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ContextModificationImpl <em>Context Modification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ContextModificationImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getContextModification()
   * @generated
   */
  int CONTEXT_MODIFICATION = 63;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_MODIFICATION__MODIFIERS = 0;

  /**
   * The number of structural features of the '<em>Context Modification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_MODIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ContextModifierImpl <em>Context Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ContextModifierImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getContextModifier()
   * @generated
   */
  int CONTEXT_MODIFIER = 64;

  /**
   * The number of structural features of the '<em>Context Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_MODIFIER_FEATURE_COUNT = CONTEXT_DEFINITION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.PropertyOperationImpl <em>Property Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.PropertyOperationImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getPropertyOperation()
   * @generated
   */
  int PROPERTY_OPERATION = 65;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_OPERATION__PROPERTY = CONTEXT_MODIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_OPERATION_FEATURE_COUNT = CONTEXT_MODIFIER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SetPropertyImpl <em>Set Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SetPropertyImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSetProperty()
   * @generated
   */
  int SET_PROPERTY = 66;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_PROPERTY__PROPERTY = PROPERTY_OPERATION__PROPERTY;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_PROPERTY__VALUE = PROPERTY_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Set Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_PROPERTY_FEATURE_COUNT = PROPERTY_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ScalarImpl <em>Scalar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ScalarImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getScalar()
   * @generated
   */
  int SCALAR = 67;

  /**
   * The number of structural features of the '<em>Scalar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.UnsetPropertyImpl <em>Unset Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.UnsetPropertyImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getUnsetProperty()
   * @generated
   */
  int UNSET_PROPERTY = 68;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSET_PROPERTY__PROPERTY = PROPERTY_OPERATION__PROPERTY;

  /**
   * The number of structural features of the '<em>Unset Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSET_PROPERTY_FEATURE_COUNT = PROPERTY_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.OverridePropertyImpl <em>Override Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.OverridePropertyImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getOverrideProperty()
   * @generated
   */
  int OVERRIDE_PROPERTY = 69;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDE_PROPERTY__PROPERTY = PROPERTY_OPERATION__PROPERTY;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDE_PROPERTY__PATH = PROPERTY_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDE_PROPERTY__VALUE = PROPERTY_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Override Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDE_PROPERTY_FEATURE_COUNT = PROPERTY_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.RevertPropertyImpl <em>Revert Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.RevertPropertyImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getRevertProperty()
   * @generated
   */
  int REVERT_PROPERTY = 70;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERT_PROPERTY__PROPERTY = PROPERTY_OPERATION__PROPERTY;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERT_PROPERTY__PATH = PROPERTY_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Revert Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERT_PROPERTY_FEATURE_COUNT = PROPERTY_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ContextDefaultModifierImpl <em>Context Default Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ContextDefaultModifierImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getContextDefaultModifier()
   * @generated
   */
  int CONTEXT_DEFAULT_MODIFIER = 71;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DEFAULT_MODIFIER__TYPE = CONTEXT_MODIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DEFAULT_MODIFIER__VALUE = CONTEXT_MODIFIER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Context Default Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DEFAULT_MODIFIER_FEATURE_COUNT = CONTEXT_MODIFIER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ContextDefaultModifierTypeImpl <em>Context Default Modifier Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ContextDefaultModifierTypeImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getContextDefaultModifierType()
   * @generated
   */
  int CONTEXT_DEFAULT_MODIFIER_TYPE = 72;

  /**
   * The number of structural features of the '<em>Context Default Modifier Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_DEFAULT_MODIFIER_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.RelativeMusicImpl <em>Relative Music</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.RelativeMusicImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getRelativeMusic()
   * @generated
   */
  int RELATIVE_MUSIC = 73;

  /**
   * The feature id for the '<em><b>Pitch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_MUSIC__PITCH = COMPOSITE_MUSIC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Music</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_MUSIC__MUSIC = COMPOSITE_MUSIC_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Relative Music</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_MUSIC_FEATURE_COUNT = COMPOSITE_MUSIC_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.RepeatedMusicImpl <em>Repeated Music</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.RepeatedMusicImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getRepeatedMusic()
   * @generated
   */
  int REPEATED_MUSIC = 74;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEATED_MUSIC__TYPE = COMPOSITE_MUSIC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEATED_MUSIC__NUMBER = COMPOSITE_MUSIC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Music</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEATED_MUSIC__MUSIC = COMPOSITE_MUSIC_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Alternative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEATED_MUSIC__ALTERNATIVE = COMPOSITE_MUSIC_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Repeated Music</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEATED_MUSIC_FEATURE_COUNT = COMPOSITE_MUSIC_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.AlternativeMusicImpl <em>Alternative Music</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.AlternativeMusicImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getAlternativeMusic()
   * @generated
   */
  int ALTERNATIVE_MUSIC = 75;

  /**
   * The feature id for the '<em><b>Music</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_MUSIC__MUSIC = 0;

  /**
   * The number of structural features of the '<em>Alternative Music</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_MUSIC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.MusicOrSchemeImpl <em>Music Or Scheme</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.MusicOrSchemeImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMusicOrScheme()
   * @generated
   */
  int MUSIC_OR_SCHEME = 76;

  /**
   * The number of structural features of the '<em>Music Or Scheme</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUSIC_OR_SCHEME_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.DurationImpl <em>Duration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.DurationImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getDuration()
   * @generated
   */
  int DURATION = 77;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION__BASE = 0;

  /**
   * The feature id for the '<em><b>Dots</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION__DOTS = 1;

  /**
   * The feature id for the '<em><b>Multipliers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION__MULTIPLIERS = 2;

  /**
   * The number of structural features of the '<em>Duration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.DurationMultiplierImpl <em>Duration Multiplier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.DurationMultiplierImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getDurationMultiplier()
   * @generated
   */
  int DURATION_MULTIPLIER = 78;

  /**
   * The number of structural features of the '<em>Duration Multiplier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DURATION_MULTIPLIER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.FractionImpl <em>Fraction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.FractionImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getFraction()
   * @generated
   */
  int FRACTION = 79;

  /**
   * The feature id for the '<em><b>Numerator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRACTION__NUMERATOR = 0;

  /**
   * The feature id for the '<em><b>Denominator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRACTION__DENOMINATOR = 1;

  /**
   * The number of structural features of the '<em>Fraction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.FractionOrNumberImpl <em>Fraction Or Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.FractionOrNumberImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getFractionOrNumber()
   * @generated
   */
  int FRACTION_OR_NUMBER = 80;

  /**
   * The feature id for the '<em><b>Numerator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRACTION_OR_NUMBER__NUMERATOR = DURATION_MULTIPLIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Denominator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRACTION_OR_NUMBER__DENOMINATOR = DURATION_MULTIPLIER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fraction Or Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRACTION_OR_NUMBER_FEATURE_COUNT = DURATION_MULTIPLIER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.ContextChangeImpl <em>Context Change</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.ContextChangeImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getContextChange()
   * @generated
   */
  int CONTEXT_CHANGE = 81;

  /**
   * The feature id for the '<em><b>Context</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_CHANGE__CONTEXT = SIMPLE_MUSIC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_CHANGE__ID = SIMPLE_MUSIC_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Context Change</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_CHANGE_FEATURE_COUNT = SIMPLE_MUSIC_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.MusicPropertyDefinitionImpl <em>Music Property Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.MusicPropertyDefinitionImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMusicPropertyDefinition()
   * @generated
   */
  int MUSIC_PROPERTY_DEFINITION = 82;

  /**
   * The feature id for the '<em><b>Once</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUSIC_PROPERTY_DEFINITION__ONCE = SIMPLE_MUSIC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUSIC_PROPERTY_DEFINITION__OPERATION = SIMPLE_MUSIC_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Music Property Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUSIC_PROPERTY_DEFINITION_FEATURE_COUNT = SIMPLE_MUSIC_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.MusicPropertyOperationImpl <em>Music Property Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.MusicPropertyOperationImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMusicPropertyOperation()
   * @generated
   */
  int MUSIC_PROPERTY_OPERATION = 83;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUSIC_PROPERTY_OPERATION__OBJECT = 0;

  /**
   * The number of structural features of the '<em>Music Property Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUSIC_PROPERTY_OPERATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.OverrideMusicPropertyImpl <em>Override Music Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.OverrideMusicPropertyImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getOverrideMusicProperty()
   * @generated
   */
  int OVERRIDE_MUSIC_PROPERTY = 84;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDE_MUSIC_PROPERTY__OBJECT = MUSIC_PROPERTY_OPERATION__OBJECT;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDE_MUSIC_PROPERTY__PATH = MUSIC_PROPERTY_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDE_MUSIC_PROPERTY__VALUE = MUSIC_PROPERTY_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Override Music Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OVERRIDE_MUSIC_PROPERTY_FEATURE_COUNT = MUSIC_PROPERTY_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.RevertMusicPropertyImpl <em>Revert Music Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.RevertMusicPropertyImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getRevertMusicProperty()
   * @generated
   */
  int REVERT_MUSIC_PROPERTY = 85;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERT_MUSIC_PROPERTY__OBJECT = MUSIC_PROPERTY_OPERATION__OBJECT;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERT_MUSIC_PROPERTY__PATH = MUSIC_PROPERTY_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Revert Music Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVERT_MUSIC_PROPERTY_FEATURE_COUNT = MUSIC_PROPERTY_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.SetMusicPropertyImpl <em>Set Music Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.SetMusicPropertyImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSetMusicProperty()
   * @generated
   */
  int SET_MUSIC_PROPERTY = 86;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_MUSIC_PROPERTY__OBJECT = MUSIC_PROPERTY_OPERATION__OBJECT;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_MUSIC_PROPERTY__VALUE = MUSIC_PROPERTY_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Set Music Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_MUSIC_PROPERTY_FEATURE_COUNT = MUSIC_PROPERTY_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.impl.UnsetMusicPropertyImpl <em>Unset Music Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.impl.UnsetMusicPropertyImpl
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getUnsetMusicProperty()
   * @generated
   */
  int UNSET_MUSIC_PROPERTY = 87;

  /**
   * The feature id for the '<em><b>Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSET_MUSIC_PROPERTY__OBJECT = MUSIC_PROPERTY_OPERATION__OBJECT;

  /**
   * The number of structural features of the '<em>Unset Music Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSET_MUSIC_PROPERTY_FEATURE_COUNT = MUSIC_PROPERTY_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.Direction <em>Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.Direction
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getDirection()
   * @generated
   */
  int DIRECTION = 88;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.ScriptWithRequiredDirection <em>Script With Required Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.ScriptWithRequiredDirection
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getScriptWithRequiredDirection()
   * @generated
   */
  int SCRIPT_WITH_REQUIRED_DIRECTION = 89;

  /**
   * The meta object id for the '{@link org.elysium.lilyPond.ScriptWithOptionalDirection <em>Script With Optional Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.elysium.lilyPond.ScriptWithOptionalDirection
   * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getScriptWithOptionalDirection()
   * @generated
   */
  int SCRIPT_WITH_OPTIONAL_DIRECTION = 90;


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
   * Returns the meta object for class '{@link org.elysium.lilyPond.ToplevelExpression <em>Toplevel Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Toplevel Expression</em>'.
   * @see org.elysium.lilyPond.ToplevelExpression
   * @generated
   */
  EClass getToplevelExpression();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see org.elysium.lilyPond.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.Assignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.elysium.lilyPond.Assignment#getName()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.Assignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.elysium.lilyPond.Assignment#getValue()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.elysium.lilyPond.Value
   * @generated
   */
  EClass getValue();

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
   * Returns the meta object for class '{@link org.elysium.lilyPond.ContextDefinition <em>Context Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Definition</em>'.
   * @see org.elysium.lilyPond.ContextDefinition
   * @generated
   */
  EClass getContextDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.ContextDefinition#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.elysium.lilyPond.ContextDefinition#getElements()
   * @see #getContextDefinition()
   * @generated
   */
  EReference getContextDefinition_Elements();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.ContextDefinitionElement <em>Context Definition Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Definition Element</em>'.
   * @see org.elysium.lilyPond.ContextDefinitionElement
   * @generated
   */
  EClass getContextDefinitionElement();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.GrobDescriptions <em>Grob Descriptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grob Descriptions</em>'.
   * @see org.elysium.lilyPond.GrobDescriptions
   * @generated
   */
  EClass getGrobDescriptions();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.GrobDescriptions#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.elysium.lilyPond.GrobDescriptions#getValue()
   * @see #getGrobDescriptions()
   * @generated
   */
  EReference getGrobDescriptions_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see org.elysium.lilyPond.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.Header#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignments</em>'.
   * @see org.elysium.lilyPond.Header#getAssignments()
   * @see #getHeader()
   * @generated
   */
  EReference getHeader_Assignments();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.PropertyAssignment <em>Property Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Assignment</em>'.
   * @see org.elysium.lilyPond.PropertyAssignment
   * @generated
   */
  EClass getPropertyAssignment();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.PropertyAssignment#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see org.elysium.lilyPond.PropertyAssignment#getProperty()
   * @see #getPropertyAssignment()
   * @generated
   */
  EAttribute getPropertyAssignment_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.PropertyAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.elysium.lilyPond.PropertyAssignment#getValue()
   * @see #getPropertyAssignment()
   * @generated
   */
  EReference getPropertyAssignment_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.OutputDefinition <em>Output Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Definition</em>'.
   * @see org.elysium.lilyPond.OutputDefinition
   * @generated
   */
  EClass getOutputDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.OutputDefinition#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.elysium.lilyPond.OutputDefinition#getElements()
   * @see #getOutputDefinition()
   * @generated
   */
  EReference getOutputDefinition_Elements();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.OutputDefinitionElement <em>Output Definition Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Definition Element</em>'.
   * @see org.elysium.lilyPond.OutputDefinitionElement
   * @generated
   */
  EClass getOutputDefinitionElement();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Paper <em>Paper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paper</em>'.
   * @see org.elysium.lilyPond.Paper
   * @generated
   */
  EClass getPaper();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Midi <em>Midi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Midi</em>'.
   * @see org.elysium.lilyPond.Midi
   * @generated
   */
  EClass getMidi();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout</em>'.
   * @see org.elysium.lilyPond.Layout
   * @generated
   */
  EClass getLayout();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Score <em>Score</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Score</em>'.
   * @see org.elysium.lilyPond.Score
   * @generated
   */
  EClass getScore();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.Score#getMusic <em>Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Music</em>'.
   * @see org.elysium.lilyPond.Score#getMusic()
   * @see #getScore()
   * @generated
   */
  EReference getScore_Music();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.Score#getOther <em>Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Other</em>'.
   * @see org.elysium.lilyPond.Score#getOther()
   * @see #getScore()
   * @generated
   */
  EReference getScore_Other();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.ScoreElement <em>Score Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Score Element</em>'.
   * @see org.elysium.lilyPond.ScoreElement
   * @generated
   */
  EClass getScoreElement();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Book <em>Book</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Book</em>'.
   * @see org.elysium.lilyPond.Book
   * @generated
   */
  EClass getBook();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.Book#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.elysium.lilyPond.Book#getElements()
   * @see #getBook()
   * @generated
   */
  EReference getBook_Elements();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.BookElement <em>Book Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Book Element</em>'.
   * @see org.elysium.lilyPond.BookElement
   * @generated
   */
  EClass getBookElement();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.BookPart <em>Book Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Book Part</em>'.
   * @see org.elysium.lilyPond.BookPart
   * @generated
   */
  EClass getBookPart();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.BookPart#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.elysium.lilyPond.BookPart#getElements()
   * @see #getBookPart()
   * @generated
   */
  EReference getBookPart_Elements();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.BookPartElement <em>Book Part Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Book Part Element</em>'.
   * @see org.elysium.lilyPond.BookPartElement
   * @generated
   */
  EClass getBookPartElement();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Markup <em>Markup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Markup</em>'.
   * @see org.elysium.lilyPond.Markup
   * @generated
   */
  EClass getMarkup();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.MarkupLines <em>Markup Lines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Markup Lines</em>'.
   * @see org.elysium.lilyPond.MarkupLines
   * @generated
   */
  EClass getMarkupLines();

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
   * Returns the meta object for class '{@link org.elysium.lilyPond.SourceFileName <em>Source File Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source File Name</em>'.
   * @see org.elysium.lilyPond.SourceFileName
   * @generated
   */
  EClass getSourceFileName();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.SourceFileName#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see org.elysium.lilyPond.SourceFileName#getFilename()
   * @see #getSourceFileName()
   * @generated
   */
  EAttribute getSourceFileName_Filename();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SourceFileLine <em>Source File Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source File Line</em>'.
   * @see org.elysium.lilyPond.SourceFileLine
   * @generated
   */
  EClass getSourceFileLine();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.SourceFileLine#getLine <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line</em>'.
   * @see org.elysium.lilyPond.SourceFileLine#getLine()
   * @see #getSourceFileLine()
   * @generated
   */
  EAttribute getSourceFileLine_Line();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Music <em>Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Music</em>'.
   * @see org.elysium.lilyPond.Music
   * @generated
   */
  EClass getMusic();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SimpleMusic <em>Simple Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Music</em>'.
   * @see org.elysium.lilyPond.SimpleMusic
   * @generated
   */
  EClass getSimpleMusic();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.elysium.lilyPond.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Note</em>'.
   * @see org.elysium.lilyPond.Note
   * @generated
   */
  EClass getNote();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.Note#getPitch <em>Pitch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pitch</em>'.
   * @see org.elysium.lilyPond.Note#getPitch()
   * @see #getNote()
   * @generated
   */
  EReference getNote_Pitch();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.Note#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see org.elysium.lilyPond.Note#getDuration()
   * @see #getNote()
   * @generated
   */
  EReference getNote_Duration();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.Note#isRest <em>Rest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rest</em>'.
   * @see org.elysium.lilyPond.Note#isRest()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Rest();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.Note#getPostEvents <em>Post Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Post Events</em>'.
   * @see org.elysium.lilyPond.Note#getPostEvents()
   * @see #getNote()
   * @generated
   */
  EReference getNote_PostEvents();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Pitch <em>Pitch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pitch</em>'.
   * @see org.elysium.lilyPond.Pitch
   * @generated
   */
  EClass getPitch();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.Pitch#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see org.elysium.lilyPond.Pitch#getBase()
   * @see #getPitch()
   * @generated
   */
  EAttribute getPitch_Base();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.Pitch#isOctaveCheck <em>Octave Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Octave Check</em>'.
   * @see org.elysium.lilyPond.Pitch#isOctaveCheck()
   * @see #getPitch()
   * @generated
   */
  EAttribute getPitch_OctaveCheck();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.Pitch#getOctaveShift <em>Octave Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Octave Shift</em>'.
   * @see org.elysium.lilyPond.Pitch#getOctaveShift()
   * @see #getPitch()
   * @generated
   */
  EReference getPitch_OctaveShift();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.Pitch#isReminderAccidental <em>Reminder Accidental</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reminder Accidental</em>'.
   * @see org.elysium.lilyPond.Pitch#isReminderAccidental()
   * @see #getPitch()
   * @generated
   */
  EAttribute getPitch_ReminderAccidental();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.Pitch#isCautionaryAccidental <em>Cautionary Accidental</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cautionary Accidental</em>'.
   * @see org.elysium.lilyPond.Pitch#isCautionaryAccidental()
   * @see #getPitch()
   * @generated
   */
  EAttribute getPitch_CautionaryAccidental();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Octave <em>Octave</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Octave</em>'.
   * @see org.elysium.lilyPond.Octave
   * @generated
   */
  EClass getOctave();

  /**
   * Returns the meta object for the attribute list '{@link org.elysium.lilyPond.Octave#getUp <em>Up</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Up</em>'.
   * @see org.elysium.lilyPond.Octave#getUp()
   * @see #getOctave()
   * @generated
   */
  EAttribute getOctave_Up();

  /**
   * Returns the meta object for the attribute list '{@link org.elysium.lilyPond.Octave#getDown <em>Down</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Down</em>'.
   * @see org.elysium.lilyPond.Octave#getDown()
   * @see #getOctave()
   * @generated
   */
  EAttribute getOctave_Down();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Rest <em>Rest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rest</em>'.
   * @see org.elysium.lilyPond.Rest
   * @generated
   */
  EClass getRest();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.Rest#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.elysium.lilyPond.Rest#getType()
   * @see #getRest()
   * @generated
   */
  EAttribute getRest_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.Rest#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see org.elysium.lilyPond.Rest#getDuration()
   * @see #getRest()
   * @generated
   */
  EReference getRest_Duration();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.Rest#getPostEvents <em>Post Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Post Events</em>'.
   * @see org.elysium.lilyPond.Rest#getPostEvents()
   * @see #getRest()
   * @generated
   */
  EReference getRest_PostEvents();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Chord <em>Chord</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chord</em>'.
   * @see org.elysium.lilyPond.Chord
   * @generated
   */
  EClass getChord();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.Chord#getNotes <em>Notes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Notes</em>'.
   * @see org.elysium.lilyPond.Chord#getNotes()
   * @see #getChord()
   * @generated
   */
  EReference getChord_Notes();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.Chord#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see org.elysium.lilyPond.Chord#getDuration()
   * @see #getChord()
   * @generated
   */
  EReference getChord_Duration();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.Chord#getPostEvents <em>Post Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Post Events</em>'.
   * @see org.elysium.lilyPond.Chord#getPostEvents()
   * @see #getChord()
   * @generated
   */
  EReference getChord_PostEvents();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.PostEvent <em>Post Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Post Event</em>'.
   * @see org.elysium.lilyPond.PostEvent
   * @generated
   */
  EClass getPostEvent();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.PostEvent#getMusicFunction <em>Music Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Music Function</em>'.
   * @see org.elysium.lilyPond.PostEvent#getMusicFunction()
   * @see #getPostEvent()
   * @generated
   */
  EReference getPostEvent_MusicFunction();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.PostEvent#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.elysium.lilyPond.PostEvent#getDirection()
   * @see #getPostEvent()
   * @generated
   */
  EAttribute getPostEvent_Direction();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.PostEvent#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see org.elysium.lilyPond.PostEvent#getEvent()
   * @see #getPostEvent()
   * @generated
   */
  EReference getPostEvent_Event();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.EventWithRequiredDirection <em>Event With Required Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event With Required Direction</em>'.
   * @see org.elysium.lilyPond.EventWithRequiredDirection
   * @generated
   */
  EClass getEventWithRequiredDirection();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.EventWithRequiredDirection#getScript <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Script</em>'.
   * @see org.elysium.lilyPond.EventWithRequiredDirection#getScript()
   * @see #getEventWithRequiredDirection()
   * @generated
   */
  EAttribute getEventWithRequiredDirection_Script();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.GenTextDef <em>Gen Text Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gen Text Def</em>'.
   * @see org.elysium.lilyPond.GenTextDef
   * @generated
   */
  EClass getGenTextDef();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.EventWithOptionalDirection <em>Event With Optional Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event With Optional Direction</em>'.
   * @see org.elysium.lilyPond.EventWithOptionalDirection
   * @generated
   */
  EClass getEventWithOptionalDirection();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.EventWithOptionalDirection#getScript <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Script</em>'.
   * @see org.elysium.lilyPond.EventWithOptionalDirection#getScript()
   * @see #getEventWithOptionalDirection()
   * @generated
   */
  EAttribute getEventWithOptionalDirection_Script();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Tremolo <em>Tremolo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tremolo</em>'.
   * @see org.elysium.lilyPond.Tremolo
   * @generated
   */
  EClass getTremolo();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.Tremolo#getDivision <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Division</em>'.
   * @see org.elysium.lilyPond.Tremolo#getDivision()
   * @see #getTremolo()
   * @generated
   */
  EAttribute getTremolo_Division();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.KeySignature <em>Key Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Signature</em>'.
   * @see org.elysium.lilyPond.KeySignature
   * @generated
   */
  EClass getKeySignature();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.KeySignature#getTonic <em>Tonic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tonic</em>'.
   * @see org.elysium.lilyPond.KeySignature#getTonic()
   * @see #getKeySignature()
   * @generated
   */
  EAttribute getKeySignature_Tonic();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.KeySignature#getMode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mode</em>'.
   * @see org.elysium.lilyPond.KeySignature#getMode()
   * @see #getKeySignature()
   * @generated
   */
  EReference getKeySignature_Mode();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.KeySignature#isDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see org.elysium.lilyPond.KeySignature#isDefault()
   * @see #getKeySignature()
   * @generated
   */
  EAttribute getKeySignature_Default();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.TimeSignature <em>Time Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Signature</em>'.
   * @see org.elysium.lilyPond.TimeSignature
   * @generated
   */
  EClass getTimeSignature();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.TimeSignature#getFraction <em>Fraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fraction</em>'.
   * @see org.elysium.lilyPond.TimeSignature#getFraction()
   * @see #getTimeSignature()
   * @generated
   */
  EReference getTimeSignature_Fraction();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Tempo <em>Tempo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tempo</em>'.
   * @see org.elysium.lilyPond.Tempo
   * @generated
   */
  EClass getTempo();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.Tempo#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see org.elysium.lilyPond.Tempo#getLabel()
   * @see #getTempo()
   * @generated
   */
  EReference getTempo_Label();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.Tempo#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.elysium.lilyPond.Tempo#getValue()
   * @see #getTempo()
   * @generated
   */
  EReference getTempo_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.TempoLabel <em>Tempo Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tempo Label</em>'.
   * @see org.elysium.lilyPond.TempoLabel
   * @generated
   */
  EClass getTempoLabel();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.TempoValue <em>Tempo Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tempo Value</em>'.
   * @see org.elysium.lilyPond.TempoValue
   * @generated
   */
  EClass getTempoValue();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.TempoValue#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see org.elysium.lilyPond.TempoValue#getDuration()
   * @see #getTempoValue()
   * @generated
   */
  EReference getTempoValue_Duration();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.TempoValue#getBpm <em>Bpm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bpm</em>'.
   * @see org.elysium.lilyPond.TempoValue#getBpm()
   * @see #getTempoValue()
   * @generated
   */
  EAttribute getTempoValue_Bpm();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Partial <em>Partial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Partial</em>'.
   * @see org.elysium.lilyPond.Partial
   * @generated
   */
  EClass getPartial();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.Partial#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see org.elysium.lilyPond.Partial#getDuration()
   * @see #getPartial()
   * @generated
   */
  EReference getPartial_Duration();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Mark <em>Mark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mark</em>'.
   * @see org.elysium.lilyPond.Mark
   * @generated
   */
  EClass getMark();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.Mark#getMark <em>Mark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mark</em>'.
   * @see org.elysium.lilyPond.Mark#getMark()
   * @see #getMark()
   * @generated
   */
  EReference getMark_Mark();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Skip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Skip</em>'.
   * @see org.elysium.lilyPond.Skip
   * @generated
   */
  EClass getSkip();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.Skip#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duration</em>'.
   * @see org.elysium.lilyPond.Skip#getDuration()
   * @see #getSkip()
   * @generated
   */
  EReference getSkip_Duration();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Tie <em>Tie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tie</em>'.
   * @see org.elysium.lilyPond.Tie
   * @generated
   */
  EClass getTie();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.BeamStart <em>Beam Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Beam Start</em>'.
   * @see org.elysium.lilyPond.BeamStart
   * @generated
   */
  EClass getBeamStart();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.BeamEnd <em>Beam End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Beam End</em>'.
   * @see org.elysium.lilyPond.BeamEnd
   * @generated
   */
  EClass getBeamEnd();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.BarCheck <em>Bar Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bar Check</em>'.
   * @see org.elysium.lilyPond.BarCheck
   * @generated
   */
  EClass getBarCheck();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.elysium.lilyPond.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the reference '{@link org.elysium.lilyPond.Reference#getAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Assignment</em>'.
   * @see org.elysium.lilyPond.Reference#getAssignment()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Assignment();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.CompositeMusic <em>Composite Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Music</em>'.
   * @see org.elysium.lilyPond.CompositeMusic
   * @generated
   */
  EClass getCompositeMusic();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SequentialMusic <em>Sequential Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequential Music</em>'.
   * @see org.elysium.lilyPond.SequentialMusic
   * @generated
   */
  EClass getSequentialMusic();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.SequentialMusic#getMusic <em>Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Music</em>'.
   * @see org.elysium.lilyPond.SequentialMusic#getMusic()
   * @see #getSequentialMusic()
   * @generated
   */
  EReference getSequentialMusic_Music();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SimultaneousMusic <em>Simultaneous Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simultaneous Music</em>'.
   * @see org.elysium.lilyPond.SimultaneousMusic
   * @generated
   */
  EClass getSimultaneousMusic();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.SimultaneousMusic#getMusic <em>Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Music</em>'.
   * @see org.elysium.lilyPond.SimultaneousMusic#getMusic()
   * @see #getSimultaneousMusic()
   * @generated
   */
  EReference getSimultaneousMusic_Music();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.NewContext <em>New Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Context</em>'.
   * @see org.elysium.lilyPond.NewContext
   * @generated
   */
  EClass getNewContext();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.NewContext#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Context</em>'.
   * @see org.elysium.lilyPond.NewContext#getContext()
   * @see #getNewContext()
   * @generated
   */
  EAttribute getNewContext_Context();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.NewContext#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.elysium.lilyPond.NewContext#getId()
   * @see #getNewContext()
   * @generated
   */
  EAttribute getNewContext_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.NewContext#getModification <em>Modification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Modification</em>'.
   * @see org.elysium.lilyPond.NewContext#getModification()
   * @see #getNewContext()
   * @generated
   */
  EReference getNewContext_Modification();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.NewContext#getMusic <em>Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Music</em>'.
   * @see org.elysium.lilyPond.NewContext#getMusic()
   * @see #getNewContext()
   * @generated
   */
  EReference getNewContext_Music();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.ContextModification <em>Context Modification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Modification</em>'.
   * @see org.elysium.lilyPond.ContextModification
   * @generated
   */
  EClass getContextModification();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.ContextModification#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers</em>'.
   * @see org.elysium.lilyPond.ContextModification#getModifiers()
   * @see #getContextModification()
   * @generated
   */
  EReference getContextModification_Modifiers();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.ContextModifier <em>Context Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Modifier</em>'.
   * @see org.elysium.lilyPond.ContextModifier
   * @generated
   */
  EClass getContextModifier();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.PropertyOperation <em>Property Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Operation</em>'.
   * @see org.elysium.lilyPond.PropertyOperation
   * @generated
   */
  EClass getPropertyOperation();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.PropertyOperation#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see org.elysium.lilyPond.PropertyOperation#getProperty()
   * @see #getPropertyOperation()
   * @generated
   */
  EAttribute getPropertyOperation_Property();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SetProperty <em>Set Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Property</em>'.
   * @see org.elysium.lilyPond.SetProperty
   * @generated
   */
  EClass getSetProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.SetProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.elysium.lilyPond.SetProperty#getValue()
   * @see #getSetProperty()
   * @generated
   */
  EReference getSetProperty_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Scalar <em>Scalar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scalar</em>'.
   * @see org.elysium.lilyPond.Scalar
   * @generated
   */
  EClass getScalar();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.UnsetProperty <em>Unset Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unset Property</em>'.
   * @see org.elysium.lilyPond.UnsetProperty
   * @generated
   */
  EClass getUnsetProperty();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.OverrideProperty <em>Override Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Override Property</em>'.
   * @see org.elysium.lilyPond.OverrideProperty
   * @generated
   */
  EClass getOverrideProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.OverrideProperty#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.elysium.lilyPond.OverrideProperty#getPath()
   * @see #getOverrideProperty()
   * @generated
   */
  EReference getOverrideProperty_Path();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.OverrideProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.elysium.lilyPond.OverrideProperty#getValue()
   * @see #getOverrideProperty()
   * @generated
   */
  EReference getOverrideProperty_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.RevertProperty <em>Revert Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Revert Property</em>'.
   * @see org.elysium.lilyPond.RevertProperty
   * @generated
   */
  EClass getRevertProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.RevertProperty#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.elysium.lilyPond.RevertProperty#getPath()
   * @see #getRevertProperty()
   * @generated
   */
  EReference getRevertProperty_Path();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.ContextDefaultModifier <em>Context Default Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Default Modifier</em>'.
   * @see org.elysium.lilyPond.ContextDefaultModifier
   * @generated
   */
  EClass getContextDefaultModifier();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.ContextDefaultModifier#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.elysium.lilyPond.ContextDefaultModifier#getType()
   * @see #getContextDefaultModifier()
   * @generated
   */
  EReference getContextDefaultModifier_Type();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.ContextDefaultModifier#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.elysium.lilyPond.ContextDefaultModifier#getValue()
   * @see #getContextDefaultModifier()
   * @generated
   */
  EAttribute getContextDefaultModifier_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.ContextDefaultModifierType <em>Context Default Modifier Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Default Modifier Type</em>'.
   * @see org.elysium.lilyPond.ContextDefaultModifierType
   * @generated
   */
  EClass getContextDefaultModifierType();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.RelativeMusic <em>Relative Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relative Music</em>'.
   * @see org.elysium.lilyPond.RelativeMusic
   * @generated
   */
  EClass getRelativeMusic();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.RelativeMusic#getPitch <em>Pitch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pitch</em>'.
   * @see org.elysium.lilyPond.RelativeMusic#getPitch()
   * @see #getRelativeMusic()
   * @generated
   */
  EReference getRelativeMusic_Pitch();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.RelativeMusic#getMusic <em>Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Music</em>'.
   * @see org.elysium.lilyPond.RelativeMusic#getMusic()
   * @see #getRelativeMusic()
   * @generated
   */
  EReference getRelativeMusic_Music();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.RepeatedMusic <em>Repeated Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repeated Music</em>'.
   * @see org.elysium.lilyPond.RepeatedMusic
   * @generated
   */
  EClass getRepeatedMusic();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.RepeatedMusic#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.elysium.lilyPond.RepeatedMusic#getType()
   * @see #getRepeatedMusic()
   * @generated
   */
  EAttribute getRepeatedMusic_Type();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.RepeatedMusic#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.elysium.lilyPond.RepeatedMusic#getNumber()
   * @see #getRepeatedMusic()
   * @generated
   */
  EAttribute getRepeatedMusic_Number();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.RepeatedMusic#getMusic <em>Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Music</em>'.
   * @see org.elysium.lilyPond.RepeatedMusic#getMusic()
   * @see #getRepeatedMusic()
   * @generated
   */
  EReference getRepeatedMusic_Music();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.RepeatedMusic#getAlternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alternative</em>'.
   * @see org.elysium.lilyPond.RepeatedMusic#getAlternative()
   * @see #getRepeatedMusic()
   * @generated
   */
  EReference getRepeatedMusic_Alternative();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.AlternativeMusic <em>Alternative Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternative Music</em>'.
   * @see org.elysium.lilyPond.AlternativeMusic
   * @generated
   */
  EClass getAlternativeMusic();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.AlternativeMusic#getMusic <em>Music</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Music</em>'.
   * @see org.elysium.lilyPond.AlternativeMusic#getMusic()
   * @see #getAlternativeMusic()
   * @generated
   */
  EReference getAlternativeMusic_Music();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.MusicOrScheme <em>Music Or Scheme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Music Or Scheme</em>'.
   * @see org.elysium.lilyPond.MusicOrScheme
   * @generated
   */
  EClass getMusicOrScheme();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Duration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Duration</em>'.
   * @see org.elysium.lilyPond.Duration
   * @generated
   */
  EClass getDuration();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.Duration#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see org.elysium.lilyPond.Duration#getBase()
   * @see #getDuration()
   * @generated
   */
  EAttribute getDuration_Base();

  /**
   * Returns the meta object for the attribute list '{@link org.elysium.lilyPond.Duration#getDots <em>Dots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dots</em>'.
   * @see org.elysium.lilyPond.Duration#getDots()
   * @see #getDuration()
   * @generated
   */
  EAttribute getDuration_Dots();

  /**
   * Returns the meta object for the containment reference list '{@link org.elysium.lilyPond.Duration#getMultipliers <em>Multipliers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Multipliers</em>'.
   * @see org.elysium.lilyPond.Duration#getMultipliers()
   * @see #getDuration()
   * @generated
   */
  EReference getDuration_Multipliers();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.DurationMultiplier <em>Duration Multiplier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Duration Multiplier</em>'.
   * @see org.elysium.lilyPond.DurationMultiplier
   * @generated
   */
  EClass getDurationMultiplier();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.Fraction <em>Fraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fraction</em>'.
   * @see org.elysium.lilyPond.Fraction
   * @generated
   */
  EClass getFraction();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.Fraction#getNumerator <em>Numerator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Numerator</em>'.
   * @see org.elysium.lilyPond.Fraction#getNumerator()
   * @see #getFraction()
   * @generated
   */
  EAttribute getFraction_Numerator();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.Fraction#getDenominator <em>Denominator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Denominator</em>'.
   * @see org.elysium.lilyPond.Fraction#getDenominator()
   * @see #getFraction()
   * @generated
   */
  EAttribute getFraction_Denominator();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.FractionOrNumber <em>Fraction Or Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fraction Or Number</em>'.
   * @see org.elysium.lilyPond.FractionOrNumber
   * @generated
   */
  EClass getFractionOrNumber();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.FractionOrNumber#getNumerator <em>Numerator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Numerator</em>'.
   * @see org.elysium.lilyPond.FractionOrNumber#getNumerator()
   * @see #getFractionOrNumber()
   * @generated
   */
  EAttribute getFractionOrNumber_Numerator();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.FractionOrNumber#getDenominator <em>Denominator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Denominator</em>'.
   * @see org.elysium.lilyPond.FractionOrNumber#getDenominator()
   * @see #getFractionOrNumber()
   * @generated
   */
  EAttribute getFractionOrNumber_Denominator();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.ContextChange <em>Context Change</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Change</em>'.
   * @see org.elysium.lilyPond.ContextChange
   * @generated
   */
  EClass getContextChange();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.ContextChange#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Context</em>'.
   * @see org.elysium.lilyPond.ContextChange#getContext()
   * @see #getContextChange()
   * @generated
   */
  EAttribute getContextChange_Context();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.ContextChange#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.elysium.lilyPond.ContextChange#getId()
   * @see #getContextChange()
   * @generated
   */
  EAttribute getContextChange_Id();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.MusicPropertyDefinition <em>Music Property Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Music Property Definition</em>'.
   * @see org.elysium.lilyPond.MusicPropertyDefinition
   * @generated
   */
  EClass getMusicPropertyDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.MusicPropertyDefinition#isOnce <em>Once</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Once</em>'.
   * @see org.elysium.lilyPond.MusicPropertyDefinition#isOnce()
   * @see #getMusicPropertyDefinition()
   * @generated
   */
  EAttribute getMusicPropertyDefinition_Once();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.MusicPropertyDefinition#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operation</em>'.
   * @see org.elysium.lilyPond.MusicPropertyDefinition#getOperation()
   * @see #getMusicPropertyDefinition()
   * @generated
   */
  EReference getMusicPropertyDefinition_Operation();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.MusicPropertyOperation <em>Music Property Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Music Property Operation</em>'.
   * @see org.elysium.lilyPond.MusicPropertyOperation
   * @generated
   */
  EClass getMusicPropertyOperation();

  /**
   * Returns the meta object for the attribute '{@link org.elysium.lilyPond.MusicPropertyOperation#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object</em>'.
   * @see org.elysium.lilyPond.MusicPropertyOperation#getObject()
   * @see #getMusicPropertyOperation()
   * @generated
   */
  EAttribute getMusicPropertyOperation_Object();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.OverrideMusicProperty <em>Override Music Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Override Music Property</em>'.
   * @see org.elysium.lilyPond.OverrideMusicProperty
   * @generated
   */
  EClass getOverrideMusicProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.OverrideMusicProperty#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.elysium.lilyPond.OverrideMusicProperty#getPath()
   * @see #getOverrideMusicProperty()
   * @generated
   */
  EReference getOverrideMusicProperty_Path();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.OverrideMusicProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.elysium.lilyPond.OverrideMusicProperty#getValue()
   * @see #getOverrideMusicProperty()
   * @generated
   */
  EReference getOverrideMusicProperty_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.RevertMusicProperty <em>Revert Music Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Revert Music Property</em>'.
   * @see org.elysium.lilyPond.RevertMusicProperty
   * @generated
   */
  EClass getRevertMusicProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.RevertMusicProperty#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.elysium.lilyPond.RevertMusicProperty#getPath()
   * @see #getRevertMusicProperty()
   * @generated
   */
  EReference getRevertMusicProperty_Path();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.SetMusicProperty <em>Set Music Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Music Property</em>'.
   * @see org.elysium.lilyPond.SetMusicProperty
   * @generated
   */
  EClass getSetMusicProperty();

  /**
   * Returns the meta object for the containment reference '{@link org.elysium.lilyPond.SetMusicProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.elysium.lilyPond.SetMusicProperty#getValue()
   * @see #getSetMusicProperty()
   * @generated
   */
  EReference getSetMusicProperty_Value();

  /**
   * Returns the meta object for class '{@link org.elysium.lilyPond.UnsetMusicProperty <em>Unset Music Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unset Music Property</em>'.
   * @see org.elysium.lilyPond.UnsetMusicProperty
   * @generated
   */
  EClass getUnsetMusicProperty();

  /**
   * Returns the meta object for enum '{@link org.elysium.lilyPond.Direction <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Direction</em>'.
   * @see org.elysium.lilyPond.Direction
   * @generated
   */
  EEnum getDirection();

  /**
   * Returns the meta object for enum '{@link org.elysium.lilyPond.ScriptWithRequiredDirection <em>Script With Required Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Script With Required Direction</em>'.
   * @see org.elysium.lilyPond.ScriptWithRequiredDirection
   * @generated
   */
  EEnum getScriptWithRequiredDirection();

  /**
   * Returns the meta object for enum '{@link org.elysium.lilyPond.ScriptWithOptionalDirection <em>Script With Optional Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Script With Optional Direction</em>'.
   * @see org.elysium.lilyPond.ScriptWithOptionalDirection
   * @generated
   */
  EEnum getScriptWithOptionalDirection();

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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ToplevelExpressionImpl <em>Toplevel Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ToplevelExpressionImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getToplevelExpression()
     * @generated
     */
    EClass TOPLEVEL_EXPRESSION = eINSTANCE.getToplevelExpression();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.AssignmentImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getAssignment()
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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ValueImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ContextDefinitionImpl <em>Context Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ContextDefinitionImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getContextDefinition()
     * @generated
     */
    EClass CONTEXT_DEFINITION = eINSTANCE.getContextDefinition();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_DEFINITION__ELEMENTS = eINSTANCE.getContextDefinition_Elements();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ContextDefinitionElementImpl <em>Context Definition Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ContextDefinitionElementImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getContextDefinitionElement()
     * @generated
     */
    EClass CONTEXT_DEFINITION_ELEMENT = eINSTANCE.getContextDefinitionElement();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.GrobDescriptionsImpl <em>Grob Descriptions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.GrobDescriptionsImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getGrobDescriptions()
     * @generated
     */
    EClass GROB_DESCRIPTIONS = eINSTANCE.getGrobDescriptions();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROB_DESCRIPTIONS__VALUE = eINSTANCE.getGrobDescriptions_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.HeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.HeaderImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getHeader()
     * @generated
     */
    EClass HEADER = eINSTANCE.getHeader();

    /**
     * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADER__ASSIGNMENTS = eINSTANCE.getHeader_Assignments();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.PropertyAssignmentImpl <em>Property Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.PropertyAssignmentImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getPropertyAssignment()
     * @generated
     */
    EClass PROPERTY_ASSIGNMENT = eINSTANCE.getPropertyAssignment();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_ASSIGNMENT__PROPERTY = eINSTANCE.getPropertyAssignment_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_ASSIGNMENT__VALUE = eINSTANCE.getPropertyAssignment_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.OutputDefinitionImpl <em>Output Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.OutputDefinitionImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getOutputDefinition()
     * @generated
     */
    EClass OUTPUT_DEFINITION = eINSTANCE.getOutputDefinition();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_DEFINITION__ELEMENTS = eINSTANCE.getOutputDefinition_Elements();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.OutputDefinitionElementImpl <em>Output Definition Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.OutputDefinitionElementImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getOutputDefinitionElement()
     * @generated
     */
    EClass OUTPUT_DEFINITION_ELEMENT = eINSTANCE.getOutputDefinitionElement();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.PaperImpl <em>Paper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.PaperImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getPaper()
     * @generated
     */
    EClass PAPER = eINSTANCE.getPaper();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.MidiImpl <em>Midi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.MidiImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMidi()
     * @generated
     */
    EClass MIDI = eINSTANCE.getMidi();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.LayoutImpl <em>Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.LayoutImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getLayout()
     * @generated
     */
    EClass LAYOUT = eINSTANCE.getLayout();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ScoreImpl <em>Score</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ScoreImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getScore()
     * @generated
     */
    EClass SCORE = eINSTANCE.getScore();

    /**
     * The meta object literal for the '<em><b>Music</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCORE__MUSIC = eINSTANCE.getScore_Music();

    /**
     * The meta object literal for the '<em><b>Other</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCORE__OTHER = eINSTANCE.getScore_Other();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ScoreElementImpl <em>Score Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ScoreElementImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getScoreElement()
     * @generated
     */
    EClass SCORE_ELEMENT = eINSTANCE.getScoreElement();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.BookImpl <em>Book</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.BookImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBook()
     * @generated
     */
    EClass BOOK = eINSTANCE.getBook();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOK__ELEMENTS = eINSTANCE.getBook_Elements();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.BookElementImpl <em>Book Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.BookElementImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBookElement()
     * @generated
     */
    EClass BOOK_ELEMENT = eINSTANCE.getBookElement();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.BookPartImpl <em>Book Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.BookPartImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBookPart()
     * @generated
     */
    EClass BOOK_PART = eINSTANCE.getBookPart();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOK_PART__ELEMENTS = eINSTANCE.getBookPart_Elements();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.BookPartElementImpl <em>Book Part Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.BookPartElementImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBookPartElement()
     * @generated
     */
    EClass BOOK_PART_ELEMENT = eINSTANCE.getBookPartElement();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.MarkupImpl <em>Markup</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.MarkupImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMarkup()
     * @generated
     */
    EClass MARKUP = eINSTANCE.getMarkup();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.MarkupLinesImpl <em>Markup Lines</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.MarkupLinesImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMarkupLines()
     * @generated
     */
    EClass MARKUP_LINES = eINSTANCE.getMarkupLines();

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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SourceFileNameImpl <em>Source File Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SourceFileNameImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSourceFileName()
     * @generated
     */
    EClass SOURCE_FILE_NAME = eINSTANCE.getSourceFileName();

    /**
     * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE_FILE_NAME__FILENAME = eINSTANCE.getSourceFileName_Filename();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SourceFileLineImpl <em>Source File Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SourceFileLineImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSourceFileLine()
     * @generated
     */
    EClass SOURCE_FILE_LINE = eINSTANCE.getSourceFileLine();

    /**
     * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE_FILE_LINE__LINE = eINSTANCE.getSourceFileLine_Line();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.MusicImpl <em>Music</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.MusicImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMusic()
     * @generated
     */
    EClass MUSIC = eINSTANCE.getMusic();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SimpleMusicImpl <em>Simple Music</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SimpleMusicImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSimpleMusic()
     * @generated
     */
    EClass SIMPLE_MUSIC = eINSTANCE.getSimpleMusic();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.EventImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.NoteImpl <em>Note</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.NoteImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getNote()
     * @generated
     */
    EClass NOTE = eINSTANCE.getNote();

    /**
     * The meta object literal for the '<em><b>Pitch</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOTE__PITCH = eINSTANCE.getNote_Pitch();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOTE__DURATION = eINSTANCE.getNote_Duration();

    /**
     * The meta object literal for the '<em><b>Rest</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE__REST = eINSTANCE.getNote_Rest();

    /**
     * The meta object literal for the '<em><b>Post Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOTE__POST_EVENTS = eINSTANCE.getNote_PostEvents();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.PitchImpl <em>Pitch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.PitchImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getPitch()
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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.OctaveImpl <em>Octave</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.OctaveImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getOctave()
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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.RestImpl <em>Rest</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.RestImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getRest()
     * @generated
     */
    EClass REST = eINSTANCE.getRest();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REST__TYPE = eINSTANCE.getRest_Type();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST__DURATION = eINSTANCE.getRest_Duration();

    /**
     * The meta object literal for the '<em><b>Post Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REST__POST_EVENTS = eINSTANCE.getRest_PostEvents();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ChordImpl <em>Chord</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ChordImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getChord()
     * @generated
     */
    EClass CHORD = eINSTANCE.getChord();

    /**
     * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHORD__NOTES = eINSTANCE.getChord_Notes();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHORD__DURATION = eINSTANCE.getChord_Duration();

    /**
     * The meta object literal for the '<em><b>Post Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHORD__POST_EVENTS = eINSTANCE.getChord_PostEvents();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.PostEventImpl <em>Post Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.PostEventImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getPostEvent()
     * @generated
     */
    EClass POST_EVENT = eINSTANCE.getPostEvent();

    /**
     * The meta object literal for the '<em><b>Music Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POST_EVENT__MUSIC_FUNCTION = eINSTANCE.getPostEvent_MusicFunction();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POST_EVENT__DIRECTION = eINSTANCE.getPostEvent_Direction();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POST_EVENT__EVENT = eINSTANCE.getPostEvent_Event();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.EventWithRequiredDirectionImpl <em>Event With Required Direction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.EventWithRequiredDirectionImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getEventWithRequiredDirection()
     * @generated
     */
    EClass EVENT_WITH_REQUIRED_DIRECTION = eINSTANCE.getEventWithRequiredDirection();

    /**
     * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_WITH_REQUIRED_DIRECTION__SCRIPT = eINSTANCE.getEventWithRequiredDirection_Script();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.GenTextDefImpl <em>Gen Text Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.GenTextDefImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getGenTextDef()
     * @generated
     */
    EClass GEN_TEXT_DEF = eINSTANCE.getGenTextDef();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.EventWithOptionalDirectionImpl <em>Event With Optional Direction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.EventWithOptionalDirectionImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getEventWithOptionalDirection()
     * @generated
     */
    EClass EVENT_WITH_OPTIONAL_DIRECTION = eINSTANCE.getEventWithOptionalDirection();

    /**
     * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT_WITH_OPTIONAL_DIRECTION__SCRIPT = eINSTANCE.getEventWithOptionalDirection_Script();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.TremoloImpl <em>Tremolo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.TremoloImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getTremolo()
     * @generated
     */
    EClass TREMOLO = eINSTANCE.getTremolo();

    /**
     * The meta object literal for the '<em><b>Division</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TREMOLO__DIVISION = eINSTANCE.getTremolo_Division();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.KeySignatureImpl <em>Key Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.KeySignatureImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getKeySignature()
     * @generated
     */
    EClass KEY_SIGNATURE = eINSTANCE.getKeySignature();

    /**
     * The meta object literal for the '<em><b>Tonic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_SIGNATURE__TONIC = eINSTANCE.getKeySignature_Tonic();

    /**
     * The meta object literal for the '<em><b>Mode</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY_SIGNATURE__MODE = eINSTANCE.getKeySignature_Mode();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_SIGNATURE__DEFAULT = eINSTANCE.getKeySignature_Default();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.TimeSignatureImpl <em>Time Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.TimeSignatureImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getTimeSignature()
     * @generated
     */
    EClass TIME_SIGNATURE = eINSTANCE.getTimeSignature();

    /**
     * The meta object literal for the '<em><b>Fraction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIME_SIGNATURE__FRACTION = eINSTANCE.getTimeSignature_Fraction();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.TempoImpl <em>Tempo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.TempoImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getTempo()
     * @generated
     */
    EClass TEMPO = eINSTANCE.getTempo();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPO__LABEL = eINSTANCE.getTempo_Label();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPO__VALUE = eINSTANCE.getTempo_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.TempoLabelImpl <em>Tempo Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.TempoLabelImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getTempoLabel()
     * @generated
     */
    EClass TEMPO_LABEL = eINSTANCE.getTempoLabel();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.TempoValueImpl <em>Tempo Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.TempoValueImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getTempoValue()
     * @generated
     */
    EClass TEMPO_VALUE = eINSTANCE.getTempoValue();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPO_VALUE__DURATION = eINSTANCE.getTempoValue_Duration();

    /**
     * The meta object literal for the '<em><b>Bpm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPO_VALUE__BPM = eINSTANCE.getTempoValue_Bpm();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.PartialImpl <em>Partial</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.PartialImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getPartial()
     * @generated
     */
    EClass PARTIAL = eINSTANCE.getPartial();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTIAL__DURATION = eINSTANCE.getPartial_Duration();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.MarkImpl <em>Mark</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.MarkImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMark()
     * @generated
     */
    EClass MARK = eINSTANCE.getMark();

    /**
     * The meta object literal for the '<em><b>Mark</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MARK__MARK = eINSTANCE.getMark_Mark();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SkipImpl <em>Skip</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SkipImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSkip()
     * @generated
     */
    EClass SKIP = eINSTANCE.getSkip();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SKIP__DURATION = eINSTANCE.getSkip_Duration();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.TieImpl <em>Tie</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.TieImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getTie()
     * @generated
     */
    EClass TIE = eINSTANCE.getTie();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.BeamStartImpl <em>Beam Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.BeamStartImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBeamStart()
     * @generated
     */
    EClass BEAM_START = eINSTANCE.getBeamStart();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.BeamEndImpl <em>Beam End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.BeamEndImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBeamEnd()
     * @generated
     */
    EClass BEAM_END = eINSTANCE.getBeamEnd();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.BarCheckImpl <em>Bar Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.BarCheckImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getBarCheck()
     * @generated
     */
    EClass BAR_CHECK = eINSTANCE.getBarCheck();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ReferenceImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getReference()
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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.CompositeMusicImpl <em>Composite Music</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.CompositeMusicImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getCompositeMusic()
     * @generated
     */
    EClass COMPOSITE_MUSIC = eINSTANCE.getCompositeMusic();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SequentialMusicImpl <em>Sequential Music</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SequentialMusicImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSequentialMusic()
     * @generated
     */
    EClass SEQUENTIAL_MUSIC = eINSTANCE.getSequentialMusic();

    /**
     * The meta object literal for the '<em><b>Music</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENTIAL_MUSIC__MUSIC = eINSTANCE.getSequentialMusic_Music();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SimultaneousMusicImpl <em>Simultaneous Music</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SimultaneousMusicImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSimultaneousMusic()
     * @generated
     */
    EClass SIMULTANEOUS_MUSIC = eINSTANCE.getSimultaneousMusic();

    /**
     * The meta object literal for the '<em><b>Music</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMULTANEOUS_MUSIC__MUSIC = eINSTANCE.getSimultaneousMusic_Music();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.NewContextImpl <em>New Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.NewContextImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getNewContext()
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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ContextModificationImpl <em>Context Modification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ContextModificationImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getContextModification()
     * @generated
     */
    EClass CONTEXT_MODIFICATION = eINSTANCE.getContextModification();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_MODIFICATION__MODIFIERS = eINSTANCE.getContextModification_Modifiers();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ContextModifierImpl <em>Context Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ContextModifierImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getContextModifier()
     * @generated
     */
    EClass CONTEXT_MODIFIER = eINSTANCE.getContextModifier();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.PropertyOperationImpl <em>Property Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.PropertyOperationImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getPropertyOperation()
     * @generated
     */
    EClass PROPERTY_OPERATION = eINSTANCE.getPropertyOperation();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_OPERATION__PROPERTY = eINSTANCE.getPropertyOperation_Property();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SetPropertyImpl <em>Set Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SetPropertyImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSetProperty()
     * @generated
     */
    EClass SET_PROPERTY = eINSTANCE.getSetProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_PROPERTY__VALUE = eINSTANCE.getSetProperty_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ScalarImpl <em>Scalar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ScalarImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getScalar()
     * @generated
     */
    EClass SCALAR = eINSTANCE.getScalar();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.UnsetPropertyImpl <em>Unset Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.UnsetPropertyImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getUnsetProperty()
     * @generated
     */
    EClass UNSET_PROPERTY = eINSTANCE.getUnsetProperty();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.OverridePropertyImpl <em>Override Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.OverridePropertyImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getOverrideProperty()
     * @generated
     */
    EClass OVERRIDE_PROPERTY = eINSTANCE.getOverrideProperty();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OVERRIDE_PROPERTY__PATH = eINSTANCE.getOverrideProperty_Path();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OVERRIDE_PROPERTY__VALUE = eINSTANCE.getOverrideProperty_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.RevertPropertyImpl <em>Revert Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.RevertPropertyImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getRevertProperty()
     * @generated
     */
    EClass REVERT_PROPERTY = eINSTANCE.getRevertProperty();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REVERT_PROPERTY__PATH = eINSTANCE.getRevertProperty_Path();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ContextDefaultModifierImpl <em>Context Default Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ContextDefaultModifierImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getContextDefaultModifier()
     * @generated
     */
    EClass CONTEXT_DEFAULT_MODIFIER = eINSTANCE.getContextDefaultModifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT_DEFAULT_MODIFIER__TYPE = eINSTANCE.getContextDefaultModifier_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT_DEFAULT_MODIFIER__VALUE = eINSTANCE.getContextDefaultModifier_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ContextDefaultModifierTypeImpl <em>Context Default Modifier Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ContextDefaultModifierTypeImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getContextDefaultModifierType()
     * @generated
     */
    EClass CONTEXT_DEFAULT_MODIFIER_TYPE = eINSTANCE.getContextDefaultModifierType();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.RelativeMusicImpl <em>Relative Music</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.RelativeMusicImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getRelativeMusic()
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
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.RepeatedMusicImpl <em>Repeated Music</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.RepeatedMusicImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getRepeatedMusic()
     * @generated
     */
    EClass REPEATED_MUSIC = eINSTANCE.getRepeatedMusic();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEATED_MUSIC__TYPE = eINSTANCE.getRepeatedMusic_Type();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEATED_MUSIC__NUMBER = eINSTANCE.getRepeatedMusic_Number();

    /**
     * The meta object literal for the '<em><b>Music</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEATED_MUSIC__MUSIC = eINSTANCE.getRepeatedMusic_Music();

    /**
     * The meta object literal for the '<em><b>Alternative</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEATED_MUSIC__ALTERNATIVE = eINSTANCE.getRepeatedMusic_Alternative();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.AlternativeMusicImpl <em>Alternative Music</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.AlternativeMusicImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getAlternativeMusic()
     * @generated
     */
    EClass ALTERNATIVE_MUSIC = eINSTANCE.getAlternativeMusic();

    /**
     * The meta object literal for the '<em><b>Music</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE_MUSIC__MUSIC = eINSTANCE.getAlternativeMusic_Music();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.MusicOrSchemeImpl <em>Music Or Scheme</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.MusicOrSchemeImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMusicOrScheme()
     * @generated
     */
    EClass MUSIC_OR_SCHEME = eINSTANCE.getMusicOrScheme();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.DurationImpl <em>Duration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.DurationImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getDuration()
     * @generated
     */
    EClass DURATION = eINSTANCE.getDuration();

    /**
     * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DURATION__BASE = eINSTANCE.getDuration_Base();

    /**
     * The meta object literal for the '<em><b>Dots</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DURATION__DOTS = eINSTANCE.getDuration_Dots();

    /**
     * The meta object literal for the '<em><b>Multipliers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DURATION__MULTIPLIERS = eINSTANCE.getDuration_Multipliers();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.DurationMultiplierImpl <em>Duration Multiplier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.DurationMultiplierImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getDurationMultiplier()
     * @generated
     */
    EClass DURATION_MULTIPLIER = eINSTANCE.getDurationMultiplier();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.FractionImpl <em>Fraction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.FractionImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getFraction()
     * @generated
     */
    EClass FRACTION = eINSTANCE.getFraction();

    /**
     * The meta object literal for the '<em><b>Numerator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FRACTION__NUMERATOR = eINSTANCE.getFraction_Numerator();

    /**
     * The meta object literal for the '<em><b>Denominator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FRACTION__DENOMINATOR = eINSTANCE.getFraction_Denominator();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.FractionOrNumberImpl <em>Fraction Or Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.FractionOrNumberImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getFractionOrNumber()
     * @generated
     */
    EClass FRACTION_OR_NUMBER = eINSTANCE.getFractionOrNumber();

    /**
     * The meta object literal for the '<em><b>Numerator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FRACTION_OR_NUMBER__NUMERATOR = eINSTANCE.getFractionOrNumber_Numerator();

    /**
     * The meta object literal for the '<em><b>Denominator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FRACTION_OR_NUMBER__DENOMINATOR = eINSTANCE.getFractionOrNumber_Denominator();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.ContextChangeImpl <em>Context Change</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.ContextChangeImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getContextChange()
     * @generated
     */
    EClass CONTEXT_CHANGE = eINSTANCE.getContextChange();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT_CHANGE__CONTEXT = eINSTANCE.getContextChange_Context();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT_CHANGE__ID = eINSTANCE.getContextChange_Id();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.MusicPropertyDefinitionImpl <em>Music Property Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.MusicPropertyDefinitionImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMusicPropertyDefinition()
     * @generated
     */
    EClass MUSIC_PROPERTY_DEFINITION = eINSTANCE.getMusicPropertyDefinition();

    /**
     * The meta object literal for the '<em><b>Once</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MUSIC_PROPERTY_DEFINITION__ONCE = eINSTANCE.getMusicPropertyDefinition_Once();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUSIC_PROPERTY_DEFINITION__OPERATION = eINSTANCE.getMusicPropertyDefinition_Operation();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.MusicPropertyOperationImpl <em>Music Property Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.MusicPropertyOperationImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getMusicPropertyOperation()
     * @generated
     */
    EClass MUSIC_PROPERTY_OPERATION = eINSTANCE.getMusicPropertyOperation();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MUSIC_PROPERTY_OPERATION__OBJECT = eINSTANCE.getMusicPropertyOperation_Object();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.OverrideMusicPropertyImpl <em>Override Music Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.OverrideMusicPropertyImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getOverrideMusicProperty()
     * @generated
     */
    EClass OVERRIDE_MUSIC_PROPERTY = eINSTANCE.getOverrideMusicProperty();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OVERRIDE_MUSIC_PROPERTY__PATH = eINSTANCE.getOverrideMusicProperty_Path();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OVERRIDE_MUSIC_PROPERTY__VALUE = eINSTANCE.getOverrideMusicProperty_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.RevertMusicPropertyImpl <em>Revert Music Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.RevertMusicPropertyImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getRevertMusicProperty()
     * @generated
     */
    EClass REVERT_MUSIC_PROPERTY = eINSTANCE.getRevertMusicProperty();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REVERT_MUSIC_PROPERTY__PATH = eINSTANCE.getRevertMusicProperty_Path();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.SetMusicPropertyImpl <em>Set Music Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.SetMusicPropertyImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getSetMusicProperty()
     * @generated
     */
    EClass SET_MUSIC_PROPERTY = eINSTANCE.getSetMusicProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET_MUSIC_PROPERTY__VALUE = eINSTANCE.getSetMusicProperty_Value();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.impl.UnsetMusicPropertyImpl <em>Unset Music Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.impl.UnsetMusicPropertyImpl
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getUnsetMusicProperty()
     * @generated
     */
    EClass UNSET_MUSIC_PROPERTY = eINSTANCE.getUnsetMusicProperty();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.Direction <em>Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.Direction
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getDirection()
     * @generated
     */
    EEnum DIRECTION = eINSTANCE.getDirection();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.ScriptWithRequiredDirection <em>Script With Required Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.ScriptWithRequiredDirection
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getScriptWithRequiredDirection()
     * @generated
     */
    EEnum SCRIPT_WITH_REQUIRED_DIRECTION = eINSTANCE.getScriptWithRequiredDirection();

    /**
     * The meta object literal for the '{@link org.elysium.lilyPond.ScriptWithOptionalDirection <em>Script With Optional Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.elysium.lilyPond.ScriptWithOptionalDirection
     * @see org.elysium.lilyPond.impl.LilyPondPackageImpl#getScriptWithOptionalDirection()
     * @generated
     */
    EEnum SCRIPT_WITH_OPTIONAL_DIRECTION = eINSTANCE.getScriptWithOptionalDirection();

  }

} //LilyPondPackage
