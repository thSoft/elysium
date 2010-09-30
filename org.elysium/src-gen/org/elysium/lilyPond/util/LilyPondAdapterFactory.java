/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.elysium.lilyPond.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.elysium.lilyPond.LilyPondPackage
 * @generated
 */
public class LilyPondAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LilyPondPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilyPondAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LilyPondPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LilyPondSwitch<Adapter> modelSwitch =
    new LilyPondSwitch<Adapter>()
    {
      @Override
      public Adapter caseLilyPond(LilyPond object)
      {
        return createLilyPondAdapter();
      }
      @Override
      public Adapter caseToplevelExpression(ToplevelExpression object)
      {
        return createToplevelExpressionAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseScheme(Scheme object)
      {
        return createSchemeAdapter();
      }
      @Override
      public Adapter caseSchemeExpression(SchemeExpression object)
      {
        return createSchemeExpressionAdapter();
      }
      @Override
      public Adapter caseSchemeValue(SchemeValue object)
      {
        return createSchemeValueAdapter();
      }
      @Override
      public Adapter caseSchemeBoolean(SchemeBoolean object)
      {
        return createSchemeBooleanAdapter();
      }
      @Override
      public Adapter caseSchemeList(SchemeList object)
      {
        return createSchemeListAdapter();
      }
      @Override
      public Adapter caseSchemeText(SchemeText object)
      {
        return createSchemeTextAdapter();
      }
      @Override
      public Adapter caseSchemeNumber(SchemeNumber object)
      {
        return createSchemeNumberAdapter();
      }
      @Override
      public Adapter caseContextDefinition(ContextDefinition object)
      {
        return createContextDefinitionAdapter();
      }
      @Override
      public Adapter caseContextDefinitionElement(ContextDefinitionElement object)
      {
        return createContextDefinitionElementAdapter();
      }
      @Override
      public Adapter caseGrobDescriptions(GrobDescriptions object)
      {
        return createGrobDescriptionsAdapter();
      }
      @Override
      public Adapter caseHeader(Header object)
      {
        return createHeaderAdapter();
      }
      @Override
      public Adapter casePropertyAssignment(PropertyAssignment object)
      {
        return createPropertyAssignmentAdapter();
      }
      @Override
      public Adapter caseOutputDefinition(OutputDefinition object)
      {
        return createOutputDefinitionAdapter();
      }
      @Override
      public Adapter caseOutputDefinitionElement(OutputDefinitionElement object)
      {
        return createOutputDefinitionElementAdapter();
      }
      @Override
      public Adapter casePaper(Paper object)
      {
        return createPaperAdapter();
      }
      @Override
      public Adapter caseMidi(Midi object)
      {
        return createMidiAdapter();
      }
      @Override
      public Adapter caseLayout(Layout object)
      {
        return createLayoutAdapter();
      }
      @Override
      public Adapter caseScore(Score object)
      {
        return createScoreAdapter();
      }
      @Override
      public Adapter caseScoreElement(ScoreElement object)
      {
        return createScoreElementAdapter();
      }
      @Override
      public Adapter caseBook(Book object)
      {
        return createBookAdapter();
      }
      @Override
      public Adapter caseBookElement(BookElement object)
      {
        return createBookElementAdapter();
      }
      @Override
      public Adapter caseBookPart(BookPart object)
      {
        return createBookPartAdapter();
      }
      @Override
      public Adapter caseBookPartElement(BookPartElement object)
      {
        return createBookPartElementAdapter();
      }
      @Override
      public Adapter caseMarkup(Markup object)
      {
        return createMarkupAdapter();
      }
      @Override
      public Adapter caseMarkupLines(MarkupLines object)
      {
        return createMarkupLinesAdapter();
      }
      @Override
      public Adapter caseVersion(Version object)
      {
        return createVersionAdapter();
      }
      @Override
      public Adapter caseInclude(Include object)
      {
        return createIncludeAdapter();
      }
      @Override
      public Adapter caseSourceFileName(SourceFileName object)
      {
        return createSourceFileNameAdapter();
      }
      @Override
      public Adapter caseSourceFileLine(SourceFileLine object)
      {
        return createSourceFileLineAdapter();
      }
      @Override
      public Adapter caseMusic(Music object)
      {
        return createMusicAdapter();
      }
      @Override
      public Adapter caseSimpleMusic(SimpleMusic object)
      {
        return createSimpleMusicAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseNote(Note object)
      {
        return createNoteAdapter();
      }
      @Override
      public Adapter casePitch(Pitch object)
      {
        return createPitchAdapter();
      }
      @Override
      public Adapter caseOctave(Octave object)
      {
        return createOctaveAdapter();
      }
      @Override
      public Adapter caseRest(Rest object)
      {
        return createRestAdapter();
      }
      @Override
      public Adapter caseChord(Chord object)
      {
        return createChordAdapter();
      }
      @Override
      public Adapter casePostEvent(PostEvent object)
      {
        return createPostEventAdapter();
      }
      @Override
      public Adapter caseEventWithRequiredDirection(EventWithRequiredDirection object)
      {
        return createEventWithRequiredDirectionAdapter();
      }
      @Override
      public Adapter caseGenTextDef(GenTextDef object)
      {
        return createGenTextDefAdapter();
      }
      @Override
      public Adapter caseEventWithOptionalDirection(EventWithOptionalDirection object)
      {
        return createEventWithOptionalDirectionAdapter();
      }
      @Override
      public Adapter caseTremolo(Tremolo object)
      {
        return createTremoloAdapter();
      }
      @Override
      public Adapter caseKeySignature(KeySignature object)
      {
        return createKeySignatureAdapter();
      }
      @Override
      public Adapter caseTimeSignature(TimeSignature object)
      {
        return createTimeSignatureAdapter();
      }
      @Override
      public Adapter caseTempo(Tempo object)
      {
        return createTempoAdapter();
      }
      @Override
      public Adapter caseTempoLabel(TempoLabel object)
      {
        return createTempoLabelAdapter();
      }
      @Override
      public Adapter caseTempoValue(TempoValue object)
      {
        return createTempoValueAdapter();
      }
      @Override
      public Adapter casePartial(Partial object)
      {
        return createPartialAdapter();
      }
      @Override
      public Adapter caseMark(Mark object)
      {
        return createMarkAdapter();
      }
      @Override
      public Adapter caseSkip(Skip object)
      {
        return createSkipAdapter();
      }
      @Override
      public Adapter caseTie(Tie object)
      {
        return createTieAdapter();
      }
      @Override
      public Adapter caseBeamStart(BeamStart object)
      {
        return createBeamStartAdapter();
      }
      @Override
      public Adapter caseBeamEnd(BeamEnd object)
      {
        return createBeamEndAdapter();
      }
      @Override
      public Adapter caseBarCheck(BarCheck object)
      {
        return createBarCheckAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseCompositeMusic(CompositeMusic object)
      {
        return createCompositeMusicAdapter();
      }
      @Override
      public Adapter caseSequentialMusic(SequentialMusic object)
      {
        return createSequentialMusicAdapter();
      }
      @Override
      public Adapter caseSimultaneousMusic(SimultaneousMusic object)
      {
        return createSimultaneousMusicAdapter();
      }
      @Override
      public Adapter caseNewContext(NewContext object)
      {
        return createNewContextAdapter();
      }
      @Override
      public Adapter caseContextModification(ContextModification object)
      {
        return createContextModificationAdapter();
      }
      @Override
      public Adapter caseContextModifier(ContextModifier object)
      {
        return createContextModifierAdapter();
      }
      @Override
      public Adapter casePropertyOperation(PropertyOperation object)
      {
        return createPropertyOperationAdapter();
      }
      @Override
      public Adapter caseSetProperty(SetProperty object)
      {
        return createSetPropertyAdapter();
      }
      @Override
      public Adapter caseScalar(Scalar object)
      {
        return createScalarAdapter();
      }
      @Override
      public Adapter caseUnsetProperty(UnsetProperty object)
      {
        return createUnsetPropertyAdapter();
      }
      @Override
      public Adapter caseOverrideProperty(OverrideProperty object)
      {
        return createOverridePropertyAdapter();
      }
      @Override
      public Adapter caseRevertProperty(RevertProperty object)
      {
        return createRevertPropertyAdapter();
      }
      @Override
      public Adapter caseContextDefaultModifier(ContextDefaultModifier object)
      {
        return createContextDefaultModifierAdapter();
      }
      @Override
      public Adapter caseContextDefaultModifierType(ContextDefaultModifierType object)
      {
        return createContextDefaultModifierTypeAdapter();
      }
      @Override
      public Adapter caseRelativeMusic(RelativeMusic object)
      {
        return createRelativeMusicAdapter();
      }
      @Override
      public Adapter caseRepeatedMusic(RepeatedMusic object)
      {
        return createRepeatedMusicAdapter();
      }
      @Override
      public Adapter caseAlternativeMusic(AlternativeMusic object)
      {
        return createAlternativeMusicAdapter();
      }
      @Override
      public Adapter caseMusicOrScheme(MusicOrScheme object)
      {
        return createMusicOrSchemeAdapter();
      }
      @Override
      public Adapter caseDuration(Duration object)
      {
        return createDurationAdapter();
      }
      @Override
      public Adapter caseDurationMultiplier(DurationMultiplier object)
      {
        return createDurationMultiplierAdapter();
      }
      @Override
      public Adapter caseFraction(Fraction object)
      {
        return createFractionAdapter();
      }
      @Override
      public Adapter caseFractionOrNumber(FractionOrNumber object)
      {
        return createFractionOrNumberAdapter();
      }
      @Override
      public Adapter caseContextChange(ContextChange object)
      {
        return createContextChangeAdapter();
      }
      @Override
      public Adapter caseMusicPropertyDefinition(MusicPropertyDefinition object)
      {
        return createMusicPropertyDefinitionAdapter();
      }
      @Override
      public Adapter caseMusicPropertyOperation(MusicPropertyOperation object)
      {
        return createMusicPropertyOperationAdapter();
      }
      @Override
      public Adapter caseOverrideMusicProperty(OverrideMusicProperty object)
      {
        return createOverrideMusicPropertyAdapter();
      }
      @Override
      public Adapter caseRevertMusicProperty(RevertMusicProperty object)
      {
        return createRevertMusicPropertyAdapter();
      }
      @Override
      public Adapter caseSetMusicProperty(SetMusicProperty object)
      {
        return createSetMusicPropertyAdapter();
      }
      @Override
      public Adapter caseUnsetMusicProperty(UnsetMusicProperty object)
      {
        return createUnsetMusicPropertyAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.LilyPond <em>Lily Pond</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.LilyPond
   * @generated
   */
  public Adapter createLilyPondAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.ToplevelExpression <em>Toplevel Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.ToplevelExpression
   * @generated
   */
  public Adapter createToplevelExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Scheme <em>Scheme</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Scheme
   * @generated
   */
  public Adapter createSchemeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SchemeExpression <em>Scheme Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SchemeExpression
   * @generated
   */
  public Adapter createSchemeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SchemeValue <em>Scheme Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SchemeValue
   * @generated
   */
  public Adapter createSchemeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SchemeBoolean <em>Scheme Boolean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SchemeBoolean
   * @generated
   */
  public Adapter createSchemeBooleanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SchemeList <em>Scheme List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SchemeList
   * @generated
   */
  public Adapter createSchemeListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SchemeText <em>Scheme Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SchemeText
   * @generated
   */
  public Adapter createSchemeTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SchemeNumber <em>Scheme Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SchemeNumber
   * @generated
   */
  public Adapter createSchemeNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.ContextDefinition <em>Context Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.ContextDefinition
   * @generated
   */
  public Adapter createContextDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.ContextDefinitionElement <em>Context Definition Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.ContextDefinitionElement
   * @generated
   */
  public Adapter createContextDefinitionElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.GrobDescriptions <em>Grob Descriptions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.GrobDescriptions
   * @generated
   */
  public Adapter createGrobDescriptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Header
   * @generated
   */
  public Adapter createHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.PropertyAssignment <em>Property Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.PropertyAssignment
   * @generated
   */
  public Adapter createPropertyAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.OutputDefinition <em>Output Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.OutputDefinition
   * @generated
   */
  public Adapter createOutputDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.OutputDefinitionElement <em>Output Definition Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.OutputDefinitionElement
   * @generated
   */
  public Adapter createOutputDefinitionElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Paper <em>Paper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Paper
   * @generated
   */
  public Adapter createPaperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Midi <em>Midi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Midi
   * @generated
   */
  public Adapter createMidiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Layout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Layout
   * @generated
   */
  public Adapter createLayoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Score <em>Score</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Score
   * @generated
   */
  public Adapter createScoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.ScoreElement <em>Score Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.ScoreElement
   * @generated
   */
  public Adapter createScoreElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Book <em>Book</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Book
   * @generated
   */
  public Adapter createBookAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.BookElement <em>Book Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.BookElement
   * @generated
   */
  public Adapter createBookElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.BookPart <em>Book Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.BookPart
   * @generated
   */
  public Adapter createBookPartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.BookPartElement <em>Book Part Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.BookPartElement
   * @generated
   */
  public Adapter createBookPartElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Markup <em>Markup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Markup
   * @generated
   */
  public Adapter createMarkupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.MarkupLines <em>Markup Lines</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.MarkupLines
   * @generated
   */
  public Adapter createMarkupLinesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Version
   * @generated
   */
  public Adapter createVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Include
   * @generated
   */
  public Adapter createIncludeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SourceFileName <em>Source File Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SourceFileName
   * @generated
   */
  public Adapter createSourceFileNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SourceFileLine <em>Source File Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SourceFileLine
   * @generated
   */
  public Adapter createSourceFileLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Music <em>Music</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Music
   * @generated
   */
  public Adapter createMusicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SimpleMusic <em>Simple Music</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SimpleMusic
   * @generated
   */
  public Adapter createSimpleMusicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Note
   * @generated
   */
  public Adapter createNoteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Pitch <em>Pitch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Pitch
   * @generated
   */
  public Adapter createPitchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Octave <em>Octave</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Octave
   * @generated
   */
  public Adapter createOctaveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Rest <em>Rest</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Rest
   * @generated
   */
  public Adapter createRestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Chord <em>Chord</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Chord
   * @generated
   */
  public Adapter createChordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.PostEvent <em>Post Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.PostEvent
   * @generated
   */
  public Adapter createPostEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.EventWithRequiredDirection <em>Event With Required Direction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.EventWithRequiredDirection
   * @generated
   */
  public Adapter createEventWithRequiredDirectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.GenTextDef <em>Gen Text Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.GenTextDef
   * @generated
   */
  public Adapter createGenTextDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.EventWithOptionalDirection <em>Event With Optional Direction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.EventWithOptionalDirection
   * @generated
   */
  public Adapter createEventWithOptionalDirectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Tremolo <em>Tremolo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Tremolo
   * @generated
   */
  public Adapter createTremoloAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.KeySignature <em>Key Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.KeySignature
   * @generated
   */
  public Adapter createKeySignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.TimeSignature <em>Time Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.TimeSignature
   * @generated
   */
  public Adapter createTimeSignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Tempo <em>Tempo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Tempo
   * @generated
   */
  public Adapter createTempoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.TempoLabel <em>Tempo Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.TempoLabel
   * @generated
   */
  public Adapter createTempoLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.TempoValue <em>Tempo Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.TempoValue
   * @generated
   */
  public Adapter createTempoValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Partial <em>Partial</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Partial
   * @generated
   */
  public Adapter createPartialAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Mark <em>Mark</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Mark
   * @generated
   */
  public Adapter createMarkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Skip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Skip
   * @generated
   */
  public Adapter createSkipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Tie <em>Tie</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Tie
   * @generated
   */
  public Adapter createTieAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.BeamStart <em>Beam Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.BeamStart
   * @generated
   */
  public Adapter createBeamStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.BeamEnd <em>Beam End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.BeamEnd
   * @generated
   */
  public Adapter createBeamEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.BarCheck <em>Bar Check</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.BarCheck
   * @generated
   */
  public Adapter createBarCheckAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.CompositeMusic <em>Composite Music</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.CompositeMusic
   * @generated
   */
  public Adapter createCompositeMusicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SequentialMusic <em>Sequential Music</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SequentialMusic
   * @generated
   */
  public Adapter createSequentialMusicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SimultaneousMusic <em>Simultaneous Music</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SimultaneousMusic
   * @generated
   */
  public Adapter createSimultaneousMusicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.NewContext <em>New Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.NewContext
   * @generated
   */
  public Adapter createNewContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.ContextModification <em>Context Modification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.ContextModification
   * @generated
   */
  public Adapter createContextModificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.ContextModifier <em>Context Modifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.ContextModifier
   * @generated
   */
  public Adapter createContextModifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.PropertyOperation <em>Property Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.PropertyOperation
   * @generated
   */
  public Adapter createPropertyOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SetProperty <em>Set Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SetProperty
   * @generated
   */
  public Adapter createSetPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Scalar <em>Scalar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Scalar
   * @generated
   */
  public Adapter createScalarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.UnsetProperty <em>Unset Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.UnsetProperty
   * @generated
   */
  public Adapter createUnsetPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.OverrideProperty <em>Override Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.OverrideProperty
   * @generated
   */
  public Adapter createOverridePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.RevertProperty <em>Revert Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.RevertProperty
   * @generated
   */
  public Adapter createRevertPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.ContextDefaultModifier <em>Context Default Modifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.ContextDefaultModifier
   * @generated
   */
  public Adapter createContextDefaultModifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.ContextDefaultModifierType <em>Context Default Modifier Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.ContextDefaultModifierType
   * @generated
   */
  public Adapter createContextDefaultModifierTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.RelativeMusic <em>Relative Music</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.RelativeMusic
   * @generated
   */
  public Adapter createRelativeMusicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.RepeatedMusic <em>Repeated Music</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.RepeatedMusic
   * @generated
   */
  public Adapter createRepeatedMusicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.AlternativeMusic <em>Alternative Music</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.AlternativeMusic
   * @generated
   */
  public Adapter createAlternativeMusicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.MusicOrScheme <em>Music Or Scheme</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.MusicOrScheme
   * @generated
   */
  public Adapter createMusicOrSchemeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Duration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Duration
   * @generated
   */
  public Adapter createDurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.DurationMultiplier <em>Duration Multiplier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.DurationMultiplier
   * @generated
   */
  public Adapter createDurationMultiplierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Fraction <em>Fraction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Fraction
   * @generated
   */
  public Adapter createFractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.FractionOrNumber <em>Fraction Or Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.FractionOrNumber
   * @generated
   */
  public Adapter createFractionOrNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.ContextChange <em>Context Change</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.ContextChange
   * @generated
   */
  public Adapter createContextChangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.MusicPropertyDefinition <em>Music Property Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.MusicPropertyDefinition
   * @generated
   */
  public Adapter createMusicPropertyDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.MusicPropertyOperation <em>Music Property Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.MusicPropertyOperation
   * @generated
   */
  public Adapter createMusicPropertyOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.OverrideMusicProperty <em>Override Music Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.OverrideMusicProperty
   * @generated
   */
  public Adapter createOverrideMusicPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.RevertMusicProperty <em>Revert Music Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.RevertMusicProperty
   * @generated
   */
  public Adapter createRevertMusicPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SetMusicProperty <em>Set Music Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SetMusicProperty
   * @generated
   */
  public Adapter createSetMusicPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.UnsetMusicProperty <em>Unset Music Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.UnsetMusicProperty
   * @generated
   */
  public Adapter createUnsetMusicPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LilyPondAdapterFactory
