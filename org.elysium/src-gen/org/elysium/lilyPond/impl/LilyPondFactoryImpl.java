/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.elysium.lilyPond.*;

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
      LilyPondFactory theLilyPondFactory = (LilyPondFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.elysium.org/LilyPond"); 
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
      case LilyPondPackage.TOPLEVEL_EXPRESSION: return createToplevelExpression();
      case LilyPondPackage.ASSIGNMENT: return createAssignment();
      case LilyPondPackage.VALUE: return createValue();
      case LilyPondPackage.SCHEME: return createScheme();
      case LilyPondPackage.SCHEME_EXPRESSION: return createSchemeExpression();
      case LilyPondPackage.SCHEME_VALUE: return createSchemeValue();
      case LilyPondPackage.SCHEME_BOOLEAN: return createSchemeBoolean();
      case LilyPondPackage.SCHEME_LIST: return createSchemeList();
      case LilyPondPackage.SCHEME_TEXT: return createSchemeText();
      case LilyPondPackage.SCHEME_NUMBER: return createSchemeNumber();
      case LilyPondPackage.CONTEXT_DEFINITION: return createContextDefinition();
      case LilyPondPackage.CONTEXT_DEFINITION_ELEMENT: return createContextDefinitionElement();
      case LilyPondPackage.GROB_DESCRIPTIONS: return createGrobDescriptions();
      case LilyPondPackage.HEADER: return createHeader();
      case LilyPondPackage.PROPERTY_ASSIGNMENT: return createPropertyAssignment();
      case LilyPondPackage.OUTPUT_DEFINITION: return createOutputDefinition();
      case LilyPondPackage.OUTPUT_DEFINITION_ELEMENT: return createOutputDefinitionElement();
      case LilyPondPackage.PAPER: return createPaper();
      case LilyPondPackage.MIDI: return createMidi();
      case LilyPondPackage.LAYOUT: return createLayout();
      case LilyPondPackage.SCORE: return createScore();
      case LilyPondPackage.SCORE_ELEMENT: return createScoreElement();
      case LilyPondPackage.BOOK: return createBook();
      case LilyPondPackage.BOOK_ELEMENT: return createBookElement();
      case LilyPondPackage.BOOK_PART: return createBookPart();
      case LilyPondPackage.BOOK_PART_ELEMENT: return createBookPartElement();
      case LilyPondPackage.MARKUP: return createMarkup();
      case LilyPondPackage.MARKUP_LINES: return createMarkupLines();
      case LilyPondPackage.VERSION: return createVersion();
      case LilyPondPackage.INCLUDE: return createInclude();
      case LilyPondPackage.SOURCE_FILE_NAME: return createSourceFileName();
      case LilyPondPackage.SOURCE_FILE_LINE: return createSourceFileLine();
      case LilyPondPackage.MUSIC: return createMusic();
      case LilyPondPackage.SIMPLE_MUSIC: return createSimpleMusic();
      case LilyPondPackage.EVENT: return createEvent();
      case LilyPondPackage.NOTE: return createNote();
      case LilyPondPackage.PITCH: return createPitch();
      case LilyPondPackage.OCTAVE: return createOctave();
      case LilyPondPackage.REST: return createRest();
      case LilyPondPackage.CHORD: return createChord();
      case LilyPondPackage.POST_EVENT: return createPostEvent();
      case LilyPondPackage.EVENT_WITH_REQUIRED_DIRECTION: return createEventWithRequiredDirection();
      case LilyPondPackage.GEN_TEXT_DEF: return createGenTextDef();
      case LilyPondPackage.EVENT_WITH_OPTIONAL_DIRECTION: return createEventWithOptionalDirection();
      case LilyPondPackage.TREMOLO: return createTremolo();
      case LilyPondPackage.KEY_SIGNATURE: return createKeySignature();
      case LilyPondPackage.TIME_SIGNATURE: return createTimeSignature();
      case LilyPondPackage.TEMPO: return createTempo();
      case LilyPondPackage.TEMPO_LABEL: return createTempoLabel();
      case LilyPondPackage.TEMPO_VALUE: return createTempoValue();
      case LilyPondPackage.PARTIAL: return createPartial();
      case LilyPondPackage.MARK: return createMark();
      case LilyPondPackage.SKIP: return createSkip();
      case LilyPondPackage.TIE: return createTie();
      case LilyPondPackage.BEAM_START: return createBeamStart();
      case LilyPondPackage.BEAM_END: return createBeamEnd();
      case LilyPondPackage.BAR_CHECK: return createBarCheck();
      case LilyPondPackage.REFERENCE: return createReference();
      case LilyPondPackage.COMPOSITE_MUSIC: return createCompositeMusic();
      case LilyPondPackage.SEQUENTIAL_MUSIC: return createSequentialMusic();
      case LilyPondPackage.SIMULTANEOUS_MUSIC: return createSimultaneousMusic();
      case LilyPondPackage.NEW_CONTEXT: return createNewContext();
      case LilyPondPackage.CONTEXT_MODIFICATION: return createContextModification();
      case LilyPondPackage.CONTEXT_MODIFIER: return createContextModifier();
      case LilyPondPackage.PROPERTY_OPERATION: return createPropertyOperation();
      case LilyPondPackage.SET_PROPERTY: return createSetProperty();
      case LilyPondPackage.SCALAR: return createScalar();
      case LilyPondPackage.UNSET_PROPERTY: return createUnsetProperty();
      case LilyPondPackage.OVERRIDE_PROPERTY: return createOverrideProperty();
      case LilyPondPackage.REVERT_PROPERTY: return createRevertProperty();
      case LilyPondPackage.CONTEXT_DEFAULT_MODIFIER: return createContextDefaultModifier();
      case LilyPondPackage.CONTEXT_DEFAULT_MODIFIER_TYPE: return createContextDefaultModifierType();
      case LilyPondPackage.RELATIVE_MUSIC: return createRelativeMusic();
      case LilyPondPackage.REPEATED_MUSIC: return createRepeatedMusic();
      case LilyPondPackage.ALTERNATIVE_MUSIC: return createAlternativeMusic();
      case LilyPondPackage.MUSIC_OR_SCHEME: return createMusicOrScheme();
      case LilyPondPackage.DURATION: return createDuration();
      case LilyPondPackage.DURATION_MULTIPLIER: return createDurationMultiplier();
      case LilyPondPackage.FRACTION: return createFraction();
      case LilyPondPackage.FRACTION_OR_NUMBER: return createFractionOrNumber();
      case LilyPondPackage.CONTEXT_CHANGE: return createContextChange();
      case LilyPondPackage.MUSIC_PROPERTY_DEFINITION: return createMusicPropertyDefinition();
      case LilyPondPackage.MUSIC_PROPERTY_OPERATION: return createMusicPropertyOperation();
      case LilyPondPackage.OVERRIDE_MUSIC_PROPERTY: return createOverrideMusicProperty();
      case LilyPondPackage.REVERT_MUSIC_PROPERTY: return createRevertMusicProperty();
      case LilyPondPackage.SET_MUSIC_PROPERTY: return createSetMusicProperty();
      case LilyPondPackage.UNSET_MUSIC_PROPERTY: return createUnsetMusicProperty();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case LilyPondPackage.DIRECTION:
        return createDirectionFromString(eDataType, initialValue);
      case LilyPondPackage.SCRIPT_WITH_REQUIRED_DIRECTION:
        return createScriptWithRequiredDirectionFromString(eDataType, initialValue);
      case LilyPondPackage.SCRIPT_WITH_OPTIONAL_DIRECTION:
        return createScriptWithOptionalDirectionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case LilyPondPackage.DIRECTION:
        return convertDirectionToString(eDataType, instanceValue);
      case LilyPondPackage.SCRIPT_WITH_REQUIRED_DIRECTION:
        return convertScriptWithRequiredDirectionToString(eDataType, instanceValue);
      case LilyPondPackage.SCRIPT_WITH_OPTIONAL_DIRECTION:
        return convertScriptWithOptionalDirectionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
  public ToplevelExpression createToplevelExpression()
  {
    ToplevelExpressionImpl toplevelExpression = new ToplevelExpressionImpl();
    return toplevelExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scheme createScheme()
  {
    SchemeImpl scheme = new SchemeImpl();
    return scheme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeExpression createSchemeExpression()
  {
    SchemeExpressionImpl schemeExpression = new SchemeExpressionImpl();
    return schemeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeValue createSchemeValue()
  {
    SchemeValueImpl schemeValue = new SchemeValueImpl();
    return schemeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeBoolean createSchemeBoolean()
  {
    SchemeBooleanImpl schemeBoolean = new SchemeBooleanImpl();
    return schemeBoolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeList createSchemeList()
  {
    SchemeListImpl schemeList = new SchemeListImpl();
    return schemeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeText createSchemeText()
  {
    SchemeTextImpl schemeText = new SchemeTextImpl();
    return schemeText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeNumber createSchemeNumber()
  {
    SchemeNumberImpl schemeNumber = new SchemeNumberImpl();
    return schemeNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextDefinition createContextDefinition()
  {
    ContextDefinitionImpl contextDefinition = new ContextDefinitionImpl();
    return contextDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextDefinitionElement createContextDefinitionElement()
  {
    ContextDefinitionElementImpl contextDefinitionElement = new ContextDefinitionElementImpl();
    return contextDefinitionElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GrobDescriptions createGrobDescriptions()
  {
    GrobDescriptionsImpl grobDescriptions = new GrobDescriptionsImpl();
    return grobDescriptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header createHeader()
  {
    HeaderImpl header = new HeaderImpl();
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyAssignment createPropertyAssignment()
  {
    PropertyAssignmentImpl propertyAssignment = new PropertyAssignmentImpl();
    return propertyAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputDefinition createOutputDefinition()
  {
    OutputDefinitionImpl outputDefinition = new OutputDefinitionImpl();
    return outputDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputDefinitionElement createOutputDefinitionElement()
  {
    OutputDefinitionElementImpl outputDefinitionElement = new OutputDefinitionElementImpl();
    return outputDefinitionElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paper createPaper()
  {
    PaperImpl paper = new PaperImpl();
    return paper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Midi createMidi()
  {
    MidiImpl midi = new MidiImpl();
    return midi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Layout createLayout()
  {
    LayoutImpl layout = new LayoutImpl();
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Score createScore()
  {
    ScoreImpl score = new ScoreImpl();
    return score;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScoreElement createScoreElement()
  {
    ScoreElementImpl scoreElement = new ScoreElementImpl();
    return scoreElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Book createBook()
  {
    BookImpl book = new BookImpl();
    return book;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BookElement createBookElement()
  {
    BookElementImpl bookElement = new BookElementImpl();
    return bookElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BookPart createBookPart()
  {
    BookPartImpl bookPart = new BookPartImpl();
    return bookPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BookPartElement createBookPartElement()
  {
    BookPartElementImpl bookPartElement = new BookPartElementImpl();
    return bookPartElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Markup createMarkup()
  {
    MarkupImpl markup = new MarkupImpl();
    return markup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkupLines createMarkupLines()
  {
    MarkupLinesImpl markupLines = new MarkupLinesImpl();
    return markupLines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version createVersion()
  {
    VersionImpl version = new VersionImpl();
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Include createInclude()
  {
    IncludeImpl include = new IncludeImpl();
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceFileName createSourceFileName()
  {
    SourceFileNameImpl sourceFileName = new SourceFileNameImpl();
    return sourceFileName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceFileLine createSourceFileLine()
  {
    SourceFileLineImpl sourceFileLine = new SourceFileLineImpl();
    return sourceFileLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Music createMusic()
  {
    MusicImpl music = new MusicImpl();
    return music;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleMusic createSimpleMusic()
  {
    SimpleMusicImpl simpleMusic = new SimpleMusicImpl();
    return simpleMusic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Note createNote()
  {
    NoteImpl note = new NoteImpl();
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pitch createPitch()
  {
    PitchImpl pitch = new PitchImpl();
    return pitch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Octave createOctave()
  {
    OctaveImpl octave = new OctaveImpl();
    return octave;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rest createRest()
  {
    RestImpl rest = new RestImpl();
    return rest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Chord createChord()
  {
    ChordImpl chord = new ChordImpl();
    return chord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostEvent createPostEvent()
  {
    PostEventImpl postEvent = new PostEventImpl();
    return postEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventWithRequiredDirection createEventWithRequiredDirection()
  {
    EventWithRequiredDirectionImpl eventWithRequiredDirection = new EventWithRequiredDirectionImpl();
    return eventWithRequiredDirection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenTextDef createGenTextDef()
  {
    GenTextDefImpl genTextDef = new GenTextDefImpl();
    return genTextDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventWithOptionalDirection createEventWithOptionalDirection()
  {
    EventWithOptionalDirectionImpl eventWithOptionalDirection = new EventWithOptionalDirectionImpl();
    return eventWithOptionalDirection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tremolo createTremolo()
  {
    TremoloImpl tremolo = new TremoloImpl();
    return tremolo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeySignature createKeySignature()
  {
    KeySignatureImpl keySignature = new KeySignatureImpl();
    return keySignature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeSignature createTimeSignature()
  {
    TimeSignatureImpl timeSignature = new TimeSignatureImpl();
    return timeSignature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tempo createTempo()
  {
    TempoImpl tempo = new TempoImpl();
    return tempo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TempoLabel createTempoLabel()
  {
    TempoLabelImpl tempoLabel = new TempoLabelImpl();
    return tempoLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TempoValue createTempoValue()
  {
    TempoValueImpl tempoValue = new TempoValueImpl();
    return tempoValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Partial createPartial()
  {
    PartialImpl partial = new PartialImpl();
    return partial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mark createMark()
  {
    MarkImpl mark = new MarkImpl();
    return mark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Skip createSkip()
  {
    SkipImpl skip = new SkipImpl();
    return skip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tie createTie()
  {
    TieImpl tie = new TieImpl();
    return tie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeamStart createBeamStart()
  {
    BeamStartImpl beamStart = new BeamStartImpl();
    return beamStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeamEnd createBeamEnd()
  {
    BeamEndImpl beamEnd = new BeamEndImpl();
    return beamEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BarCheck createBarCheck()
  {
    BarCheckImpl barCheck = new BarCheckImpl();
    return barCheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeMusic createCompositeMusic()
  {
    CompositeMusicImpl compositeMusic = new CompositeMusicImpl();
    return compositeMusic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequentialMusic createSequentialMusic()
  {
    SequentialMusicImpl sequentialMusic = new SequentialMusicImpl();
    return sequentialMusic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimultaneousMusic createSimultaneousMusic()
  {
    SimultaneousMusicImpl simultaneousMusic = new SimultaneousMusicImpl();
    return simultaneousMusic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewContext createNewContext()
  {
    NewContextImpl newContext = new NewContextImpl();
    return newContext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextModification createContextModification()
  {
    ContextModificationImpl contextModification = new ContextModificationImpl();
    return contextModification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextModifier createContextModifier()
  {
    ContextModifierImpl contextModifier = new ContextModifierImpl();
    return contextModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyOperation createPropertyOperation()
  {
    PropertyOperationImpl propertyOperation = new PropertyOperationImpl();
    return propertyOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetProperty createSetProperty()
  {
    SetPropertyImpl setProperty = new SetPropertyImpl();
    return setProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scalar createScalar()
  {
    ScalarImpl scalar = new ScalarImpl();
    return scalar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnsetProperty createUnsetProperty()
  {
    UnsetPropertyImpl unsetProperty = new UnsetPropertyImpl();
    return unsetProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OverrideProperty createOverrideProperty()
  {
    OverridePropertyImpl overrideProperty = new OverridePropertyImpl();
    return overrideProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RevertProperty createRevertProperty()
  {
    RevertPropertyImpl revertProperty = new RevertPropertyImpl();
    return revertProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextDefaultModifier createContextDefaultModifier()
  {
    ContextDefaultModifierImpl contextDefaultModifier = new ContextDefaultModifierImpl();
    return contextDefaultModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextDefaultModifierType createContextDefaultModifierType()
  {
    ContextDefaultModifierTypeImpl contextDefaultModifierType = new ContextDefaultModifierTypeImpl();
    return contextDefaultModifierType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativeMusic createRelativeMusic()
  {
    RelativeMusicImpl relativeMusic = new RelativeMusicImpl();
    return relativeMusic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepeatedMusic createRepeatedMusic()
  {
    RepeatedMusicImpl repeatedMusic = new RepeatedMusicImpl();
    return repeatedMusic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlternativeMusic createAlternativeMusic()
  {
    AlternativeMusicImpl alternativeMusic = new AlternativeMusicImpl();
    return alternativeMusic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MusicOrScheme createMusicOrScheme()
  {
    MusicOrSchemeImpl musicOrScheme = new MusicOrSchemeImpl();
    return musicOrScheme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Duration createDuration()
  {
    DurationImpl duration = new DurationImpl();
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DurationMultiplier createDurationMultiplier()
  {
    DurationMultiplierImpl durationMultiplier = new DurationMultiplierImpl();
    return durationMultiplier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fraction createFraction()
  {
    FractionImpl fraction = new FractionImpl();
    return fraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractionOrNumber createFractionOrNumber()
  {
    FractionOrNumberImpl fractionOrNumber = new FractionOrNumberImpl();
    return fractionOrNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextChange createContextChange()
  {
    ContextChangeImpl contextChange = new ContextChangeImpl();
    return contextChange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MusicPropertyDefinition createMusicPropertyDefinition()
  {
    MusicPropertyDefinitionImpl musicPropertyDefinition = new MusicPropertyDefinitionImpl();
    return musicPropertyDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MusicPropertyOperation createMusicPropertyOperation()
  {
    MusicPropertyOperationImpl musicPropertyOperation = new MusicPropertyOperationImpl();
    return musicPropertyOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OverrideMusicProperty createOverrideMusicProperty()
  {
    OverrideMusicPropertyImpl overrideMusicProperty = new OverrideMusicPropertyImpl();
    return overrideMusicProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RevertMusicProperty createRevertMusicProperty()
  {
    RevertMusicPropertyImpl revertMusicProperty = new RevertMusicPropertyImpl();
    return revertMusicProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetMusicProperty createSetMusicProperty()
  {
    SetMusicPropertyImpl setMusicProperty = new SetMusicPropertyImpl();
    return setMusicProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnsetMusicProperty createUnsetMusicProperty()
  {
    UnsetMusicPropertyImpl unsetMusicProperty = new UnsetMusicPropertyImpl();
    return unsetMusicProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction createDirectionFromString(EDataType eDataType, String initialValue)
  {
    Direction result = Direction.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDirectionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptWithRequiredDirection createScriptWithRequiredDirectionFromString(EDataType eDataType, String initialValue)
  {
    ScriptWithRequiredDirection result = ScriptWithRequiredDirection.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertScriptWithRequiredDirectionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptWithOptionalDirection createScriptWithOptionalDirectionFromString(EDataType eDataType, String initialValue)
  {
    ScriptWithOptionalDirection result = ScriptWithOptionalDirection.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertScriptWithOptionalDirectionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
