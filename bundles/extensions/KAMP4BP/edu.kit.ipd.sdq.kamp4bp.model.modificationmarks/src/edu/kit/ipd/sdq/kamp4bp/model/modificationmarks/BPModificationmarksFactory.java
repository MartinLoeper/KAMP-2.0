/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks;

import org.eclipse.emf.ecore.EFactory;

import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage
 * @generated
 */
public interface BPModificationmarksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BPModificationmarksFactory eINSTANCE = edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPModificationmarksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BP Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Modification Repository</em>'.
	 * @generated
	 */
	BPModificationRepository createBPModificationRepository();

	/**
	 * Returns a new object of class '<em>BP Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Seed Modifications</em>'.
	 * @generated
	 */
	BPSeedModifications createBPSeedModifications();

	/**
	 * Returns a new object of class '<em>BP Change Propagation Due To Data Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Change Propagation Due To Data Dependencies</em>'.
	 * @generated
	 */
	BPChangePropagationDueToDataDependencies createBPChangePropagationDueToDataDependencies();

	/**
	 * Returns a new object of class '<em>BP Inter Business Process Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Inter Business Process Propagation</em>'.
	 * @generated
	 */
	BPInterBusinessProcessPropagation createBPInterBusinessProcessPropagation();

	/**
	 * Returns a new object of class '<em>BP Modify Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Modify Data Object</em>'.
	 * @generated
	 */
	BPModifyDataObject createBPModifyDataObject();

	/**
	 * Returns a new object of class '<em>BP Modify Abstract User Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Modify Abstract User Action</em>'.
	 * @generated
	 */
	<T extends AbstractUserAction> BPModifyAbstractUserAction<T> createBPModifyAbstractUserAction();

	/**
	 * Returns a new object of class '<em>BP Modify Acquire Device Resource Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Modify Acquire Device Resource Action</em>'.
	 * @generated
	 */
	BPModifyAcquireDeviceResourceAction createBPModifyAcquireDeviceResourceAction();

	/**
	 * Returns a new object of class '<em>BP Modify Release Device Resource Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Modify Release Device Resource Action</em>'.
	 * @generated
	 */
	BPModifyReleaseDeviceResourceAction createBPModifyReleaseDeviceResourceAction();

	/**
	 * Returns a new object of class '<em>BP Modify Actor Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Modify Actor Step</em>'.
	 * @generated
	 */
	BPModifyActorStep createBPModifyActorStep();

	/**
	 * Returns a new object of class '<em>BP Modify Entry Level System Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Modify Entry Level System Call</em>'.
	 * @generated
	 */
	BPModifyEntryLevelSystemCall createBPModifyEntryLevelSystemCall();

	/**
	 * Returns a new object of class '<em>BP Modify Device Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Modify Device Resource</em>'.
	 * @generated
	 */
	BPModifyDeviceResource createBPModifyDeviceResource();

	/**
	 * Returns a new object of class '<em>BP Modify Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BP Modify Role</em>'.
	 * @generated
	 */
	BPModifyRole createBPModifyRole();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BPModificationmarksPackage getBPModificationmarksPackage();

} //BPModificationmarksFactory
