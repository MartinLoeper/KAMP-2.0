/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.tests;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IS Metadata File Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ISMetadataFileAggregationTest extends ISFileAggregationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ISMetadataFileAggregationTest.class);
	}

	/**
	 * Constructs a new IS Metadata File Aggregation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISMetadataFileAggregationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this IS Metadata File Aggregation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ISMetadataFileAggregation getFixture() {
		return (ISMetadataFileAggregation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISMetadataFileAggregation());
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

} //ISMetadataFileAggregationTest
