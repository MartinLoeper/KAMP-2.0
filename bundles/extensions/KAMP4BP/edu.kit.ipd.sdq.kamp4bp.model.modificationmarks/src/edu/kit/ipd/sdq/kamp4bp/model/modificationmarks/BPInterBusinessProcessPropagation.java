/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BP Inter Business Process Propagation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPInterBusinessProcessPropagation#getAbstractUserActionModifications <em>Abstract User Action Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage#getBPInterBusinessProcessPropagation()
 * @model
 * @generated
 */
public interface BPInterBusinessProcessPropagation extends ChangePropagationStep {
	/**
	 * Returns the value of the '<em><b>Abstract User Action Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAbstractUserAction}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract User Action Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract User Action Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage#getBPInterBusinessProcessPropagation_AbstractUserActionModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<BPModifyAbstractUserAction<?>> getAbstractUserActionModifications();

} // BPInterBusinessProcessPropagation
