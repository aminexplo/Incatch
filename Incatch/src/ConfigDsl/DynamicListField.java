/**
 */
package ConfigDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic List Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ConfigDsl.DynamicListField#getName <em>Name</em>}</li>
 *   <li>{@link ConfigDsl.DynamicListField#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link ConfigDsl.DynamicListField#getDynamicListItems <em>Dynamic List Items</em>}</li>
 * </ul>
 *
 * @see ConfigDsl.ConfigDslPackage#getDynamicListField()
 * @model annotation="gmf.node color='63,63,63' figure='ellipse' label='Name'"
 * @generated
 */
public interface DynamicListField extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ConfigDsl.ConfigDslPackage#getDynamicListField_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ConfigDsl.DynamicListField#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required</em>' attribute.
	 * @see #setIsRequired(boolean)
	 * @see ConfigDsl.ConfigDslPackage#getDynamicListField_IsRequired()
	 * @model
	 * @generated
	 */
	boolean isIsRequired();

	/**
	 * Sets the value of the '{@link ConfigDsl.DynamicListField#isIsRequired <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Required</em>' attribute.
	 * @see #isIsRequired()
	 * @generated
	 */
	void setIsRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Dynamic List Items</b></em>' containment reference list.
	 * The list contents are of type {@link ConfigDsl.DynamicListItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic List Items</em>' containment reference list.
	 * @see ConfigDsl.ConfigDslPackage#getDynamicListField_DynamicListItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<DynamicListItem> getDynamicListItems();

} // DynamicListField
