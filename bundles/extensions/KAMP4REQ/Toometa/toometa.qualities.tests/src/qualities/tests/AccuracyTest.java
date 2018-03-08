/**
 */
package qualities.tests;

import junit.textui.TestRunner;

import qualities.Accuracy;
import qualities.QualitiesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Accuracy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccuracyTest extends FunctionalityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AccuracyTest.class);
	}

	/**
	 * Constructs a new Accuracy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccuracyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Accuracy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Accuracy getFixture() {
		return (Accuracy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createAccuracy());
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

} //AccuracyTest
