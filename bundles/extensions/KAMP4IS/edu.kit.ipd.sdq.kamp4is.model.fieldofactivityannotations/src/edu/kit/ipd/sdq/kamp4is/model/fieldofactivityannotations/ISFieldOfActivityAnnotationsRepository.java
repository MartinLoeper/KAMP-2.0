/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDevelopmentArtefactSpecification <em>Development Artefact Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getBuildSpecification <em>Build Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getTestSpecification <em>Test Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getReleaseSpecification <em>Release Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDeploymentSpecification <em>Deployment Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getStaffSpecification <em>Staff Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getTechnologySpecification <em>Technology Specification</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDesignPatternSpecification <em>Design Pattern Specification</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISFieldOfActivityAnnotationsRepository()
 * @model
 * @generated
 */
public interface ISFieldOfActivityAnnotationsRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Development Artefact Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Development Artefact Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Artefact Specification</em>' containment reference.
	 * @see #setDevelopmentArtefactSpecification(ISDevelopmentArtefactSpecification)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISFieldOfActivityAnnotationsRepository_DevelopmentArtefactSpecification()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ISDevelopmentArtefactSpecification getDevelopmentArtefactSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDevelopmentArtefactSpecification <em>Development Artefact Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Artefact Specification</em>' containment reference.
	 * @see #getDevelopmentArtefactSpecification()
	 * @generated
	 */
	void setDevelopmentArtefactSpecification(ISDevelopmentArtefactSpecification value);

	/**
	 * Returns the value of the '<em><b>Build Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Specification</em>' containment reference.
	 * @see #setBuildSpecification(ISBuildSpecification)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISFieldOfActivityAnnotationsRepository_BuildSpecification()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ISBuildSpecification getBuildSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getBuildSpecification <em>Build Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Specification</em>' containment reference.
	 * @see #getBuildSpecification()
	 * @generated
	 */
	void setBuildSpecification(ISBuildSpecification value);

	/**
	 * Returns the value of the '<em><b>Test Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Specification</em>' containment reference.
	 * @see #setTestSpecification(ISTestSpecification)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISFieldOfActivityAnnotationsRepository_TestSpecification()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ISTestSpecification getTestSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getTestSpecification <em>Test Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Specification</em>' containment reference.
	 * @see #getTestSpecification()
	 * @generated
	 */
	void setTestSpecification(ISTestSpecification value);

	/**
	 * Returns the value of the '<em><b>Release Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Specification</em>' containment reference.
	 * @see #setReleaseSpecification(ISReleaseSpecification)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISFieldOfActivityAnnotationsRepository_ReleaseSpecification()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ISReleaseSpecification getReleaseSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getReleaseSpecification <em>Release Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Specification</em>' containment reference.
	 * @see #getReleaseSpecification()
	 * @generated
	 */
	void setReleaseSpecification(ISReleaseSpecification value);

	/**
	 * Returns the value of the '<em><b>Deployment Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Specification</em>' containment reference.
	 * @see #setDeploymentSpecification(ISDeploymentSpecification)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISFieldOfActivityAnnotationsRepository_DeploymentSpecification()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ISDeploymentSpecification getDeploymentSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDeploymentSpecification <em>Deployment Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Specification</em>' containment reference.
	 * @see #getDeploymentSpecification()
	 * @generated
	 */
	void setDeploymentSpecification(ISDeploymentSpecification value);

	/**
	 * Returns the value of the '<em><b>Staff Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Specification</em>' containment reference.
	 * @see #setStaffSpecification(ISStaffSpecification)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISFieldOfActivityAnnotationsRepository_StaffSpecification()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ISStaffSpecification getStaffSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getStaffSpecification <em>Staff Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff Specification</em>' containment reference.
	 * @see #getStaffSpecification()
	 * @generated
	 */
	void setStaffSpecification(ISStaffSpecification value);

	/**
	 * Returns the value of the '<em><b>Technology Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology Specification</em>' containment reference.
	 * @see #setTechnologySpecification(ISTechnologySpecification)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISFieldOfActivityAnnotationsRepository_TechnologySpecification()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ISTechnologySpecification getTechnologySpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getTechnologySpecification <em>Technology Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology Specification</em>' containment reference.
	 * @see #getTechnologySpecification()
	 * @generated
	 */
	void setTechnologySpecification(ISTechnologySpecification value);

	/**
	 * Returns the value of the '<em><b>Design Pattern Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternSpecification#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Pattern Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Pattern Specification</em>' containment reference.
	 * @see #setDesignPatternSpecification(ISDesignPatternSpecification)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISFieldOfActivityAnnotationsRepository_DesignPatternSpecification()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternSpecification#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	ISDesignPatternSpecification getDesignPatternSpecification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDesignPatternSpecification <em>Design Pattern Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Pattern Specification</em>' containment reference.
	 * @see #getDesignPatternSpecification()
	 * @generated
	 */
	void setDesignPatternSpecification(ISDesignPatternSpecification value);

} // ISFieldOfActivityAnnotationsRepository
