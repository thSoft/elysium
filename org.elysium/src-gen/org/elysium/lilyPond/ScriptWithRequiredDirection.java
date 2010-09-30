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
 * A representation of the literals of the enumeration '<em><b>Script With Required Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.elysium.lilyPond.LilyPondPackage#getScriptWithRequiredDirection()
 * @model
 * @generated
 */
public enum ScriptWithRequiredDirection implements Enumerator
{
  /**
   * The '<em><b>Marcato</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MARCATO_VALUE
   * @generated
   * @ordered
   */
  MARCATO(0, "marcato", "^"),

  /**
   * The '<em><b>Stopped</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STOPPED_VALUE
   * @generated
   * @ordered
   */
  STOPPED(1, "stopped", "+"),

  /**
   * The '<em><b>Tenuto</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TENUTO_VALUE
   * @generated
   * @ordered
   */
  TENUTO(2, "tenuto", "-"),

  /**
   * The '<em><b>Staccatissimo</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STACCATISSIMO_VALUE
   * @generated
   * @ordered
   */
  STACCATISSIMO(3, "staccatissimo", "|"),

  /**
   * The '<em><b>Accent</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACCENT_VALUE
   * @generated
   * @ordered
   */
  ACCENT(4, "accent", ">"),

  /**
   * The '<em><b>Staccato</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STACCATO_VALUE
   * @generated
   * @ordered
   */
  STACCATO(5, "staccato", "."),

  /**
   * The '<em><b>Portato</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PORTATO_VALUE
   * @generated
   * @ordered
   */
  PORTATO(6, "portato", "_");

  /**
   * The '<em><b>Marcato</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Marcato</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MARCATO
   * @model name="marcato" literal="^"
   * @generated
   * @ordered
   */
  public static final int MARCATO_VALUE = 0;

  /**
   * The '<em><b>Stopped</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Stopped</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STOPPED
   * @model name="stopped" literal="+"
   * @generated
   * @ordered
   */
  public static final int STOPPED_VALUE = 1;

  /**
   * The '<em><b>Tenuto</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tenuto</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TENUTO
   * @model name="tenuto" literal="-"
   * @generated
   * @ordered
   */
  public static final int TENUTO_VALUE = 2;

  /**
   * The '<em><b>Staccatissimo</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Staccatissimo</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STACCATISSIMO
   * @model name="staccatissimo" literal="|"
   * @generated
   * @ordered
   */
  public static final int STACCATISSIMO_VALUE = 3;

  /**
   * The '<em><b>Accent</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Accent</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ACCENT
   * @model name="accent" literal=">"
   * @generated
   * @ordered
   */
  public static final int ACCENT_VALUE = 4;

  /**
   * The '<em><b>Staccato</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Staccato</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STACCATO
   * @model name="staccato" literal="."
   * @generated
   * @ordered
   */
  public static final int STACCATO_VALUE = 5;

  /**
   * The '<em><b>Portato</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Portato</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PORTATO
   * @model name="portato" literal="_"
   * @generated
   * @ordered
   */
  public static final int PORTATO_VALUE = 6;

  /**
   * An array of all the '<em><b>Script With Required Direction</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ScriptWithRequiredDirection[] VALUES_ARRAY =
    new ScriptWithRequiredDirection[]
    {
      MARCATO,
      STOPPED,
      TENUTO,
      STACCATISSIMO,
      ACCENT,
      STACCATO,
      PORTATO,
    };

  /**
   * A public read-only list of all the '<em><b>Script With Required Direction</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ScriptWithRequiredDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Script With Required Direction</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ScriptWithRequiredDirection get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ScriptWithRequiredDirection result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Script With Required Direction</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ScriptWithRequiredDirection getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ScriptWithRequiredDirection result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Script With Required Direction</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ScriptWithRequiredDirection get(int value)
  {
    switch (value)
    {
      case MARCATO_VALUE: return MARCATO;
      case STOPPED_VALUE: return STOPPED;
      case TENUTO_VALUE: return TENUTO;
      case STACCATISSIMO_VALUE: return STACCATISSIMO;
      case ACCENT_VALUE: return ACCENT;
      case STACCATO_VALUE: return STACCATO;
      case PORTATO_VALUE: return PORTATO;
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
  private ScriptWithRequiredDirection(int value, String name, String literal)
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
  
} //ScriptWithRequiredDirection
