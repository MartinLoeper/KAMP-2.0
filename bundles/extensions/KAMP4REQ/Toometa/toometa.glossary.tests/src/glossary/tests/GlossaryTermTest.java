/**
 */
package glossary.tests;

import glossary.GlossaryFactory;
import glossary.GlossaryTerm;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlossaryTermTest extends TestCase {

	/**
	 * The fixture for this Term test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlossaryTerm fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GlossaryTermTest.class);
	}

	/**
	 * Constructs a new Term test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossaryTermTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Term test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GlossaryTerm fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Term test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlossaryTerm getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GlossaryFactory.eINSTANCE.createGlossaryTerm());
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

} //GlossaryTermTest
