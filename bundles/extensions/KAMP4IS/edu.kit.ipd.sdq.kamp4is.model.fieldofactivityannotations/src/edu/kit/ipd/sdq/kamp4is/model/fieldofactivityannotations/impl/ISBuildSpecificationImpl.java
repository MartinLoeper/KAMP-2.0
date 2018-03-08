/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfiguration;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary;

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
 * An implementation of the model object '<em><b>IS Build Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildSpecificationImpl#getBuildConfigurations <em>Build Configurations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISBuildSpecificationImpl#getThirdPartyComponentOrLibraries <em>Third Party Component Or Libraries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISBuildSpecificationImpl extends EObjectImpl implements ISBuildSpecification {
	/**
	 * The cached value of the '{@link #getBuildConfigurations() <em>Build Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ISBuildConfiguration> buildConfigurations;

	/**
	 * The cached value of the '{@link #getThirdPartyComponentOrLibraries() <em>Third Party Component Or Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThirdPartyComponentOrLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<ISThirdPartyComponentOrLibrary> thirdPartyComponentOrLibraries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISBuildSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISFieldOfActivityAnnotationsPackage.Literals.IS_BUILD_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISFieldOfActivityAnnotationsRepository getParent() {
		if (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__PARENT) return null;
		return (ISFieldOfActivityAnnotationsRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ISFieldOfActivityAnnotationsRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ISFieldOfActivityAnnotationsRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION, ISFieldOfActivityAnnotationsRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISBuildConfiguration> getBuildConfigurations() {
		if (buildConfigurations == null) {
			buildConfigurations = new EObjectContainmentWithInverseEList<ISBuildConfiguration>(ISBuildConfiguration.class, this, ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS, ISFieldOfActivityAnnotationsPackage.IS_BUILD_CONFIGURATION__PARENT);
		}
		return buildConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISThirdPartyComponentOrLibrary> getThirdPartyComponentOrLibraries() {
		if (thirdPartyComponentOrLibraries == null) {
			thirdPartyComponentOrLibraries = new EObjectContainmentWithInverseEList<ISThirdPartyComponentOrLibrary>(ISThirdPartyComponentOrLibrary.class, this, ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES, ISFieldOfActivityAnnotationsPackage.IS_THIRD_PARTY_COMPONENT_OR_LIBRARY__PARENT);
		}
		return thirdPartyComponentOrLibraries;
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
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ISFieldOfActivityAnnotationsRepository)otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBuildConfigurations()).basicAdd(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThirdPartyComponentOrLibraries()).basicAdd(otherEnd, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				return ((InternalEList<?>)getBuildConfigurations()).basicRemove(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
				return ((InternalEList<?>)getThirdPartyComponentOrLibraries()).basicRemove(otherEnd, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUILD_SPECIFICATION, ISFieldOfActivityAnnotationsRepository.class, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__PARENT:
				return getParent();
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				return getBuildConfigurations();
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
				return getThirdPartyComponentOrLibraries();
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
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__PARENT:
				setParent((ISFieldOfActivityAnnotationsRepository)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				getBuildConfigurations().clear();
				getBuildConfigurations().addAll((Collection<? extends ISBuildConfiguration>)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
				getThirdPartyComponentOrLibraries().clear();
				getThirdPartyComponentOrLibraries().addAll((Collection<? extends ISThirdPartyComponentOrLibrary>)newValue);
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
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__PARENT:
				setParent((ISFieldOfActivityAnnotationsRepository)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				getBuildConfigurations().clear();
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
				getThirdPartyComponentOrLibraries().clear();
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
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__PARENT:
				return getParent() != null;
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__BUILD_CONFIGURATIONS:
				return buildConfigurations != null && !buildConfigurations.isEmpty();
			case ISFieldOfActivityAnnotationsPackage.IS_BUILD_SPECIFICATION__THIRD_PARTY_COMPONENT_OR_LIBRARIES:
				return thirdPartyComponentOrLibraries != null && !thirdPartyComponentOrLibraries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISBuildSpecificationImpl
