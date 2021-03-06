/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Graphics#getPrimitive <em>Primitive</em>}</li>
 * </ul>
 *
 * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getGraphics()
 * @model
 * @generated
 */
public interface Graphics extends EObject
{
  /**
   * Returns the value of the '<em><b>Primitive</b></em>' containment reference list.
   * The list contents are of type {@link sc.modelica.xtext.modelicaMo.GraphicalPrimitive}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitive</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitive</em>' containment reference list.
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getGraphics_Primitive()
   * @model containment="true"
   * @generated
   */
  EList<GraphicalPrimitive> getPrimitive();

} // Graphics
