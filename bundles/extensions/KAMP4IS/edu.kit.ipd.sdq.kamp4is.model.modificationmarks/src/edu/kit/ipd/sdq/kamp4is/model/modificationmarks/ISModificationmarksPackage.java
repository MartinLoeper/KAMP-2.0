/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksFactory
 * @model kind="package"
 * @generated
 */
public interface ISModificationmarksPackage extends EPackage {
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
	String eNS_URI = "http://sdq.ipd.kit.edu/KAMP4ISModificationmarks/1.0";

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
	ISModificationmarksPackage eINSTANCE = edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.AbstractISModificationRepositoryImpl <em>Abstract IS Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.AbstractISModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getAbstractISModificationRepository()
	 * @generated
	 */
	int ABSTRACT_IS_MODIFICATION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>Abstract IS Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IS_MODIFICATION_REPOSITORY_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract IS Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IS_MODIFICATION_REPOSITORY_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationRepositoryImpl <em>IS Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModificationRepository()
	 * @generated
	 */
	int IS_MODIFICATION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ABSTRACT_IS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ABSTRACT_IS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>IS Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFICATION_REPOSITORY_FEATURE_COUNT = ABSTRACT_IS_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IS Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFICATION_REPOSITORY_OPERATION_COUNT = ABSTRACT_IS_MODIFICATION_REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISSeedModificationsImpl <em>IS Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISSeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISSeedModifications()
	 * @generated
	 */
	int IS_SEED_MODIFICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Data Type Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SEED_MODIFICATIONS__DATA_TYPE_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signature Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SEED_MODIFICATIONS__SIGNATURE_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IS Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SEED_MODIFICATIONS_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>IS Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SEED_MODIFICATIONS_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISChangePropagationDueToDataDependenciesImpl <em>IS Change Propagation Due To Data Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISChangePropagationDueToDataDependenciesImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISChangePropagationDueToDataDependencies()
	 * @generated
	 */
	int IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES = 3;

	/**
	 * The feature id for the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__INTERFACE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATATYPE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS Change Propagation Due To Data Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES_FEATURE_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IS Change Propagation Due To Data Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES_OPERATION_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISChangePropagationDueToInterfaceDependenciesImpl <em>IS Change Propagation Due To Interface Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISChangePropagationDueToInterfaceDependenciesImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISChangePropagationDueToInterfaceDependencies()
	 * @generated
	 */
	int IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES = 4;

	/**
	 * The feature id for the '<em><b>Component Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signature Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__SIGNATURE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS Change Propagation Due To Interface Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES_FEATURE_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IS Change Propagation Due To Interface Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES_OPERATION_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISIntercomponentPropagationImpl <em>IS Intercomponent Propagation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISIntercomponentPropagationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISIntercomponentPropagation()
	 * @generated
	 */
	int IS_INTERCOMPONENT_PROPAGATION = 5;

	/**
	 * The feature id for the '<em><b>Connector Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTERCOMPONENT_PROPAGATION__CONNECTOR_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IS Intercomponent Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTERCOMPONENT_PROPAGATION_FEATURE_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IS Intercomponent Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTERCOMPONENT_PROPAGATION_OPERATION_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISIntracomponentPropagationImpl <em>IS Intracomponent Propagation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISIntracomponentPropagationImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISIntracomponentPropagation()
	 * @generated
	 */
	int IS_INTRACOMPONENT_PROPAGATION = 6;

	/**
	 * The feature id for the '<em><b>Component Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTRACOMPONENT_PROPAGATION__COMPONENT_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IS Intracomponent Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTRACOMPONENT_PROPAGATION_FEATURE_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IS Intracomponent Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INTRACOMPONENT_PROPAGATION_OPERATION_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyDataTypeImpl <em>IS Modify Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyDataTypeImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyDataType()
	 * @generated
	 */
	int IS_MODIFY_DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_DATA_TYPE__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_DATA_TYPE__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_DATA_TYPE__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_DATA_TYPE__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_DATA_TYPE__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IS Modify Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_DATA_TYPE_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IS Modify Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_DATA_TYPE_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyEntityImpl <em>IS Modify Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyEntityImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyEntity()
	 * @generated
	 */
	int IS_MODIFY_ENTITY = 8;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_ENTITY__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_ENTITY__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_ENTITY__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_ENTITY__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_ENTITY__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IS Modify Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_ENTITY_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IS Modify Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_ENTITY_OPERATION_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyComponentImpl <em>IS Modify Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyComponentImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyComponent()
	 * @generated
	 */
	int IS_MODIFY_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_COMPONENT__AFFECTED_ELEMENT = IS_MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_COMPONENT__CAUSING_ELEMENTS = IS_MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_COMPONENT__ID = IS_MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_COMPONENT__TOOLDERIVED = IS_MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_COMPONENT__USER_DECISION = IS_MODIFY_ENTITY__USER_DECISION;

	/**
	 * The feature id for the '<em><b>Provided Role Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_COMPONENT__PROVIDED_ROLE_MODIFICATIONS = IS_MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Role Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_COMPONENT__REQUIRED_ROLE_MODIFICATIONS = IS_MODIFY_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IS Modify Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_COMPONENT_FEATURE_COUNT = IS_MODIFY_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IS Modify Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_COMPONENT_OPERATION_COUNT = IS_MODIFY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyConnectorImpl <em>IS Modify Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyConnectorImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyConnector()
	 * @generated
	 */
	int IS_MODIFY_CONNECTOR = 10;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_CONNECTOR__AFFECTED_ELEMENT = IS_MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_CONNECTOR__CAUSING_ELEMENTS = IS_MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_CONNECTOR__ID = IS_MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_CONNECTOR__TOOLDERIVED = IS_MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_CONNECTOR__USER_DECISION = IS_MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IS Modify Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_CONNECTOR_FEATURE_COUNT = IS_MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IS Modify Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_CONNECTOR_OPERATION_COUNT = IS_MODIFY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyRoleImpl <em>IS Modify Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyRoleImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyRole()
	 * @generated
	 */
	int IS_MODIFY_ROLE = 11;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_ROLE__AFFECTED_ELEMENT = IS_MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_ROLE__CAUSING_ELEMENTS = IS_MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_ROLE__ID = IS_MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_ROLE__TOOLDERIVED = IS_MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_ROLE__USER_DECISION = IS_MODIFY_ENTITY__USER_DECISION;

	/**
	 * The feature id for the '<em><b>Signature Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_ROLE__SIGNATURE_MODIFICATIONS = IS_MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IS Modify Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_ROLE_FEATURE_COUNT = IS_MODIFY_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IS Modify Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_ROLE_OPERATION_COUNT = IS_MODIFY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyProvidedRoleImpl <em>IS Modify Provided Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyProvidedRoleImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyProvidedRole()
	 * @generated
	 */
	int IS_MODIFY_PROVIDED_ROLE = 12;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_PROVIDED_ROLE__AFFECTED_ELEMENT = IS_MODIFY_ROLE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_PROVIDED_ROLE__CAUSING_ELEMENTS = IS_MODIFY_ROLE__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_PROVIDED_ROLE__ID = IS_MODIFY_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_PROVIDED_ROLE__TOOLDERIVED = IS_MODIFY_ROLE__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_PROVIDED_ROLE__USER_DECISION = IS_MODIFY_ROLE__USER_DECISION;

	/**
	 * The feature id for the '<em><b>Signature Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_PROVIDED_ROLE__SIGNATURE_MODIFICATIONS = IS_MODIFY_ROLE__SIGNATURE_MODIFICATIONS;

	/**
	 * The number of structural features of the '<em>IS Modify Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_PROVIDED_ROLE_FEATURE_COUNT = IS_MODIFY_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IS Modify Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_PROVIDED_ROLE_OPERATION_COUNT = IS_MODIFY_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyRequiredRoleImpl <em>IS Modify Required Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyRequiredRoleImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyRequiredRole()
	 * @generated
	 */
	int IS_MODIFY_REQUIRED_ROLE = 13;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_REQUIRED_ROLE__AFFECTED_ELEMENT = IS_MODIFY_ROLE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_REQUIRED_ROLE__CAUSING_ELEMENTS = IS_MODIFY_ROLE__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_REQUIRED_ROLE__ID = IS_MODIFY_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_REQUIRED_ROLE__TOOLDERIVED = IS_MODIFY_ROLE__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_REQUIRED_ROLE__USER_DECISION = IS_MODIFY_ROLE__USER_DECISION;

	/**
	 * The feature id for the '<em><b>Signature Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_REQUIRED_ROLE__SIGNATURE_MODIFICATIONS = IS_MODIFY_ROLE__SIGNATURE_MODIFICATIONS;

	/**
	 * The number of structural features of the '<em>IS Modify Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_REQUIRED_ROLE_FEATURE_COUNT = IS_MODIFY_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IS Modify Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_REQUIRED_ROLE_OPERATION_COUNT = IS_MODIFY_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyInterfaceImpl <em>IS Modify Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyInterfaceImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyInterface()
	 * @generated
	 */
	int IS_MODIFY_INTERFACE = 14;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_INTERFACE__AFFECTED_ELEMENT = IS_MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_INTERFACE__CAUSING_ELEMENTS = IS_MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_INTERFACE__ID = IS_MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_INTERFACE__TOOLDERIVED = IS_MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_INTERFACE__USER_DECISION = IS_MODIFY_ENTITY__USER_DECISION;

	/**
	 * The feature id for the '<em><b>Signature Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_INTERFACE__SIGNATURE_MODIFICATIONS = IS_MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IS Modify Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_INTERFACE_FEATURE_COUNT = IS_MODIFY_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IS Modify Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_INTERFACE_OPERATION_COUNT = IS_MODIFY_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifySignatureImpl <em>IS Modify Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifySignatureImpl
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifySignature()
	 * @generated
	 */
	int IS_MODIFY_SIGNATURE = 15;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_SIGNATURE__AFFECTED_ELEMENT = IS_MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_SIGNATURE__CAUSING_ELEMENTS = IS_MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_SIGNATURE__ID = IS_MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_SIGNATURE__TOOLDERIVED = IS_MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_SIGNATURE__USER_DECISION = IS_MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>IS Modify Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_SIGNATURE_FEATURE_COUNT = IS_MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IS Modify Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFY_SIGNATURE_OPERATION_COUNT = IS_MODIFY_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository <em>Abstract IS Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract IS Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository
	 * @generated
	 */
	EClass getAbstractISModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationRepository <em>IS Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationRepository
	 * @generated
	 */
	EClass getISModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications <em>IS Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications
	 * @generated
	 */
	EClass getISSeedModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications#getDataTypeModifications <em>Data Type Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Type Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications#getDataTypeModifications()
	 * @see #getISSeedModifications()
	 * @generated
	 */
	EReference getISSeedModifications_DataTypeModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications#getSignatureModifications <em>Signature Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signature Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications#getSignatureModifications()
	 * @see #getISSeedModifications()
	 * @generated
	 */
	EReference getISSeedModifications_SignatureModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications#getInterfaceModifications <em>Interface Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications#getInterfaceModifications()
	 * @see #getISSeedModifications()
	 * @generated
	 */
	EReference getISSeedModifications_InterfaceModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications#getComponentModifications <em>Component Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications#getComponentModifications()
	 * @see #getISSeedModifications()
	 * @generated
	 */
	EReference getISSeedModifications_ComponentModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies <em>IS Change Propagation Due To Data Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Change Propagation Due To Data Dependencies</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies
	 * @generated
	 */
	EClass getISChangePropagationDueToDataDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies#getInterfaceModifications <em>Interface Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies#getInterfaceModifications()
	 * @see #getISChangePropagationDueToDataDependencies()
	 * @generated
	 */
	EReference getISChangePropagationDueToDataDependencies_InterfaceModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies#getDatatypeModifications <em>Datatype Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatype Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies#getDatatypeModifications()
	 * @see #getISChangePropagationDueToDataDependencies()
	 * @generated
	 */
	EReference getISChangePropagationDueToDataDependencies_DatatypeModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToInterfaceDependencies <em>IS Change Propagation Due To Interface Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Change Propagation Due To Interface Dependencies</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToInterfaceDependencies
	 * @generated
	 */
	EClass getISChangePropagationDueToInterfaceDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToInterfaceDependencies#getComponentModifications <em>Component Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToInterfaceDependencies#getComponentModifications()
	 * @see #getISChangePropagationDueToInterfaceDependencies()
	 * @generated
	 */
	EReference getISChangePropagationDueToInterfaceDependencies_ComponentModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToInterfaceDependencies#getSignatureModifications <em>Signature Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signature Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToInterfaceDependencies#getSignatureModifications()
	 * @see #getISChangePropagationDueToInterfaceDependencies()
	 * @generated
	 */
	EReference getISChangePropagationDueToInterfaceDependencies_SignatureModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntercomponentPropagation <em>IS Intercomponent Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Intercomponent Propagation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntercomponentPropagation
	 * @generated
	 */
	EClass getISIntercomponentPropagation();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntercomponentPropagation#getConnectorModifications <em>Connector Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntercomponentPropagation#getConnectorModifications()
	 * @see #getISIntercomponentPropagation()
	 * @generated
	 */
	EReference getISIntercomponentPropagation_ConnectorModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntracomponentPropagation <em>IS Intracomponent Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Intracomponent Propagation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntracomponentPropagation
	 * @generated
	 */
	EClass getISIntracomponentPropagation();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntracomponentPropagation#getComponentModifications <em>Component Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntracomponentPropagation#getComponentModifications()
	 * @see #getISIntracomponentPropagation()
	 * @generated
	 */
	EReference getISIntracomponentPropagation_ComponentModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType <em>IS Modify Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Modify Data Type</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType
	 * @generated
	 */
	EClass getISModifyDataType();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyEntity <em>IS Modify Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Modify Entity</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyEntity
	 * @generated
	 */
	EClass getISModifyEntity();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent <em>IS Modify Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Modify Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent
	 * @generated
	 */
	EClass getISModifyComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent#getProvidedRoleModifications <em>Provided Role Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Role Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent#getProvidedRoleModifications()
	 * @see #getISModifyComponent()
	 * @generated
	 */
	EReference getISModifyComponent_ProvidedRoleModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent#getRequiredRoleModifications <em>Required Role Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Role Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent#getRequiredRoleModifications()
	 * @see #getISModifyComponent()
	 * @generated
	 */
	EReference getISModifyComponent_RequiredRoleModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyConnector <em>IS Modify Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Modify Connector</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyConnector
	 * @generated
	 */
	EClass getISModifyConnector();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRole <em>IS Modify Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Modify Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRole
	 * @generated
	 */
	EClass getISModifyRole();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRole#getSignatureModifications <em>Signature Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signature Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRole#getSignatureModifications()
	 * @see #getISModifyRole()
	 * @generated
	 */
	EReference getISModifyRole_SignatureModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyProvidedRole <em>IS Modify Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Modify Provided Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyProvidedRole
	 * @generated
	 */
	EClass getISModifyProvidedRole();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRequiredRole <em>IS Modify Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Modify Required Role</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRequiredRole
	 * @generated
	 */
	EClass getISModifyRequiredRole();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyInterface <em>IS Modify Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Modify Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyInterface
	 * @generated
	 */
	EClass getISModifyInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyInterface#getSignatureModifications <em>Signature Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signature Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyInterface#getSignatureModifications()
	 * @see #getISModifyInterface()
	 * @generated
	 */
	EReference getISModifyInterface_SignatureModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature <em>IS Modify Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IS Modify Signature</em>'.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature
	 * @generated
	 */
	EClass getISModifySignature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ISModificationmarksFactory getISModificationmarksFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.AbstractISModificationRepositoryImpl <em>Abstract IS Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.AbstractISModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getAbstractISModificationRepository()
		 * @generated
		 */
		EClass ABSTRACT_IS_MODIFICATION_REPOSITORY = eINSTANCE.getAbstractISModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationRepositoryImpl <em>IS Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModificationRepository()
		 * @generated
		 */
		EClass IS_MODIFICATION_REPOSITORY = eINSTANCE.getISModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISSeedModificationsImpl <em>IS Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISSeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISSeedModifications()
		 * @generated
		 */
		EClass IS_SEED_MODIFICATIONS = eINSTANCE.getISSeedModifications();

		/**
		 * The meta object literal for the '<em><b>Data Type Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_SEED_MODIFICATIONS__DATA_TYPE_MODIFICATIONS = eINSTANCE.getISSeedModifications_DataTypeModifications();

		/**
		 * The meta object literal for the '<em><b>Signature Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_SEED_MODIFICATIONS__SIGNATURE_MODIFICATIONS = eINSTANCE.getISSeedModifications_SignatureModifications();

		/**
		 * The meta object literal for the '<em><b>Interface Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS = eINSTANCE.getISSeedModifications_InterfaceModifications();

		/**
		 * The meta object literal for the '<em><b>Component Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS = eINSTANCE.getISSeedModifications_ComponentModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISChangePropagationDueToDataDependenciesImpl <em>IS Change Propagation Due To Data Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISChangePropagationDueToDataDependenciesImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISChangePropagationDueToDataDependencies()
		 * @generated
		 */
		EClass IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES = eINSTANCE.getISChangePropagationDueToDataDependencies();

		/**
		 * The meta object literal for the '<em><b>Interface Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__INTERFACE_MODIFICATIONS = eINSTANCE.getISChangePropagationDueToDataDependencies_InterfaceModifications();

		/**
		 * The meta object literal for the '<em><b>Datatype Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATATYPE_MODIFICATIONS = eINSTANCE.getISChangePropagationDueToDataDependencies_DatatypeModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISChangePropagationDueToInterfaceDependenciesImpl <em>IS Change Propagation Due To Interface Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISChangePropagationDueToInterfaceDependenciesImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISChangePropagationDueToInterfaceDependencies()
		 * @generated
		 */
		EClass IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES = eINSTANCE.getISChangePropagationDueToInterfaceDependencies();

		/**
		 * The meta object literal for the '<em><b>Component Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS = eINSTANCE.getISChangePropagationDueToInterfaceDependencies_ComponentModifications();

		/**
		 * The meta object literal for the '<em><b>Signature Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__SIGNATURE_MODIFICATIONS = eINSTANCE.getISChangePropagationDueToInterfaceDependencies_SignatureModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISIntercomponentPropagationImpl <em>IS Intercomponent Propagation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISIntercomponentPropagationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISIntercomponentPropagation()
		 * @generated
		 */
		EClass IS_INTERCOMPONENT_PROPAGATION = eINSTANCE.getISIntercomponentPropagation();

		/**
		 * The meta object literal for the '<em><b>Connector Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_INTERCOMPONENT_PROPAGATION__CONNECTOR_MODIFICATIONS = eINSTANCE.getISIntercomponentPropagation_ConnectorModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISIntracomponentPropagationImpl <em>IS Intracomponent Propagation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISIntracomponentPropagationImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISIntracomponentPropagation()
		 * @generated
		 */
		EClass IS_INTRACOMPONENT_PROPAGATION = eINSTANCE.getISIntracomponentPropagation();

		/**
		 * The meta object literal for the '<em><b>Component Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_INTRACOMPONENT_PROPAGATION__COMPONENT_MODIFICATIONS = eINSTANCE.getISIntracomponentPropagation_ComponentModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyDataTypeImpl <em>IS Modify Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyDataTypeImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyDataType()
		 * @generated
		 */
		EClass IS_MODIFY_DATA_TYPE = eINSTANCE.getISModifyDataType();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyEntityImpl <em>IS Modify Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyEntityImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyEntity()
		 * @generated
		 */
		EClass IS_MODIFY_ENTITY = eINSTANCE.getISModifyEntity();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyComponentImpl <em>IS Modify Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyComponentImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyComponent()
		 * @generated
		 */
		EClass IS_MODIFY_COMPONENT = eINSTANCE.getISModifyComponent();

		/**
		 * The meta object literal for the '<em><b>Provided Role Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_MODIFY_COMPONENT__PROVIDED_ROLE_MODIFICATIONS = eINSTANCE.getISModifyComponent_ProvidedRoleModifications();

		/**
		 * The meta object literal for the '<em><b>Required Role Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_MODIFY_COMPONENT__REQUIRED_ROLE_MODIFICATIONS = eINSTANCE.getISModifyComponent_RequiredRoleModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyConnectorImpl <em>IS Modify Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyConnectorImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyConnector()
		 * @generated
		 */
		EClass IS_MODIFY_CONNECTOR = eINSTANCE.getISModifyConnector();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyRoleImpl <em>IS Modify Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyRoleImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyRole()
		 * @generated
		 */
		EClass IS_MODIFY_ROLE = eINSTANCE.getISModifyRole();

		/**
		 * The meta object literal for the '<em><b>Signature Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_MODIFY_ROLE__SIGNATURE_MODIFICATIONS = eINSTANCE.getISModifyRole_SignatureModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyProvidedRoleImpl <em>IS Modify Provided Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyProvidedRoleImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyProvidedRole()
		 * @generated
		 */
		EClass IS_MODIFY_PROVIDED_ROLE = eINSTANCE.getISModifyProvidedRole();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyRequiredRoleImpl <em>IS Modify Required Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyRequiredRoleImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyRequiredRole()
		 * @generated
		 */
		EClass IS_MODIFY_REQUIRED_ROLE = eINSTANCE.getISModifyRequiredRole();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyInterfaceImpl <em>IS Modify Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyInterfaceImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifyInterface()
		 * @generated
		 */
		EClass IS_MODIFY_INTERFACE = eINSTANCE.getISModifyInterface();

		/**
		 * The meta object literal for the '<em><b>Signature Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_MODIFY_INTERFACE__SIGNATURE_MODIFICATIONS = eINSTANCE.getISModifyInterface_SignatureModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifySignatureImpl <em>IS Modify Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifySignatureImpl
		 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModificationmarksPackageImpl#getISModifySignature()
		 * @generated
		 */
		EClass IS_MODIFY_SIGNATURE = eINSTANCE.getISModifySignature();

	}

} //ISModificationmarksPackage
