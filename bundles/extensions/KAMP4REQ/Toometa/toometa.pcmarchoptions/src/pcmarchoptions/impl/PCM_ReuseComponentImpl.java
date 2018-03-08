/**
 */
package pcmarchoptions.impl;

import archoptions.impl.ReuseComponentImpl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import pcmarchoptions.PCM_ReuseComponent;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Reuse Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_ReuseComponentImpl#getAssemblyContexts <em>Assembly Contexts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_ReuseComponentImpl extends ReuseComponentImpl implements PCM_ReuseComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_ReuseComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_REUSE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AssemblyContext> getAssemblyContexts() {
		return (EList<AssemblyContext>)eDynamicGet(PcmarchoptionsPackage.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXTS, PcmarchoptionsPackage.Literals.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXTS:
				return getAssemblyContexts();
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
			case PcmarchoptionsPackage.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXTS:
				getAssemblyContexts().clear();
				getAssemblyContexts().addAll((Collection<? extends AssemblyContext>)newValue);
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
			case PcmarchoptionsPackage.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXTS:
				getAssemblyContexts().clear();
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
			case PcmarchoptionsPackage.PCM_REUSE_COMPONENT__ASSEMBLY_CONTEXTS:
				return !getAssemblyContexts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCM_ReuseComponentImpl
