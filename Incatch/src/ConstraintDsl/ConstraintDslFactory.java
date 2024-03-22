/**
 */
package ConstraintDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ConstraintDsl.ConstraintDslPackage
 * @generated
 */
public interface ConstraintDslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintDslFactory eINSTANCE = ConstraintDsl.impl.ConstraintDslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Constraint Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Collection</em>'.
	 * @generated
	 */
	ConstraintCollection createConstraintCollection();

	/**
	 * Returns a new object of class '<em>Range Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Rule</em>'.
	 * @generated
	 */
	RangeRule createRangeRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConstraintDslPackage getConstraintDslPackage();

} //ConstraintDslFactory
