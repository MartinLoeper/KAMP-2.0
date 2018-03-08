/**
 */
package de.uhd.ifi.se.pcm.bppcm.datamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage#getDataObject()
 * @model abstract="true"
 * @generated
 */
public interface DataObject<T extends DataType> extends EObject, Entity {
	/**
	 * Returns the value of the '<em><b>Data Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.DataModel#getDataObjects <em>Data Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Model</em>' container reference.
	 * @see #setDataModel(DataModel)
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage#getDataObject_DataModel()
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DataModel#getDataObjects
	 * @model opposite="dataObjects" required="true" transient="false"
	 * @generated
	 */
	DataModel getDataModel();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject#getDataModel <em>Data Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Model</em>' container reference.
	 * @see #getDataModel()
	 * @generated
	 */
	void setDataModel(DataModel value);

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' reference list.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage#getDataObject_DataTypes()
	 * @model
	 * @generated
	 */
	EList<T> getDataTypes();

} // DataObject
