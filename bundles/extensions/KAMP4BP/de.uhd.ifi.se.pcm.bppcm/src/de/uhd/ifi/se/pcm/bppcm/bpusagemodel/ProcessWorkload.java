/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.usagemodel.OpenWorkload;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Workload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessWorkload#getProcessTriggerPeriods <em>Process Trigger Periods</em>}</li>
 * </ul>
 *
 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getProcessWorkload()
 * @model
 * @generated
 */
public interface ProcessWorkload extends EObject, OpenWorkload {
	/**
	 * Returns the value of the '<em><b>Process Trigger Periods</b></em>' containment reference list.
	 * The list contents are of type {@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Trigger Periods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Trigger Periods</em>' containment reference list.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getProcessWorkload_ProcessTriggerPeriods()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ProcessTriggerPeriod> getProcessTriggerPeriods();

} // ProcessWorkload
