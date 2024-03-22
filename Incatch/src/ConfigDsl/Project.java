/**
 */
package ConfigDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ConfigDsl.Project#getName <em>Name</em>}</li>
 *   <li>{@link ConfigDsl.Project#isKeepClassification <em>Keep Classification</em>}</li>
 * </ul>
 *
 * @see ConfigDsl.ConfigDslPackage#getProject()
 * @model annotation="gmf.node color='63,63,63' figure='ellipse' label='Name'"
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ConfigDsl.ConfigDslPackage#getProject_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ConfigDsl.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Keep Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Classification</em>' attribute.
	 * @see #setKeepClassification(boolean)
	 * @see ConfigDsl.ConfigDslPackage#getProject_KeepClassification()
	 * @model
	 * @generated
	 */
	boolean isKeepClassification();

	/**
	 * Sets the value of the '{@link ConfigDsl.Project#isKeepClassification <em>Keep Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Classification</em>' attribute.
	 * @see #isKeepClassification()
	 * @generated
	 */
	void setKeepClassification(boolean value);

} // Project
