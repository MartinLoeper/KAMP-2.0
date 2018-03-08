/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPModificationmarksFactoryImpl extends EFactoryImpl implements BPModificationmarksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BPModificationmarksFactory init() {
		try {
			BPModificationmarksFactory theBPModificationmarksFactory = (BPModificationmarksFactory)EPackage.Registry.INSTANCE.getEFactory(BPModificationmarksPackage.eNS_URI);
			if (theBPModificationmarksFactory != null) {
				return theBPModificationmarksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BPModificationmarksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModificationmarksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BPModificationmarksPackage.BP_MODIFICATION_REPOSITORY: return createBPModificationRepository();
			case BPModificationmarksPackage.BP_SEED_MODIFICATIONS: return createBPSeedModifications();
			case BPModificationmarksPackage.BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES: return createBPChangePropagationDueToDataDependencies();
			case BPModificationmarksPackage.BP_INTER_BUSINESS_PROCESS_PROPAGATION: return createBPInterBusinessProcessPropagation();
			case BPModificationmarksPackage.BP_MODIFY_DATA_OBJECT: return createBPModifyDataObject();
			case BPModificationmarksPackage.BP_MODIFY_ABSTRACT_USER_ACTION: return createBPModifyAbstractUserAction();
			case BPModificationmarksPackage.BP_MODIFY_ACQUIRE_DEVICE_RESOURCE_ACTION: return createBPModifyAcquireDeviceResourceAction();
			case BPModificationmarksPackage.BP_MODIFY_RELEASE_DEVICE_RESOURCE_ACTION: return createBPModifyReleaseDeviceResourceAction();
			case BPModificationmarksPackage.BP_MODIFY_ACTOR_STEP: return createBPModifyActorStep();
			case BPModificationmarksPackage.BP_MODIFY_ENTRY_LEVEL_SYSTEM_CALL: return createBPModifyEntryLevelSystemCall();
			case BPModificationmarksPackage.BP_MODIFY_DEVICE_RESOURCE: return createBPModifyDeviceResource();
			case BPModificationmarksPackage.BP_MODIFY_ROLE: return createBPModifyRole();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModificationRepository createBPModificationRepository() {
		BPModificationRepositoryImpl bpModificationRepository = new BPModificationRepositoryImpl();
		return bpModificationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPSeedModifications createBPSeedModifications() {
		BPSeedModificationsImpl bpSeedModifications = new BPSeedModificationsImpl();
		return bpSeedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPChangePropagationDueToDataDependencies createBPChangePropagationDueToDataDependencies() {
		BPChangePropagationDueToDataDependenciesImpl bpChangePropagationDueToDataDependencies = new BPChangePropagationDueToDataDependenciesImpl();
		return bpChangePropagationDueToDataDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPInterBusinessProcessPropagation createBPInterBusinessProcessPropagation() {
		BPInterBusinessProcessPropagationImpl bpInterBusinessProcessPropagation = new BPInterBusinessProcessPropagationImpl();
		return bpInterBusinessProcessPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModifyDataObject createBPModifyDataObject() {
		BPModifyDataObjectImpl bpModifyDataObject = new BPModifyDataObjectImpl();
		return bpModifyDataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends AbstractUserAction> BPModifyAbstractUserAction<T> createBPModifyAbstractUserAction() {
		BPModifyAbstractUserActionImpl<T> bpModifyAbstractUserAction = new BPModifyAbstractUserActionImpl<T>();
		return bpModifyAbstractUserAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModifyAcquireDeviceResourceAction createBPModifyAcquireDeviceResourceAction() {
		BPModifyAcquireDeviceResourceActionImpl bpModifyAcquireDeviceResourceAction = new BPModifyAcquireDeviceResourceActionImpl();
		return bpModifyAcquireDeviceResourceAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModifyReleaseDeviceResourceAction createBPModifyReleaseDeviceResourceAction() {
		BPModifyReleaseDeviceResourceActionImpl bpModifyReleaseDeviceResourceAction = new BPModifyReleaseDeviceResourceActionImpl();
		return bpModifyReleaseDeviceResourceAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModifyActorStep createBPModifyActorStep() {
		BPModifyActorStepImpl bpModifyActorStep = new BPModifyActorStepImpl();
		return bpModifyActorStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModifyEntryLevelSystemCall createBPModifyEntryLevelSystemCall() {
		BPModifyEntryLevelSystemCallImpl bpModifyEntryLevelSystemCall = new BPModifyEntryLevelSystemCallImpl();
		return bpModifyEntryLevelSystemCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModifyDeviceResource createBPModifyDeviceResource() {
		BPModifyDeviceResourceImpl bpModifyDeviceResource = new BPModifyDeviceResourceImpl();
		return bpModifyDeviceResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModifyRole createBPModifyRole() {
		BPModifyRoleImpl bpModifyRole = new BPModifyRoleImpl();
		return bpModifyRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModificationmarksPackage getBPModificationmarksPackage() {
		return (BPModificationmarksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BPModificationmarksPackage getPackage() {
		return BPModificationmarksPackage.eINSTANCE;
	}

} //BPModificationmarksFactoryImpl
