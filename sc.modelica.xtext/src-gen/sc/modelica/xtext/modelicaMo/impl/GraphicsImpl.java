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

import sc.modelica.xtext.modelicaMo.GraphicalPrimitive;
import sc.modelica.xtext.modelicaMo.Graphics;
import sc.modelica.xtext.modelicaMo.ModelicaMoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.GraphicsImpl#getPrimitive <em>Primitive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicsImpl extends MinimalEObjectImpl.Container implements Graphics
{
  /**
   * The cached value of the '{@link #getPrimitive() <em>Primitive</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitive()
   * @generated
   * @ordered
   */
  protected EList<GraphicalPrimitive> primitive;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GraphicsImpl()
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
    return ModelicaMoPackage.Literals.GRAPHICS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GraphicalPrimitive> getPrimitive()
  {
    if (primitive == null)
    {
      primitive = new EObjectContainmentEList<GraphicalPrimitive>(GraphicalPrimitive.class, this, ModelicaMoPackage.GRAPHICS__PRIMITIVE);
    }
    return primitive;
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
      case ModelicaMoPackage.GRAPHICS__PRIMITIVE:
        return ((InternalEList<?>)getPrimitive()).basicRemove(otherEnd, msgs);
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
      case ModelicaMoPackage.GRAPHICS__PRIMITIVE:
        return getPrimitive();
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
      case ModelicaMoPackage.GRAPHICS__PRIMITIVE:
        getPrimitive().clear();
        getPrimitive().addAll((Collection<? extends GraphicalPrimitive>)newValue);
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
      case ModelicaMoPackage.GRAPHICS__PRIMITIVE:
        getPrimitive().clear();
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
      case ModelicaMoPackage.GRAPHICS__PRIMITIVE:
        return primitive != null && !primitive.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GraphicsImpl
