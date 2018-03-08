/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

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
 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelFactory
 * @model kind="package"
 * @generated
 */
public interface BpusagemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bpusagemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/PalladioComponentModel/5.1/bp/bpUsageModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bpusagemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BpusagemodelPackage eINSTANCE = de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ActorStepImpl <em>Actor Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ActorStepImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelPackageImpl#getActorStep()
	 * @generated
	 */
	int ACTOR_STEP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP__ID = UsagemodelPackage.ABSTRACT_USER_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP__ENTITY_NAME = UsagemodelPackage.ABSTRACT_USER_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP__SUCCESSOR = UsagemodelPackage.ABSTRACT_USER_ACTION__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP__PREDECESSOR = UsagemodelPackage.ABSTRACT_USER_ACTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Scenario Behaviour Abstract User Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION = UsagemodelPackage.ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION;

	/**
	 * The feature id for the '<em><b>Processing Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP__PROCESSING_TIME = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resting Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP__RESTING_TIME = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP__RESPONSIBLE_ROLE = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Continuously Performed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP__CONTINUOUSLY_PERFORMED = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interruptable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP__INTERRUPTABLE = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output Data Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP__OUTPUT_DATA_OBJECTS = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Input Data Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP__INPUT_DATA_OBJECTS = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Actor Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_STEP_FEATURE_COUNT = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ActivityImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ID = UsagemodelPackage.ABSTRACT_USER_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ENTITY_NAME = UsagemodelPackage.ABSTRACT_USER_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SUCCESSOR = UsagemodelPackage.ABSTRACT_USER_ACTION__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PREDECESSOR = UsagemodelPackage.ABSTRACT_USER_ACTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Scenario Behaviour Abstract User Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION = UsagemodelPackage.ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SCENARIO = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ProcessWorkloadImpl <em>Process Workload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ProcessWorkloadImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelPackageImpl#getProcessWorkload()
	 * @generated
	 */
	int PROCESS_WORKLOAD = 2;

	/**
	 * The feature id for the '<em><b>Usage Scenario Workload</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_WORKLOAD__USAGE_SCENARIO_WORKLOAD = UsagemodelPackage.OPEN_WORKLOAD__USAGE_SCENARIO_WORKLOAD;

	/**
	 * The feature id for the '<em><b>Inter Arrival Time Open Workload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_WORKLOAD__INTER_ARRIVAL_TIME_OPEN_WORKLOAD = UsagemodelPackage.OPEN_WORKLOAD__INTER_ARRIVAL_TIME_OPEN_WORKLOAD;

	/**
	 * The feature id for the '<em><b>Process Trigger Periods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_WORKLOAD__PROCESS_TRIGGER_PERIODS = UsagemodelPackage.OPEN_WORKLOAD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Workload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_WORKLOAD_FEATURE_COUNT = UsagemodelPackage.OPEN_WORKLOAD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ProcessTriggerPeriodImpl <em>Process Trigger Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ProcessTriggerPeriodImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelPackageImpl#getProcessTriggerPeriod()
	 * @generated
	 */
	int PROCESS_TRIGGER_PERIOD = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TRIGGER_PERIOD__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Inter Arrival Time Process Workload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period Start Time Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TRIGGER_PERIOD__PERIOD_START_TIME_POINT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period End Time Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TRIGGER_PERIOD__PERIOD_END_TIME_POINT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Process Trigger Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_TRIGGER_PERIOD_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.AcquireDeviceResourceActionImpl <em>Acquire Device Resource Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.AcquireDeviceResourceActionImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelPackageImpl#getAcquireDeviceResourceAction()
	 * @generated
	 */
	int ACQUIRE_DEVICE_RESOURCE_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_DEVICE_RESOURCE_ACTION__ID = UsagemodelPackage.ABSTRACT_USER_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_DEVICE_RESOURCE_ACTION__ENTITY_NAME = UsagemodelPackage.ABSTRACT_USER_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_DEVICE_RESOURCE_ACTION__SUCCESSOR = UsagemodelPackage.ABSTRACT_USER_ACTION__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_DEVICE_RESOURCE_ACTION__PREDECESSOR = UsagemodelPackage.ABSTRACT_USER_ACTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Scenario Behaviour Abstract User Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_DEVICE_RESOURCE_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION = UsagemodelPackage.ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION;

	/**
	 * The feature id for the '<em><b>Passiveresource Acquire Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timeout Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT_VALUE = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Acquire Device Resource Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_DEVICE_RESOURCE_ACTION_FEATURE_COUNT = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ReleaseDeviceResourceActionImpl <em>Release Device Resource Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ReleaseDeviceResourceActionImpl
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelPackageImpl#getReleaseDeviceResourceAction()
	 * @generated
	 */
	int RELEASE_DEVICE_RESOURCE_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_DEVICE_RESOURCE_ACTION__ID = UsagemodelPackage.ABSTRACT_USER_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_DEVICE_RESOURCE_ACTION__ENTITY_NAME = UsagemodelPackage.ABSTRACT_USER_ACTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_DEVICE_RESOURCE_ACTION__SUCCESSOR = UsagemodelPackage.ABSTRACT_USER_ACTION__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_DEVICE_RESOURCE_ACTION__PREDECESSOR = UsagemodelPackage.ABSTRACT_USER_ACTION__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Scenario Behaviour Abstract User Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_DEVICE_RESOURCE_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION = UsagemodelPackage.ABSTRACT_USER_ACTION__SCENARIO_BEHAVIOUR_ABSTRACT_USER_ACTION;

	/**
	 * The feature id for the '<em><b>Passiveresource Release Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_RELEASE_ACTION = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Release Device Resource Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_DEVICE_RESOURCE_ACTION_FEATURE_COUNT = UsagemodelPackage.ABSTRACT_USER_ACTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep <em>Actor Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Step</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep
	 * @generated
	 */
	EClass getActorStep();

	/**
	 * Returns the meta object for the containment reference '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getProcessingTime <em>Processing Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processing Time</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getProcessingTime()
	 * @see #getActorStep()
	 * @generated
	 */
	EReference getActorStep_ProcessingTime();

	/**
	 * Returns the meta object for the attribute '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getRestingTime <em>Resting Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resting Time</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getRestingTime()
	 * @see #getActorStep()
	 * @generated
	 */
	EAttribute getActorStep_RestingTime();

	/**
	 * Returns the meta object for the reference '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible Role</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getResponsibleRole()
	 * @see #getActorStep()
	 * @generated
	 */
	EReference getActorStep_ResponsibleRole();

	/**
	 * Returns the meta object for the attribute '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#isContinuouslyPerformed <em>Continuously Performed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continuously Performed</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#isContinuouslyPerformed()
	 * @see #getActorStep()
	 * @generated
	 */
	EAttribute getActorStep_ContinuouslyPerformed();

	/**
	 * Returns the meta object for the attribute '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#isInterruptable <em>Interruptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interruptable</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#isInterruptable()
	 * @see #getActorStep()
	 * @generated
	 */
	EAttribute getActorStep_Interruptable();

	/**
	 * Returns the meta object for the reference list '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getOutputDataObjects <em>Output Data Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Data Objects</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getOutputDataObjects()
	 * @see #getActorStep()
	 * @generated
	 */
	EReference getActorStep_OutputDataObjects();

	/**
	 * Returns the meta object for the reference list '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getInputDataObjects <em>Input Data Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Data Objects</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep#getInputDataObjects()
	 * @see #getActorStep()
	 * @generated
	 */
	EReference getActorStep_InputDataObjects();

	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.Activity#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenario</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.Activity#getScenario()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Scenario();

	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessWorkload <em>Process Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Workload</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessWorkload
	 * @generated
	 */
	EClass getProcessWorkload();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessWorkload#getProcessTriggerPeriods <em>Process Trigger Periods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Trigger Periods</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessWorkload#getProcessTriggerPeriods()
	 * @see #getProcessWorkload()
	 * @generated
	 */
	EReference getProcessWorkload_ProcessTriggerPeriods();

	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod <em>Process Trigger Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Trigger Period</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod
	 * @generated
	 */
	EClass getProcessTriggerPeriod();

	/**
	 * Returns the meta object for the containment reference '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod#getInterArrivalTime_ProcessWorkload <em>Inter Arrival Time Process Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inter Arrival Time Process Workload</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod#getInterArrivalTime_ProcessWorkload()
	 * @see #getProcessTriggerPeriod()
	 * @generated
	 */
	EReference getProcessTriggerPeriod_InterArrivalTime_ProcessWorkload();

	/**
	 * Returns the meta object for the attribute '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod#getPeriodStartTimePoint <em>Period Start Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period Start Time Point</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod#getPeriodStartTimePoint()
	 * @see #getProcessTriggerPeriod()
	 * @generated
	 */
	EAttribute getProcessTriggerPeriod_PeriodStartTimePoint();

	/**
	 * Returns the meta object for the attribute '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod#getPeriodEndTimePoint <em>Period End Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period End Time Point</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod#getPeriodEndTimePoint()
	 * @see #getProcessTriggerPeriod()
	 * @generated
	 */
	EAttribute getProcessTriggerPeriod_PeriodEndTimePoint();

	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction <em>Acquire Device Resource Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acquire Device Resource Action</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction
	 * @generated
	 */
	EClass getAcquireDeviceResourceAction();

	/**
	 * Returns the meta object for the reference '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction#getPassiveresource_AcquireAction <em>Passiveresource Acquire Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passiveresource Acquire Action</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction#getPassiveresource_AcquireAction()
	 * @see #getAcquireDeviceResourceAction()
	 * @generated
	 */
	EReference getAcquireDeviceResourceAction_Passiveresource_AcquireAction();

	/**
	 * Returns the meta object for the attribute '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction#isTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction#isTimeout()
	 * @see #getAcquireDeviceResourceAction()
	 * @generated
	 */
	EAttribute getAcquireDeviceResourceAction_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction#getTimeoutValue <em>Timeout Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout Value</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction#getTimeoutValue()
	 * @see #getAcquireDeviceResourceAction()
	 * @generated
	 */
	EAttribute getAcquireDeviceResourceAction_TimeoutValue();

	/**
	 * Returns the meta object for class '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ReleaseDeviceResourceAction <em>Release Device Resource Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Device Resource Action</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ReleaseDeviceResourceAction
	 * @generated
	 */
	EClass getReleaseDeviceResourceAction();

	/**
	 * Returns the meta object for the reference '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ReleaseDeviceResourceAction#getPassiveresource_ReleaseAction <em>Passiveresource Release Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passiveresource Release Action</em>'.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ReleaseDeviceResourceAction#getPassiveresource_ReleaseAction()
	 * @see #getReleaseDeviceResourceAction()
	 * @generated
	 */
	EReference getReleaseDeviceResourceAction_Passiveresource_ReleaseAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BpusagemodelFactory getBpusagemodelFactory();

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
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ActorStepImpl <em>Actor Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ActorStepImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelPackageImpl#getActorStep()
		 * @generated
		 */
		EClass ACTOR_STEP = eINSTANCE.getActorStep();

		/**
		 * The meta object literal for the '<em><b>Processing Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_STEP__PROCESSING_TIME = eINSTANCE.getActorStep_ProcessingTime();

		/**
		 * The meta object literal for the '<em><b>Resting Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_STEP__RESTING_TIME = eINSTANCE.getActorStep_RestingTime();

		/**
		 * The meta object literal for the '<em><b>Responsible Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_STEP__RESPONSIBLE_ROLE = eINSTANCE.getActorStep_ResponsibleRole();

		/**
		 * The meta object literal for the '<em><b>Continuously Performed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_STEP__CONTINUOUSLY_PERFORMED = eINSTANCE.getActorStep_ContinuouslyPerformed();

		/**
		 * The meta object literal for the '<em><b>Interruptable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_STEP__INTERRUPTABLE = eINSTANCE.getActorStep_Interruptable();

		/**
		 * The meta object literal for the '<em><b>Output Data Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_STEP__OUTPUT_DATA_OBJECTS = eINSTANCE.getActorStep_OutputDataObjects();

		/**
		 * The meta object literal for the '<em><b>Input Data Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_STEP__INPUT_DATA_OBJECTS = eINSTANCE.getActorStep_InputDataObjects();

		/**
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ActivityImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SCENARIO = eINSTANCE.getActivity_Scenario();

		/**
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ProcessWorkloadImpl <em>Process Workload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ProcessWorkloadImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelPackageImpl#getProcessWorkload()
		 * @generated
		 */
		EClass PROCESS_WORKLOAD = eINSTANCE.getProcessWorkload();

		/**
		 * The meta object literal for the '<em><b>Process Trigger Periods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_WORKLOAD__PROCESS_TRIGGER_PERIODS = eINSTANCE.getProcessWorkload_ProcessTriggerPeriods();

		/**
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ProcessTriggerPeriodImpl <em>Process Trigger Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ProcessTriggerPeriodImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelPackageImpl#getProcessTriggerPeriod()
		 * @generated
		 */
		EClass PROCESS_TRIGGER_PERIOD = eINSTANCE.getProcessTriggerPeriod();

		/**
		 * The meta object literal for the '<em><b>Inter Arrival Time Process Workload</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD = eINSTANCE.getProcessTriggerPeriod_InterArrivalTime_ProcessWorkload();

		/**
		 * The meta object literal for the '<em><b>Period Start Time Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_TRIGGER_PERIOD__PERIOD_START_TIME_POINT = eINSTANCE.getProcessTriggerPeriod_PeriodStartTimePoint();

		/**
		 * The meta object literal for the '<em><b>Period End Time Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_TRIGGER_PERIOD__PERIOD_END_TIME_POINT = eINSTANCE.getProcessTriggerPeriod_PeriodEndTimePoint();

		/**
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.AcquireDeviceResourceActionImpl <em>Acquire Device Resource Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.AcquireDeviceResourceActionImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelPackageImpl#getAcquireDeviceResourceAction()
		 * @generated
		 */
		EClass ACQUIRE_DEVICE_RESOURCE_ACTION = eINSTANCE.getAcquireDeviceResourceAction();

		/**
		 * The meta object literal for the '<em><b>Passiveresource Acquire Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACQUIRE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION = eINSTANCE.getAcquireDeviceResourceAction_Passiveresource_AcquireAction();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT = eINSTANCE.getAcquireDeviceResourceAction_Timeout();

		/**
		 * The meta object literal for the '<em><b>Timeout Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT_VALUE = eINSTANCE.getAcquireDeviceResourceAction_TimeoutValue();

		/**
		 * The meta object literal for the '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ReleaseDeviceResourceActionImpl <em>Release Device Resource Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ReleaseDeviceResourceActionImpl
		 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.BpusagemodelPackageImpl#getReleaseDeviceResourceAction()
		 * @generated
		 */
		EClass RELEASE_DEVICE_RESOURCE_ACTION = eINSTANCE.getReleaseDeviceResourceAction();

		/**
		 * The meta object literal for the '<em><b>Passiveresource Release Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_RELEASE_ACTION = eINSTANCE.getReleaseDeviceResourceAction_Passiveresource_ReleaseAction();

	}

} //BpusagemodelPackage
