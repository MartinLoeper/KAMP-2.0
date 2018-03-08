/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ReleaseDeviceResourceAction;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.usagemodel.impl.AbstractUserActionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release Device Resource Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ReleaseDeviceResourceActionImpl#getPassiveresource_ReleaseAction <em>Passiveresource Release Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseDeviceResourceActionImpl extends AbstractUserActionImpl implements ReleaseDeviceResourceAction {
	/**
	 * The cached value of the '{@link #getPassiveresource_ReleaseAction() <em>Passiveresource Release Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveresource_ReleaseAction()
	 * @generated
	 * @ordered
	 */
	protected DeviceResource passiveresource_ReleaseAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseDeviceResourceActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpusagemodelPackage.Literals.RELEASE_DEVICE_RESOURCE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceResource getPassiveresource_ReleaseAction() {
		if (passiveresource_ReleaseAction != null && passiveresource_ReleaseAction.eIsProxy()) {
			InternalEObject oldPassiveresource_ReleaseAction = (InternalEObject)passiveresource_ReleaseAction;
			passiveresource_ReleaseAction = (DeviceResource)eResolveProxy(oldPassiveresource_ReleaseAction);
			if (passiveresource_ReleaseAction != oldPassiveresource_ReleaseAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpusagemodelPackage.RELEASE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_RELEASE_ACTION, oldPassiveresource_ReleaseAction, passiveresource_ReleaseAction));
			}
		}
		return passiveresource_ReleaseAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceResource basicGetPassiveresource_ReleaseAction() {
		return passiveresource_ReleaseAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassiveresource_ReleaseAction(DeviceResource newPassiveresource_ReleaseAction) {
		DeviceResource oldPassiveresource_ReleaseAction = passiveresource_ReleaseAction;
		passiveresource_ReleaseAction = newPassiveresource_ReleaseAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpusagemodelPackage.RELEASE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_RELEASE_ACTION, oldPassiveresource_ReleaseAction, passiveresource_ReleaseAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpusagemodelPackage.RELEASE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_RELEASE_ACTION:
				if (resolve) return getPassiveresource_ReleaseAction();
				return basicGetPassiveresource_ReleaseAction();
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
			case BpusagemodelPackage.RELEASE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_RELEASE_ACTION:
				setPassiveresource_ReleaseAction((DeviceResource)newValue);
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
			case BpusagemodelPackage.RELEASE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_RELEASE_ACTION:
				setPassiveresource_ReleaseAction((DeviceResource)null);
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
			case BpusagemodelPackage.RELEASE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_RELEASE_ACTION:
				return passiveresource_ReleaseAction != null;
		}
		return super.eIsSet(featureID);
	}

} //ReleaseDeviceResourceActionImpl
