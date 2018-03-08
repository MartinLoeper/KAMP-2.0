/**
 */
package effects.impl;

import effects.EffectsPackage;
import effects.QualityEffect;

import org.eclipse.emf.ecore.EClass;

import qualities.QualityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link effects.impl.QualityEffectImpl#getQualityType <em>Quality Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityEffectImpl extends EffectImpl implements QualityEffect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EffectsPackage.Literals.QUALITY_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityType getQualityType() {
		return (QualityType)eDynamicGet(EffectsPackage.QUALITY_EFFECT__QUALITY_TYPE, EffectsPackage.Literals.QUALITY_EFFECT__QUALITY_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityType basicGetQualityType() {
		return (QualityType)eDynamicGet(EffectsPackage.QUALITY_EFFECT__QUALITY_TYPE, EffectsPackage.Literals.QUALITY_EFFECT__QUALITY_TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualityType(QualityType newQualityType) {
		eDynamicSet(EffectsPackage.QUALITY_EFFECT__QUALITY_TYPE, EffectsPackage.Literals.QUALITY_EFFECT__QUALITY_TYPE, newQualityType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EffectsPackage.QUALITY_EFFECT__QUALITY_TYPE:
				if (resolve) return getQualityType();
				return basicGetQualityType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EffectsPackage.QUALITY_EFFECT__QUALITY_TYPE:
				setQualityType((QualityType)newValue);
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
			case EffectsPackage.QUALITY_EFFECT__QUALITY_TYPE:
				setQualityType((QualityType)null);
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
			case EffectsPackage.QUALITY_EFFECT__QUALITY_TYPE:
				return basicGetQualityType() != null;
		}
		return super.eIsSet(featureID);
	}

} //QualityEffectImpl
