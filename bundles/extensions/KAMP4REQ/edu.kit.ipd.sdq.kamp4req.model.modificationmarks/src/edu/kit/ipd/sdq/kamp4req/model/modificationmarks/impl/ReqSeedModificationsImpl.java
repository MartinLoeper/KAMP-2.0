/**
 */
package edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.impl.BPSeedModificationsImpl;

import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyDecision;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyOption;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyRequirement;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Req Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqSeedModificationsImpl#getRequirementModifications <em>Requirement Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqSeedModificationsImpl#getDecisionModifications <em>Decision Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl.ReqSeedModificationsImpl#getOptionModifications <em>Option Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReqSeedModificationsImpl extends BPSeedModificationsImpl implements ReqSeedModifications {
	/**
	 * The cached value of the '{@link #getRequirementModifications() <em>Requirement Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ReqModifyRequirement> requirementModifications;

	/**
	 * The cached value of the '{@link #getDecisionModifications() <em>Decision Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ReqModifyDecision> decisionModifications;

	/**
	 * The cached value of the '{@link #getOptionModifications() <em>Option Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ReqModifyOption> optionModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqSeedModificationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqModificationmarksPackage.Literals.REQ_SEED_MODIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReqModifyRequirement> getRequirementModifications() {
		if (requirementModifications == null) {
			requirementModifications = new EObjectContainmentEList<ReqModifyRequirement>(ReqModifyRequirement.class, this, ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS);
		}
		return requirementModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReqModifyDecision> getDecisionModifications() {
		if (decisionModifications == null) {
			decisionModifications = new EObjectContainmentEList<ReqModifyDecision>(ReqModifyDecision.class, this, ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS);
		}
		return decisionModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReqModifyOption> getOptionModifications() {
		if (optionModifications == null) {
			optionModifications = new EObjectContainmentEList<ReqModifyOption>(ReqModifyOption.class, this, ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS);
		}
		return optionModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				return ((InternalEList<?>)getRequirementModifications()).basicRemove(otherEnd, msgs);
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				return ((InternalEList<?>)getDecisionModifications()).basicRemove(otherEnd, msgs);
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
				return ((InternalEList<?>)getOptionModifications()).basicRemove(otherEnd, msgs);
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
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				return getRequirementModifications();
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				return getDecisionModifications();
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
				return getOptionModifications();
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
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				getRequirementModifications().clear();
				getRequirementModifications().addAll((Collection<? extends ReqModifyRequirement>)newValue);
				return;
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				getDecisionModifications().clear();
				getDecisionModifications().addAll((Collection<? extends ReqModifyDecision>)newValue);
				return;
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
				getOptionModifications().clear();
				getOptionModifications().addAll((Collection<? extends ReqModifyOption>)newValue);
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
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				getRequirementModifications().clear();
				return;
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				getDecisionModifications().clear();
				return;
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
				getOptionModifications().clear();
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
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				return requirementModifications != null && !requirementModifications.isEmpty();
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				return decisionModifications != null && !decisionModifications.isEmpty();
			case ReqModificationmarksPackage.REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
				return optionModifications != null && !optionModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReqSeedModificationsImpl
