/**
 */
package pcmarchoptions.impl;

import archoptions.impl.MergeComponentsImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import pcmarchoptions.PCM_MergeComponents;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Merge Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_MergeComponentsImpl#getInitialContextsNameList <em>Initial Contexts Name List</em>}</li>
 *   <li>{@link pcmarchoptions.impl.PCM_MergeComponentsImpl#getFinalContext <em>Final Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_MergeComponentsImpl extends MergeComponentsImpl implements PCM_MergeComponents {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_MergeComponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_MERGE_COMPONENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getInitialContextsNameList() {
		return (EList<String>)eDynamicGet(PcmarchoptionsPackage.PCM_MERGE_COMPONENTS__INITIAL_CONTEXTS_NAME_LIST, PcmarchoptionsPackage.Literals.PCM_MERGE_COMPONENTS__INITIAL_CONTEXTS_NAME_LIST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext getFinalContext() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_MERGE_COMPONENTS__FINAL_CONTEXT, PcmarchoptionsPackage.Literals.PCM_MERGE_COMPONENTS__FINAL_CONTEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyContext basicGetFinalContext() {
		return (AssemblyContext)eDynamicGet(PcmarchoptionsPackage.PCM_MERGE_COMPONENTS__FINAL_CONTEXT, PcmarchoptionsPackage.Literals.PCM_MERGE_COMPONENTS__FINAL_CONTEXT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalContext(AssemblyContext newFinalContext) {
		eDynamicSet(PcmarchoptionsPackage.PCM_MERGE_COMPONENTS__FINAL_CONTEXT, PcmarchoptionsPackage.Literals.PCM_MERGE_COMPONENTS__FINAL_CONTEXT, newFinalContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_MERGE_COMPONENTS__INITIAL_CONTEXTS_NAME_LIST:
				return getInitialContextsNameList();
			case PcmarchoptionsPackage.PCM_MERGE_COMPONENTS__FINAL_CONTEXT:
				if (resolve) return getFinalContext();
				return basicGetFinalContext();
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
			case PcmarchoptionsPackage.PCM_MERGE_COMPONENTS__INITIAL_CONTEXTS_NAME_LIST:
				getInitialContextsNameList().clear();
				getInitialContextsNameList().addAll((Collection<? extends String>)newValue);
				return;
			case PcmarchoptionsPackage.PCM_MERGE_COMPONENTS__FINAL_CONTEXT:
				setFinalContext((AssemblyContext)newValue);
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
			case PcmarchoptionsPackage.PCM_MERGE_COMPONENTS__INITIAL_CONTEXTS_NAME_LIST:
				getInitialContextsNameList().clear();
				return;
			case PcmarchoptionsPackage.PCM_MERGE_COMPONENTS__FINAL_CONTEXT:
				setFinalContext((AssemblyContext)null);
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
			case PcmarchoptionsPackage.PCM_MERGE_COMPONENTS__INITIAL_CONTEXTS_NAME_LIST:
				return !getInitialContextsNameList().isEmpty();
			case PcmarchoptionsPackage.PCM_MERGE_COMPONENTS__FINAL_CONTEXT:
				return basicGetFinalContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //PCM_MergeComponentsImpl
