/**
 */
package ConstraintDsl.impl;

import ConstraintDsl.ConstraintDslPackage;
import ConstraintDsl.RangeRule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ConstraintDsl.impl.RangeRuleImpl#getLow <em>Low</em>}</li>
 *   <li>{@link ConstraintDsl.impl.RangeRuleImpl#getHigh <em>High</em>}</li>
 *   <li>{@link ConstraintDsl.impl.RangeRuleImpl#isEqualLow <em>Equal Low</em>}</li>
 *   <li>{@link ConstraintDsl.impl.RangeRuleImpl#isEqualHigh <em>Equal High</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeRuleImpl extends RuleImpl implements RangeRule {
	/**
	 * The default value of the '{@link #getLow() <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected static final double LOW_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLow() <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected double low = LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getHigh() <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected static final double HIGH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHigh() <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected double high = HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #isEqualLow() <em>Equal Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEqualLow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EQUAL_LOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEqualLow() <em>Equal Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEqualLow()
	 * @generated
	 * @ordered
	 */
	protected boolean equalLow = EQUAL_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #isEqualHigh() <em>Equal High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEqualHigh()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EQUAL_HIGH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEqualHigh() <em>Equal High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEqualHigh()
	 * @generated
	 * @ordered
	 */
	protected boolean equalHigh = EQUAL_HIGH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintDslPackage.Literals.RANGE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLow() {
		return low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLow(double newLow) {
		double oldLow = low;
		low = newLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintDslPackage.RANGE_RULE__LOW, oldLow, low));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHigh() {
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHigh(double newHigh) {
		double oldHigh = high;
		high = newHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintDslPackage.RANGE_RULE__HIGH, oldHigh, high));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEqualLow() {
		return equalLow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEqualLow(boolean newEqualLow) {
		boolean oldEqualLow = equalLow;
		equalLow = newEqualLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintDslPackage.RANGE_RULE__EQUAL_LOW, oldEqualLow, equalLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEqualHigh() {
		return equalHigh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEqualHigh(boolean newEqualHigh) {
		boolean oldEqualHigh = equalHigh;
		equalHigh = newEqualHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintDslPackage.RANGE_RULE__EQUAL_HIGH, oldEqualHigh, equalHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintDslPackage.RANGE_RULE__LOW:
				return getLow();
			case ConstraintDslPackage.RANGE_RULE__HIGH:
				return getHigh();
			case ConstraintDslPackage.RANGE_RULE__EQUAL_LOW:
				return isEqualLow();
			case ConstraintDslPackage.RANGE_RULE__EQUAL_HIGH:
				return isEqualHigh();
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
			case ConstraintDslPackage.RANGE_RULE__LOW:
				setLow((Double)newValue);
				return;
			case ConstraintDslPackage.RANGE_RULE__HIGH:
				setHigh((Double)newValue);
				return;
			case ConstraintDslPackage.RANGE_RULE__EQUAL_LOW:
				setEqualLow((Boolean)newValue);
				return;
			case ConstraintDslPackage.RANGE_RULE__EQUAL_HIGH:
				setEqualHigh((Boolean)newValue);
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
			case ConstraintDslPackage.RANGE_RULE__LOW:
				setLow(LOW_EDEFAULT);
				return;
			case ConstraintDslPackage.RANGE_RULE__HIGH:
				setHigh(HIGH_EDEFAULT);
				return;
			case ConstraintDslPackage.RANGE_RULE__EQUAL_LOW:
				setEqualLow(EQUAL_LOW_EDEFAULT);
				return;
			case ConstraintDslPackage.RANGE_RULE__EQUAL_HIGH:
				setEqualHigh(EQUAL_HIGH_EDEFAULT);
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
			case ConstraintDslPackage.RANGE_RULE__LOW:
				return low != LOW_EDEFAULT;
			case ConstraintDslPackage.RANGE_RULE__HIGH:
				return high != HIGH_EDEFAULT;
			case ConstraintDslPackage.RANGE_RULE__EQUAL_LOW:
				return equalLow != EQUAL_LOW_EDEFAULT;
			case ConstraintDslPackage.RANGE_RULE__EQUAL_HIGH:
				return equalHigh != EQUAL_HIGH_EDEFAULT;
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
		result.append(" (low: ");
		result.append(low);
		result.append(", high: ");
		result.append(high);
		result.append(", equalLow: ");
		result.append(equalLow);
		result.append(", equalHigh: ");
		result.append(equalHigh);
		result.append(')');
		return result.toString();
	}

} //RangeRuleImpl
