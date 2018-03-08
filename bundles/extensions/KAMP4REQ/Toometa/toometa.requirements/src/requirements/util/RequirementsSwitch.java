/**
 */
package requirements.util;

import de.uka.ipd.sdq.identifier.Identifier;

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

import requirements.*;

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
 * @see requirements.RequirementsPackage
 * @generated
 */
public class RequirementsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RequirementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsSwitch() {
		if (modelPackage == null) {
			modelPackage = RequirementsPackage.eINSTANCE;
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
			case RequirementsPackage.REQ_REPOSITORY: {
				ReqRepository reqRepository = (ReqRepository)theEObject;
				T result = caseReqRepository(reqRepository);
				if (result == null) result = caseIdentifier(reqRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseTraceableObject(requirement);
				if (result == null) result = caseRelationObject(requirement);
				if (result == null) result = caseConflictObject(requirement);
				if (result == null) result = caseDuplicationObject(requirement);
				if (result == null) result = caseDependencyObject(requirement);
				if (result == null) result = caseParentalObject(requirement);
				if (result == null) result = caseTriggerObject(requirement);
				if (result == null) result = caseResolveObject(requirement);
				if (result == null) result = caseAlternativeObject(requirement);
				if (result == null) result = caseCouldResolveObject(requirement);
				if (result == null) result = caseStakeholderObject(requirement);
				if (result == null) result = caseSelectionObject(requirement);
				if (result == null) result = caseIdentifier(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.PROJECT_REQUIREMENT: {
				ProjectRequirement projectRequirement = (ProjectRequirement)theEObject;
				T result = caseProjectRequirement(projectRequirement);
				if (result == null) result = caseRequirement(projectRequirement);
				if (result == null) result = caseTraceableObject(projectRequirement);
				if (result == null) result = caseRelationObject(projectRequirement);
				if (result == null) result = caseConflictObject(projectRequirement);
				if (result == null) result = caseDuplicationObject(projectRequirement);
				if (result == null) result = caseDependencyObject(projectRequirement);
				if (result == null) result = caseParentalObject(projectRequirement);
				if (result == null) result = caseTriggerObject(projectRequirement);
				if (result == null) result = caseResolveObject(projectRequirement);
				if (result == null) result = caseAlternativeObject(projectRequirement);
				if (result == null) result = caseCouldResolveObject(projectRequirement);
				if (result == null) result = caseStakeholderObject(projectRequirement);
				if (result == null) result = caseSelectionObject(projectRequirement);
				if (result == null) result = caseIdentifier(projectRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.SYSTEM_REQUIREMENT: {
				SystemRequirement systemRequirement = (SystemRequirement)theEObject;
				T result = caseSystemRequirement(systemRequirement);
				if (result == null) result = caseRequirement(systemRequirement);
				if (result == null) result = caseTraceableObject(systemRequirement);
				if (result == null) result = caseRelationObject(systemRequirement);
				if (result == null) result = caseConflictObject(systemRequirement);
				if (result == null) result = caseDuplicationObject(systemRequirement);
				if (result == null) result = caseDependencyObject(systemRequirement);
				if (result == null) result = caseParentalObject(systemRequirement);
				if (result == null) result = caseTriggerObject(systemRequirement);
				if (result == null) result = caseResolveObject(systemRequirement);
				if (result == null) result = caseAlternativeObject(systemRequirement);
				if (result == null) result = caseCouldResolveObject(systemRequirement);
				if (result == null) result = caseStakeholderObject(systemRequirement);
				if (result == null) result = caseSelectionObject(systemRequirement);
				if (result == null) result = caseIdentifier(systemRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.PROCESS_REQUIREMENT: {
				ProcessRequirement processRequirement = (ProcessRequirement)theEObject;
				T result = caseProcessRequirement(processRequirement);
				if (result == null) result = caseRequirement(processRequirement);
				if (result == null) result = caseTraceableObject(processRequirement);
				if (result == null) result = caseRelationObject(processRequirement);
				if (result == null) result = caseConflictObject(processRequirement);
				if (result == null) result = caseDuplicationObject(processRequirement);
				if (result == null) result = caseDependencyObject(processRequirement);
				if (result == null) result = caseParentalObject(processRequirement);
				if (result == null) result = caseTriggerObject(processRequirement);
				if (result == null) result = caseResolveObject(processRequirement);
				if (result == null) result = caseAlternativeObject(processRequirement);
				if (result == null) result = caseCouldResolveObject(processRequirement);
				if (result == null) result = caseStakeholderObject(processRequirement);
				if (result == null) result = caseSelectionObject(processRequirement);
				if (result == null) result = caseIdentifier(processRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseSystemRequirement(constraint);
				if (result == null) result = caseRequirement(constraint);
				if (result == null) result = caseTraceableObject(constraint);
				if (result == null) result = caseRelationObject(constraint);
				if (result == null) result = caseConflictObject(constraint);
				if (result == null) result = caseDuplicationObject(constraint);
				if (result == null) result = caseDependencyObject(constraint);
				if (result == null) result = caseParentalObject(constraint);
				if (result == null) result = caseTriggerObject(constraint);
				if (result == null) result = caseResolveObject(constraint);
				if (result == null) result = caseAlternativeObject(constraint);
				if (result == null) result = caseCouldResolveObject(constraint);
				if (result == null) result = caseStakeholderObject(constraint);
				if (result == null) result = caseSelectionObject(constraint);
				if (result == null) result = caseIdentifier(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.FUNCTIONAL_REQUIREMENT: {
				FunctionalRequirement functionalRequirement = (FunctionalRequirement)theEObject;
				T result = caseFunctionalRequirement(functionalRequirement);
				if (result == null) result = caseSystemRequirement(functionalRequirement);
				if (result == null) result = caseRequirement(functionalRequirement);
				if (result == null) result = caseTraceableObject(functionalRequirement);
				if (result == null) result = caseRelationObject(functionalRequirement);
				if (result == null) result = caseConflictObject(functionalRequirement);
				if (result == null) result = caseDuplicationObject(functionalRequirement);
				if (result == null) result = caseDependencyObject(functionalRequirement);
				if (result == null) result = caseParentalObject(functionalRequirement);
				if (result == null) result = caseTriggerObject(functionalRequirement);
				if (result == null) result = caseResolveObject(functionalRequirement);
				if (result == null) result = caseAlternativeObject(functionalRequirement);
				if (result == null) result = caseCouldResolveObject(functionalRequirement);
				if (result == null) result = caseStakeholderObject(functionalRequirement);
				if (result == null) result = caseSelectionObject(functionalRequirement);
				if (result == null) result = caseIdentifier(functionalRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.QUALITY_REQUIREMENT: {
				QualityRequirement qualityRequirement = (QualityRequirement)theEObject;
				T result = caseQualityRequirement(qualityRequirement);
				if (result == null) result = caseSystemRequirement(qualityRequirement);
				if (result == null) result = caseRequirement(qualityRequirement);
				if (result == null) result = caseTraceableObject(qualityRequirement);
				if (result == null) result = caseRelationObject(qualityRequirement);
				if (result == null) result = caseConflictObject(qualityRequirement);
				if (result == null) result = caseDuplicationObject(qualityRequirement);
				if (result == null) result = caseDependencyObject(qualityRequirement);
				if (result == null) result = caseParentalObject(qualityRequirement);
				if (result == null) result = caseTriggerObject(qualityRequirement);
				if (result == null) result = caseResolveObject(qualityRequirement);
				if (result == null) result = caseAlternativeObject(qualityRequirement);
				if (result == null) result = caseCouldResolveObject(qualityRequirement);
				if (result == null) result = caseStakeholderObject(qualityRequirement);
				if (result == null) result = caseSelectionObject(qualityRequirement);
				if (result == null) result = caseIdentifier(qualityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.PROJECT_REQUIREMENTS: {
				ProjectRequirements projectRequirements = (ProjectRequirements)theEObject;
				T result = caseProjectRequirements(projectRequirements);
				if (result == null) result = caseIdentifier(projectRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.SYSTEM_REQUIREMENTS: {
				SystemRequirements systemRequirements = (SystemRequirements)theEObject;
				T result = caseSystemRequirements(systemRequirements);
				if (result == null) result = caseIdentifier(systemRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RequirementsPackage.PROCESS_REQUIREMENTS: {
				ProcessRequirements processRequirements = (ProcessRequirements)theEObject;
				T result = caseProcessRequirements(processRequirements);
				if (result == null) result = caseIdentifier(processRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReqRepository(ReqRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectRequirement(ProjectRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemRequirement(SystemRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessRequirement(ProcessRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalRequirement(FunctionalRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityRequirement(QualityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectRequirements(ProjectRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemRequirements(SystemRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessRequirements(ProcessRequirements object) {
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

} //RequirementsSwitch
