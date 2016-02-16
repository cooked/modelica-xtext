/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.ExtendClause#getName <em>Name</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.ExtendClause#getClassModification <em>Class Modification</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.ExtendClause#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExtendClause()
 * @model
 * @generated
 */
public interface ExtendClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Name)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExtendClause_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.ExtendClause#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

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
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExtendClause_ClassModification()
   * @model containment="true"
   * @generated
   */
  ClassModification getClassModification();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.ExtendClause#getClassModification <em>Class Modification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Modification</em>' containment reference.
   * @see #getClassModification()
   * @generated
   */
  void setClassModification(ClassModification value);

  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference.
   * @see #setAnnotation(Annotation)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExtendClause_Annotation()
   * @model containment="true"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.ExtendClause#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(Annotation value);

} // ExtendClause
