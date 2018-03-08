/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BP Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications#getDataObjectModifications <em>Data Object Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications#getActorStepModifications <em>Actor Step Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications#getEntryLevelSystemCallModifications <em>Entry Level System Call Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications#getDeviceResourceModifications <em>Device Resource Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications#getRoleModifications <em>Role Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage#getBPSeedModifications()
 * @model
 * @generated
 */
public interface BPSeedModifications extends ISSeedModifications {
	/**
	 * Returns the value of the '<em><b>Data Object Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyDataObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Object Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Object Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage#getBPSeedModifications_DataObjectModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPModifyDataObject> getDataObjectModifications();

	/**
	 * Returns the value of the '<em><b>Actor Step Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyActorStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Step Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Step Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage#getBPSeedModifications_ActorStepModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPModifyActorStep> getActorStepModifications();

	/**
	 * Returns the value of the '<em><b>Entry Level System Call Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyEntryLevelSystemCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Level System Call Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Level System Call Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage#getBPSeedModifications_EntryLevelSystemCallModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPModifyEntryLevelSystemCall> getEntryLevelSystemCallModifications();

	/**
	 * Returns the value of the '<em><b>Device Resource Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyDeviceResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Resource Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Resource Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage#getBPSeedModifications_DeviceResourceModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPModifyDeviceResource> getDeviceResourceModifications();

	/**
	 * Returns the value of the '<em><b>Role Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage#getBPSeedModifications_RoleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPModifyRole> getRoleModifications();

} // BPSeedModifications
