/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.util;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.*;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;
import org.palladiosimulator.pcm.usagemodel.OpenWorkload;
import org.palladiosimulator.pcm.usagemodel.Workload;

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
 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage
 * @generated
 */
public class BpusagemodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BpusagemodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpusagemodelSwitch() {
		if (modelPackage == null) {
			modelPackage = BpusagemodelPackage.eINSTANCE;
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
			case BpusagemodelPackage.ACTOR_STEP: {
				ActorStep actorStep = (ActorStep)theEObject;
				T result = caseActorStep(actorStep);
				if (result == null) result = caseAbstractUserAction(actorStep);
				if (result == null) result = caseEntity(actorStep);
				if (result == null) result = caseIdentifier(actorStep);
				if (result == null) result = caseNamedElement(actorStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpusagemodelPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseAbstractUserAction(activity);
				if (result == null) result = caseEntity(activity);
				if (result == null) result = caseIdentifier(activity);
				if (result == null) result = caseNamedElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpusagemodelPackage.PROCESS_WORKLOAD: {
				ProcessWorkload processWorkload = (ProcessWorkload)theEObject;
				T result = caseProcessWorkload(processWorkload);
				if (result == null) result = caseOpenWorkload(processWorkload);
				if (result == null) result = caseWorkload(processWorkload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD: {
				ProcessTriggerPeriod processTriggerPeriod = (ProcessTriggerPeriod)theEObject;
				T result = caseProcessTriggerPeriod(processTriggerPeriod);
				if (result == null) result = caseIdentifier(processTriggerPeriod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION: {
				AcquireDeviceResourceAction acquireDeviceResourceAction = (AcquireDeviceResourceAction)theEObject;
				T result = caseAcquireDeviceResourceAction(acquireDeviceResourceAction);
				if (result == null) result = caseAbstractUserAction(acquireDeviceResourceAction);
				if (result == null) result = caseEntity(acquireDeviceResourceAction);
				if (result == null) result = caseIdentifier(acquireDeviceResourceAction);
				if (result == null) result = caseNamedElement(acquireDeviceResourceAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BpusagemodelPackage.RELEASE_DEVICE_RESOURCE_ACTION: {
				ReleaseDeviceResourceAction releaseDeviceResourceAction = (ReleaseDeviceResourceAction)theEObject;
				T result = caseReleaseDeviceResourceAction(releaseDeviceResourceAction);
				if (result == null) result = caseAbstractUserAction(releaseDeviceResourceAction);
				if (result == null) result = caseEntity(releaseDeviceResourceAction);
				if (result == null) result = caseIdentifier(releaseDeviceResourceAction);
				if (result == null) result = caseNamedElement(releaseDeviceResourceAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorStep(ActorStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Workload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Workload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessWorkload(ProcessWorkload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Trigger Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Trigger Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessTriggerPeriod(ProcessTriggerPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acquire Device Resource Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acquire Device Resource Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcquireDeviceResourceAction(AcquireDeviceResourceAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Device Resource Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Device Resource Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseDeviceResourceAction(ReleaseDeviceResourceAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract User Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract User Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractUserAction(AbstractUserAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkload(Workload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Workload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Workload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenWorkload(OpenWorkload object) {
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

} //BpusagemodelSwitch
