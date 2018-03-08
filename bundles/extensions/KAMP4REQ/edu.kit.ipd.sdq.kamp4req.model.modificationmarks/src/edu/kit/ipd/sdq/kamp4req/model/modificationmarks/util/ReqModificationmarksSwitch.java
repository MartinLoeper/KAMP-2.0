/**
 */
package edu.kit.ipd.sdq.kamp4req.model.modificationmarks.util;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyEntity;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications;

import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.core.entity.Entity;

import relations.TraceableObject;

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
 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage
 * @generated
 */
public class ReqModificationmarksSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReqModificationmarksPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqModificationmarksSwitch() {
		if (modelPackage == null) {
			modelPackage = ReqModificationmarksPackage.eINSTANCE;
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ReqModificationmarksPackage.REQ_MODIFICATION_REPOSITORY: {
				ReqModificationRepository reqModificationRepository = (ReqModificationRepository)theEObject;
				T1 result = caseReqModificationRepository(reqModificationRepository);
				if (result == null) result = caseAbstractISModificationRepository(reqModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(reqModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS: {
				ReqSeedModifications reqSeedModifications = (ReqSeedModifications)theEObject;
				T1 result = caseReqSeedModifications(reqSeedModifications);
				if (result == null) result = caseBPSeedModifications(reqSeedModifications);
				if (result == null) result = caseISSeedModifications(reqSeedModifications);
				if (result == null) result = caseAbstractSeedModifications(reqSeedModifications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqModificationmarksPackage.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES: {
				ReqChangePropagationDueToSpecificationDependencies reqChangePropagationDueToSpecificationDependencies = (ReqChangePropagationDueToSpecificationDependencies)theEObject;
				T1 result = caseReqChangePropagationDueToSpecificationDependencies(reqChangePropagationDueToSpecificationDependencies);
				if (result == null) result = caseChangePropagationStep(reqChangePropagationDueToSpecificationDependencies);
				if (result == null) result = caseAbstractChangePropagationStep(reqChangePropagationDueToSpecificationDependencies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqModificationmarksPackage.REQ_MODIFY_ENTITY: {
				ReqModifyEntity reqModifyEntity = (ReqModifyEntity)theEObject;
				T1 result = caseReqModifyEntity(reqModifyEntity);
				if (result == null) result = caseISModifyEntity(reqModifyEntity);
				if (result == null) result = caseAbstractModification(reqModifyEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqModificationmarksPackage.REQ_MODIFY_TRACEABLE_OBJECT: {
				ReqModifyTraceableObject<?> reqModifyTraceableObject = (ReqModifyTraceableObject<?>)theEObject;
				T1 result = caseReqModifyTraceableObject(reqModifyTraceableObject);
				if (result == null) result = caseAbstractModification(reqModifyTraceableObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqModificationmarksPackage.REQ_MODIFY_REQUIREMENT: {
				ReqModifyRequirement reqModifyRequirement = (ReqModifyRequirement)theEObject;
				T1 result = caseReqModifyRequirement(reqModifyRequirement);
				if (result == null) result = caseReqModifyTraceableObject(reqModifyRequirement);
				if (result == null) result = caseAbstractModification(reqModifyRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqModificationmarksPackage.REQ_MODIFY_DECISION: {
				ReqModifyDecision reqModifyDecision = (ReqModifyDecision)theEObject;
				T1 result = caseReqModifyDecision(reqModifyDecision);
				if (result == null) result = caseReqModifyTraceableObject(reqModifyDecision);
				if (result == null) result = caseAbstractModification(reqModifyDecision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqModificationmarksPackage.REQ_MODIFY_OPTION: {
				ReqModifyOption reqModifyOption = (ReqModifyOption)theEObject;
				T1 result = caseReqModifyOption(reqModifyOption);
				if (result == null) result = caseReqModifyTraceableObject(reqModifyOption);
				if (result == null) result = caseAbstractModification(reqModifyOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReqModificationRepository(ReqModificationRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReqSeedModifications(ReqSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req Change Propagation Due To Specification Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req Change Propagation Due To Specification Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReqChangePropagationDueToSpecificationDependencies(ReqChangePropagationDueToSpecificationDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req Modify Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req Modify Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReqModifyEntity(ReqModifyEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req Modify Traceable Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req Modify Traceable Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends TraceableObject> T1 caseReqModifyTraceableObject(ReqModifyTraceableObject<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req Modify Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req Modify Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReqModifyRequirement(ReqModifyRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req Modify Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req Modify Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReqModifyDecision(ReqModifyDecision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req Modify Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req Modify Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReqModifyOption(ReqModifyOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> T1 caseAbstractModificationRepository(AbstractModificationRepository<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract IS Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract IS Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends ISSeedModifications> T1 caseAbstractISModificationRepository(AbstractISModificationRepository<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractSeedModifications(AbstractSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISSeedModifications(ISSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPSeedModifications(BPSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractChangePropagationStep(AbstractChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChangePropagationStep(ChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S, T> T1 caseAbstractModification(AbstractModification<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Modify Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Modify Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Entity> T1 caseISModifyEntity(ISModifyEntity<T> object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //ReqModificationmarksSwitch
