/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sc.modelica.xtext.modelicaMo.ArraySubscripts;
import sc.modelica.xtext.modelicaMo.Comment;
import sc.modelica.xtext.modelicaMo.Declaration;
import sc.modelica.xtext.modelicaMo.ModelicaMoPackage;
import sc.modelica.xtext.modelicaMo.Modification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.DeclarationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.DeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.DeclarationImpl#getArraySubscripts <em>Array Subscripts</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.DeclarationImpl#getModification <em>Modification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarationImpl extends ComponentDeclaration1Impl implements Declaration
{
  /**
   * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected Comment comment;

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
   * The cached value of the '{@link #getArraySubscripts() <em>Array Subscripts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArraySubscripts()
   * @generated
   * @ordered
   */
  protected ArraySubscripts arraySubscripts;

  /**
   * The cached value of the '{@link #getModification() <em>Modification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModification()
   * @generated
   * @ordered
   */
  protected Modification modification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarationImpl()
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
    return ModelicaMoPackage.Literals.DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comment getComment()
  {
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComment(Comment newComment, NotificationChain msgs)
  {
    Comment oldComment = comment;
    comment = newComment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.DECLARATION__COMMENT, oldComment, newComment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComment(Comment newComment)
  {
    if (newComment != comment)
    {
      NotificationChain msgs = null;
      if (comment != null)
        msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.DECLARATION__COMMENT, null, msgs);
      if (newComment != null)
        msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.DECLARATION__COMMENT, null, msgs);
      msgs = basicSetComment(newComment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.DECLARATION__COMMENT, newComment, newComment));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.DECLARATION__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.DECLARATION__ARRAY_SUBSCRIPTS, oldArraySubscripts, newArraySubscripts);
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
        msgs = ((InternalEObject)arraySubscripts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.DECLARATION__ARRAY_SUBSCRIPTS, null, msgs);
      if (newArraySubscripts != null)
        msgs = ((InternalEObject)newArraySubscripts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.DECLARATION__ARRAY_SUBSCRIPTS, null, msgs);
      msgs = basicSetArraySubscripts(newArraySubscripts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.DECLARATION__ARRAY_SUBSCRIPTS, newArraySubscripts, newArraySubscripts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modification getModification()
  {
    return modification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModification(Modification newModification, NotificationChain msgs)
  {
    Modification oldModification = modification;
    modification = newModification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.DECLARATION__MODIFICATION, oldModification, newModification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModification(Modification newModification)
  {
    if (newModification != modification)
    {
      NotificationChain msgs = null;
      if (modification != null)
        msgs = ((InternalEObject)modification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.DECLARATION__MODIFICATION, null, msgs);
      if (newModification != null)
        msgs = ((InternalEObject)newModification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.DECLARATION__MODIFICATION, null, msgs);
      msgs = basicSetModification(newModification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.DECLARATION__MODIFICATION, newModification, newModification));
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
      case ModelicaMoPackage.DECLARATION__COMMENT:
        return basicSetComment(null, msgs);
      case ModelicaMoPackage.DECLARATION__ARRAY_SUBSCRIPTS:
        return basicSetArraySubscripts(null, msgs);
      case ModelicaMoPackage.DECLARATION__MODIFICATION:
        return basicSetModification(null, msgs);
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
      case ModelicaMoPackage.DECLARATION__COMMENT:
        return getComment();
      case ModelicaMoPackage.DECLARATION__NAME:
        return getName();
      case ModelicaMoPackage.DECLARATION__ARRAY_SUBSCRIPTS:
        return getArraySubscripts();
      case ModelicaMoPackage.DECLARATION__MODIFICATION:
        return getModification();
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
      case ModelicaMoPackage.DECLARATION__COMMENT:
        setComment((Comment)newValue);
        return;
      case ModelicaMoPackage.DECLARATION__NAME:
        setName((String)newValue);
        return;
      case ModelicaMoPackage.DECLARATION__ARRAY_SUBSCRIPTS:
        setArraySubscripts((ArraySubscripts)newValue);
        return;
      case ModelicaMoPackage.DECLARATION__MODIFICATION:
        setModification((Modification)newValue);
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
      case ModelicaMoPackage.DECLARATION__COMMENT:
        setComment((Comment)null);
        return;
      case ModelicaMoPackage.DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelicaMoPackage.DECLARATION__ARRAY_SUBSCRIPTS:
        setArraySubscripts((ArraySubscripts)null);
        return;
      case ModelicaMoPackage.DECLARATION__MODIFICATION:
        setModification((Modification)null);
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
      case ModelicaMoPackage.DECLARATION__COMMENT:
        return comment != null;
      case ModelicaMoPackage.DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelicaMoPackage.DECLARATION__ARRAY_SUBSCRIPTS:
        return arraySubscripts != null;
      case ModelicaMoPackage.DECLARATION__MODIFICATION:
        return modification != null;
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

} //DeclarationImpl