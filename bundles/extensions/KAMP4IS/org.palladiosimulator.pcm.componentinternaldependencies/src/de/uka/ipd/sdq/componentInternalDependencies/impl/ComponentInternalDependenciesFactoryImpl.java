/**
 */
package de.uka.ipd.sdq.componentInternalDependencies.impl;

import de.uka.ipd.sdq.componentInternalDependencies.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInternalDependenciesFactoryImpl extends EFactoryImpl implements ComponentInternalDependenciesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentInternalDependenciesFactory init() {
		try {
			ComponentInternalDependenciesFactory theComponentInternalDependenciesFactory = (ComponentInternalDependenciesFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentInternalDependenciesPackage.eNS_URI);
			if (theComponentInternalDependenciesFactory != null) {
				return theComponentInternalDependenciesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentInternalDependenciesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInternalDependenciesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComponentInternalDependenciesPackage.COMPONENT_INTERNAL_DEPENDENCY_REPOSITORY: return createComponentInternalDependencyRepository();
			case ComponentInternalDependenciesPackage.ROLE_TO_ROLE_DEPENDENCY: return createRoleToRoleDependency();
			case ComponentInternalDependenciesPackage.OPERATION_TO_OPERATION_DEPENDENCY: return createOperationToOperationDependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInternalDependencyRepository createComponentInternalDependencyRepository() {
		ComponentInternalDependencyRepositoryImpl componentInternalDependencyRepository = new ComponentInternalDependencyRepositoryImpl();
		return componentInternalDependencyRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleToRoleDependency createRoleToRoleDependency() {
		RoleToRoleDependencyImpl roleToRoleDependency = new RoleToRoleDependencyImpl();
		return roleToRoleDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationToOperationDependency createOperationToOperationDependency() {
		OperationToOperationDependencyImpl operationToOperationDependency = new OperationToOperationDependencyImpl();
		return operationToOperationDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInternalDependenciesPackage getComponentInternalDependenciesPackage() {
		return (ComponentInternalDependenciesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentInternalDependenciesPackage getPackage() {
		return ComponentInternalDependenciesPackage.eINSTANCE;
	}

} //ComponentInternalDependenciesFactoryImpl
