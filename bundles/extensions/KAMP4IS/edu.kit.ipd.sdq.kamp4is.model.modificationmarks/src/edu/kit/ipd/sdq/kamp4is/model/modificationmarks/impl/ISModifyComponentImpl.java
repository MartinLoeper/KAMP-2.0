/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyProvidedRole;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRequiredRole;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Modify Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyComponentImpl#getProvidedRoleModifications <em>Provided Role Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyComponentImpl#getRequiredRoleModifications <em>Required Role Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISModifyComponentImpl extends ISModifyEntityImpl<RepositoryComponent> implements ISModifyComponent {
	/**
	 * The cached value of the '{@link #getProvidedRoleModifications() <em>Provided Role Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRoleModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ISModifyProvidedRole> providedRoleModifications;

	/**
	 * The cached value of the '{@link #getRequiredRoleModifications() <em>Required Role Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRoleModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ISModifyRequiredRole> requiredRoleModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISModifyComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISModificationmarksPackage.Literals.IS_MODIFY_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISModifyProvidedRole> getProvidedRoleModifications() {
		if (providedRoleModifications == null) {
			providedRoleModifications = new EObjectContainmentEList<ISModifyProvidedRole>(ISModifyProvidedRole.class, this, ISModificationmarksPackage.IS_MODIFY_COMPONENT__PROVIDED_ROLE_MODIFICATIONS);
		}
		return providedRoleModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISModifyRequiredRole> getRequiredRoleModifications() {
		if (requiredRoleModifications == null) {
			requiredRoleModifications = new EObjectContainmentEList<ISModifyRequiredRole>(ISModifyRequiredRole.class, this, ISModificationmarksPackage.IS_MODIFY_COMPONENT__REQUIRED_ROLE_MODIFICATIONS);
		}
		return requiredRoleModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ISModificationmarksPackage.IS_MODIFY_COMPONENT__PROVIDED_ROLE_MODIFICATIONS:
				return ((InternalEList<?>)getProvidedRoleModifications()).basicRemove(otherEnd, msgs);
			case ISModificationmarksPackage.IS_MODIFY_COMPONENT__REQUIRED_ROLE_MODIFICATIONS:
				return ((InternalEList<?>)getRequiredRoleModifications()).basicRemove(otherEnd, msgs);
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
			case ISModificationmarksPackage.IS_MODIFY_COMPONENT__PROVIDED_ROLE_MODIFICATIONS:
				return getProvidedRoleModifications();
			case ISModificationmarksPackage.IS_MODIFY_COMPONENT__REQUIRED_ROLE_MODIFICATIONS:
				return getRequiredRoleModifications();
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
			case ISModificationmarksPackage.IS_MODIFY_COMPONENT__PROVIDED_ROLE_MODIFICATIONS:
				getProvidedRoleModifications().clear();
				getProvidedRoleModifications().addAll((Collection<? extends ISModifyProvidedRole>)newValue);
				return;
			case ISModificationmarksPackage.IS_MODIFY_COMPONENT__REQUIRED_ROLE_MODIFICATIONS:
				getRequiredRoleModifications().clear();
				getRequiredRoleModifications().addAll((Collection<? extends ISModifyRequiredRole>)newValue);
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
			case ISModificationmarksPackage.IS_MODIFY_COMPONENT__PROVIDED_ROLE_MODIFICATIONS:
				getProvidedRoleModifications().clear();
				return;
			case ISModificationmarksPackage.IS_MODIFY_COMPONENT__REQUIRED_ROLE_MODIFICATIONS:
				getRequiredRoleModifications().clear();
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
			case ISModificationmarksPackage.IS_MODIFY_COMPONENT__PROVIDED_ROLE_MODIFICATIONS:
				return providedRoleModifications != null && !providedRoleModifications.isEmpty();
			case ISModificationmarksPackage.IS_MODIFY_COMPONENT__REQUIRED_ROLE_MODIFICATIONS:
				return requiredRoleModifications != null && !requiredRoleModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISModifyComponentImpl
