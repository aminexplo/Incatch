/**
 */
package RuleTraceMetamodel;

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
 *   <li>{@link RuleTraceMetamodel.Rule#getType <em>Type</em>}</li>
 *   <li>{@link RuleTraceMetamodel.Rule#getInterpreterUrl <em>Interpreter Url</em>}</li>
 *   <li>{@link RuleTraceMetamodel.Rule#getContent <em>Content</em>}</li>
 *   <li>{@link RuleTraceMetamodel.Rule#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see RuleTraceMetamodel.RuleTraceMetamodelPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Custom"</code>.
	 * The literals are from the enumeration {@link RuleTraceMetamodel.RuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see RuleTraceMetamodel.RuleType
	 * @see #setType(RuleType)
	 * @see RuleTraceMetamodel.RuleTraceMetamodelPackage#getRule_Type()
	 * @model default="Custom" dataType="RuleTraceMetamodel.RuleType"
	 * @generated
	 */
	RuleType getType();

	/**
	 * Sets the value of the '{@link RuleTraceMetamodel.Rule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see RuleTraceMetamodel.RuleType
	 * @see #getType()
	 * @generated
	 */
	void setType(RuleType value);

	/**
	 * Returns the value of the '<em><b>Interpreter Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpreter Url</em>' attribute.
	 * @see #setInterpreterUrl(String)
	 * @see RuleTraceMetamodel.RuleTraceMetamodelPackage#getRule_InterpreterUrl()
	 * @model
	 * @generated
	 */
	String getInterpreterUrl();

	/**
	 * Sets the value of the '{@link RuleTraceMetamodel.Rule#getInterpreterUrl <em>Interpreter Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpreter Url</em>' attribute.
	 * @see #getInterpreterUrl()
	 * @generated
	 */
	void setInterpreterUrl(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see RuleTraceMetamodel.RuleTraceMetamodelPackage#getRule_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link RuleTraceMetamodel.Rule#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RuleTraceMetamodel.RuleTraceMetamodelPackage#getRule_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RuleTraceMetamodel.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Rule
