/**
 */
package ConstraintDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ConstraintDsl.Rule#getName <em>Name</em>}</li>
 *   <li>{@link ConstraintDsl.Rule#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link ConstraintDsl.Rule#getRelatedRule <em>Related Rule</em>}</li>
 *   <li>{@link ConstraintDsl.Rule#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see ConstraintDsl.ConstraintDslPackage#getRule()
 * @model abstract="true"
 *        annotation="gmf.node color='63,63,63' figure='ellipse' label='name'"
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ConstraintDsl.ConstraintDslPackage#getRule_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ConstraintDsl.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' attribute.
	 * @see #setArtifact(String)
	 * @see ConstraintDsl.ConstraintDslPackage#getRule_Artifact()
	 * @model
	 * @generated
	 */
	String getArtifact();

	/**
	 * Sets the value of the '{@link ConstraintDsl.Rule#getArtifact <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' attribute.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(String value);

	/**
	 * Returns the value of the '<em><b>Related Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Rule</em>' reference.
	 * @see #setRelatedRule(Rule)
	 * @see ConstraintDsl.ConstraintDslPackage#getRule_RelatedRule()
	 * @model required="true"
	 * @generated
	 */
	Rule getRelatedRule();

	/**
	 * Sets the value of the '{@link ConstraintDsl.Rule#getRelatedRule <em>Related Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Rule</em>' reference.
	 * @see #getRelatedRule()
	 * @generated
	 */
	void setRelatedRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see ConstraintDsl.ConstraintDslPackage#getRule_Attribute()
	 * @model
	 * @generated
	 */
	String getAttribute();

	/**
	 * Sets the value of the '{@link ConstraintDsl.Rule#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(String value);

} // Rule
