/**
 */
package pcmarchoptions.impl;

import archoptions.impl.ReplaceComponentsImpl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import pcmarchoptions.PCM_ReplaceComponents;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Replace Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_ReplaceComponentsImpl#getContextsReplacedWith <em>Contexts Replaced With</em>}</li>
 *   <li>{@link pcmarchoptions.impl.PCM_ReplaceComponentsImpl#getReplacedContextNames <em>Replaced Context Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_ReplaceComponentsImpl extends ReplaceComponentsImpl implements PCM_ReplaceComponents {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_ReplaceComponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_REPLACE_COMPONENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AssemblyContext> getContextsReplacedWith() {
		return (EList<AssemblyContext>)eDynamicGet(PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__CONTEXTS_REPLACED_WITH, PcmarchoptionsPackage.Literals.PCM_REPLACE_COMPONENTS__CONTEXTS_REPLACED_WITH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getReplacedContextNames() {
		return (EList<String>)eDynamicGet(PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAMES, PcmarchoptionsPackage.Literals.PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__CONTEXTS_REPLACED_WITH:
				return getContextsReplacedWith();
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAMES:
				return getReplacedContextNames();
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
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__CONTEXTS_REPLACED_WITH:
				getContextsReplacedWith().clear();
				getContextsReplacedWith().addAll((Collection<? extends AssemblyContext>)newValue);
				return;
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAMES:
				getReplacedContextNames().clear();
				getReplacedContextNames().addAll((Collection<? extends String>)newValue);
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
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__CONTEXTS_REPLACED_WITH:
				getContextsReplacedWith().clear();
				return;
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAMES:
				getReplacedContextNames().clear();
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
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__CONTEXTS_REPLACED_WITH:
				return !getContextsReplacedWith().isEmpty();
			case PcmarchoptionsPackage.PCM_REPLACE_COMPONENTS__REPLACED_CONTEXT_NAMES:
				return !getReplacedContextNames().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCM_ReplaceComponentsImpl
