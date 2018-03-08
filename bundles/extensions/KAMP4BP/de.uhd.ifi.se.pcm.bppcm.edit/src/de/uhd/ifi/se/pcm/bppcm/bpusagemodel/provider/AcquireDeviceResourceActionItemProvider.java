/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.provider;


import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.usagemodel.provider.AbstractUserActionItemProvider;

/**
 * This is the item provider adapter for a {@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AcquireDeviceResourceActionItemProvider extends AbstractUserActionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquireDeviceResourceActionItemProvider(AdapterFactory adapterFactory) {
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

			addPassiveresource_AcquireActionPropertyDescriptor(object);
			addTimeoutPropertyDescriptor(object);
			addTimeoutValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Passiveresource Acquire Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassiveresource_AcquireActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AcquireDeviceResourceAction_passiveresource_AcquireAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AcquireDeviceResourceAction_passiveresource_AcquireAction_feature", "_UI_AcquireDeviceResourceAction_type"),
				 BpusagemodelPackage.Literals.ACQUIRE_DEVICE_RESOURCE_ACTION__PASSIVERESOURCE_ACQUIRE_ACTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AcquireDeviceResourceAction_timeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AcquireDeviceResourceAction_timeout_feature", "_UI_AcquireDeviceResourceAction_type"),
				 BpusagemodelPackage.Literals.ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timeout Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeoutValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AcquireDeviceResourceAction_timeoutValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AcquireDeviceResourceAction_timeoutValue_feature", "_UI_AcquireDeviceResourceAction_type"),
				 BpusagemodelPackage.Literals.ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AcquireDeviceResourceAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AcquireDeviceResourceAction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		// --Start manually modified code
		return getString("_UI_AcquireDeviceResourceAction_type") + " \"" 
				+ ((AcquireDeviceResourceAction) object).getEntityName() + "\"";
		// --End manually modified code
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

		switch (notification.getFeatureID(AcquireDeviceResourceAction.class)) {
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT:
			case BpusagemodelPackage.ACQUIRE_DEVICE_RESOURCE_ACTION__TIMEOUT_VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BpEditPlugin.INSTANCE;
	}

}
