/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPerson;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISPersonList;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification;

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
 * An implementation of the model object '<em><b>IS Person List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISPersonListImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISPersonListImpl#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISPersonListImpl extends EObjectImpl implements ISPersonList {
	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<ISPerson> persons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISPersonListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISFieldOfActivityAnnotationsPackage.Literals.IS_PERSON_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISStaffSpecification getParent() {
		if (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PARENT) return null;
		return (ISStaffSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ISStaffSpecification newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ISStaffSpecification newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PERSON_LIST, ISStaffSpecification.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISPerson> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentWithInverseEList<ISPerson>(ISPerson.class, this, ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PERSONS, ISFieldOfActivityAnnotationsPackage.IS_PERSON__PARENT);
		}
		return persons;
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
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ISStaffSpecification)otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PERSONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPersons()).basicAdd(otherEnd, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PARENT:
				return basicSetParent(null, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PARENT:
				return eInternalContainer().eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_STAFF_SPECIFICATION__PERSON_LIST, ISStaffSpecification.class, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PARENT:
				return getParent();
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PERSONS:
				return getPersons();
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
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PARENT:
				setParent((ISStaffSpecification)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends ISPerson>)newValue);
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
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PARENT:
				setParent((ISStaffSpecification)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PERSONS:
				getPersons().clear();
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
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PARENT:
				return getParent() != null;
			case ISFieldOfActivityAnnotationsPackage.IS_PERSON_LIST__PERSONS:
				return persons != null && !persons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISPersonListImpl
