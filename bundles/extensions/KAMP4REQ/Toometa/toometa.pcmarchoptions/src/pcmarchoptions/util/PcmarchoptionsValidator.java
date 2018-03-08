/**
 */
package pcmarchoptions.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pcmarchoptions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pcmarchoptions.PcmarchoptionsPackage
 * @generated
 */
public class PcmarchoptionsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PcmarchoptionsValidator INSTANCE = new PcmarchoptionsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pcmarchoptions";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmarchoptionsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PcmarchoptionsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PcmarchoptionsPackage.PCM_SPLIT_COMPONENT:
				return validatePCM_SplitComponent((PCM_SplitComponent)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_ALLOCATE_TOGETHER:
				return validatePCM_AllocateTogether((PCM_AllocateTogether)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES:
				return validatePCM_NeverAllocateToSpecificNodes((PCM_NeverAllocateToSpecificNodes)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER:
				return validatePCM_IntroduceNewAdapter((PCM_IntroduceNewAdapter)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_COMPONENT:
				return validatePCM_IntroduceNewComponent((PCM_IntroduceNewComponent)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_MOVE_COMPONENTS:
				return validatePCM_MoveComponents((PCM_MoveComponents)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_ONLY_SINGLE_INSTANTIATION:
				return validatePCM_OnlySingleInstantiation((PCM_OnlySingleInstantiation)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_CHANGE_ROLES:
				return validatePCM_ChangeRoles((PCM_ChangeRoles)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_ALLOCATE_NEVER_TOGETHER:
				return validatePCM_AllocateNeverTogether((PCM_AllocateNeverTogether)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_MULTIPLE_INSTANTIATION:
				return validatePCM_MultipleInstantiation((PCM_MultipleInstantiation)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_BAN_COMPONENT:
				return validatePCM_BanComponent((PCM_BanComponent)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_MULTIPLE_ALLOCATION:
				return validatePCM_MultipleAllocation((PCM_MultipleAllocation)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_PROVIDED_FUNCTIONALITY:
				return validatePCM_ProvidedFunctionality((PCM_ProvidedFunctionality)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS:
				return validatePCM_ReplaceComponents((PCM_ReplaceComponents)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_REUSE_COMPONENT:
				return validatePCM_ReuseComponent((PCM_ReuseComponent)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION:
				return validatePCM_FunctionalityConnection((PCM_FunctionalityConnection)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_MERGE_COMPONENTS:
				return validatePCM_MergeComponents((PCM_MergeComponents)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_ONLY_SINGLE_ALLOCATION:
				return validatePCM_OnlySingleAllocation((PCM_OnlySingleAllocation)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_REQUIRED_FUNCTIONALITY:
				return validatePCM_RequiredFunctionality((PCM_RequiredFunctionality)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE:
				return validatePCM_ChangeDataType((PCM_ChangeDataType)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_DATA_TYPE:
				return validatePCM_IntroduceNewDataType((PCM_IntroduceNewDataType)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_REMOVE_DATA_TYPE:
				return validatePCM_RemoveDataType((PCM_RemoveDataType)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_INTERFACE:
				return validatePCM_IntroduceNewInterface((PCM_IntroduceNewInterface)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE:
				return validatePCM_ChangeInterface((PCM_ChangeInterface)value, diagnostics, context);
			case PcmarchoptionsPackage.PCM_REMOVE_INTERFACE:
				return validatePCM_RemoveInterface((PCM_RemoveInterface)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_SplitComponent(PCM_SplitComponent pcM_SplitComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_SplitComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_AllocateTogether(PCM_AllocateTogether pcM_AllocateTogether, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)pcM_AllocateTogether, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)pcM_AllocateTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)pcM_AllocateTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)pcM_AllocateTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)pcM_AllocateTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)pcM_AllocateTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)pcM_AllocateTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)pcM_AllocateTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)pcM_AllocateTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validatePCM_AllocateTogether_TogetherAllocation(pcM_AllocateTogether, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TogetherAllocation constraint of '<em>PCM Allocate Together</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_AllocateTogether_TogetherAllocation(PCM_AllocateTogether pcM_AllocateTogether, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TogetherAllocation", getObjectLabel(pcM_AllocateTogether, context) },
						 new Object[] { pcM_AllocateTogether },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_NeverAllocateToSpecificNodes(PCM_NeverAllocateToSpecificNodes pcM_NeverAllocateToSpecificNodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)pcM_NeverAllocateToSpecificNodes, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)pcM_NeverAllocateToSpecificNodes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)pcM_NeverAllocateToSpecificNodes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)pcM_NeverAllocateToSpecificNodes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)pcM_NeverAllocateToSpecificNodes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)pcM_NeverAllocateToSpecificNodes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)pcM_NeverAllocateToSpecificNodes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)pcM_NeverAllocateToSpecificNodes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)pcM_NeverAllocateToSpecificNodes, diagnostics, context);
		if (result || diagnostics != null) result &= validatePCM_NeverAllocateToSpecificNodes_NeverAllocateToSpecificNodes(pcM_NeverAllocateToSpecificNodes, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NeverAllocateToSpecificNodes constraint of '<em>PCM Never Allocate To Specific Nodes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_NeverAllocateToSpecificNodes_NeverAllocateToSpecificNodes(PCM_NeverAllocateToSpecificNodes pcM_NeverAllocateToSpecificNodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NeverAllocateToSpecificNodes", getObjectLabel(pcM_NeverAllocateToSpecificNodes, context) },
						 new Object[] { pcM_NeverAllocateToSpecificNodes },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_IntroduceNewAdapter(PCM_IntroduceNewAdapter pcM_IntroduceNewAdapter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_IntroduceNewAdapter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_IntroduceNewComponent(PCM_IntroduceNewComponent pcM_IntroduceNewComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_IntroduceNewComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_MoveComponents(PCM_MoveComponents pcM_MoveComponents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)pcM_MoveComponents, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)pcM_MoveComponents, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)pcM_MoveComponents, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)pcM_MoveComponents, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)pcM_MoveComponents, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)pcM_MoveComponents, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)pcM_MoveComponents, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)pcM_MoveComponents, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)pcM_MoveComponents, diagnostics, context);
		if (result || diagnostics != null) result &= validatePCM_MoveComponents_MoveComponents(pcM_MoveComponents, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MoveComponents constraint of '<em>PCM Move Components</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_MoveComponents_MoveComponents(PCM_MoveComponents pcM_MoveComponents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "MoveComponents", getObjectLabel(pcM_MoveComponents, context) },
						 new Object[] { pcM_MoveComponents },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_OnlySingleInstantiation(PCM_OnlySingleInstantiation pcM_OnlySingleInstantiation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)pcM_OnlySingleInstantiation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)pcM_OnlySingleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)pcM_OnlySingleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)pcM_OnlySingleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)pcM_OnlySingleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)pcM_OnlySingleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)pcM_OnlySingleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)pcM_OnlySingleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)pcM_OnlySingleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePCM_OnlySingleInstantiation_SingleInstantiation(pcM_OnlySingleInstantiation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SingleInstantiation constraint of '<em>PCM Only Single Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_OnlySingleInstantiation_SingleInstantiation(PCM_OnlySingleInstantiation pcM_OnlySingleInstantiation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SingleInstantiation", getObjectLabel(pcM_OnlySingleInstantiation, context) },
						 new Object[] { pcM_OnlySingleInstantiation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_ChangeRoles(PCM_ChangeRoles pcM_ChangeRoles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_ChangeRoles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_AllocateNeverTogether(PCM_AllocateNeverTogether pcM_AllocateNeverTogether, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)pcM_AllocateNeverTogether, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)pcM_AllocateNeverTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)pcM_AllocateNeverTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)pcM_AllocateNeverTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)pcM_AllocateNeverTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)pcM_AllocateNeverTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)pcM_AllocateNeverTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)pcM_AllocateNeverTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)pcM_AllocateNeverTogether, diagnostics, context);
		if (result || diagnostics != null) result &= validatePCM_AllocateNeverTogether_NeverTogether(pcM_AllocateNeverTogether, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NeverTogether constraint of '<em>PCM Allocate Never Together</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_AllocateNeverTogether_NeverTogether(PCM_AllocateNeverTogether pcM_AllocateNeverTogether, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NeverTogether", getObjectLabel(pcM_AllocateNeverTogether, context) },
						 new Object[] { pcM_AllocateNeverTogether },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_MultipleInstantiation(PCM_MultipleInstantiation pcM_MultipleInstantiation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)pcM_MultipleInstantiation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)pcM_MultipleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)pcM_MultipleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)pcM_MultipleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)pcM_MultipleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)pcM_MultipleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)pcM_MultipleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)pcM_MultipleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)pcM_MultipleInstantiation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePCM_MultipleInstantiation_SameComponent(pcM_MultipleInstantiation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SameComponent constraint of '<em>PCM Multiple Instantiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_MultipleInstantiation_SameComponent(PCM_MultipleInstantiation pcM_MultipleInstantiation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SameComponent", getObjectLabel(pcM_MultipleInstantiation, context) },
						 new Object[] { pcM_MultipleInstantiation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_BanComponent(PCM_BanComponent pcM_BanComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_BanComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_MultipleAllocation(PCM_MultipleAllocation pcM_MultipleAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)pcM_MultipleAllocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)pcM_MultipleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)pcM_MultipleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)pcM_MultipleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)pcM_MultipleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)pcM_MultipleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)pcM_MultipleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)pcM_MultipleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)pcM_MultipleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePCM_MultipleAllocation_MultipleAllocation(pcM_MultipleAllocation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MultipleAllocation constraint of '<em>PCM Multiple Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_MultipleAllocation_MultipleAllocation(PCM_MultipleAllocation pcM_MultipleAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "MultipleAllocation", getObjectLabel(pcM_MultipleAllocation, context) },
						 new Object[] { pcM_MultipleAllocation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_ProvidedFunctionality(PCM_ProvidedFunctionality pcM_ProvidedFunctionality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_ProvidedFunctionality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_ReplaceComponents(PCM_ReplaceComponents pcM_ReplaceComponents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_ReplaceComponents, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_ReuseComponent(PCM_ReuseComponent pcM_ReuseComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_ReuseComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_FunctionalityConnection(PCM_FunctionalityConnection pcM_FunctionalityConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)pcM_FunctionalityConnection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)pcM_FunctionalityConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)pcM_FunctionalityConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)pcM_FunctionalityConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)pcM_FunctionalityConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)pcM_FunctionalityConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)pcM_FunctionalityConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)pcM_FunctionalityConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)pcM_FunctionalityConnection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePCM_FunctionalityConnection_RolesHaveValidConnection(pcM_FunctionalityConnection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the RolesHaveValidConnection constraint of '<em>PCM Functionality Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_FunctionalityConnection_RolesHaveValidConnection(PCM_FunctionalityConnection pcM_FunctionalityConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "RolesHaveValidConnection", getObjectLabel(pcM_FunctionalityConnection, context) },
						 new Object[] { pcM_FunctionalityConnection },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_MergeComponents(PCM_MergeComponents pcM_MergeComponents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_MergeComponents, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_OnlySingleAllocation(PCM_OnlySingleAllocation pcM_OnlySingleAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)pcM_OnlySingleAllocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)pcM_OnlySingleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)pcM_OnlySingleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)pcM_OnlySingleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)pcM_OnlySingleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)pcM_OnlySingleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)pcM_OnlySingleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)pcM_OnlySingleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)pcM_OnlySingleAllocation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePCM_OnlySingleAllocation_SingleAllocation(pcM_OnlySingleAllocation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SingleAllocation constraint of '<em>PCM Only Single Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_OnlySingleAllocation_SingleAllocation(PCM_OnlySingleAllocation pcM_OnlySingleAllocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SingleAllocation", getObjectLabel(pcM_OnlySingleAllocation, context) },
						 new Object[] { pcM_OnlySingleAllocation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_RequiredFunctionality(PCM_RequiredFunctionality pcM_RequiredFunctionality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_RequiredFunctionality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_ChangeDataType(PCM_ChangeDataType pcM_ChangeDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_ChangeDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_IntroduceNewDataType(PCM_IntroduceNewDataType pcM_IntroduceNewDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_IntroduceNewDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_RemoveDataType(PCM_RemoveDataType pcM_RemoveDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_RemoveDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_IntroduceNewInterface(PCM_IntroduceNewInterface pcM_IntroduceNewInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_IntroduceNewInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_ChangeInterface(PCM_ChangeInterface pcM_ChangeInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_ChangeInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePCM_RemoveInterface(PCM_RemoveInterface pcM_RemoveInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)pcM_RemoveInterface, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PcmarchoptionsValidator
