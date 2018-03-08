/**
 */
package de.uka.ipd.sdq.componentInternalDependencies.util;

import de.uka.ipd.sdq.componentInternalDependencies.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage
 * @generated
 */
public class ComponentInternalDependenciesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ComponentInternalDependenciesValidator INSTANCE = new ComponentInternalDependenciesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uka.ipd.sdq.componentInternalDependencies";

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
	public ComponentInternalDependenciesValidator() {
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
	  return ComponentInternalDependenciesPackage.eINSTANCE;
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
			case ComponentInternalDependenciesPackage.COMPONENT_INTERNAL_DEPENDENCY_REPOSITORY:
				return validateComponentInternalDependencyRepository((ComponentInternalDependencyRepository)value, diagnostics, context);
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY:
				return validateRoleToRoleDependency((RoleToRoleDependency)value, diagnostics, context);
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY:
				return validateOperationToOperationDependency((OperationToOperationDependency)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInternalDependencyRepository(ComponentInternalDependencyRepository componentInternalDependencyRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentInternalDependencyRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleToRoleDependency(RoleToRoleDependency roleToRoleDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(roleToRoleDependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(roleToRoleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(roleToRoleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(roleToRoleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(roleToRoleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(roleToRoleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(roleToRoleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(roleToRoleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(roleToRoleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleToRoleDependency_ProvidedRoleAndRequiredRoleBelongToSameComponent(roleToRoleDependency, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProvidedRoleAndRequiredRoleBelongToSameComponent constraint of '<em>Role To Role Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE_TO_ROLE_DEPENDENCY__PROVIDED_ROLE_AND_REQUIRED_ROLE_BELONG_TO_SAME_COMPONENT__EEXPRESSION = "\n" +
		"\t\t\tself.providedRole.providingEntity_ProvidedRole = self.requiredRole.requiringEntity_RequiredRole";

	/**
	 * Validates the ProvidedRoleAndRequiredRoleBelongToSameComponent constraint of '<em>Role To Role Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleToRoleDependency_ProvidedRoleAndRequiredRoleBelongToSameComponent(RoleToRoleDependency roleToRoleDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentInternalDependenciesPackage.Literals.ROLE_TO_ROLE_DEPENDENCY,
				 roleToRoleDependency,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProvidedRoleAndRequiredRoleBelongToSameComponent",
				 ROLE_TO_ROLE_DEPENDENCY__PROVIDED_ROLE_AND_REQUIRED_ROLE_BELONG_TO_SAME_COMPONENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationToOperationDependency(OperationToOperationDependency operationToOperationDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationToOperationDependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationToOperationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationToOperationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationToOperationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationToOperationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationToOperationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationToOperationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationToOperationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationToOperationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationToOperationDependency_ProvidedSignaturesBelongToProvidedRole(operationToOperationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationToOperationDependency_RequiredSignaturesBelongToRequiredRole(operationToOperationDependency, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProvidedSignaturesBelongToProvidedRole constraint of '<em>Operation To Operation Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION_TO_OPERATION_DEPENDENCY__PROVIDED_SIGNATURES_BELONG_TO_PROVIDED_ROLE__EEXPRESSION = "\n" +
		"\t\tself.providedSignatures->forAll(signature|\n" +
		"\t\t\tif (self.parentRoleToRoleDependency.providedRole.oclIsKindOf(pcm::repository::OperationProvidedRole))\n" +
		"\t\t\t  then (self.parentRoleToRoleDependency.providedRole.oclAsType((pcm::repository::OperationProvidedRole)).\n" +
		"\t\t\t\tprovidedInterface__OperationProvidedRole.signatures__OperationInterface->includes(signature))\n" +
		"\t\t\t  else (true) endif\n" +
		"\t\t)";

	/**
	 * Validates the ProvidedSignaturesBelongToProvidedRole constraint of '<em>Operation To Operation Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationToOperationDependency_ProvidedSignaturesBelongToProvidedRole(OperationToOperationDependency operationToOperationDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentInternalDependenciesPackage.Literals.OPERATION_TO_OPERATION_DEPENDENCY,
				 operationToOperationDependency,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProvidedSignaturesBelongToProvidedRole",
				 OPERATION_TO_OPERATION_DEPENDENCY__PROVIDED_SIGNATURES_BELONG_TO_PROVIDED_ROLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RequiredSignaturesBelongToRequiredRole constraint of '<em>Operation To Operation Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION_TO_OPERATION_DEPENDENCY__REQUIRED_SIGNATURES_BELONG_TO_REQUIRED_ROLE__EEXPRESSION = "\n" +
		"\t\tself.requiredSignatures->forAll(signature|\n" +
		"\t\t\tif (self.parentRoleToRoleDependency.requiredRole.oclIsKindOf(pcm::repository::OperationRequiredRole))\n" +
		"\t\t\t  then (self.parentRoleToRoleDependency.requiredRole.oclAsType((pcm::repository::OperationRequiredRole)).\n" +
		"\t\t\t\trequiredInterface__OperationRequiredRole.signatures__OperationInterface->includes(signature))\n" +
		"\t\t\t  else (true) endif\n" +
		"\t\t)";

	/**
	 * Validates the RequiredSignaturesBelongToRequiredRole constraint of '<em>Operation To Operation Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationToOperationDependency_RequiredSignaturesBelongToRequiredRole(OperationToOperationDependency operationToOperationDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ComponentInternalDependenciesPackage.Literals.OPERATION_TO_OPERATION_DEPENDENCY,
				 operationToOperationDependency,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RequiredSignaturesBelongToRequiredRole",
				 OPERATION_TO_OPERATION_DEPENDENCY__REQUIRED_SIGNATURES_BELONG_TO_REQUIRED_ROLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //ComponentInternalDependenciesValidator
