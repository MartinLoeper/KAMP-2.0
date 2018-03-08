/**
 */
package de.uka.ipd.sdq.componentInternalDependencies.impl;

import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage;
import de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency;
import de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role To Role Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.componentInternalDependencies.impl.RoleToRoleDependencyImpl#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.componentInternalDependencies.impl.RoleToRoleDependencyImpl#getRequiredRole <em>Required Role</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.componentInternalDependencies.impl.RoleToRoleDependencyImpl#getOperationToOperationDependency <em>Operation To Operation Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleToRoleDependencyImpl extends IdentifierImpl implements RoleToRoleDependency {
	/**
	 * The cached value of the '{@link #getProvidedRole() <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole providedRole;

	/**
	 * The cached value of the '{@link #getRequiredRole() <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRole()
	 * @generated
	 * @ordered
	 */
	protected RequiredRole requiredRole;

	/**
	 * The cached value of the '{@link #getOperationToOperationDependency() <em>Operation To Operation Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationToOperationDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationToOperationDependency> operationToOperationDependency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleToRoleDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInternalDependenciesPackage.Literals.ROLE_TO_ROLE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole getProvidedRole() {
		if (providedRole != null && ((EObject)providedRole).eIsProxy()) {
			InternalEObject oldProvidedRole = (InternalEObject)providedRole;
			providedRole = (ProvidedRole)eResolveProxy(oldProvidedRole);
			if (providedRole != oldProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__PROVIDED_ROLE, oldProvidedRole, providedRole));
			}
		}
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetProvidedRole() {
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedRole(ProvidedRole newProvidedRole) {
		ProvidedRole oldProvidedRole = providedRole;
		providedRole = newProvidedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__PROVIDED_ROLE, oldProvidedRole, providedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole getRequiredRole() {
		if (requiredRole != null && ((EObject)requiredRole).eIsProxy()) {
			InternalEObject oldRequiredRole = (InternalEObject)requiredRole;
			requiredRole = (RequiredRole)eResolveProxy(oldRequiredRole);
			if (requiredRole != oldRequiredRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__REQUIRED_ROLE, oldRequiredRole, requiredRole));
			}
		}
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole basicGetRequiredRole() {
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredRole(RequiredRole newRequiredRole) {
		RequiredRole oldRequiredRole = requiredRole;
		requiredRole = newRequiredRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__REQUIRED_ROLE, oldRequiredRole, requiredRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationToOperationDependency> getOperationToOperationDependency() {
		if (operationToOperationDependency == null) {
			operationToOperationDependency = new EObjectContainmentWithInverseEList<OperationToOperationDependency>(OperationToOperationDependency.class, this, ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__OPERATION_TO_OPERATION_DEPENDENCY, ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PARENT_ROLE_TO_ROLE_DEPENDENCY);
		}
		return operationToOperationDependency;
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
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__OPERATION_TO_OPERATION_DEPENDENCY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationToOperationDependency()).basicAdd(otherEnd, msgs);
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
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__OPERATION_TO_OPERATION_DEPENDENCY:
				return ((InternalEList<?>)getOperationToOperationDependency()).basicRemove(otherEnd, msgs);
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
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__PROVIDED_ROLE:
				if (resolve) return getProvidedRole();
				return basicGetProvidedRole();
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__REQUIRED_ROLE:
				if (resolve) return getRequiredRole();
				return basicGetRequiredRole();
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__OPERATION_TO_OPERATION_DEPENDENCY:
				return getOperationToOperationDependency();
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
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__PROVIDED_ROLE:
				setProvidedRole((ProvidedRole)newValue);
				return;
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__REQUIRED_ROLE:
				setRequiredRole((RequiredRole)newValue);
				return;
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__OPERATION_TO_OPERATION_DEPENDENCY:
				getOperationToOperationDependency().clear();
				getOperationToOperationDependency().addAll((Collection<? extends OperationToOperationDependency>)newValue);
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
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__PROVIDED_ROLE:
				setProvidedRole((ProvidedRole)null);
				return;
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__REQUIRED_ROLE:
				setRequiredRole((RequiredRole)null);
				return;
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__OPERATION_TO_OPERATION_DEPENDENCY:
				getOperationToOperationDependency().clear();
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
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__PROVIDED_ROLE:
				return providedRole != null;
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__REQUIRED_ROLE:
				return requiredRole != null;
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__OPERATION_TO_OPERATION_DEPENDENCY:
				return operationToOperationDependency != null && !operationToOperationDependency.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleToRoleDependencyImpl
