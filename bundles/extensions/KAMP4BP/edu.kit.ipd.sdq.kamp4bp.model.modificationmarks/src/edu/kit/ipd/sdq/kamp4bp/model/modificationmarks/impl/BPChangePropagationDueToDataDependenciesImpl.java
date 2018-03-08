/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyActorStep;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyDataObject;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyEntryLevelSystemCall;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISChangePropagationDueToDataDependenciesImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BP Change Propagation Due To Data Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPChangePropagationDueToDataDependenciesImpl#getDataObjectModifications <em>Data Object Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPChangePropagationDueToDataDependenciesImpl#getActorStepModifications <em>Actor Step Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPChangePropagationDueToDataDependenciesImpl#getEntryLevelSystemCallModifications <em>Entry Level System Call Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPChangePropagationDueToDataDependenciesImpl extends ISChangePropagationDueToDataDependenciesImpl implements BPChangePropagationDueToDataDependencies {
	/**
	 * The cached value of the '{@link #getDataObjectModifications() <em>Data Object Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObjectModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<BPModifyDataObject> dataObjectModifications;

	/**
	 * The cached value of the '{@link #getActorStepModifications() <em>Actor Step Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorStepModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<BPModifyActorStep> actorStepModifications;

	/**
	 * The cached value of the '{@link #getEntryLevelSystemCallModifications() <em>Entry Level System Call Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryLevelSystemCallModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<BPModifyEntryLevelSystemCall> entryLevelSystemCallModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPChangePropagationDueToDataDependenciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPModificationmarksPackage.Literals.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPModifyDataObject> getDataObjectModifications() {
		if (dataObjectModifications == null) {
			dataObjectModifications = new EObjectContainmentEList<BPModifyDataObject>(BPModifyDataObject.class, this, BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATA_OBJECT_MODIFICATIONS);
		}
		return dataObjectModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPModifyActorStep> getActorStepModifications() {
		if (actorStepModifications == null) {
			actorStepModifications = new EObjectContainmentEList<BPModifyActorStep>(BPModifyActorStep.class, this, BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ACTOR_STEP_MODIFICATIONS);
		}
		return actorStepModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPModifyEntryLevelSystemCall> getEntryLevelSystemCallModifications() {
		if (entryLevelSystemCallModifications == null) {
			entryLevelSystemCallModifications = new EObjectContainmentEList<BPModifyEntryLevelSystemCall>(BPModifyEntryLevelSystemCall.class, this, BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS);
		}
		return entryLevelSystemCallModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATA_OBJECT_MODIFICATIONS:
				return ((InternalEList<?>)getDataObjectModifications()).basicRemove(otherEnd, msgs);
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ACTOR_STEP_MODIFICATIONS:
				return ((InternalEList<?>)getActorStepModifications()).basicRemove(otherEnd, msgs);
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS:
				return ((InternalEList<?>)getEntryLevelSystemCallModifications()).basicRemove(otherEnd, msgs);
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
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATA_OBJECT_MODIFICATIONS:
				return getDataObjectModifications();
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ACTOR_STEP_MODIFICATIONS:
				return getActorStepModifications();
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS:
				return getEntryLevelSystemCallModifications();
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
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATA_OBJECT_MODIFICATIONS:
				getDataObjectModifications().clear();
				getDataObjectModifications().addAll((Collection<? extends BPModifyDataObject>)newValue);
				return;
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ACTOR_STEP_MODIFICATIONS:
				getActorStepModifications().clear();
				getActorStepModifications().addAll((Collection<? extends BPModifyActorStep>)newValue);
				return;
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS:
				getEntryLevelSystemCallModifications().clear();
				getEntryLevelSystemCallModifications().addAll((Collection<? extends BPModifyEntryLevelSystemCall>)newValue);
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
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATA_OBJECT_MODIFICATIONS:
				getDataObjectModifications().clear();
				return;
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ACTOR_STEP_MODIFICATIONS:
				getActorStepModifications().clear();
				return;
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS:
				getEntryLevelSystemCallModifications().clear();
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
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATA_OBJECT_MODIFICATIONS:
				return dataObjectModifications != null && !dataObjectModifications.isEmpty();
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ACTOR_STEP_MODIFICATIONS:
				return actorStepModifications != null && !actorStepModifications.isEmpty();
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS:
				return entryLevelSystemCallModifications != null && !entryLevelSystemCallModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BPChangePropagationDueToDataDependenciesImpl
