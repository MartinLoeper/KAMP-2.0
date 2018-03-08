/**
 */
package de.uka.ipd.sdq.componentInternalDependencies;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import identifier='../../../plugin/de.uka.ipd.sdq.identifier/model/identifier.ecore#/' repository='../../../plugin/org.palladiosimulator.pcm/model/pcm.ecore#//repository'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ComponentInternalDependenciesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentInternalDependencies";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/ComponentInternalDependencies/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentInternalDependencies";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentInternalDependenciesPackage eINSTANCE = de.uka.ipd.sdq.componentInternalDependencies.impl.ComponentInternalDependenciesPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.componentInternalDependencies.impl.ComponentInternalDependencyRepositoryImpl <em>Component Internal Dependency Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.componentInternalDependencies.impl.ComponentInternalDependencyRepositoryImpl
	 * @see de.uka.ipd.sdq.componentInternalDependencies.impl.ComponentInternalDependenciesPackageImpl#getComponentInternalDependencyRepository()
	 * @generated
	 */
	int COMPONENT_INTERNAL_DEPENDENCY_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERNAL_DEPENDENCY_REPOSITORY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERNAL_DEPENDENCY_REPOSITORY__DEPENDENCIES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Internal Dependency Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERNAL_DEPENDENCY_REPOSITORY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.componentInternalDependencies.impl.RoleToRoleDependencyImpl <em>Role To Role Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.componentInternalDependencies.impl.RoleToRoleDependencyImpl
	 * @see de.uka.ipd.sdq.componentInternalDependencies.impl.ComponentInternalDependenciesPackageImpl#getRoleToRoleDependency()
	 * @generated
	 */
	int ROLE_TO_ROLE_DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TO_ROLE_DEPENDENCY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TO_ROLE_DEPENDENCY__PROVIDED_ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TO_ROLE_DEPENDENCY__REQUIRED_ROLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation To Operation Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TO_ROLE_DEPENDENCY__OPERATION_TO_OPERATION_DEPENDENCY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Role To Role Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TO_ROLE_DEPENDENCY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.componentInternalDependencies.impl.OperationToOperationDependencyImpl <em>Operation To Operation Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.componentInternalDependencies.impl.OperationToOperationDependencyImpl
	 * @see de.uka.ipd.sdq.componentInternalDependencies.impl.ComponentInternalDependenciesPackageImpl#getOperationToOperationDependency()
	 * @generated
	 */
	int OPERATION_TO_OPERATION_DEPENDENCY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TO_OPERATION_DEPENDENCY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Provided Signatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TO_OPERATION_DEPENDENCY__PROVIDED_SIGNATURES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Signatures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TO_OPERATION_DEPENDENCY__REQUIRED_SIGNATURES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Role To Role Dependency</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TO_OPERATION_DEPENDENCY__PARENT_ROLE_TO_ROLE_DEPENDENCY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation To Operation Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TO_OPERATION_DEPENDENCY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository <em>Component Internal Dependency Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Internal Dependency Repository</em>'.
	 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository
	 * @generated
	 */
	EClass getComponentInternalDependencyRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository#getDependencies()
	 * @see #getComponentInternalDependencyRepository()
	 * @generated
	 */
	EReference getComponentInternalDependencyRepository_Dependencies();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency <em>Role To Role Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role To Role Dependency</em>'.
	 * @see de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency
	 * @generated
	 */
	EClass getRoleToRoleDependency();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency#getProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Role</em>'.
	 * @see de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency#getProvidedRole()
	 * @see #getRoleToRoleDependency()
	 * @generated
	 */
	EReference getRoleToRoleDependency_ProvidedRole();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency#getRequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Role</em>'.
	 * @see de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency#getRequiredRole()
	 * @see #getRoleToRoleDependency()
	 * @generated
	 */
	EReference getRoleToRoleDependency_RequiredRole();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency#getOperationToOperationDependency <em>Operation To Operation Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation To Operation Dependency</em>'.
	 * @see de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency#getOperationToOperationDependency()
	 * @see #getRoleToRoleDependency()
	 * @generated
	 */
	EReference getRoleToRoleDependency_OperationToOperationDependency();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency <em>Operation To Operation Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation To Operation Dependency</em>'.
	 * @see de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency
	 * @generated
	 */
	EClass getOperationToOperationDependency();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency#getProvidedSignatures <em>Provided Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Signatures</em>'.
	 * @see de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency#getProvidedSignatures()
	 * @see #getOperationToOperationDependency()
	 * @generated
	 */
	EReference getOperationToOperationDependency_ProvidedSignatures();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency#getRequiredSignatures <em>Required Signatures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Signatures</em>'.
	 * @see de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency#getRequiredSignatures()
	 * @see #getOperationToOperationDependency()
	 * @generated
	 */
	EReference getOperationToOperationDependency_RequiredSignatures();

	/**
	 * Returns the meta object for the container reference '{@link de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency#getParentRoleToRoleDependency <em>Parent Role To Role Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Role To Role Dependency</em>'.
	 * @see de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency#getParentRoleToRoleDependency()
	 * @see #getOperationToOperationDependency()
	 * @generated
	 */
	EReference getOperationToOperationDependency_ParentRoleToRoleDependency();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentInternalDependenciesFactory getComponentInternalDependenciesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.componentInternalDependencies.impl.ComponentInternalDependencyRepositoryImpl <em>Component Internal Dependency Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.componentInternalDependencies.impl.ComponentInternalDependencyRepositoryImpl
		 * @see de.uka.ipd.sdq.componentInternalDependencies.impl.ComponentInternalDependenciesPackageImpl#getComponentInternalDependencyRepository()
		 * @generated
		 */
		EClass COMPONENT_INTERNAL_DEPENDENCY_REPOSITORY = eINSTANCE.getComponentInternalDependencyRepository();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERNAL_DEPENDENCY_REPOSITORY__DEPENDENCIES = eINSTANCE.getComponentInternalDependencyRepository_Dependencies();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.componentInternalDependencies.impl.RoleToRoleDependencyImpl <em>Role To Role Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.componentInternalDependencies.impl.RoleToRoleDependencyImpl
		 * @see de.uka.ipd.sdq.componentInternalDependencies.impl.ComponentInternalDependenciesPackageImpl#getRoleToRoleDependency()
		 * @generated
		 */
		EClass ROLE_TO_ROLE_DEPENDENCY = eINSTANCE.getRoleToRoleDependency();

		/**
		 * The meta object literal for the '<em><b>Provided Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TO_ROLE_DEPENDENCY__PROVIDED_ROLE = eINSTANCE.getRoleToRoleDependency_ProvidedRole();

		/**
		 * The meta object literal for the '<em><b>Required Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TO_ROLE_DEPENDENCY__REQUIRED_ROLE = eINSTANCE.getRoleToRoleDependency_RequiredRole();

		/**
		 * The meta object literal for the '<em><b>Operation To Operation Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TO_ROLE_DEPENDENCY__OPERATION_TO_OPERATION_DEPENDENCY = eINSTANCE.getRoleToRoleDependency_OperationToOperationDependency();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.componentInternalDependencies.impl.OperationToOperationDependencyImpl <em>Operation To Operation Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.componentInternalDependencies.impl.OperationToOperationDependencyImpl
		 * @see de.uka.ipd.sdq.componentInternalDependencies.impl.ComponentInternalDependenciesPackageImpl#getOperationToOperationDependency()
		 * @generated
		 */
		EClass OPERATION_TO_OPERATION_DEPENDENCY = eINSTANCE.getOperationToOperationDependency();

		/**
		 * The meta object literal for the '<em><b>Provided Signatures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TO_OPERATION_DEPENDENCY__PROVIDED_SIGNATURES = eINSTANCE.getOperationToOperationDependency_ProvidedSignatures();

		/**
		 * The meta object literal for the '<em><b>Required Signatures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TO_OPERATION_DEPENDENCY__REQUIRED_SIGNATURES = eINSTANCE.getOperationToOperationDependency_RequiredSignatures();

		/**
		 * The meta object literal for the '<em><b>Parent Role To Role Dependency</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_TO_OPERATION_DEPENDENCY__PARENT_ROLE_TO_ROLE_DEPENDENCY = eINSTANCE.getOperationToOperationDependency_ParentRoleToRoleDependency();

	}

} //ComponentInternalDependenciesPackage
