/**
 */
package de.uhd.ifi.se.pcm.bppcm.datamodel.tests;

import de.uhd.ifi.se.pcm.bppcm.datamodel.CompositeDataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite Data Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeDataObjectTest extends DataObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositeDataObjectTest.class);
	}

	/**
	 * Constructs a new Composite Data Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDataObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composite Data Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositeDataObject getFixture() {
		return (CompositeDataObject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DatamodelFactory.eINSTANCE.createCompositeDataObject());
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

} //CompositeDataObjectTest
