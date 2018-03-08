/**
 */
package de.uka.ipd.sdq.componentInternalDependencies;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role To Role Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency#getRequiredRole <em>Required Role</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency#getOperationToOperationDependency <em>Operation To Operation Dependency</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage#getRoleToRoleDependency()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProvidedRoleAndRequiredRoleBelongToSameComponent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProvidedRoleAndRequiredRoleBelongToSameComponent='\n\t\t\tself.providedRole.providingEntity_ProvidedRole = self.requiredRole.requiringEntity_RequiredRole'"
 * @generated
 */
public interface RoleToRoleDependency extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role</em>' reference.
	 * @see #setProvidedRole(ProvidedRole)
	 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage#getRoleToRoleDependency_ProvidedRole()
	 * @model
	 * @generated
	 */
	ProvidedRole getProvidedRole();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency#getProvidedRole <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role</em>' reference.
	 * @see #getProvidedRole()
	 * @generated
	 */
	void setProvidedRole(ProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role</em>' reference.
	 * @see #setRequiredRole(RequiredRole)
	 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage#getRoleToRoleDependency_RequiredRole()
	 * @model
	 * @generated
	 */
	RequiredRole getRequiredRole();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency#getRequiredRole <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role</em>' reference.
	 * @see #getRequiredRole()
	 * @generated
	 */
	void setRequiredRole(RequiredRole value);

	/**
	 * Returns the value of the '<em><b>Operation To Operation Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency}.
	 * It is bidirectional and its opposite is '{@link de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency#getParentRoleToRoleDependency <em>Parent Role To Role Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation To Operation Dependency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation To Operation Dependency</em>' containment reference list.
	 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage#getRoleToRoleDependency_OperationToOperationDependency()
	 * @see de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency#getParentRoleToRoleDependency
	 * @model opposite="parentRoleToRoleDependency" containment="true" ordered="false"
	 * @generated
	 */
	EList<OperationToOperationDependency> getOperationToOperationDependency();

} // RoleToRoleDependency
