/**
 */
package relations.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import relations.RelationsPackage;
import relations.StakeholderObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stakeholder Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relations.impl.StakeholderObjectImpl#getStakeholderOf <em>Stakeholder Of</em>}</li>
 *   <li>{@link relations.impl.StakeholderObjectImpl#getHasStakeholders <em>Has Stakeholders</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StakeholderObjectImpl extends CDOObjectImpl implements StakeholderObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StakeholderObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationsPackage.Literals.STAKEHOLDER_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getStakeholderOf() {
		return (EList<StakeholderObject>)eDynamicGet(RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF, RelationsPackage.Literals.STAKEHOLDER_OBJECT__STAKEHOLDER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getHasStakeholders() {
		return (EList<StakeholderObject>)eDynamicGet(RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS, RelationsPackage.Literals.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStakeholderOf()).basicAdd(otherEnd, msgs);
			case RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasStakeholders()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF:
				return ((InternalEList<?>)getStakeholderOf()).basicRemove(otherEnd, msgs);
			case RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS:
				return ((InternalEList<?>)getHasStakeholders()).basicRemove(otherEnd, msgs);
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
			case RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF:
				return getStakeholderOf();
			case RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS:
				return getHasStakeholders();
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
			case RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				getStakeholderOf().addAll((Collection<? extends StakeholderObject>)newValue);
				return;
			case RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
				getHasStakeholders().addAll((Collection<? extends StakeholderObject>)newValue);
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
			case RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				return;
			case RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
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
			case RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF:
				return !getStakeholderOf().isEmpty();
			case RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS:
				return !getHasStakeholders().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StakeholderObjectImpl
