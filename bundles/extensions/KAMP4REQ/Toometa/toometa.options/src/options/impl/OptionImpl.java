/**
 */
package options.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import effects.Effect;

import glossary.GlossaryTerm;

import java.util.Collection;
import java.util.Date;
import options.Option;
import options.OptionRepository;
import options.OptionsPackage;
import options.TextRationale;

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
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link options.impl.OptionImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getConflictsWith <em>Conflicts With</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getHasConflicts <em>Has Conflicts</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getDuplicateOf <em>Duplicate Of</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getHasDuplicates <em>Has Duplicates</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getHasDependents <em>Has Dependents</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getParentOf <em>Parent Of</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getSubpartOf <em>Subpart Of</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getTriggerOf <em>Trigger Of</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getResolves <em>Resolves</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getAlternativeTo <em>Alternative To</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getHasAlternatives <em>Has Alternatives</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getCouldResolve <em>Could Resolve</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getCouldBeResolvedBy <em>Could Be Resolved By</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getStakeholderOf <em>Stakeholder Of</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getHasStakeholders <em>Has Stakeholders</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getSelectedBy <em>Selected By</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link options.impl.OptionImpl#isIsModelled <em>Is Modelled</em>}</li>
 *   <li>{@link options.impl.OptionImpl#isIsImplemented <em>Is Implemented</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link options.impl.OptionImpl#getUsedTerms <em>Used Terms</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OptionImpl extends IdentifierImpl implements Option {
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
	 * The default value of the '{@link #isIsModelled() <em>Is Modelled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsModelled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MODELLED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsImplemented() <em>Is Implemented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImplemented()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IMPLEMENTED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_STAMP_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptionsPackage.Literals.OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Relation> getRelations() {
		return (EList<Relation>)eDynamicGet(OptionsPackage.OPTION__RELATIONS, RelationsPackage.Literals.RELATION_OBJECT__RELATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConflictObject> getConflictsWith() {
		return (EList<ConflictObject>)eDynamicGet(OptionsPackage.OPTION__CONFLICTS_WITH, RelationsPackage.Literals.CONFLICT_OBJECT__CONFLICTS_WITH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConflictObject> getHasConflicts() {
		return (EList<ConflictObject>)eDynamicGet(OptionsPackage.OPTION__HAS_CONFLICTS, RelationsPackage.Literals.CONFLICT_OBJECT__HAS_CONFLICTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DuplicationObject> getDuplicateOf() {
		return (EList<DuplicationObject>)eDynamicGet(OptionsPackage.OPTION__DUPLICATE_OF, RelationsPackage.Literals.DUPLICATION_OBJECT__DUPLICATE_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DuplicationObject> getHasDuplicates() {
		return (EList<DuplicationObject>)eDynamicGet(OptionsPackage.OPTION__HAS_DUPLICATES, RelationsPackage.Literals.DUPLICATION_OBJECT__HAS_DUPLICATES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DependencyObject> getDependsOn() {
		return (EList<DependencyObject>)eDynamicGet(OptionsPackage.OPTION__DEPENDS_ON, RelationsPackage.Literals.DEPENDENCY_OBJECT__DEPENDS_ON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DependencyObject> getHasDependents() {
		return (EList<DependencyObject>)eDynamicGet(OptionsPackage.OPTION__HAS_DEPENDENTS, RelationsPackage.Literals.DEPENDENCY_OBJECT__HAS_DEPENDENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParentalObject> getParentOf() {
		return (EList<ParentalObject>)eDynamicGet(OptionsPackage.OPTION__PARENT_OF, RelationsPackage.Literals.PARENTAL_OBJECT__PARENT_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParentalObject> getSubpartOf() {
		return (EList<ParentalObject>)eDynamicGet(OptionsPackage.OPTION__SUBPART_OF, RelationsPackage.Literals.PARENTAL_OBJECT__SUBPART_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TriggerObject> getTriggerOf() {
		return (EList<TriggerObject>)eDynamicGet(OptionsPackage.OPTION__TRIGGER_OF, RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TriggerObject> getTriggeredBy() {
		return (EList<TriggerObject>)eDynamicGet(OptionsPackage.OPTION__TRIGGERED_BY, RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGERED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResolveObject> getResolves() {
		return (EList<ResolveObject>)eDynamicGet(OptionsPackage.OPTION__RESOLVES, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResolveObject> getResolvedBy() {
		return (EList<ResolveObject>)eDynamicGet(OptionsPackage.OPTION__RESOLVED_BY, RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AlternativeObject> getAlternativeTo() {
		return (EList<AlternativeObject>)eDynamicGet(OptionsPackage.OPTION__ALTERNATIVE_TO, RelationsPackage.Literals.ALTERNATIVE_OBJECT__ALTERNATIVE_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AlternativeObject> getHasAlternatives() {
		return (EList<AlternativeObject>)eDynamicGet(OptionsPackage.OPTION__HAS_ALTERNATIVES, RelationsPackage.Literals.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CouldResolveObject> getCouldResolve() {
		return (EList<CouldResolveObject>)eDynamicGet(OptionsPackage.OPTION__COULD_RESOLVE, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_RESOLVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CouldResolveObject> getCouldBeResolvedBy() {
		return (EList<CouldResolveObject>)eDynamicGet(OptionsPackage.OPTION__COULD_BE_RESOLVED_BY, RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getStakeholderOf() {
		return (EList<StakeholderObject>)eDynamicGet(OptionsPackage.OPTION__STAKEHOLDER_OF, RelationsPackage.Literals.STAKEHOLDER_OBJECT__STAKEHOLDER_OF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StakeholderObject> getHasStakeholders() {
		return (EList<StakeholderObject>)eDynamicGet(OptionsPackage.OPTION__HAS_STAKEHOLDERS, RelationsPackage.Literals.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SelectionObject> getSelected() {
		return (EList<SelectionObject>)eDynamicGet(OptionsPackage.OPTION__SELECTED, RelationsPackage.Literals.SELECTION_OBJECT__SELECTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SelectionObject> getSelectedBy() {
		return (EList<SelectionObject>)eDynamicGet(OptionsPackage.OPTION__SELECTED_BY, RelationsPackage.Literals.SELECTION_OBJECT__SELECTED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(OptionsPackage.OPTION__DESCRIPTION, OptionsPackage.Literals.OPTION__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(OptionsPackage.OPTION__DESCRIPTION, OptionsPackage.Literals.OPTION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getKeywords() {
		return (EList<String>)eDynamicGet(OptionsPackage.OPTION__KEYWORDS, OptionsPackage.Literals.OPTION__KEYWORDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionRepository getRepository() {
		return (OptionRepository)eDynamicGet(OptionsPackage.OPTION__REPOSITORY, OptionsPackage.Literals.OPTION__REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(OptionRepository newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository, OptionsPackage.OPTION__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(OptionRepository newRepository) {
		eDynamicSet(OptionsPackage.OPTION__REPOSITORY, OptionsPackage.Literals.OPTION__REPOSITORY, newRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TextRationale> getRationale() {
		return (EList<TextRationale>)eDynamicGet(OptionsPackage.OPTION__RATIONALE, OptionsPackage.Literals.OPTION__RATIONALE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsModelled() {
		return (Boolean)eDynamicGet(OptionsPackage.OPTION__IS_MODELLED, OptionsPackage.Literals.OPTION__IS_MODELLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsModelled(boolean newIsModelled) {
		eDynamicSet(OptionsPackage.OPTION__IS_MODELLED, OptionsPackage.Literals.OPTION__IS_MODELLED, newIsModelled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsImplemented() {
		return (Boolean)eDynamicGet(OptionsPackage.OPTION__IS_IMPLEMENTED, OptionsPackage.Literals.OPTION__IS_IMPLEMENTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsImplemented(boolean newIsImplemented) {
		eDynamicSet(OptionsPackage.OPTION__IS_IMPLEMENTED, OptionsPackage.Literals.OPTION__IS_IMPLEMENTED, newIsImplemented);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeStamp() {
		return (Date)eDynamicGet(OptionsPackage.OPTION__TIME_STAMP, OptionsPackage.Literals.OPTION__TIME_STAMP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(Date newTimeStamp) {
		eDynamicSet(OptionsPackage.OPTION__TIME_STAMP, OptionsPackage.Literals.OPTION__TIME_STAMP, newTimeStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Effect> getEffects() {
		return (EList<Effect>)eDynamicGet(OptionsPackage.OPTION__EFFECTS, OptionsPackage.Literals.OPTION__EFFECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GlossaryTerm> getUsedTerms() {
		return (EList<GlossaryTerm>)eDynamicGet(OptionsPackage.OPTION__USED_TERMS, OptionsPackage.Literals.OPTION__USED_TERMS, true, true);
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
			case OptionsPackage.OPTION__CONFLICTS_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConflictsWith()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__HAS_CONFLICTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasConflicts()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__DUPLICATE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDuplicateOf()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__HAS_DUPLICATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDuplicates()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__DEPENDS_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependsOn()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__HAS_DEPENDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasDependents()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__PARENT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentOf()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__SUBPART_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubpartOf()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__TRIGGER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggerOf()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__TRIGGERED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggeredBy()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__RESOLVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolves()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResolvedBy()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__ALTERNATIVE_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlternativeTo()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__HAS_ALTERNATIVES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasAlternatives()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__COULD_RESOLVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldResolve()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__COULD_BE_RESOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCouldBeResolvedBy()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__STAKEHOLDER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStakeholderOf()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__HAS_STAKEHOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasStakeholders()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__SELECTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelected()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__SELECTED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelectedBy()).basicAdd(otherEnd, msgs);
			case OptionsPackage.OPTION__REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepository((OptionRepository)otherEnd, msgs);
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
			case OptionsPackage.OPTION__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__CONFLICTS_WITH:
				return ((InternalEList<?>)getConflictsWith()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__HAS_CONFLICTS:
				return ((InternalEList<?>)getHasConflicts()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__DUPLICATE_OF:
				return ((InternalEList<?>)getDuplicateOf()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__HAS_DUPLICATES:
				return ((InternalEList<?>)getHasDuplicates()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__DEPENDS_ON:
				return ((InternalEList<?>)getDependsOn()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__HAS_DEPENDENTS:
				return ((InternalEList<?>)getHasDependents()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__PARENT_OF:
				return ((InternalEList<?>)getParentOf()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__SUBPART_OF:
				return ((InternalEList<?>)getSubpartOf()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__TRIGGER_OF:
				return ((InternalEList<?>)getTriggerOf()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__TRIGGERED_BY:
				return ((InternalEList<?>)getTriggeredBy()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__RESOLVES:
				return ((InternalEList<?>)getResolves()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__RESOLVED_BY:
				return ((InternalEList<?>)getResolvedBy()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__ALTERNATIVE_TO:
				return ((InternalEList<?>)getAlternativeTo()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__HAS_ALTERNATIVES:
				return ((InternalEList<?>)getHasAlternatives()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__COULD_RESOLVE:
				return ((InternalEList<?>)getCouldResolve()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__COULD_BE_RESOLVED_BY:
				return ((InternalEList<?>)getCouldBeResolvedBy()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__STAKEHOLDER_OF:
				return ((InternalEList<?>)getStakeholderOf()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__HAS_STAKEHOLDERS:
				return ((InternalEList<?>)getHasStakeholders()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__SELECTED:
				return ((InternalEList<?>)getSelected()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__SELECTED_BY:
				return ((InternalEList<?>)getSelectedBy()).basicRemove(otherEnd, msgs);
			case OptionsPackage.OPTION__REPOSITORY:
				return basicSetRepository(null, msgs);
			case OptionsPackage.OPTION__RATIONALE:
				return ((InternalEList<?>)getRationale()).basicRemove(otherEnd, msgs);
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
			case OptionsPackage.OPTION__REPOSITORY:
				return eInternalContainer().eInverseRemove(this, OptionsPackage.OPTION_REPOSITORY__OPTIONS, OptionRepository.class, msgs);
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
			case OptionsPackage.OPTION__RELATIONS:
				return getRelations();
			case OptionsPackage.OPTION__CONFLICTS_WITH:
				return getConflictsWith();
			case OptionsPackage.OPTION__HAS_CONFLICTS:
				return getHasConflicts();
			case OptionsPackage.OPTION__DUPLICATE_OF:
				return getDuplicateOf();
			case OptionsPackage.OPTION__HAS_DUPLICATES:
				return getHasDuplicates();
			case OptionsPackage.OPTION__DEPENDS_ON:
				return getDependsOn();
			case OptionsPackage.OPTION__HAS_DEPENDENTS:
				return getHasDependents();
			case OptionsPackage.OPTION__PARENT_OF:
				return getParentOf();
			case OptionsPackage.OPTION__SUBPART_OF:
				return getSubpartOf();
			case OptionsPackage.OPTION__TRIGGER_OF:
				return getTriggerOf();
			case OptionsPackage.OPTION__TRIGGERED_BY:
				return getTriggeredBy();
			case OptionsPackage.OPTION__RESOLVES:
				return getResolves();
			case OptionsPackage.OPTION__RESOLVED_BY:
				return getResolvedBy();
			case OptionsPackage.OPTION__ALTERNATIVE_TO:
				return getAlternativeTo();
			case OptionsPackage.OPTION__HAS_ALTERNATIVES:
				return getHasAlternatives();
			case OptionsPackage.OPTION__COULD_RESOLVE:
				return getCouldResolve();
			case OptionsPackage.OPTION__COULD_BE_RESOLVED_BY:
				return getCouldBeResolvedBy();
			case OptionsPackage.OPTION__STAKEHOLDER_OF:
				return getStakeholderOf();
			case OptionsPackage.OPTION__HAS_STAKEHOLDERS:
				return getHasStakeholders();
			case OptionsPackage.OPTION__SELECTED:
				return getSelected();
			case OptionsPackage.OPTION__SELECTED_BY:
				return getSelectedBy();
			case OptionsPackage.OPTION__DESCRIPTION:
				return getDescription();
			case OptionsPackage.OPTION__KEYWORDS:
				return getKeywords();
			case OptionsPackage.OPTION__REPOSITORY:
				return getRepository();
			case OptionsPackage.OPTION__RATIONALE:
				return getRationale();
			case OptionsPackage.OPTION__IS_MODELLED:
				return isIsModelled();
			case OptionsPackage.OPTION__IS_IMPLEMENTED:
				return isIsImplemented();
			case OptionsPackage.OPTION__TIME_STAMP:
				return getTimeStamp();
			case OptionsPackage.OPTION__EFFECTS:
				return getEffects();
			case OptionsPackage.OPTION__USED_TERMS:
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
			case OptionsPackage.OPTION__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case OptionsPackage.OPTION__CONFLICTS_WITH:
				getConflictsWith().clear();
				getConflictsWith().addAll((Collection<? extends ConflictObject>)newValue);
				return;
			case OptionsPackage.OPTION__HAS_CONFLICTS:
				getHasConflicts().clear();
				getHasConflicts().addAll((Collection<? extends ConflictObject>)newValue);
				return;
			case OptionsPackage.OPTION__DUPLICATE_OF:
				getDuplicateOf().clear();
				getDuplicateOf().addAll((Collection<? extends DuplicationObject>)newValue);
				return;
			case OptionsPackage.OPTION__HAS_DUPLICATES:
				getHasDuplicates().clear();
				getHasDuplicates().addAll((Collection<? extends DuplicationObject>)newValue);
				return;
			case OptionsPackage.OPTION__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends DependencyObject>)newValue);
				return;
			case OptionsPackage.OPTION__HAS_DEPENDENTS:
				getHasDependents().clear();
				getHasDependents().addAll((Collection<? extends DependencyObject>)newValue);
				return;
			case OptionsPackage.OPTION__PARENT_OF:
				getParentOf().clear();
				getParentOf().addAll((Collection<? extends ParentalObject>)newValue);
				return;
			case OptionsPackage.OPTION__SUBPART_OF:
				getSubpartOf().clear();
				getSubpartOf().addAll((Collection<? extends ParentalObject>)newValue);
				return;
			case OptionsPackage.OPTION__TRIGGER_OF:
				getTriggerOf().clear();
				getTriggerOf().addAll((Collection<? extends TriggerObject>)newValue);
				return;
			case OptionsPackage.OPTION__TRIGGERED_BY:
				getTriggeredBy().clear();
				getTriggeredBy().addAll((Collection<? extends TriggerObject>)newValue);
				return;
			case OptionsPackage.OPTION__RESOLVES:
				getResolves().clear();
				getResolves().addAll((Collection<? extends ResolveObject>)newValue);
				return;
			case OptionsPackage.OPTION__RESOLVED_BY:
				getResolvedBy().clear();
				getResolvedBy().addAll((Collection<? extends ResolveObject>)newValue);
				return;
			case OptionsPackage.OPTION__ALTERNATIVE_TO:
				getAlternativeTo().clear();
				getAlternativeTo().addAll((Collection<? extends AlternativeObject>)newValue);
				return;
			case OptionsPackage.OPTION__HAS_ALTERNATIVES:
				getHasAlternatives().clear();
				getHasAlternatives().addAll((Collection<? extends AlternativeObject>)newValue);
				return;
			case OptionsPackage.OPTION__COULD_RESOLVE:
				getCouldResolve().clear();
				getCouldResolve().addAll((Collection<? extends CouldResolveObject>)newValue);
				return;
			case OptionsPackage.OPTION__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
				getCouldBeResolvedBy().addAll((Collection<? extends CouldResolveObject>)newValue);
				return;
			case OptionsPackage.OPTION__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				getStakeholderOf().addAll((Collection<? extends StakeholderObject>)newValue);
				return;
			case OptionsPackage.OPTION__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
				getHasStakeholders().addAll((Collection<? extends StakeholderObject>)newValue);
				return;
			case OptionsPackage.OPTION__SELECTED:
				getSelected().clear();
				getSelected().addAll((Collection<? extends SelectionObject>)newValue);
				return;
			case OptionsPackage.OPTION__SELECTED_BY:
				getSelectedBy().clear();
				getSelectedBy().addAll((Collection<? extends SelectionObject>)newValue);
				return;
			case OptionsPackage.OPTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OptionsPackage.OPTION__KEYWORDS:
				getKeywords().clear();
				getKeywords().addAll((Collection<? extends String>)newValue);
				return;
			case OptionsPackage.OPTION__REPOSITORY:
				setRepository((OptionRepository)newValue);
				return;
			case OptionsPackage.OPTION__RATIONALE:
				getRationale().clear();
				getRationale().addAll((Collection<? extends TextRationale>)newValue);
				return;
			case OptionsPackage.OPTION__IS_MODELLED:
				setIsModelled((Boolean)newValue);
				return;
			case OptionsPackage.OPTION__IS_IMPLEMENTED:
				setIsImplemented((Boolean)newValue);
				return;
			case OptionsPackage.OPTION__TIME_STAMP:
				setTimeStamp((Date)newValue);
				return;
			case OptionsPackage.OPTION__EFFECTS:
				getEffects().clear();
				getEffects().addAll((Collection<? extends Effect>)newValue);
				return;
			case OptionsPackage.OPTION__USED_TERMS:
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
			case OptionsPackage.OPTION__RELATIONS:
				getRelations().clear();
				return;
			case OptionsPackage.OPTION__CONFLICTS_WITH:
				getConflictsWith().clear();
				return;
			case OptionsPackage.OPTION__HAS_CONFLICTS:
				getHasConflicts().clear();
				return;
			case OptionsPackage.OPTION__DUPLICATE_OF:
				getDuplicateOf().clear();
				return;
			case OptionsPackage.OPTION__HAS_DUPLICATES:
				getHasDuplicates().clear();
				return;
			case OptionsPackage.OPTION__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case OptionsPackage.OPTION__HAS_DEPENDENTS:
				getHasDependents().clear();
				return;
			case OptionsPackage.OPTION__PARENT_OF:
				getParentOf().clear();
				return;
			case OptionsPackage.OPTION__SUBPART_OF:
				getSubpartOf().clear();
				return;
			case OptionsPackage.OPTION__TRIGGER_OF:
				getTriggerOf().clear();
				return;
			case OptionsPackage.OPTION__TRIGGERED_BY:
				getTriggeredBy().clear();
				return;
			case OptionsPackage.OPTION__RESOLVES:
				getResolves().clear();
				return;
			case OptionsPackage.OPTION__RESOLVED_BY:
				getResolvedBy().clear();
				return;
			case OptionsPackage.OPTION__ALTERNATIVE_TO:
				getAlternativeTo().clear();
				return;
			case OptionsPackage.OPTION__HAS_ALTERNATIVES:
				getHasAlternatives().clear();
				return;
			case OptionsPackage.OPTION__COULD_RESOLVE:
				getCouldResolve().clear();
				return;
			case OptionsPackage.OPTION__COULD_BE_RESOLVED_BY:
				getCouldBeResolvedBy().clear();
				return;
			case OptionsPackage.OPTION__STAKEHOLDER_OF:
				getStakeholderOf().clear();
				return;
			case OptionsPackage.OPTION__HAS_STAKEHOLDERS:
				getHasStakeholders().clear();
				return;
			case OptionsPackage.OPTION__SELECTED:
				getSelected().clear();
				return;
			case OptionsPackage.OPTION__SELECTED_BY:
				getSelectedBy().clear();
				return;
			case OptionsPackage.OPTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OptionsPackage.OPTION__KEYWORDS:
				getKeywords().clear();
				return;
			case OptionsPackage.OPTION__REPOSITORY:
				setRepository((OptionRepository)null);
				return;
			case OptionsPackage.OPTION__RATIONALE:
				getRationale().clear();
				return;
			case OptionsPackage.OPTION__IS_MODELLED:
				setIsModelled(IS_MODELLED_EDEFAULT);
				return;
			case OptionsPackage.OPTION__IS_IMPLEMENTED:
				setIsImplemented(IS_IMPLEMENTED_EDEFAULT);
				return;
			case OptionsPackage.OPTION__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case OptionsPackage.OPTION__EFFECTS:
				getEffects().clear();
				return;
			case OptionsPackage.OPTION__USED_TERMS:
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
			case OptionsPackage.OPTION__RELATIONS:
				return !getRelations().isEmpty();
			case OptionsPackage.OPTION__CONFLICTS_WITH:
				return !getConflictsWith().isEmpty();
			case OptionsPackage.OPTION__HAS_CONFLICTS:
				return !getHasConflicts().isEmpty();
			case OptionsPackage.OPTION__DUPLICATE_OF:
				return !getDuplicateOf().isEmpty();
			case OptionsPackage.OPTION__HAS_DUPLICATES:
				return !getHasDuplicates().isEmpty();
			case OptionsPackage.OPTION__DEPENDS_ON:
				return !getDependsOn().isEmpty();
			case OptionsPackage.OPTION__HAS_DEPENDENTS:
				return !getHasDependents().isEmpty();
			case OptionsPackage.OPTION__PARENT_OF:
				return !getParentOf().isEmpty();
			case OptionsPackage.OPTION__SUBPART_OF:
				return !getSubpartOf().isEmpty();
			case OptionsPackage.OPTION__TRIGGER_OF:
				return !getTriggerOf().isEmpty();
			case OptionsPackage.OPTION__TRIGGERED_BY:
				return !getTriggeredBy().isEmpty();
			case OptionsPackage.OPTION__RESOLVES:
				return !getResolves().isEmpty();
			case OptionsPackage.OPTION__RESOLVED_BY:
				return !getResolvedBy().isEmpty();
			case OptionsPackage.OPTION__ALTERNATIVE_TO:
				return !getAlternativeTo().isEmpty();
			case OptionsPackage.OPTION__HAS_ALTERNATIVES:
				return !getHasAlternatives().isEmpty();
			case OptionsPackage.OPTION__COULD_RESOLVE:
				return !getCouldResolve().isEmpty();
			case OptionsPackage.OPTION__COULD_BE_RESOLVED_BY:
				return !getCouldBeResolvedBy().isEmpty();
			case OptionsPackage.OPTION__STAKEHOLDER_OF:
				return !getStakeholderOf().isEmpty();
			case OptionsPackage.OPTION__HAS_STAKEHOLDERS:
				return !getHasStakeholders().isEmpty();
			case OptionsPackage.OPTION__SELECTED:
				return !getSelected().isEmpty();
			case OptionsPackage.OPTION__SELECTED_BY:
				return !getSelectedBy().isEmpty();
			case OptionsPackage.OPTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case OptionsPackage.OPTION__KEYWORDS:
				return !getKeywords().isEmpty();
			case OptionsPackage.OPTION__REPOSITORY:
				return getRepository() != null;
			case OptionsPackage.OPTION__RATIONALE:
				return !getRationale().isEmpty();
			case OptionsPackage.OPTION__IS_MODELLED:
				return isIsModelled() != IS_MODELLED_EDEFAULT;
			case OptionsPackage.OPTION__IS_IMPLEMENTED:
				return isIsImplemented() != IS_IMPLEMENTED_EDEFAULT;
			case OptionsPackage.OPTION__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? getTimeStamp() != null : !TIME_STAMP_EDEFAULT.equals(getTimeStamp());
			case OptionsPackage.OPTION__EFFECTS:
				return !getEffects().isEmpty();
			case OptionsPackage.OPTION__USED_TERMS:
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
				case OptionsPackage.OPTION__RELATIONS: return RelationsPackage.RELATION_OBJECT__RELATIONS;
				default: return -1;
			}
		}
		if (baseClass == ConflictObject.class) {
			switch (derivedFeatureID) {
				case OptionsPackage.OPTION__CONFLICTS_WITH: return RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH;
				case OptionsPackage.OPTION__HAS_CONFLICTS: return RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS;
				default: return -1;
			}
		}
		if (baseClass == DuplicationObject.class) {
			switch (derivedFeatureID) {
				case OptionsPackage.OPTION__DUPLICATE_OF: return RelationsPackage.DUPLICATION_OBJECT__DUPLICATE_OF;
				case OptionsPackage.OPTION__HAS_DUPLICATES: return RelationsPackage.DUPLICATION_OBJECT__HAS_DUPLICATES;
				default: return -1;
			}
		}
		if (baseClass == DependencyObject.class) {
			switch (derivedFeatureID) {
				case OptionsPackage.OPTION__DEPENDS_ON: return RelationsPackage.DEPENDENCY_OBJECT__DEPENDS_ON;
				case OptionsPackage.OPTION__HAS_DEPENDENTS: return RelationsPackage.DEPENDENCY_OBJECT__HAS_DEPENDENTS;
				default: return -1;
			}
		}
		if (baseClass == ParentalObject.class) {
			switch (derivedFeatureID) {
				case OptionsPackage.OPTION__PARENT_OF: return RelationsPackage.PARENTAL_OBJECT__PARENT_OF;
				case OptionsPackage.OPTION__SUBPART_OF: return RelationsPackage.PARENTAL_OBJECT__SUBPART_OF;
				default: return -1;
			}
		}
		if (baseClass == TriggerObject.class) {
			switch (derivedFeatureID) {
				case OptionsPackage.OPTION__TRIGGER_OF: return RelationsPackage.TRIGGER_OBJECT__TRIGGER_OF;
				case OptionsPackage.OPTION__TRIGGERED_BY: return RelationsPackage.TRIGGER_OBJECT__TRIGGERED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResolveObject.class) {
			switch (derivedFeatureID) {
				case OptionsPackage.OPTION__RESOLVES: return RelationsPackage.RESOLVE_OBJECT__RESOLVES;
				case OptionsPackage.OPTION__RESOLVED_BY: return RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == AlternativeObject.class) {
			switch (derivedFeatureID) {
				case OptionsPackage.OPTION__ALTERNATIVE_TO: return RelationsPackage.ALTERNATIVE_OBJECT__ALTERNATIVE_TO;
				case OptionsPackage.OPTION__HAS_ALTERNATIVES: return RelationsPackage.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES;
				default: return -1;
			}
		}
		if (baseClass == CouldResolveObject.class) {
			switch (derivedFeatureID) {
				case OptionsPackage.OPTION__COULD_RESOLVE: return RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE;
				case OptionsPackage.OPTION__COULD_BE_RESOLVED_BY: return RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == StakeholderObject.class) {
			switch (derivedFeatureID) {
				case OptionsPackage.OPTION__STAKEHOLDER_OF: return RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF;
				case OptionsPackage.OPTION__HAS_STAKEHOLDERS: return RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS;
				default: return -1;
			}
		}
		if (baseClass == SelectionObject.class) {
			switch (derivedFeatureID) {
				case OptionsPackage.OPTION__SELECTED: return RelationsPackage.SELECTION_OBJECT__SELECTED;
				case OptionsPackage.OPTION__SELECTED_BY: return RelationsPackage.SELECTION_OBJECT__SELECTED_BY;
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
				case RelationsPackage.RELATION_OBJECT__RELATIONS: return OptionsPackage.OPTION__RELATIONS;
				default: return -1;
			}
		}
		if (baseClass == ConflictObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.CONFLICT_OBJECT__CONFLICTS_WITH: return OptionsPackage.OPTION__CONFLICTS_WITH;
				case RelationsPackage.CONFLICT_OBJECT__HAS_CONFLICTS: return OptionsPackage.OPTION__HAS_CONFLICTS;
				default: return -1;
			}
		}
		if (baseClass == DuplicationObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.DUPLICATION_OBJECT__DUPLICATE_OF: return OptionsPackage.OPTION__DUPLICATE_OF;
				case RelationsPackage.DUPLICATION_OBJECT__HAS_DUPLICATES: return OptionsPackage.OPTION__HAS_DUPLICATES;
				default: return -1;
			}
		}
		if (baseClass == DependencyObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.DEPENDENCY_OBJECT__DEPENDS_ON: return OptionsPackage.OPTION__DEPENDS_ON;
				case RelationsPackage.DEPENDENCY_OBJECT__HAS_DEPENDENTS: return OptionsPackage.OPTION__HAS_DEPENDENTS;
				default: return -1;
			}
		}
		if (baseClass == ParentalObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.PARENTAL_OBJECT__PARENT_OF: return OptionsPackage.OPTION__PARENT_OF;
				case RelationsPackage.PARENTAL_OBJECT__SUBPART_OF: return OptionsPackage.OPTION__SUBPART_OF;
				default: return -1;
			}
		}
		if (baseClass == TriggerObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.TRIGGER_OBJECT__TRIGGER_OF: return OptionsPackage.OPTION__TRIGGER_OF;
				case RelationsPackage.TRIGGER_OBJECT__TRIGGERED_BY: return OptionsPackage.OPTION__TRIGGERED_BY;
				default: return -1;
			}
		}
		if (baseClass == ResolveObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.RESOLVE_OBJECT__RESOLVES: return OptionsPackage.OPTION__RESOLVES;
				case RelationsPackage.RESOLVE_OBJECT__RESOLVED_BY: return OptionsPackage.OPTION__RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == AlternativeObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.ALTERNATIVE_OBJECT__ALTERNATIVE_TO: return OptionsPackage.OPTION__ALTERNATIVE_TO;
				case RelationsPackage.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES: return OptionsPackage.OPTION__HAS_ALTERNATIVES;
				default: return -1;
			}
		}
		if (baseClass == CouldResolveObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_RESOLVE: return OptionsPackage.OPTION__COULD_RESOLVE;
				case RelationsPackage.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY: return OptionsPackage.OPTION__COULD_BE_RESOLVED_BY;
				default: return -1;
			}
		}
		if (baseClass == StakeholderObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.STAKEHOLDER_OBJECT__STAKEHOLDER_OF: return OptionsPackage.OPTION__STAKEHOLDER_OF;
				case RelationsPackage.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS: return OptionsPackage.OPTION__HAS_STAKEHOLDERS;
				default: return -1;
			}
		}
		if (baseClass == SelectionObject.class) {
			switch (baseFeatureID) {
				case RelationsPackage.SELECTION_OBJECT__SELECTED: return OptionsPackage.OPTION__SELECTED;
				case RelationsPackage.SELECTION_OBJECT__SELECTED_BY: return OptionsPackage.OPTION__SELECTED_BY;
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

} //OptionImpl
