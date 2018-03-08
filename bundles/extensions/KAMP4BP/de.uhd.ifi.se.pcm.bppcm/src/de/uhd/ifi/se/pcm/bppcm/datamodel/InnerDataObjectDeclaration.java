/**
 */
package de.uhd.ifi.se.pcm.bppcm.datamodel;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inner Data Object Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration#getDataObject <em>Data Object</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration#getCompositeDataObject <em>Composite Data Object</em>}</li>
 * </ul>
 *
 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage#getInnerDataObjectDeclaration()
 * @model
 * @generated
 */
public interface InnerDataObjectDeclaration extends EObject, NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Object</em>' reference.
	 * @see #setDataObject(DataObject)
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage#getInnerDataObjectDeclaration_DataObject()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataObject<?> getDataObject();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration#getDataObject <em>Data Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Object</em>' reference.
	 * @see #getDataObject()
	 * @generated
	 */
	void setDataObject(DataObject<?> value);

	/**
	 * Returns the value of the '<em><b>Composite Data Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.CompositeDataObject#getInnerDataObjectDeclarations <em>Inner Data Object Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Data Object</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Data Object</em>' container reference.
	 * @see #setCompositeDataObject(CompositeDataObject)
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage#getInnerDataObjectDeclaration_CompositeDataObject()
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.CompositeDataObject#getInnerDataObjectDeclarations
	 * @model opposite="innerDataObjectDeclarations" required="true" transient="false" ordered="false"
	 * @generated
	 */
	CompositeDataObject getCompositeDataObject();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration#getCompositeDataObject <em>Composite Data Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Data Object</em>' container reference.
	 * @see #getCompositeDataObject()
	 * @generated
	 */
	void setCompositeDataObject(CompositeDataObject value);

} // InnerDataObjectDeclaration
