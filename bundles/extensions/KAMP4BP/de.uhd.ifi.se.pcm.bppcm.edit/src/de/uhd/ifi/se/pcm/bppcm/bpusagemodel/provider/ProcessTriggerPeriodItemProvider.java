/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.provider;


import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod;

import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.core.CoreFactory;

/**
 * This is the item provider adapter for a {@link de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ProcessTriggerPeriod} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessTriggerPeriodItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessTriggerPeriodItemProvider(AdapterFactory adapterFactory) {
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

			addInterArrivalTime_ProcessWorkloadPropertyDescriptor(object);
			addPeriodStartTimePointPropertyDescriptor(object);
			addPeriodEndTimePointPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Inter Arrival Time Process Workload feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterArrivalTime_ProcessWorkloadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessTriggerPeriod_interArrivalTime_ProcessWorkload_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessTriggerPeriod_interArrivalTime_ProcessWorkload_feature", "_UI_ProcessTriggerPeriod_type"),
				 BpusagemodelPackage.Literals.PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Period Start Time Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeriodStartTimePointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessTriggerPeriod_periodStartTimePoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessTriggerPeriod_periodStartTimePoint_feature", "_UI_ProcessTriggerPeriod_type"),
				 BpusagemodelPackage.Literals.PROCESS_TRIGGER_PERIOD__PERIOD_START_TIME_POINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Period End Time Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeriodEndTimePointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessTriggerPeriod_periodEndTimePoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessTriggerPeriod_periodEndTimePoint_feature", "_UI_ProcessTriggerPeriod_type"),
				 BpusagemodelPackage.Literals.PROCESS_TRIGGER_PERIOD__PERIOD_END_TIME_POINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
			childrenFeatures.add(BpusagemodelPackage.Literals.PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD);
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
	 * This returns ProcessTriggerPeriod.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProcessTriggerPeriod"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProcessTriggerPeriod)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ProcessTriggerPeriod_type") :
			getString("_UI_ProcessTriggerPeriod_type") + " " + label;
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

		switch (notification.getFeatureID(ProcessTriggerPeriod.class)) {
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__PERIOD_START_TIME_POINT:
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__PERIOD_END_TIME_POINT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BpusagemodelPackage.PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD:
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
				(BpusagemodelPackage.Literals.PROCESS_TRIGGER_PERIOD__INTER_ARRIVAL_TIME_PROCESS_WORKLOAD,
				 CoreFactory.eINSTANCE.createPCMRandomVariable()));
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
