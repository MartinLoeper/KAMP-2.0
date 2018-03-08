/**
 */
package pcmarchoptions.impl;

import archoptions.impl.IntroduceNewInterfaceImpl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.repository.OperationInterface;

import pcmarchoptions.PCM_IntroduceNewInterface;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Introduce New Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_IntroduceNewInterfaceImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_IntroduceNewInterfaceImpl extends IntroduceNewInterfaceImpl implements PCM_IntroduceNewInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_IntroduceNewInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OperationInterface> getInterfaces() {
		return (EList<OperationInterface>)eDynamicGet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_INTERFACE__INTERFACES, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_INTERFACE__INTERFACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_INTERFACE__INTERFACES:
				return getInterfaces();
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_INTERFACE__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends OperationInterface>)newValue);
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_INTERFACE__INTERFACES:
				getInterfaces().clear();
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_INTERFACE__INTERFACES:
				return !getInterfaces().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCM_IntroduceNewInterfaceImpl
