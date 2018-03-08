/**
 */
package edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl;

import decisions.DecisionsPackage;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationRepository;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyDecision;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyEntity;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyOption;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyRequirement;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyTraceableObject;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications;

import options.OptionsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import relations.RelationsPackage;

import requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqModificationmarksPackageImpl extends EPackageImpl implements ReqModificationmarksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqSeedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqChangePropagationDueToSpecificationDependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqModifyEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqModifyTraceableObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqModifyRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqModifyDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqModifyOptionEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReqModificationmarksPackageImpl() {
		super(eNS_URI, ReqModificationmarksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReqModificationmarksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReqModificationmarksPackage init() {
		if (isInited) return (ReqModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ReqModificationmarksPackage.eNS_URI);

		// Obtain or create and register package
		ReqModificationmarksPackageImpl theReqModificationmarksPackage = (ReqModificationmarksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReqModificationmarksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReqModificationmarksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BPModificationmarksPackage.eINSTANCE.eClass();
		DecisionsPackage.eINSTANCE.eClass();
		OptionsPackage.eINSTANCE.eClass();
		RequirementsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theReqModificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		theReqModificationmarksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReqModificationmarksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReqModificationmarksPackage.eNS_URI, theReqModificationmarksPackage);
		return theReqModificationmarksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqModificationRepository() {
		return reqModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqSeedModifications() {
		return reqSeedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqSeedModifications_RequirementModifications() {
		return (EReference)reqSeedModificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqSeedModifications_DecisionModifications() {
		return (EReference)reqSeedModificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqSeedModifications_OptionModifications() {
		return (EReference)reqSeedModificationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqChangePropagationDueToSpecificationDependencies() {
		return reqChangePropagationDueToSpecificationDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqChangePropagationDueToSpecificationDependencies_DecisionModifications() {
		return (EReference)reqChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqChangePropagationDueToSpecificationDependencies_OptionModifications() {
		return (EReference)reqChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqChangePropagationDueToSpecificationDependencies_RequirementModifications() {
		return (EReference)reqChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqChangePropagationDueToSpecificationDependencies_DataTypeModifications() {
		return (EReference)reqChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqChangePropagationDueToSpecificationDependencies_EntityModifications() {
		return (EReference)reqChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqModifyEntity() {
		return reqModifyEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqModifyTraceableObject() {
		return reqModifyTraceableObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqModifyRequirement() {
		return reqModifyRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqModifyDecision() {
		return reqModifyDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqModifyOption() {
		return reqModifyOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqModificationmarksFactory getReqModificationmarksFactory() {
		return (ReqModificationmarksFactory)getEFactoryInstance();
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
		reqModificationRepositoryEClass = createEClass(REQ_MODIFICATION_REPOSITORY);

		reqSeedModificationsEClass = createEClass(REQ_SEED_MODIFICATIONS);
		createEReference(reqSeedModificationsEClass, REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS);
		createEReference(reqSeedModificationsEClass, REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS);
		createEReference(reqSeedModificationsEClass, REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS);

		reqChangePropagationDueToSpecificationDependenciesEClass = createEClass(REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES);
		createEReference(reqChangePropagationDueToSpecificationDependenciesEClass, REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS);
		createEReference(reqChangePropagationDueToSpecificationDependenciesEClass, REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS);
		createEReference(reqChangePropagationDueToSpecificationDependenciesEClass, REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS);
		createEReference(reqChangePropagationDueToSpecificationDependenciesEClass, REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DATA_TYPE_MODIFICATIONS);
		createEReference(reqChangePropagationDueToSpecificationDependenciesEClass, REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ENTITY_MODIFICATIONS);

		reqModifyEntityEClass = createEClass(REQ_MODIFY_ENTITY);

		reqModifyTraceableObjectEClass = createEClass(REQ_MODIFY_TRACEABLE_OBJECT);

		reqModifyRequirementEClass = createEClass(REQ_MODIFY_REQUIREMENT);

		reqModifyDecisionEClass = createEClass(REQ_MODIFY_DECISION);

		reqModifyOptionEClass = createEClass(REQ_MODIFY_OPTION);
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
		ISModificationmarksPackage theISModificationmarksPackage = (ISModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ISModificationmarksPackage.eNS_URI);
		BPModificationmarksPackage theBPModificationmarksPackage = (BPModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(BPModificationmarksPackage.eNS_URI);
		ModificationmarksPackage theModificationmarksPackage = (ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ModificationmarksPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		RelationsPackage theRelationsPackage = (RelationsPackage)EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI);
		RequirementsPackage theRequirementsPackage = (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		DecisionsPackage theDecisionsPackage = (DecisionsPackage)EPackage.Registry.INSTANCE.getEPackage(DecisionsPackage.eNS_URI);
		OptionsPackage theOptionsPackage = (OptionsPackage)EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter reqModifyTraceableObjectEClass_T = addETypeParameter(reqModifyTraceableObjectEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theRelationsPackage.getTraceableObject());
		reqModifyTraceableObjectEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theISModificationmarksPackage.getAbstractISModificationRepository());
		EGenericType g2 = createEGenericType(this.getReqSeedModifications());
		g1.getETypeArguments().add(g2);
		reqModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		reqSeedModificationsEClass.getESuperTypes().add(theBPModificationmarksPackage.getBPSeedModifications());
		reqChangePropagationDueToSpecificationDependenciesEClass.getESuperTypes().add(theModificationmarksPackage.getChangePropagationStep());
		g1 = createEGenericType(theISModificationmarksPackage.getISModifyEntity());
		g2 = createEGenericType(theEntityPackage.getEntity());
		g1.getETypeArguments().add(g2);
		reqModifyEntityEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModification());
		g2 = createEGenericType(reqModifyTraceableObjectEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		reqModifyTraceableObjectEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getReqModifyTraceableObject());
		g2 = createEGenericType(theRequirementsPackage.getRequirement());
		g1.getETypeArguments().add(g2);
		reqModifyRequirementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getReqModifyTraceableObject());
		g2 = createEGenericType(theDecisionsPackage.getDecision());
		g1.getETypeArguments().add(g2);
		reqModifyDecisionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getReqModifyTraceableObject());
		g2 = createEGenericType(theOptionsPackage.getOption());
		g1.getETypeArguments().add(g2);
		reqModifyOptionEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(reqModificationRepositoryEClass, ReqModificationRepository.class, "ReqModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reqSeedModificationsEClass, ReqSeedModifications.class, "ReqSeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReqSeedModifications_RequirementModifications(), this.getReqModifyRequirement(), null, "requirementModifications", null, 0, -1, ReqSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReqSeedModifications_DecisionModifications(), this.getReqModifyDecision(), null, "decisionModifications", null, 0, -1, ReqSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReqSeedModifications_OptionModifications(), this.getReqModifyOption(), null, "optionModifications", null, 0, -1, ReqSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reqChangePropagationDueToSpecificationDependenciesEClass, ReqChangePropagationDueToSpecificationDependencies.class, "ReqChangePropagationDueToSpecificationDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReqChangePropagationDueToSpecificationDependencies_DecisionModifications(), this.getReqModifyDecision(), null, "decisionModifications", null, 0, -1, ReqChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReqChangePropagationDueToSpecificationDependencies_OptionModifications(), this.getReqModifyOption(), null, "optionModifications", null, 0, -1, ReqChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReqChangePropagationDueToSpecificationDependencies_RequirementModifications(), this.getReqModifyRequirement(), null, "requirementModifications", null, 0, -1, ReqChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReqChangePropagationDueToSpecificationDependencies_DataTypeModifications(), theISModificationmarksPackage.getISModifyDataType(), null, "dataTypeModifications", null, 0, -1, ReqChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReqChangePropagationDueToSpecificationDependencies_EntityModifications(), this.getReqModifyEntity(), null, "entityModifications", null, 0, -1, ReqChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reqModifyEntityEClass, ReqModifyEntity.class, "ReqModifyEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reqModifyTraceableObjectEClass, ReqModifyTraceableObject.class, "ReqModifyTraceableObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reqModifyRequirementEClass, ReqModifyRequirement.class, "ReqModifyRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reqModifyDecisionEClass, ReqModifyDecision.class, "ReqModifyDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reqModifyOptionEClass, ReqModifyOption.class, "ReqModifyOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ReqModificationmarksPackageImpl
