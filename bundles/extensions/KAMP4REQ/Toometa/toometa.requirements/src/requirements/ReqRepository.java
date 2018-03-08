/**
 */
package requirements;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirements.ReqRepository#getDescription <em>Description</em>}</li>
 *   <li>{@link requirements.ReqRepository#getProjectReqSection <em>Project Req Section</em>}</li>
 *   <li>{@link requirements.ReqRepository#getProcessReqSection <em>Process Req Section</em>}</li>
 *   <li>{@link requirements.ReqRepository#getSystemReqSection <em>System Req Section</em>}</li>
 * </ul>
 *
 * @see requirements.RequirementsPackage#getReqRepository()
 * @model
 * @generated
 */
public interface ReqRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"Write a description here ..."</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see requirements.RequirementsPackage#getReqRepository_Description()
	 * @model default="Write a description here ..."
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link requirements.ReqRepository#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Project Req Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Req Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Req Section</em>' containment reference.
	 * @see #setProjectReqSection(ProjectRequirements)
	 * @see requirements.RequirementsPackage#getReqRepository_ProjectReqSection()
	 * @model containment="true"
	 * @generated
	 */
	ProjectRequirements getProjectReqSection();

	/**
	 * Sets the value of the '{@link requirements.ReqRepository#getProjectReqSection <em>Project Req Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Req Section</em>' containment reference.
	 * @see #getProjectReqSection()
	 * @generated
	 */
	void setProjectReqSection(ProjectRequirements value);

	/**
	 * Returns the value of the '<em><b>Process Req Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Req Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Req Section</em>' containment reference.
	 * @see #setProcessReqSection(ProcessRequirements)
	 * @see requirements.RequirementsPackage#getReqRepository_ProcessReqSection()
	 * @model containment="true"
	 * @generated
	 */
	ProcessRequirements getProcessReqSection();

	/**
	 * Sets the value of the '{@link requirements.ReqRepository#getProcessReqSection <em>Process Req Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Req Section</em>' containment reference.
	 * @see #getProcessReqSection()
	 * @generated
	 */
	void setProcessReqSection(ProcessRequirements value);

	/**
	 * Returns the value of the '<em><b>System Req Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Req Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Req Section</em>' containment reference.
	 * @see #setSystemReqSection(SystemRequirements)
	 * @see requirements.RequirementsPackage#getReqRepository_SystemReqSection()
	 * @model containment="true"
	 * @generated
	 */
	SystemRequirements getSystemReqSection();

	/**
	 * Sets the value of the '{@link requirements.ReqRepository#getSystemReqSection <em>System Req Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Req Section</em>' containment reference.
	 * @see #getSystemReqSection()
	 * @generated
	 */
	void setSystemReqSection(SystemRequirements value);

} // ReqRepository
