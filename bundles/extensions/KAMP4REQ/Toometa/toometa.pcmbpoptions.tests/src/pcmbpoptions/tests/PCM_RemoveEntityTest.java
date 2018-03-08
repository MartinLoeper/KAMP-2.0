/**
 */
package pcmbpoptions.tests;

import junit.textui.TestRunner;

import pcmbpoptions.PCM_RemoveEntity;
import pcmbpoptions.PcmbpoptionsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCM Remove Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCM_RemoveEntityTest extends PCM_EntityOptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCM_RemoveEntityTest.class);
	}

	/**
	 * Constructs a new PCM Remove Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_RemoveEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCM Remove Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCM_RemoveEntity getFixture() {
		return (PCM_RemoveEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcmbpoptionsFactory.eINSTANCE.createPCM_RemoveEntity());
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

} //PCM_RemoveEntityTest
