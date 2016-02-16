/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import sc.modelica.xtext.modelicaMo.ConstrainingClause;
import sc.modelica.xtext.modelicaMo.ElementReplaceable;
import sc.modelica.xtext.modelicaMo.ModelicaMoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Replaceable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ElementReplaceableImpl#isReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ElementReplaceableImpl#getElement <em>Element</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ElementReplaceableImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementReplaceableImpl extends MinimalEObjectImpl.Container implements ElementReplaceable
{
  /**
   * The default value of the '{@link #isReplaceable() <em>Replaceable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReplaceable()
   * @generated
   * @ordered
   */
  protected static final boolean REPLACEABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReplaceable() <em>Replaceable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReplaceable()
   * @generated
   * @ordered
   */
  protected boolean replaceable = REPLACEABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected EObject element;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected ConstrainingClause constraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementReplaceableImpl()
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
    return ModelicaMoPackage.Literals.ELEMENT_REPLACEABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReplaceable()
  {
    return replaceable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReplaceable(boolean newReplaceable)
  {
    boolean oldReplaceable = replaceable;
    replaceable = newReplaceable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.ELEMENT_REPLACEABLE__REPLACEABLE, oldReplaceable, replaceable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElement(EObject newElement, NotificationChain msgs)
  {
    EObject oldElement = element;
    element = newElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.ELEMENT_REPLACEABLE__ELEMENT, oldElement, newElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(EObject newElement)
  {
    if (newElement != element)
    {
      NotificationChain msgs = null;
      if (element != null)
        msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.ELEMENT_REPLACEABLE__ELEMENT, null, msgs);
      if (newElement != null)
        msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.ELEMENT_REPLACEABLE__ELEMENT, null, msgs);
      msgs = basicSetElement(newElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.ELEMENT_REPLACEABLE__ELEMENT, newElement, newElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstrainingClause getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraint(ConstrainingClause newConstraint, NotificationChain msgs)
  {
    ConstrainingClause oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.ELEMENT_REPLACEABLE__CONSTRAINT, oldConstraint, newConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(ConstrainingClause newConstraint)
  {
    if (newConstraint != constraint)
    {
      NotificationChain msgs = null;
      if (constraint != null)
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.ELEMENT_REPLACEABLE__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.ELEMENT_REPLACEABLE__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.ELEMENT_REPLACEABLE__CONSTRAINT, newConstraint, newConstraint));
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
      case ModelicaMoPackage.ELEMENT_REPLACEABLE__ELEMENT:
        return basicSetElement(null, msgs);
      case ModelicaMoPackage.ELEMENT_REPLACEABLE__CONSTRAINT:
        return basicSetConstraint(null, msgs);
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
      case ModelicaMoPackage.ELEMENT_REPLACEABLE__REPLACEABLE:
        return isReplaceable();
      case ModelicaMoPackage.ELEMENT_REPLACEABLE__ELEMENT:
        return getElement();
      case ModelicaMoPackage.ELEMENT_REPLACEABLE__CONSTRAINT:
        return getConstraint();
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
      case ModelicaMoPackage.ELEMENT_REPLACEABLE__REPLACEABLE:
        setReplaceable((Boolean)newValue);
        return;
      case ModelicaMoPackage.ELEMENT_REPLACEABLE__ELEMENT:
        setElement((EObject)newValue);
        return;
      case ModelicaMoPackage.ELEMENT_REPLACEABLE__CONSTRAINT:
        setConstraint((ConstrainingClause)newValue);
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
      case ModelicaMoPackage.ELEMENT_REPLACEABLE__REPLACEABLE:
        setReplaceable(REPLACEABLE_EDEFAULT);
        return;
      case ModelicaMoPackage.ELEMENT_REPLACEABLE__ELEMENT:
        setElement((EObject)null);
        return;
      case ModelicaMoPackage.ELEMENT_REPLACEABLE__CONSTRAINT:
        setConstraint((ConstrainingClause)null);
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
      case ModelicaMoPackage.ELEMENT_REPLACEABLE__REPLACEABLE:
        return replaceable != REPLACEABLE_EDEFAULT;
      case ModelicaMoPackage.ELEMENT_REPLACEABLE__ELEMENT:
        return element != null;
      case ModelicaMoPackage.ELEMENT_REPLACEABLE__CONSTRAINT:
        return constraint != null;
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
    result.append(" (replaceable: ");
    result.append(replaceable);
    result.append(')');
    return result.toString();
  }

} //ElementReplaceableImpl
