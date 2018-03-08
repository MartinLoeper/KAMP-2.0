/**
 */
package de.uhd.ifi.se.pcm.bppcm.datamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.datamodel.DataModel#getDataObjects <em>Data Objects</em>}</li>
 * </ul>
 *
 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Objects</b></em>' containment reference list.
	 * The list contents are of type {@link de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject}&lt;?>.
	 * It is bidirectional and its opposite is '{@link de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Objects</em>' containment reference list.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage#getDataModel_DataObjects()
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject#getDataModel
	 * @model opposite="dataModel" containment="true" ordered="false"
	 * @generated
	 */
	EList<DataObject<?>> getDataObjects();

} // DataModel
