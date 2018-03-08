/**
 */
package archoptions.impl;

import archoptions.ArchCandidate;
import archoptions.ArchOption;
import archoptions.ArchoptionsPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arch Candidate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link archoptions.impl.ArchCandidateImpl#getSubOptions <em>Sub Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArchCandidateImpl extends ArchOptionImpl implements ArchCandidate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchCandidateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchoptionsPackage.Literals.ARCH_CANDIDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ArchOption> getSubOptions() {
		return (EList<ArchOption>)eDynamicGet(ArchoptionsPackage.ARCH_CANDIDATE__SUB_OPTIONS, ArchoptionsPackage.Literals.ARCH_CANDIDATE__SUB_OPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchoptionsPackage.ARCH_CANDIDATE__SUB_OPTIONS:
				return getSubOptions();
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
			case ArchoptionsPackage.ARCH_CANDIDATE__SUB_OPTIONS:
				getSubOptions().clear();
				getSubOptions().addAll((Collection<? extends ArchOption>)newValue);
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
			case ArchoptionsPackage.ARCH_CANDIDATE__SUB_OPTIONS:
				getSubOptions().clear();
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
			case ArchoptionsPackage.ARCH_CANDIDATE__SUB_OPTIONS:
				return !getSubOptions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchCandidateImpl
