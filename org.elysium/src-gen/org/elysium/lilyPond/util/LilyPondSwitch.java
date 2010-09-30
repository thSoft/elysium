/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.elysium.lilyPond.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.elysium.lilyPond.LilyPondPackage
 * @generated
 */
public class LilyPondSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LilyPondPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilyPondSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LilyPondPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LilyPondPackage.LILY_POND:
      {
        LilyPond lilyPond = (LilyPond)theEObject;
        T result = caseLilyPond(lilyPond);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.TOPLEVEL_EXPRESSION:
      {
        ToplevelExpression toplevelExpression = (ToplevelExpression)theEObject;
        T result = caseToplevelExpression(toplevelExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = caseToplevelExpression(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SCHEME:
      {
        Scheme scheme = (Scheme)theEObject;
        T result = caseScheme(scheme);
        if (result == null) result = caseToplevelExpression(scheme);
        if (result == null) result = caseValue(scheme);
        if (result == null) result = caseScalar(scheme);
        if (result == null) result = caseMusicOrScheme(scheme);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SCHEME_EXPRESSION:
      {
        SchemeExpression schemeExpression = (SchemeExpression)theEObject;
        T result = caseSchemeExpression(schemeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SCHEME_VALUE:
      {
        SchemeValue schemeValue = (SchemeValue)theEObject;
        T result = caseSchemeValue(schemeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SCHEME_BOOLEAN:
      {
        SchemeBoolean schemeBoolean = (SchemeBoolean)theEObject;
        T result = caseSchemeBoolean(schemeBoolean);
        if (result == null) result = caseSchemeValue(schemeBoolean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SCHEME_LIST:
      {
        SchemeList schemeList = (SchemeList)theEObject;
        T result = caseSchemeList(schemeList);
        if (result == null) result = caseSchemeValue(schemeList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SCHEME_TEXT:
      {
        SchemeText schemeText = (SchemeText)theEObject;
        T result = caseSchemeText(schemeText);
        if (result == null) result = caseSchemeValue(schemeText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SCHEME_NUMBER:
      {
        SchemeNumber schemeNumber = (SchemeNumber)theEObject;
        T result = caseSchemeNumber(schemeNumber);
        if (result == null) result = caseSchemeValue(schemeNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.CONTEXT_DEFINITION:
      {
        ContextDefinition contextDefinition = (ContextDefinition)theEObject;
        T result = caseContextDefinition(contextDefinition);
        if (result == null) result = caseValue(contextDefinition);
        if (result == null) result = caseOutputDefinitionElement(contextDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.CONTEXT_DEFINITION_ELEMENT:
      {
        ContextDefinitionElement contextDefinitionElement = (ContextDefinitionElement)theEObject;
        T result = caseContextDefinitionElement(contextDefinitionElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.GROB_DESCRIPTIONS:
      {
        GrobDescriptions grobDescriptions = (GrobDescriptions)theEObject;
        T result = caseGrobDescriptions(grobDescriptions);
        if (result == null) result = caseContextDefinitionElement(grobDescriptions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.HEADER:
      {
        Header header = (Header)theEObject;
        T result = caseHeader(header);
        if (result == null) result = caseToplevelExpression(header);
        if (result == null) result = caseScoreElement(header);
        if (result == null) result = caseBookPartElement(header);
        if (result == null) result = caseBookElement(header);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.PROPERTY_ASSIGNMENT:
      {
        PropertyAssignment propertyAssignment = (PropertyAssignment)theEObject;
        T result = casePropertyAssignment(propertyAssignment);
        if (result == null) result = caseOutputDefinitionElement(propertyAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.OUTPUT_DEFINITION:
      {
        OutputDefinition outputDefinition = (OutputDefinition)theEObject;
        T result = caseOutputDefinition(outputDefinition);
        if (result == null) result = caseToplevelExpression(outputDefinition);
        if (result == null) result = caseValue(outputDefinition);
        if (result == null) result = caseScoreElement(outputDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.OUTPUT_DEFINITION_ELEMENT:
      {
        OutputDefinitionElement outputDefinitionElement = (OutputDefinitionElement)theEObject;
        T result = caseOutputDefinitionElement(outputDefinitionElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.PAPER:
      {
        Paper paper = (Paper)theEObject;
        T result = casePaper(paper);
        if (result == null) result = caseOutputDefinition(paper);
        if (result == null) result = caseBookPartElement(paper);
        if (result == null) result = caseToplevelExpression(paper);
        if (result == null) result = caseValue(paper);
        if (result == null) result = caseScoreElement(paper);
        if (result == null) result = caseBookElement(paper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.MIDI:
      {
        Midi midi = (Midi)theEObject;
        T result = caseMidi(midi);
        if (result == null) result = caseOutputDefinition(midi);
        if (result == null) result = caseToplevelExpression(midi);
        if (result == null) result = caseValue(midi);
        if (result == null) result = caseScoreElement(midi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.LAYOUT:
      {
        Layout layout = (Layout)theEObject;
        T result = caseLayout(layout);
        if (result == null) result = caseOutputDefinition(layout);
        if (result == null) result = caseToplevelExpression(layout);
        if (result == null) result = caseValue(layout);
        if (result == null) result = caseScoreElement(layout);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SCORE:
      {
        Score score = (Score)theEObject;
        T result = caseScore(score);
        if (result == null) result = caseToplevelExpression(score);
        if (result == null) result = caseValue(score);
        if (result == null) result = caseBookPartElement(score);
        if (result == null) result = caseBookElement(score);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SCORE_ELEMENT:
      {
        ScoreElement scoreElement = (ScoreElement)theEObject;
        T result = caseScoreElement(scoreElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.BOOK:
      {
        Book book = (Book)theEObject;
        T result = caseBook(book);
        if (result == null) result = caseToplevelExpression(book);
        if (result == null) result = caseValue(book);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.BOOK_ELEMENT:
      {
        BookElement bookElement = (BookElement)theEObject;
        T result = caseBookElement(bookElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.BOOK_PART:
      {
        BookPart bookPart = (BookPart)theEObject;
        T result = caseBookPart(bookPart);
        if (result == null) result = caseToplevelExpression(bookPart);
        if (result == null) result = caseValue(bookPart);
        if (result == null) result = caseBookElement(bookPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.BOOK_PART_ELEMENT:
      {
        BookPartElement bookPartElement = (BookPartElement)theEObject;
        T result = caseBookPartElement(bookPartElement);
        if (result == null) result = caseBookElement(bookPartElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.MARKUP:
      {
        Markup markup = (Markup)theEObject;
        T result = caseMarkup(markup);
        if (result == null) result = caseToplevelExpression(markup);
        if (result == null) result = caseValue(markup);
        if (result == null) result = caseBookPartElement(markup);
        if (result == null) result = caseGenTextDef(markup);
        if (result == null) result = caseTempoLabel(markup);
        if (result == null) result = caseScalar(markup);
        if (result == null) result = caseBookElement(markup);
        if (result == null) result = caseEventWithRequiredDirection(markup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.MARKUP_LINES:
      {
        MarkupLines markupLines = (MarkupLines)theEObject;
        T result = caseMarkupLines(markupLines);
        if (result == null) result = caseToplevelExpression(markupLines);
        if (result == null) result = caseBookPartElement(markupLines);
        if (result == null) result = caseBookElement(markupLines);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.VERSION:
      {
        Version version = (Version)theEObject;
        T result = caseVersion(version);
        if (result == null) result = caseToplevelExpression(version);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.INCLUDE:
      {
        Include include = (Include)theEObject;
        T result = caseInclude(include);
        if (result == null) result = caseToplevelExpression(include);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SOURCE_FILE_NAME:
      {
        SourceFileName sourceFileName = (SourceFileName)theEObject;
        T result = caseSourceFileName(sourceFileName);
        if (result == null) result = caseToplevelExpression(sourceFileName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SOURCE_FILE_LINE:
      {
        SourceFileLine sourceFileLine = (SourceFileLine)theEObject;
        T result = caseSourceFileLine(sourceFileLine);
        if (result == null) result = caseToplevelExpression(sourceFileLine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.MUSIC:
      {
        Music music = (Music)theEObject;
        T result = caseMusic(music);
        if (result == null) result = caseValue(music);
        if (result == null) result = caseScoreElement(music);
        if (result == null) result = caseMusicOrScheme(music);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SIMPLE_MUSIC:
      {
        SimpleMusic simpleMusic = (SimpleMusic)theEObject;
        T result = caseSimpleMusic(simpleMusic);
        if (result == null) result = caseMusic(simpleMusic);
        if (result == null) result = caseValue(simpleMusic);
        if (result == null) result = caseScoreElement(simpleMusic);
        if (result == null) result = caseMusicOrScheme(simpleMusic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = caseSimpleMusic(event);
        if (result == null) result = caseMusic(event);
        if (result == null) result = caseValue(event);
        if (result == null) result = caseScoreElement(event);
        if (result == null) result = caseMusicOrScheme(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.NOTE:
      {
        Note note = (Note)theEObject;
        T result = caseNote(note);
        if (result == null) result = caseEvent(note);
        if (result == null) result = caseSimpleMusic(note);
        if (result == null) result = caseMusic(note);
        if (result == null) result = caseValue(note);
        if (result == null) result = caseScoreElement(note);
        if (result == null) result = caseMusicOrScheme(note);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.PITCH:
      {
        Pitch pitch = (Pitch)theEObject;
        T result = casePitch(pitch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.OCTAVE:
      {
        Octave octave = (Octave)theEObject;
        T result = caseOctave(octave);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.REST:
      {
        Rest rest = (Rest)theEObject;
        T result = caseRest(rest);
        if (result == null) result = caseEvent(rest);
        if (result == null) result = caseSimpleMusic(rest);
        if (result == null) result = caseMusic(rest);
        if (result == null) result = caseValue(rest);
        if (result == null) result = caseScoreElement(rest);
        if (result == null) result = caseMusicOrScheme(rest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.CHORD:
      {
        Chord chord = (Chord)theEObject;
        T result = caseChord(chord);
        if (result == null) result = caseEvent(chord);
        if (result == null) result = caseSimpleMusic(chord);
        if (result == null) result = caseMusic(chord);
        if (result == null) result = caseValue(chord);
        if (result == null) result = caseScoreElement(chord);
        if (result == null) result = caseMusicOrScheme(chord);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.POST_EVENT:
      {
        PostEvent postEvent = (PostEvent)theEObject;
        T result = casePostEvent(postEvent);
        if (result == null) result = caseValue(postEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.EVENT_WITH_REQUIRED_DIRECTION:
      {
        EventWithRequiredDirection eventWithRequiredDirection = (EventWithRequiredDirection)theEObject;
        T result = caseEventWithRequiredDirection(eventWithRequiredDirection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.GEN_TEXT_DEF:
      {
        GenTextDef genTextDef = (GenTextDef)theEObject;
        T result = caseGenTextDef(genTextDef);
        if (result == null) result = caseEventWithRequiredDirection(genTextDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.EVENT_WITH_OPTIONAL_DIRECTION:
      {
        EventWithOptionalDirection eventWithOptionalDirection = (EventWithOptionalDirection)theEObject;
        T result = caseEventWithOptionalDirection(eventWithOptionalDirection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.TREMOLO:
      {
        Tremolo tremolo = (Tremolo)theEObject;
        T result = caseTremolo(tremolo);
        if (result == null) result = caseEventWithOptionalDirection(tremolo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.KEY_SIGNATURE:
      {
        KeySignature keySignature = (KeySignature)theEObject;
        T result = caseKeySignature(keySignature);
        if (result == null) result = caseEvent(keySignature);
        if (result == null) result = caseSimpleMusic(keySignature);
        if (result == null) result = caseMusic(keySignature);
        if (result == null) result = caseValue(keySignature);
        if (result == null) result = caseScoreElement(keySignature);
        if (result == null) result = caseMusicOrScheme(keySignature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.TIME_SIGNATURE:
      {
        TimeSignature timeSignature = (TimeSignature)theEObject;
        T result = caseTimeSignature(timeSignature);
        if (result == null) result = caseEvent(timeSignature);
        if (result == null) result = caseSimpleMusic(timeSignature);
        if (result == null) result = caseMusic(timeSignature);
        if (result == null) result = caseValue(timeSignature);
        if (result == null) result = caseScoreElement(timeSignature);
        if (result == null) result = caseMusicOrScheme(timeSignature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.TEMPO:
      {
        Tempo tempo = (Tempo)theEObject;
        T result = caseTempo(tempo);
        if (result == null) result = caseEvent(tempo);
        if (result == null) result = caseSimpleMusic(tempo);
        if (result == null) result = caseMusic(tempo);
        if (result == null) result = caseValue(tempo);
        if (result == null) result = caseScoreElement(tempo);
        if (result == null) result = caseMusicOrScheme(tempo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.TEMPO_LABEL:
      {
        TempoLabel tempoLabel = (TempoLabel)theEObject;
        T result = caseTempoLabel(tempoLabel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.TEMPO_VALUE:
      {
        TempoValue tempoValue = (TempoValue)theEObject;
        T result = caseTempoValue(tempoValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.PARTIAL:
      {
        Partial partial = (Partial)theEObject;
        T result = casePartial(partial);
        if (result == null) result = caseEvent(partial);
        if (result == null) result = caseSimpleMusic(partial);
        if (result == null) result = caseMusic(partial);
        if (result == null) result = caseValue(partial);
        if (result == null) result = caseScoreElement(partial);
        if (result == null) result = caseMusicOrScheme(partial);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.MARK:
      {
        Mark mark = (Mark)theEObject;
        T result = caseMark(mark);
        if (result == null) result = caseEvent(mark);
        if (result == null) result = caseSimpleMusic(mark);
        if (result == null) result = caseMusic(mark);
        if (result == null) result = caseValue(mark);
        if (result == null) result = caseScoreElement(mark);
        if (result == null) result = caseMusicOrScheme(mark);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SKIP:
      {
        Skip skip = (Skip)theEObject;
        T result = caseSkip(skip);
        if (result == null) result = caseEvent(skip);
        if (result == null) result = caseSimpleMusic(skip);
        if (result == null) result = caseMusic(skip);
        if (result == null) result = caseValue(skip);
        if (result == null) result = caseScoreElement(skip);
        if (result == null) result = caseMusicOrScheme(skip);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.TIE:
      {
        Tie tie = (Tie)theEObject;
        T result = caseTie(tie);
        if (result == null) result = caseEvent(tie);
        if (result == null) result = caseSimpleMusic(tie);
        if (result == null) result = caseMusic(tie);
        if (result == null) result = caseValue(tie);
        if (result == null) result = caseScoreElement(tie);
        if (result == null) result = caseMusicOrScheme(tie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.BEAM_START:
      {
        BeamStart beamStart = (BeamStart)theEObject;
        T result = caseBeamStart(beamStart);
        if (result == null) result = caseEvent(beamStart);
        if (result == null) result = caseSimpleMusic(beamStart);
        if (result == null) result = caseMusic(beamStart);
        if (result == null) result = caseValue(beamStart);
        if (result == null) result = caseScoreElement(beamStart);
        if (result == null) result = caseMusicOrScheme(beamStart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.BEAM_END:
      {
        BeamEnd beamEnd = (BeamEnd)theEObject;
        T result = caseBeamEnd(beamEnd);
        if (result == null) result = caseEvent(beamEnd);
        if (result == null) result = caseSimpleMusic(beamEnd);
        if (result == null) result = caseMusic(beamEnd);
        if (result == null) result = caseValue(beamEnd);
        if (result == null) result = caseScoreElement(beamEnd);
        if (result == null) result = caseMusicOrScheme(beamEnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.BAR_CHECK:
      {
        BarCheck barCheck = (BarCheck)theEObject;
        T result = caseBarCheck(barCheck);
        if (result == null) result = caseEvent(barCheck);
        if (result == null) result = caseSimpleMusic(barCheck);
        if (result == null) result = caseMusic(barCheck);
        if (result == null) result = caseValue(barCheck);
        if (result == null) result = caseScoreElement(barCheck);
        if (result == null) result = caseMusicOrScheme(barCheck);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = caseEvent(reference);
        if (result == null) result = caseSimpleMusic(reference);
        if (result == null) result = caseMusic(reference);
        if (result == null) result = caseValue(reference);
        if (result == null) result = caseScoreElement(reference);
        if (result == null) result = caseMusicOrScheme(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.COMPOSITE_MUSIC:
      {
        CompositeMusic compositeMusic = (CompositeMusic)theEObject;
        T result = caseCompositeMusic(compositeMusic);
        if (result == null) result = caseToplevelExpression(compositeMusic);
        if (result == null) result = caseBookPartElement(compositeMusic);
        if (result == null) result = caseMusic(compositeMusic);
        if (result == null) result = caseBookElement(compositeMusic);
        if (result == null) result = caseValue(compositeMusic);
        if (result == null) result = caseScoreElement(compositeMusic);
        if (result == null) result = caseMusicOrScheme(compositeMusic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SEQUENTIAL_MUSIC:
      {
        SequentialMusic sequentialMusic = (SequentialMusic)theEObject;
        T result = caseSequentialMusic(sequentialMusic);
        if (result == null) result = caseCompositeMusic(sequentialMusic);
        if (result == null) result = caseToplevelExpression(sequentialMusic);
        if (result == null) result = caseBookPartElement(sequentialMusic);
        if (result == null) result = caseMusic(sequentialMusic);
        if (result == null) result = caseBookElement(sequentialMusic);
        if (result == null) result = caseValue(sequentialMusic);
        if (result == null) result = caseScoreElement(sequentialMusic);
        if (result == null) result = caseMusicOrScheme(sequentialMusic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SIMULTANEOUS_MUSIC:
      {
        SimultaneousMusic simultaneousMusic = (SimultaneousMusic)theEObject;
        T result = caseSimultaneousMusic(simultaneousMusic);
        if (result == null) result = caseCompositeMusic(simultaneousMusic);
        if (result == null) result = caseToplevelExpression(simultaneousMusic);
        if (result == null) result = caseBookPartElement(simultaneousMusic);
        if (result == null) result = caseMusic(simultaneousMusic);
        if (result == null) result = caseBookElement(simultaneousMusic);
        if (result == null) result = caseValue(simultaneousMusic);
        if (result == null) result = caseScoreElement(simultaneousMusic);
        if (result == null) result = caseMusicOrScheme(simultaneousMusic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.NEW_CONTEXT:
      {
        NewContext newContext = (NewContext)theEObject;
        T result = caseNewContext(newContext);
        if (result == null) result = caseCompositeMusic(newContext);
        if (result == null) result = caseToplevelExpression(newContext);
        if (result == null) result = caseBookPartElement(newContext);
        if (result == null) result = caseMusic(newContext);
        if (result == null) result = caseBookElement(newContext);
        if (result == null) result = caseValue(newContext);
        if (result == null) result = caseScoreElement(newContext);
        if (result == null) result = caseMusicOrScheme(newContext);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.CONTEXT_MODIFICATION:
      {
        ContextModification contextModification = (ContextModification)theEObject;
        T result = caseContextModification(contextModification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.CONTEXT_MODIFIER:
      {
        ContextModifier contextModifier = (ContextModifier)theEObject;
        T result = caseContextModifier(contextModifier);
        if (result == null) result = caseContextDefinitionElement(contextModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.PROPERTY_OPERATION:
      {
        PropertyOperation propertyOperation = (PropertyOperation)theEObject;
        T result = casePropertyOperation(propertyOperation);
        if (result == null) result = caseContextModifier(propertyOperation);
        if (result == null) result = caseContextDefinitionElement(propertyOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SET_PROPERTY:
      {
        SetProperty setProperty = (SetProperty)theEObject;
        T result = caseSetProperty(setProperty);
        if (result == null) result = casePropertyOperation(setProperty);
        if (result == null) result = caseContextModifier(setProperty);
        if (result == null) result = caseContextDefinitionElement(setProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SCALAR:
      {
        Scalar scalar = (Scalar)theEObject;
        T result = caseScalar(scalar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.UNSET_PROPERTY:
      {
        UnsetProperty unsetProperty = (UnsetProperty)theEObject;
        T result = caseUnsetProperty(unsetProperty);
        if (result == null) result = casePropertyOperation(unsetProperty);
        if (result == null) result = caseContextModifier(unsetProperty);
        if (result == null) result = caseContextDefinitionElement(unsetProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.OVERRIDE_PROPERTY:
      {
        OverrideProperty overrideProperty = (OverrideProperty)theEObject;
        T result = caseOverrideProperty(overrideProperty);
        if (result == null) result = casePropertyOperation(overrideProperty);
        if (result == null) result = caseContextModifier(overrideProperty);
        if (result == null) result = caseContextDefinitionElement(overrideProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.REVERT_PROPERTY:
      {
        RevertProperty revertProperty = (RevertProperty)theEObject;
        T result = caseRevertProperty(revertProperty);
        if (result == null) result = casePropertyOperation(revertProperty);
        if (result == null) result = caseContextModifier(revertProperty);
        if (result == null) result = caseContextDefinitionElement(revertProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.CONTEXT_DEFAULT_MODIFIER:
      {
        ContextDefaultModifier contextDefaultModifier = (ContextDefaultModifier)theEObject;
        T result = caseContextDefaultModifier(contextDefaultModifier);
        if (result == null) result = caseContextModifier(contextDefaultModifier);
        if (result == null) result = caseContextDefinitionElement(contextDefaultModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.CONTEXT_DEFAULT_MODIFIER_TYPE:
      {
        ContextDefaultModifierType contextDefaultModifierType = (ContextDefaultModifierType)theEObject;
        T result = caseContextDefaultModifierType(contextDefaultModifierType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.RELATIVE_MUSIC:
      {
        RelativeMusic relativeMusic = (RelativeMusic)theEObject;
        T result = caseRelativeMusic(relativeMusic);
        if (result == null) result = caseCompositeMusic(relativeMusic);
        if (result == null) result = caseToplevelExpression(relativeMusic);
        if (result == null) result = caseBookPartElement(relativeMusic);
        if (result == null) result = caseMusic(relativeMusic);
        if (result == null) result = caseBookElement(relativeMusic);
        if (result == null) result = caseValue(relativeMusic);
        if (result == null) result = caseScoreElement(relativeMusic);
        if (result == null) result = caseMusicOrScheme(relativeMusic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.REPEATED_MUSIC:
      {
        RepeatedMusic repeatedMusic = (RepeatedMusic)theEObject;
        T result = caseRepeatedMusic(repeatedMusic);
        if (result == null) result = caseCompositeMusic(repeatedMusic);
        if (result == null) result = caseToplevelExpression(repeatedMusic);
        if (result == null) result = caseBookPartElement(repeatedMusic);
        if (result == null) result = caseMusic(repeatedMusic);
        if (result == null) result = caseBookElement(repeatedMusic);
        if (result == null) result = caseValue(repeatedMusic);
        if (result == null) result = caseScoreElement(repeatedMusic);
        if (result == null) result = caseMusicOrScheme(repeatedMusic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.ALTERNATIVE_MUSIC:
      {
        AlternativeMusic alternativeMusic = (AlternativeMusic)theEObject;
        T result = caseAlternativeMusic(alternativeMusic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.MUSIC_OR_SCHEME:
      {
        MusicOrScheme musicOrScheme = (MusicOrScheme)theEObject;
        T result = caseMusicOrScheme(musicOrScheme);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.DURATION:
      {
        Duration duration = (Duration)theEObject;
        T result = caseDuration(duration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.DURATION_MULTIPLIER:
      {
        DurationMultiplier durationMultiplier = (DurationMultiplier)theEObject;
        T result = caseDurationMultiplier(durationMultiplier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.FRACTION:
      {
        Fraction fraction = (Fraction)theEObject;
        T result = caseFraction(fraction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.FRACTION_OR_NUMBER:
      {
        FractionOrNumber fractionOrNumber = (FractionOrNumber)theEObject;
        T result = caseFractionOrNumber(fractionOrNumber);
        if (result == null) result = caseDurationMultiplier(fractionOrNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.CONTEXT_CHANGE:
      {
        ContextChange contextChange = (ContextChange)theEObject;
        T result = caseContextChange(contextChange);
        if (result == null) result = caseSimpleMusic(contextChange);
        if (result == null) result = caseMusic(contextChange);
        if (result == null) result = caseValue(contextChange);
        if (result == null) result = caseScoreElement(contextChange);
        if (result == null) result = caseMusicOrScheme(contextChange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.MUSIC_PROPERTY_DEFINITION:
      {
        MusicPropertyDefinition musicPropertyDefinition = (MusicPropertyDefinition)theEObject;
        T result = caseMusicPropertyDefinition(musicPropertyDefinition);
        if (result == null) result = caseSimpleMusic(musicPropertyDefinition);
        if (result == null) result = caseMusic(musicPropertyDefinition);
        if (result == null) result = caseValue(musicPropertyDefinition);
        if (result == null) result = caseScoreElement(musicPropertyDefinition);
        if (result == null) result = caseMusicOrScheme(musicPropertyDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.MUSIC_PROPERTY_OPERATION:
      {
        MusicPropertyOperation musicPropertyOperation = (MusicPropertyOperation)theEObject;
        T result = caseMusicPropertyOperation(musicPropertyOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.OVERRIDE_MUSIC_PROPERTY:
      {
        OverrideMusicProperty overrideMusicProperty = (OverrideMusicProperty)theEObject;
        T result = caseOverrideMusicProperty(overrideMusicProperty);
        if (result == null) result = caseMusicPropertyOperation(overrideMusicProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.REVERT_MUSIC_PROPERTY:
      {
        RevertMusicProperty revertMusicProperty = (RevertMusicProperty)theEObject;
        T result = caseRevertMusicProperty(revertMusicProperty);
        if (result == null) result = caseMusicPropertyOperation(revertMusicProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SET_MUSIC_PROPERTY:
      {
        SetMusicProperty setMusicProperty = (SetMusicProperty)theEObject;
        T result = caseSetMusicProperty(setMusicProperty);
        if (result == null) result = caseMusicPropertyOperation(setMusicProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.UNSET_MUSIC_PROPERTY:
      {
        UnsetMusicProperty unsetMusicProperty = (UnsetMusicProperty)theEObject;
        T result = caseUnsetMusicProperty(unsetMusicProperty);
        if (result == null) result = caseMusicPropertyOperation(unsetMusicProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lily Pond</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lily Pond</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLilyPond(LilyPond object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Toplevel Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Toplevel Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToplevelExpression(ToplevelExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment(Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scheme</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scheme</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScheme(Scheme object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scheme Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scheme Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemeExpression(SchemeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scheme Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scheme Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemeValue(SchemeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scheme Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scheme Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemeBoolean(SchemeBoolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scheme List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scheme List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemeList(SchemeList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scheme Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scheme Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemeText(SchemeText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scheme Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scheme Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemeNumber(SchemeNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextDefinition(ContextDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Definition Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Definition Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextDefinitionElement(ContextDefinitionElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grob Descriptions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grob Descriptions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGrobDescriptions(GrobDescriptions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeader(Header object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyAssignment(PropertyAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputDefinition(OutputDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Definition Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Definition Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputDefinitionElement(OutputDefinitionElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePaper(Paper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Midi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Midi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMidi(Midi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayout(Layout object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Score</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Score</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScore(Score object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Score Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Score Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScoreElement(ScoreElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Book</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Book</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBook(Book object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Book Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Book Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBookElement(BookElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Book Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Book Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBookPart(BookPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Book Part Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Book Part Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBookPartElement(BookPartElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Markup</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Markup</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMarkup(Markup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Markup Lines</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Markup Lines</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMarkupLines(MarkupLines object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Version</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVersion(Version object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInclude(Include object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Source File Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Source File Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSourceFileName(SourceFileName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Source File Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Source File Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSourceFileLine(SourceFileLine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Music</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Music</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMusic(Music object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Music</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Music</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleMusic(SimpleMusic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Note</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNote(Note object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pitch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pitch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePitch(Pitch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Octave</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Octave</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOctave(Octave object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rest</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rest</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRest(Rest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chord</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chord</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChord(Chord object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Post Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Post Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostEvent(PostEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event With Required Direction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event With Required Direction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventWithRequiredDirection(EventWithRequiredDirection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gen Text Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gen Text Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGenTextDef(GenTextDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event With Optional Direction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event With Optional Direction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventWithOptionalDirection(EventWithOptionalDirection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tremolo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tremolo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTremolo(Tremolo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Signature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Signature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeySignature(KeySignature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Signature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Signature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeSignature(TimeSignature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tempo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tempo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTempo(Tempo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tempo Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tempo Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTempoLabel(TempoLabel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tempo Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tempo Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTempoValue(TempoValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Partial</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Partial</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePartial(Partial object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mark</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mark</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMark(Mark object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Skip</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Skip</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSkip(Skip object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tie</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tie</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTie(Tie object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Beam Start</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Beam Start</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBeamStart(BeamStart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Beam End</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Beam End</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBeamEnd(BeamEnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bar Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bar Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBarCheck(BarCheck object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Music</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Music</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeMusic(CompositeMusic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequential Music</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequential Music</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequentialMusic(SequentialMusic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simultaneous Music</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simultaneous Music</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimultaneousMusic(SimultaneousMusic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewContext(NewContext object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Modification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Modification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextModification(ContextModification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextModifier(ContextModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyOperation(PropertyOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetProperty(SetProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scalar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scalar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScalar(Scalar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unset Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unset Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnsetProperty(UnsetProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Override Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Override Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOverrideProperty(OverrideProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Revert Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Revert Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRevertProperty(RevertProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Default Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Default Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextDefaultModifier(ContextDefaultModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Default Modifier Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Default Modifier Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextDefaultModifierType(ContextDefaultModifierType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relative Music</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relative Music</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelativeMusic(RelativeMusic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repeated Music</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repeated Music</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepeatedMusic(RepeatedMusic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alternative Music</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alternative Music</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlternativeMusic(AlternativeMusic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Music Or Scheme</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Music Or Scheme</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMusicOrScheme(MusicOrScheme object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDuration(Duration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Duration Multiplier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Duration Multiplier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDurationMultiplier(DurationMultiplier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fraction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fraction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFraction(Fraction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fraction Or Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fraction Or Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFractionOrNumber(FractionOrNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Change</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Change</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextChange(ContextChange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Music Property Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Music Property Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMusicPropertyDefinition(MusicPropertyDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Music Property Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Music Property Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMusicPropertyOperation(MusicPropertyOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Override Music Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Override Music Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOverrideMusicProperty(OverrideMusicProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Revert Music Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Revert Music Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRevertMusicProperty(RevertMusicProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Music Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Music Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetMusicProperty(SetMusicProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unset Music Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unset Music Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnsetMusicProperty(UnsetMusicProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LilyPondSwitch
