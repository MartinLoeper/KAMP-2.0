/**
 */
package options.tests;

import junit.textui.TestRunner;

import options.OptionsFactory;
import options.TextOption;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextOptionTest extends OptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextOptionTest.class);
	}

	/**
	 * Constructs a new Text Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Text Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TextOption getFixture() {
		return (TextOption)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionsFactory.eINSTANCE.createTextOption());
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

} //TextOptionTest
