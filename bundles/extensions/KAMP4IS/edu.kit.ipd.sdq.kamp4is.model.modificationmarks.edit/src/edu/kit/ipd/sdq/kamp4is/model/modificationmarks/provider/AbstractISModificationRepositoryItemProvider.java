/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.provider;


import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.provider.AbstractModificationRepositoryItemProvider;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractISModificationRepositoryItemProvider extends AbstractModificationRepositoryItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractISModificationRepositoryItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_AbstractISModificationRepository_type");
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
				(ModificationmarksPackage.Literals.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS,
				 ISModificationmarksFactory.eINSTANCE.createISSeedModifications()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS,
				 ISModificationmarksFactory.eINSTANCE.createISChangePropagationDueToDataDependencies()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS,
				 ISModificationmarksFactory.eINSTANCE.createISChangePropagationDueToInterfaceDependencies()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS,
				 ISModificationmarksFactory.eINSTANCE.createISIntercomponentPropagation()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS,
				 ISModificationmarksFactory.eINSTANCE.createISIntracomponentPropagation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ISModificationmarksEditPlugin.INSTANCE;
	}

}
