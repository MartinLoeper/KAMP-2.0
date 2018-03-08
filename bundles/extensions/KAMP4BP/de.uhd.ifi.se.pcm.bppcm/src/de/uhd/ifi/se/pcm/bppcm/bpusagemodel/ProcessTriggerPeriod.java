/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Trigger Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod#getInterArrivalTime_ProcessWorkload <em>Inter Arrival Time Process Workload</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod#getPeriodStartTimePoint <em>Period Start Time Point</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod#getPeriodEndTimePoint <em>Period End Time Point</em>}</li>
 * </ul>
 *
 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getProcessTriggerPeriod()
 * @model
 * @generated
 */
public interface ProcessTriggerPeriod extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Inter Arrival Time Process Workload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inter Arrival Time Process Workload</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Arrival Time Process Workload</em>' containment reference.
	 * @see #setInterArrivalTime_ProcessWorkload(PCMRandomVariable)
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getProcessTriggerPeriod_InterArrivalTime_ProcessWorkload()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PCMRandomVariable getInterArrivalTime_ProcessWorkload();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod#getInterArrivalTime_ProcessWorkload <em>Inter Arrival Time Process Workload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inter Arrival Time Process Workload</em>' containment reference.
	 * @see #getInterArrivalTime_ProcessWorkload()
	 * @generated
	 */
	void setInterArrivalTime_ProcessWorkload(PCMRandomVariable value);

	/**
	 * Returns the value of the '<em><b>Period Start Time Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Start Time Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Start Time Point</em>' attribute.
	 * @see #setPeriodStartTimePoint(double)
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getProcessTriggerPeriod_PeriodStartTimePoint()
	 * @model
	 * @generated
	 */
	double getPeriodStartTimePoint();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod#getPeriodStartTimePoint <em>Period Start Time Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Start Time Point</em>' attribute.
	 * @see #getPeriodStartTimePoint()
	 * @generated
	 */
	void setPeriodStartTimePoint(double value);

	/**
	 * Returns the value of the '<em><b>Period End Time Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period End Time Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period End Time Point</em>' attribute.
	 * @see #setPeriodEndTimePoint(double)
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#getProcessTriggerPeriod_PeriodEndTimePoint()
	 * @model
	 * @generated
	 */
	double getPeriodEndTimePoint();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod#getPeriodEndTimePoint <em>Period End Time Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period End Time Point</em>' attribute.
	 * @see #getPeriodEndTimePoint()
	 * @generated
	 */
	void setPeriodEndTimePoint(double value);

} // ProcessTriggerPeriod
