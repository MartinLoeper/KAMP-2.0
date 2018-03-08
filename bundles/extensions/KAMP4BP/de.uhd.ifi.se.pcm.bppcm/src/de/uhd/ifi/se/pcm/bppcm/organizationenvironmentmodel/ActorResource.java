/**
 */
package de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource#getWorkingPeriods <em>Working Periods</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.ActorResource#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage#getActorResource()
 * @model
 * @generated
 */
public interface ActorResource extends EObject, Entity {
	/**
	 * Returns the value of the '<em><b>Working Periods</b></em>' containment reference list.
	 * The list contents are of type {@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.WorkingPeriod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Working Periods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Periods</em>' containment reference list.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage#getActorResource_WorkingPeriods()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WorkingPeriod> getWorkingPeriods();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role}.
	 * It is bidirectional and its opposite is '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage#getActorResource_Roles()
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role#getActors
	 * @model opposite="actors" required="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // ActorResource
