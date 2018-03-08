/**
 */
package qualities.tests;

import junit.textui.TestRunner;

import qualities.QualitiesFactory;
import qualities.Recoverability;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Recoverability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecoverabilityTest extends ReliabilityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RecoverabilityTest.class);
	}

	/**
	 * Constructs a new Recoverability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecoverabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Recoverability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Recoverability getFixture() {
		return (Recoverability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createRecoverability());
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

} //RecoverabilityTest
