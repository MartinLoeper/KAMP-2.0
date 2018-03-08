/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.usagemodel.impl.AbstractUserActionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acquire Device Resource Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.AcquireDeviceResourceActionImpl#getPassiveresource_AcquireAction <em>Passiveresource Acquire Action</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.AcquireDeviceResourceActionImpl#isTimeout <em>Timeout</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.AcquireDeviceResourceActionImpl#getTimeoutValue <em>Timeout Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcquireDeviceResourceActionImpl extends AbstractUserActionImpl implements AcquireDeviceResourceAction {
	/**
	 * The cached value of the '{@link #getPassiveresource_AcquireAction() <em>Passiveresource Acquire Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveresource_AcquireAction()
	 * @generated
	 * @ordered
	 */
	protected DeviceResource passiveresource_AcquireAction;

	/**
	 * The default value of the '{@link #isTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TIMEOUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTimeout()
	 * @generated
	 * @ordered
	 */
	protected boolean timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeoutValue() <em>Timeout Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutValue()
	 * @generated
	 * @ordered
	 */
	protected static final double TIMEOUT_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimeoutValue() <em>Timeout Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutValue()
	 * @generated
	 * @ordered
	 */
	protected double timeoutValue = TIMEOUT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcquireDeviceResourceActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpusagemodelPackage.Literals.ACQUIRE_DEVICE_RESOURCE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceResource getPassiveresource_AcquireAction() {
		if (passiveresource_AcquireAction != null && passiveresource_AcquireAction.eIsProxy()) {
			InternalEObject oldPassiveresource_AcquireAction = (InternalEObject)passiveresource_AcquireAction;
			passiveresource_AcquireAction = (DeviceResource)eResolveProxy(oldPassiveresource_AcquireAction);
			if (passiveresource_AcquireAction != oldPassiveresource_AcquireAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION, oldPassiveresource_AcquireAction, passiveresource_AcquireAction));
			}
		}
		return passiveresource_AcquireAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceResource basicGetPassiveresource_AcquireAction() {
		return passiveresource_AcquireAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassiveresource_AcquireAction(DeviceResource newPassiveresource_AcquireAction) {
		DeviceResource oldPassiveresource_AcquireAction = passiveresource_AcquireAction;
		passiveresource_AcquireAction = newPassiveresource_AcquireAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION, oldPassiveresource_AcquireAction, passiveresource_AcquireAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(boolean newTimeout) {
		boolean oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeoutValue() {
		return timeoutValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeoutValue(double newTimeoutValue) {
		double oldTimeoutValue = timeoutValue;
		timeoutValue = newTimeoutValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT_VALUE, oldTimeoutValue, timeoutValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION:
				if (resolve) return getPassiveresource_AcquireAction();
				return basicGetPassiveresource_AcquireAction();
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT:
				return isTimeout();
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT_VALUE:
				return getTimeoutValue();
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
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION:
				setPassiveresource_AcquireAction((DeviceResource)newValue);
				return;
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT:
				setTimeout((Boolean)newValue);
				return;
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT_VALUE:
				setTimeoutValue((Double)newValue);
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
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION:
				setPassiveresource_AcquireAction((DeviceResource)null);
				return;
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT_VALUE:
				setTimeoutValue(TIMEOUT_VALUE_EDEFAULT);
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
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION:
				return passiveresource_AcquireAction != null;
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT:
				return timeout != TIMEOUT_EDEFAULT;
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT_VALUE:
				return timeoutValue != TIMEOUT_VALUE_EDEFAULT;
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
		result.append(" (timeout: ");
		result.append(timeout);
		result.append(", timeoutValue: ");
		result.append(timeoutValue);
		result.append(')');
		return result.toString();
	}

} //AcquireDeviceResourceActionImpl
