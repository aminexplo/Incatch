/**
 */
package RuleTraceMetamodel.tests;

import RuleTraceMetamodel.ConstrainedElement;
import RuleTraceMetamodel.RuleTraceMetamodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Constrained Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstrainedElementTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConstrainedElementTest.class);
	}

	/**
	 * Constructs a new Constrained Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainedElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Constrained Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConstrainedElement getFixture() {
		return (ConstrainedElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RuleTraceMetamodelFactory.eINSTANCE.createConstrainedElement());
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

} //ConstrainedElementTest
