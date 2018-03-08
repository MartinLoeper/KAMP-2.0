/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.util;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.repository.Role;

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
 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage
 * @generated
 */
public class ISModificationmarksSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ISModificationmarksPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISModificationmarksSwitch() {
		if (modelPackage == null) {
			modelPackage = ISModificationmarksPackage.eINSTANCE;
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
			case ISModificationmarksPackage.ABSTRACT_IS_MODIFICATION_REPOSITORY: {
				AbstractISModificationRepository<?> abstractISModificationRepository = (AbstractISModificationRepository<?>)theEObject;
				T1 result = caseAbstractISModificationRepository(abstractISModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(abstractISModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISModificationmarksPackage.IS_MODIFICATION_REPOSITORY: {
				ISModificationRepository isModificationRepository = (ISModificationRepository)theEObject;
				T1 result = caseISModificationRepository(isModificationRepository);
				if (result == null) result = caseAbstractISModificationRepository(isModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(isModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS: {
				ISSeedModifications isSeedModifications = (ISSeedModifications)theEObject;
				T1 result = caseISSeedModifications(isSeedModifications);
				if (result == null) result = caseAbstractSeedModifications(isSeedModifications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES: {
				ISChangePropagationDueToDataDependencies isChangePropagationDueToDataDependencies = (ISChangePropagationDueToDataDependencies)theEObject;
				T1 result = caseISChangePropagationDueToDataDependencies(isChangePropagationDueToDataDependencies);
				if (result == null) result = caseChangePropagationStep(isChangePropagationDueToDataDependencies);
				if (result == null) result = caseAbstractChangePropagationStep(isChangePropagationDueToDataDependencies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES: {
				ISChangePropagationDueToInterfaceDependencies isChangePropagationDueToInterfaceDependencies = (ISChangePropagationDueToInterfaceDependencies)theEObject;
				T1 result = caseISChangePropagationDueToInterfaceDependencies(isChangePropagationDueToInterfaceDependencies);
				if (result == null) result = caseChangePropagationStep(isChangePropagationDueToInterfaceDependencies);
				if (result == null) result = caseAbstractChangePropagationStep(isChangePropagationDueToInterfaceDependencies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISModificationmarksPackage.IS_INTERCOMPONENT_PROPAGATION: {
				ISIntercomponentPropagation isIntercomponentPropagation = (ISIntercomponentPropagation)theEObject;
				T1 result = caseISIntercomponentPropagation(isIntercomponentPropagation);
				if (result == null) result = caseChangePropagationStep(isIntercomponentPropagation);
				if (result == null) result = caseAbstractChangePropagationStep(isIntercomponentPropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISModificationmarksPackage.IS_INTRACOMPONENT_PROPAGATION: {
				ISIntracomponentPropagation isIntracomponentPropagation = (ISIntracomponentPropagation)theEObject;
				T1 result = caseISIntracomponentPropagation(isIntracomponentPropagation);
				if (result == null) result = caseChangePropagationStep(isIntracomponentPropagation);
				if (result == null) result = caseAbstractChangePropagationStep(isIntracomponentPropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISModificationmarksPackage.IS_MODIFY_DATA_TYPE: {
				ISModifyDataType isModifyDataType = (ISModifyDataType)theEObject;
				T1 result = caseISModifyDataType(isModifyDataType);
				if (result == null) result = caseAbstractModification(isModifyDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISModificationmarksPackage.IS_MODIFY_ENTITY: {
				ISModifyEntity<?> isModifyEntity = (ISModifyEntity<?>)theEObject;
				T1 result = caseISModifyEntity(isModifyEntity);
				if (result == null) result = caseAbstractModification(isModifyEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISModificationmarksPackage.IS_MODIFY_COMPONENT: {
				ISModifyComponent isModifyComponent = (ISModifyComponent)theEObject;
				T1 result = caseISModifyComponent(isModifyComponent);
				if (result == null) result = caseISModifyEntity(isModifyComponent);
				if (result == null) result = caseAbstractModification(isModifyComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISModificationmarksPackage.IS_MODIFY_CONNECTOR: {
				ISModifyConnector isModifyConnector = (ISModifyConnector)theEObject;
				T1 result = caseISModifyConnector(isModifyConnector);
				if (result == null) result = caseISModifyEntity(isModifyConnector);
				if (result == null) result = caseAbstractModification(isModifyConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISModificationmarksPackage.IS_MODIFY_ROLE: {
				ISModifyRole<?> isModifyRole = (ISModifyRole<?>)theEObject;
				T1 result = caseISModifyRole(isModifyRole);
				if (result == null) result = caseISModifyEntity(isModifyRole);
				if (result == null) result = caseAbstractModification(isModifyRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISModificationmarksPackage.IS_MODIFY_PROVIDED_ROLE: {
				ISModifyProvidedRole isModifyProvidedRole = (ISModifyProvidedRole)theEObject;
				T1 result = caseISModifyProvidedRole(isModifyProvidedRole);
				if (result == null) result = caseISModifyRole(isModifyProvidedRole);
				if (result == null) result = caseISModifyEntity(isModifyProvidedRole);
				if (result == null) result = caseAbstractModification(isModifyProvidedRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISModificationmarksPackage.IS_MODIFY_REQUIRED_ROLE: {
				ISModifyRequiredRole isModifyRequiredRole = (ISModifyRequiredRole)theEObject;
				T1 result = caseISModifyRequiredRole(isModifyRequiredRole);
				if (result == null) result = caseISModifyRole(isModifyRequiredRole);
				if (result == null) result = caseISModifyEntity(isModifyRequiredRole);
				if (result == null) result = caseAbstractModification(isModifyRequiredRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISModificationmarksPackage.IS_MODIFY_INTERFACE: {
				ISModifyInterface isModifyInterface = (ISModifyInterface)theEObject;
				T1 result = caseISModifyInterface(isModifyInterface);
				if (result == null) result = caseISModifyEntity(isModifyInterface);
				if (result == null) result = caseAbstractModification(isModifyInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ISModificationmarksPackage.IS_MODIFY_SIGNATURE: {
				ISModifySignature isModifySignature = (ISModifySignature)theEObject;
				T1 result = caseISModifySignature(isModifySignature);
				if (result == null) result = caseISModifyEntity(isModifySignature);
				if (result == null) result = caseAbstractModification(isModifySignature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>IS Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISModificationRepository(ISModificationRepository object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IS Change Propagation Due To Data Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Change Propagation Due To Data Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISChangePropagationDueToDataDependencies(ISChangePropagationDueToDataDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Change Propagation Due To Interface Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Change Propagation Due To Interface Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISChangePropagationDueToInterfaceDependencies(ISChangePropagationDueToInterfaceDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Intercomponent Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Intercomponent Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISIntercomponentPropagation(ISIntercomponentPropagation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Intracomponent Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Intracomponent Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISIntracomponentPropagation(ISIntracomponentPropagation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Modify Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Modify Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISModifyDataType(ISModifyDataType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>IS Modify Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Modify Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISModifyComponent(ISModifyComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Modify Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Modify Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISModifyConnector(ISModifyConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Modify Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Modify Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Role> T1 caseISModifyRole(ISModifyRole<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Modify Provided Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Modify Provided Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISModifyProvidedRole(ISModifyProvidedRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Modify Required Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Modify Required Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISModifyRequiredRole(ISModifyRequiredRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Modify Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Modify Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISModifyInterface(ISModifyInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IS Modify Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IS Modify Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseISModifySignature(ISModifySignature object) {
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

} //ISModificationmarksSwitch
