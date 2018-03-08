/**
 */
package edu.kit.ipd.sdq.kamp4req.model.modificationmarks.provider;


import edu.kit.ipd.sdq.kamp.model.modificationmarks.provider.ChangePropagationStepItemProvider;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksFactory;

import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqChangePropagationDueToSpecificationDependenciesItemProvider extends ChangePropagationStepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqChangePropagationDueToSpecificationDependenciesItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ReqModificationmarksPackage.Literals.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS);
			childrenFeatures.add(ReqModificationmarksPackage.Literals.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS);
			childrenFeatures.add(ReqModificationmarksPackage.Literals.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS);
			childrenFeatures.add(ReqModificationmarksPackage.Literals.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DATA_TYPE_MODIFICATIONS);
			childrenFeatures.add(ReqModificationmarksPackage.Literals.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ENTITY_MODIFICATIONS);
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
	 * This returns ReqChangePropagationDueToSpecificationDependencies.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReqChangePropagationDueToSpecificationDependencies"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ReqChangePropagationDueToSpecificationDependencies_type");
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

		switch (notification.getFeatureID(ReqChangePropagationDueToSpecificationDependencies.class)) {
			case ReqModificationmarksPackage.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS:
			case ReqModificationmarksPackage.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS:
			case ReqModificationmarksPackage.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS:
			case ReqModificationmarksPackage.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DATA_TYPE_MODIFICATIONS:
			case ReqModificationmarksPackage.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ENTITY_MODIFICATIONS:
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
				(ReqModificationmarksPackage.Literals.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS,
				 ReqModificationmarksFactory.eINSTANCE.createReqModifyDecision()));

		newChildDescriptors.add
			(createChildParameter
				(ReqModificationmarksPackage.Literals.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS,
				 ReqModificationmarksFactory.eINSTANCE.createReqModifyOption()));

		newChildDescriptors.add
			(createChildParameter
				(ReqModificationmarksPackage.Literals.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS,
				 ReqModificationmarksFactory.eINSTANCE.createReqModifyRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ReqModificationmarksPackage.Literals.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DATA_TYPE_MODIFICATIONS,
				 ISModificationmarksFactory.eINSTANCE.createISModifyDataType()));

		newChildDescriptors.add
			(createChildParameter
				(ReqModificationmarksPackage.Literals.REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ENTITY_MODIFICATIONS,
				 ReqModificationmarksFactory.eINSTANCE.createReqModifyEntity()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ReqModificationmarksEditPlugin.INSTANCE;
	}

}
