/**
 */
package decisions.provider;


import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

import decisions.Decision;
import decisions.DecisionsFactory;
import decisions.DecisionsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import relations.RelationsFactory;
import relations.RelationsPackage;

/**
 * This is the item provider adapter for a {@link decisions.Decision} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DecisionItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addConflictsWithPropertyDescriptor(object);
			addHasConflictsPropertyDescriptor(object);
			addDuplicateOfPropertyDescriptor(object);
			addHasDuplicatesPropertyDescriptor(object);
			addDependsOnPropertyDescriptor(object);
			addHasDependentsPropertyDescriptor(object);
			addParentOfPropertyDescriptor(object);
			addSubpartOfPropertyDescriptor(object);
			addTriggerOfPropertyDescriptor(object);
			addTriggeredByPropertyDescriptor(object);
			addResolvesPropertyDescriptor(object);
			addResolvedByPropertyDescriptor(object);
			addAlternativeToPropertyDescriptor(object);
			addHasAlternativesPropertyDescriptor(object);
			addCouldResolvePropertyDescriptor(object);
			addCouldBeResolvedByPropertyDescriptor(object);
			addStakeholderOfPropertyDescriptor(object);
			addHasStakeholdersPropertyDescriptor(object);
			addSelectedPropertyDescriptor(object);
			addSelectedByPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addTimestampPropertyDescriptor(object);
			addUsedTermsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Conflicts With feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConflictsWithPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConflictObject_conflictsWith_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConflictObject_conflictsWith_feature", "_UI_ConflictObject_type"),
				 RelationsPackage.Literals.CONFLICT_OBJECT__CONFLICTS_WITH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Conflicts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasConflictsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConflictObject_hasConflicts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConflictObject_hasConflicts_feature", "_UI_ConflictObject_type"),
				 RelationsPackage.Literals.CONFLICT_OBJECT__HAS_CONFLICTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Duplicate Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDuplicateOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DuplicationObject_duplicateOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DuplicationObject_duplicateOf_feature", "_UI_DuplicationObject_type"),
				 RelationsPackage.Literals.DUPLICATION_OBJECT__DUPLICATE_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Duplicates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasDuplicatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DuplicationObject_hasDuplicates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DuplicationObject_hasDuplicates_feature", "_UI_DuplicationObject_type"),
				 RelationsPackage.Literals.DUPLICATION_OBJECT__HAS_DUPLICATES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Depends On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependsOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DependencyObject_dependsOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DependencyObject_dependsOn_feature", "_UI_DependencyObject_type"),
				 RelationsPackage.Literals.DEPENDENCY_OBJECT__DEPENDS_ON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Dependents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasDependentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DependencyObject_hasDependents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DependencyObject_hasDependents_feature", "_UI_DependencyObject_type"),
				 RelationsPackage.Literals.DEPENDENCY_OBJECT__HAS_DEPENDENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParentalObject_parentOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParentalObject_parentOf_feature", "_UI_ParentalObject_type"),
				 RelationsPackage.Literals.PARENTAL_OBJECT__PARENT_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subpart Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubpartOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParentalObject_subpartOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParentalObject_subpartOf_feature", "_UI_ParentalObject_type"),
				 RelationsPackage.Literals.PARENTAL_OBJECT__SUBPART_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trigger Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggerOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TriggerObject_triggerOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TriggerObject_triggerOf_feature", "_UI_TriggerObject_type"),
				 RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGER_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Triggered By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggeredByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TriggerObject_triggeredBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TriggerObject_triggeredBy_feature", "_UI_TriggerObject_type"),
				 RelationsPackage.Literals.TRIGGER_OBJECT__TRIGGERED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolves feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolvesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResolveObject_resolves_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResolveObject_resolves_feature", "_UI_ResolveObject_type"),
				 RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolved By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolvedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResolveObject_resolvedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResolveObject_resolvedBy_feature", "_UI_ResolveObject_type"),
				 RelationsPackage.Literals.RESOLVE_OBJECT__RESOLVED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alternative To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlternativeToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AlternativeObject_alternativeTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AlternativeObject_alternativeTo_feature", "_UI_AlternativeObject_type"),
				 RelationsPackage.Literals.ALTERNATIVE_OBJECT__ALTERNATIVE_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Alternatives feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAlternativesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AlternativeObject_hasAlternatives_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AlternativeObject_hasAlternatives_feature", "_UI_AlternativeObject_type"),
				 RelationsPackage.Literals.ALTERNATIVE_OBJECT__HAS_ALTERNATIVES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Could Resolve feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCouldResolvePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CouldResolveObject_couldResolve_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CouldResolveObject_couldResolve_feature", "_UI_CouldResolveObject_type"),
				 RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_RESOLVE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Could Be Resolved By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCouldBeResolvedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CouldResolveObject_couldBeResolvedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CouldResolveObject_couldBeResolvedBy_feature", "_UI_CouldResolveObject_type"),
				 RelationsPackage.Literals.COULD_RESOLVE_OBJECT__COULD_BE_RESOLVED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stakeholder Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStakeholderOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StakeholderObject_stakeholderOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StakeholderObject_stakeholderOf_feature", "_UI_StakeholderObject_type"),
				 RelationsPackage.Literals.STAKEHOLDER_OBJECT__STAKEHOLDER_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Stakeholders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasStakeholdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StakeholderObject_hasStakeholders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StakeholderObject_hasStakeholders_feature", "_UI_StakeholderObject_type"),
				 RelationsPackage.Literals.STAKEHOLDER_OBJECT__HAS_STAKEHOLDERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SelectionObject_selected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SelectionObject_selected_feature", "_UI_SelectionObject_type"),
				 RelationsPackage.Literals.SELECTION_OBJECT__SELECTED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SelectionObject_selectedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SelectionObject_selectedBy_feature", "_UI_SelectionObject_type"),
				 RelationsPackage.Literals.SELECTION_OBJECT__SELECTED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Decision_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Decision_description_feature", "_UI_Decision_type"),
				 DecisionsPackage.Literals.DECISION__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Decision_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Decision_status_feature", "_UI_Decision_type"),
				 DecisionsPackage.Literals.DECISION__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timestamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimestampPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Decision_timestamp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Decision_timestamp_feature", "_UI_Decision_type"),
				 DecisionsPackage.Literals.DECISION__TIMESTAMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Used Terms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedTermsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Decision_usedTerms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Decision_usedTerms_feature", "_UI_Decision_type"),
				 DecisionsPackage.Literals.DECISION__USED_TERMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RelationsPackage.Literals.RELATION_OBJECT__RELATIONS);
			childrenFeatures.add(DecisionsPackage.Literals.DECISION__RATIONALES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Decision.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Decision"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Decision)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_Decision_type") :
			getString("_UI_Decision_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Decision.class)) {
			case DecisionsPackage.DECISION__DESCRIPTION:
			case DecisionsPackage.DECISION__STATUS:
			case DecisionsPackage.DECISION__TIMESTAMP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DecisionsPackage.DECISION__RELATIONS:
			case DecisionsPackage.DECISION__RATIONALES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RelationsPackage.Literals.RELATION_OBJECT__RELATIONS,
				 RelationsFactory.eINSTANCE.createRelation()));

		newChildDescriptors.add
			(createChildParameter
				(DecisionsPackage.Literals.DECISION__RATIONALES,
				 DecisionsFactory.eINSTANCE.createTextRationale()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
