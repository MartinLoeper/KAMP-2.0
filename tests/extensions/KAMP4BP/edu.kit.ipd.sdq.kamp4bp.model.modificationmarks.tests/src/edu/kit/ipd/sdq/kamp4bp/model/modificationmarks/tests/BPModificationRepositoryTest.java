/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.tests;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationRepository;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BP Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPModificationRepositoryTest extends TestCase {

	/**
	 * The fixture for this BP Modification Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPModificationRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BPModificationRepositoryTest.class);
	}

	/**
	 * Constructs a new BP Modification Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModificationRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this BP Modification Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BPModificationRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this BP Modification Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPModificationRepository getFixture() {
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
		setFixture(BPModificationmarksFactory.eINSTANCE.createBPModificationRepository());
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

} //BPModificationRepositoryTest
