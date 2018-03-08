/**
 */
package effects.impl;

import effects.CategoryEffect;
import effects.EffectCategory;
import effects.EffectsPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link effects.impl.CategoryEffectImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryEffectImpl extends EffectImpl implements CategoryEffect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EffectsPackage.Literals.CATEGORY_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EffectCategory> getCategory() {
		return (EList<EffectCategory>)eDynamicGet(EffectsPackage.CATEGORY_EFFECT__CATEGORY, EffectsPackage.Literals.CATEGORY_EFFECT__CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EffectsPackage.CATEGORY_EFFECT__CATEGORY:
				return getCategory();
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
			case EffectsPackage.CATEGORY_EFFECT__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends EffectCategory>)newValue);
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
			case EffectsPackage.CATEGORY_EFFECT__CATEGORY:
				getCategory().clear();
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
			case EffectsPackage.CATEGORY_EFFECT__CATEGORY:
				return !getCategory().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CategoryEffectImpl
