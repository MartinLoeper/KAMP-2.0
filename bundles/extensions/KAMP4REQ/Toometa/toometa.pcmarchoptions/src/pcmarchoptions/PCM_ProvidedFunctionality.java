/**
 */
package pcmarchoptions;

import archoptions.ProvidedFunctionality;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Provided Functionality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_ProvidedFunctionality#getProvidedRoles <em>Provided Roles</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ProvidedFunctionality()
 * @model
 * @generated
 */
public interface PCM_ProvidedFunctionality extends ProvidedFunctionality {
	/**
	 * Returns the value of the '<em><b>Provided Roles</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.OperationProvidedRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Roles</em>' reference list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_ProvidedFunctionality_ProvidedRoles()
	 * @model required="true"
	 * @generated
	 */
	EList<OperationProvidedRole> getProvidedRoles();

} // PCM_ProvidedFunctionality
