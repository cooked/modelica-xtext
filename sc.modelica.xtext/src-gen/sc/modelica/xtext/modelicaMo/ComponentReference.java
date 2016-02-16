/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.ComponentReference#getSubs <em>Subs</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.ComponentReference#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getComponentReference()
 * @model
 * @generated
 */
public interface ComponentReference extends Expression
{
  /**
   * Returns the value of the '<em><b>Subs</b></em>' containment reference list.
   * The list contents are of type {@link sc.modelica.xtext.modelicaMo.ArraySubscripts}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subs</em>' containment reference list.
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getComponentReference_Subs()
   * @model containment="true"
   * @generated
   */
  EList<ArraySubscripts> getSubs();

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute list.
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getComponentReference_Id()
   * @model unique="false"
   * @generated
   */
  EList<String> getId();

} // ComponentReference
