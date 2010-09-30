/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.elysium.lilyPond.AlternativeMusic;
import org.elysium.lilyPond.Assignment;
import org.elysium.lilyPond.BarCheck;
import org.elysium.lilyPond.BeamEnd;
import org.elysium.lilyPond.BeamStart;
import org.elysium.lilyPond.Book;
import org.elysium.lilyPond.BookElement;
import org.elysium.lilyPond.BookPart;
import org.elysium.lilyPond.BookPartElement;
import org.elysium.lilyPond.Chord;
import org.elysium.lilyPond.CompositeMusic;
import org.elysium.lilyPond.ContextChange;
import org.elysium.lilyPond.ContextDefaultModifier;
import org.elysium.lilyPond.ContextDefaultModifierType;
import org.elysium.lilyPond.ContextDefinition;
import org.elysium.lilyPond.ContextDefinitionElement;
import org.elysium.lilyPond.ContextModification;
import org.elysium.lilyPond.ContextModifier;
import org.elysium.lilyPond.Direction;
import org.elysium.lilyPond.Duration;
import org.elysium.lilyPond.DurationMultiplier;
import org.elysium.lilyPond.Event;
import org.elysium.lilyPond.EventWithOptionalDirection;
import org.elysium.lilyPond.EventWithRequiredDirection;
import org.elysium.lilyPond.Fraction;
import org.elysium.lilyPond.FractionOrNumber;
import org.elysium.lilyPond.GenTextDef;
import org.elysium.lilyPond.GrobDescriptions;
import org.elysium.lilyPond.Header;
import org.elysium.lilyPond.Include;
import org.elysium.lilyPond.KeySignature;
import org.elysium.lilyPond.Layout;
import org.elysium.lilyPond.LilyPond;
import org.elysium.lilyPond.LilyPondFactory;
import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.Mark;
import org.elysium.lilyPond.Markup;
import org.elysium.lilyPond.MarkupLines;
import org.elysium.lilyPond.Midi;
import org.elysium.lilyPond.Music;
import org.elysium.lilyPond.MusicOrScheme;
import org.elysium.lilyPond.MusicPropertyDefinition;
import org.elysium.lilyPond.MusicPropertyOperation;
import org.elysium.lilyPond.NewContext;
import org.elysium.lilyPond.Note;
import org.elysium.lilyPond.Octave;
import org.elysium.lilyPond.OutputDefinition;
import org.elysium.lilyPond.OutputDefinitionElement;
import org.elysium.lilyPond.OverrideMusicProperty;
import org.elysium.lilyPond.OverrideProperty;
import org.elysium.lilyPond.Paper;
import org.elysium.lilyPond.Partial;
import org.elysium.lilyPond.Pitch;
import org.elysium.lilyPond.PostEvent;
import org.elysium.lilyPond.PropertyAssignment;
import org.elysium.lilyPond.PropertyOperation;
import org.elysium.lilyPond.Reference;
import org.elysium.lilyPond.RelativeMusic;
import org.elysium.lilyPond.RepeatedMusic;
import org.elysium.lilyPond.Rest;
import org.elysium.lilyPond.RevertMusicProperty;
import org.elysium.lilyPond.RevertProperty;
import org.elysium.lilyPond.Scalar;
import org.elysium.lilyPond.Scheme;
import org.elysium.lilyPond.SchemeBoolean;
import org.elysium.lilyPond.SchemeExpression;
import org.elysium.lilyPond.SchemeList;
import org.elysium.lilyPond.SchemeNumber;
import org.elysium.lilyPond.SchemeText;
import org.elysium.lilyPond.SchemeValue;
import org.elysium.lilyPond.Score;
import org.elysium.lilyPond.ScoreElement;
import org.elysium.lilyPond.ScriptWithOptionalDirection;
import org.elysium.lilyPond.ScriptWithRequiredDirection;
import org.elysium.lilyPond.SequentialMusic;
import org.elysium.lilyPond.SetMusicProperty;
import org.elysium.lilyPond.SetProperty;
import org.elysium.lilyPond.SimpleMusic;
import org.elysium.lilyPond.SimultaneousMusic;
import org.elysium.lilyPond.Skip;
import org.elysium.lilyPond.SourceFileLine;
import org.elysium.lilyPond.SourceFileName;
import org.elysium.lilyPond.Tempo;
import org.elysium.lilyPond.TempoLabel;
import org.elysium.lilyPond.TempoValue;
import org.elysium.lilyPond.Tie;
import org.elysium.lilyPond.TimeSignature;
import org.elysium.lilyPond.ToplevelExpression;
import org.elysium.lilyPond.Tremolo;
import org.elysium.lilyPond.UnsetMusicProperty;
import org.elysium.lilyPond.UnsetProperty;
import org.elysium.lilyPond.Value;
import org.elysium.lilyPond.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LilyPondPackageImpl extends EPackageImpl implements LilyPondPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lilyPondEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toplevelExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemeBooleanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemeListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemeTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schemeNumberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextDefinitionElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass grobDescriptionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputDefinitionElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass midiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass layoutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scoreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scoreElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bookEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bookElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bookPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bookPartElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass markupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass markupLinesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sourceFileNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sourceFileLineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass musicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleMusicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pitchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass octaveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass restEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass chordEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventWithRequiredDirectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genTextDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventWithOptionalDirectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tremoloEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keySignatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeSignatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tempoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tempoLabelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tempoValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass partialEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass markEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass skipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tieEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beamStartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beamEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass barCheckEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositeMusicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequentialMusicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simultaneousMusicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newContextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextModificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scalarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unsetPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass overridePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass revertPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextDefaultModifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextDefaultModifierTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relativeMusicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeatedMusicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alternativeMusicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass musicOrSchemeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass durationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass durationMultiplierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fractionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fractionOrNumberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextChangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass musicPropertyDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass musicPropertyOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass overrideMusicPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass revertMusicPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setMusicPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unsetMusicPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum directionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum scriptWithRequiredDirectionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum scriptWithOptionalDirectionEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.elysium.lilyPond.LilyPondPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LilyPondPackageImpl()
  {
    super(eNS_URI, LilyPondFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link LilyPondPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LilyPondPackage init()
  {
    if (isInited) return (LilyPondPackage)EPackage.Registry.INSTANCE.getEPackage(LilyPondPackage.eNS_URI);

    // Obtain or create and register package
    LilyPondPackageImpl theLilyPondPackage = (LilyPondPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LilyPondPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LilyPondPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLilyPondPackage.createPackageContents();

    // Initialize created meta-data
    theLilyPondPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLilyPondPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LilyPondPackage.eNS_URI, theLilyPondPackage);
    return theLilyPondPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLilyPond()
  {
    return lilyPondEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLilyPond_Expressions()
  {
    return (EReference)lilyPondEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getToplevelExpression()
  {
    return toplevelExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignment_Name()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Value()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScheme()
  {
    return schemeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScheme_Value()
  {
    return (EReference)schemeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchemeExpression()
  {
    return schemeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchemeExpression_Quoted()
  {
    return (EAttribute)schemeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemeExpression_Value()
  {
    return (EReference)schemeExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchemeValue()
  {
    return schemeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchemeBoolean()
  {
    return schemeBooleanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchemeBoolean_Value()
  {
    return (EAttribute)schemeBooleanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchemeList()
  {
    return schemeListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchemeList_Expressions()
  {
    return (EReference)schemeListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchemeText()
  {
    return schemeTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchemeText_Value()
  {
    return (EAttribute)schemeTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchemeNumber()
  {
    return schemeNumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchemeNumber_Hexadecimal()
  {
    return (EAttribute)schemeNumberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchemeNumber_Value()
  {
    return (EAttribute)schemeNumberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextDefinition()
  {
    return contextDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContextDefinition_Elements()
  {
    return (EReference)contextDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextDefinitionElement()
  {
    return contextDefinitionElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGrobDescriptions()
  {
    return grobDescriptionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGrobDescriptions_Value()
  {
    return (EReference)grobDescriptionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeader()
  {
    return headerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHeader_Assignments()
  {
    return (EReference)headerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyAssignment()
  {
    return propertyAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyAssignment_Property()
  {
    return (EAttribute)propertyAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyAssignment_Value()
  {
    return (EReference)propertyAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputDefinition()
  {
    return outputDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputDefinition_Elements()
  {
    return (EReference)outputDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputDefinitionElement()
  {
    return outputDefinitionElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPaper()
  {
    return paperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMidi()
  {
    return midiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayout()
  {
    return layoutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScore()
  {
    return scoreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScore_Music()
  {
    return (EReference)scoreEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScore_Other()
  {
    return (EReference)scoreEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScoreElement()
  {
    return scoreElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBook()
  {
    return bookEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBook_Elements()
  {
    return (EReference)bookEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBookElement()
  {
    return bookElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBookPart()
  {
    return bookPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBookPart_Elements()
  {
    return (EReference)bookPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBookPartElement()
  {
    return bookPartElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMarkup()
  {
    return markupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMarkupLines()
  {
    return markupLinesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersion()
  {
    return versionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersion_Version()
  {
    return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInclude()
  {
    return includeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInclude_ImportURI()
  {
    return (EAttribute)includeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSourceFileName()
  {
    return sourceFileNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSourceFileName_Filename()
  {
    return (EAttribute)sourceFileNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSourceFileLine()
  {
    return sourceFileLineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSourceFileLine_Line()
  {
    return (EAttribute)sourceFileLineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMusic()
  {
    return musicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleMusic()
  {
    return simpleMusicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNote()
  {
    return noteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNote_Pitch()
  {
    return (EReference)noteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNote_Duration()
  {
    return (EReference)noteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNote_Rest()
  {
    return (EAttribute)noteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNote_PostEvents()
  {
    return (EReference)noteEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPitch()
  {
    return pitchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPitch_Base()
  {
    return (EAttribute)pitchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPitch_OctaveCheck()
  {
    return (EAttribute)pitchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPitch_OctaveShift()
  {
    return (EReference)pitchEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPitch_ReminderAccidental()
  {
    return (EAttribute)pitchEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPitch_CautionaryAccidental()
  {
    return (EAttribute)pitchEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOctave()
  {
    return octaveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOctave_Up()
  {
    return (EAttribute)octaveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOctave_Down()
  {
    return (EAttribute)octaveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRest()
  {
    return restEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRest_Type()
  {
    return (EAttribute)restEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRest_Duration()
  {
    return (EReference)restEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRest_PostEvents()
  {
    return (EReference)restEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChord()
  {
    return chordEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChord_Notes()
  {
    return (EReference)chordEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChord_Duration()
  {
    return (EReference)chordEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChord_PostEvents()
  {
    return (EReference)chordEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPostEvent()
  {
    return postEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPostEvent_MusicFunction()
  {
    return (EReference)postEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPostEvent_Direction()
  {
    return (EAttribute)postEventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPostEvent_Event()
  {
    return (EReference)postEventEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventWithRequiredDirection()
  {
    return eventWithRequiredDirectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventWithRequiredDirection_Script()
  {
    return (EAttribute)eventWithRequiredDirectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenTextDef()
  {
    return genTextDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventWithOptionalDirection()
  {
    return eventWithOptionalDirectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventWithOptionalDirection_Script()
  {
    return (EAttribute)eventWithOptionalDirectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTremolo()
  {
    return tremoloEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTremolo_Division()
  {
    return (EAttribute)tremoloEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKeySignature()
  {
    return keySignatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeySignature_Tonic()
  {
    return (EAttribute)keySignatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKeySignature_Mode()
  {
    return (EReference)keySignatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeySignature_Default()
  {
    return (EAttribute)keySignatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeSignature()
  {
    return timeSignatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimeSignature_Fraction()
  {
    return (EReference)timeSignatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTempo()
  {
    return tempoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTempo_Label()
  {
    return (EReference)tempoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTempo_Value()
  {
    return (EReference)tempoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTempoLabel()
  {
    return tempoLabelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTempoValue()
  {
    return tempoValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTempoValue_Duration()
  {
    return (EReference)tempoValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTempoValue_Bpm()
  {
    return (EAttribute)tempoValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPartial()
  {
    return partialEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPartial_Duration()
  {
    return (EReference)partialEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMark()
  {
    return markEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMark_Mark()
  {
    return (EReference)markEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSkip()
  {
    return skipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSkip_Duration()
  {
    return (EReference)skipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTie()
  {
    return tieEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBeamStart()
  {
    return beamStartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBeamEnd()
  {
    return beamEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBarCheck()
  {
    return barCheckEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference_Assignment()
  {
    return (EReference)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositeMusic()
  {
    return compositeMusicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequentialMusic()
  {
    return sequentialMusicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequentialMusic_Music()
  {
    return (EReference)sequentialMusicEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimultaneousMusic()
  {
    return simultaneousMusicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimultaneousMusic_Music()
  {
    return (EReference)simultaneousMusicEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewContext()
  {
    return newContextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewContext_Context()
  {
    return (EAttribute)newContextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewContext_Id()
  {
    return (EAttribute)newContextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewContext_Modification()
  {
    return (EReference)newContextEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewContext_Music()
  {
    return (EReference)newContextEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextModification()
  {
    return contextModificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContextModification_Modifiers()
  {
    return (EReference)contextModificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextModifier()
  {
    return contextModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyOperation()
  {
    return propertyOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyOperation_Property()
  {
    return (EAttribute)propertyOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetProperty()
  {
    return setPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetProperty_Value()
  {
    return (EReference)setPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScalar()
  {
    return scalarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnsetProperty()
  {
    return unsetPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOverrideProperty()
  {
    return overridePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOverrideProperty_Path()
  {
    return (EReference)overridePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOverrideProperty_Value()
  {
    return (EReference)overridePropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRevertProperty()
  {
    return revertPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRevertProperty_Path()
  {
    return (EReference)revertPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextDefaultModifier()
  {
    return contextDefaultModifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContextDefaultModifier_Type()
  {
    return (EReference)contextDefaultModifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContextDefaultModifier_Value()
  {
    return (EAttribute)contextDefaultModifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextDefaultModifierType()
  {
    return contextDefaultModifierTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelativeMusic()
  {
    return relativeMusicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelativeMusic_Pitch()
  {
    return (EReference)relativeMusicEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelativeMusic_Music()
  {
    return (EReference)relativeMusicEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepeatedMusic()
  {
    return repeatedMusicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeatedMusic_Type()
  {
    return (EAttribute)repeatedMusicEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeatedMusic_Number()
  {
    return (EAttribute)repeatedMusicEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepeatedMusic_Music()
  {
    return (EReference)repeatedMusicEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepeatedMusic_Alternative()
  {
    return (EReference)repeatedMusicEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlternativeMusic()
  {
    return alternativeMusicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlternativeMusic_Music()
  {
    return (EReference)alternativeMusicEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMusicOrScheme()
  {
    return musicOrSchemeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDuration()
  {
    return durationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDuration_Base()
  {
    return (EAttribute)durationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDuration_Dots()
  {
    return (EAttribute)durationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDuration_Multipliers()
  {
    return (EReference)durationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDurationMultiplier()
  {
    return durationMultiplierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFraction()
  {
    return fractionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFraction_Numerator()
  {
    return (EAttribute)fractionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFraction_Denominator()
  {
    return (EAttribute)fractionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFractionOrNumber()
  {
    return fractionOrNumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFractionOrNumber_Numerator()
  {
    return (EAttribute)fractionOrNumberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFractionOrNumber_Denominator()
  {
    return (EAttribute)fractionOrNumberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextChange()
  {
    return contextChangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContextChange_Context()
  {
    return (EAttribute)contextChangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContextChange_Id()
  {
    return (EAttribute)contextChangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMusicPropertyDefinition()
  {
    return musicPropertyDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMusicPropertyDefinition_Once()
  {
    return (EAttribute)musicPropertyDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMusicPropertyDefinition_Operation()
  {
    return (EReference)musicPropertyDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMusicPropertyOperation()
  {
    return musicPropertyOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMusicPropertyOperation_Object()
  {
    return (EAttribute)musicPropertyOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOverrideMusicProperty()
  {
    return overrideMusicPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOverrideMusicProperty_Path()
  {
    return (EReference)overrideMusicPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOverrideMusicProperty_Value()
  {
    return (EReference)overrideMusicPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRevertMusicProperty()
  {
    return revertMusicPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRevertMusicProperty_Path()
  {
    return (EReference)revertMusicPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetMusicProperty()
  {
    return setMusicPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetMusicProperty_Value()
  {
    return (EReference)setMusicPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnsetMusicProperty()
  {
    return unsetMusicPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDirection()
  {
    return directionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getScriptWithRequiredDirection()
  {
    return scriptWithRequiredDirectionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getScriptWithOptionalDirection()
  {
    return scriptWithOptionalDirectionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilyPondFactory getLilyPondFactory()
  {
    return (LilyPondFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    lilyPondEClass = createEClass(LILY_POND);
    createEReference(lilyPondEClass, LILY_POND__EXPRESSIONS);

    toplevelExpressionEClass = createEClass(TOPLEVEL_EXPRESSION);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEAttribute(assignmentEClass, ASSIGNMENT__NAME);
    createEReference(assignmentEClass, ASSIGNMENT__VALUE);

    valueEClass = createEClass(VALUE);

    schemeEClass = createEClass(SCHEME);
    createEReference(schemeEClass, SCHEME__VALUE);

    schemeExpressionEClass = createEClass(SCHEME_EXPRESSION);
    createEAttribute(schemeExpressionEClass, SCHEME_EXPRESSION__QUOTED);
    createEReference(schemeExpressionEClass, SCHEME_EXPRESSION__VALUE);

    schemeValueEClass = createEClass(SCHEME_VALUE);

    schemeBooleanEClass = createEClass(SCHEME_BOOLEAN);
    createEAttribute(schemeBooleanEClass, SCHEME_BOOLEAN__VALUE);

    schemeListEClass = createEClass(SCHEME_LIST);
    createEReference(schemeListEClass, SCHEME_LIST__EXPRESSIONS);

    schemeTextEClass = createEClass(SCHEME_TEXT);
    createEAttribute(schemeTextEClass, SCHEME_TEXT__VALUE);

    schemeNumberEClass = createEClass(SCHEME_NUMBER);
    createEAttribute(schemeNumberEClass, SCHEME_NUMBER__HEXADECIMAL);
    createEAttribute(schemeNumberEClass, SCHEME_NUMBER__VALUE);

    contextDefinitionEClass = createEClass(CONTEXT_DEFINITION);
    createEReference(contextDefinitionEClass, CONTEXT_DEFINITION__ELEMENTS);

    contextDefinitionElementEClass = createEClass(CONTEXT_DEFINITION_ELEMENT);

    grobDescriptionsEClass = createEClass(GROB_DESCRIPTIONS);
    createEReference(grobDescriptionsEClass, GROB_DESCRIPTIONS__VALUE);

    headerEClass = createEClass(HEADER);
    createEReference(headerEClass, HEADER__ASSIGNMENTS);

    propertyAssignmentEClass = createEClass(PROPERTY_ASSIGNMENT);
    createEAttribute(propertyAssignmentEClass, PROPERTY_ASSIGNMENT__PROPERTY);
    createEReference(propertyAssignmentEClass, PROPERTY_ASSIGNMENT__VALUE);

    outputDefinitionEClass = createEClass(OUTPUT_DEFINITION);
    createEReference(outputDefinitionEClass, OUTPUT_DEFINITION__ELEMENTS);

    outputDefinitionElementEClass = createEClass(OUTPUT_DEFINITION_ELEMENT);

    paperEClass = createEClass(PAPER);

    midiEClass = createEClass(MIDI);

    layoutEClass = createEClass(LAYOUT);

    scoreEClass = createEClass(SCORE);
    createEReference(scoreEClass, SCORE__MUSIC);
    createEReference(scoreEClass, SCORE__OTHER);

    scoreElementEClass = createEClass(SCORE_ELEMENT);

    bookEClass = createEClass(BOOK);
    createEReference(bookEClass, BOOK__ELEMENTS);

    bookElementEClass = createEClass(BOOK_ELEMENT);

    bookPartEClass = createEClass(BOOK_PART);
    createEReference(bookPartEClass, BOOK_PART__ELEMENTS);

    bookPartElementEClass = createEClass(BOOK_PART_ELEMENT);

    markupEClass = createEClass(MARKUP);

    markupLinesEClass = createEClass(MARKUP_LINES);

    versionEClass = createEClass(VERSION);
    createEAttribute(versionEClass, VERSION__VERSION);

    includeEClass = createEClass(INCLUDE);
    createEAttribute(includeEClass, INCLUDE__IMPORT_URI);

    sourceFileNameEClass = createEClass(SOURCE_FILE_NAME);
    createEAttribute(sourceFileNameEClass, SOURCE_FILE_NAME__FILENAME);

    sourceFileLineEClass = createEClass(SOURCE_FILE_LINE);
    createEAttribute(sourceFileLineEClass, SOURCE_FILE_LINE__LINE);

    musicEClass = createEClass(MUSIC);

    simpleMusicEClass = createEClass(SIMPLE_MUSIC);

    eventEClass = createEClass(EVENT);

    noteEClass = createEClass(NOTE);
    createEReference(noteEClass, NOTE__PITCH);
    createEReference(noteEClass, NOTE__DURATION);
    createEAttribute(noteEClass, NOTE__REST);
    createEReference(noteEClass, NOTE__POST_EVENTS);

    pitchEClass = createEClass(PITCH);
    createEAttribute(pitchEClass, PITCH__BASE);
    createEAttribute(pitchEClass, PITCH__OCTAVE_CHECK);
    createEReference(pitchEClass, PITCH__OCTAVE_SHIFT);
    createEAttribute(pitchEClass, PITCH__REMINDER_ACCIDENTAL);
    createEAttribute(pitchEClass, PITCH__CAUTIONARY_ACCIDENTAL);

    octaveEClass = createEClass(OCTAVE);
    createEAttribute(octaveEClass, OCTAVE__UP);
    createEAttribute(octaveEClass, OCTAVE__DOWN);

    restEClass = createEClass(REST);
    createEAttribute(restEClass, REST__TYPE);
    createEReference(restEClass, REST__DURATION);
    createEReference(restEClass, REST__POST_EVENTS);

    chordEClass = createEClass(CHORD);
    createEReference(chordEClass, CHORD__NOTES);
    createEReference(chordEClass, CHORD__DURATION);
    createEReference(chordEClass, CHORD__POST_EVENTS);

    postEventEClass = createEClass(POST_EVENT);
    createEReference(postEventEClass, POST_EVENT__MUSIC_FUNCTION);
    createEAttribute(postEventEClass, POST_EVENT__DIRECTION);
    createEReference(postEventEClass, POST_EVENT__EVENT);

    eventWithRequiredDirectionEClass = createEClass(EVENT_WITH_REQUIRED_DIRECTION);
    createEAttribute(eventWithRequiredDirectionEClass, EVENT_WITH_REQUIRED_DIRECTION__SCRIPT);

    genTextDefEClass = createEClass(GEN_TEXT_DEF);

    eventWithOptionalDirectionEClass = createEClass(EVENT_WITH_OPTIONAL_DIRECTION);
    createEAttribute(eventWithOptionalDirectionEClass, EVENT_WITH_OPTIONAL_DIRECTION__SCRIPT);

    tremoloEClass = createEClass(TREMOLO);
    createEAttribute(tremoloEClass, TREMOLO__DIVISION);

    keySignatureEClass = createEClass(KEY_SIGNATURE);
    createEAttribute(keySignatureEClass, KEY_SIGNATURE__TONIC);
    createEReference(keySignatureEClass, KEY_SIGNATURE__MODE);
    createEAttribute(keySignatureEClass, KEY_SIGNATURE__DEFAULT);

    timeSignatureEClass = createEClass(TIME_SIGNATURE);
    createEReference(timeSignatureEClass, TIME_SIGNATURE__FRACTION);

    tempoEClass = createEClass(TEMPO);
    createEReference(tempoEClass, TEMPO__LABEL);
    createEReference(tempoEClass, TEMPO__VALUE);

    tempoLabelEClass = createEClass(TEMPO_LABEL);

    tempoValueEClass = createEClass(TEMPO_VALUE);
    createEReference(tempoValueEClass, TEMPO_VALUE__DURATION);
    createEAttribute(tempoValueEClass, TEMPO_VALUE__BPM);

    partialEClass = createEClass(PARTIAL);
    createEReference(partialEClass, PARTIAL__DURATION);

    markEClass = createEClass(MARK);
    createEReference(markEClass, MARK__MARK);

    skipEClass = createEClass(SKIP);
    createEReference(skipEClass, SKIP__DURATION);

    tieEClass = createEClass(TIE);

    beamStartEClass = createEClass(BEAM_START);

    beamEndEClass = createEClass(BEAM_END);

    barCheckEClass = createEClass(BAR_CHECK);

    referenceEClass = createEClass(REFERENCE);
    createEReference(referenceEClass, REFERENCE__ASSIGNMENT);

    compositeMusicEClass = createEClass(COMPOSITE_MUSIC);

    sequentialMusicEClass = createEClass(SEQUENTIAL_MUSIC);
    createEReference(sequentialMusicEClass, SEQUENTIAL_MUSIC__MUSIC);

    simultaneousMusicEClass = createEClass(SIMULTANEOUS_MUSIC);
    createEReference(simultaneousMusicEClass, SIMULTANEOUS_MUSIC__MUSIC);

    newContextEClass = createEClass(NEW_CONTEXT);
    createEAttribute(newContextEClass, NEW_CONTEXT__CONTEXT);
    createEAttribute(newContextEClass, NEW_CONTEXT__ID);
    createEReference(newContextEClass, NEW_CONTEXT__MODIFICATION);
    createEReference(newContextEClass, NEW_CONTEXT__MUSIC);

    contextModificationEClass = createEClass(CONTEXT_MODIFICATION);
    createEReference(contextModificationEClass, CONTEXT_MODIFICATION__MODIFIERS);

    contextModifierEClass = createEClass(CONTEXT_MODIFIER);

    propertyOperationEClass = createEClass(PROPERTY_OPERATION);
    createEAttribute(propertyOperationEClass, PROPERTY_OPERATION__PROPERTY);

    setPropertyEClass = createEClass(SET_PROPERTY);
    createEReference(setPropertyEClass, SET_PROPERTY__VALUE);

    scalarEClass = createEClass(SCALAR);

    unsetPropertyEClass = createEClass(UNSET_PROPERTY);

    overridePropertyEClass = createEClass(OVERRIDE_PROPERTY);
    createEReference(overridePropertyEClass, OVERRIDE_PROPERTY__PATH);
    createEReference(overridePropertyEClass, OVERRIDE_PROPERTY__VALUE);

    revertPropertyEClass = createEClass(REVERT_PROPERTY);
    createEReference(revertPropertyEClass, REVERT_PROPERTY__PATH);

    contextDefaultModifierEClass = createEClass(CONTEXT_DEFAULT_MODIFIER);
    createEReference(contextDefaultModifierEClass, CONTEXT_DEFAULT_MODIFIER__TYPE);
    createEAttribute(contextDefaultModifierEClass, CONTEXT_DEFAULT_MODIFIER__VALUE);

    contextDefaultModifierTypeEClass = createEClass(CONTEXT_DEFAULT_MODIFIER_TYPE);

    relativeMusicEClass = createEClass(RELATIVE_MUSIC);
    createEReference(relativeMusicEClass, RELATIVE_MUSIC__PITCH);
    createEReference(relativeMusicEClass, RELATIVE_MUSIC__MUSIC);

    repeatedMusicEClass = createEClass(REPEATED_MUSIC);
    createEAttribute(repeatedMusicEClass, REPEATED_MUSIC__TYPE);
    createEAttribute(repeatedMusicEClass, REPEATED_MUSIC__NUMBER);
    createEReference(repeatedMusicEClass, REPEATED_MUSIC__MUSIC);
    createEReference(repeatedMusicEClass, REPEATED_MUSIC__ALTERNATIVE);

    alternativeMusicEClass = createEClass(ALTERNATIVE_MUSIC);
    createEReference(alternativeMusicEClass, ALTERNATIVE_MUSIC__MUSIC);

    musicOrSchemeEClass = createEClass(MUSIC_OR_SCHEME);

    durationEClass = createEClass(DURATION);
    createEAttribute(durationEClass, DURATION__BASE);
    createEAttribute(durationEClass, DURATION__DOTS);
    createEReference(durationEClass, DURATION__MULTIPLIERS);

    durationMultiplierEClass = createEClass(DURATION_MULTIPLIER);

    fractionEClass = createEClass(FRACTION);
    createEAttribute(fractionEClass, FRACTION__NUMERATOR);
    createEAttribute(fractionEClass, FRACTION__DENOMINATOR);

    fractionOrNumberEClass = createEClass(FRACTION_OR_NUMBER);
    createEAttribute(fractionOrNumberEClass, FRACTION_OR_NUMBER__NUMERATOR);
    createEAttribute(fractionOrNumberEClass, FRACTION_OR_NUMBER__DENOMINATOR);

    contextChangeEClass = createEClass(CONTEXT_CHANGE);
    createEAttribute(contextChangeEClass, CONTEXT_CHANGE__CONTEXT);
    createEAttribute(contextChangeEClass, CONTEXT_CHANGE__ID);

    musicPropertyDefinitionEClass = createEClass(MUSIC_PROPERTY_DEFINITION);
    createEAttribute(musicPropertyDefinitionEClass, MUSIC_PROPERTY_DEFINITION__ONCE);
    createEReference(musicPropertyDefinitionEClass, MUSIC_PROPERTY_DEFINITION__OPERATION);

    musicPropertyOperationEClass = createEClass(MUSIC_PROPERTY_OPERATION);
    createEAttribute(musicPropertyOperationEClass, MUSIC_PROPERTY_OPERATION__OBJECT);

    overrideMusicPropertyEClass = createEClass(OVERRIDE_MUSIC_PROPERTY);
    createEReference(overrideMusicPropertyEClass, OVERRIDE_MUSIC_PROPERTY__PATH);
    createEReference(overrideMusicPropertyEClass, OVERRIDE_MUSIC_PROPERTY__VALUE);

    revertMusicPropertyEClass = createEClass(REVERT_MUSIC_PROPERTY);
    createEReference(revertMusicPropertyEClass, REVERT_MUSIC_PROPERTY__PATH);

    setMusicPropertyEClass = createEClass(SET_MUSIC_PROPERTY);
    createEReference(setMusicPropertyEClass, SET_MUSIC_PROPERTY__VALUE);

    unsetMusicPropertyEClass = createEClass(UNSET_MUSIC_PROPERTY);

    // Create enums
    directionEEnum = createEEnum(DIRECTION);
    scriptWithRequiredDirectionEEnum = createEEnum(SCRIPT_WITH_REQUIRED_DIRECTION);
    scriptWithOptionalDirectionEEnum = createEEnum(SCRIPT_WITH_OPTIONAL_DIRECTION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    assignmentEClass.getESuperTypes().add(this.getToplevelExpression());
    schemeEClass.getESuperTypes().add(this.getToplevelExpression());
    schemeEClass.getESuperTypes().add(this.getValue());
    schemeEClass.getESuperTypes().add(this.getScalar());
    schemeEClass.getESuperTypes().add(this.getMusicOrScheme());
    schemeBooleanEClass.getESuperTypes().add(this.getSchemeValue());
    schemeListEClass.getESuperTypes().add(this.getSchemeValue());
    schemeTextEClass.getESuperTypes().add(this.getSchemeValue());
    schemeNumberEClass.getESuperTypes().add(this.getSchemeValue());
    contextDefinitionEClass.getESuperTypes().add(this.getValue());
    contextDefinitionEClass.getESuperTypes().add(this.getOutputDefinitionElement());
    grobDescriptionsEClass.getESuperTypes().add(this.getContextDefinitionElement());
    headerEClass.getESuperTypes().add(this.getToplevelExpression());
    headerEClass.getESuperTypes().add(this.getScoreElement());
    headerEClass.getESuperTypes().add(this.getBookPartElement());
    propertyAssignmentEClass.getESuperTypes().add(this.getOutputDefinitionElement());
    outputDefinitionEClass.getESuperTypes().add(this.getToplevelExpression());
    outputDefinitionEClass.getESuperTypes().add(this.getValue());
    outputDefinitionEClass.getESuperTypes().add(this.getScoreElement());
    paperEClass.getESuperTypes().add(this.getOutputDefinition());
    paperEClass.getESuperTypes().add(this.getBookPartElement());
    midiEClass.getESuperTypes().add(this.getOutputDefinition());
    layoutEClass.getESuperTypes().add(this.getOutputDefinition());
    scoreEClass.getESuperTypes().add(this.getToplevelExpression());
    scoreEClass.getESuperTypes().add(this.getValue());
    scoreEClass.getESuperTypes().add(this.getBookPartElement());
    bookEClass.getESuperTypes().add(this.getToplevelExpression());
    bookEClass.getESuperTypes().add(this.getValue());
    bookPartEClass.getESuperTypes().add(this.getToplevelExpression());
    bookPartEClass.getESuperTypes().add(this.getValue());
    bookPartEClass.getESuperTypes().add(this.getBookElement());
    bookPartElementEClass.getESuperTypes().add(this.getBookElement());
    markupEClass.getESuperTypes().add(this.getToplevelExpression());
    markupEClass.getESuperTypes().add(this.getValue());
    markupEClass.getESuperTypes().add(this.getBookPartElement());
    markupEClass.getESuperTypes().add(this.getGenTextDef());
    markupEClass.getESuperTypes().add(this.getTempoLabel());
    markupEClass.getESuperTypes().add(this.getScalar());
    markupLinesEClass.getESuperTypes().add(this.getToplevelExpression());
    markupLinesEClass.getESuperTypes().add(this.getBookPartElement());
    versionEClass.getESuperTypes().add(this.getToplevelExpression());
    includeEClass.getESuperTypes().add(this.getToplevelExpression());
    sourceFileNameEClass.getESuperTypes().add(this.getToplevelExpression());
    sourceFileLineEClass.getESuperTypes().add(this.getToplevelExpression());
    musicEClass.getESuperTypes().add(this.getValue());
    musicEClass.getESuperTypes().add(this.getScoreElement());
    musicEClass.getESuperTypes().add(this.getMusicOrScheme());
    simpleMusicEClass.getESuperTypes().add(this.getMusic());
    eventEClass.getESuperTypes().add(this.getSimpleMusic());
    noteEClass.getESuperTypes().add(this.getEvent());
    restEClass.getESuperTypes().add(this.getEvent());
    chordEClass.getESuperTypes().add(this.getEvent());
    postEventEClass.getESuperTypes().add(this.getValue());
    genTextDefEClass.getESuperTypes().add(this.getEventWithRequiredDirection());
    tremoloEClass.getESuperTypes().add(this.getEventWithOptionalDirection());
    keySignatureEClass.getESuperTypes().add(this.getEvent());
    timeSignatureEClass.getESuperTypes().add(this.getEvent());
    tempoEClass.getESuperTypes().add(this.getEvent());
    partialEClass.getESuperTypes().add(this.getEvent());
    markEClass.getESuperTypes().add(this.getEvent());
    skipEClass.getESuperTypes().add(this.getEvent());
    tieEClass.getESuperTypes().add(this.getEvent());
    beamStartEClass.getESuperTypes().add(this.getEvent());
    beamEndEClass.getESuperTypes().add(this.getEvent());
    barCheckEClass.getESuperTypes().add(this.getEvent());
    referenceEClass.getESuperTypes().add(this.getEvent());
    compositeMusicEClass.getESuperTypes().add(this.getToplevelExpression());
    compositeMusicEClass.getESuperTypes().add(this.getBookPartElement());
    compositeMusicEClass.getESuperTypes().add(this.getMusic());
    sequentialMusicEClass.getESuperTypes().add(this.getCompositeMusic());
    simultaneousMusicEClass.getESuperTypes().add(this.getCompositeMusic());
    newContextEClass.getESuperTypes().add(this.getCompositeMusic());
    contextModifierEClass.getESuperTypes().add(this.getContextDefinitionElement());
    propertyOperationEClass.getESuperTypes().add(this.getContextModifier());
    setPropertyEClass.getESuperTypes().add(this.getPropertyOperation());
    unsetPropertyEClass.getESuperTypes().add(this.getPropertyOperation());
    overridePropertyEClass.getESuperTypes().add(this.getPropertyOperation());
    revertPropertyEClass.getESuperTypes().add(this.getPropertyOperation());
    contextDefaultModifierEClass.getESuperTypes().add(this.getContextModifier());
    relativeMusicEClass.getESuperTypes().add(this.getCompositeMusic());
    repeatedMusicEClass.getESuperTypes().add(this.getCompositeMusic());
    fractionOrNumberEClass.getESuperTypes().add(this.getDurationMultiplier());
    contextChangeEClass.getESuperTypes().add(this.getSimpleMusic());
    musicPropertyDefinitionEClass.getESuperTypes().add(this.getSimpleMusic());
    overrideMusicPropertyEClass.getESuperTypes().add(this.getMusicPropertyOperation());
    revertMusicPropertyEClass.getESuperTypes().add(this.getMusicPropertyOperation());
    setMusicPropertyEClass.getESuperTypes().add(this.getMusicPropertyOperation());
    unsetMusicPropertyEClass.getESuperTypes().add(this.getMusicPropertyOperation());

    // Initialize classes and features; add operations and parameters
    initEClass(lilyPondEClass, LilyPond.class, "LilyPond", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLilyPond_Expressions(), this.getToplevelExpression(), null, "expressions", null, 0, -1, LilyPond.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(toplevelExpressionEClass, ToplevelExpression.class, "ToplevelExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssignment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Value(), this.getValue(), null, "value", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(schemeEClass, Scheme.class, "Scheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScheme_Value(), this.getSchemeExpression(), null, "value", null, 0, 1, Scheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemeExpressionEClass, SchemeExpression.class, "SchemeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSchemeExpression_Quoted(), ecorePackage.getEBoolean(), "quoted", null, 0, 1, SchemeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchemeExpression_Value(), this.getSchemeValue(), null, "value", null, 0, 1, SchemeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemeValueEClass, SchemeValue.class, "SchemeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(schemeBooleanEClass, SchemeBoolean.class, "SchemeBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSchemeBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, SchemeBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemeListEClass, SchemeList.class, "SchemeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSchemeList_Expressions(), this.getSchemeExpression(), null, "expressions", null, 0, -1, SchemeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemeTextEClass, SchemeText.class, "SchemeText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSchemeText_Value(), ecorePackage.getEString(), "value", null, 0, 1, SchemeText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schemeNumberEClass, SchemeNumber.class, "SchemeNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSchemeNumber_Hexadecimal(), ecorePackage.getEBoolean(), "hexadecimal", null, 0, 1, SchemeNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchemeNumber_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SchemeNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextDefinitionEClass, ContextDefinition.class, "ContextDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContextDefinition_Elements(), this.getContextDefinitionElement(), null, "elements", null, 0, -1, ContextDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextDefinitionElementEClass, ContextDefinitionElement.class, "ContextDefinitionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(grobDescriptionsEClass, GrobDescriptions.class, "GrobDescriptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGrobDescriptions_Value(), this.getScheme(), null, "value", null, 0, 1, GrobDescriptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHeader_Assignments(), this.getPropertyAssignment(), null, "assignments", null, 0, -1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyAssignmentEClass, PropertyAssignment.class, "PropertyAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyAssignment_Property(), ecorePackage.getEString(), "property", null, 0, 1, PropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyAssignment_Value(), this.getValue(), null, "value", null, 0, 1, PropertyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputDefinitionEClass, OutputDefinition.class, "OutputDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutputDefinition_Elements(), this.getOutputDefinitionElement(), null, "elements", null, 0, -1, OutputDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputDefinitionElementEClass, OutputDefinitionElement.class, "OutputDefinitionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(paperEClass, Paper.class, "Paper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(midiEClass, Midi.class, "Midi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(scoreEClass, Score.class, "Score", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScore_Music(), this.getMusic(), null, "music", null, 0, 1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScore_Other(), this.getScoreElement(), null, "other", null, 0, -1, Score.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scoreElementEClass, ScoreElement.class, "ScoreElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bookEClass, Book.class, "Book", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBook_Elements(), this.getBookElement(), null, "elements", null, 0, -1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bookElementEClass, BookElement.class, "BookElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bookPartEClass, BookPart.class, "BookPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBookPart_Elements(), this.getBookPartElement(), null, "elements", null, 0, -1, BookPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bookPartElementEClass, BookPartElement.class, "BookPartElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(markupEClass, Markup.class, "Markup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(markupLinesEClass, MarkupLines.class, "MarkupLines", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVersion_Version(), ecorePackage.getEString(), "version", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInclude_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sourceFileNameEClass, SourceFileName.class, "SourceFileName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSourceFileName_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, SourceFileName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sourceFileLineEClass, SourceFileLine.class, "SourceFileLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSourceFileLine_Line(), ecorePackage.getEInt(), "line", null, 0, 1, SourceFileLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(musicEClass, Music.class, "Music", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleMusicEClass, SimpleMusic.class, "SimpleMusic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNote_Pitch(), this.getPitch(), null, "pitch", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNote_Duration(), this.getDuration(), null, "duration", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNote_Rest(), ecorePackage.getEBoolean(), "rest", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNote_PostEvents(), this.getPostEvent(), null, "postEvents", null, 0, -1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pitchEClass, Pitch.class, "Pitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPitch_Base(), ecorePackage.getEString(), "base", null, 0, 1, Pitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPitch_OctaveCheck(), ecorePackage.getEBoolean(), "octaveCheck", null, 0, 1, Pitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPitch_OctaveShift(), this.getOctave(), null, "octaveShift", null, 0, 1, Pitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPitch_ReminderAccidental(), ecorePackage.getEBoolean(), "reminderAccidental", null, 0, 1, Pitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPitch_CautionaryAccidental(), ecorePackage.getEBoolean(), "cautionaryAccidental", null, 0, 1, Pitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(octaveEClass, Octave.class, "Octave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOctave_Up(), ecorePackage.getEString(), "up", null, 0, -1, Octave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOctave_Down(), ecorePackage.getEString(), "down", null, 0, -1, Octave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(restEClass, Rest.class, "Rest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRest_Type(), ecorePackage.getEString(), "type", null, 0, 1, Rest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRest_Duration(), this.getDuration(), null, "duration", null, 0, 1, Rest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRest_PostEvents(), this.getPostEvent(), null, "postEvents", null, 0, -1, Rest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(chordEClass, Chord.class, "Chord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChord_Notes(), this.getNote(), null, "notes", null, 0, -1, Chord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChord_Duration(), this.getDuration(), null, "duration", null, 0, 1, Chord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChord_PostEvents(), this.getPostEvent(), null, "postEvents", null, 0, -1, Chord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(postEventEClass, PostEvent.class, "PostEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPostEvent_MusicFunction(), this.getReference(), null, "musicFunction", null, 0, 1, PostEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPostEvent_Direction(), this.getDirection(), "direction", null, 0, 1, PostEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPostEvent_Event(), ecorePackage.getEObject(), null, "event", null, 0, 1, PostEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventWithRequiredDirectionEClass, EventWithRequiredDirection.class, "EventWithRequiredDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventWithRequiredDirection_Script(), this.getScriptWithRequiredDirection(), "script", null, 0, 1, EventWithRequiredDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genTextDefEClass, GenTextDef.class, "GenTextDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eventWithOptionalDirectionEClass, EventWithOptionalDirection.class, "EventWithOptionalDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventWithOptionalDirection_Script(), this.getScriptWithOptionalDirection(), "script", null, 0, 1, EventWithOptionalDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tremoloEClass, Tremolo.class, "Tremolo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTremolo_Division(), ecorePackage.getEInt(), "division", null, 0, 1, Tremolo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keySignatureEClass, KeySignature.class, "KeySignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKeySignature_Tonic(), ecorePackage.getEString(), "tonic", null, 0, 1, KeySignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKeySignature_Mode(), this.getReference(), null, "mode", null, 0, 1, KeySignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKeySignature_Default(), ecorePackage.getEBoolean(), "default", null, 0, 1, KeySignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeSignatureEClass, TimeSignature.class, "TimeSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTimeSignature_Fraction(), this.getFraction(), null, "fraction", null, 0, 1, TimeSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tempoEClass, Tempo.class, "Tempo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTempo_Label(), this.getTempoLabel(), null, "label", null, 0, 1, Tempo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTempo_Value(), this.getTempoValue(), null, "value", null, 0, 1, Tempo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tempoLabelEClass, TempoLabel.class, "TempoLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tempoValueEClass, TempoValue.class, "TempoValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTempoValue_Duration(), this.getDuration(), null, "duration", null, 0, 1, TempoValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTempoValue_Bpm(), ecorePackage.getEInt(), "bpm", null, 0, 1, TempoValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(partialEClass, Partial.class, "Partial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPartial_Duration(), this.getDuration(), null, "duration", null, 0, 1, Partial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(markEClass, Mark.class, "Mark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMark_Mark(), this.getScalar(), null, "mark", null, 0, 1, Mark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(skipEClass, Skip.class, "Skip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSkip_Duration(), this.getDuration(), null, "duration", null, 0, 1, Skip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tieEClass, Tie.class, "Tie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(beamStartEClass, BeamStart.class, "BeamStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(beamEndEClass, BeamEnd.class, "BeamEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(barCheckEClass, BarCheck.class, "BarCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReference_Assignment(), this.getAssignment(), null, "assignment", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositeMusicEClass, CompositeMusic.class, "CompositeMusic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sequentialMusicEClass, SequentialMusic.class, "SequentialMusic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequentialMusic_Music(), this.getMusic(), null, "music", null, 0, -1, SequentialMusic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simultaneousMusicEClass, SimultaneousMusic.class, "SimultaneousMusic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimultaneousMusic_Music(), this.getMusic(), null, "music", null, 0, -1, SimultaneousMusic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(newContextEClass, NewContext.class, "NewContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNewContext_Context(), ecorePackage.getEString(), "context", null, 0, 1, NewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNewContext_Id(), ecorePackage.getEString(), "id", null, 0, 1, NewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNewContext_Modification(), this.getContextModification(), null, "modification", null, 0, 1, NewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNewContext_Music(), this.getMusic(), null, "music", null, 0, 1, NewContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextModificationEClass, ContextModification.class, "ContextModification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContextModification_Modifiers(), this.getContextModifier(), null, "modifiers", null, 0, -1, ContextModification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextModifierEClass, ContextModifier.class, "ContextModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertyOperationEClass, PropertyOperation.class, "PropertyOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyOperation_Property(), ecorePackage.getEString(), "property", null, 0, 1, PropertyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setPropertyEClass, SetProperty.class, "SetProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetProperty_Value(), this.getScalar(), null, "value", null, 0, 1, SetProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scalarEClass, Scalar.class, "Scalar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unsetPropertyEClass, UnsetProperty.class, "UnsetProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(overridePropertyEClass, OverrideProperty.class, "OverrideProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOverrideProperty_Path(), this.getScheme(), null, "path", null, 0, 1, OverrideProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOverrideProperty_Value(), this.getScheme(), null, "value", null, 0, 1, OverrideProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(revertPropertyEClass, RevertProperty.class, "RevertProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRevertProperty_Path(), this.getScheme(), null, "path", null, 0, 1, RevertProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextDefaultModifierEClass, ContextDefaultModifier.class, "ContextDefaultModifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContextDefaultModifier_Type(), this.getContextDefaultModifierType(), null, "type", null, 0, 1, ContextDefaultModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContextDefaultModifier_Value(), ecorePackage.getEString(), "value", null, 0, 1, ContextDefaultModifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextDefaultModifierTypeEClass, ContextDefaultModifierType.class, "ContextDefaultModifierType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relativeMusicEClass, RelativeMusic.class, "RelativeMusic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelativeMusic_Pitch(), this.getPitch(), null, "pitch", null, 0, 1, RelativeMusic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelativeMusic_Music(), this.getCompositeMusic(), null, "music", null, 0, 1, RelativeMusic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeatedMusicEClass, RepeatedMusic.class, "RepeatedMusic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepeatedMusic_Type(), ecorePackage.getEString(), "type", null, 0, 1, RepeatedMusic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepeatedMusic_Number(), ecorePackage.getEInt(), "number", null, 0, 1, RepeatedMusic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepeatedMusic_Music(), this.getMusic(), null, "music", null, 0, 1, RepeatedMusic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepeatedMusic_Alternative(), this.getAlternativeMusic(), null, "alternative", null, 0, 1, RepeatedMusic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alternativeMusicEClass, AlternativeMusic.class, "AlternativeMusic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlternativeMusic_Music(), this.getMusicOrScheme(), null, "music", null, 0, -1, AlternativeMusic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(musicOrSchemeEClass, MusicOrScheme.class, "MusicOrScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDuration_Base(), ecorePackage.getEInt(), "base", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDuration_Dots(), ecorePackage.getEString(), "dots", null, 0, -1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDuration_Multipliers(), this.getDurationMultiplier(), null, "multipliers", null, 0, -1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(durationMultiplierEClass, DurationMultiplier.class, "DurationMultiplier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fractionEClass, Fraction.class, "Fraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFraction_Numerator(), ecorePackage.getEInt(), "numerator", null, 0, 1, Fraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFraction_Denominator(), ecorePackage.getEInt(), "denominator", null, 0, 1, Fraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fractionOrNumberEClass, FractionOrNumber.class, "FractionOrNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFractionOrNumber_Numerator(), ecorePackage.getEInt(), "numerator", null, 0, 1, FractionOrNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFractionOrNumber_Denominator(), ecorePackage.getEInt(), "denominator", null, 0, 1, FractionOrNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextChangeEClass, ContextChange.class, "ContextChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContextChange_Context(), ecorePackage.getEString(), "context", null, 0, 1, ContextChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContextChange_Id(), ecorePackage.getEString(), "id", null, 0, 1, ContextChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(musicPropertyDefinitionEClass, MusicPropertyDefinition.class, "MusicPropertyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMusicPropertyDefinition_Once(), ecorePackage.getEBoolean(), "once", null, 0, 1, MusicPropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMusicPropertyDefinition_Operation(), this.getMusicPropertyOperation(), null, "operation", null, 0, 1, MusicPropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(musicPropertyOperationEClass, MusicPropertyOperation.class, "MusicPropertyOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMusicPropertyOperation_Object(), ecorePackage.getEString(), "object", null, 0, 1, MusicPropertyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(overrideMusicPropertyEClass, OverrideMusicProperty.class, "OverrideMusicProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOverrideMusicProperty_Path(), this.getScheme(), null, "path", null, 0, 1, OverrideMusicProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOverrideMusicProperty_Value(), this.getScalar(), null, "value", null, 0, 1, OverrideMusicProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(revertMusicPropertyEClass, RevertMusicProperty.class, "RevertMusicProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRevertMusicProperty_Path(), this.getScheme(), null, "path", null, 0, 1, RevertMusicProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setMusicPropertyEClass, SetMusicProperty.class, "SetMusicProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetMusicProperty_Value(), this.getScalar(), null, "value", null, 0, 1, SetMusicProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unsetMusicPropertyEClass, UnsetMusicProperty.class, "UnsetMusicProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(directionEEnum, Direction.class, "Direction");
    addEEnumLiteral(directionEEnum, Direction.DEFAULT);
    addEEnumLiteral(directionEEnum, Direction.ABOVE);
    addEEnumLiteral(directionEEnum, Direction.BELOW);

    initEEnum(scriptWithRequiredDirectionEEnum, ScriptWithRequiredDirection.class, "ScriptWithRequiredDirection");
    addEEnumLiteral(scriptWithRequiredDirectionEEnum, ScriptWithRequiredDirection.MARCATO);
    addEEnumLiteral(scriptWithRequiredDirectionEEnum, ScriptWithRequiredDirection.STOPPED);
    addEEnumLiteral(scriptWithRequiredDirectionEEnum, ScriptWithRequiredDirection.TENUTO);
    addEEnumLiteral(scriptWithRequiredDirectionEEnum, ScriptWithRequiredDirection.STACCATISSIMO);
    addEEnumLiteral(scriptWithRequiredDirectionEEnum, ScriptWithRequiredDirection.ACCENT);
    addEEnumLiteral(scriptWithRequiredDirectionEEnum, ScriptWithRequiredDirection.STACCATO);
    addEEnumLiteral(scriptWithRequiredDirectionEEnum, ScriptWithRequiredDirection.PORTATO);

    initEEnum(scriptWithOptionalDirectionEEnum, ScriptWithOptionalDirection.class, "ScriptWithOptionalDirection");
    addEEnumLiteral(scriptWithOptionalDirectionEEnum, ScriptWithOptionalDirection.BEAM_START);
    addEEnumLiteral(scriptWithOptionalDirectionEEnum, ScriptWithOptionalDirection.BEAM_END);
    addEEnumLiteral(scriptWithOptionalDirectionEEnum, ScriptWithOptionalDirection.TIE);
    addEEnumLiteral(scriptWithOptionalDirectionEEnum, ScriptWithOptionalDirection.SLUR_START);
    addEEnumLiteral(scriptWithOptionalDirectionEEnum, ScriptWithOptionalDirection.SLUR_END);
    addEEnumLiteral(scriptWithOptionalDirectionEEnum, ScriptWithOptionalDirection.PHRASING_SLUR_START);
    addEEnumLiteral(scriptWithOptionalDirectionEEnum, ScriptWithOptionalDirection.PHRASING_SLUR_END);
    addEEnumLiteral(scriptWithOptionalDirectionEEnum, ScriptWithOptionalDirection.DIMINUENDO);
    addEEnumLiteral(scriptWithOptionalDirectionEEnum, ScriptWithOptionalDirection.CRESCENDO);
    addEEnumLiteral(scriptWithOptionalDirectionEEnum, ScriptWithOptionalDirection.DYNAMIC_CHANGE_END);

    // Create resource
    createResource(eNS_URI);
  }

} //LilyPondPackageImpl
