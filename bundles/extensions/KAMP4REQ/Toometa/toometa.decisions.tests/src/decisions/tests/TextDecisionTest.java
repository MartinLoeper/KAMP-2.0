/**
 */
package decisions.tests;

import decisions.DecisionsFactory;
import decisions.TextDecision;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text Decision</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextDecisionTest extends DecisionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextDecisionTest.class);
	}

	/**
	 * Constructs a new Text Decision test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDecisionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Text Decision test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TextDecision getFixture() {
		return (TextDecision)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DecisionsFactory.eINSTANCE.createTextDecision());
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

} //TextDecisionTest
