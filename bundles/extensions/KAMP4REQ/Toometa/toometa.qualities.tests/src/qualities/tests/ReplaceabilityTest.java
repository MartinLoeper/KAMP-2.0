/**
 */
package qualities.tests;

import junit.textui.TestRunner;

import qualities.QualitiesFactory;
import qualities.Replaceability;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Replaceability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReplaceabilityTest extends PortabilityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReplaceabilityTest.class);
	}

	/**
	 * Constructs a new Replaceability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Replaceability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Replaceability getFixture() {
		return (Replaceability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createReplaceability());
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

} //ReplaceabilityTest
