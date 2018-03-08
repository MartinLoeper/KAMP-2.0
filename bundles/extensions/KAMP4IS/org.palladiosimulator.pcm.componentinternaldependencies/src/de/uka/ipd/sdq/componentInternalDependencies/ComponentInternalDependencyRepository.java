/**
 */
package de.uka.ipd.sdq.componentInternalDependencies;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Internal Dependency Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage#getComponentInternalDependencyRepository()
 * @model
 * @generated
 */
public interface ComponentInternalDependencyRepository extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage#getComponentInternalDependencyRepository_Dependencies()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RoleToRoleDependency> getDependencies();

} // ComponentInternalDependencyRepository
