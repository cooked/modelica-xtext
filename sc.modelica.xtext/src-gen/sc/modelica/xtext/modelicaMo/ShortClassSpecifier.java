/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Short Class Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.ShortClassSpecifier#getName <em>Name</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.ShortClassSpecifier#getBasePrefix <em>Base Prefix</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.ShortClassSpecifier#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.ShortClassSpecifier#getArraySubscripts <em>Array Subscripts</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.ShortClassSpecifier#getClassModification <em>Class Modification</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.ShortClassSpecifier#getComment <em>Comment</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.ShortClassSpecifier#getEnumList <em>Enum List</em>}</li>
 * </ul>
 *
 * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getShortClassSpecifier()
 * @model
 * @generated
 */
public interface ShortClassSpecifier extends ClassSpecifier
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getShortClassSpecifier_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.ShortClassSpecifier#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Base Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Prefix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Prefix</em>' containment reference.
   * @see #setBasePrefix(BasePrefix)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getShortClassSpecifier_BasePrefix()
   * @model containment="true"
   * @generated
   */
  BasePrefix getBasePrefix();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.ShortClassSpecifier#getBasePrefix <em>Base Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Prefix</em>' containment reference.
   * @see #getBasePrefix()
   * @generated
   */
  void setBasePrefix(BasePrefix value);

  /**
   * Returns the value of the '<em><b>Instance Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance Name</em>' containment reference.
   * @see #setInstanceName(Name)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getShortClassSpecifier_InstanceName()
   * @model containment="true"
   * @generated
   */
  Name getInstanceName();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.ShortClassSpecifier#getInstanceName <em>Instance Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Name</em>' containment reference.
   * @see #getInstanceName()
   * @generated
   */
  void setInstanceName(Name value);

  /**
   * Returns the value of the '<em><b>Array Subscripts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Subscripts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Subscripts</em>' containment reference.
   * @see #setArraySubscripts(ArraySubscripts)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getShortClassSpecifier_ArraySubscripts()
   * @model containment="true"
   * @generated
   */
  ArraySubscripts getArraySubscripts();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.ShortClassSpecifier#getArraySubscripts <em>Array Subscripts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Subscripts</em>' containment reference.
   * @see #getArraySubscripts()
   * @generated
   */
  void setArraySubscripts(ArraySubscripts value);

  /**
   * Returns the value of the '<em><b>Class Modification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Modification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Modification</em>' containment reference.
   * @see #setClassModification(ClassModification)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getShortClassSpecifier_ClassModification()
   * @model containment="true"
   * @generated
   */
  ClassModification getClassModification();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.ShortClassSpecifier#getClassModification <em>Class Modification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Modification</em>' containment reference.
   * @see #getClassModification()
   * @generated
   */
  void setClassModification(ClassModification value);

  /**
   * Returns the value of the '<em><b>Comment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' containment reference.
   * @see #setComment(Comment)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getShortClassSpecifier_Comment()
   * @model containment="true"
   * @generated
   */
  Comment getComment();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.ShortClassSpecifier#getComment <em>Comment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' containment reference.
   * @see #getComment()
   * @generated
   */
  void setComment(Comment value);

  /**
   * Returns the value of the '<em><b>Enum List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum List</em>' containment reference.
   * @see #setEnumList(EnumList)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getShortClassSpecifier_EnumList()
   * @model containment="true"
   * @generated
   */
  EnumList getEnumList();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.ShortClassSpecifier#getEnumList <em>Enum List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum List</em>' containment reference.
   * @see #getEnumList()
   * @generated
   */
  void setEnumList(EnumList value);

} // ShortClassSpecifier