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

import relations.ConflictObject;
import relations.RelationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conflict Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relations.impl.ConflictObjectImpl#getConflictsWith <em>Conflicts With</em>}</li>
 *   <li>{@link relations.impl.ConflictObjectImpl#getHasConflicts <em>Has Conflicts</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConflictObjectImpl extends CDOObjectImpl implements ConflictObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConflictObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationsPackage.Literals.CONFLICT_OBJECT;
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
	public EList<ConflictObject> getConflictsWith() {
		return (EList<ConflictObject>)eDynamicGet(RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH, RelationsPackage.Literals.CONFLICT_OBJECT__CONFLICTS_WITH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConflictObject> getHasConflicts() {
		return (EList<ConflictObject>)eDynamicGet(RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS, RelationsPackage.Literals.CONFLICT_OBJECT__HAS_CONFLICTS, true, true);
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
			case RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConflictsWith()).basicAdd(otherEnd, msgs);
			case RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasConflicts()).basicAdd(otherEnd, msgs);
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
			case RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH:
				return ((InternalEList<?>)getConflictsWith()).basicRemove(otherEnd, msgs);
			case RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS:
				return ((InternalEList<?>)getHasConflicts()).basicRemove(otherEnd, msgs);
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
			case RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH:
				return getConflictsWith();
			case RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS:
				return getHasConflicts();
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
			case RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH:
				getConflictsWith().clear();
				getConflictsWith().addAll((Collection<? extends ConflictObject>)newValue);
				return;
			case RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS:
				getHasConflicts().clear();
				getHasConflicts().addAll((Collection<? extends ConflictObject>)newValue);
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
			case RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH:
				getConflictsWith().clear();
				return;
			case RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS:
				getHasConflicts().clear();
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
			case RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH:
				return !getConflictsWith().isEmpty();
			case RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS:
				return !getHasConflicts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConflictObjectImpl
