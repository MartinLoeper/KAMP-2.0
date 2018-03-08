/**
 */
package options.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import options.OptionRepository;
import options.OptionsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Option Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionRepositoryTest extends TestCase {

	/**
	 * The fixture for this Option Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OptionRepositoryTest.class);
	}

	/**
	 * Constructs a new Option Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Option Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OptionRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Option Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionRepository getFixture() {
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
		setFixture(OptionsFactory.eINSTANCE.createOptionRepository());
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

} //OptionRepositoryTest
