/**
 */
package pcmbpoptions.tests;

import junit.textui.TestRunner;

import pcmbpoptions.PCM_ChangeEntity;
import pcmbpoptions.PcmbpoptionsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCM Change Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCM_ChangeEntityTest extends PCM_EntityOptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCM_ChangeEntityTest.class);
	}

	/**
	 * Constructs a new PCM Change Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_ChangeEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCM Change Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCM_ChangeEntity getFixture() {
		return (PCM_ChangeEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcmbpoptionsFactory.eINSTANCE.createPCM_ChangeEntity());
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

} //PCM_ChangeEntityTest
