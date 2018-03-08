/**
 */
package pcmarchoptions.impl;

import archoptions.impl.MoveComponentsImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.allocation.AllocationContext;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import pcmarchoptions.PCM_MoveComponents;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Move Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_MoveComponentsImpl#getAllocationContexts <em>Allocation Contexts</em>}</li>
 *   <li>{@link pcmarchoptions.impl.PCM_MoveComponentsImpl#getFromHwNode <em>From Hw Node</em>}</li>
 *   <li>{@link pcmarchoptions.impl.PCM_MoveComponentsImpl#getToHwNode <em>To Hw Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_MoveComponentsImpl extends MoveComponentsImpl implements PCM_MoveComponents {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_MoveComponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_MOVE_COMPONENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AllocationContext> getAllocationContexts() {
		return (EList<AllocationContext>)eDynamicGet(PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__ALLOCATION_CONTEXTS, PcmarchoptionsPackage.Literals.PCM_MOVE_COMPONENTS__ALLOCATION_CONTEXTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer getFromHwNode() {
		return (ResourceContainer)eDynamicGet(PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__FROM_HW_NODE, PcmarchoptionsPackage.Literals.PCM_MOVE_COMPONENTS__FROM_HW_NODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer basicGetFromHwNode() {
		return (ResourceContainer)eDynamicGet(PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__FROM_HW_NODE, PcmarchoptionsPackage.Literals.PCM_MOVE_COMPONENTS__FROM_HW_NODE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromHwNode(ResourceContainer newFromHwNode) {
		eDynamicSet(PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__FROM_HW_NODE, PcmarchoptionsPackage.Literals.PCM_MOVE_COMPONENTS__FROM_HW_NODE, newFromHwNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer getToHwNode() {
		return (ResourceContainer)eDynamicGet(PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__TO_HW_NODE, PcmarchoptionsPackage.Literals.PCM_MOVE_COMPONENTS__TO_HW_NODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer basicGetToHwNode() {
		return (ResourceContainer)eDynamicGet(PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__TO_HW_NODE, PcmarchoptionsPackage.Literals.PCM_MOVE_COMPONENTS__TO_HW_NODE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToHwNode(ResourceContainer newToHwNode) {
		eDynamicSet(PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__TO_HW_NODE, PcmarchoptionsPackage.Literals.PCM_MOVE_COMPONENTS__TO_HW_NODE, newToHwNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__ALLOCATION_CONTEXTS:
				return getAllocationContexts();
			case PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__FROM_HW_NODE:
				if (resolve) return getFromHwNode();
				return basicGetFromHwNode();
			case PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__TO_HW_NODE:
				if (resolve) return getToHwNode();
				return basicGetToHwNode();
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
			case PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__ALLOCATION_CONTEXTS:
				getAllocationContexts().clear();
				getAllocationContexts().addAll((Collection<? extends AllocationContext>)newValue);
				return;
			case PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__FROM_HW_NODE:
				setFromHwNode((ResourceContainer)newValue);
				return;
			case PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__TO_HW_NODE:
				setToHwNode((ResourceContainer)newValue);
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
			case PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__ALLOCATION_CONTEXTS:
				getAllocationContexts().clear();
				return;
			case PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__FROM_HW_NODE:
				setFromHwNode((ResourceContainer)null);
				return;
			case PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__TO_HW_NODE:
				setToHwNode((ResourceContainer)null);
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
			case PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__ALLOCATION_CONTEXTS:
				return !getAllocationContexts().isEmpty();
			case PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__FROM_HW_NODE:
				return basicGetFromHwNode() != null;
			case PcmarchoptionsPackage.PCM_MOVE_COMPONENTS__TO_HW_NODE:
				return basicGetToHwNode() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCM_MoveComponentsImpl
