/**
 */
package pcmarchoptions.impl;

import archoptions.impl.NeverAllocateToSpecificNodesImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.allocation.AllocationContext;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import pcmarchoptions.PCM_NeverAllocateToSpecificNodes;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Never Allocate To Specific Nodes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_NeverAllocateToSpecificNodesImpl#getAllocationContexts <em>Allocation Contexts</em>}</li>
 *   <li>{@link pcmarchoptions.impl.PCM_NeverAllocateToSpecificNodesImpl#getHwNodes <em>Hw Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_NeverAllocateToSpecificNodesImpl extends NeverAllocateToSpecificNodesImpl implements PCM_NeverAllocateToSpecificNodes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_NeverAllocateToSpecificNodesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AllocationContext> getAllocationContexts() {
		return (EList<AllocationContext>)eDynamicGet(PcmarchoptionsPackage.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__ALLOCATION_CONTEXTS, PcmarchoptionsPackage.Literals.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__ALLOCATION_CONTEXTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResourceContainer> getHwNodes() {
		return (EList<ResourceContainer>)eDynamicGet(PcmarchoptionsPackage.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__HW_NODES, PcmarchoptionsPackage.Literals.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__HW_NODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__ALLOCATION_CONTEXTS:
				return getAllocationContexts();
			case PcmarchoptionsPackage.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__HW_NODES:
				return getHwNodes();
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
			case PcmarchoptionsPackage.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__ALLOCATION_CONTEXTS:
				getAllocationContexts().clear();
				getAllocationContexts().addAll((Collection<? extends AllocationContext>)newValue);
				return;
			case PcmarchoptionsPackage.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__HW_NODES:
				getHwNodes().clear();
				getHwNodes().addAll((Collection<? extends ResourceContainer>)newValue);
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
			case PcmarchoptionsPackage.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__ALLOCATION_CONTEXTS:
				getAllocationContexts().clear();
				return;
			case PcmarchoptionsPackage.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__HW_NODES:
				getHwNodes().clear();
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
			case PcmarchoptionsPackage.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__ALLOCATION_CONTEXTS:
				return !getAllocationContexts().isEmpty();
			case PcmarchoptionsPackage.PCM_NEVER_ALLOCATE_TO_SPECIFIC_NODES__HW_NODES:
				return !getHwNodes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCM_NeverAllocateToSpecificNodesImpl
