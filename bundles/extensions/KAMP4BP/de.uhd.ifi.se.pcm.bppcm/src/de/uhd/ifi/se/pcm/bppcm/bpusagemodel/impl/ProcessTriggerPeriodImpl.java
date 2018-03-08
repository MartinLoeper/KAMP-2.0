/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.core.PCMRandomVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Trigger Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ProcessTriggerPeriodImpl#getInterArrivalTime_ProcessWorkload <em>Inter Arrival Time Process Workload</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ProcessTriggerPeriodImpl#getPeriodStartTimePoint <em>Period Start Time Point</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ProcessTriggerPeriodImpl#getPeriodEndTimePoint <em>Period End Time Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessTriggerPeriodImpl extends IdentifierImpl implements ProcessTriggerPeriod {
	/**
	 * The cached value of the '{@link #getInterArrivalTime_ProcessWorkload() <em>Inter Arrival Time Process Workload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterArrivalTime_ProcessWorkload()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable interArrivalTime_ProcessWorkload;

	/**
	 * The default value of the '{@link #getPeriodStartTimePoint() <em>Period Start Time Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodStartTimePoint()
	 * @generated
	 * @ordered
	 */
	protected static final double PERIOD_START_TIME_POINT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPeriodStartTimePoint() <em>Period Start Time Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodStartTimePoint()
	 * @generated
	 * @ordered
	 */
	protected double periodStartTimePoint = PERIOD_START_TIME_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriodEndTimePoint() <em>Period End Time Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodEndTimePoint()
	 * @generated
	 * @ordered
	 */
	protected static final double PERIOD_END_TIME_POINT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPeriodEndTimePoint() <em>Period End Time Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodEndTimePoint()
	 * @generated
	 * @ordered
	 */
	protected double periodEndTimePoint = PERIOD_END_TIME_POINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessTriggerPeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpusagemodelPackage.Literals.PROCESS_TRIGGER_PERIOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMRandomVariable getInterArrivalTime_ProcessWorkload() {
		return interArrivalTime_ProcessWorkload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterArrivalTime_ProcessWorkload(PCMRandomVariable newInterArrivalTime_ProcessWorkload, NotificationChain msgs) {
		PCMRandomVariable oldInterArrivalTime_ProcessWorkload = interArrivalTime_ProcessWorkload;
		interArrivalTime_ProcessWorkload = newInterArrivalTime_ProcessWorkload;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD, oldInterArrivalTime_ProcessWorkload, newInterArrivalTime_ProcessWorkload);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterArrivalTime_ProcessWorkload(PCMRandomVariable newInterArrivalTime_ProcessWorkload) {
		if (newInterArrivalTime_ProcessWorkload != interArrivalTime_ProcessWorkload) {
			NotificationChain msgs = null;
			if (interArrivalTime_ProcessWorkload != null)
				msgs = ((InternalEObject)interArrivalTime_ProcessWorkload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD, null, msgs);
			if (newInterArrivalTime_ProcessWorkload != null)
				msgs = ((InternalEObject)newInterArrivalTime_ProcessWorkload).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD, null, msgs);
			msgs = basicSetInterArrivalTime_ProcessWorkload(newInterArrivalTime_ProcessWorkload, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD, newInterArrivalTime_ProcessWorkload, newInterArrivalTime_ProcessWorkload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPeriodStartTimePoint() {
		return periodStartTimePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodStartTimePoint(double newPeriodStartTimePoint) {
		double oldPeriodStartTimePoint = periodStartTimePoint;
		periodStartTimePoint = newPeriodStartTimePoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__PERIOD_START_TIME_POINT, oldPeriodStartTimePoint, periodStartTimePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPeriodEndTimePoint() {
		return periodEndTimePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodEndTimePoint(double newPeriodEndTimePoint) {
		double oldPeriodEndTimePoint = periodEndTimePoint;
		periodEndTimePoint = newPeriodEndTimePoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__PERIOD_END_TIME_POINT, oldPeriodEndTimePoint, periodEndTimePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD:
				return basicSetInterArrivalTime_ProcessWorkload(null, msgs);
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
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD:
				return getInterArrivalTime_ProcessWorkload();
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__PERIOD_START_TIME_POINT:
				return getPeriodStartTimePoint();
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__PERIOD_END_TIME_POINT:
				return getPeriodEndTimePoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD:
				setInterArrivalTime_ProcessWorkload((PCMRandomVariable)newValue);
				return;
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__PERIOD_START_TIME_POINT:
				setPeriodStartTimePoint((Double)newValue);
				return;
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__PERIOD_END_TIME_POINT:
				setPeriodEndTimePoint((Double)newValue);
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
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD:
				setInterArrivalTime_ProcessWorkload((PCMRandomVariable)null);
				return;
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__PERIOD_START_TIME_POINT:
				setPeriodStartTimePoint(PERIOD_START_TIME_POINT_EDEFAULT);
				return;
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__PERIOD_END_TIME_POINT:
				setPeriodEndTimePoint(PERIOD_END_TIME_POINT_EDEFAULT);
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
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD:
				return interArrivalTime_ProcessWorkload != null;
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__PERIOD_START_TIME_POINT:
				return periodStartTimePoint != PERIOD_START_TIME_POINT_EDEFAULT;
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__PERIOD_END_TIME_POINT:
				return periodEndTimePoint != PERIOD_END_TIME_POINT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (periodStartTimePoint: ");
		result.append(periodStartTimePoint);
		result.append(", periodEndTimePoint: ");
		result.append(periodEndTimePoint);
		result.append(')');
		return result.toString();
	}

} //ProcessTriggerPeriodImpl
