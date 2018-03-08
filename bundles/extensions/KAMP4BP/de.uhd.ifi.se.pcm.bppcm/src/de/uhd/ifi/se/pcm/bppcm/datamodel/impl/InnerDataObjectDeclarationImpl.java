/**
 */
package de.uhd.ifi.se.pcm.bppcm.datamodel.impl;

import de.uhd.ifi.se.pcm.bppcm.datamodel.CompositeDataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage;
import de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.palladiosimulator.pcm.core.entity.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inner Data Object Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.InnerDataObjectDeclarationImpl#getDataObject <em>Data Object</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.InnerDataObjectDeclarationImpl#getCompositeDataObject <em>Composite Data Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InnerDataObjectDeclarationImpl extends NamedElementImpl implements InnerDataObjectDeclaration {
	/**
	 * The cached value of the '{@link #getDataObject() <em>Data Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObject()
	 * @generated
	 * @ordered
	 */
	protected DataObject<?> dataObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InnerDataObjectDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.INNER_DATA_OBJECT_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject<?> getDataObject() {
		if (dataObject != null && dataObject.eIsProxy()) {
			InternalEObject oldDataObject = (InternalEObject)dataObject;
			dataObject = (DataObject<?>)eResolveProxy(oldDataObject);
			if (dataObject != oldDataObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__DATA_OBJECT, oldDataObject, dataObject));
			}
		}
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject<?> basicGetDataObject() {
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataObject(DataObject<?> newDataObject) {
		DataObject<?> oldDataObject = dataObject;
		dataObject = newDataObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__DATA_OBJECT, oldDataObject, dataObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDataObject getCompositeDataObject() {
		if (eContainerFeatureID() != DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__COMPOSITE_DATA_OBJECT) return null;
		return (CompositeDataObject)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeDataObject(CompositeDataObject newCompositeDataObject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCompositeDataObject, DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__COMPOSITE_DATA_OBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeDataObject(CompositeDataObject newCompositeDataObject) {
		if (newCompositeDataObject != eInternalContainer() || (eContainerFeatureID() != DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__COMPOSITE_DATA_OBJECT && newCompositeDataObject != null)) {
			if (EcoreUtil.isAncestor(this, newCompositeDataObject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCompositeDataObject != null)
				msgs = ((InternalEObject)newCompositeDataObject).eInverseAdd(this, DatamodelPackage.COMPOSITE_DATA_OBJECT__INNER_DATA_OBJECT_DECLARATIONS, CompositeDataObject.class, msgs);
			msgs = basicSetCompositeDataObject(newCompositeDataObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__COMPOSITE_DATA_OBJECT, newCompositeDataObject, newCompositeDataObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__COMPOSITE_DATA_OBJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCompositeDataObject((CompositeDataObject)otherEnd, msgs);
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
			case DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__COMPOSITE_DATA_OBJECT:
				return basicSetCompositeDataObject(null, msgs);
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
			case DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__COMPOSITE_DATA_OBJECT:
				return eInternalContainer().eInverseRemove(this, DatamodelPackage.COMPOSITE_DATA_OBJECT__INNER_DATA_OBJECT_DECLARATIONS, CompositeDataObject.class, msgs);
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
			case DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__DATA_OBJECT:
				if (resolve) return getDataObject();
				return basicGetDataObject();
			case DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__COMPOSITE_DATA_OBJECT:
				return getCompositeDataObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__DATA_OBJECT:
				setDataObject((DataObject<?>)newValue);
				return;
			case DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__COMPOSITE_DATA_OBJECT:
				setCompositeDataObject((CompositeDataObject)newValue);
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
			case DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__DATA_OBJECT:
				setDataObject((DataObject<?>)null);
				return;
			case DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__COMPOSITE_DATA_OBJECT:
				setCompositeDataObject((CompositeDataObject)null);
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
			case DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__DATA_OBJECT:
				return dataObject != null;
			case DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__COMPOSITE_DATA_OBJECT:
				return getCompositeDataObject() != null;
		}
		return super.eIsSet(featureID);
	}

} //InnerDataObjectDeclarationImpl
