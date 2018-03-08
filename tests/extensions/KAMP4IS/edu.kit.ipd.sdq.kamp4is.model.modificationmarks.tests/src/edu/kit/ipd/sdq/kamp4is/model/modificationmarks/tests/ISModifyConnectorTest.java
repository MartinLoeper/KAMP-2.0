/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.tests;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyConnector;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IS Modify Connector</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ISModifyConnectorTest extends ISModifyEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ISModifyConnectorTest.class);
	}

	/**
	 * Constructs a new IS Modify Connector test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISModifyConnectorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this IS Modify Connector test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ISModifyConnector getFixture() {
		return (ISModifyConnector)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ISModificationmarksFactory.eINSTANCE.createISModifyConnector());
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

} //ISModifyConnectorTest
