/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Change Propagation Due To Interface Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToInterfaceDependencies#getComponentModifications <em>Component Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToInterfaceDependencies#getSignatureModifications <em>Signature Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISChangePropagationDueToInterfaceDependencies()
 * @model
 * @generated
 */
public interface ISChangePropagationDueToInterfaceDependencies extends ChangePropagationStep {
	/**
	 * Returns the value of the '<em><b>Component Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISChangePropagationDueToInterfaceDependencies_ComponentModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISModifyComponent> getComponentModifications();

	/**
	 * Returns the value of the '<em><b>Signature Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISChangePropagationDueToInterfaceDependencies_SignatureModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISModifySignature> getSignatureModifications();

} // ISChangePropagationDueToInterfaceDependencies
