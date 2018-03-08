/**
 */
package decisions.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import decisions.Decision;
import decisions.DecisionRepository;
import decisions.DecisionStatusEnum;
import decisions.DecisionsPackage;
import decisions.Rationale;

import glossary.GlossaryTerm;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import relations.AlternativeObject;
import relations.ConflictObject;
import relations.CouldResolveObject;
import relations.DependencyObject;
import relations.DuplicationObject;
import relations.ParentalObject;
import relations.Relation;
import relations.RelationObject;
import relations.RelationsPackage;
import relations.ResolveObject;
import relations.SelectionObject;
import relations.StakeholderObject;
import relations.TraceableObject;
import relations.TriggerObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link decisions.impl.DecisionImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getConflictsWith <em>Conflicts With</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getHasConflicts <em>Has Conflicts</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getDuplicateOf <em>Duplicate Of</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getHasDuplicates <em>Has Duplicates</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getHasDependents <em>Has Dependents</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getParentOf <em>Parent Of</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getSubpartOf <em>Subpart Of</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getTriggerOf <em>Trigger Of</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getResolves <em>Resolves</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getAlternativeTo <em>Alternative To</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getHasAlternatives <em>Has Alternatives</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getCouldResolve <em>Could Resolve</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getCouldBeResolvedBy <em>Could Be Resolved By</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getStakeholderOf <em>Stakeholder Of</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getHasStakeholders <em>Has Stakeholders</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getSelectedBy <em>Selected By</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getRationales <em>Rationales</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link decisions.impl.DecisionImpl#getUsedTerms <em>Used Terms</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DecisionImpl extends IdentifierImpl implements Decision {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final DecisionStatusEnum STATUS_EDEFAULT = DecisionStatusEnum.OPEN;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecisionsPackage.Literals.DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Relation> getRelations() {
		return (EList<Relation>)eDynamicGet(DecisionsPackage.DECISION__RELATIONS, RelationsPackage.Literals.RELATION_OBJECT__RELATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConflictObject> getConflictsWith() {
		return (EList<ConflictObject>)eDynamicGet(DecisionsPackage.DECISION__CONFLICTS_WITH, RelationsPackage.Literals.CONFLICT_OBJECT__CONFLICTS_WITH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConflictObject> getHasConflicts() {
		return (EList<ConflictObject>)eDynamicGet(DecisionsPackage.DECISION__HAS_CONFLICTS, RelationsPackage.Literals.CONFLICT_OBJECT__HAS_CONFLICTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DuplicationObject> getDuplicateOf() {
		return (EList<DuplicationObject>)eDynamicGet(DecisionsPackage.DECISION__DUPLICATE_OF, RelationsPackage.Literals.DUPLICATION_OBJECT__DUPLICATE_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DuplicationObject> getHasDuplicates() {
		return (EList<DuplicationObject>)eDynamicGet(DecisionsPackage.DECISION__HAS_DUPLICATES, RelationsPackage.Literals.DUPLICATION_OBJECT__HAS_DUPLICATES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DependencyObject> getDependsOn() {
		return (EList<DependencyObject>)eDynamicGet(DecisionsPackage.DECISION__DEPENDS_ON, RelationsPackage.Literals.DEPENDENCY_OBJECT__DEPENDS_ON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DependencyObject> getHasDependents() {
		return (EList<DependencyObject>)eDynamicGet(DecisionsPackage.DECISION__HAS_DEPENDENTS, RelationsPackage.Literals.DEPENDENCY_OBJECT__HAS_DEPENDENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParentalObject> getParentOf() {
		return (EList<ParentalObject>)eDynamicGet(DecisionsPackage.DECISION__PARENT_OF, RelationsPackage.Literals.PARENTAL_OBJECT__PARENT_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParentalObject> getSubpartOf() {
		return (EList<ParentalObject>)eDynamicGet(DecisionsPackage.DECISION__SUBPART_OF, RelationsPackage.Literals.PARENTAL_OBJECT__SUBPART_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TriggerObject> getTriggerOf() {
		return (EList<TriggerObject>)eDynamicGet(DecisionsPackage.DECISION__TRIGGER_OF, RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TriggerObject> getTriggeredBy() {
		return (EList<TriggerObject>)eDynamicGet(DecisionsPackage.DECISION__TRIGGERED_BY, RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGERED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResolveObject> getResolves() {
		return (EList<ResolveObject>)eDynamicGet(DecisionsPackage.DECISION__RESOLVES, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResolveObject> getResolvedBy() {
		return (EList<ResolveObject>)eDynamicGet(DecisionsPackage.DECISION__RESOLVED_BY, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AlternativeObject> getAlternativeTo() {
		return (EList<AlternativeObject>)eDynamicGet(DecisionsPackage.DECISION__ALTERNATIVE_TO, RelationsPackage.Literals.ALTERNATIVE_OBJECT__ALTERNATIVE_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AlternativeObject> getHasAlternatives() {
		return (EList<AlternativeObject>)eDynamicGet(DecisionsPackage.DECISION__HAS_ALTERNATIVES, RelationsPackage.Literals.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CouldResolveObject> getCouldResolve() {
		return (EList<CouldResolveObject>)eDynamicGet(DecisionsPackage.DECISION__COULD_RESOLVE, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_RESOLVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CouldResolveObject> getCouldBeResolvedBy() {
		return (EList<CouldResolveObject>)eDynamicGet(DecisionsPackage.DECISION__COULD_BE_RESOLVED_BY, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getStakeholderOf() {
		return (EList<StakeholderObject>)eDynamicGet(DecisionsPackage.DECISION__STAKEHOLDER_OF, RelationsPackage.Literals.STAKEHOLDER_OBJECT__STAKEHOLDER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getHasStakeholders() {
		return (EList<StakeholderObject>)eDynamicGet(DecisionsPackage.DECISION__HAS_STAKEHOLDERS, RelationsPackage.Literals.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SelectionObject> getSelected() {
		return (EList<SelectionObject>)eDynamicGet(DecisionsPackage.DECISION__SELECTED, RelationsPackage.Literals.SELECTION_OBJECT__SELECTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SelectionObject> getSelectedBy() {
		return (EList<SelectionObject>)eDynamicGet(DecisionsPackage.DECISION__SELECTED_BY, RelationsPackage.Literals.SELECTION_OBJECT__SELECTED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Rationale> getRationales() {
		return (EList<Rationale>)eDynamicGet(DecisionsPackage.DECISION__RATIONALES, DecisionsPackage.Literals.DECISION__RATIONALES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(DecisionsPackage.DECISION__DESCRIPTION, DecisionsPackage.Literals.DECISION__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(DecisionsPackage.DECISION__DESCRIPTION, DecisionsPackage.Literals.DECISION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionStatusEnum getStatus() {
		return (DecisionStatusEnum)eDynamicGet(DecisionsPackage.DECISION__STATUS, DecisionsPackage.Literals.DECISION__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(DecisionStatusEnum newStatus) {
		eDynamicSet(DecisionsPackage.DECISION__STATUS, DecisionsPackage.Literals.DECISION__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimestamp() {
		return (Date)eDynamicGet(DecisionsPackage.DECISION__TIMESTAMP, DecisionsPackage.Literals.DECISION__TIMESTAMP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(Date newTimestamp) {
		eDynamicSet(DecisionsPackage.DECISION__TIMESTAMP, DecisionsPackage.Literals.DECISION__TIMESTAMP, newTimestamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionRepository getRepository() {
		return (DecisionRepository)eDynamicGet(DecisionsPackage.DECISION__REPOSITORY, DecisionsPackage.Literals.DECISION__REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(DecisionRepository newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository, DecisionsPackage.DECISION__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(DecisionRepository newRepository) {
		eDynamicSet(DecisionsPackage.DECISION__REPOSITORY, DecisionsPackage.Literals.DECISION__REPOSITORY, newRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GlossaryTerm> getUsedTerms() {
		return (EList<GlossaryTerm>)eDynamicGet(DecisionsPackage.DECISION__USED_TERMS, DecisionsPackage.Literals.DECISION__USED_TERMS, true, true);
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
			case DecisionsPackage.DECISION__CONFLICTS_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConflictsWith()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__HAS_CONFLICTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasConflicts()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__DUPLICATE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDuplicateOf()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__HAS_DUPLICATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDuplicates()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__DEPENDS_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependsOn()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__HAS_DEPENDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDependents()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__PARENT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentOf()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__SUBPART_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubpartOf()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__TRIGGER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggerOf()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__TRIGGERED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggeredBy()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__RESOLVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolves()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolvedBy()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__ALTERNATIVE_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlternativeTo()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__HAS_ALTERNATIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasAlternatives()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__COULD_RESOLVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldResolve()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__COULD_BE_RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldBeResolvedBy()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__STAKEHOLDER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStakeholderOf()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__HAS_STAKEHOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasStakeholders()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__SELECTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelected()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__SELECTED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelectedBy()).basicAdd(otherEnd, msgs);
			case DecisionsPackage.DECISION__REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepository((DecisionRepository)otherEnd, msgs);
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
			case DecisionsPackage.DECISION__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__CONFLICTS_WITH:
				return ((InternalEList<?>)getConflictsWith()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__HAS_CONFLICTS:
				return ((InternalEList<?>)getHasConflicts()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__DUPLICATE_OF:
				return ((InternalEList<?>)getDuplicateOf()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__HAS_DUPLICATES:
				return ((InternalEList<?>)getHasDuplicates()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__DEPENDS_ON:
				return ((InternalEList<?>)getDependsOn()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__HAS_DEPENDENTS:
				return ((InternalEList<?>)getHasDependents()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__PARENT_OF:
				return ((InternalEList<?>)getParentOf()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__SUBPART_OF:
				return ((InternalEList<?>)getSubpartOf()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__TRIGGER_OF:
				return ((InternalEList<?>)getTriggerOf()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__TRIGGERED_BY:
				return ((InternalEList<?>)getTriggeredBy()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__RESOLVES:
				return ((InternalEList<?>)getResolves()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__RESOLVED_BY:
				return ((InternalEList<?>)getResolvedBy()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__ALTERNATIVE_TO:
				return ((InternalEList<?>)getAlternativeTo()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__HAS_ALTERNATIVES:
				return ((InternalEList<?>)getHasAlternatives()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__COULD_RESOLVE:
				return ((InternalEList<?>)getCouldResolve()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__COULD_BE_RESOLVED_BY:
				return ((InternalEList<?>)getCouldBeResolvedBy()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__STAKEHOLDER_OF:
				return ((InternalEList<?>)getStakeholderOf()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__HAS_STAKEHOLDERS:
				return ((InternalEList<?>)getHasStakeholders()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__SELECTED:
				return ((InternalEList<?>)getSelected()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__SELECTED_BY:
				return ((InternalEList<?>)getSelectedBy()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__RATIONALES:
				return ((InternalEList<?>)getRationales()).basicRemove(otherEnd, msgs);
			case DecisionsPackage.DECISION__REPOSITORY:
				return basicSetRepository(null, msgs);
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
			case DecisionsPackage.DECISION__REPOSITORY:
				return eInternalContainer().eInverseRemove(this, DecisionsPackage.DECISION_REPOSITORY__DECISIONS, DecisionRepository.class, msgs);
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
			case DecisionsPackage.DECISION__RELATIONS:
				return getRelations();
			case DecisionsPackage.DECISION__CONFLICTS_WITH:
				return getConflictsWith();
			case DecisionsPackage.DECISION__HAS_CONFLICTS:
				return getHasConflicts();
			case DecisionsPackage.DECISION__DUPLICATE_OF:
				return getDuplicateOf();
			case DecisionsPackage.DECISION__HAS_DUPLICATES:
				return getHasDuplicates();
			case DecisionsPackage.DECISION__DEPENDS_ON:
				return getDependsOn();
			case DecisionsPackage.DECISION__HAS_DEPENDENTS:
				return getHasDependents();
			case DecisionsPackage.DECISION__PARENT_OF:
				return getParentOf();
			case DecisionsPackage.DECISION__SUBPART_OF:
				return getSubpartOf();
			case DecisionsPackage.DECISION__TRIGGER_OF:
				return getTriggerOf();
			case DecisionsPackage.DECISION__TRIGGERED_BY:
				return getTriggeredBy();
			case DecisionsPackage.DECISION__RESOLVES:
				return getResolves();
			case DecisionsPackage.DECISION__RESOLVED_BY:
				return getResolvedBy();
			case DecisionsPackage.DECISION__ALTERNATIVE_TO:
				return getAlternativeTo();
			case DecisionsPackage.DECISION__HAS_ALTERNATIVES:
				return getHasAlternatives();
			case DecisionsPackage.DECISION__COULD_RESOLVE:
				return getCouldResolve();
			case DecisionsPackage.DECISION__COULD_BE_RESOLVED_BY:
				return getCouldBeResolvedBy();
			case DecisionsPackage.DECISION__STAKEHOLDER_OF:
				return getStakeholderOf();
			case DecisionsPackage.DECISION__HAS_STAKEHOLDERS:
				return getHasStakeholders();
			case DecisionsPackage.DECISION__SELECTED:
				return getSelected();
			case DecisionsPackage.DECISION__SELECTED_BY:
				return getSelectedBy();
			case DecisionsPackage.DECISION__RATIONALES:
				return getRationales();
			case DecisionsPackage.DECISION__DESCRIPTION:
				return getDescription();
			case DecisionsPackage.DECISION__STATUS:
				return getStatus();
			case DecisionsPackage.DECISION__TIMESTAMP:
				return getTimestamp();
			case DecisionsPackage.DECISION__REPOSITORY:
				return getRepository();
			case DecisionsPackage.DECISION__USED_TERMS:
				return getUsedTerms();
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
			case DecisionsPackage.DECISION__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case DecisionsPackage.DECISION__CONFLICTS_WITH:
				getConflictsWith().clear();
				getConflictsWith().addAll((Collection<? extends ConflictObject>)newValue);
				return;
			case DecisionsPackage.DECISION__HAS_CONFLICTS:
				getHasConflicts().clear();
				getHasConflicts().addAll((Collection<? extends ConflictObject>)newValue);
				return;
			case DecisionsPackage.DECISION__DUPLICATE_OF:
				getDuplicateOf().clear();
				getDuplicateOf().addAll((Collection<? extends DuplicationObject>)newValue);
				return;
			case DecisionsPackage.DECISION__HAS_DUPLICATES:
				getHasDuplicates().clear();
				getHasDuplicates().addAll((Collection<? extends DuplicationObject>)newValue);
				return;
			case DecisionsPackage.DECISION__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends DependencyObject>)newValue);
				return;
			case DecisionsPackage.DECISION__HAS_DEPENDENTS:
				getHasDependents().clear();
				getHasDependents().addAll((Collection<? extends DependencyObject>)newValue);
				return;
			case DecisionsPackage.DECISION__PARENT_OF:
				getParentOf().clear();
				getParentOf().addAll((Collection<? extends ParentalObject>)newValue);
				return;
			case DecisionsPackage.DECISION__SUBPART_OF:
				getSubpartOf().clear();
				getSubpartOf().addAll((Collection<? extends ParentalObject>)newValue);
				return;
			case DecisionsPackage.DECISION__TRIGGER_OF:
				getTriggerOf().clear();
				getTriggerOf().addAll((Collection<? extends TriggerObject>)newValue);
				return;
			case DecisionsPackage.DECISION__TRIGGERED_BY:
				getTriggeredBy().clear();
				getTriggeredBy().addAll((Collection<? extends TriggerObject>)newValue);
				return;
			case DecisionsPackage.DECISION__RESOLVES:
				getResolves().clear();
				getResolves().addAll((Collection<? extends ResolveObject>)newValue);
				return;
			case DecisionsPackage.DECISION__RESOLVED_BY:
				getResolvedBy().clear();
				getResolvedBy().addAll((Collection<? extends ResolveObject>)newValue);
				return;
			case DecisionsPackage.DECISION__ALTERNATIVE_TO:
				getAlternativeTo().clear();
				getAlternativeTo().addAll((Collection<? extends AlternativeObject>)newValue);
				return;
			case DecisionsPackage.DECISION__HAS_ALTERNATIVES:
				getHasAlternatives().clear();
				getHasAlternatives().addAll((Collection<? extends AlternativeObject>)newValue);
				return;
			case DecisionsPackage.DECISION__COULD_RESOLVE:
				getCouldResolve().clear();
				getCouldResolve().addAll((Collection<? extends CouldResolveObject>)newValue);
				return;
			case DecisionsPackage.DECISION__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
				getCouldBeResolvedBy().addAll((Collection<? extends CouldResolveObject>)newValue);
				return;
			case DecisionsPackage.DECISION__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				getStakeholderOf().addAll((Collection<? extends StakeholderObject>)newValue);
				return;
			case DecisionsPackage.DECISION__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
				getHasStakeholders().addAll((Collection<? extends StakeholderObject>)newValue);
				return;
			case DecisionsPackage.DECISION__SELECTED:
				getSelected().clear();
				getSelected().addAll((Collection<? extends SelectionObject>)newValue);
				return;
			case DecisionsPackage.DECISION__SELECTED_BY:
				getSelectedBy().clear();
				getSelectedBy().addAll((Collection<? extends SelectionObject>)newValue);
				return;
			case DecisionsPackage.DECISION__RATIONALES:
				getRationales().clear();
				getRationales().addAll((Collection<? extends Rationale>)newValue);
				return;
			case DecisionsPackage.DECISION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DecisionsPackage.DECISION__STATUS:
				setStatus((DecisionStatusEnum)newValue);
				return;
			case DecisionsPackage.DECISION__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case DecisionsPackage.DECISION__REPOSITORY:
				setRepository((DecisionRepository)newValue);
				return;
			case DecisionsPackage.DECISION__USED_TERMS:
				getUsedTerms().clear();
				getUsedTerms().addAll((Collection<? extends GlossaryTerm>)newValue);
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
			case DecisionsPackage.DECISION__RELATIONS:
				getRelations().clear();
				return;
			case DecisionsPackage.DECISION__CONFLICTS_WITH:
				getConflictsWith().clear();
				return;
			case DecisionsPackage.DECISION__HAS_CONFLICTS:
				getHasConflicts().clear();
				return;
			case DecisionsPackage.DECISION__DUPLICATE_OF:
				getDuplicateOf().clear();
				return;
			case DecisionsPackage.DECISION__HAS_DUPLICATES:
				getHasDuplicates().clear();
				return;
			case DecisionsPackage.DECISION__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case DecisionsPackage.DECISION__HAS_DEPENDENTS:
				getHasDependents().clear();
				return;
			case DecisionsPackage.DECISION__PARENT_OF:
				getParentOf().clear();
				return;
			case DecisionsPackage.DECISION__SUBPART_OF:
				getSubpartOf().clear();
				return;
			case DecisionsPackage.DECISION__TRIGGER_OF:
				getTriggerOf().clear();
				return;
			case DecisionsPackage.DECISION__TRIGGERED_BY:
				getTriggeredBy().clear();
				return;
			case DecisionsPackage.DECISION__RESOLVES:
				getResolves().clear();
				return;
			case DecisionsPackage.DECISION__RESOLVED_BY:
				getResolvedBy().clear();
				return;
			case DecisionsPackage.DECISION__ALTERNATIVE_TO:
				getAlternativeTo().clear();
				return;
			case DecisionsPackage.DECISION__HAS_ALTERNATIVES:
				getHasAlternatives().clear();
				return;
			case DecisionsPackage.DECISION__COULD_RESOLVE:
				getCouldResolve().clear();
				return;
			case DecisionsPackage.DECISION__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
				return;
			case DecisionsPackage.DECISION__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				return;
			case DecisionsPackage.DECISION__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
				return;
			case DecisionsPackage.DECISION__SELECTED:
				getSelected().clear();
				return;
			case DecisionsPackage.DECISION__SELECTED_BY:
				getSelectedBy().clear();
				return;
			case DecisionsPackage.DECISION__RATIONALES:
				getRationales().clear();
				return;
			case DecisionsPackage.DECISION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DecisionsPackage.DECISION__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case DecisionsPackage.DECISION__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case DecisionsPackage.DECISION__REPOSITORY:
				setRepository((DecisionRepository)null);
				return;
			case DecisionsPackage.DECISION__USED_TERMS:
				getUsedTerms().clear();
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
			case DecisionsPackage.DECISION__RELATIONS:
				return !getRelations().isEmpty();
			case DecisionsPackage.DECISION__CONFLICTS_WITH:
				return !getConflictsWith().isEmpty();
			case DecisionsPackage.DECISION__HAS_CONFLICTS:
				return !getHasConflicts().isEmpty();
			case DecisionsPackage.DECISION__DUPLICATE_OF:
				return !getDuplicateOf().isEmpty();
			case DecisionsPackage.DECISION__HAS_DUPLICATES:
				return !getHasDuplicates().isEmpty();
			case DecisionsPackage.DECISION__DEPENDS_ON:
				return !getDependsOn().isEmpty();
			case DecisionsPackage.DECISION__HAS_DEPENDENTS:
				return !getHasDependents().isEmpty();
			case DecisionsPackage.DECISION__PARENT_OF:
				return !getParentOf().isEmpty();
			case DecisionsPackage.DECISION__SUBPART_OF:
				return !getSubpartOf().isEmpty();
			case DecisionsPackage.DECISION__TRIGGER_OF:
				return !getTriggerOf().isEmpty();
			case DecisionsPackage.DECISION__TRIGGERED_BY:
				return !getTriggeredBy().isEmpty();
			case DecisionsPackage.DECISION__RESOLVES:
				return !getResolves().isEmpty();
			case DecisionsPackage.DECISION__RESOLVED_BY:
				return !getResolvedBy().isEmpty();
			case DecisionsPackage.DECISION__ALTERNATIVE_TO:
				return !getAlternativeTo().isEmpty();
			case DecisionsPackage.DECISION__HAS_ALTERNATIVES:
				return !getHasAlternatives().isEmpty();
			case DecisionsPackage.DECISION__COULD_RESOLVE:
				return !getCouldResolve().isEmpty();
			case DecisionsPackage.DECISION__COULD_BE_RESOLVED_BY:
				return !getCouldBeResolvedBy().isEmpty();
			case DecisionsPackage.DECISION__STAKEHOLDER_OF:
				return !getStakeholderOf().isEmpty();
			case DecisionsPackage.DECISION__HAS_STAKEHOLDERS:
				return !getHasStakeholders().isEmpty();
			case DecisionsPackage.DECISION__SELECTED:
				return !getSelected().isEmpty();
			case DecisionsPackage.DECISION__SELECTED_BY:
				return !getSelectedBy().isEmpty();
			case DecisionsPackage.DECISION__RATIONALES:
				return !getRationales().isEmpty();
			case DecisionsPackage.DECISION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case DecisionsPackage.DECISION__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case DecisionsPackage.DECISION__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? getTimestamp() != null : !TIMESTAMP_EDEFAULT.equals(getTimestamp());
			case DecisionsPackage.DECISION__REPOSITORY:
				return getRepository() != null;
			case DecisionsPackage.DECISION__USED_TERMS:
				return !getUsedTerms().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RelationObject.class) {
			switch (derivedFeatureID) {
				case DecisionsPackage.DECISION__RELATIONS: return RelationsPackage.RELATION_OBJECT__RELATIONS;
				default: return -1;
			}
		}
		if (baseClass == ConflictObject.class) {
			switch (derivedFeatureID) {
				case DecisionsPackage.DECISION__CONFLICTS_WITH: return RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH;
				case DecisionsPackage.DECISION__HAS_CONFLICTS: return RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS;
				default: return -1;
			}
		}
		if (baseClass == DuplicationObject.class) {
			switch (derivedFeatureID) {
				case DecisionsPackage.DECISION__DUPLICATE_OF: return RelationsPackage.DUPLICATION_OBJECT__DUPLICATE_OF;
				case DecisionsPackage.DECISION__HAS_DUPLICATES: return RelationsPackage.DUPLICATION_OBJECT__HAS_DUPLICATES;
				default: return -1;
			}
		}
		if (baseClass == DependencyObject.class) {
			switch (derivedFeatureID) {
				case DecisionsPackage.DECISION__DEPENDS_ON: return RelationsPackage.DEPENDENCY_OBJECT__DEPENDS_ON;
				case DecisionsPackage.DECISION__HAS_DEPENDENTS: return RelationsPackage.DEPENDENCY_OBJECT__HAS_DEPENDENTS;
				default: return -1;
			}
		}
		if (baseClass == ParentalObject.class) {
			switch (derivedFeatureID) {
				case DecisionsPackage.DECISION__PARENT_OF: return RelationsPackage.PARENTAL_OBJECT__PARENT_OF;
				case DecisionsPackage.DECISION__SUBPART_OF: return RelationsPackage.PARENTAL_OBJECT__SUBPART_OF;
				default: return -1;
			}
		}
		if (baseClass == TriggerObject.class) {
			switch (derivedFeatureID) {
				case DecisionsPackage.DECISION__TRIGGER_OF: return RelationsPackage.TRIGGER_OBJECT__TRIGGER_OF;
				case DecisionsPackage.DECISION__TRIGGERED_BY: return RelationsPackage.TRIGGER_OBJECT__TRIGGERED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResolveObject.class) {
			switch (derivedFeatureID) {
				case DecisionsPackage.DECISION__RESOLVES: return RelationsPackage.RESOLVE_OBJECT__RESOLVES;
				case DecisionsPackage.DECISION__RESOLVED_BY: return RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == AlternativeObject.class) {
			switch (derivedFeatureID) {
				case DecisionsPackage.DECISION__ALTERNATIVE_TO: return RelationsPackage.ALTERNATIVE_OBJECT__ALTERNATIVE_TO;
				case DecisionsPackage.DECISION__HAS_ALTERNATIVES: return RelationsPackage.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES;
				default: return -1;
			}
		}
		if (baseClass == CouldResolveObject.class) {
			switch (derivedFeatureID) {
				case DecisionsPackage.DECISION__COULD_RESOLVE: return RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE;
				case DecisionsPackage.DECISION__COULD_BE_RESOLVED_BY: return RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == StakeholderObject.class) {
			switch (derivedFeatureID) {
				case DecisionsPackage.DECISION__STAKEHOLDER_OF: return RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF;
				case DecisionsPackage.DECISION__HAS_STAKEHOLDERS: return RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS;
				default: return -1;
			}
		}
		if (baseClass == SelectionObject.class) {
			switch (derivedFeatureID) {
				case DecisionsPackage.DECISION__SELECTED: return RelationsPackage.SELECTION_OBJECT__SELECTED;
				case DecisionsPackage.DECISION__SELECTED_BY: return RelationsPackage.SELECTION_OBJECT__SELECTED_BY;
				default: return -1;
			}
		}
		if (baseClass == TraceableObject.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RelationObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.RELATION_OBJECT__RELATIONS: return DecisionsPackage.DECISION__RELATIONS;
				default: return -1;
			}
		}
		if (baseClass == ConflictObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH: return DecisionsPackage.DECISION__CONFLICTS_WITH;
				case RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS: return DecisionsPackage.DECISION__HAS_CONFLICTS;
				default: return -1;
			}
		}
		if (baseClass == DuplicationObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.DUPLICATION_OBJECT__DUPLICATE_OF: return DecisionsPackage.DECISION__DUPLICATE_OF;
				case RelationsPackage.DUPLICATION_OBJECT__HAS_DUPLICATES: return DecisionsPackage.DECISION__HAS_DUPLICATES;
				default: return -1;
			}
		}
		if (baseClass == DependencyObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.DEPENDENCY_OBJECT__DEPENDS_ON: return DecisionsPackage.DECISION__DEPENDS_ON;
				case RelationsPackage.DEPENDENCY_OBJECT__HAS_DEPENDENTS: return DecisionsPackage.DECISION__HAS_DEPENDENTS;
				default: return -1;
			}
		}
		if (baseClass == ParentalObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.PARENTAL_OBJECT__PARENT_OF: return DecisionsPackage.DECISION__PARENT_OF;
				case RelationsPackage.PARENTAL_OBJECT__SUBPART_OF: return DecisionsPackage.DECISION__SUBPART_OF;
				default: return -1;
			}
		}
		if (baseClass == TriggerObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.TRIGGER_OBJECT__TRIGGER_OF: return DecisionsPackage.DECISION__TRIGGER_OF;
				case RelationsPackage.TRIGGER_OBJECT__TRIGGERED_BY: return DecisionsPackage.DECISION__TRIGGERED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResolveObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.RESOLVE_OBJECT__RESOLVES: return DecisionsPackage.DECISION__RESOLVES;
				case RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY: return DecisionsPackage.DECISION__RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == AlternativeObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.ALTERNATIVE_OBJECT__ALTERNATIVE_TO: return DecisionsPackage.DECISION__ALTERNATIVE_TO;
				case RelationsPackage.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES: return DecisionsPackage.DECISION__HAS_ALTERNATIVES;
				default: return -1;
			}
		}
		if (baseClass == CouldResolveObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE: return DecisionsPackage.DECISION__COULD_RESOLVE;
				case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY: return DecisionsPackage.DECISION__COULD_BE_RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == StakeholderObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF: return DecisionsPackage.DECISION__STAKEHOLDER_OF;
				case RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS: return DecisionsPackage.DECISION__HAS_STAKEHOLDERS;
				default: return -1;
			}
		}
		if (baseClass == SelectionObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.SELECTION_OBJECT__SELECTED: return DecisionsPackage.DECISION__SELECTED;
				case RelationsPackage.SELECTION_OBJECT__SELECTED_BY: return DecisionsPackage.DECISION__SELECTED_BY;
				default: return -1;
			}
		}
		if (baseClass == TraceableObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DecisionImpl
