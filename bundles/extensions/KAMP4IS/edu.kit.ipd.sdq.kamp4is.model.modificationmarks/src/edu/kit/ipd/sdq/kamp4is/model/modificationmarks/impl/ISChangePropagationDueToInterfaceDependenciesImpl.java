/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ChangePropagationStepImpl;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToInterfaceDependencies;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Change Propagation Due To Interface Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISChangePropagationDueToInterfaceDependenciesImpl#getComponentModifications <em>Component Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISChangePropagationDueToInterfaceDependenciesImpl#getSignatureModifications <em>Signature Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISChangePropagationDueToInterfaceDependenciesImpl extends ChangePropagationStepImpl implements ISChangePropagationDueToInterfaceDependencies {
	/**
	 * The cached value of the '{@link #getComponentModifications() <em>Component Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ISModifyComponent> componentModifications;

	/**
	 * The cached value of the '{@link #getSignatureModifications() <em>Signature Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ISModifySignature> signatureModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISChangePropagationDueToInterfaceDependenciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISModificationmarksPackage.Literals.IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISModifyComponent> getComponentModifications() {
		if (componentModifications == null) {
			componentModifications = new EObjectContainmentEList<ISModifyComponent>(ISModifyComponent.class, this, ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS);
		}
		return componentModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISModifySignature> getSignatureModifications() {
		if (signatureModifications == null) {
			signatureModifications = new EObjectContainmentEList<ISModifySignature>(ISModifySignature.class, this, ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__SIGNATURE_MODIFICATIONS);
		}
		return signatureModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS:
				return ((InternalEList<?>)getComponentModifications()).basicRemove(otherEnd, msgs);
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__SIGNATURE_MODIFICATIONS:
				return ((InternalEList<?>)getSignatureModifications()).basicRemove(otherEnd, msgs);
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
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS:
				return getComponentModifications();
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__SIGNATURE_MODIFICATIONS:
				return getSignatureModifications();
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
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
				getComponentModifications().addAll((Collection<? extends ISModifyComponent>)newValue);
				return;
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__SIGNATURE_MODIFICATIONS:
				getSignatureModifications().clear();
				getSignatureModifications().addAll((Collection<? extends ISModifySignature>)newValue);
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
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
				return;
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__SIGNATURE_MODIFICATIONS:
				getSignatureModifications().clear();
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
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS:
				return componentModifications != null && !componentModifications.isEmpty();
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__SIGNATURE_MODIFICATIONS:
				return signatureModifications != null && !signatureModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISChangePropagationDueToInterfaceDependenciesImpl
