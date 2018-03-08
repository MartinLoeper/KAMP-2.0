/**
 */
package requirements.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import requirements.RequirementsPackage;
import requirements.SystemRequirement;
import requirements.SystemRequirements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements.impl.SystemRequirementsImpl#getSystemRequirements <em>System Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemRequirementsImpl extends IdentifierImpl implements SystemRequirements {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.SYSTEM_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SystemRequirement> getSystemRequirements() {
		return (EList<SystemRequirement>)eDynamicGet(RequirementsPackage.SYSTEM_REQUIREMENTS__SYSTEM_REQUIREMENTS, RequirementsPackage.Literals.SYSTEM_REQUIREMENTS__SYSTEM_REQUIREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RequirementsPackage.SYSTEM_REQUIREMENTS__SYSTEM_REQUIREMENTS:
				return ((InternalEList<?>)getSystemRequirements()).basicRemove(otherEnd, msgs);
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
			case RequirementsPackage.SYSTEM_REQUIREMENTS__SYSTEM_REQUIREMENTS:
				return getSystemRequirements();
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
			case RequirementsPackage.SYSTEM_REQUIREMENTS__SYSTEM_REQUIREMENTS:
				getSystemRequirements().clear();
				getSystemRequirements().addAll((Collection<? extends SystemRequirement>)newValue);
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
			case RequirementsPackage.SYSTEM_REQUIREMENTS__SYSTEM_REQUIREMENTS:
				getSystemRequirements().clear();
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
			case RequirementsPackage.SYSTEM_REQUIREMENTS__SYSTEM_REQUIREMENTS:
				return !getSystemRequirements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemRequirementsImpl
