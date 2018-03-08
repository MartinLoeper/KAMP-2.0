/**
 */
package de.uhd.ifi.se.pcm.bppcm.datamodel;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.CompositeDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Data Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.datamodel.CompositeDataObject#getInnerDataObjectDeclarations <em>Inner Data Object Declarations</em>}</li>
 * </ul>
 *
 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage#getCompositeDataObject()
 * @model
 * @generated
 */
public interface CompositeDataObject extends DataObject<CompositeDataType> {
	/**
	 * Returns the value of the '<em><b>Inner Data Object Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration}.
	 * It is bidirectional and its opposite is '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration#getCompositeDataObject <em>Composite Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Data Object Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Data Object Declarations</em>' containment reference list.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage#getCompositeDataObject_InnerDataObjectDeclarations()
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration#getCompositeDataObject
	 * @model opposite="compositeDataObject" containment="true" ordered="false"
	 * @generated
	 */
	EList<InnerDataObjectDeclaration> getInnerDataObjectDeclarations();

} // CompositeDataObject
