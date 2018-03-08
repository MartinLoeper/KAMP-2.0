/**
 */
package pcmarchoptions;

import archoptions.RequiredFunctionality;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.OperationRequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Required Functionality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_RequiredFunctionality#getRequiredRoles <em>Required Roles</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_RequiredFunctionality()
 * @model
 * @generated
 */
public interface PCM_RequiredFunctionality extends RequiredFunctionality {
	/**
	 * Returns the value of the '<em><b>Required Roles</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.OperationRequiredRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Roles</em>' reference list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_RequiredFunctionality_RequiredRoles()
	 * @model required="true"
	 * @generated
	 */
	EList<OperationRequiredRole> getRequiredRoles();

} // PCM_RequiredFunctionality
