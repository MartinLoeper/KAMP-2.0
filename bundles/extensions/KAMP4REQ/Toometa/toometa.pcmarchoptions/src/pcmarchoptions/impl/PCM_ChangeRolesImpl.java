/**
 */
package pcmarchoptions.impl;

import archoptions.impl.ChangeRolesImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.pcm.repository.Role;

import pcmarchoptions.PCM_ChangeRoles;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Change Roles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_ChangeRolesImpl#getAssemblyContext <em>Assembly Context</em>}</li>
 *   <li>{@link pcmarchoptions.impl.PCM_ChangeRolesImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_ChangeRolesImpl extends ChangeRolesImpl implements PCM_ChangeRoles {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_ChangeRolesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_CHANGE_ROLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAssemblyContext() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_CHANGE_ROLES__ASSEMBLY_CONTEXT, PcmarchoptionsPackage.Literals.PCM_CHANGE_ROLES__ASSEMBLY_CONTEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAssemblyContext() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_CHANGE_ROLES__ASSEMBLY_CONTEXT, PcmarchoptionsPackage.Literals.PCM_CHANGE_ROLES__ASSEMBLY_CONTEXT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyContext(AssemblyContext newAssemblyContext) {
		eDynamicSet(PcmarchoptionsPackage.PCM_CHANGE_ROLES__ASSEMBLY_CONTEXT, PcmarchoptionsPackage.Literals.PCM_CHANGE_ROLES__ASSEMBLY_CONTEXT, newAssemblyContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(PcmarchoptionsPackage.PCM_CHANGE_ROLES__ROLES, PcmarchoptionsPackage.Literals.PCM_CHANGE_ROLES__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_CHANGE_ROLES__ASSEMBLY_CONTEXT:
				if (resolve) return getAssemblyContext();
				return basicGetAssemblyContext();
			case PcmarchoptionsPackage.PCM_CHANGE_ROLES__ROLES:
				return getRoles();
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
			case PcmarchoptionsPackage.PCM_CHANGE_ROLES__ASSEMBLY_CONTEXT:
				setAssemblyContext((AssemblyContext)newValue);
				return;
			case PcmarchoptionsPackage.PCM_CHANGE_ROLES__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case PcmarchoptionsPackage.PCM_CHANGE_ROLES__ASSEMBLY_CONTEXT:
				setAssemblyContext((AssemblyContext)null);
				return;
			case PcmarchoptionsPackage.PCM_CHANGE_ROLES__ROLES:
				getRoles().clear();
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
			case PcmarchoptionsPackage.PCM_CHANGE_ROLES__ASSEMBLY_CONTEXT:
				return basicGetAssemblyContext() != null;
			case PcmarchoptionsPackage.PCM_CHANGE_ROLES__ROLES:
				return !getRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCM_ChangeRolesImpl
