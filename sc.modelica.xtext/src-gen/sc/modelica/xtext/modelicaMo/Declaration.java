/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Declaration#getComment <em>Comment</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Declaration#getName <em>Name</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Declaration#getArraySubscripts <em>Array Subscripts</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Declaration#getModification <em>Modification</em>}</li>
 * </ul>
 *
 * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends ComponentDeclaration1
{
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
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getDeclaration_Comment()
   * @model containment="true"
   * @generated
   */
  Comment getComment();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Declaration#getComment <em>Comment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' containment reference.
   * @see #getComment()
   * @generated
   */
  void setComment(Comment value);

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
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Declaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getDeclaration_ArraySubscripts()
   * @model containment="true"
   * @generated
   */
  ArraySubscripts getArraySubscripts();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Declaration#getArraySubscripts <em>Array Subscripts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Subscripts</em>' containment reference.
   * @see #getArraySubscripts()
   * @generated
   */
  void setArraySubscripts(ArraySubscripts value);

  /**
   * Returns the value of the '<em><b>Modification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modification</em>' containment reference.
   * @see #setModification(Modification)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getDeclaration_Modification()
   * @model containment="true"
   * @generated
   */
  Modification getModification();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Declaration#getModification <em>Modification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modification</em>' containment reference.
   * @see #getModification()
   * @generated
   */
  void setModification(Modification value);

} // Declaration