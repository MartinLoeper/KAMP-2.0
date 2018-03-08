/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.tests;

import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BP Message</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMessageTest extends BPUserActionAnnotationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BPMessageTest.class);
	}

	/**
	 * Constructs a new BP Message test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMessageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BP Message test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BPMessage getFixture() {
		return (BPMessage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BPFieldOfActivityAnnotationsFactory.eINSTANCE.createBPMessage());
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

} //BPMessageTest
