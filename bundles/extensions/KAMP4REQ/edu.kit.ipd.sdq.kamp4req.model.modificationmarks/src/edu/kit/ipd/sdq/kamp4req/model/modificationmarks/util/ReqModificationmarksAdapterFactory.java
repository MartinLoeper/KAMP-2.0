/**
 */
package edu.kit.ipd.sdq.kamp4req.model.modificationmarks.util;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyEntity;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications;

import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

import relations.TraceableObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage
 * @generated
 */
public class ReqModificationmarksAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReqModificationmarksPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqModificationmarksAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReqModificationmarksPackage.eINSTANCE;
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
	protected ReqModificationmarksSwitch<Adapter> modelSwitch =
		new ReqModificationmarksSwitch<Adapter>() {
			@Override
			public Adapter caseReqModificationRepository(ReqModificationRepository object) {
				return createReqModificationRepositoryAdapter();
			}
			@Override
			public Adapter caseReqSeedModifications(ReqSeedModifications object) {
				return createReqSeedModificationsAdapter();
			}
			@Override
			public Adapter caseReqChangePropagationDueToSpecificationDependencies(ReqChangePropagationDueToSpecificationDependencies object) {
				return createReqChangePropagationDueToSpecificationDependenciesAdapter();
			}
			@Override
			public Adapter caseReqModifyEntity(ReqModifyEntity object) {
				return createReqModifyEntityAdapter();
			}
			@Override
			public <T extends TraceableObject> Adapter caseReqModifyTraceableObject(ReqModifyTraceableObject<T> object) {
				return createReqModifyTraceableObjectAdapter();
			}
			@Override
			public Adapter caseReqModifyRequirement(ReqModifyRequirement object) {
				return createReqModifyRequirementAdapter();
			}
			@Override
			public Adapter caseReqModifyDecision(ReqModifyDecision object) {
				return createReqModifyDecisionAdapter();
			}
			@Override
			public Adapter caseReqModifyOption(ReqModifyOption object) {
				return createReqModifyOptionAdapter();
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
			public Adapter caseBPSeedModifications(BPSeedModifications object) {
				return createBPSeedModificationsAdapter();
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
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationRepository <em>Req Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationRepository
	 * @generated
	 */
	public Adapter createReqModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications <em>Req Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications
	 * @generated
	 */
	public Adapter createReqSeedModificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies <em>Req Change Propagation Due To Specification Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies
	 * @generated
	 */
	public Adapter createReqChangePropagationDueToSpecificationDependenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyEntity <em>Req Modify Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyEntity
	 * @generated
	 */
	public Adapter createReqModifyEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyTraceableObject <em>Req Modify Traceable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyTraceableObject
	 * @generated
	 */
	public Adapter createReqModifyTraceableObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyRequirement <em>Req Modify Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyRequirement
	 * @generated
	 */
	public Adapter createReqModifyRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyDecision <em>Req Modify Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyDecision
	 * @generated
	 */
	public Adapter createReqModifyDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyOption <em>Req Modify Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyOption
	 * @generated
	 */
	public Adapter createReqModifyOptionAdapter() {
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

} //ReqModificationmarksAdapterFactory
