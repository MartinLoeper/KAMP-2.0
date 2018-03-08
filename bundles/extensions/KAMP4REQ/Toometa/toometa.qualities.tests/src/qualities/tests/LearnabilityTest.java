/**
 */
package qualities.tests;

import junit.textui.TestRunner;

import qualities.Learnability;
import qualities.QualitiesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Learnability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LearnabilityTest extends UsabilityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LearnabilityTest.class);
	}

	/**
	 * Constructs a new Learnability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearnabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Learnability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Learnability getFixture() {
		return (Learnability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createLearnability());
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

} //LearnabilityTest
