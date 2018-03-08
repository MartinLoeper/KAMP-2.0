/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ChangePropagationStepImpl;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Change Propagation Due To Data Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISChangePropagationDueToDataDependenciesImpl#getInterfaceModifications <em>Interface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISChangePropagationDueToDataDependenciesImpl#getDatatypeModifications <em>Datatype Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISChangePropagationDueToDataDependenciesImpl extends ChangePropagationStepImpl implements ISChangePropagationDueToDataDependencies {
	/**
	 * The cached value of the '{@link #getInterfaceModifications() <em>Interface Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ISModifyInterface> interfaceModifications;

	/**
	 * The cached value of the '{@link #getDatatypeModifications() <em>Datatype Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypeModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ISModifyDataType> datatypeModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISChangePropagationDueToDataDependenciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISModificationmarksPackage.Literals.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISModifyInterface> getInterfaceModifications() {
		if (interfaceModifications == null) {
			interfaceModifications = new EObjectContainmentEList<ISModifyInterface>(ISModifyInterface.class, this, ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__INTERFACE_MODIFICATIONS);
		}
		return interfaceModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISModifyDataType> getDatatypeModifications() {
		if (datatypeModifications == null) {
			datatypeModifications = new EObjectContainmentEList<ISModifyDataType>(ISModifyDataType.class, this, ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATATYPE_MODIFICATIONS);
		}
		return datatypeModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__INTERFACE_MODIFICATIONS:
				return ((InternalEList<?>)getInterfaceModifications()).basicRemove(otherEnd, msgs);
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATATYPE_MODIFICATIONS:
				return ((InternalEList<?>)getDatatypeModifications()).basicRemove(otherEnd, msgs);
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
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__INTERFACE_MODIFICATIONS:
				return getInterfaceModifications();
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATATYPE_MODIFICATIONS:
				return getDatatypeModifications();
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
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
				getInterfaceModifications().addAll((Collection<? extends ISModifyInterface>)newValue);
				return;
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATATYPE_MODIFICATIONS:
				getDatatypeModifications().clear();
				getDatatypeModifications().addAll((Collection<? extends ISModifyDataType>)newValue);
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
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
				return;
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATATYPE_MODIFICATIONS:
				getDatatypeModifications().clear();
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
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__INTERFACE_MODIFICATIONS:
				return interfaceModifications != null && !interfaceModifications.isEmpty();
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES__DATATYPE_MODIFICATIONS:
				return datatypeModifications != null && !datatypeModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISChangePropagationDueToDataDependenciesImpl
