/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.tests;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyActorStep;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BP Modify Actor Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPModifyActorStepTest extends BPModifyAbstractUserActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BPModifyActorStepTest.class);
	}

	/**
	 * Constructs a new BP Modify Actor Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModifyActorStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BP Modify Actor Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BPModifyActorStep getFixture() {
		return (BPModifyActorStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPModificationmarksFactory.eINSTANCE.createBPModifyActorStep());
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

} //BPModifyActorStepTest
