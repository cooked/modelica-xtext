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

import sc.modelica.xtext.modelicaMo.ArraySubscripts;
import sc.modelica.xtext.modelicaMo.ComponentClause;
import sc.modelica.xtext.modelicaMo.ComponentList;
import sc.modelica.xtext.modelicaMo.ModelicaMoPackage;
import sc.modelica.xtext.modelicaMo.TypePrefix;
import sc.modelica.xtext.modelicaMo.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ComponentClauseImpl#getTypePrefix <em>Type Prefix</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ComponentClauseImpl#getTypeSpec <em>Type Spec</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ComponentClauseImpl#getArraySubscripts <em>Array Subscripts</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ComponentClauseImpl#getComponentList <em>Component List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentClauseImpl extends MinimalEObjectImpl.Container implements ComponentClause
{
  /**
   * The cached value of the '{@link #getTypePrefix() <em>Type Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypePrefix()
   * @generated
   * @ordered
   */
  protected TypePrefix typePrefix;

  /**
   * The cached value of the '{@link #getTypeSpec() <em>Type Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSpec()
   * @generated
   * @ordered
   */
  protected TypeSpecifier typeSpec;

  /**
   * The cached value of the '{@link #getArraySubscripts() <em>Array Subscripts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArraySubscripts()
   * @generated
   * @ordered
   */
  protected ArraySubscripts arraySubscripts;

  /**
   * The cached value of the '{@link #getComponentList() <em>Component List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentList()
   * @generated
   * @ordered
   */
  protected ComponentList componentList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentClauseImpl()
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
    return ModelicaMoPackage.Literals.COMPONENT_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypePrefix getTypePrefix()
  {
    return typePrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypePrefix(TypePrefix newTypePrefix, NotificationChain msgs)
  {
    TypePrefix oldTypePrefix = typePrefix;
    typePrefix = newTypePrefix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_PREFIX, oldTypePrefix, newTypePrefix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypePrefix(TypePrefix newTypePrefix)
  {
    if (newTypePrefix != typePrefix)
    {
      NotificationChain msgs = null;
      if (typePrefix != null)
        msgs = ((InternalEObject)typePrefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_PREFIX, null, msgs);
      if (newTypePrefix != null)
        msgs = ((InternalEObject)newTypePrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_PREFIX, null, msgs);
      msgs = basicSetTypePrefix(newTypePrefix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_PREFIX, newTypePrefix, newTypePrefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSpecifier getTypeSpec()
  {
    return typeSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeSpec(TypeSpecifier newTypeSpec, NotificationChain msgs)
  {
    TypeSpecifier oldTypeSpec = typeSpec;
    typeSpec = newTypeSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_SPEC, oldTypeSpec, newTypeSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeSpec(TypeSpecifier newTypeSpec)
  {
    if (newTypeSpec != typeSpec)
    {
      NotificationChain msgs = null;
      if (typeSpec != null)
        msgs = ((InternalEObject)typeSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_SPEC, null, msgs);
      if (newTypeSpec != null)
        msgs = ((InternalEObject)newTypeSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_SPEC, null, msgs);
      msgs = basicSetTypeSpec(newTypeSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_SPEC, newTypeSpec, newTypeSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArraySubscripts getArraySubscripts()
  {
    return arraySubscripts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArraySubscripts(ArraySubscripts newArraySubscripts, NotificationChain msgs)
  {
    ArraySubscripts oldArraySubscripts = arraySubscripts;
    arraySubscripts = newArraySubscripts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.COMPONENT_CLAUSE__ARRAY_SUBSCRIPTS, oldArraySubscripts, newArraySubscripts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArraySubscripts(ArraySubscripts newArraySubscripts)
  {
    if (newArraySubscripts != arraySubscripts)
    {
      NotificationChain msgs = null;
      if (arraySubscripts != null)
        msgs = ((InternalEObject)arraySubscripts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.COMPONENT_CLAUSE__ARRAY_SUBSCRIPTS, null, msgs);
      if (newArraySubscripts != null)
        msgs = ((InternalEObject)newArraySubscripts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.COMPONENT_CLAUSE__ARRAY_SUBSCRIPTS, null, msgs);
      msgs = basicSetArraySubscripts(newArraySubscripts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.COMPONENT_CLAUSE__ARRAY_SUBSCRIPTS, newArraySubscripts, newArraySubscripts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentList getComponentList()
  {
    return componentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponentList(ComponentList newComponentList, NotificationChain msgs)
  {
    ComponentList oldComponentList = componentList;
    componentList = newComponentList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.COMPONENT_CLAUSE__COMPONENT_LIST, oldComponentList, newComponentList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponentList(ComponentList newComponentList)
  {
    if (newComponentList != componentList)
    {
      NotificationChain msgs = null;
      if (componentList != null)
        msgs = ((InternalEObject)componentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.COMPONENT_CLAUSE__COMPONENT_LIST, null, msgs);
      if (newComponentList != null)
        msgs = ((InternalEObject)newComponentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.COMPONENT_CLAUSE__COMPONENT_LIST, null, msgs);
      msgs = basicSetComponentList(newComponentList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.COMPONENT_CLAUSE__COMPONENT_LIST, newComponentList, newComponentList));
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
      case ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_PREFIX:
        return basicSetTypePrefix(null, msgs);
      case ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_SPEC:
        return basicSetTypeSpec(null, msgs);
      case ModelicaMoPackage.COMPONENT_CLAUSE__ARRAY_SUBSCRIPTS:
        return basicSetArraySubscripts(null, msgs);
      case ModelicaMoPackage.COMPONENT_CLAUSE__COMPONENT_LIST:
        return basicSetComponentList(null, msgs);
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
      case ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_PREFIX:
        return getTypePrefix();
      case ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_SPEC:
        return getTypeSpec();
      case ModelicaMoPackage.COMPONENT_CLAUSE__ARRAY_SUBSCRIPTS:
        return getArraySubscripts();
      case ModelicaMoPackage.COMPONENT_CLAUSE__COMPONENT_LIST:
        return getComponentList();
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
      case ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_PREFIX:
        setTypePrefix((TypePrefix)newValue);
        return;
      case ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_SPEC:
        setTypeSpec((TypeSpecifier)newValue);
        return;
      case ModelicaMoPackage.COMPONENT_CLAUSE__ARRAY_SUBSCRIPTS:
        setArraySubscripts((ArraySubscripts)newValue);
        return;
      case ModelicaMoPackage.COMPONENT_CLAUSE__COMPONENT_LIST:
        setComponentList((ComponentList)newValue);
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
      case ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_PREFIX:
        setTypePrefix((TypePrefix)null);
        return;
      case ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_SPEC:
        setTypeSpec((TypeSpecifier)null);
        return;
      case ModelicaMoPackage.COMPONENT_CLAUSE__ARRAY_SUBSCRIPTS:
        setArraySubscripts((ArraySubscripts)null);
        return;
      case ModelicaMoPackage.COMPONENT_CLAUSE__COMPONENT_LIST:
        setComponentList((ComponentList)null);
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
      case ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_PREFIX:
        return typePrefix != null;
      case ModelicaMoPackage.COMPONENT_CLAUSE__TYPE_SPEC:
        return typeSpec != null;
      case ModelicaMoPackage.COMPONENT_CLAUSE__ARRAY_SUBSCRIPTS:
        return arraySubscripts != null;
      case ModelicaMoPackage.COMPONENT_CLAUSE__COMPONENT_LIST:
        return componentList != null;
    }
    return super.eIsSet(featureID);
  }

} //ComponentClauseImpl