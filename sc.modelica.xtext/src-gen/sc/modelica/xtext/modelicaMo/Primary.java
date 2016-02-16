/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Primary#getName <em>Name</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Primary#getFca <em>Fca</em>}</li>
 * </ul>
 *
 * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getPrimary()
 * @model
 * @generated
 */
public interface Primary extends Expression
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
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getPrimary_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Primary#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

  /**
   * Returns the value of the '<em><b>Fca</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fca</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fca</em>' containment reference.
   * @see #setFca(FunctionCallArgs)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getPrimary_Fca()
   * @model containment="true"
   * @generated
   */
  FunctionCallArgs getFca();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Primary#getFca <em>Fca</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fca</em>' containment reference.
   * @see #getFca()
   * @generated
   */
  void setFca(FunctionCallArgs value);

} // Primary