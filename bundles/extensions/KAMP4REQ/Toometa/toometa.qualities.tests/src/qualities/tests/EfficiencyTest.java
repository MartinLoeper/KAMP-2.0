/**
 */
package qualities.tests;

import junit.textui.TestRunner;

import qualities.Efficiency;
import qualities.QualitiesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Efficiency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EfficiencyTest extends QualityTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EfficiencyTest.class);
	}

	/**
	 * Constructs a new Efficiency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EfficiencyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Efficiency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Efficiency getFixture() {
		return (Efficiency)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createEfficiency());
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

} //EfficiencyTest
