/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

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
 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsFactory
 * @model kind="package"
 * @generated
 */
public interface BPFieldOfActivityAnnotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fieldofactivityannotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/KAMP4BPFieldOfActivityAnnotations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fieldofactivityannotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BPFieldOfActivityAnnotationsPackage eINSTANCE = edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsPackageImpl#getBPFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	int BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Development Artefact Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION = ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEVELOPMENT_ARTEFACT_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Build Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION = ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Test Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION = ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TEST_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Release Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION = ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Deployment Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION = ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Staff Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION = ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Technology Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION = ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Design Pattern Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION = ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DESIGN_PATTERN_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Business Process Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUSINESS_PROCESS_SPECIFICATION = ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY_FEATURE_COUNT = ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPUserActionAnnotationImpl <em>BP User Action Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPUserActionAnnotationImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsPackageImpl#getBPUserActionAnnotation()
	 * @generated
	 */
	int BP_USER_ACTION_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_USER_ACTION_ANNOTATION__ENTITY_NAME = EntityPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_USER_ACTION_ANNOTATION__PARENT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotated User Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_USER_ACTION_ANNOTATION__ANNOTATED_USER_ACTIONS = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BP User Action Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_USER_ACTION_ANNOTATION_FEATURE_COUNT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPGoodImpl <em>BP Good</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPGoodImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsPackageImpl#getBPGood()
	 * @generated
	 */
	int BP_GOOD = 2;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_GOOD__ENTITY_NAME = BP_USER_ACTION_ANNOTATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_GOOD__PARENT = BP_USER_ACTION_ANNOTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Annotated User Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_GOOD__ANNOTATED_USER_ACTIONS = BP_USER_ACTION_ANNOTATION__ANNOTATED_USER_ACTIONS;

	/**
	 * The feature id for the '<em><b>Actor Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_GOOD__ACTOR_STEP = BP_USER_ACTION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BP Good</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_GOOD_FEATURE_COUNT = BP_USER_ACTION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPMessageImpl <em>BP Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPMessageImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsPackageImpl#getBPMessage()
	 * @generated
	 */
	int BP_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MESSAGE__ENTITY_NAME = BP_USER_ACTION_ANNOTATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MESSAGE__PARENT = BP_USER_ACTION_ANNOTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Annotated User Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MESSAGE__ANNOTATED_USER_ACTIONS = BP_USER_ACTION_ANNOTATION__ANNOTATED_USER_ACTIONS;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MESSAGE__SENDER = BP_USER_ACTION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MESSAGE__RECEIVER = BP_USER_ACTION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BP Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_MESSAGE_FEATURE_COUNT = BP_USER_ACTION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPOrganizationalUnitImpl <em>BP Organizational Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPOrganizationalUnitImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsPackageImpl#getBPOrganizationalUnit()
	 * @generated
	 */
	int BP_ORGANIZATIONAL_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORGANIZATIONAL_UNIT__ENTITY_NAME = BP_USER_ACTION_ANNOTATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORGANIZATIONAL_UNIT__PARENT = BP_USER_ACTION_ANNOTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Annotated User Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORGANIZATIONAL_UNIT__ANNOTATED_USER_ACTIONS = BP_USER_ACTION_ANNOTATION__ANNOTATED_USER_ACTIONS;

	/**
	 * The feature id for the '<em><b>Abstract User Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORGANIZATIONAL_UNIT__ABSTRACT_USER_ACTION = BP_USER_ACTION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BP Organizational Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_ORGANIZATIONAL_UNIT_FEATURE_COUNT = BP_USER_ACTION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPTrainingCourseImpl <em>BP Training Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPTrainingCourseImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsPackageImpl#getBPTrainingCourse()
	 * @generated
	 */
	int BP_TRAINING_COURSE = 5;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_TRAINING_COURSE__ENTITY_NAME = BP_USER_ACTION_ANNOTATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_TRAINING_COURSE__PARENT = BP_USER_ACTION_ANNOTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Annotated User Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_TRAINING_COURSE__ANNOTATED_USER_ACTIONS = BP_USER_ACTION_ANNOTATION__ANNOTATED_USER_ACTIONS;

	/**
	 * The feature id for the '<em><b>Actor Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_TRAINING_COURSE__ACTOR_STEP = BP_USER_ACTION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BP Training Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_TRAINING_COURSE_FEATURE_COUNT = BP_USER_ACTION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPBusinessProcessSpecificationImpl <em>BP Business Process Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPBusinessProcessSpecificationImpl
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsPackageImpl#getBPBusinessProcessSpecification()
	 * @generated
	 */
	int BP_BUSINESS_PROCESS_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_BUSINESS_PROCESS_SPECIFICATION__PARENT = 0;

	/**
	 * The feature id for the '<em><b>User Action Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_BUSINESS_PROCESS_SPECIFICATION__USER_ACTION_ANNOTATIONS = 1;

	/**
	 * The number of structural features of the '<em>BP Business Process Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BP_BUSINESS_PROCESS_SPECIFICATION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsRepository
	 * @generated
	 */
	EClass getBPFieldOfActivityAnnotationsRepository();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsRepository#getBusinessProcessSpecification <em>Business Process Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Process Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsRepository#getBusinessProcessSpecification()
	 * @see #getBPFieldOfActivityAnnotationsRepository()
	 * @generated
	 */
	EReference getBPFieldOfActivityAnnotationsRepository_BusinessProcessSpecification();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation <em>BP User Action Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP User Action Annotation</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation
	 * @generated
	 */
	EClass getBPUserActionAnnotation();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation#getParent()
	 * @see #getBPUserActionAnnotation()
	 * @generated
	 */
	EReference getBPUserActionAnnotation_Parent();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation#getAnnotatedUserActions <em>Annotated User Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotated User Actions</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation#getAnnotatedUserActions()
	 * @see #getBPUserActionAnnotation()
	 * @generated
	 */
	EReference getBPUserActionAnnotation_AnnotatedUserActions();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPGood <em>BP Good</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Good</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPGood
	 * @generated
	 */
	EClass getBPGood();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPGood#getActorStep <em>Actor Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor Step</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPGood#getActorStep()
	 * @see #getBPGood()
	 * @generated
	 */
	EReference getBPGood_ActorStep();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage <em>BP Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Message</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage
	 * @generated
	 */
	EClass getBPMessage();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage#getSender()
	 * @see #getBPMessage()
	 * @generated
	 */
	EReference getBPMessage_Sender();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage#getReceiver()
	 * @see #getBPMessage()
	 * @generated
	 */
	EReference getBPMessage_Receiver();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPOrganizationalUnit <em>BP Organizational Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Organizational Unit</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPOrganizationalUnit
	 * @generated
	 */
	EClass getBPOrganizationalUnit();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPOrganizationalUnit#getAbstractUserAction <em>Abstract User Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract User Action</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPOrganizationalUnit#getAbstractUserAction()
	 * @see #getBPOrganizationalUnit()
	 * @generated
	 */
	EReference getBPOrganizationalUnit_AbstractUserAction();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPTrainingCourse <em>BP Training Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Training Course</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPTrainingCourse
	 * @generated
	 */
	EClass getBPTrainingCourse();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPTrainingCourse#getActorStep <em>Actor Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor Step</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPTrainingCourse#getActorStep()
	 * @see #getBPTrainingCourse()
	 * @generated
	 */
	EReference getBPTrainingCourse_ActorStep();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification <em>BP Business Process Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BP Business Process Specification</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification
	 * @generated
	 */
	EClass getBPBusinessProcessSpecification();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification#getParent()
	 * @see #getBPBusinessProcessSpecification()
	 * @generated
	 */
	EReference getBPBusinessProcessSpecification_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification#getUserActionAnnotations <em>User Action Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Action Annotations</em>'.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification#getUserActionAnnotations()
	 * @see #getBPBusinessProcessSpecification()
	 * @generated
	 */
	EReference getBPBusinessProcessSpecification_UserActionAnnotations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BPFieldOfActivityAnnotationsFactory getBPFieldOfActivityAnnotationsFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsPackageImpl#getBPFieldOfActivityAnnotationsRepository()
		 * @generated
		 */
		EClass BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY = eINSTANCE.getBPFieldOfActivityAnnotationsRepository();

		/**
		 * The meta object literal for the '<em><b>Business Process Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUSINESS_PROCESS_SPECIFICATION = eINSTANCE.getBPFieldOfActivityAnnotationsRepository_BusinessProcessSpecification();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPUserActionAnnotationImpl <em>BP User Action Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPUserActionAnnotationImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsPackageImpl#getBPUserActionAnnotation()
		 * @generated
		 */
		EClass BP_USER_ACTION_ANNOTATION = eINSTANCE.getBPUserActionAnnotation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_USER_ACTION_ANNOTATION__PARENT = eINSTANCE.getBPUserActionAnnotation_Parent();

		/**
		 * The meta object literal for the '<em><b>Annotated User Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_USER_ACTION_ANNOTATION__ANNOTATED_USER_ACTIONS = eINSTANCE.getBPUserActionAnnotation_AnnotatedUserActions();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPGoodImpl <em>BP Good</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPGoodImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsPackageImpl#getBPGood()
		 * @generated
		 */
		EClass BP_GOOD = eINSTANCE.getBPGood();

		/**
		 * The meta object literal for the '<em><b>Actor Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_GOOD__ACTOR_STEP = eINSTANCE.getBPGood_ActorStep();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPMessageImpl <em>BP Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPMessageImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsPackageImpl#getBPMessage()
		 * @generated
		 */
		EClass BP_MESSAGE = eINSTANCE.getBPMessage();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_MESSAGE__SENDER = eINSTANCE.getBPMessage_Sender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_MESSAGE__RECEIVER = eINSTANCE.getBPMessage_Receiver();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPOrganizationalUnitImpl <em>BP Organizational Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPOrganizationalUnitImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsPackageImpl#getBPOrganizationalUnit()
		 * @generated
		 */
		EClass BP_ORGANIZATIONAL_UNIT = eINSTANCE.getBPOrganizationalUnit();

		/**
		 * The meta object literal for the '<em><b>Abstract User Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_ORGANIZATIONAL_UNIT__ABSTRACT_USER_ACTION = eINSTANCE.getBPOrganizationalUnit_AbstractUserAction();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPTrainingCourseImpl <em>BP Training Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPTrainingCourseImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsPackageImpl#getBPTrainingCourse()
		 * @generated
		 */
		EClass BP_TRAINING_COURSE = eINSTANCE.getBPTrainingCourse();

		/**
		 * The meta object literal for the '<em><b>Actor Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_TRAINING_COURSE__ACTOR_STEP = eINSTANCE.getBPTrainingCourse_ActorStep();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPBusinessProcessSpecificationImpl <em>BP Business Process Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPBusinessProcessSpecificationImpl
		 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsPackageImpl#getBPBusinessProcessSpecification()
		 * @generated
		 */
		EClass BP_BUSINESS_PROCESS_SPECIFICATION = eINSTANCE.getBPBusinessProcessSpecification();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_BUSINESS_PROCESS_SPECIFICATION__PARENT = eINSTANCE.getBPBusinessProcessSpecification_Parent();

		/**
		 * The meta object literal for the '<em><b>User Action Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BP_BUSINESS_PROCESS_SPECIFICATION__USER_ACTION_ANNOTATIONS = eINSTANCE.getBPBusinessProcessSpecification_UserActionAnnotations();

	}

} //BPFieldOfActivityAnnotationsPackage
