/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ChangePropagationStepImpl;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntercomponentPropagation;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyConnector;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Intercomponent Propagation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISIntercomponentPropagationImpl#getConnectorModifications <em>Connector Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISIntercomponentPropagationImpl extends ChangePropagationStepImpl implements ISIntercomponentPropagation {
	/**
	 * The cached value of the '{@link #getConnectorModifications() <em>Connector Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ISModifyConnector> connectorModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISIntercomponentPropagationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISModificationmarksPackage.Literals.IS_INTERCOMPONENT_PROPAGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISModifyConnector> getConnectorModifications() {
		if (connectorModifications == null) {
			connectorModifications = new EObjectContainmentEList<ISModifyConnector>(ISModifyConnector.class, this, ISModificationmarksPackage.IS_INTERCOMPONENT_PROPAGATION__CONNECTOR_MODIFICATIONS);
		}
		return connectorModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ISModificationmarksPackage.IS_INTERCOMPONENT_PROPAGATION__CONNECTOR_MODIFICATIONS:
				return ((InternalEList<?>)getConnectorModifications()).basicRemove(otherEnd, msgs);
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
			case ISModificationmarksPackage.IS_INTERCOMPONENT_PROPAGATION__CONNECTOR_MODIFICATIONS:
				return getConnectorModifications();
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
			case ISModificationmarksPackage.IS_INTERCOMPONENT_PROPAGATION__CONNECTOR_MODIFICATIONS:
				getConnectorModifications().clear();
				getConnectorModifications().addAll((Collection<? extends ISModifyConnector>)newValue);
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
			case ISModificationmarksPackage.IS_INTERCOMPONENT_PROPAGATION__CONNECTOR_MODIFICATIONS:
				getConnectorModifications().clear();
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
			case ISModificationmarksPackage.IS_INTERCOMPONENT_PROPAGATION__CONNECTOR_MODIFICATIONS:
				return connectorModifications != null && !connectorModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISIntercomponentPropagationImpl
