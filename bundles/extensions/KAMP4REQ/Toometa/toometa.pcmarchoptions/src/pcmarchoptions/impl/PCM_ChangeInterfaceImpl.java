/**
 */
package pcmarchoptions.impl;

import archoptions.impl.ChangeInterfaceImpl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.repository.OperationInterface;

import pcmarchoptions.PCM_ChangeInterface;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Change Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_ChangeInterfaceImpl#getOldInterfaces <em>Old Interfaces</em>}</li>
 *   <li>{@link pcmarchoptions.impl.PCM_ChangeInterfaceImpl#getNewInterfaces <em>New Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_ChangeInterfaceImpl extends ChangeInterfaceImpl implements PCM_ChangeInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_ChangeInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_CHANGE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OperationInterface> getOldInterfaces() {
		return (EList<OperationInterface>)eDynamicGet(PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__OLD_INTERFACES, PcmarchoptionsPackage.Literals.PCM_CHANGE_INTERFACE__OLD_INTERFACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OperationInterface> getNewInterfaces() {
		return (EList<OperationInterface>)eDynamicGet(PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__NEW_INTERFACES, PcmarchoptionsPackage.Literals.PCM_CHANGE_INTERFACE__NEW_INTERFACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__OLD_INTERFACES:
				return getOldInterfaces();
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__NEW_INTERFACES:
				return getNewInterfaces();
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
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__OLD_INTERFACES:
				getOldInterfaces().clear();
				getOldInterfaces().addAll((Collection<? extends OperationInterface>)newValue);
				return;
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__NEW_INTERFACES:
				getNewInterfaces().clear();
				getNewInterfaces().addAll((Collection<? extends OperationInterface>)newValue);
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
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__OLD_INTERFACES:
				getOldInterfaces().clear();
				return;
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__NEW_INTERFACES:
				getNewInterfaces().clear();
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
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__OLD_INTERFACES:
				return !getOldInterfaces().isEmpty();
			case PcmarchoptionsPackage.PCM_CHANGE_INTERFACE__NEW_INTERFACES:
				return !getNewInterfaces().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCM_ChangeInterfaceImpl
