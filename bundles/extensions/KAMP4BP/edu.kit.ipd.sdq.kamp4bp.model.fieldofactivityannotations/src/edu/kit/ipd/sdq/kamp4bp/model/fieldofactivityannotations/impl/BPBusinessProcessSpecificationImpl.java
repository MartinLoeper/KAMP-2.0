/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation;

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
 * An implementation of the model object '<em><b>BP Business Process Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPBusinessProcessSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPBusinessProcessSpecificationImpl#getUserActionAnnotations <em>User Action Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPBusinessProcessSpecificationImpl extends EObjectImpl implements BPBusinessProcessSpecification {
	/**
	 * The cached value of the '{@link #getUserActionAnnotations() <em>User Action Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserActionAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<BPUserActionAnnotation<?>> userActionAnnotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPBusinessProcessSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPFieldOfActivityAnnotationsPackage.Literals.BP_BUSINESS_PROCESS_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPFieldOfActivityAnnotationsRepository getParent() {
		if (eContainerFeatureID() != BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__PARENT) return null;
		return (BPFieldOfActivityAnnotationsRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(BPFieldOfActivityAnnotationsRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(BPFieldOfActivityAnnotationsRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, BPFieldOfActivityAnnotationsPackage.BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUSINESS_PROCESS_SPECIFICATION, BPFieldOfActivityAnnotationsRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPUserActionAnnotation<?>> getUserActionAnnotations() {
		if (userActionAnnotations == null) {
			userActionAnnotations = new EObjectContainmentWithInverseEList<BPUserActionAnnotation<?>>(BPUserActionAnnotation.class, this, BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__USER_ACTION_ANNOTATIONS, BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__PARENT);
		}
		return userActionAnnotations;
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
			case BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((BPFieldOfActivityAnnotationsRepository)otherEnd, msgs);
			case BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__USER_ACTION_ANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserActionAnnotations()).basicAdd(otherEnd, msgs);
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
			case BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__USER_ACTION_ANNOTATIONS:
				return ((InternalEList<?>)getUserActionAnnotations()).basicRemove(otherEnd, msgs);
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
			case BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, BPFieldOfActivityAnnotationsPackage.BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUSINESS_PROCESS_SPECIFICATION, BPFieldOfActivityAnnotationsRepository.class, msgs);
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
			case BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__PARENT:
				return getParent();
			case BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__USER_ACTION_ANNOTATIONS:
				return getUserActionAnnotations();
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
			case BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__PARENT:
				setParent((BPFieldOfActivityAnnotationsRepository)newValue);
				return;
			case BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__USER_ACTION_ANNOTATIONS:
				getUserActionAnnotations().clear();
				getUserActionAnnotations().addAll((Collection<? extends BPUserActionAnnotation<?>>)newValue);
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
			case BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__PARENT:
				setParent((BPFieldOfActivityAnnotationsRepository)null);
				return;
			case BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__USER_ACTION_ANNOTATIONS:
				getUserActionAnnotations().clear();
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
			case BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__PARENT:
				return getParent() != null;
			case BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__USER_ACTION_ANNOTATIONS:
				return userActionAnnotations != null && !userActionAnnotations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BPBusinessProcessSpecificationImpl
