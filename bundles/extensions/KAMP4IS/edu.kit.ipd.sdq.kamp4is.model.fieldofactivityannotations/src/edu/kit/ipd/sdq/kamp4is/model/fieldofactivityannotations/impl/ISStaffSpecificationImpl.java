/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPersonList;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRoleList;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Staff Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISStaffSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISStaffSpecificationImpl#getPersonList <em>Person List</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISStaffSpecificationImpl#getRoleList <em>Role List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISStaffSpecificationImpl extends EObjectImpl implements ISStaffSpecification {
	/**
	 * The cached value of the '{@link #getPersonList() <em>Person List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonList()
	 * @generated
	 * @ordered
	 */
	protected ISPersonList personList;

	/**
	 * The cached value of the '{@link #getRoleList() <em>Role List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleList()
	 * @generated
	 * @ordered
	 */
	protected ISRoleList roleList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISStaffSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISFieldOfActivityAnnotationsPackage.Literals.IS_STAFF_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISFieldOfActivityAnnotationsRepository getParent() {
		if (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PARENT) return null;
		return (ISFieldOfActivityAnnotationsRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ISFieldOfActivityAnnotationsRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ISFieldOfActivityAnnotationsRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION, ISFieldOfActivityAnnotationsRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISPersonList getPersonList() {
		return personList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonList(ISPersonList newPersonList, NotificationChain msgs) {
		ISPersonList oldPersonList = personList;
		personList = newPersonList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PERSON_LIST, oldPersonList, newPersonList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonList(ISPersonList newPersonList) {
		if (newPersonList != personList) {
			NotificationChain msgs = null;
			if (personList != null)
				msgs = ((InternalEObject)personList).eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PARENT, ISPersonList.class, msgs);
			if (newPersonList != null)
				msgs = ((InternalEObject)newPersonList).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PARENT, ISPersonList.class, msgs);
			msgs = basicSetPersonList(newPersonList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PERSON_LIST, newPersonList, newPersonList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISRoleList getRoleList() {
		return roleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleList(ISRoleList newRoleList, NotificationChain msgs) {
		ISRoleList oldRoleList = roleList;
		roleList = newRoleList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__ROLE_LIST, oldRoleList, newRoleList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleList(ISRoleList newRoleList) {
		if (newRoleList != roleList) {
			NotificationChain msgs = null;
			if (roleList != null)
				msgs = ((InternalEObject)roleList).eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_ROLE_LIST__PARENT, ISRoleList.class, msgs);
			if (newRoleList != null)
				msgs = ((InternalEObject)newRoleList).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_ROLE_LIST__PARENT, ISRoleList.class, msgs);
			msgs = basicSetRoleList(newRoleList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__ROLE_LIST, newRoleList, newRoleList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ISFieldOfActivityAnnotationsRepository)otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PERSON_LIST:
				if (personList != null)
					msgs = ((InternalEObject)personList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PERSON_LIST, null, msgs);
				return basicSetPersonList((ISPersonList)otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__ROLE_LIST:
				if (roleList != null)
					msgs = ((InternalEObject)roleList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__ROLE_LIST, null, msgs);
				return basicSetRoleList((ISRoleList)otherEnd, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PERSON_LIST:
				return basicSetPersonList(null, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__ROLE_LIST:
				return basicSetRoleList(null, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__STAFF_SPECIFICATION, ISFieldOfActivityAnnotationsRepository.class, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PARENT:
				return getParent();
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PERSON_LIST:
				return getPersonList();
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__ROLE_LIST:
				return getRoleList();
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
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PARENT:
				setParent((ISFieldOfActivityAnnotationsRepository)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PERSON_LIST:
				setPersonList((ISPersonList)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__ROLE_LIST:
				setRoleList((ISRoleList)newValue);
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
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PARENT:
				setParent((ISFieldOfActivityAnnotationsRepository)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PERSON_LIST:
				setPersonList((ISPersonList)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__ROLE_LIST:
				setRoleList((ISRoleList)null);
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
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PARENT:
				return getParent() != null;
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PERSON_LIST:
				return personList != null;
			case ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__ROLE_LIST:
				return roleList != null;
		}
		return super.eIsSet(featureID);
	}

} //ISStaffSpecificationImpl
