/**
 */
package requirements.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import glossary.GlossaryPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualities.QualitiesPackage;

import relations.RelationsPackage;

import requirements.Constraint;
import requirements.FunctionalRequirement;
import requirements.ProcessRequirement;
import requirements.ProcessRequirements;
import requirements.ProjectRequirement;
import requirements.ProjectRequirements;
import requirements.QualityRequirement;
import requirements.ReqPriorityEnum;
import requirements.ReqRepository;
import requirements.ReqStatusEnum;
import requirements.Requirement;
import requirements.RequirementsFactory;
import requirements.RequirementsPackage;
import requirements.SystemRequirement;
import requirements.SystemRequirements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsPackageImpl extends EPackageImpl implements RequirementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reqPriorityEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reqStatusEnumEEnum = null;

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
	 * @see requirements.RequirementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementsPackageImpl() {
		super(eNS_URI, RequirementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RequirementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementsPackage init() {
		if (isInited) return (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);

		// Obtain or create and register package
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RequirementsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GlossaryPackage.eINSTANCE.eClass();
		QualitiesPackage.eINSTANCE.eClass();
		RelationsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRequirementsPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementsPackage.eNS_URI, theRequirementsPackage);
		return theRequirementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqRepository() {
		return reqRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReqRepository_Description() {
		return (EAttribute)reqRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqRepository_ProjectReqSection() {
		return (EReference)reqRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqRepository_ProcessReqSection() {
		return (EReference)reqRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqRepository_SystemReqSection() {
		return (EReference)reqRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Specification() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Priority() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Status() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_UsesTerms() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Repository() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectRequirement() {
		return projectRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemRequirement() {
		return systemRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessRequirement() {
		return processRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalRequirement() {
		return functionalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityRequirement() {
		return qualityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityRequirement_QualityType() {
		return (EReference)qualityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectRequirements() {
		return projectRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectRequirements_ProjectRequirements() {
		return (EReference)projectRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemRequirements() {
		return systemRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemRequirements_SystemRequirements() {
		return (EReference)systemRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessRequirements() {
		return processRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequirements_ProcessRrequirements() {
		return (EReference)processRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReqPriorityEnum() {
		return reqPriorityEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReqStatusEnum() {
		return reqStatusEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsFactory getRequirementsFactory() {
		return (RequirementsFactory)getEFactoryInstance();
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
		reqRepositoryEClass = createEClass(REQ_REPOSITORY);
		createEAttribute(reqRepositoryEClass, REQ_REPOSITORY__DESCRIPTION);
		createEReference(reqRepositoryEClass, REQ_REPOSITORY__PROJECT_REQ_SECTION);
		createEReference(reqRepositoryEClass, REQ_REPOSITORY__PROCESS_REQ_SECTION);
		createEReference(reqRepositoryEClass, REQ_REPOSITORY__SYSTEM_REQ_SECTION);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__SPECIFICATION);
		createEAttribute(requirementEClass, REQUIREMENT__PRIORITY);
		createEAttribute(requirementEClass, REQUIREMENT__STATUS);
		createEReference(requirementEClass, REQUIREMENT__USES_TERMS);
		createEReference(requirementEClass, REQUIREMENT__REPOSITORY);

		projectRequirementEClass = createEClass(PROJECT_REQUIREMENT);

		systemRequirementEClass = createEClass(SYSTEM_REQUIREMENT);

		processRequirementEClass = createEClass(PROCESS_REQUIREMENT);

		constraintEClass = createEClass(CONSTRAINT);

		functionalRequirementEClass = createEClass(FUNCTIONAL_REQUIREMENT);

		qualityRequirementEClass = createEClass(QUALITY_REQUIREMENT);
		createEReference(qualityRequirementEClass, QUALITY_REQUIREMENT__QUALITY_TYPE);

		projectRequirementsEClass = createEClass(PROJECT_REQUIREMENTS);
		createEReference(projectRequirementsEClass, PROJECT_REQUIREMENTS__PROJECT_REQUIREMENTS);

		systemRequirementsEClass = createEClass(SYSTEM_REQUIREMENTS);
		createEReference(systemRequirementsEClass, SYSTEM_REQUIREMENTS__SYSTEM_REQUIREMENTS);

		processRequirementsEClass = createEClass(PROCESS_REQUIREMENTS);
		createEReference(processRequirementsEClass, PROCESS_REQUIREMENTS__PROCESS_RREQUIREMENTS);

		// Create enums
		reqPriorityEnumEEnum = createEEnum(REQ_PRIORITY_ENUM);
		reqStatusEnumEEnum = createEEnum(REQ_STATUS_ENUM);
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
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		RelationsPackage theRelationsPackage = (RelationsPackage)EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI);
		GlossaryPackage theGlossaryPackage = (GlossaryPackage)EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);
		QualitiesPackage theQualitiesPackage = (QualitiesPackage)EPackage.Registry.INSTANCE.getEPackage(QualitiesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reqRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		requirementEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		requirementEClass.getESuperTypes().add(theRelationsPackage.getTraceableObject());
		projectRequirementEClass.getESuperTypes().add(this.getRequirement());
		systemRequirementEClass.getESuperTypes().add(this.getRequirement());
		processRequirementEClass.getESuperTypes().add(this.getRequirement());
		constraintEClass.getESuperTypes().add(this.getSystemRequirement());
		functionalRequirementEClass.getESuperTypes().add(this.getSystemRequirement());
		qualityRequirementEClass.getESuperTypes().add(this.getSystemRequirement());
		projectRequirementsEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		systemRequirementsEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		processRequirementsEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(reqRepositoryEClass, ReqRepository.class, "ReqRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReqRepository_Description(), ecorePackage.getEString(), "description", "Write a description here ...", 0, 1, ReqRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReqRepository_ProjectReqSection(), this.getProjectRequirements(), null, "projectReqSection", null, 0, 1, ReqRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReqRepository_ProcessReqSection(), this.getProcessRequirements(), null, "processReqSection", null, 0, 1, ReqRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReqRepository_SystemReqSection(), this.getSystemRequirements(), null, "systemReqSection", null, 0, 1, ReqRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Specification(), ecorePackage.getEString(), "specification", "Write a specification here ....", 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Priority(), this.getReqPriorityEnum(), "priority", "neutral", 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Status(), this.getReqStatusEnum(), "status", "new", 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_UsesTerms(), theGlossaryPackage.getGlossaryTerm(), null, "usesTerms", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Repository(), this.getReqRepository(), null, "repository", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectRequirementEClass, ProjectRequirement.class, "ProjectRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemRequirementEClass, SystemRequirement.class, "SystemRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processRequirementEClass, ProcessRequirement.class, "ProcessRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalRequirementEClass, FunctionalRequirement.class, "FunctionalRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qualityRequirementEClass, QualityRequirement.class, "QualityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityRequirement_QualityType(), theQualitiesPackage.getQualityType(), null, "qualityType", null, 1, -1, QualityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectRequirementsEClass, ProjectRequirements.class, "ProjectRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjectRequirements_ProjectRequirements(), this.getProjectRequirement(), null, "projectRequirements", null, 0, -1, ProjectRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemRequirementsEClass, SystemRequirements.class, "SystemRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemRequirements_SystemRequirements(), this.getSystemRequirement(), null, "systemRequirements", null, 0, -1, SystemRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processRequirementsEClass, ProcessRequirements.class, "ProcessRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessRequirements_ProcessRrequirements(), this.getProcessRequirement(), null, "processRrequirements", null, 0, -1, ProcessRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(reqPriorityEnumEEnum, ReqPriorityEnum.class, "ReqPriorityEnum");
		addEEnumLiteral(reqPriorityEnumEEnum, ReqPriorityEnum.NEUTRAL);
		addEEnumLiteral(reqPriorityEnumEEnum, ReqPriorityEnum.LOW);
		addEEnumLiteral(reqPriorityEnumEEnum, ReqPriorityEnum.HIGH);
		addEEnumLiteral(reqPriorityEnumEEnum, ReqPriorityEnum.CRITICAL);

		initEEnum(reqStatusEnumEEnum, ReqStatusEnum.class, "ReqStatusEnum");
		addEEnumLiteral(reqStatusEnumEEnum, ReqStatusEnum.NEW);
		addEEnumLiteral(reqStatusEnumEEnum, ReqStatusEnum.ACCEPTED);
		addEEnumLiteral(reqStatusEnumEEnum, ReqStatusEnum.REJECTED);
		addEEnumLiteral(reqStatusEnumEEnum, ReqStatusEnum.REPLACED);
		addEEnumLiteral(reqStatusEnumEEnum, ReqStatusEnum.DONE);

		// Create resource
		createResource(eNS_URI);
	}

} //RequirementsPackageImpl
