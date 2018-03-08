/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.provider;


import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ISIntegrationTestCaseAggregationItemProvider extends ISTestCaseAggregationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISIntegrationTestCaseAggregationItemProvider(AdapterFactory adapterFactory) {
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

			addProvidedrolePropertyDescriptor(object);
			addAssemblyConnectorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Providedrole feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProvidedrolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ISIntegrationTestCaseAggregation_providedrole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ISIntegrationTestCaseAggregation_providedrole_feature", "_UI_ISIntegrationTestCaseAggregation_type"),
				 ISFieldOfActivityAnnotationsPackage.Literals.IS_INTEGRATION_TEST_CASE_AGGREGATION__PROVIDEDROLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assembly Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssemblyConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ISIntegrationTestCaseAggregation_assemblyConnector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ISIntegrationTestCaseAggregation_assemblyConnector_feature", "_UI_ISIntegrationTestCaseAggregation_type"),
				 ISFieldOfActivityAnnotationsPackage.Literals.IS_INTEGRATION_TEST_CASE_AGGREGATION__ASSEMBLY_CONNECTOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ISIntegrationTestCaseAggregation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ISIntegrationTestCaseAggregation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ISIntegrationTestCaseAggregation)object).getNameOfTestSuite();
		return label == null || label.length() == 0 ?
			getString("_UI_ISIntegrationTestCaseAggregation_type") :
			getString("_UI_ISIntegrationTestCaseAggregation_type") + " " + label;
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
	}

}
