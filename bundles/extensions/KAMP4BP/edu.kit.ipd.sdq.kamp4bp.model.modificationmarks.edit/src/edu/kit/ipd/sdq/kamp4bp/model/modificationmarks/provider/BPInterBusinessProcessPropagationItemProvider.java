/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.provider;


import edu.kit.ipd.sdq.kamp.model.modificationmarks.provider.ChangePropagationStepItemProvider;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPInterBusinessProcessPropagation;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPInterBusinessProcessPropagation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BPInterBusinessProcessPropagationItemProvider extends ChangePropagationStepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPInterBusinessProcessPropagationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BPModificationmarksPackage.Literals.BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS);
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
	 * This returns BPInterBusinessProcessPropagation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BPInterBusinessProcessPropagation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BPInterBusinessProcessPropagation_type");
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

		switch (notification.getFeatureID(BPInterBusinessProcessPropagation.class)) {
			case BPModificationmarksPackage.BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS:
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
				(BPModificationmarksPackage.Literals.BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS,
				 BPModificationmarksFactory.eINSTANCE.createBPModifyAbstractUserAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPModificationmarksPackage.Literals.BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS,
				 BPModificationmarksFactory.eINSTANCE.createBPModifyAcquireDeviceResourceAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPModificationmarksPackage.Literals.BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS,
				 BPModificationmarksFactory.eINSTANCE.createBPModifyReleaseDeviceResourceAction()));

		newChildDescriptors.add
			(createChildParameter
				(BPModificationmarksPackage.Literals.BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS,
				 BPModificationmarksFactory.eINSTANCE.createBPModifyActorStep()));

		newChildDescriptors.add
			(createChildParameter
				(BPModificationmarksPackage.Literals.BP_INTER_BUSINESS_PROCESS_PROPAGATION__ABSTRACT_USER_ACTION_MODIFICATIONS,
				 BPModificationmarksFactory.eINSTANCE.createBPModifyEntryLevelSystemCall()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BPModificationmarksEditPlugin.INSTANCE;
	}

}
