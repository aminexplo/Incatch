/**
 */
package RuleTraceMetamodel.impl;

import RuleTraceMetamodel.Rule;
import RuleTraceMetamodel.RuleTraceMetamodelPackage;
import RuleTraceMetamodel.RuleType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RuleTraceMetamodel.impl.RuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link RuleTraceMetamodel.impl.RuleImpl#getInterpreterUrl <em>Interpreter Url</em>}</li>
 *   <li>{@link RuleTraceMetamodel.impl.RuleImpl#getContent <em>Content</em>}</li>
 *   <li>{@link RuleTraceMetamodel.impl.RuleImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RuleType type;

	/**
	 * The default value of the '{@link #getInterpreterUrl() <em>Interpreter Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpreterUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPRETER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterpreterUrl() <em>Interpreter Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpreterUrl()
	 * @generated
	 * @ordered
	 */
	protected String interpreterUrl = INTERPRETER_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuleTraceMetamodelPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(RuleType newType) {
		RuleType oldType = type;
		type = newType == null ? null : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuleTraceMetamodelPackage.RULE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInterpreterUrl() {
		return interpreterUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpreterUrl(String newInterpreterUrl) {
		String oldInterpreterUrl = interpreterUrl;
		interpreterUrl = newInterpreterUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuleTraceMetamodelPackage.RULE__INTERPRETER_URL, oldInterpreterUrl, interpreterUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuleTraceMetamodelPackage.RULE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuleTraceMetamodelPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuleTraceMetamodelPackage.RULE__TYPE:
				return getType();
			case RuleTraceMetamodelPackage.RULE__INTERPRETER_URL:
				return getInterpreterUrl();
			case RuleTraceMetamodelPackage.RULE__CONTENT:
				return getContent();
			case RuleTraceMetamodelPackage.RULE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RuleTraceMetamodelPackage.RULE__TYPE:
				setType((RuleType)newValue);
				return;
			case RuleTraceMetamodelPackage.RULE__INTERPRETER_URL:
				setInterpreterUrl((String)newValue);
				return;
			case RuleTraceMetamodelPackage.RULE__CONTENT:
				setContent((String)newValue);
				return;
			case RuleTraceMetamodelPackage.RULE__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RuleTraceMetamodelPackage.RULE__TYPE:
				setType((RuleType)null);
				return;
			case RuleTraceMetamodelPackage.RULE__INTERPRETER_URL:
				setInterpreterUrl(INTERPRETER_URL_EDEFAULT);
				return;
			case RuleTraceMetamodelPackage.RULE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case RuleTraceMetamodelPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RuleTraceMetamodelPackage.RULE__TYPE:
				return type != null;
			case RuleTraceMetamodelPackage.RULE__INTERPRETER_URL:
				return INTERPRETER_URL_EDEFAULT == null ? interpreterUrl != null : !INTERPRETER_URL_EDEFAULT.equals(interpreterUrl);
			case RuleTraceMetamodelPackage.RULE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case RuleTraceMetamodelPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Type: ");
		result.append(type);
		result.append(", InterpreterUrl: ");
		result.append(interpreterUrl);
		result.append(", Content: ");
		result.append(content);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
