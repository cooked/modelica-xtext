/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.StatementWhile#getBoolExpr <em>Bool Expr</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.StatementWhile#getStat <em>Stat</em>}</li>
 * </ul>
 *
 * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getStatementWhile()
 * @model
 * @generated
 */
public interface StatementWhile extends Statement
{
  /**
   * Returns the value of the '<em><b>Bool Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool Expr</em>' containment reference.
   * @see #setBoolExpr(Expression)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getStatementWhile_BoolExpr()
   * @model containment="true"
   * @generated
   */
  Expression getBoolExpr();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.StatementWhile#getBoolExpr <em>Bool Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool Expr</em>' containment reference.
   * @see #getBoolExpr()
   * @generated
   */
  void setBoolExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Stat</b></em>' containment reference list.
   * The list contents are of type {@link sc.modelica.xtext.modelicaMo.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stat</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stat</em>' containment reference list.
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getStatementWhile_Stat()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStat();

} // StatementWhile
