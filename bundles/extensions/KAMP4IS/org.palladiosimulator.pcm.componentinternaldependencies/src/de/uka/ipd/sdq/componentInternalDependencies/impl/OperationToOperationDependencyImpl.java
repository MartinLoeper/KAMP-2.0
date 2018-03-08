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

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.repository.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation To Operation Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.componentInternalDependencies.impl.OperationToOperationDependencyImpl#getProvidedSignatures <em>Provided Signatures</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.componentInternalDependencies.impl.OperationToOperationDependencyImpl#getRequiredSignatures <em>Required Signatures</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.componentInternalDependencies.impl.OperationToOperationDependencyImpl#getParentRoleToRoleDependency <em>Parent Role To Role Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationToOperationDependencyImpl extends IdentifierImpl implements OperationToOperationDependency {
	/**
	 * The cached value of the '{@link #getProvidedSignatures() <em>Provided Signatures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Signature> providedSignatures;

	/**
	 * The cached value of the '{@link #getRequiredSignatures() <em>Required Signatures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Signature> requiredSignatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationToOperationDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentInternalDependenciesPackage.Literals.OPERATION_TO_OPERATION_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signature> getProvidedSignatures() {
		if (providedSignatures == null) {
			providedSignatures = new EObjectResolvingEList<Signature>(Signature.class, this, ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PROVIDED_SIGNATURES);
		}
		return providedSignatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signature> getRequiredSignatures() {
		if (requiredSignatures == null) {
			requiredSignatures = new EObjectResolvingEList<Signature>(Signature.class, this, ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__REQUIRED_SIGNATURES);
		}
		return requiredSignatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleToRoleDependency getParentRoleToRoleDependency() {
		if (eContainerFeatureID() != ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PARENT_ROLE_TO_ROLE_DEPENDENCY) return null;
		return (RoleToRoleDependency)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRoleToRoleDependency(RoleToRoleDependency newParentRoleToRoleDependency, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRoleToRoleDependency, ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PARENT_ROLE_TO_ROLE_DEPENDENCY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRoleToRoleDependency(RoleToRoleDependency newParentRoleToRoleDependency) {
		if (newParentRoleToRoleDependency != eInternalContainer() || (eContainerFeatureID() != ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PARENT_ROLE_TO_ROLE_DEPENDENCY && newParentRoleToRoleDependency != null)) {
			if (EcoreUtil.isAncestor(this, newParentRoleToRoleDependency))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentRoleToRoleDependency != null)
				msgs = ((InternalEObject)newParentRoleToRoleDependency).eInverseAdd(this, ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__OPERATION_TO_OPERATION_DEPENDENCY, RoleToRoleDependency.class, msgs);
			msgs = basicSetParentRoleToRoleDependency(newParentRoleToRoleDependency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PARENT_ROLE_TO_ROLE_DEPENDENCY, newParentRoleToRoleDependency, newParentRoleToRoleDependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PARENT_ROLE_TO_ROLE_DEPENDENCY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRoleToRoleDependency((RoleToRoleDependency)otherEnd, msgs);
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
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PARENT_ROLE_TO_ROLE_DEPENDENCY:
				return basicSetParentRoleToRoleDependency(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PARENT_ROLE_TO_ROLE_DEPENDENCY:
				return eInternalContainer().eInverseRemove(this, ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY__OPERATION_TO_OPERATION_DEPENDENCY, RoleToRoleDependency.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PROVIDED_SIGNATURES:
				return getProvidedSignatures();
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__REQUIRED_SIGNATURES:
				return getRequiredSignatures();
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PARENT_ROLE_TO_ROLE_DEPENDENCY:
				return getParentRoleToRoleDependency();
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
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PROVIDED_SIGNATURES:
				getProvidedSignatures().clear();
				getProvidedSignatures().addAll((Collection<? extends Signature>)newValue);
				return;
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__REQUIRED_SIGNATURES:
				getRequiredSignatures().clear();
				getRequiredSignatures().addAll((Collection<? extends Signature>)newValue);
				return;
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PARENT_ROLE_TO_ROLE_DEPENDENCY:
				setParentRoleToRoleDependency((RoleToRoleDependency)newValue);
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
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PROVIDED_SIGNATURES:
				getProvidedSignatures().clear();
				return;
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__REQUIRED_SIGNATURES:
				getRequiredSignatures().clear();
				return;
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PARENT_ROLE_TO_ROLE_DEPENDENCY:
				setParentRoleToRoleDependency((RoleToRoleDependency)null);
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
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PROVIDED_SIGNATURES:
				return providedSignatures != null && !providedSignatures.isEmpty();
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__REQUIRED_SIGNATURES:
				return requiredSignatures != null && !requiredSignatures.isEmpty();
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY__PARENT_ROLE_TO_ROLE_DEPENDENCY:
				return getParentRoleToRoleDependency() != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationToOperationDependencyImpl
