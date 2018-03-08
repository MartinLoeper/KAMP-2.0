/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage;

import de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage;

import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPGood;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPOrganizationalUnit;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPTrainingCourse;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPFieldOfActivityAnnotationsPackageImpl extends EPackageImpl implements BPFieldOfActivityAnnotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpFieldOfActivityAnnotationsRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpUserActionAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpGoodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpOrganizationalUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpTrainingCourseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpBusinessProcessSpecificationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BPFieldOfActivityAnnotationsPackageImpl() {
		super(eNS_URI, BPFieldOfActivityAnnotationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BPFieldOfActivityAnnotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BPFieldOfActivityAnnotationsPackage init() {
		if (isInited) return (BPFieldOfActivityAnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(BPFieldOfActivityAnnotationsPackage.eNS_URI);

		// Obtain or create and register package
		BPFieldOfActivityAnnotationsPackageImpl theBPFieldOfActivityAnnotationsPackage = (BPFieldOfActivityAnnotationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BPFieldOfActivityAnnotationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BPFieldOfActivityAnnotationsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BpusagemodelPackage.eINSTANCE.eClass();
		OrganizationenvironmentmodelPackage.eINSTANCE.eClass();
		DatamodelPackage.eINSTANCE.eClass();
		ISFieldOfActivityAnnotationsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBPFieldOfActivityAnnotationsPackage.createPackageContents();

		// Initialize created meta-data
		theBPFieldOfActivityAnnotationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBPFieldOfActivityAnnotationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BPFieldOfActivityAnnotationsPackage.eNS_URI, theBPFieldOfActivityAnnotationsPackage);
		return theBPFieldOfActivityAnnotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPFieldOfActivityAnnotationsRepository() {
		return bpFieldOfActivityAnnotationsRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPFieldOfActivityAnnotationsRepository_BusinessProcessSpecification() {
		return (EReference)bpFieldOfActivityAnnotationsRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPUserActionAnnotation() {
		return bpUserActionAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPUserActionAnnotation_Parent() {
		return (EReference)bpUserActionAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPUserActionAnnotation_AnnotatedUserActions() {
		return (EReference)bpUserActionAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPGood() {
		return bpGoodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPGood_ActorStep() {
		return (EReference)bpGoodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMessage() {
		return bpMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMessage_Sender() {
		return (EReference)bpMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMessage_Receiver() {
		return (EReference)bpMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPOrganizationalUnit() {
		return bpOrganizationalUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPOrganizationalUnit_AbstractUserAction() {
		return (EReference)bpOrganizationalUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPTrainingCourse() {
		return bpTrainingCourseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPTrainingCourse_ActorStep() {
		return (EReference)bpTrainingCourseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPBusinessProcessSpecification() {
		return bpBusinessProcessSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPBusinessProcessSpecification_Parent() {
		return (EReference)bpBusinessProcessSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPBusinessProcessSpecification_UserActionAnnotations() {
		return (EReference)bpBusinessProcessSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPFieldOfActivityAnnotationsFactory getBPFieldOfActivityAnnotationsFactory() {
		return (BPFieldOfActivityAnnotationsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bpFieldOfActivityAnnotationsRepositoryEClass = createEClass(BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY);
		createEReference(bpFieldOfActivityAnnotationsRepositoryEClass, BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUSINESS_PROCESS_SPECIFICATION);

		bpUserActionAnnotationEClass = createEClass(BP_USER_ACTION_ANNOTATION);
		createEReference(bpUserActionAnnotationEClass, BP_USER_ACTION_ANNOTATION__PARENT);
		createEReference(bpUserActionAnnotationEClass, BP_USER_ACTION_ANNOTATION__ANNOTATED_USER_ACTIONS);

		bpGoodEClass = createEClass(BP_GOOD);
		createEReference(bpGoodEClass, BP_GOOD__ACTOR_STEP);

		bpMessageEClass = createEClass(BP_MESSAGE);
		createEReference(bpMessageEClass, BP_MESSAGE__SENDER);
		createEReference(bpMessageEClass, BP_MESSAGE__RECEIVER);

		bpOrganizationalUnitEClass = createEClass(BP_ORGANIZATIONAL_UNIT);
		createEReference(bpOrganizationalUnitEClass, BP_ORGANIZATIONAL_UNIT__ABSTRACT_USER_ACTION);

		bpTrainingCourseEClass = createEClass(BP_TRAINING_COURSE);
		createEReference(bpTrainingCourseEClass, BP_TRAINING_COURSE__ACTOR_STEP);

		bpBusinessProcessSpecificationEClass = createEClass(BP_BUSINESS_PROCESS_SPECIFICATION);
		createEReference(bpBusinessProcessSpecificationEClass, BP_BUSINESS_PROCESS_SPECIFICATION__PARENT);
		createEReference(bpBusinessProcessSpecificationEClass, BP_BUSINESS_PROCESS_SPECIFICATION__USER_ACTION_ANNOTATIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ISFieldOfActivityAnnotationsPackage theISFieldOfActivityAnnotationsPackage = (ISFieldOfActivityAnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(ISFieldOfActivityAnnotationsPackage.eNS_URI);
		UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		BpusagemodelPackage theBpusagemodelPackage = (BpusagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(BpusagemodelPackage.eNS_URI);

		// Create type parameters
		ETypeParameter bpUserActionAnnotationEClass_T = addETypeParameter(bpUserActionAnnotationEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theUsagemodelPackage.getAbstractUserAction());
		bpUserActionAnnotationEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		bpFieldOfActivityAnnotationsRepositoryEClass.getESuperTypes().add(theISFieldOfActivityAnnotationsPackage.getISFieldOfActivityAnnotationsRepository());
		bpUserActionAnnotationEClass.getESuperTypes().add(theEntityPackage.getNamedElement());
		g1 = createEGenericType(this.getBPUserActionAnnotation());
		EGenericType g2 = createEGenericType(theUsagemodelPackage.getAbstractUserAction());
		g1.getETypeArguments().add(g2);
		bpGoodEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBPUserActionAnnotation());
		g2 = createEGenericType(theUsagemodelPackage.getAbstractUserAction());
		g1.getETypeArguments().add(g2);
		bpMessageEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBPUserActionAnnotation());
		g2 = createEGenericType(theBpusagemodelPackage.getActivity());
		g1.getETypeArguments().add(g2);
		bpOrganizationalUnitEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBPUserActionAnnotation());
		g2 = createEGenericType(theBpusagemodelPackage.getActorStep());
		g1.getETypeArguments().add(g2);
		bpTrainingCourseEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(bpFieldOfActivityAnnotationsRepositoryEClass, BPFieldOfActivityAnnotationsRepository.class, "BPFieldOfActivityAnnotationsRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPFieldOfActivityAnnotationsRepository_BusinessProcessSpecification(), this.getBPBusinessProcessSpecification(), this.getBPBusinessProcessSpecification_Parent(), "businessProcessSpecification", null, 0, 1, BPFieldOfActivityAnnotationsRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpUserActionAnnotationEClass, BPUserActionAnnotation.class, "BPUserActionAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPUserActionAnnotation_Parent(), this.getBPBusinessProcessSpecification(), this.getBPBusinessProcessSpecification_UserActionAnnotations(), "parent", null, 1, 1, BPUserActionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(bpUserActionAnnotationEClass_T);
		initEReference(getBPUserActionAnnotation_AnnotatedUserActions(), g1, null, "annotatedUserActions", null, 0, -1, BPUserActionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpGoodEClass, BPGood.class, "BPGood", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPGood_ActorStep(), theBpusagemodelPackage.getActorStep(), null, "actorStep", null, 0, 1, BPGood.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpMessageEClass, BPMessage.class, "BPMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPMessage_Sender(), theBpusagemodelPackage.getActorStep(), null, "sender", null, 0, 1, BPMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPMessage_Receiver(), theBpusagemodelPackage.getActorStep(), null, "receiver", null, 0, 1, BPMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpOrganizationalUnitEClass, BPOrganizationalUnit.class, "BPOrganizationalUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPOrganizationalUnit_AbstractUserAction(), theUsagemodelPackage.getAbstractUserAction(), null, "abstractUserAction", null, 0, 1, BPOrganizationalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpTrainingCourseEClass, BPTrainingCourse.class, "BPTrainingCourse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPTrainingCourse_ActorStep(), theBpusagemodelPackage.getActorStep(), null, "actorStep", null, 0, 1, BPTrainingCourse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpBusinessProcessSpecificationEClass, BPBusinessProcessSpecification.class, "BPBusinessProcessSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPBusinessProcessSpecification_Parent(), this.getBPFieldOfActivityAnnotationsRepository(), this.getBPFieldOfActivityAnnotationsRepository_BusinessProcessSpecification(), "parent", null, 1, 1, BPBusinessProcessSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getBPUserActionAnnotation());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getBPBusinessProcessSpecification_UserActionAnnotations(), g1, this.getBPUserActionAnnotation_Parent(), "userActionAnnotations", null, 0, -1, BPBusinessProcessSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BPFieldOfActivityAnnotationsPackageImpl
