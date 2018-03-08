/**
 */
package qualities.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import qualities.QualitiesFactory;
import qualities.QualityTypeRepository;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quality Type Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityTypeRepositoryTest extends TestCase {

	/**
	 * The fixture for this Quality Type Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityTypeRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QualityTypeRepositoryTest.class);
	}

	/**
	 * Constructs a new Quality Type Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityTypeRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Quality Type Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QualityTypeRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Quality Type Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityTypeRepository getFixture() {
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
		setFixture(QualitiesFactory.eINSTANCE.createQualityTypeRepository());
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

} //QualityTypeRepositoryTest
