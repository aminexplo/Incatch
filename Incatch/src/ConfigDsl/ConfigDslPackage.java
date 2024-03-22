/**
 */
package ConfigDsl;

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
 * @see ConfigDsl.ConfigDslFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigDslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ConfigDsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "zombie.incatch.configdsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigDslPackage eINSTANCE = ConfigDsl.impl.ConfigDslPackageImpl.init();

	/**
	 * The meta object id for the '{@link ConfigDsl.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConfigDsl.impl.ConfigImpl
	 * @see ConfigDsl.impl.ConfigDslPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Simple String Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__SIMPLE_STRING_FIELDS = 1;

	/**
	 * The feature id for the '<em><b>Dynamic List Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__DYNAMIC_LIST_FIELDS = 2;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ConfigDsl.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConfigDsl.impl.ProjectImpl
	 * @see ConfigDsl.impl.ConfigDslPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Keep Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__KEEP_CLASSIFICATION = 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ConfigDsl.impl.SimpleStringFieldImpl <em>Simple String Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConfigDsl.impl.SimpleStringFieldImpl
	 * @see ConfigDsl.impl.ConfigDslPackageImpl#getSimpleStringField()
	 * @generated
	 */
	int SIMPLE_STRING_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STRING_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STRING_FIELD__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STRING_FIELD__IS_REQUIRED = 2;

	/**
	 * The number of structural features of the '<em>Simple String Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STRING_FIELD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ConfigDsl.impl.DynamicListFieldImpl <em>Dynamic List Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConfigDsl.impl.DynamicListFieldImpl
	 * @see ConfigDsl.impl.ConfigDslPackageImpl#getDynamicListField()
	 * @generated
	 */
	int DYNAMIC_LIST_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LIST_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LIST_FIELD__IS_REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Dynamic List Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LIST_FIELD__DYNAMIC_LIST_ITEMS = 2;

	/**
	 * The number of structural features of the '<em>Dynamic List Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LIST_FIELD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ConfigDsl.impl.DynamicListItemImpl <em>Dynamic List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ConfigDsl.impl.DynamicListItemImpl
	 * @see ConfigDsl.impl.ConfigDslPackageImpl#getDynamicListItem()
	 * @generated
	 */
	int DYNAMIC_LIST_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LIST_ITEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Dynamic List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_LIST_ITEM_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link ConfigDsl.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see ConfigDsl.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the containment reference '{@link ConfigDsl.Config#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project</em>'.
	 * @see ConfigDsl.Config#getProject()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Project();

	/**
	 * Returns the meta object for the containment reference list '{@link ConfigDsl.Config#getSimpleStringFields <em>Simple String Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple String Fields</em>'.
	 * @see ConfigDsl.Config#getSimpleStringFields()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_SimpleStringFields();

	/**
	 * Returns the meta object for the containment reference list '{@link ConfigDsl.Config#getDynamicListFields <em>Dynamic List Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic List Fields</em>'.
	 * @see ConfigDsl.Config#getDynamicListFields()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_DynamicListFields();

	/**
	 * Returns the meta object for class '{@link ConfigDsl.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see ConfigDsl.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link ConfigDsl.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConfigDsl.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link ConfigDsl.Project#isKeepClassification <em>Keep Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keep Classification</em>'.
	 * @see ConfigDsl.Project#isKeepClassification()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_KeepClassification();

	/**
	 * Returns the meta object for class '{@link ConfigDsl.SimpleStringField <em>Simple String Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple String Field</em>'.
	 * @see ConfigDsl.SimpleStringField
	 * @generated
	 */
	EClass getSimpleStringField();

	/**
	 * Returns the meta object for the attribute '{@link ConfigDsl.SimpleStringField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConfigDsl.SimpleStringField#getName()
	 * @see #getSimpleStringField()
	 * @generated
	 */
	EAttribute getSimpleStringField_Name();

	/**
	 * Returns the meta object for the attribute '{@link ConfigDsl.SimpleStringField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see ConfigDsl.SimpleStringField#getSize()
	 * @see #getSimpleStringField()
	 * @generated
	 */
	EAttribute getSimpleStringField_Size();

	/**
	 * Returns the meta object for the attribute '{@link ConfigDsl.SimpleStringField#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see ConfigDsl.SimpleStringField#isIsRequired()
	 * @see #getSimpleStringField()
	 * @generated
	 */
	EAttribute getSimpleStringField_IsRequired();

	/**
	 * Returns the meta object for class '{@link ConfigDsl.DynamicListField <em>Dynamic List Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic List Field</em>'.
	 * @see ConfigDsl.DynamicListField
	 * @generated
	 */
	EClass getDynamicListField();

	/**
	 * Returns the meta object for the attribute '{@link ConfigDsl.DynamicListField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConfigDsl.DynamicListField#getName()
	 * @see #getDynamicListField()
	 * @generated
	 */
	EAttribute getDynamicListField_Name();

	/**
	 * Returns the meta object for the attribute '{@link ConfigDsl.DynamicListField#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see ConfigDsl.DynamicListField#isIsRequired()
	 * @see #getDynamicListField()
	 * @generated
	 */
	EAttribute getDynamicListField_IsRequired();

	/**
	 * Returns the meta object for the containment reference list '{@link ConfigDsl.DynamicListField#getDynamicListItems <em>Dynamic List Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic List Items</em>'.
	 * @see ConfigDsl.DynamicListField#getDynamicListItems()
	 * @see #getDynamicListField()
	 * @generated
	 */
	EReference getDynamicListField_DynamicListItems();

	/**
	 * Returns the meta object for class '{@link ConfigDsl.DynamicListItem <em>Dynamic List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic List Item</em>'.
	 * @see ConfigDsl.DynamicListItem
	 * @generated
	 */
	EClass getDynamicListItem();

	/**
	 * Returns the meta object for the attribute '{@link ConfigDsl.DynamicListItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ConfigDsl.DynamicListItem#getName()
	 * @see #getDynamicListItem()
	 * @generated
	 */
	EAttribute getDynamicListItem_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigDslFactory getConfigDslFactory();

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
		 * The meta object literal for the '{@link ConfigDsl.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConfigDsl.impl.ConfigImpl
		 * @see ConfigDsl.impl.ConfigDslPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__PROJECT = eINSTANCE.getConfig_Project();

		/**
		 * The meta object literal for the '<em><b>Simple String Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__SIMPLE_STRING_FIELDS = eINSTANCE.getConfig_SimpleStringFields();

		/**
		 * The meta object literal for the '<em><b>Dynamic List Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__DYNAMIC_LIST_FIELDS = eINSTANCE.getConfig_DynamicListFields();

		/**
		 * The meta object literal for the '{@link ConfigDsl.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConfigDsl.impl.ProjectImpl
		 * @see ConfigDsl.impl.ConfigDslPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Keep Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__KEEP_CLASSIFICATION = eINSTANCE.getProject_KeepClassification();

		/**
		 * The meta object literal for the '{@link ConfigDsl.impl.SimpleStringFieldImpl <em>Simple String Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConfigDsl.impl.SimpleStringFieldImpl
		 * @see ConfigDsl.impl.ConfigDslPackageImpl#getSimpleStringField()
		 * @generated
		 */
		EClass SIMPLE_STRING_FIELD = eINSTANCE.getSimpleStringField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_STRING_FIELD__NAME = eINSTANCE.getSimpleStringField_Name();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_STRING_FIELD__SIZE = eINSTANCE.getSimpleStringField_Size();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_STRING_FIELD__IS_REQUIRED = eINSTANCE.getSimpleStringField_IsRequired();

		/**
		 * The meta object literal for the '{@link ConfigDsl.impl.DynamicListFieldImpl <em>Dynamic List Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConfigDsl.impl.DynamicListFieldImpl
		 * @see ConfigDsl.impl.ConfigDslPackageImpl#getDynamicListField()
		 * @generated
		 */
		EClass DYNAMIC_LIST_FIELD = eINSTANCE.getDynamicListField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_LIST_FIELD__NAME = eINSTANCE.getDynamicListField_Name();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_LIST_FIELD__IS_REQUIRED = eINSTANCE.getDynamicListField_IsRequired();

		/**
		 * The meta object literal for the '<em><b>Dynamic List Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_LIST_FIELD__DYNAMIC_LIST_ITEMS = eINSTANCE.getDynamicListField_DynamicListItems();

		/**
		 * The meta object literal for the '{@link ConfigDsl.impl.DynamicListItemImpl <em>Dynamic List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ConfigDsl.impl.DynamicListItemImpl
		 * @see ConfigDsl.impl.ConfigDslPackageImpl#getDynamicListItem()
		 * @generated
		 */
		EClass DYNAMIC_LIST_ITEM = eINSTANCE.getDynamicListItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_LIST_ITEM__NAME = eINSTANCE.getDynamicListItem_Name();

	}

} //ConfigDslPackage
