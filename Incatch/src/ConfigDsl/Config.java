/**
 */
package ConfigDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ConfigDsl.Config#getProject <em>Project</em>}</li>
 *   <li>{@link ConfigDsl.Config#getSimpleStringFields <em>Simple String Fields</em>}</li>
 *   <li>{@link ConfigDsl.Config#getDynamicListFields <em>Dynamic List Fields</em>}</li>
 * </ul>
 *
 * @see ConfigDsl.ConfigDslPackage#getConfig()
 * @model annotation="gmf.diagram model.extension='cd'"
 * @generated
 */
public interface Config extends EObject {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' containment reference.
	 * @see #setProject(Project)
	 * @see ConfigDsl.ConfigDslPackage#getConfig_Project()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link ConfigDsl.Config#getProject <em>Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' containment reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Simple String Fields</b></em>' containment reference list.
	 * The list contents are of type {@link ConfigDsl.SimpleStringField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple String Fields</em>' containment reference list.
	 * @see ConfigDsl.ConfigDslPackage#getConfig_SimpleStringFields()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SimpleStringField> getSimpleStringFields();

	/**
	 * Returns the value of the '<em><b>Dynamic List Fields</b></em>' containment reference list.
	 * The list contents are of type {@link ConfigDsl.DynamicListField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic List Fields</em>' containment reference list.
	 * @see ConfigDsl.ConfigDslPackage#getConfig_DynamicListFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<DynamicListField> getDynamicListFields();

} // Config
