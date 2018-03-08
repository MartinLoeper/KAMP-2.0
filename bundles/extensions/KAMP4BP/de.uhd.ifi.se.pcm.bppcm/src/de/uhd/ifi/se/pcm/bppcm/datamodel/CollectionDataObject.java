/**
 */
package de.uhd.ifi.se.pcm.bppcm.datamodel;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.CollectionDataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Data Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.datamodel.CollectionDataObject#getInnerDataObjects <em>Inner Data Objects</em>}</li>
 * </ul>
 *
 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage#getCollectionDataObject()
 * @model
 * @generated
 */
public interface CollectionDataObject extends DataObject<CollectionDataType> {
	/**
	 * Returns the value of the '<em><b>Inner Data Objects</b></em>' reference list.
	 * The list contents are of type {@link de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Data Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Data Objects</em>' reference list.
	 * @see de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage#getCollectionDataObject_InnerDataObjects()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DataObject<?>> getInnerDataObjects();

} // CollectionDataObject
