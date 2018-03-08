/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.tests;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationRepository;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IS Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ISModificationRepositoryTest extends AbstractISModificationRepositoryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ISModificationRepositoryTest.class);
	}

	/**
	 * Constructs a new IS Modification Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISModificationRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this IS Modification Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ISModificationRepository getFixture() {
		return (ISModificationRepository)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ISModificationmarksFactory.eINSTANCE.createISModificationRepository());
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

} //ISModificationRepositoryTest
