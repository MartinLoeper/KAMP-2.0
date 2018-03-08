/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToInterfaceDependencies;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntercomponentPropagation;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntracomponentPropagation;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationRepository;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyConnector;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyEntity;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyInterface;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyProvidedRole;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRequiredRole;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRole;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ISModificationmarksPackageImpl extends EPackageImpl implements ISModificationmarksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractISModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isSeedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isChangePropagationDueToDataDependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isChangePropagationDueToInterfaceDependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isIntercomponentPropagationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isIntracomponentPropagationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isModifyDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isModifyEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isModifyComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isModifyConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isModifyRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isModifyProvidedRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isModifyRequiredRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isModifyInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isModifySignatureEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ISModificationmarksPackageImpl() {
		super(eNS_URI, ISModificationmarksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ISModificationmarksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ISModificationmarksPackage init() {
		if (isInited) return (ISModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ISModificationmarksPackage.eNS_URI);

		// Obtain or create and register package
		ISModificationmarksPackageImpl theISModificationmarksPackage = (ISModificationmarksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ISModificationmarksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ISModificationmarksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModificationmarksPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theISModificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		theISModificationmarksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theISModificationmarksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ISModificationmarksPackage.eNS_URI, theISModificationmarksPackage);
		return theISModificationmarksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractISModificationRepository() {
		return abstractISModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISModificationRepository() {
		return isModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISSeedModifications() {
		return isSeedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISSeedModifications_DataTypeModifications() {
		return (EReference)isSeedModificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISSeedModifications_SignatureModifications() {
		return (EReference)isSeedModificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISSeedModifications_InterfaceModifications() {
		return (EReference)isSeedModificationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISSeedModifications_ComponentModifications() {
		return (EReference)isSeedModificationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISChangePropagationDueToDataDependencies() {
		return isChangePropagationDueToDataDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISChangePropagationDueToDataDependencies_InterfaceModifications() {
		return (EReference)isChangePropagationDueToDataDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISChangePropagationDueToDataDependencies_DatatypeModifications() {
		return (EReference)isChangePropagationDueToDataDependenciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISChangePropagationDueToInterfaceDependencies() {
		return isChangePropagationDueToInterfaceDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISChangePropagationDueToInterfaceDependencies_ComponentModifications() {
		return (EReference)isChangePropagationDueToInterfaceDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISChangePropagationDueToInterfaceDependencies_SignatureModifications() {
		return (EReference)isChangePropagationDueToInterfaceDependenciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISIntercomponentPropagation() {
		return isIntercomponentPropagationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISIntercomponentPropagation_ConnectorModifications() {
		return (EReference)isIntercomponentPropagationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISIntracomponentPropagation() {
		return isIntracomponentPropagationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISIntracomponentPropagation_ComponentModifications() {
		return (EReference)isIntracomponentPropagationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISModifyDataType() {
		return isModifyDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISModifyEntity() {
		return isModifyEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISModifyComponent() {
		return isModifyComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISModifyComponent_ProvidedRoleModifications() {
		return (EReference)isModifyComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISModifyComponent_RequiredRoleModifications() {
		return (EReference)isModifyComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISModifyConnector() {
		return isModifyConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISModifyRole() {
		return isModifyRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISModifyRole_SignatureModifications() {
		return (EReference)isModifyRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISModifyProvidedRole() {
		return isModifyProvidedRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISModifyRequiredRole() {
		return isModifyRequiredRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISModifyInterface() {
		return isModifyInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISModifyInterface_SignatureModifications() {
		return (EReference)isModifyInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISModifySignature() {
		return isModifySignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISModificationmarksFactory getISModificationmarksFactory() {
		return (ISModificationmarksFactory)getEFactoryInstance();
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
		abstractISModificationRepositoryEClass = createEClass(ABSTRACT_IS_MODIFICATION_REPOSITORY);

		isModificationRepositoryEClass = createEClass(IS_MODIFICATION_REPOSITORY);

		isSeedModificationsEClass = createEClass(IS_SEED_MODIFICATIONS);
		createEReference(isSeedModificationsEClass, IS_SEED_MODIFICATIONS__DATA_TYPE_MODIFICATIONS);
		createEReference(isSeedModificationsEClass, IS_SEED_MODIFICATIONS__SIGNATURE_MODIFICATIONS);
		createEReference(isSeedModificationsEClass, IS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS);
		createEReference(isSeedModificationsEClass, IS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS);

		isChangePropagationDueToDataDependenciesEClass = createEClass(IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES);
		createEReference(isChangePropagationDueToDataDependenciesEClass, IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__INTERFACE_MODIFICATIONS);
		createEReference(isChangePropagationDueToDataDependenciesEClass, IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATATYPE_MODIFICATIONS);

		isChangePropagationDueToInterfaceDependenciesEClass = createEClass(IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES);
		createEReference(isChangePropagationDueToInterfaceDependenciesEClass, IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__COMPONENT_MODIFICATIONS);
		createEReference(isChangePropagationDueToInterfaceDependenciesEClass, IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES__SIGNATURE_MODIFICATIONS);

		isIntercomponentPropagationEClass = createEClass(IS_INTERCOMPONENT_PROPAGATION);
		createEReference(isIntercomponentPropagationEClass, IS_INTERCOMPONENT_PROPAGATION__CONNECTOR_MODIFICATIONS);

		isIntracomponentPropagationEClass = createEClass(IS_INTRACOMPONENT_PROPAGATION);
		createEReference(isIntracomponentPropagationEClass, IS_INTRACOMPONENT_PROPAGATION__COMPONENT_MODIFICATIONS);

		isModifyDataTypeEClass = createEClass(IS_MODIFY_DATA_TYPE);

		isModifyEntityEClass = createEClass(IS_MODIFY_ENTITY);

		isModifyComponentEClass = createEClass(IS_MODIFY_COMPONENT);
		createEReference(isModifyComponentEClass, IS_MODIFY_COMPONENT__PROVIDED_ROLE_MODIFICATIONS);
		createEReference(isModifyComponentEClass, IS_MODIFY_COMPONENT__REQUIRED_ROLE_MODIFICATIONS);

		isModifyConnectorEClass = createEClass(IS_MODIFY_CONNECTOR);

		isModifyRoleEClass = createEClass(IS_MODIFY_ROLE);
		createEReference(isModifyRoleEClass, IS_MODIFY_ROLE__SIGNATURE_MODIFICATIONS);

		isModifyProvidedRoleEClass = createEClass(IS_MODIFY_PROVIDED_ROLE);

		isModifyRequiredRoleEClass = createEClass(IS_MODIFY_REQUIRED_ROLE);

		isModifyInterfaceEClass = createEClass(IS_MODIFY_INTERFACE);
		createEReference(isModifyInterfaceEClass, IS_MODIFY_INTERFACE__SIGNATURE_MODIFICATIONS);

		isModifySignatureEClass = createEClass(IS_MODIFY_SIGNATURE);
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
		ModificationmarksPackage theModificationmarksPackage = (ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ModificationmarksPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);

		// Create type parameters
		ETypeParameter abstractISModificationRepositoryEClass_T = addETypeParameter(abstractISModificationRepositoryEClass, "T");
		ETypeParameter isModifyEntityEClass_T = addETypeParameter(isModifyEntityEClass, "T");
		ETypeParameter isModifyRoleEClass_T = addETypeParameter(isModifyRoleEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getISSeedModifications());
		abstractISModificationRepositoryEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theEntityPackage.getEntity());
		isModifyEntityEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theRepositoryPackage.getRole());
		isModifyRoleEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModificationRepository());
		EGenericType g2 = createEGenericType(abstractISModificationRepositoryEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theModificationmarksPackage.getChangePropagationStep());
		g1.getETypeArguments().add(g2);
		abstractISModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractISModificationRepository());
		g2 = createEGenericType(this.getISSeedModifications());
		g1.getETypeArguments().add(g2);
		isModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		isSeedModificationsEClass.getESuperTypes().add(theModificationmarksPackage.getAbstractSeedModifications());
		isChangePropagationDueToDataDependenciesEClass.getESuperTypes().add(theModificationmarksPackage.getChangePropagationStep());
		isChangePropagationDueToInterfaceDependenciesEClass.getESuperTypes().add(theModificationmarksPackage.getChangePropagationStep());
		isIntercomponentPropagationEClass.getESuperTypes().add(theModificationmarksPackage.getChangePropagationStep());
		isIntracomponentPropagationEClass.getESuperTypes().add(theModificationmarksPackage.getChangePropagationStep());
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModification());
		g2 = createEGenericType(theRepositoryPackage.getDataType());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		isModifyDataTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModification());
		g2 = createEGenericType(isModifyEntityEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		isModifyEntityEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getISModifyEntity());
		g2 = createEGenericType(theRepositoryPackage.getRepositoryComponent());
		g1.getETypeArguments().add(g2);
		isModifyComponentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getISModifyEntity());
		g2 = createEGenericType(theCompositionPackage.getConnector());
		g1.getETypeArguments().add(g2);
		isModifyConnectorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getISModifyEntity());
		g2 = createEGenericType(isModifyRoleEClass_T);
		g1.getETypeArguments().add(g2);
		isModifyRoleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getISModifyRole());
		g2 = createEGenericType(theRepositoryPackage.getProvidedRole());
		g1.getETypeArguments().add(g2);
		isModifyProvidedRoleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getISModifyRole());
		g2 = createEGenericType(theRepositoryPackage.getRequiredRole());
		g1.getETypeArguments().add(g2);
		isModifyRequiredRoleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getISModifyEntity());
		g2 = createEGenericType(theRepositoryPackage.getInterface());
		g1.getETypeArguments().add(g2);
		isModifyInterfaceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getISModifyEntity());
		g2 = createEGenericType(theRepositoryPackage.getSignature());
		g1.getETypeArguments().add(g2);
		isModifySignatureEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractISModificationRepositoryEClass, AbstractISModificationRepository.class, "AbstractISModificationRepository", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isModificationRepositoryEClass, ISModificationRepository.class, "ISModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isSeedModificationsEClass, ISSeedModifications.class, "ISSeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISSeedModifications_DataTypeModifications(), this.getISModifyDataType(), null, "dataTypeModifications", null, 0, -1, ISSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISSeedModifications_SignatureModifications(), this.getISModifySignature(), null, "signatureModifications", null, 0, -1, ISSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISSeedModifications_InterfaceModifications(), this.getISModifyInterface(), null, "interfaceModifications", null, 0, -1, ISSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISSeedModifications_ComponentModifications(), this.getISModifyComponent(), null, "componentModifications", null, 0, -1, ISSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isChangePropagationDueToDataDependenciesEClass, ISChangePropagationDueToDataDependencies.class, "ISChangePropagationDueToDataDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISChangePropagationDueToDataDependencies_InterfaceModifications(), this.getISModifyInterface(), null, "interfaceModifications", null, 0, -1, ISChangePropagationDueToDataDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISChangePropagationDueToDataDependencies_DatatypeModifications(), this.getISModifyDataType(), null, "datatypeModifications", null, 0, -1, ISChangePropagationDueToDataDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isChangePropagationDueToInterfaceDependenciesEClass, ISChangePropagationDueToInterfaceDependencies.class, "ISChangePropagationDueToInterfaceDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISChangePropagationDueToInterfaceDependencies_ComponentModifications(), this.getISModifyComponent(), null, "componentModifications", null, 0, -1, ISChangePropagationDueToInterfaceDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISChangePropagationDueToInterfaceDependencies_SignatureModifications(), this.getISModifySignature(), null, "signatureModifications", null, 0, -1, ISChangePropagationDueToInterfaceDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isIntercomponentPropagationEClass, ISIntercomponentPropagation.class, "ISIntercomponentPropagation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISIntercomponentPropagation_ConnectorModifications(), this.getISModifyConnector(), null, "connectorModifications", null, 1, -1, ISIntercomponentPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isIntracomponentPropagationEClass, ISIntracomponentPropagation.class, "ISIntracomponentPropagation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISIntracomponentPropagation_ComponentModifications(), this.getISModifyComponent(), null, "componentModifications", null, 1, -1, ISIntracomponentPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isModifyDataTypeEClass, ISModifyDataType.class, "ISModifyDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isModifyEntityEClass, ISModifyEntity.class, "ISModifyEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isModifyComponentEClass, ISModifyComponent.class, "ISModifyComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISModifyComponent_ProvidedRoleModifications(), this.getISModifyProvidedRole(), null, "providedRoleModifications", null, 0, -1, ISModifyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISModifyComponent_RequiredRoleModifications(), this.getISModifyRequiredRole(), null, "requiredRoleModifications", null, 0, -1, ISModifyComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isModifyConnectorEClass, ISModifyConnector.class, "ISModifyConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isModifyRoleEClass, ISModifyRole.class, "ISModifyRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISModifyRole_SignatureModifications(), this.getISModifySignature(), null, "signatureModifications", null, 0, -1, ISModifyRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isModifyProvidedRoleEClass, ISModifyProvidedRole.class, "ISModifyProvidedRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isModifyRequiredRoleEClass, ISModifyRequiredRole.class, "ISModifyRequiredRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isModifyInterfaceEClass, ISModifyInterface.class, "ISModifyInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISModifyInterface_SignatureModifications(), this.getISModifySignature(), null, "signatureModifications", null, 0, -1, ISModifyInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isModifySignatureEClass, ISModifySignature.class, "ISModifySignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ISModificationmarksPackageImpl
