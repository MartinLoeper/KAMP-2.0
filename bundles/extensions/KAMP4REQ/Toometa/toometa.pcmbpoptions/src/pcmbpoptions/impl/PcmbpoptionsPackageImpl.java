/**
 */
package pcmbpoptions.impl;

import archoptions.ArchoptionsPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

import pcmbpoptions.PCM_ChangeEntity;
import pcmbpoptions.PCM_EntityOption;
import pcmbpoptions.PCM_IntroduceNewEntity;
import pcmbpoptions.PCM_RemoveEntity;
import pcmbpoptions.PcmbpoptionsFactory;
import pcmbpoptions.PcmbpoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcmbpoptionsPackageImpl extends EPackageImpl implements PcmbpoptionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_EntityOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_IntroduceNewEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_ChangeEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcM_RemoveEntityEClass = null;

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
	 * @see pcmbpoptions.PcmbpoptionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PcmbpoptionsPackageImpl() {
		super(eNS_URI, PcmbpoptionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PcmbpoptionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PcmbpoptionsPackage init() {
		if (isInited) return (PcmbpoptionsPackage)EPackage.Registry.INSTANCE.getEPackage(PcmbpoptionsPackage.eNS_URI);

		// Obtain or create and register package
		PcmbpoptionsPackageImpl thePcmbpoptionsPackage = (PcmbpoptionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PcmbpoptionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PcmbpoptionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArchoptionsPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePcmbpoptionsPackage.createPackageContents();

		// Initialize created meta-data
		thePcmbpoptionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePcmbpoptionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PcmbpoptionsPackage.eNS_URI, thePcmbpoptionsPackage);
		return thePcmbpoptionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_EntityOption() {
		return pcM_EntityOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_IntroduceNewEntity() {
		return pcM_IntroduceNewEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_IntroduceNewEntity_Entities() {
		return (EReference)pcM_IntroduceNewEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_ChangeEntity() {
		return pcM_ChangeEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_ChangeEntity_OldEntities() {
		return (EReference)pcM_ChangeEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_ChangeEntity_NewEntities() {
		return (EReference)pcM_ChangeEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCM_RemoveEntity() {
		return pcM_RemoveEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCM_RemoveEntity_Entities() {
		return (EReference)pcM_RemoveEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmbpoptionsFactory getPcmbpoptionsFactory() {
		return (PcmbpoptionsFactory)getEFactoryInstance();
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
		pcM_EntityOptionEClass = createEClass(PCM_ENTITY_OPTION);

		pcM_IntroduceNewEntityEClass = createEClass(PCM_INTRODUCE_NEW_ENTITY);
		createEReference(pcM_IntroduceNewEntityEClass, PCM_INTRODUCE_NEW_ENTITY__ENTITIES);

		pcM_ChangeEntityEClass = createEClass(PCM_CHANGE_ENTITY);
		createEReference(pcM_ChangeEntityEClass, PCM_CHANGE_ENTITY__OLD_ENTITIES);
		createEReference(pcM_ChangeEntityEClass, PCM_CHANGE_ENTITY__NEW_ENTITIES);

		pcM_RemoveEntityEClass = createEClass(PCM_REMOVE_ENTITY);
		createEReference(pcM_RemoveEntityEClass, PCM_REMOVE_ENTITY__ENTITIES);
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
		ArchoptionsPackage theArchoptionsPackage = (ArchoptionsPackage)EPackage.Registry.INSTANCE.getEPackage(ArchoptionsPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pcM_EntityOptionEClass.getESuperTypes().add(theArchoptionsPackage.getArchOption());
		pcM_IntroduceNewEntityEClass.getESuperTypes().add(this.getPCM_EntityOption());
		pcM_ChangeEntityEClass.getESuperTypes().add(this.getPCM_EntityOption());
		pcM_RemoveEntityEClass.getESuperTypes().add(this.getPCM_EntityOption());

		// Initialize classes and features; add operations and parameters
		initEClass(pcM_EntityOptionEClass, PCM_EntityOption.class, "PCM_EntityOption", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcM_IntroduceNewEntityEClass, PCM_IntroduceNewEntity.class, "PCM_IntroduceNewEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_IntroduceNewEntity_Entities(), theEntityPackage.getEntity(), null, "entities", null, 0, -1, PCM_IntroduceNewEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_ChangeEntityEClass, PCM_ChangeEntity.class, "PCM_ChangeEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_ChangeEntity_OldEntities(), theEntityPackage.getEntity(), null, "oldEntities", null, 1, -1, PCM_ChangeEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCM_ChangeEntity_NewEntities(), theEntityPackage.getEntity(), null, "newEntities", null, 0, -1, PCM_ChangeEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcM_RemoveEntityEClass, PCM_RemoveEntity.class, "PCM_RemoveEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCM_RemoveEntity_Entities(), theEntityPackage.getEntity(), null, "entities", null, 1, -1, PCM_RemoveEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PcmbpoptionsPackageImpl
