/**
 */
package pcmarchoptions.impl;

import archoptions.impl.FunctionalityConnectionImpl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;

import pcmarchoptions.PCM_FunctionalityConnection;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Functionality Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_FunctionalityConnectionImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link pcmarchoptions.impl.PCM_FunctionalityConnectionImpl#getRequiredRole <em>Required Role</em>}</li>
 *   <li>{@link pcmarchoptions.impl.PCM_FunctionalityConnectionImpl#getProvidedRole <em>Provided Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_FunctionalityConnectionImpl extends FunctionalityConnectionImpl implements PCM_FunctionalityConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_FunctionalityConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_FUNCTIONALITY_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector getConnector() {
		return (AssemblyConnector)eDynamicGet(PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__CONNECTOR, PcmarchoptionsPackage.Literals.PCM_FUNCTIONALITY_CONNECTION__CONNECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector basicGetConnector() {
		return (AssemblyConnector)eDynamicGet(PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__CONNECTOR, PcmarchoptionsPackage.Literals.PCM_FUNCTIONALITY_CONNECTION__CONNECTOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(AssemblyConnector newConnector) {
		eDynamicSet(PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__CONNECTOR, PcmarchoptionsPackage.Literals.PCM_FUNCTIONALITY_CONNECTION__CONNECTOR, newConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRequiredRole getRequiredRole() {
		return (OperationRequiredRole)eDynamicGet(PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__REQUIRED_ROLE, PcmarchoptionsPackage.Literals.PCM_FUNCTIONALITY_CONNECTION__REQUIRED_ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRequiredRole basicGetRequiredRole() {
		return (OperationRequiredRole)eDynamicGet(PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__REQUIRED_ROLE, PcmarchoptionsPackage.Literals.PCM_FUNCTIONALITY_CONNECTION__REQUIRED_ROLE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredRole(OperationRequiredRole newRequiredRole) {
		eDynamicSet(PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__REQUIRED_ROLE, PcmarchoptionsPackage.Literals.PCM_FUNCTIONALITY_CONNECTION__REQUIRED_ROLE, newRequiredRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole getProvidedRole() {
		return (OperationProvidedRole)eDynamicGet(PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__PROVIDED_ROLE, PcmarchoptionsPackage.Literals.PCM_FUNCTIONALITY_CONNECTION__PROVIDED_ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationProvidedRole basicGetProvidedRole() {
		return (OperationProvidedRole)eDynamicGet(PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__PROVIDED_ROLE, PcmarchoptionsPackage.Literals.PCM_FUNCTIONALITY_CONNECTION__PROVIDED_ROLE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedRole(OperationProvidedRole newProvidedRole) {
		eDynamicSet(PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__PROVIDED_ROLE, PcmarchoptionsPackage.Literals.PCM_FUNCTIONALITY_CONNECTION__PROVIDED_ROLE, newProvidedRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
			case PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__REQUIRED_ROLE:
				if (resolve) return getRequiredRole();
				return basicGetRequiredRole();
			case PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__PROVIDED_ROLE:
				if (resolve) return getProvidedRole();
				return basicGetProvidedRole();
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
			case PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__CONNECTOR:
				setConnector((AssemblyConnector)newValue);
				return;
			case PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__REQUIRED_ROLE:
				setRequiredRole((OperationRequiredRole)newValue);
				return;
			case PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__PROVIDED_ROLE:
				setProvidedRole((OperationProvidedRole)newValue);
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
			case PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__CONNECTOR:
				setConnector((AssemblyConnector)null);
				return;
			case PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__REQUIRED_ROLE:
				setRequiredRole((OperationRequiredRole)null);
				return;
			case PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__PROVIDED_ROLE:
				setProvidedRole((OperationProvidedRole)null);
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
			case PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__CONNECTOR:
				return basicGetConnector() != null;
			case PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__REQUIRED_ROLE:
				return basicGetRequiredRole() != null;
			case PcmarchoptionsPackage.PCM_FUNCTIONALITY_CONNECTION__PROVIDED_ROLE:
				return basicGetProvidedRole() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCM_FunctionalityConnectionImpl
