/**
 */
package pcmarchoptions;

import archoptions.FunctionalityConnection;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Functionality Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_FunctionalityConnection#getConnector <em>Connector</em>}</li>
 *   <li>{@link pcmarchoptions.PCM_FunctionalityConnection#getRequiredRole <em>Required Role</em>}</li>
 *   <li>{@link pcmarchoptions.PCM_FunctionalityConnection#getProvidedRole <em>Provided Role</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_FunctionalityConnection()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RolesHaveValidConnection'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL RolesHaveValidConnection='connector.providedRole_AssemblyConnector =providedRole and connector.requiredRole_AssemblyConnector=requiredRole'"
 * @generated
 */
public interface PCM_FunctionalityConnection extends FunctionalityConnection {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(AssemblyConnector)
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_FunctionalityConnection_Connector()
	 * @model required="true"
	 * @generated
	 */
	AssemblyConnector getConnector();

	/**
	 * Sets the value of the '{@link pcmarchoptions.PCM_FunctionalityConnection#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(AssemblyConnector value);

	/**
	 * Returns the value of the '<em><b>Required Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Role</em>' reference.
	 * @see #setRequiredRole(OperationRequiredRole)
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_FunctionalityConnection_RequiredRole()
	 * @model required="true"
	 * @generated
	 */
	OperationRequiredRole getRequiredRole();

	/**
	 * Sets the value of the '{@link pcmarchoptions.PCM_FunctionalityConnection#getRequiredRole <em>Required Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Role</em>' reference.
	 * @see #getRequiredRole()
	 * @generated
	 */
	void setRequiredRole(OperationRequiredRole value);

	/**
	 * Returns the value of the '<em><b>Provided Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Role</em>' reference.
	 * @see #setProvidedRole(OperationProvidedRole)
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_FunctionalityConnection_ProvidedRole()
	 * @model required="true"
	 * @generated
	 */
	OperationProvidedRole getProvidedRole();

	/**
	 * Sets the value of the '{@link pcmarchoptions.PCM_FunctionalityConnection#getProvidedRole <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Role</em>' reference.
	 * @see #getProvidedRole()
	 * @generated
	 */
	void setProvidedRole(OperationProvidedRole value);

} // PCM_FunctionalityConnection
