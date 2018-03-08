/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.tests;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IS Metadata File</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ISMetadataFileTest extends ISFileTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ISMetadataFileTest.class);
	}

	/**
	 * Constructs a new IS Metadata File test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISMetadataFileTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this IS Metadata File test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ISMetadataFile getFixture() {
		return (ISMetadataFile)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISMetadataFile());
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

} //ISMetadataFileTest
