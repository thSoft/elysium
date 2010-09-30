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
   * Returns a new object of class '<em>Toplevel Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Toplevel Expression</em>'.
   * @generated
   */
  ToplevelExpression createToplevelExpression();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

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
   * Returns a new object of class '<em>Context Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Definition</em>'.
   * @generated
   */
  ContextDefinition createContextDefinition();

  /**
   * Returns a new object of class '<em>Context Definition Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Definition Element</em>'.
   * @generated
   */
  ContextDefinitionElement createContextDefinitionElement();

  /**
   * Returns a new object of class '<em>Grob Descriptions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grob Descriptions</em>'.
   * @generated
   */
  GrobDescriptions createGrobDescriptions();

  /**
   * Returns a new object of class '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header</em>'.
   * @generated
   */
  Header createHeader();

  /**
   * Returns a new object of class '<em>Property Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Assignment</em>'.
   * @generated
   */
  PropertyAssignment createPropertyAssignment();

  /**
   * Returns a new object of class '<em>Output Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Definition</em>'.
   * @generated
   */
  OutputDefinition createOutputDefinition();

  /**
   * Returns a new object of class '<em>Output Definition Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Definition Element</em>'.
   * @generated
   */
  OutputDefinitionElement createOutputDefinitionElement();

  /**
   * Returns a new object of class '<em>Paper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Paper</em>'.
   * @generated
   */
  Paper createPaper();

  /**
   * Returns a new object of class '<em>Midi</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Midi</em>'.
   * @generated
   */
  Midi createMidi();

  /**
   * Returns a new object of class '<em>Layout</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Layout</em>'.
   * @generated
   */
  Layout createLayout();

  /**
   * Returns a new object of class '<em>Score</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Score</em>'.
   * @generated
   */
  Score createScore();

  /**
   * Returns a new object of class '<em>Score Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Score Element</em>'.
   * @generated
   */
  ScoreElement createScoreElement();

  /**
   * Returns a new object of class '<em>Book</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Book</em>'.
   * @generated
   */
  Book createBook();

  /**
   * Returns a new object of class '<em>Book Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Book Element</em>'.
   * @generated
   */
  BookElement createBookElement();

  /**
   * Returns a new object of class '<em>Book Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Book Part</em>'.
   * @generated
   */
  BookPart createBookPart();

  /**
   * Returns a new object of class '<em>Book Part Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Book Part Element</em>'.
   * @generated
   */
  BookPartElement createBookPartElement();

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
   * Returns a new object of class '<em>Version</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Version</em>'.
   * @generated
   */
  Version createVersion();

  /**
   * Returns a new object of class '<em>Include</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include</em>'.
   * @generated
   */
  Include createInclude();

  /**
   * Returns a new object of class '<em>Source File Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source File Name</em>'.
   * @generated
   */
  SourceFileName createSourceFileName();

  /**
   * Returns a new object of class '<em>Source File Line</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source File Line</em>'.
   * @generated
   */
  SourceFileLine createSourceFileLine();

  /**
   * Returns a new object of class '<em>Music</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Music</em>'.
   * @generated
   */
  Music createMusic();

  /**
   * Returns a new object of class '<em>Simple Music</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Music</em>'.
   * @generated
   */
  SimpleMusic createSimpleMusic();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Note</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Note</em>'.
   * @generated
   */
  Note createNote();

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
   * Returns a new object of class '<em>Rest</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rest</em>'.
   * @generated
   */
  Rest createRest();

  /**
   * Returns a new object of class '<em>Chord</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chord</em>'.
   * @generated
   */
  Chord createChord();

  /**
   * Returns a new object of class '<em>Post Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Post Event</em>'.
   * @generated
   */
  PostEvent createPostEvent();

  /**
   * Returns a new object of class '<em>Event With Required Direction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event With Required Direction</em>'.
   * @generated
   */
  EventWithRequiredDirection createEventWithRequiredDirection();

  /**
   * Returns a new object of class '<em>Gen Text Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gen Text Def</em>'.
   * @generated
   */
  GenTextDef createGenTextDef();

  /**
   * Returns a new object of class '<em>Event With Optional Direction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event With Optional Direction</em>'.
   * @generated
   */
  EventWithOptionalDirection createEventWithOptionalDirection();

  /**
   * Returns a new object of class '<em>Tremolo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tremolo</em>'.
   * @generated
   */
  Tremolo createTremolo();

  /**
   * Returns a new object of class '<em>Key Signature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key Signature</em>'.
   * @generated
   */
  KeySignature createKeySignature();

  /**
   * Returns a new object of class '<em>Time Signature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Signature</em>'.
   * @generated
   */
  TimeSignature createTimeSignature();

  /**
   * Returns a new object of class '<em>Tempo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tempo</em>'.
   * @generated
   */
  Tempo createTempo();

  /**
   * Returns a new object of class '<em>Tempo Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tempo Label</em>'.
   * @generated
   */
  TempoLabel createTempoLabel();

  /**
   * Returns a new object of class '<em>Tempo Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tempo Value</em>'.
   * @generated
   */
  TempoValue createTempoValue();

  /**
   * Returns a new object of class '<em>Partial</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Partial</em>'.
   * @generated
   */
  Partial createPartial();

  /**
   * Returns a new object of class '<em>Mark</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mark</em>'.
   * @generated
   */
  Mark createMark();

  /**
   * Returns a new object of class '<em>Skip</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Skip</em>'.
   * @generated
   */
  Skip createSkip();

  /**
   * Returns a new object of class '<em>Tie</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tie</em>'.
   * @generated
   */
  Tie createTie();

  /**
   * Returns a new object of class '<em>Beam Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Beam Start</em>'.
   * @generated
   */
  BeamStart createBeamStart();

  /**
   * Returns a new object of class '<em>Beam End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Beam End</em>'.
   * @generated
   */
  BeamEnd createBeamEnd();

  /**
   * Returns a new object of class '<em>Bar Check</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bar Check</em>'.
   * @generated
   */
  BarCheck createBarCheck();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>Composite Music</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Music</em>'.
   * @generated
   */
  CompositeMusic createCompositeMusic();

  /**
   * Returns a new object of class '<em>Sequential Music</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequential Music</em>'.
   * @generated
   */
  SequentialMusic createSequentialMusic();

  /**
   * Returns a new object of class '<em>Simultaneous Music</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simultaneous Music</em>'.
   * @generated
   */
  SimultaneousMusic createSimultaneousMusic();

  /**
   * Returns a new object of class '<em>New Context</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Context</em>'.
   * @generated
   */
  NewContext createNewContext();

  /**
   * Returns a new object of class '<em>Context Modification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Modification</em>'.
   * @generated
   */
  ContextModification createContextModification();

  /**
   * Returns a new object of class '<em>Context Modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Modifier</em>'.
   * @generated
   */
  ContextModifier createContextModifier();

  /**
   * Returns a new object of class '<em>Property Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Operation</em>'.
   * @generated
   */
  PropertyOperation createPropertyOperation();

  /**
   * Returns a new object of class '<em>Set Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Property</em>'.
   * @generated
   */
  SetProperty createSetProperty();

  /**
   * Returns a new object of class '<em>Scalar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scalar</em>'.
   * @generated
   */
  Scalar createScalar();

  /**
   * Returns a new object of class '<em>Unset Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unset Property</em>'.
   * @generated
   */
  UnsetProperty createUnsetProperty();

  /**
   * Returns a new object of class '<em>Override Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Override Property</em>'.
   * @generated
   */
  OverrideProperty createOverrideProperty();

  /**
   * Returns a new object of class '<em>Revert Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Revert Property</em>'.
   * @generated
   */
  RevertProperty createRevertProperty();

  /**
   * Returns a new object of class '<em>Context Default Modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Default Modifier</em>'.
   * @generated
   */
  ContextDefaultModifier createContextDefaultModifier();

  /**
   * Returns a new object of class '<em>Context Default Modifier Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Default Modifier Type</em>'.
   * @generated
   */
  ContextDefaultModifierType createContextDefaultModifierType();

  /**
   * Returns a new object of class '<em>Relative Music</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relative Music</em>'.
   * @generated
   */
  RelativeMusic createRelativeMusic();

  /**
   * Returns a new object of class '<em>Repeated Music</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repeated Music</em>'.
   * @generated
   */
  RepeatedMusic createRepeatedMusic();

  /**
   * Returns a new object of class '<em>Alternative Music</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alternative Music</em>'.
   * @generated
   */
  AlternativeMusic createAlternativeMusic();

  /**
   * Returns a new object of class '<em>Music Or Scheme</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Music Or Scheme</em>'.
   * @generated
   */
  MusicOrScheme createMusicOrScheme();

  /**
   * Returns a new object of class '<em>Duration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Duration</em>'.
   * @generated
   */
  Duration createDuration();

  /**
   * Returns a new object of class '<em>Duration Multiplier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Duration Multiplier</em>'.
   * @generated
   */
  DurationMultiplier createDurationMultiplier();

  /**
   * Returns a new object of class '<em>Fraction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fraction</em>'.
   * @generated
   */
  Fraction createFraction();

  /**
   * Returns a new object of class '<em>Fraction Or Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fraction Or Number</em>'.
   * @generated
   */
  FractionOrNumber createFractionOrNumber();

  /**
   * Returns a new object of class '<em>Context Change</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Change</em>'.
   * @generated
   */
  ContextChange createContextChange();

  /**
   * Returns a new object of class '<em>Music Property Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Music Property Definition</em>'.
   * @generated
   */
  MusicPropertyDefinition createMusicPropertyDefinition();

  /**
   * Returns a new object of class '<em>Music Property Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Music Property Operation</em>'.
   * @generated
   */
  MusicPropertyOperation createMusicPropertyOperation();

  /**
   * Returns a new object of class '<em>Override Music Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Override Music Property</em>'.
   * @generated
   */
  OverrideMusicProperty createOverrideMusicProperty();

  /**
   * Returns a new object of class '<em>Revert Music Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Revert Music Property</em>'.
   * @generated
   */
  RevertMusicProperty createRevertMusicProperty();

  /**
   * Returns a new object of class '<em>Set Music Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Music Property</em>'.
   * @generated
   */
  SetMusicProperty createSetMusicProperty();

  /**
   * Returns a new object of class '<em>Unset Music Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unset Music Property</em>'.
   * @generated
   */
  UnsetMusicProperty createUnsetMusicProperty();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LilyPondPackage getLilyPondPackage();

} //LilyPondFactory
