/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.palladiosimulator.pcm.core.entity.impl.NamedElementImpl;

import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BP User Action Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPUserActionAnnotationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPUserActionAnnotationImpl#getAnnotatedUserActions <em>Annotated User Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BPUserActionAnnotationImpl<T extends AbstractUserAction> extends NamedElementImpl implements BPUserActionAnnotation<T> {
	/**
	 * The cached value of the '{@link #getAnnotatedUserActions() <em>Annotated User Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedUserActions()
	 * @generated
	 * @ordered
	 */
	protected EList<T> annotatedUserActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPUserActionAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPFieldOfActivityAnnotationsPackage.Literals.BP_USER_ACTION_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPBusinessProcessSpecification getParent() {
		if (eContainerFeatureID() != BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__PARENT) return null;
		return (BPBusinessProcessSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(BPBusinessProcessSpecification newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(BPBusinessProcessSpecification newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__USER_ACTION_ANNOTATIONS, BPBusinessProcessSpecification.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<T> getAnnotatedUserActions() {
		if (annotatedUserActions == null) {
			annotatedUserActions = new EObjectResolvingEList<T>(AbstractUserAction.class, this, BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__ANNOTATED_USER_ACTIONS);
		}
		return annotatedUserActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((BPBusinessProcessSpecification)otherEnd, msgs);
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
			case BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__PARENT:
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
			case BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__PARENT:
				return eInternalContainer().eInverseRemove(this, BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION__USER_ACTION_ANNOTATIONS, BPBusinessProcessSpecification.class, msgs);
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
			case BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__PARENT:
				return getParent();
			case BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__ANNOTATED_USER_ACTIONS:
				return getAnnotatedUserActions();
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
			case BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__PARENT:
				setParent((BPBusinessProcessSpecification)newValue);
				return;
			case BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__ANNOTATED_USER_ACTIONS:
				getAnnotatedUserActions().clear();
				getAnnotatedUserActions().addAll((Collection<? extends T>)newValue);
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
			case BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__PARENT:
				setParent((BPBusinessProcessSpecification)null);
				return;
			case BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__ANNOTATED_USER_ACTIONS:
				getAnnotatedUserActions().clear();
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
			case BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__PARENT:
				return getParent() != null;
			case BPFieldOfActivityAnnotationsPackage.BP_USER_ACTION_ANNOTATION__ANNOTATED_USER_ACTIONS:
				return annotatedUserActions != null && !annotatedUserActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BPUserActionAnnotationImpl
