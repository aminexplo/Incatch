/**
 */
package ConstraintDsl.impl;

import ConstraintDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintDslFactoryImpl extends EFactoryImpl implements ConstraintDslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstraintDslFactory init() {
		try {
			ConstraintDslFactory theConstraintDslFactory = (ConstraintDslFactory)EPackage.Registry.INSTANCE.getEFactory(ConstraintDslPackage.eNS_URI);
			if (theConstraintDslFactory != null) {
				return theConstraintDslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConstraintDslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintDslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConstraintDslPackage.CONSTRAINT_COLLECTION: return createConstraintCollection();
			case ConstraintDslPackage.RANGE_RULE: return createRangeRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintCollection createConstraintCollection() {
		ConstraintCollectionImpl constraintCollection = new ConstraintCollectionImpl();
		return constraintCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RangeRule createRangeRule() {
		RangeRuleImpl rangeRule = new RangeRuleImpl();
		return rangeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintDslPackage getConstraintDslPackage() {
		return (ConstraintDslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConstraintDslPackage getPackage() {
		return ConstraintDslPackage.eINSTANCE;
	}

} //ConstraintDslFactoryImpl
