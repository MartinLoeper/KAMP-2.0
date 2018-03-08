/**
 */
package archoptions.util;

import archoptions.*;

import de.uka.ipd.sdq.identifier.Identifier;

import options.Option;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see archoptions.ArchoptionsPackage
 * @generated
 */
public class ArchoptionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArchoptionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchoptionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ArchoptionsPackage.eINSTANCE;
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
			case ArchoptionsPackage.PROVIDED_FUNCTIONALITY: {
				ProvidedFunctionality providedFunctionality = (ProvidedFunctionality)theEObject;
				T result = caseProvidedFunctionality(providedFunctionality);
				if (result == null) result = caseComponentOption(providedFunctionality);
				if (result == null) result = caseArchOption(providedFunctionality);
				if (result == null) result = caseOption(providedFunctionality);
				if (result == null) result = caseTraceableObject(providedFunctionality);
				if (result == null) result = caseRelationObject(providedFunctionality);
				if (result == null) result = caseConflictObject(providedFunctionality);
				if (result == null) result = caseDuplicationObject(providedFunctionality);
				if (result == null) result = caseDependencyObject(providedFunctionality);
				if (result == null) result = caseParentalObject(providedFunctionality);
				if (result == null) result = caseTriggerObject(providedFunctionality);
				if (result == null) result = caseResolveObject(providedFunctionality);
				if (result == null) result = caseAlternativeObject(providedFunctionality);
				if (result == null) result = caseCouldResolveObject(providedFunctionality);
				if (result == null) result = caseStakeholderObject(providedFunctionality);
				if (result == null) result = caseSelectionObject(providedFunctionality);
				if (result == null) result = caseIdentifier(providedFunctionality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.REQUIRED_FUNCTIONALITY: {
				RequiredFunctionality requiredFunctionality = (RequiredFunctionality)theEObject;
				T result = caseRequiredFunctionality(requiredFunctionality);
				if (result == null) result = caseComponentOption(requiredFunctionality);
				if (result == null) result = caseArchOption(requiredFunctionality);
				if (result == null) result = caseOption(requiredFunctionality);
				if (result == null) result = caseTraceableObject(requiredFunctionality);
				if (result == null) result = caseRelationObject(requiredFunctionality);
				if (result == null) result = caseConflictObject(requiredFunctionality);
				if (result == null) result = caseDuplicationObject(requiredFunctionality);
				if (result == null) result = caseDependencyObject(requiredFunctionality);
				if (result == null) result = caseParentalObject(requiredFunctionality);
				if (result == null) result = caseTriggerObject(requiredFunctionality);
				if (result == null) result = caseResolveObject(requiredFunctionality);
				if (result == null) result = caseAlternativeObject(requiredFunctionality);
				if (result == null) result = caseCouldResolveObject(requiredFunctionality);
				if (result == null) result = caseStakeholderObject(requiredFunctionality);
				if (result == null) result = caseSelectionObject(requiredFunctionality);
				if (result == null) result = caseIdentifier(requiredFunctionality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.FUNCTIONALITY_CONNECTION: {
				FunctionalityConnection functionalityConnection = (FunctionalityConnection)theEObject;
				T result = caseFunctionalityConnection(functionalityConnection);
				if (result == null) result = caseComponentOption(functionalityConnection);
				if (result == null) result = caseArchOption(functionalityConnection);
				if (result == null) result = caseOption(functionalityConnection);
				if (result == null) result = caseTraceableObject(functionalityConnection);
				if (result == null) result = caseRelationObject(functionalityConnection);
				if (result == null) result = caseConflictObject(functionalityConnection);
				if (result == null) result = caseDuplicationObject(functionalityConnection);
				if (result == null) result = caseDependencyObject(functionalityConnection);
				if (result == null) result = caseParentalObject(functionalityConnection);
				if (result == null) result = caseTriggerObject(functionalityConnection);
				if (result == null) result = caseResolveObject(functionalityConnection);
				if (result == null) result = caseAlternativeObject(functionalityConnection);
				if (result == null) result = caseCouldResolveObject(functionalityConnection);
				if (result == null) result = caseStakeholderObject(functionalityConnection);
				if (result == null) result = caseSelectionObject(functionalityConnection);
				if (result == null) result = caseIdentifier(functionalityConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.MULTIPLE_INSTANTIATION: {
				MultipleInstantiation multipleInstantiation = (MultipleInstantiation)theEObject;
				T result = caseMultipleInstantiation(multipleInstantiation);
				if (result == null) result = caseComponentOption(multipleInstantiation);
				if (result == null) result = caseArchOption(multipleInstantiation);
				if (result == null) result = caseOption(multipleInstantiation);
				if (result == null) result = caseTraceableObject(multipleInstantiation);
				if (result == null) result = caseRelationObject(multipleInstantiation);
				if (result == null) result = caseConflictObject(multipleInstantiation);
				if (result == null) result = caseDuplicationObject(multipleInstantiation);
				if (result == null) result = caseDependencyObject(multipleInstantiation);
				if (result == null) result = caseParentalObject(multipleInstantiation);
				if (result == null) result = caseTriggerObject(multipleInstantiation);
				if (result == null) result = caseResolveObject(multipleInstantiation);
				if (result == null) result = caseAlternativeObject(multipleInstantiation);
				if (result == null) result = caseCouldResolveObject(multipleInstantiation);
				if (result == null) result = caseStakeholderObject(multipleInstantiation);
				if (result == null) result = caseSelectionObject(multipleInstantiation);
				if (result == null) result = caseIdentifier(multipleInstantiation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.ONLY_SINGLE_INSTANTIATION: {
				OnlySingleInstantiation onlySingleInstantiation = (OnlySingleInstantiation)theEObject;
				T result = caseOnlySingleInstantiation(onlySingleInstantiation);
				if (result == null) result = caseComponentOption(onlySingleInstantiation);
				if (result == null) result = caseArchOption(onlySingleInstantiation);
				if (result == null) result = caseOption(onlySingleInstantiation);
				if (result == null) result = caseTraceableObject(onlySingleInstantiation);
				if (result == null) result = caseRelationObject(onlySingleInstantiation);
				if (result == null) result = caseConflictObject(onlySingleInstantiation);
				if (result == null) result = caseDuplicationObject(onlySingleInstantiation);
				if (result == null) result = caseDependencyObject(onlySingleInstantiation);
				if (result == null) result = caseParentalObject(onlySingleInstantiation);
				if (result == null) result = caseTriggerObject(onlySingleInstantiation);
				if (result == null) result = caseResolveObject(onlySingleInstantiation);
				if (result == null) result = caseAlternativeObject(onlySingleInstantiation);
				if (result == null) result = caseCouldResolveObject(onlySingleInstantiation);
				if (result == null) result = caseStakeholderObject(onlySingleInstantiation);
				if (result == null) result = caseSelectionObject(onlySingleInstantiation);
				if (result == null) result = caseIdentifier(onlySingleInstantiation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.ONLY_SINGLE_ALLOCATION: {
				OnlySingleAllocation onlySingleAllocation = (OnlySingleAllocation)theEObject;
				T result = caseOnlySingleAllocation(onlySingleAllocation);
				if (result == null) result = caseDeploymentOption(onlySingleAllocation);
				if (result == null) result = caseArchOption(onlySingleAllocation);
				if (result == null) result = caseOption(onlySingleAllocation);
				if (result == null) result = caseTraceableObject(onlySingleAllocation);
				if (result == null) result = caseRelationObject(onlySingleAllocation);
				if (result == null) result = caseConflictObject(onlySingleAllocation);
				if (result == null) result = caseDuplicationObject(onlySingleAllocation);
				if (result == null) result = caseDependencyObject(onlySingleAllocation);
				if (result == null) result = caseParentalObject(onlySingleAllocation);
				if (result == null) result = caseTriggerObject(onlySingleAllocation);
				if (result == null) result = caseResolveObject(onlySingleAllocation);
				if (result == null) result = caseAlternativeObject(onlySingleAllocation);
				if (result == null) result = caseCouldResolveObject(onlySingleAllocation);
				if (result == null) result = caseStakeholderObject(onlySingleAllocation);
				if (result == null) result = caseSelectionObject(onlySingleAllocation);
				if (result == null) result = caseIdentifier(onlySingleAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.MULTIPLE_ALLOCATION: {
				MultipleAllocation multipleAllocation = (MultipleAllocation)theEObject;
				T result = caseMultipleAllocation(multipleAllocation);
				if (result == null) result = caseDeploymentOption(multipleAllocation);
				if (result == null) result = caseArchOption(multipleAllocation);
				if (result == null) result = caseOption(multipleAllocation);
				if (result == null) result = caseTraceableObject(multipleAllocation);
				if (result == null) result = caseRelationObject(multipleAllocation);
				if (result == null) result = caseConflictObject(multipleAllocation);
				if (result == null) result = caseDuplicationObject(multipleAllocation);
				if (result == null) result = caseDependencyObject(multipleAllocation);
				if (result == null) result = caseParentalObject(multipleAllocation);
				if (result == null) result = caseTriggerObject(multipleAllocation);
				if (result == null) result = caseResolveObject(multipleAllocation);
				if (result == null) result = caseAlternativeObject(multipleAllocation);
				if (result == null) result = caseCouldResolveObject(multipleAllocation);
				if (result == null) result = caseStakeholderObject(multipleAllocation);
				if (result == null) result = caseSelectionObject(multipleAllocation);
				if (result == null) result = caseIdentifier(multipleAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.ALLOCATE_TOGETHER: {
				AllocateTogether allocateTogether = (AllocateTogether)theEObject;
				T result = caseAllocateTogether(allocateTogether);
				if (result == null) result = caseDeploymentOption(allocateTogether);
				if (result == null) result = caseArchOption(allocateTogether);
				if (result == null) result = caseOption(allocateTogether);
				if (result == null) result = caseTraceableObject(allocateTogether);
				if (result == null) result = caseRelationObject(allocateTogether);
				if (result == null) result = caseConflictObject(allocateTogether);
				if (result == null) result = caseDuplicationObject(allocateTogether);
				if (result == null) result = caseDependencyObject(allocateTogether);
				if (result == null) result = caseParentalObject(allocateTogether);
				if (result == null) result = caseTriggerObject(allocateTogether);
				if (result == null) result = caseResolveObject(allocateTogether);
				if (result == null) result = caseAlternativeObject(allocateTogether);
				if (result == null) result = caseCouldResolveObject(allocateTogether);
				if (result == null) result = caseStakeholderObject(allocateTogether);
				if (result == null) result = caseSelectionObject(allocateTogether);
				if (result == null) result = caseIdentifier(allocateTogether);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.ALLOCATE_NEVER_TOGETHER: {
				AllocateNeverTogether allocateNeverTogether = (AllocateNeverTogether)theEObject;
				T result = caseAllocateNeverTogether(allocateNeverTogether);
				if (result == null) result = caseDeploymentOption(allocateNeverTogether);
				if (result == null) result = caseArchOption(allocateNeverTogether);
				if (result == null) result = caseOption(allocateNeverTogether);
				if (result == null) result = caseTraceableObject(allocateNeverTogether);
				if (result == null) result = caseRelationObject(allocateNeverTogether);
				if (result == null) result = caseConflictObject(allocateNeverTogether);
				if (result == null) result = caseDuplicationObject(allocateNeverTogether);
				if (result == null) result = caseDependencyObject(allocateNeverTogether);
				if (result == null) result = caseParentalObject(allocateNeverTogether);
				if (result == null) result = caseTriggerObject(allocateNeverTogether);
				if (result == null) result = caseResolveObject(allocateNeverTogether);
				if (result == null) result = caseAlternativeObject(allocateNeverTogether);
				if (result == null) result = caseCouldResolveObject(allocateNeverTogether);
				if (result == null) result = caseStakeholderObject(allocateNeverTogether);
				if (result == null) result = caseSelectionObject(allocateNeverTogether);
				if (result == null) result = caseIdentifier(allocateNeverTogether);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.NEVER_ALLOCATE_TO_SPECIFIC_NODES: {
				NeverAllocateToSpecificNodes neverAllocateToSpecificNodes = (NeverAllocateToSpecificNodes)theEObject;
				T result = caseNeverAllocateToSpecificNodes(neverAllocateToSpecificNodes);
				if (result == null) result = caseDeploymentOption(neverAllocateToSpecificNodes);
				if (result == null) result = caseArchOption(neverAllocateToSpecificNodes);
				if (result == null) result = caseOption(neverAllocateToSpecificNodes);
				if (result == null) result = caseTraceableObject(neverAllocateToSpecificNodes);
				if (result == null) result = caseRelationObject(neverAllocateToSpecificNodes);
				if (result == null) result = caseConflictObject(neverAllocateToSpecificNodes);
				if (result == null) result = caseDuplicationObject(neverAllocateToSpecificNodes);
				if (result == null) result = caseDependencyObject(neverAllocateToSpecificNodes);
				if (result == null) result = caseParentalObject(neverAllocateToSpecificNodes);
				if (result == null) result = caseTriggerObject(neverAllocateToSpecificNodes);
				if (result == null) result = caseResolveObject(neverAllocateToSpecificNodes);
				if (result == null) result = caseAlternativeObject(neverAllocateToSpecificNodes);
				if (result == null) result = caseCouldResolveObject(neverAllocateToSpecificNodes);
				if (result == null) result = caseStakeholderObject(neverAllocateToSpecificNodes);
				if (result == null) result = caseSelectionObject(neverAllocateToSpecificNodes);
				if (result == null) result = caseIdentifier(neverAllocateToSpecificNodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.MOVE_COMPONENTS: {
				MoveComponents moveComponents = (MoveComponents)theEObject;
				T result = caseMoveComponents(moveComponents);
				if (result == null) result = caseDeploymentOption(moveComponents);
				if (result == null) result = caseArchOption(moveComponents);
				if (result == null) result = caseOption(moveComponents);
				if (result == null) result = caseTraceableObject(moveComponents);
				if (result == null) result = caseRelationObject(moveComponents);
				if (result == null) result = caseConflictObject(moveComponents);
				if (result == null) result = caseDuplicationObject(moveComponents);
				if (result == null) result = caseDependencyObject(moveComponents);
				if (result == null) result = caseParentalObject(moveComponents);
				if (result == null) result = caseTriggerObject(moveComponents);
				if (result == null) result = caseResolveObject(moveComponents);
				if (result == null) result = caseAlternativeObject(moveComponents);
				if (result == null) result = caseCouldResolveObject(moveComponents);
				if (result == null) result = caseStakeholderObject(moveComponents);
				if (result == null) result = caseSelectionObject(moveComponents);
				if (result == null) result = caseIdentifier(moveComponents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.INTRODUCE_NEW_COMPONENT: {
				IntroduceNewComponent introduceNewComponent = (IntroduceNewComponent)theEObject;
				T result = caseIntroduceNewComponent(introduceNewComponent);
				if (result == null) result = caseComponentOption(introduceNewComponent);
				if (result == null) result = caseArchOption(introduceNewComponent);
				if (result == null) result = caseOption(introduceNewComponent);
				if (result == null) result = caseTraceableObject(introduceNewComponent);
				if (result == null) result = caseRelationObject(introduceNewComponent);
				if (result == null) result = caseConflictObject(introduceNewComponent);
				if (result == null) result = caseDuplicationObject(introduceNewComponent);
				if (result == null) result = caseDependencyObject(introduceNewComponent);
				if (result == null) result = caseParentalObject(introduceNewComponent);
				if (result == null) result = caseTriggerObject(introduceNewComponent);
				if (result == null) result = caseResolveObject(introduceNewComponent);
				if (result == null) result = caseAlternativeObject(introduceNewComponent);
				if (result == null) result = caseCouldResolveObject(introduceNewComponent);
				if (result == null) result = caseStakeholderObject(introduceNewComponent);
				if (result == null) result = caseSelectionObject(introduceNewComponent);
				if (result == null) result = caseIdentifier(introduceNewComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.INTRODUCE_NEW_ADAPTER: {
				IntroduceNewAdapter introduceNewAdapter = (IntroduceNewAdapter)theEObject;
				T result = caseIntroduceNewAdapter(introduceNewAdapter);
				if (result == null) result = caseComponentOption(introduceNewAdapter);
				if (result == null) result = caseArchOption(introduceNewAdapter);
				if (result == null) result = caseOption(introduceNewAdapter);
				if (result == null) result = caseTraceableObject(introduceNewAdapter);
				if (result == null) result = caseRelationObject(introduceNewAdapter);
				if (result == null) result = caseConflictObject(introduceNewAdapter);
				if (result == null) result = caseDuplicationObject(introduceNewAdapter);
				if (result == null) result = caseDependencyObject(introduceNewAdapter);
				if (result == null) result = caseParentalObject(introduceNewAdapter);
				if (result == null) result = caseTriggerObject(introduceNewAdapter);
				if (result == null) result = caseResolveObject(introduceNewAdapter);
				if (result == null) result = caseAlternativeObject(introduceNewAdapter);
				if (result == null) result = caseCouldResolveObject(introduceNewAdapter);
				if (result == null) result = caseStakeholderObject(introduceNewAdapter);
				if (result == null) result = caseSelectionObject(introduceNewAdapter);
				if (result == null) result = caseIdentifier(introduceNewAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.REUSE_COMPONENT: {
				ReuseComponent reuseComponent = (ReuseComponent)theEObject;
				T result = caseReuseComponent(reuseComponent);
				if (result == null) result = caseComponentOption(reuseComponent);
				if (result == null) result = caseArchOption(reuseComponent);
				if (result == null) result = caseOption(reuseComponent);
				if (result == null) result = caseTraceableObject(reuseComponent);
				if (result == null) result = caseRelationObject(reuseComponent);
				if (result == null) result = caseConflictObject(reuseComponent);
				if (result == null) result = caseDuplicationObject(reuseComponent);
				if (result == null) result = caseDependencyObject(reuseComponent);
				if (result == null) result = caseParentalObject(reuseComponent);
				if (result == null) result = caseTriggerObject(reuseComponent);
				if (result == null) result = caseResolveObject(reuseComponent);
				if (result == null) result = caseAlternativeObject(reuseComponent);
				if (result == null) result = caseCouldResolveObject(reuseComponent);
				if (result == null) result = caseStakeholderObject(reuseComponent);
				if (result == null) result = caseSelectionObject(reuseComponent);
				if (result == null) result = caseIdentifier(reuseComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.BAN_COMPONENT: {
				BanComponent banComponent = (BanComponent)theEObject;
				T result = caseBanComponent(banComponent);
				if (result == null) result = caseComponentOption(banComponent);
				if (result == null) result = caseArchOption(banComponent);
				if (result == null) result = caseOption(banComponent);
				if (result == null) result = caseTraceableObject(banComponent);
				if (result == null) result = caseRelationObject(banComponent);
				if (result == null) result = caseConflictObject(banComponent);
				if (result == null) result = caseDuplicationObject(banComponent);
				if (result == null) result = caseDependencyObject(banComponent);
				if (result == null) result = caseParentalObject(banComponent);
				if (result == null) result = caseTriggerObject(banComponent);
				if (result == null) result = caseResolveObject(banComponent);
				if (result == null) result = caseAlternativeObject(banComponent);
				if (result == null) result = caseCouldResolveObject(banComponent);
				if (result == null) result = caseStakeholderObject(banComponent);
				if (result == null) result = caseSelectionObject(banComponent);
				if (result == null) result = caseIdentifier(banComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.REPLACE_COMPONENTS: {
				ReplaceComponents replaceComponents = (ReplaceComponents)theEObject;
				T result = caseReplaceComponents(replaceComponents);
				if (result == null) result = caseComponentOption(replaceComponents);
				if (result == null) result = caseArchOption(replaceComponents);
				if (result == null) result = caseOption(replaceComponents);
				if (result == null) result = caseTraceableObject(replaceComponents);
				if (result == null) result = caseRelationObject(replaceComponents);
				if (result == null) result = caseConflictObject(replaceComponents);
				if (result == null) result = caseDuplicationObject(replaceComponents);
				if (result == null) result = caseDependencyObject(replaceComponents);
				if (result == null) result = caseParentalObject(replaceComponents);
				if (result == null) result = caseTriggerObject(replaceComponents);
				if (result == null) result = caseResolveObject(replaceComponents);
				if (result == null) result = caseAlternativeObject(replaceComponents);
				if (result == null) result = caseCouldResolveObject(replaceComponents);
				if (result == null) result = caseStakeholderObject(replaceComponents);
				if (result == null) result = caseSelectionObject(replaceComponents);
				if (result == null) result = caseIdentifier(replaceComponents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.SPLIT_COMPONENT: {
				SplitComponent splitComponent = (SplitComponent)theEObject;
				T result = caseSplitComponent(splitComponent);
				if (result == null) result = caseComponentOption(splitComponent);
				if (result == null) result = caseArchOption(splitComponent);
				if (result == null) result = caseOption(splitComponent);
				if (result == null) result = caseTraceableObject(splitComponent);
				if (result == null) result = caseRelationObject(splitComponent);
				if (result == null) result = caseConflictObject(splitComponent);
				if (result == null) result = caseDuplicationObject(splitComponent);
				if (result == null) result = caseDependencyObject(splitComponent);
				if (result == null) result = caseParentalObject(splitComponent);
				if (result == null) result = caseTriggerObject(splitComponent);
				if (result == null) result = caseResolveObject(splitComponent);
				if (result == null) result = caseAlternativeObject(splitComponent);
				if (result == null) result = caseCouldResolveObject(splitComponent);
				if (result == null) result = caseStakeholderObject(splitComponent);
				if (result == null) result = caseSelectionObject(splitComponent);
				if (result == null) result = caseIdentifier(splitComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.MERGE_COMPONENTS: {
				MergeComponents mergeComponents = (MergeComponents)theEObject;
				T result = caseMergeComponents(mergeComponents);
				if (result == null) result = caseComponentOption(mergeComponents);
				if (result == null) result = caseArchOption(mergeComponents);
				if (result == null) result = caseOption(mergeComponents);
				if (result == null) result = caseTraceableObject(mergeComponents);
				if (result == null) result = caseRelationObject(mergeComponents);
				if (result == null) result = caseConflictObject(mergeComponents);
				if (result == null) result = caseDuplicationObject(mergeComponents);
				if (result == null) result = caseDependencyObject(mergeComponents);
				if (result == null) result = caseParentalObject(mergeComponents);
				if (result == null) result = caseTriggerObject(mergeComponents);
				if (result == null) result = caseResolveObject(mergeComponents);
				if (result == null) result = caseAlternativeObject(mergeComponents);
				if (result == null) result = caseCouldResolveObject(mergeComponents);
				if (result == null) result = caseStakeholderObject(mergeComponents);
				if (result == null) result = caseSelectionObject(mergeComponents);
				if (result == null) result = caseIdentifier(mergeComponents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.CHANGE_ROLES: {
				ChangeRoles changeRoles = (ChangeRoles)theEObject;
				T result = caseChangeRoles(changeRoles);
				if (result == null) result = caseComponentOption(changeRoles);
				if (result == null) result = caseArchOption(changeRoles);
				if (result == null) result = caseOption(changeRoles);
				if (result == null) result = caseTraceableObject(changeRoles);
				if (result == null) result = caseRelationObject(changeRoles);
				if (result == null) result = caseConflictObject(changeRoles);
				if (result == null) result = caseDuplicationObject(changeRoles);
				if (result == null) result = caseDependencyObject(changeRoles);
				if (result == null) result = caseParentalObject(changeRoles);
				if (result == null) result = caseTriggerObject(changeRoles);
				if (result == null) result = caseResolveObject(changeRoles);
				if (result == null) result = caseAlternativeObject(changeRoles);
				if (result == null) result = caseCouldResolveObject(changeRoles);
				if (result == null) result = caseStakeholderObject(changeRoles);
				if (result == null) result = caseSelectionObject(changeRoles);
				if (result == null) result = caseIdentifier(changeRoles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.COMPONENT_OPTION: {
				ComponentOption componentOption = (ComponentOption)theEObject;
				T result = caseComponentOption(componentOption);
				if (result == null) result = caseArchOption(componentOption);
				if (result == null) result = caseOption(componentOption);
				if (result == null) result = caseTraceableObject(componentOption);
				if (result == null) result = caseRelationObject(componentOption);
				if (result == null) result = caseConflictObject(componentOption);
				if (result == null) result = caseDuplicationObject(componentOption);
				if (result == null) result = caseDependencyObject(componentOption);
				if (result == null) result = caseParentalObject(componentOption);
				if (result == null) result = caseTriggerObject(componentOption);
				if (result == null) result = caseResolveObject(componentOption);
				if (result == null) result = caseAlternativeObject(componentOption);
				if (result == null) result = caseCouldResolveObject(componentOption);
				if (result == null) result = caseStakeholderObject(componentOption);
				if (result == null) result = caseSelectionObject(componentOption);
				if (result == null) result = caseIdentifier(componentOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.DEPLOYMENT_OPTION: {
				DeploymentOption deploymentOption = (DeploymentOption)theEObject;
				T result = caseDeploymentOption(deploymentOption);
				if (result == null) result = caseArchOption(deploymentOption);
				if (result == null) result = caseOption(deploymentOption);
				if (result == null) result = caseTraceableObject(deploymentOption);
				if (result == null) result = caseRelationObject(deploymentOption);
				if (result == null) result = caseConflictObject(deploymentOption);
				if (result == null) result = caseDuplicationObject(deploymentOption);
				if (result == null) result = caseDependencyObject(deploymentOption);
				if (result == null) result = caseParentalObject(deploymentOption);
				if (result == null) result = caseTriggerObject(deploymentOption);
				if (result == null) result = caseResolveObject(deploymentOption);
				if (result == null) result = caseAlternativeObject(deploymentOption);
				if (result == null) result = caseCouldResolveObject(deploymentOption);
				if (result == null) result = caseStakeholderObject(deploymentOption);
				if (result == null) result = caseSelectionObject(deploymentOption);
				if (result == null) result = caseIdentifier(deploymentOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.ARCH_OPTION: {
				ArchOption archOption = (ArchOption)theEObject;
				T result = caseArchOption(archOption);
				if (result == null) result = caseOption(archOption);
				if (result == null) result = caseTraceableObject(archOption);
				if (result == null) result = caseRelationObject(archOption);
				if (result == null) result = caseConflictObject(archOption);
				if (result == null) result = caseDuplicationObject(archOption);
				if (result == null) result = caseDependencyObject(archOption);
				if (result == null) result = caseParentalObject(archOption);
				if (result == null) result = caseTriggerObject(archOption);
				if (result == null) result = caseResolveObject(archOption);
				if (result == null) result = caseAlternativeObject(archOption);
				if (result == null) result = caseCouldResolveObject(archOption);
				if (result == null) result = caseStakeholderObject(archOption);
				if (result == null) result = caseSelectionObject(archOption);
				if (result == null) result = caseIdentifier(archOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.CHANGE_DATA_TYPE: {
				ChangeDataType changeDataType = (ChangeDataType)theEObject;
				T result = caseChangeDataType(changeDataType);
				if (result == null) result = caseDataTypeOption(changeDataType);
				if (result == null) result = caseArchOption(changeDataType);
				if (result == null) result = caseOption(changeDataType);
				if (result == null) result = caseTraceableObject(changeDataType);
				if (result == null) result = caseRelationObject(changeDataType);
				if (result == null) result = caseConflictObject(changeDataType);
				if (result == null) result = caseDuplicationObject(changeDataType);
				if (result == null) result = caseDependencyObject(changeDataType);
				if (result == null) result = caseParentalObject(changeDataType);
				if (result == null) result = caseTriggerObject(changeDataType);
				if (result == null) result = caseResolveObject(changeDataType);
				if (result == null) result = caseAlternativeObject(changeDataType);
				if (result == null) result = caseCouldResolveObject(changeDataType);
				if (result == null) result = caseStakeholderObject(changeDataType);
				if (result == null) result = caseSelectionObject(changeDataType);
				if (result == null) result = caseIdentifier(changeDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.INTRODUCE_NEW_DATA_TYPE: {
				IntroduceNewDataType introduceNewDataType = (IntroduceNewDataType)theEObject;
				T result = caseIntroduceNewDataType(introduceNewDataType);
				if (result == null) result = caseDataTypeOption(introduceNewDataType);
				if (result == null) result = caseArchOption(introduceNewDataType);
				if (result == null) result = caseOption(introduceNewDataType);
				if (result == null) result = caseTraceableObject(introduceNewDataType);
				if (result == null) result = caseRelationObject(introduceNewDataType);
				if (result == null) result = caseConflictObject(introduceNewDataType);
				if (result == null) result = caseDuplicationObject(introduceNewDataType);
				if (result == null) result = caseDependencyObject(introduceNewDataType);
				if (result == null) result = caseParentalObject(introduceNewDataType);
				if (result == null) result = caseTriggerObject(introduceNewDataType);
				if (result == null) result = caseResolveObject(introduceNewDataType);
				if (result == null) result = caseAlternativeObject(introduceNewDataType);
				if (result == null) result = caseCouldResolveObject(introduceNewDataType);
				if (result == null) result = caseStakeholderObject(introduceNewDataType);
				if (result == null) result = caseSelectionObject(introduceNewDataType);
				if (result == null) result = caseIdentifier(introduceNewDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.REMOVE_DATA_TYPE: {
				RemoveDataType removeDataType = (RemoveDataType)theEObject;
				T result = caseRemoveDataType(removeDataType);
				if (result == null) result = caseDataTypeOption(removeDataType);
				if (result == null) result = caseArchOption(removeDataType);
				if (result == null) result = caseOption(removeDataType);
				if (result == null) result = caseTraceableObject(removeDataType);
				if (result == null) result = caseRelationObject(removeDataType);
				if (result == null) result = caseConflictObject(removeDataType);
				if (result == null) result = caseDuplicationObject(removeDataType);
				if (result == null) result = caseDependencyObject(removeDataType);
				if (result == null) result = caseParentalObject(removeDataType);
				if (result == null) result = caseTriggerObject(removeDataType);
				if (result == null) result = caseResolveObject(removeDataType);
				if (result == null) result = caseAlternativeObject(removeDataType);
				if (result == null) result = caseCouldResolveObject(removeDataType);
				if (result == null) result = caseStakeholderObject(removeDataType);
				if (result == null) result = caseSelectionObject(removeDataType);
				if (result == null) result = caseIdentifier(removeDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.INTERFACE_OPTION: {
				InterfaceOption interfaceOption = (InterfaceOption)theEObject;
				T result = caseInterfaceOption(interfaceOption);
				if (result == null) result = caseArchOption(interfaceOption);
				if (result == null) result = caseOption(interfaceOption);
				if (result == null) result = caseTraceableObject(interfaceOption);
				if (result == null) result = caseRelationObject(interfaceOption);
				if (result == null) result = caseConflictObject(interfaceOption);
				if (result == null) result = caseDuplicationObject(interfaceOption);
				if (result == null) result = caseDependencyObject(interfaceOption);
				if (result == null) result = caseParentalObject(interfaceOption);
				if (result == null) result = caseTriggerObject(interfaceOption);
				if (result == null) result = caseResolveObject(interfaceOption);
				if (result == null) result = caseAlternativeObject(interfaceOption);
				if (result == null) result = caseCouldResolveObject(interfaceOption);
				if (result == null) result = caseStakeholderObject(interfaceOption);
				if (result == null) result = caseSelectionObject(interfaceOption);
				if (result == null) result = caseIdentifier(interfaceOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.DATA_TYPE_OPTION: {
				DataTypeOption dataTypeOption = (DataTypeOption)theEObject;
				T result = caseDataTypeOption(dataTypeOption);
				if (result == null) result = caseArchOption(dataTypeOption);
				if (result == null) result = caseOption(dataTypeOption);
				if (result == null) result = caseTraceableObject(dataTypeOption);
				if (result == null) result = caseRelationObject(dataTypeOption);
				if (result == null) result = caseConflictObject(dataTypeOption);
				if (result == null) result = caseDuplicationObject(dataTypeOption);
				if (result == null) result = caseDependencyObject(dataTypeOption);
				if (result == null) result = caseParentalObject(dataTypeOption);
				if (result == null) result = caseTriggerObject(dataTypeOption);
				if (result == null) result = caseResolveObject(dataTypeOption);
				if (result == null) result = caseAlternativeObject(dataTypeOption);
				if (result == null) result = caseCouldResolveObject(dataTypeOption);
				if (result == null) result = caseStakeholderObject(dataTypeOption);
				if (result == null) result = caseSelectionObject(dataTypeOption);
				if (result == null) result = caseIdentifier(dataTypeOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.CHANGE_INTERFACE: {
				ChangeInterface changeInterface = (ChangeInterface)theEObject;
				T result = caseChangeInterface(changeInterface);
				if (result == null) result = caseInterfaceOption(changeInterface);
				if (result == null) result = caseArchOption(changeInterface);
				if (result == null) result = caseOption(changeInterface);
				if (result == null) result = caseTraceableObject(changeInterface);
				if (result == null) result = caseRelationObject(changeInterface);
				if (result == null) result = caseConflictObject(changeInterface);
				if (result == null) result = caseDuplicationObject(changeInterface);
				if (result == null) result = caseDependencyObject(changeInterface);
				if (result == null) result = caseParentalObject(changeInterface);
				if (result == null) result = caseTriggerObject(changeInterface);
				if (result == null) result = caseResolveObject(changeInterface);
				if (result == null) result = caseAlternativeObject(changeInterface);
				if (result == null) result = caseCouldResolveObject(changeInterface);
				if (result == null) result = caseStakeholderObject(changeInterface);
				if (result == null) result = caseSelectionObject(changeInterface);
				if (result == null) result = caseIdentifier(changeInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.REMOVE_INTERFACE: {
				RemoveInterface removeInterface = (RemoveInterface)theEObject;
				T result = caseRemoveInterface(removeInterface);
				if (result == null) result = caseInterfaceOption(removeInterface);
				if (result == null) result = caseArchOption(removeInterface);
				if (result == null) result = caseOption(removeInterface);
				if (result == null) result = caseTraceableObject(removeInterface);
				if (result == null) result = caseRelationObject(removeInterface);
				if (result == null) result = caseConflictObject(removeInterface);
				if (result == null) result = caseDuplicationObject(removeInterface);
				if (result == null) result = caseDependencyObject(removeInterface);
				if (result == null) result = caseParentalObject(removeInterface);
				if (result == null) result = caseTriggerObject(removeInterface);
				if (result == null) result = caseResolveObject(removeInterface);
				if (result == null) result = caseAlternativeObject(removeInterface);
				if (result == null) result = caseCouldResolveObject(removeInterface);
				if (result == null) result = caseStakeholderObject(removeInterface);
				if (result == null) result = caseSelectionObject(removeInterface);
				if (result == null) result = caseIdentifier(removeInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.INTRODUCE_NEW_INTERFACE: {
				IntroduceNewInterface introduceNewInterface = (IntroduceNewInterface)theEObject;
				T result = caseIntroduceNewInterface(introduceNewInterface);
				if (result == null) result = caseInterfaceOption(introduceNewInterface);
				if (result == null) result = caseArchOption(introduceNewInterface);
				if (result == null) result = caseOption(introduceNewInterface);
				if (result == null) result = caseTraceableObject(introduceNewInterface);
				if (result == null) result = caseRelationObject(introduceNewInterface);
				if (result == null) result = caseConflictObject(introduceNewInterface);
				if (result == null) result = caseDuplicationObject(introduceNewInterface);
				if (result == null) result = caseDependencyObject(introduceNewInterface);
				if (result == null) result = caseParentalObject(introduceNewInterface);
				if (result == null) result = caseTriggerObject(introduceNewInterface);
				if (result == null) result = caseResolveObject(introduceNewInterface);
				if (result == null) result = caseAlternativeObject(introduceNewInterface);
				if (result == null) result = caseCouldResolveObject(introduceNewInterface);
				if (result == null) result = caseStakeholderObject(introduceNewInterface);
				if (result == null) result = caseSelectionObject(introduceNewInterface);
				if (result == null) result = caseIdentifier(introduceNewInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchoptionsPackage.ARCH_CANDIDATE: {
				ArchCandidate archCandidate = (ArchCandidate)theEObject;
				T result = caseArchCandidate(archCandidate);
				if (result == null) result = caseArchOption(archCandidate);
				if (result == null) result = caseOption(archCandidate);
				if (result == null) result = caseTraceableObject(archCandidate);
				if (result == null) result = caseRelationObject(archCandidate);
				if (result == null) result = caseConflictObject(archCandidate);
				if (result == null) result = caseDuplicationObject(archCandidate);
				if (result == null) result = caseDependencyObject(archCandidate);
				if (result == null) result = caseParentalObject(archCandidate);
				if (result == null) result = caseTriggerObject(archCandidate);
				if (result == null) result = caseResolveObject(archCandidate);
				if (result == null) result = caseAlternativeObject(archCandidate);
				if (result == null) result = caseCouldResolveObject(archCandidate);
				if (result == null) result = caseStakeholderObject(archCandidate);
				if (result == null) result = caseSelectionObject(archCandidate);
				if (result == null) result = caseIdentifier(archCandidate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Arch Candidate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arch Candidate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchCandidate(ArchCandidate object) {
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

} //ArchoptionsSwitch
