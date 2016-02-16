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

import sc.modelica.xtext.modelicaMo.Comment;
import sc.modelica.xtext.modelicaMo.ImportClause;
import sc.modelica.xtext.modelicaMo.ImportList;
import sc.modelica.xtext.modelicaMo.ModelicaMoPackage;
import sc.modelica.xtext.modelicaMo.Name;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ImportClauseImpl#getId <em>Id</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ImportClauseImpl#getName <em>Name</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ImportClauseImpl#getImportList <em>Import List</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.impl.ImportClauseImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportClauseImpl extends MinimalEObjectImpl.Container implements ImportClause
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

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
   * The cached value of the '{@link #getImportList() <em>Import List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportList()
   * @generated
   * @ordered
   */
  protected ImportList importList;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportClauseImpl()
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
    return ModelicaMoPackage.Literals.IMPORT_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.IMPORT_CLAUSE__ID, oldId, id));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.IMPORT_CLAUSE__NAME, oldName, newName);
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
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.IMPORT_CLAUSE__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.IMPORT_CLAUSE__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.IMPORT_CLAUSE__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportList getImportList()
  {
    return importList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImportList(ImportList newImportList, NotificationChain msgs)
  {
    ImportList oldImportList = importList;
    importList = newImportList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.IMPORT_CLAUSE__IMPORT_LIST, oldImportList, newImportList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportList(ImportList newImportList)
  {
    if (newImportList != importList)
    {
      NotificationChain msgs = null;
      if (importList != null)
        msgs = ((InternalEObject)importList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.IMPORT_CLAUSE__IMPORT_LIST, null, msgs);
      if (newImportList != null)
        msgs = ((InternalEObject)newImportList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.IMPORT_CLAUSE__IMPORT_LIST, null, msgs);
      msgs = basicSetImportList(newImportList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.IMPORT_CLAUSE__IMPORT_LIST, newImportList, newImportList));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.IMPORT_CLAUSE__COMMENT, oldComment, newComment);
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
        msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.IMPORT_CLAUSE__COMMENT, null, msgs);
      if (newComment != null)
        msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelicaMoPackage.IMPORT_CLAUSE__COMMENT, null, msgs);
      msgs = basicSetComment(newComment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelicaMoPackage.IMPORT_CLAUSE__COMMENT, newComment, newComment));
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
      case ModelicaMoPackage.IMPORT_CLAUSE__NAME:
        return basicSetName(null, msgs);
      case ModelicaMoPackage.IMPORT_CLAUSE__IMPORT_LIST:
        return basicSetImportList(null, msgs);
      case ModelicaMoPackage.IMPORT_CLAUSE__COMMENT:
        return basicSetComment(null, msgs);
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
      case ModelicaMoPackage.IMPORT_CLAUSE__ID:
        return getId();
      case ModelicaMoPackage.IMPORT_CLAUSE__NAME:
        return getName();
      case ModelicaMoPackage.IMPORT_CLAUSE__IMPORT_LIST:
        return getImportList();
      case ModelicaMoPackage.IMPORT_CLAUSE__COMMENT:
        return getComment();
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
      case ModelicaMoPackage.IMPORT_CLAUSE__ID:
        setId((String)newValue);
        return;
      case ModelicaMoPackage.IMPORT_CLAUSE__NAME:
        setName((Name)newValue);
        return;
      case ModelicaMoPackage.IMPORT_CLAUSE__IMPORT_LIST:
        setImportList((ImportList)newValue);
        return;
      case ModelicaMoPackage.IMPORT_CLAUSE__COMMENT:
        setComment((Comment)newValue);
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
      case ModelicaMoPackage.IMPORT_CLAUSE__ID:
        setId(ID_EDEFAULT);
        return;
      case ModelicaMoPackage.IMPORT_CLAUSE__NAME:
        setName((Name)null);
        return;
      case ModelicaMoPackage.IMPORT_CLAUSE__IMPORT_LIST:
        setImportList((ImportList)null);
        return;
      case ModelicaMoPackage.IMPORT_CLAUSE__COMMENT:
        setComment((Comment)null);
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
      case ModelicaMoPackage.IMPORT_CLAUSE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ModelicaMoPackage.IMPORT_CLAUSE__NAME:
        return name != null;
      case ModelicaMoPackage.IMPORT_CLAUSE__IMPORT_LIST:
        return importList != null;
      case ModelicaMoPackage.IMPORT_CLAUSE__COMMENT:
        return comment != null;
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

} //ImportClauseImpl