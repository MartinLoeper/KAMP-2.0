/**
 */
package qualities.tests;

import junit.textui.TestRunner;

import qualities.EfficiencyCompliance;
import qualities.QualitiesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Efficiency Compliance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EfficiencyComplianceTest extends EfficiencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EfficiencyComplianceTest.class);
	}

	/**
	 * Constructs a new Efficiency Compliance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EfficiencyComplianceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Efficiency Compliance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EfficiencyCompliance getFixture() {
		return (EfficiencyCompliance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createEfficiencyCompliance());
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

} //EfficiencyComplianceTest
