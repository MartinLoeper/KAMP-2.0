/**
 */
package de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.RoleImpl#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends EntityImpl implements Role {
	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorResource> actors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganizationenvironmentmodelPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorResource> getActors() {
		if (actors == null) {
			actors = new EObjectWithInverseResolvingEList.ManyInverse<ActorResource>(ActorResource.class, this, OrganizationenvironmentmodelPackage.ROLE__ACTORS, OrganizationenvironmentmodelPackage.ACTOR_RESOURCE__ROLES);
		}
		return actors;
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
			case OrganizationenvironmentmodelPackage.ROLE__ACTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActors()).basicAdd(otherEnd, msgs);
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
			case OrganizationenvironmentmodelPackage.ROLE__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
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
			case OrganizationenvironmentmodelPackage.ROLE__ACTORS:
				return getActors();
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
			case OrganizationenvironmentmodelPackage.ROLE__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends ActorResource>)newValue);
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
			case OrganizationenvironmentmodelPackage.ROLE__ACTORS:
				getActors().clear();
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
			case OrganizationenvironmentmodelPackage.ROLE__ACTORS:
				return actors != null && !actors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
