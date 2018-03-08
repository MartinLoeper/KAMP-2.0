/**
 */
package archoptions.impl;

import archoptions.AllocateNeverTogether;
import archoptions.AllocateTogether;
import archoptions.ArchCandidate;
import archoptions.ArchOption;
import archoptions.ArchoptionsFactory;
import archoptions.ArchoptionsPackage;
import archoptions.BanComponent;
import archoptions.ChangeDataType;
import archoptions.ChangeInterface;
import archoptions.ChangeRoles;
import archoptions.ComponentOption;
import archoptions.DataTypeOption;
import archoptions.DeploymentOption;
import archoptions.FunctionalityConnection;
import archoptions.InterfaceOption;
import archoptions.IntroduceNewAdapter;
import archoptions.IntroduceNewComponent;
import archoptions.IntroduceNewDataType;
import archoptions.IntroduceNewInterface;
import archoptions.MergeComponents;
import archoptions.MoveComponents;
import archoptions.MultipleAllocation;
import archoptions.MultipleInstantiation;
import archoptions.NeverAllocateToSpecificNodes;
import archoptions.OnlySingleAllocation;
import archoptions.OnlySingleInstantiation;
import archoptions.ProvidedFunctionality;
import archoptions.RemoveDataType;
import archoptions.RemoveInterface;
import archoptions.ReplaceComponents;
import archoptions.RequiredFunctionality;
import archoptions.ReuseComponent;
import archoptions.SplitComponent;

import options.OptionsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchoptionsPackageImpl extends EPackageImpl implements ArchoptionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedFunctionalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredFunctionalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalityConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleInstantiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlySingleInstantiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlySingleAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocateTogetherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocateNeverTogetherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neverAllocateToSpecificNodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveComponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass introduceNewComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass introduceNewAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reuseComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass banComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceComponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeComponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeRolesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass introduceNewDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass introduceNewInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archCandidateEClass = null;

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
	 * @see archoptions.ArchoptionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArchoptionsPackageImpl() {
		super(eNS_URI, ArchoptionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArchoptionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArchoptionsPackage init() {
		if (isInited) return (ArchoptionsPackage)EPackage.Registry.INSTANCE.getEPackage(ArchoptionsPackage.eNS_URI);

		// Obtain or create and register package
		ArchoptionsPackageImpl theArchoptionsPackage = (ArchoptionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArchoptionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArchoptionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OptionsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theArchoptionsPackage.createPackageContents();

		// Initialize created meta-data
		theArchoptionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArchoptionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArchoptionsPackage.eNS_URI, theArchoptionsPackage);
		return theArchoptionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedFunctionality() {
		return providedFunctionalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredFunctionality() {
		return requiredFunctionalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalityConnection() {
		return functionalityConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleInstantiation() {
		return multipleInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnlySingleInstantiation() {
		return onlySingleInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnlySingleAllocation() {
		return onlySingleAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleAllocation() {
		return multipleAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocateTogether() {
		return allocateTogetherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocateNeverTogether() {
		return allocateNeverTogetherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeverAllocateToSpecificNodes() {
		return neverAllocateToSpecificNodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveComponents() {
		return moveComponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntroduceNewComponent() {
		return introduceNewComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntroduceNewAdapter() {
		return introduceNewAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReuseComponent() {
		return reuseComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBanComponent() {
		return banComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplaceComponents() {
		return replaceComponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitComponent() {
		return splitComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeComponents() {
		return mergeComponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeRoles() {
		return changeRolesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentOption() {
		return componentOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentOption() {
		return deploymentOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchOption() {
		return archOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchOption_AnalysisRationale() {
		return (EReference)archOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeDataType() {
		return changeDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntroduceNewDataType() {
		return introduceNewDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveDataType() {
		return removeDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceOption() {
		return interfaceOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeOption() {
		return dataTypeOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeInterface() {
		return changeInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveInterface() {
		return removeInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntroduceNewInterface() {
		return introduceNewInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchCandidate() {
		return archCandidateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchCandidate_SubOptions() {
		return (EReference)archCandidateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchoptionsFactory getArchoptionsFactory() {
		return (ArchoptionsFactory)getEFactoryInstance();
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
		providedFunctionalityEClass = createEClass(PROVIDED_FUNCTIONALITY);

		requiredFunctionalityEClass = createEClass(REQUIRED_FUNCTIONALITY);

		functionalityConnectionEClass = createEClass(FUNCTIONALITY_CONNECTION);

		multipleInstantiationEClass = createEClass(MULTIPLE_INSTANTIATION);

		onlySingleInstantiationEClass = createEClass(ONLY_SINGLE_INSTANTIATION);

		onlySingleAllocationEClass = createEClass(ONLY_SINGLE_ALLOCATION);

		multipleAllocationEClass = createEClass(MULTIPLE_ALLOCATION);

		allocateTogetherEClass = createEClass(ALLOCATE_TOGETHER);

		allocateNeverTogetherEClass = createEClass(ALLOCATE_NEVER_TOGETHER);

		neverAllocateToSpecificNodesEClass = createEClass(NEVER_ALLOCATE_TO_SPECIFIC_NODES);

		moveComponentsEClass = createEClass(MOVE_COMPONENTS);

		introduceNewComponentEClass = createEClass(INTRODUCE_NEW_COMPONENT);

		introduceNewAdapterEClass = createEClass(INTRODUCE_NEW_ADAPTER);

		reuseComponentEClass = createEClass(REUSE_COMPONENT);

		banComponentEClass = createEClass(BAN_COMPONENT);

		replaceComponentsEClass = createEClass(REPLACE_COMPONENTS);

		splitComponentEClass = createEClass(SPLIT_COMPONENT);

		mergeComponentsEClass = createEClass(MERGE_COMPONENTS);

		changeRolesEClass = createEClass(CHANGE_ROLES);

		componentOptionEClass = createEClass(COMPONENT_OPTION);

		deploymentOptionEClass = createEClass(DEPLOYMENT_OPTION);

		archOptionEClass = createEClass(ARCH_OPTION);
		createEReference(archOptionEClass, ARCH_OPTION__ANALYSIS_RATIONALE);

		changeDataTypeEClass = createEClass(CHANGE_DATA_TYPE);

		introduceNewDataTypeEClass = createEClass(INTRODUCE_NEW_DATA_TYPE);

		removeDataTypeEClass = createEClass(REMOVE_DATA_TYPE);

		interfaceOptionEClass = createEClass(INTERFACE_OPTION);

		dataTypeOptionEClass = createEClass(DATA_TYPE_OPTION);

		changeInterfaceEClass = createEClass(CHANGE_INTERFACE);

		removeInterfaceEClass = createEClass(REMOVE_INTERFACE);

		introduceNewInterfaceEClass = createEClass(INTRODUCE_NEW_INTERFACE);

		archCandidateEClass = createEClass(ARCH_CANDIDATE);
		createEReference(archCandidateEClass, ARCH_CANDIDATE__SUB_OPTIONS);
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
		OptionsPackage theOptionsPackage = (OptionsPackage)EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		providedFunctionalityEClass.getESuperTypes().add(this.getComponentOption());
		requiredFunctionalityEClass.getESuperTypes().add(this.getComponentOption());
		functionalityConnectionEClass.getESuperTypes().add(this.getComponentOption());
		multipleInstantiationEClass.getESuperTypes().add(this.getComponentOption());
		onlySingleInstantiationEClass.getESuperTypes().add(this.getComponentOption());
		onlySingleAllocationEClass.getESuperTypes().add(this.getDeploymentOption());
		multipleAllocationEClass.getESuperTypes().add(this.getDeploymentOption());
		allocateTogetherEClass.getESuperTypes().add(this.getDeploymentOption());
		allocateNeverTogetherEClass.getESuperTypes().add(this.getDeploymentOption());
		neverAllocateToSpecificNodesEClass.getESuperTypes().add(this.getDeploymentOption());
		moveComponentsEClass.getESuperTypes().add(this.getDeploymentOption());
		introduceNewComponentEClass.getESuperTypes().add(this.getComponentOption());
		introduceNewAdapterEClass.getESuperTypes().add(this.getComponentOption());
		reuseComponentEClass.getESuperTypes().add(this.getComponentOption());
		banComponentEClass.getESuperTypes().add(this.getComponentOption());
		replaceComponentsEClass.getESuperTypes().add(this.getComponentOption());
		splitComponentEClass.getESuperTypes().add(this.getComponentOption());
		mergeComponentsEClass.getESuperTypes().add(this.getComponentOption());
		changeRolesEClass.getESuperTypes().add(this.getComponentOption());
		componentOptionEClass.getESuperTypes().add(this.getArchOption());
		deploymentOptionEClass.getESuperTypes().add(this.getArchOption());
		archOptionEClass.getESuperTypes().add(theOptionsPackage.getOption());
		changeDataTypeEClass.getESuperTypes().add(this.getDataTypeOption());
		introduceNewDataTypeEClass.getESuperTypes().add(this.getDataTypeOption());
		removeDataTypeEClass.getESuperTypes().add(this.getDataTypeOption());
		interfaceOptionEClass.getESuperTypes().add(this.getArchOption());
		dataTypeOptionEClass.getESuperTypes().add(this.getArchOption());
		changeInterfaceEClass.getESuperTypes().add(this.getInterfaceOption());
		removeInterfaceEClass.getESuperTypes().add(this.getInterfaceOption());
		introduceNewInterfaceEClass.getESuperTypes().add(this.getInterfaceOption());
		archCandidateEClass.getESuperTypes().add(this.getArchOption());

		// Initialize classes and features; add operations and parameters
		initEClass(providedFunctionalityEClass, ProvidedFunctionality.class, "ProvidedFunctionality", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredFunctionalityEClass, RequiredFunctionality.class, "RequiredFunctionality", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalityConnectionEClass, FunctionalityConnection.class, "FunctionalityConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleInstantiationEClass, MultipleInstantiation.class, "MultipleInstantiation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(onlySingleInstantiationEClass, OnlySingleInstantiation.class, "OnlySingleInstantiation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(onlySingleAllocationEClass, OnlySingleAllocation.class, "OnlySingleAllocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multipleAllocationEClass, MultipleAllocation.class, "MultipleAllocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allocateTogetherEClass, AllocateTogether.class, "AllocateTogether", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allocateNeverTogetherEClass, AllocateNeverTogether.class, "AllocateNeverTogether", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(neverAllocateToSpecificNodesEClass, NeverAllocateToSpecificNodes.class, "NeverAllocateToSpecificNodes", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveComponentsEClass, MoveComponents.class, "MoveComponents", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(introduceNewComponentEClass, IntroduceNewComponent.class, "IntroduceNewComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(introduceNewAdapterEClass, IntroduceNewAdapter.class, "IntroduceNewAdapter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reuseComponentEClass, ReuseComponent.class, "ReuseComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(banComponentEClass, BanComponent.class, "BanComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(replaceComponentsEClass, ReplaceComponents.class, "ReplaceComponents", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(splitComponentEClass, SplitComponent.class, "SplitComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeComponentsEClass, MergeComponents.class, "MergeComponents", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeRolesEClass, ChangeRoles.class, "ChangeRoles", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentOptionEClass, ComponentOption.class, "ComponentOption", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deploymentOptionEClass, DeploymentOption.class, "DeploymentOption", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(archOptionEClass, ArchOption.class, "ArchOption", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchOption_AnalysisRationale(), theOptionsPackage.getAnalysisRationale(), null, "analysisRationale", null, 0, -1, ArchOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeDataTypeEClass, ChangeDataType.class, "ChangeDataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(introduceNewDataTypeEClass, IntroduceNewDataType.class, "IntroduceNewDataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeDataTypeEClass, RemoveDataType.class, "RemoveDataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceOptionEClass, InterfaceOption.class, "InterfaceOption", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeOptionEClass, DataTypeOption.class, "DataTypeOption", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeInterfaceEClass, ChangeInterface.class, "ChangeInterface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeInterfaceEClass, RemoveInterface.class, "RemoveInterface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(introduceNewInterfaceEClass, IntroduceNewInterface.class, "IntroduceNewInterface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(archCandidateEClass, ArchCandidate.class, "ArchCandidate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchCandidate_SubOptions(), this.getArchOption(), null, "subOptions", null, 0, -1, ArchCandidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ArchoptionsPackageImpl
