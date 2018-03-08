/**
 */
package pcmarchoptions.impl;

import archoptions.ArchoptionsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.allocation.AllocationPackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import pcmarchoptions.PCM_AllocateNeverTogether;
import pcmarchoptions.PCM_AllocateTogether;
import pcmarchoptions.PCM_BanComponent;
import pcmarchoptions.PCM_ChangeDataType;
import pcmarchoptions.PCM_ChangeInterface;
import pcmarchoptions.PCM_ChangeRoles;
import pcmarchoptions.PCM_FunctionalityConnection;
import pcmarchoptions.PCM_IntroduceNewAdapter;
import pcmarchoptions.PCM_IntroduceNewComponent;
import pcmarchoptions.PCM_IntroduceNewDataType;
import pcmarchoptions.PCM_IntroduceNewInterface;
import pcmarchoptions.PCM_MergeComponents;
import pcmarchoptions.PCM_MoveComponents;
import pcmarchoptions.PCM_MultipleAllocation;
import pcmarchoptions.PCM_MultipleInstantiation;
import pcmarchoptions.PCM_NeverAllocateToSpecificNodes;
import pcmarchoptions.PCM_OnlySingleAllocation;
import pcmarchoptions.PCM_OnlySingleInstantiation;
import pcmarchoptions.PCM_ProvidedFunctionality;
import pcmarchoptions.PCM_RemoveDataType;
import pcmarchoptions.PCM_RemoveInterface;
import pcmarchoptions.PCM_ReplaceComponents;
import pcmarchoptions.PCM_RequiredFunctionality;
import pcmarchoptions.PCM_ReuseComponent;
import pcmarchoptions.PCM_SplitComponent;
import pcmarchoptions.PcmarchoptionsFactory;
import pcmarchoptions.PcmarchoptionsPackage;

import pcmarchoptions.util.PcmarchoptionsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcmarchoptionsPackageImpl extends EPackageImpl implements PcmarchoptionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_SplitComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_AllocateTogetherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_NeverAllocateToSpecificNodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_IntroduceNewAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_IntroduceNewComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_MoveComponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_OnlySingleInstantiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_ChangeRolesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_AllocateNeverTogetherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_MultipleInstantiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_BanComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_MultipleAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_ProvidedFunctionalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_ReplaceComponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_ReuseComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_FunctionalityConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_MergeComponentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_OnlySingleAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_RequiredFunctionalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_ChangeDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_IntroduceNewDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_RemoveDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_IntroduceNewInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_ChangeInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_RemoveInterfaceEClass = null;

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
	 * @see pcmarchoptions.PcmarchoptionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PcmarchoptionsPackageImpl() {
		super(eNS_URI, PcmarchoptionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PcmarchoptionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PcmarchoptionsPackage init() {
		if (isInited) return (PcmarchoptionsPackage)EPackage.Registry.INSTANCE.getEPackage(PcmarchoptionsPackage.eNS_URI);

		// Obtain or create and register package
		PcmarchoptionsPackageImpl thePcmarchoptionsPackage = (PcmarchoptionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PcmarchoptionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PcmarchoptionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArchoptionsPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePcmarchoptionsPackage.createPackageContents();

		// Initialize created meta-data
		thePcmarchoptionsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePcmarchoptionsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PcmarchoptionsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePcmarchoptionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PcmarchoptionsPackage.eNS_URI, thePcmarchoptionsPackage);
		return thePcmarchoptionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_SplitComponent() {
		return pcM_SplitComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCM_SplitComponent_InitialContextName() {
		return (EAttribute)pcM_SplitComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_SplitComponent_FinalContexts() {
		return (EReference)pcM_SplitComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_AllocateTogether() {
		return pcM_AllocateTogetherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_AllocateTogether_AllocationContexts() {
		return (EReference)pcM_AllocateTogetherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_NeverAllocateToSpecificNodes() {
		return pcM_NeverAllocateToSpecificNodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_NeverAllocateToSpecificNodes_AllocationContexts() {
		return (EReference)pcM_NeverAllocateToSpecificNodesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_NeverAllocateToSpecificNodes_HwNodes() {
		return (EReference)pcM_NeverAllocateToSpecificNodesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_IntroduceNewAdapter() {
		return pcM_IntroduceNewAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_IntroduceNewAdapter_AdapterContext() {
		return (EReference)pcM_IntroduceNewAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_IntroduceNewAdapter_ContextBeingAdapted() {
		return (EReference)pcM_IntroduceNewAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_IntroduceNewComponent() {
		return pcM_IntroduceNewComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_IntroduceNewComponent_AssemblyContexts() {
		return (EReference)pcM_IntroduceNewComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_MoveComponents() {
		return pcM_MoveComponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_MoveComponents_AllocationContexts() {
		return (EReference)pcM_MoveComponentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_MoveComponents_FromHwNode() {
		return (EReference)pcM_MoveComponentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_MoveComponents_ToHwNode() {
		return (EReference)pcM_MoveComponentsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_OnlySingleInstantiation() {
		return pcM_OnlySingleInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_OnlySingleInstantiation_AssemblyContexts() {
		return (EReference)pcM_OnlySingleInstantiationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_ChangeRoles() {
		return pcM_ChangeRolesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_ChangeRoles_AssemblyContext() {
		return (EReference)pcM_ChangeRolesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_ChangeRoles_Roles() {
		return (EReference)pcM_ChangeRolesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_AllocateNeverTogether() {
		return pcM_AllocateNeverTogetherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_AllocateNeverTogether_AllocationContexts() {
		return (EReference)pcM_AllocateNeverTogetherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_MultipleInstantiation() {
		return pcM_MultipleInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_MultipleInstantiation_AssemblyContexts() {
		return (EReference)pcM_MultipleInstantiationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_BanComponent() {
		return pcM_BanComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCM_BanComponent_BannedContextNames() {
		return (EAttribute)pcM_BanComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_MultipleAllocation() {
		return pcM_MultipleAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_MultipleAllocation_AllocationContexts() {
		return (EReference)pcM_MultipleAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_ProvidedFunctionality() {
		return pcM_ProvidedFunctionalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_ProvidedFunctionality_ProvidedRoles() {
		return (EReference)pcM_ProvidedFunctionalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_ReplaceComponents() {
		return pcM_ReplaceComponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_ReplaceComponents_ContextsReplacedWith() {
		return (EReference)pcM_ReplaceComponentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCM_ReplaceComponents_ReplacedContextNames() {
		return (EAttribute)pcM_ReplaceComponentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_ReuseComponent() {
		return pcM_ReuseComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_ReuseComponent_AssemblyContexts() {
		return (EReference)pcM_ReuseComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_FunctionalityConnection() {
		return pcM_FunctionalityConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_FunctionalityConnection_Connector() {
		return (EReference)pcM_FunctionalityConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_FunctionalityConnection_RequiredRole() {
		return (EReference)pcM_FunctionalityConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_FunctionalityConnection_ProvidedRole() {
		return (EReference)pcM_FunctionalityConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_MergeComponents() {
		return pcM_MergeComponentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCM_MergeComponents_InitialContextsNameList() {
		return (EAttribute)pcM_MergeComponentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_MergeComponents_FinalContext() {
		return (EReference)pcM_MergeComponentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_OnlySingleAllocation() {
		return pcM_OnlySingleAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_OnlySingleAllocation_AllocationContexts() {
		return (EReference)pcM_OnlySingleAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_RequiredFunctionality() {
		return pcM_RequiredFunctionalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_RequiredFunctionality_RequiredRoles() {
		return (EReference)pcM_RequiredFunctionalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_ChangeDataType() {
		return pcM_ChangeDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_ChangeDataType_OldDataTypes() {
		return (EReference)pcM_ChangeDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_ChangeDataType_NewDataTypes() {
		return (EReference)pcM_ChangeDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_IntroduceNewDataType() {
		return pcM_IntroduceNewDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_IntroduceNewDataType_DataTypes() {
		return (EReference)pcM_IntroduceNewDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_RemoveDataType() {
		return pcM_RemoveDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_RemoveDataType_DataTypes() {
		return (EReference)pcM_RemoveDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_IntroduceNewInterface() {
		return pcM_IntroduceNewInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_IntroduceNewInterface_Interfaces() {
		return (EReference)pcM_IntroduceNewInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_ChangeInterface() {
		return pcM_ChangeInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_ChangeInterface_OldInterfaces() {
		return (EReference)pcM_ChangeInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_ChangeInterface_NewInterfaces() {
		return (EReference)pcM_ChangeInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_RemoveInterface() {
		return pcM_RemoveInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_RemoveInterface_Interfaces() {
		return (EReference)pcM_RemoveInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmarchoptionsFactory getPcmarchoptionsFactory() {
		return (PcmarchoptionsFactory)getEFactoryInstance();
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
		pcM_SplitComponentEClass = createEClass(PCM_SPLIT_COMPONENT);
		createEAttribute(pcM_SplitComponentEClass, PCM_SPLIT_COMPONENT__INITIAL_CONTEXT_NAME);
		createEReference(pcM_SplitComponentEClass, PCM_SPLIT_COMPONENT__FINAL_CONTEXTS);

		pcM_AllocateTogetherEClass = createEClass(PCM_ALLOCATE_TOGETHER);
		createEReference(pcM_AllocateTogetherEClass, PCM_ALLOCATE_TOGETHER__ALLOCATION_CONTEXTS);

		pcM_NeverAllocateToSpecificNodesEClass = createEClass(PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES);
		createEReference(pcM_NeverAllocateToSpecificNodesEClass, PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__ALLOCATION_CONTEXTS);
		createEReference(pcM_NeverAllocateToSpecificNodesEClass, PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__HW_NODES);

		pcM_IntroduceNewAdapterEClass = createEClass(PCM_INTRODUCE_NEW_ADAPTER);
		createEReference(pcM_IntroduceNewAdapterEClass, PCM_INTRODUCE_NEW_ADAPTER__ADAPTER_CONTEXT);
		createEReference(pcM_IntroduceNewAdapterEClass, PCM_INTRODUCE_NEW_ADAPTER__CONTEXT_BEING_ADAPTED);

		pcM_IntroduceNewComponentEClass = createEClass(PCM_INTRODUCE_NEW_COMPONENT);
		createEReference(pcM_IntroduceNewComponentEClass, PCM_INTRODUCE_NEW_COMPONENT__ASSEMBLY_CONTEXTS);

		pcM_MoveComponentsEClass = createEClass(PCM_MOVE_COMPONENTS);
		createEReference(pcM_MoveComponentsEClass, PCM_MOVE_COMPONENTS__ALLOCATION_CONTEXTS);
		createEReference(pcM_MoveComponentsEClass, PCM_MOVE_COMPONENTS__FROM_HW_NODE);
		createEReference(pcM_MoveComponentsEClass, PCM_MOVE_COMPONENTS__TO_HW_NODE);

		pcM_OnlySingleInstantiationEClass = createEClass(PCM_ONLY_SINGLE_INSTANTIATION);
		createEReference(pcM_OnlySingleInstantiationEClass, PCM_ONLY_SINGLE_INSTANTIATION__ASSEMBLY_CONTEXTS);

		pcM_ChangeRolesEClass = createEClass(PCM_CHANGE_ROLES);
		createEReference(pcM_ChangeRolesEClass, PCM_CHANGE_ROLES__ASSEMBLY_CONTEXT);
		createEReference(pcM_ChangeRolesEClass, PCM_CHANGE_ROLES__ROLES);

		pcM_AllocateNeverTogetherEClass = createEClass(PCM_ALLOCATE_NEVER_TOGETHER);
		createEReference(pcM_AllocateNeverTogetherEClass, PCM_ALLOCATE_NEVER_TOGETHER__ALLOCATION_CONTEXTS);

		pcM_MultipleInstantiationEClass = createEClass(PCM_MULTIPLE_INSTANTIATION);
		createEReference(pcM_MultipleInstantiationEClass, PCM_MULTIPLE_INSTANTIATION__ASSEMBLY_CONTEXTS);

		pcM_BanComponentEClass = createEClass(PCM_BAN_COMPONENT);
		createEAttribute(pcM_BanComponentEClass, PCM_BAN_COMPONENT__BANNED_CONTEXT_NAMES);

		pcM_MultipleAllocationEClass = createEClass(PCM_MULTIPLE_ALLOCATION);
		createEReference(pcM_MultipleAllocationEClass, PCM_MULTIPLE_ALLOCATION__ALLOCATION_CONTEXTS);

		pcM_ProvidedFunctionalityEClass = createEClass(PCM_PROVIDED_FUNCTIONALITY);
		createEReference(pcM_ProvidedFunctionalityEClass, PCM_PROVIDED_FUNCTIONALITY__PROVIDED_ROLES);

		pcM_ReplaceComponentsEClass = createEClass(PCM_REPLACE_COMPONENTS);
		createEReference(pcM_ReplaceComponentsEClass, PCM_REPLACE_COMPONENTS__CONTEXTS_REPLACED_WITH);
		createEAttribute(pcM_ReplaceComponentsEClass, PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAMES);

		pcM_ReuseComponentEClass = createEClass(PCM_REUSE_COMPONENT);
		createEReference(pcM_ReuseComponentEClass, PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXTS);

		pcM_FunctionalityConnectionEClass = createEClass(PCM_FUNCTIONALITY_CONNECTION);
		createEReference(pcM_FunctionalityConnectionEClass, PCM_FUNCTIONALITY_CONNECTION__CONNECTOR);
		createEReference(pcM_FunctionalityConnectionEClass, PCM_FUNCTIONALITY_CONNECTION__REQUIRED_ROLE);
		createEReference(pcM_FunctionalityConnectionEClass, PCM_FUNCTIONALITY_CONNECTION__PROVIDED_ROLE);

		pcM_MergeComponentsEClass = createEClass(PCM_MERGE_COMPONENTS);
		createEAttribute(pcM_MergeComponentsEClass, PCM_MERGE_COMPONENTS__INITIAL_CONTEXTS_NAME_LIST);
		createEReference(pcM_MergeComponentsEClass, PCM_MERGE_COMPONENTS__FINAL_CONTEXT);

		pcM_OnlySingleAllocationEClass = createEClass(PCM_ONLY_SINGLE_ALLOCATION);
		createEReference(pcM_OnlySingleAllocationEClass, PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXTS);

		pcM_RequiredFunctionalityEClass = createEClass(PCM_REQUIRED_FUNCTIONALITY);
		createEReference(pcM_RequiredFunctionalityEClass, PCM_REQUIRED_FUNCTIONALITY__REQUIRED_ROLES);

		pcM_ChangeDataTypeEClass = createEClass(PCM_CHANGE_DATA_TYPE);
		createEReference(pcM_ChangeDataTypeEClass, PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPES);
		createEReference(pcM_ChangeDataTypeEClass, PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPES);

		pcM_IntroduceNewDataTypeEClass = createEClass(PCM_INTRODUCE_NEW_DATA_TYPE);
		createEReference(pcM_IntroduceNewDataTypeEClass, PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPES);

		pcM_RemoveDataTypeEClass = createEClass(PCM_REMOVE_DATA_TYPE);
		createEReference(pcM_RemoveDataTypeEClass, PCM_REMOVE_DATA_TYPE__DATA_TYPES);

		pcM_IntroduceNewInterfaceEClass = createEClass(PCM_INTRODUCE_NEW_INTERFACE);
		createEReference(pcM_IntroduceNewInterfaceEClass, PCM_INTRODUCE_NEW_INTERFACE__INTERFACES);

		pcM_ChangeInterfaceEClass = createEClass(PCM_CHANGE_INTERFACE);
		createEReference(pcM_ChangeInterfaceEClass, PCM_CHANGE_INTERFACE__OLD_INTERFACES);
		createEReference(pcM_ChangeInterfaceEClass, PCM_CHANGE_INTERFACE__NEW_INTERFACES);

		pcM_RemoveInterfaceEClass = createEClass(PCM_REMOVE_INTERFACE);
		createEReference(pcM_RemoveInterfaceEClass, PCM_REMOVE_INTERFACE__INTERFACES);
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
		ArchoptionsPackage theArchoptionsPackage = (ArchoptionsPackage)EPackage.Registry.INSTANCE.getEPackage(ArchoptionsPackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);
		AllocationPackage theAllocationPackage = (AllocationPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pcM_SplitComponentEClass.getESuperTypes().add(theArchoptionsPackage.getSplitComponent());
		pcM_AllocateTogetherEClass.getESuperTypes().add(theArchoptionsPackage.getAllocateTogether());
		pcM_NeverAllocateToSpecificNodesEClass.getESuperTypes().add(theArchoptionsPackage.getNeverAllocateToSpecificNodes());
		pcM_IntroduceNewAdapterEClass.getESuperTypes().add(theArchoptionsPackage.getIntroduceNewAdapter());
		pcM_IntroduceNewComponentEClass.getESuperTypes().add(theArchoptionsPackage.getIntroduceNewComponent());
		pcM_MoveComponentsEClass.getESuperTypes().add(theArchoptionsPackage.getMoveComponents());
		pcM_OnlySingleInstantiationEClass.getESuperTypes().add(theArchoptionsPackage.getOnlySingleInstantiation());
		pcM_ChangeRolesEClass.getESuperTypes().add(theArchoptionsPackage.getChangeRoles());
		pcM_AllocateNeverTogetherEClass.getESuperTypes().add(theArchoptionsPackage.getAllocateNeverTogether());
		pcM_MultipleInstantiationEClass.getESuperTypes().add(theArchoptionsPackage.getMultipleInstantiation());
		pcM_BanComponentEClass.getESuperTypes().add(theArchoptionsPackage.getBanComponent());
		pcM_MultipleAllocationEClass.getESuperTypes().add(theArchoptionsPackage.getMultipleAllocation());
		pcM_ProvidedFunctionalityEClass.getESuperTypes().add(theArchoptionsPackage.getProvidedFunctionality());
		pcM_ReplaceComponentsEClass.getESuperTypes().add(theArchoptionsPackage.getReplaceComponents());
		pcM_ReuseComponentEClass.getESuperTypes().add(theArchoptionsPackage.getReuseComponent());
		pcM_FunctionalityConnectionEClass.getESuperTypes().add(theArchoptionsPackage.getFunctionalityConnection());
		pcM_MergeComponentsEClass.getESuperTypes().add(theArchoptionsPackage.getMergeComponents());
		pcM_OnlySingleAllocationEClass.getESuperTypes().add(theArchoptionsPackage.getOnlySingleAllocation());
		pcM_RequiredFunctionalityEClass.getESuperTypes().add(theArchoptionsPackage.getRequiredFunctionality());
		pcM_ChangeDataTypeEClass.getESuperTypes().add(theArchoptionsPackage.getChangeDataType());
		pcM_IntroduceNewDataTypeEClass.getESuperTypes().add(theArchoptionsPackage.getIntroduceNewDataType());
		pcM_RemoveDataTypeEClass.getESuperTypes().add(theArchoptionsPackage.getRemoveDataType());
		pcM_IntroduceNewInterfaceEClass.getESuperTypes().add(theArchoptionsPackage.getIntroduceNewInterface());
		pcM_ChangeInterfaceEClass.getESuperTypes().add(theArchoptionsPackage.getChangeInterface());
		pcM_RemoveInterfaceEClass.getESuperTypes().add(theArchoptionsPackage.getRemoveInterface());

		// Initialize classes and features; add operations and parameters
		initEClass(pcM_SplitComponentEClass, PCM_SplitComponent.class, "PCM_SplitComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCM_SplitComponent_InitialContextName(), ecorePackage.getEString(), "initialContextName", null, 1, 1, PCM_SplitComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCM_SplitComponent_FinalContexts(), theCompositionPackage.getAssemblyContext(), null, "finalContexts", null, 2, -1, PCM_SplitComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_AllocateTogetherEClass, PCM_AllocateTogether.class, "PCM_AllocateTogether", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_AllocateTogether_AllocationContexts(), theAllocationPackage.getAllocationContext(), null, "allocationContexts", null, 2, -1, PCM_AllocateTogether.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_NeverAllocateToSpecificNodesEClass, PCM_NeverAllocateToSpecificNodes.class, "PCM_NeverAllocateToSpecificNodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_NeverAllocateToSpecificNodes_AllocationContexts(), theAllocationPackage.getAllocationContext(), null, "allocationContexts", null, 1, -1, PCM_NeverAllocateToSpecificNodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCM_NeverAllocateToSpecificNodes_HwNodes(), theResourceenvironmentPackage.getResourceContainer(), null, "hwNodes", null, 1, -1, PCM_NeverAllocateToSpecificNodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_IntroduceNewAdapterEClass, PCM_IntroduceNewAdapter.class, "PCM_IntroduceNewAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_IntroduceNewAdapter_AdapterContext(), theCompositionPackage.getAssemblyContext(), null, "adapterContext", null, 1, 1, PCM_IntroduceNewAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCM_IntroduceNewAdapter_ContextBeingAdapted(), theCompositionPackage.getAssemblyContext(), null, "contextBeingAdapted", null, 1, 1, PCM_IntroduceNewAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_IntroduceNewComponentEClass, PCM_IntroduceNewComponent.class, "PCM_IntroduceNewComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_IntroduceNewComponent_AssemblyContexts(), theCompositionPackage.getAssemblyContext(), null, "assemblyContexts", null, 0, -1, PCM_IntroduceNewComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_MoveComponentsEClass, PCM_MoveComponents.class, "PCM_MoveComponents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_MoveComponents_AllocationContexts(), theAllocationPackage.getAllocationContext(), null, "allocationContexts", null, 1, -1, PCM_MoveComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCM_MoveComponents_FromHwNode(), theResourceenvironmentPackage.getResourceContainer(), null, "fromHwNode", null, 1, 1, PCM_MoveComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCM_MoveComponents_ToHwNode(), theResourceenvironmentPackage.getResourceContainer(), null, "toHwNode", null, 1, 1, PCM_MoveComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_OnlySingleInstantiationEClass, PCM_OnlySingleInstantiation.class, "PCM_OnlySingleInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_OnlySingleInstantiation_AssemblyContexts(), theCompositionPackage.getAssemblyContext(), null, "assemblyContexts", null, 1, -1, PCM_OnlySingleInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_ChangeRolesEClass, PCM_ChangeRoles.class, "PCM_ChangeRoles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_ChangeRoles_AssemblyContext(), theCompositionPackage.getAssemblyContext(), null, "assemblyContext", null, 1, 1, PCM_ChangeRoles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCM_ChangeRoles_Roles(), theRepositoryPackage.getRole(), null, "roles", null, 1, -1, PCM_ChangeRoles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_AllocateNeverTogetherEClass, PCM_AllocateNeverTogether.class, "PCM_AllocateNeverTogether", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_AllocateNeverTogether_AllocationContexts(), theAllocationPackage.getAllocationContext(), null, "allocationContexts", null, 2, -1, PCM_AllocateNeverTogether.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_MultipleInstantiationEClass, PCM_MultipleInstantiation.class, "PCM_MultipleInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_MultipleInstantiation_AssemblyContexts(), theCompositionPackage.getAssemblyContext(), null, "assemblyContexts", null, 2, -1, PCM_MultipleInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_BanComponentEClass, PCM_BanComponent.class, "PCM_BanComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCM_BanComponent_BannedContextNames(), ecorePackage.getEString(), "bannedContextNames", null, 1, -1, PCM_BanComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_MultipleAllocationEClass, PCM_MultipleAllocation.class, "PCM_MultipleAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_MultipleAllocation_AllocationContexts(), theAllocationPackage.getAllocationContext(), null, "allocationContexts", null, 2, -1, PCM_MultipleAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_ProvidedFunctionalityEClass, PCM_ProvidedFunctionality.class, "PCM_ProvidedFunctionality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_ProvidedFunctionality_ProvidedRoles(), theRepositoryPackage.getOperationProvidedRole(), null, "providedRoles", null, 1, -1, PCM_ProvidedFunctionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_ReplaceComponentsEClass, PCM_ReplaceComponents.class, "PCM_ReplaceComponents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_ReplaceComponents_ContextsReplacedWith(), theCompositionPackage.getAssemblyContext(), null, "contextsReplacedWith", null, 1, -1, PCM_ReplaceComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPCM_ReplaceComponents_ReplacedContextNames(), ecorePackage.getEString(), "replacedContextNames", null, 1, -1, PCM_ReplaceComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_ReuseComponentEClass, PCM_ReuseComponent.class, "PCM_ReuseComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_ReuseComponent_AssemblyContexts(), theCompositionPackage.getAssemblyContext(), null, "assemblyContexts", null, 1, -1, PCM_ReuseComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_FunctionalityConnectionEClass, PCM_FunctionalityConnection.class, "PCM_FunctionalityConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_FunctionalityConnection_Connector(), theCompositionPackage.getAssemblyConnector(), null, "connector", null, 1, 1, PCM_FunctionalityConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCM_FunctionalityConnection_RequiredRole(), theRepositoryPackage.getOperationRequiredRole(), null, "requiredRole", null, 1, 1, PCM_FunctionalityConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCM_FunctionalityConnection_ProvidedRole(), theRepositoryPackage.getOperationProvidedRole(), null, "providedRole", null, 1, 1, PCM_FunctionalityConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_MergeComponentsEClass, PCM_MergeComponents.class, "PCM_MergeComponents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCM_MergeComponents_InitialContextsNameList(), ecorePackage.getEString(), "initialContextsNameList", null, 2, -1, PCM_MergeComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCM_MergeComponents_FinalContext(), theCompositionPackage.getAssemblyContext(), null, "finalContext", null, 1, 1, PCM_MergeComponents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_OnlySingleAllocationEClass, PCM_OnlySingleAllocation.class, "PCM_OnlySingleAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_OnlySingleAllocation_AllocationContexts(), theAllocationPackage.getAllocationContext(), null, "allocationContexts", null, 1, -1, PCM_OnlySingleAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_RequiredFunctionalityEClass, PCM_RequiredFunctionality.class, "PCM_RequiredFunctionality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_RequiredFunctionality_RequiredRoles(), theRepositoryPackage.getOperationRequiredRole(), null, "requiredRoles", null, 1, -1, PCM_RequiredFunctionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_ChangeDataTypeEClass, PCM_ChangeDataType.class, "PCM_ChangeDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_ChangeDataType_OldDataTypes(), theRepositoryPackage.getDataType(), null, "oldDataTypes", null, 1, -1, PCM_ChangeDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCM_ChangeDataType_NewDataTypes(), theRepositoryPackage.getDataType(), null, "newDataTypes", null, 0, -1, PCM_ChangeDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_IntroduceNewDataTypeEClass, PCM_IntroduceNewDataType.class, "PCM_IntroduceNewDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_IntroduceNewDataType_DataTypes(), theRepositoryPackage.getDataType(), null, "dataTypes", null, 0, -1, PCM_IntroduceNewDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_RemoveDataTypeEClass, PCM_RemoveDataType.class, "PCM_RemoveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_RemoveDataType_DataTypes(), theRepositoryPackage.getDataType(), null, "dataTypes", null, 1, -1, PCM_RemoveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_IntroduceNewInterfaceEClass, PCM_IntroduceNewInterface.class, "PCM_IntroduceNewInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_IntroduceNewInterface_Interfaces(), theRepositoryPackage.getOperationInterface(), null, "interfaces", null, 0, -1, PCM_IntroduceNewInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_ChangeInterfaceEClass, PCM_ChangeInterface.class, "PCM_ChangeInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_ChangeInterface_OldInterfaces(), theRepositoryPackage.getOperationInterface(), null, "oldInterfaces", null, 1, -1, PCM_ChangeInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCM_ChangeInterface_NewInterfaces(), theRepositoryPackage.getOperationInterface(), null, "newInterfaces", null, 0, -1, PCM_ChangeInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_RemoveInterfaceEClass, PCM_RemoveInterface.class, "PCM_RemoveInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_RemoveInterface_Interfaces(), theRepositoryPackage.getOperationInterface(), null, "interfaces", null, 1, -1, PCM_RemoveInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (pcM_AllocateTogetherEClass, 
		   source, 
		   new String[] {
			 "constraints", "TogetherAllocation"
		   });	
		addAnnotation
		  (pcM_NeverAllocateToSpecificNodesEClass, 
		   source, 
		   new String[] {
			 "constraints", "NeverAllocateToSpecificNodes"
		   });	
		addAnnotation
		  (pcM_MoveComponentsEClass, 
		   source, 
		   new String[] {
			 "constraints", "MoveComponents"
		   });	
		addAnnotation
		  (pcM_OnlySingleInstantiationEClass, 
		   source, 
		   new String[] {
			 "constraints", "SingleInstantiation"
		   });	
		addAnnotation
		  (pcM_AllocateNeverTogetherEClass, 
		   source, 
		   new String[] {
			 "constraints", "NeverTogether"
		   });	
		addAnnotation
		  (pcM_MultipleInstantiationEClass, 
		   source, 
		   new String[] {
			 "constraints", "SameComponent"
		   });	
		addAnnotation
		  (pcM_MultipleAllocationEClass, 
		   source, 
		   new String[] {
			 "constraints", "MultipleAllocation"
		   });	
		addAnnotation
		  (pcM_FunctionalityConnectionEClass, 
		   source, 
		   new String[] {
			 "constraints", "RolesHaveValidConnection"
		   });	
		addAnnotation
		  (pcM_OnlySingleAllocationEClass, 
		   source, 
		   new String[] {
			 "constraints", "SingleAllocation"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (pcM_AllocateTogetherEClass, 
		   source, 
		   new String[] {
			 "TogetherAllocation", "allocationContexts->forAll(a:allocation::AllocationContext, b:allocation::AllocationContext | a<>b implies (a.resourceContainer_AllocationContext=b.resourceContainer_AllocationContext and a.assemblyContext_AllocationContext <> b.assemblyContext_AllocationContext))"
		   });	
		addAnnotation
		  (pcM_NeverAllocateToSpecificNodesEClass, 
		   source, 
		   new String[] {
			 "NeverAllocateToSpecificNodes", "allocationContexts->forAll(a:allocation::AllocationContext | not hwNodes->exists(h|a.resourceContainer_AllocationContext=h))"
		   });	
		addAnnotation
		  (pcM_MoveComponentsEClass, 
		   source, 
		   new String[] {
			 "MoveComponents", "allocationContexts->forAll(a:allocation::AllocationContext | a.resourceContainer_AllocationContext<>fromHwNode and a.resourceContainer_AllocationContext=toHwNode)"
		   });	
		addAnnotation
		  (pcM_OnlySingleInstantiationEClass, 
		   source, 
		   new String[] {
			 "SingleInstantiation", "assemblyContext.parentStructure__AssemblyContext.assemblyContexts__ComposedStructure->select(a : composition::AssemblyContext| a.encapsulatedComponent__AssemblyContext = assemblyContext.encapsulatedComponent__AssemblyContext)->size()=1"
		   });	
		addAnnotation
		  (pcM_AllocateNeverTogetherEClass, 
		   source, 
		   new String[] {
			 "NeverTogether", "allocationContexts->forAll(a:allocation::AllocationContext, b:allocation::AllocationContext | a<>b implies a.resourceContainer_AllocationContext<>b.resourceContainer_AllocationContext)"
		   });	
		addAnnotation
		  (pcM_MultipleInstantiationEClass, 
		   source, 
		   new String[] {
			 "SameComponent", "assemblyContexts->forAll(a : composition::AssemblyContext, b : composition::AssemblyContext | a<> b implies (a.encapsulatedComponent__AssemblyContext = b.encapsulatedComponent__AssemblyContext))"
		   });	
		addAnnotation
		  (pcM_MultipleAllocationEClass, 
		   source, 
		   new String[] {
			 "MultipleAllocation", "allocationContexts->forAll(a:allocation::AllocationContext, b:allocation::AllocationContext | a<>b implies (a.assemblyContext_AllocationContext=b.assemblyContext_AllocationContext and a.resourceContainer_AllocationContext<>b.resourceContainer_AllocationContext))"
		   });	
		addAnnotation
		  (pcM_FunctionalityConnectionEClass, 
		   source, 
		   new String[] {
			 "RolesHaveValidConnection", "connector.providedRole_AssemblyConnector =providedRole and connector.requiredRole_AssemblyConnector=requiredRole"
		   });	
		addAnnotation
		  (pcM_OnlySingleAllocationEClass, 
		   source, 
		   new String[] {
			 "SingleAllocation", "allocationContext.allocation_AllocationContext.allocationContexts_Allocation->select(a : allocation :: AllocationContext|a.assemblyContext_AllocationContext=allocationContext.assemblyContext_AllocationContext)->size()=1"
		   });
	}

} //PcmarchoptionsPackageImpl
