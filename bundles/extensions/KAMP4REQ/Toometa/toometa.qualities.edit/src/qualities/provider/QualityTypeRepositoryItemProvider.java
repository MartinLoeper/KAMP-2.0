/**
 */
package qualities.provider;


import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qualities.QualitiesFactory;
import qualities.QualitiesPackage;
import qualities.QualityTypeRepository;

/**
 * This is the item provider adapter for a {@link qualities.QualityTypeRepository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityTypeRepositoryItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityTypeRepositoryItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE);
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
	 * This returns QualityTypeRepository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/QualityTypeRepository"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((QualityTypeRepository)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_QualityTypeRepository_type") :
			getString("_UI_QualityTypeRepository_type") + " " + label;
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

		switch (notification.getFeatureID(QualityTypeRepository.class)) {
			case QualitiesPackage.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE:
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
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createReliability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createReliabilityCompliance()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createPortability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createInstallability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createCoExistence()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createUsability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createOperability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createMaintainability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createStability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createMaintainabilityCompliance()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createMaturity()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createAttractiveness()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createAnalyzability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createReplaceability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createRecoverability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createUnderstandability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createPortabilityCompliance()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createEfficiency()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createRessourceUtilization()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createChangeability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createFunctionality()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createInteroperability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createFaultTolerance()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createAdaptability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createTimeBehaviour()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createSecurity()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createAccuracy()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createFunctionalityCompliance()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createSafety()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createEfficiencyCompliance()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createSuitability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createLearnability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createPerformance()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createTestability()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createUsabilityCompliance()));

		newChildDescriptors.add
			(createChildParameter
				(QualitiesPackage.Literals.QUALITY_TYPE_REPOSITORY__QUALITY_TYPE,
				 QualitiesFactory.eINSTANCE.createTextQuality()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QualitiesEditPlugin.INSTANCE;
	}

}
