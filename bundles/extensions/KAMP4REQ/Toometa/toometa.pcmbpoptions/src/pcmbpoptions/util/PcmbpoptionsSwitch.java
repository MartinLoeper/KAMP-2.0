/**
 */
package pcmbpoptions.util;

import archoptions.ArchOption;

import de.uka.ipd.sdq.identifier.Identifier;

import options.Option;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pcmbpoptions.*;

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
 * @see pcmbpoptions.PcmbpoptionsPackage
 * @generated
 */
public class PcmbpoptionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PcmbpoptionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmbpoptionsSwitch() {
		if (modelPackage == null) {
			modelPackage = PcmbpoptionsPackage.eINSTANCE;
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
			case PcmbpoptionsPackage.PCM_ENTITY_OPTION: {
				PCM_EntityOption pcM_EntityOption = (PCM_EntityOption)theEObject;
				T result = casePCM_EntityOption(pcM_EntityOption);
				if (result == null) result = caseArchOption(pcM_EntityOption);
				if (result == null) result = caseOption(pcM_EntityOption);
				if (result == null) result = caseTraceableObject(pcM_EntityOption);
				if (result == null) result = caseRelationObject(pcM_EntityOption);
				if (result == null) result = caseConflictObject(pcM_EntityOption);
				if (result == null) result = caseDuplicationObject(pcM_EntityOption);
				if (result == null) result = caseDependencyObject(pcM_EntityOption);
				if (result == null) result = caseParentalObject(pcM_EntityOption);
				if (result == null) result = caseTriggerObject(pcM_EntityOption);
				if (result == null) result = caseResolveObject(pcM_EntityOption);
				if (result == null) result = caseAlternativeObject(pcM_EntityOption);
				if (result == null) result = caseCouldResolveObject(pcM_EntityOption);
				if (result == null) result = caseStakeholderObject(pcM_EntityOption);
				if (result == null) result = caseSelectionObject(pcM_EntityOption);
				if (result == null) result = caseIdentifier(pcM_EntityOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmbpoptionsPackage.PCM_INTRODUCE_NEW_ENTITY: {
				PCM_IntroduceNewEntity pcM_IntroduceNewEntity = (PCM_IntroduceNewEntity)theEObject;
				T result = casePCM_IntroduceNewEntity(pcM_IntroduceNewEntity);
				if (result == null) result = casePCM_EntityOption(pcM_IntroduceNewEntity);
				if (result == null) result = caseArchOption(pcM_IntroduceNewEntity);
				if (result == null) result = caseOption(pcM_IntroduceNewEntity);
				if (result == null) result = caseTraceableObject(pcM_IntroduceNewEntity);
				if (result == null) result = caseRelationObject(pcM_IntroduceNewEntity);
				if (result == null) result = caseConflictObject(pcM_IntroduceNewEntity);
				if (result == null) result = caseDuplicationObject(pcM_IntroduceNewEntity);
				if (result == null) result = caseDependencyObject(pcM_IntroduceNewEntity);
				if (result == null) result = caseParentalObject(pcM_IntroduceNewEntity);
				if (result == null) result = caseTriggerObject(pcM_IntroduceNewEntity);
				if (result == null) result = caseResolveObject(pcM_IntroduceNewEntity);
				if (result == null) result = caseAlternativeObject(pcM_IntroduceNewEntity);
				if (result == null) result = caseCouldResolveObject(pcM_IntroduceNewEntity);
				if (result == null) result = caseStakeholderObject(pcM_IntroduceNewEntity);
				if (result == null) result = caseSelectionObject(pcM_IntroduceNewEntity);
				if (result == null) result = caseIdentifier(pcM_IntroduceNewEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmbpoptionsPackage.PCM_CHANGE_ENTITY: {
				PCM_ChangeEntity pcM_ChangeEntity = (PCM_ChangeEntity)theEObject;
				T result = casePCM_ChangeEntity(pcM_ChangeEntity);
				if (result == null) result = casePCM_EntityOption(pcM_ChangeEntity);
				if (result == null) result = caseArchOption(pcM_ChangeEntity);
				if (result == null) result = caseOption(pcM_ChangeEntity);
				if (result == null) result = caseTraceableObject(pcM_ChangeEntity);
				if (result == null) result = caseRelationObject(pcM_ChangeEntity);
				if (result == null) result = caseConflictObject(pcM_ChangeEntity);
				if (result == null) result = caseDuplicationObject(pcM_ChangeEntity);
				if (result == null) result = caseDependencyObject(pcM_ChangeEntity);
				if (result == null) result = caseParentalObject(pcM_ChangeEntity);
				if (result == null) result = caseTriggerObject(pcM_ChangeEntity);
				if (result == null) result = caseResolveObject(pcM_ChangeEntity);
				if (result == null) result = caseAlternativeObject(pcM_ChangeEntity);
				if (result == null) result = caseCouldResolveObject(pcM_ChangeEntity);
				if (result == null) result = caseStakeholderObject(pcM_ChangeEntity);
				if (result == null) result = caseSelectionObject(pcM_ChangeEntity);
				if (result == null) result = caseIdentifier(pcM_ChangeEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcmbpoptionsPackage.PCM_REMOVE_ENTITY: {
				PCM_RemoveEntity pcM_RemoveEntity = (PCM_RemoveEntity)theEObject;
				T result = casePCM_RemoveEntity(pcM_RemoveEntity);
				if (result == null) result = casePCM_EntityOption(pcM_RemoveEntity);
				if (result == null) result = caseArchOption(pcM_RemoveEntity);
				if (result == null) result = caseOption(pcM_RemoveEntity);
				if (result == null) result = caseTraceableObject(pcM_RemoveEntity);
				if (result == null) result = caseRelationObject(pcM_RemoveEntity);
				if (result == null) result = caseConflictObject(pcM_RemoveEntity);
				if (result == null) result = caseDuplicationObject(pcM_RemoveEntity);
				if (result == null) result = caseDependencyObject(pcM_RemoveEntity);
				if (result == null) result = caseParentalObject(pcM_RemoveEntity);
				if (result == null) result = caseTriggerObject(pcM_RemoveEntity);
				if (result == null) result = caseResolveObject(pcM_RemoveEntity);
				if (result == null) result = caseAlternativeObject(pcM_RemoveEntity);
				if (result == null) result = caseCouldResolveObject(pcM_RemoveEntity);
				if (result == null) result = caseStakeholderObject(pcM_RemoveEntity);
				if (result == null) result = caseSelectionObject(pcM_RemoveEntity);
				if (result == null) result = caseIdentifier(pcM_RemoveEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Entity Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Entity Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_EntityOption(PCM_EntityOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Introduce New Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Introduce New Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_IntroduceNewEntity(PCM_IntroduceNewEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Change Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Change Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_ChangeEntity(PCM_ChangeEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCM Remove Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCM Remove Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCM_RemoveEntity(PCM_RemoveEntity object) {
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

} //PcmbpoptionsSwitch
