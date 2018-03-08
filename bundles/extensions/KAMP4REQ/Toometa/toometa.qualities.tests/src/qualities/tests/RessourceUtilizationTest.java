/**
 */
package qualities.tests;

import junit.textui.TestRunner;

import qualities.QualitiesFactory;
import qualities.RessourceUtilization;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ressource Utilization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RessourceUtilizationTest extends EfficiencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RessourceUtilizationTest.class);
	}

	/**
	 * Constructs a new Ressource Utilization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourceUtilizationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ressource Utilization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RessourceUtilization getFixture() {
		return (RessourceUtilization)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createRessourceUtilization());
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

} //RessourceUtilizationTest
