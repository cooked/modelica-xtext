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

import sc.modelica.xtext.modelicaMo.Expression;
import sc.modelica.xtext.modelicaMo.FunctionArgument;
import sc.modelica.xtext.modelicaMo.ModelicaMoPackage;
import sc.modelica.xtext.modelicaMo.Name;
import sc.modelica.xtext.modelicaMo.NamedArguments;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.FunctionArgumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.FunctionArgumentImpl#getNamedArguments <em>Named Arguments</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.FunctionArgumentImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionArgumentImpl extends MinimalEObjectImpl.Container implements FunctionArgument
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
   * The cached value of the '{@link #getNamedArguments() <em>Named Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamedArguments()
   * @generated
   * @ordered
   */
  protected NamedArguments namedArguments;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionArgumentImpl()
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
    return ModelicaMoPackage.Literals.FUNCTION_ARGUMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.FUNCTION_ARGUMENT__NAME, oldName, newName);
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
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.FUNCTION_ARGUMENT__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.FUNCTION_ARGUMENT__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.FUNCTION_ARGUMENT__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedArguments getNamedArguments()
  {
    return namedArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamedArguments(NamedArguments newNamedArguments, NotificationChain msgs)
  {
    NamedArguments oldNamedArguments = namedArguments;
    namedArguments = newNamedArguments;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.FUNCTION_ARGUMENT__NAMED_ARGUMENTS, oldNamedArguments, newNamedArguments);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamedArguments(NamedArguments newNamedArguments)
  {
    if (newNamedArguments != namedArguments)
    {
      NotificationChain msgs = null;
      if (namedArguments != null)
        msgs = ((InternalEObject)namedArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.FUNCTION_ARGUMENT__NAMED_ARGUMENTS, null, msgs);
      if (newNamedArguments != null)
        msgs = ((InternalEObject)newNamedArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.FUNCTION_ARGUMENT__NAMED_ARGUMENTS, null, msgs);
      msgs = basicSetNamedArguments(newNamedArguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.FUNCTION_ARGUMENT__NAMED_ARGUMENTS, newNamedArguments, newNamedArguments));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.FUNCTION_ARGUMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.FUNCTION_ARGUMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.FUNCTION_ARGUMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.FUNCTION_ARGUMENT__EXPRESSION, newExpression, newExpression));
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
      case ModelicaMoPackage.FUNCTION_ARGUMENT__NAME:
        return basicSetName(null, msgs);
      case ModelicaMoPackage.FUNCTION_ARGUMENT__NAMED_ARGUMENTS:
        return basicSetNamedArguments(null, msgs);
      case ModelicaMoPackage.FUNCTION_ARGUMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case ModelicaMoPackage.FUNCTION_ARGUMENT__NAME:
        return getName();
      case ModelicaMoPackage.FUNCTION_ARGUMENT__NAMED_ARGUMENTS:
        return getNamedArguments();
      case ModelicaMoPackage.FUNCTION_ARGUMENT__EXPRESSION:
        return getExpression();
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
      case ModelicaMoPackage.FUNCTION_ARGUMENT__NAME:
        setName((Name)newValue);
        return;
      case ModelicaMoPackage.FUNCTION_ARGUMENT__NAMED_ARGUMENTS:
        setNamedArguments((NamedArguments)newValue);
        return;
      case ModelicaMoPackage.FUNCTION_ARGUMENT__EXPRESSION:
        setExpression((Expression)newValue);
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
      case ModelicaMoPackage.FUNCTION_ARGUMENT__NAME:
        setName((Name)null);
        return;
      case ModelicaMoPackage.FUNCTION_ARGUMENT__NAMED_ARGUMENTS:
        setNamedArguments((NamedArguments)null);
        return;
      case ModelicaMoPackage.FUNCTION_ARGUMENT__EXPRESSION:
        setExpression((Expression)null);
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
      case ModelicaMoPackage.FUNCTION_ARGUMENT__NAME:
        return name != null;
      case ModelicaMoPackage.FUNCTION_ARGUMENT__NAMED_ARGUMENTS:
        return namedArguments != null;
      case ModelicaMoPackage.FUNCTION_ARGUMENT__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //FunctionArgumentImpl