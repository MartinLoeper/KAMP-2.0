/**
 */
package effects.tests;

import effects.EffectCategory;
import effects.EffectsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Effect Category</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EffectCategoryTest extends TestCase {

	/**
	 * The fixture for this Effect Category test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectCategory fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EffectCategoryTest.class);
	}

	/**
	 * Constructs a new Effect Category test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectCategoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Effect Category test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EffectCategory fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Effect Category test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectCategory getFixture() {
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
		setFixture(EffectsFactory.eINSTANCE.createEffectCategory());
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

} //EffectCategoryTest
