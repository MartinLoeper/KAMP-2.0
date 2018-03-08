/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Third Party Component Or Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISThirdPartyComponentOrLibrary()
 * @model
 * @generated
 */
public interface ISThirdPartyComponentOrLibrary extends ISFile {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification#getThirdPartyComponentOrLibraries <em>Third Party Component Or Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ISBuildSpecification)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISThirdPartyComponentOrLibrary_Parent()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification#getThirdPartyComponentOrLibraries
	 * @model opposite="thirdPartyComponentOrLibraries" required="true" transient="false"
	 * @generated
	 */
	ISBuildSpecification getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ISBuildSpecification value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(RepositoryComponent)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISThirdPartyComponentOrLibrary_Component()
	 * @model
	 * @generated
	 */
	RepositoryComponent getComponent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(RepositoryComponent value);

} // ISThirdPartyComponentOrLibrary
