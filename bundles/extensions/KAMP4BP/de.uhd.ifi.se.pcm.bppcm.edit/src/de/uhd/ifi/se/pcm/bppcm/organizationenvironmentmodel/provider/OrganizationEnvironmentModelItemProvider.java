/**
 */
package de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.provider;


import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.provider.BpEditPlugin;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelFactory;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.core.entity.provider.NamedElementItemProvider;

/**
 * This is the item provider adapter for a {@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganizationEnvironmentModelItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationEnvironmentModelItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(OrganizationenvironmentmodelPackage.Literals.ORGANIZATION_ENVIRONMENT_MODEL__ROLES);
			childrenFeatures.add(OrganizationenvironmentmodelPackage.Literals.ORGANIZATION_ENVIRONMENT_MODEL__ACTOR_RESOURCES);
			childrenFeatures.add(OrganizationenvironmentmodelPackage.Literals.ORGANIZATION_ENVIRONMENT_MODEL__DEVICE_RESOURCES);
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
	 * This returns OrganizationEnvironmentModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OrganizationEnvironmentModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OrganizationEnvironmentModel)object).getEntityName();
		return label == null || label.length() == 0 ?
			getString("_UI_OrganizationEnvironmentModel_type") :
			getString("_UI_OrganizationEnvironmentModel_type") + " " + label;
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

		switch (notification.getFeatureID(OrganizationEnvironmentModel.class)) {
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__ROLES:
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__ACTOR_RESOURCES:
			case OrganizationenvironmentmodelPackage.ORGANIZATION_ENVIRONMENT_MODEL__DEVICE_RESOURCES:
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
				(OrganizationenvironmentmodelPackage.Literals.ORGANIZATION_ENVIRONMENT_MODEL__ROLES,
				 OrganizationenvironmentmodelFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(OrganizationenvironmentmodelPackage.Literals.ORGANIZATION_ENVIRONMENT_MODEL__ACTOR_RESOURCES,
				 OrganizationenvironmentmodelFactory.eINSTANCE.createActorResource()));

		newChildDescriptors.add
			(createChildParameter
				(OrganizationenvironmentmodelPackage.Literals.ORGANIZATION_ENVIRONMENT_MODEL__DEVICE_RESOURCES,
				 OrganizationenvironmentmodelFactory.eINSTANCE.createDeviceResource()));
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
