/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.util;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.*;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;
import org.palladiosimulator.pcm.usagemodel.OpenWorkload;
import org.palladiosimulator.pcm.usagemodel.Workload;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage
 * @generated
 */
public class BpusagemodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BpusagemodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpusagemodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BpusagemodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BpusagemodelSwitch<Adapter> modelSwitch =
		new BpusagemodelSwitch<Adapter>() {
			@Override
			public Adapter caseActorStep(ActorStep object) {
				return createActorStepAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseProcessWorkload(ProcessWorkload object) {
				return createProcessWorkloadAdapter();
			}
			@Override
			public Adapter caseProcessTriggerPeriod(ProcessTriggerPeriod object) {
				return createProcessTriggerPeriodAdapter();
			}
			@Override
			public Adapter caseAcquireDeviceResourceAction(AcquireDeviceResourceAction object) {
				return createAcquireDeviceResourceActionAdapter();
			}
			@Override
			public Adapter caseReleaseDeviceResourceAction(ReleaseDeviceResourceAction object) {
				return createReleaseDeviceResourceActionAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseAbstractUserAction(AbstractUserAction object) {
				return createAbstractUserActionAdapter();
			}
			@Override
			public Adapter caseWorkload(Workload object) {
				return createWorkloadAdapter();
			}
			@Override
			public Adapter caseOpenWorkload(OpenWorkload object) {
				return createOpenWorkloadAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep <em>Actor Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep
	 * @generated
	 */
	public Adapter createActorStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessWorkload <em>Process Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessWorkload
	 * @generated
	 */
	public Adapter createProcessWorkloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod <em>Process Trigger Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod
	 * @generated
	 */
	public Adapter createProcessTriggerPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction <em>Acquire Device Resource Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction
	 * @generated
	 */
	public Adapter createAcquireDeviceResourceActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ReleaseDeviceResourceAction <em>Release Device Resource Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ReleaseDeviceResourceAction
	 * @generated
	 */
	public Adapter createReleaseDeviceResourceActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.entity.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.entity.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.usagemodel.AbstractUserAction <em>Abstract User Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.usagemodel.AbstractUserAction
	 * @generated
	 */
	public Adapter createAbstractUserActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.usagemodel.Workload <em>Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.usagemodel.Workload
	 * @generated
	 */
	public Adapter createWorkloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.usagemodel.OpenWorkload <em>Open Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.usagemodel.OpenWorkload
	 * @generated
	 */
	public Adapter createOpenWorkloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BpusagemodelAdapterFactory
