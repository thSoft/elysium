/**
 * <copyright>
 * </copyright>
 *
 */
package org.elysium.lilypond.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.elysium.lilypond.LilypondPackage;
import org.elysium.lilypond.Octave;
import org.elysium.lilypond.Pitch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pitch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.elysium.lilypond.impl.PitchImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.elysium.lilypond.impl.PitchImpl#isOctaveCheck <em>Octave Check</em>}</li>
 *   <li>{@link org.elysium.lilypond.impl.PitchImpl#getOctaveShift <em>Octave Shift</em>}</li>
 *   <li>{@link org.elysium.lilypond.impl.PitchImpl#isReminderAccidental <em>Reminder Accidental</em>}</li>
 *   <li>{@link org.elysium.lilypond.impl.PitchImpl#isCautionaryAccidental <em>Cautionary Accidental</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PitchImpl extends MinimalEObjectImpl.Container implements Pitch
{
  /**
   * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected static final String BASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected String base = BASE_EDEFAULT;

  /**
   * The default value of the '{@link #isOctaveCheck() <em>Octave Check</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOctaveCheck()
   * @generated
   * @ordered
   */
  protected static final boolean OCTAVE_CHECK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOctaveCheck() <em>Octave Check</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOctaveCheck()
   * @generated
   * @ordered
   */
  protected boolean octaveCheck = OCTAVE_CHECK_EDEFAULT;

  /**
   * The cached value of the '{@link #getOctaveShift() <em>Octave Shift</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOctaveShift()
   * @generated
   * @ordered
   */
  protected Octave octaveShift;

  /**
   * The default value of the '{@link #isReminderAccidental() <em>Reminder Accidental</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReminderAccidental()
   * @generated
   * @ordered
   */
  protected static final boolean REMINDER_ACCIDENTAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReminderAccidental() <em>Reminder Accidental</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReminderAccidental()
   * @generated
   * @ordered
   */
  protected boolean reminderAccidental = REMINDER_ACCIDENTAL_EDEFAULT;

  /**
   * The default value of the '{@link #isCautionaryAccidental() <em>Cautionary Accidental</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCautionaryAccidental()
   * @generated
   * @ordered
   */
  protected static final boolean CAUTIONARY_ACCIDENTAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCautionaryAccidental() <em>Cautionary Accidental</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCautionaryAccidental()
   * @generated
   * @ordered
   */
  protected boolean cautionaryAccidental = CAUTIONARY_ACCIDENTAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PitchImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LilypondPackage.Literals.PITCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBase()
  {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase(String newBase)
  {
    String oldBase = base;
    base = newBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilypondPackage.PITCH__BASE, oldBase, base));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOctaveCheck()
  {
    return octaveCheck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOctaveCheck(boolean newOctaveCheck)
  {
    boolean oldOctaveCheck = octaveCheck;
    octaveCheck = newOctaveCheck;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilypondPackage.PITCH__OCTAVE_CHECK, oldOctaveCheck, octaveCheck));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Octave getOctaveShift()
  {
    return octaveShift;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOctaveShift(Octave newOctaveShift, NotificationChain msgs)
  {
    Octave oldOctaveShift = octaveShift;
    octaveShift = newOctaveShift;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilypondPackage.PITCH__OCTAVE_SHIFT, oldOctaveShift, newOctaveShift);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOctaveShift(Octave newOctaveShift)
  {
    if (newOctaveShift != octaveShift)
    {
      NotificationChain msgs = null;
      if (octaveShift != null)
        msgs = ((InternalEObject)octaveShift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilypondPackage.PITCH__OCTAVE_SHIFT, null, msgs);
      if (newOctaveShift != null)
        msgs = ((InternalEObject)newOctaveShift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilypondPackage.PITCH__OCTAVE_SHIFT, null, msgs);
      msgs = basicSetOctaveShift(newOctaveShift, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilypondPackage.PITCH__OCTAVE_SHIFT, newOctaveShift, newOctaveShift));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReminderAccidental()
  {
    return reminderAccidental;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReminderAccidental(boolean newReminderAccidental)
  {
    boolean oldReminderAccidental = reminderAccidental;
    reminderAccidental = newReminderAccidental;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilypondPackage.PITCH__REMINDER_ACCIDENTAL, oldReminderAccidental, reminderAccidental));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCautionaryAccidental()
  {
    return cautionaryAccidental;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCautionaryAccidental(boolean newCautionaryAccidental)
  {
    boolean oldCautionaryAccidental = cautionaryAccidental;
    cautionaryAccidental = newCautionaryAccidental;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilypondPackage.PITCH__CAUTIONARY_ACCIDENTAL, oldCautionaryAccidental, cautionaryAccidental));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LilypondPackage.PITCH__OCTAVE_SHIFT:
        return basicSetOctaveShift(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LilypondPackage.PITCH__BASE:
        return getBase();
      case LilypondPackage.PITCH__OCTAVE_CHECK:
        return isOctaveCheck();
      case LilypondPackage.PITCH__OCTAVE_SHIFT:
        return getOctaveShift();
      case LilypondPackage.PITCH__REMINDER_ACCIDENTAL:
        return isReminderAccidental();
      case LilypondPackage.PITCH__CAUTIONARY_ACCIDENTAL:
        return isCautionaryAccidental();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LilypondPackage.PITCH__BASE:
        setBase((String)newValue);
        return;
      case LilypondPackage.PITCH__OCTAVE_CHECK:
        setOctaveCheck((Boolean)newValue);
        return;
      case LilypondPackage.PITCH__OCTAVE_SHIFT:
        setOctaveShift((Octave)newValue);
        return;
      case LilypondPackage.PITCH__REMINDER_ACCIDENTAL:
        setReminderAccidental((Boolean)newValue);
        return;
      case LilypondPackage.PITCH__CAUTIONARY_ACCIDENTAL:
        setCautionaryAccidental((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LilypondPackage.PITCH__BASE:
        setBase(BASE_EDEFAULT);
        return;
      case LilypondPackage.PITCH__OCTAVE_CHECK:
        setOctaveCheck(OCTAVE_CHECK_EDEFAULT);
        return;
      case LilypondPackage.PITCH__OCTAVE_SHIFT:
        setOctaveShift((Octave)null);
        return;
      case LilypondPackage.PITCH__REMINDER_ACCIDENTAL:
        setReminderAccidental(REMINDER_ACCIDENTAL_EDEFAULT);
        return;
      case LilypondPackage.PITCH__CAUTIONARY_ACCIDENTAL:
        setCautionaryAccidental(CAUTIONARY_ACCIDENTAL_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LilypondPackage.PITCH__BASE:
        return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
      case LilypondPackage.PITCH__OCTAVE_CHECK:
        return octaveCheck != OCTAVE_CHECK_EDEFAULT;
      case LilypondPackage.PITCH__OCTAVE_SHIFT:
        return octaveShift != null;
      case LilypondPackage.PITCH__REMINDER_ACCIDENTAL:
        return reminderAccidental != REMINDER_ACCIDENTAL_EDEFAULT;
      case LilypondPackage.PITCH__CAUTIONARY_ACCIDENTAL:
        return cautionaryAccidental != CAUTIONARY_ACCIDENTAL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (base: ");
    result.append(base);
    result.append(", octaveCheck: ");
    result.append(octaveCheck);
    result.append(", reminderAccidental: ");
    result.append(reminderAccidental);
    result.append(", cautionaryAccidental: ");
    result.append(cautionaryAccidental);
    result.append(')');
    return result.toString();
  }

} //PitchImpl
