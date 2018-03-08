/**
 */
package edu.kit.ipd.sdq.kamp4req.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req Change Propagation Due To Specification Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies#getDecisionModifications <em>Decision Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies#getOptionModifications <em>Option Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies#getRequirementModifications <em>Requirement Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies#getDataTypeModifications <em>Data Type Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies#getEntityModifications <em>Entity Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage#getReqChangePropagationDueToSpecificationDependencies()
 * @model
 * @generated
 */
public interface ReqChangePropagationDueToSpecificationDependencies extends ChangePropagationStep {
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
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage#getReqChangePropagationDueToSpecificationDependencies_DecisionModifications()
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
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage#getReqChangePropagationDueToSpecificationDependencies_OptionModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReqModifyOption> getOptionModifications();

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
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage#getReqChangePropagationDueToSpecificationDependencies_RequirementModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReqModifyRequirement> getRequirementModifications();

	/**
	 * Returns the value of the '<em><b>Data Type Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage#getReqChangePropagationDueToSpecificationDependencies_DataTypeModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISModifyDataType> getDataTypeModifications();

	/**
	 * Returns the value of the '<em><b>Entity Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage#getReqChangePropagationDueToSpecificationDependencies_EntityModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReqModifyEntity> getEntityModifications();

} // ReqChangePropagationDueToSpecificationDependencies
