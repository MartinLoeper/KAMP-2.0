/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologySpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Technology Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTechnologySpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTechnologySpecificationImpl#getTechnologicalCorrespondences <em>Technological Correspondences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISTechnologySpecificationImpl extends EObjectImpl implements ISTechnologySpecification {
	/**
	 * The cached value of the '{@link #getTechnologicalCorrespondences() <em>Technological Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologicalCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<ISTechnologicalCorrespondence> technologicalCorrespondences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISTechnologySpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISFieldOfActivityAnnotationsPackage.Literals.IS_TECHNOLOGY_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISFieldOfActivityAnnotationsRepository getParent() {
		if (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__PARENT) return null;
		return (ISFieldOfActivityAnnotationsRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ISFieldOfActivityAnnotationsRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ISFieldOfActivityAnnotationsRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION, ISFieldOfActivityAnnotationsRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISTechnologicalCorrespondence> getTechnologicalCorrespondences() {
		if (technologicalCorrespondences == null) {
			technologicalCorrespondences = new EObjectContainmentEList<ISTechnologicalCorrespondence>(ISTechnologicalCorrespondence.class, this, ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES);
		}
		return technologicalCorrespondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__PARENT:
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
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES:
				return ((InternalEList<?>)getTechnologicalCorrespondences()).basicRemove(otherEnd, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__TECHNOLOGY_SPECIFICATION, ISFieldOfActivityAnnotationsRepository.class, msgs);
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
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__PARENT:
				return getParent();
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES:
				return getTechnologicalCorrespondences();
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
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__PARENT:
				setParent((ISFieldOfActivityAnnotationsRepository)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES:
				getTechnologicalCorrespondences().clear();
				getTechnologicalCorrespondences().addAll((Collection<? extends ISTechnologicalCorrespondence>)newValue);
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
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__PARENT:
				setParent((ISFieldOfActivityAnnotationsRepository)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES:
				getTechnologicalCorrespondences().clear();
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
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__PARENT:
				return getParent() != null;
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGY_SPECIFICATION__TECHNOLOGICAL_CORRESPONDENCES:
				return technologicalCorrespondences != null && !technologicalCorrespondences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISTechnologySpecificationImpl
