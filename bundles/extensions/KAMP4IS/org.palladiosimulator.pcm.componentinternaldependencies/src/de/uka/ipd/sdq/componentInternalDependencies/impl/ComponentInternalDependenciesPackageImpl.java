/**
 */
package de.uka.ipd.sdq.componentInternalDependencies.impl;

import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesFactory;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;
import de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency;
import de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency;

import de.uka.ipd.sdq.componentInternalDependencies.util.ComponentInternalDependenciesValidator;
import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInternalDependenciesPackageImpl extends EPackageImpl implements ComponentInternalDependenciesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInternalDependencyRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleToRoleDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationToOperationDependencyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentInternalDependenciesPackageImpl() {
		super(eNS_URI, ComponentInternalDependenciesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ComponentInternalDependenciesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentInternalDependenciesPackage init() {
		if (isInited) return (ComponentInternalDependenciesPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentInternalDependenciesPackage.eNS_URI);

		// Obtain or create and register package
		ComponentInternalDependenciesPackageImpl theComponentInternalDependenciesPackage = (ComponentInternalDependenciesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentInternalDependenciesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentInternalDependenciesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentInternalDependenciesPackage.createPackageContents();

		// Initialize created meta-data
		theComponentInternalDependenciesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theComponentInternalDependenciesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ComponentInternalDependenciesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theComponentInternalDependenciesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentInternalDependenciesPackage.eNS_URI, theComponentInternalDependenciesPackage);
		return theComponentInternalDependenciesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInternalDependencyRepository() {
		return componentInternalDependencyRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInternalDependencyRepository_Dependencies() {
		return (EReference)componentInternalDependencyRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleToRoleDependency() {
		return roleToRoleDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleToRoleDependency_ProvidedRole() {
		return (EReference)roleToRoleDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleToRoleDependency_RequiredRole() {
		return (EReference)roleToRoleDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleToRoleDependency_OperationToOperationDependency() {
		return (EReference)roleToRoleDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationToOperationDependency() {
		return operationToOperationDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationToOperationDependency_ProvidedSignatures() {
		return (EReference)operationToOperationDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationToOperationDependency_RequiredSignatures() {
		return (EReference)operationToOperationDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationToOperationDependency_ParentRoleToRoleDependency() {
		return (EReference)operationToOperationDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInternalDependenciesFactory getComponentInternalDependenciesFactory() {
		return (ComponentInternalDependenciesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentInternalDependencyRepositoryEClass = createEClass(COMPONENT_INTERNAL_DEPENDENCY_REPOSITORY);
		createEReference(componentInternalDependencyRepositoryEClass, COMPONENT_INTERNAL_DEPENDENCY_REPOSITORY__DEPENDENCIES);

		roleToRoleDependencyEClass = createEClass(ROLE_TO_ROLE_DEPENDENCY);
		createEReference(roleToRoleDependencyEClass, ROLE_TO_ROLE_DEPENDENCY__PROVIDED_ROLE);
		createEReference(roleToRoleDependencyEClass, ROLE_TO_ROLE_DEPENDENCY__REQUIRED_ROLE);
		createEReference(roleToRoleDependencyEClass, ROLE_TO_ROLE_DEPENDENCY__OPERATION_TO_OPERATION_DEPENDENCY);

		operationToOperationDependencyEClass = createEClass(OPERATION_TO_OPERATION_DEPENDENCY);
		createEReference(operationToOperationDependencyEClass, OPERATION_TO_OPERATION_DEPENDENCY__PROVIDED_SIGNATURES);
		createEReference(operationToOperationDependencyEClass, OPERATION_TO_OPERATION_DEPENDENCY__REQUIRED_SIGNATURES);
		createEReference(operationToOperationDependencyEClass, OPERATION_TO_OPERATION_DEPENDENCY__PARENT_ROLE_TO_ROLE_DEPENDENCY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentInternalDependencyRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		roleToRoleDependencyEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		operationToOperationDependencyEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(componentInternalDependencyRepositoryEClass, ComponentInternalDependencyRepository.class, "ComponentInternalDependencyRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInternalDependencyRepository_Dependencies(), this.getRoleToRoleDependency(), null, "dependencies", null, 0, -1, ComponentInternalDependencyRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roleToRoleDependencyEClass, RoleToRoleDependency.class, "RoleToRoleDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleToRoleDependency_ProvidedRole(), theRepositoryPackage.getProvidedRole(), null, "providedRole", null, 0, 1, RoleToRoleDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleToRoleDependency_RequiredRole(), theRepositoryPackage.getRequiredRole(), null, "requiredRole", null, 0, 1, RoleToRoleDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleToRoleDependency_OperationToOperationDependency(), this.getOperationToOperationDependency(), this.getOperationToOperationDependency_ParentRoleToRoleDependency(), "operationToOperationDependency", null, 0, -1, RoleToRoleDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationToOperationDependencyEClass, OperationToOperationDependency.class, "OperationToOperationDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationToOperationDependency_ProvidedSignatures(), theRepositoryPackage.getSignature(), null, "providedSignatures", null, 0, -1, OperationToOperationDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperationToOperationDependency_RequiredSignatures(), theRepositoryPackage.getSignature(), null, "requiredSignatures", null, 0, -1, OperationToOperationDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperationToOperationDependency_ParentRoleToRoleDependency(), this.getRoleToRoleDependency(), this.getRoleToRoleDependency_OperationToOperationDependency(), "parentRoleToRoleDependency", null, 1, 1, OperationToOperationDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "identifier", "../../../plugin/de.uka.ipd.sdq.identifier/model/identifier.ecore#/",
			 "repository", "../../../plugin/org.palladiosimulator.pcm/model/pcm.ecore#//repository"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (roleToRoleDependencyEClass, 
		   source, 
		   new String[] {
			 "constraints", "ProvidedRoleAndRequiredRoleBelongToSameComponent"
		   });	
		addAnnotation
		  (operationToOperationDependencyEClass, 
		   source, 
		   new String[] {
			 "constraints", "ProvidedSignaturesBelongToProvidedRole RequiredSignaturesBelongToRequiredRole"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (roleToRoleDependencyEClass, 
		   source, 
		   new String[] {
			 "ProvidedRoleAndRequiredRoleBelongToSameComponent", "\n\t\t\tself.providedRole.providingEntity_ProvidedRole = self.requiredRole.requiringEntity_RequiredRole"
		   });	
		addAnnotation
		  (operationToOperationDependencyEClass, 
		   source, 
		   new String[] {
			 "ProvidedSignaturesBelongToProvidedRole", "\n\t\tself.providedSignatures->forAll(signature|\n\t\t\tif (self.parentRoleToRoleDependency.providedRole.oclIsKindOf(pcm::repository::OperationProvidedRole))\n\t\t\t  then (self.parentRoleToRoleDependency.providedRole.oclAsType((pcm::repository::OperationProvidedRole)).\n\t\t\t\tprovidedInterface__OperationProvidedRole.signatures__OperationInterface->includes(signature))\n\t\t\t  else (true) endif\n\t\t)",
			 "RequiredSignaturesBelongToRequiredRole", "\n\t\tself.requiredSignatures->forAll(signature|\n\t\t\tif (self.parentRoleToRoleDependency.requiredRole.oclIsKindOf(pcm::repository::OperationRequiredRole))\n\t\t\t  then (self.parentRoleToRoleDependency.requiredRole.oclAsType((pcm::repository::OperationRequiredRole)).\n\t\t\t\trequiredInterface__OperationRequiredRole.signatures__OperationInterface->includes(signature))\n\t\t\t  else (true) endif\n\t\t)"
		   });
	}

} //ComponentInternalDependenciesPackageImpl
