/**
 */
package de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.WorkingPeriod;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.ActorResourceImpl#getWorkingPeriods <em>Working Periods</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.ActorResourceImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorResourceImpl extends EntityImpl implements ActorResource {
	/**
	 * The cached value of the '{@link #getWorkingPeriods() <em>Working Periods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingPeriods()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkingPeriod> workingPeriods;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationenvironmentmodelPackage.Literals.ACTOR_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkingPeriod> getWorkingPeriods() {
		if (workingPeriods == null) {
			workingPeriods = new EObjectContainmentEList<WorkingPeriod>(WorkingPeriod.class, this, OrganizationenvironmentmodelPackage.ACTOR_RESOURCE__WORKING_PERIODS);
		}
		return workingPeriods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, OrganizationenvironmentmodelPackage.ACTOR_RESOURCE__ROLES, OrganizationenvironmentmodelPackage.ROLE__ACTORS);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrganizationenvironmentmodelPackage.ACTOR_RESOURCE__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrganizationenvironmentmodelPackage.ACTOR_RESOURCE__WORKING_PERIODS:
				return ((InternalEList<?>)getWorkingPeriods()).basicRemove(otherEnd, msgs);
			case OrganizationenvironmentmodelPackage.ACTOR_RESOURCE__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case OrganizationenvironmentmodelPackage.ACTOR_RESOURCE__WORKING_PERIODS:
				return getWorkingPeriods();
			case OrganizationenvironmentmodelPackage.ACTOR_RESOURCE__ROLES:
				return getRoles();
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
			case OrganizationenvironmentmodelPackage.ACTOR_RESOURCE__WORKING_PERIODS:
				getWorkingPeriods().clear();
				getWorkingPeriods().addAll((Collection<? extends WorkingPeriod>)newValue);
				return;
			case OrganizationenvironmentmodelPackage.ACTOR_RESOURCE__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case OrganizationenvironmentmodelPackage.ACTOR_RESOURCE__WORKING_PERIODS:
				getWorkingPeriods().clear();
				return;
			case OrganizationenvironmentmodelPackage.ACTOR_RESOURCE__ROLES:
				getRoles().clear();
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
			case OrganizationenvironmentmodelPackage.ACTOR_RESOURCE__WORKING_PERIODS:
				return workingPeriods != null && !workingPeriods.isEmpty();
			case OrganizationenvironmentmodelPackage.ACTOR_RESOURCE__ROLES:
				return roles != null && !roles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActorResourceImpl
