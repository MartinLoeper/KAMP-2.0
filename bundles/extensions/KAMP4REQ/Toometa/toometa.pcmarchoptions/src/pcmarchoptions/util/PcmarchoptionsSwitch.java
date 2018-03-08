/**
 */
package pcmarchoptions.util;

import archoptions.AllocateNeverTogether;
import archoptions.AllocateTogether;
import archoptions.ArchOption;
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

import de.uka.ipd.sdq.identifier.Identifier;

import options.Option;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pcmarchoptions.*;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pcmarchoptions.PcmarchoptionsPackage
 * @generated
 */
public class PcmarchoptionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PcmarchoptionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmarchoptionsSwitch() {
		if (modelPackage == null) {
			modelPackage = PcmarchoptionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PcmarchoptionsPackage.PCM_SPLIT_COMPONENT: {
				PCM_SplitComponent pcM_SplitComponent = (PCM_SplitComponent)theEObject;
				T result = casePCM_SplitComponent(pcM_SplitComponent);
				if (result == null) result = caseSplitComponent(pcM_SplitComponent);
				if (result == null) result = caseComponentOption(pcM_SplitComponent);
				if (result == null) result = caseArchOption(pcM_SplitComponent);
				if (result == null) result = caseOption(pcM_SplitComponent);
				if (result == null) result = caseTraceableObject(pcM_SplitComponent);
				if (result == null) result = caseRelationObject(pcM_SplitComponent);
				if (result == null) result = caseConflictObject(pcM_SplitComponent);
				if (result == null) result = caseDuplicationObject(pcM_SplitComponent);
				if (result == null) result = caseDependencyObject(pcM_SplitComponent);
				if (result == null) result = caseParentalObject(pcM_SplitComponent);
				if (result == null) result = caseTriggerObject(pcM_SplitComponent);
				if (result == null) result = caseResolveObject(pcM_SplitComponent);
				if (result == null) result = caseAlternativeObject(pcM_SplitComponent);
				if (result == null) result = caseCouldResolveObject(pcM_SplitComponent);
				if (result == null) result = caseStakeholderObject(pcM_SplitComponent);
				if (result == null) result = caseSelectionObject(pcM_SplitComponent);
				if (result == null) result = caseIdentifier(pcM_SplitComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_ALLOCATE_TOGETHER: {
				PCM_AllocateTogether pcM_AllocateTogether = (PCM_AllocateTogether)theEObject;
				T result = casePCM_AllocateTogether(pcM_AllocateTogether);
				if (result == null) result = caseAllocateTogether(pcM_AllocateTogether);
				if (result == null) result = caseDeploymentOption(pcM_AllocateTogether);
				if (result == null) result = caseArchOption(pcM_AllocateTogether);
				if (result == null) result = caseOption(pcM_AllocateTogether);
				if (result == null) result = caseTraceableObject(pcM_AllocateTogether);
				if (result == null) result = caseRelationObject(pcM_AllocateTogether);
				if (result == null) result = caseConflictObject(pcM_AllocateTogether);
				if (result == null) result = caseDuplicationObject(pcM_AllocateTogether);
				if (result == null) result = caseDependencyObject(pcM_AllocateTogether);
				if (result == null) result = caseParentalObject(pcM_AllocateTogether);
				if (result == null) result = caseTriggerObject(pcM_AllocateTogether);
				if (result == null) result = caseResolveObject(pcM_AllocateTogether);
				if (result == null) result = caseAlternativeObject(pcM_AllocateTogether);
				if (result == null) result = caseCouldResolveObject(pcM_AllocateTogether);
				if (result == null) result = caseStakeholderObject(pcM_AllocateTogether);
				if (result == null) result = caseSelectionObject(pcM_AllocateTogether);
				if (result == null) result = caseIdentifier(pcM_AllocateTogether);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES: {
				PCM_NeverAllocateToSpecificNodes pcM_NeverAllocateToSpecificNodes = (PCM_NeverAllocateToSpecificNodes)theEObject;
				T result = casePCM_NeverAllocateToSpecificNodes(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseNeverAllocateToSpecificNodes(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseDeploymentOption(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseArchOption(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseOption(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseTraceableObject(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseRelationObject(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseConflictObject(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseDuplicationObject(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseDependencyObject(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseParentalObject(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseTriggerObject(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseResolveObject(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseAlternativeObject(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseCouldResolveObject(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseStakeholderObject(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseSelectionObject(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = caseIdentifier(pcM_NeverAllocateToSpecificNodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER: {
				PCM_IntroduceNewAdapter pcM_IntroduceNewAdapter = (PCM_IntroduceNewAdapter)theEObject;
				T result = casePCM_IntroduceNewAdapter(pcM_IntroduceNewAdapter);
				if (result == null) result = caseIntroduceNewAdapter(pcM_IntroduceNewAdapter);
				if (result == null) result = caseComponentOption(pcM_IntroduceNewAdapter);
				if (result == null) result = caseArchOption(pcM_IntroduceNewAdapter);
				if (result == null) result = caseOption(pcM_IntroduceNewAdapter);
				if (result == null) result = caseTraceableObject(pcM_IntroduceNewAdapter);
				if (result == null) result = caseRelationObject(pcM_IntroduceNewAdapter);
				if (result == null) result = caseConflictObject(pcM_IntroduceNewAdapter);
				if (result == null) result = caseDuplicationObject(pcM_IntroduceNewAdapter);
				if (result == null) result = caseDependencyObject(pcM_IntroduceNewAdapter);
				if (result == null) result = caseParentalObject(pcM_IntroduceNewAdapter);
				if (result == null) result = caseTriggerObject(pcM_IntroduceNewAdapter);
				if (result == null) result = caseResolveObject(pcM_IntroduceNewAdapter);
				if (result == null) result = caseAlternativeObject(pcM_IntroduceNewAdapter);
				if (result == null) result = caseCouldResolveObject(pcM_IntroduceNewAdapter);
				if (result == null) result = caseStakeholderObject(pcM_IntroduceNewAdapter);
				if (result == null) result = caseSelectionObject(pcM_IntroduceNewAdapter);
				if (result == null) result = caseIdentifier(pcM_IntroduceNewAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_COMPONENT: {
				PCM_IntroduceNewComponent pcM_IntroduceNewComponent = (PCM_IntroduceNewComponent)theEObject;
				T result = casePCM_IntroduceNewComponent(pcM_IntroduceNewComponent);
				if (result == null) result = caseIntroduceNewComponent(pcM_IntroduceNewComponent);
				if (result == null) result = caseComponentOption(pcM_IntroduceNewComponent);
				if (result == null) result = caseArchOption(pcM_IntroduceNewComponent);
				if (result == null) result = caseOption(pcM_IntroduceNewComponent);
				if (result == null) result = caseTraceableObject(pcM_IntroduceNewComponent);
				if (result == null) result = caseRelationObject(pcM_IntroduceNewComponent);
				if (result == null) result = caseConflictObject(pcM_IntroduceNewComponent);
				if (result == null) result = caseDuplicationObject(pcM_IntroduceNewComponent);
				if (result == null) result = caseDependencyObject(pcM_IntroduceNewComponent);
				if (result == null) result = caseParentalObject(pcM_IntroduceNewComponent);
				if (result == null) result = caseTriggerObject(pcM_IntroduceNewComponent);
				if (result == null) result = caseResolveObject(pcM_IntroduceNewComponent);
				if (result == null) result = caseAlternativeObject(pcM_IntroduceNewComponent);
				if (result == null) result = caseCouldResolveObject(pcM_IntroduceNewComponent);
				if (result == null) result = caseStakeholderObject(pcM_IntroduceNewComponent);
				if (result == null) result = caseSelectionObject(pcM_IntroduceNewComponent);
				if (result == null) result = caseIdentifier(pcM_IntroduceNewComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_MOVE_COMPONENTS: {
				PCM_MoveComponents pcM_MoveComponents = (PCM_MoveComponents)theEObject;
				T result = casePCM_MoveComponents(pcM_MoveComponents);
				if (result == null) result = caseMoveComponents(pcM_MoveComponents);
				if (result == null) result = caseDeploymentOption(pcM_MoveComponents);
				if (result == null) result = caseArchOption(pcM_MoveComponents);
				if (result == null) result = caseOption(pcM_MoveComponents);
				if (result == null) result = caseTraceableObject(pcM_MoveComponents);
				if (result == null) result = caseRelationObject(pcM_MoveComponents);
				if (result == null) result = caseConflictObject(pcM_MoveComponents);
				if (result == null) result = caseDuplicationObject(pcM_MoveComponents);
				if (result == null) result = caseDependencyObject(pcM_MoveComponents);
				if (result == null) result = caseParentalObject(pcM_MoveComponents);
				if (result == null) result = caseTriggerObject(pcM_MoveComponents);
				if (result == null) result = caseResolveObject(pcM_MoveComponents);
				if (result == null) result = caseAlternativeObject(pcM_MoveComponents);
				if (result == null) result = caseCouldResolveObject(pcM_MoveComponents);
				if (result == null) result = caseStakeholderObject(pcM_MoveComponents);
				if (result == null) result = caseSelectionObject(pcM_MoveComponents);
				if (result == null) result = caseIdentifier(pcM_MoveComponents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_ONLY_SINGLE_INSTANTIATION: {
				PCM_OnlySingleInstantiation pcM_OnlySingleInstantiation = (PCM_OnlySingleInstantiation)theEObject;
				T result = casePCM_OnlySingleInstantiation(pcM_OnlySingleInstantiation);
				if (result == null) result = caseOnlySingleInstantiation(pcM_OnlySingleInstantiation);
				if (result == null) result = caseComponentOption(pcM_OnlySingleInstantiation);
				if (result == null) result = caseArchOption(pcM_OnlySingleInstantiation);
				if (result == null) result = caseOption(pcM_OnlySingleInstantiation);
				if (result == null) result = caseTraceableObject(pcM_OnlySingleInstantiation);
				if (result == null) result = caseRelationObject(pcM_OnlySingleInstantiation);
				if (result == null) result = caseConflictObject(pcM_OnlySingleInstantiation);
				if (result == null) result = caseDuplicationObject(pcM_OnlySingleInstantiation);
				if (result == null) result = caseDependencyObject(pcM_OnlySingleInstantiation);
				if (result == null) result = caseParentalObject(pcM_OnlySingleInstantiation);
				if (result == null) result = caseTriggerObject(pcM_OnlySingleInstantiation);
				if (result == null) result = caseResolveObject(pcM_OnlySingleInstantiation);
				if (result == null) result = caseAlternativeObject(pcM_OnlySingleInstantiation);
				if (result == null) result = caseCouldResolveObject(pcM_OnlySingleInstantiation);
				if (result == null) result = caseStakeholderObject(pcM_OnlySingleInstantiation);
				if (result == null) result = caseSelectionObject(pcM_OnlySingleInstantiation);
				if (result == null) result = caseIdentifier(pcM_OnlySingleInstantiation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_CHANGE_ROLES: {
				PCM_ChangeRoles pcM_ChangeRoles = (PCM_ChangeRoles)theEObject;
				T result = casePCM_ChangeRoles(pcM_ChangeRoles);
				if (result == null) result = caseChangeRoles(pcM_ChangeRoles);
				if (result == null) result = caseComponentOption(pcM_ChangeRoles);
				if (result == null) result = caseArchOption(pcM_ChangeRoles);
				if (result == null) result = caseOption(pcM_ChangeRoles);
				if (result == null) result = caseTraceableObject(pcM_ChangeRoles);
				if (result == null) result = caseRelationObject(pcM_ChangeRoles);
				if (result == null) result = caseConflictObject(pcM_ChangeRoles);
				if (result == null) result = caseDuplicationObject(pcM_ChangeRoles);
				if (result == null) result = caseDependencyObject(pcM_ChangeRoles);
				if (result == null) result = caseParentalObject(pcM_ChangeRoles);
				if (result == null) result = caseTriggerObject(pcM_ChangeRoles);
				if (result == null) result = caseResolveObject(pcM_ChangeRoles);
				if (result == null) result = caseAlternativeObject(pcM_ChangeRoles);
				if (result == null) result = caseCouldResolveObject(pcM_ChangeRoles);
				if (result == null) result = caseStakeholderObject(pcM_ChangeRoles);
				if (result == null) result = caseSelectionObject(pcM_ChangeRoles);
				if (result == null) result = caseIdentifier(pcM_ChangeRoles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_ALLOCATE_NEVER_TOGETHER: {
				PCM_AllocateNeverTogether pcM_AllocateNeverTogether = (PCM_AllocateNeverTogether)theEObject;
				T result = casePCM_AllocateNeverTogether(pcM_AllocateNeverTogether);
				if (result == null) result = caseAllocateNeverTogether(pcM_AllocateNeverTogether);
				if (result == null) result = caseDeploymentOption(pcM_AllocateNeverTogether);
				if (result == null) result = caseArchOption(pcM_AllocateNeverTogether);
				if (result == null) result = caseOption(pcM_AllocateNeverTogether);
				if (result == null) result = caseTraceableObject(pcM_AllocateNeverTogether);
				if (result == null) result = caseRelationObject(pcM_AllocateNeverTogether);
				if (result == null) result = caseConflictObject(pcM_AllocateNeverTogether);
				if (result == null) result = caseDuplicationObject(pcM_AllocateNeverTogether);
				if (result == null) result = caseDependencyObject(pcM_AllocateNeverTogether);
				if (result == null) result = caseParentalObject(pcM_AllocateNeverTogether);
				if (result == null) result = caseTriggerObject(pcM_AllocateNeverTogether);
				if (result == null) result = caseResolveObject(pcM_AllocateNeverTogether);
				if (result == null) result = caseAlternativeObject(pcM_AllocateNeverTogether);
				if (result == null) result = caseCouldResolveObject(pcM_AllocateNeverTogether);
				if (result == null) result = caseStakeholderObject(pcM_AllocateNeverTogether);
				if (result == null) result = caseSelectionObject(pcM_AllocateNeverTogether);
				if (result == null) result = caseIdentifier(pcM_AllocateNeverTogether);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_MULTIPLE_INSTANTIATION: {
				PCM_MultipleInstantiation pcM_MultipleInstantiation = (PCM_MultipleInstantiation)theEObject;
				T result = casePCM_MultipleInstantiation(pcM_MultipleInstantiation);
				if (result == null) result = caseMultipleInstantiation(pcM_MultipleInstantiation);
				if (result == null) result = caseComponentOption(pcM_MultipleInstantiation);
				if (result == null) result = caseArchOption(pcM_MultipleInstantiation);
				if (result == null) result = caseOption(pcM_MultipleInstantiation);
				if (result == null) result = caseTraceableObject(pcM_MultipleInstantiation);
				if (result == null) result = caseRelationObject(pcM_MultipleInstantiation);
				if (result == null) result = caseConflictObject(pcM_MultipleInstantiation);
				if (result == null) result = caseDuplicationObject(pcM_MultipleInstantiation);
				if (result == null) result = caseDependencyObject(pcM_MultipleInstantiation);
				if (result == null) result = caseParentalObject(pcM_MultipleInstantiation);
				if (result == null) result = caseTriggerObject(pcM_MultipleInstantiation);
				if (result == null) result = caseResolveObject(pcM_MultipleInstantiation);
				if (result == null) result = caseAlternativeObject(pcM_MultipleInstantiation);
				if (result == null) result = caseCouldResolveObject(pcM_MultipleInstantiation);
				if (result == null) result = caseStakeholderObject(pcM_MultipleInstantiation);
				if (result == null) result = caseSelectionObject(pcM_MultipleInstantiation);
				if (result == null) result = caseIdentifier(pcM_MultipleInstantiation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_BAN_COMPONENT: {
				PCM_BanComponent pcM_BanComponent = (PCM_BanComponent)theEObject;
				T result = casePCM_BanComponent(pcM_BanComponent);
				if (result == null) result = caseBanComponent(pcM_BanComponent);
				if (result == null) result = caseComponentOption(pcM_BanComponent);
				if (result == null) result = caseArchOption(pcM_BanComponent);
				if (result == null) result = caseOption(pcM_BanComponent);
				if (result == null) result = caseTraceableObject(pcM_BanComponent);
				if (result == null) result = caseRelationObject(pcM_BanComponent);
				if (result == null) result = caseConflictObject(pcM_BanComponent);
				if (result == null) result = caseDuplicationObject(pcM_BanComponent);
				if (result == null) result = caseDependencyObject(pcM_BanComponent);
				if (result == null) result = caseParentalObject(pcM_BanComponent);
				if (result == null) result = caseTriggerObject(pcM_BanComponent);
				if (result == null) result = caseResolveObject(pcM_BanComponent);
				if (result == null) result = caseAlternativeObject(pcM_BanComponent);
				if (result == null) result = caseCouldResolveObject(pcM_BanComponent);
				if (result == null) result = caseStakeholderObject(pcM_BanComponent);
				if (result == null) result = caseSelectionObject(pcM_BanComponent);
				if (result == null) result = caseIdentifier(pcM_BanComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_MULTIPLE_ALLOCATION: {
				PCM_MultipleAllocation pcM_MultipleAllocation = (PCM_MultipleAllocation)theEObject;
				T result = casePCM_MultipleAllocation(pcM_MultipleAllocation);
				if (result == null) result = caseMultipleAllocation(pcM_MultipleAllocation);
				if (result == null) result = caseDeploymentOption(pcM_MultipleAllocation);
				if (result == null) result = caseArchOption(pcM_MultipleAllocation);
				if (result == null) result = caseOption(pcM_MultipleAllocation);
				if (result == null) result = caseTraceableObject(pcM_MultipleAllocation);
				if (result == null) result = caseRelationObject(pcM_MultipleAllocation);
				if (result == null) result = caseConflictObject(pcM_MultipleAllocation);
				if (result == null) result = caseDuplicationObject(pcM_MultipleAllocation);
				if (result == null) result = caseDependencyObject(pcM_MultipleAllocation);
				if (result == null) result = caseParentalObject(pcM_MultipleAllocation);
				if (result == null) result = caseTriggerObject(pcM_MultipleAllocation);
				if (result == null) result = caseResolveObject(pcM_MultipleAllocation);
				if (result == null) result = caseAlternativeObject(pcM_MultipleAllocation);
				if (result == null) result = caseCouldResolveObject(pcM_MultipleAllocation);
				if (result == null) result = caseStakeholderObject(pcM_MultipleAllocation);
				if (result == null) result = caseSelectionObject(pcM_MultipleAllocation);
				if (result == null) result = caseIdentifier(pcM_MultipleAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_PROVIDED_FUNCTIONALITY: {
				PCM_ProvidedFunctionality pcM_ProvidedFunctionality = (PCM_ProvidedFunctionality)theEObject;
				T result = casePCM_ProvidedFunctionality(pcM_ProvidedFunctionality);
				if (result == null) result = caseProvidedFunctionality(pcM_ProvidedFunctionality);
				if (result == null) result = caseComponentOption(pcM_ProvidedFunctionality);
				if (result == null) result = caseArchOption(pcM_ProvidedFunctionality);
				if (result == null) result = caseOption(pcM_ProvidedFunctionality);
				if (result == null) result = caseTraceableObject(pcM_ProvidedFunctionality);
				if (result == null) result = caseRelationObject(pcM_ProvidedFunctionality);
				if (result == null) result = caseConflictObject(pcM_ProvidedFunctionality);
				if (result == null) result = caseDuplicationObject(pcM_ProvidedFunctionality);
				if (result == null) result = caseDependencyObject(pcM_ProvidedFunctionality);
				if (result == null) result = caseParentalObject(pcM_ProvidedFunctionality);
				if (result == null) result = caseTriggerObject(pcM_ProvidedFunctionality);
				if (result == null) result = caseResolveObject(pcM_ProvidedFunctionality);
				if (result == null) result = caseAlternativeObject(pcM_ProvidedFunctionality);
				if (result == null) result = caseCouldResolveObject(pcM_ProvidedFunctionality);
				if (result == null) result = caseStakeholderObject(pcM_ProvidedFunctionality);
				if (result == null) result = caseSelectionObject(pcM_ProvidedFunctionality);
				if (result == null) result = caseIdentifier(pcM_ProvidedFunctionality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS: {
				PCM_ReplaceComponents pcM_ReplaceComponents = (PCM_ReplaceComponents)theEObject;
				T result = casePCM_ReplaceComponents(pcM_ReplaceComponents);
				if (result == null) result = caseReplaceComponents(pcM_ReplaceComponents);
				if (result == null) result = caseComponentOption(pcM_ReplaceComponents);
				if (result == null) result = caseArchOption(pcM_ReplaceComponents);
				if (result == null) result = caseOption(pcM_ReplaceComponents);
				if (result == null) result = caseTraceableObject(pcM_ReplaceComponents);
				if (result == null) result = caseRelationObject(pcM_ReplaceComponents);
				if (result == null) result = caseConflictObject(pcM_ReplaceComponents);
				if (result == null) result = caseDuplicationObject(pcM_ReplaceComponents);
				if (result == null) result = caseDependencyObject(pcM_ReplaceComponents);
				if (result == null) result = caseParentalObject(pcM_ReplaceComponents);
				if (result == null) result = caseTriggerObject(pcM_ReplaceComponents);
				if (result == null) result = caseResolveObject(pcM_ReplaceComponents);
				if (result == null) result = caseAlternativeObject(pcM_ReplaceComponents);
				if (result == null) result = caseCouldResolveObject(pcM_ReplaceComponents);
				if (result == null) result = caseStakeholderObject(pcM_ReplaceComponents);
				if (result == null) result = caseSelectionObject(pcM_ReplaceComponents);
				if (result == null) result = caseIdentifier(pcM_ReplaceComponents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_REUSE_COMPONENT: {
				PCM_ReuseComponent pcM_ReuseComponent = (PCM_ReuseComponent)theEObject;
				T result = casePCM_ReuseComponent(pcM_ReuseComponent);
				if (result == null) result = caseReuseComponent(pcM_ReuseComponent);
				if (result == null) result = caseComponentOption(pcM_ReuseComponent);
				if (result == null) result = caseArchOption(pcM_ReuseComponent);
				if (result == null) result = caseOption(pcM_ReuseComponent);
				if (result == null) result = caseTraceableObject(pcM_ReuseComponent);
				if (result == null) result = caseRelationObject(pcM_ReuseComponent);
				if (result == null) result = caseConflictObject(pcM_ReuseComponent);
				if (result == null) result = caseDuplicationObject(pcM_ReuseComponent);
				if (result == null) result = caseDependencyObject(pcM_ReuseComponent);
				if (result == null) result = caseParentalObject(pcM_ReuseComponent);
				if (result == null) result = caseTriggerObject(pcM_ReuseComponent);
				if (result == null) result = caseResolveObject(pcM_ReuseComponent);
				if (result == null) result = caseAlternativeObject(pcM_ReuseComponent);
				if (result == null) result = caseCouldResolveObject(pcM_ReuseComponent);
				if (result == null) result = caseStakeholderObject(pcM_ReuseComponent);
				if (result == null) result = caseSelectionObject(pcM_ReuseComponent);
				if (result == null) result = caseIdentifier(pcM_ReuseComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION: {
				PCM_FunctionalityConnection pcM_FunctionalityConnection = (PCM_FunctionalityConnection)theEObject;
				T result = casePCM_FunctionalityConnection(pcM_FunctionalityConnection);
				if (result == null) result = caseFunctionalityConnection(pcM_FunctionalityConnection);
				if (result == null) result = caseComponentOption(pcM_FunctionalityConnection);
				if (result == null) result = caseArchOption(pcM_FunctionalityConnection);
				if (result == null) result = caseOption(pcM_FunctionalityConnection);
				if (result == null) result = caseTraceableObject(pcM_FunctionalityConnection);
				if (result == null) result = caseRelationObject(pcM_FunctionalityConnection);
				if (result == null) result = caseConflictObject(pcM_FunctionalityConnection);
				if (result == null) result = caseDuplicationObject(pcM_FunctionalityConnection);
				if (result == null) result = caseDependencyObject(pcM_FunctionalityConnection);
				if (result == null) result = caseParentalObject(pcM_FunctionalityConnection);
				if (result == null) result = caseTriggerObject(pcM_FunctionalityConnection);
				if (result == null) result = caseResolveObject(pcM_FunctionalityConnection);
				if (result == null) result = caseAlternativeObject(pcM_FunctionalityConnection);
				if (result == null) result = caseCouldResolveObject(pcM_FunctionalityConnection);
				if (result == null) result = caseStakeholderObject(pcM_FunctionalityConnection);
				if (result == null) result = caseSelectionObject(pcM_FunctionalityConnection);
				if (result == null) result = caseIdentifier(pcM_FunctionalityConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_MERGE_COMPONENTS: {
				PCM_MergeComponents pcM_MergeComponents = (PCM_MergeComponents)theEObject;
				T result = casePCM_MergeComponents(pcM_MergeComponents);
				if (result == null) result = caseMergeComponents(pcM_MergeComponents);
				if (result == null) result = caseComponentOption(pcM_MergeComponents);
				if (result == null) result = caseArchOption(pcM_MergeComponents);
				if (result == null) result = caseOption(pcM_MergeComponents);
				if (result == null) result = caseTraceableObject(pcM_MergeComponents);
				if (result == null) result = caseRelationObject(pcM_MergeComponents);
				if (result == null) result = caseConflictObject(pcM_MergeComponents);
				if (result == null) result = caseDuplicationObject(pcM_MergeComponents);
				if (result == null) result = caseDependencyObject(pcM_MergeComponents);
				if (result == null) result = caseParentalObject(pcM_MergeComponents);
				if (result == null) result = caseTriggerObject(pcM_MergeComponents);
				if (result == null) result = caseResolveObject(pcM_MergeComponents);
				if (result == null) result = caseAlternativeObject(pcM_MergeComponents);
				if (result == null) result = caseCouldResolveObject(pcM_MergeComponents);
				if (result == null) result = caseStakeholderObject(pcM_MergeComponents);
				if (result == null) result = caseSelectionObject(pcM_MergeComponents);
				if (result == null) result = caseIdentifier(pcM_MergeComponents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_ONLY_SINGLE_ALLOCATION: {
				PCM_OnlySingleAllocation pcM_OnlySingleAllocation = (PCM_OnlySingleAllocation)theEObject;
				T result = casePCM_OnlySingleAllocation(pcM_OnlySingleAllocation);
				if (result == null) result = caseOnlySingleAllocation(pcM_OnlySingleAllocation);
				if (result == null) result = caseDeploymentOption(pcM_OnlySingleAllocation);
				if (result == null) result = caseArchOption(pcM_OnlySingleAllocation);
				if (result == null) result = caseOption(pcM_OnlySingleAllocation);
				if (result == null) result = caseTraceableObject(pcM_OnlySingleAllocation);
				if (result == null) result = caseRelationObject(pcM_OnlySingleAllocation);
				if (result == null) result = caseConflictObject(pcM_OnlySingleAllocation);
				if (result == null) result = caseDuplicationObject(pcM_OnlySingleAllocation);
				if (result == null) result = caseDependencyObject(pcM_OnlySingleAllocation);
				if (result == null) result = caseParentalObject(pcM_OnlySingleAllocation);
				if (result == null) result = caseTriggerObject(pcM_OnlySingleAllocation);
				if (result == null) result = caseResolveObject(pcM_OnlySingleAllocation);
				if (result == null) result = caseAlternativeObject(pcM_OnlySingleAllocation);
				if (result == null) result = caseCouldResolveObject(pcM_OnlySingleAllocation);
				if (result == null) result = caseStakeholderObject(pcM_OnlySingleAllocation);
				if (result == null) result = caseSelectionObject(pcM_OnlySingleAllocation);
				if (result == null) result = caseIdentifier(pcM_OnlySingleAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_REQUIRED_FUNCTIONALITY: {
				PCM_RequiredFunctionality pcM_RequiredFunctionality = (PCM_RequiredFunctionality)theEObject;
				T result = casePCM_RequiredFunctionality(pcM_RequiredFunctionality);
				if (result == null) result = caseRequiredFunctionality(pcM_RequiredFunctionality);
				if (result == null) result = caseComponentOption(pcM_RequiredFunctionality);
				if (result == null) result = caseArchOption(pcM_RequiredFunctionality);
				if (result == null) result = caseOption(pcM_RequiredFunctionality);
				if (result == null) result = caseTraceableObject(pcM_RequiredFunctionality);
				if (result == null) result = caseRelationObject(pcM_RequiredFunctionality);
				if (result == null) result = caseConflictObject(pcM_RequiredFunctionality);
				if (result == null) result = caseDuplicationObject(pcM_RequiredFunctionality);
				if (result == null) result = caseDependencyObject(pcM_RequiredFunctionality);
				if (result == null) result = caseParentalObject(pcM_RequiredFunctionality);
				if (result == null) result = caseTriggerObject(pcM_RequiredFunctionality);
				if (result == null) result = caseResolveObject(pcM_RequiredFunctionality);
				if (result == null) result = caseAlternativeObject(pcM_RequiredFunctionality);
				if (result == null) result = caseCouldResolveObject(pcM_RequiredFunctionality);
				if (result == null) result = caseStakeholderObject(pcM_RequiredFunctionality);
				if (result == null) result = caseSelectionObject(pcM_RequiredFunctionality);
				if (result == null) result = caseIdentifier(pcM_RequiredFunctionality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE: {
				PCM_ChangeDataType pcM_ChangeDataType = (PCM_ChangeDataType)theEObject;
				T result = casePCM_ChangeDataType(pcM_ChangeDataType);
				if (result == null) result = caseChangeDataType(pcM_ChangeDataType);
				if (result == null) result = caseDataTypeOption(pcM_ChangeDataType);
				if (result == null) result = caseArchOption(pcM_ChangeDataType);
				if (result == null) result = caseOption(pcM_ChangeDataType);
				if (result == null) result = caseTraceableObject(pcM_ChangeDataType);
				if (result == null) result = caseRelationObject(pcM_ChangeDataType);
				if (result == null) result = caseConflictObject(pcM_ChangeDataType);
				if (result == null) result = caseDuplicationObject(pcM_ChangeDataType);
				if (result == null) result = caseDependencyObject(pcM_ChangeDataType);
				if (result == null) result = caseParentalObject(pcM_ChangeDataType);
				if (result == null) result = caseTriggerObject(pcM_ChangeDataType);
				if (result == null) result = caseResolveObject(pcM_ChangeDataType);
				if (result == null) result = caseAlternativeObject(pcM_ChangeDataType);
				if (result == null) result = caseCouldResolveObject(pcM_ChangeDataType);
				if (result == null) result = caseStakeholderObject(pcM_ChangeDataType);
				if (result == null) result = caseSelectionObject(pcM_ChangeDataType);
				if (result == null) result = caseIdentifier(pcM_ChangeDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_DATA_TYPE: {
				PCM_IntroduceNewDataType pcM_IntroduceNewDataType = (PCM_IntroduceNewDataType)theEObject;
				T result = casePCM_IntroduceNewDataType(pcM_IntroduceNewDataType);
				if (result == null) result = caseIntroduceNewDataType(pcM_IntroduceNewDataType);
				if (result == null) result = caseDataTypeOption(pcM_IntroduceNewDataType);
				if (result == null) result = caseArchOption(pcM_IntroduceNewDataType);
				if (result == null) result = caseOption(pcM_IntroduceNewDataType);
				if (result == null) result = caseTraceableObject(pcM_IntroduceNewDataType);
				if (result == null) result = caseRelationObject(pcM_IntroduceNewDataType);
				if (result == null) result = caseConflictObject(pcM_IntroduceNewDataType);
				if (result == null) result = caseDuplicationObject(pcM_IntroduceNewDataType);
				if (result == null) result = caseDependencyObject(pcM_IntroduceNewDataType);
				if (result == null) result = caseParentalObject(pcM_IntroduceNewDataType);
				if (result == null) result = caseTriggerObject(pcM_IntroduceNewDataType);
				if (result == null) result = caseResolveObject(pcM_IntroduceNewDataType);
				if (result == null) result = caseAlternativeObject(pcM_IntroduceNewDataType);
				if (result == null) result = caseCouldResolveObject(pcM_IntroduceNewDataType);
				if (result == null) result = caseStakeholderObject(pcM_IntroduceNewDataType);
				if (result == null) result = caseSelectionObject(pcM_IntroduceNewDataType);
				if (result == null) result = caseIdentifier(pcM_IntroduceNewDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_REMOVE_DATA_TYPE: {
				PCM_RemoveDataType pcM_RemoveDataType = (PCM_RemoveDataType)theEObject;
				T result = casePCM_RemoveDataType(pcM_RemoveDataType);
				if (result == null) result = caseRemoveDataType(pcM_RemoveDataType);
				if (result == null) result = caseDataTypeOption(pcM_RemoveDataType);
				if (result == null) result = caseArchOption(pcM_RemoveDataType);
				if (result == null) result = caseOption(pcM_RemoveDataType);
				if (result == null) result = caseTraceableObject(pcM_RemoveDataType);
				if (result == null) result = caseRelationObject(pcM_RemoveDataType);
				if (result == null) result = caseConflictObject(pcM_RemoveDataType);
				if (result == null) result = caseDuplicationObject(pcM_RemoveDataType);
				if (result == null) result = caseDependencyObject(pcM_RemoveDataType);
				if (result == null) result = caseParentalObject(pcM_RemoveDataType);
				if (result == null) result = caseTriggerObject(pcM_RemoveDataType);
				if (result == null) result = caseResolveObject(pcM_RemoveDataType);
				if (result == null) result = caseAlternativeObject(pcM_RemoveDataType);
				if (result == null) result = caseCouldResolveObject(pcM_RemoveDataType);
				if (result == null) result = caseStakeholderObject(pcM_RemoveDataType);
				if (result == null) result = caseSelectionObject(pcM_RemoveDataType);
				if (result == null) result = caseIdentifier(pcM_RemoveDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_INTERFACE: {
				PCM_IntroduceNewInterface pcM_IntroduceNewInterface = (PCM_IntroduceNewInterface)theEObject;
				T result = casePCM_IntroduceNewInterface(pcM_IntroduceNewInterface);
				if (result == null) result = caseIntroduceNewInterface(pcM_IntroduceNewInterface);
				if (result == null) result = caseInterfaceOption(pcM_IntroduceNewInterface);
				if (result == null) result = caseArchOption(pcM_IntroduceNewInterface);
				if (result == null) result = caseOption(pcM_IntroduceNewInterface);
				if (result == null) result = caseTraceableObject(pcM_IntroduceNewInterface);
				if (result == null) result = caseRelationObject(pcM_IntroduceNewInterface);
				if (result == null) result = caseConflictObject(pcM_IntroduceNewInterface);
				if (result == null) result = caseDuplicationObject(pcM_IntroduceNewInterface);
				if (result == null) result = caseDependencyObject(pcM_IntroduceNewInterface);
				if (result == null) result = caseParentalObject(pcM_IntroduceNewInterface);
				if (result == null) result = caseTriggerObject(pcM_IntroduceNewInterface);
				if (result == null) result = caseResolveObject(pcM_IntroduceNewInterface);
				if (result == null) result = caseAlternativeObject(pcM_IntroduceNewInterface);
				if (result == null) result = caseCouldResolveObject(pcM_IntroduceNewInterface);
				if (result == null) result = caseStakeholderObject(pcM_IntroduceNewInterface);
				if (result == null) result = caseSelectionObject(pcM_IntroduceNewInterface);
				if (result == null) result = caseIdentifier(pcM_IntroduceNewInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE: {
				PCM_ChangeInterface pcM_ChangeInterface = (PCM_ChangeInterface)theEObject;
				T result = casePCM_ChangeInterface(pcM_ChangeInterface);
				if (result == null) result = caseChangeInterface(pcM_ChangeInterface);
				if (result == null) result = caseInterfaceOption(pcM_ChangeInterface);
				if (result == null) result = caseArchOption(pcM_ChangeInterface);
				if (result == null) result = caseOption(pcM_ChangeInterface);
				if (result == null) result = caseTraceableObject(pcM_ChangeInterface);
				if (result == null) result = caseRelationObject(pcM_ChangeInterface);
				if (result == null) result = caseConflictObject(pcM_ChangeInterface);
				if (result == null) result = caseDuplicationObject(pcM_ChangeInterface);
				if (result == null) result = caseDependencyObject(pcM_ChangeInterface);
				if (result == null) result = caseParentalObject(pcM_ChangeInterface);
				if (result == null) result = caseTriggerObject(pcM_ChangeInterface);
				if (result == null) result = caseResolveObject(pcM_ChangeInterface);
				if (result == null) result = caseAlternativeObject(pcM_ChangeInterface);
				if (result == null) result = caseCouldResolveObject(pcM_ChangeInterface);
				if (result == null) result = caseStakeholderObject(pcM_ChangeInterface);
				if (result == null) result = caseSelectionObject(pcM_ChangeInterface);
				if (result == null) result = caseIdentifier(pcM_ChangeInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmarchoptionsPackage.PCM_REMOVE_INTERFACE: {
				PCM_RemoveInterface pcM_RemoveInterface = (PCM_RemoveInterface)theEObject;
				T result = casePCM_RemoveInterface(pcM_RemoveInterface);
				if (result == null) result = caseRemoveInterface(pcM_RemoveInterface);
				if (result == null) result = caseInterfaceOption(pcM_RemoveInterface);
				if (result == null) result = caseArchOption(pcM_RemoveInterface);
				if (result == null) result = caseOption(pcM_RemoveInterface);
				if (result == null) result = caseTraceableObject(pcM_RemoveInterface);
				if (result == null) result = caseRelationObject(pcM_RemoveInterface);
				if (result == null) result = caseConflictObject(pcM_RemoveInterface);
				if (result == null) result = caseDuplicationObject(pcM_RemoveInterface);
				if (result == null) result = caseDependencyObject(pcM_RemoveInterface);
				if (result == null) result = caseParentalObject(pcM_RemoveInterface);
				if (result == null) result = caseTriggerObject(pcM_RemoveInterface);
				if (result == null) result = caseResolveObject(pcM_RemoveInterface);
				if (result == null) result = caseAlternativeObject(pcM_RemoveInterface);
				if (result == null) result = caseCouldResolveObject(pcM_RemoveInterface);
				if (result == null) result = caseStakeholderObject(pcM_RemoveInterface);
				if (result == null) result = caseSelectionObject(pcM_RemoveInterface);
				if (result == null) result = caseIdentifier(pcM_RemoveInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Split Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Split Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_SplitComponent(PCM_SplitComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Allocate Together</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Allocate Together</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_AllocateTogether(PCM_AllocateTogether object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Never Allocate To Specific Nodes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Never Allocate To Specific Nodes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_NeverAllocateToSpecificNodes(PCM_NeverAllocateToSpecificNodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Introduce New Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Introduce New Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_IntroduceNewAdapter(PCM_IntroduceNewAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Introduce New Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Introduce New Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_IntroduceNewComponent(PCM_IntroduceNewComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Move Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Move Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_MoveComponents(PCM_MoveComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Only Single Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Only Single Instantiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_OnlySingleInstantiation(PCM_OnlySingleInstantiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Change Roles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Change Roles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_ChangeRoles(PCM_ChangeRoles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Allocate Never Together</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Allocate Never Together</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_AllocateNeverTogether(PCM_AllocateNeverTogether object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Multiple Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Multiple Instantiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_MultipleInstantiation(PCM_MultipleInstantiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Ban Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Ban Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_BanComponent(PCM_BanComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Multiple Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Multiple Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_MultipleAllocation(PCM_MultipleAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Provided Functionality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Provided Functionality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_ProvidedFunctionality(PCM_ProvidedFunctionality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Replace Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Replace Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_ReplaceComponents(PCM_ReplaceComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Reuse Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Reuse Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_ReuseComponent(PCM_ReuseComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Functionality Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Functionality Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_FunctionalityConnection(PCM_FunctionalityConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Merge Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Merge Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_MergeComponents(PCM_MergeComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Only Single Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Only Single Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_OnlySingleAllocation(PCM_OnlySingleAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Required Functionality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Required Functionality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_RequiredFunctionality(PCM_RequiredFunctionality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Change Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Change Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_ChangeDataType(PCM_ChangeDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Introduce New Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Introduce New Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_IntroduceNewDataType(PCM_IntroduceNewDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Remove Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Remove Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_RemoveDataType(PCM_RemoveDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Introduce New Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Introduce New Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_IntroduceNewInterface(PCM_IntroduceNewInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Change Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Change Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_ChangeInterface(PCM_ChangeInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Remove Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Remove Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_RemoveInterface(PCM_RemoveInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationObject(RelationObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conflict Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conflict Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConflictObject(ConflictObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duplication Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duplication Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuplicationObject(DuplicationObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyObject(DependencyObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parental Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parental Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParentalObject(ParentalObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerObject(TriggerObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolve Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolve Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolveObject(ResolveObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternativeObject(AlternativeObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Could Resolve Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Could Resolve Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCouldResolveObject(CouldResolveObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stakeholder Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stakeholder Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeholderObject(StakeholderObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionObject(SelectionObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableObject(TraceableObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arch Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arch Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchOption(ArchOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentOption(ComponentOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitComponent(SplitComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentOption(DeploymentOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocate Together</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocate Together</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocateTogether(AllocateTogether object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Never Allocate To Specific Nodes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Never Allocate To Specific Nodes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeverAllocateToSpecificNodes(NeverAllocateToSpecificNodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Introduce New Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Introduce New Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntroduceNewAdapter(IntroduceNewAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Introduce New Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Introduce New Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntroduceNewComponent(IntroduceNewComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveComponents(MoveComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Only Single Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Only Single Instantiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnlySingleInstantiation(OnlySingleInstantiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Roles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Roles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeRoles(ChangeRoles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocate Never Together</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocate Never Together</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocateNeverTogether(AllocateNeverTogether object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Instantiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleInstantiation(MultipleInstantiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ban Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ban Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBanComponent(BanComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleAllocation(MultipleAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Functionality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Functionality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedFunctionality(ProvidedFunctionality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceComponents(ReplaceComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reuse Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reuse Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReuseComponent(ReuseComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functionality Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functionality Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalityConnection(FunctionalityConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeComponents(MergeComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Only Single Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Only Single Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnlySingleAllocation(OnlySingleAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Functionality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Functionality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredFunctionality(RequiredFunctionality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeOption(DataTypeOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeDataType(ChangeDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Introduce New Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Introduce New Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntroduceNewDataType(IntroduceNewDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveDataType(RemoveDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceOption(InterfaceOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Introduce New Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Introduce New Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntroduceNewInterface(IntroduceNewInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeInterface(ChangeInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveInterface(RemoveInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PcmarchoptionsSwitch
