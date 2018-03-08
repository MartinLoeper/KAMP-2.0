/**
 */
package edu.kit.ipd.sdq.kamp4req.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage;

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
 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksFactory
 * @model kind="package"
 * @generated
 */
public interface ReqModificationmarksPackage extends EPackage {
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
	String eNS_URI = "http://sdq.ipd.kit.edu/KAMP4ReqModificationmarks/1.0";

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
	ReqModificationmarksPackage eINSTANCE = edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationRepositoryImpl <em>Req Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqModificationRepository()
	 * @generated
	 */
	int REQ_MODIFICATION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ISModificationmarksPackage.ABSTRACT_IS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ISModificationmarksPackage.ABSTRACT_IS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>Req Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFICATION_REPOSITORY_FEATURE_COUNT = ISModificationmarksPackage.ABSTRACT_IS_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqSeedModificationsImpl <em>Req Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqSeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqSeedModifications()
	 * @generated
	 */
	int REQ_SEED_MODIFICATIONS = 1;

	/**
	 * The feature id for the '<em><b>Data Type Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_SEED_MODIFICATIONS__DATA_TYPE_MODIFICATIONS = BPModificationmarksPackage.BP_SEED_MODIFICATIONS__DATA_TYPE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Signature Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_SEED_MODIFICATIONS__SIGNATURE_MODIFICATIONS = BPModificationmarksPackage.BP_SEED_MODIFICATIONS__SIGNATURE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS = BPModificationmarksPackage.BP_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Component Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS = BPModificationmarksPackage.BP_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Data Object Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_SEED_MODIFICATIONS__DATA_OBJECT_MODIFICATIONS = BPModificationmarksPackage.BP_SEED_MODIFICATIONS__DATA_OBJECT_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Actor Step Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_SEED_MODIFICATIONS__ACTOR_STEP_MODIFICATIONS = BPModificationmarksPackage.BP_SEED_MODIFICATIONS__ACTOR_STEP_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Entry Level System Call Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_SEED_MODIFICATIONS__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS = BPModificationmarksPackage.BP_SEED_MODIFICATIONS__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Device Resource Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_SEED_MODIFICATIONS__DEVICE_RESOURCE_MODIFICATIONS = BPModificationmarksPackage.BP_SEED_MODIFICATIONS__DEVICE_RESOURCE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Role Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_SEED_MODIFICATIONS__ROLE_MODIFICATIONS = BPModificationmarksPackage.BP_SEED_MODIFICATIONS__ROLE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Requirement Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS = BPModificationmarksPackage.BP_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decision Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS = BPModificationmarksPackage.BP_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Option Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS = BPModificationmarksPackage.BP_SEED_MODIFICATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Req Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_SEED_MODIFICATIONS_FEATURE_COUNT = BPModificationmarksPackage.BP_SEED_MODIFICATIONS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqChangePropagationDueToSpecificationDependenciesImpl <em>Req Change Propagation Due To Specification Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqChangePropagationDueToSpecificationDependenciesImpl
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	int REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES = 2;

	/**
	 * The feature id for the '<em><b>Decision Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Option Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requirement Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Type Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DATA_TYPE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Entity Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ENTITY_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Req Change Propagation Due To Specification Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyEntityImpl <em>Req Modify Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyEntityImpl
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqModifyEntity()
	 * @generated
	 */
	int REQ_MODIFY_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_ENTITY__AFFECTED_ELEMENT = ISModificationmarksPackage.IS_MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_ENTITY__CAUSING_ELEMENTS = ISModificationmarksPackage.IS_MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_ENTITY__ID = ISModificationmarksPackage.IS_MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_ENTITY__TOOLDERIVED = ISModificationmarksPackage.IS_MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_ENTITY__USER_DECISION = ISModificationmarksPackage.IS_MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Req Modify Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_ENTITY_FEATURE_COUNT = ISModificationmarksPackage.IS_MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyTraceableObjectImpl <em>Req Modify Traceable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyTraceableObjectImpl
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqModifyTraceableObject()
	 * @generated
	 */
	int REQ_MODIFY_TRACEABLE_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_TRACEABLE_OBJECT__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_TRACEABLE_OBJECT__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_TRACEABLE_OBJECT__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_TRACEABLE_OBJECT__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_TRACEABLE_OBJECT__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Req Modify Traceable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_TRACEABLE_OBJECT_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyRequirementImpl <em>Req Modify Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyRequirementImpl
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqModifyRequirement()
	 * @generated
	 */
	int REQ_MODIFY_REQUIREMENT = 5;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_REQUIREMENT__AFFECTED_ELEMENT = REQ_MODIFY_TRACEABLE_OBJECT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_REQUIREMENT__CAUSING_ELEMENTS = REQ_MODIFY_TRACEABLE_OBJECT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_REQUIREMENT__ID = REQ_MODIFY_TRACEABLE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_REQUIREMENT__TOOLDERIVED = REQ_MODIFY_TRACEABLE_OBJECT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_REQUIREMENT__USER_DECISION = REQ_MODIFY_TRACEABLE_OBJECT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Req Modify Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_REQUIREMENT_FEATURE_COUNT = REQ_MODIFY_TRACEABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyDecisionImpl <em>Req Modify Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyDecisionImpl
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqModifyDecision()
	 * @generated
	 */
	int REQ_MODIFY_DECISION = 6;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_DECISION__AFFECTED_ELEMENT = REQ_MODIFY_TRACEABLE_OBJECT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_DECISION__CAUSING_ELEMENTS = REQ_MODIFY_TRACEABLE_OBJECT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_DECISION__ID = REQ_MODIFY_TRACEABLE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_DECISION__TOOLDERIVED = REQ_MODIFY_TRACEABLE_OBJECT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_DECISION__USER_DECISION = REQ_MODIFY_TRACEABLE_OBJECT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Req Modify Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_DECISION_FEATURE_COUNT = REQ_MODIFY_TRACEABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyOptionImpl <em>Req Modify Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyOptionImpl
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqModifyOption()
	 * @generated
	 */
	int REQ_MODIFY_OPTION = 7;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_OPTION__AFFECTED_ELEMENT = REQ_MODIFY_TRACEABLE_OBJECT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_OPTION__CAUSING_ELEMENTS = REQ_MODIFY_TRACEABLE_OBJECT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_OPTION__ID = REQ_MODIFY_TRACEABLE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_OPTION__TOOLDERIVED = REQ_MODIFY_TRACEABLE_OBJECT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_OPTION__USER_DECISION = REQ_MODIFY_TRACEABLE_OBJECT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>Req Modify Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_MODIFY_OPTION_FEATURE_COUNT = REQ_MODIFY_TRACEABLE_OBJECT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationRepository <em>Req Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationRepository
	 * @generated
	 */
	EClass getReqModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications <em>Req Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications
	 * @generated
	 */
	EClass getReqSeedModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications#getRequirementModifications <em>Requirement Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications#getRequirementModifications()
	 * @see #getReqSeedModifications()
	 * @generated
	 */
	EReference getReqSeedModifications_RequirementModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications#getDecisionModifications <em>Decision Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications#getDecisionModifications()
	 * @see #getReqSeedModifications()
	 * @generated
	 */
	EReference getReqSeedModifications_DecisionModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications#getOptionModifications <em>Option Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications#getOptionModifications()
	 * @see #getReqSeedModifications()
	 * @generated
	 */
	EReference getReqSeedModifications_OptionModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies <em>Req Change Propagation Due To Specification Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Change Propagation Due To Specification Dependencies</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies
	 * @generated
	 */
	EClass getReqChangePropagationDueToSpecificationDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies#getDecisionModifications <em>Decision Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies#getDecisionModifications()
	 * @see #getReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getReqChangePropagationDueToSpecificationDependencies_DecisionModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies#getOptionModifications <em>Option Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies#getOptionModifications()
	 * @see #getReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getReqChangePropagationDueToSpecificationDependencies_OptionModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies#getRequirementModifications <em>Requirement Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies#getRequirementModifications()
	 * @see #getReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getReqChangePropagationDueToSpecificationDependencies_RequirementModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies#getDataTypeModifications <em>Data Type Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Type Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies#getDataTypeModifications()
	 * @see #getReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getReqChangePropagationDueToSpecificationDependencies_DataTypeModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies#getEntityModifications <em>Entity Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies#getEntityModifications()
	 * @see #getReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getReqChangePropagationDueToSpecificationDependencies_EntityModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyEntity <em>Req Modify Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Modify Entity</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyEntity
	 * @generated
	 */
	EClass getReqModifyEntity();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyTraceableObject <em>Req Modify Traceable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Modify Traceable Object</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyTraceableObject
	 * @generated
	 */
	EClass getReqModifyTraceableObject();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyRequirement <em>Req Modify Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Modify Requirement</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyRequirement
	 * @generated
	 */
	EClass getReqModifyRequirement();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyDecision <em>Req Modify Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Modify Decision</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyDecision
	 * @generated
	 */
	EClass getReqModifyDecision();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyOption <em>Req Modify Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Modify Option</em>'.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyOption
	 * @generated
	 */
	EClass getReqModifyOption();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReqModificationmarksFactory getReqModificationmarksFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationRepositoryImpl <em>Req Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqModificationRepository()
		 * @generated
		 */
		EClass REQ_MODIFICATION_REPOSITORY = eINSTANCE.getReqModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqSeedModificationsImpl <em>Req Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqSeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqSeedModifications()
		 * @generated
		 */
		EClass REQ_SEED_MODIFICATIONS = eINSTANCE.getReqSeedModifications();

		/**
		 * The meta object literal for the '<em><b>Requirement Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS = eINSTANCE.getReqSeedModifications_RequirementModifications();

		/**
		 * The meta object literal for the '<em><b>Decision Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS = eINSTANCE.getReqSeedModifications_DecisionModifications();

		/**
		 * The meta object literal for the '<em><b>Option Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS = eINSTANCE.getReqSeedModifications_OptionModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqChangePropagationDueToSpecificationDependenciesImpl <em>Req Change Propagation Due To Specification Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqChangePropagationDueToSpecificationDependenciesImpl
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqChangePropagationDueToSpecificationDependencies()
		 * @generated
		 */
		EClass REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES = eINSTANCE.getReqChangePropagationDueToSpecificationDependencies();

		/**
		 * The meta object literal for the '<em><b>Decision Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS = eINSTANCE.getReqChangePropagationDueToSpecificationDependencies_DecisionModifications();

		/**
		 * The meta object literal for the '<em><b>Option Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS = eINSTANCE.getReqChangePropagationDueToSpecificationDependencies_OptionModifications();

		/**
		 * The meta object literal for the '<em><b>Requirement Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS = eINSTANCE.getReqChangePropagationDueToSpecificationDependencies_RequirementModifications();

		/**
		 * The meta object literal for the '<em><b>Data Type Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DATA_TYPE_MODIFICATIONS = eINSTANCE.getReqChangePropagationDueToSpecificationDependencies_DataTypeModifications();

		/**
		 * The meta object literal for the '<em><b>Entity Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ENTITY_MODIFICATIONS = eINSTANCE.getReqChangePropagationDueToSpecificationDependencies_EntityModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyEntityImpl <em>Req Modify Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyEntityImpl
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqModifyEntity()
		 * @generated
		 */
		EClass REQ_MODIFY_ENTITY = eINSTANCE.getReqModifyEntity();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyTraceableObjectImpl <em>Req Modify Traceable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyTraceableObjectImpl
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqModifyTraceableObject()
		 * @generated
		 */
		EClass REQ_MODIFY_TRACEABLE_OBJECT = eINSTANCE.getReqModifyTraceableObject();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyRequirementImpl <em>Req Modify Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyRequirementImpl
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqModifyRequirement()
		 * @generated
		 */
		EClass REQ_MODIFY_REQUIREMENT = eINSTANCE.getReqModifyRequirement();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyDecisionImpl <em>Req Modify Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyDecisionImpl
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqModifyDecision()
		 * @generated
		 */
		EClass REQ_MODIFY_DECISION = eINSTANCE.getReqModifyDecision();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyOptionImpl <em>Req Modify Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModifyOptionImpl
		 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqModificationmarksPackageImpl#getReqModifyOption()
		 * @generated
		 */
		EClass REQ_MODIFY_OPTION = eINSTANCE.getReqModifyOption();

	}

} //ReqModificationmarksPackage
