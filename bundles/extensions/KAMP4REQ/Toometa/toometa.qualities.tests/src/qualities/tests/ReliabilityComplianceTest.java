/**
 */
package qualities.tests;

import junit.textui.TestRunner;

import qualities.QualitiesFactory;
import qualities.ReliabilityCompliance;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reliability Compliance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReliabilityComplianceTest extends ReliabilityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReliabilityComplianceTest.class);
	}

	/**
	 * Constructs a new Reliability Compliance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliabilityComplianceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Reliability Compliance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReliabilityCompliance getFixture() {
		return (ReliabilityCompliance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createReliabilityCompliance());
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

} //ReliabilityComplianceTest
