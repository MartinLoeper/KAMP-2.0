/**
 */
package qualities.tests;

import junit.textui.TestRunner;

import qualities.PortabilityCompliance;
import qualities.QualitiesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Portability Compliance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortabilityComplianceTest extends PortabilityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PortabilityComplianceTest.class);
	}

	/**
	 * Constructs a new Portability Compliance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortabilityComplianceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Portability Compliance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PortabilityCompliance getFixture() {
		return (PortabilityCompliance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createPortabilityCompliance());
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

} //PortabilityComplianceTest
