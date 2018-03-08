/**
 */
package de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelPackageImpl;

import de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage;

import de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DatamodelPackageImpl;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelFactory;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.WorkingPeriod;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.CorePackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganizationenvironmentmodelPackageImpl extends EPackageImpl implements OrganizationenvironmentmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEnvironmentModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workingPeriodEClass = null;

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
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrganizationenvironmentmodelPackageImpl() {
		super(eNS_URI, OrganizationenvironmentmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OrganizationenvironmentmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrganizationenvironmentmodelPackage init() {
		if (isInited) return (OrganizationenvironmentmodelPackage)EPackage.Registry.INSTANCE.getEPackage(OrganizationenvironmentmodelPackage.eNS_URI);

		// Obtain or create and register package
		OrganizationenvironmentmodelPackageImpl theOrganizationenvironmentmodelPackage = (OrganizationenvironmentmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrganizationenvironmentmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrganizationenvironmentmodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BpusagemodelPackageImpl theBpusagemodelPackage = (BpusagemodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BpusagemodelPackage.eNS_URI) instanceof BpusagemodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BpusagemodelPackage.eNS_URI) : BpusagemodelPackage.eINSTANCE);
		DatamodelPackageImpl theDatamodelPackage = (DatamodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatamodelPackage.eNS_URI) instanceof DatamodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatamodelPackage.eNS_URI) : DatamodelPackage.eINSTANCE);

		// Create package meta-data objects
		theOrganizationenvironmentmodelPackage.createPackageContents();
		theBpusagemodelPackage.createPackageContents();
		theDatamodelPackage.createPackageContents();

		// Initialize created meta-data
		theOrganizationenvironmentmodelPackage.initializePackageContents();
		theBpusagemodelPackage.initializePackageContents();
		theDatamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOrganizationenvironmentmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrganizationenvironmentmodelPackage.eNS_URI, theOrganizationenvironmentmodelPackage);
		return theOrganizationenvironmentmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationEnvironmentModel() {
		return organizationEnvironmentModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationEnvironmentModel_Roles() {
		return (EReference)organizationEnvironmentModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationEnvironmentModel_ActorResources() {
		return (EReference)organizationEnvironmentModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationEnvironmentModel_DeviceResources() {
		return (EReference)organizationEnvironmentModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Actors() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorResource() {
		return actorResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorResource_WorkingPeriods() {
		return (EReference)actorResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorResource_Roles() {
		return (EReference)actorResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceResource() {
		return deviceResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceResource_Capacity() {
		return (EReference)deviceResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkingPeriod() {
		return workingPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkingPeriod_PeriodStartTimePoint() {
		return (EAttribute)workingPeriodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkingPeriod_PeriodEndTimePoint() {
		return (EAttribute)workingPeriodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationenvironmentmodelFactory getOrganizationenvironmentmodelFactory() {
		return (OrganizationenvironmentmodelFactory)getEFactoryInstance();
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
		organizationEnvironmentModelEClass = createEClass(ORGANIZATION_ENVIRONMENT_MODEL);
		createEReference(organizationEnvironmentModelEClass, ORGANIZATION_ENVIRONMENT_MODEL__ROLES);
		createEReference(organizationEnvironmentModelEClass, ORGANIZATION_ENVIRONMENT_MODEL__ACTOR_RESOURCES);
		createEReference(organizationEnvironmentModelEClass, ORGANIZATION_ENVIRONMENT_MODEL__DEVICE_RESOURCES);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__ACTORS);

		actorResourceEClass = createEClass(ACTOR_RESOURCE);
		createEReference(actorResourceEClass, ACTOR_RESOURCE__WORKING_PERIODS);
		createEReference(actorResourceEClass, ACTOR_RESOURCE__ROLES);

		deviceResourceEClass = createEClass(DEVICE_RESOURCE);
		createEReference(deviceResourceEClass, DEVICE_RESOURCE__CAPACITY);

		workingPeriodEClass = createEClass(WORKING_PERIOD);
		createEAttribute(workingPeriodEClass, WORKING_PERIOD__PERIOD_START_TIME_POINT);
		createEAttribute(workingPeriodEClass, WORKING_PERIOD__PERIOD_END_TIME_POINT);
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
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		organizationEnvironmentModelEClass.getESuperTypes().add(theEntityPackage.getNamedElement());
		roleEClass.getESuperTypes().add(theEntityPackage.getEntity());
		actorResourceEClass.getESuperTypes().add(theEntityPackage.getEntity());
		deviceResourceEClass.getESuperTypes().add(theEntityPackage.getEntity());
		workingPeriodEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(organizationEnvironmentModelEClass, OrganizationEnvironmentModel.class, "OrganizationEnvironmentModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganizationEnvironmentModel_Roles(), this.getRole(), null, "roles", null, 0, -1, OrganizationEnvironmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationEnvironmentModel_ActorResources(), this.getActorResource(), null, "actorResources", null, 0, -1, OrganizationEnvironmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationEnvironmentModel_DeviceResources(), this.getDeviceResource(), null, "deviceResources", null, 0, -1, OrganizationEnvironmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Actors(), this.getActorResource(), this.getActorResource_Roles(), "actors", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorResourceEClass, ActorResource.class, "ActorResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorResource_WorkingPeriods(), this.getWorkingPeriod(), null, "workingPeriods", null, 1, -1, ActorResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActorResource_Roles(), this.getRole(), this.getRole_Actors(), "roles", null, 1, -1, ActorResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceResourceEClass, DeviceResource.class, "DeviceResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceResource_Capacity(), theCorePackage.getPCMRandomVariable(), null, "capacity", null, 1, 1, DeviceResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workingPeriodEClass, WorkingPeriod.class, "WorkingPeriod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkingPeriod_PeriodStartTimePoint(), ecorePackage.getEDouble(), "periodStartTimePoint", "0.0", 0, 1, WorkingPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkingPeriod_PeriodEndTimePoint(), ecorePackage.getEDouble(), "periodEndTimePoint", "0.0", 0, 1, WorkingPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OrganizationenvironmentmodelPackageImpl
