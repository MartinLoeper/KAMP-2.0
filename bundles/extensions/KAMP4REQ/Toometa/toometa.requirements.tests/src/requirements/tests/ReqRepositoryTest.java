/**
 */
package requirements.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import requirements.ReqRepository;
import requirements.RequirementsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Req Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqRepositoryTest extends TestCase {

	/**
	 * The fixture for this Req Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReqRepositoryTest.class);
	}

	/**
	 * Constructs a new Req Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Req Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReqRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Req Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqRepository getFixture() {
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
		setFixture(RequirementsFactory.eINSTANCE.createReqRepository());
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

} //ReqRepositoryTest
