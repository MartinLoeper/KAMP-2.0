/**
 */
package relations.impl;

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
import relations.RelationsPackage;
import relations.ResolveObject;
import relations.SelectionObject;
import relations.StakeholderObject;
import relations.TraceableObject;
import relations.TriggerObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traceable Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relations.impl.TraceableObjectImpl#getConflictsWith <em>Conflicts With</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getHasConflicts <em>Has Conflicts</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getDuplicateOf <em>Duplicate Of</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getHasDuplicates <em>Has Duplicates</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getHasDependents <em>Has Dependents</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getParentOf <em>Parent Of</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getSubpartOf <em>Subpart Of</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getTriggerOf <em>Trigger Of</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getResolves <em>Resolves</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getAlternativeTo <em>Alternative To</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getHasAlternatives <em>Has Alternatives</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getCouldResolve <em>Could Resolve</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getCouldBeResolvedBy <em>Could Be Resolved By</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getStakeholderOf <em>Stakeholder Of</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getHasStakeholders <em>Has Stakeholders</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link relations.impl.TraceableObjectImpl#getSelectedBy <em>Selected By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TraceableObjectImpl extends RelationObjectImpl implements TraceableObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceableObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationsPackage.Literals.TRACEABLE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConflictObject> getConflictsWith() {
		return (EList<ConflictObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__CONFLICTS_WITH, RelationsPackage.Literals.CONFLICT_OBJECT__CONFLICTS_WITH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConflictObject> getHasConflicts() {
		return (EList<ConflictObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__HAS_CONFLICTS, RelationsPackage.Literals.CONFLICT_OBJECT__HAS_CONFLICTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DuplicationObject> getDuplicateOf() {
		return (EList<DuplicationObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__DUPLICATE_OF, RelationsPackage.Literals.DUPLICATION_OBJECT__DUPLICATE_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DuplicationObject> getHasDuplicates() {
		return (EList<DuplicationObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__HAS_DUPLICATES, RelationsPackage.Literals.DUPLICATION_OBJECT__HAS_DUPLICATES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DependencyObject> getDependsOn() {
		return (EList<DependencyObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__DEPENDS_ON, RelationsPackage.Literals.DEPENDENCY_OBJECT__DEPENDS_ON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DependencyObject> getHasDependents() {
		return (EList<DependencyObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__HAS_DEPENDENTS, RelationsPackage.Literals.DEPENDENCY_OBJECT__HAS_DEPENDENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParentalObject> getParentOf() {
		return (EList<ParentalObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__PARENT_OF, RelationsPackage.Literals.PARENTAL_OBJECT__PARENT_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParentalObject> getSubpartOf() {
		return (EList<ParentalObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__SUBPART_OF, RelationsPackage.Literals.PARENTAL_OBJECT__SUBPART_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TriggerObject> getTriggerOf() {
		return (EList<TriggerObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__TRIGGER_OF, RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TriggerObject> getTriggeredBy() {
		return (EList<TriggerObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__TRIGGERED_BY, RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGERED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResolveObject> getResolves() {
		return (EList<ResolveObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__RESOLVES, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResolveObject> getResolvedBy() {
		return (EList<ResolveObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__RESOLVED_BY, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AlternativeObject> getAlternativeTo() {
		return (EList<AlternativeObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__ALTERNATIVE_TO, RelationsPackage.Literals.ALTERNATIVE_OBJECT__ALTERNATIVE_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AlternativeObject> getHasAlternatives() {
		return (EList<AlternativeObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__HAS_ALTERNATIVES, RelationsPackage.Literals.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CouldResolveObject> getCouldResolve() {
		return (EList<CouldResolveObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__COULD_RESOLVE, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_RESOLVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CouldResolveObject> getCouldBeResolvedBy() {
		return (EList<CouldResolveObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__COULD_BE_RESOLVED_BY, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getStakeholderOf() {
		return (EList<StakeholderObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__STAKEHOLDER_OF, RelationsPackage.Literals.STAKEHOLDER_OBJECT__STAKEHOLDER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getHasStakeholders() {
		return (EList<StakeholderObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__HAS_STAKEHOLDERS, RelationsPackage.Literals.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SelectionObject> getSelected() {
		return (EList<SelectionObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__SELECTED, RelationsPackage.Literals.SELECTION_OBJECT__SELECTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SelectionObject> getSelectedBy() {
		return (EList<SelectionObject>)eDynamicGet(RelationsPackage.TRACEABLE_OBJECT__SELECTED_BY, RelationsPackage.Literals.SELECTION_OBJECT__SELECTED_BY, true, true);
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
			case RelationsPackage.TRACEABLE_OBJECT__CONFLICTS_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConflictsWith()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__HAS_CONFLICTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasConflicts()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__DUPLICATE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDuplicateOf()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__HAS_DUPLICATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDuplicates()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__DEPENDS_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependsOn()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__HAS_DEPENDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDependents()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__PARENT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentOf()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__SUBPART_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubpartOf()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__TRIGGER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggerOf()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__TRIGGERED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggeredBy()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__RESOLVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolves()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolvedBy()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__ALTERNATIVE_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlternativeTo()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__HAS_ALTERNATIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasAlternatives()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__COULD_RESOLVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldResolve()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__COULD_BE_RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldBeResolvedBy()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__STAKEHOLDER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStakeholderOf()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__HAS_STAKEHOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasStakeholders()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__SELECTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelected()).basicAdd(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__SELECTED_BY:
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
			case RelationsPackage.TRACEABLE_OBJECT__CONFLICTS_WITH:
				return ((InternalEList<?>)getConflictsWith()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__HAS_CONFLICTS:
				return ((InternalEList<?>)getHasConflicts()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__DUPLICATE_OF:
				return ((InternalEList<?>)getDuplicateOf()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__HAS_DUPLICATES:
				return ((InternalEList<?>)getHasDuplicates()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__DEPENDS_ON:
				return ((InternalEList<?>)getDependsOn()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__HAS_DEPENDENTS:
				return ((InternalEList<?>)getHasDependents()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__PARENT_OF:
				return ((InternalEList<?>)getParentOf()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__SUBPART_OF:
				return ((InternalEList<?>)getSubpartOf()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__TRIGGER_OF:
				return ((InternalEList<?>)getTriggerOf()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__TRIGGERED_BY:
				return ((InternalEList<?>)getTriggeredBy()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__RESOLVES:
				return ((InternalEList<?>)getResolves()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__RESOLVED_BY:
				return ((InternalEList<?>)getResolvedBy()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__ALTERNATIVE_TO:
				return ((InternalEList<?>)getAlternativeTo()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__HAS_ALTERNATIVES:
				return ((InternalEList<?>)getHasAlternatives()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__COULD_RESOLVE:
				return ((InternalEList<?>)getCouldResolve()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__COULD_BE_RESOLVED_BY:
				return ((InternalEList<?>)getCouldBeResolvedBy()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__STAKEHOLDER_OF:
				return ((InternalEList<?>)getStakeholderOf()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__HAS_STAKEHOLDERS:
				return ((InternalEList<?>)getHasStakeholders()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__SELECTED:
				return ((InternalEList<?>)getSelected()).basicRemove(otherEnd, msgs);
			case RelationsPackage.TRACEABLE_OBJECT__SELECTED_BY:
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
			case RelationsPackage.TRACEABLE_OBJECT__CONFLICTS_WITH:
				return getConflictsWith();
			case RelationsPackage.TRACEABLE_OBJECT__HAS_CONFLICTS:
				return getHasConflicts();
			case RelationsPackage.TRACEABLE_OBJECT__DUPLICATE_OF:
				return getDuplicateOf();
			case RelationsPackage.TRACEABLE_OBJECT__HAS_DUPLICATES:
				return getHasDuplicates();
			case RelationsPackage.TRACEABLE_OBJECT__DEPENDS_ON:
				return getDependsOn();
			case RelationsPackage.TRACEABLE_OBJECT__HAS_DEPENDENTS:
				return getHasDependents();
			case RelationsPackage.TRACEABLE_OBJECT__PARENT_OF:
				return getParentOf();
			case RelationsPackage.TRACEABLE_OBJECT__SUBPART_OF:
				return getSubpartOf();
			case RelationsPackage.TRACEABLE_OBJECT__TRIGGER_OF:
				return getTriggerOf();
			case RelationsPackage.TRACEABLE_OBJECT__TRIGGERED_BY:
				return getTriggeredBy();
			case RelationsPackage.TRACEABLE_OBJECT__RESOLVES:
				return getResolves();
			case RelationsPackage.TRACEABLE_OBJECT__RESOLVED_BY:
				return getResolvedBy();
			case RelationsPackage.TRACEABLE_OBJECT__ALTERNATIVE_TO:
				return getAlternativeTo();
			case RelationsPackage.TRACEABLE_OBJECT__HAS_ALTERNATIVES:
				return getHasAlternatives();
			case RelationsPackage.TRACEABLE_OBJECT__COULD_RESOLVE:
				return getCouldResolve();
			case RelationsPackage.TRACEABLE_OBJECT__COULD_BE_RESOLVED_BY:
				return getCouldBeResolvedBy();
			case RelationsPackage.TRACEABLE_OBJECT__STAKEHOLDER_OF:
				return getStakeholderOf();
			case RelationsPackage.TRACEABLE_OBJECT__HAS_STAKEHOLDERS:
				return getHasStakeholders();
			case RelationsPackage.TRACEABLE_OBJECT__SELECTED:
				return getSelected();
			case RelationsPackage.TRACEABLE_OBJECT__SELECTED_BY:
				return getSelectedBy();
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
			case RelationsPackage.TRACEABLE_OBJECT__CONFLICTS_WITH:
				getConflictsWith().clear();
				getConflictsWith().addAll((Collection<? extends ConflictObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__HAS_CONFLICTS:
				getHasConflicts().clear();
				getHasConflicts().addAll((Collection<? extends ConflictObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__DUPLICATE_OF:
				getDuplicateOf().clear();
				getDuplicateOf().addAll((Collection<? extends DuplicationObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__HAS_DUPLICATES:
				getHasDuplicates().clear();
				getHasDuplicates().addAll((Collection<? extends DuplicationObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends DependencyObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__HAS_DEPENDENTS:
				getHasDependents().clear();
				getHasDependents().addAll((Collection<? extends DependencyObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__PARENT_OF:
				getParentOf().clear();
				getParentOf().addAll((Collection<? extends ParentalObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__SUBPART_OF:
				getSubpartOf().clear();
				getSubpartOf().addAll((Collection<? extends ParentalObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__TRIGGER_OF:
				getTriggerOf().clear();
				getTriggerOf().addAll((Collection<? extends TriggerObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__TRIGGERED_BY:
				getTriggeredBy().clear();
				getTriggeredBy().addAll((Collection<? extends TriggerObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__RESOLVES:
				getResolves().clear();
				getResolves().addAll((Collection<? extends ResolveObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__RESOLVED_BY:
				getResolvedBy().clear();
				getResolvedBy().addAll((Collection<? extends ResolveObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__ALTERNATIVE_TO:
				getAlternativeTo().clear();
				getAlternativeTo().addAll((Collection<? extends AlternativeObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__HAS_ALTERNATIVES:
				getHasAlternatives().clear();
				getHasAlternatives().addAll((Collection<? extends AlternativeObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__COULD_RESOLVE:
				getCouldResolve().clear();
				getCouldResolve().addAll((Collection<? extends CouldResolveObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
				getCouldBeResolvedBy().addAll((Collection<? extends CouldResolveObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				getStakeholderOf().addAll((Collection<? extends StakeholderObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
				getHasStakeholders().addAll((Collection<? extends StakeholderObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__SELECTED:
				getSelected().clear();
				getSelected().addAll((Collection<? extends SelectionObject>)newValue);
				return;
			case RelationsPackage.TRACEABLE_OBJECT__SELECTED_BY:
				getSelectedBy().clear();
				getSelectedBy().addAll((Collection<? extends SelectionObject>)newValue);
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
			case RelationsPackage.TRACEABLE_OBJECT__CONFLICTS_WITH:
				getConflictsWith().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__HAS_CONFLICTS:
				getHasConflicts().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__DUPLICATE_OF:
				getDuplicateOf().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__HAS_DUPLICATES:
				getHasDuplicates().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__HAS_DEPENDENTS:
				getHasDependents().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__PARENT_OF:
				getParentOf().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__SUBPART_OF:
				getSubpartOf().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__TRIGGER_OF:
				getTriggerOf().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__TRIGGERED_BY:
				getTriggeredBy().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__RESOLVES:
				getResolves().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__RESOLVED_BY:
				getResolvedBy().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__ALTERNATIVE_TO:
				getAlternativeTo().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__HAS_ALTERNATIVES:
				getHasAlternatives().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__COULD_RESOLVE:
				getCouldResolve().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__SELECTED:
				getSelected().clear();
				return;
			case RelationsPackage.TRACEABLE_OBJECT__SELECTED_BY:
				getSelectedBy().clear();
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
			case RelationsPackage.TRACEABLE_OBJECT__CONFLICTS_WITH:
				return !getConflictsWith().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__HAS_CONFLICTS:
				return !getHasConflicts().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__DUPLICATE_OF:
				return !getDuplicateOf().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__HAS_DUPLICATES:
				return !getHasDuplicates().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__DEPENDS_ON:
				return !getDependsOn().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__HAS_DEPENDENTS:
				return !getHasDependents().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__PARENT_OF:
				return !getParentOf().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__SUBPART_OF:
				return !getSubpartOf().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__TRIGGER_OF:
				return !getTriggerOf().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__TRIGGERED_BY:
				return !getTriggeredBy().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__RESOLVES:
				return !getResolves().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__RESOLVED_BY:
				return !getResolvedBy().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__ALTERNATIVE_TO:
				return !getAlternativeTo().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__HAS_ALTERNATIVES:
				return !getHasAlternatives().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__COULD_RESOLVE:
				return !getCouldResolve().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__COULD_BE_RESOLVED_BY:
				return !getCouldBeResolvedBy().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__STAKEHOLDER_OF:
				return !getStakeholderOf().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__HAS_STAKEHOLDERS:
				return !getHasStakeholders().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__SELECTED:
				return !getSelected().isEmpty();
			case RelationsPackage.TRACEABLE_OBJECT__SELECTED_BY:
				return !getSelectedBy().isEmpty();
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
		if (baseClass == ConflictObject.class) {
			switch (derivedFeatureID) {
				case RelationsPackage.TRACEABLE_OBJECT__CONFLICTS_WITH: return RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH;
				case RelationsPackage.TRACEABLE_OBJECT__HAS_CONFLICTS: return RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS;
				default: return -1;
			}
		}
		if (baseClass == DuplicationObject.class) {
			switch (derivedFeatureID) {
				case RelationsPackage.TRACEABLE_OBJECT__DUPLICATE_OF: return RelationsPackage.DUPLICATION_OBJECT__DUPLICATE_OF;
				case RelationsPackage.TRACEABLE_OBJECT__HAS_DUPLICATES: return RelationsPackage.DUPLICATION_OBJECT__HAS_DUPLICATES;
				default: return -1;
			}
		}
		if (baseClass == DependencyObject.class) {
			switch (derivedFeatureID) {
				case RelationsPackage.TRACEABLE_OBJECT__DEPENDS_ON: return RelationsPackage.DEPENDENCY_OBJECT__DEPENDS_ON;
				case RelationsPackage.TRACEABLE_OBJECT__HAS_DEPENDENTS: return RelationsPackage.DEPENDENCY_OBJECT__HAS_DEPENDENTS;
				default: return -1;
			}
		}
		if (baseClass == ParentalObject.class) {
			switch (derivedFeatureID) {
				case RelationsPackage.TRACEABLE_OBJECT__PARENT_OF: return RelationsPackage.PARENTAL_OBJECT__PARENT_OF;
				case RelationsPackage.TRACEABLE_OBJECT__SUBPART_OF: return RelationsPackage.PARENTAL_OBJECT__SUBPART_OF;
				default: return -1;
			}
		}
		if (baseClass == TriggerObject.class) {
			switch (derivedFeatureID) {
				case RelationsPackage.TRACEABLE_OBJECT__TRIGGER_OF: return RelationsPackage.TRIGGER_OBJECT__TRIGGER_OF;
				case RelationsPackage.TRACEABLE_OBJECT__TRIGGERED_BY: return RelationsPackage.TRIGGER_OBJECT__TRIGGERED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResolveObject.class) {
			switch (derivedFeatureID) {
				case RelationsPackage.TRACEABLE_OBJECT__RESOLVES: return RelationsPackage.RESOLVE_OBJECT__RESOLVES;
				case RelationsPackage.TRACEABLE_OBJECT__RESOLVED_BY: return RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == AlternativeObject.class) {
			switch (derivedFeatureID) {
				case RelationsPackage.TRACEABLE_OBJECT__ALTERNATIVE_TO: return RelationsPackage.ALTERNATIVE_OBJECT__ALTERNATIVE_TO;
				case RelationsPackage.TRACEABLE_OBJECT__HAS_ALTERNATIVES: return RelationsPackage.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES;
				default: return -1;
			}
		}
		if (baseClass == CouldResolveObject.class) {
			switch (derivedFeatureID) {
				case RelationsPackage.TRACEABLE_OBJECT__COULD_RESOLVE: return RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE;
				case RelationsPackage.TRACEABLE_OBJECT__COULD_BE_RESOLVED_BY: return RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == StakeholderObject.class) {
			switch (derivedFeatureID) {
				case RelationsPackage.TRACEABLE_OBJECT__STAKEHOLDER_OF: return RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF;
				case RelationsPackage.TRACEABLE_OBJECT__HAS_STAKEHOLDERS: return RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS;
				default: return -1;
			}
		}
		if (baseClass == SelectionObject.class) {
			switch (derivedFeatureID) {
				case RelationsPackage.TRACEABLE_OBJECT__SELECTED: return RelationsPackage.SELECTION_OBJECT__SELECTED;
				case RelationsPackage.TRACEABLE_OBJECT__SELECTED_BY: return RelationsPackage.SELECTION_OBJECT__SELECTED_BY;
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
		if (baseClass == ConflictObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH: return RelationsPackage.TRACEABLE_OBJECT__CONFLICTS_WITH;
				case RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS: return RelationsPackage.TRACEABLE_OBJECT__HAS_CONFLICTS;
				default: return -1;
			}
		}
		if (baseClass == DuplicationObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.DUPLICATION_OBJECT__DUPLICATE_OF: return RelationsPackage.TRACEABLE_OBJECT__DUPLICATE_OF;
				case RelationsPackage.DUPLICATION_OBJECT__HAS_DUPLICATES: return RelationsPackage.TRACEABLE_OBJECT__HAS_DUPLICATES;
				default: return -1;
			}
		}
		if (baseClass == DependencyObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.DEPENDENCY_OBJECT__DEPENDS_ON: return RelationsPackage.TRACEABLE_OBJECT__DEPENDS_ON;
				case RelationsPackage.DEPENDENCY_OBJECT__HAS_DEPENDENTS: return RelationsPackage.TRACEABLE_OBJECT__HAS_DEPENDENTS;
				default: return -1;
			}
		}
		if (baseClass == ParentalObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.PARENTAL_OBJECT__PARENT_OF: return RelationsPackage.TRACEABLE_OBJECT__PARENT_OF;
				case RelationsPackage.PARENTAL_OBJECT__SUBPART_OF: return RelationsPackage.TRACEABLE_OBJECT__SUBPART_OF;
				default: return -1;
			}
		}
		if (baseClass == TriggerObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.TRIGGER_OBJECT__TRIGGER_OF: return RelationsPackage.TRACEABLE_OBJECT__TRIGGER_OF;
				case RelationsPackage.TRIGGER_OBJECT__TRIGGERED_BY: return RelationsPackage.TRACEABLE_OBJECT__TRIGGERED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResolveObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.RESOLVE_OBJECT__RESOLVES: return RelationsPackage.TRACEABLE_OBJECT__RESOLVES;
				case RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY: return RelationsPackage.TRACEABLE_OBJECT__RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == AlternativeObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.ALTERNATIVE_OBJECT__ALTERNATIVE_TO: return RelationsPackage.TRACEABLE_OBJECT__ALTERNATIVE_TO;
				case RelationsPackage.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES: return RelationsPackage.TRACEABLE_OBJECT__HAS_ALTERNATIVES;
				default: return -1;
			}
		}
		if (baseClass == CouldResolveObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE: return RelationsPackage.TRACEABLE_OBJECT__COULD_RESOLVE;
				case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY: return RelationsPackage.TRACEABLE_OBJECT__COULD_BE_RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == StakeholderObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF: return RelationsPackage.TRACEABLE_OBJECT__STAKEHOLDER_OF;
				case RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS: return RelationsPackage.TRACEABLE_OBJECT__HAS_STAKEHOLDERS;
				default: return -1;
			}
		}
		if (baseClass == SelectionObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.SELECTION_OBJECT__SELECTED: return RelationsPackage.TRACEABLE_OBJECT__SELECTED;
				case RelationsPackage.SELECTION_OBJECT__SELECTED_BY: return RelationsPackage.TRACEABLE_OBJECT__SELECTED_BY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TraceableObjectImpl
