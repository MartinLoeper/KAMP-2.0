/**
 */
package pcmarchoptions.impl;

import archoptions.impl.IntroduceNewAdapterImpl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import pcmarchoptions.PCM_IntroduceNewAdapter;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Introduce New Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_IntroduceNewAdapterImpl#getAdapterContext <em>Adapter Context</em>}</li>
 *   <li>{@link pcmarchoptions.impl.PCM_IntroduceNewAdapterImpl#getContextBeingAdapted <em>Context Being Adapted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_IntroduceNewAdapterImpl extends IntroduceNewAdapterImpl implements PCM_IntroduceNewAdapter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_IntroduceNewAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getAdapterContext() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER__ADAPTER_CONTEXT, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_ADAPTER__ADAPTER_CONTEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetAdapterContext() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER__ADAPTER_CONTEXT, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_ADAPTER__ADAPTER_CONTEXT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdapterContext(AssemblyContext newAdapterContext) {
		eDynamicSet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER__ADAPTER_CONTEXT, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_ADAPTER__ADAPTER_CONTEXT, newAdapterContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getContextBeingAdapted() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER__CONTEXT_BEING_ADAPTED, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_ADAPTER__CONTEXT_BEING_ADAPTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetContextBeingAdapted() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER__CONTEXT_BEING_ADAPTED, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_ADAPTER__CONTEXT_BEING_ADAPTED, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextBeingAdapted(AssemblyContext newContextBeingAdapted) {
		eDynamicSet(PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER__CONTEXT_BEING_ADAPTED, PcmarchoptionsPackage.Literals.PCM_INTRODUCE_NEW_ADAPTER__CONTEXT_BEING_ADAPTED, newContextBeingAdapted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER__ADAPTER_CONTEXT:
				if (resolve) return getAdapterContext();
				return basicGetAdapterContext();
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER__CONTEXT_BEING_ADAPTED:
				if (resolve) return getContextBeingAdapted();
				return basicGetContextBeingAdapted();
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER__ADAPTER_CONTEXT:
				setAdapterContext((AssemblyContext)newValue);
				return;
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER__CONTEXT_BEING_ADAPTED:
				setContextBeingAdapted((AssemblyContext)newValue);
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER__ADAPTER_CONTEXT:
				setAdapterContext((AssemblyContext)null);
				return;
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER__CONTEXT_BEING_ADAPTED:
				setContextBeingAdapted((AssemblyContext)null);
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
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER__ADAPTER_CONTEXT:
				return basicGetAdapterContext() != null;
			case PcmarchoptionsPackage.PCM_INTRODUCE_NEW_ADAPTER__CONTEXT_BEING_ADAPTED:
				return basicGetContextBeingAdapted() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCM_IntroduceNewAdapterImpl
