/**
 */
package options.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import options.OptionsPackage;
import options.Rationale;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rationale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link options.impl.RationaleImpl#getRationaleText <em>Rationale Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RationaleImpl extends IdentifierImpl implements Rationale {
	/**
	 * The default value of the '{@link #getRationaleText() <em>Rationale Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationaleText()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_TEXT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RationaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionsPackage.Literals.RATIONALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRationaleText() {
		return (String)eDynamicGet(OptionsPackage.RATIONALE__RATIONALE_TEXT, OptionsPackage.Literals.RATIONALE__RATIONALE_TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationaleText(String newRationaleText) {
		eDynamicSet(OptionsPackage.RATIONALE__RATIONALE_TEXT, OptionsPackage.Literals.RATIONALE__RATIONALE_TEXT, newRationaleText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptionsPackage.RATIONALE__RATIONALE_TEXT:
				return getRationaleText();
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
			case OptionsPackage.RATIONALE__RATIONALE_TEXT:
				setRationaleText((String)newValue);
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
			case OptionsPackage.RATIONALE__RATIONALE_TEXT:
				setRationaleText(RATIONALE_TEXT_EDEFAULT);
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
			case OptionsPackage.RATIONALE__RATIONALE_TEXT:
				return RATIONALE_TEXT_EDEFAULT == null ? getRationaleText() != null : !RATIONALE_TEXT_EDEFAULT.equals(getRationaleText());
		}
		return super.eIsSet(featureID);
	}

} //RationaleImpl
