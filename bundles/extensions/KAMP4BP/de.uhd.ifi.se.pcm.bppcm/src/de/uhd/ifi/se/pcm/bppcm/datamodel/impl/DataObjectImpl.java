/**
 */
package de.uhd.ifi.se.pcm.bppcm.datamodel.impl;

import de.uhd.ifi.se.pcm.bppcm.datamodel.DataModel;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.repository.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DataObjectImpl#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.DataObjectImpl#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataObjectImpl<T extends DataType> extends EntityImpl implements DataObject<T> {
	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<T> dataTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.DATA_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel getDataModel() {
		if (eContainerFeatureID() != DatamodelPackage.DATA_OBJECT__DATA_MODEL) return null;
		return (DataModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataModel(DataModel newDataModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataModel, DatamodelPackage.DATA_OBJECT__DATA_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataModel(DataModel newDataModel) {
		if (newDataModel != eInternalContainer() || (eContainerFeatureID() != DatamodelPackage.DATA_OBJECT__DATA_MODEL && newDataModel != null)) {
			if (EcoreUtil.isAncestor(this, newDataModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataModel != null)
				msgs = ((InternalEObject)newDataModel).eInverseAdd(this, DatamodelPackage.DATA_MODEL__DATA_OBJECTS, DataModel.class, msgs);
			msgs = basicSetDataModel(newDataModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.DATA_OBJECT__DATA_MODEL, newDataModel, newDataModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<T> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectResolvingEList<T>(DataType.class, this, DatamodelPackage.DATA_OBJECT__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatamodelPackage.DATA_OBJECT__DATA_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataModel((DataModel)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatamodelPackage.DATA_OBJECT__DATA_MODEL:
				return basicSetDataModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DatamodelPackage.DATA_OBJECT__DATA_MODEL:
				return eInternalContainer().eInverseRemove(this, DatamodelPackage.DATA_MODEL__DATA_OBJECTS, DataModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatamodelPackage.DATA_OBJECT__DATA_MODEL:
				return getDataModel();
			case DatamodelPackage.DATA_OBJECT__DATA_TYPES:
				return getDataTypes();
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
			case DatamodelPackage.DATA_OBJECT__DATA_MODEL:
				setDataModel((DataModel)newValue);
				return;
			case DatamodelPackage.DATA_OBJECT__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends T>)newValue);
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
			case DatamodelPackage.DATA_OBJECT__DATA_MODEL:
				setDataModel((DataModel)null);
				return;
			case DatamodelPackage.DATA_OBJECT__DATA_TYPES:
				getDataTypes().clear();
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
			case DatamodelPackage.DATA_OBJECT__DATA_MODEL:
				return getDataModel() != null;
			case DatamodelPackage.DATA_OBJECT__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataObjectImpl
