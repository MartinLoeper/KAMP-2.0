/**
 */
package de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.core.entity.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Environment Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationEnvironmentModelImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationEnvironmentModelImpl#getActorResources <em>Actor Resources</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationEnvironmentModelImpl#getDeviceResources <em>Device Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationEnvironmentModelImpl extends NamedElementImpl implements OrganizationEnvironmentModel {
	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getActorResources() <em>Actor Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorResource> actorResources;

	/**
	 * The cached value of the '{@link #getDeviceResources() <em>Device Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceResources()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceResource> deviceResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationEnvironmentModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationenvironmentmodelPackage.Literals.ORGANIZATION_ENVIRONMENT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorResource> getActorResources() {
		if (actorResources == null) {
			actorResources = new EObjectContainmentEList<ActorResource>(ActorResource.class, this, OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__ACTOR_RESOURCES);
		}
		return actorResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceResource> getDeviceResources() {
		if (deviceResources == null) {
			deviceResources = new EObjectContainmentEList<DeviceResource>(DeviceResource.class, this, OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__DEVICE_RESOURCES);
		}
		return deviceResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__ACTOR_RESOURCES:
				return ((InternalEList<?>)getActorResources()).basicRemove(otherEnd, msgs);
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__DEVICE_RESOURCES:
				return ((InternalEList<?>)getDeviceResources()).basicRemove(otherEnd, msgs);
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
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__ROLES:
				return getRoles();
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__ACTOR_RESOURCES:
				return getActorResources();
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__DEVICE_RESOURCES:
				return getDeviceResources();
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
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__ACTOR_RESOURCES:
				getActorResources().clear();
				getActorResources().addAll((Collection<? extends ActorResource>)newValue);
				return;
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__DEVICE_RESOURCES:
				getDeviceResources().clear();
				getDeviceResources().addAll((Collection<? extends DeviceResource>)newValue);
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
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__ROLES:
				getRoles().clear();
				return;
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__ACTOR_RESOURCES:
				getActorResources().clear();
				return;
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__DEVICE_RESOURCES:
				getDeviceResources().clear();
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
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__ROLES:
				return roles != null && !roles.isEmpty();
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__ACTOR_RESOURCES:
				return actorResources != null && !actorResources.isEmpty();
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__DEVICE_RESOURCES:
				return deviceResources != null && !deviceResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationEnvironmentModelImpl
