/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Release Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISReleaseSpecificationImpl#getReleaseConfigurations <em>Release Configurations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISReleaseSpecificationImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISReleaseSpecificationImpl extends EObjectImpl implements ISReleaseSpecification {
	/**
	 * The cached value of the '{@link #getReleaseConfigurations() <em>Release Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ISReleaseConfiguration> releaseConfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISReleaseSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISFieldOfActivityAnnotationsPackage.Literals.IS_RELEASE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISReleaseConfiguration> getReleaseConfigurations() {
		if (releaseConfigurations == null) {
			releaseConfigurations = new EObjectContainmentWithInverseEList<ISReleaseConfiguration>(ISReleaseConfiguration.class, this, ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS, ISFieldOfActivityAnnotationsPackage.IS_RELEASE_CONFIGURATION__PARENT);
		}
		return releaseConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISFieldOfActivityAnnotationsRepository getParent() {
		if (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__PARENT) return null;
		return (ISFieldOfActivityAnnotationsRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ISFieldOfActivityAnnotationsRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ISFieldOfActivityAnnotationsRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION, ISFieldOfActivityAnnotationsRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__PARENT, newParent, newParent));
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
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReleaseConfigurations()).basicAdd(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ISFieldOfActivityAnnotationsRepository)otherEnd, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS:
				return ((InternalEList<?>)getReleaseConfigurations()).basicRemove(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__PARENT:
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
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__RELEASE_SPECIFICATION, ISFieldOfActivityAnnotationsRepository.class, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS:
				return getReleaseConfigurations();
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__PARENT:
				return getParent();
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
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS:
				getReleaseConfigurations().clear();
				getReleaseConfigurations().addAll((Collection<? extends ISReleaseConfiguration>)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__PARENT:
				setParent((ISFieldOfActivityAnnotationsRepository)newValue);
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
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS:
				getReleaseConfigurations().clear();
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__PARENT:
				setParent((ISFieldOfActivityAnnotationsRepository)null);
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
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__RELEASE_CONFIGURATIONS:
				return releaseConfigurations != null && !releaseConfigurations.isEmpty();
			case ISFieldOfActivityAnnotationsPackage.IS_RELEASE_SPECIFICATION__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ISReleaseSpecificationImpl
