/**
 */
package ConfigDsl.impl;

import ConfigDsl.Config;
import ConfigDsl.ConfigDslPackage;
import ConfigDsl.DynamicListField;
import ConfigDsl.Project;
import ConfigDsl.SimpleStringField;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ConfigDsl.impl.ConfigImpl#getProject <em>Project</em>}</li>
 *   <li>{@link ConfigDsl.impl.ConfigImpl#getSimpleStringFields <em>Simple String Fields</em>}</li>
 *   <li>{@link ConfigDsl.impl.ConfigImpl#getDynamicListFields <em>Dynamic List Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigImpl extends EObjectImpl implements Config {
	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;

	/**
	 * The cached value of the '{@link #getSimpleStringFields() <em>Simple String Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleStringFields()
	 * @generated
	 * @ordered
	 */
	protected EList<SimpleStringField> simpleStringFields;

	/**
	 * The cached value of the '{@link #getDynamicListFields() <em>Dynamic List Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicListFields()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicListField> dynamicListFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigDslPackage.Literals.CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project getProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigDslPackage.CONFIG__PROJECT, oldProject, newProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProject(Project newProject) {
		if (newProject != project) {
			NotificationChain msgs = null;
			if (project != null)
				msgs = ((InternalEObject)project).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigDslPackage.CONFIG__PROJECT, null, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigDslPackage.CONFIG__PROJECT, null, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigDslPackage.CONFIG__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SimpleStringField> getSimpleStringFields() {
		if (simpleStringFields == null) {
			simpleStringFields = new EObjectContainmentEList<SimpleStringField>(SimpleStringField.class, this, ConfigDslPackage.CONFIG__SIMPLE_STRING_FIELDS);
		}
		return simpleStringFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DynamicListField> getDynamicListFields() {
		if (dynamicListFields == null) {
			dynamicListFields = new EObjectContainmentEList<DynamicListField>(DynamicListField.class, this, ConfigDslPackage.CONFIG__DYNAMIC_LIST_FIELDS);
		}
		return dynamicListFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigDslPackage.CONFIG__PROJECT:
				return basicSetProject(null, msgs);
			case ConfigDslPackage.CONFIG__SIMPLE_STRING_FIELDS:
				return ((InternalEList<?>)getSimpleStringFields()).basicRemove(otherEnd, msgs);
			case ConfigDslPackage.CONFIG__DYNAMIC_LIST_FIELDS:
				return ((InternalEList<?>)getDynamicListFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigDslPackage.CONFIG__PROJECT:
				return getProject();
			case ConfigDslPackage.CONFIG__SIMPLE_STRING_FIELDS:
				return getSimpleStringFields();
			case ConfigDslPackage.CONFIG__DYNAMIC_LIST_FIELDS:
				return getDynamicListFields();
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
			case ConfigDslPackage.CONFIG__PROJECT:
				setProject((Project)newValue);
				return;
			case ConfigDslPackage.CONFIG__SIMPLE_STRING_FIELDS:
				getSimpleStringFields().clear();
				getSimpleStringFields().addAll((Collection<? extends SimpleStringField>)newValue);
				return;
			case ConfigDslPackage.CONFIG__DYNAMIC_LIST_FIELDS:
				getDynamicListFields().clear();
				getDynamicListFields().addAll((Collection<? extends DynamicListField>)newValue);
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
			case ConfigDslPackage.CONFIG__PROJECT:
				setProject((Project)null);
				return;
			case ConfigDslPackage.CONFIG__SIMPLE_STRING_FIELDS:
				getSimpleStringFields().clear();
				return;
			case ConfigDslPackage.CONFIG__DYNAMIC_LIST_FIELDS:
				getDynamicListFields().clear();
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
			case ConfigDslPackage.CONFIG__PROJECT:
				return project != null;
			case ConfigDslPackage.CONFIG__SIMPLE_STRING_FIELDS:
				return simpleStringFields != null && !simpleStringFields.isEmpty();
			case ConfigDslPackage.CONFIG__DYNAMIC_LIST_FIELDS:
				return dynamicListFields != null && !dynamicListFields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigImpl
