/**
 */
package effects.tests;

import effects.EffectsFactory;
import effects.SimpleEffect;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Effect</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleEffectTest extends EffectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleEffectTest.class);
	}

	/**
	 * Constructs a new Simple Effect test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleEffectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Effect test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleEffect getFixture() {
		return (SimpleEffect)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EffectsFactory.eINSTANCE.createSimpleEffect());
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

} //SimpleEffectTest
