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
import relations.ResolveObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolve Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relations.impl.ResolveObjectImpl#getResolves <em>Resolves</em>}</li>
 *   <li>{@link relations.impl.ResolveObjectImpl#getResolvedBy <em>Resolved By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResolveObjectImpl extends CDOObjectImpl implements ResolveObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolveObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationsPackage.Literals.RESOLVE_OBJECT;
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
	public EList<ResolveObject> getResolves() {
		return (EList<ResolveObject>)eDynamicGet(RelationsPackage.RESOLVE_OBJECT__RESOLVES, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResolveObject> getResolvedBy() {
		return (EList<ResolveObject>)eDynamicGet(RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVED_BY, true, true);
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
			case RelationsPackage.RESOLVE_OBJECT__RESOLVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolves()).basicAdd(otherEnd, msgs);
			case RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolvedBy()).basicAdd(otherEnd, msgs);
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
			case RelationsPackage.RESOLVE_OBJECT__RESOLVES:
				return ((InternalEList<?>)getResolves()).basicRemove(otherEnd, msgs);
			case RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY:
				return ((InternalEList<?>)getResolvedBy()).basicRemove(otherEnd, msgs);
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
			case RelationsPackage.RESOLVE_OBJECT__RESOLVES:
				return getResolves();
			case RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY:
				return getResolvedBy();
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
			case RelationsPackage.RESOLVE_OBJECT__RESOLVES:
				getResolves().clear();
				getResolves().addAll((Collection<? extends ResolveObject>)newValue);
				return;
			case RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY:
				getResolvedBy().clear();
				getResolvedBy().addAll((Collection<? extends ResolveObject>)newValue);
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
			case RelationsPackage.RESOLVE_OBJECT__RESOLVES:
				getResolves().clear();
				return;
			case RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY:
				getResolvedBy().clear();
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
			case RelationsPackage.RESOLVE_OBJECT__RESOLVES:
				return !getResolves().isEmpty();
			case RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY:
				return !getResolvedBy().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResolveObjectImpl
