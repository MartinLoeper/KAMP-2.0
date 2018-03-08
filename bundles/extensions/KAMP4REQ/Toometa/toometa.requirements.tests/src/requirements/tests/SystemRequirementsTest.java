/**
 */
package requirements.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import requirements.RequirementsFactory;
import requirements.SystemRequirements;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>System Requirements</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemRequirementsTest extends TestCase {

	/**
	 * The fixture for this System Requirements test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemRequirements fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SystemRequirementsTest.class);
	}

	/**
	 * Constructs a new System Requirements test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRequirementsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this System Requirements test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SystemRequirements fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this System Requirements test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemRequirements getFixture() {
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
		setFixture(RequirementsFactory.eINSTANCE.createSystemRequirements());
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

} //SystemRequirementsTest
