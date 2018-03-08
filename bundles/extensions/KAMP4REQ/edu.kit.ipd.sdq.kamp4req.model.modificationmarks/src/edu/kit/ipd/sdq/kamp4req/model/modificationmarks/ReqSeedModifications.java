/**
 */
package edu.kit.ipd.sdq.kamp4req.model.modificationmarks;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications#getRequirementModifications <em>Requirement Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications#getDecisionModifications <em>Decision Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications#getOptionModifications <em>Option Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage#getReqSeedModifications()
 * @model
 * @generated
 */
public interface ReqSeedModifications extends BPSeedModifications {
	/**
	 * Returns the value of the '<em><b>Requirement Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage#getReqSeedModifications_RequirementModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReqModifyRequirement> getRequirementModifications();

	/**
	 * Returns the value of the '<em><b>Decision Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyDecision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage#getReqSeedModifications_DecisionModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReqModifyDecision> getDecisionModifications();

	/**
	 * Returns the value of the '<em><b>Option Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage#getReqSeedModifications_OptionModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReqModifyOption> getOptionModifications();

} // ReqSeedModifications
