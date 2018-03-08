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

import relations.CouldResolveObject;
import relations.RelationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Could Resolve Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relations.impl.CouldResolveObjectImpl#getCouldResolve <em>Could Resolve</em>}</li>
 *   <li>{@link relations.impl.CouldResolveObjectImpl#getCouldBeResolvedBy <em>Could Be Resolved By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CouldResolveObjectImpl extends CDOObjectImpl implements CouldResolveObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CouldResolveObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationsPackage.Literals.COULD_RESOLVE_OBJECT;
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
	public EList<CouldResolveObject> getCouldResolve() {
		return (EList<CouldResolveObject>)eDynamicGet(RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_RESOLVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CouldResolveObject> getCouldBeResolvedBy() {
		return (EList<CouldResolveObject>)eDynamicGet(RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY, true, true);
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
			case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldResolve()).basicAdd(otherEnd, msgs);
			case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldBeResolvedBy()).basicAdd(otherEnd, msgs);
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
			case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE:
				return ((InternalEList<?>)getCouldResolve()).basicRemove(otherEnd, msgs);
			case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY:
				return ((InternalEList<?>)getCouldBeResolvedBy()).basicRemove(otherEnd, msgs);
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
			case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE:
				return getCouldResolve();
			case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY:
				return getCouldBeResolvedBy();
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
			case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE:
				getCouldResolve().clear();
				getCouldResolve().addAll((Collection<? extends CouldResolveObject>)newValue);
				return;
			case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
				getCouldBeResolvedBy().addAll((Collection<? extends CouldResolveObject>)newValue);
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
			case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE:
				getCouldResolve().clear();
				return;
			case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
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
			case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE:
				return !getCouldResolve().isEmpty();
			case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY:
				return !getCouldBeResolvedBy().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CouldResolveObjectImpl
