/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Technology Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification#getTechnologicalCorrespondences <em>Technological Correspondences</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTechnologySpecification()
 * @model
 * @generated
 */
public interface ISTechnologySpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getTechnologySpecification <em>Technology Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ISFieldOfActivityAnnotationsRepository)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTechnologySpecification_Parent()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getTechnologySpecification
	 * @model opposite="technologySpecification" required="true" transient="false"
	 * @generated
	 */
	ISFieldOfActivityAnnotationsRepository getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ISFieldOfActivityAnnotationsRepository value);

	/**
	 * Returns the value of the '<em><b>Technological Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technological Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technological Correspondences</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTechnologySpecification_TechnologicalCorrespondences()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ISTechnologicalCorrespondence> getTechnologicalCorrespondences();

} // ISTechnologySpecification
