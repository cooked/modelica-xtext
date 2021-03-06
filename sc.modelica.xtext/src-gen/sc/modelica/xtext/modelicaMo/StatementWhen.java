/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.StatementWhen#getWhenExp <em>When Exp</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.StatementWhen#getWhenEquations <em>When Equations</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.StatementWhen#getExp <em>Exp</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.StatementWhen#getEquationItem <em>Equation Item</em>}</li>
 * </ul>
 *
 * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getStatementWhen()
 * @model
 * @generated
 */
public interface StatementWhen extends Statement
{
  /**
   * Returns the value of the '<em><b>When Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When Exp</em>' containment reference.
   * @see #setWhenExp(Expression)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getStatementWhen_WhenExp()
   * @model containment="true"
   * @generated
   */
  Expression getWhenExp();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.StatementWhen#getWhenExp <em>When Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When Exp</em>' containment reference.
   * @see #getWhenExp()
   * @generated
   */
  void setWhenExp(Expression value);

  /**
   * Returns the value of the '<em><b>When Equations</b></em>' containment reference list.
   * The list contents are of type {@link sc.modelica.xtext.modelicaMo.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When Equations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When Equations</em>' containment reference list.
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getStatementWhen_WhenEquations()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getWhenEquations();

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
   * The list contents are of type {@link sc.modelica.xtext.modelicaMo.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference list.
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getStatementWhen_Exp()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExp();

  /**
   * Returns the value of the '<em><b>Equation Item</b></em>' containment reference list.
   * The list contents are of type {@link sc.modelica.xtext.modelicaMo.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equation Item</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equation Item</em>' containment reference list.
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getStatementWhen_EquationItem()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getEquationItem();

} // StatementWhen
