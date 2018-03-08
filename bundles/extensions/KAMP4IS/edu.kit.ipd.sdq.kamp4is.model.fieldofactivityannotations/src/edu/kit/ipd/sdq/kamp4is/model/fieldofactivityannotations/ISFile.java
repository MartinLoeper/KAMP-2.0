/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFile#getFilename <em>Filename</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFile#getTechnology <em>Technology</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISFile()
 * @model abstract="true"
 * @generated
 */
public interface ISFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISFile_Filename()
	 * @model
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFile#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' attribute.
	 * @see #setTechnology(String)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISFile_Technology()
	 * @model
	 * @generated
	 */
	String getTechnology();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFile#getTechnology <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' attribute.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(String value);

} // ISFile
