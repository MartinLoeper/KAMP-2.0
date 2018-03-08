/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.tests;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeployer;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IS Deployer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ISDeployerTest extends ISRoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ISDeployerTest.class);
	}

	/**
	 * Constructs a new IS Deployer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISDeployerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this IS Deployer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ISDeployer getFixture() {
		return (ISDeployer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISDeployer());
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

} //ISDeployerTest
