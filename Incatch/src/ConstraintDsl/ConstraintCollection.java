/**
 */
package ConstraintDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ConstraintDsl.ConstraintCollection#getName <em>Name</em>}</li>
 *   <li>{@link ConstraintDsl.ConstraintCollection#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see ConstraintDsl.ConstraintDslPackage#getConstraintCollection()
 * @model annotation="gmf.diagram model.extension='cnt'"
 * @generated
 */
public interface ConstraintCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ConstraintDsl.ConstraintDslPackage#getConstraintCollection_Name()
	 * @model default="" id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ConstraintDsl.ConstraintCollection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ConstraintDsl.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see ConstraintDsl.ConstraintDslPackage#getConstraintCollection_Rules()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Rule> getRules();

} // ConstraintCollection
