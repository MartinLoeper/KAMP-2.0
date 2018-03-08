/**
 */
package pcmarchoptions.impl;

import archoptions.impl.ProvidedFunctionalityImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;

import pcmarchoptions.PCM_ProvidedFunctionality;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Provided Functionality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_ProvidedFunctionalityImpl#getProvidedRoles <em>Provided Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_ProvidedFunctionalityImpl extends ProvidedFunctionalityImpl implements PCM_ProvidedFunctionality {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_ProvidedFunctionalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_PROVIDED_FUNCTIONALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OperationProvidedRole> getProvidedRoles() {
		return (EList<OperationProvidedRole>)eDynamicGet(PcmarchoptionsPackage.PCM_PROVIDED_FUNCTIONALITY__PROVIDED_ROLES, PcmarchoptionsPackage.Literals.PCM_PROVIDED_FUNCTIONALITY__PROVIDED_ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_PROVIDED_FUNCTIONALITY__PROVIDED_ROLES:
				return getProvidedRoles();
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
			case PcmarchoptionsPackage.PCM_PROVIDED_FUNCTIONALITY__PROVIDED_ROLES:
				getProvidedRoles().clear();
				getProvidedRoles().addAll((Collection<? extends OperationProvidedRole>)newValue);
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
			case PcmarchoptionsPackage.PCM_PROVIDED_FUNCTIONALITY__PROVIDED_ROLES:
				getProvidedRoles().clear();
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
			case PcmarchoptionsPackage.PCM_PROVIDED_FUNCTIONALITY__PROVIDED_ROLES:
				return !getProvidedRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCM_ProvidedFunctionalityImpl
