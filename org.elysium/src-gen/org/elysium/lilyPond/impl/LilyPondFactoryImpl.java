/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilyPond.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.elysium.lilyPond.ArbitraryCommand;
import org.elysium.lilyPond.Block;
import org.elysium.lilyPond.Command;
import org.elysium.lilyPond.Expression;
import org.elysium.lilyPond.Include;
import org.elysium.lilyPond.LilyPond;
import org.elysium.lilyPond.LilyPondFactory;
import org.elysium.lilyPond.LilyPondPackage;
import org.elysium.lilyPond.Scheme;
import org.elysium.lilyPond.SchemeBlock;
import org.elysium.lilyPond.SchemeBoolean;
import org.elysium.lilyPond.SchemeExpression;
import org.elysium.lilyPond.SchemeList;
import org.elysium.lilyPond.SchemeNumber;
import org.elysium.lilyPond.SchemeText;
import org.elysium.lilyPond.SchemeValue;
import org.elysium.lilyPond.SimpleBlock;
import org.elysium.lilyPond.SimultaneousBlock;
import org.elysium.lilyPond.SpecialCommand;
import org.elysium.lilyPond.Text;
import org.elysium.lilyPond.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LilyPondFactoryImpl extends EFactoryImpl implements LilyPondFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LilyPondFactory init()
  {
    try
    {
      LilyPondFactory theLilyPondFactory = (LilyPondFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.elysium.org/LilyPond"); 
      if (theLilyPondFactory != null)
      {
        return theLilyPondFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LilyPondFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilyPondFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LilyPondPackage.LILY_POND: return createLilyPond();
      case LilyPondPackage.EXPRESSION: return createExpression();
      case LilyPondPackage.BLOCK: return createBlock();
      case LilyPondPackage.SIMPLE_BLOCK: return createSimpleBlock();
      case LilyPondPackage.SIMULTANEOUS_BLOCK: return createSimultaneousBlock();
      case LilyPondPackage.SCHEME: return createScheme();
      case LilyPondPackage.SCHEME_EXPRESSION: return createSchemeExpression();
      case LilyPondPackage.SCHEME_VALUE: return createSchemeValue();
      case LilyPondPackage.SCHEME_BOOLEAN: return createSchemeBoolean();
      case LilyPondPackage.SCHEME_LIST: return createSchemeList();
      case LilyPondPackage.SCHEME_BLOCK: return createSchemeBlock();
      case LilyPondPackage.SCHEME_TEXT: return createSchemeText();
      case LilyPondPackage.SCHEME_NUMBER: return createSchemeNumber();
      case LilyPondPackage.COMMAND: return createCommand();
      case LilyPondPackage.ARBITRARY_COMMAND: return createArbitraryCommand();
      case LilyPondPackage.SPECIAL_COMMAND: return createSpecialCommand();
      case LilyPondPackage.INCLUDE: return createInclude();
      case LilyPondPackage.VERSION: return createVersion();
      case LilyPondPackage.TEXT: return createText();
      case LilyPondPackage.NUMBER: return createNumber();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilyPond createLilyPond()
  {
    LilyPondImpl lilyPond = new LilyPondImpl();
    return lilyPond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleBlock createSimpleBlock()
  {
    SimpleBlockImpl simpleBlock = new SimpleBlockImpl();
    return simpleBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimultaneousBlock createSimultaneousBlock()
  {
    SimultaneousBlockImpl simultaneousBlock = new SimultaneousBlockImpl();
    return simultaneousBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scheme createScheme()
  {
    SchemeImpl scheme = new SchemeImpl();
    return scheme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeExpression createSchemeExpression()
  {
    SchemeExpressionImpl schemeExpression = new SchemeExpressionImpl();
    return schemeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeValue createSchemeValue()
  {
    SchemeValueImpl schemeValue = new SchemeValueImpl();
    return schemeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeBoolean createSchemeBoolean()
  {
    SchemeBooleanImpl schemeBoolean = new SchemeBooleanImpl();
    return schemeBoolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeList createSchemeList()
  {
    SchemeListImpl schemeList = new SchemeListImpl();
    return schemeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeBlock createSchemeBlock()
  {
    SchemeBlockImpl schemeBlock = new SchemeBlockImpl();
    return schemeBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeText createSchemeText()
  {
    SchemeTextImpl schemeText = new SchemeTextImpl();
    return schemeText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemeNumber createSchemeNumber()
  {
    SchemeNumberImpl schemeNumber = new SchemeNumberImpl();
    return schemeNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArbitraryCommand createArbitraryCommand()
  {
    ArbitraryCommandImpl arbitraryCommand = new ArbitraryCommandImpl();
    return arbitraryCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecialCommand createSpecialCommand()
  {
    SpecialCommandImpl specialCommand = new SpecialCommandImpl();
    return specialCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Include createInclude()
  {
    IncludeImpl include = new IncludeImpl();
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Version createVersion()
  {
    VersionImpl version = new VersionImpl();
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.elysium.lilyPond.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilyPondPackage getLilyPondPackage()
  {
    return (LilyPondPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LilyPondPackage getPackage()
  {
    return LilyPondPackage.eINSTANCE;
  }

} //LilyPondFactoryImpl
