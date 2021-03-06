/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.FunctionArgument#getName <em>Name</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.FunctionArgument#getNamedArguments <em>Named Arguments</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.FunctionArgument#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getFunctionArgument()
 * @model
 * @generated
 */
public interface FunctionArgument extends EObject
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
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getFunctionArgument_Name()
   * @model containment="true"
   * @generated
   */
  Name getName();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.FunctionArgument#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Name value);

  /**
   * Returns the value of the '<em><b>Named Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Named Arguments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Named Arguments</em>' containment reference.
   * @see #setNamedArguments(NamedArguments)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getFunctionArgument_NamedArguments()
   * @model containment="true"
   * @generated
   */
  NamedArguments getNamedArguments();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.FunctionArgument#getNamedArguments <em>Named Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Named Arguments</em>' containment reference.
   * @see #getNamedArguments()
   * @generated
   */
  void setNamedArguments(NamedArguments value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getFunctionArgument_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.FunctionArgument#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // FunctionArgument
