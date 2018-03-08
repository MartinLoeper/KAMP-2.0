/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications#getDataTypeModifications <em>Data Type Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications#getSignatureModifications <em>Signature Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications#getInterfaceModifications <em>Interface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications#getComponentModifications <em>Component Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISSeedModifications()
 * @model
 * @generated
 */
public interface ISSeedModifications extends AbstractSeedModifications {
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
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISSeedModifications_DataTypeModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISModifyDataType> getDataTypeModifications();

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
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISSeedModifications_SignatureModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISModifySignature> getSignatureModifications();

	/**
	 * Returns the value of the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISSeedModifications_InterfaceModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISModifyInterface> getInterfaceModifications();

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
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISSeedModifications_ComponentModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISModifyComponent> getComponentModifications();

} // ISSeedModifications
