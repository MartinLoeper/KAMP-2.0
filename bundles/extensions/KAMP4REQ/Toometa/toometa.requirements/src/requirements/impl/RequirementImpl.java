/**
 */
package requirements.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import glossary.GlossaryTerm;

import java.util.Collection;

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

import requirements.ReqPriorityEnum;
import requirements.ReqRepository;
import requirements.ReqStatusEnum;
import requirements.Requirement;
import requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements.impl.RequirementImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getConflictsWith <em>Conflicts With</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getHasConflicts <em>Has Conflicts</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getDuplicateOf <em>Duplicate Of</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getHasDuplicates <em>Has Duplicates</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getHasDependents <em>Has Dependents</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getParentOf <em>Parent Of</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getSubpartOf <em>Subpart Of</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getTriggerOf <em>Trigger Of</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getResolves <em>Resolves</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getAlternativeTo <em>Alternative To</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getHasAlternatives <em>Has Alternatives</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getCouldResolve <em>Could Resolve</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getCouldBeResolvedBy <em>Could Be Resolved By</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getStakeholderOf <em>Stakeholder Of</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getHasStakeholders <em>Has Stakeholders</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getSelectedBy <em>Selected By</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getUsesTerms <em>Uses Terms</em>}</li>
 *   <li>{@link requirements.impl.RequirementImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementImpl extends IdentifierImpl implements Requirement {
	/**
	 * The default value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATION_EDEFAULT = "Write a specification here ....";

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final ReqPriorityEnum PRIORITY_EDEFAULT = ReqPriorityEnum.NEUTRAL;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ReqStatusEnum STATUS_EDEFAULT = ReqStatusEnum.NEW;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Relation> getRelations() {
		return (EList<Relation>)eDynamicGet(RequirementsPackage.REQUIREMENT__RELATIONS, RelationsPackage.Literals.RELATION_OBJECT__RELATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConflictObject> getConflictsWith() {
		return (EList<ConflictObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__CONFLICTS_WITH, RelationsPackage.Literals.CONFLICT_OBJECT__CONFLICTS_WITH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConflictObject> getHasConflicts() {
		return (EList<ConflictObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__HAS_CONFLICTS, RelationsPackage.Literals.CONFLICT_OBJECT__HAS_CONFLICTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DuplicationObject> getDuplicateOf() {
		return (EList<DuplicationObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__DUPLICATE_OF, RelationsPackage.Literals.DUPLICATION_OBJECT__DUPLICATE_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DuplicationObject> getHasDuplicates() {
		return (EList<DuplicationObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__HAS_DUPLICATES, RelationsPackage.Literals.DUPLICATION_OBJECT__HAS_DUPLICATES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DependencyObject> getDependsOn() {
		return (EList<DependencyObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__DEPENDS_ON, RelationsPackage.Literals.DEPENDENCY_OBJECT__DEPENDS_ON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DependencyObject> getHasDependents() {
		return (EList<DependencyObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__HAS_DEPENDENTS, RelationsPackage.Literals.DEPENDENCY_OBJECT__HAS_DEPENDENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParentalObject> getParentOf() {
		return (EList<ParentalObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__PARENT_OF, RelationsPackage.Literals.PARENTAL_OBJECT__PARENT_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParentalObject> getSubpartOf() {
		return (EList<ParentalObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__SUBPART_OF, RelationsPackage.Literals.PARENTAL_OBJECT__SUBPART_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TriggerObject> getTriggerOf() {
		return (EList<TriggerObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__TRIGGER_OF, RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TriggerObject> getTriggeredBy() {
		return (EList<TriggerObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__TRIGGERED_BY, RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGERED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResolveObject> getResolves() {
		return (EList<ResolveObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__RESOLVES, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResolveObject> getResolvedBy() {
		return (EList<ResolveObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__RESOLVED_BY, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AlternativeObject> getAlternativeTo() {
		return (EList<AlternativeObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__ALTERNATIVE_TO, RelationsPackage.Literals.ALTERNATIVE_OBJECT__ALTERNATIVE_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AlternativeObject> getHasAlternatives() {
		return (EList<AlternativeObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__HAS_ALTERNATIVES, RelationsPackage.Literals.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CouldResolveObject> getCouldResolve() {
		return (EList<CouldResolveObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__COULD_RESOLVE, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_RESOLVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CouldResolveObject> getCouldBeResolvedBy() {
		return (EList<CouldResolveObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__COULD_BE_RESOLVED_BY, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getStakeholderOf() {
		return (EList<StakeholderObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__STAKEHOLDER_OF, RelationsPackage.Literals.STAKEHOLDER_OBJECT__STAKEHOLDER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getHasStakeholders() {
		return (EList<StakeholderObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__HAS_STAKEHOLDERS, RelationsPackage.Literals.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SelectionObject> getSelected() {
		return (EList<SelectionObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__SELECTED, RelationsPackage.Literals.SELECTION_OBJECT__SELECTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SelectionObject> getSelectedBy() {
		return (EList<SelectionObject>)eDynamicGet(RequirementsPackage.REQUIREMENT__SELECTED_BY, RelationsPackage.Literals.SELECTION_OBJECT__SELECTED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecification() {
		return (String)eDynamicGet(RequirementsPackage.REQUIREMENT__SPECIFICATION, RequirementsPackage.Literals.REQUIREMENT__SPECIFICATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(String newSpecification) {
		eDynamicSet(RequirementsPackage.REQUIREMENT__SPECIFICATION, RequirementsPackage.Literals.REQUIREMENT__SPECIFICATION, newSpecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqPriorityEnum getPriority() {
		return (ReqPriorityEnum)eDynamicGet(RequirementsPackage.REQUIREMENT__PRIORITY, RequirementsPackage.Literals.REQUIREMENT__PRIORITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(ReqPriorityEnum newPriority) {
		eDynamicSet(RequirementsPackage.REQUIREMENT__PRIORITY, RequirementsPackage.Literals.REQUIREMENT__PRIORITY, newPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqStatusEnum getStatus() {
		return (ReqStatusEnum)eDynamicGet(RequirementsPackage.REQUIREMENT__STATUS, RequirementsPackage.Literals.REQUIREMENT__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ReqStatusEnum newStatus) {
		eDynamicSet(RequirementsPackage.REQUIREMENT__STATUS, RequirementsPackage.Literals.REQUIREMENT__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GlossaryTerm> getUsesTerms() {
		return (EList<GlossaryTerm>)eDynamicGet(RequirementsPackage.REQUIREMENT__USES_TERMS, RequirementsPackage.Literals.REQUIREMENT__USES_TERMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqRepository getRepository() {
		return (ReqRepository)eDynamicGet(RequirementsPackage.REQUIREMENT__REPOSITORY, RequirementsPackage.Literals.REQUIREMENT__REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqRepository basicGetRepository() {
		return (ReqRepository)eDynamicGet(RequirementsPackage.REQUIREMENT__REPOSITORY, RequirementsPackage.Literals.REQUIREMENT__REPOSITORY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(ReqRepository newRepository) {
		eDynamicSet(RequirementsPackage.REQUIREMENT__REPOSITORY, RequirementsPackage.Literals.REQUIREMENT__REPOSITORY, newRepository);
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
			case RequirementsPackage.REQUIREMENT__CONFLICTS_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConflictsWith()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__HAS_CONFLICTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasConflicts()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__DUPLICATE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDuplicateOf()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__HAS_DUPLICATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDuplicates()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__DEPENDS_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependsOn()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__HAS_DEPENDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDependents()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__PARENT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentOf()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__SUBPART_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubpartOf()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__TRIGGER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggerOf()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__TRIGGERED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggeredBy()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__RESOLVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolves()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolvedBy()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__ALTERNATIVE_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlternativeTo()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__HAS_ALTERNATIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasAlternatives()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__COULD_RESOLVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldResolve()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__COULD_BE_RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldBeResolvedBy()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__STAKEHOLDER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStakeholderOf()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__HAS_STAKEHOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasStakeholders()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__SELECTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelected()).basicAdd(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__SELECTED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelectedBy()).basicAdd(otherEnd, msgs);
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
			case RequirementsPackage.REQUIREMENT__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__CONFLICTS_WITH:
				return ((InternalEList<?>)getConflictsWith()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__HAS_CONFLICTS:
				return ((InternalEList<?>)getHasConflicts()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__DUPLICATE_OF:
				return ((InternalEList<?>)getDuplicateOf()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__HAS_DUPLICATES:
				return ((InternalEList<?>)getHasDuplicates()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__DEPENDS_ON:
				return ((InternalEList<?>)getDependsOn()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__HAS_DEPENDENTS:
				return ((InternalEList<?>)getHasDependents()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__PARENT_OF:
				return ((InternalEList<?>)getParentOf()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__SUBPART_OF:
				return ((InternalEList<?>)getSubpartOf()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__TRIGGER_OF:
				return ((InternalEList<?>)getTriggerOf()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__TRIGGERED_BY:
				return ((InternalEList<?>)getTriggeredBy()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__RESOLVES:
				return ((InternalEList<?>)getResolves()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__RESOLVED_BY:
				return ((InternalEList<?>)getResolvedBy()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__ALTERNATIVE_TO:
				return ((InternalEList<?>)getAlternativeTo()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__HAS_ALTERNATIVES:
				return ((InternalEList<?>)getHasAlternatives()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__COULD_RESOLVE:
				return ((InternalEList<?>)getCouldResolve()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__COULD_BE_RESOLVED_BY:
				return ((InternalEList<?>)getCouldBeResolvedBy()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__STAKEHOLDER_OF:
				return ((InternalEList<?>)getStakeholderOf()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__HAS_STAKEHOLDERS:
				return ((InternalEList<?>)getHasStakeholders()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__SELECTED:
				return ((InternalEList<?>)getSelected()).basicRemove(otherEnd, msgs);
			case RequirementsPackage.REQUIREMENT__SELECTED_BY:
				return ((InternalEList<?>)getSelectedBy()).basicRemove(otherEnd, msgs);
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
			case RequirementsPackage.REQUIREMENT__RELATIONS:
				return getRelations();
			case RequirementsPackage.REQUIREMENT__CONFLICTS_WITH:
				return getConflictsWith();
			case RequirementsPackage.REQUIREMENT__HAS_CONFLICTS:
				return getHasConflicts();
			case RequirementsPackage.REQUIREMENT__DUPLICATE_OF:
				return getDuplicateOf();
			case RequirementsPackage.REQUIREMENT__HAS_DUPLICATES:
				return getHasDuplicates();
			case RequirementsPackage.REQUIREMENT__DEPENDS_ON:
				return getDependsOn();
			case RequirementsPackage.REQUIREMENT__HAS_DEPENDENTS:
				return getHasDependents();
			case RequirementsPackage.REQUIREMENT__PARENT_OF:
				return getParentOf();
			case RequirementsPackage.REQUIREMENT__SUBPART_OF:
				return getSubpartOf();
			case RequirementsPackage.REQUIREMENT__TRIGGER_OF:
				return getTriggerOf();
			case RequirementsPackage.REQUIREMENT__TRIGGERED_BY:
				return getTriggeredBy();
			case RequirementsPackage.REQUIREMENT__RESOLVES:
				return getResolves();
			case RequirementsPackage.REQUIREMENT__RESOLVED_BY:
				return getResolvedBy();
			case RequirementsPackage.REQUIREMENT__ALTERNATIVE_TO:
				return getAlternativeTo();
			case RequirementsPackage.REQUIREMENT__HAS_ALTERNATIVES:
				return getHasAlternatives();
			case RequirementsPackage.REQUIREMENT__COULD_RESOLVE:
				return getCouldResolve();
			case RequirementsPackage.REQUIREMENT__COULD_BE_RESOLVED_BY:
				return getCouldBeResolvedBy();
			case RequirementsPackage.REQUIREMENT__STAKEHOLDER_OF:
				return getStakeholderOf();
			case RequirementsPackage.REQUIREMENT__HAS_STAKEHOLDERS:
				return getHasStakeholders();
			case RequirementsPackage.REQUIREMENT__SELECTED:
				return getSelected();
			case RequirementsPackage.REQUIREMENT__SELECTED_BY:
				return getSelectedBy();
			case RequirementsPackage.REQUIREMENT__SPECIFICATION:
				return getSpecification();
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				return getPriority();
			case RequirementsPackage.REQUIREMENT__STATUS:
				return getStatus();
			case RequirementsPackage.REQUIREMENT__USES_TERMS:
				return getUsesTerms();
			case RequirementsPackage.REQUIREMENT__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
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
			case RequirementsPackage.REQUIREMENT__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__CONFLICTS_WITH:
				getConflictsWith().clear();
				getConflictsWith().addAll((Collection<? extends ConflictObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__HAS_CONFLICTS:
				getHasConflicts().clear();
				getHasConflicts().addAll((Collection<? extends ConflictObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__DUPLICATE_OF:
				getDuplicateOf().clear();
				getDuplicateOf().addAll((Collection<? extends DuplicationObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__HAS_DUPLICATES:
				getHasDuplicates().clear();
				getHasDuplicates().addAll((Collection<? extends DuplicationObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends DependencyObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__HAS_DEPENDENTS:
				getHasDependents().clear();
				getHasDependents().addAll((Collection<? extends DependencyObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__PARENT_OF:
				getParentOf().clear();
				getParentOf().addAll((Collection<? extends ParentalObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__SUBPART_OF:
				getSubpartOf().clear();
				getSubpartOf().addAll((Collection<? extends ParentalObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__TRIGGER_OF:
				getTriggerOf().clear();
				getTriggerOf().addAll((Collection<? extends TriggerObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__TRIGGERED_BY:
				getTriggeredBy().clear();
				getTriggeredBy().addAll((Collection<? extends TriggerObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__RESOLVES:
				getResolves().clear();
				getResolves().addAll((Collection<? extends ResolveObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__RESOLVED_BY:
				getResolvedBy().clear();
				getResolvedBy().addAll((Collection<? extends ResolveObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__ALTERNATIVE_TO:
				getAlternativeTo().clear();
				getAlternativeTo().addAll((Collection<? extends AlternativeObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__HAS_ALTERNATIVES:
				getHasAlternatives().clear();
				getHasAlternatives().addAll((Collection<? extends AlternativeObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__COULD_RESOLVE:
				getCouldResolve().clear();
				getCouldResolve().addAll((Collection<? extends CouldResolveObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
				getCouldBeResolvedBy().addAll((Collection<? extends CouldResolveObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				getStakeholderOf().addAll((Collection<? extends StakeholderObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
				getHasStakeholders().addAll((Collection<? extends StakeholderObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__SELECTED:
				getSelected().clear();
				getSelected().addAll((Collection<? extends SelectionObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__SELECTED_BY:
				getSelectedBy().clear();
				getSelectedBy().addAll((Collection<? extends SelectionObject>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__SPECIFICATION:
				setSpecification((String)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				setPriority((ReqPriorityEnum)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__STATUS:
				setStatus((ReqStatusEnum)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__USES_TERMS:
				getUsesTerms().clear();
				getUsesTerms().addAll((Collection<? extends GlossaryTerm>)newValue);
				return;
			case RequirementsPackage.REQUIREMENT__REPOSITORY:
				setRepository((ReqRepository)newValue);
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
			case RequirementsPackage.REQUIREMENT__RELATIONS:
				getRelations().clear();
				return;
			case RequirementsPackage.REQUIREMENT__CONFLICTS_WITH:
				getConflictsWith().clear();
				return;
			case RequirementsPackage.REQUIREMENT__HAS_CONFLICTS:
				getHasConflicts().clear();
				return;
			case RequirementsPackage.REQUIREMENT__DUPLICATE_OF:
				getDuplicateOf().clear();
				return;
			case RequirementsPackage.REQUIREMENT__HAS_DUPLICATES:
				getHasDuplicates().clear();
				return;
			case RequirementsPackage.REQUIREMENT__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case RequirementsPackage.REQUIREMENT__HAS_DEPENDENTS:
				getHasDependents().clear();
				return;
			case RequirementsPackage.REQUIREMENT__PARENT_OF:
				getParentOf().clear();
				return;
			case RequirementsPackage.REQUIREMENT__SUBPART_OF:
				getSubpartOf().clear();
				return;
			case RequirementsPackage.REQUIREMENT__TRIGGER_OF:
				getTriggerOf().clear();
				return;
			case RequirementsPackage.REQUIREMENT__TRIGGERED_BY:
				getTriggeredBy().clear();
				return;
			case RequirementsPackage.REQUIREMENT__RESOLVES:
				getResolves().clear();
				return;
			case RequirementsPackage.REQUIREMENT__RESOLVED_BY:
				getResolvedBy().clear();
				return;
			case RequirementsPackage.REQUIREMENT__ALTERNATIVE_TO:
				getAlternativeTo().clear();
				return;
			case RequirementsPackage.REQUIREMENT__HAS_ALTERNATIVES:
				getHasAlternatives().clear();
				return;
			case RequirementsPackage.REQUIREMENT__COULD_RESOLVE:
				getCouldResolve().clear();
				return;
			case RequirementsPackage.REQUIREMENT__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
				return;
			case RequirementsPackage.REQUIREMENT__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				return;
			case RequirementsPackage.REQUIREMENT__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
				return;
			case RequirementsPackage.REQUIREMENT__SELECTED:
				getSelected().clear();
				return;
			case RequirementsPackage.REQUIREMENT__SELECTED_BY:
				getSelectedBy().clear();
				return;
			case RequirementsPackage.REQUIREMENT__SPECIFICATION:
				setSpecification(SPECIFICATION_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case RequirementsPackage.REQUIREMENT__USES_TERMS:
				getUsesTerms().clear();
				return;
			case RequirementsPackage.REQUIREMENT__REPOSITORY:
				setRepository((ReqRepository)null);
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
			case RequirementsPackage.REQUIREMENT__RELATIONS:
				return !getRelations().isEmpty();
			case RequirementsPackage.REQUIREMENT__CONFLICTS_WITH:
				return !getConflictsWith().isEmpty();
			case RequirementsPackage.REQUIREMENT__HAS_CONFLICTS:
				return !getHasConflicts().isEmpty();
			case RequirementsPackage.REQUIREMENT__DUPLICATE_OF:
				return !getDuplicateOf().isEmpty();
			case RequirementsPackage.REQUIREMENT__HAS_DUPLICATES:
				return !getHasDuplicates().isEmpty();
			case RequirementsPackage.REQUIREMENT__DEPENDS_ON:
				return !getDependsOn().isEmpty();
			case RequirementsPackage.REQUIREMENT__HAS_DEPENDENTS:
				return !getHasDependents().isEmpty();
			case RequirementsPackage.REQUIREMENT__PARENT_OF:
				return !getParentOf().isEmpty();
			case RequirementsPackage.REQUIREMENT__SUBPART_OF:
				return !getSubpartOf().isEmpty();
			case RequirementsPackage.REQUIREMENT__TRIGGER_OF:
				return !getTriggerOf().isEmpty();
			case RequirementsPackage.REQUIREMENT__TRIGGERED_BY:
				return !getTriggeredBy().isEmpty();
			case RequirementsPackage.REQUIREMENT__RESOLVES:
				return !getResolves().isEmpty();
			case RequirementsPackage.REQUIREMENT__RESOLVED_BY:
				return !getResolvedBy().isEmpty();
			case RequirementsPackage.REQUIREMENT__ALTERNATIVE_TO:
				return !getAlternativeTo().isEmpty();
			case RequirementsPackage.REQUIREMENT__HAS_ALTERNATIVES:
				return !getHasAlternatives().isEmpty();
			case RequirementsPackage.REQUIREMENT__COULD_RESOLVE:
				return !getCouldResolve().isEmpty();
			case RequirementsPackage.REQUIREMENT__COULD_BE_RESOLVED_BY:
				return !getCouldBeResolvedBy().isEmpty();
			case RequirementsPackage.REQUIREMENT__STAKEHOLDER_OF:
				return !getStakeholderOf().isEmpty();
			case RequirementsPackage.REQUIREMENT__HAS_STAKEHOLDERS:
				return !getHasStakeholders().isEmpty();
			case RequirementsPackage.REQUIREMENT__SELECTED:
				return !getSelected().isEmpty();
			case RequirementsPackage.REQUIREMENT__SELECTED_BY:
				return !getSelectedBy().isEmpty();
			case RequirementsPackage.REQUIREMENT__SPECIFICATION:
				return SPECIFICATION_EDEFAULT == null ? getSpecification() != null : !SPECIFICATION_EDEFAULT.equals(getSpecification());
			case RequirementsPackage.REQUIREMENT__PRIORITY:
				return getPriority() != PRIORITY_EDEFAULT;
			case RequirementsPackage.REQUIREMENT__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case RequirementsPackage.REQUIREMENT__USES_TERMS:
				return !getUsesTerms().isEmpty();
			case RequirementsPackage.REQUIREMENT__REPOSITORY:
				return basicGetRepository() != null;
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
				case RequirementsPackage.REQUIREMENT__RELATIONS: return RelationsPackage.RELATION_OBJECT__RELATIONS;
				default: return -1;
			}
		}
		if (baseClass == ConflictObject.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__CONFLICTS_WITH: return RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH;
				case RequirementsPackage.REQUIREMENT__HAS_CONFLICTS: return RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS;
				default: return -1;
			}
		}
		if (baseClass == DuplicationObject.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__DUPLICATE_OF: return RelationsPackage.DUPLICATION_OBJECT__DUPLICATE_OF;
				case RequirementsPackage.REQUIREMENT__HAS_DUPLICATES: return RelationsPackage.DUPLICATION_OBJECT__HAS_DUPLICATES;
				default: return -1;
			}
		}
		if (baseClass == DependencyObject.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__DEPENDS_ON: return RelationsPackage.DEPENDENCY_OBJECT__DEPENDS_ON;
				case RequirementsPackage.REQUIREMENT__HAS_DEPENDENTS: return RelationsPackage.DEPENDENCY_OBJECT__HAS_DEPENDENTS;
				default: return -1;
			}
		}
		if (baseClass == ParentalObject.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__PARENT_OF: return RelationsPackage.PARENTAL_OBJECT__PARENT_OF;
				case RequirementsPackage.REQUIREMENT__SUBPART_OF: return RelationsPackage.PARENTAL_OBJECT__SUBPART_OF;
				default: return -1;
			}
		}
		if (baseClass == TriggerObject.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__TRIGGER_OF: return RelationsPackage.TRIGGER_OBJECT__TRIGGER_OF;
				case RequirementsPackage.REQUIREMENT__TRIGGERED_BY: return RelationsPackage.TRIGGER_OBJECT__TRIGGERED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResolveObject.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__RESOLVES: return RelationsPackage.RESOLVE_OBJECT__RESOLVES;
				case RequirementsPackage.REQUIREMENT__RESOLVED_BY: return RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == AlternativeObject.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__ALTERNATIVE_TO: return RelationsPackage.ALTERNATIVE_OBJECT__ALTERNATIVE_TO;
				case RequirementsPackage.REQUIREMENT__HAS_ALTERNATIVES: return RelationsPackage.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES;
				default: return -1;
			}
		}
		if (baseClass == CouldResolveObject.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__COULD_RESOLVE: return RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE;
				case RequirementsPackage.REQUIREMENT__COULD_BE_RESOLVED_BY: return RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == StakeholderObject.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__STAKEHOLDER_OF: return RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF;
				case RequirementsPackage.REQUIREMENT__HAS_STAKEHOLDERS: return RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS;
				default: return -1;
			}
		}
		if (baseClass == SelectionObject.class) {
			switch (derivedFeatureID) {
				case RequirementsPackage.REQUIREMENT__SELECTED: return RelationsPackage.SELECTION_OBJECT__SELECTED;
				case RequirementsPackage.REQUIREMENT__SELECTED_BY: return RelationsPackage.SELECTION_OBJECT__SELECTED_BY;
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
				case RelationsPackage.RELATION_OBJECT__RELATIONS: return RequirementsPackage.REQUIREMENT__RELATIONS;
				default: return -1;
			}
		}
		if (baseClass == ConflictObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH: return RequirementsPackage.REQUIREMENT__CONFLICTS_WITH;
				case RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS: return RequirementsPackage.REQUIREMENT__HAS_CONFLICTS;
				default: return -1;
			}
		}
		if (baseClass == DuplicationObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.DUPLICATION_OBJECT__DUPLICATE_OF: return RequirementsPackage.REQUIREMENT__DUPLICATE_OF;
				case RelationsPackage.DUPLICATION_OBJECT__HAS_DUPLICATES: return RequirementsPackage.REQUIREMENT__HAS_DUPLICATES;
				default: return -1;
			}
		}
		if (baseClass == DependencyObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.DEPENDENCY_OBJECT__DEPENDS_ON: return RequirementsPackage.REQUIREMENT__DEPENDS_ON;
				case RelationsPackage.DEPENDENCY_OBJECT__HAS_DEPENDENTS: return RequirementsPackage.REQUIREMENT__HAS_DEPENDENTS;
				default: return -1;
			}
		}
		if (baseClass == ParentalObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.PARENTAL_OBJECT__PARENT_OF: return RequirementsPackage.REQUIREMENT__PARENT_OF;
				case RelationsPackage.PARENTAL_OBJECT__SUBPART_OF: return RequirementsPackage.REQUIREMENT__SUBPART_OF;
				default: return -1;
			}
		}
		if (baseClass == TriggerObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.TRIGGER_OBJECT__TRIGGER_OF: return RequirementsPackage.REQUIREMENT__TRIGGER_OF;
				case RelationsPackage.TRIGGER_OBJECT__TRIGGERED_BY: return RequirementsPackage.REQUIREMENT__TRIGGERED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResolveObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.RESOLVE_OBJECT__RESOLVES: return RequirementsPackage.REQUIREMENT__RESOLVES;
				case RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY: return RequirementsPackage.REQUIREMENT__RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == AlternativeObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.ALTERNATIVE_OBJECT__ALTERNATIVE_TO: return RequirementsPackage.REQUIREMENT__ALTERNATIVE_TO;
				case RelationsPackage.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES: return RequirementsPackage.REQUIREMENT__HAS_ALTERNATIVES;
				default: return -1;
			}
		}
		if (baseClass == CouldResolveObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE: return RequirementsPackage.REQUIREMENT__COULD_RESOLVE;
				case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY: return RequirementsPackage.REQUIREMENT__COULD_BE_RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == StakeholderObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF: return RequirementsPackage.REQUIREMENT__STAKEHOLDER_OF;
				case RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS: return RequirementsPackage.REQUIREMENT__HAS_STAKEHOLDERS;
				default: return -1;
			}
		}
		if (baseClass == SelectionObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.SELECTION_OBJECT__SELECTED: return RequirementsPackage.REQUIREMENT__SELECTED;
				case RelationsPackage.SELECTION_OBJECT__SELECTED_BY: return RequirementsPackage.REQUIREMENT__SELECTED_BY;
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

} //RequirementImpl
