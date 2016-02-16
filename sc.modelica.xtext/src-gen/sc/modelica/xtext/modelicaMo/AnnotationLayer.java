/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.AnnotationLayer#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.AnnotationLayer#getGraphics <em>Graphics</em>}</li>
 * </ul>
 *
 * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getAnnotationLayer()
 * @model
 * @generated
 */
public interface AnnotationLayer extends AnnotationArg
{
  /**
   * Returns the value of the '<em><b>Coordinate System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coordinate System</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coordinate System</em>' containment reference.
   * @see #setCoordinateSystem(CoordinateSpecification)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getAnnotationLayer_CoordinateSystem()
   * @model containment="true"
   * @generated
   */
  CoordinateSpecification getCoordinateSystem();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.AnnotationLayer#getCoordinateSystem <em>Coordinate System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coordinate System</em>' containment reference.
   * @see #getCoordinateSystem()
   * @generated
   */
  void setCoordinateSystem(CoordinateSpecification value);

  /**
   * Returns the value of the '<em><b>Graphics</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Graphics</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graphics</em>' containment reference.
   * @see #setGraphics(Graphics)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getAnnotationLayer_Graphics()
   * @model containment="true"
   * @generated
   */
  Graphics getGraphics();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.AnnotationLayer#getGraphics <em>Graphics</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Graphics</em>' containment reference.
   * @see #getGraphics()
   * @generated
   */
  void setGraphics(Graphics value);

} // AnnotationLayer