/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsRepository;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISFieldOfActivityAnnotationsRepositoryImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPFieldOfActivityAnnotationsRepositoryImpl#getBusinessProcessSpecification <em>Business Process Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPFieldOfActivityAnnotationsRepositoryImpl extends ISFieldOfActivityAnnotationsRepositoryImpl implements BPFieldOfActivityAnnotationsRepository {
	/**
	 * The cached value of the '{@link #getBusinessProcessSpecification() <em>Business Process Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessProcessSpecification()
	 * @generated
	 * @ordered
	 */
	protected BPBusinessProcessSpecification businessProcessSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPFieldOfActivityAnnotationsRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPFieldOfActivityAnnotationsPackage.Literals.BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPBusinessProcessSpecification getBusinessProcessSpecification() {
		return businessProcessSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessProcessSpecification(BPBusinessProcessSpecification newBusinessProcessSpecification, NotificationChain msgs) {
		BPBusinessProcessSpecification oldBusinessProcessSpecification = businessProcessSpecification;
		businessProcessSpecification = newBusinessProcessSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPFieldOfActivityAnnotationsPackage.BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUSINESS_PROCESS_SPECIFICATION, oldBusinessProcessSpecification, newBusinessProcessSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessProcessSpecification(BPBusinessProcessSpecification newBusinessProcessSpecification) {
		if (newBusinessProcessSpecification != businessProcessSpecification) {
			NotificationChain msgs = null;
			if (businessProcessSpecification != null)
				msgs = ((InternalEObject)businessProcessSpecification).eInverseRemove(this, BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__PARENT, BPBusinessProcessSpecification.class, msgs);
			if (newBusinessProcessSpecification != null)
				msgs = ((InternalEObject)newBusinessProcessSpecification).eInverseAdd(this, BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__PARENT, BPBusinessProcessSpecification.class, msgs);
			msgs = basicSetBusinessProcessSpecification(newBusinessProcessSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPFieldOfActivityAnnotationsPackage.BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUSINESS_PROCESS_SPECIFICATION, newBusinessProcessSpecification, newBusinessProcessSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPFieldOfActivityAnnotationsPackage.BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUSINESS_PROCESS_SPECIFICATION:
				if (businessProcessSpecification != null)
					msgs = ((InternalEObject)businessProcessSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPFieldOfActivityAnnotationsPackage.BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUSINESS_PROCESS_SPECIFICATION, null, msgs);
				return basicSetBusinessProcessSpecification((BPBusinessProcessSpecification)otherEnd, msgs);
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
			case BPFieldOfActivityAnnotationsPackage.BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUSINESS_PROCESS_SPECIFICATION:
				return basicSetBusinessProcessSpecification(null, msgs);
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
			case BPFieldOfActivityAnnotationsPackage.BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUSINESS_PROCESS_SPECIFICATION:
				return getBusinessProcessSpecification();
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
			case BPFieldOfActivityAnnotationsPackage.BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUSINESS_PROCESS_SPECIFICATION:
				setBusinessProcessSpecification((BPBusinessProcessSpecification)newValue);
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
			case BPFieldOfActivityAnnotationsPackage.BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUSINESS_PROCESS_SPECIFICATION:
				setBusinessProcessSpecification((BPBusinessProcessSpecification)null);
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
			case BPFieldOfActivityAnnotationsPackage.BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__BUSINESS_PROCESS_SPECIFICATION:
				return businessProcessSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //BPFieldOfActivityAnnotationsRepositoryImpl
