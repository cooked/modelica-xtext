/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sc.modelica.xtext.modelicaMo.ClassModification;
import sc.modelica.xtext.modelicaMo.ConstrainingClause;
import sc.modelica.xtext.modelicaMo.ModelicaMoPackage;
import sc.modelica.xtext.modelicaMo.Name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraining Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ConstrainingClauseImpl#getName <em>Name</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ConstrainingClauseImpl#getClassModification <em>Class Modification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstrainingClauseImpl extends MinimalEObjectImpl.Container implements ConstrainingClause
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Name name;

  /**
   * The cached value of the '{@link #getClassModification() <em>Class Modification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassModification()
   * @generated
   * @ordered
   */
  protected ClassModification classModification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstrainingClauseImpl()
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
    return ModelicaMoPackage.Literals.CONSTRAINING_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Name newName, NotificationChain msgs)
  {
    Name oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.CONSTRAINING_CLAUSE__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Name newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.CONSTRAINING_CLAUSE__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.CONSTRAINING_CLAUSE__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.CONSTRAINING_CLAUSE__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassModification getClassModification()
  {
    return classModification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassModification(ClassModification newClassModification, NotificationChain msgs)
  {
    ClassModification oldClassModification = classModification;
    classModification = newClassModification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.CONSTRAINING_CLAUSE__CLASS_MODIFICATION, oldClassModification, newClassModification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassModification(ClassModification newClassModification)
  {
    if (newClassModification != classModification)
    {
      NotificationChain msgs = null;
      if (classModification != null)
        msgs = ((InternalEObject)classModification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.CONSTRAINING_CLAUSE__CLASS_MODIFICATION, null, msgs);
      if (newClassModification != null)
        msgs = ((InternalEObject)newClassModification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.CONSTRAINING_CLAUSE__CLASS_MODIFICATION, null, msgs);
      msgs = basicSetClassModification(newClassModification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.CONSTRAINING_CLAUSE__CLASS_MODIFICATION, newClassModification, newClassModification));
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
      case ModelicaMoPackage.CONSTRAINING_CLAUSE__NAME:
        return basicSetName(null, msgs);
      case ModelicaMoPackage.CONSTRAINING_CLAUSE__CLASS_MODIFICATION:
        return basicSetClassModification(null, msgs);
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
      case ModelicaMoPackage.CONSTRAINING_CLAUSE__NAME:
        return getName();
      case ModelicaMoPackage.CONSTRAINING_CLAUSE__CLASS_MODIFICATION:
        return getClassModification();
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
      case ModelicaMoPackage.CONSTRAINING_CLAUSE__NAME:
        setName((Name)newValue);
        return;
      case ModelicaMoPackage.CONSTRAINING_CLAUSE__CLASS_MODIFICATION:
        setClassModification((ClassModification)newValue);
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
      case ModelicaMoPackage.CONSTRAINING_CLAUSE__NAME:
        setName((Name)null);
        return;
      case ModelicaMoPackage.CONSTRAINING_CLAUSE__CLASS_MODIFICATION:
        setClassModification((ClassModification)null);
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
      case ModelicaMoPackage.CONSTRAINING_CLAUSE__NAME:
        return name != null;
      case ModelicaMoPackage.CONSTRAINING_CLAUSE__CLASS_MODIFICATION:
        return classModification != null;
    }
    return super.eIsSet(featureID);
  }

} //ConstrainingClauseImpl
