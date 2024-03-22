/**
 */
package TraceMetamodelEli5.impl;

import TraceMetamodelEli5.Rule;
import TraceMetamodelEli5.RuleType;
import TraceMetamodelEli5.TraceMetamodelEli5Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TraceMetamodelEli5.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link TraceMetamodelEli5.impl.RuleImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link TraceMetamodelEli5.impl.RuleImpl#isEvalResult <em>Eval Result</em>}</li>
 *   <li>{@link TraceMetamodelEli5.impl.RuleImpl#getRelatedRules <em>Related Rules</em>}</li>
 *   <li>{@link TraceMetamodelEli5.impl.RuleImpl#getRuleDef <em>Rule Def</em>}</li>
 *   <li>{@link TraceMetamodelEli5.impl.RuleImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
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
	 * The default value of the '{@link #getArtifact() <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected String artifact = ARTIFACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isEvalResult() <em>Eval Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEvalResult()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EVAL_RESULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEvalResult() <em>Eval Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEvalResult()
	 * @generated
	 * @ordered
	 */
	protected boolean evalResult = EVAL_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedRules() <em>Related Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> relatedRules;

	/**
	 * The default value of the '{@link #getRuleDef() <em>Rule Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleDef()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_DEF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleDef() <em>Rule Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleDef()
	 * @generated
	 * @ordered
	 */
	protected String ruleDef = RULE_DEF_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final RuleType TYPE_EDEFAULT = RuleType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RuleType type = TYPE_EDEFAULT;

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
		return TraceMetamodelEli5Package.Literals.RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TraceMetamodelEli5Package.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifact() {
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifact(String newArtifact) {
		String oldArtifact = artifact;
		artifact = newArtifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceMetamodelEli5Package.RULE__ARTIFACT, oldArtifact, artifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEvalResult() {
		return evalResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvalResult(boolean newEvalResult) {
		boolean oldEvalResult = evalResult;
		evalResult = newEvalResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceMetamodelEli5Package.RULE__EVAL_RESULT, oldEvalResult, evalResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rule> getRelatedRules() {
		if (relatedRules == null) {
			relatedRules = new EObjectResolvingEList<Rule>(Rule.class, this, TraceMetamodelEli5Package.RULE__RELATED_RULES);
		}
		return relatedRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuleDef() {
		return ruleDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleDef(String newRuleDef) {
		String oldRuleDef = ruleDef;
		ruleDef = newRuleDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceMetamodelEli5Package.RULE__RULE_DEF, oldRuleDef, ruleDef));
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
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceMetamodelEli5Package.RULE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceMetamodelEli5Package.RULE__NAME:
				return getName();
			case TraceMetamodelEli5Package.RULE__ARTIFACT:
				return getArtifact();
			case TraceMetamodelEli5Package.RULE__EVAL_RESULT:
				return isEvalResult();
			case TraceMetamodelEli5Package.RULE__RELATED_RULES:
				return getRelatedRules();
			case TraceMetamodelEli5Package.RULE__RULE_DEF:
				return getRuleDef();
			case TraceMetamodelEli5Package.RULE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TraceMetamodelEli5Package.RULE__NAME:
				setName((String)newValue);
				return;
			case TraceMetamodelEli5Package.RULE__ARTIFACT:
				setArtifact((String)newValue);
				return;
			case TraceMetamodelEli5Package.RULE__EVAL_RESULT:
				setEvalResult((Boolean)newValue);
				return;
			case TraceMetamodelEli5Package.RULE__RELATED_RULES:
				getRelatedRules().clear();
				getRelatedRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case TraceMetamodelEli5Package.RULE__RULE_DEF:
				setRuleDef((String)newValue);
				return;
			case TraceMetamodelEli5Package.RULE__TYPE:
				setType((RuleType)newValue);
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
			case TraceMetamodelEli5Package.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TraceMetamodelEli5Package.RULE__ARTIFACT:
				setArtifact(ARTIFACT_EDEFAULT);
				return;
			case TraceMetamodelEli5Package.RULE__EVAL_RESULT:
				setEvalResult(EVAL_RESULT_EDEFAULT);
				return;
			case TraceMetamodelEli5Package.RULE__RELATED_RULES:
				getRelatedRules().clear();
				return;
			case TraceMetamodelEli5Package.RULE__RULE_DEF:
				setRuleDef(RULE_DEF_EDEFAULT);
				return;
			case TraceMetamodelEli5Package.RULE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case TraceMetamodelEli5Package.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TraceMetamodelEli5Package.RULE__ARTIFACT:
				return ARTIFACT_EDEFAULT == null ? artifact != null : !ARTIFACT_EDEFAULT.equals(artifact);
			case TraceMetamodelEli5Package.RULE__EVAL_RESULT:
				return evalResult != EVAL_RESULT_EDEFAULT;
			case TraceMetamodelEli5Package.RULE__RELATED_RULES:
				return relatedRules != null && !relatedRules.isEmpty();
			case TraceMetamodelEli5Package.RULE__RULE_DEF:
				return RULE_DEF_EDEFAULT == null ? ruleDef != null : !RULE_DEF_EDEFAULT.equals(ruleDef);
			case TraceMetamodelEli5Package.RULE__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", artifact: ");
		result.append(artifact);
		result.append(", evalResult: ");
		result.append(evalResult);
		result.append(", ruleDef: ");
		result.append(ruleDef);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
