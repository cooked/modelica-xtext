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

import sc.modelica.xtext.modelicaMo.Annotation;
import sc.modelica.xtext.modelicaMo.ClassModification;
import sc.modelica.xtext.modelicaMo.ExtendClause;
import sc.modelica.xtext.modelicaMo.ModelicaMoPackage;
import sc.modelica.xtext.modelicaMo.Name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ExtendClauseImpl#getName <em>Name</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ExtendClauseImpl#getClassModification <em>Class Modification</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ExtendClauseImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendClauseImpl extends MinimalEObjectImpl.Container implements ExtendClause
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
   * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotation()
   * @generated
   * @ordered
   */
  protected Annotation annotation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtendClauseImpl()
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
    return ModelicaMoPackage.Literals.EXTEND_CLAUSE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.EXTEND_CLAUSE__NAME, oldName, newName);
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
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.EXTEND_CLAUSE__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.EXTEND_CLAUSE__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.EXTEND_CLAUSE__NAME, newName, newName));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.EXTEND_CLAUSE__CLASS_MODIFICATION, oldClassModification, newClassModification);
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
        msgs = ((InternalEObject)classModification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.EXTEND_CLAUSE__CLASS_MODIFICATION, null, msgs);
      if (newClassModification != null)
        msgs = ((InternalEObject)newClassModification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.EXTEND_CLAUSE__CLASS_MODIFICATION, null, msgs);
      msgs = basicSetClassModification(newClassModification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.EXTEND_CLAUSE__CLASS_MODIFICATION, newClassModification, newClassModification));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation getAnnotation()
  {
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs)
  {
    Annotation oldAnnotation = annotation;
    annotation = newAnnotation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.EXTEND_CLAUSE__ANNOTATION, oldAnnotation, newAnnotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotation(Annotation newAnnotation)
  {
    if (newAnnotation != annotation)
    {
      NotificationChain msgs = null;
      if (annotation != null)
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.EXTEND_CLAUSE__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.EXTEND_CLAUSE__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.EXTEND_CLAUSE__ANNOTATION, newAnnotation, newAnnotation));
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
      case ModelicaMoPackage.EXTEND_CLAUSE__NAME:
        return basicSetName(null, msgs);
      case ModelicaMoPackage.EXTEND_CLAUSE__CLASS_MODIFICATION:
        return basicSetClassModification(null, msgs);
      case ModelicaMoPackage.EXTEND_CLAUSE__ANNOTATION:
        return basicSetAnnotation(null, msgs);
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
      case ModelicaMoPackage.EXTEND_CLAUSE__NAME:
        return getName();
      case ModelicaMoPackage.EXTEND_CLAUSE__CLASS_MODIFICATION:
        return getClassModification();
      case ModelicaMoPackage.EXTEND_CLAUSE__ANNOTATION:
        return getAnnotation();
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
      case ModelicaMoPackage.EXTEND_CLAUSE__NAME:
        setName((Name)newValue);
        return;
      case ModelicaMoPackage.EXTEND_CLAUSE__CLASS_MODIFICATION:
        setClassModification((ClassModification)newValue);
        return;
      case ModelicaMoPackage.EXTEND_CLAUSE__ANNOTATION:
        setAnnotation((Annotation)newValue);
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
      case ModelicaMoPackage.EXTEND_CLAUSE__NAME:
        setName((Name)null);
        return;
      case ModelicaMoPackage.EXTEND_CLAUSE__CLASS_MODIFICATION:
        setClassModification((ClassModification)null);
        return;
      case ModelicaMoPackage.EXTEND_CLAUSE__ANNOTATION:
        setAnnotation((Annotation)null);
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
      case ModelicaMoPackage.EXTEND_CLAUSE__NAME:
        return name != null;
      case ModelicaMoPackage.EXTEND_CLAUSE__CLASS_MODIFICATION:
        return classModification != null;
      case ModelicaMoPackage.EXTEND_CLAUSE__ANNOTATION:
        return annotation != null;
    }
    return super.eIsSet(featureID);
  }

} //ExtendClauseImpl