/**
 */
package de.uka.ipd.sdq.componentInternalDependencies;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage
 * @generated
 */
public interface ComponentInternalDependenciesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentInternalDependenciesFactory eINSTANCE = de.uka.ipd.sdq.componentInternalDependencies.impl.ComponentInternalDependenciesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Internal Dependency Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Internal Dependency Repository</em>'.
	 * @generated
	 */
	ComponentInternalDependencyRepository createComponentInternalDependencyRepository();

	/**
	 * Returns a new object of class '<em>Role To Role Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role To Role Dependency</em>'.
	 * @generated
	 */
	RoleToRoleDependency createRoleToRoleDependency();

	/**
	 * Returns a new object of class '<em>Operation To Operation Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation To Operation Dependency</em>'.
	 * @generated
	 */
	OperationToOperationDependency createOperationToOperationDependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentInternalDependenciesPackage getComponentInternalDependenciesPackage();

} //ComponentInternalDependenciesFactory
