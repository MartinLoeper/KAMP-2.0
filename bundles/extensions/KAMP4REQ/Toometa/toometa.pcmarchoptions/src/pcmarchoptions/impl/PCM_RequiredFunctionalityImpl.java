/**
 */
package pcmarchoptions.impl;

import archoptions.impl.RequiredFunctionalityImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.repository.OperationRequiredRole;

import pcmarchoptions.PCM_RequiredFunctionality;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Required Functionality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_RequiredFunctionalityImpl#getRequiredRoles <em>Required Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_RequiredFunctionalityImpl extends RequiredFunctionalityImpl implements PCM_RequiredFunctionality {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_RequiredFunctionalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_REQUIRED_FUNCTIONALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OperationRequiredRole> getRequiredRoles() {
		return (EList<OperationRequiredRole>)eDynamicGet(PcmarchoptionsPackage.PCM_REQUIRED_FUNCTIONALITY__REQUIRED_ROLES, PcmarchoptionsPackage.Literals.PCM_REQUIRED_FUNCTIONALITY__REQUIRED_ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_REQUIRED_FUNCTIONALITY__REQUIRED_ROLES:
				return getRequiredRoles();
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
			case PcmarchoptionsPackage.PCM_REQUIRED_FUNCTIONALITY__REQUIRED_ROLES:
				getRequiredRoles().clear();
				getRequiredRoles().addAll((Collection<? extends OperationRequiredRole>)newValue);
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
			case PcmarchoptionsPackage.PCM_REQUIRED_FUNCTIONALITY__REQUIRED_ROLES:
				getRequiredRoles().clear();
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
			case PcmarchoptionsPackage.PCM_REQUIRED_FUNCTIONALITY__REQUIRED_ROLES:
				return !getRequiredRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCM_RequiredFunctionalityImpl
