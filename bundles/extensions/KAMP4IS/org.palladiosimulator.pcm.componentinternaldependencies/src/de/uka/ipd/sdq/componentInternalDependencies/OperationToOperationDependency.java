/**
 */
package de.uka.ipd.sdq.componentInternalDependencies;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.repository.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation To Operation Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency#getProvidedSignatures <em>Provided Signatures</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency#getRequiredSignatures <em>Required Signatures</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency#getParentRoleToRoleDependency <em>Parent Role To Role Dependency</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage#getOperationToOperationDependency()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProvidedSignaturesBelongToProvidedRole RequiredSignaturesBelongToRequiredRole'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProvidedSignaturesBelongToProvidedRole='\n\t\tself.providedSignatures->forAll(signature|\n\t\t\tif (self.parentRoleToRoleDependency.providedRole.oclIsKindOf(pcm::repository::OperationProvidedRole))\n\t\t\t  then (self.parentRoleToRoleDependency.providedRole.oclAsType((pcm::repository::OperationProvidedRole)).\n\t\t\t\tprovidedInterface__OperationProvidedRole.signatures__OperationInterface->includes(signature))\n\t\t\t  else (true) endif\n\t\t)' RequiredSignaturesBelongToRequiredRole='\n\t\tself.requiredSignatures->forAll(signature|\n\t\t\tif (self.parentRoleToRoleDependency.requiredRole.oclIsKindOf(pcm::repository::OperationRequiredRole))\n\t\t\t  then (self.parentRoleToRoleDependency.requiredRole.oclAsType((pcm::repository::OperationRequiredRole)).\n\t\t\t\trequiredInterface__OperationRequiredRole.signatures__OperationInterface->includes(signature))\n\t\t\t  else (true) endif\n\t\t)'"
 * @generated
 */
public interface OperationToOperationDependency extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Provided Signatures</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.Signature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Signatures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Signatures</em>' reference list.
	 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage#getOperationToOperationDependency_ProvidedSignatures()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Signature> getProvidedSignatures();

	/**
	 * Returns the value of the '<em><b>Required Signatures</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.Signature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Signatures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Signatures</em>' reference list.
	 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage#getOperationToOperationDependency_RequiredSignatures()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Signature> getRequiredSignatures();

	/**
	 * Returns the value of the '<em><b>Parent Role To Role Dependency</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency#getOperationToOperationDependency <em>Operation To Operation Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Role To Role Dependency</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Role To Role Dependency</em>' container reference.
	 * @see #setParentRoleToRoleDependency(RoleToRoleDependency)
	 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage#getOperationToOperationDependency_ParentRoleToRoleDependency()
	 * @see de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency#getOperationToOperationDependency
	 * @model opposite="operationToOperationDependency" required="true" transient="false"
	 * @generated
	 */
	RoleToRoleDependency getParentRoleToRoleDependency();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency#getParentRoleToRoleDependency <em>Parent Role To Role Dependency</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Role To Role Dependency</em>' container reference.
	 * @see #getParentRoleToRoleDependency()
	 * @generated
	 */
	void setParentRoleToRoleDependency(RoleToRoleDependency value);

} // OperationToOperationDependency
