/**
 */
package ConstraintDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ConstraintDsl.RangeRule#getLow <em>Low</em>}</li>
 *   <li>{@link ConstraintDsl.RangeRule#getHigh <em>High</em>}</li>
 *   <li>{@link ConstraintDsl.RangeRule#isEqualLow <em>Equal Low</em>}</li>
 *   <li>{@link ConstraintDsl.RangeRule#isEqualHigh <em>Equal High</em>}</li>
 * </ul>
 *
 * @see ConstraintDsl.ConstraintDslPackage#getRangeRule()
 * @model
 * @generated
 */
public interface RangeRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low</em>' attribute.
	 * @see #setLow(double)
	 * @see ConstraintDsl.ConstraintDslPackage#getRangeRule_Low()
	 * @model
	 * @generated
	 */
	double getLow();

	/**
	 * Sets the value of the '{@link ConstraintDsl.RangeRule#getLow <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' attribute.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(double value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High</em>' attribute.
	 * @see #setHigh(double)
	 * @see ConstraintDsl.ConstraintDslPackage#getRangeRule_High()
	 * @model
	 * @generated
	 */
	double getHigh();

	/**
	 * Sets the value of the '{@link ConstraintDsl.RangeRule#getHigh <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' attribute.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(double value);

	/**
	 * Returns the value of the '<em><b>Equal Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equal Low</em>' attribute.
	 * @see #setEqualLow(boolean)
	 * @see ConstraintDsl.ConstraintDslPackage#getRangeRule_EqualLow()
	 * @model
	 * @generated
	 */
	boolean isEqualLow();

	/**
	 * Sets the value of the '{@link ConstraintDsl.RangeRule#isEqualLow <em>Equal Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equal Low</em>' attribute.
	 * @see #isEqualLow()
	 * @generated
	 */
	void setEqualLow(boolean value);

	/**
	 * Returns the value of the '<em><b>Equal High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equal High</em>' attribute.
	 * @see #setEqualHigh(boolean)
	 * @see ConstraintDsl.ConstraintDslPackage#getRangeRule_EqualHigh()
	 * @model
	 * @generated
	 */
	boolean isEqualHigh();

	/**
	 * Sets the value of the '{@link ConstraintDsl.RangeRule#isEqualHigh <em>Equal High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equal High</em>' attribute.
	 * @see #isEqualHigh()
	 * @generated
	 */
	void setEqualHigh(boolean value);

} // RangeRule
