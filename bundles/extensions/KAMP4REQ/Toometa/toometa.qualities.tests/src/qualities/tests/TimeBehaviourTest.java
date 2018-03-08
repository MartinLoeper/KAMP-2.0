/**
 */
package qualities.tests;

import junit.textui.TestRunner;

import qualities.QualitiesFactory;
import qualities.TimeBehaviour;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeBehaviourTest extends EfficiencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeBehaviourTest.class);
	}

	/**
	 * Constructs a new Time Behaviour test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBehaviourTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Behaviour test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimeBehaviour getFixture() {
		return (TimeBehaviour)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createTimeBehaviour());
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

} //TimeBehaviourTest
