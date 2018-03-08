/**
 */
package de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.WorkingPeriod;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Working Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.WorkingPeriodImpl#getPeriodStartTimePoint <em>Period Start Time Point</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.WorkingPeriodImpl#getPeriodEndTimePoint <em>Period End Time Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkingPeriodImpl extends IdentifierImpl implements WorkingPeriod {
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
	protected WorkingPeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationenvironmentmodelPackage.Literals.WORKING_PERIOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationenvironmentmodelPackage.WORKING_PERIOD__PERIOD_START_TIME_POINT, oldPeriodStartTimePoint, periodStartTimePoint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationenvironmentmodelPackage.WORKING_PERIOD__PERIOD_END_TIME_POINT, oldPeriodEndTimePoint, periodEndTimePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrganizationenvironmentmodelPackage.WORKING_PERIOD__PERIOD_START_TIME_POINT:
				return getPeriodStartTimePoint();
			case OrganizationenvironmentmodelPackage.WORKING_PERIOD__PERIOD_END_TIME_POINT:
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
			case OrganizationenvironmentmodelPackage.WORKING_PERIOD__PERIOD_START_TIME_POINT:
				setPeriodStartTimePoint((Double)newValue);
				return;
			case OrganizationenvironmentmodelPackage.WORKING_PERIOD__PERIOD_END_TIME_POINT:
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
			case OrganizationenvironmentmodelPackage.WORKING_PERIOD__PERIOD_START_TIME_POINT:
				setPeriodStartTimePoint(PERIOD_START_TIME_POINT_EDEFAULT);
				return;
			case OrganizationenvironmentmodelPackage.WORKING_PERIOD__PERIOD_END_TIME_POINT:
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
			case OrganizationenvironmentmodelPackage.WORKING_PERIOD__PERIOD_START_TIME_POINT:
				return periodStartTimePoint != PERIOD_START_TIME_POINT_EDEFAULT;
			case OrganizationenvironmentmodelPackage.WORKING_PERIOD__PERIOD_END_TIME_POINT:
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

} //WorkingPeriodImpl
