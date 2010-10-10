/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.elysium.lilypond.LilypondPackage
 * @generated
 */
public class LilypondAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LilypondPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilypondAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LilypondPackage.eINSTANCE;
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
  protected LilypondSwitch<Adapter> modelSwitch =
    new LilypondSwitch<Adapter>()
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
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseCommonExpression(CommonExpression object)
      {
        return createCommonExpressionAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter casePropertyAssignment(PropertyAssignment object)
      {
        return createPropertyAssignmentAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseSimpleBlock(SimpleBlock object)
      {
        return createSimpleBlockAdapter();
      }
      @Override
      public Adapter caseSimultaneousBlock(SimultaneousBlock object)
      {
        return createSimultaneousBlockAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseSpecialCommand(SpecialCommand object)
      {
        return createSpecialCommandAdapter();
      }
      @Override
      public Adapter caseInclude(Include object)
      {
        return createIncludeAdapter();
      }
      @Override
      public Adapter caseVersion(Version object)
      {
        return createVersionAdapter();
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
      public Adapter caseContext(Context object)
      {
        return createContextAdapter();
      }
      @Override
      public Adapter caseOther(Other object)
      {
        return createOtherAdapter();
      }
      @Override
      public Adapter caseUnparsedBlock(UnparsedBlock object)
      {
        return createUnparsedBlockAdapter();
      }
      @Override
      public Adapter caseUnparsedExpression(UnparsedExpression object)
      {
        return createUnparsedExpressionAdapter();
      }
      @Override
      public Adapter caseUnparsedCommand(UnparsedCommand object)
      {
        return createUnparsedCommandAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseText(Text object)
      {
        return createTextAdapter();
      }
      @Override
      public Adapter caseNumber(org.elysium.lilypond.Number object)
      {
        return createNumberAdapter();
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
      public Adapter caseSchemeBlock(SchemeBlock object)
      {
        return createSchemeBlockAdapter();
      }
      @Override
      public Adapter caseSchemeCharacter(SchemeCharacter object)
      {
        return createSchemeCharacterAdapter();
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
      public Adapter caseSchemeMarkupCommand(SchemeMarkupCommand object)
      {
        return createSchemeMarkupCommandAdapter();
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
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.LilyPond <em>Lily Pond</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.LilyPond
   * @generated
   */
  public Adapter createLilyPondAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.ToplevelExpression <em>Toplevel Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.ToplevelExpression
   * @generated
   */
  public Adapter createToplevelExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.CommonExpression <em>Common Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.CommonExpression
   * @generated
   */
  public Adapter createCommonExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.PropertyAssignment <em>Property Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.PropertyAssignment
   * @generated
   */
  public Adapter createPropertyAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.SimpleBlock <em>Simple Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.SimpleBlock
   * @generated
   */
  public Adapter createSimpleBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.SimultaneousBlock <em>Simultaneous Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.SimultaneousBlock
   * @generated
   */
  public Adapter createSimultaneousBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.SpecialCommand <em>Special Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.SpecialCommand
   * @generated
   */
  public Adapter createSpecialCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.Include
   * @generated
   */
  public Adapter createIncludeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.Version
   * @generated
   */
  public Adapter createVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.Markup <em>Markup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.Markup
   * @generated
   */
  public Adapter createMarkupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.MarkupLines <em>Markup Lines</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.MarkupLines
   * @generated
   */
  public Adapter createMarkupLinesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.Context
   * @generated
   */
  public Adapter createContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.Other <em>Other</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.Other
   * @generated
   */
  public Adapter createOtherAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.UnparsedBlock <em>Unparsed Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.UnparsedBlock
   * @generated
   */
  public Adapter createUnparsedBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.UnparsedExpression <em>Unparsed Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.UnparsedExpression
   * @generated
   */
  public Adapter createUnparsedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.UnparsedCommand <em>Unparsed Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.UnparsedCommand
   * @generated
   */
  public Adapter createUnparsedCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.Text
   * @generated
   */
  public Adapter createTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.Number
   * @generated
   */
  public Adapter createNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.Scheme <em>Scheme</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.Scheme
   * @generated
   */
  public Adapter createSchemeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.SchemeExpression <em>Scheme Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.SchemeExpression
   * @generated
   */
  public Adapter createSchemeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.SchemeValue <em>Scheme Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.SchemeValue
   * @generated
   */
  public Adapter createSchemeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.SchemeBoolean <em>Scheme Boolean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.SchemeBoolean
   * @generated
   */
  public Adapter createSchemeBooleanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.SchemeList <em>Scheme List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.SchemeList
   * @generated
   */
  public Adapter createSchemeListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.SchemeBlock <em>Scheme Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.SchemeBlock
   * @generated
   */
  public Adapter createSchemeBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.SchemeCharacter <em>Scheme Character</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.SchemeCharacter
   * @generated
   */
  public Adapter createSchemeCharacterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.SchemeText <em>Scheme Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.SchemeText
   * @generated
   */
  public Adapter createSchemeTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.SchemeNumber <em>Scheme Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.SchemeNumber
   * @generated
   */
  public Adapter createSchemeNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilypond.SchemeMarkupCommand <em>Scheme Markup Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilypond.SchemeMarkupCommand
   * @generated
   */
  public Adapter createSchemeMarkupCommandAdapter()
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

} //LilypondAdapterFactory
