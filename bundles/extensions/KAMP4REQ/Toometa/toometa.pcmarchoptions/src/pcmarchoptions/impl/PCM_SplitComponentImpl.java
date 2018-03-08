/**
 */
package pcmarchoptions.impl;

import archoptions.impl.SplitComponentImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import pcmarchoptions.PCM_SplitComponent;
import pcmarchoptions.PcmarchoptionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Split Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.impl.PCM_SplitComponentImpl#getInitialContextName <em>Initial Context Name</em>}</li>
 *   <li>{@link pcmarchoptions.impl.PCM_SplitComponentImpl#getFinalContexts <em>Final Contexts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCM_SplitComponentImpl extends SplitComponentImpl implements PCM_SplitComponent {
	/**
	 * The default value of the '{@link #getInitialContextName() <em>Initial Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialContextName()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_CONTEXT_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCM_SplitComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmarchoptionsPackage.Literals.PCM_SPLIT_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialContextName() {
		return (String)eDynamicGet(PcmarchoptionsPackage.PCM_SPLIT_COMPONENT__INITIAL_CONTEXT_NAME, PcmarchoptionsPackage.Literals.PCM_SPLIT_COMPONENT__INITIAL_CONTEXT_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialContextName(String newInitialContextName) {
		eDynamicSet(PcmarchoptionsPackage.PCM_SPLIT_COMPONENT__INITIAL_CONTEXT_NAME, PcmarchoptionsPackage.Literals.PCM_SPLIT_COMPONENT__INITIAL_CONTEXT_NAME, newInitialContextName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AssemblyContext> getFinalContexts() {
		return (EList<AssemblyContext>)eDynamicGet(PcmarchoptionsPackage.PCM_SPLIT_COMPONENT__FINAL_CONTEXTS, PcmarchoptionsPackage.Literals.PCM_SPLIT_COMPONENT__FINAL_CONTEXTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcmarchoptionsPackage.PCM_SPLIT_COMPONENT__INITIAL_CONTEXT_NAME:
				return getInitialContextName();
			case PcmarchoptionsPackage.PCM_SPLIT_COMPONENT__FINAL_CONTEXTS:
				return getFinalContexts();
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
			case PcmarchoptionsPackage.PCM_SPLIT_COMPONENT__INITIAL_CONTEXT_NAME:
				setInitialContextName((String)newValue);
				return;
			case PcmarchoptionsPackage.PCM_SPLIT_COMPONENT__FINAL_CONTEXTS:
				getFinalContexts().clear();
				getFinalContexts().addAll((Collection<? extends AssemblyContext>)newValue);
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
			case PcmarchoptionsPackage.PCM_SPLIT_COMPONENT__INITIAL_CONTEXT_NAME:
				setInitialContextName(INITIAL_CONTEXT_NAME_EDEFAULT);
				return;
			case PcmarchoptionsPackage.PCM_SPLIT_COMPONENT__FINAL_CONTEXTS:
				getFinalContexts().clear();
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
			case PcmarchoptionsPackage.PCM_SPLIT_COMPONENT__INITIAL_CONTEXT_NAME:
				return INITIAL_CONTEXT_NAME_EDEFAULT == null ? getInitialContextName() != null : !INITIAL_CONTEXT_NAME_EDEFAULT.equals(getInitialContextName());
			case PcmarchoptionsPackage.PCM_SPLIT_COMPONENT__FINAL_CONTEXTS:
				return !getFinalContexts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCM_SplitComponentImpl
