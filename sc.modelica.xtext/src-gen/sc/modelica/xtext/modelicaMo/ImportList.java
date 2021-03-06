/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package sc.modelica.xtext.modelicaMo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sc.modelica.xtext.modelicaMo.ImportList#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getImportList()
 * @model
 * @generated
 */
public interface ImportList extends EObject
{
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
   * @see sc.modelica.xtext.modelicaMo.ModelicaMoPackage#getImportList_Id()
   * @model unique="false"
   * @generated
   */
  EList<String> getId();

} // ImportList
