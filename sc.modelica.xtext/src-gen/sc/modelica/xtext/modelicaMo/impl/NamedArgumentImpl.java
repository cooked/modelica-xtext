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

import sc.modelica.xtext.modelicaMo.FunctionArgument;
import sc.modelica.xtext.modelicaMo.ModelicaMoPackage;
import sc.modelica.xtext.modelicaMo.NamedArgument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.NamedArgumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.NamedArgumentImpl#getFunctionArgument <em>Function Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedArgumentImpl extends MinimalEObjectImpl.Container implements NamedArgument
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFunctionArgument() <em>Function Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionArgument()
   * @generated
   * @ordered
   */
  protected FunctionArgument functionArgument;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamedArgumentImpl()
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
    return ModelicaMoPackage.Literals.NAMED_ARGUMENT;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.NAMED_ARGUMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionArgument getFunctionArgument()
  {
    return functionArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctionArgument(FunctionArgument newFunctionArgument, NotificationChain msgs)
  {
    FunctionArgument oldFunctionArgument = functionArgument;
    functionArgument = newFunctionArgument;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.NAMED_ARGUMENT__FUNCTION_ARGUMENT, oldFunctionArgument, newFunctionArgument);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionArgument(FunctionArgument newFunctionArgument)
  {
    if (newFunctionArgument != functionArgument)
    {
      NotificationChain msgs = null;
      if (functionArgument != null)
        msgs = ((InternalEObject)functionArgument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.NAMED_ARGUMENT__FUNCTION_ARGUMENT, null, msgs);
      if (newFunctionArgument != null)
        msgs = ((InternalEObject)newFunctionArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.NAMED_ARGUMENT__FUNCTION_ARGUMENT, null, msgs);
      msgs = basicSetFunctionArgument(newFunctionArgument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.NAMED_ARGUMENT__FUNCTION_ARGUMENT, newFunctionArgument, newFunctionArgument));
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
      case ModelicaMoPackage.NAMED_ARGUMENT__FUNCTION_ARGUMENT:
        return basicSetFunctionArgument(null, msgs);
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
      case ModelicaMoPackage.NAMED_ARGUMENT__NAME:
        return getName();
      case ModelicaMoPackage.NAMED_ARGUMENT__FUNCTION_ARGUMENT:
        return getFunctionArgument();
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
      case ModelicaMoPackage.NAMED_ARGUMENT__NAME:
        setName((String)newValue);
        return;
      case ModelicaMoPackage.NAMED_ARGUMENT__FUNCTION_ARGUMENT:
        setFunctionArgument((FunctionArgument)newValue);
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
      case ModelicaMoPackage.NAMED_ARGUMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelicaMoPackage.NAMED_ARGUMENT__FUNCTION_ARGUMENT:
        setFunctionArgument((FunctionArgument)null);
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
      case ModelicaMoPackage.NAMED_ARGUMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelicaMoPackage.NAMED_ARGUMENT__FUNCTION_ARGUMENT:
        return functionArgument != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //NamedArgumentImpl
