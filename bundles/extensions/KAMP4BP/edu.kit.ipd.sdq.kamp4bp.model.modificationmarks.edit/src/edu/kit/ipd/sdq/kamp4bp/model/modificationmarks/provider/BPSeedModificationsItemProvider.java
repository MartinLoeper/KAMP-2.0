/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.provider;


import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.provider.ISSeedModificationsItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BPSeedModificationsItemProvider extends ISSeedModificationsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPSeedModificationsItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BPModificationmarksPackage.Literals.BP_SEED_MODIFICATIONS__DATA_OBJECT_MODIFICATIONS);
			childrenFeatures.add(BPModificationmarksPackage.Literals.BP_SEED_MODIFICATIONS__ACTOR_STEP_MODIFICATIONS);
			childrenFeatures.add(BPModificationmarksPackage.Literals.BP_SEED_MODIFICATIONS__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS);
			childrenFeatures.add(BPModificationmarksPackage.Literals.BP_SEED_MODIFICATIONS__DEVICE_RESOURCE_MODIFICATIONS);
			childrenFeatures.add(BPModificationmarksPackage.Literals.BP_SEED_MODIFICATIONS__ROLE_MODIFICATIONS);
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
	 * This returns BPSeedModifications.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BPSeedModifications"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BPSeedModifications_type");
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

		switch (notification.getFeatureID(BPSeedModifications.class)) {
			case BPModificationmarksPackage.BP_SEED_MODIFICATIONS__DATA_OBJECT_MODIFICATIONS:
			case BPModificationmarksPackage.BP_SEED_MODIFICATIONS__ACTOR_STEP_MODIFICATIONS:
			case BPModificationmarksPackage.BP_SEED_MODIFICATIONS__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS:
			case BPModificationmarksPackage.BP_SEED_MODIFICATIONS__DEVICE_RESOURCE_MODIFICATIONS:
			case BPModificationmarksPackage.BP_SEED_MODIFICATIONS__ROLE_MODIFICATIONS:
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
				(BPModificationmarksPackage.Literals.BP_SEED_MODIFICATIONS__DATA_OBJECT_MODIFICATIONS,
				 BPModificationmarksFactory.eINSTANCE.createBPModifyDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(BPModificationmarksPackage.Literals.BP_SEED_MODIFICATIONS__ACTOR_STEP_MODIFICATIONS,
				 BPModificationmarksFactory.eINSTANCE.createBPModifyActorStep()));

		newChildDescriptors.add
			(createChildParameter
				(BPModificationmarksPackage.Literals.BP_SEED_MODIFICATIONS__ENTRY_LEVEL_SYSTEM_CALL_MODIFICATIONS,
				 BPModificationmarksFactory.eINSTANCE.createBPModifyEntryLevelSystemCall()));

		newChildDescriptors.add
			(createChildParameter
				(BPModificationmarksPackage.Literals.BP_SEED_MODIFICATIONS__DEVICE_RESOURCE_MODIFICATIONS,
				 BPModificationmarksFactory.eINSTANCE.createBPModifyDeviceResource()));

		newChildDescriptors.add
			(createChildParameter
				(BPModificationmarksPackage.Literals.BP_SEED_MODIFICATIONS__ROLE_MODIFICATIONS,
				 BPModificationmarksFactory.eINSTANCE.createBPModifyRole()));
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
