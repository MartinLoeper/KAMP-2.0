/**
 */
package qualities.tests;

import junit.textui.TestRunner;

import qualities.MaintainabilityCompliance;
import qualities.QualitiesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Maintainability Compliance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaintainabilityComplianceTest extends MaintainabilityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MaintainabilityComplianceTest.class);
	}

	/**
	 * Constructs a new Maintainability Compliance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintainabilityComplianceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Maintainability Compliance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MaintainabilityCompliance getFixture() {
		return (MaintainabilityCompliance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createMaintainabilityCompliance());
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

} //MaintainabilityComplianceTest
