/**
 */
package qualities.tests;

import junit.textui.TestRunner;

import qualities.QualitiesFactory;
import qualities.Stability;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StabilityTest extends MaintainabilityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StabilityTest.class);
	}

	/**
	 * Constructs a new Stability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Stability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Stability getFixture() {
		return (Stability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createStability());
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

} //StabilityTest
