/**
 */
package effects.tests;

import effects.CategoryEffect;
import effects.EffectsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Category Effect</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CategoryEffectTest extends EffectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CategoryEffectTest.class);
	}

	/**
	 * Constructs a new Category Effect test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryEffectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Category Effect test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CategoryEffect getFixture() {
		return (CategoryEffect)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EffectsFactory.eINSTANCE.createCategoryEffect());
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

} //CategoryEffectTest
