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
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
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
      public Adapter caseSchemeText(SchemeText object)
      {
        return createSchemeTextAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseArbitraryCommand(ArbitraryCommand object)
      {
        return createArbitraryCommandAdapter();
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
      public Adapter caseText(Text object)
      {
        return createTextAdapter();
      }
      @Override
      public Adapter caseNumber(org.elysium.lilyPond.Number object)
      {
        return createNumberAdapter();
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
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SimpleBlock <em>Simple Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SimpleBlock
   * @generated
   */
  public Adapter createSimpleBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SimultaneousBlock <em>Simultaneous Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SimultaneousBlock
   * @generated
   */
  public Adapter createSimultaneousBlockAdapter()
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
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SchemeBlock <em>Scheme Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SchemeBlock
   * @generated
   */
  public Adapter createSchemeBlockAdapter()
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
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.ArbitraryCommand <em>Arbitrary Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.ArbitraryCommand
   * @generated
   */
  public Adapter createArbitraryCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.SpecialCommand <em>Special Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.SpecialCommand
   * @generated
   */
  public Adapter createSpecialCommandAdapter()
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
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Text
   * @generated
   */
  public Adapter createTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.elysium.lilyPond.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.elysium.lilyPond.Number
   * @generated
   */
  public Adapter createNumberAdapter()
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
