/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfiguration;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Build Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildConfigurationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildConfigurationImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISBuildConfigurationImpl extends ISFileImpl implements ISBuildConfiguration {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<RepositoryComponent> component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISBuildConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISFieldOfActivityAnnotationsPackage.Literals.IS_BUILD_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISBuildSpecification getParent() {
		if (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__PARENT) return null;
		return (ISBuildSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ISBuildSpecification newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ISBuildSpecification newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS, ISBuildSpecification.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepositoryComponent> getComponent() {
		if (component == null) {
			component = new EObjectResolvingEList<RepositoryComponent>(RepositoryComponent.class, this, ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ISBuildSpecification)otherEnd, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__PARENT:
				return eInternalContainer().eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS, ISBuildSpecification.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__PARENT:
				return getParent();
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__COMPONENT:
				return getComponent();
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
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__PARENT:
				setParent((ISBuildSpecification)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends RepositoryComponent>)newValue);
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
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__PARENT:
				setParent((ISBuildSpecification)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__COMPONENT:
				getComponent().clear();
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
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__PARENT:
				return getParent() != null;
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__COMPONENT:
				return component != null && !component.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISBuildConfigurationImpl
