/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Expression#getEquation <em>Equation</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Expression#getComm <em>Comm</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Expression#getIf <em>If</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Expression#getThen <em>Then</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Expression#getElseif <em>Elseif</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Expression#getElseifthen <em>Elseifthen</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Expression#getElse <em>Else</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Expression#getStart <em>Start</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Expression#getStep <em>Step</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Expression#getStop <em>Stop</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Expression#getExp <em>Exp</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Expression#getList <em>List</em>}</li>
 *   <li>{@link sc.modelica.xtext.modelicaMo.Expression#getFa <em>Fa</em>}</li>
 * </ul>
 *
 * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends Equation, Subscript
{
  /**
   * Returns the value of the '<em><b>Equation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equation</em>' containment reference.
   * @see #setEquation(Expression)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExpression_Equation()
   * @model containment="true"
   * @generated
   */
  Expression getEquation();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Expression#getEquation <em>Equation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Equation</em>' containment reference.
   * @see #getEquation()
   * @generated
   */
  void setEquation(Expression value);

  /**
   * Returns the value of the '<em><b>Comm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comm</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comm</em>' containment reference.
   * @see #setComm(Comment)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExpression_Comm()
   * @model containment="true"
   * @generated
   */
  Comment getComm();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Expression#getComm <em>Comm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comm</em>' containment reference.
   * @see #getComm()
   * @generated
   */
  void setComm(Comment value);

  /**
   * Returns the value of the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If</em>' containment reference.
   * @see #setIf(Expression)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExpression_If()
   * @model containment="true"
   * @generated
   */
  Expression getIf();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Expression#getIf <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If</em>' containment reference.
   * @see #getIf()
   * @generated
   */
  void setIf(Expression value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(Expression)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExpression_Then()
   * @model containment="true"
   * @generated
   */
  Expression getThen();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Expression#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(Expression value);

  /**
   * Returns the value of the '<em><b>Elseif</b></em>' containment reference list.
   * The list contents are of type {@link sc.modelica.xtext.modelicaMo.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elseif</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elseif</em>' containment reference list.
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExpression_Elseif()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getElseif();

  /**
   * Returns the value of the '<em><b>Elseifthen</b></em>' containment reference list.
   * The list contents are of type {@link sc.modelica.xtext.modelicaMo.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elseifthen</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elseifthen</em>' containment reference list.
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExpression_Elseifthen()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getElseifthen();

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(Expression)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExpression_Else()
   * @model containment="true"
   * @generated
   */
  Expression getElse();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Expression#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(Expression value);

  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(Expression)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExpression_Start()
   * @model containment="true"
   * @generated
   */
  Expression getStart();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Expression#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(Expression value);

  /**
   * Returns the value of the '<em><b>Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' containment reference.
   * @see #setStep(Expression)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExpression_Step()
   * @model containment="true"
   * @generated
   */
  Expression getStep();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Expression#getStep <em>Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step</em>' containment reference.
   * @see #getStep()
   * @generated
   */
  void setStep(Expression value);

  /**
   * Returns the value of the '<em><b>Stop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stop</em>' containment reference.
   * @see #setStop(Expression)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExpression_Stop()
   * @model containment="true"
   * @generated
   */
  Expression getStop();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Expression#getStop <em>Stop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stop</em>' containment reference.
   * @see #getStop()
   * @generated
   */
  void setStop(Expression value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExpression_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Expression#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference list.
   * The list contents are of type {@link sc.modelica.xtext.modelicaMo.ExprExpressionList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference list.
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExpression_List()
   * @model containment="true"
   * @generated
   */
  EList<ExprExpressionList> getList();

  /**
   * Returns the value of the '<em><b>Fa</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fa</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fa</em>' containment reference.
   * @see #setFa(FunctionArguments)
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getExpression_Fa()
   * @model containment="true"
   * @generated
   */
  FunctionArguments getFa();

  /**
   * Sets the value of the '{@link sc.modelica.xtext.modelicaMo.Expression#getFa <em>Fa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fa</em>' containment reference.
   * @see #getFa()
   * @generated
   */
  void setFa(FunctionArguments value);

} // Expression