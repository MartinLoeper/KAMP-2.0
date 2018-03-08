/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Modify Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent#getProvidedRoleModifications <em>Provided Role Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent#getRequiredRoleModifications <em>Required Role Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISModifyComponent()
 * @model
 * @generated
 */
public interface ISModifyComponent extends ISModifyEntity<RepositoryComponent> {
	/**
	 * Returns the value of the '<em><b>Provided Role Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Role Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISModifyComponent_ProvidedRoleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISModifyProvidedRole> getProvidedRoleModifications();

	/**
	 * Returns the value of the '<em><b>Required Role Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRequiredRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Role Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISModifyComponent_RequiredRoleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISModifyRequiredRole> getRequiredRoleModifications();

} // ISModifyComponent
