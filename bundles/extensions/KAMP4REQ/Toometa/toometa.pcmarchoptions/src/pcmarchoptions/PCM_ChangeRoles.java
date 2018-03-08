/**
 */
package pcmarchoptions;

import archoptions.ChangeRoles;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.repository.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Change Roles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_ChangeRoles#getAssemblyContext <em>Assembly Context</em>}</li>
 *   <li>{@link pcmarchoptions.PCM_ChangeRoles#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ChangeRoles()
 * @model
 * @generated
 */
public interface PCM_ChangeRoles extends ChangeRoles {
	/**
	 * Returns the value of the '<em><b>Assembly Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Context</em>' reference.
	 * @see #setAssemblyContext(AssemblyContext)
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ChangeRoles_AssemblyContext()
	 * @model required="true"
	 * @generated
	 */
	AssemblyContext getAssemblyContext();

	/**
	 * Sets the value of the '{@link pcmarchoptions.PCM_ChangeRoles#getAssemblyContext <em>Assembly Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Context</em>' reference.
	 * @see #getAssemblyContext()
	 * @generated
	 */
	void setAssemblyContext(AssemblyContext value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ChangeRoles_Roles()
	 * @model required="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // PCM_ChangeRoles
