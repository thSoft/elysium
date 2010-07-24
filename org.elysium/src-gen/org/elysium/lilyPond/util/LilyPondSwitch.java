/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.elysium.lilyPond.ArbitraryCommand;
import org.elysium.lilyPond.Block;
import org.elysium.lilyPond.Command;
import org.elysium.lilyPond.Expression;
import org.elysium.lilyPond.Include;
import org.elysium.lilyPond.LilyPond;
import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.Scheme;
import org.elysium.lilyPond.SchemeBlock;
import org.elysium.lilyPond.SchemeBoolean;
import org.elysium.lilyPond.SchemeExpression;
import org.elysium.lilyPond.SchemeList;
import org.elysium.lilyPond.SchemeText;
import org.elysium.lilyPond.SchemeValue;
import org.elysium.lilyPond.SimpleBlock;
import org.elysium.lilyPond.SimultaneousBlock;
import org.elysium.lilyPond.SpecialCommand;
import org.elysium.lilyPond.Text;
import org.elysium.lilyPond.Version;

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
      case LilyPondPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseExpression(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SIMPLE_BLOCK:
      {
        SimpleBlock simpleBlock = (SimpleBlock)theEObject;
        T result = caseSimpleBlock(simpleBlock);
        if (result == null) result = caseBlock(simpleBlock);
        if (result == null) result = caseExpression(simpleBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SIMULTANEOUS_BLOCK:
      {
        SimultaneousBlock simultaneousBlock = (SimultaneousBlock)theEObject;
        T result = caseSimultaneousBlock(simultaneousBlock);
        if (result == null) result = caseBlock(simultaneousBlock);
        if (result == null) result = caseExpression(simultaneousBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SCHEME:
      {
        Scheme scheme = (Scheme)theEObject;
        T result = caseScheme(scheme);
        if (result == null) result = caseExpression(scheme);
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
      case LilyPondPackage.SCHEME_BLOCK:
      {
        SchemeBlock schemeBlock = (SchemeBlock)theEObject;
        T result = caseSchemeBlock(schemeBlock);
        if (result == null) result = caseSchemeValue(schemeBlock);
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
      case LilyPondPackage.COMMAND:
      {
        Command command = (Command)theEObject;
        T result = caseCommand(command);
        if (result == null) result = caseExpression(command);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.ARBITRARY_COMMAND:
      {
        ArbitraryCommand arbitraryCommand = (ArbitraryCommand)theEObject;
        T result = caseArbitraryCommand(arbitraryCommand);
        if (result == null) result = caseCommand(arbitraryCommand);
        if (result == null) result = caseExpression(arbitraryCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.SPECIAL_COMMAND:
      {
        SpecialCommand specialCommand = (SpecialCommand)theEObject;
        T result = caseSpecialCommand(specialCommand);
        if (result == null) result = caseCommand(specialCommand);
        if (result == null) result = caseExpression(specialCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.INCLUDE:
      {
        Include include = (Include)theEObject;
        T result = caseInclude(include);
        if (result == null) result = caseSpecialCommand(include);
        if (result == null) result = caseCommand(include);
        if (result == null) result = caseExpression(include);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.VERSION:
      {
        Version version = (Version)theEObject;
        T result = caseVersion(version);
        if (result == null) result = caseSpecialCommand(version);
        if (result == null) result = caseCommand(version);
        if (result == null) result = caseExpression(version);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = caseExpression(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilyPondPackage.NUMBER:
      {
        org.elysium.lilyPond.Number number = (org.elysium.lilyPond.Number)theEObject;
        T result = caseNumber(number);
        if (result == null) result = caseExpression(number);
        if (result == null) result = caseSchemeValue(number);
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
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleBlock(SimpleBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simultaneous Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simultaneous Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimultaneousBlock(SimultaneousBlock object)
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
   * Returns the result of interpreting the object as an instance of '<em>Scheme Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scheme Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemeBlock(SchemeBlock object)
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
   * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommand(Command object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arbitrary Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arbitrary Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArbitraryCommand(ArbitraryCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Special Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Special Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecialCommand(SpecialCommand object)
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
   * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseText(Text object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumber(org.elysium.lilyPond.Number object)
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
