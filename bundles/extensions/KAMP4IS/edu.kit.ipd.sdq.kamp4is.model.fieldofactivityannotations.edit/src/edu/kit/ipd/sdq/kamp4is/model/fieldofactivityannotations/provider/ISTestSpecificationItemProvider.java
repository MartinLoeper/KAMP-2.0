/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.provider;


import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ISTestSpecificationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISTestSpecificationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ISFieldOfActivityAnnotationsPackage.Literals.IS_TEST_SPECIFICATION__UNIT_TEST_CASES);
			childrenFeatures.add(ISFieldOfActivityAnnotationsPackage.Literals.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES);
			childrenFeatures.add(ISFieldOfActivityAnnotationsPackage.Literals.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASES);
			childrenFeatures.add(ISFieldOfActivityAnnotationsPackage.Literals.IS_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS);
			childrenFeatures.add(ISFieldOfActivityAnnotationsPackage.Literals.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS);
			childrenFeatures.add(ISFieldOfActivityAnnotationsPackage.Literals.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS);
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
	 * This returns ISTestSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ISTestSpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ISTestSpecification_type");
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

		switch (notification.getFeatureID(ISTestSpecification.class)) {
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASES:
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES:
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASES:
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS:
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS:
			case ISFieldOfActivityAnnotationsPackage.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS:
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
				(ISFieldOfActivityAnnotationsPackage.Literals.IS_TEST_SPECIFICATION__UNIT_TEST_CASES,
				 ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISUnitTestCase()));

		newChildDescriptors.add
			(createChildParameter
				(ISFieldOfActivityAnnotationsPackage.Literals.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASES,
				 ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISAcceptanceTestCase()));

		newChildDescriptors.add
			(createChildParameter
				(ISFieldOfActivityAnnotationsPackage.Literals.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASES,
				 ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISIntegrationTestCase()));

		newChildDescriptors.add
			(createChildParameter
				(ISFieldOfActivityAnnotationsPackage.Literals.IS_TEST_SPECIFICATION__UNIT_TEST_CASE_AGGREGATIONS,
				 ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISUnitTestCaseAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(ISFieldOfActivityAnnotationsPackage.Literals.IS_TEST_SPECIFICATION__ACCEPTANCE_TEST_CASE_AGGREGATIONS,
				 ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISAcceptanceTestCaseAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(ISFieldOfActivityAnnotationsPackage.Literals.IS_TEST_SPECIFICATION__INTEGRATION_TEST_CASE_AGGREGATIONS,
				 ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISIntegrationTestCaseAggregation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ISFieldOfActivityAnnotationsEditPlugin.INSTANCE;
	}

}
