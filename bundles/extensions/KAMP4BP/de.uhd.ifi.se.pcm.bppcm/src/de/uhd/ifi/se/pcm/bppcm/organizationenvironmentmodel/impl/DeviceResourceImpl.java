/**
 */
package de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.core.PCMRandomVariable;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.DeviceResourceImpl#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceResourceImpl extends EntityImpl implements DeviceResource {
	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable capacity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationenvironmentmodelPackage.Literals.DEVICE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMRandomVariable getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacity(PCMRandomVariable newCapacity, NotificationChain msgs) {
		PCMRandomVariable oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrganizationenvironmentmodelPackage.DEVICE_RESOURCE__CAPACITY, oldCapacity, newCapacity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(PCMRandomVariable newCapacity) {
		if (newCapacity != capacity) {
			NotificationChain msgs = null;
			if (capacity != null)
				msgs = ((InternalEObject)capacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrganizationenvironmentmodelPackage.DEVICE_RESOURCE__CAPACITY, null, msgs);
			if (newCapacity != null)
				msgs = ((InternalEObject)newCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrganizationenvironmentmodelPackage.DEVICE_RESOURCE__CAPACITY, null, msgs);
			msgs = basicSetCapacity(newCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrganizationenvironmentmodelPackage.DEVICE_RESOURCE__CAPACITY, newCapacity, newCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrganizationenvironmentmodelPackage.DEVICE_RESOURCE__CAPACITY:
				return basicSetCapacity(null, msgs);
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
			case OrganizationenvironmentmodelPackage.DEVICE_RESOURCE__CAPACITY:
				return getCapacity();
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
			case OrganizationenvironmentmodelPackage.DEVICE_RESOURCE__CAPACITY:
				setCapacity((PCMRandomVariable)newValue);
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
			case OrganizationenvironmentmodelPackage.DEVICE_RESOURCE__CAPACITY:
				setCapacity((PCMRandomVariable)null);
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
			case OrganizationenvironmentmodelPackage.DEVICE_RESOURCE__CAPACITY:
				return capacity != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceResourceImpl
