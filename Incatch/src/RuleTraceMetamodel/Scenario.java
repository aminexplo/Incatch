/**
 */
package RuleTraceMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RuleTraceMetamodel.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link RuleTraceMetamodel.Scenario#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @see RuleTraceMetamodel.RuleTraceMetamodelPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RuleTraceMetamodel.RuleTraceMetamodelPackage#getScenario_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RuleTraceMetamodel.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link RuleTraceMetamodel.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see RuleTraceMetamodel.RuleTraceMetamodelPackage#getScenario_Artifacts()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

} // Scenario
