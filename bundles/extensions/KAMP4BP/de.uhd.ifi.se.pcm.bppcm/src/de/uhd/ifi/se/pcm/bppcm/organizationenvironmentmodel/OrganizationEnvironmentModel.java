/**
 */
package de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization Environment Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel#getRoles <em>Roles</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel#getActorResources <em>Actor Resources</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel#getDeviceResources <em>Device Resources</em>}</li>
 * </ul>
 *
 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage#getOrganizationEnvironmentModel()
 * @model
 * @generated
 */
public interface OrganizationEnvironmentModel extends EObject, NamedElement {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage#getOrganizationEnvironmentModel_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Actor Resources</b></em>' containment reference list.
	 * The list contents are of type {@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Resources</em>' containment reference list.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage#getOrganizationEnvironmentModel_ActorResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActorResource> getActorResources();

	/**
	 * Returns the value of the '<em><b>Device Resources</b></em>' containment reference list.
	 * The list contents are of type {@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Resources</em>' containment reference list.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage#getOrganizationEnvironmentModel_DeviceResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceResource> getDeviceResources();

} // OrganizationEnvironmentModel
