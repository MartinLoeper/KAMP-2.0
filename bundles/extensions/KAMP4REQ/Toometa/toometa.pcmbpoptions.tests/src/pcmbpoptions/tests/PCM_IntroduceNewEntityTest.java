/**
 */
package pcmbpoptions.tests;

import junit.textui.TestRunner;

import pcmbpoptions.PCM_IntroduceNewEntity;
import pcmbpoptions.PcmbpoptionsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCM Introduce New Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCM_IntroduceNewEntityTest extends PCM_EntityOptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCM_IntroduceNewEntityTest.class);
	}

	/**
	 * Constructs a new PCM Introduce New Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_IntroduceNewEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCM Introduce New Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCM_IntroduceNewEntity getFixture() {
		return (PCM_IntroduceNewEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcmbpoptionsFactory.eINSTANCE.createPCM_IntroduceNewEntity());
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

} //PCM_IntroduceNewEntityTest
