/**
 */
package pcmarchoptions.impl;

import archoptions.impl.OnlySingleAllocationImpl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.allocation.AllocationContext;

import pcmarchoptions.PCM_OnlySingleAllocation;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Only Single Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_OnlySingleAllocationImpl#getAllocationContexts <em>Allocation Contexts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_OnlySingleAllocationImpl extends OnlySingleAllocationImpl implements PCM_OnlySingleAllocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_OnlySingleAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_ONLY_SINGLE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AllocationContext> getAllocationContexts() {
		return (EList<AllocationContext>)eDynamicGet(PcmarchoptionsPackage.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXTS, PcmarchoptionsPackage.Literals.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXTS:
				return getAllocationContexts();
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
			case PcmarchoptionsPackage.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXTS:
				getAllocationContexts().clear();
				getAllocationContexts().addAll((Collection<? extends AllocationContext>)newValue);
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
			case PcmarchoptionsPackage.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXTS:
				getAllocationContexts().clear();
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
			case PcmarchoptionsPackage.PCM_ONLY_SINGLE_ALLOCATION__ALLOCATION_CONTEXTS:
				return !getAllocationContexts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCM_OnlySingleAllocationImpl
