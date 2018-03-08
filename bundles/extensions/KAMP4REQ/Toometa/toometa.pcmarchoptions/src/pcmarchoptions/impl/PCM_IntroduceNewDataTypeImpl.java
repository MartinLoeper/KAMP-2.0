/**
 */
package pcmarchoptions.impl;

import archoptions.impl.IntroduceNewDataTypeImpl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.repository.DataType;

import pcmarchoptions.PCM_IntroduceNewDataType;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Introduce New Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_IntroduceNewDataTypeImpl#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_IntroduceNewDataTypeImpl extends IntroduceNewDataTypeImpl implements PCM_IntroduceNewDataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_IntroduceNewDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataType> getDataTypes() {
		return (EList<DataType>)eDynamicGet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPES, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPES:
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DataType>)newValue);
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPES:
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_DATA_TYPE__DATA_TYPES:
				return !getDataTypes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCM_IntroduceNewDataTypeImpl
