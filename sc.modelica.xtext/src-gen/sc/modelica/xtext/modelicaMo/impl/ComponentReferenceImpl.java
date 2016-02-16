/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sc.modelica.xtext.modelicaMo.ArraySubscripts;
import sc.modelica.xtext.modelicaMo.ComponentReference;
import sc.modelica.xtext.modelicaMo.ModelicaMoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ComponentReferenceImpl#getSubs <em>Subs</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ComponentReferenceImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentReferenceImpl extends ExpressionImpl implements ComponentReference
{
  /**
   * The cached value of the '{@link #getSubs() <em>Subs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubs()
   * @generated
   * @ordered
   */
  protected EList<ArraySubscripts> subs;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected EList<String> id;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentReferenceImpl()
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
    return ModelicaMoPackage.Literals.COMPONENT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArraySubscripts> getSubs()
  {
    if (subs == null)
    {
      subs = new EObjectContainmentEList<ArraySubscripts>(ArraySubscripts.class, this, ModelicaMoPackage.COMPONENT_REFERENCE__SUBS);
    }
    return subs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getId()
  {
    if (id == null)
    {
      id = new EDataTypeEList<String>(String.class, this, ModelicaMoPackage.COMPONENT_REFERENCE__ID);
    }
    return id;
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
      case ModelicaMoPackage.COMPONENT_REFERENCE__SUBS:
        return ((InternalEList<?>)getSubs()).basicRemove(otherEnd, msgs);
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
      case ModelicaMoPackage.COMPONENT_REFERENCE__SUBS:
        return getSubs();
      case ModelicaMoPackage.COMPONENT_REFERENCE__ID:
        return getId();
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
      case ModelicaMoPackage.COMPONENT_REFERENCE__SUBS:
        getSubs().clear();
        getSubs().addAll((Collection<? extends ArraySubscripts>)newValue);
        return;
      case ModelicaMoPackage.COMPONENT_REFERENCE__ID:
        getId().clear();
        getId().addAll((Collection<? extends String>)newValue);
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
      case ModelicaMoPackage.COMPONENT_REFERENCE__SUBS:
        getSubs().clear();
        return;
      case ModelicaMoPackage.COMPONENT_REFERENCE__ID:
        getId().clear();
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
      case ModelicaMoPackage.COMPONENT_REFERENCE__SUBS:
        return subs != null && !subs.isEmpty();
      case ModelicaMoPackage.COMPONENT_REFERENCE__ID:
        return id != null && !id.isEmpty();
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //ComponentReferenceImpl