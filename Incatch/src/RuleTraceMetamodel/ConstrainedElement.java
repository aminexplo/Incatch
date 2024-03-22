/**
 */
package RuleTraceMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constrained Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RuleTraceMetamodel.ConstrainedElement#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see RuleTraceMetamodel.RuleTraceMetamodelPackage#getConstrainedElement()
 * @model
 * @generated
 */
public interface ConstrainedElement extends Element {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link RuleTraceMetamodel.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see RuleTraceMetamodel.RuleTraceMetamodelPackage#getConstrainedElement_Rules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // ConstrainedElement
