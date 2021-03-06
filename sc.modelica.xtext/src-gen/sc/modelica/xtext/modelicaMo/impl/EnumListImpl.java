/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sc.modelica.xtext.modelicaMo.EnumList;
import sc.modelica.xtext.modelicaMo.EnumerationLiteral;
import sc.modelica.xtext.modelicaMo.ModelicaMoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.EnumListImpl#getEnumerationLiteral <em>Enumeration Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumListImpl extends MinimalEObjectImpl.Container implements EnumList
{
  /**
   * The cached value of the '{@link #getEnumerationLiteral() <em>Enumeration Literal</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumerationLiteral()
   * @generated
   * @ordered
   */
  protected EList<EnumerationLiteral> enumerationLiteral;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumListImpl()
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
    return ModelicaMoPackage.Literals.ENUM_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumerationLiteral> getEnumerationLiteral()
  {
    if (enumerationLiteral == null)
    {
      enumerationLiteral = new EObjectContainmentEList<EnumerationLiteral>(EnumerationLiteral.class, this, ModelicaMoPackage.ENUM_LIST__ENUMERATION_LITERAL);
    }
    return enumerationLiteral;
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
      case ModelicaMoPackage.ENUM_LIST__ENUMERATION_LITERAL:
        return ((InternalEList<?>)getEnumerationLiteral()).basicRemove(otherEnd, msgs);
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
      case ModelicaMoPackage.ENUM_LIST__ENUMERATION_LITERAL:
        return getEnumerationLiteral();
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
      case ModelicaMoPackage.ENUM_LIST__ENUMERATION_LITERAL:
        getEnumerationLiteral().clear();
        getEnumerationLiteral().addAll((Collection<? extends EnumerationLiteral>)newValue);
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
      case ModelicaMoPackage.ENUM_LIST__ENUMERATION_LITERAL:
        getEnumerationLiteral().clear();
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
      case ModelicaMoPackage.ENUM_LIST__ENUMERATION_LITERAL:
        return enumerationLiteral != null && !enumerationLiteral.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EnumListImpl
