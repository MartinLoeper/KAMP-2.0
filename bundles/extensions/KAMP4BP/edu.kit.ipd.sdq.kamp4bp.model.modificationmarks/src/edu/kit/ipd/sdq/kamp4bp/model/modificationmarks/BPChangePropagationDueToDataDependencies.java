/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BP Change Propagation Due To Data Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies#getDataObjectModifications <em>Data Object Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies#getActorStepModifications <em>Actor Step Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies#getEntryLevelSystemCallModifications <em>Entry Level System Call Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage#getBPChangePropagationDueToDataDependencies()
 * @model
 * @generated
 */
public interface BPChangePropagationDueToDataDependencies extends ISChangePropagationDueToDataDependencies {
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
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage#getBPChangePropagationDueToDataDependencies_DataObjectModifications()
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
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage#getBPChangePropagationDueToDataDependencies_ActorStepModifications()
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
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage#getBPChangePropagationDueToDataDependencies_EntryLevelSystemCallModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPModifyEntryLevelSystemCall> getEntryLevelSystemCallModifications();

} // BPChangePropagationDueToDataDependencies
