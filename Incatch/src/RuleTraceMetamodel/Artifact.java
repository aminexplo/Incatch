/**
 */
package RuleTraceMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RuleTraceMetamodel.Artifact#getRelatedArtifacts <em>Related Artifacts</em>}</li>
 *   <li>{@link RuleTraceMetamodel.Artifact#getElements <em>Elements</em>}</li>
 *   <li>{@link RuleTraceMetamodel.Artifact#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see RuleTraceMetamodel.RuleTraceMetamodelPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends EObject {
	/**
	 * Returns the value of the '<em><b>Related Artifacts</b></em>' reference list.
	 * The list contents are of type {@link RuleTraceMetamodel.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Artifacts</em>' reference list.
	 * @see RuleTraceMetamodel.RuleTraceMetamodelPackage#getArtifact_RelatedArtifacts()
	 * @model required="true"
	 * @generated
	 */
	EList<Artifact> getRelatedArtifacts();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link RuleTraceMetamodel.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see RuleTraceMetamodel.RuleTraceMetamodelPackage#getArtifact_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RuleTraceMetamodel.RuleTraceMetamodelPackage#getArtifact_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RuleTraceMetamodel.Artifact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Artifact
