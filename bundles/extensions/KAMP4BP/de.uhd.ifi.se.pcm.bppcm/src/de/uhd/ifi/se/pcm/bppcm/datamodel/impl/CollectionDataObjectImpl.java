/**
 */
package de.uhd.ifi.se.pcm.bppcm.datamodel.impl;

import de.uhd.ifi.se.pcm.bppcm.datamodel.CollectionDataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.repository.CollectionDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Data Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.CollectionDataObjectImpl#getInnerDataObjects <em>Inner Data Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionDataObjectImpl extends DataObjectImpl<CollectionDataType> implements CollectionDataObject {
	/**
	 * The cached value of the '{@link #getInnerDataObjects() <em>Inner Data Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerDataObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<DataObject<?>> innerDataObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionDataObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.COLLECTION_DATA_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<CollectionDataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectResolvingEList<CollectionDataType>(CollectionDataType.class, this, DatamodelPackage.COLLECTION_DATA_OBJECT__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataObject<?>> getInnerDataObjects() {
		if (innerDataObjects == null) {
			innerDataObjects = new EObjectResolvingEList<DataObject<?>>(DataObject.class, this, DatamodelPackage.COLLECTION_DATA_OBJECT__INNER_DATA_OBJECTS);
		}
		return innerDataObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatamodelPackage.COLLECTION_DATA_OBJECT__INNER_DATA_OBJECTS:
				return getInnerDataObjects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatamodelPackage.COLLECTION_DATA_OBJECT__INNER_DATA_OBJECTS:
				getInnerDataObjects().clear();
				getInnerDataObjects().addAll((Collection<? extends DataObject<?>>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatamodelPackage.COLLECTION_DATA_OBJECT__INNER_DATA_OBJECTS:
				getInnerDataObjects().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatamodelPackage.COLLECTION_DATA_OBJECT__INNER_DATA_OBJECTS:
				return innerDataObjects != null && !innerDataObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CollectionDataObjectImpl
