/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.tests;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRole;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IS Modify Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ISModifyRoleTest extends ISModifyEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ISModifyRoleTest.class);
	}

	/**
	 * Constructs a new IS Modify Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISModifyRoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this IS Modify Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ISModifyRole<?> getFixture() {
		return (ISModifyRole<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ISModificationmarksFactory.eINSTANCE.createISModifyRole());
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

} //ISModifyRoleTest
