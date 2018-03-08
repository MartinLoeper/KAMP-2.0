/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Development Artefact Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getSourceFiles <em>Source Files</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getSourceFileAggregations <em>Source File Aggregations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getMetadataFiles <em>Metadata Files</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getMetadataFileAggregations <em>Metadata File Aggregations</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISDevelopmentArtefactSpecification()
 * @model
 * @generated
 */
public interface ISDevelopmentArtefactSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDevelopmentArtefactSpecification <em>Development Artefact Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ISFieldOfActivityAnnotationsRepository)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISDevelopmentArtefactSpecification_Parent()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDevelopmentArtefactSpecification
	 * @model opposite="developmentArtefactSpecification" required="true" transient="false"
	 * @generated
	 */
	ISFieldOfActivityAnnotationsRepository getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ISFieldOfActivityAnnotationsRepository value);

	/**
	 * Returns the value of the '<em><b>Source Files</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Files</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISDevelopmentArtefactSpecification_SourceFiles()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ISSourceFile> getSourceFiles();

	/**
	 * Returns the value of the '<em><b>Source File Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source File Aggregations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source File Aggregations</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISDevelopmentArtefactSpecification_SourceFileAggregations()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ISSourceFileAggregation> getSourceFileAggregations();

	/**
	 * Returns the value of the '<em><b>Metadata Files</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Files</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISDevelopmentArtefactSpecification_MetadataFiles()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ISMetadataFile> getMetadataFiles();

	/**
	 * Returns the value of the '<em><b>Metadata File Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata File Aggregations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata File Aggregations</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISDevelopmentArtefactSpecification_MetadataFileAggregations()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ISMetadataFileAggregation> getMetadataFileAggregations();

} // ISDevelopmentArtefactSpecification
