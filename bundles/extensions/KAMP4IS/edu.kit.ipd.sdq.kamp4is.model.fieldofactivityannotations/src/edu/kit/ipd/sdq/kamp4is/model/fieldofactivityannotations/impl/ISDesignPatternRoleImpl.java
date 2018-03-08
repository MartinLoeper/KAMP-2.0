/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDesignPatternRole;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Design Pattern Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDesignPatternRoleImpl#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDesignPatternRoleImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISDesignPatternRoleImpl extends IdentifierImpl implements ISDesignPatternRole {
	/**
	 * The cached value of the '{@link #getProvidedRole() <em>Provided Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRole()
	 * @generated
	 * @ordered
	 */
	protected ProvidedRole providedRole;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected RepositoryComponent component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISDesignPatternRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISFieldOfActivityAnnotationsPackage.Literals.IS_DESIGN_PATTERN_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole getProvidedRole() {
		if (providedRole != null && ((EObject)providedRole).eIsProxy()) {
			InternalEObject oldProvidedRole = (InternalEObject)providedRole;
			providedRole = (ProvidedRole)eResolveProxy(oldProvidedRole);
			if (providedRole != oldProvidedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_ROLE__PROVIDED_ROLE, oldProvidedRole, providedRole));
			}
		}
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole basicGetProvidedRole() {
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedRole(ProvidedRole newProvidedRole) {
		ProvidedRole oldProvidedRole = providedRole;
		providedRole = newProvidedRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_ROLE__PROVIDED_ROLE, oldProvidedRole, providedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent getComponent() {
		if (component != null && ((EObject)component).eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (RepositoryComponent)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_ROLE__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(RepositoryComponent newComponent) {
		RepositoryComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_ROLE__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_ROLE__PROVIDED_ROLE:
				if (resolve) return getProvidedRole();
				return basicGetProvidedRole();
			case ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_ROLE__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
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
			case ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_ROLE__PROVIDED_ROLE:
				setProvidedRole((ProvidedRole)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_ROLE__COMPONENT:
				setComponent((RepositoryComponent)newValue);
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
			case ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_ROLE__PROVIDED_ROLE:
				setProvidedRole((ProvidedRole)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_ROLE__COMPONENT:
				setComponent((RepositoryComponent)null);
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
			case ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_ROLE__PROVIDED_ROLE:
				return providedRole != null;
			case ISFieldOfActivityAnnotationsPackage.IS_DESIGN_PATTERN_ROLE__COMPONENT:
				return component != null;
		}
		return super.eIsSet(featureID);
	}

} //ISDesignPatternRoleImpl
