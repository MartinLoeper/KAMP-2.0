/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.tests;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelFactory;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessWorkload;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Workload</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessWorkloadTest extends TestCase {

	/**
	 * The fixture for this Process Workload test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessWorkload fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessWorkloadTest.class);
	}

	/**
	 * Constructs a new Process Workload test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessWorkloadTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Process Workload test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProcessWorkload fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Process Workload test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessWorkload getFixture() {
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
		setFixture(BpusagemodelFactory.eINSTANCE.createProcessWorkload());
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

} //ProcessWorkloadTest
