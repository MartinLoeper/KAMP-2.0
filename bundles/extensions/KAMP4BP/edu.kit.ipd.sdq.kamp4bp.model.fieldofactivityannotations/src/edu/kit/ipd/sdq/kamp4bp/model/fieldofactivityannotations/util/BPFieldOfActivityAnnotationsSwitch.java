/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.util;

import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.*;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.core.entity.NamedElement;

import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

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
 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage
 * @generated
 */
public class BPFieldOfActivityAnnotationsSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BPFieldOfActivityAnnotationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPFieldOfActivityAnnotationsSwitch() {
		if (modelPackage == null) {
			modelPackage = BPFieldOfActivityAnnotationsPackage.eINSTANCE;
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
			case BPFieldOfActivityAnnotationsPackage.BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY: {
				BPFieldOfActivityAnnotationsRepository bpFieldOfActivityAnnotationsRepository = (BPFieldOfActivityAnnotationsRepository)theEObject;
				T1 result = caseBPFieldOfActivityAnnotationsRepository(bpFieldOfActivityAnnotationsRepository);
				if (result == null) result = caseISFieldOfActivityAnnotationsRepository(bpFieldOfActivityAnnotationsRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION: {
				BPUserActionAnnotation<?> bpUserActionAnnotation = (BPUserActionAnnotation<?>)theEObject;
				T1 result = caseBPUserActionAnnotation(bpUserActionAnnotation);
				if (result == null) result = caseNamedElement(bpUserActionAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPFieldOfActivityAnnotationsPackage.BP_GOOD: {
				BPGood bpGood = (BPGood)theEObject;
				T1 result = caseBPGood(bpGood);
				if (result == null) result = caseBPUserActionAnnotation(bpGood);
				if (result == null) result = caseNamedElement(bpGood);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE: {
				BPMessage bpMessage = (BPMessage)theEObject;
				T1 result = caseBPMessage(bpMessage);
				if (result == null) result = caseBPUserActionAnnotation(bpMessage);
				if (result == null) result = caseNamedElement(bpMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPFieldOfActivityAnnotationsPackage.BP_ORGANIZATIONAL_UNIT: {
				BPOrganizationalUnit bpOrganizationalUnit = (BPOrganizationalUnit)theEObject;
				T1 result = caseBPOrganizationalUnit(bpOrganizationalUnit);
				if (result == null) result = caseBPUserActionAnnotation(bpOrganizationalUnit);
				if (result == null) result = caseNamedElement(bpOrganizationalUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPFieldOfActivityAnnotationsPackage.BP_TRAINING_COURSE: {
				BPTrainingCourse bpTrainingCourse = (BPTrainingCourse)theEObject;
				T1 result = caseBPTrainingCourse(bpTrainingCourse);
				if (result == null) result = caseBPUserActionAnnotation(bpTrainingCourse);
				if (result == null) result = caseNamedElement(bpTrainingCourse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION: {
				BPBusinessProcessSpecification bpBusinessProcessSpecification = (BPBusinessProcessSpecification)theEObject;
				T1 result = caseBPBusinessProcessSpecification(bpBusinessProcessSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPFieldOfActivityAnnotationsRepository(BPFieldOfActivityAnnotationsRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP User Action Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP User Action Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends AbstractUserAction> T1 caseBPUserActionAnnotation(BPUserActionAnnotation<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Good</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Good</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPGood(BPGood object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPMessage(BPMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Organizational Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Organizational Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPOrganizationalUnit(BPOrganizationalUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Training Course</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Training Course</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPTrainingCourse(BPTrainingCourse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BP Business Process Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BP Business Process Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBPBusinessProcessSpecification(BPBusinessProcessSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISFieldOfActivityAnnotationsRepository(ISFieldOfActivityAnnotationsRepository object) {
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
	public T1 caseNamedElement(NamedElement object) {
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

} //BPFieldOfActivityAnnotationsSwitch
