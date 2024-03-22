/**
 */
package TraceMetamodelEli5;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link TraceMetamodelEli5.Rule#getName <em>Name</em>}</li>
 *   <li>{@link TraceMetamodelEli5.Rule#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link TraceMetamodelEli5.Rule#isEvalResult <em>Eval Result</em>}</li>
 *   <li>{@link TraceMetamodelEli5.Rule#getRelatedRules <em>Related Rules</em>}</li>
 *   <li>{@link TraceMetamodelEli5.Rule#getRuleDef <em>Rule Def</em>}</li>
 *   <li>{@link TraceMetamodelEli5.Rule#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see TraceMetamodelEli5.TraceMetamodelEli5Package#getRule()
 * @model annotation="gmf.node color='63,63,63' figure='ellipse' label='name'"
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TraceMetamodelEli5.TraceMetamodelEli5Package#getRule_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TraceMetamodelEli5.Rule#getName <em>Name</em>}' attribute.
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
	 * @see TraceMetamodelEli5.TraceMetamodelEli5Package#getRule_Artifact()
	 * @model
	 * @generated
	 */
	String getArtifact();

	/**
	 * Sets the value of the '{@link TraceMetamodelEli5.Rule#getArtifact <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact</em>' attribute.
	 * @see #getArtifact()
	 * @generated
	 */
	void setArtifact(String value);

	/**
	 * Returns the value of the '<em><b>Eval Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eval Result</em>' attribute.
	 * @see #setEvalResult(boolean)
	 * @see TraceMetamodelEli5.TraceMetamodelEli5Package#getRule_EvalResult()
	 * @model
	 * @generated
	 */
	boolean isEvalResult();

	/**
	 * Sets the value of the '{@link TraceMetamodelEli5.Rule#isEvalResult <em>Eval Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eval Result</em>' attribute.
	 * @see #isEvalResult()
	 * @generated
	 */
	void setEvalResult(boolean value);

	/**
	 * Returns the value of the '<em><b>Related Rules</b></em>' reference list.
	 * The list contents are of type {@link TraceMetamodelEli5.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Rules</em>' reference list.
	 * @see TraceMetamodelEli5.TraceMetamodelEli5Package#getRule_RelatedRules()
	 * @model required="true"
	 * @generated
	 */
	EList<Rule> getRelatedRules();

	/**
	 * Returns the value of the '<em><b>Rule Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Def</em>' attribute.
	 * @see #setRuleDef(String)
	 * @see TraceMetamodelEli5.TraceMetamodelEli5Package#getRule_RuleDef()
	 * @model
	 * @generated
	 */
	String getRuleDef();

	/**
	 * Sets the value of the '{@link TraceMetamodelEli5.Rule#getRuleDef <em>Rule Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Def</em>' attribute.
	 * @see #getRuleDef()
	 * @generated
	 */
	void setRuleDef(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Unknown"</code>.
	 * The literals are from the enumeration {@link TraceMetamodelEli5.RuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see TraceMetamodelEli5.RuleType
	 * @see #setType(RuleType)
	 * @see TraceMetamodelEli5.TraceMetamodelEli5Package#getRule_Type()
	 * @model default="Unknown"
	 * @generated
	 */
	RuleType getType();

	/**
	 * Sets the value of the '{@link TraceMetamodelEli5.Rule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see TraceMetamodelEli5.RuleType
	 * @see #getType()
	 * @generated
	 */
	void setType(RuleType value);

} // Rule
