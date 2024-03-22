/**
 */
package TraceMetamodelEli5;

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
 *   <li>{@link TraceMetamodelEli5.Scenario#getName <em>Name</em>}</li>
 *   <li>{@link TraceMetamodelEli5.Scenario#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see TraceMetamodelEli5.TraceMetamodelEli5Package#getScenario()
 * @model annotation="gmf.diagram model.extension='tmelif'"
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TraceMetamodelEli5.TraceMetamodelEli5Package#getScenario_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TraceMetamodelEli5.Scenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link TraceMetamodelEli5.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see TraceMetamodelEli5.TraceMetamodelEli5Package#getScenario_Rules()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Rule> getRules();

} // Scenario
