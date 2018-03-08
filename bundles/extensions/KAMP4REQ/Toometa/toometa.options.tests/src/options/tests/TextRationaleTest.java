/**
 */
package options.tests;

import junit.textui.TestRunner;

import options.OptionsFactory;
import options.TextRationale;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text Rationale</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextRationaleTest extends RationaleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextRationaleTest.class);
	}

	/**
	 * Constructs a new Text Rationale test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextRationaleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Text Rationale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TextRationale getFixture() {
		return (TextRationale)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionsFactory.eINSTANCE.createTextRationale());
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

} //TextRationaleTest
