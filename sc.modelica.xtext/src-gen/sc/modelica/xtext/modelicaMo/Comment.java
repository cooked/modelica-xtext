/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Comment#getStringComment <em>String Comment</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Comment#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends EObject
{
  /**
   * Returns the value of the '<em><b>String Comment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Comment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Comment</em>' containment reference.
   * @see #setStringComment(StringComment)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getComment_StringComment()
   * @model containment="true"
   * @generated
   */
  StringComment getStringComment();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Comment#getStringComment <em>String Comment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Comment</em>' containment reference.
   * @see #getStringComment()
   * @generated
   */
  void setStringComment(StringComment value);

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
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getComment_Annotation()
   * @model containment="true"
   * @generated
   */
  Annotation getAnnotation();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Comment#getAnnotation <em>Annotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' containment reference.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(Annotation value);

} // Comment
