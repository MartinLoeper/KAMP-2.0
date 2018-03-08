/**
 */
package pcmarchoptions.impl;

import archoptions.impl.ChangeDataTypeImpl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.repository.DataType;

import pcmarchoptions.PCM_ChangeDataType;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Change Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_ChangeDataTypeImpl#getOldDataTypes <em>Old Data Types</em>}</li>
 *   <li>{@link pcmarchoptions.impl.PCM_ChangeDataTypeImpl#getNewDataTypes <em>New Data Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_ChangeDataTypeImpl extends ChangeDataTypeImpl implements PCM_ChangeDataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_ChangeDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_CHANGE_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataType> getOldDataTypes() {
		return (EList<DataType>)eDynamicGet(PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPES, PcmarchoptionsPackage.Literals.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataType> getNewDataTypes() {
		return (EList<DataType>)eDynamicGet(PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPES, PcmarchoptionsPackage.Literals.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPES:
				return getOldDataTypes();
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPES:
				return getNewDataTypes();
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
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPES:
				getOldDataTypes().clear();
				getOldDataTypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPES:
				getNewDataTypes().clear();
				getNewDataTypes().addAll((Collection<? extends DataType>)newValue);
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
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPES:
				getOldDataTypes().clear();
				return;
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPES:
				getNewDataTypes().clear();
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
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__OLD_DATA_TYPES:
				return !getOldDataTypes().isEmpty();
			case PcmarchoptionsPackage.PCM_CHANGE_DATA_TYPE__NEW_DATA_TYPES:
				return !getNewDataTypes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCM_ChangeDataTypeImpl
