/**
 */
package effects.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import effects.Effect;
import effects.EffectType;
import effects.EffectsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link effects.impl.EffectImpl#getEffectType <em>Effect Type</em>}</li>
 *   <li>{@link effects.impl.EffectImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EffectImpl extends IdentifierImpl implements Effect {
	/**
	 * The default value of the '{@link #getEffectType() <em>Effect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectType()
	 * @generated
	 * @ordered
	 */
	protected static final EffectType EFFECT_TYPE_EDEFAULT = EffectType.NEUTRAL;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EffectsPackage.Literals.EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectType getEffectType() {
		return (EffectType)eDynamicGet(EffectsPackage.EFFECT__EFFECT_TYPE, EffectsPackage.Literals.EFFECT__EFFECT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectType(EffectType newEffectType) {
		eDynamicSet(EffectsPackage.EFFECT__EFFECT_TYPE, EffectsPackage.Literals.EFFECT__EFFECT_TYPE, newEffectType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(EffectsPackage.EFFECT__DESCRIPTION, EffectsPackage.Literals.EFFECT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(EffectsPackage.EFFECT__DESCRIPTION, EffectsPackage.Literals.EFFECT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EffectsPackage.EFFECT__EFFECT_TYPE:
				return getEffectType();
			case EffectsPackage.EFFECT__DESCRIPTION:
				return getDescription();
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
			case EffectsPackage.EFFECT__EFFECT_TYPE:
				setEffectType((EffectType)newValue);
				return;
			case EffectsPackage.EFFECT__DESCRIPTION:
				setDescription((String)newValue);
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
			case EffectsPackage.EFFECT__EFFECT_TYPE:
				setEffectType(EFFECT_TYPE_EDEFAULT);
				return;
			case EffectsPackage.EFFECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case EffectsPackage.EFFECT__EFFECT_TYPE:
				return getEffectType() != EFFECT_TYPE_EDEFAULT;
			case EffectsPackage.EFFECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

} //EffectImpl
