/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Technological Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence#getTechnologicalCorrespondenceType <em>Technological Correspondence Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTechnologicalCorrespondence()
 * @model
 * @generated
 */
public interface ISTechnologicalCorrespondence extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Technological Correspondence Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondenceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technological Correspondence Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technological Correspondence Type</em>' attribute.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondenceTypes
	 * @see #setTechnologicalCorrespondenceType(ISTechnologicalCorrespondenceTypes)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTechnologicalCorrespondence_TechnologicalCorrespondenceType()
	 * @model ordered="false"
	 * @generated
	 */
	ISTechnologicalCorrespondenceTypes getTechnologicalCorrespondenceType();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence#getTechnologicalCorrespondenceType <em>Technological Correspondence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technological Correspondence Type</em>' attribute.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondenceTypes
	 * @see #getTechnologicalCorrespondenceType()
	 * @generated
	 */
	void setTechnologicalCorrespondenceType(ISTechnologicalCorrespondenceTypes value);

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
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISTechnologicalCorrespondence_Component()
	 * @model ordered="false"
	 * @generated
	 */
	RepositoryComponent getComponent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(RepositoryComponent value);

} // ISTechnologicalCorrespondence
