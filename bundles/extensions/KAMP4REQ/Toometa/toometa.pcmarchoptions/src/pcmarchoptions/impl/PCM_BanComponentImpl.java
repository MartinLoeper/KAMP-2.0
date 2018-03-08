/**
 */
package pcmarchoptions.impl;

import archoptions.impl.BanComponentImpl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import pcmarchoptions.PCM_BanComponent;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Ban Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_BanComponentImpl#getBannedContextNames <em>Banned Context Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_BanComponentImpl extends BanComponentImpl implements PCM_BanComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_BanComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_BAN_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getBannedContextNames() {
		return (EList<String>)eDynamicGet(PcmarchoptionsPackage.PCM_BAN_COMPONENT__BANNED_CONTEXT_NAMES, PcmarchoptionsPackage.Literals.PCM_BAN_COMPONENT__BANNED_CONTEXT_NAMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_BAN_COMPONENT__BANNED_CONTEXT_NAMES:
				return getBannedContextNames();
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
			case PcmarchoptionsPackage.PCM_BAN_COMPONENT__BANNED_CONTEXT_NAMES:
				getBannedContextNames().clear();
				getBannedContextNames().addAll((Collection<? extends String>)newValue);
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
			case PcmarchoptionsPackage.PCM_BAN_COMPONENT__BANNED_CONTEXT_NAMES:
				getBannedContextNames().clear();
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
			case PcmarchoptionsPackage.PCM_BAN_COMPONENT__BANNED_CONTEXT_NAMES:
				return !getBannedContextNames().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCM_BanComponentImpl
