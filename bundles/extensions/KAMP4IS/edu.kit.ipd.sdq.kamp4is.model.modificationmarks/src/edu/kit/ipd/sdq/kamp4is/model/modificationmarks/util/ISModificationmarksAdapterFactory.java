/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.util;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.repository.Role;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage
 * @generated
 */
public class ISModificationmarksAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ISModificationmarksPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISModificationmarksAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ISModificationmarksPackage.eINSTANCE;
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
	protected ISModificationmarksSwitch<Adapter> modelSwitch =
		new ISModificationmarksSwitch<Adapter>() {
			@Override
			public <T extends ISSeedModifications> Adapter caseAbstractISModificationRepository(AbstractISModificationRepository<T> object) {
				return createAbstractISModificationRepositoryAdapter();
			}
			@Override
			public Adapter caseISModificationRepository(ISModificationRepository object) {
				return createISModificationRepositoryAdapter();
			}
			@Override
			public Adapter caseISSeedModifications(ISSeedModifications object) {
				return createISSeedModificationsAdapter();
			}
			@Override
			public Adapter caseISChangePropagationDueToDataDependencies(ISChangePropagationDueToDataDependencies object) {
				return createISChangePropagationDueToDataDependenciesAdapter();
			}
			@Override
			public Adapter caseISChangePropagationDueToInterfaceDependencies(ISChangePropagationDueToInterfaceDependencies object) {
				return createISChangePropagationDueToInterfaceDependenciesAdapter();
			}
			@Override
			public Adapter caseISIntercomponentPropagation(ISIntercomponentPropagation object) {
				return createISIntercomponentPropagationAdapter();
			}
			@Override
			public Adapter caseISIntracomponentPropagation(ISIntracomponentPropagation object) {
				return createISIntracomponentPropagationAdapter();
			}
			@Override
			public Adapter caseISModifyDataType(ISModifyDataType object) {
				return createISModifyDataTypeAdapter();
			}
			@Override
			public <T extends Entity> Adapter caseISModifyEntity(ISModifyEntity<T> object) {
				return createISModifyEntityAdapter();
			}
			@Override
			public Adapter caseISModifyComponent(ISModifyComponent object) {
				return createISModifyComponentAdapter();
			}
			@Override
			public Adapter caseISModifyConnector(ISModifyConnector object) {
				return createISModifyConnectorAdapter();
			}
			@Override
			public <T extends Role> Adapter caseISModifyRole(ISModifyRole<T> object) {
				return createISModifyRoleAdapter();
			}
			@Override
			public Adapter caseISModifyProvidedRole(ISModifyProvidedRole object) {
				return createISModifyProvidedRoleAdapter();
			}
			@Override
			public Adapter caseISModifyRequiredRole(ISModifyRequiredRole object) {
				return createISModifyRequiredRoleAdapter();
			}
			@Override
			public Adapter caseISModifyInterface(ISModifyInterface object) {
				return createISModifyInterfaceAdapter();
			}
			@Override
			public Adapter caseISModifySignature(ISModifySignature object) {
				return createISModifySignatureAdapter();
			}
			@Override
			public <S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> Adapter caseAbstractModificationRepository(AbstractModificationRepository<S, T> object) {
				return createAbstractModificationRepositoryAdapter();
			}
			@Override
			public Adapter caseAbstractSeedModifications(AbstractSeedModifications object) {
				return createAbstractSeedModificationsAdapter();
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
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationRepository <em>IS Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationRepository
	 * @generated
	 */
	public Adapter createISModificationRepositoryAdapter() {
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
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToInterfaceDependencies <em>IS Change Propagation Due To Interface Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToInterfaceDependencies
	 * @generated
	 */
	public Adapter createISChangePropagationDueToInterfaceDependenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntercomponentPropagation <em>IS Intercomponent Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntercomponentPropagation
	 * @generated
	 */
	public Adapter createISIntercomponentPropagationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntracomponentPropagation <em>IS Intracomponent Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntracomponentPropagation
	 * @generated
	 */
	public Adapter createISIntracomponentPropagationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType <em>IS Modify Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType
	 * @generated
	 */
	public Adapter createISModifyDataTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent <em>IS Modify Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent
	 * @generated
	 */
	public Adapter createISModifyComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyConnector <em>IS Modify Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyConnector
	 * @generated
	 */
	public Adapter createISModifyConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRole <em>IS Modify Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRole
	 * @generated
	 */
	public Adapter createISModifyRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyProvidedRole <em>IS Modify Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyProvidedRole
	 * @generated
	 */
	public Adapter createISModifyProvidedRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRequiredRole <em>IS Modify Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRequiredRole
	 * @generated
	 */
	public Adapter createISModifyRequiredRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyInterface <em>IS Modify Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyInterface
	 * @generated
	 */
	public Adapter createISModifyInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature <em>IS Modify Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature
	 * @generated
	 */
	public Adapter createISModifySignatureAdapter() {
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

} //ISModificationmarksAdapterFactory
