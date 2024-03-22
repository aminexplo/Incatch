/**
 */
package ConstraintDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ConstraintDsl.ConstraintDslFactory
 * @model kind="package"
 * @generated
 */
public interface ConstraintDslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ConstraintDsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "zombie.incatch.constraintdsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cnt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintDslPackage eINSTANCE = ConstraintDsl.impl.ConstraintDslPackageImpl.init();

	/**
	 * The meta object id for the '{@link ConstraintDsl.impl.ConstraintCollectionImpl <em>Constraint Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintDsl.impl.ConstraintCollectionImpl
	 * @see ConstraintDsl.impl.ConstraintDslPackageImpl#getConstraintCollection()
	 * @generated
	 */
	int CONSTRAINT_COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_COLLECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_COLLECTION__RULES = 1;

	/**
	 * The number of structural features of the '<em>Constraint Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_COLLECTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ConstraintDsl.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintDsl.impl.RuleImpl
	 * @see ConstraintDsl.impl.ConstraintDslPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ARTIFACT = 1;

	/**
	 * The feature id for the '<em><b>Related Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RELATED_RULE = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ConstraintDsl.impl.RangeRuleImpl <em>Range Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConstraintDsl.impl.RangeRuleImpl
	 * @see ConstraintDsl.impl.ConstraintDslPackageImpl#getRangeRule()
	 * @generated
	 */
	int RANGE_RULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_RULE__ARTIFACT = RULE__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Related Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_RULE__RELATED_RULE = RULE__RELATED_RULE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_RULE__ATTRIBUTE = RULE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_RULE__LOW = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_RULE__HIGH = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Equal Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_RULE__EQUAL_LOW = RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Equal High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_RULE__EQUAL_HIGH = RULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Range Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link ConstraintDsl.ConstraintCollection <em>Constraint Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Collection</em>'.
	 * @see ConstraintDsl.ConstraintCollection
	 * @generated
	 */
	EClass getConstraintCollection();

	/**
	 * Returns the meta object for the attribute '{@link ConstraintDsl.ConstraintCollection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConstraintDsl.ConstraintCollection#getName()
	 * @see #getConstraintCollection()
	 * @generated
	 */
	EAttribute getConstraintCollection_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ConstraintDsl.ConstraintCollection#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see ConstraintDsl.ConstraintCollection#getRules()
	 * @see #getConstraintCollection()
	 * @generated
	 */
	EReference getConstraintCollection_Rules();

	/**
	 * Returns the meta object for class '{@link ConstraintDsl.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see ConstraintDsl.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link ConstraintDsl.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConstraintDsl.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link ConstraintDsl.Rule#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact</em>'.
	 * @see ConstraintDsl.Rule#getArtifact()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Artifact();

	/**
	 * Returns the meta object for the reference '{@link ConstraintDsl.Rule#getRelatedRule <em>Related Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related Rule</em>'.
	 * @see ConstraintDsl.Rule#getRelatedRule()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RelatedRule();

	/**
	 * Returns the meta object for the attribute '{@link ConstraintDsl.Rule#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see ConstraintDsl.Rule#getAttribute()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Attribute();

	/**
	 * Returns the meta object for class '{@link ConstraintDsl.RangeRule <em>Range Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Rule</em>'.
	 * @see ConstraintDsl.RangeRule
	 * @generated
	 */
	EClass getRangeRule();

	/**
	 * Returns the meta object for the attribute '{@link ConstraintDsl.RangeRule#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low</em>'.
	 * @see ConstraintDsl.RangeRule#getLow()
	 * @see #getRangeRule()
	 * @generated
	 */
	EAttribute getRangeRule_Low();

	/**
	 * Returns the meta object for the attribute '{@link ConstraintDsl.RangeRule#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High</em>'.
	 * @see ConstraintDsl.RangeRule#getHigh()
	 * @see #getRangeRule()
	 * @generated
	 */
	EAttribute getRangeRule_High();

	/**
	 * Returns the meta object for the attribute '{@link ConstraintDsl.RangeRule#isEqualLow <em>Equal Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equal Low</em>'.
	 * @see ConstraintDsl.RangeRule#isEqualLow()
	 * @see #getRangeRule()
	 * @generated
	 */
	EAttribute getRangeRule_EqualLow();

	/**
	 * Returns the meta object for the attribute '{@link ConstraintDsl.RangeRule#isEqualHigh <em>Equal High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equal High</em>'.
	 * @see ConstraintDsl.RangeRule#isEqualHigh()
	 * @see #getRangeRule()
	 * @generated
	 */
	EAttribute getRangeRule_EqualHigh();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstraintDslFactory getConstraintDslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ConstraintDsl.impl.ConstraintCollectionImpl <em>Constraint Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintDsl.impl.ConstraintCollectionImpl
		 * @see ConstraintDsl.impl.ConstraintDslPackageImpl#getConstraintCollection()
		 * @generated
		 */
		EClass CONSTRAINT_COLLECTION = eINSTANCE.getConstraintCollection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_COLLECTION__NAME = eINSTANCE.getConstraintCollection_Name();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_COLLECTION__RULES = eINSTANCE.getConstraintCollection_Rules();

		/**
		 * The meta object literal for the '{@link ConstraintDsl.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintDsl.impl.RuleImpl
		 * @see ConstraintDsl.impl.ConstraintDslPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ARTIFACT = eINSTANCE.getRule_Artifact();

		/**
		 * The meta object literal for the '<em><b>Related Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RELATED_RULE = eINSTANCE.getRule_RelatedRule();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ATTRIBUTE = eINSTANCE.getRule_Attribute();

		/**
		 * The meta object literal for the '{@link ConstraintDsl.impl.RangeRuleImpl <em>Range Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConstraintDsl.impl.RangeRuleImpl
		 * @see ConstraintDsl.impl.ConstraintDslPackageImpl#getRangeRule()
		 * @generated
		 */
		EClass RANGE_RULE = eINSTANCE.getRangeRule();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_RULE__LOW = eINSTANCE.getRangeRule_Low();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_RULE__HIGH = eINSTANCE.getRangeRule_High();

		/**
		 * The meta object literal for the '<em><b>Equal Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_RULE__EQUAL_LOW = eINSTANCE.getRangeRule_EqualLow();

		/**
		 * The meta object literal for the '<em><b>Equal High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_RULE__EQUAL_HIGH = eINSTANCE.getRangeRule_EqualHigh();

	}

} //ConstraintDslPackage
