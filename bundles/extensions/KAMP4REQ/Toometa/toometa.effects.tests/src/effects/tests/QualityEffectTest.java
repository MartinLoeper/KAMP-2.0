/**
 */
package effects.tests;

import effects.EffectsFactory;
import effects.QualityEffect;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quality Effect</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityEffectTest extends EffectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QualityEffectTest.class);
	}

	/**
	 * Constructs a new Quality Effect test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityEffectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Quality Effect test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QualityEffect getFixture() {
		return (QualityEffect)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EffectsFactory.eINSTANCE.createQualityEffect());
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

} //QualityEffectTest
