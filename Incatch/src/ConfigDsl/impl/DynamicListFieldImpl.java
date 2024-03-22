/**
 */
package ConfigDsl.impl;

import ConfigDsl.ConfigDslPackage;
import ConfigDsl.DynamicListField;
import ConfigDsl.DynamicListItem;

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
 * An implementation of the model object '<em><b>Dynamic List Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ConfigDsl.impl.DynamicListFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link ConfigDsl.impl.DynamicListFieldImpl#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link ConfigDsl.impl.DynamicListFieldImpl#getDynamicListItems <em>Dynamic List Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicListFieldImpl extends EObjectImpl implements DynamicListField {
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
	 * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isRequired = IS_REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDynamicListItems() <em>Dynamic List Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicListItems()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicListItem> dynamicListItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicListFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigDslPackage.Literals.DYNAMIC_LIST_FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigDslPackage.DYNAMIC_LIST_FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsRequired() {
		return isRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRequired(boolean newIsRequired) {
		boolean oldIsRequired = isRequired;
		isRequired = newIsRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigDslPackage.DYNAMIC_LIST_FIELD__IS_REQUIRED, oldIsRequired, isRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DynamicListItem> getDynamicListItems() {
		if (dynamicListItems == null) {
			dynamicListItems = new EObjectContainmentEList<DynamicListItem>(DynamicListItem.class, this, ConfigDslPackage.DYNAMIC_LIST_FIELD__DYNAMIC_LIST_ITEMS);
		}
		return dynamicListItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigDslPackage.DYNAMIC_LIST_FIELD__DYNAMIC_LIST_ITEMS:
				return ((InternalEList<?>)getDynamicListItems()).basicRemove(otherEnd, msgs);
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
			case ConfigDslPackage.DYNAMIC_LIST_FIELD__NAME:
				return getName();
			case ConfigDslPackage.DYNAMIC_LIST_FIELD__IS_REQUIRED:
				return isIsRequired();
			case ConfigDslPackage.DYNAMIC_LIST_FIELD__DYNAMIC_LIST_ITEMS:
				return getDynamicListItems();
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
			case ConfigDslPackage.DYNAMIC_LIST_FIELD__NAME:
				setName((String)newValue);
				return;
			case ConfigDslPackage.DYNAMIC_LIST_FIELD__IS_REQUIRED:
				setIsRequired((Boolean)newValue);
				return;
			case ConfigDslPackage.DYNAMIC_LIST_FIELD__DYNAMIC_LIST_ITEMS:
				getDynamicListItems().clear();
				getDynamicListItems().addAll((Collection<? extends DynamicListItem>)newValue);
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
			case ConfigDslPackage.DYNAMIC_LIST_FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigDslPackage.DYNAMIC_LIST_FIELD__IS_REQUIRED:
				setIsRequired(IS_REQUIRED_EDEFAULT);
				return;
			case ConfigDslPackage.DYNAMIC_LIST_FIELD__DYNAMIC_LIST_ITEMS:
				getDynamicListItems().clear();
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
			case ConfigDslPackage.DYNAMIC_LIST_FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigDslPackage.DYNAMIC_LIST_FIELD__IS_REQUIRED:
				return isRequired != IS_REQUIRED_EDEFAULT;
			case ConfigDslPackage.DYNAMIC_LIST_FIELD__DYNAMIC_LIST_ITEMS:
				return dynamicListItems != null && !dynamicListItems.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", IsRequired: ");
		result.append(isRequired);
		result.append(')');
		return result.toString();
	}

} //DynamicListFieldImpl
