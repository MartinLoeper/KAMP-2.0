/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BP Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPMessageImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPMessageImpl#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPMessageImpl extends BPUserActionAnnotationImpl<AbstractUserAction> implements BPMessage {
	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected ActorStep sender;
	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected ActorStep receiver;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPFieldOfActivityAnnotationsPackage.Literals.BP_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorStep getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject)sender;
			sender = (ActorStep)eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorStep basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(ActorStep newSender) {
		ActorStep oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__SENDER, oldSender, sender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorStep getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject)receiver;
			receiver = (ActorStep)eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__RECEIVER, oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorStep basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(ActorStep newReceiver) {
		ActorStep oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__RECEIVER, oldReceiver, receiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__SENDER:
				if (resolve) return getSender();
				return basicGetSender();
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__RECEIVER:
				if (resolve) return getReceiver();
				return basicGetReceiver();
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
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__SENDER:
				setSender((ActorStep)newValue);
				return;
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__RECEIVER:
				setReceiver((ActorStep)newValue);
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
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__SENDER:
				setSender((ActorStep)null);
				return;
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__RECEIVER:
				setReceiver((ActorStep)null);
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
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__SENDER:
				return sender != null;
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE__RECEIVER:
				return receiver != null;
		}
		return super.eIsSet(featureID);
	}

} //BPMessageImpl
