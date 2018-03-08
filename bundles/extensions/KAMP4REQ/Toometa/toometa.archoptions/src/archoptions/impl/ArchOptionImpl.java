/**
 */
package archoptions.impl;

import archoptions.ArchOption;
import archoptions.ArchoptionsPackage;

import java.util.Collection;

import options.AnalysisRationale;

import options.impl.OptionImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arch Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link archoptions.impl.ArchOptionImpl#getAnalysisRationale <em>Analysis Rationale</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArchOptionImpl extends OptionImpl implements ArchOption {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchoptionsPackage.Literals.ARCH_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AnalysisRationale> getAnalysisRationale() {
		return (EList<AnalysisRationale>)eDynamicGet(ArchoptionsPackage.ARCH_OPTION__ANALYSIS_RATIONALE, ArchoptionsPackage.Literals.ARCH_OPTION__ANALYSIS_RATIONALE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchoptionsPackage.ARCH_OPTION__ANALYSIS_RATIONALE:
				return ((InternalEList<?>)getAnalysisRationale()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchoptionsPackage.ARCH_OPTION__ANALYSIS_RATIONALE:
				return getAnalysisRationale();
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
			case ArchoptionsPackage.ARCH_OPTION__ANALYSIS_RATIONALE:
				getAnalysisRationale().clear();
				getAnalysisRationale().addAll((Collection<? extends AnalysisRationale>)newValue);
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
			case ArchoptionsPackage.ARCH_OPTION__ANALYSIS_RATIONALE:
				getAnalysisRationale().clear();
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
			case ArchoptionsPackage.ARCH_OPTION__ANALYSIS_RATIONALE:
				return !getAnalysisRationale().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchOptionImpl
