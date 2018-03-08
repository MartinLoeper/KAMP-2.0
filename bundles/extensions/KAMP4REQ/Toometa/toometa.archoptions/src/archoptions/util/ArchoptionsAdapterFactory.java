/**
 */
package archoptions.util;

import archoptions.*;

import de.uka.ipd.sdq.identifier.Identifier;

import options.Option;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import relations.AlternativeObject;
import relations.ConflictObject;
import relations.CouldResolveObject;
import relations.DependencyObject;
import relations.DuplicationObject;
import relations.ParentalObject;
import relations.RelationObject;
import relations.ResolveObject;
import relations.SelectionObject;
import relations.StakeholderObject;
import relations.TraceableObject;
import relations.TriggerObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see archoptions.ArchoptionsPackage
 * @generated
 */
public class ArchoptionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArchoptionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchoptionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArchoptionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchoptionsSwitch<Adapter> modelSwitch =
		new ArchoptionsSwitch<Adapter>() {
			@Override
			public Adapter caseProvidedFunctionality(ProvidedFunctionality object) {
				return createProvidedFunctionalityAdapter();
			}
			@Override
			public Adapter caseRequiredFunctionality(RequiredFunctionality object) {
				return createRequiredFunctionalityAdapter();
			}
			@Override
			public Adapter caseFunctionalityConnection(FunctionalityConnection object) {
				return createFunctionalityConnectionAdapter();
			}
			@Override
			public Adapter caseMultipleInstantiation(MultipleInstantiation object) {
				return createMultipleInstantiationAdapter();
			}
			@Override
			public Adapter caseOnlySingleInstantiation(OnlySingleInstantiation object) {
				return createOnlySingleInstantiationAdapter();
			}
			@Override
			public Adapter caseOnlySingleAllocation(OnlySingleAllocation object) {
				return createOnlySingleAllocationAdapter();
			}
			@Override
			public Adapter caseMultipleAllocation(MultipleAllocation object) {
				return createMultipleAllocationAdapter();
			}
			@Override
			public Adapter caseAllocateTogether(AllocateTogether object) {
				return createAllocateTogetherAdapter();
			}
			@Override
			public Adapter caseAllocateNeverTogether(AllocateNeverTogether object) {
				return createAllocateNeverTogetherAdapter();
			}
			@Override
			public Adapter caseNeverAllocateToSpecificNodes(NeverAllocateToSpecificNodes object) {
				return createNeverAllocateToSpecificNodesAdapter();
			}
			@Override
			public Adapter caseMoveComponents(MoveComponents object) {
				return createMoveComponentsAdapter();
			}
			@Override
			public Adapter caseIntroduceNewComponent(IntroduceNewComponent object) {
				return createIntroduceNewComponentAdapter();
			}
			@Override
			public Adapter caseIntroduceNewAdapter(IntroduceNewAdapter object) {
				return createIntroduceNewAdapterAdapter();
			}
			@Override
			public Adapter caseReuseComponent(ReuseComponent object) {
				return createReuseComponentAdapter();
			}
			@Override
			public Adapter caseBanComponent(BanComponent object) {
				return createBanComponentAdapter();
			}
			@Override
			public Adapter caseReplaceComponents(ReplaceComponents object) {
				return createReplaceComponentsAdapter();
			}
			@Override
			public Adapter caseSplitComponent(SplitComponent object) {
				return createSplitComponentAdapter();
			}
			@Override
			public Adapter caseMergeComponents(MergeComponents object) {
				return createMergeComponentsAdapter();
			}
			@Override
			public Adapter caseChangeRoles(ChangeRoles object) {
				return createChangeRolesAdapter();
			}
			@Override
			public Adapter caseComponentOption(ComponentOption object) {
				return createComponentOptionAdapter();
			}
			@Override
			public Adapter caseDeploymentOption(DeploymentOption object) {
				return createDeploymentOptionAdapter();
			}
			@Override
			public Adapter caseArchOption(ArchOption object) {
				return createArchOptionAdapter();
			}
			@Override
			public Adapter caseChangeDataType(ChangeDataType object) {
				return createChangeDataTypeAdapter();
			}
			@Override
			public Adapter caseIntroduceNewDataType(IntroduceNewDataType object) {
				return createIntroduceNewDataTypeAdapter();
			}
			@Override
			public Adapter caseRemoveDataType(RemoveDataType object) {
				return createRemoveDataTypeAdapter();
			}
			@Override
			public Adapter caseInterfaceOption(InterfaceOption object) {
				return createInterfaceOptionAdapter();
			}
			@Override
			public Adapter caseDataTypeOption(DataTypeOption object) {
				return createDataTypeOptionAdapter();
			}
			@Override
			public Adapter caseChangeInterface(ChangeInterface object) {
				return createChangeInterfaceAdapter();
			}
			@Override
			public Adapter caseRemoveInterface(RemoveInterface object) {
				return createRemoveInterfaceAdapter();
			}
			@Override
			public Adapter caseIntroduceNewInterface(IntroduceNewInterface object) {
				return createIntroduceNewInterfaceAdapter();
			}
			@Override
			public Adapter caseArchCandidate(ArchCandidate object) {
				return createArchCandidateAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseRelationObject(RelationObject object) {
				return createRelationObjectAdapter();
			}
			@Override
			public Adapter caseConflictObject(ConflictObject object) {
				return createConflictObjectAdapter();
			}
			@Override
			public Adapter caseDuplicationObject(DuplicationObject object) {
				return createDuplicationObjectAdapter();
			}
			@Override
			public Adapter caseDependencyObject(DependencyObject object) {
				return createDependencyObjectAdapter();
			}
			@Override
			public Adapter caseParentalObject(ParentalObject object) {
				return createParentalObjectAdapter();
			}
			@Override
			public Adapter caseTriggerObject(TriggerObject object) {
				return createTriggerObjectAdapter();
			}
			@Override
			public Adapter caseResolveObject(ResolveObject object) {
				return createResolveObjectAdapter();
			}
			@Override
			public Adapter caseAlternativeObject(AlternativeObject object) {
				return createAlternativeObjectAdapter();
			}
			@Override
			public Adapter caseCouldResolveObject(CouldResolveObject object) {
				return createCouldResolveObjectAdapter();
			}
			@Override
			public Adapter caseStakeholderObject(StakeholderObject object) {
				return createStakeholderObjectAdapter();
			}
			@Override
			public Adapter caseSelectionObject(SelectionObject object) {
				return createSelectionObjectAdapter();
			}
			@Override
			public Adapter caseTraceableObject(TraceableObject object) {
				return createTraceableObjectAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link archoptions.ProvidedFunctionality <em>Provided Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.ProvidedFunctionality
	 * @generated
	 */
	public Adapter createProvidedFunctionalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.RequiredFunctionality <em>Required Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.RequiredFunctionality
	 * @generated
	 */
	public Adapter createRequiredFunctionalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.FunctionalityConnection <em>Functionality Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.FunctionalityConnection
	 * @generated
	 */
	public Adapter createFunctionalityConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.MultipleInstantiation <em>Multiple Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.MultipleInstantiation
	 * @generated
	 */
	public Adapter createMultipleInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.OnlySingleInstantiation <em>Only Single Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.OnlySingleInstantiation
	 * @generated
	 */
	public Adapter createOnlySingleInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.OnlySingleAllocation <em>Only Single Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.OnlySingleAllocation
	 * @generated
	 */
	public Adapter createOnlySingleAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.MultipleAllocation <em>Multiple Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.MultipleAllocation
	 * @generated
	 */
	public Adapter createMultipleAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.AllocateTogether <em>Allocate Together</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.AllocateTogether
	 * @generated
	 */
	public Adapter createAllocateTogetherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.AllocateNeverTogether <em>Allocate Never Together</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.AllocateNeverTogether
	 * @generated
	 */
	public Adapter createAllocateNeverTogetherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.NeverAllocateToSpecificNodes <em>Never Allocate To Specific Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.NeverAllocateToSpecificNodes
	 * @generated
	 */
	public Adapter createNeverAllocateToSpecificNodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.MoveComponents <em>Move Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.MoveComponents
	 * @generated
	 */
	public Adapter createMoveComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.IntroduceNewComponent <em>Introduce New Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.IntroduceNewComponent
	 * @generated
	 */
	public Adapter createIntroduceNewComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.IntroduceNewAdapter <em>Introduce New Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.IntroduceNewAdapter
	 * @generated
	 */
	public Adapter createIntroduceNewAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.ReuseComponent <em>Reuse Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.ReuseComponent
	 * @generated
	 */
	public Adapter createReuseComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.BanComponent <em>Ban Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.BanComponent
	 * @generated
	 */
	public Adapter createBanComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.ReplaceComponents <em>Replace Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.ReplaceComponents
	 * @generated
	 */
	public Adapter createReplaceComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.SplitComponent <em>Split Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.SplitComponent
	 * @generated
	 */
	public Adapter createSplitComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.MergeComponents <em>Merge Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.MergeComponents
	 * @generated
	 */
	public Adapter createMergeComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.ChangeRoles <em>Change Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.ChangeRoles
	 * @generated
	 */
	public Adapter createChangeRolesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.ComponentOption <em>Component Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.ComponentOption
	 * @generated
	 */
	public Adapter createComponentOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.DeploymentOption <em>Deployment Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.DeploymentOption
	 * @generated
	 */
	public Adapter createDeploymentOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.ArchOption <em>Arch Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.ArchOption
	 * @generated
	 */
	public Adapter createArchOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.ChangeDataType <em>Change Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.ChangeDataType
	 * @generated
	 */
	public Adapter createChangeDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.IntroduceNewDataType <em>Introduce New Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.IntroduceNewDataType
	 * @generated
	 */
	public Adapter createIntroduceNewDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.RemoveDataType <em>Remove Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.RemoveDataType
	 * @generated
	 */
	public Adapter createRemoveDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.InterfaceOption <em>Interface Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.InterfaceOption
	 * @generated
	 */
	public Adapter createInterfaceOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.DataTypeOption <em>Data Type Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.DataTypeOption
	 * @generated
	 */
	public Adapter createDataTypeOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.ChangeInterface <em>Change Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.ChangeInterface
	 * @generated
	 */
	public Adapter createChangeInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.RemoveInterface <em>Remove Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.RemoveInterface
	 * @generated
	 */
	public Adapter createRemoveInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.IntroduceNewInterface <em>Introduce New Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.IntroduceNewInterface
	 * @generated
	 */
	public Adapter createIntroduceNewInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.ArchCandidate <em>Arch Candidate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.ArchCandidate
	 * @generated
	 */
	public Adapter createArchCandidateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.RelationObject <em>Relation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.RelationObject
	 * @generated
	 */
	public Adapter createRelationObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.ConflictObject <em>Conflict Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.ConflictObject
	 * @generated
	 */
	public Adapter createConflictObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.DuplicationObject <em>Duplication Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.DuplicationObject
	 * @generated
	 */
	public Adapter createDuplicationObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.DependencyObject <em>Dependency Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.DependencyObject
	 * @generated
	 */
	public Adapter createDependencyObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.ParentalObject <em>Parental Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.ParentalObject
	 * @generated
	 */
	public Adapter createParentalObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.TriggerObject <em>Trigger Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.TriggerObject
	 * @generated
	 */
	public Adapter createTriggerObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.ResolveObject <em>Resolve Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.ResolveObject
	 * @generated
	 */
	public Adapter createResolveObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.AlternativeObject <em>Alternative Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.AlternativeObject
	 * @generated
	 */
	public Adapter createAlternativeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.CouldResolveObject <em>Could Resolve Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.CouldResolveObject
	 * @generated
	 */
	public Adapter createCouldResolveObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.StakeholderObject <em>Stakeholder Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.StakeholderObject
	 * @generated
	 */
	public Adapter createStakeholderObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.SelectionObject <em>Selection Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.SelectionObject
	 * @generated
	 */
	public Adapter createSelectionObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.TraceableObject <em>Traceable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.TraceableObject
	 * @generated
	 */
	public Adapter createTraceableObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link options.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see options.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArchoptionsAdapterFactory
