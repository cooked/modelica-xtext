/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sc.modelica.xtext.modelicaMo.Expression;
import sc.modelica.xtext.modelicaMo.ModelicaMoPackage;
import sc.modelica.xtext.modelicaMo.Statement;
import sc.modelica.xtext.modelicaMo.StatementWhile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.StatementWhileImpl#getBoolExpr <em>Bool Expr</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.StatementWhileImpl#getStat <em>Stat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementWhileImpl extends StatementImpl implements StatementWhile
{
  /**
   * The cached value of the '{@link #getBoolExpr() <em>Bool Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolExpr()
   * @generated
   * @ordered
   */
  protected Expression boolExpr;

  /**
   * The cached value of the '{@link #getStat() <em>Stat</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStat()
   * @generated
   * @ordered
   */
  protected EList<Statement> stat;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementWhileImpl()
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
    return ModelicaMoPackage.Literals.STATEMENT_WHILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getBoolExpr()
  {
    return boolExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBoolExpr(Expression newBoolExpr, NotificationChain msgs)
  {
    Expression oldBoolExpr = boolExpr;
    boolExpr = newBoolExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.STATEMENT_WHILE__BOOL_EXPR, oldBoolExpr, newBoolExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoolExpr(Expression newBoolExpr)
  {
    if (newBoolExpr != boolExpr)
    {
      NotificationChain msgs = null;
      if (boolExpr != null)
        msgs = ((InternalEObject)boolExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.STATEMENT_WHILE__BOOL_EXPR, null, msgs);
      if (newBoolExpr != null)
        msgs = ((InternalEObject)newBoolExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.STATEMENT_WHILE__BOOL_EXPR, null, msgs);
      msgs = basicSetBoolExpr(newBoolExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.STATEMENT_WHILE__BOOL_EXPR, newBoolExpr, newBoolExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStat()
  {
    if (stat == null)
    {
      stat = new EObjectContainmentEList<Statement>(Statement.class, this, ModelicaMoPackage.STATEMENT_WHILE__STAT);
    }
    return stat;
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
      case ModelicaMoPackage.STATEMENT_WHILE__BOOL_EXPR:
        return basicSetBoolExpr(null, msgs);
      case ModelicaMoPackage.STATEMENT_WHILE__STAT:
        return ((InternalEList<?>)getStat()).basicRemove(otherEnd, msgs);
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
      case ModelicaMoPackage.STATEMENT_WHILE__BOOL_EXPR:
        return getBoolExpr();
      case ModelicaMoPackage.STATEMENT_WHILE__STAT:
        return getStat();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelicaMoPackage.STATEMENT_WHILE__BOOL_EXPR:
        setBoolExpr((Expression)newValue);
        return;
      case ModelicaMoPackage.STATEMENT_WHILE__STAT:
        getStat().clear();
        getStat().addAll((Collection<? extends Statement>)newValue);
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
      case ModelicaMoPackage.STATEMENT_WHILE__BOOL_EXPR:
        setBoolExpr((Expression)null);
        return;
      case ModelicaMoPackage.STATEMENT_WHILE__STAT:
        getStat().clear();
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
      case ModelicaMoPackage.STATEMENT_WHILE__BOOL_EXPR:
        return boolExpr != null;
      case ModelicaMoPackage.STATEMENT_WHILE__STAT:
        return stat != null && !stat.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StatementWhileImpl
