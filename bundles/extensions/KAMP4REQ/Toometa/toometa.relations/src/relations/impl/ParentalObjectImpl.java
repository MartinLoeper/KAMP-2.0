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

import relations.ParentalObject;
import relations.RelationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parental Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relations.impl.ParentalObjectImpl#getParentOf <em>Parent Of</em>}</li>
 *   <li>{@link relations.impl.ParentalObjectImpl#getSubpartOf <em>Subpart Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParentalObjectImpl extends CDOObjectImpl implements ParentalObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParentalObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationsPackage.Literals.PARENTAL_OBJECT;
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
	public EList<ParentalObject> getParentOf() {
		return (EList<ParentalObject>)eDynamicGet(RelationsPackage.PARENTAL_OBJECT__PARENT_OF, RelationsPackage.Literals.PARENTAL_OBJECT__PARENT_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParentalObject> getSubpartOf() {
		return (EList<ParentalObject>)eDynamicGet(RelationsPackage.PARENTAL_OBJECT__SUBPART_OF, RelationsPackage.Literals.PARENTAL_OBJECT__SUBPART_OF, true, true);
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
			case RelationsPackage.PARENTAL_OBJECT__PARENT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentOf()).basicAdd(otherEnd, msgs);
			case RelationsPackage.PARENTAL_OBJECT__SUBPART_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubpartOf()).basicAdd(otherEnd, msgs);
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
			case RelationsPackage.PARENTAL_OBJECT__PARENT_OF:
				return ((InternalEList<?>)getParentOf()).basicRemove(otherEnd, msgs);
			case RelationsPackage.PARENTAL_OBJECT__SUBPART_OF:
				return ((InternalEList<?>)getSubpartOf()).basicRemove(otherEnd, msgs);
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
			case RelationsPackage.PARENTAL_OBJECT__PARENT_OF:
				return getParentOf();
			case RelationsPackage.PARENTAL_OBJECT__SUBPART_OF:
				return getSubpartOf();
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
			case RelationsPackage.PARENTAL_OBJECT__PARENT_OF:
				getParentOf().clear();
				getParentOf().addAll((Collection<? extends ParentalObject>)newValue);
				return;
			case RelationsPackage.PARENTAL_OBJECT__SUBPART_OF:
				getSubpartOf().clear();
				getSubpartOf().addAll((Collection<? extends ParentalObject>)newValue);
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
			case RelationsPackage.PARENTAL_OBJECT__PARENT_OF:
				getParentOf().clear();
				return;
			case RelationsPackage.PARENTAL_OBJECT__SUBPART_OF:
				getSubpartOf().clear();
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
			case RelationsPackage.PARENTAL_OBJECT__PARENT_OF:
				return !getParentOf().isEmpty();
			case RelationsPackage.PARENTAL_OBJECT__SUBPART_OF:
				return !getSubpartOf().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParentalObjectImpl
