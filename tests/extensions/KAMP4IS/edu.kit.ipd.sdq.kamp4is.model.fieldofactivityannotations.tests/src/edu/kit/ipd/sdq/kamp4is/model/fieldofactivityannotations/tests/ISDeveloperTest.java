/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.tests;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeveloper;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IS Developer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ISDeveloperTest extends ISRoleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ISDeveloperTest.class);
	}

	/**
	 * Constructs a new IS Developer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISDeveloperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this IS Developer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ISDeveloper getFixture() {
		return (ISDeveloper)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISDeveloper());
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

} //ISDeveloperTest
