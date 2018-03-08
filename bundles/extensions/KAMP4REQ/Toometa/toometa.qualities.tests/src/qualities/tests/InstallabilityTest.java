/**
 */
package qualities.tests;

import junit.textui.TestRunner;

import qualities.Installability;
import qualities.QualitiesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Installability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstallabilityTest extends PortabilityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InstallabilityTest.class);
	}

	/**
	 * Constructs a new Installability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstallabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Installability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Installability getFixture() {
		return (Installability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createInstallability());
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

} //InstallabilityTest
