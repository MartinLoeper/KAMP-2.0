/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.Activity;

import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPOrganizationalUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BP Organizational Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPOrganizationalUnitImpl#getAbstractUserAction <em>Abstract User Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPOrganizationalUnitImpl extends BPUserActionAnnotationImpl<Activity> implements BPOrganizationalUnit {
	/**
	 * The cached value of the '{@link #getAbstractUserAction() <em>Abstract User Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractUserAction()
	 * @generated
	 * @ordered
	 */
	protected AbstractUserAction abstractUserAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPOrganizationalUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPFieldOfActivityAnnotationsPackage.Literals.BP_ORGANIZATIONAL_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<Activity> getAnnotatedUserActions() {
		if (annotatedUserActions == null) {
			annotatedUserActions = new EObjectResolvingEList<Activity>(Activity.class, this, BPFieldOfActivityAnnotationsPackage.BP_ORGANIZATIONAL_UNIT__ANNOTATED_USER_ACTIONS);
		}
		return annotatedUserActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractUserAction getAbstractUserAction() {
		if (abstractUserAction != null && ((EObject)abstractUserAction).eIsProxy()) {
			InternalEObject oldAbstractUserAction = (InternalEObject)abstractUserAction;
			abstractUserAction = (AbstractUserAction)eResolveProxy(oldAbstractUserAction);
			if (abstractUserAction != oldAbstractUserAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPFieldOfActivityAnnotationsPackage.BP_ORGANIZATIONAL_UNIT__ABSTRACT_USER_ACTION, oldAbstractUserAction, abstractUserAction));
			}
		}
		return abstractUserAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractUserAction basicGetAbstractUserAction() {
		return abstractUserAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractUserAction(AbstractUserAction newAbstractUserAction) {
		AbstractUserAction oldAbstractUserAction = abstractUserAction;
		abstractUserAction = newAbstractUserAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPFieldOfActivityAnnotationsPackage.BP_ORGANIZATIONAL_UNIT__ABSTRACT_USER_ACTION, oldAbstractUserAction, abstractUserAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPFieldOfActivityAnnotationsPackage.BP_ORGANIZATIONAL_UNIT__ABSTRACT_USER_ACTION:
				if (resolve) return getAbstractUserAction();
				return basicGetAbstractUserAction();
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
			case BPFieldOfActivityAnnotationsPackage.BP_ORGANIZATIONAL_UNIT__ABSTRACT_USER_ACTION:
				setAbstractUserAction((AbstractUserAction)newValue);
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
			case BPFieldOfActivityAnnotationsPackage.BP_ORGANIZATIONAL_UNIT__ABSTRACT_USER_ACTION:
				setAbstractUserAction((AbstractUserAction)null);
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
			case BPFieldOfActivityAnnotationsPackage.BP_ORGANIZATIONAL_UNIT__ABSTRACT_USER_ACTION:
				return abstractUserAction != null;
		}
		return super.eIsSet(featureID);
	}

} //BPOrganizationalUnitImpl
