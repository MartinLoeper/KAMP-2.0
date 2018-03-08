/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.*;

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
public class BpusagemodelFactoryImpl extends EFactoryImpl implements BpusagemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BpusagemodelFactory init() {
		try {
			BpusagemodelFactory theBpusagemodelFactory = (BpusagemodelFactory)EPackage.Registry.INSTANCE.getEFactory(BpusagemodelPackage.eNS_URI);
			if (theBpusagemodelFactory != null) {
				return theBpusagemodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BpusagemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpusagemodelFactoryImpl() {
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
			case BpusagemodelPackage.ACTOR_STEP: return createActorStep();
			case BpusagemodelPackage.ACTIVITY: return createActivity();
			case BpusagemodelPackage.PROCESS_WORKLOAD: return createProcessWorkload();
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD: return createProcessTriggerPeriod();
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION: return createAcquireDeviceResourceAction();
			case BpusagemodelPackage.RELEASE_DEVICE_RESOURCE_ACTION: return createReleaseDeviceResourceAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorStep createActorStep() {
		ActorStepImpl actorStep = new ActorStepImpl();
		return actorStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessWorkload createProcessWorkload() {
		ProcessWorkloadImpl processWorkload = new ProcessWorkloadImpl();
		return processWorkload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessTriggerPeriod createProcessTriggerPeriod() {
		ProcessTriggerPeriodImpl processTriggerPeriod = new ProcessTriggerPeriodImpl();
		return processTriggerPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquireDeviceResourceAction createAcquireDeviceResourceAction() {
		AcquireDeviceResourceActionImpl acquireDeviceResourceAction = new AcquireDeviceResourceActionImpl();
		return acquireDeviceResourceAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseDeviceResourceAction createReleaseDeviceResourceAction() {
		ReleaseDeviceResourceActionImpl releaseDeviceResourceAction = new ReleaseDeviceResourceActionImpl();
		return releaseDeviceResourceAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpusagemodelPackage getBpusagemodelPackage() {
		return (BpusagemodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BpusagemodelPackage getPackage() {
		return BpusagemodelPackage.eINSTANCE;
	}

} //BpusagemodelFactoryImpl
