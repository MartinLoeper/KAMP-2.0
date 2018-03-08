/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.util;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.*;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyEntity;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage
 * @generated
 */
public class BPModificationmarksSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BPModificationmarksPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModificationmarksSwitch() {
		if (modelPackage == null) {
			modelPackage = BPModificationmarksPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BPModificationmarksPackage.BP_MODIFICATION_REPOSITORY: {
				BPModificationRepository bpModificationRepository = (BPModificationRepository)theEObject;
				T1 result = caseBPModificationRepository(bpModificationRepository);
				if (result == null) result = caseAbstractISModificationRepository(bpModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(bpModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPModificationmarksPackage.BP_SEED_MODIFICATIONS: {
				BPSeedModifications bpSeedModifications = (BPSeedModifications)theEObject;
				T1 result = caseBPSeedModifications(bpSeedModifications);
				if (result == null) result = caseISSeedModifications(bpSeedModifications);
				if (result == null) result = caseAbstractSeedModifications(bpSeedModifications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES: {
				BPChangePropagationDueToDataDependencies bpChangePropagationDueToDataDependencies = (BPChangePropagationDueToDataDependencies)theEObject;
				T1 result = caseBPChangePropagationDueToDataDependencies(bpChangePropagationDueToDataDependencies);
				if (result == null) result = caseISChangePropagationDueToDataDependencies(bpChangePropagationDueToDataDependencies);
				if (result == null) result = caseChangePropagationStep(bpChangePropagationDueToDataDependencies);
				if (result == null) result = caseAbstractChangePropagationStep(bpChangePropagationDueToDataDependencies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPModificationmarksPackage.BP_INTER_BUSINESS_PROCESS_PROPAGATION: {
				BPInterBusinessProcessPropagation bpInterBusinessProcessPropagation = (BPInterBusinessProcessPropagation)theEObject;
				T1 result = caseBPInterBusinessProcessPropagation(bpInterBusinessProcessPropagation);
				if (result == null) result = caseChangePropagationStep(bpInterBusinessProcessPropagation);
				if (result == null) result = caseAbstractChangePropagationStep(bpInterBusinessProcessPropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPModificationmarksPackage.BP_MODIFY_DATA_OBJECT: {
				BPModifyDataObject bpModifyDataObject = (BPModifyDataObject)theEObject;
				T1 result = caseBPModifyDataObject(bpModifyDataObject);
				if (result == null) result = caseISModifyEntity(bpModifyDataObject);
				if (result == null) result = caseAbstractModification(bpModifyDataObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPModificationmarksPackage.BP_MODIFY_ABSTRACT_USER_ACTION: {
				BPModifyAbstractUserAction<?> bpModifyAbstractUserAction = (BPModifyAbstractUserAction<?>)theEObject;
				T1 result = caseBPModifyAbstractUserAction(bpModifyAbstractUserAction);
				if (result == null) result = caseISModifyEntity(bpModifyAbstractUserAction);
				if (result == null) result = caseAbstractModification(bpModifyAbstractUserAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPModificationmarksPackage.BP_MODIFY_ACQUIRE_DEVICE_RESOURCE_ACTION: {
				BPModifyAcquireDeviceResourceAction bpModifyAcquireDeviceResourceAction = (BPModifyAcquireDeviceResourceAction)theEObject;
				T1 result = caseBPModifyAcquireDeviceResourceAction(bpModifyAcquireDeviceResourceAction);
				if (result == null) result = caseBPModifyAbstractUserAction(bpModifyAcquireDeviceResourceAction);
				if (result == null) result = caseISModifyEntity(bpModifyAcquireDeviceResourceAction);
				if (result == null) result = caseAbstractModification(bpModifyAcquireDeviceResourceAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPModificationmarksPackage.BP_MODIFY_RELEASE_DEVICE_RESOURCE_ACTION: {
				BPModifyReleaseDeviceResourceAction bpModifyReleaseDeviceResourceAction = (BPModifyReleaseDeviceResourceAction)theEObject;
				T1 result = caseBPModifyReleaseDeviceResourceAction(bpModifyReleaseDeviceResourceAction);
				if (result == null) result = caseBPModifyAbstractUserAction(bpModifyReleaseDeviceResourceAction);
				if (result == null) result = caseISModifyEntity(bpModifyReleaseDeviceResourceAction);
				if (result == null) result = caseAbstractModification(bpModifyReleaseDeviceResourceAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPModificationmarksPackage.BP_MODIFY_ACTOR_STEP: {
				BPModifyActorStep bpModifyActorStep = (BPModifyActorStep)theEObject;
				T1 result = caseBPModifyActorStep(bpModifyActorStep);
				if (result == null) result = caseBPModifyAbstractUserAction(bpModifyActorStep);
				if (result == null) result = caseISModifyEntity(bpModifyActorStep);
				if (result == null) result = caseAbstractModification(bpModifyActorStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPModificationmarksPackage.BP_MODIFY_ENTRY_LEVEL_SYSTEM_CALL: {
				BPModifyEntryLevelSystemCall bpModifyEntryLevelSystemCall = (BPModifyEntryLevelSystemCall)theEObject;
				T1 result = caseBPModifyEntryLevelSystemCall(bpModifyEntryLevelSystemCall);
				if (result == null) result = caseBPModifyAbstractUserAction(bpModifyEntryLevelSystemCall);
				if (result == null) result = caseISModifyEntity(bpModifyEntryLevelSystemCall);
				if (result == null) result = caseAbstractModification(bpModifyEntryLevelSystemCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPModificationmarksPackage.BP_MODIFY_DEVICE_RESOURCE: {
				BPModifyDeviceResource bpModifyDeviceResource = (BPModifyDeviceResource)theEObject;
				T1 result = caseBPModifyDeviceResource(bpModifyDeviceResource);
				if (result == null) result = caseISModifyEntity(bpModifyDeviceResource);
				if (result == null) result = caseAbstractModification(bpModifyDeviceResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPModificationmarksPackage.BP_MODIFY_ROLE: {
				BPModifyRole bpModifyRole = (BPModifyRole)theEObject;
				T1 result = caseBPModifyRole(bpModifyRole);
				if (result == null) result = caseISModifyEntity(bpModifyRole);
				if (result == null) result = caseAbstractModification(bpModifyRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPModificationRepository(BPModificationRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPSeedModifications(BPSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Change Propagation Due To Data Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Change Propagation Due To Data Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPChangePropagationDueToDataDependencies(BPChangePropagationDueToDataDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Inter Business Process Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Inter Business Process Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPInterBusinessProcessPropagation(BPInterBusinessProcessPropagation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Modify Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Modify Data Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPModifyDataObject(BPModifyDataObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Modify Abstract User Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Modify Abstract User Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends AbstractUserAction> T1 caseBPModifyAbstractUserAction(BPModifyAbstractUserAction<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Modify Acquire Device Resource Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Modify Acquire Device Resource Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPModifyAcquireDeviceResourceAction(BPModifyAcquireDeviceResourceAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Modify Release Device Resource Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Modify Release Device Resource Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPModifyReleaseDeviceResourceAction(BPModifyReleaseDeviceResourceAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Modify Actor Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Modify Actor Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPModifyActorStep(BPModifyActorStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Modify Entry Level System Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Modify Entry Level System Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPModifyEntryLevelSystemCall(BPModifyEntryLevelSystemCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Modify Device Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Modify Device Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPModifyDeviceResource(BPModifyDeviceResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Modify Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Modify Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPModifyRole(BPModifyRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> T1 caseAbstractModificationRepository(AbstractModificationRepository<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract IS Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract IS Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ISSeedModifications> T1 caseAbstractISModificationRepository(AbstractISModificationRepository<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractSeedModifications(AbstractSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISSeedModifications(ISSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractChangePropagationStep(AbstractChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChangePropagationStep(ChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Change Propagation Due To Data Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Change Propagation Due To Data Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISChangePropagationDueToDataDependencies(ISChangePropagationDueToDataDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S, T> T1 caseAbstractModification(AbstractModification<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Modify Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Modify Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Entity> T1 caseISModifyEntity(ISModifyEntity<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //BPModificationmarksSwitch
