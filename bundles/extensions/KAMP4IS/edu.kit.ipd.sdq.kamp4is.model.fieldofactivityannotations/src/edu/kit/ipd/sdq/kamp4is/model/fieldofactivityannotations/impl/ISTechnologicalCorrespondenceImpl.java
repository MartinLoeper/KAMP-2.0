/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondence;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTechnologicalCorrespondenceTypes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Technological Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTechnologicalCorrespondenceImpl#getTechnologicalCorrespondenceType <em>Technological Correspondence Type</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISTechnologicalCorrespondenceImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISTechnologicalCorrespondenceImpl extends IdentifierImpl implements ISTechnologicalCorrespondence {
	/**
	 * The default value of the '{@link #getTechnologicalCorrespondenceType() <em>Technological Correspondence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologicalCorrespondenceType()
	 * @generated
	 * @ordered
	 */
	protected static final ISTechnologicalCorrespondenceTypes TECHNOLOGICAL_CORRESPONDENCE_TYPE_EDEFAULT = ISTechnologicalCorrespondenceTypes.SET_OF_CLASSES;

	/**
	 * The cached value of the '{@link #getTechnologicalCorrespondenceType() <em>Technological Correspondence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologicalCorrespondenceType()
	 * @generated
	 * @ordered
	 */
	protected ISTechnologicalCorrespondenceTypes technologicalCorrespondenceType = TECHNOLOGICAL_CORRESPONDENCE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected RepositoryComponent component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISTechnologicalCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISFieldOfActivityAnnotationsPackage.Literals.IS_TECHNOLOGICAL_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISTechnologicalCorrespondenceTypes getTechnologicalCorrespondenceType() {
		return technologicalCorrespondenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnologicalCorrespondenceType(ISTechnologicalCorrespondenceTypes newTechnologicalCorrespondenceType) {
		ISTechnologicalCorrespondenceTypes oldTechnologicalCorrespondenceType = technologicalCorrespondenceType;
		technologicalCorrespondenceType = newTechnologicalCorrespondenceType == null ? TECHNOLOGICAL_CORRESPONDENCE_TYPE_EDEFAULT : newTechnologicalCorrespondenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE, oldTechnologicalCorrespondenceType, technologicalCorrespondenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent getComponent() {
		if (component != null && ((EObject)component).eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (RepositoryComponent)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGICAL_CORRESPONDENCE__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(RepositoryComponent newComponent) {
		RepositoryComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGICAL_CORRESPONDENCE__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE:
				return getTechnologicalCorrespondenceType();
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGICAL_CORRESPONDENCE__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
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
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE:
				setTechnologicalCorrespondenceType((ISTechnologicalCorrespondenceTypes)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGICAL_CORRESPONDENCE__COMPONENT:
				setComponent((RepositoryComponent)newValue);
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
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE:
				setTechnologicalCorrespondenceType(TECHNOLOGICAL_CORRESPONDENCE_TYPE_EDEFAULT);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGICAL_CORRESPONDENCE__COMPONENT:
				setComponent((RepositoryComponent)null);
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
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGICAL_CORRESPONDENCE__TECHNOLOGICAL_CORRESPONDENCE_TYPE:
				return technologicalCorrespondenceType != TECHNOLOGICAL_CORRESPONDENCE_TYPE_EDEFAULT;
			case ISFieldOfActivityAnnotationsPackage.IS_TECHNOLOGICAL_CORRESPONDENCE__COMPONENT:
				return component != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (technologicalCorrespondenceType: ");
		result.append(technologicalCorrespondenceType);
		result.append(')');
		return result.toString();
	}

} //ISTechnologicalCorrespondenceImpl
