/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksFactory
 * @model kind="package"
 * @generated
 */
public interface BPModificationmarksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modificationmarks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/KAMP4BPModificationmarks/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modificationmarks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BPModificationmarksPackage eINSTANCE = edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationRepositoryImpl <em>BP Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModificationRepository()
	 * @generated
	 */
	int BP_MODIFICATION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ISModificationmarksPackage.ABSTRACT_IS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ISModificationmarksPackage.ABSTRACT_IS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>BP Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFICATION_REPOSITORY_FEATURE_COUNT = ISModificationmarksPackage.ABSTRACT_IS_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPSeedModificationsImpl <em>BP Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPSeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPSeedModifications()
	 * @generated
	 */
	int BP_SEED_MODIFICATIONS = 1;

	/**
	 * The feature id for the '<em><b>Data Type Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_SEED_MODIFICATIONS__DATA_TYPE_MODIFICATIONS = ISModificationmarksPackage.IS_SEED_MODIFICATIONS__DATA_TYPE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Signature Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_SEED_MODIFICATIONS__SIGNATURE_MODIFICATIONS = ISModificationmarksPackage.IS_SEED_MODIFICATIONS__SIGNATURE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS = ISModificationmarksPackage.IS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Component Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS = ISModificationmarksPackage.IS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Data Object Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_SEED_MODIFICATIONS__DATA_OBJECT_MODIFICATIONS = ISModificationmarksPackage.IS_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actor Step Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_SEED_MODIFICATIONS__ACTOR_STEP_MODIFICATIONS = ISModificationmarksPackage.IS_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entry Level System Call Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_SEED_MODIFICATIONS__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS = ISModificationmarksPackage.IS_SEED_MODIFICATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Device Resource Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_SEED_MODIFICATIONS__DEVICE_RESOURCE_MODIFICATIONS = ISModificationmarksPackage.IS_SEED_MODIFICATIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_SEED_MODIFICATIONS__ROLE_MODIFICATIONS = ISModificationmarksPackage.IS_SEED_MODIFICATIONS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>BP Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_SEED_MODIFICATIONS_FEATURE_COUNT = ISModificationmarksPackage.IS_SEED_MODIFICATIONS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPChangePropagationDueToDataDependenciesImpl <em>BP Change Propagation Due To Data Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPChangePropagationDueToDataDependenciesImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPChangePropagationDueToDataDependencies()
	 * @generated
	 */
	int BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES = 2;

	/**
	 * The feature id for the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__INTERFACE_MODIFICATIONS = ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__INTERFACE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Datatype Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATATYPE_MODIFICATIONS = ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATATYPE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Data Object Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATA_OBJECT_MODIFICATIONS = ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actor Step Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ACTOR_STEP_MODIFICATIONS = ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entry Level System Call Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS = ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BP Change Propagation Due To Data Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES_FEATURE_COUNT = ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPInterBusinessProcessPropagationImpl <em>BP Inter Business Process Propagation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPInterBusinessProcessPropagationImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPInterBusinessProcessPropagation()
	 * @generated
	 */
	int BP_INTER_BUSINESS_PROCESS_PROPAGATION = 3;

	/**
	 * The feature id for the '<em><b>Abstract User Action Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BP Inter Business Process Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_INTER_BUSINESS_PROCESS_PROPAGATION_FEATURE_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyDataObjectImpl <em>BP Modify Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyDataObjectImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyDataObject()
	 * @generated
	 */
	int BP_MODIFY_DATA_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_DATA_OBJECT__AFFECTED_ELEMENT = ISModificationmarksPackage.IS_MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_DATA_OBJECT__CAUSING_ELEMENTS = ISModificationmarksPackage.IS_MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_DATA_OBJECT__ID = ISModificationmarksPackage.IS_MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_DATA_OBJECT__TOOLDERIVED = ISModificationmarksPackage.IS_MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_DATA_OBJECT__USER_DECISION = ISModificationmarksPackage.IS_MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>BP Modify Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_DATA_OBJECT_FEATURE_COUNT = ISModificationmarksPackage.IS_MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyAbstractUserActionImpl <em>BP Modify Abstract User Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyAbstractUserActionImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyAbstractUserAction()
	 * @generated
	 */
	int BP_MODIFY_ABSTRACT_USER_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ABSTRACT_USER_ACTION__AFFECTED_ELEMENT = ISModificationmarksPackage.IS_MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ABSTRACT_USER_ACTION__CAUSING_ELEMENTS = ISModificationmarksPackage.IS_MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ABSTRACT_USER_ACTION__ID = ISModificationmarksPackage.IS_MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ABSTRACT_USER_ACTION__TOOLDERIVED = ISModificationmarksPackage.IS_MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ABSTRACT_USER_ACTION__USER_DECISION = ISModificationmarksPackage.IS_MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>BP Modify Abstract User Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ABSTRACT_USER_ACTION_FEATURE_COUNT = ISModificationmarksPackage.IS_MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyAcquireDeviceResourceActionImpl <em>BP Modify Acquire Device Resource Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyAcquireDeviceResourceActionImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyAcquireDeviceResourceAction()
	 * @generated
	 */
	int BP_MODIFY_ACQUIRE_DEVICE_RESOURCE_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ACQUIRE_DEVICE_RESOURCE_ACTION__AFFECTED_ELEMENT = BP_MODIFY_ABSTRACT_USER_ACTION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ACQUIRE_DEVICE_RESOURCE_ACTION__CAUSING_ELEMENTS = BP_MODIFY_ABSTRACT_USER_ACTION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ACQUIRE_DEVICE_RESOURCE_ACTION__ID = BP_MODIFY_ABSTRACT_USER_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ACQUIRE_DEVICE_RESOURCE_ACTION__TOOLDERIVED = BP_MODIFY_ABSTRACT_USER_ACTION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ACQUIRE_DEVICE_RESOURCE_ACTION__USER_DECISION = BP_MODIFY_ABSTRACT_USER_ACTION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>BP Modify Acquire Device Resource Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ACQUIRE_DEVICE_RESOURCE_ACTION_FEATURE_COUNT = BP_MODIFY_ABSTRACT_USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyReleaseDeviceResourceActionImpl <em>BP Modify Release Device Resource Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyReleaseDeviceResourceActionImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyReleaseDeviceResourceAction()
	 * @generated
	 */
	int BP_MODIFY_RELEASE_DEVICE_RESOURCE_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_RELEASE_DEVICE_RESOURCE_ACTION__AFFECTED_ELEMENT = BP_MODIFY_ABSTRACT_USER_ACTION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_RELEASE_DEVICE_RESOURCE_ACTION__CAUSING_ELEMENTS = BP_MODIFY_ABSTRACT_USER_ACTION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_RELEASE_DEVICE_RESOURCE_ACTION__ID = BP_MODIFY_ABSTRACT_USER_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_RELEASE_DEVICE_RESOURCE_ACTION__TOOLDERIVED = BP_MODIFY_ABSTRACT_USER_ACTION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_RELEASE_DEVICE_RESOURCE_ACTION__USER_DECISION = BP_MODIFY_ABSTRACT_USER_ACTION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>BP Modify Release Device Resource Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_RELEASE_DEVICE_RESOURCE_ACTION_FEATURE_COUNT = BP_MODIFY_ABSTRACT_USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyActorStepImpl <em>BP Modify Actor Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyActorStepImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyActorStep()
	 * @generated
	 */
	int BP_MODIFY_ACTOR_STEP = 8;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ACTOR_STEP__AFFECTED_ELEMENT = BP_MODIFY_ABSTRACT_USER_ACTION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ACTOR_STEP__CAUSING_ELEMENTS = BP_MODIFY_ABSTRACT_USER_ACTION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ACTOR_STEP__ID = BP_MODIFY_ABSTRACT_USER_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ACTOR_STEP__TOOLDERIVED = BP_MODIFY_ABSTRACT_USER_ACTION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ACTOR_STEP__USER_DECISION = BP_MODIFY_ABSTRACT_USER_ACTION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>BP Modify Actor Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ACTOR_STEP_FEATURE_COUNT = BP_MODIFY_ABSTRACT_USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyEntryLevelSystemCallImpl <em>BP Modify Entry Level System Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyEntryLevelSystemCallImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyEntryLevelSystemCall()
	 * @generated
	 */
	int BP_MODIFY_ENTRY_LEVEL_SYSTEM_CALL = 9;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ENTRY_LEVEL_SYSTEM_CALL__AFFECTED_ELEMENT = BP_MODIFY_ABSTRACT_USER_ACTION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ENTRY_LEVEL_SYSTEM_CALL__CAUSING_ELEMENTS = BP_MODIFY_ABSTRACT_USER_ACTION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ENTRY_LEVEL_SYSTEM_CALL__ID = BP_MODIFY_ABSTRACT_USER_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ENTRY_LEVEL_SYSTEM_CALL__TOOLDERIVED = BP_MODIFY_ABSTRACT_USER_ACTION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ENTRY_LEVEL_SYSTEM_CALL__USER_DECISION = BP_MODIFY_ABSTRACT_USER_ACTION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>BP Modify Entry Level System Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ENTRY_LEVEL_SYSTEM_CALL_FEATURE_COUNT = BP_MODIFY_ABSTRACT_USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyDeviceResourceImpl <em>BP Modify Device Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyDeviceResourceImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyDeviceResource()
	 * @generated
	 */
	int BP_MODIFY_DEVICE_RESOURCE = 10;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_DEVICE_RESOURCE__AFFECTED_ELEMENT = ISModificationmarksPackage.IS_MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_DEVICE_RESOURCE__CAUSING_ELEMENTS = ISModificationmarksPackage.IS_MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_DEVICE_RESOURCE__ID = ISModificationmarksPackage.IS_MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_DEVICE_RESOURCE__TOOLDERIVED = ISModificationmarksPackage.IS_MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_DEVICE_RESOURCE__USER_DECISION = ISModificationmarksPackage.IS_MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>BP Modify Device Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_DEVICE_RESOURCE_FEATURE_COUNT = ISModificationmarksPackage.IS_MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyRoleImpl <em>BP Modify Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyRoleImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyRole()
	 * @generated
	 */
	int BP_MODIFY_ROLE = 11;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ROLE__AFFECTED_ELEMENT = ISModificationmarksPackage.IS_MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ROLE__CAUSING_ELEMENTS = ISModificationmarksPackage.IS_MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ROLE__ID = ISModificationmarksPackage.IS_MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ROLE__TOOLDERIVED = ISModificationmarksPackage.IS_MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ROLE__USER_DECISION = ISModificationmarksPackage.IS_MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>BP Modify Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MODIFY_ROLE_FEATURE_COUNT = ISModificationmarksPackage.IS_MODIFY_ENTITY_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationRepository <em>BP Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationRepository
	 * @generated
	 */
	EClass getBPModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications <em>BP Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications
	 * @generated
	 */
	EClass getBPSeedModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications#getDataObjectModifications <em>Data Object Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Object Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications#getDataObjectModifications()
	 * @see #getBPSeedModifications()
	 * @generated
	 */
	EReference getBPSeedModifications_DataObjectModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications#getActorStepModifications <em>Actor Step Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor Step Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications#getActorStepModifications()
	 * @see #getBPSeedModifications()
	 * @generated
	 */
	EReference getBPSeedModifications_ActorStepModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications#getEntryLevelSystemCallModifications <em>Entry Level System Call Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Level System Call Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications#getEntryLevelSystemCallModifications()
	 * @see #getBPSeedModifications()
	 * @generated
	 */
	EReference getBPSeedModifications_EntryLevelSystemCallModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications#getDeviceResourceModifications <em>Device Resource Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Resource Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications#getDeviceResourceModifications()
	 * @see #getBPSeedModifications()
	 * @generated
	 */
	EReference getBPSeedModifications_DeviceResourceModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications#getRoleModifications <em>Role Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications#getRoleModifications()
	 * @see #getBPSeedModifications()
	 * @generated
	 */
	EReference getBPSeedModifications_RoleModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies <em>BP Change Propagation Due To Data Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Change Propagation Due To Data Dependencies</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies
	 * @generated
	 */
	EClass getBPChangePropagationDueToDataDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies#getDataObjectModifications <em>Data Object Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Object Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies#getDataObjectModifications()
	 * @see #getBPChangePropagationDueToDataDependencies()
	 * @generated
	 */
	EReference getBPChangePropagationDueToDataDependencies_DataObjectModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies#getActorStepModifications <em>Actor Step Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor Step Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies#getActorStepModifications()
	 * @see #getBPChangePropagationDueToDataDependencies()
	 * @generated
	 */
	EReference getBPChangePropagationDueToDataDependencies_ActorStepModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies#getEntryLevelSystemCallModifications <em>Entry Level System Call Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Level System Call Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies#getEntryLevelSystemCallModifications()
	 * @see #getBPChangePropagationDueToDataDependencies()
	 * @generated
	 */
	EReference getBPChangePropagationDueToDataDependencies_EntryLevelSystemCallModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPInterBusinessProcessPropagation <em>BP Inter Business Process Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Inter Business Process Propagation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPInterBusinessProcessPropagation
	 * @generated
	 */
	EClass getBPInterBusinessProcessPropagation();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPInterBusinessProcessPropagation#getAbstractUserActionModifications <em>Abstract User Action Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract User Action Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPInterBusinessProcessPropagation#getAbstractUserActionModifications()
	 * @see #getBPInterBusinessProcessPropagation()
	 * @generated
	 */
	EReference getBPInterBusinessProcessPropagation_AbstractUserActionModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyDataObject <em>BP Modify Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Modify Data Object</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyDataObject
	 * @generated
	 */
	EClass getBPModifyDataObject();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAbstractUserAction <em>BP Modify Abstract User Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Modify Abstract User Action</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAbstractUserAction
	 * @generated
	 */
	EClass getBPModifyAbstractUserAction();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAcquireDeviceResourceAction <em>BP Modify Acquire Device Resource Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Modify Acquire Device Resource Action</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAcquireDeviceResourceAction
	 * @generated
	 */
	EClass getBPModifyAcquireDeviceResourceAction();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyReleaseDeviceResourceAction <em>BP Modify Release Device Resource Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Modify Release Device Resource Action</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyReleaseDeviceResourceAction
	 * @generated
	 */
	EClass getBPModifyReleaseDeviceResourceAction();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyActorStep <em>BP Modify Actor Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Modify Actor Step</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyActorStep
	 * @generated
	 */
	EClass getBPModifyActorStep();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyEntryLevelSystemCall <em>BP Modify Entry Level System Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Modify Entry Level System Call</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyEntryLevelSystemCall
	 * @generated
	 */
	EClass getBPModifyEntryLevelSystemCall();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyDeviceResource <em>BP Modify Device Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Modify Device Resource</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyDeviceResource
	 * @generated
	 */
	EClass getBPModifyDeviceResource();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyRole <em>BP Modify Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Modify Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyRole
	 * @generated
	 */
	EClass getBPModifyRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BPModificationmarksFactory getBPModificationmarksFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationRepositoryImpl <em>BP Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModificationRepository()
		 * @generated
		 */
		EClass BP_MODIFICATION_REPOSITORY = eINSTANCE.getBPModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPSeedModificationsImpl <em>BP Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPSeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPSeedModifications()
		 * @generated
		 */
		EClass BP_SEED_MODIFICATIONS = eINSTANCE.getBPSeedModifications();

		/**
		 * The meta object literal for the '<em><b>Data Object Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_SEED_MODIFICATIONS__DATA_OBJECT_MODIFICATIONS = eINSTANCE.getBPSeedModifications_DataObjectModifications();

		/**
		 * The meta object literal for the '<em><b>Actor Step Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_SEED_MODIFICATIONS__ACTOR_STEP_MODIFICATIONS = eINSTANCE.getBPSeedModifications_ActorStepModifications();

		/**
		 * The meta object literal for the '<em><b>Entry Level System Call Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_SEED_MODIFICATIONS__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS = eINSTANCE.getBPSeedModifications_EntryLevelSystemCallModifications();

		/**
		 * The meta object literal for the '<em><b>Device Resource Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_SEED_MODIFICATIONS__DEVICE_RESOURCE_MODIFICATIONS = eINSTANCE.getBPSeedModifications_DeviceResourceModifications();

		/**
		 * The meta object literal for the '<em><b>Role Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_SEED_MODIFICATIONS__ROLE_MODIFICATIONS = eINSTANCE.getBPSeedModifications_RoleModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPChangePropagationDueToDataDependenciesImpl <em>BP Change Propagation Due To Data Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPChangePropagationDueToDataDependenciesImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPChangePropagationDueToDataDependencies()
		 * @generated
		 */
		EClass BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES = eINSTANCE.getBPChangePropagationDueToDataDependencies();

		/**
		 * The meta object literal for the '<em><b>Data Object Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATA_OBJECT_MODIFICATIONS = eINSTANCE.getBPChangePropagationDueToDataDependencies_DataObjectModifications();

		/**
		 * The meta object literal for the '<em><b>Actor Step Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ACTOR_STEP_MODIFICATIONS = eINSTANCE.getBPChangePropagationDueToDataDependencies_ActorStepModifications();

		/**
		 * The meta object literal for the '<em><b>Entry Level System Call Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS = eINSTANCE.getBPChangePropagationDueToDataDependencies_EntryLevelSystemCallModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPInterBusinessProcessPropagationImpl <em>BP Inter Business Process Propagation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPInterBusinessProcessPropagationImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPInterBusinessProcessPropagation()
		 * @generated
		 */
		EClass BP_INTER_BUSINESS_PROCESS_PROPAGATION = eINSTANCE.getBPInterBusinessProcessPropagation();

		/**
		 * The meta object literal for the '<em><b>Abstract User Action Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS = eINSTANCE.getBPInterBusinessProcessPropagation_AbstractUserActionModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyDataObjectImpl <em>BP Modify Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyDataObjectImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyDataObject()
		 * @generated
		 */
		EClass BP_MODIFY_DATA_OBJECT = eINSTANCE.getBPModifyDataObject();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyAbstractUserActionImpl <em>BP Modify Abstract User Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyAbstractUserActionImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyAbstractUserAction()
		 * @generated
		 */
		EClass BP_MODIFY_ABSTRACT_USER_ACTION = eINSTANCE.getBPModifyAbstractUserAction();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyAcquireDeviceResourceActionImpl <em>BP Modify Acquire Device Resource Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyAcquireDeviceResourceActionImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyAcquireDeviceResourceAction()
		 * @generated
		 */
		EClass BP_MODIFY_ACQUIRE_DEVICE_RESOURCE_ACTION = eINSTANCE.getBPModifyAcquireDeviceResourceAction();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyReleaseDeviceResourceActionImpl <em>BP Modify Release Device Resource Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyReleaseDeviceResourceActionImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyReleaseDeviceResourceAction()
		 * @generated
		 */
		EClass BP_MODIFY_RELEASE_DEVICE_RESOURCE_ACTION = eINSTANCE.getBPModifyReleaseDeviceResourceAction();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyActorStepImpl <em>BP Modify Actor Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyActorStepImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyActorStep()
		 * @generated
		 */
		EClass BP_MODIFY_ACTOR_STEP = eINSTANCE.getBPModifyActorStep();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyEntryLevelSystemCallImpl <em>BP Modify Entry Level System Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyEntryLevelSystemCallImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyEntryLevelSystemCall()
		 * @generated
		 */
		EClass BP_MODIFY_ENTRY_LEVEL_SYSTEM_CALL = eINSTANCE.getBPModifyEntryLevelSystemCall();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyDeviceResourceImpl <em>BP Modify Device Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyDeviceResourceImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyDeviceResource()
		 * @generated
		 */
		EClass BP_MODIFY_DEVICE_RESOURCE = eINSTANCE.getBPModifyDeviceResource();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyRoleImpl <em>BP Modify Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModifyRoleImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksPackageImpl#getBPModifyRole()
		 * @generated
		 */
		EClass BP_MODIFY_ROLE = eINSTANCE.getBPModifyRole();

	}

} //BPModificationmarksPackage
