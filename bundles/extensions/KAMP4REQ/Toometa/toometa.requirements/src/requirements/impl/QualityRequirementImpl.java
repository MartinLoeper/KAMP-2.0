/**
 */
package requirements.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import qualities.QualityType;

import requirements.QualityRequirement;
import requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements.impl.QualityRequirementImpl#getQualityType <em>Quality Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityRequirementImpl extends SystemRequirementImpl implements QualityRequirement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.QUALITY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<QualityType> getQualityType() {
		return (EList<QualityType>)eDynamicGet(RequirementsPackage.QUALITY_REQUIREMENT__QUALITY_TYPE, RequirementsPackage.Literals.QUALITY_REQUIREMENT__QUALITY_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.QUALITY_REQUIREMENT__QUALITY_TYPE:
				return getQualityType();
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
			case RequirementsPackage.QUALITY_REQUIREMENT__QUALITY_TYPE:
				getQualityType().clear();
				getQualityType().addAll((Collection<? extends QualityType>)newValue);
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
			case RequirementsPackage.QUALITY_REQUIREMENT__QUALITY_TYPE:
				getQualityType().clear();
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
			case RequirementsPackage.QUALITY_REQUIREMENT__QUALITY_TYPE:
				return !getQualityType().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QualityRequirementImpl
