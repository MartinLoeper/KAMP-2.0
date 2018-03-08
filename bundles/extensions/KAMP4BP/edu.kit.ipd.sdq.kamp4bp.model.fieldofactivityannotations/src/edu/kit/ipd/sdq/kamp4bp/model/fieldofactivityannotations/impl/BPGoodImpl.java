/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPGood;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BP Good</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl.BPGoodImpl#getActorStep <em>Actor Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPGoodImpl extends BPUserActionAnnotationImpl<AbstractUserAction> implements BPGood {
	/**
	 * The cached value of the '{@link #getActorStep() <em>Actor Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorStep()
	 * @generated
	 * @ordered
	 */
	protected ActorStep actorStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPGoodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPFieldOfActivityAnnotationsPackage.Literals.BP_GOOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorStep getActorStep() {
		if (actorStep != null && actorStep.eIsProxy()) {
			InternalEObject oldActorStep = (InternalEObject)actorStep;
			actorStep = (ActorStep)eResolveProxy(oldActorStep);
			if (actorStep != oldActorStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPFieldOfActivityAnnotationsPackage.BP_GOOD__ACTOR_STEP, oldActorStep, actorStep));
			}
		}
		return actorStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorStep basicGetActorStep() {
		return actorStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorStep(ActorStep newActorStep) {
		ActorStep oldActorStep = actorStep;
		actorStep = newActorStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPFieldOfActivityAnnotationsPackage.BP_GOOD__ACTOR_STEP, oldActorStep, actorStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPFieldOfActivityAnnotationsPackage.BP_GOOD__ACTOR_STEP:
				if (resolve) return getActorStep();
				return basicGetActorStep();
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
			case BPFieldOfActivityAnnotationsPackage.BP_GOOD__ACTOR_STEP:
				setActorStep((ActorStep)newValue);
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
			case BPFieldOfActivityAnnotationsPackage.BP_GOOD__ACTOR_STEP:
				setActorStep((ActorStep)null);
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
			case BPFieldOfActivityAnnotationsPackage.BP_GOOD__ACTOR_STEP:
				return actorStep != null;
		}
		return super.eIsSet(featureID);
	}

} //BPGoodImpl
