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
import sc.modelica.xtext.modelicaMo.Comment;
import sc.modelica.xtext.modelicaMo.ModelicaMoPackage;
import sc.modelica.xtext.modelicaMo.StringComment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.CommentImpl#getStringComment <em>String Comment</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.CommentImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl extends MinimalEObjectImpl.Container implements Comment
{
  /**
   * The cached value of the '{@link #getStringComment() <em>String Comment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringComment()
   * @generated
   * @ordered
   */
  protected StringComment stringComment;

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
  protected CommentImpl()
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
    return ModelicaMoPackage.Literals.COMMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringComment getStringComment()
  {
    return stringComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStringComment(StringComment newStringComment, NotificationChain msgs)
  {
    StringComment oldStringComment = stringComment;
    stringComment = newStringComment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.COMMENT__STRING_COMMENT, oldStringComment, newStringComment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringComment(StringComment newStringComment)
  {
    if (newStringComment != stringComment)
    {
      NotificationChain msgs = null;
      if (stringComment != null)
        msgs = ((InternalEObject)stringComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.COMMENT__STRING_COMMENT, null, msgs);
      if (newStringComment != null)
        msgs = ((InternalEObject)newStringComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.COMMENT__STRING_COMMENT, null, msgs);
      msgs = basicSetStringComment(newStringComment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.COMMENT__STRING_COMMENT, newStringComment, newStringComment));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.COMMENT__ANNOTATION, oldAnnotation, newAnnotation);
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
        msgs = ((InternalEObject)annotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.COMMENT__ANNOTATION, null, msgs);
      if (newAnnotation != null)
        msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.COMMENT__ANNOTATION, null, msgs);
      msgs = basicSetAnnotation(newAnnotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.COMMENT__ANNOTATION, newAnnotation, newAnnotation));
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
      case ModelicaMoPackage.COMMENT__STRING_COMMENT:
        return basicSetStringComment(null, msgs);
      case ModelicaMoPackage.COMMENT__ANNOTATION:
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
      case ModelicaMoPackage.COMMENT__STRING_COMMENT:
        return getStringComment();
      case ModelicaMoPackage.COMMENT__ANNOTATION:
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
      case ModelicaMoPackage.COMMENT__STRING_COMMENT:
        setStringComment((StringComment)newValue);
        return;
      case ModelicaMoPackage.COMMENT__ANNOTATION:
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
      case ModelicaMoPackage.COMMENT__STRING_COMMENT:
        setStringComment((StringComment)null);
        return;
      case ModelicaMoPackage.COMMENT__ANNOTATION:
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
      case ModelicaMoPackage.COMMENT__STRING_COMMENT:
        return stringComment != null;
      case ModelicaMoPackage.COMMENT__ANNOTATION:
        return annotation != null;
    }
    return super.eIsSet(featureID);
  }

} //CommentImpl
