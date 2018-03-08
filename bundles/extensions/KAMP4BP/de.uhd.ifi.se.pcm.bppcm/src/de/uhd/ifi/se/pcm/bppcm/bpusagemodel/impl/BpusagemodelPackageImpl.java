/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.Activity;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelFactory;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessWorkload;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ReleaseDeviceResourceAction;

import de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage;

import de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DatamodelPackageImpl;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.impl.OrganizationenvironmentmodelPackageImpl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.CorePackage;

import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpusagemodelPackageImpl extends EPackageImpl implements BpusagemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processWorkloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processTriggerPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acquireDeviceResourceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseDeviceResourceActionEClass = null;

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
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BpusagemodelPackageImpl() {
		super(eNS_URI, BpusagemodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BpusagemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BpusagemodelPackage init() {
		if (isInited) return (BpusagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(BpusagemodelPackage.eNS_URI);

		// Obtain or create and register package
		BpusagemodelPackageImpl theBpusagemodelPackage = (BpusagemodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BpusagemodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BpusagemodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OrganizationenvironmentmodelPackageImpl theOrganizationenvironmentmodelPackage = (OrganizationenvironmentmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OrganizationenvironmentmodelPackage.eNS_URI) instanceof OrganizationenvironmentmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OrganizationenvironmentmodelPackage.eNS_URI) : OrganizationenvironmentmodelPackage.eINSTANCE);
		DatamodelPackageImpl theDatamodelPackage = (DatamodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatamodelPackage.eNS_URI) instanceof DatamodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatamodelPackage.eNS_URI) : DatamodelPackage.eINSTANCE);

		// Create package meta-data objects
		theBpusagemodelPackage.createPackageContents();
		theOrganizationenvironmentmodelPackage.createPackageContents();
		theDatamodelPackage.createPackageContents();

		// Initialize created meta-data
		theBpusagemodelPackage.initializePackageContents();
		theOrganizationenvironmentmodelPackage.initializePackageContents();
		theDatamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBpusagemodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BpusagemodelPackage.eNS_URI, theBpusagemodelPackage);
		return theBpusagemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorStep() {
		return actorStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorStep_ProcessingTime() {
		return (EReference)actorStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActorStep_RestingTime() {
		return (EAttribute)actorStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorStep_ResponsibleRole() {
		return (EReference)actorStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActorStep_ContinuouslyPerformed() {
		return (EAttribute)actorStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActorStep_Interruptable() {
		return (EAttribute)actorStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorStep_OutputDataObjects() {
		return (EReference)actorStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorStep_InputDataObjects() {
		return (EReference)actorStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Scenario() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessWorkload() {
		return processWorkloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessWorkload_ProcessTriggerPeriods() {
		return (EReference)processWorkloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessTriggerPeriod() {
		return processTriggerPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessTriggerPeriod_InterArrivalTime_ProcessWorkload() {
		return (EReference)processTriggerPeriodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessTriggerPeriod_PeriodStartTimePoint() {
		return (EAttribute)processTriggerPeriodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessTriggerPeriod_PeriodEndTimePoint() {
		return (EAttribute)processTriggerPeriodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcquireDeviceResourceAction() {
		return acquireDeviceResourceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcquireDeviceResourceAction_Passiveresource_AcquireAction() {
		return (EReference)acquireDeviceResourceActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcquireDeviceResourceAction_Timeout() {
		return (EAttribute)acquireDeviceResourceActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcquireDeviceResourceAction_TimeoutValue() {
		return (EAttribute)acquireDeviceResourceActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseDeviceResourceAction() {
		return releaseDeviceResourceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseDeviceResourceAction_Passiveresource_ReleaseAction() {
		return (EReference)releaseDeviceResourceActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpusagemodelFactory getBpusagemodelFactory() {
		return (BpusagemodelFactory)getEFactoryInstance();
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
		actorStepEClass = createEClass(ACTOR_STEP);
		createEReference(actorStepEClass, ACTOR_STEP__PROCESSING_TIME);
		createEAttribute(actorStepEClass, ACTOR_STEP__RESTING_TIME);
		createEReference(actorStepEClass, ACTOR_STEP__RESPONSIBLE_ROLE);
		createEAttribute(actorStepEClass, ACTOR_STEP__CONTINUOUSLY_PERFORMED);
		createEAttribute(actorStepEClass, ACTOR_STEP__INTERRUPTABLE);
		createEReference(actorStepEClass, ACTOR_STEP__OUTPUT_DATA_OBJECTS);
		createEReference(actorStepEClass, ACTOR_STEP__INPUT_DATA_OBJECTS);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__SCENARIO);

		processWorkloadEClass = createEClass(PROCESS_WORKLOAD);
		createEReference(processWorkloadEClass, PROCESS_WORKLOAD__PROCESS_TRIGGER_PERIODS);

		processTriggerPeriodEClass = createEClass(PROCESS_TRIGGER_PERIOD);
		createEReference(processTriggerPeriodEClass, PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD);
		createEAttribute(processTriggerPeriodEClass, PROCESS_TRIGGER_PERIOD__PERIOD_START_TIME_POINT);
		createEAttribute(processTriggerPeriodEClass, PROCESS_TRIGGER_PERIOD__PERIOD_END_TIME_POINT);

		acquireDeviceResourceActionEClass = createEClass(ACQUIRE_DEVICE_RESOURCE_ACTION);
		createEReference(acquireDeviceResourceActionEClass, ACQUIRE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION);
		createEAttribute(acquireDeviceResourceActionEClass, ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT);
		createEAttribute(acquireDeviceResourceActionEClass, ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT_VALUE);

		releaseDeviceResourceActionEClass = createEClass(RELEASE_DEVICE_RESOURCE_ACTION);
		createEReference(releaseDeviceResourceActionEClass, RELEASE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_RELEASE_ACTION);
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
		UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		OrganizationenvironmentmodelPackage theOrganizationenvironmentmodelPackage = (OrganizationenvironmentmodelPackage)EPackage.Registry.INSTANCE.getEPackage(OrganizationenvironmentmodelPackage.eNS_URI);
		DatamodelPackage theDatamodelPackage = (DatamodelPackage)EPackage.Registry.INSTANCE.getEPackage(DatamodelPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actorStepEClass.getESuperTypes().add(theUsagemodelPackage.getAbstractUserAction());
		activityEClass.getESuperTypes().add(theUsagemodelPackage.getAbstractUserAction());
		processWorkloadEClass.getESuperTypes().add(theUsagemodelPackage.getOpenWorkload());
		processTriggerPeriodEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		acquireDeviceResourceActionEClass.getESuperTypes().add(theUsagemodelPackage.getAbstractUserAction());
		releaseDeviceResourceActionEClass.getESuperTypes().add(theUsagemodelPackage.getAbstractUserAction());

		// Initialize classes and features; add operations and parameters
		initEClass(actorStepEClass, ActorStep.class, "ActorStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorStep_ProcessingTime(), theCorePackage.getPCMRandomVariable(), null, "processingTime", null, 0, 1, ActorStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActorStep_RestingTime(), ecorePackage.getEDouble(), "restingTime", null, 0, 1, ActorStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActorStep_ResponsibleRole(), theOrganizationenvironmentmodelPackage.getRole(), null, "responsibleRole", null, 0, 1, ActorStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActorStep_ContinuouslyPerformed(), ecorePackage.getEBoolean(), "continuouslyPerformed", null, 0, 1, ActorStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActorStep_Interruptable(), ecorePackage.getEBoolean(), "interruptable", "false", 0, 1, ActorStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(theDatamodelPackage.getDataObject());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getActorStep_OutputDataObjects(), g1, null, "outputDataObjects", null, 0, -1, ActorStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theDatamodelPackage.getDataObject());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getActorStep_InputDataObjects(), g1, null, "inputDataObjects", null, 0, -1, ActorStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Scenario(), theUsagemodelPackage.getScenarioBehaviour(), null, "scenario", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processWorkloadEClass, ProcessWorkload.class, "ProcessWorkload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessWorkload_ProcessTriggerPeriods(), this.getProcessTriggerPeriod(), null, "processTriggerPeriods", null, 1, -1, ProcessWorkload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processTriggerPeriodEClass, ProcessTriggerPeriod.class, "ProcessTriggerPeriod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessTriggerPeriod_InterArrivalTime_ProcessWorkload(), theCorePackage.getPCMRandomVariable(), null, "interArrivalTime_ProcessWorkload", null, 1, 1, ProcessTriggerPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessTriggerPeriod_PeriodStartTimePoint(), ecorePackage.getEDouble(), "periodStartTimePoint", null, 0, 1, ProcessTriggerPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessTriggerPeriod_PeriodEndTimePoint(), ecorePackage.getEDouble(), "periodEndTimePoint", null, 0, 1, ProcessTriggerPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acquireDeviceResourceActionEClass, AcquireDeviceResourceAction.class, "AcquireDeviceResourceAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcquireDeviceResourceAction_Passiveresource_AcquireAction(), theOrganizationenvironmentmodelPackage.getDeviceResource(), null, "passiveresource_AcquireAction", null, 1, 1, AcquireDeviceResourceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcquireDeviceResourceAction_Timeout(), ecorePackage.getEBoolean(), "timeout", null, 1, 1, AcquireDeviceResourceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcquireDeviceResourceAction_TimeoutValue(), ecorePackage.getEDouble(), "timeoutValue", null, 1, 1, AcquireDeviceResourceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseDeviceResourceActionEClass, ReleaseDeviceResourceAction.class, "ReleaseDeviceResourceAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReleaseDeviceResourceAction_Passiveresource_ReleaseAction(), theOrganizationenvironmentmodelPackage.getDeviceResource(), null, "passiveresource_ReleaseAction", null, 1, 1, ReleaseDeviceResourceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BpusagemodelPackageImpl
