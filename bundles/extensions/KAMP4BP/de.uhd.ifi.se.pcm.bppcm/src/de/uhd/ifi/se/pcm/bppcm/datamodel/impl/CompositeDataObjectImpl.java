/**
 */
package de.uhd.ifi.se.pcm.bppcm.datamodel.impl;

import de.uhd.ifi.se.pcm.bppcm.datamodel.CompositeDataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage;
import de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.repository.CompositeDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Data Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.datamodel.impl.CompositeDataObjectImpl#getInnerDataObjectDeclarations <em>Inner Data Object Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeDataObjectImpl extends DataObjectImpl<CompositeDataType> implements CompositeDataObject {
	/**
	 * The cached value of the '{@link #getInnerDataObjectDeclarations() <em>Inner Data Object Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerDataObjectDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<InnerDataObjectDeclaration> innerDataObjectDeclarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeDataObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatamodelPackage.Literals.COMPOSITE_DATA_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<CompositeDataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectResolvingEList<CompositeDataType>(CompositeDataType.class, this, DatamodelPackage.COMPOSITE_DATA_OBJECT__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InnerDataObjectDeclaration> getInnerDataObjectDeclarations() {
		if (innerDataObjectDeclarations == null) {
			innerDataObjectDeclarations = new EObjectContainmentWithInverseEList<InnerDataObjectDeclaration>(InnerDataObjectDeclaration.class, this, DatamodelPackage.COMPOSITE_DATA_OBJECT__INNER_DATA_OBJECT_DECLARATIONS, DatamodelPackage.INNER_DATA_OBJECT_DECLARATION__COMPOSITE_DATA_OBJECT);
		}
		return innerDataObjectDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatamodelPackage.COMPOSITE_DATA_OBJECT__INNER_DATA_OBJECT_DECLARATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInnerDataObjectDeclarations()).basicAdd(otherEnd, msgs);
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
			case DatamodelPackage.COMPOSITE_DATA_OBJECT__INNER_DATA_OBJECT_DECLARATIONS:
				return ((InternalEList<?>)getInnerDataObjectDeclarations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatamodelPackage.COMPOSITE_DATA_OBJECT__INNER_DATA_OBJECT_DECLARATIONS:
				return getInnerDataObjectDeclarations();
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
			case DatamodelPackage.COMPOSITE_DATA_OBJECT__INNER_DATA_OBJECT_DECLARATIONS:
				getInnerDataObjectDeclarations().clear();
				getInnerDataObjectDeclarations().addAll((Collection<? extends InnerDataObjectDeclaration>)newValue);
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
			case DatamodelPackage.COMPOSITE_DATA_OBJECT__INNER_DATA_OBJECT_DECLARATIONS:
				getInnerDataObjectDeclarations().clear();
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
			case DatamodelPackage.COMPOSITE_DATA_OBJECT__INNER_DATA_OBJECT_DECLARATIONS:
				return innerDataObjectDeclarations != null && !innerDataObjectDeclarations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeDataObjectImpl
