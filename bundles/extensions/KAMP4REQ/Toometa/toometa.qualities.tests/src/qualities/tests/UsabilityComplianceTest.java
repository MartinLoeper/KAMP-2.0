/**
 */
package qualities.tests;

import junit.textui.TestRunner;

import qualities.QualitiesFactory;
import qualities.UsabilityCompliance;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Usability Compliance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsabilityComplianceTest extends UsabilityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsabilityComplianceTest.class);
	}

	/**
	 * Constructs a new Usability Compliance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsabilityComplianceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Usability Compliance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UsabilityCompliance getFixture() {
		return (UsabilityCompliance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createUsabilityCompliance());
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

} //UsabilityComplianceTest
