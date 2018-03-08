/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Modify Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRole#getSignatureModifications <em>Signature Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISModifyRole()
 * @model
 * @generated
 */
public interface ISModifyRole<T extends Role> extends ISModifyEntity<T> {
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
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISModifyRole_SignatureModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISModifySignature> getSignatureModifications();

} // ISModifyRole
