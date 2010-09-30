/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Script With Optional Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.elysium.lilyPond.LilyPondPackage#getScriptWithOptionalDirection()
 * @model
 * @generated
 */
public enum ScriptWithOptionalDirection implements Enumerator
{
  /**
   * The '<em><b>Beam Start</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEAM_START_VALUE
   * @generated
   * @ordered
   */
  BEAM_START(0, "beamStart", "["),

  /**
   * The '<em><b>Beam End</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BEAM_END_VALUE
   * @generated
   * @ordered
   */
  BEAM_END(1, "beamEnd", "]"),

  /**
   * The '<em><b>Tie</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIE_VALUE
   * @generated
   * @ordered
   */
  TIE(2, "tie", "~"),

  /**
   * The '<em><b>Slur Start</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SLUR_START_VALUE
   * @generated
   * @ordered
   */
  SLUR_START(3, "slurStart", "("),

  /**
   * The '<em><b>Slur End</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SLUR_END_VALUE
   * @generated
   * @ordered
   */
  SLUR_END(4, "slurEnd", ")"),

  /**
   * The '<em><b>Phrasing Slur Start</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PHRASING_SLUR_START_VALUE
   * @generated
   * @ordered
   */
  PHRASING_SLUR_START(5, "phrasingSlurStart", "\\("),

  /**
   * The '<em><b>Phrasing Slur End</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PHRASING_SLUR_END_VALUE
   * @generated
   * @ordered
   */
  PHRASING_SLUR_END(6, "phrasingSlurEnd", "\\)"),

  /**
   * The '<em><b>Diminuendo</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIMINUENDO_VALUE
   * @generated
   * @ordered
   */
  DIMINUENDO(7, "diminuendo", "\\>"),

  /**
   * The '<em><b>Crescendo</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CRESCENDO_VALUE
   * @generated
   * @ordered
   */
  CRESCENDO(8, "crescendo", "\\<"),

  /**
   * The '<em><b>Dynamic Change End</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DYNAMIC_CHANGE_END_VALUE
   * @generated
   * @ordered
   */
  DYNAMIC_CHANGE_END(9, "dynamicChangeEnd", "\\!");

  /**
   * The '<em><b>Beam Start</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Beam Start</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BEAM_START
   * @model name="beamStart" literal="["
   * @generated
   * @ordered
   */
  public static final int BEAM_START_VALUE = 0;

  /**
   * The '<em><b>Beam End</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Beam End</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BEAM_END
   * @model name="beamEnd" literal="]"
   * @generated
   * @ordered
   */
  public static final int BEAM_END_VALUE = 1;

  /**
   * The '<em><b>Tie</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tie</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIE
   * @model name="tie" literal="~"
   * @generated
   * @ordered
   */
  public static final int TIE_VALUE = 2;

  /**
   * The '<em><b>Slur Start</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Slur Start</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SLUR_START
   * @model name="slurStart" literal="("
   * @generated
   * @ordered
   */
  public static final int SLUR_START_VALUE = 3;

  /**
   * The '<em><b>Slur End</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Slur End</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SLUR_END
   * @model name="slurEnd" literal=")"
   * @generated
   * @ordered
   */
  public static final int SLUR_END_VALUE = 4;

  /**
   * The '<em><b>Phrasing Slur Start</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Phrasing Slur Start</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PHRASING_SLUR_START
   * @model name="phrasingSlurStart" literal="\\("
   * @generated
   * @ordered
   */
  public static final int PHRASING_SLUR_START_VALUE = 5;

  /**
   * The '<em><b>Phrasing Slur End</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Phrasing Slur End</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PHRASING_SLUR_END
   * @model name="phrasingSlurEnd" literal="\\)"
   * @generated
   * @ordered
   */
  public static final int PHRASING_SLUR_END_VALUE = 6;

  /**
   * The '<em><b>Diminuendo</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Diminuendo</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DIMINUENDO
   * @model name="diminuendo" literal="\\>"
   * @generated
   * @ordered
   */
  public static final int DIMINUENDO_VALUE = 7;

  /**
   * The '<em><b>Crescendo</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Crescendo</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CRESCENDO
   * @model name="crescendo" literal="\\<"
   * @generated
   * @ordered
   */
  public static final int CRESCENDO_VALUE = 8;

  /**
   * The '<em><b>Dynamic Change End</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Dynamic Change End</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DYNAMIC_CHANGE_END
   * @model name="dynamicChangeEnd" literal="\\!"
   * @generated
   * @ordered
   */
  public static final int DYNAMIC_CHANGE_END_VALUE = 9;

  /**
   * An array of all the '<em><b>Script With Optional Direction</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ScriptWithOptionalDirection[] VALUES_ARRAY =
    new ScriptWithOptionalDirection[]
    {
      BEAM_START,
      BEAM_END,
      TIE,
      SLUR_START,
      SLUR_END,
      PHRASING_SLUR_START,
      PHRASING_SLUR_END,
      DIMINUENDO,
      CRESCENDO,
      DYNAMIC_CHANGE_END,
    };

  /**
   * A public read-only list of all the '<em><b>Script With Optional Direction</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ScriptWithOptionalDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Script With Optional Direction</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ScriptWithOptionalDirection get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ScriptWithOptionalDirection result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Script With Optional Direction</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ScriptWithOptionalDirection getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ScriptWithOptionalDirection result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Script With Optional Direction</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ScriptWithOptionalDirection get(int value)
  {
    switch (value)
    {
      case BEAM_START_VALUE: return BEAM_START;
      case BEAM_END_VALUE: return BEAM_END;
      case TIE_VALUE: return TIE;
      case SLUR_START_VALUE: return SLUR_START;
      case SLUR_END_VALUE: return SLUR_END;
      case PHRASING_SLUR_START_VALUE: return PHRASING_SLUR_START;
      case PHRASING_SLUR_END_VALUE: return PHRASING_SLUR_END;
      case DIMINUENDO_VALUE: return DIMINUENDO;
      case CRESCENDO_VALUE: return CRESCENDO;
      case DYNAMIC_CHANGE_END_VALUE: return DYNAMIC_CHANGE_END;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ScriptWithOptionalDirection(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ScriptWithOptionalDirection
