/**
 */
package pcmarchoptions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pcmarchoptions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcmarchoptionsFactoryImpl extends EFactoryImpl implements PcmarchoptionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PcmarchoptionsFactory init() {
		try {
			PcmarchoptionsFactory thePcmarchoptionsFactory = (PcmarchoptionsFactory)EPackage.Registry.INSTANCE.getEFactory(PcmarchoptionsPackage.eNS_URI);
			if (thePcmarchoptionsFactory != null) {
				return thePcmarchoptionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PcmarchoptionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmarchoptionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PcmarchoptionsPackage.PCM_SPLIT_COMPONENT: return (EObject)createPCM_SplitComponent();
			case PcmarchoptionsPackage.PCM_ALLOCATE_TOGETHER: return (EObject)createPCM_AllocateTogether();
			case PcmarchoptionsPackage.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES: return (EObject)createPCM_NeverAllocateToSpecificNodes();
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER: return (EObject)createPCM_IntroduceNewAdapter();
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_COMPONENT: return (EObject)createPCM_IntroduceNewComponent();
			case PcmarchoptionsPackage.PCM_MOVE_COMPONENTS: return (EObject)createPCM_MoveComponents();
			case PcmarchoptionsPackage.PCM_ONLY_SINGLE_INSTANTIATION: return (EObject)createPCM_OnlySingleInstantiation();
			case PcmarchoptionsPackage.PCM_CHANGE_ROLES: return (EObject)createPCM_ChangeRoles();
			case PcmarchoptionsPackage.PCM_ALLOCATE_NEVER_TOGETHER: return (EObject)createPCM_AllocateNeverTogether();
			case PcmarchoptionsPackage.PCM_MULTIPLE_INSTANTIATION: return (EObject)createPCM_MultipleInstantiation();
			case PcmarchoptionsPackage.PCM_BAN_COMPONENT: return (EObject)createPCM_BanComponent();
			case PcmarchoptionsPackage.PCM_MULTIPLE_ALLOCATION: return (EObject)createPCM_MultipleAllocation();
			case PcmarchoptionsPackage.PCM_PROVIDED_FUNCTIONALITY: return (EObject)createPCM_ProvidedFunctionality();
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS: return (EObject)createPCM_ReplaceComponents();
			case PcmarchoptionsPackage.PCM_REUSE_COMPONENT: return (EObject)createPCM_ReuseComponent();
			case PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION: return (EObject)createPCM_FunctionalityConnection();
			case PcmarchoptionsPackage.PCM_MERGE_COMPONENTS: return (EObject)createPCM_MergeComponents();
			case PcmarchoptionsPackage.PCM_ONLY_SINGLE_ALLOCATION: return (EObject)createPCM_OnlySingleAllocation();
			case PcmarchoptionsPackage.PCM_REQUIRED_FUNCTIONALITY: return (EObject)createPCM_RequiredFunctionality();
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE: return (EObject)createPCM_ChangeDataType();
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_DATA_TYPE: return (EObject)createPCM_IntroduceNewDataType();
			case PcmarchoptionsPackage.PCM_REMOVE_DATA_TYPE: return (EObject)createPCM_RemoveDataType();
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_INTERFACE: return (EObject)createPCM_IntroduceNewInterface();
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE: return (EObject)createPCM_ChangeInterface();
			case PcmarchoptionsPackage.PCM_REMOVE_INTERFACE: return (EObject)createPCM_RemoveInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_SplitComponent createPCM_SplitComponent() {
		PCM_SplitComponentImpl pcM_SplitComponent = new PCM_SplitComponentImpl();
		return pcM_SplitComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_AllocateTogether createPCM_AllocateTogether() {
		PCM_AllocateTogetherImpl pcM_AllocateTogether = new PCM_AllocateTogetherImpl();
		return pcM_AllocateTogether;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_NeverAllocateToSpecificNodes createPCM_NeverAllocateToSpecificNodes() {
		PCM_NeverAllocateToSpecificNodesImpl pcM_NeverAllocateToSpecificNodes = new PCM_NeverAllocateToSpecificNodesImpl();
		return pcM_NeverAllocateToSpecificNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_IntroduceNewAdapter createPCM_IntroduceNewAdapter() {
		PCM_IntroduceNewAdapterImpl pcM_IntroduceNewAdapter = new PCM_IntroduceNewAdapterImpl();
		return pcM_IntroduceNewAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_IntroduceNewComponent createPCM_IntroduceNewComponent() {
		PCM_IntroduceNewComponentImpl pcM_IntroduceNewComponent = new PCM_IntroduceNewComponentImpl();
		return pcM_IntroduceNewComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_MoveComponents createPCM_MoveComponents() {
		PCM_MoveComponentsImpl pcM_MoveComponents = new PCM_MoveComponentsImpl();
		return pcM_MoveComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_OnlySingleInstantiation createPCM_OnlySingleInstantiation() {
		PCM_OnlySingleInstantiationImpl pcM_OnlySingleInstantiation = new PCM_OnlySingleInstantiationImpl();
		return pcM_OnlySingleInstantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_ChangeRoles createPCM_ChangeRoles() {
		PCM_ChangeRolesImpl pcM_ChangeRoles = new PCM_ChangeRolesImpl();
		return pcM_ChangeRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_AllocateNeverTogether createPCM_AllocateNeverTogether() {
		PCM_AllocateNeverTogetherImpl pcM_AllocateNeverTogether = new PCM_AllocateNeverTogetherImpl();
		return pcM_AllocateNeverTogether;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_MultipleInstantiation createPCM_MultipleInstantiation() {
		PCM_MultipleInstantiationImpl pcM_MultipleInstantiation = new PCM_MultipleInstantiationImpl();
		return pcM_MultipleInstantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_BanComponent createPCM_BanComponent() {
		PCM_BanComponentImpl pcM_BanComponent = new PCM_BanComponentImpl();
		return pcM_BanComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_MultipleAllocation createPCM_MultipleAllocation() {
		PCM_MultipleAllocationImpl pcM_MultipleAllocation = new PCM_MultipleAllocationImpl();
		return pcM_MultipleAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_ProvidedFunctionality createPCM_ProvidedFunctionality() {
		PCM_ProvidedFunctionalityImpl pcM_ProvidedFunctionality = new PCM_ProvidedFunctionalityImpl();
		return pcM_ProvidedFunctionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_ReplaceComponents createPCM_ReplaceComponents() {
		PCM_ReplaceComponentsImpl pcM_ReplaceComponents = new PCM_ReplaceComponentsImpl();
		return pcM_ReplaceComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_ReuseComponent createPCM_ReuseComponent() {
		PCM_ReuseComponentImpl pcM_ReuseComponent = new PCM_ReuseComponentImpl();
		return pcM_ReuseComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_FunctionalityConnection createPCM_FunctionalityConnection() {
		PCM_FunctionalityConnectionImpl pcM_FunctionalityConnection = new PCM_FunctionalityConnectionImpl();
		return pcM_FunctionalityConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_MergeComponents createPCM_MergeComponents() {
		PCM_MergeComponentsImpl pcM_MergeComponents = new PCM_MergeComponentsImpl();
		return pcM_MergeComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_OnlySingleAllocation createPCM_OnlySingleAllocation() {
		PCM_OnlySingleAllocationImpl pcM_OnlySingleAllocation = new PCM_OnlySingleAllocationImpl();
		return pcM_OnlySingleAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_RequiredFunctionality createPCM_RequiredFunctionality() {
		PCM_RequiredFunctionalityImpl pcM_RequiredFunctionality = new PCM_RequiredFunctionalityImpl();
		return pcM_RequiredFunctionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_ChangeDataType createPCM_ChangeDataType() {
		PCM_ChangeDataTypeImpl pcM_ChangeDataType = new PCM_ChangeDataTypeImpl();
		return pcM_ChangeDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_IntroduceNewDataType createPCM_IntroduceNewDataType() {
		PCM_IntroduceNewDataTypeImpl pcM_IntroduceNewDataType = new PCM_IntroduceNewDataTypeImpl();
		return pcM_IntroduceNewDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_RemoveDataType createPCM_RemoveDataType() {
		PCM_RemoveDataTypeImpl pcM_RemoveDataType = new PCM_RemoveDataTypeImpl();
		return pcM_RemoveDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_IntroduceNewInterface createPCM_IntroduceNewInterface() {
		PCM_IntroduceNewInterfaceImpl pcM_IntroduceNewInterface = new PCM_IntroduceNewInterfaceImpl();
		return pcM_IntroduceNewInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_ChangeInterface createPCM_ChangeInterface() {
		PCM_ChangeInterfaceImpl pcM_ChangeInterface = new PCM_ChangeInterfaceImpl();
		return pcM_ChangeInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCM_RemoveInterface createPCM_RemoveInterface() {
		PCM_RemoveInterfaceImpl pcM_RemoveInterface = new PCM_RemoveInterfaceImpl();
		return pcM_RemoveInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmarchoptionsPackage getPcmarchoptionsPackage() {
		return (PcmarchoptionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PcmarchoptionsPackage getPackage() {
		return PcmarchoptionsPackage.eINSTANCE;
	}

} //PcmarchoptionsFactoryImpl
