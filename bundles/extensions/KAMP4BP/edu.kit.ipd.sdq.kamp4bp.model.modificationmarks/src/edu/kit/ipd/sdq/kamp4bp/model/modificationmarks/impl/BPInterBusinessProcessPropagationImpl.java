/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ChangePropagationStepImpl;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPInterBusinessProcessPropagation;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAbstractUserAction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BP Inter Business Process Propagation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPInterBusinessProcessPropagationImpl#getAbstractUserActionModifications <em>Abstract User Action Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPInterBusinessProcessPropagationImpl extends ChangePropagationStepImpl implements BPInterBusinessProcessPropagation {
	/**
	 * The cached value of the '{@link #getAbstractUserActionModifications() <em>Abstract User Action Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractUserActionModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<BPModifyAbstractUserAction<?>> abstractUserActionModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPInterBusinessProcessPropagationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPModificationmarksPackage.Literals.BP_INTER_BUSINESS_PROCESS_PROPAGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPModifyAbstractUserAction<?>> getAbstractUserActionModifications() {
		if (abstractUserActionModifications == null) {
			abstractUserActionModifications = new EObjectContainmentEList<BPModifyAbstractUserAction<?>>(BPModifyAbstractUserAction.class, this, BPModificationmarksPackage.BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS);
		}
		return abstractUserActionModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPModificationmarksPackage.BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS:
				return ((InternalEList<?>)getAbstractUserActionModifications()).basicRemove(otherEnd, msgs);
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
			case BPModificationmarksPackage.BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS:
				return getAbstractUserActionModifications();
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
			case BPModificationmarksPackage.BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS:
				getAbstractUserActionModifications().clear();
				getAbstractUserActionModifications().addAll((Collection<? extends BPModifyAbstractUserAction<?>>)newValue);
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
			case BPModificationmarksPackage.BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS:
				getAbstractUserActionModifications().clear();
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
			case BPModificationmarksPackage.BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS:
				return abstractUserActionModifications != null && !abstractUserActionModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BPInterBusinessProcessPropagationImpl
