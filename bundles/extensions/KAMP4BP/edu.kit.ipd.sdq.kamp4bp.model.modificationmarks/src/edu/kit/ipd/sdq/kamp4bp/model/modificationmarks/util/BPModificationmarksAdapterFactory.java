/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.util;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.*;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyEntity;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage
 * @generated
 */
public class BPModificationmarksAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BPModificationmarksPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPModificationmarksAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BPModificationmarksPackage.eINSTANCE;
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
	protected BPModificationmarksSwitch<Adapter> modelSwitch =
		new BPModificationmarksSwitch<Adapter>() {
			@Override
			public Adapter caseBPModificationRepository(BPModificationRepository object) {
				return createBPModificationRepositoryAdapter();
			}
			@Override
			public Adapter caseBPSeedModifications(BPSeedModifications object) {
				return createBPSeedModificationsAdapter();
			}
			@Override
			public Adapter caseBPChangePropagationDueToDataDependencies(BPChangePropagationDueToDataDependencies object) {
				return createBPChangePropagationDueToDataDependenciesAdapter();
			}
			@Override
			public Adapter caseBPInterBusinessProcessPropagation(BPInterBusinessProcessPropagation object) {
				return createBPInterBusinessProcessPropagationAdapter();
			}
			@Override
			public Adapter caseBPModifyDataObject(BPModifyDataObject object) {
				return createBPModifyDataObjectAdapter();
			}
			@Override
			public <T extends AbstractUserAction> Adapter caseBPModifyAbstractUserAction(BPModifyAbstractUserAction<T> object) {
				return createBPModifyAbstractUserActionAdapter();
			}
			@Override
			public Adapter caseBPModifyAcquireDeviceResourceAction(BPModifyAcquireDeviceResourceAction object) {
				return createBPModifyAcquireDeviceResourceActionAdapter();
			}
			@Override
			public Adapter caseBPModifyReleaseDeviceResourceAction(BPModifyReleaseDeviceResourceAction object) {
				return createBPModifyReleaseDeviceResourceActionAdapter();
			}
			@Override
			public Adapter caseBPModifyActorStep(BPModifyActorStep object) {
				return createBPModifyActorStepAdapter();
			}
			@Override
			public Adapter caseBPModifyEntryLevelSystemCall(BPModifyEntryLevelSystemCall object) {
				return createBPModifyEntryLevelSystemCallAdapter();
			}
			@Override
			public Adapter caseBPModifyDeviceResource(BPModifyDeviceResource object) {
				return createBPModifyDeviceResourceAdapter();
			}
			@Override
			public Adapter caseBPModifyRole(BPModifyRole object) {
				return createBPModifyRoleAdapter();
			}
			@Override
			public <S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> Adapter caseAbstractModificationRepository(AbstractModificationRepository<S, T> object) {
				return createAbstractModificationRepositoryAdapter();
			}
			@Override
			public <T extends ISSeedModifications> Adapter caseAbstractISModificationRepository(AbstractISModificationRepository<T> object) {
				return createAbstractISModificationRepositoryAdapter();
			}
			@Override
			public Adapter caseAbstractSeedModifications(AbstractSeedModifications object) {
				return createAbstractSeedModificationsAdapter();
			}
			@Override
			public Adapter caseISSeedModifications(ISSeedModifications object) {
				return createISSeedModificationsAdapter();
			}
			@Override
			public Adapter caseAbstractChangePropagationStep(AbstractChangePropagationStep object) {
				return createAbstractChangePropagationStepAdapter();
			}
			@Override
			public Adapter caseChangePropagationStep(ChangePropagationStep object) {
				return createChangePropagationStepAdapter();
			}
			@Override
			public Adapter caseISChangePropagationDueToDataDependencies(ISChangePropagationDueToDataDependencies object) {
				return createISChangePropagationDueToDataDependenciesAdapter();
			}
			@Override
			public <S, T> Adapter caseAbstractModification(AbstractModification<S, T> object) {
				return createAbstractModificationAdapter();
			}
			@Override
			public <T extends Entity> Adapter caseISModifyEntity(ISModifyEntity<T> object) {
				return createISModifyEntityAdapter();
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
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationRepository <em>BP Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationRepository
	 * @generated
	 */
	public Adapter createBPModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications <em>BP Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications
	 * @generated
	 */
	public Adapter createBPSeedModificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies <em>BP Change Propagation Due To Data Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies
	 * @generated
	 */
	public Adapter createBPChangePropagationDueToDataDependenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPInterBusinessProcessPropagation <em>BP Inter Business Process Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPInterBusinessProcessPropagation
	 * @generated
	 */
	public Adapter createBPInterBusinessProcessPropagationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyDataObject <em>BP Modify Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyDataObject
	 * @generated
	 */
	public Adapter createBPModifyDataObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAbstractUserAction <em>BP Modify Abstract User Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAbstractUserAction
	 * @generated
	 */
	public Adapter createBPModifyAbstractUserActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAcquireDeviceResourceAction <em>BP Modify Acquire Device Resource Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAcquireDeviceResourceAction
	 * @generated
	 */
	public Adapter createBPModifyAcquireDeviceResourceActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyReleaseDeviceResourceAction <em>BP Modify Release Device Resource Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyReleaseDeviceResourceAction
	 * @generated
	 */
	public Adapter createBPModifyReleaseDeviceResourceActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyActorStep <em>BP Modify Actor Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyActorStep
	 * @generated
	 */
	public Adapter createBPModifyActorStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyEntryLevelSystemCall <em>BP Modify Entry Level System Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyEntryLevelSystemCall
	 * @generated
	 */
	public Adapter createBPModifyEntryLevelSystemCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyDeviceResource <em>BP Modify Device Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyDeviceResource
	 * @generated
	 */
	public Adapter createBPModifyDeviceResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyRole <em>BP Modify Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyRole
	 * @generated
	 */
	public Adapter createBPModifyRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository <em>Abstract Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository
	 * @generated
	 */
	public Adapter createAbstractModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository <em>Abstract IS Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository
	 * @generated
	 */
	public Adapter createAbstractISModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications <em>Abstract Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications
	 * @generated
	 */
	public Adapter createAbstractSeedModificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications <em>IS Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications
	 * @generated
	 */
	public Adapter createISSeedModificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep <em>Abstract Change Propagation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep
	 * @generated
	 */
	public Adapter createAbstractChangePropagationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep <em>Change Propagation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep
	 * @generated
	 */
	public Adapter createChangePropagationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies <em>IS Change Propagation Due To Data Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies
	 * @generated
	 */
	public Adapter createISChangePropagationDueToDataDependenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification <em>Abstract Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification
	 * @generated
	 */
	public Adapter createAbstractModificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyEntity <em>IS Modify Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyEntity
	 * @generated
	 */
	public Adapter createISModifyEntityAdapter() {
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

} //BPModificationmarksAdapterFactory
