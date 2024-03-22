/**
 */
package ConfigDsl.tests;

import ConfigDsl.ConfigDslFactory;
import ConfigDsl.SimpleStringField;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple String Field</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleStringFieldTest extends TestCase {

	/**
	 * The fixture for this Simple String Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleStringField fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleStringFieldTest.class);
	}

	/**
	 * Constructs a new Simple String Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleStringFieldTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Simple String Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SimpleStringField fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Simple String Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleStringField getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ConfigDslFactory.eINSTANCE.createSimpleStringField());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SimpleStringFieldTest
