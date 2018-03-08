/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>bpusagemodel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpusagemodelTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new BpusagemodelTests("bpusagemodel Tests");
		suite.addTestSuite(ProcessWorkloadTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpusagemodelTests(String name) {
		super(name);
	}

} //BpusagemodelTests
