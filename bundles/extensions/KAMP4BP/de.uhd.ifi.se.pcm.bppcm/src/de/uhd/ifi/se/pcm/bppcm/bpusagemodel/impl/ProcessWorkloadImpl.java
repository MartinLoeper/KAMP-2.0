/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessWorkload;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.usagemodel.impl.OpenWorkloadImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Workload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ProcessWorkloadImpl#getProcessTriggerPeriods <em>Process Trigger Periods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessWorkloadImpl extends OpenWorkloadImpl implements ProcessWorkload {
	/**
	 * The cached value of the '{@link #getProcessTriggerPeriods() <em>Process Trigger Periods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessTriggerPeriods()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessTriggerPeriod> processTriggerPeriods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessWorkloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpusagemodelPackage.Literals.PROCESS_WORKLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessTriggerPeriod> getProcessTriggerPeriods() {
		if (processTriggerPeriods == null) {
			processTriggerPeriods = new EObjectContainmentEList<ProcessTriggerPeriod>(ProcessTriggerPeriod.class, this, BpusagemodelPackage.PROCESS_WORKLOAD__PROCESS_TRIGGER_PERIODS);
		}
		return processTriggerPeriods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpusagemodelPackage.PROCESS_WORKLOAD__PROCESS_TRIGGER_PERIODS:
				return ((InternalEList<?>)getProcessTriggerPeriods()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpusagemodelPackage.PROCESS_WORKLOAD__PROCESS_TRIGGER_PERIODS:
				return getProcessTriggerPeriods();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpusagemodelPackage.PROCESS_WORKLOAD__PROCESS_TRIGGER_PERIODS:
				getProcessTriggerPeriods().clear();
				getProcessTriggerPeriods().addAll((Collection<? extends ProcessTriggerPeriod>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BpusagemodelPackage.PROCESS_WORKLOAD__PROCESS_TRIGGER_PERIODS:
				getProcessTriggerPeriods().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BpusagemodelPackage.PROCESS_WORKLOAD__PROCESS_TRIGGER_PERIODS:
				return processTriggerPeriods != null && !processTriggerPeriods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessWorkloadImpl
