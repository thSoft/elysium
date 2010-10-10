/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.elysium.lilypond.Assignment;
import org.elysium.lilypond.Block;
import org.elysium.lilypond.Command;
import org.elysium.lilypond.CommonExpression;
import org.elysium.lilypond.Context;
import org.elysium.lilypond.Expression;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilyPond;
import org.elysium.lilypond.LilypondPackage;
import org.elysium.lilypond.Markup;
import org.elysium.lilypond.MarkupLines;
import org.elysium.lilypond.Other;
import org.elysium.lilypond.PropertyAssignment;
import org.elysium.lilypond.Reference;
import org.elysium.lilypond.Scheme;
import org.elysium.lilypond.SchemeBlock;
import org.elysium.lilypond.SchemeBoolean;
import org.elysium.lilypond.SchemeCharacter;
import org.elysium.lilypond.SchemeExpression;
import org.elysium.lilypond.SchemeList;
import org.elysium.lilypond.SchemeMarkupCommand;
import org.elysium.lilypond.SchemeNumber;
import org.elysium.lilypond.SchemeText;
import org.elysium.lilypond.SchemeValue;
import org.elysium.lilypond.SimpleBlock;
import org.elysium.lilypond.SimultaneousBlock;
import org.elysium.lilypond.SpecialCommand;
import org.elysium.lilypond.Text;
import org.elysium.lilypond.ToplevelExpression;
import org.elysium.lilypond.UnparsedBlock;
import org.elysium.lilypond.UnparsedCommand;
import org.elysium.lilypond.UnparsedExpression;
import org.elysium.lilypond.Version;

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
 * @see org.elysium.lilypond.LilypondPackage
 * @generated
 */
public class LilypondSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LilypondPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilypondSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LilypondPackage.eINSTANCE;
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
      case LilypondPackage.LILY_POND:
      {
        LilyPond lilyPond = (LilyPond)theEObject;
        T result = caseLilyPond(lilyPond);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.TOPLEVEL_EXPRESSION:
      {
        ToplevelExpression toplevelExpression = (ToplevelExpression)theEObject;
        T result = caseToplevelExpression(toplevelExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.COMMON_EXPRESSION:
      {
        CommonExpression commonExpression = (CommonExpression)theEObject;
        T result = caseCommonExpression(commonExpression);
        if (result == null) result = caseToplevelExpression(commonExpression);
        if (result == null) result = caseExpression(commonExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = caseToplevelExpression(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.PROPERTY_ASSIGNMENT:
      {
        PropertyAssignment propertyAssignment = (PropertyAssignment)theEObject;
        T result = casePropertyAssignment(propertyAssignment);
        if (result == null) result = caseExpression(propertyAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseCommonExpression(block);
        if (result == null) result = caseToplevelExpression(block);
        if (result == null) result = caseExpression(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.SIMPLE_BLOCK:
      {
        SimpleBlock simpleBlock = (SimpleBlock)theEObject;
        T result = caseSimpleBlock(simpleBlock);
        if (result == null) result = caseBlock(simpleBlock);
        if (result == null) result = caseCommonExpression(simpleBlock);
        if (result == null) result = caseToplevelExpression(simpleBlock);
        if (result == null) result = caseExpression(simpleBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.SIMULTANEOUS_BLOCK:
      {
        SimultaneousBlock simultaneousBlock = (SimultaneousBlock)theEObject;
        T result = caseSimultaneousBlock(simultaneousBlock);
        if (result == null) result = caseBlock(simultaneousBlock);
        if (result == null) result = caseCommonExpression(simultaneousBlock);
        if (result == null) result = caseToplevelExpression(simultaneousBlock);
        if (result == null) result = caseExpression(simultaneousBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.COMMAND:
      {
        Command command = (Command)theEObject;
        T result = caseCommand(command);
        if (result == null) result = caseCommonExpression(command);
        if (result == null) result = caseToplevelExpression(command);
        if (result == null) result = caseExpression(command);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.SPECIAL_COMMAND:
      {
        SpecialCommand specialCommand = (SpecialCommand)theEObject;
        T result = caseSpecialCommand(specialCommand);
        if (result == null) result = caseCommand(specialCommand);
        if (result == null) result = caseCommonExpression(specialCommand);
        if (result == null) result = caseToplevelExpression(specialCommand);
        if (result == null) result = caseExpression(specialCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.INCLUDE:
      {
        Include include = (Include)theEObject;
        T result = caseInclude(include);
        if (result == null) result = caseSpecialCommand(include);
        if (result == null) result = caseCommand(include);
        if (result == null) result = caseCommonExpression(include);
        if (result == null) result = caseToplevelExpression(include);
        if (result == null) result = caseExpression(include);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.VERSION:
      {
        Version version = (Version)theEObject;
        T result = caseVersion(version);
        if (result == null) result = caseSpecialCommand(version);
        if (result == null) result = caseCommand(version);
        if (result == null) result = caseCommonExpression(version);
        if (result == null) result = caseToplevelExpression(version);
        if (result == null) result = caseExpression(version);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.MARKUP:
      {
        Markup markup = (Markup)theEObject;
        T result = caseMarkup(markup);
        if (result == null) result = caseSpecialCommand(markup);
        if (result == null) result = caseCommand(markup);
        if (result == null) result = caseCommonExpression(markup);
        if (result == null) result = caseToplevelExpression(markup);
        if (result == null) result = caseExpression(markup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.MARKUP_LINES:
      {
        MarkupLines markupLines = (MarkupLines)theEObject;
        T result = caseMarkupLines(markupLines);
        if (result == null) result = caseSpecialCommand(markupLines);
        if (result == null) result = caseCommand(markupLines);
        if (result == null) result = caseCommonExpression(markupLines);
        if (result == null) result = caseToplevelExpression(markupLines);
        if (result == null) result = caseExpression(markupLines);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.CONTEXT:
      {
        Context context = (Context)theEObject;
        T result = caseContext(context);
        if (result == null) result = caseSpecialCommand(context);
        if (result == null) result = caseCommand(context);
        if (result == null) result = caseCommonExpression(context);
        if (result == null) result = caseToplevelExpression(context);
        if (result == null) result = caseExpression(context);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.OTHER:
      {
        Other other = (Other)theEObject;
        T result = caseOther(other);
        if (result == null) result = caseSpecialCommand(other);
        if (result == null) result = caseCommand(other);
        if (result == null) result = caseCommonExpression(other);
        if (result == null) result = caseToplevelExpression(other);
        if (result == null) result = caseExpression(other);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.UNPARSED_BLOCK:
      {
        UnparsedBlock unparsedBlock = (UnparsedBlock)theEObject;
        T result = caseUnparsedBlock(unparsedBlock);
        if (result == null) result = caseUnparsedExpression(unparsedBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.UNPARSED_EXPRESSION:
      {
        UnparsedExpression unparsedExpression = (UnparsedExpression)theEObject;
        T result = caseUnparsedExpression(unparsedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.UNPARSED_COMMAND:
      {
        UnparsedCommand unparsedCommand = (UnparsedCommand)theEObject;
        T result = caseUnparsedCommand(unparsedCommand);
        if (result == null) result = caseUnparsedExpression(unparsedCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = caseCommand(reference);
        if (result == null) result = caseCommonExpression(reference);
        if (result == null) result = caseToplevelExpression(reference);
        if (result == null) result = caseExpression(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = caseCommonExpression(text);
        if (result == null) result = caseUnparsedExpression(text);
        if (result == null) result = caseToplevelExpression(text);
        if (result == null) result = caseExpression(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.NUMBER:
      {
        org.elysium.lilypond.Number number = (org.elysium.lilypond.Number)theEObject;
        T result = caseNumber(number);
        if (result == null) result = caseCommonExpression(number);
        if (result == null) result = caseUnparsedExpression(number);
        if (result == null) result = caseToplevelExpression(number);
        if (result == null) result = caseExpression(number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.SCHEME:
      {
        Scheme scheme = (Scheme)theEObject;
        T result = caseScheme(scheme);
        if (result == null) result = caseCommonExpression(scheme);
        if (result == null) result = caseUnparsedExpression(scheme);
        if (result == null) result = caseToplevelExpression(scheme);
        if (result == null) result = caseExpression(scheme);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.SCHEME_EXPRESSION:
      {
        SchemeExpression schemeExpression = (SchemeExpression)theEObject;
        T result = caseSchemeExpression(schemeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.SCHEME_VALUE:
      {
        SchemeValue schemeValue = (SchemeValue)theEObject;
        T result = caseSchemeValue(schemeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.SCHEME_BOOLEAN:
      {
        SchemeBoolean schemeBoolean = (SchemeBoolean)theEObject;
        T result = caseSchemeBoolean(schemeBoolean);
        if (result == null) result = caseSchemeValue(schemeBoolean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.SCHEME_LIST:
      {
        SchemeList schemeList = (SchemeList)theEObject;
        T result = caseSchemeList(schemeList);
        if (result == null) result = caseSchemeValue(schemeList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.SCHEME_BLOCK:
      {
        SchemeBlock schemeBlock = (SchemeBlock)theEObject;
        T result = caseSchemeBlock(schemeBlock);
        if (result == null) result = caseSchemeValue(schemeBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.SCHEME_CHARACTER:
      {
        SchemeCharacter schemeCharacter = (SchemeCharacter)theEObject;
        T result = caseSchemeCharacter(schemeCharacter);
        if (result == null) result = caseSchemeValue(schemeCharacter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.SCHEME_TEXT:
      {
        SchemeText schemeText = (SchemeText)theEObject;
        T result = caseSchemeText(schemeText);
        if (result == null) result = caseSchemeValue(schemeText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.SCHEME_NUMBER:
      {
        SchemeNumber schemeNumber = (SchemeNumber)theEObject;
        T result = caseSchemeNumber(schemeNumber);
        if (result == null) result = caseSchemeValue(schemeNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilypondPackage.SCHEME_MARKUP_COMMAND:
      {
        SchemeMarkupCommand schemeMarkupCommand = (SchemeMarkupCommand)theEObject;
        T result = caseSchemeMarkupCommand(schemeMarkupCommand);
        if (result == null) result = caseSchemeValue(schemeMarkupCommand);
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
   * Returns the result of interpreting the object as an instance of '<em>Common Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Common Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommonExpression(CommonExpression object)
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
   * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContext(Context object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Other</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Other</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOther(Other object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unparsed Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unparsed Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnparsedBlock(UnparsedBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unparsed Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unparsed Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnparsedExpression(UnparsedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unparsed Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unparsed Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnparsedCommand(UnparsedCommand object)
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
  public T caseNumber(org.elysium.lilypond.Number object)
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
   * Returns the result of interpreting the object as an instance of '<em>Scheme Character</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scheme Character</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemeCharacter(SchemeCharacter object)
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
   * Returns the result of interpreting the object as an instance of '<em>Scheme Markup Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scheme Markup Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSchemeMarkupCommand(SchemeMarkupCommand object)
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

} //LilypondSwitch
