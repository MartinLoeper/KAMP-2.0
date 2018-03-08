/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage;

import de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPInterBusinessProcessPropagation;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationRepository;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAbstractUserAction;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAcquireDeviceResourceAction;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyActorStep;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyDataObject;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyDeviceResource;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyEntryLevelSystemCall;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyReleaseDeviceResourceAction;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyRole;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPModificationmarksPackageImpl extends EPackageImpl implements BPModificationmarksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpSeedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpChangePropagationDueToDataDependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpInterBusinessProcessPropagationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpModifyDataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpModifyAbstractUserActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpModifyAcquireDeviceResourceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpModifyReleaseDeviceResourceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpModifyActorStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpModifyEntryLevelSystemCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpModifyDeviceResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpModifyRoleEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BPModificationmarksPackageImpl() {
		super(eNS_URI, BPModificationmarksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BPModificationmarksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BPModificationmarksPackage init() {
		if (isInited) return (BPModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(BPModificationmarksPackage.eNS_URI);

		// Obtain or create and register package
		BPModificationmarksPackageImpl theBPModificationmarksPackage = (BPModificationmarksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BPModificationmarksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BPModificationmarksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BpusagemodelPackage.eINSTANCE.eClass();
		OrganizationenvironmentmodelPackage.eINSTANCE.eClass();
		DatamodelPackage.eINSTANCE.eClass();
		ISModificationmarksPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBPModificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		theBPModificationmarksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBPModificationmarksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BPModificationmarksPackage.eNS_URI, theBPModificationmarksPackage);
		return theBPModificationmarksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPModificationRepository() {
		return bpModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPSeedModifications() {
		return bpSeedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPSeedModifications_DataObjectModifications() {
		return (EReference)bpSeedModificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPSeedModifications_ActorStepModifications() {
		return (EReference)bpSeedModificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPSeedModifications_EntryLevelSystemCallModifications() {
		return (EReference)bpSeedModificationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPSeedModifications_DeviceResourceModifications() {
		return (EReference)bpSeedModificationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPSeedModifications_RoleModifications() {
		return (EReference)bpSeedModificationsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPChangePropagationDueToDataDependencies() {
		return bpChangePropagationDueToDataDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPChangePropagationDueToDataDependencies_DataObjectModifications() {
		return (EReference)bpChangePropagationDueToDataDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPChangePropagationDueToDataDependencies_ActorStepModifications() {
		return (EReference)bpChangePropagationDueToDataDependenciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPChangePropagationDueToDataDependencies_EntryLevelSystemCallModifications() {
		return (EReference)bpChangePropagationDueToDataDependenciesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPInterBusinessProcessPropagation() {
		return bpInterBusinessProcessPropagationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPInterBusinessProcessPropagation_AbstractUserActionModifications() {
		return (EReference)bpInterBusinessProcessPropagationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPModifyDataObject() {
		return bpModifyDataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPModifyAbstractUserAction() {
		return bpModifyAbstractUserActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPModifyAcquireDeviceResourceAction() {
		return bpModifyAcquireDeviceResourceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPModifyReleaseDeviceResourceAction() {
		return bpModifyReleaseDeviceResourceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPModifyActorStep() {
		return bpModifyActorStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPModifyEntryLevelSystemCall() {
		return bpModifyEntryLevelSystemCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPModifyDeviceResource() {
		return bpModifyDeviceResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPModifyRole() {
		return bpModifyRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModificationmarksFactory getBPModificationmarksFactory() {
		return (BPModificationmarksFactory)getEFactoryInstance();
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
		bpModificationRepositoryEClass = createEClass(BP_MODIFICATION_REPOSITORY);

		bpSeedModificationsEClass = createEClass(BP_SEED_MODIFICATIONS);
		createEReference(bpSeedModificationsEClass, BP_SEED_MODIFICATIONS__DATA_OBJECT_MODIFICATIONS);
		createEReference(bpSeedModificationsEClass, BP_SEED_MODIFICATIONS__ACTOR_STEP_MODIFICATIONS);
		createEReference(bpSeedModificationsEClass, BP_SEED_MODIFICATIONS__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS);
		createEReference(bpSeedModificationsEClass, BP_SEED_MODIFICATIONS__DEVICE_RESOURCE_MODIFICATIONS);
		createEReference(bpSeedModificationsEClass, BP_SEED_MODIFICATIONS__ROLE_MODIFICATIONS);

		bpChangePropagationDueToDataDependenciesEClass = createEClass(BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES);
		createEReference(bpChangePropagationDueToDataDependenciesEClass, BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATA_OBJECT_MODIFICATIONS);
		createEReference(bpChangePropagationDueToDataDependenciesEClass, BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ACTOR_STEP_MODIFICATIONS);
		createEReference(bpChangePropagationDueToDataDependenciesEClass, BP_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS);

		bpInterBusinessProcessPropagationEClass = createEClass(BP_INTER_BUSINESS_PROCESS_PROPAGATION);
		createEReference(bpInterBusinessProcessPropagationEClass, BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS);

		bpModifyDataObjectEClass = createEClass(BP_MODIFY_DATA_OBJECT);

		bpModifyAbstractUserActionEClass = createEClass(BP_MODIFY_ABSTRACT_USER_ACTION);

		bpModifyAcquireDeviceResourceActionEClass = createEClass(BP_MODIFY_ACQUIRE_DEVICE_RESOURCE_ACTION);

		bpModifyReleaseDeviceResourceActionEClass = createEClass(BP_MODIFY_RELEASE_DEVICE_RESOURCE_ACTION);

		bpModifyActorStepEClass = createEClass(BP_MODIFY_ACTOR_STEP);

		bpModifyEntryLevelSystemCallEClass = createEClass(BP_MODIFY_ENTRY_LEVEL_SYSTEM_CALL);

		bpModifyDeviceResourceEClass = createEClass(BP_MODIFY_DEVICE_RESOURCE);

		bpModifyRoleEClass = createEClass(BP_MODIFY_ROLE);
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
		ModificationmarksPackage theModificationmarksPackage = (ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ModificationmarksPackage.eNS_URI);
		DatamodelPackage theDatamodelPackage = (DatamodelPackage)EPackage.Registry.INSTANCE.getEPackage(DatamodelPackage.eNS_URI);
		UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);
		BpusagemodelPackage theBpusagemodelPackage = (BpusagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(BpusagemodelPackage.eNS_URI);
		OrganizationenvironmentmodelPackage theOrganizationenvironmentmodelPackage = (OrganizationenvironmentmodelPackage)EPackage.Registry.INSTANCE.getEPackage(OrganizationenvironmentmodelPackage.eNS_URI);

		// Create type parameters
		ETypeParameter bpModifyAbstractUserActionEClass_T = addETypeParameter(bpModifyAbstractUserActionEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theUsagemodelPackage.getAbstractUserAction());
		bpModifyAbstractUserActionEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theISModificationmarksPackage.getAbstractISModificationRepository());
		EGenericType g2 = createEGenericType(this.getBPSeedModifications());
		g1.getETypeArguments().add(g2);
		bpModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		bpSeedModificationsEClass.getESuperTypes().add(theISModificationmarksPackage.getISSeedModifications());
		bpChangePropagationDueToDataDependenciesEClass.getESuperTypes().add(theISModificationmarksPackage.getISChangePropagationDueToDataDependencies());
		bpInterBusinessProcessPropagationEClass.getESuperTypes().add(theModificationmarksPackage.getChangePropagationStep());
		g1 = createEGenericType(theISModificationmarksPackage.getISModifyEntity());
		g2 = createEGenericType(theDatamodelPackage.getDataObject());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		bpModifyDataObjectEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theISModificationmarksPackage.getISModifyEntity());
		g2 = createEGenericType(bpModifyAbstractUserActionEClass_T);
		g1.getETypeArguments().add(g2);
		bpModifyAbstractUserActionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBPModifyAbstractUserAction());
		g2 = createEGenericType(theBpusagemodelPackage.getAcquireDeviceResourceAction());
		g1.getETypeArguments().add(g2);
		bpModifyAcquireDeviceResourceActionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBPModifyAbstractUserAction());
		g2 = createEGenericType(theBpusagemodelPackage.getReleaseDeviceResourceAction());
		g1.getETypeArguments().add(g2);
		bpModifyReleaseDeviceResourceActionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBPModifyAbstractUserAction());
		g2 = createEGenericType(theBpusagemodelPackage.getActorStep());
		g1.getETypeArguments().add(g2);
		bpModifyActorStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getBPModifyAbstractUserAction());
		g2 = createEGenericType(theUsagemodelPackage.getEntryLevelSystemCall());
		g1.getETypeArguments().add(g2);
		bpModifyEntryLevelSystemCallEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theISModificationmarksPackage.getISModifyEntity());
		g2 = createEGenericType(theOrganizationenvironmentmodelPackage.getDeviceResource());
		g1.getETypeArguments().add(g2);
		bpModifyDeviceResourceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theISModificationmarksPackage.getISModifyEntity());
		g2 = createEGenericType(theOrganizationenvironmentmodelPackage.getRole());
		g1.getETypeArguments().add(g2);
		bpModifyRoleEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(bpModificationRepositoryEClass, BPModificationRepository.class, "BPModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpSeedModificationsEClass, BPSeedModifications.class, "BPSeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPSeedModifications_DataObjectModifications(), this.getBPModifyDataObject(), null, "dataObjectModifications", null, 0, -1, BPSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPSeedModifications_ActorStepModifications(), this.getBPModifyActorStep(), null, "actorStepModifications", null, 0, -1, BPSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPSeedModifications_EntryLevelSystemCallModifications(), this.getBPModifyEntryLevelSystemCall(), null, "entryLevelSystemCallModifications", null, 0, -1, BPSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPSeedModifications_DeviceResourceModifications(), this.getBPModifyDeviceResource(), null, "deviceResourceModifications", null, 0, -1, BPSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPSeedModifications_RoleModifications(), this.getBPModifyRole(), null, "roleModifications", null, 0, -1, BPSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpChangePropagationDueToDataDependenciesEClass, BPChangePropagationDueToDataDependencies.class, "BPChangePropagationDueToDataDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPChangePropagationDueToDataDependencies_DataObjectModifications(), this.getBPModifyDataObject(), null, "dataObjectModifications", null, 0, -1, BPChangePropagationDueToDataDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPChangePropagationDueToDataDependencies_ActorStepModifications(), this.getBPModifyActorStep(), null, "actorStepModifications", null, 0, -1, BPChangePropagationDueToDataDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPChangePropagationDueToDataDependencies_EntryLevelSystemCallModifications(), this.getBPModifyEntryLevelSystemCall(), null, "entryLevelSystemCallModifications", null, 0, -1, BPChangePropagationDueToDataDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpInterBusinessProcessPropagationEClass, BPInterBusinessProcessPropagation.class, "BPInterBusinessProcessPropagation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getBPModifyAbstractUserAction());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getBPInterBusinessProcessPropagation_AbstractUserActionModifications(), g1, null, "abstractUserActionModifications", null, 0, -1, BPInterBusinessProcessPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpModifyDataObjectEClass, BPModifyDataObject.class, "BPModifyDataObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpModifyAbstractUserActionEClass, BPModifyAbstractUserAction.class, "BPModifyAbstractUserAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpModifyAcquireDeviceResourceActionEClass, BPModifyAcquireDeviceResourceAction.class, "BPModifyAcquireDeviceResourceAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpModifyReleaseDeviceResourceActionEClass, BPModifyReleaseDeviceResourceAction.class, "BPModifyReleaseDeviceResourceAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpModifyActorStepEClass, BPModifyActorStep.class, "BPModifyActorStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpModifyEntryLevelSystemCallEClass, BPModifyEntryLevelSystemCall.class, "BPModifyEntryLevelSystemCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpModifyDeviceResourceEClass, BPModifyDeviceResource.class, "BPModifyDeviceResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpModifyRoleEClass, BPModifyRole.class, "BPModifyRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BPModificationmarksPackageImpl
