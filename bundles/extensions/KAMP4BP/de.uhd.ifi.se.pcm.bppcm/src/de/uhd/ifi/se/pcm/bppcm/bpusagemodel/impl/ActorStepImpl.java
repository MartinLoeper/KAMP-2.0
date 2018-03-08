/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage;

import de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.core.PCMRandomVariable;

import org.palladiosimulator.pcm.usagemodel.impl.AbstractUserActionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ActorStepImpl#getProcessingTime <em>Processing Time</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ActorStepImpl#getRestingTime <em>Resting Time</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ActorStepImpl#getResponsibleRole <em>Responsible Role</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ActorStepImpl#isContinuouslyPerformed <em>Continuously Performed</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ActorStepImpl#isInterruptable <em>Interruptable</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ActorStepImpl#getOutputDataObjects <em>Output Data Objects</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.impl.ActorStepImpl#getInputDataObjects <em>Input Data Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorStepImpl extends AbstractUserActionImpl implements ActorStep {
	/**
	 * The cached value of the '{@link #getProcessingTime() <em>Processing Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingTime()
	 * @generated
	 * @ordered
	 */
	protected PCMRandomVariable processingTime;

	/**
	 * The default value of the '{@link #getRestingTime() <em>Resting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestingTime()
	 * @generated
	 * @ordered
	 */
	protected static final double RESTING_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRestingTime() <em>Resting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestingTime()
	 * @generated
	 * @ordered
	 */
	protected double restingTime = RESTING_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponsibleRole() <em>Responsible Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleRole()
	 * @generated
	 * @ordered
	 */
	protected Role responsibleRole;

	/**
	 * The default value of the '{@link #isContinuouslyPerformed() <em>Continuously Performed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinuouslyPerformed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTINUOUSLY_PERFORMED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContinuouslyPerformed() <em>Continuously Performed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinuouslyPerformed()
	 * @generated
	 * @ordered
	 */
	protected boolean continuouslyPerformed = CONTINUOUSLY_PERFORMED_EDEFAULT;

	/**
	 * The default value of the '{@link #isInterruptable() <em>Interruptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterruptable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERRUPTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterruptable() <em>Interruptable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterruptable()
	 * @generated
	 * @ordered
	 */
	protected boolean interruptable = INTERRUPTABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputDataObjects() <em>Output Data Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDataObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<DataObject<?>> outputDataObjects;

	/**
	 * The cached value of the '{@link #getInputDataObjects() <em>Input Data Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDataObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<DataObject<?>> inputDataObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpusagemodelPackage.Literals.ACTOR_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCMRandomVariable getProcessingTime() {
		return processingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessingTime(PCMRandomVariable newProcessingTime, NotificationChain msgs) {
		PCMRandomVariable oldProcessingTime = processingTime;
		processingTime = newProcessingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpusagemodelPackage.ACTOR_STEP__PROCESSING_TIME, oldProcessingTime, newProcessingTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingTime(PCMRandomVariable newProcessingTime) {
		if (newProcessingTime != processingTime) {
			NotificationChain msgs = null;
			if (processingTime != null)
				msgs = ((InternalEObject)processingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BpusagemodelPackage.ACTOR_STEP__PROCESSING_TIME, null, msgs);
			if (newProcessingTime != null)
				msgs = ((InternalEObject)newProcessingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BpusagemodelPackage.ACTOR_STEP__PROCESSING_TIME, null, msgs);
			msgs = basicSetProcessingTime(newProcessingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpusagemodelPackage.ACTOR_STEP__PROCESSING_TIME, newProcessingTime, newProcessingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRestingTime() {
		return restingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestingTime(double newRestingTime) {
		double oldRestingTime = restingTime;
		restingTime = newRestingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpusagemodelPackage.ACTOR_STEP__RESTING_TIME, oldRestingTime, restingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getResponsibleRole() {
		if (responsibleRole != null && responsibleRole.eIsProxy()) {
			InternalEObject oldResponsibleRole = (InternalEObject)responsibleRole;
			responsibleRole = (Role)eResolveProxy(oldResponsibleRole);
			if (responsibleRole != oldResponsibleRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpusagemodelPackage.ACTOR_STEP__RESPONSIBLE_ROLE, oldResponsibleRole, responsibleRole));
			}
		}
		return responsibleRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetResponsibleRole() {
		return responsibleRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibleRole(Role newResponsibleRole) {
		Role oldResponsibleRole = responsibleRole;
		responsibleRole = newResponsibleRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpusagemodelPackage.ACTOR_STEP__RESPONSIBLE_ROLE, oldResponsibleRole, responsibleRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContinuouslyPerformed() {
		return continuouslyPerformed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuouslyPerformed(boolean newContinuouslyPerformed) {
		boolean oldContinuouslyPerformed = continuouslyPerformed;
		continuouslyPerformed = newContinuouslyPerformed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpusagemodelPackage.ACTOR_STEP__CONTINUOUSLY_PERFORMED, oldContinuouslyPerformed, continuouslyPerformed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInterruptable() {
		return interruptable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterruptable(boolean newInterruptable) {
		boolean oldInterruptable = interruptable;
		interruptable = newInterruptable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpusagemodelPackage.ACTOR_STEP__INTERRUPTABLE, oldInterruptable, interruptable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataObject<?>> getOutputDataObjects() {
		if (outputDataObjects == null) {
			outputDataObjects = new EObjectResolvingEList<DataObject<?>>(DataObject.class, this, BpusagemodelPackage.ACTOR_STEP__OUTPUT_DATA_OBJECTS);
		}
		return outputDataObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataObject<?>> getInputDataObjects() {
		if (inputDataObjects == null) {
			inputDataObjects = new EObjectResolvingEList<DataObject<?>>(DataObject.class, this, BpusagemodelPackage.ACTOR_STEP__INPUT_DATA_OBJECTS);
		}
		return inputDataObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpusagemodelPackage.ACTOR_STEP__PROCESSING_TIME:
				return basicSetProcessingTime(null, msgs);
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
			case BpusagemodelPackage.ACTOR_STEP__PROCESSING_TIME:
				return getProcessingTime();
			case BpusagemodelPackage.ACTOR_STEP__RESTING_TIME:
				return getRestingTime();
			case BpusagemodelPackage.ACTOR_STEP__RESPONSIBLE_ROLE:
				if (resolve) return getResponsibleRole();
				return basicGetResponsibleRole();
			case BpusagemodelPackage.ACTOR_STEP__CONTINUOUSLY_PERFORMED:
				return isContinuouslyPerformed();
			case BpusagemodelPackage.ACTOR_STEP__INTERRUPTABLE:
				return isInterruptable();
			case BpusagemodelPackage.ACTOR_STEP__OUTPUT_DATA_OBJECTS:
				return getOutputDataObjects();
			case BpusagemodelPackage.ACTOR_STEP__INPUT_DATA_OBJECTS:
				return getInputDataObjects();
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
			case BpusagemodelPackage.ACTOR_STEP__PROCESSING_TIME:
				setProcessingTime((PCMRandomVariable)newValue);
				return;
			case BpusagemodelPackage.ACTOR_STEP__RESTING_TIME:
				setRestingTime((Double)newValue);
				return;
			case BpusagemodelPackage.ACTOR_STEP__RESPONSIBLE_ROLE:
				setResponsibleRole((Role)newValue);
				return;
			case BpusagemodelPackage.ACTOR_STEP__CONTINUOUSLY_PERFORMED:
				setContinuouslyPerformed((Boolean)newValue);
				return;
			case BpusagemodelPackage.ACTOR_STEP__INTERRUPTABLE:
				setInterruptable((Boolean)newValue);
				return;
			case BpusagemodelPackage.ACTOR_STEP__OUTPUT_DATA_OBJECTS:
				getOutputDataObjects().clear();
				getOutputDataObjects().addAll((Collection<? extends DataObject<?>>)newValue);
				return;
			case BpusagemodelPackage.ACTOR_STEP__INPUT_DATA_OBJECTS:
				getInputDataObjects().clear();
				getInputDataObjects().addAll((Collection<? extends DataObject<?>>)newValue);
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
			case BpusagemodelPackage.ACTOR_STEP__PROCESSING_TIME:
				setProcessingTime((PCMRandomVariable)null);
				return;
			case BpusagemodelPackage.ACTOR_STEP__RESTING_TIME:
				setRestingTime(RESTING_TIME_EDEFAULT);
				return;
			case BpusagemodelPackage.ACTOR_STEP__RESPONSIBLE_ROLE:
				setResponsibleRole((Role)null);
				return;
			case BpusagemodelPackage.ACTOR_STEP__CONTINUOUSLY_PERFORMED:
				setContinuouslyPerformed(CONTINUOUSLY_PERFORMED_EDEFAULT);
				return;
			case BpusagemodelPackage.ACTOR_STEP__INTERRUPTABLE:
				setInterruptable(INTERRUPTABLE_EDEFAULT);
				return;
			case BpusagemodelPackage.ACTOR_STEP__OUTPUT_DATA_OBJECTS:
				getOutputDataObjects().clear();
				return;
			case BpusagemodelPackage.ACTOR_STEP__INPUT_DATA_OBJECTS:
				getInputDataObjects().clear();
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
			case BpusagemodelPackage.ACTOR_STEP__PROCESSING_TIME:
				return processingTime != null;
			case BpusagemodelPackage.ACTOR_STEP__RESTING_TIME:
				return restingTime != RESTING_TIME_EDEFAULT;
			case BpusagemodelPackage.ACTOR_STEP__RESPONSIBLE_ROLE:
				return responsibleRole != null;
			case BpusagemodelPackage.ACTOR_STEP__CONTINUOUSLY_PERFORMED:
				return continuouslyPerformed != CONTINUOUSLY_PERFORMED_EDEFAULT;
			case BpusagemodelPackage.ACTOR_STEP__INTERRUPTABLE:
				return interruptable != INTERRUPTABLE_EDEFAULT;
			case BpusagemodelPackage.ACTOR_STEP__OUTPUT_DATA_OBJECTS:
				return outputDataObjects != null && !outputDataObjects.isEmpty();
			case BpusagemodelPackage.ACTOR_STEP__INPUT_DATA_OBJECTS:
				return inputDataObjects != null && !inputDataObjects.isEmpty();
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
		result.append(" (restingTime: ");
		result.append(restingTime);
		result.append(", continuouslyPerformed: ");
		result.append(continuouslyPerformed);
		result.append(", interruptable: ");
		result.append(interruptable);
		result.append(')');
		return result.toString();
	}

} //ActorStepImpl
