/**
 */
package pcmarchoptions.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pcmarchoptions.PCM_OnlySingleAllocation;
import pcmarchoptions.PcmarchoptionsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCM Only Single Allocation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCM_OnlySingleAllocationTest extends TestCase {

	/**
	 * The fixture for this PCM Only Single Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_OnlySingleAllocation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCM_OnlySingleAllocationTest.class);
	}

	/**
	 * Constructs a new PCM Only Single Allocation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_OnlySingleAllocationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this PCM Only Single Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PCM_OnlySingleAllocation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this PCM Only Single Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_OnlySingleAllocation getFixture() {
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
		setFixture(PcmarchoptionsFactory.eINSTANCE.createPCM_OnlySingleAllocation());
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

} //PCM_OnlySingleAllocationTest
