/**
 */
package qualities.tests;

import junit.textui.TestRunner;

import qualities.QualitiesFactory;
import qualities.TextQuality;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text Quality</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextQualityTest extends QualityTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextQualityTest.class);
	}

	/**
	 * Constructs a new Text Quality test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextQualityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Text Quality test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TextQuality getFixture() {
		return (TextQuality)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QualitiesFactory.eINSTANCE.createTextQuality());
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

} //TextQualityTest
