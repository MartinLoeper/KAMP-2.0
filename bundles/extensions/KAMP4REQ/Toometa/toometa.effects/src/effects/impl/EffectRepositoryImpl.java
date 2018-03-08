/**
 */
package effects.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import effects.Effect;
import effects.EffectCategory;
import effects.EffectRepository;
import effects.EffectsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link effects.impl.EffectRepositoryImpl#getKnownEffects <em>Known Effects</em>}</li>
 *   <li>{@link effects.impl.EffectRepositoryImpl#getEffectCategories <em>Effect Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EffectRepositoryImpl extends IdentifierImpl implements EffectRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EffectsPackage.Literals.EFFECT_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Effect> getKnownEffects() {
		return (EList<Effect>)eDynamicGet(EffectsPackage.EFFECT_REPOSITORY__KNOWN_EFFECTS, EffectsPackage.Literals.EFFECT_REPOSITORY__KNOWN_EFFECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EffectCategory> getEffectCategories() {
		return (EList<EffectCategory>)eDynamicGet(EffectsPackage.EFFECT_REPOSITORY__EFFECT_CATEGORIES, EffectsPackage.Literals.EFFECT_REPOSITORY__EFFECT_CATEGORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EffectsPackage.EFFECT_REPOSITORY__KNOWN_EFFECTS:
				return ((InternalEList<?>)getKnownEffects()).basicRemove(otherEnd, msgs);
			case EffectsPackage.EFFECT_REPOSITORY__EFFECT_CATEGORIES:
				return ((InternalEList<?>)getEffectCategories()).basicRemove(otherEnd, msgs);
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
			case EffectsPackage.EFFECT_REPOSITORY__KNOWN_EFFECTS:
				return getKnownEffects();
			case EffectsPackage.EFFECT_REPOSITORY__EFFECT_CATEGORIES:
				return getEffectCategories();
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
			case EffectsPackage.EFFECT_REPOSITORY__KNOWN_EFFECTS:
				getKnownEffects().clear();
				getKnownEffects().addAll((Collection<? extends Effect>)newValue);
				return;
			case EffectsPackage.EFFECT_REPOSITORY__EFFECT_CATEGORIES:
				getEffectCategories().clear();
				getEffectCategories().addAll((Collection<? extends EffectCategory>)newValue);
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
			case EffectsPackage.EFFECT_REPOSITORY__KNOWN_EFFECTS:
				getKnownEffects().clear();
				return;
			case EffectsPackage.EFFECT_REPOSITORY__EFFECT_CATEGORIES:
				getEffectCategories().clear();
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
			case EffectsPackage.EFFECT_REPOSITORY__KNOWN_EFFECTS:
				return !getKnownEffects().isEmpty();
			case EffectsPackage.EFFECT_REPOSITORY__EFFECT_CATEGORIES:
				return !getEffectCategories().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EffectRepositoryImpl
